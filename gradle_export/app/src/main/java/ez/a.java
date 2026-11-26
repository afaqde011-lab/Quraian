package ez;

import a1.e1;
import a1.z;
import a40.g1;
import androidx.lifecycle.f1;
import androidx.lifecycle.w;
import bt.t0;
import c3.o1;
import c3.t2;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.o3;
import g1.z6;
import h0.c1;
import h0.t1;
import h0.v1;
import h0.z1;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import l1.g0;
import l1.m1;
import l1.p1;
import l1.p2;
import l1.q1;
import l1.r1;
import l1.z0;
import m3.r0;

public abstract class a {
    public static final v1.c a = new v1.c(new dm.a(22), -69976422, false);

    public static final void a(u00.a aVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(403938377);
        int i2 = (g0Var.h(false) ? 4 : 2) | i | (g0Var.i(aVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            long j = dl.a.U;
            b2.r rVarC = h0.c.C(w50.c.n(z.n.f(rVarD, i2.t.b(0.1f, j), p0.f.a(24)), true, aVar), 16);
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            o3.a(y3.R(2131231403, g0Var, 0), (String) null, z1.m(oVar, 20), j, g0Var, 440, 0);
            String strU = z3.U(g0Var, 2131887212);
            long jZ = kh.o.z(15);
            q3.u uVar = q3.u.B;
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(strU, new c1(1.0f, true), j, jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262056);
            g0Var = g0Var;
            g0Var.c0(1300080373);
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.d(aVar, i, 3);
        }
    }

    public static final void b(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(151000297);
        if (g0Var.S(i & 1, i != 0)) {
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t6.b bVarZ = bi.b.z(f1VarA);
            e60.a aVarA = q50.c.a(g0Var);
            b0 b0Var = a0.a;
            u uVar = (u) c7.i.S(b0Var.b(u.class), f1VarA.getViewModelStore(), (String) null, bVarZ, aVarA, (u00.a) null);
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(b0Var, sy.c.class, aVarA2, (b60.a) null, g0Var);
            }
            sy.c cVar2 = (sy.c) objN;
            u00.a aVarA3 = cq.l.a(g0Var);
            z0 z0VarQ = k00.f.q(uVar.c.d, g0Var, 0);
            ol.b bVar = (ol.b) g0Var.k(ol.a.a);
            boolean zBooleanValue = ((Boolean) g0Var.k(tp.h.a)).booleanValue();
            hp.a aVar = (hp.a) g0Var.k(tp.h.b);
            boolean zG2 = g0Var.g(uVar) | g0Var.h(zBooleanValue) | g0Var.i(aVar) | g0Var.g(aVarA3) | g0Var.g(bVar) | g0Var.i(cVar2);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                q qVar = new q(uVar, zBooleanValue, aVar, aVarA3, bVar, cVar2, null);
                g0Var.n0(qVar);
                objN2 = qVar;
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN2);
            t tVar = (t) z0VarQ.getValue();
            boolean zG3 = g0Var.g(uVar);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                g1 g1Var = new g1(1, uVar, u.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/editdetails/EditDetailsAction;)V", 0, 24);
                g0Var.n0(g1Var);
                objN3 = g1Var;
            }
            c(tVar, (u00.k) ((a10.g) objN3), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dm.a(i, 23);
        }
    }

    public static final void c(t tVar, u00.k kVar, l1.j jVar, int i) {
        u00.k kVar2;
        Integer num;
        t tVar2 = tVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1373316932);
        int i2 = (g0Var.g(tVar2) ? 4 : 2) | i | (g0Var.i(kVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            xk.d dVarR = c7.i.R(g0Var);
            q2.a aVar = (q2.a) g0Var.k(o1.l);
            t2 t2Var = (t2) g0Var.k(o1.q);
            boolean zBooleanValue = ((Boolean) g0Var.k(tp.h.a)).booleanValue();
            String str = tVar2.c;
            boolean z = tVar2.g;
            String str2 = tVar2.a;
            String str3 = tVar2.b;
            ep.f fVar = tVar2.e;
            boolean zG = g0Var.g(str2) | g0Var.g(str3) | g0Var.e(fVar == null ? -1 : fVar.ordinal()) | g0Var.g(tVar2.f) | g0Var.h(z);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zG || objN == obj) {
                objN = l1.q.r(new z(tVar2, 28));
                g0Var.n0(objN);
            }
            p2 p2Var = (p2) objN;
            Integer numValueOf = Integer.valueOf(tVar2.d);
            boolean zI = ((i2 & 14) == 4) | g0Var.i(aVar) | g0Var.i(dVarR);
            Object objN2 = g0Var.N();
            if (zI || objN2 == obj) {
                num = numValueOf;
                ev.p pVar = new ev.p(tVar2, aVar, dVarR, null, 1);
                g0Var.n0(pVar);
                objN2 = pVar;
            } else {
                num = numValueOf;
            }
            l1.q.i(num, g0Var, (u00.n) objN2);
            String strU = z3.U(g0Var, 2131887247);
            boolean zBooleanValue2 = ((Boolean) p2Var.getValue()).booleanValue();
            int i3 = i2 & 112;
            boolean zG2 = g0Var.g(t2Var) | (i3 == 32);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == obj) {
                objN3 = new m(t2Var, kVar, 0);
                g0Var.n0(objN3);
            }
            ip.a aVar2 = new ip.a(strU, zBooleanValue2, z, (u00.a) objN3);
            b2.r rVarV = c7.i.V(b2.o.A, dVarR, g0Var);
            boolean z2 = i3 == 32;
            Object objN4 = g0Var.N();
            if (z2 || objN4 == obj) {
                objN4 = new t0(27, kVar);
                g0Var.n0(objN4);
            }
            u00.a aVar3 = (u00.a) objN4;
            kVar2 = kVar;
            tVar2 = tVar;
            up.f.a(aVar3, null, rVarV, aVar2, false, v1.d.d(1961942616, new n(zBooleanValue, tVar, kVar2, p2Var, t2Var, str, 0), g0Var), g0Var, 196608, 18);
            boolean z3 = tVar2.h;
            boolean z4 = i3 == 32;
            Object objN5 = g0Var.N();
            if (z4 || objN5 == obj) {
                objN5 = new t0(28, kVar2);
                g0Var.n0(objN5);
            }
            u00.a aVar4 = (u00.a) objN5;
            boolean z5 = i3 == 32;
            Object objN6 = g0Var.N();
            if (z5 || objN6 == obj) {
                objN6 = new t0(29, kVar2);
                g0Var.n0(objN6);
            }
            p30.f.H(z3, aVar4, (u00.a) objN6, g0Var, 0);
        } else {
            kVar2 = kVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new al.i(tVar2, kVar2, i, 11);
        }
    }

    public static final void d(u00.a onDismiss, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1254674449);
        int i2 = (g0Var.i(onDismiss) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = new s();
                g0Var.n0(objN);
            }
            s sVar = (s) objN;
            boolean zI = g0Var.i(sVar);
            Object objN2 = g0Var.N();
            if (zI || objN2 == obj) {
                objN2 = new e1(sVar, 16);
                g0Var.n0(objN2);
            }
            l1.q.e(g00.b0.a, (u00.k) objN2, g0Var);
            p1 p1Var = r6.d.a;
            w wVar = (w) g0Var.k(p1Var);
            p1 p1Var2 = ja.a.a;
            ia.g gVar = (ia.g) g0Var.k(p1Var2);
            boolean z = (i2 & 14) == 4;
            Object objN3 = g0Var.N();
            if (z || objN3 == obj) {
                objN3 = new r(onDismiss);
                g0Var.n0(objN3);
            }
            l1.q.b(new q1[]{u6.a.a.a(sVar), p1Var.a(wVar), p1Var2.a(gVar), tp.h.a.a(Boolean.TRUE), tp.h.b.a((r) objN3)}, v1.d.d(961291089, new eu.d(4, onDismiss), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.d(onDismiss, i, 5);
        }
    }
}
