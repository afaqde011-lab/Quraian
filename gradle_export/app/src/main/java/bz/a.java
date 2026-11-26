package bz;

import a1.o1;
import android.content.Context;
import androidx.lifecycle.f1;
import c3.o0;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import gz.g1;
import h0.m2;
import h0.n1;
import h0.t0;
import h0.z1;
import i2.t;
import j0.v;
import j0.x;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.a0;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z0;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new al.c(14), -946349120, false);

    public static final void a(l1.j jVar, int i) {
        Object next;
        Object obj;
        boolean zG;
        Object objN;
        boolean zG2;
        Object objN2;
        boolean zG3;
        Object objN3;
        boolean zG4;
        Object objN4;
        boolean zG5;
        Object objN5;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1066586450);
        if (g0Var.S(i & 1, i != 0)) {
            u00.a aVarA = cq.l.a(g0Var);
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            s sVar = (s) c7.i.S(a0.a.b(s.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(g0Var), (u00.a) null);
            final z0 z0VarQ = k00.f.q(sVar.c.d, g0Var, 0);
            kk.c cVarD = kk.e.d(g0Var);
            v vVarA = x.a(0, g0Var, 3);
            final j1.r rVarD = j1.k.d(g0Var);
            p2 p2VarB = sm.a.b(vVarA, g0Var);
            final gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            final n1 n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap = m2.w;
            final t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            Context context = (Context) g0Var.k(o0.b);
            ol.b bVar = (ol.b) g0Var.k(ol.a.a);
            Iterator<E> it = ((p) z0VarQ.getValue()).c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((ry.a) next).a.equals(((p) z0VarQ.getValue()).d));
            ry.a aVar2 = (ry.a) next;
            boolean zG6 = g0Var.g(sVar) | g0Var.g(aVarA) | g0Var.g(bVar) | g0Var.i(context);
            Object objN6 = g0Var.N();
            Object obj2 = l1.i.a;
            if (zG6 || objN6 == obj2) {
                objN6 = new a1.g(sVar, aVarA, bVar, context, (k00.c) null, 9);
                g0Var.n0(objN6);
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN6);
            h0.a0 a0Var = z1.c;
            b2.r rVarF = z.n.f(a0Var, dl.a.L, i2.b0.b);
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarF, g0Var);
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
            boolean z = ((p) z0VarQ.getValue()).b;
            boolean zG7 = g0Var.g(sVar);
            Object objN7 = g0Var.N();
            if (zG7 || objN7 == obj2) {
                objN7 = new m(sVar, 0);
                g0Var.n0(objN7);
            }
            final int i2 = 0;
            j1.k.b(z, (u00.a) objN7, a0Var, rVarD, (b2.d) null, v1.d.d(-584002163, new u00.o() {
                @Override
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    float fC;
                    float fC2;
                    float fC3;
                    int i3 = i2;
                    h0.r PullToRefreshBox = (h0.r) obj3;
                    g0 g0Var2 = (l1.j) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    switch (i3) {
                        case 0:
                            kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= g0Var2.g(PullToRefreshBox) ? 4 : 2;
                            }
                            g0 g0Var3 = g0Var2;
                            if (g0Var3.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                                j1.h hVar = j1.h.a;
                                b2.r rVarA = PullToRefreshBox.a(b2.o.A, b2.b.B);
                                boolean z2 = ((p) z0VarQ.getValue()).b;
                                int iOrdinal = aVar.ordinal();
                                t0 t0Var = t0VarL;
                                if (iOrdinal == 0) {
                                    fC = j1.h.d + t0Var.c();
                                } else {
                                    if (iOrdinal != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fC = n1Var.c() + t0Var.c() + j1.h.d;
                                }
                                hVar.a(rVarD, z2, rVarA, 0L, 0L, fC, g0Var2, 0, 24);
                            } else {
                                g0Var3.V();
                            }
                            return b0.a;
                        case 1:
                            kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= g0Var2.g(PullToRefreshBox) ? 4 : 2;
                            }
                            g0 g0Var4 = g0Var2;
                            if (g0Var4.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                                j1.h hVar2 = j1.h.a;
                                b2.r rVarA2 = PullToRefreshBox.a(b2.o.A, b2.b.B);
                                boolean z3 = ((g1) z0VarQ.getValue()).w;
                                int iOrdinal2 = aVar.ordinal();
                                t0 t0Var2 = t0VarL;
                                if (iOrdinal2 == 0) {
                                    fC2 = j1.h.d + t0Var2.c();
                                } else {
                                    if (iOrdinal2 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fC2 = n1Var.c() + t0Var2.c() + j1.h.d;
                                }
                                hVar2.a(rVarD, z3, rVarA2, 0L, 0L, fC2, g0Var2, 0, 24);
                            } else {
                                g0Var4.V();
                            }
                            return b0.a;
                        default:
                            kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= g0Var2.g(PullToRefreshBox) ? 4 : 2;
                            }
                            g0 g0Var5 = g0Var2;
                            if (g0Var5.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                                j1.h hVar3 = j1.h.a;
                                b2.r rVarA3 = PullToRefreshBox.a(b2.o.A, b2.b.B);
                                boolean z4 = ((hw.f) z0VarQ.getValue()).c;
                                int iOrdinal3 = aVar.ordinal();
                                t0 t0Var3 = t0VarL;
                                if (iOrdinal3 == 0) {
                                    fC3 = j1.h.d + t0Var3.c();
                                } else {
                                    if (iOrdinal3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fC3 = n1Var.c() + t0Var3.c() + j1.h.d;
                                }
                                hVar3.a(rVarD, z4, rVarA3, 0L, 0L, fC3, g0Var2, 0, 24);
                            } else {
                                g0Var5.V();
                            }
                            return b0.a;
                    }
                }
            }, g0Var), v1.d.d(215572366, new o(cVarD, vVarA, sVar, z0VarQ, 0), g0Var), g0Var, 1769856);
            b2.i iVar2 = b2.b.B;
            h0.s sVar2 = h0.s.a;
            b2.o oVar = b2.o.A;
            sm.a.a(z3.U(g0Var, 2131887244), ((Number) p2VarB.getValue()).floatValue(), sVar2.a(oVar, iVar2), 0.0f, g0Var, 0);
            b2.r rVarA = sVar2.a(h0.c.M(h0.c.E(oVar, 16, 0.0f, 2), h0.c.e), iVar);
            p0.e eVar = p0.f.a;
            float f = 0;
            float f2 = 44;
            long jB = t.b(0.5f, dl.a.P);
            boolean zG8 = g0Var.g(sVar);
            Object objN8 = g0Var.N();
            if (zG8 || objN8 == obj2) {
                objN8 = new m(sVar, 2);
                g0Var.n0(objN8);
            }
            w50.c.f((u00.a) objN8, cVarD, rVarA, false, false, 0.0f, new y3.f(f2), 0L, jB, 10.0f, eVar, f, a, g0Var, 806879232, 432, 184);
            g0Var.r(true);
            boolean z2 = ((p) z0VarQ.getValue()).f;
            String strU = z3.U(g0Var, 2131887236);
            boolean z3 = ((p) z0VarQ.getValue()).h;
            boolean zG9 = g0Var.g(sVar);
            Object objN9 = g0Var.N();
            if (zG9) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objN9 == obj) {
                }
                u00.a aVar3 = (u00.a) objN9;
                zG = g0Var.g(sVar);
                objN = g0Var.N();
                if (zG || objN == obj) {
                    objN = new m(sVar, 4);
                    g0Var.n0(objN);
                }
                cz.a.l(z2, strU, z3, aVar3, (u00.a) objN, g0Var, 0);
                g0Var = g0Var;
                boolean z4 = ((p) z0VarQ.getValue()).g;
                boolean z5 = ((p) z0VarQ.getValue()).h;
                zG2 = g0Var.g(sVar);
                objN2 = g0Var.N();
                if (zG2 || objN2 == obj) {
                    objN2 = new m(sVar, 5);
                    g0Var.n0(objN2);
                }
                u00.a aVar4 = (u00.a) objN2;
                zG3 = g0Var.g(sVar);
                objN3 = g0Var.N();
                if (zG3 || objN3 == obj) {
                    objN3 = new m(sVar, 6);
                    g0Var.n0(objN3);
                }
                cz.a.k(z4, z5, aVar4, (u00.a) objN3, g0Var, 0);
                zG4 = g0Var.g(sVar);
                objN4 = g0Var.N();
                if (zG4 || objN4 == obj) {
                    objN4 = new m(sVar, 7);
                    g0Var.n0(objN4);
                }
                u00.a aVar5 = (u00.a) objN4;
                zG5 = g0Var.g(aVar2) | g0Var.g(sVar);
                objN5 = g0Var.N();
                if (zG5 || objN5 == obj) {
                    objN5 = new o1(aVar2, sVar, 5);
                    g0Var.n0(objN5);
                }
                cz.a.d(aVar2, aVar5, (u00.a) objN5, g0Var, 0);
            }
            objN9 = new m(sVar, 3);
            g0Var.n0(objN9);
            u00.a aVar6 = (u00.a) objN9;
            zG = g0Var.g(sVar);
            objN = g0Var.N();
            if (zG) {
                objN = new m(sVar, 4);
                g0Var.n0(objN);
            } else {
                objN = new m(sVar, 4);
                g0Var.n0(objN);
            }
            cz.a.l(z2, strU, z3, aVar6, (u00.a) objN, g0Var, 0);
            g0Var = g0Var;
            boolean z6 = ((p) z0VarQ.getValue()).g;
            boolean z7 = ((p) z0VarQ.getValue()).h;
            zG2 = g0Var.g(sVar);
            objN2 = g0Var.N();
            if (zG2) {
                objN2 = new m(sVar, 5);
                g0Var.n0(objN2);
            } else {
                objN2 = new m(sVar, 5);
                g0Var.n0(objN2);
            }
            u00.a aVar7 = (u00.a) objN2;
            zG3 = g0Var.g(sVar);
            objN3 = g0Var.N();
            if (zG3) {
                objN3 = new m(sVar, 6);
                g0Var.n0(objN3);
            } else {
                objN3 = new m(sVar, 6);
                g0Var.n0(objN3);
            }
            cz.a.k(z6, z7, aVar7, (u00.a) objN3, g0Var, 0);
            zG4 = g0Var.g(sVar);
            objN4 = g0Var.N();
            if (zG4) {
                objN4 = new m(sVar, 7);
                g0Var.n0(objN4);
            } else {
                objN4 = new m(sVar, 7);
                g0Var.n0(objN4);
            }
            u00.a aVar8 = (u00.a) objN4;
            zG5 = g0Var.g(aVar2) | g0Var.g(sVar);
            objN5 = g0Var.N();
            if (zG5) {
                objN5 = new o1(aVar2, sVar, 5);
                g0Var.n0(objN5);
            } else {
                objN5 = new o1(aVar2, sVar, 5);
                g0Var.n0(objN5);
            }
            cz.a.d(aVar2, aVar8, (u00.a) objN5, g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bw.c(i);
        }
    }
}
