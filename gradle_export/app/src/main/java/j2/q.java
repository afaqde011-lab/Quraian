package j2;

import ab.a0;

public final class q extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final r B;

    public q(r rVar, int i10) {
        super(1);
        this.A = i10;
        this.B = rVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                r rVar = this.B;
                return Double.valueOf(rVar.f7913n.b(a0.w(dDoubleValue, rVar.f7906e, rVar.f7907f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                r rVar2 = this.B;
                return Double.valueOf(a0.w(rVar2.f7912k.b(dDoubleValue2), rVar2.f7906e, rVar2.f7907f));
        }
    }
}
