package b6;

import d00.x0;
import g00.b0;
import i2.t0;
import jz.y;
import jz.z;

public final class p implements u00.n {
    public final int A;
    public final int B;
    public final int C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;

    public p(t tVar, String str, m mVar, int i10, e eVar, int i11) {
        this.A = 0;
        this.D = tVar;
        this.E = str;
        this.F = mVar;
        this.B = i10;
        this.G = eVar;
        this.C = i11;
    }

    public p(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11, int i12) {
        this.A = i12;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
        this.G = obj4;
        this.B = i10;
        this.C = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                w50.c.e((t) this.D, (String) this.E, (m) this.F, this.B, (e) this.G, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                gv.p.B((x0) this.D, (jk.a) this.E, (u00.k) this.F, (b2.r) this.G, (l1.j) obj, l1.q.K(this.B | 1), this.C);
                break;
            case 2:
                ((Integer) obj2).getClass();
                y.a((z) this.D, (u00.k) this.E, (b2.r) this.F, (j0.v) this.G, (l1.j) obj, l1.q.K(this.B | 1), this.C);
                break;
            default:
                ((Integer) obj2).getClass();
                ((pl.j) this.D).a((b2.r) this.E, (t0) this.F, (v1.c) this.G, (l1.j) obj, l1.q.K(this.B | 1), this.C);
                break;
        }
        return b0.a;
    }
}
