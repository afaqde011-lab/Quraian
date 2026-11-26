package fy;

import as.d0;
import com.google.android.gms.internal.measurement.z3;
import h0.z1;
import l1.g0;
import qd.s0;

public final class s implements u00.o {
    public final int A = 1;
    public final float B;
    public final u C;
    public final u00.k D;

    public s(float f, u uVar, u00.k kVar) {
        this.B = f;
        this.C = uVar;
        this.D = kVar;
    }

    public s(u uVar, float f, u00.k kVar) {
        this.C = uVar;
        this.B = f;
        this.D = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strU;
        int i = this.A;
        j0.b item = (j0.b) obj;
        g0 g0Var = (l1.j) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                kotlin.jvm.internal.m.e(item, "$this$item");
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    u uVar = this.C;
                    boolean z = uVar.e;
                    b2.o oVar = b2.o.A;
                    float f = this.B;
                    if (z || !uVar.f) {
                        g0Var2.c0(-1041884837);
                        s0.J(h0.c.E(oVar, f, 0.0f, 2), false, g0Var, 0, 2);
                        g0Var2.r(false);
                    } else {
                        g0Var2.c0(-1042571983);
                        b2.r rVarO = kh.o.O(oVar, f);
                        String strU2 = z3.U(g0Var, 2131886549);
                        String strU3 = z3.U(g0Var, 2131886548);
                        u00.a aVar = null;
                        if (uVar.b()) {
                            g0Var2.c0(-1042264215);
                            strU = z3.U(g0Var, 2131886539);
                            g0Var2.r(false);
                        } else {
                            g0Var2.c0(-1042166565);
                            g0Var2.r(false);
                            strU = null;
                        }
                        if (uVar.b()) {
                            g0Var2.c0(-1042055058);
                            u00.k kVar = this.D;
                            boolean zG = g0Var2.g(kVar);
                            Object objN = g0Var2.N();
                            if (zG || objN == l1.i.a) {
                                objN = new r(1, kVar);
                                g0Var2.n0(objN);
                            }
                            aVar = (u00.a) objN;
                            g0Var2.r(false);
                        } else {
                            g0Var2.c0(-1041962213);
                            g0Var2.r(false);
                        }
                        hy.a.a(strU2, strU3, rVarO, strU, aVar, g0Var, 0, 0);
                        g0Var2.r(false);
                    }
                } else {
                    g0Var2.V();
                }
                break;
            default:
                kotlin.jvm.internal.m.e(item, "$this$item");
                g0 g0Var3 = g0Var;
                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b2.r rVarD = h0.c.D(z1.d(b2.o.A, 1.0f), this.B, 16);
                    String str = this.C.a;
                    u00.k kVar2 = this.D;
                    boolean zG2 = g0Var3.g(kVar2);
                    Object objN2 = g0Var3.N();
                    if (zG2 || objN2 == l1.i.a) {
                        objN2 = new d0(20, kVar2);
                        g0Var3.n0(objN2);
                    }
                    ix.a.g(str, (u00.k) objN2, rVarD, false, 2131886550, g0Var, 3072, 0);
                } else {
                    g0Var3.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
