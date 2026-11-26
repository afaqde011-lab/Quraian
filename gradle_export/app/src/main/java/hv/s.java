package hv;

import com.revenuecat.purchases.common.Constants;
import g00.b0;
import java.util.List;
import l1.g0;

public final class s implements u00.p {
    public final List A;
    public final u30.f B;
    public final u30.f C;
    public final u30.f D;
    public final ot.b E;
    public final boolean F;
    public final int G;
    public final Integer H;
    public final boolean I;
    public final su.b J;
    public final boolean K;
    public final u00.k L;
    public final int M;

    public s(List list, u30.f fVar, u30.f fVar2, u30.f fVar3, ot.b bVar, boolean z, int i, Integer num, boolean z2, su.b bVar2, boolean z3, u00.k kVar, int i2) {
        this.A = list;
        this.B = fVar;
        this.C = fVar2;
        this.D = fVar3;
        this.E = bVar;
        this.F = z;
        this.G = i;
        this.H = num;
        this.I = z2;
        this.J = bVar2;
        this.K = z3;
        this.L = kVar;
        this.M = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        Integer num;
        j0.b bVar = (j0.b) obj;
        int iIntValue = ((Number) obj2).intValue();
        g0 g0Var = (l1.j) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (g0Var.g(bVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= g0Var.e(iIntValue) ? 32 : 16;
        }
        g0 g0Var2 = g0Var;
        if (g0Var2.S(i & 1, (i & 147) != 146)) {
            ot.a aVar = (ot.a) this.A.get(iIntValue);
            g0Var2.c0(-2107003444);
            int i2 = aVar.a;
            o oVarB = i.b(i2, this.B, this.C, this.D, this.E, this.F);
            String str = this.G + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i2;
            String str2 = oVarB.a;
            boolean z2 = false;
            boolean z3 = oVarB.b;
            String str3 = oVarB.c;
            boolean z4 = this.F;
            if (z4 && (num = this.H) != null && num.intValue() == i2) {
                z2 = true;
            }
            boolean z5 = !this.I;
            su.b bVar2 = this.J;
            if (bVar2 != null) {
                int i3 = bVar2.a;
                z = true ^ ((i2 > new z00.e(i3, bVar2.b, 1).B || i3 > i2) ? z2 : true);
            } else {
                z = z2;
            }
            boolean zH = g0Var2.h(z4);
            u00.k kVar = this.L;
            boolean zG = zH | g0Var2.g(kVar) | g0Var2.g(aVar);
            Object objN = g0Var2.N();
            if (zG || objN == l1.i.a) {
                objN = new a30.s(z4, kVar, aVar);
                g0Var2.n0(objN);
            }
            st.d.a(str, str2, z3, str3, this.K, this.E, z2, z5, (u00.a) objN, null, this.M, false, z, g0Var, 0, 0, 2560);
            g0Var2.r(false);
        } else {
            g0Var2.V();
        }
        return b0.a;
    }
}
