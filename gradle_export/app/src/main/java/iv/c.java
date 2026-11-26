package iv;

import g00.b0;
import g1.z6;
import h0.z1;
import h00.d0;
import i2.t;
import java.util.Map;
import kotlin.jvm.internal.a0;
import l1.g0;
import l1.p2;
import l1.q1;
import m3.r0;
import q3.u;
import x.n1;

public final class c implements u00.p {
    public final int A;
    public final Object B;
    public final Object C;

    public c(Object obj, Object obj2, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A) {
            case 0:
                u30.b bVar = (u30.b) this.B;
                p2 p2Var = (p2) this.C;
                int iIntValue = ((Integer) obj).intValue();
                ((Boolean) obj2).getClass();
                g0 g0Var = (l1.j) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= g0Var.e(iIntValue) ? 4 : 2;
                }
                boolean z = false;
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    Integer num = (Integer) h00.q.O0(((Number) p2Var.getValue()).intValue(), bVar);
                    if (num != null && num.intValue() == iIntValue) {
                        z = true;
                    }
                    z6.b(String.valueOf(iIntValue), z1.d(b2.o.A, 1.0f), t.b(z ? 0.9f : 0.55f, dl.a.i), r.p, (u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24624, 0, 261096);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                n1 n1Var = (n1) this.B;
                Map map = (Map) this.C;
                w.p pVar = (w.p) obj;
                q9.c cVar = (q9.c) obj2;
                l1.j jVar = (l1.j) obj3;
                ((Integer) obj4).getClass();
                l1.q.b(new q1[]{r6.d.a.a(kh.o.M(kotlin.jvm.internal.m.a(n1Var.a.J0(), n1Var.d.getValue()) ? androidx.lifecycle.p.E : androidx.lifecycle.p.D, jVar)), r9.a.a.a(pVar), q9.f.a.a(d0.O(map, new g00.k(a0.a.b(cVar.getClass()), cVar.getKey())))}, v1.d.d(-1734941436, new m3.a(cVar, 17), jVar), jVar, 56);
                break;
        }
        return b0.a;
    }
}
