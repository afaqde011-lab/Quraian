package a10;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class a implements GenericArrayType, Type {
    public final Type A;

    public a(Type elementType) {
        kotlin.jvm.internal.m.e(elementType, "elementType");
        this.A = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return kotlin.jvm.internal.m.a(this.A, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override
    public final Type getGenericComponentType() {
        return this.A;
    }

    @Override
    public final String getTypeName() {
        return h0.h(this.A) + "[]";
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
