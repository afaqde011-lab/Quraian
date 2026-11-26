package eu;

import g1.z6;
import gv.c0;
import l1.g0;
import m3.r0;

public final class n implements u00.n {
    public final int A;
    public final String B;

    public n(String str, int i) {
        this.A = i;
        this.B = str;
    }

    public n(String str, int i, int i2) {
        this.A = i2;
        this.B = str;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.o(this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 1:
                ((Integer) obj2).getClass();
                c0.d(this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                kotlin.jvm.internal.m.e((cy.e) obj2, "<unused var>");
                return this.B + "-" + iIntValue;
            case 3:
                ((Integer) obj2).getClass();
                kh.n.o(this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 4:
                ((Integer) obj2).getClass();
                lp.f.b(this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 5:
                ((Integer) obj2).getClass();
                lp.l.b(this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 6:
                ((Integer) obj2).getClass();
                kh.n.b(this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 7:
                ((Integer) obj2).getClass();
                mx.a.g(this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case 8:
                ((Integer) obj2).getClass();
                st.j.g(this.B, (l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            default:
                g0 g0Var = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z6.b(this.B, (b2.r) null, i2.t.b(0.5f, dl.a.k), 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 0, 24960, 241658);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
        }
    }
}
