package p10;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

public final class x extends w implements e20.e {
    public final Method a;

    public x(Method member) {
        kotlin.jvm.internal.m.e(member, "member");
        this.a = member;
    }

    @Override
    public final Member b() {
        return this.a;
    }

    public final b0 f() {
        Type genericReturnType = this.a.getGenericReturnType();
        kotlin.jvm.internal.m.d(genericReturnType, "getGenericReturnType(...)");
        boolean z = genericReturnType instanceof Class;
        if (z) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new z(cls);
            }
        }
        if ((genericReturnType instanceof GenericArrayType) || (z && ((Class) genericReturnType).isArray())) {
            return new i(genericReturnType);
        }
        return genericReturnType instanceof WildcardType ? new e0((WildcardType) genericReturnType) : new q(genericReturnType);
    }

    public final List g() {
        Method method = this.a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        kotlin.jvm.internal.m.d(parameterAnnotations, "getParameterAnnotations(...)");
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.a.getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }
}
