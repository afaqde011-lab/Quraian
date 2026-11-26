package a10;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

public final class i0 implements WildcardType, Type {
    public static final i0 C = new i0(null, null);
    public final Type A;
    public final Type B;

    public i0(Type type, Type type2) {
        this.A = type;
        this.B = type2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override
    public final Type[] getLowerBounds() {
        Type type = this.B;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override
    public final String getTypeName() {
        Type type = this.B;
        if (type != null) {
            return "? super " + h0.h(type);
        }
        Type type2 = this.A;
        if (type2 == null || kotlin.jvm.internal.m.a(type2, Object.class)) {
            return "?";
        }
        return "? extends " + h0.h(type2);
    }

    @Override
    public final Type[] getUpperBounds() {
        Type type = this.A;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getLowerBounds()) ^ Arrays.hashCode(getUpperBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
