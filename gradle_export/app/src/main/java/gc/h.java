package gc;

import b2.r;
import c4.v;
import g00.b0;
import l1.q;
import qd.s0;

public final class h extends kotlin.jvm.internal.n implements u00.n {
    public final int A;
    public final Object B;
    public final u00.a C;
    public final Object D;
    public final int E;
    public final int F;

    public h(cc.a aVar, u00.a aVar2, r rVar, int i10, int i11, int i12) {
        super(2);
        this.A = i12;
        this.B = aVar;
        this.C = aVar2;
        this.D = rVar;
        this.E = i10;
        this.F = i11;
    }

    public h(u00.a aVar, v vVar, v1.c cVar, int i10, int i11) {
        super(2);
        this.A = 2;
        this.C = aVar;
        this.B = vVar;
        this.D = cVar;
        this.E = i10;
        this.F = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Number) obj2).intValue();
                cc.a aVar = (cc.a) this.B;
                r rVar = (r) this.D;
                f50.c.h(aVar, this.C, rVar, (l1.j) obj, this.E | 1, this.F);
                break;
            case 1:
                ((Number) obj2).intValue();
                cc.a aVar2 = (cc.a) this.B;
                r rVar2 = (r) this.D;
                f50.c.h(aVar2, this.C, rVar2, (l1.j) obj, this.E | 1, this.F);
                break;
            default:
                ((Number) obj2).intValue();
                v vVar = (v) this.B;
                v1.c cVar = (v1.c) this.D;
                s0.G(this.C, vVar, cVar, (l1.j) obj, q.K(this.E | 1), this.F);
                break;
        }
        return b0.a;
    }
}
