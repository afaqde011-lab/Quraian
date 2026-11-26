package androidx.media3.common;

public final class s2 {

    public static final s2 f1554b;

    public static final String f1555c;

    public final fh.t0 f1556a;

    static {
        fh.r0 r0Var = fh.t0.B;
        f1554b = new s2(fh.d2.E);
        String str = e7.i0.f5136a;
        f1555c = Integer.toString(0, 36);
    }

    public s2(fh.d2 d2Var) {
        this.f1556a = fh.t0.o(d2Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            fh.t0 t0Var = this.f1556a;
            if (i11 >= t0Var.size()) {
                return false;
            }
            r2 r2Var = (r2) t0Var.get(i11);
            for (boolean z10 : r2Var.f1490e) {
                if (z10) {
                    if (r2Var.f1487b.f1340c != i10) {
                        break;
                    }
                    return true;
                }
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s2.class != obj.getClass()) {
            return false;
        }
        return this.f1556a.equals(((s2) obj).f1556a);
    }

    public final int hashCode() {
        return this.f1556a.hashCode();
    }
}
