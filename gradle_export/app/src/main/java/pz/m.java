package pz;

import a1.q2;
import android.content.res.Configuration;
import b2.r;
import c3.o0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g00.b0;
import g1.o3;
import g1.z6;
import h0.w1;
import h0.z1;
import h00.y;
import i2.t;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import m3.r0;
import oo.q0;
import q3.u;
import u00.o;
import z2.l1;
import z2.v0;
import z2.y0;

public final class m implements o {
    public final int A;

    public m(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r rVarQ;
        switch (this.A) {
            case 0:
                j0.b item = (j0.b) obj;
                g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    k00.f.a(z3.U(g0Var, 2131887141), h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, 8, 7), t.b(0.7f, dl.a.k), kh.o.z(16), new y3.o(kh.o.z(22)), u.J, null, 2, 0.0f, null, g0Var, 12807216, 832);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 1:
                w1 LiquidButton = (w1) obj;
                g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton, "$this$LiquidButton");
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    z3.j(y3.R(2131231078, g0Var3, 0), (String) null, (r) null, dl.a.i, g0Var3, 56, 4);
                } else {
                    g0Var4.V();
                }
                return b0.a;
            case 2:
                u00.n nVar = (u00.n) obj;
                g0 g0Var5 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= g0Var5.i(nVar) ? 4 : 2;
                }
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    nVar.invoke(g0Var5, Integer.valueOf(iIntValue3 & 14));
                } else {
                    g0Var6.V();
                }
                return b0.a;
            case 3:
                y0 layout = (y0) obj;
                v0 measurable = (v0) obj2;
                y3.a aVar = (y3.a) obj3;
                kotlin.jvm.internal.m.e(layout, "$this$layout");
                kotlin.jvm.internal.m.e(measurable, "measurable");
                int iH = y3.a.h(aVar.a);
                long j = aVar.a;
                int iF = w00.a.F(y3.a.g(j) * (y3.a.g(j) > iH ? 0.5f : 0.65f));
                if (!((iF >= 0) & (iH >= 0))) {
                    y3.i.a("width and height must be >= 0");
                }
                return layout.o0(iH, iF, y.A, new q2(measurable.O(y3.b.h(iH, iH, iF, iF)), 19));
            case 4:
                w1 LiquidButton2 = (w1) obj;
                g0 g0Var7 = (l1.j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton2, "$this$LiquidButton");
                g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    z3.j(y3.R(2131231078, g0Var7, 0), (String) null, (r) null, dl.a.i, g0Var7, 56, 4);
                } else {
                    g0Var8.V();
                }
                return b0.a;
            case 5:
                w1 LiquidButton3 = (w1) obj;
                g0 g0Var9 = (l1.j) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton3, "$this$LiquidButton");
                g0 g0Var10 = g0Var9;
                if (g0Var10.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    o3.a(y3.R(2131231383, g0Var9, 0), z3.U(g0Var9, 2131887263), z1.m(b2.o.A, 20), dl.a.i, g0Var9, 392, 0);
                } else {
                    g0Var10.V();
                }
                return b0.a;
            case 6:
                w1 LiquidButton4 = (w1) obj;
                g0 g0Var11 = (l1.j) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton4, "$this$LiquidButton");
                g0 g0Var12 = g0Var11;
                if (g0Var12.S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    o3.a(y3.R(2131231104, g0Var11, 0), z3.U(g0Var11, 2131886127), z1.m(b2.o.A, 16), dl.a.i, g0Var11, 392, 0);
                } else {
                    g0Var12.V();
                }
                return b0.a;
            case 7:
                w1 LiquidButton5 = (w1) obj;
                g0 g0Var13 = (l1.j) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton5, "$this$LiquidButton");
                g0 g0Var14 = g0Var13;
                if (g0Var14.S(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    z3.j(y3.R(2131231078, g0Var13, 0), (String) null, (r) null, dl.a.i, g0Var13, 56, 4);
                } else {
                    g0Var14.V();
                }
                return b0.a;
            case 8:
                w1 LiquidButton6 = (w1) obj;
                g0 g0Var15 = (l1.j) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton6, "$this$LiquidButton");
                g0 g0Var16 = g0Var15;
                if (g0Var16.S(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    z3.j(y3.R(2131231375, g0Var15, 0), (String) null, (r) null, dl.a.i, g0Var15, 56, 4);
                } else {
                    g0Var16.V();
                }
                return b0.a;
            case 9:
                w1 LiquidButton7 = (w1) obj;
                g0 g0Var17 = (l1.j) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton7, "$this$LiquidButton");
                g0 g0Var18 = g0Var17;
                if (g0Var18.S(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    z3.j(y3.R(2131231104, g0Var17, 0), (String) null, z1.m(b2.o.A, 16), dl.a.i, g0Var17, 440, 0);
                } else {
                    g0Var18.V();
                }
                return b0.a;
            case 10:
                w1 LiquidButton8 = (w1) obj;
                g0 g0Var19 = (l1.j) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton8, "$this$LiquidButton");
                g0 g0Var20 = g0Var19;
                if (g0Var20.S(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    z3.j(y3.R(2131231078, g0Var19, 0), (String) null, (r) null, dl.a.i, g0Var19, 56, 4);
                } else {
                    g0Var20.V();
                }
                return b0.a;
            case 11:
                y0 layout2 = (y0) obj;
                v0 measurable2 = (v0) obj2;
                kotlin.jvm.internal.m.e(layout2, "$this$layout");
                kotlin.jvm.internal.m.e(measurable2, "measurable");
                l1 l1VarO = measurable2.O(y3.a.a(((y3.a) obj3).a, 0, 0, 0, 0, 10));
                int iR0 = layout2.R0(12);
                int i = iR0 * 2;
                int i2 = l1VarO.A - i;
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = l1VarO.B - i;
                return layout2.o0(i2, i3 >= 0 ? i3 : 0, y.A, new q0(iR0, 4, l1VarO));
            case 12:
                y0 layout3 = (y0) obj;
                v0 measurable3 = (v0) obj2;
                kotlin.jvm.internal.m.e(layout3, "$this$layout");
                kotlin.jvm.internal.m.e(measurable3, "measurable");
                int iR1 = layout3.R0(14);
                l1 l1VarO2 = measurable3.O(((y3.a) obj3).a);
                int i4 = iR1 * 2;
                int i5 = l1VarO2.A - i4;
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = l1VarO2.B - i4;
                return layout3.o0(i5, i6 >= 0 ? i6 : 0, y.A, new q0(iR1, 3, l1VarO2));
            case 13:
                w1 LiquidButton9 = (w1) obj;
                g0 g0Var21 = (l1.j) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton9, "$this$LiquidButton");
                g0 g0Var22 = g0Var21;
                if (g0Var22.S(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    z3.j(y3.R(2131231078, g0Var21, 0), (String) null, (r) null, dl.a.i, g0Var21, 56, 4);
                } else {
                    g0Var22.V();
                }
                return b0.a;
            case 14:
                w1 LiquidButton10 = (w1) obj;
                g0 g0Var23 = (l1.j) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton10, "$this$LiquidButton");
                g0 g0Var24 = g0Var23;
                if (g0Var24.S(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    z3.j(y3.R(2131231078, g0Var23, 0), (String) null, (r) null, dl.a.i, g0Var23, 56, 4);
                } else {
                    g0Var24.V();
                }
                return b0.a;
            case 15:
                w1 LiquidButton11 = (w1) obj;
                g0 g0Var25 = (l1.j) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton11, "$this$LiquidButton");
                g0 g0Var26 = g0Var25;
                if (g0Var26.S(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    o3.a(y3.R(2131231104, g0Var25, 0), z3.U(g0Var25, 2131886127), z1.m(b2.o.A, 16), dl.a.i, g0Var25, 392, 0);
                } else {
                    g0Var26.V();
                }
                return b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                w1 LiquidButton12 = (w1) obj;
                g0 g0Var27 = (l1.j) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton12, "$this$LiquidButton");
                g0 g0Var28 = g0Var27;
                if (g0Var28.S(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    z6.b(z3.U(g0Var27, 2131887125), (r) null, dl.a.k, kh.o.z(16), (u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var27, 24576, 0, 262122);
                } else {
                    g0Var28.V();
                }
                return b0.a;
            case 17:
                w1 LiquidButton13 = (w1) obj;
                g0 g0Var29 = (l1.j) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton13, "$this$LiquidButton");
                g0 g0Var30 = g0Var29;
                if (g0Var30.S(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    z3.k(g4.h0(2131231181, g0Var29, 6), z3.U(g0Var29, 2131886606), z1.m(b2.o.A, 24), dl.a.k, g0Var29, 384);
                } else {
                    g0Var30.V();
                }
                return b0.a;
            case 18:
                w1 Button = (w1) obj;
                g0 g0Var31 = (l1.j) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(Button, "$this$Button");
                g0 g0Var32 = g0Var31;
                if (g0Var32.S(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    z6.b(z3.U(g0Var31, 2131886933), (r) null, dl.a.H, kh.o.z(15), u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var31, 1597440, 0, 262058);
                } else {
                    g0Var32.V();
                }
                return b0.a;
            case 19:
                r composed = (r) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(composed, "$this$composed");
                g0 g0Var33 = (l1.j) obj2;
                g0Var33.c0(-741067302);
                gm.a aVar2 = (gm.a) g0Var33.k(dl.e.a);
                Configuration configuration = (Configuration) g0Var33.k(o0.a);
                int iOrdinal = aVar2.ordinal();
                b2.o oVar = b2.o.A;
                if (iOrdinal == 0) {
                    rVarQ = z1.q(oVar, configuration.screenWidthDp - 72);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVarQ = z1.q(oVar, RCHTTPStatusCodes.UNSUCCESSFUL);
                }
                r rVarV = composed.V(rVarQ);
                g0Var33.r(false);
                return rVarV;
            case 20:
                w1 LiquidButton14 = (w1) obj;
                g0 g0Var34 = (l1.j) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton14, "$this$LiquidButton");
                g0 g0Var35 = g0Var34;
                if (g0Var35.S(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    z3.j(y3.R(2131231078, g0Var34, 0), (String) null, (r) null, dl.a.i, g0Var34, 56, 4);
                } else {
                    g0Var35.V();
                }
                return b0.a;
            case 21:
                j0.b item2 = (j0.b) obj;
                g0 g0Var36 = (l1.j) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                g0 g0Var37 = g0Var36;
                if (g0Var37.S(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    yy.a.b(null, g0Var36, 0);
                } else {
                    g0Var37.V();
                }
                return b0.a;
            case 22:
                w1 Button2 = (w1) obj;
                g0 g0Var38 = (l1.j) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(Button2, "$this$Button");
                g0 g0Var39 = g0Var38;
                if (g0Var39.S(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    z6.b(z3.U(g0Var38, 2131887245), h0.c.E(b2.o.A, 0.0f, 8, 1), 0L, kh.o.z(16), u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var38, 1597488, 0, 262060);
                } else {
                    g0Var39.V();
                }
                return b0.a;
            case 23:
                w1 LiquidButton15 = (w1) obj;
                g0 g0Var40 = (l1.j) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton15, "$this$LiquidButton");
                g0 g0Var41 = g0Var40;
                if (g0Var41.S(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    z3.j(y3.R(2131231104, g0Var40, 0), (String) null, (r) null, dl.a.i, g0Var40, 56, 4);
                } else {
                    g0Var41.V();
                }
                return b0.a;
            case 24:
                w1 LiquidButton16 = (w1) obj;
                g0 g0Var42 = (l1.j) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidButton16, "$this$LiquidButton");
                g0 g0Var43 = g0Var42;
                if (g0Var43.S(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    z6.b(z3.U(g0Var42, 2131887191), (r) null, dl.a.k, kh.o.z(16), (u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var42, 24576, 0, 262122);
                } else {
                    g0Var43.V();
                }
                return b0.a;
            case 25:
                w1 Button3 = (w1) obj;
                g0 g0Var44 = (l1.j) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(Button3, "$this$Button");
                g0 g0Var45 = g0Var44;
                if (g0Var45.S(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    z6.b(z3.U(g0Var44, 2131886334), (r) null, 0L, kh.o.z(14), (u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(14), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var44, 24576, 48, 259054);
                } else {
                    g0Var45.V();
                }
                return b0.a;
            default:
                w1 Button4 = (w1) obj;
                g0 g0Var46 = (l1.j) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(Button4, "$this$Button");
                g0 g0Var47 = g0Var46;
                if (g0Var47.S(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    z6.b(z3.U(g0Var46, 2131886335), (r) null, 0L, kh.o.z(14), (u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(14), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var46, 24576, 48, 259054);
                } else {
                    g0Var47.V();
                }
                return b0.a;
        }
    }
}
