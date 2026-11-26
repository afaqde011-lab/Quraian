package dz;

import a1.z;
import a40.g1;
import androidx.lifecycle.f1;
import com.google.android.gms.internal.measurement.z3;
import d0.i2;
import g00.b0;
import h0.m2;
import h0.n1;
import h0.p1;
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
import z2.w0;

public abstract class m {
    public static final float a = 810;
    public static final float b = 32;
    public static final float c = 16;

    public static final void a(v vVar, n nVar, u00.k kVar, b2.r rVar, l1.j jVar, int i) {
        p1 p1VarG;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1604045607);
        int i2 = i | (g0Var.g(vVar) ? 4 : 2) | (g0Var.g(nVar) ? 32 : 16) | (g0Var.i(kVar) ? 256 : 128) | (g0Var.g(rVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            gm.a aVar2 = gm.a.B;
            b2.o oVar = b2.o.A;
            b2.r rVarD = aVar == aVar2 ? z1.d(z1.s(h0.c.E(oVar, b, 0.0f, 2), 0.0f, a, 1), 1.0f) : z1.d(h0.c.E(oVar, c, 0.0f, 2), 1.0f);
            boolean zE = g0Var.e(aVar.ordinal()) | g0Var.g(n1Var) | g0Var.g(t0VarL);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zE || objN == cVar) {
                float fA = t0VarL.a() + n1Var.a() + 80;
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
            b2.r rVarV = rVar.V(z1.c);
            b2.g gVar = b2.b.N;
            h0.f fVarG = h0.i.g(8);
            boolean zG = g0Var.g(rVarD) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objN2 = g0Var.N();
            if (zG || objN2 == cVar) {
                objN2 = new b1.l(rVarD, nVar, kVar, 5);
                g0Var.n0(objN2);
            }
            k00.f.d(rVarV, vVar, n1Var2, fVarG, gVar, null, false, null, (u00.k) objN2, g0Var, ((i2 << 3) & 112) | 221184, 456);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new k(vVar, nVar, kVar, rVar, i, 0);
        }
    }

    public static final void b(l1.j jVar, int i) {
        l1.c cVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-951882762);
        if (g0Var.S(i & 1, i != 0)) {
            u00.a aVarA = cq.l.a(g0Var);
            f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            s sVar = (s) c7.i.S(a0.a.b(s.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(g0Var), (u00.a) null);
            z0 z0VarQ = k00.f.q(sVar.c.d, g0Var, 0);
            kk.c cVarD = kk.e.d(g0Var);
            v vVarA = x.a(0, g0Var, 3);
            p2 p2VarB = sm.a.b(vVarA, g0Var);
            String strU = z3.U(g0Var, 2131886416);
            boolean zG = g0Var.g(sVar) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar2 = l1.i.a;
            if (zG || objN == cVar2) {
                objN = new i2(sVar, aVarA, (k00.c) null, 12);
                g0Var.n0(objN);
            }
            l1.q.i(b0.a, g0Var, (u00.n) objN);
            b2.r rVarF = z.n.f(z1.c, dl.a.L, i2.b0.b);
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
            b2.o oVar = b2.o.A;
            b2.r rVarA = kk.e.a(oVar, cVarD);
            n nVar = (n) z0VarQ.getValue();
            boolean zG2 = g0Var.g(sVar);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar2) {
                cVar = cVar2;
                g1 g1Var = new g1(1, sVar, s.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/downloadmanager/DownloadManagerAction;)V", 0, 23);
                g0Var.n0(g1Var);
                objN2 = g1Var;
            } else {
                cVar = cVar2;
            }
            a(vVarA, nVar, (u00.k) ((a10.g) objN2), rVarA, g0Var, 0);
            b2.i iVar2 = b2.b.B;
            h0.s sVar2 = h0.s.a;
            sm.a.a(strU, ((Number) p2VarB.getValue()).floatValue(), sVar2.a(oVar, iVar2), 0.0f, g0Var, 0);
            b2.r rVarA2 = sVar2.a(h0.c.M(h0.c.E(oVar, 16, 0.0f, 2), h0.c.e), iVar);
            p0.e eVar = p0.f.a;
            float f = 0;
            float f2 = 44;
            long jB = t.b(0.5f, dl.a.P);
            boolean zG3 = g0Var.g(sVar);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                objN3 = new z(sVar, 23);
                g0Var.n0(objN3);
            }
            w50.c.f((u00.a) objN3, cVarD, rVarA2, false, false, 0.0f, new y3.f(f2), 0L, jB, 10.0f, eVar, f, a.a, g0Var, 806879232, 432, 184);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dm.a(i, 17);
        }
    }
}
