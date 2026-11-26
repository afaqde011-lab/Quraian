package nz;

import androidx.lifecycle.f1;
import b2.r;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import gz.e1;
import h0.m2;
import h0.n1;
import h0.o;
import h0.p1;
import h0.s;
import h0.t0;
import h0.z1;
import i2.t;
import j0.v;
import j0.x;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.a0;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z0;
import mu.q;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new lu.a(16), -1219459380, false);
    public static final v1.c b = new v1.c(new lu.a(17), 277662376, false);

    public static final void a(v vVar, m mVar, u00.k kVar, r rVar, l1.j jVar, int i) {
        p1 p1VarG;
        float f;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1943869037);
        int i2 = i | (g0Var.g(vVar) ? 4 : 2) | (g0Var.g(mVar) ? 32 : 16) | (g0Var.i(kVar) ? 256 : 128) | (g0Var.g(rVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            boolean zE = g0Var.e(aVar.ordinal()) | g0Var.g(n1Var) | g0Var.g(t0VarL);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zE || objN == cVar) {
                float fA = t0VarL.a() + n1Var.a();
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    p1VarG = h0.c.g(0.0f, t0VarL.c() + n1Var.c() + 44 + 16, 0.0f, fA, 5);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p1VarG = h0.c.g(0.0f, t0VarL.c() + n1Var.c() + 20, 0.0f, fA, 5);
                }
                objN = p1VarG;
                g0Var.n0(objN);
            }
            n1 n1Var2 = (n1) objN;
            r rVarV = rVar.V(z1.c);
            int iOrdinal2 = aVar.ordinal();
            if (iOrdinal2 == 0) {
                f = 16;
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 24;
            }
            r rVarE = h0.c.E(rVarV, f, 0.0f, 2);
            h0.f fVarG = h0.i.g(24);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objN2 = g0Var.N();
            if (z || objN2 == cVar) {
                objN2 = new q((Object) mVar, kVar, 2);
                g0Var.n0(objN2);
            }
            k00.f.d(rVarE, vVar, n1Var2, fVarG, null, null, false, null, (u00.k) objN2, g0Var, ((i2 << 3) & 112) | 24576, 488);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k(vVar, mVar, kVar, rVar, i, 10);
        }
    }

    public static final void b(l1.j jVar, int i) {
        Object obj;
        Object obj2;
        boolean zG;
        Object objN;
        boolean zG2;
        Object objN2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-930530786);
        if (g0Var.S(i & 1, i != 0)) {
            u00.a aVarA = cq.l.a(g0Var);
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            final n nVar = (n) c7.i.S(a0.a.b(n.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(g0Var), (u00.a) null);
            z0 z0VarQ = k00.f.q(nVar.c.d, g0Var, 0);
            kk.c cVarD = kk.e.d(g0Var);
            v vVarA = x.a(0, g0Var, 3);
            p2 p2VarB = sm.a.b(vVarA, g0Var);
            boolean zG3 = g0Var.g(nVar) | g0Var.g(aVarA);
            Object objN3 = g0Var.N();
            Object obj3 = l1.i.a;
            if (zG3 || objN3 == obj3) {
                objN3 = new g6.a(nVar, aVarA, (k00.c) null, 23);
                g0Var.n0(objN3);
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN3);
            r rVarF = z.n.f(z1.c, dl.a.L, i2.b0.b);
            b2.i iVar = b2.b.A;
            w0 w0VarD = o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            b2.o oVar = b2.o.A;
            r rVarA = kk.e.a(oVar, cVarD);
            m mVar = (m) z0VarQ.getValue();
            boolean zG4 = g0Var.g(nVar);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == obj3) {
                obj = obj3;
                e1 e1Var = new e1(1, nVar, n.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/notification/NotificationAction;)V", 0, 11);
                g0Var.n0(e1Var);
                objN4 = e1Var;
            } else {
                obj = obj3;
            }
            a(vVarA, mVar, (u00.k) ((a10.g) objN4), rVarA, g0Var, 0);
            b2.i iVar2 = b2.b.B;
            s sVar = s.a;
            sm.a.a(z3.U(g0Var, 2131886921), ((Number) p2VarB.getValue()).floatValue(), sVar.a(oVar, iVar2), 0.0f, g0Var, 0);
            r rVarA2 = sVar.a(h0.c.M(h0.c.E(oVar, 16, 0.0f, 2), h0.c.e), iVar);
            p0.e eVar = p0.f.a;
            float f = 0;
            float f2 = 44;
            long jB = t.b(0.5f, dl.a.P);
            boolean zG5 = g0Var.g(nVar);
            Object objN5 = g0Var.N();
            if (zG5) {
                obj2 = obj;
            } else {
                obj2 = obj;
                if (objN5 == obj2) {
                }
                Object obj4 = obj2;
                w50.c.f((u00.a) objN5, cVarD, rVarA2, false, false, 0.0f, new y3.f(f2), 0L, jB, 10.0f, eVar, f, a, g0Var, 806879232, 432, 184);
                g0Var.r(true);
                boolean z = ((m) z0VarQ.getValue()).a;
                int i2 = ((m) z0VarQ.getValue()).c;
                int i3 = ((m) z0VarQ.getValue()).d;
                zG = g0Var.g(nVar);
                objN = g0Var.N();
                if (zG || objN == obj4) {
                    objN = new m3.a(nVar, 4);
                    g0Var.n0(objN);
                }
                u00.n nVar2 = (u00.n) objN;
                zG2 = g0Var.g(nVar);
                objN2 = g0Var.N();
                if (zG2 || objN2 == obj4) {
                    final int i4 = 1;
                    objN2 = new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i5 = i4;
                            n nVar3 = nVar;
                            switch (i5) {
                                case 0:
                                    nVar3.j(b.a);
                                    break;
                                default:
                                    nVar3.j(d.a);
                                    break;
                            }
                            return b0.a;
                        }
                    };
                    g0Var.n0(objN2);
                }
                f50.c.k(z, nVar2, (u00.a) objN2, null, i2, i3, g0Var, 0);
                g0Var = g0Var;
            }
            final int i5 = 0;
            objN5 = new u00.a() {
                @Override
                public final Object invoke() {
                    int i6 = i5;
                    n nVar3 = nVar;
                    switch (i6) {
                        case 0:
                            nVar3.j(b.a);
                            break;
                        default:
                            nVar3.j(d.a);
                            break;
                    }
                    return b0.a;
                }
            };
            g0Var.n0(objN5);
            Object obj5 = obj2;
            w50.c.f((u00.a) objN5, cVarD, rVarA2, false, false, 0.0f, new y3.f(f2), 0L, jB, 10.0f, eVar, f, a, g0Var, 806879232, 432, 184);
            g0Var.r(true);
            boolean z2 = ((m) z0VarQ.getValue()).a;
            int i6 = ((m) z0VarQ.getValue()).c;
            int i7 = ((m) z0VarQ.getValue()).d;
            zG = g0Var.g(nVar);
            objN = g0Var.N();
            if (zG) {
                objN = new m3.a(nVar, 4);
                g0Var.n0(objN);
            } else {
                objN = new m3.a(nVar, 4);
                g0Var.n0(objN);
            }
            u00.n nVar3 = (u00.n) objN;
            zG2 = g0Var.g(nVar);
            objN2 = g0Var.N();
            if (zG2) {
                final int i8 = 1;
                objN2 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i9 = i8;
                        n nVar4 = nVar;
                        switch (i9) {
                            case 0:
                                nVar4.j(b.a);
                                break;
                            default:
                                nVar4.j(d.a);
                                break;
                        }
                        return b0.a;
                    }
                };
                g0Var.n0(objN2);
            } else {
                final int i9 = 1;
                objN2 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i11 = i9;
                        n nVar4 = nVar;
                        switch (i11) {
                            case 0:
                                nVar4.j(b.a);
                                break;
                            default:
                                nVar4.j(d.a);
                                break;
                        }
                        return b0.a;
                    }
                };
                g0Var.n0(objN2);
            }
            f50.c.k(z2, nVar3, (u00.a) objN2, null, i6, i7, g0Var, 0);
            g0Var = g0Var;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ny.c(i);
        }
    }
}
