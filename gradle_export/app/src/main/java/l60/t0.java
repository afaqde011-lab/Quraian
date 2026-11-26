package l60;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public final class t0 implements GenericArrayType {
    public final Type A;

    public t0(Type type) {
        this.A = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && w0.e(this, (GenericArrayType) obj);
    }

    @Override
    public final Type getGenericComponentType() {
        return this.A;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return w0.s(this.A) + "[]";
    }
}
