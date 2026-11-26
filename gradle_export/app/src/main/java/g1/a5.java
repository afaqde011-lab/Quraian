package g1;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

public final class a5 implements u00.o {
    public final int A;
    public final Object B;

    public a5(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        switch (this.A) {
            case 0:
                l1.j jVar = (l1.j) obj2;
                int iIntValue = ((Number) obj3).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ((u00.n) this.B).invoke(jVar, 0);
                } else {
                    g0Var.V();
                }
                return g00.b0.a;
            case 1:
                b2.r rVar = (b2.r) obj;
                ((Number) obj3).intValue();
                l1.g0 g0Var2 = (l1.g0) ((l1.j) obj2);
                g0Var2.c0(-1498516085);
                x.b1 b1VarP = x5.p(k1.q.B, g0Var2);
                x.b1 b1VarP2 = x5.p(k1.q.D, g0Var2);
                x.n1 n1Var = (x.n1) this.B;
                x.r1 r1Var = x.c.f16258k;
                f5.c cVar = n1Var.f16323a;
                l1.i1 i1Var = n1Var.f16326d;
                boolean zBooleanValue = ((Boolean) cVar.J0()).booleanValue();
                g0Var2.c0(-1553362193);
                float f3 = zBooleanValue ? 1.0f : 0.8f;
                g0Var2.r(false);
                Float fValueOf = Float.valueOf(f3);
                boolean zBooleanValue2 = ((Boolean) i1Var.getValue()).booleanValue();
                g0Var2.c0(-1553362193);
                float f10 = zBooleanValue2 ? 1.0f : 0.8f;
                g0Var2.r(false);
                Float fValueOf2 = Float.valueOf(f10);
                n1Var.f();
                g0Var2.c0(386845748);
                g0Var2.r(false);
                x.m1 m1VarO = x.c.o(n1Var, fValueOf, fValueOf2, b1VarP, r1Var, g0Var2, 196608);
                boolean zBooleanValue3 = ((Boolean) n1Var.f16323a.J0()).booleanValue();
                g0Var2.c0(2073045083);
                float f11 = zBooleanValue3 ? 1.0f : 0.0f;
                g0Var2.r(false);
                Float fValueOf3 = Float.valueOf(f11);
                boolean zBooleanValue4 = ((Boolean) i1Var.getValue()).booleanValue();
                g0Var2.c0(2073045083);
                float f12 = zBooleanValue4 ? 1.0f : 0.0f;
                g0Var2.r(false);
                Float fValueOf4 = Float.valueOf(f12);
                n1Var.f();
                g0Var2.c0(-281714272);
                g0Var2.r(false);
                b2.r rVarQ = i2.b0.q(rVar, ((Number) m1VarO.J.getValue()).floatValue(), ((Number) m1VarO.J.getValue()).floatValue(), ((Number) x.c.o(n1Var, fValueOf3, fValueOf4, b1VarP2, r1Var, g0Var2, 196608).J.getValue()).floatValue(), 0.0f, null, 131064);
                g0Var2.r(false);
                return rVarQ;
            case 2:
                long j9 = ((i2.t) obj).f7169a;
                l1.j jVar2 = (l1.j) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((l1.g0) jVar2).f(j9) ? 4 : 2;
                }
                l1.g0 g0Var3 = (l1.g0) jVar2;
                if (g0Var3.S(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    v0.i.b(((t0.d) this.B).f14315c, j9, jVar2, (iIntValue2 << 3) & 112);
                } else {
                    g0Var3.V();
                }
                return g00.b0.a;
            case 3:
                long j10 = ((i2.t) obj).f7169a;
                l1.j jVar3 = (l1.j) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                l1.g0 g0Var4 = (l1.g0) jVar3;
                if (g0Var4.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    v0.m.f15329a.a((Drawable) this.B, jVar3, 48);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
            default:
                long j11 = ((i2.t) obj).f7169a;
                l1.j jVar4 = (l1.j) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                l1.g0 g0Var5 = (l1.g0) jVar4;
                if (g0Var5.S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    v0.m.f15329a.b(((RemoteAction) this.B).getIcon(), jVar4, 48);
                } else {
                    g0Var5.V();
                }
                return g00.b0.a;
        }
    }
}
