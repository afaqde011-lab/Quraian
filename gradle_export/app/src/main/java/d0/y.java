package d0;

import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.Quranify.R;
import g1.o3;

public final class y implements u00.o {
    public final int A;
    public final u00.k B;

    public y(int i11, u00.k kVar) {
        this.A = i11;
        this.B = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                this.B.invoke(new h2.b(((v2.s) obj2).f21253c));
                break;
            case 1:
                l1.j jVar = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e((h0.w1) obj, "$this$LiquidBottomTabs");
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f3 = eq.m.f7230b;
                    b2.o oVar = b2.o.A;
                    b2.r rVarC = h0.z1.c(h0.z1.q(oVar, f3), 1.0f);
                    j3.k kVar = new j3.k(4);
                    u00.k kVar2 = this.B;
                    boolean zG = g0Var.g(kVar2);
                    Object objN = g0Var.N();
                    if (zG || objN == l1.i.f13421a) {
                        objN = new bt.t0(19, kVar2);
                        g0Var.n0(objN);
                    }
                    b2.r rVarB = androidx.compose.foundation.b.b(rVarC, null, null, false, kVar, (u00.a) objN, 12);
                    z2.w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM = g0Var.m();
                    b2.r rVarC2 = b2.a.c(rVarB, jVar);
                    b3.i.f2384c.getClass();
                    b3.g gVar = b3.h.f2377b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD, jVar, b3.h.f2381f);
                    l1.q.I(m1VarM, jVar, b3.h.f2380e);
                    l1.q.I(Integer.valueOf(iHashCode), jVar, b3.h.f2382g);
                    l1.q.E(jVar, b3.h.f2383h);
                    l1.q.I(rVarC2, jVar, b3.h.f2379d);
                    o3.a(y3.R(R.drawable.ic_search, jVar, 0), z3.U(jVar, R.string.search_tab_title), h0.z1.m(oVar, 20), dl.a.f6160k, jVar, 392, 0);
                    g0Var.r(true);
                } else {
                    g0Var.V();
                }
                break;
            case 2:
                h0.w1 LiquidBottomTabs = (h0.w1) obj;
                l1.j jVar2 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(LiquidBottomTabs, "$this$LiquidBottomTabs");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((l1.g0) jVar2).g(LiquidBottomTabs) ? 4 : 2;
                }
                int i11 = iIntValue2;
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(i11 & 1, (i11 & 19) != 18)) {
                    for (int i12 = 0; i12 < 5; i12++) {
                        u00.k kVar3 = this.B;
                        boolean zG2 = g0Var2.g(kVar3) | g0Var2.e(i12);
                        Object objN2 = g0Var2.N();
                        if (zG2 || objN2 == l1.i.f13421a) {
                            objN2 = new eq.d(i12, 1, kVar3);
                            g0Var2.n0(objN2);
                        }
                        sm.k0.a(LiquidBottomTabs, (u00.a) objN2, null, v1.d.d(929726447, new eq.l(i12, 0), jVar2), jVar2, (i11 & 14) | 3072);
                    }
                } else {
                    g0Var2.V();
                }
                break;
            default:
                j0.b item = (j0.b) obj;
                l1.j jVar3 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strU = z3.U(jVar3, R.string.clear_all_data_button);
                    String strU2 = z3.U(jVar3, R.string.data_management_subtitle);
                    u00.k kVar4 = this.B;
                    boolean zG3 = g0Var3.g(kVar4);
                    Object objN3 = g0Var3.N();
                    if (zG3 || objN3 == l1.i.f13421a) {
                        objN3 = new wy.l(2, kVar4);
                        g0Var3.n0(objN3);
                    }
                    yy.b.a(strU, strU2, (u00.a) objN3, jVar3, 0);
                } else {
                    g0Var3.V();
                }
                break;
        }
        return g00.b0.f7770a;
    }
}
