/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.model.AnyType;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.ClassType;
import org.eclipse.dltk.javascript.typeinfo.model.Constructor;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterizedType;
import org.eclipse.dltk.javascript.typeinfo.model.RecordType;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.dltk.javascript.typeinfo.model.UndefinedType;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class TypeUtil {
	public static SimpleType ref(Type type) {
		if (type != null) {
			final SimpleType ref = TypeInfoModelFactory.eINSTANCE
					.createSimpleType();
			ref.setTarget(type);
			return ref;
		}
		return null;
	}

	public static ClassType classType(Type type) {
		if (type != null) {
			final ClassType ref = TypeInfoModelFactory.eINSTANCE
					.createClassType();
			ref.setTarget(type);
			return ref;
		}
		return null;
	}

	public static JSType ref(String typeName) {
		return ref(type(typeName));
	}

	public static Type type(String typeName) {
		final Type type = TypeInfoModelLoader.getInstance().getType(typeName);
		if (type != null) {
			return type;
		}
		return createProxy(typeName);
	}

	public static ArrayType arrayOf(String itemType) {
		return arrayOf(ref(itemType));
	}

	public static ArrayType arrayOf(JSType itemType) {
		final ArrayType arrayType = TypeInfoModelFactory.eINSTANCE
				.createArrayType();
		arrayType.setItemType(itemType != null ? itemType : ref(Types.OBJECT));
		return arrayType;
	}

	public static MapType mapOf(String keyType, String valueType) {
		return mapOf(keyType != null ? ref(keyType) : null, ref(valueType));
	}

	public static MapType mapOf(JSType keyType, JSType valueType) {
		final MapType mapType = TypeInfoModelFactory.eINSTANCE.createMapType();
		mapType.setKeyType(keyType != null ? keyType : ref(Types.STRING));
		mapType.setValueType(valueType != null ? valueType : ref(Types.OBJECT));
		return mapType;
	}

	public static ParameterizedType genericType(String baseType,
			JSType... typeParameters) {
		final ParameterizedType genericType = TypeInfoModelFactory.eINSTANCE
				.createParameterizedType();
		genericType.setTarget(type(baseType));
		for (JSType typeParameter : typeParameters) {
			genericType.getActualTypeArguments().add(typeParameter);
		}
		return genericType;
	}

	public static Type extractType(JSType type) {
		if (type instanceof SimpleType) {
			return ((SimpleType) type).getTarget();
		} else if (type instanceof ClassType) {
			return ((ClassType) type).getTarget();
		} else if (type instanceof ArrayType) {
			return Types.ARRAY;
		} else if (type instanceof MapType) {
			return Types.OBJECT;
		} else if (type instanceof AnyType) {
			return Types.OBJECT;
		} else {
			return null;
		}
	}

	public static Type extractType(ITypeSystem context, IRType type) {
		if (type instanceof IRSimpleType) {
			return ((IRSimpleType) type).getTarget();
		} else if (type instanceof IRFunctionType) {
			return createCustomFunctionType(context, (IRFunctionType) type);
		} else if (type instanceof IRArrayType) {
			final IRArrayType arrayType = (IRArrayType) type;
			final ITypeSystem saved = arrayType.activeTypeSystem();
			if (saved != null) {
				context = saved;
			}
			return context.parameterize(Types.ARRAY,
					Collections.singletonList(arrayType.getItemType()));
		} else if (type instanceof IRMapType) {
			return Types.OBJECT;
		} else if (type instanceof IRAnyType) {
			return Types.OBJECT;
		} else {
			return null;
		}
	}

	private static Type createCustomFunctionType(ITypeSystem context,
			IRFunctionType iRFunctionType) {
		Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setSuperType(TypeInfoModelLoader.getInstance().getType(
				ITypeNames.FUNCTION));
		List<Member> members = type.getMembers();

		// override 'call' & 'override' method in order to provide better
		// signatures
		{
			Method callMethod = TypeInfoModelFactory.eINSTANCE.createMethod();
			callMethod.setName("call");
			callMethod.setType(ref(extractType(context,
					iRFunctionType.getReturnType())));

			List<Parameter> parameters = callMethod.getParameters();
			Parameter thisArg = TypeInfoModelFactory.eINSTANCE
					.createParameter();
			thisArg.setName("thisArg");
			parameters.add(thisArg);

			int argNum = 1;
			boolean allOptional = true;
			for (IRParameter iRParameter : iRFunctionType.getParameters()) {
				Parameter origParameter = TypeInfoModelFactory.eINSTANCE
						.createParameter();
				origParameter.setName("arg" + argNum);
				origParameter.setType(ref(extractType(context,
						iRParameter.getType())));
				ParameterKind origParameterKind = iRParameter.getKind();
				origParameter.setKind(origParameterKind);
				allOptional &= iRParameter.getKind() != ParameterKind.NORMAL;

				parameters.add(origParameter);
				argNum++;
			}
			if (allOptional) {
				thisArg.setKind(ParameterKind.OPTIONAL);
			}

			members.add(callMethod);
		}

		{
			Method applyMethod = TypeInfoModelFactory.eINSTANCE.createMethod();
			applyMethod.setName("apply");
			applyMethod.setType(ref(extractType(context,
					iRFunctionType.getReturnType())));

			List<Parameter> parameters = applyMethod.getParameters();
			Parameter thisArg = TypeInfoModelFactory.eINSTANCE
					.createParameter();
			thisArg.setName("thisArg");
			thisArg.setKind(ParameterKind.OPTIONAL);
			parameters.add(thisArg);

			Parameter argArray = TypeInfoModelFactory.eINSTANCE
					.createParameter();
			argArray.setName("argArray");
			ArrayType arrayType = TypeInfoModelFactory.eINSTANCE
					.createArrayType();
			arrayType.setItemType(TypeInfoModelFactory.eINSTANCE
					.createAnyType());
			argArray.setType(arrayType);
			argArray.setKind(ParameterKind.OPTIONAL);
			parameters.add(argArray);

			members.add(applyMethod);
		}

		return type;
	}

	public static JSType extractArrayItemType(JSType type,
			ITypeInfoContext context) {
		if (type instanceof ArrayType) {
			return ((ArrayType) type).getItemType();
		} else if (type instanceof MapType) {
			return ((MapType) type).getValueType();
		} else if (type != null && type.getName().equals(ITypeNames.XML)) {
			return type;
		} else if (type != null && type.getName().equals(ITypeNames.XMLLIST)) {
			return ref(TypeInfoModelLoader.getInstance()
					.getType(ITypeNames.XML));
		} else {
			return null;
		}
	}

	public static IRType extractArrayItemType(IRType type) {
		if (type instanceof IRArrayType) {
			return ((IRArrayType) type).getItemType();
		} else if (type instanceof IRMapType) {
			return ((IRMapType) type).getValueType();
		} else if (type != null && type.getName().equals(ITypeNames.XML)) {
			return type;
		} else if (type != null && type.getName().equals(ITypeNames.XMLLIST)) {
			return JSTypeSet.ref(TypeInfoModelLoader.getInstance().getType(
					ITypeNames.XML));
		} else {
			return null;
		}
	}

	public static String getName(JSType type) {
		return type != null ? type.getName() : null;
	}

	public static String getName(IRType type) {
		return type != null ? type.getName() : null;
	}

	public static String getName(Type type) {
		if (type.isProxy()) {
			return URI.decode(((InternalEObject) type).eProxyURI().fragment());
		} else {
			return type.getName();
		}
	}

	private static final String PROXY_SCHEME = "proxy";
	private static final String PROXY_OPAQUE_PART = "dltk/javascript/typeinfo/type";

	/**
	 * @param typeName
	 * @return
	 */
	public static Type createProxy(String typeName) {
		return createProxy(createProxyURI(typeName));
	}

	public static Type createProxy(URI uri) {
		final Type type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setName(uri.fragment());
		((InternalEObject) type).eSetProxyURI(uri);
		return type;
	}

	public static URI createProxyURI(String typeName) {
		if (typeName == null)
			throw new NullPointerException("Type name is null");
		return URI.createGenericURI(PROXY_SCHEME, PROXY_OPAQUE_PART,
				URI.encodeFragment(typeName, false));
	}

	/**
	 * @param type
	 * @return
	 */
	public static Type createProxy(Type type) {
		final Type result = TypeInfoModelFactory.eINSTANCE.createType();
		if (type.isProxy()) {
			((InternalEObject) result).eSetProxyURI(((InternalEObject) type)
					.eProxyURI());
		} else {
			final String typeName = type.getName();
			result.setName(typeName);
			((InternalEObject) result).eSetProxyURI(createProxyURI(typeName));
		}
		return result;
	}

	public static boolean isTypeProxy(URI uri) {
		return PROXY_SCHEME.equals(uri.scheme())
				&& PROXY_OPAQUE_PART.equals(uri.opaquePart());
	}

	public static URI createProxyResourceURI() {
		return URI.createGenericURI(PROXY_SCHEME, PROXY_OPAQUE_PART, null);
	}

	public static EObject resolve(InternalEObject proxy, EObject objectContext) {
		final Resource resource = objectContext.eResource();
		if (resource != null) {
			final ResourceSet resourceSet = resource.getResourceSet();
			if (resourceSet instanceof TypeInfoResourceSet) {
				return ((TypeInfoResourceSet) resourceSet).resolve(proxy,
						objectContext, resource);
			}
		}
		return EcoreUtil.resolve(proxy, objectContext);
	}

	/**
	 * Tests if the declaring type of the specified member should be displayed
	 * in completion, etc.
	 * 
	 * @param member
	 * @return
	 */
	public static boolean isDeclaringTypeVisible(Member member) {
		return member.getDeclaringType() != null
				&& !(((EObject) member.getDeclaringType()).eContainer() instanceof RecordType);
	}

	/**
	 * Tests if the specified type expression should be displayed in completion,
	 * etc.
	 * 
	 * @param type
	 * @return
	 */
	public static boolean isValueTypeVisible(JSType type) {
		if (type == null) {
			return false;
		} else if (type instanceof UndefinedType) {
			return false;
		} else if (type instanceof RecordType) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Return {@link TypeKind} of the simple type in the specified runtime type
	 * or <code>null</code>.
	 * 
	 * @param type
	 * @return
	 */
	public static TypeKind kind(IRType type) {
		if (type != null) {
			if (type instanceof IRSimpleType) {
				final Type t = ((IRSimpleType) type).getTarget();
				if (t != null) {
					return t.getKind();
				}
			} else if (type instanceof IRClassType) {
				final Type t = ((IRClassType) type).getTarget();
				if (t != null) {
					return t.getKind();
				}
			}
		}
		return null;
	}

	public static List<Constructor> findConstructors(Type type) {
		final Set<Type> types = new HashSet<Type>();
		while (types.add(type)) {
			final List<Constructor> constructors = type.getConstructors();
			if (!constructors.isEmpty()) {
				return constructors;
			}
			if (!type.isInheritConstructors()) {
				break;
			}
			type = type.getSuperType();
			if (type == null) {
				break;
			}
		}
		return Collections.emptyList();
	}

	public static boolean isUndefined(IRType type) {
		if (type == JSTypeSet.undefined()) {
			return true;
		} else if (type instanceof IRUnionType) {
			return ((IRUnionType) type).getTargets().contains(
					JSTypeSet.undefined());
		} else {
			return false;
		}
	}

}
