package l60;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

public final class u0 implements ParameterizedType {
    public final Type A;
    public final Type B;
    public final Type[] C;

    public u0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            w0.d(type3);
        }
        this.A = type;
        this.B = type2;
        this.C = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && w0.e(this, (ParameterizedType) obj);
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.C.clone();
    }

    @Override
    public final Type getOwnerType() {
        return this.A;
    }

    @Override
    public final Type getRawType() {
        return this.B;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.C) ^ this.B.hashCode();
        Type type = this.A;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.C;
        int length = typeArr.length;
        Type type = this.B;
        if (length == 0) {
            return w0.s(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(w0.s(type));
        sb.append("<");
        sb.append(w0.s(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(w0.s(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
