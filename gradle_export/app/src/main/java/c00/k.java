package c00;

import ab.a0;
import g00.b0;
import g1.z7;
import l1.g0;

public final class k implements u00.n {
    public final int A;
    public final float B;
    public final Object C;
    public final Object D;

    public k(Object obj, float f, Object obj2, int i, int i2) {
        this.A = i2;
        this.D = obj;
        this.B = f;
        this.C = obj2;
    }

    public k(ln.c cVar, float f, String str) {
        this.A = 3;
        this.D = cVar;
        this.B = f;
        this.C = str;
    }

    public k(lo.b bVar, to.a aVar, float f, int i) {
        this.A = 6;
        this.D = bVar;
        this.C = aVar;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.c((u00.a) this.D, this.B, (v1.c) this.C, (l1.j) obj, l1.q.K(433));
                break;
            case 1:
                ((Integer) obj2).getClass();
                z7.a((b2.r) this.D, this.B, (v1.c) this.C, (l1.j) obj, l1.q.K(433));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gn.a.a((hn.a) this.D, this.B, (b6.m) this.C, (l1.j) obj, l1.q.K(1));
                break;
            case 3:
                ln.c cVar = (ln.c) this.D;
                String str = (String) this.C;
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i = cVar.b;
                    f50.c.f(i > 0 ? a0.x(cVar.a / (i * 60), 0.0f, 1.0f) : 0.0f, this.B, null, g0Var, 0);
                    float f = 22;
                    float f2 = 0;
                    w00.a.b(new j6.o(w50.c.i0(f), w50.c.i0(f2), w50.c.i0(f), w50.c.i0(f2)), 0, 1, v1.d.d(-143680865, new fv.a(str, 5), g0Var), g0Var, 3072, 2);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 4:
                ((Integer) obj2).getClass();
                kx.a.a((String) this.D, this.B, (b2.r) this.C, (l1.j) obj, l1.q.K(385));
                break;
            case 5:
                ((Integer) obj2).getClass();
                pn.d.b((qn.a) this.D, this.B, (b6.m) this.C, (l1.j) obj, l1.q.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wr.g.i((lo.b) this.D, (to.a) this.C, this.B, (l1.j) obj, l1.q.K(1));
                break;
        }
        return b0.a;
    }
}
