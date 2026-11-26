package dk;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

public final class f implements ParameterizedType, Serializable {
    public final Type A;
    public final Type B;
    public final Type[] C;

    public f(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.A = type == null ? null : h.a(type);
        this.B = h.a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.C = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.C[i10]);
            h.c(this.C[i10]);
            Type[] typeArr3 = this.C;
            typeArr3[i10] = h.a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && h.e(this, (ParameterizedType) obj);
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
            return h.k(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(h.k(type));
        sb2.append("<");
        sb2.append(h.k(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(", ");
            sb2.append(h.k(typeArr[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
