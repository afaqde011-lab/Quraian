package xy;

import a40.z;
import android.content.Context;
import androidx.lifecycle.f1;
import androidx.lifecycle.n0;
import b2.r;
import c3.g1;
import c3.o0;
import c3.o1;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import gz.e1;
import h0.m2;
import h0.n1;
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
import q0.f2;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new pz.m(20), 227481590, false);
    public static final v1.c b = new v1.c(new pz.m(21), -1952442600, false);

    public static final void a(v vVar, n nVar, u00.k kVar, r rVar, l1.j jVar, int i) {
        float f;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1841762637);
        int i2 = i | (g0Var.g(vVar) ? 4 : 2) | (g0Var.g(nVar) ? 32 : 16) | (g0Var.i(kVar) ? 256 : 128) | (g0Var.g(rVar) ? 2048 : 1024);
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
                    objN = h0.c.g(0.0f, t0VarL.c() + n1Var.c() + 44 + 16, 0.0f, fA, 5);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objN = h0.c.g(0.0f, t0VarL.c() + n1Var.c() + 20, 0.0f, fA, 5);
                }
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
            int i3 = i2 & 896;
            boolean z = ((i2 & 112) == 32) | (i3 == 256);
            Object objN2 = g0Var.N();
            if (z || objN2 == cVar) {
                objN2 = new q((Object) nVar, kVar, 29);
                g0Var.n0(objN2);
            }
            k00.f.d(rVarE, vVar, n1Var2, fVarG, null, null, false, null, (u00.k) objN2, g0Var, ((i2 << 3) & 112) | 24576, 488);
            boolean z2 = nVar.f;
            boolean z3 = i3 == 256;
            Object objN3 = g0Var.N();
            if (z3 || objN3 == cVar) {
                objN3 = new wy.l(3, kVar);
                g0Var.n0(objN3);
            }
            u00.a aVar2 = (u00.a) objN3;
            boolean z4 = i3 == 256;
            Object objN4 = g0Var.N();
            if (z4 || objN4 == cVar) {
                objN4 = new wy.l(4, kVar);
                g0Var.n0(objN4);
            }
            u00.a aVar3 = (u00.a) objN4;
            boolean z5 = i3 == 256;
            Object objN5 = g0Var.N();
            if (z5 || objN5 == cVar) {
                objN5 = new wy.l(5, kVar);
                g0Var.n0(objN5);
            }
            yy.a.a(z2, aVar2, aVar3, (u00.a) objN5, g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k(vVar, nVar, kVar, rVar, i, 20);
        }
    }

    public static final void b(l1.j jVar, int i) {
        Object obj;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1845762404);
        if (g0Var.S(i & 1, i != 0)) {
            u00.a aVarA = cq.l.a(g0Var);
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            o oVar = (o) c7.i.S(a0.a.b(o.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(g0Var), (u00.a) null);
            z0 z0VarQ = k00.f.q(oVar.c.d, g0Var, 0);
            kk.c cVarD = kk.e.d(g0Var);
            v vVarA = x.a(0, g0Var, 3);
            p2 p2VarB = sm.a.b(vVarA, g0Var);
            Context context = (Context) g0Var.k(o0.b);
            ol.b bVar = (ol.b) g0Var.k(ol.a.a);
            g1 g1Var = (g1) g0Var.k(o1.f);
            Object objN = g0Var.N();
            Object obj2 = l1.i.a;
            if (objN == obj2) {
                objN = l1.q.o(g0Var);
                g0Var.n0(objN);
            }
            z zVar = (z) objN;
            boolean zG = g0Var.g(oVar) | g0Var.g(aVarA) | g0Var.g(bVar) | g0Var.i(zVar) | g0Var.i(g1Var) | g0Var.i(context);
            Object objN2 = g0Var.N();
            if (zG || objN2 == obj2) {
                obj = obj2;
                n0 n0Var = new n0(oVar, aVarA, bVar, zVar, g1Var, context, (k00.c) null);
                oVar = oVar;
                g0Var.n0(n0Var);
                objN2 = n0Var;
            } else {
                obj = obj2;
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN2);
            r rVarF = z.n.f(z1.c, dl.a.L, i2.b0.b);
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
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
            n nVar = (n) z0VarQ.getValue();
            b2.o oVar2 = b2.o.A;
            r rVarA = kk.e.a(oVar2, cVarD);
            boolean zG2 = g0Var.g(oVar);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == obj) {
                objN3 = new e1(1, oVar, o.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/debug/DebugControlsAction;)V", 0, 26);
                g0Var.n0(objN3);
            }
            Object obj3 = obj;
            a(vVarA, nVar, (u00.k) ((a10.g) objN3), rVarA, g0Var, 0);
            b2.i iVar2 = b2.b.B;
            s sVar = s.a;
            sm.a.a(z3.U(g0Var, 2131886397), ((Number) p2VarB.getValue()).floatValue(), sVar.a(oVar2, iVar2), 0.0f, g0Var, 0);
            r rVarA2 = sVar.a(h0.c.M(h0.c.E(oVar2, 16, 0.0f, 2), h0.c.e), iVar);
            p0.e eVar = p0.f.a;
            float f = 0;
            float f2 = 44;
            long jB = t.b(0.5f, dl.a.P);
            boolean zG3 = g0Var.g(oVar);
            Object objN4 = g0Var.N();
            if (zG3 || objN4 == obj3) {
                objN4 = new f2(oVar, 20);
                g0Var.n0(objN4);
            }
            w50.c.f((u00.a) objN4, cVarD, rVarA2, false, false, 0.0f, new y3.f(f2), 0L, jB, 10.0f, eVar, f, a, g0Var, 806879232, 432, 184);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new wy.k(i, 14);
        }
    }
}
