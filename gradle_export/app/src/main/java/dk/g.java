package dk;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

public final class g implements WildcardType, Serializable {
    public final Type A;
    public final Type B;

    public g(Type[] typeArr, Type[] typeArr2) {
        h.b(typeArr2.length <= 1);
        h.b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            h.c(typeArr[0]);
            this.B = null;
            this.A = h.a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        h.c(typeArr2[0]);
        h.b(typeArr[0] == Object.class);
        this.B = h.a(typeArr2[0]);
        this.A = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && h.e(this, (WildcardType) obj);
    }

    @Override
    public final Type[] getLowerBounds() {
        Type type = this.B;
        return type != null ? new Type[]{type} : h.f4921a;
    }

    @Override
    public final Type[] getUpperBounds() {
        return new Type[]{this.A};
    }

    public final int hashCode() {
        Type type = this.B;
        return (this.A.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.B;
        if (type != null) {
            return "? super " + h.k(type);
        }
        Type type2 = this.A;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + h.k(type2);
    }
}
