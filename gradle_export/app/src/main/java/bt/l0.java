package bt;

import l1.p2;

public final class l0 implements u00.k {
    public final int A = 0;
    public final gm.a B;
    public final float C;
    public final u00.k D;
    public final Object E;
    public final Object F;
    public final Object G;

    public l0(a1 a1Var, gm.a aVar, h0.n1 n1Var, u00.k kVar, ct.b bVar, float f) {
        this.E = a1Var;
        this.B = aVar;
        this.F = n1Var;
        this.D = kVar;
        this.G = bVar;
        this.C = f;
    }

    public l0(gm.a aVar, ur.h1 h1Var, float f, p2 p2Var, u00.k kVar, l1.z0 z0Var) {
        this.B = aVar;
        this.E = h1Var;
        this.C = f;
        this.F = p2Var;
        this.D = kVar;
        this.G = z0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                final a1 a1Var = (a1) this.E;
                h0.n1 n1Var = (h0.n1) this.F;
                ct.b bVar = (ct.b) this.G;
                j0.h LazyColumn = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                gm.a aVar = this.B;
                u00.k kVar = this.D;
                j0.h.q(LazyColumn, (Object) null, new v1.c(new m0(aVar, n1Var, a1Var, kVar, bVar, 0), -2142256932, true), 3);
                boolean z = a1Var.b;
                final float f = this.C;
                if (z && a1Var.g) {
                    j0.h.q(LazyColumn, "AUTH_BANNER_KEY", new v1.c(new n0(f, kVar, 0), -1788750665, true), 2);
                }
                if (a1Var.b) {
                    j0.h.q(LazyColumn, "top_reciter", new v1.c(new o0(a1Var, aVar, f, kVar, 0), -964364882, true), 2);
                    j0.h.q(LazyColumn, "daily_goal", new v1.c(new o0(a1Var, aVar, f, kVar, 1), -1260468507, true), 2);
                    if (aVar == gm.a.A) {
                        final int i = 0;
                        j0.h.q(LazyColumn, "top_surahs", new v1.c(new u00.o() {
                            @Override
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i2 = i;
                                j0.b item = (j0.b) obj2;
                                l1.g0 g0Var = (l1.j) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                switch (i2) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(item, "$this$item");
                                        l1.g0 g0Var2 = g0Var;
                                        if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            a.g(a1Var, f, h0.c.G(b2.o.A, 0.0f, 16, 0.0f, 0.0f, 13), g0Var, 384, 0);
                                        } else {
                                            g0Var2.V();
                                        }
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(item, "$this$item");
                                        l1.g0 g0Var3 = g0Var;
                                        if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            a.h(a1Var, f, h0.c.G(b2.o.A, 0.0f, 16, 0.0f, 0.0f, 13), g0Var, 384, 0);
                                        } else {
                                            g0Var3.V();
                                        }
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, -1809245943, true), 2);
                        if (a1Var.u || a1Var.n != null) {
                            final int i2 = 1;
                            j0.h.q(LazyColumn, "year_overview", new v1.c(new u00.o() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    int i3 = i2;
                                    j0.b item = (j0.b) obj2;
                                    l1.g0 g0Var = (l1.j) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    switch (i3) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            l1.g0 g0Var2 = g0Var;
                                            if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                a.g(a1Var, f, h0.c.G(b2.o.A, 0.0f, 16, 0.0f, 0.0f, 13), g0Var, 384, 0);
                                            } else {
                                                g0Var2.V();
                                            }
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(item, "$this$item");
                                            l1.g0 g0Var3 = g0Var;
                                            if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                a.h(a1Var, f, h0.c.G(b2.o.A, 0.0f, 16, 0.0f, 0.0f, 13), g0Var, 384, 0);
                                            } else {
                                                g0Var3.V();
                                            }
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, -695662940, true), 2);
                        }
                        ys.a aVar2 = a1Var.o;
                        if (aVar2 != null) {
                            j0.h.q(LazyColumn, "best_listening_time", new v1.c(new as.a0(f, aVar2, a1Var, 2), -676341588, true), 2);
                        }
                    }
                } else {
                    j0.h.q(LazyColumn, "locked_content", new v1.c(new o0(a1Var, kVar, f, aVar), -30058441, true), 2);
                }
                j0.h.q(LazyColumn, (Object) null, a.a, 3);
                break;
            default:
                final ur.h1 h1Var = (ur.h1) this.E;
                p2 p2Var = (p2) this.F;
                l1.z0 z0Var = (l1.z0) this.G;
                j0.h LazyColumn2 = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn2, "$this$LazyColumn");
                gm.a aVar3 = gm.a.A;
                final gm.a aVar4 = this.B;
                final float f2 = this.C;
                if (aVar4 == aVar3) {
                    j0.h.q(LazyColumn2, (Object) null, new v1.c(new as.c0(f2, p2Var, 5), 1015112503, true), 3);
                }
                boolean zIsEmpty = h1Var.D.isEmpty();
                final u00.k kVar2 = this.D;
                if (!zIsEmpty) {
                    j0.h.q(LazyColumn2, "ANNOUNCEMENT_BANNERS_KEY", new v1.c(new as.b0(h1Var, kVar2, z0Var, f2), 2136691246, true), 2);
                }
                for (final qr.l lVar : h1Var.f) {
                    j0.h.q(LazyColumn2, lVar.getKey(), new v1.c(new u00.o() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            j0.b item = (j0.b) obj2;
                            l1.g0 g0Var = (l1.j) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            kotlin.jvm.internal.m.e(item, "$this$item");
                            l1.g0 g0Var2 = g0Var;
                            if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                g1.e(lVar, h1Var, kVar2, aVar4, f2, g0Var, 0);
                            } else {
                                g0Var2.V();
                            }
                            return g00.b0.a;
                        }
                    }, 495308656, true), 2);
                }
                break;
        }
        return g00.b0.a;
    }
}
