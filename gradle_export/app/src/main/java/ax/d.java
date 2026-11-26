package ax;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import kotlin.jvm.internal.m;
import l1.g0;
import u00.o;

public final class d implements o {
    public final int A;
    public final e60.a B;

    public d(e60.a aVar, int i) {
        this.A = i;
        this.B = aVar;
    }

    private final Object a(Object t, Object obj, Object obj2) {
        g0 g0Var = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        m.e(t, "t");
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? g0Var.g(t) : g0Var.i(t) ? 4 : 2;
        }
        g0 g0Var2 = g0Var;
        if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
            ny.b.j.invoke(this.B, t, g0Var, Integer.valueOf((iIntValue << 3) & 112));
        } else {
            g0Var2.V();
        }
        return b0.a;
    }

    @Override
    public final Object invoke(Object t, Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? g0Var.g(t) : g0Var.i(t) ? 4 : 2;
                }
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    b.a.invoke(this.B, t, g0Var, Integer.valueOf((iIntValue << 3) & 112));
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 1:
                g0 g0Var3 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? g0Var3.g(t) : g0Var3.i(t) ? 4 : 2;
                }
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    b.b.invoke(this.B, t, g0Var3, Integer.valueOf((iIntValue2 << 3) & 112));
                } else {
                    g0Var4.V();
                }
                return b0.a;
            case 2:
                g0 g0Var5 = (l1.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? g0Var5.g(t) : g0Var5.i(t) ? 4 : 2;
                }
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    b.c.invoke(this.B, t, g0Var5, Integer.valueOf((iIntValue3 << 3) & 112));
                } else {
                    g0Var6.V();
                }
                return b0.a;
            case 3:
                g0 g0Var7 = (l1.j) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? g0Var7.g(t) : g0Var7.i(t) ? 4 : 2;
                }
                g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    b.d.invoke(this.B, t, g0Var7, Integer.valueOf((iIntValue4 << 3) & 112));
                } else {
                    g0Var8.V();
                }
                return b0.a;
            case 4:
                g0 g0Var9 = (l1.j) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? g0Var9.g(t) : g0Var9.i(t) ? 4 : 2;
                }
                g0 g0Var10 = g0Var9;
                if (g0Var10.S(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    b.e.invoke(this.B, t, g0Var9, Integer.valueOf((iIntValue5 << 3) & 112));
                } else {
                    g0Var10.V();
                }
                return b0.a;
            case 5:
                g0 g0Var11 = (l1.j) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? g0Var11.g(t) : g0Var11.i(t) ? 4 : 2;
                }
                g0 g0Var12 = g0Var11;
                if (g0Var12.S(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    bw.a.a.invoke(this.B, t, g0Var11, Integer.valueOf((iIntValue6 << 3) & 112));
                } else {
                    g0Var12.V();
                }
                return b0.a;
            case 6:
                g0 g0Var13 = (l1.j) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= (iIntValue7 & 8) == 0 ? g0Var13.g(t) : g0Var13.i(t) ? 4 : 2;
                }
                g0 g0Var14 = g0Var13;
                if (g0Var14.S(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    bw.a.b.invoke(this.B, t, g0Var13, Integer.valueOf((iIntValue7 << 3) & 112));
                } else {
                    g0Var14.V();
                }
                return b0.a;
            case 7:
                g0 g0Var15 = (l1.j) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= (iIntValue8 & 8) == 0 ? g0Var15.g(t) : g0Var15.i(t) ? 4 : 2;
                }
                g0 g0Var16 = g0Var15;
                if (g0Var16.S(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    bw.a.c.invoke(this.B, t, g0Var15, Integer.valueOf((iIntValue8 << 3) & 112));
                } else {
                    g0Var16.V();
                }
                return b0.a;
            case 8:
                g0 g0Var17 = (l1.j) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= (iIntValue9 & 8) == 0 ? g0Var17.g(t) : g0Var17.i(t) ? 4 : 2;
                }
                g0 g0Var18 = g0Var17;
                if (g0Var18.S(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    ir.a.a.invoke(this.B, t, g0Var17, Integer.valueOf((iIntValue9 << 3) & 112));
                } else {
                    g0Var18.V();
                }
                return b0.a;
            case 9:
                g0 g0Var19 = (l1.j) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= (iIntValue10 & 8) == 0 ? g0Var19.g(t) : g0Var19.i(t) ? 4 : 2;
                }
                g0 g0Var20 = g0Var19;
                if (g0Var20.S(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    ir.a.b.invoke(this.B, t, g0Var19, Integer.valueOf((iIntValue10 << 3) & 112));
                } else {
                    g0Var20.V();
                }
                return b0.a;
            case 10:
                g0 g0Var21 = (l1.j) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= (iIntValue11 & 8) == 0 ? g0Var21.g(t) : g0Var21.i(t) ? 4 : 2;
                }
                g0 g0Var22 = g0Var21;
                if (g0Var22.S(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    ir.a.c.invoke(this.B, t, g0Var21, Integer.valueOf((iIntValue11 << 3) & 112));
                } else {
                    g0Var22.V();
                }
                return b0.a;
            case 11:
                g0 g0Var23 = (l1.j) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= (iIntValue12 & 8) == 0 ? g0Var23.g(t) : g0Var23.i(t) ? 4 : 2;
                }
                g0 g0Var24 = g0Var23;
                if (g0Var24.S(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    ir.a.d.invoke(this.B, t, g0Var23, Integer.valueOf((iIntValue12 << 3) & 112));
                } else {
                    g0Var24.V();
                }
                return b0.a;
            case 12:
                g0 g0Var25 = (l1.j) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= (iIntValue13 & 8) == 0 ? g0Var25.g(t) : g0Var25.i(t) ? 4 : 2;
                }
                g0 g0Var26 = g0Var25;
                if (g0Var26.S(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    ir.a.e.invoke(this.B, t, g0Var25, Integer.valueOf((iIntValue13 << 3) & 112));
                } else {
                    g0Var26.V();
                }
                return b0.a;
            case 13:
                g0 g0Var27 = (l1.j) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= (iIntValue14 & 8) == 0 ? g0Var27.g(t) : g0Var27.i(t) ? 4 : 2;
                }
                g0 g0Var28 = g0Var27;
                if (g0Var28.S(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    ir.a.f.invoke(this.B, t, g0Var27, Integer.valueOf((iIntValue14 << 3) & 112));
                } else {
                    g0Var28.V();
                }
                return b0.a;
            case 14:
                g0 g0Var29 = (l1.j) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= (iIntValue15 & 8) == 0 ? g0Var29.g(t) : g0Var29.i(t) ? 4 : 2;
                }
                g0 g0Var30 = g0Var29;
                if (g0Var30.S(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    ir.a.g.invoke(this.B, t, g0Var29, Integer.valueOf((iIntValue15 << 3) & 112));
                } else {
                    g0Var30.V();
                }
                return b0.a;
            case 15:
                g0 g0Var31 = (l1.j) obj;
                int iIntValue16 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= (iIntValue16 & 8) == 0 ? g0Var31.g(t) : g0Var31.i(t) ? 4 : 2;
                }
                g0 g0Var32 = g0Var31;
                if (g0Var32.S(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    ir.a.h.invoke(this.B, t, g0Var31, Integer.valueOf((iIntValue16 << 3) & 112));
                } else {
                    g0Var32.V();
                }
                return b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                g0 g0Var33 = (l1.j) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= (iIntValue17 & 8) == 0 ? g0Var33.g(t) : g0Var33.i(t) ? 4 : 2;
                }
                g0 g0Var34 = g0Var33;
                if (g0Var34.S(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    ir.a.i.invoke(this.B, t, g0Var33, Integer.valueOf((iIntValue17 << 3) & 112));
                } else {
                    g0Var34.V();
                }
                return b0.a;
            case 17:
                g0 g0Var35 = (l1.j) obj;
                int iIntValue18 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= (iIntValue18 & 8) == 0 ? g0Var35.g(t) : g0Var35.i(t) ? 4 : 2;
                }
                g0 g0Var36 = g0Var35;
                if (g0Var36.S(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    ir.a.j.invoke(this.B, t, g0Var35, Integer.valueOf((iIntValue18 << 3) & 112));
                } else {
                    g0Var36.V();
                }
                return b0.a;
            case 18:
                g0 g0Var37 = (l1.j) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= (iIntValue19 & 8) == 0 ? g0Var37.g(t) : g0Var37.i(t) ? 4 : 2;
                }
                g0 g0Var38 = g0Var37;
                if (g0Var38.S(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    ny.b.b.invoke(this.B, t, g0Var37, Integer.valueOf((iIntValue19 << 3) & 112));
                } else {
                    g0Var38.V();
                }
                return b0.a;
            case 19:
                g0 g0Var39 = (l1.j) obj;
                int iIntValue20 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= (iIntValue20 & 8) == 0 ? g0Var39.g(t) : g0Var39.i(t) ? 4 : 2;
                }
                g0 g0Var40 = g0Var39;
                if (g0Var40.S(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    ny.b.k.invoke(this.B, t, g0Var39, Integer.valueOf((iIntValue20 << 3) & 112));
                } else {
                    g0Var40.V();
                }
                return b0.a;
            case 20:
                g0 g0Var41 = (l1.j) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= (iIntValue21 & 8) == 0 ? g0Var41.g(t) : g0Var41.i(t) ? 4 : 2;
                }
                g0 g0Var42 = g0Var41;
                if (g0Var42.S(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    ny.b.l.invoke(this.B, t, g0Var41, Integer.valueOf((iIntValue21 << 3) & 112));
                } else {
                    g0Var42.V();
                }
                return b0.a;
            case 21:
                g0 g0Var43 = (l1.j) obj;
                int iIntValue22 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue22 & 6) == 0) {
                    iIntValue22 |= (iIntValue22 & 8) == 0 ? g0Var43.g(t) : g0Var43.i(t) ? 4 : 2;
                }
                g0 g0Var44 = g0Var43;
                if (g0Var44.S(iIntValue22 & 1, (iIntValue22 & 19) != 18)) {
                    ny.b.c.invoke(this.B, t, g0Var43, Integer.valueOf((iIntValue22 << 3) & 112));
                } else {
                    g0Var44.V();
                }
                return b0.a;
            case 22:
                g0 g0Var45 = (l1.j) obj;
                int iIntValue23 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue23 & 6) == 0) {
                    iIntValue23 |= (iIntValue23 & 8) == 0 ? g0Var45.g(t) : g0Var45.i(t) ? 4 : 2;
                }
                g0 g0Var46 = g0Var45;
                if (g0Var46.S(iIntValue23 & 1, (iIntValue23 & 19) != 18)) {
                    ny.b.d.invoke(this.B, t, g0Var45, Integer.valueOf((iIntValue23 << 3) & 112));
                } else {
                    g0Var46.V();
                }
                return b0.a;
            case 23:
                g0 g0Var47 = (l1.j) obj;
                int iIntValue24 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue24 & 6) == 0) {
                    iIntValue24 |= (iIntValue24 & 8) == 0 ? g0Var47.g(t) : g0Var47.i(t) ? 4 : 2;
                }
                g0 g0Var48 = g0Var47;
                if (g0Var48.S(iIntValue24 & 1, (iIntValue24 & 19) != 18)) {
                    ny.b.e.invoke(this.B, t, g0Var47, Integer.valueOf((iIntValue24 << 3) & 112));
                } else {
                    g0Var48.V();
                }
                return b0.a;
            case 24:
                g0 g0Var49 = (l1.j) obj;
                int iIntValue25 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue25 & 6) == 0) {
                    iIntValue25 |= (iIntValue25 & 8) == 0 ? g0Var49.g(t) : g0Var49.i(t) ? 4 : 2;
                }
                g0 g0Var50 = g0Var49;
                if (g0Var50.S(iIntValue25 & 1, (iIntValue25 & 19) != 18)) {
                    ny.b.f.invoke(this.B, t, g0Var49, Integer.valueOf((iIntValue25 << 3) & 112));
                } else {
                    g0Var50.V();
                }
                return b0.a;
            case 25:
                g0 g0Var51 = (l1.j) obj;
                int iIntValue26 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue26 & 6) == 0) {
                    iIntValue26 |= (iIntValue26 & 8) == 0 ? g0Var51.g(t) : g0Var51.i(t) ? 4 : 2;
                }
                g0 g0Var52 = g0Var51;
                if (g0Var52.S(iIntValue26 & 1, (iIntValue26 & 19) != 18)) {
                    ny.b.g.invoke(this.B, t, g0Var51, Integer.valueOf((iIntValue26 << 3) & 112));
                } else {
                    g0Var52.V();
                }
                return b0.a;
            case 26:
                g0 g0Var53 = (l1.j) obj;
                int iIntValue27 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue27 & 6) == 0) {
                    iIntValue27 |= (iIntValue27 & 8) == 0 ? g0Var53.g(t) : g0Var53.i(t) ? 4 : 2;
                }
                g0 g0Var54 = g0Var53;
                if (g0Var54.S(iIntValue27 & 1, (iIntValue27 & 19) != 18)) {
                    ny.b.h.invoke(this.B, t, g0Var53, Integer.valueOf((iIntValue27 << 3) & 112));
                } else {
                    g0Var54.V();
                }
                return b0.a;
            case 27:
                g0 g0Var55 = (l1.j) obj;
                int iIntValue28 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue28 & 6) == 0) {
                    iIntValue28 |= (iIntValue28 & 8) == 0 ? g0Var55.g(t) : g0Var55.i(t) ? 4 : 2;
                }
                g0 g0Var56 = g0Var55;
                if (g0Var56.S(iIntValue28 & 1, (iIntValue28 & 19) != 18)) {
                    ny.b.i.invoke(this.B, t, g0Var55, Integer.valueOf((iIntValue28 << 3) & 112));
                } else {
                    g0Var56.V();
                }
                return b0.a;
            case 28:
                return a(t, obj, obj2);
            default:
                g0 g0Var57 = (l1.j) obj;
                int iIntValue29 = ((Number) obj2).intValue();
                m.e(t, "t");
                if ((iIntValue29 & 6) == 0) {
                    iIntValue29 |= (iIntValue29 & 8) == 0 ? g0Var57.g(t) : g0Var57.i(t) ? 4 : 2;
                }
                g0 g0Var58 = g0Var57;
                if (g0Var58.S(iIntValue29 & 1, (iIntValue29 & 19) != 18)) {
                    ny.b.a.invoke(this.B, t, g0Var57, Integer.valueOf((iIntValue29 << 3) & 112));
                } else {
                    g0Var58.V();
                }
                return b0.a;
        }
    }
}
