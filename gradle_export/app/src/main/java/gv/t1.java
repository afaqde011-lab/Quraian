package gv;

import com.google.android.gms.internal.measurement.g4;
import g1.m6;
import kotlin.NoWhenBranchMatchedException;
import l1.p2;

public final class t1 implements u00.o {
    public final int A = 0;
    public final float B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;

    public t1(bv.o1 o1Var, float f, h0.t tVar, u00.k kVar, kk.c cVar, p2 p2Var) {
        this.C = o1Var;
        this.B = f;
        this.D = tVar;
        this.E = kVar;
        this.F = cVar;
        this.G = p2Var;
    }

    public t1(u30.b bVar, u00.a aVar, a40.z zVar, m6 m6Var, u00.a aVar2, float f) {
        this.C = bVar;
        this.D = aVar;
        this.E = zVar;
        this.F = m6Var;
        this.G = aVar2;
        this.B = f;
    }

    public t1(ur.h1 h1Var, gm.a aVar, h0.t0 t0Var, h0.n1 n1Var, float f, j1.r rVar) {
        this.C = h1Var;
        this.D = aVar;
        this.E = t0Var;
        this.F = n1Var;
        this.B = f;
        this.G = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        float fC;
        switch (this.A) {
            case 0:
                bv.o1 o1Var = (bv.o1) this.C;
                h0.t tVar = (h0.t) this.D;
                u00.k kVar = (u00.k) this.E;
                kk.c cVar = (kk.c) this.F;
                p2 p2Var = (p2) this.G;
                w.d0 PlayerScreenAnimatedVisibility = (w.d0) obj;
                l1.j jVar = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(PlayerScreenAnimatedVisibility, "$this$PlayerScreenAnimatedVisibility");
                hv.n.a(o1Var, kVar, cVar, ((i2.t) p2Var.getValue()).a, h0.c.G(h0.z1.c, 0.0f, 20, 0.0f, 0.0f, 13), false, o1Var.x ? 0 : this.B, null, tVar.c() * 0.72f, 0.0f, 0.0f, jVar, 24576, 1696);
                return g00.b0.a;
            case 1:
                ur.h1 h1Var = (ur.h1) this.C;
                gm.a aVar = (gm.a) this.D;
                h0.t0 t0Var = (h0.t0) this.E;
                h0.n1 n1Var = (h0.n1) this.F;
                j1.r rVar = (j1.r) this.G;
                h0.r PullToRefreshBox = (h0.r) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= g0Var.g(PullToRefreshBox) ? 4 : 2;
                }
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    j1.h hVar = j1.h.a;
                    b2.r rVarA = PullToRefreshBox.a(b2.o.A, b2.b.B);
                    boolean z = h1Var.c;
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 0) {
                        f = j1.h.d;
                        fC = t0Var.c();
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fC = n1Var.c() + t0Var.c() + j1.h.d;
                        f = this.B;
                    }
                    hVar.a(rVar, z, rVarA, 0L, 0L, fC + f, g0Var, 0, 24);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            default:
                u30.b bVar = (u30.b) this.C;
                u00.a aVar2 = (u00.a) this.D;
                a40.z zVar = (a40.z) this.E;
                m6 m6Var = (m6) this.F;
                u00.a aVar3 = (u00.a) this.G;
                h0.w ModalBottomSheet = (h0.w) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(ModalBottomSheet, "$this$ModalBottomSheet");
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    g4.d(6, dl.a.L, g0Var3, true);
                    boolean zI = g0Var4.i(zVar) | g0Var4.g(m6Var) | g0Var4.g(aVar3);
                    Object objN = g0Var4.N();
                    if (zI || objN == l1.i.a) {
                        objN = new cz.c(zVar, m6Var, aVar3, 18);
                        g0Var4.n0(objN);
                    }
                    wr.g.e(bVar, false, aVar2, (u00.a) objN, h0.z1.e(b2.o.A, this.B), g0Var3, 48);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
        }
    }
}
