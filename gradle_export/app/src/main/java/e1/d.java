package e1;

import h0.t1;
import h0.v1;
import h0.z1;
import l1.m1;

public final class d implements u00.n {
    public final int A = 0;
    public final boolean B;
    public final b2.r C;
    public final long D;
    public final Object E;

    public d(long j9, boolean z10, b2.r rVar, n nVar) {
        this.D = j9;
        this.B = z10;
        this.C = rVar;
        this.E = nVar;
    }

    public d(String str, boolean z10, b2.r rVar, long j9, int i10) {
        this.E = str;
        this.B = z10;
        this.C = rVar;
        this.D = j9;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                final n nVar = (n) this.E;
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j9 = this.D;
                    boolean z10 = this.B;
                    b2.r rVar = this.C;
                    l1.c cVar = l1.i.f9868a;
                    if (j9 != 9205357640488583168L) {
                        g0Var.c0(3458246);
                        h0.b bVar = z10 ? h0.c.f6383b : h0.c.f6382a;
                        b2.r rVarK = z1.k(rVar, y3.h.b(j9), y3.h.a(j9), 0.0f, 0.0f, 12);
                        v1 v1VarA = t1.a(bVar, b2.b.J, jVar, 0);
                        int iHashCode = Long.hashCode(g0Var.T);
                        m1 m1VarM = g0Var.m();
                        b2.r rVarC = b2.a.c(rVarK, jVar);
                        b3.i.f2042c.getClass();
                        b3.g gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(v1VarA, jVar, b3.h.f2039f);
                        l1.q.I(m1VarM, jVar, b3.h.f2038e);
                        l1.q.I(Integer.valueOf(iHashCode), jVar, b3.h.f2040g);
                        l1.q.E(jVar, b3.h.f2041h);
                        l1.q.I(rVarC, jVar, b3.h.f2037d);
                        boolean zI = g0Var.i(nVar);
                        Object objN = g0Var.N();
                        if (zI || objN == cVar) {
                            final int i10 = 0;
                            objN = new u00.a() {
                                public final Object invoke() {
                                    int i11 = i10;
                                    n nVar2 = nVar;
                                    switch (i11) {
                                        case 0:
                                            return Boolean.valueOf((nVar2.a() & 9223372034707292159L) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((nVar2.a() & 9223372034707292159L) != 9205357640488583168L);
                                    }
                                }
                            };
                            g0Var.n0(objN);
                        }
                        a.a.e(6, b2.o.A, jVar, (u00.a) objN, z10);
                        g0Var.r(true);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(4389176);
                        boolean zI2 = g0Var.i(nVar);
                        Object objN2 = g0Var.N();
                        if (zI2 || objN2 == cVar) {
                            final int i11 = 1;
                            objN2 = new u00.a() {
                                public final Object invoke() {
                                    int i12 = i11;
                                    n nVar2 = nVar;
                                    switch (i12) {
                                        case 0:
                                            return Boolean.valueOf((nVar2.a() & 9223372034707292159L) != 9205357640488583168L);
                                        default:
                                            return Boolean.valueOf((nVar2.a() & 9223372034707292159L) != 9205357640488583168L);
                                    }
                                }
                            };
                            g0Var.n0(objN2);
                        }
                        a.a.e(0, rVar, jVar, (u00.a) objN2, z10);
                        g0Var.r(false);
                    }
                } else {
                    g0Var.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rx.a.j((String) this.E, this.B, this.C, this.D, (l1.j) obj, l1.q.K(1));
                break;
        }
        return g00.b0.a;
    }
}
