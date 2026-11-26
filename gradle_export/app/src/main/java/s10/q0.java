package s10;

import com.google.android.gms.internal.measurement.z3;

public final class q0 extends z3 {
    public final int d;

    public q0(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && this.d == ((q0) obj).d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d);
    }

    public final String toString() {
        return oi.k.l(new StringBuilder("TypeParameter(id="), this.d, ')');
    }
}
