package d10;

import java.lang.reflect.Type;
import java.util.Arrays;

public final class v implements Type {
    public final Type[] A;
    public final int B;

    public v(Type[] types) {
        kotlin.jvm.internal.m.e(types, "types");
        this.A = types;
        this.B = Arrays.hashCode(types);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return Arrays.equals(this.A, ((v) obj).A);
        }
        return false;
    }

    @Override
    public final String getTypeName() {
        return h00.n.M0(this.A, ", ", "[", "]", null, 56);
    }

    public final int hashCode() {
        return this.B;
    }

    public final String toString() {
        return getTypeName();
    }
}
