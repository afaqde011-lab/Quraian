package ds;

import a40.g1;
import android.content.Context;
import androidx.lifecycle.f1;
import as.d0;
import b2.r;
import c3.o0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g1.z6;
import h0.m2;
import h0.n1;
import h0.o;
import h0.s;
import h0.t0;
import h0.u;
import h0.z1;
import i2.t;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import l1.z0;
import m3.r0;
import qd.s0;
import x.q1;
import x.v;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new al.c(19), 1473378177, false);

    public static final void a(l1.j jVar, int i) {
        float fC;
        ?? r11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-39117229);
        final int i2 = 1;
        if (g0Var.S(i & 1, i != 0)) {
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t6.b bVarZ = bi.b.z(f1VarA);
            e60.a aVarA = q50.c.a(g0Var);
            b0 b0Var = a0.a;
            final n nVar = (n) c7.i.S(b0Var.b(n.class), f1VarA.getViewModelStore(), (String) null, bVarZ, aVarA, (u00.a) null);
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(b0Var, rr.b.class, aVarA2, (b60.a) null, g0Var);
            }
            rr.b bVar = (rr.b) objN;
            u00.a aVarA3 = cq.l.a(g0Var);
            z0 z0VarQ = k00.f.q(nVar.c.d, g0Var, 0);
            kk.c cVarD = kk.e.d(g0Var);
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            Context context = (Context) g0Var.k(o0.b);
            boolean zE = g0Var.e(aVar.ordinal()) | g0Var.g(n1Var);
            Object objN2 = g0Var.N();
            if (zE || objN2 == cVar) {
                float fC2 = n1Var.c();
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    fC = 0;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float f = 44;
                    if (y3.f.a(f, fC2) > 0) {
                        fC2 = f;
                    }
                    fC = t0VarL.c() + fC2 + 16;
                }
                objN2 = oi.k.t(fC, g0Var);
            }
            float f2 = ((y3.f) objN2).A;
            boolean zG2 = g0Var.g(n1Var) | g0Var.g(t0VarL);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == cVar) {
                objN3 = oi.k.t(t0VarL.a() + n1Var.a() + 4, g0Var);
            }
            float f3 = ((y3.f) objN3).A;
            boolean zG3 = g0Var.g(nVar);
            Object objN4 = g0Var.N();
            if (zG3 || objN4 == cVar) {
                r11 = 0;
                final Object[] objArr = 0 == true ? 1 : 0;
                objN4 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i3 = objArr;
                        n nVar2 = nVar;
                        switch (i3) {
                            case 0:
                                nVar2.j(c.a);
                                break;
                            default:
                                nVar2.j(c.a);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN4);
            } else {
                r11 = 0;
            }
            s0.E((boolean) r11, (u00.a) objN4, g0Var, (int) r11, 1);
            boolean zG4 = g0Var.g(nVar) | g0Var.i(bVar) | g0Var.g(aVarA3) | g0Var.i(context);
            Object objN5 = g0Var.N();
            if (zG4 || objN5 == cVar) {
                objN5 = new a1.g(nVar, bVar, aVarA3, context, (k00.c) null, 21);
                nVar = nVar;
                g0Var.n0(objN5);
            }
            q.i(g00.b0.a, g0Var, (u00.n) objN5);
            r rVarF = z.n.f(z1.c, dl.a.L, i2.b0.b);
            w0 w0VarD = o.d(b2.b.E, false);
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
            q.I(w0VarD, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            b2.o oVar = b2.o.A;
            r rVarG = h0.c.G(kk.e.a(oVar, cVarD), 0.0f, f2, 0.0f, f3, 5);
            m mVar = (m) z0VarQ.getValue();
            boolean zG5 = g0Var.g(nVar);
            Object objN6 = g0Var.N();
            if (zG5 || objN6 == cVar) {
                g1 g1Var = new g1(1, nVar, n.class, "action", "action(Lcom/mchutov/quranify/home/presentation/screen/timer/ListeningTimerAction;)V", 0, 22);
                g0Var.n0(g1Var);
                objN6 = g1Var;
            }
            b(mVar, (u00.k) ((a10.g) objN6), rVarG, g0Var, 8);
            r rVarA = s.a.a(h0.c.M(h0.c.E(oVar, 16, 0.0f, 2), h0.c.e), b2.b.A);
            p0.e eVar = p0.f.a;
            float f4 = 0;
            float f5 = 44;
            long jB = t.b(0.5f, dl.a.P);
            boolean zG6 = g0Var.g(nVar);
            Object objN7 = g0Var.N();
            if (zG6 || objN7 == cVar) {
                objN7 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i3 = i2;
                        n nVar2 = nVar;
                        switch (i3) {
                            case 0:
                                nVar2.j(c.a);
                                break;
                            default:
                                nVar2.j(c.a);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN7);
            }
            w50.c.f((u00.a) objN7, cVarD, rVarA, false, false, 0.0f, new y3.f(f5), 0L, jB, 10.0f, eVar, f4, a, g0Var, 806879232, 432, 184);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dm.a(i, 15);
        }
    }

    public static final void b(m mVar, u00.k kVar, r rVar, l1.j jVar, int i) {
        m mVar2;
        g0 g0Var;
        float fX;
        Object objValueOf;
        String strY;
        l1.c cVar;
        ?? r9;
        r rVarD;
        boolean z;
        l1.c cVar2;
        r rVar2;
        float f;
        int i2;
        boolean z2;
        int i3;
        r rVar3;
        r rVarD2;
        u00.k kVar2;
        long j;
        boolean z3;
        String strL;
        b2.i iVar = b2.b.H;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-275180726);
        int i4 = i | (g0Var2.i(mVar) ? 4 : 2) | (g0Var2.i(kVar) ? 32 : 16) | (g0Var2.g(rVar) ? 256 : 128);
        if (g0Var2.S(i4 & 1, (i4 & 147) != 146)) {
            gm.a aVar = (gm.a) g0Var2.k(dl.e.a);
            mr.g gVar = mVar.a;
            boolean zG = g0Var2.g(gVar);
            Object objN = g0Var2.N();
            l1.c cVar3 = l1.i.a;
            if (zG || objN == cVar3) {
                if (gVar instanceof mr.f) {
                    mr.f fVar = (mr.f) gVar;
                    fX = ab.a0.x(fVar.a / fVar.b, 0.0f, 1.0f);
                } else if (gVar instanceof mr.e) {
                    fX = 0.0f;
                } else {
                    if (!(gVar instanceof mr.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fX = 1.0f;
                }
                objValueOf = Float.valueOf(fX);
                g0Var2.n0(objValueOf);
            } else {
                objValueOf = objN;
            }
            float fFloatValue = ((Number) objValueOf).floatValue();
            boolean zG2 = g0Var2.g(gVar);
            Object objN2 = g0Var2.N();
            if (zG2 || objN2 == cVar3) {
                objN2 = Boolean.valueOf(gVar instanceof mr.d);
                g0Var2.n0(objN2);
            }
            boolean zBooleanValue = ((Boolean) objN2).booleanValue();
            boolean zG3 = g0Var2.g(gVar);
            Object objN3 = g0Var2.N();
            String strL2 = "";
            if (zG3 || objN3 == cVar3) {
                if (gVar instanceof mr.f) {
                    strY = f50.c.y(((mr.f) gVar).a);
                } else {
                    if (gVar instanceof mr.e) {
                        strY = "0:00";
                    } else {
                        objN3 = "";
                    }
                    g0Var2.n0(objN3);
                }
                objN3 = strY;
                g0Var2.n0(objN3);
            }
            String str = (String) objN3;
            if (gVar instanceof mr.f) {
                g0Var2.c0(1839329929);
                mr.f fVar2 = (mr.f) gVar;
                cVar = cVar3;
                long j2 = ((long) fVar2.b) - fVar2.a;
                if (j2 < 0) {
                    j2 = 0;
                    j = 0;
                } else {
                    j = 0;
                }
                int i5 = (int) (j2 / ((long) 60));
                if (i5 != 0 || j2 <= j) {
                    z3 = false;
                    g0Var2.c0(115246819);
                    strL = z3.L(2131755015, i5, new Object[]{Integer.valueOf(i5)}, g0Var2);
                    g0Var2.r(false);
                } else {
                    z3 = false;
                    strL = oi.k.o(g0Var2, 115175023, 2131887346, g0Var2, false);
                }
                strL2 = z3.T(2131887348, new Object[]{strL}, g0Var2);
                g0Var2.r(z3);
                r9 = z3;
            } else {
                cVar = cVar3;
                if (gVar instanceof mr.d) {
                    g0Var2.c0(1184730019);
                    int i6 = ((mr.d) gVar).a / 60;
                    strL2 = z3.L(2131755015, i6, new Object[]{Integer.valueOf(i6)}, g0Var2);
                    r9 = 0;
                    g0Var2.r(false);
                } else {
                    r9 = 0;
                    if (!(gVar instanceof mr.e)) {
                        throw oi.k.r(g0Var2, 1839327761, false);
                    }
                    g0Var2.c0(1839337551);
                    g0Var2.r(false);
                }
            }
            String str2 = strL2;
            q1 q1VarW = x.c.w(200, (int) r9, (v) null, 6);
            ?? r13 = r9;
            g0 g0Var3 = g0Var2;
            p2 p2VarB = x.d.b(fFloatValue, q1VarW, (String) null, g0Var3, 48, 28);
            r rVarV = rVar.V(z1.c);
            w0 w0VarD = o.d(b2.b.A, (boolean) r13);
            int iHashCode = Long.hashCode(g0Var3.T);
            m1 m1VarM = g0Var3.m();
            r rVarC = b2.a.c(rVarV, g0Var3);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar2);
            } else {
                g0Var3.q0();
            }
            b3.f fVar3 = b3.h.f;
            q.I(w0VarD, g0Var3, fVar3);
            b3.f fVar4 = b3.h.e;
            q.I(m1VarM, g0Var3, fVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar5 = b3.h.g;
            q.I(numValueOf, g0Var3, fVar5);
            b3.e eVar = b3.h.h;
            q.E(g0Var3, eVar);
            b3.f fVar6 = b3.h.d;
            q.I(rVarC, g0Var3, fVar6);
            r rVar4 = b2.o.A;
            r rVarD3 = z1.d(rVar4, 1.0f);
            b2.i iVar2 = b2.b.E;
            s sVar = s.a;
            float f2 = 16;
            r rVarE = h0.c.E(sVar.a(rVarD3, iVar2), f2, 0.0f, 2);
            b2.g gVar3 = b2.b.N;
            h0.v vVarA = u.a(h0.i.g(40), gVar3, g0Var3, 54);
            int iHashCode2 = Long.hashCode(g0Var3.T);
            m1 m1VarM2 = g0Var3.m();
            r rVarC2 = b2.a.c(rVarE, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar2);
            } else {
                g0Var3.q0();
            }
            q.I(vVarA, g0Var3, fVar3);
            q.I(m1VarM2, g0Var3, fVar4);
            a1.b.v(iHashCode2, g0Var3, fVar5, g0Var3, eVar);
            q.I(rVarC2, g0Var3, fVar6);
            if (zBooleanValue) {
                g0Var3.c0(-635185765);
                rVar3 = null;
                i3 = 0;
                es.a.a(0.0f, 0, null, g0Var3);
                g0Var3.r(false);
                rVar2 = rVar4;
                z = zBooleanValue;
                cVar2 = cVar;
                f = f2;
                z2 = true;
            } else {
                g0Var3.c0(-635057022);
                r rVarE2 = h0.c.E(rVar4, f2, 0.0f, 2);
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    rVarD = z1.d(rVar4, 1.0f);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVarD = z1.q(rVar4, 500);
                }
                r rVarV2 = rVarE2.V(rVarD);
                w0 w0VarD2 = o.d(iVar, false);
                int iHashCode3 = Long.hashCode(g0Var3.T);
                m1 m1VarM3 = g0Var3.m();
                r rVarC3 = b2.a.c(rVarV2, g0Var3);
                g0Var3.g0();
                if (g0Var3.S) {
                    g0Var3.l(gVar2);
                } else {
                    g0Var3.q0();
                }
                q.I(w0VarD2, g0Var3, fVar3);
                q.I(m1VarM3, g0Var3, fVar4);
                a1.b.v(iHashCode3, g0Var3, fVar5, g0Var3, eVar);
                q.I(rVarC3, g0Var3, fVar6);
                r rVarD4 = z1.d(rVar4, 1.0f);
                h0.v vVarA2 = u.a(h0.i.g(4), gVar3, g0Var3, 54);
                int iHashCode4 = Long.hashCode(g0Var3.T);
                m1 m1VarM4 = g0Var3.m();
                r rVarC4 = b2.a.c(rVarD4, g0Var3);
                g0Var3.g0();
                if (g0Var3.S) {
                    g0Var3.l(gVar2);
                } else {
                    g0Var3.q0();
                }
                q.I(vVarA2, g0Var3, fVar3);
                q.I(m1VarM4, g0Var3, fVar4);
                a1.b.v(iHashCode4, g0Var3, fVar5, g0Var3, eVar);
                q.I(rVarC4, g0Var3, fVar6);
                z = zBooleanValue;
                cVar2 = cVar;
                rVar2 = rVar4;
                z6.b(str, (r) null, dl.a.n, kh.o.z(62), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(62), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var3, 1597440, 25008, 239530);
                z6.b(z3.T(2131887347, new Object[]{Integer.valueOf(mVar.b)}, g0Var3), (r) null, t.b(0.7f, dl.a.k), kh.o.z(16), q3.u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(16), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var3, 1597440, 25008, 239530);
                g0Var3.r(true);
                f = f2;
                r rVarE3 = h0.c.E(rVar2, f, 0.0f, 2);
                int iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 20;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 30;
                }
                float f3 = i2;
                boolean zG4 = g0Var3.g(p2VarB);
                Object objN4 = g0Var3.N();
                if (zG4 || objN4 == cVar2) {
                    objN4 = new l(p2VarB, 0);
                    g0Var3.n0(objN4);
                }
                c7.i.g((u00.a) objN4, rVarE3, (i2.q) null, 0L, f3, 0, g0Var3, 48);
                g0Var3 = g0Var3;
                z2 = true;
                g0Var3.r(true);
                i3 = 0;
                g0Var3.r(false);
                rVar3 = null;
            }
            ca.v.k(i3, rVar3, str2, g0Var3, z);
            g0Var3.r(z2);
            int iOrdinal3 = aVar.ordinal();
            if (iOrdinal3 == 0) {
                rVarD2 = z1.d(rVar2, 1.0f);
            } else {
                if (iOrdinal3 != z2) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarD2 = z1.q(rVar2, RCHTTPStatusCodes.BAD_REQUEST);
            }
            r rVarD5 = h0.c.D(sVar.a(rVarD2, iVar), f, f);
            int i7 = i4 & 112;
            int i8 = i7 == 32 ? 1 : i3;
            Object objN5 = g0Var3.N();
            if (i8 != 0 || objN5 == cVar2) {
                kVar2 = kVar;
                objN5 = new bt.t0(15, kVar2);
                g0Var3.n0(objN5);
            } else {
                kVar2 = kVar;
            }
            u00.a aVar2 = (u00.a) objN5;
            int i9 = i7 == 32 ? 1 : i3;
            Object objN6 = g0Var3.N();
            if (i9 != 0 || objN6 == cVar2) {
                objN6 = new bt.t0(16, kVar2);
                g0Var3.n0(objN6);
            }
            y3.i(aVar2, (u00.a) objN6, rVarD5, g0Var3, i3);
            String strU = z3.U(g0Var3, 2131887343);
            String strU2 = z3.U(g0Var3, 2131887341);
            String strU3 = z3.U(g0Var3, 2131887342);
            mVar2 = mVar;
            boolean z4 = mVar2.c;
            int i11 = mVar2.b;
            boolean z5 = mVar2.d;
            int i12 = i7 == 32 ? 1 : i3;
            Object objN7 = g0Var3.N();
            if (i12 != 0 || objN7 == cVar2) {
                objN7 = new bt.t0(17, kVar2);
                g0Var3.n0(objN7);
            }
            u00.a aVar3 = (u00.a) objN7;
            if (i7 == 32) {
                i3 = 1;
            }
            Object objN8 = g0Var3.N();
            if (i3 != 0 || objN8 == cVar2) {
                objN8 = new d0(10, kVar2);
                g0Var3.n0(objN8);
            }
            g0 g0Var4 = g0Var3;
            el.a.a(z4, i11, strU, strU3, strU2, aVar3, null, 0, 0.0f, 0, 0.0f, 0L, 0L, false, false, null, (u00.k) objN8, z5, false, g0Var4, 0, 100663296, 65472);
            g0Var = g0Var4;
            g0Var.r(true);
        } else {
            mVar2 = mVar;
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 4, mVar2, kVar, rVar);
        }
    }
}
