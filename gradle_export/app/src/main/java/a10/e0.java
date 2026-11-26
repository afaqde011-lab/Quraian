package a10;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public final class e0 implements ParameterizedType, Type {
    public final Class A;
    public final Type B;
    public final Type[] C;

    public e0(Class cls, Type type, ArrayList arrayList) {
        this.A = cls;
        this.B = type;
        this.C = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return kotlin.jvm.internal.m.a(this.A, parameterizedType.getRawType()) && kotlin.jvm.internal.m.a(this.B, parameterizedType.getOwnerType()) && Arrays.equals(this.C, parameterizedType.getActualTypeArguments());
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return this.C;
    }

    @Override
    public final Type getOwnerType() {
        return this.B;
    }

    @Override
    public final Type getRawType() {
        return this.A;
    }

    @Override
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.A;
        Type type = this.B;
        if (type != null) {
            sb.append(h0.h(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(h0.h(cls));
        }
        Type[] typeArr = this.C;
        if (typeArr.length != 0) {
            h00.n.K0(typeArr, sb, ", ", "<", ">", "...", d0.A);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.A.hashCode();
        Type type = this.B;
        return Arrays.hashCode(this.C) ^ (iHashCode ^ (type != null ? type.hashCode() : 0));
    }

    public final String toString() {
        return getTypeName();
    }
}
