package pl;

import g00.b0;
import java.util.List;

public final class k implements u00.k {
    public final int A;
    public final z1.p B;
    public final long C;
    public final List D;

    public k(int i, z1.p pVar, long j, List list) {
        this.A = i;
        this.B = pVar;
        this.C = j;
        this.D = list;
    }

    @Override
    public final Object invoke(Object obj) {
        k2.d Canvas = (k2.d) obj;
        kotlin.jvm.internal.m.e(Canvas, "$this$Canvas");
        if (this.A >= 0) {
            f50.c.u(Canvas, this.B, this.C, this.D);
        }
        return b0.a;
    }
}
