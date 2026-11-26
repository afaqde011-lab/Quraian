package as;

import android.content.Context;
import com.google.android.gms.internal.measurement.z3;
import g1.j7;
import g1.v5;
import h0.z1;
import l1.p2;
import z2.l1;

public final class p0 implements u00.o {
    public final int A;
    public final float B;

    public p0(float f, int i) {
        this.A = i;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                j0.b item = (j0.b) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bs.a.c(h0.c.G(h0.c.E(b2.o.A, this.B, 0.0f, 2), 0.0f, 12, 0.0f, 16, 5), g0Var, 0);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 1:
                j0.b item2 = (j0.b) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    h0.c.h(z1.e(b2.o.A, this.B), g0Var3);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
            case 2:
                j0.b item3 = (j0.b) obj;
                l1.g0 g0Var5 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item3, "$this$item");
                l1.g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    hy.a.a(z3.U(g0Var5, 2131886549), z3.U(g0Var5, 2131886548), kh.o.O(b2.o.A, this.B), null, null, g0Var5, 0, 24);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
            case 3:
                j0.b item4 = (j0.b) obj;
                l1.g0 g0Var7 = (l1.j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item4, "$this$item");
                l1.g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    hy.a.a(z3.U(g0Var7, 2131886549), z3.U(g0Var7, 2131886546), kh.o.O(b2.o.A, this.B), null, null, g0Var7, 0, 24);
                } else {
                    g0Var8.V();
                }
                return g00.b0.a;
            case 4:
                j0.b item5 = (j0.b) obj;
                l1.g0 g0Var9 = (l1.j) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item5, "$this$item");
                l1.g0 g0Var10 = g0Var9;
                if (g0Var10.S(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    rd.a.d(kh.o.O(z1.d(b2.o.A, 1.0f), this.B), g0Var9, 0);
                } else {
                    g0Var10.V();
                }
                return g00.b0.a;
            case 5:
                j0.b item6 = (j0.b) obj;
                l1.g0 g0Var11 = (l1.j) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item6, "$this$item");
                l1.g0 g0Var12 = g0Var11;
                if (g0Var12.S(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    rd.a.d(kh.o.O(z1.d(b2.o.A, 1.0f), this.B), g0Var11, 0);
                } else {
                    g0Var12.V();
                }
                return g00.b0.a;
            case 6:
                h0.t BoxWithConstraints = (h0.t) obj;
                l1.g0 g0Var13 = (l1.j) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= g0Var13.g(BoxWithConstraints) ? 4 : 2;
                }
                l1.g0 g0Var14 = g0Var13;
                if (g0Var14.S(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    float f = p30.f.i0(new y3.f(BoxWithConstraints.c()), new y3.f(BoxWithConstraints.b())).A;
                    b2.o oVar = b2.o.A;
                    b2.i iVar = b2.b.E;
                    h0.s sVar = h0.s.a;
                    b2.r rVarI = z1.i(sVar.a(oVar, iVar), f);
                    Object objN = g0Var14.N();
                    if (objN == l1.i.a) {
                        objN = new j7(27);
                        g0Var14.n0(objN);
                    }
                    kz.f.a(this.B, 0, 0, i2.b0.p(rVarI, (u00.k) objN), g0Var13);
                    h0.o.a(z.n.f(sVar.b(), i2.t.b(0.4f, i2.t.b), i2.b0.b), g0Var13, 0);
                } else {
                    g0Var14.V();
                }
                return g00.b0.a;
            case 7:
                h0.t BoxWithConstraints2 = (h0.t) obj;
                l1.g0 g0Var15 = (l1.j) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints2, "$this$BoxWithConstraints");
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= g0Var15.g(BoxWithConstraints2) ? 4 : 2;
                }
                l1.g0 g0Var16 = g0Var15;
                if (g0Var16.S(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    b2.r rVarI2 = z1.i(b2.o.A, p30.f.i0(new y3.f(BoxWithConstraints2.c()), new y3.f(BoxWithConstraints2.b())).A);
                    Object objN2 = g0Var16.N();
                    if (objN2 == l1.i.a) {
                        objN2 = new ks.e(22);
                        g0Var16.n0(objN2);
                    }
                    kz.f.a(this.B, 0, 0, i2.b0.p(rVarI2, (u00.k) objN2), g0Var15);
                    h0.s sVar2 = h0.s.a;
                    h0.o.a(z.n.f(sVar2.b(), i2.t.b(0.4f, i2.t.b), i2.b0.b), g0Var15, 0);
                    b2.r rVarB = sVar2.b();
                    Float fValueOf = Float.valueOf(0.0f);
                    long j = i2.t.f;
                    h0.o.a(z.n.e(rVarB, sg.f.Q(new g00.k[]{new g00.k(fValueOf, new i2.t(j)), new g00.k(Float.valueOf(0.55f), new i2.t(j)), new g00.k(Float.valueOf(1.0f), new i2.t(dl.a.L))}), (i2.t0) null, 6), g0Var15, 0);
                } else {
                    g0Var16.V();
                }
                return g00.b0.a;
            case 8:
                h0.t BoxWithConstraints3 = (h0.t) obj;
                l1.g0 g0Var17 = (l1.j) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints3, "$this$BoxWithConstraints");
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= g0Var17.g(BoxWithConstraints3) ? 4 : 2;
                }
                l1.g0 g0Var18 = g0Var17;
                if (g0Var18.S(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    float f2 = p30.f.i0(new y3.f(BoxWithConstraints3.c()), new y3.f(BoxWithConstraints3.b())).A;
                    b2.o oVar2 = b2.o.A;
                    b2.i iVar2 = b2.b.E;
                    h0.s sVar3 = h0.s.a;
                    b2.r rVarI3 = z1.i(sVar3.a(oVar2, iVar2), f2);
                    Object objN3 = g0Var18.N();
                    if (objN3 == l1.i.a) {
                        objN3 = new ks.e(23);
                        g0Var18.n0(objN3);
                    }
                    kz.f.a(this.B, 0, 0, i2.b0.p(rVarI3, (u00.k) objN3), g0Var17);
                    h0.o.a(z.n.f(sVar3.b(), i2.t.b(0.4f, i2.t.b), i2.b0.b), g0Var17, 0);
                } else {
                    g0Var18.V();
                }
                return g00.b0.a;
            case 9:
                w.d0 AnimatedVisibility = (w.d0) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                v5.a(z1.m(b2.o.A, this.B), dl.a.k, 2, 0L, 0, 0.0f, (l1.j) obj2, 384, 56);
                return g00.b0.a;
            case 10:
                h0.t BoxWithConstraints4 = (h0.t) obj;
                l1.g0 g0Var19 = (l1.j) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(BoxWithConstraints4, "$this$BoxWithConstraints");
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= g0Var19.g(BoxWithConstraints4) ? 4 : 2;
                }
                l1.g0 g0Var20 = g0Var19;
                if (g0Var20.S(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    p2 p2VarA = x.d.a(BoxWithConstraints4.c() * this.B, (x.y) null, "onboarding_top_progress_width", g0Var19, 384, 10);
                    b2.o oVar3 = b2.o.A;
                    b2.r rVarD = z1.d(oVar3, 1.0f);
                    float f3 = mu.n.a;
                    b2.r rVarE = z1.e(rVarD, f3);
                    p0.e eVar = p0.f.a;
                    b2.r rVarC = f2.h.c(rVarE, eVar);
                    long j2 = dl.a.v;
                    i2.o0 o0Var = i2.b0.b;
                    h0.o.a(z.n.f(rVarC, j2, o0Var), g0Var19, 0);
                    h0.o.a(z.n.f(f2.h.c(z1.e(z1.q(oVar3, ((y3.f) p2VarA.getValue()).A), f3), eVar), dl.a.i, o0Var), g0Var19, 0);
                } else {
                    g0Var20.V();
                }
                return g00.b0.a;
            case 11:
                j6.q Row = (j6.q) obj;
                l1.g0 g0Var21 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(Row, "$this$Row");
                l1.g0 g0Var22 = g0Var21;
                String string = ((Context) g0Var22.k(b6.g.b)).getString(2131887379);
                kotlin.jvm.internal.m.d(string, "getString(...)");
                b6.m mVarA = Row.a();
                float fB = y3.h.b(((y3.h) g0Var22.k(b6.g.a)).a);
                float f4 = 2;
                kh.n.r(string, mVarA, new y3.f((((fB - (dn.m.b * f4)) - this.B) - 14) - 22), g0Var21, 0, 0);
                a.a.f(ze.d.U(f4), g0Var21, 0);
                kh.n.p(20, (b6.m) null, g0Var21, 6);
                return g00.b0.a;
            default:
                z2.y0 layout = (z2.y0) obj;
                z2.v0 measurable = (z2.v0) obj2;
                kotlin.jvm.internal.m.e(layout, "$this$layout");
                kotlin.jvm.internal.m.e(measurable, "measurable");
                l1 l1VarO = measurable.O(y3.a.a(((y3.a) obj3).a, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 5));
                float f5 = l1VarO.A;
                float f6 = this.B;
                return layout.o0(w00.a.F(f5 * f6), w00.a.F(l1VarO.B * f6), h00.y.A, new kz.c(l1VarO, f6, 2));
        }
    }
}
