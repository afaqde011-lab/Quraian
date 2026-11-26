package al;

import g00.b0;
import l1.g0;
import l1.q;
import l1.q2;
import l1.r1;
import x.d0;
import x.e0;

public abstract class m {
    public static final q2 a = new q2(new a2.f(5));

    public static final void a(v1.c cVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1260039763);
        if (g0Var.S(i & 1, (i & 3) != 2)) {
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = new h();
                g0Var.n0(objN);
            }
            h hVar = (h) objN;
            q.a(a.a(hVar), v1.d.d(-1199599213, new i(cVar, hVar, 0), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new j(cVar, i, 0);
        }
    }

    public static final void b(final h hVar, l1.j jVar, final int i) {
        r1 r1VarT;
        u00.n nVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1339325846);
        if (g0Var.S(i & 1, (i & 3) != 2)) {
            if (hVar.a.h() <= 0) {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                }
                final int i2 = 0;
                nVar = new u00.n(hVar, i, i2) {
                    public final int A;
                    public final h B;

                    {
                        this.A = i2;
                    }

                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        int i3 = this.A;
                        l1.j jVar2 = (l1.j) obj;
                        ((Integer) obj2).getClass();
                        switch (i3) {
                            case 0:
                                m.b(this.B, jVar2, q.K(7));
                                break;
                            default:
                                m.b(this.B, jVar2, q.K(7));
                                break;
                        }
                        return b0.a;
                    }
                };
            } else {
                e0 e0VarH = x.c.h(x.c.s("shared_shimmer", g0Var, 0), 0.0f, 1.0f, (d0) b.a.getValue(), "shared_shimmer_progress", g0Var, 29112, 0);
                boolean zG = g0Var.g(e0VarH);
                Object objN = g0Var.N();
                if (zG || objN == l1.i.a) {
                    objN = new l(hVar, e0VarH, 0);
                    g0Var.n0(objN);
                }
                q.c(hVar, e0VarH, (u00.k) objN, g0Var);
            }
            r1VarT.d = nVar;
        }
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i3 = 1;
            nVar = new u00.n(hVar, i, i3) {
                public final int A;
                public final h B;

                {
                    this.A = i3;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = this.A;
                    l1.j jVar2 = (l1.j) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            m.b(this.B, jVar2, q.K(7));
                            break;
                        default:
                            m.b(this.B, jVar2, q.K(7));
                            break;
                    }
                    return b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }
}
