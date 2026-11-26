package kx;

import a1.v2;
import android.content.res.Configuration;
import as.r0;
import c3.o0;
import c3.o1;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g00.b0;
import h0.m2;
import h0.n1;
import h0.p1;
import h0.t0;
import h0.z1;
import i2.t;
import java.util.List;
import java.util.WeakHashMap;
import jx.s;
import k0.y;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.p2;
import l1.q;
import l1.r1;
import w.b2;
import x.q1;
import x.r;
import x.x;
import z.h1;

public abstract class h {
    public static final q1 a;
    public static final q1 b;

    static {
        r rVar = x.a;
        a = x.c.w(RCHTTPStatusCodes.UNSUCCESSFUL, 0, rVar, 2);
        b = x.c.w(RCHTTPStatusCodes.UNSUCCESSFUL, 0, rVar, 2);
    }

    public static final void a(final s uiState, final u00.k onAction, y yVar, b2.r rVar, l1.j jVar, int i) {
        g0 g0Var;
        float fC;
        g0 g0Var2;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        float f = uiState.i;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var3 = (g0) jVar;
        g0Var3.e0(-1004797307);
        int i2 = i | (g0Var3.g(uiState) ? 4 : 2) | (g0Var3.i(onAction) ? 32 : 16) | (g0Var3.g(yVar) ? 256 : 128) | (g0Var3.g(rVar) ? 2048 : 1024);
        if (g0Var3.S(i2 & 1, (i2 & 1171) != 1170)) {
            final gm.a aVar = (gm.a) g0Var3.k(dl.e.a);
            n1 n1Var = (n1) g0Var3.k(dq.l.a);
            final y3.c cVar = (y3.c) g0Var3.k(o1.h);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var3).g, g0Var3);
            boolean zE = g0Var3.e(aVar.ordinal()) | g0Var3.d(f);
            Object objN = g0Var3.N();
            Object obj = l1.i.a;
            if (zE || objN == obj) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    fC = f + t0VarL.c();
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fC = 140;
                }
                objN = oi.k.t(fC, g0Var3);
            }
            float f2 = ((y3.f) objN).A;
            boolean zG = g0Var3.g(n1Var) | g0Var3.g(t0VarL);
            Object objN2 = g0Var3.N();
            if (zG || objN2 == obj) {
                objN2 = oi.k.t(n1Var.a() + t0VarL.a() + 4, g0Var3);
            }
            float f3 = ((y3.f) objN2).A;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objN3 = g0Var3.N();
            if (z || objN3 == obj) {
                objN3 = q.r(new hw.d(yVar, 1));
                g0Var3.n0(objN3);
            }
            final p2 p2Var = (p2) objN3;
            final p2 p2VarA = b2.a(((Boolean) p2Var.getValue()).booleanValue() ? t.f : dl.a.n, (x.y) null, (String) null, g0Var3, 0, 14);
            Configuration configuration = (Configuration) g0Var3.k(o0.a);
            boolean zE2 = g0Var3.e(configuration.screenWidthDp) | g0Var3.e(aVar.ordinal());
            Object objN4 = g0Var3.N();
            if (zE2 || objN4 == obj) {
                float f4 = 12;
                float fA = jx.q.a(aVar) + f4;
                int iMax = fA <= 0.0f ? 1 : Math.max(3, (int) ((configuration.screenWidthDp - 20) / (fA + f4)));
                Integer numValueOf = Integer.valueOf(iMax);
                float fMin = Math.min(((configuration.screenWidthDp - 32) - ((iMax - 1) * 12)) / iMax, jx.q.a(aVar));
                if (fMin < 1.0f) {
                    fMin = 1.0f;
                }
                g00.k kVar = new g00.k(numValueOf, new y3.f(fMin));
                g0Var3.n0(kVar);
                objN4 = kVar;
            }
            g00.k kVar2 = (g00.k) objN4;
            final int iIntValue = ((Number) kVar2.A).intValue();
            final float f5 = ((y3.f) kVar2.B).A;
            final boolean z2 = !r30.k.L0(uiState.f);
            final u30.b bVar = uiState.e;
            b2.r rVarV = rVar.V(z1.c);
            k0.b bVar2 = new k0.b(iIntValue);
            float f6 = 16;
            p1 p1Var = new p1(f6, f2, f6, f3);
            h0.f fVarG = h0.i.g(8);
            h0.f fVarG2 = h0.i.g(12);
            boolean zE3 = g0Var3.e(aVar.ordinal()) | ((i2 & 14) == 4) | g0Var3.g(cVar) | ((i2 & 112) == 32) | g0Var3.g(p2VarA) | g0Var3.g(p2Var) | g0Var3.e(iIntValue) | g0Var3.d(f5) | g0Var3.h(z2) | g0Var3.g(bVar);
            Object objN5 = g0Var3.N();
            if (zE3 || objN5 == obj) {
                g0Var2 = g0Var3;
                objN5 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj2) {
                        u00.k kVar3;
                        k0.i LazyVerticalGrid = (k0.i) obj2;
                        kotlin.jvm.internal.m.e(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        gm.a aVar2 = gm.a.A;
                        gm.a aVar3 = aVar;
                        s sVar = uiState;
                        u00.k kVar4 = onAction;
                        if (aVar3 == aVar2) {
                            k0.i.p(LazyVerticalGrid, (String) null, new ks.e(15), new v1.c(new d(sVar, cVar, kVar4, p2VarA), -18607980, true), 5);
                            if (sVar.b() || (sVar.a && sVar.b)) {
                                k0.i.p(LazyVerticalGrid, (String) null, new ks.e(16), new v1.c(new az.j(11, sVar, p2Var, kVar4), -1155261905, true), 5);
                            }
                        }
                        boolean z3 = sVar.a;
                        float f7 = f5;
                        if (z3) {
                            k0.i.p(LazyVerticalGrid, "COLLECTION_FEATURED_KEY", new ks.e(17), a.a, 4);
                            k0.i.r(LazyVerticalGrid, iIntValue * 2, new v1.c(new f(f7, 0), 371621682, true));
                        }
                        boolean z4 = z2;
                        List listH0 = bVar;
                        if (z4) {
                            kVar3 = kVar4;
                        } else {
                            boolean z5 = sVar.k;
                            u30.b bVar3 = sVar.l;
                            fx.b bVar4 = (fx.b) h00.q.N0(listH0);
                            if (bVar4 == null) {
                                kVar3 = kVar4;
                            } else {
                                kVar3 = kVar4;
                                k0.i.p(LazyVerticalGrid, "COLLECTION_FEATURED_KEY", new ks.e(14), new v1.c(new as.o0(bVar4, z5, bVar3, kVar3, 4), -1642363863, true), 4);
                            }
                        }
                        if (!z4) {
                            listH0 = h00.q.H0(listH0, 1);
                        }
                        List list = listH0;
                        LazyVerticalGrid.q(listH0.size(), new v2(new ks.e(18), listH0, 22), new r0(13, listH0), new v1.c(new g(list, sVar, kVar3, f7, 0), -1117249557, true));
                        return b0.a;
                    }
                };
                g0Var2.n0(objN5);
            } else {
                g0Var2 = g0Var3;
            }
            g0 g0Var4 = g0Var2;
            kh.n.i(bVar2, rVarV, yVar, p1Var, fVarG, fVarG2, (d0.t0) null, false, (h1) null, (u00.k) objN5, g0Var4, i3 | 1769472, 0, 912);
            g0Var = g0Var4;
        } else {
            g0Var = g0Var3;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k((Object) uiState, onAction, (Object) yVar, (Object) rVar, i, 8);
        }
    }
}
