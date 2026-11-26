package p10;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

public final class i extends b0 implements e20.d {
    public final Type a;
    public final b0 b;
    public final h00.x c;

    public i(Type type) {
        b0 zVar;
        b0 zVar2;
        this.a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.m.d(componentType, "getComponentType(...)");
                    zVar = componentType.isPrimitive() ? new z(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new i(componentType) : componentType instanceof WildcardType ? new e0((WildcardType) componentType) : new q(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        kotlin.jvm.internal.m.d(genericComponentType, "getGenericComponentType(...)");
        boolean z = genericComponentType instanceof Class;
        if (z) {
            Class cls2 = (Class) genericComponentType;
            zVar2 = cls2.isPrimitive() ? new z(cls2) : zVar2;
            this.b = zVar2;
            this.c = h00.x.A;
        }
        zVar = ((genericComponentType instanceof GenericArrayType) || (z && ((Class) genericComponentType).isArray())) ? new i(genericComponentType) : genericComponentType instanceof WildcardType ? new e0((WildcardType) genericComponentType) : new q(genericComponentType);
        zVar2 = zVar;
        this.b = zVar2;
        this.c = h00.x.A;
    }

    @Override
    public final Type b() {
        return this.a;
    }

    @Override
    public final Collection getAnnotations() {
        return this.c;
    }
}
