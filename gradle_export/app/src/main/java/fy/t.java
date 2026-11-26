package fy;

import android.view.View;
import as.p0;
import bt.n0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import java.util.Collection;
import l1.f1;
import l1.g0;
import l1.y0;
import l1.z0;

public final class t implements u00.k {
    public final int A;
    public final float B;
    public final Object C;
    public final Object D;
    public final Object E;

    public t(float f, View view, z0 z0Var, z0 z0Var2) {
        this.A = 4;
        this.B = f;
        this.D = view;
        this.C = z0Var;
        this.E = z0Var2;
    }

    public t(u uVar, u00.k kVar, float f, String str) {
        this.A = 0;
        this.D = uVar;
        this.C = kVar;
        this.B = f;
        this.E = str;
    }

    public t(hx.x xVar, gm.a aVar, float f, u00.k kVar) {
        this.A = 1;
        this.D = xVar;
        this.E = aVar;
        this.B = f;
        this.C = kVar;
    }

    public t(z1.p pVar, float f, Object obj, y0 y0Var, int i) {
        this.A = i;
        this.D = pVar;
        this.B = f;
        this.C = obj;
        this.E = y0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                u uVar = (u) this.D;
                u00.k kVar = (u00.k) this.C;
                String str = (String) this.E;
                j0.h LazyColumn = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                float f = this.B;
                j0.h.q(LazyColumn, "SEARCH_TITLE_KEY", new v1.c(new as.c0(f, str, 1), -1306443624, true), 2);
                j0.h.q(LazyColumn, "SEARCH_BAR_KEY", new v1.c(new s(f, uVar, kVar), 1982830543, true), 2);
                boolean z = uVar.e;
                Collection collection = uVar.c;
                Collection collection2 = uVar.b;
                boolean z2 = uVar.f;
                if (!z && !z2) {
                    j0.h.q(LazyColumn, "SEARCH_OFFLINE_PAYWALL_KEY", new v1.c(new n0(f, kVar, 2), -2080371661, true), 2);
                } else if (z || !z2) {
                    if (uVar.c().length() == 0 && ((h00.b) collection).isEmpty()) {
                        j0.h.q(LazyColumn, "SEARCH_HINT_KEY", new v1.c(new p0(f, 5), 305589819, true), 2);
                    } else if (uVar.c().length() == 0 && !collection.isEmpty()) {
                        kh.o.L(LazyColumn, uVar, kVar, f);
                    } else if (uVar.c().length() > 0 && !collection2.isEmpty()) {
                        kh.o.N(LazyColumn, uVar, kVar, f);
                    } else if (uVar.c().length() > 0 && ((h00.b) collection2).isEmpty()) {
                        j0.h.q(LazyColumn, "SEARCH_EMPTY_RESULTS_KEY", new v1.c(new s(uVar, f, kVar), 826058875, true), 2);
                    }
                } else if (uVar.c().length() > 0 && uVar.c().length() > 0 && !collection2.isEmpty()) {
                    kh.o.N(LazyColumn, uVar, kVar, f);
                } else if (uVar.c().length() > 0 && uVar.c().length() > 0 && ((h00.b) collection2).isEmpty()) {
                    j0.h.q(LazyColumn, "SEARCH_OFFLINE_EMPTY_RESULTS_KEY", new v1.c(new p0(f, 2), -648953480, true), 2);
                } else if (!uVar.b()) {
                    j0.h.q(LazyColumn, "SEARCH_OFFLINE_NO_DOWNLOADS_KEY", new v1.c(new p0(f, 3), -781277225, true), 2);
                } else if (uVar.c().length() != 0 || collection.isEmpty()) {
                    j0.h.q(LazyColumn, "SEARCH_OFFLINE_HINT_KEY", new v1.c(new p0(f, 4), -1374892776, true), 2);
                } else {
                    kh.o.L(LazyColumn, uVar, kVar, f);
                }
                return g00.b0.a;
            case 1:
                final hx.x xVar = (hx.x) this.D;
                gm.a aVar = (gm.a) this.E;
                final u00.k kVar2 = (u00.k) this.C;
                j0.h LazyColumn2 = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn2, "$this$LazyColumn");
                float f2 = this.B;
                j0.h.q(LazyColumn2, "RECITER_TITLE_KEY", new v1.c(new as.c0(aVar, f2, 2), 833273044, true), 2);
                j0.h.q(LazyColumn2, "SEARCH_RECITER_KEY", new v1.c(new n0(f2, kVar2, 3), 1724429579, true), 2);
                boolean z3 = xVar.b;
                Collection collection3 = xVar.e;
                if (z3 && ((h00.b) collection3).isEmpty() && !xVar.b()) {
                    j0.h.q(LazyColumn2, "collections_loading_skeleton", new v1.c(new as.c0(f2, xVar, 3), -2054591697, true), 2);
                } else if (xVar.b()) {
                    final int i = 0;
                    j0.h.q(LazyColumn2, "downloaded_reciters_section", new v1.c(new u00.o() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            g00.k kVar3;
                            j0.b item = (j0.b) obj2;
                            switch (i) {
                                case 0:
                                    g0 g0Var = (l1.j) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                    g0 g0Var2 = g0Var;
                                    if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 8, 0.0f, 0.0f, 13);
                                        String strU = z3.U(g0Var, 2131887146);
                                        x xVar2 = xVar;
                                        u30.b bVarD0 = g4.d0(h00.q.j1(xVar2.n, 9));
                                        boolean z4 = xVar2.l;
                                        u30.b bVar = xVar2.m;
                                        u00.k kVar4 = kVar2;
                                        boolean zG = g0Var2.g(kVar4);
                                        Object objN = g0Var2.N();
                                        Object obj5 = l1.i.a;
                                        if (zG || objN == obj5) {
                                            objN = new hv.j(4, kVar4);
                                            g0Var2.n0(objN);
                                        }
                                        u00.k kVar5 = (u00.k) objN;
                                        boolean zG2 = g0Var2.g(kVar4);
                                        Object objN2 = g0Var2.N();
                                        if (zG2 || objN2 == obj5) {
                                            objN2 = new gv.a0(16, kVar4);
                                            g0Var2.n0(objN2);
                                        }
                                        ix.a.h(strU, bVarD0, z4, bVar, kVar5, (u00.a) objN2, rVarG, false, g0Var, 1572928, 128);
                                    } else {
                                        g0Var2.V();
                                    }
                                    break;
                                default:
                                    g0 g0Var3 = (l1.j) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= g0Var3.g(item) ? 4 : 2;
                                    }
                                    g0 g0Var4 = g0Var3;
                                    if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        if (xVar.l) {
                                            g0Var4.c0(1632740700);
                                            kVar3 = new g00.k(z3.U(g0Var3, 2131887147), "");
                                            g0Var4.r(false);
                                        } else {
                                            g0Var4.c0(1632859895);
                                            g00.k kVar6 = new g00.k(z3.U(g0Var3, 2131887151), z3.U(g0Var3, 2131887150));
                                            g0Var4.r(false);
                                            kVar3 = kVar6;
                                        }
                                        String str2 = (String) kVar3.A;
                                        String str3 = (String) kVar3.B;
                                        b2.r rVarB = j0.b.b(item);
                                        u00.k kVar7 = kVar2;
                                        boolean zG3 = g0Var4.g(kVar7);
                                        Object objN3 = g0Var4.N();
                                        if (zG3 || objN3 == l1.i.a) {
                                            objN3 = new gv.a0(15, kVar7);
                                            g0Var4.n0(objN3);
                                        }
                                        ix.a.f(str2, str3, (u00.a) objN3, rVarB, g0Var3, 0);
                                    } else {
                                        g0Var4.V();
                                    }
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, 63644632, true), 2);
                } else if (!((h00.b) collection3).isEmpty() || !((h00.b) xVar.n).isEmpty() || xVar.b || (xVar.l && !xVar.d)) {
                    int i2 = 0;
                    for (Object obj2 : collection3) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            va.a.k0();
                            throw null;
                        }
                        fx.a aVar2 = (fx.a) obj2;
                        boolean zEquals = aVar2.c.equals("my-favourites");
                        if (!((h00.b) aVar2.b).isEmpty() || zEquals) {
                            j0.h.q(LazyColumn2, Integer.valueOf(aVar2.a), new v1.c(new hx.r(i2, aVar, f2, aVar2, kVar2, xVar, zEquals), -70854946, true), 2);
                        }
                        i2 = i3;
                    }
                } else {
                    final int i4 = 1;
                    j0.h.q(LazyColumn2, "collections_error_state", new v1.c(new u00.o() {
                        @Override
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            g00.k kVar3;
                            j0.b item = (j0.b) obj3;
                            switch (i4) {
                                case 0:
                                    g0 g0Var = (l1.j) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                    g0 g0Var2 = g0Var;
                                    if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        b2.r rVarG = h0.c.G(b2.o.A, 0.0f, 8, 0.0f, 0.0f, 13);
                                        String strU = z3.U(g0Var, 2131887146);
                                        x xVar2 = xVar;
                                        u30.b bVarD0 = g4.d0(h00.q.j1(xVar2.n, 9));
                                        boolean z4 = xVar2.l;
                                        u30.b bVar = xVar2.m;
                                        u00.k kVar4 = kVar2;
                                        boolean zG = g0Var2.g(kVar4);
                                        Object objN = g0Var2.N();
                                        Object obj6 = l1.i.a;
                                        if (zG || objN == obj6) {
                                            objN = new hv.j(4, kVar4);
                                            g0Var2.n0(objN);
                                        }
                                        u00.k kVar5 = (u00.k) objN;
                                        boolean zG2 = g0Var2.g(kVar4);
                                        Object objN2 = g0Var2.N();
                                        if (zG2 || objN2 == obj6) {
                                            objN2 = new gv.a0(16, kVar4);
                                            g0Var2.n0(objN2);
                                        }
                                        ix.a.h(strU, bVarD0, z4, bVar, kVar5, (u00.a) objN2, rVarG, false, g0Var, 1572928, 128);
                                    } else {
                                        g0Var2.V();
                                    }
                                    break;
                                default:
                                    g0 g0Var3 = (l1.j) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= g0Var3.g(item) ? 4 : 2;
                                    }
                                    g0 g0Var4 = g0Var3;
                                    if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        if (xVar.l) {
                                            g0Var4.c0(1632740700);
                                            kVar3 = new g00.k(z3.U(g0Var3, 2131887147), "");
                                            g0Var4.r(false);
                                        } else {
                                            g0Var4.c0(1632859895);
                                            g00.k kVar6 = new g00.k(z3.U(g0Var3, 2131887151), z3.U(g0Var3, 2131887150));
                                            g0Var4.r(false);
                                            kVar3 = kVar6;
                                        }
                                        String str2 = (String) kVar3.A;
                                        String str3 = (String) kVar3.B;
                                        b2.r rVarB = j0.b.b(item);
                                        u00.k kVar7 = kVar2;
                                        boolean zG3 = g0Var4.g(kVar7);
                                        Object objN3 = g0Var4.N();
                                        if (zG3 || objN3 == l1.i.a) {
                                            objN3 = new gv.a0(15, kVar7);
                                            g0Var4.n0(objN3);
                                        }
                                        ix.a.f(str2, str3, (u00.a) objN3, rVarB, g0Var3, 0);
                                    } else {
                                        g0Var4.V();
                                    }
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, 776842551, true), 2);
                }
                return g00.b0.a;
            case 2:
                z1.p particles = (z1.p) this.D;
                z0 z0Var = (z0) this.C;
                f1 f1Var = (y0) this.E;
                ((Long) obj).getClass();
                float f3 = (int) (((y3.l) z0Var.getValue()).a >> 32);
                float f4 = (int) (((y3.l) z0Var.getValue()).a & 4294967295L);
                kotlin.jvm.internal.m.e(particles, "particles");
                f50.c.d0(particles, va.a.R(new pl.q(new h2.c(0.0f, 0.0f, f3, f4), false)), this.B);
                f1 f1Var2 = f1Var;
                int iH = f1Var2.h();
                f1Var2.i(iH + 1);
                return Integer.valueOf(iH);
            case 3:
                z1.p pVar = (z1.p) this.D;
                z1.s sVar = (z1.s) this.C;
                f1 f1Var3 = (y0) this.E;
                ((Long) obj).getClass();
                f50.c.d0(pVar, h00.q.n1(sVar.D), this.B);
                f1 f1Var4 = f1Var3;
                int iH2 = f1Var4.h();
                f1Var4.i(iH2 + 1);
                return Integer.valueOf(iH2);
            default:
                View view = (View) this.D;
                z0 z0Var2 = (z0) this.C;
                z0 z0Var3 = (z0) this.E;
                float fFloatValue = ((Float) obj).floatValue();
                float f5 = this.B;
                boolean z4 = f5 < 1.0f && fFloatValue >= f5;
                if (z4 && !((Boolean) z0Var2.getValue()).booleanValue()) {
                    view.performHapticFeedback(4);
                }
                z0Var2.setValue(Boolean.valueOf(z4));
                if (fFloatValue > f5) {
                    fFloatValue = f5;
                }
                z0Var3.setValue(Float.valueOf(fFloatValue));
                return g00.b0.a;
        }
    }
}
