package c4;

import c3.k1;

public final class a extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final x B;

    public a(x xVar, int i10) {
        super(1);
        this.A = i10;
        this.B = xVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                x xVar = this.B;
                xVar.show();
                return new k1(xVar, 1);
            default:
                x xVar2 = this.B;
                if (xVar2.F.f2846a) {
                    xVar2.E.invoke();
                }
                return g00.b0.a;
        }
    }
}
