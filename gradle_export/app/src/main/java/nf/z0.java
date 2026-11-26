package nf;

import java.util.Arrays;

public final class z0 extends c1 {
    public final long A;

    public z0(long j9) {
        this.A = j9;
    }

    @Override
    public final int a() {
        return c1.d(this.A >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        if (a() != c1Var.a()) {
            return a() - c1Var.a();
        }
        long jAbs = Math.abs(this.A);
        long jAbs2 = Math.abs(((z0) c1Var).A);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && z0.class == obj.getClass() && this.A == ((z0) obj).A;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.A)});
    }

    public final String toString() {
        return Long.toString(this.A);
    }
}
