package b2;

import androidx.compose.ui.platform.ComposeView;
import c4.z;
import g00.b0;
import java.util.List;
import kotlin.jvm.internal.d0;
import l1.g0;
import l1.z0;
import qd.s0;

public final class n extends kotlin.jvm.internal.n implements u00.n {
    public final int A;
    public final Object B;

    public n(Object obj, int i10) {
        super(2);
        this.A = i10;
        this.B = obj;
    }

    public n(Object obj, int i10, int i11) {
        super(2);
        this.A = i11;
        this.B = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                r rVar = (r) obj;
                r rVarB = (p) obj2;
                l1.j jVar = (l1.j) this.B;
                if (rVarB instanceof l) {
                    u00.o oVar = ((l) rVarB).B;
                    d0.d(3, oVar);
                    rVarB = a.b((r) oVar.invoke(o.A, jVar, 0), jVar);
                }
                return rVar.V(rVarB);
            case 1:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var = (g0) jVar2;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((c3.a) this.B).a(jVar2, 0);
                } else {
                    g0Var.V();
                }
                return b0.a;
            case 2:
                ((Number) obj2).intValue();
                ((ComposeView) this.B).a((l1.j) obj, l1.q.K(1));
                return b0.a;
            case 3:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                g0 g0Var2 = (g0) jVar3;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objN = g0Var2.N();
                    if (objN == l1.i.f9868a) {
                        objN = c4.b.B;
                        g0Var2.n0(objN);
                    }
                    s0.M(j3.q.c(o.A, false, (u00.k) objN), (u00.n) ((z0) this.B).getValue(), jVar3, 0);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 4:
                ((Number) obj2).intValue();
                ((c4.u) this.B).a((l1.j) obj, l1.q.K(1));
                return b0.a;
            case 5:
                ((Number) obj2).intValue();
                ((z) this.B).a((l1.j) obj, l1.q.K(1));
                return b0.a;
            case 6:
                ((d2.d) this.B).i(((Number) obj).intValue(), (j3.s) obj2);
                return b0.a;
            case 7:
                l1.j jVar4 = (l1.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                g0 g0Var3 = (g0) jVar4;
                if (g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    List list = (List) this.B;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        u00.n nVar = (u00.n) list.get(i10);
                        int iHashCode = Long.hashCode(g0Var3.T);
                        b3.i.f2042c.getClass();
                        b3.g gVar = b3.h.f2036c;
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar);
                        } else {
                            g0Var3.q0();
                        }
                        l1.q.I(Integer.valueOf(iHashCode), jVar4, b3.h.f2040g);
                        nVar.invoke(jVar4, 0);
                        g0Var3.r(true);
                    }
                } else {
                    g0Var3.V();
                }
                return b0.a;
            default:
                ((Number) obj2).intValue();
                z2.d0.a((v1.c) this.B, (l1.j) obj, l1.q.K(7));
                return b0.a;
        }
    }
}
