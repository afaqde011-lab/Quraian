package l60;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class v0 implements WildcardType {
    public final Type A;
    public final Type B;

    public v0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            w0.d(typeArr[0]);
            this.B = null;
            this.A = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        w0.d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.B = typeArr2[0];
        this.A = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && w0.e(this, (WildcardType) obj);
    }

    @Override
    public final Type[] getLowerBounds() {
        Type type = this.B;
        return type != null ? new Type[]{type} : w0.a;
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
            return "? super " + w0.s(type);
        }
        Type type2 = this.A;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + w0.s(type2);
    }
}
