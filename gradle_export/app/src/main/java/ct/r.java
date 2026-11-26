package ct;

import g1.a3;
import g1.a7;
import g1.z7;
import i2.t0;
import oo.o0;
import oo.z0;

public final class r implements u00.n {
    public final int A = 4;
    public final Object B;
    public final Object C;
    public final boolean D;
    public final int E;
    public final Object F;
    public final Object G;

    public r(z0 z0Var, u00.k kVar, jk.a aVar, b2.r rVar, boolean z, int i, int i2) {
        this.F = z0Var;
        this.G = kVar;
        this.B = aVar;
        this.C = rVar;
        this.D = z;
        this.E = i2;
    }

    public r(u00.a aVar, o2.f fVar, String str, b2.r rVar, boolean z, int i, int i2) {
        this.B = aVar;
        this.F = fVar;
        this.G = str;
        this.C = rVar;
        this.D = z;
        this.E = i2;
    }

    public r(u00.a aVar, u00.k kVar, jk.a aVar2, b2.r rVar, boolean z, int i) {
        this.B = aVar;
        this.F = kVar;
        this.G = aVar2;
        this.C = rVar;
        this.D = z;
        this.E = i;
    }

    public r(ys.f fVar, bx.c cVar, u00.a aVar, boolean z, b2.r rVar, int i) {
        this.F = fVar;
        this.G = cVar;
        this.B = aVar;
        this.D = z;
        this.C = rVar;
        this.E = i;
    }

    public r(yu.a aVar, hv.j jVar, hv.j jVar2, b2.r rVar, boolean z, int i) {
        this.F = aVar;
        this.G = jVar;
        this.B = jVar2;
        this.C = rVar;
        this.D = z;
        this.E = i;
    }

    public r(boolean z, t0 t0Var, u00.a aVar, a7 a7Var, v1.c cVar, int i) {
        this.D = z;
        this.F = t0Var;
        this.B = aVar;
        this.G = a7Var;
        this.C = cVar;
        this.E = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                ca.v.e((ys.f) this.F, (bx.c) this.G, (u00.a) this.B, this.D, (b2.r) this.C, (l1.j) obj, l1.q.K(this.E | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                a3.h((u00.a) this.B, (o2.f) this.F, (String) this.G, (b2.r) this.C, this.D, (l1.j) obj, iK, this.E);
                break;
            case 2:
                ((Integer) obj2).getClass();
                z7.o(this.D, (t0) this.F, (u00.a) this.B, (a7) this.G, (v1.c) this.C, (l1.j) obj, l1.q.K(this.E | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                iv.a.c((yu.a) this.F, (hv.j) this.G, (hv.j) this.B, (b2.r) this.C, this.D, (l1.j) obj, l1.q.K(this.E | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(3073);
                o0.p((z0) this.F, (u00.k) this.G, (jk.a) this.B, (b2.r) this.C, this.D, (l1.j) obj, iK2, this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                a10.h0.f((u00.a) this.B, (u00.k) this.F, (jk.a) this.G, (b2.r) this.C, this.D, (l1.j) obj, l1.q.K(this.E | 1));
                break;
        }
        return g00.b0.a;
    }
}
