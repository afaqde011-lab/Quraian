package wr;

import com.google.android.gms.internal.measurement.z3;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class s implements u00.p {
    public final List A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final u00.a F;
    public final u00.a G;
    public final u00.a H;
    public final u00.a I;
    public final u00.a J;
    public final u00.a K;

    public s(List list, String str, String str2, String str3, String str4, u00.a aVar, u00.a aVar2, u00.a aVar3, u00.a aVar4, u00.a aVar5, u00.a aVar6) {
        this.A = list;
        this.B = str;
        this.C = str2;
        this.D = str3;
        this.E = str4;
        this.F = aVar;
        this.G = aVar2;
        this.H = aVar3;
        this.I = aVar4;
        this.J = aVar5;
        this.K = aVar6;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        String strU;
        String strU2;
        u00.a aVar;
        u00.a aVar2;
        j0.b bVar = (j0.b) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.j) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (g0Var.g(bVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= g0Var.e(iIntValue) ? 32 : 16;
        }
        l1.g0 g0Var2 = g0Var;
        if (g0Var2.S(i & 1, (i & 147) != 146)) {
            qr.b bVar2 = (qr.b) this.A.get(iIntValue);
            g0Var2.c0(-718441173);
            int iOrdinal = bVar2.ordinal();
            if (iOrdinal == 0) {
                g0Var2.c0(1916487831);
                strU = z3.U(g0Var, 2131886562);
                g0Var2.r(false);
            } else if (iOrdinal == 1) {
                g0Var2.c0(1916491317);
                g0Var2.r(false);
                strU = this.B;
            } else if (iOrdinal == 2) {
                g0Var2.c0(1916493782);
                g0Var2.r(false);
                strU = this.C;
            } else {
                if (iOrdinal != 3) {
                    throw oi.k.r(g0Var2, 1916486021, false);
                }
                g0Var2.c0(1916496113);
                strU = z3.U(g0Var, 2131886327);
                g0Var2.r(false);
            }
            String str = strU;
            int iOrdinal2 = bVar2.ordinal();
            if (iOrdinal2 == 0) {
                g0Var2.c0(1916501562);
                strU2 = z3.U(g0Var, 2131886561);
                g0Var2.r(false);
            } else if (iOrdinal2 == 1) {
                g0Var2.c0(1916505144);
                g0Var2.r(false);
                strU2 = this.D;
            } else if (iOrdinal2 == 2) {
                g0Var2.c0(1916507705);
                g0Var2.r(false);
                strU2 = this.E;
            } else {
                if (iOrdinal2 != 3) {
                    throw oi.k.r(g0Var2, 1916499168, false);
                }
                g0Var2.c0(1916510779);
                strU2 = z3.U(g0Var, 2131886318);
                g0Var2.r(false);
            }
            int iOrdinal3 = bVar2.ordinal();
            if (iOrdinal3 == 0) {
                aVar = this.F;
            } else if (iOrdinal3 == 1) {
                aVar = this.G;
            } else if (iOrdinal3 == 2) {
                aVar = this.H;
            } else {
                if (iOrdinal3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = this.I;
            }
            int iOrdinal4 = bVar2.ordinal();
            if (iOrdinal4 == 0) {
                aVar2 = this.J;
            } else if (iOrdinal4 == 1 || iOrdinal4 == 2) {
                aVar2 = null;
            } else {
                if (iOrdinal4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2 = this.K;
            }
            k.k(bVar2, str, strU2, aVar, j0.b.c(bVar), aVar2, g0Var, 0);
            g0Var2.r(false);
        } else {
            g0Var2.V();
        }
        return g00.b0.a;
    }
}
