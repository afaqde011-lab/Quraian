package nf;

import java.util.Arrays;

public final class x0 extends c1 {
    public final boolean A;

    public x0(boolean z10) {
        this.A = z10;
    }

    @Override
    public final int a() {
        return c1.d((byte) -32);
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iA = c1Var.a();
        int iD = c1.d((byte) -32);
        if (iD != iA) {
            return iD - c1Var.a();
        }
        return (true != this.A ? 20 : 21) - (true != ((x0) c1Var).A ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x0.class == obj.getClass() && this.A == ((x0) obj).A;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.d((byte) -32)), Boolean.valueOf(this.A)});
    }

    public final String toString() {
        return Boolean.toString(this.A);
    }
}
