package hb;

import g00.b0;

public final class t implements u00.k {
    public final int A;
    public final x B;
    public final p C;

    public t(x xVar, p pVar, int i10) {
        this.A = i10;
        this.B = xVar;
        this.C = pVar;
    }

    public final Object invoke(Object obj) {
        ma.a aVar = (ma.a) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(aVar, "_connection");
                this.B.f7029b.i0(aVar, this.C);
                break;
            default:
                kotlin.jvm.internal.m.e(aVar, "_connection");
                this.B.f7030c.C(aVar, this.C);
                break;
        }
        return b0.a;
    }
}
