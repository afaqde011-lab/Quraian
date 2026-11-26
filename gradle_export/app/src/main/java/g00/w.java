package g00;

import com.google.android.gms.internal.measurement.z3;

public final class w implements Comparable {
    public final long A;

    public w(long j) {
        this.A = j;
    }

    @Override
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.m.g(this.A ^ Long.MIN_VALUE, ((w) obj).A ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.A == ((w) obj).A;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.A);
    }

    public final String toString() {
        long j = this.A;
        if (j >= 0) {
            z3.r(10);
            String string = Long.toString(j, 10);
            kotlin.jvm.internal.m.d(string, "toString(...)");
            return string;
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        z3.r(10);
        String string2 = Long.toString(j3, 10);
        kotlin.jvm.internal.m.d(string2, "toString(...)");
        z3.r(10);
        String string3 = Long.toString(j4, 10);
        kotlin.jvm.internal.m.d(string3, "toString(...)");
        return string2.concat(string3);
    }
}
