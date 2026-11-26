package mu;

import g00.b0;
import i2.c0;
import l1.p2;
import l1.z0;
import m3.n0;

public final class w implements u00.k {
    public final int A;
    public final long B;
    public final p2 C;
    public final p2 D;

    public w(long j, p2 p2Var, p2 p2Var2, int i) {
        this.A = i;
        this.B = j;
        this.C = p2Var;
        this.D = p2Var2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                z0 z0Var = this.C;
                z0 z0Var2 = this.D;
                n0 result = (n0) obj;
                kotlin.jvm.internal.m.e(result, "result");
                if (result.d()) {
                    long j = ((y3.o) z0Var.getValue()).a;
                    long j2 = this.B;
                    kh.o.p(j, j2);
                    if (Float.compare(y3.o.c(j), y3.o.c(j2)) > 0) {
                        z0Var.setValue(new y3.o(kh.o.F(Math.max(y3.o.c(j2), y3.o.c(((y3.o) z0Var.getValue()).a) * 0.95f), 4294967296L)));
                        z0Var2.setValue(Boolean.FALSE);
                    } else {
                        z0Var2.setValue(Boolean.TRUE);
                    }
                } else {
                    z0Var2.setValue(Boolean.TRUE);
                }
                break;
            default:
                c0 graphicsLayer = (c0) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                p2 p2Var = this.C;
                graphicsLayer.I0(((Number) p2Var.getValue()).floatValue());
                graphicsLayer.N(((Number) p2Var.getValue()).floatValue());
                graphicsLayer.S0(this.B);
                graphicsLayer.s0(((Number) this.D.getValue()).floatValue());
                break;
        }
        return b0.a;
    }
}
