package p10;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

public final class e0 extends b0 implements e20.d {
    public final WildcardType a;

    public e0(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override
    public final Type b() {
        return this.a;
    }

    public final b0 c() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objR0 = h00.n.R0(lowerBounds);
            kotlin.jvm.internal.m.d(objR0, "single(...)");
            Type type = (Type) objR0;
            boolean z = type instanceof Class;
            if (z) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new z(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z && ((Class) type).isArray())) {
                return new i(type);
            }
            return type instanceof WildcardType ? new e0((WildcardType) type) : new q(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) h00.n.R0(upperBounds);
        if (kotlin.jvm.internal.m.a(type2, Object.class)) {
            return null;
        }
        kotlin.jvm.internal.m.b(type2);
        boolean z2 = type2 instanceof Class;
        if (z2) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new z(cls2);
            }
        }
        if ((type2 instanceof GenericArrayType) || (z2 && ((Class) type2).isArray())) {
            return new i(type2);
        }
        return type2 instanceof WildcardType ? new e0((WildcardType) type2) : new q(type2);
    }

    @Override
    public final Collection getAnnotations() {
        return h00.x.A;
    }
}
