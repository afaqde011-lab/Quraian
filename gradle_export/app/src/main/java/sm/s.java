package sm;

import g1.o3;
import h0.w1;
import h0.z1;

public final class s implements u00.o {
    public final float A;
    public final m2.b B;
    public final String C;
    public final long D;

    public s(float f, m2.b bVar, String str, long j) {
        this.A = f;
        this.B = bVar;
        this.C = str;
        this.D = j;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w1 LiquidButton = (w1) obj;
        l1.g0 g0Var = (l1.j) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        kotlin.jvm.internal.m.e(LiquidButton, "$this$LiquidButton");
        l1.g0 g0Var2 = g0Var;
        if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
            o3.a(this.B, this.C, z1.m(b2.o.A, this.A), this.D, g0Var, 8, 0);
        } else {
            g0Var2.V();
        }
        return g00.b0.a;
    }
}
