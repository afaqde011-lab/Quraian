package d6;

import android.content.Context;

public final class b implements u00.n {
    public final int A = 0;
    public final long B;
    public final Object C;
    public final Object D;
    public final Object E;

    public b(Context context, p0 p0Var, long j9, u00.n nVar) {
        this.C = context;
        this.D = p0Var;
        this.B = j9;
        this.E = nVar;
    }

    public b(bv.o1 o1Var, u00.k kVar, kk.c cVar, long j9) {
        this.C = o1Var;
        this.D = kVar;
        this.E = cVar;
        this.B = j9;
    }

    public b(ju.h hVar, u00.k kVar, b2.r rVar, long j9, int i10) {
        this.C = hVar;
        this.D = kVar;
        this.E = rVar;
        this.B = j9;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                Context context = (Context) this.C;
                p0 p0Var = (p0) this.D;
                u00.n nVar = (u00.n) this.E;
                l1.j jVar = (l1.j) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    l1.g0 g0Var = (l1.g0) jVar;
                    if (g0Var.C()) {
                        g0Var.V();
                    } else {
                        l1.q.a(b6.g.f2169b.a(context), v1.d.d(-1363737697, new c(p0Var, this.B, nVar), jVar), jVar, 56);
                    }
                } else {
                    l1.q.a(b6.g.f2169b.a(context), v1.d.d(-1363737697, new c(p0Var, this.B, nVar), jVar), jVar, 56);
                }
                break;
            case 1:
                bv.o1 o1Var = (bv.o1) this.C;
                u00.k kVar = (u00.k) this.D;
                kk.c cVar = (kk.c) this.E;
                l1.j jVar2 = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zz.a aVar = o1Var.m;
                    boolean zG = g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.f9868a) {
                        objN = new gv.a0(4, kVar);
                        g0Var2.n0(objN);
                    }
                    gv.p.c(aVar, (u00.a) objN, cVar, this.B, (b2.r) null, jVar2, 0, 16);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mu.d.l((ju.h) this.C, (u00.k) this.D, (b2.r) this.E, this.B, (l1.j) obj, l1.q.K(1));
                break;
        }
        return g00.b0.a;
    }
}
