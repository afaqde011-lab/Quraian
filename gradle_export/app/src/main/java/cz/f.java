package cz;

import b2.r;
import bt.m0;
import bz.p;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.z6;
import h0.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.x;
import l1.g0;
import l1.z0;
import m3.r0;
import q3.u;
import ta.c0;
import z2.k1;
import z2.l1;
import z2.v0;
import z2.y0;

public final class f implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
        this.F = obj5;
        this.G = obj6;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                p pVar = (p) this.B;
                ry.a aVar = (ry.a) this.C;
                final r rVar = (r) this.D;
                ArrayList arrayList = (ArrayList) this.E;
                u00.k kVar = (u00.k) this.F;
                u00.a aVar2 = (u00.a) this.G;
                j0.h LazyColumn = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                final int i = 0;
                j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        switch (i) {
                            case 0:
                                j0.b item = (j0.b) obj2;
                                g0 g0Var = (l1.j) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.e(item, "$this$item");
                                g0 g0Var2 = g0Var;
                                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    z6.b(z3.U(g0Var, 2131887244), rVar, dl.a.n, kh.o.z(32), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 239528);
                                } else {
                                    g0Var2.V();
                                }
                                break;
                            case 1:
                                j0.b item2 = (j0.b) obj2;
                                g0 g0Var3 = (l1.j) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.e(item2, "$this$item");
                                g0 g0Var4 = g0Var3;
                                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    a.j(rVar, g0Var3, 0);
                                } else {
                                    g0Var4.V();
                                }
                                break;
                            case 2:
                                j0.b item3 = (j0.b) obj2;
                                g0 g0Var5 = (l1.j) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.e(item3, "$this$item");
                                g0 g0Var6 = g0Var5;
                                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    va.a.d(h0.c.E(rVar, 0.0f, 16, 1), g0Var5, 0);
                                } else {
                                    g0Var6.V();
                                }
                                break;
                            case 3:
                                j0.b item4 = (j0.b) obj2;
                                g0 g0Var7 = (l1.j) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.e(item4, "$this$item");
                                g0 g0Var8 = g0Var7;
                                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c0.h(z3.U(g0Var7, 2131886408), rVar, g0Var7, 0);
                                } else {
                                    g0Var8.V();
                                }
                                break;
                            case 4:
                                j0.b item5 = (j0.b) obj2;
                                g0 g0Var9 = (l1.j) obj3;
                                int iIntValue5 = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.e(item5, "$this$item");
                                g0 g0Var10 = g0Var9;
                                if (g0Var10.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    c0.h(z3.U(g0Var9, 2131886407), rVar, g0Var9, 0);
                                } else {
                                    g0Var10.V();
                                }
                                break;
                            default:
                                j0.b item6 = (j0.b) obj2;
                                g0 g0Var11 = (l1.j) obj3;
                                int iIntValue6 = ((Integer) obj4).intValue();
                                kotlin.jvm.internal.m.e(item6, "$this$item");
                                g0 g0Var12 = g0Var11;
                                if (g0Var12.S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    c0.h(z3.U(g0Var11, 2131886154), rVar, g0Var11, 0);
                                } else {
                                    g0Var12.V();
                                }
                                break;
                        }
                        return b0.a;
                    }
                }, 2036047520, true), 3);
                boolean z = pVar.a;
                Collection collection = pVar.c;
                if (z && ((h00.b) collection).isEmpty()) {
                    final int i2 = 1;
                    j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            switch (i2) {
                                case 0:
                                    j0.b item = (j0.b) obj2;
                                    g0 g0Var = (l1.j) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    kotlin.jvm.internal.m.e(item, "$this$item");
                                    g0 g0Var2 = g0Var;
                                    if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        z6.b(z3.U(g0Var, 2131887244), rVar, dl.a.n, kh.o.z(32), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 239528);
                                    } else {
                                        g0Var2.V();
                                    }
                                    break;
                                case 1:
                                    j0.b item2 = (j0.b) obj2;
                                    g0 g0Var3 = (l1.j) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    kotlin.jvm.internal.m.e(item2, "$this$item");
                                    g0 g0Var4 = g0Var3;
                                    if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        a.j(rVar, g0Var3, 0);
                                    } else {
                                        g0Var4.V();
                                    }
                                    break;
                                case 2:
                                    j0.b item3 = (j0.b) obj2;
                                    g0 g0Var5 = (l1.j) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    kotlin.jvm.internal.m.e(item3, "$this$item");
                                    g0 g0Var6 = g0Var5;
                                    if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        va.a.d(h0.c.E(rVar, 0.0f, 16, 1), g0Var5, 0);
                                    } else {
                                        g0Var6.V();
                                    }
                                    break;
                                case 3:
                                    j0.b item4 = (j0.b) obj2;
                                    g0 g0Var7 = (l1.j) obj3;
                                    int iIntValue4 = ((Integer) obj4).intValue();
                                    kotlin.jvm.internal.m.e(item4, "$this$item");
                                    g0 g0Var8 = g0Var7;
                                    if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        c0.h(z3.U(g0Var7, 2131886408), rVar, g0Var7, 0);
                                    } else {
                                        g0Var8.V();
                                    }
                                    break;
                                case 4:
                                    j0.b item5 = (j0.b) obj2;
                                    g0 g0Var9 = (l1.j) obj3;
                                    int iIntValue5 = ((Integer) obj4).intValue();
                                    kotlin.jvm.internal.m.e(item5, "$this$item");
                                    g0 g0Var10 = g0Var9;
                                    if (g0Var10.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                        c0.h(z3.U(g0Var9, 2131886407), rVar, g0Var9, 0);
                                    } else {
                                        g0Var10.V();
                                    }
                                    break;
                                default:
                                    j0.b item6 = (j0.b) obj2;
                                    g0 g0Var11 = (l1.j) obj3;
                                    int iIntValue6 = ((Integer) obj4).intValue();
                                    kotlin.jvm.internal.m.e(item6, "$this$item");
                                    g0 g0Var12 = g0Var11;
                                    if (g0Var12.S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        c0.h(z3.U(g0Var11, 2131886154), rVar, g0Var11, 0);
                                    } else {
                                        g0Var12.V();
                                    }
                                    break;
                            }
                            return b0.a;
                        }
                    }, -107678597, true), 3);
                }
                if (aVar != null) {
                    j0.h.q(LazyColumn, (Object) null, new v1.c(new m0(aVar, arrayList, kVar, aVar2, rVar), -1309638798, true), 3);
                }
                if (!pVar.a || !collection.isEmpty()) {
                    j0.h.q(LazyColumn, (Object) null, new v1.c(new az.j(rVar, arrayList, kVar, 3), 1984272627, true), 3);
                }
                break;
            case 1:
                v vVar = (v) this.B;
                w wVar = (w) this.C;
                v vVar2 = (v) this.D;
                z0 z0Var = (z0) this.E;
                z0 z0Var2 = (z0) this.F;
                z0 z0Var3 = (z0) this.G;
                vVar.A = false;
                wVar.A = ((Number) z0Var.getValue()).floatValue();
                vVar2.A = false;
                Boolean bool = Boolean.TRUE;
                z0Var2.setValue(bool);
                ((u00.k) z0Var3.getValue()).invoke(bool);
                break;
            default:
                l1[] l1VarArr = (l1[]) this.B;
                List list = (List) this.C;
                y0 y0Var = (y0) this.D;
                x xVar = (x) this.E;
                x xVar2 = (x) this.F;
                q qVar = (q) this.G;
                k1 k1Var = (k1) obj;
                int length = l1VarArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i3;
                    l1 l1Var = l1VarArr[i4];
                    kotlin.jvm.internal.m.c(l1Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    h0.o.b(k1Var, l1Var, (v0) list.get(i5), y0Var.getLayoutDirection(), xVar.A, xVar2.A, qVar.a);
                    i4++;
                    i3 = i5 + 1;
                }
                break;
        }
        return b0.a;
    }
}
