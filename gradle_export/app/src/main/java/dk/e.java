package dk;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

public final class e implements GenericArrayType, Serializable {
    public final Type A;

    public e(Type type) {
        Objects.requireNonNull(type);
        this.A = h.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && h.e(this, (GenericArrayType) obj);
    }

    @Override
    public final Type getGenericComponentType() {
        return this.A;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final String toString() {
        return h.k(this.A) + "[]";
    }
}
