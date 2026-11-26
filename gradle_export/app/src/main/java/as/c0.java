package as;

import com.google.android.gms.internal.measurement.z3;
import h0.z1;
import l1.p2;

public final class c0 implements u00.o {
    public final int A;
    public final float B;
    public final Object C;

    public c0(float f, Object obj, int i) {
        this.A = i;
        this.B = f;
        this.C = obj;
    }

    public c0(Object obj, float f, int i) {
        this.A = i;
        this.C = obj;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                u0 u0Var = (u0) this.C;
                j0.b item = (j0.b) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ox.a.l(h0.c.E(b2.o.A, this.B, 0.0f, 2), v1.d.d(-810469399, new a1.w(u0Var, 3), g0Var), g0Var, 48);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                String str = (String) this.C;
                j0.b item2 = (j0.b) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    float f = this.B;
                    rx.a.f(str, h0.c.G(z1.d(b2.o.A, 1.0f), f, 24, f, 0.0f, 8), 0L, g0Var3, 0, 4);
                } else {
                    g0Var4.V();
                }
                break;
            case 2:
                gm.a aVar = (gm.a) this.C;
                j0.b item3 = (j0.b) obj;
                l1.g0 g0Var5 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item3, "$this$item");
                l1.g0 g0Var6 = g0Var5;
                if (!g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    g0Var6.V();
                } else if (aVar == gm.a.A) {
                    g0Var6.c0(-873621346);
                    rx.a.f(z3.U(g0Var5, 2131887154), h0.c.D(z1.d(b2.o.A, 1.0f), this.B, 16), 0L, g0Var5, 0, 4);
                    g0Var6.r(false);
                } else {
                    g0Var6.c0(-873311346);
                    g0Var6.r(false);
                }
                break;
            case 3:
                hx.x xVar = (hx.x) this.C;
                j0.b item4 = (j0.b) obj;
                l1.g0 g0Var7 = (l1.j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item4, "$this$item");
                l1.g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ix.k.d(0, h0.c.E(b2.o.A, this.B, 0.0f, 2), g0Var7, xVar.g);
                } else {
                    g0Var8.V();
                }
                break;
            case 4:
                l1.z0 z0Var = (l1.z0) this.C;
                w.d0 AnimatedVisibility = (w.d0) obj;
                l1.g0 g0Var9 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                bl.a aVar2 = (bl.a) z0Var.getValue();
                if (aVar2 == null) {
                    l1.g0 g0Var10 = g0Var9;
                    g0Var10.c0(-1361100459);
                    g0Var10.r(false);
                } else {
                    l1.g0 g0Var11 = g0Var9;
                    g0Var11.c0(-1361100458);
                    String str2 = aVar2.b;
                    ol.c cVar = aVar2.c;
                    float f2 = this.B;
                    ol.d.a(str2, h0.c.G(h0.c.M(b2.o.A, h0.c.e), f2, 8, f2, 0.0f, 8), cVar, g0Var9, 0);
                    g0Var11.r(false);
                }
                break;
            default:
                p2 p2Var = (p2) this.C;
                j0.b item5 = (j0.b) obj;
                l1.g0 g0Var12 = (l1.j) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item5, "$this$item");
                l1.g0 g0Var13 = g0Var12;
                if (g0Var13.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    wr.k.t(0, h0.c.E(b2.o.A, this.B, 0.0f, 2), g0Var12, ((Boolean) p2Var.getValue()).booleanValue());
                } else {
                    g0Var13.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
