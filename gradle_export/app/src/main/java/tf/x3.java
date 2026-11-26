package tf;

public final class x3 {

    public final y3 f14760a;

    public int f14761b = 1;

    public long f14762c = a();

    public x3(y3 y3Var) {
        this.f14760a = y3Var;
    }

    public final long a() {
        y3 y3Var = this.f14760a;
        com.google.android.gms.common.internal.d0.h(y3Var);
        long jLongValue = ((Long) b0.f14596v.a(null)).longValue();
        long jLongValue2 = ((Long) b0.f14598w.a(null)).longValue();
        for (int i10 = 1; i10 < this.f14761b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        ((ve.b) y3Var.k0()).getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
