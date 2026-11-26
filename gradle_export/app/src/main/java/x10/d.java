package x10;

import m10.l0;
import m10.r0;

public final class d implements u00.k {
    public static final d B = new d(0);
    public static final d C = new d(1);
    public static final d D = new d(2);
    public static final d E = new d(3);
    public static final d F = new d(4);
    public static final d G = new d(5);
    public static final d H = new d(6);
    public final int A;

    public d(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        j10.c cVarB;
        String strV;
        boolean z = false;
        switch (this.A) {
            case 0:
                j10.c it = (j10.c) obj;
                int i = e.l;
                kotlin.jvm.internal.m.e(it, "it");
                return Boolean.valueOf(h00.q.F0(e0.f, c7.i.v(it)));
            case 1:
                j10.c it2 = (j10.c) obj;
                int i2 = e.l;
                kotlin.jvm.internal.m.e(it2, "it");
                if ((it2 instanceof j10.u) && h00.q.F0(e0.f, c7.i.v(it2))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                j10.c it3 = (j10.c) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return Boolean.valueOf(c7.i.F(it3));
            case 3:
                return ((r0) obj).getType();
            case 4:
                j10.c it4 = (j10.c) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                return Boolean.valueOf(c7.i.F(u20.d.k(it4)));
            case 5:
                j10.c it5 = (j10.c) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                int i3 = c.l;
                l0 l0Var = (l0) it5;
                if (g10.i.A(l0Var) && u20.d.b(l0Var, new v2.b0(l0Var, 1)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                j10.c it6 = (j10.c) obj;
                kotlin.jvm.internal.m.e(it6, "it");
                if (g10.i.A(it6)) {
                    int i4 = e.l;
                    b0 b0Var = null;
                    if (e0.e.contains(it6.getName()) && (cVarB = u20.d.b(it6, C)) != null && (strV = c7.i.v(cVarB)) != null) {
                        if (e0.b.contains(strV)) {
                            b0Var = b0.A;
                        } else {
                            b0Var = ((d0) h00.d0.O(e0.d, strV)) == d0.B ? b0.C : b0.B;
                        }
                    }
                    if (b0Var != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
