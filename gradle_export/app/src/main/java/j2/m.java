package j2;

import ab.a0;

public final class m implements i {
    public final int A;
    public final r B;

    public m(r rVar, int i10) {
        this.A = i10;
        this.B = rVar;
    }

    @Override
    public final double b(double d3) {
        switch (this.A) {
            case 0:
                r rVar = this.B;
                return a0.w(rVar.f7912k.b(d3), rVar.f7906e, rVar.f7907f);
            default:
                r rVar2 = this.B;
                return rVar2.f7913n.b(a0.w(d3, rVar2.f7906e, rVar2.f7907f));
        }
    }
}
