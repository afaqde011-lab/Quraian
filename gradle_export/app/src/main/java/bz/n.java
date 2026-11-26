package bz;

import g00.b0;
import gz.g1;
import h0.n1;
import h0.t0;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.z0;

public final class n implements u00.o {
    public final int A;
    public final gm.a B;
    public final t0 C;
    public final n1 D;
    public final j1.r E;
    public final z0 F;

    public n(gm.a aVar, t0 t0Var, n1 n1Var, j1.r rVar, z0 z0Var, int i11) {
        this.A = i11;
        this.B = aVar;
        this.C = t0Var;
        this.D = n1Var;
        this.E = rVar;
        this.F = z0Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fC;
        float fC2;
        float fC3;
        int i11 = this.A;
        h0.r PullToRefreshBox = (h0.r) obj;
        l1.j jVar = (l1.j) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((g0) jVar).g(PullToRefreshBox) ? 4 : 2;
                }
                g0 g0Var = (g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    j1.h hVar = j1.h.f10828a;
                    b2.r rVarA = PullToRefreshBox.a(b2.o.A, b2.b.B);
                    boolean z11 = ((p) this.F.getValue()).f3305b;
                    int iOrdinal = this.B.ordinal();
                    t0 t0Var = this.C;
                    if (iOrdinal == 0) {
                        fC = j1.h.f10831d + t0Var.c();
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fC = this.D.c() + t0Var.c() + j1.h.f10831d;
                    }
                    hVar.a(this.E, z11, rVarA, 0L, 0L, fC, jVar, 0, 24);
                } else {
                    g0Var.V();
                }
                return b0.f7770a;
            case 1:
                kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((g0) jVar).g(PullToRefreshBox) ? 4 : 2;
                }
                g0 g0Var2 = (g0) jVar;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    j1.h hVar2 = j1.h.f10828a;
                    b2.r rVarA2 = PullToRefreshBox.a(b2.o.A, b2.b.B);
                    boolean z12 = ((g1) this.F.getValue()).f8711w;
                    int iOrdinal2 = this.B.ordinal();
                    t0 t0Var2 = this.C;
                    if (iOrdinal2 == 0) {
                        fC2 = j1.h.f10831d + t0Var2.c();
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fC2 = this.D.c() + t0Var2.c() + j1.h.f10831d;
                    }
                    hVar2.a(this.E, z12, rVarA2, 0L, 0L, fC2, jVar, 0, 24);
                } else {
                    g0Var2.V();
                }
                return b0.f7770a;
            default:
                kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((g0) jVar).g(PullToRefreshBox) ? 4 : 2;
                }
                g0 g0Var3 = (g0) jVar;
                if (g0Var3.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    j1.h hVar3 = j1.h.f10828a;
                    b2.r rVarA3 = PullToRefreshBox.a(b2.o.A, b2.b.B);
                    boolean z13 = ((hw.f) this.F.getValue()).f9812c;
                    int iOrdinal3 = this.B.ordinal();
                    t0 t0Var3 = this.C;
                    if (iOrdinal3 == 0) {
                        fC3 = j1.h.f10831d + t0Var3.c();
                    } else {
                        if (iOrdinal3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fC3 = this.D.c() + t0Var3.c() + j1.h.f10831d;
                    }
                    hVar3.a(this.E, z13, rVarA3, 0L, 0L, fC3, jVar, 0, 24);
                } else {
                    g0Var3.V();
                }
                return b0.f7770a;
        }
    }
}
