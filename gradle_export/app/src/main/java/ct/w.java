package ct;

import oo.o0;
import oo.z0;
import w.x0;
import w.y0;

public final class w implements u00.n {
    public final int A = 0;
    public final boolean B;
    public final b2.r C;
    public final int D;
    public final int E;
    public final Object F;
    public final Object G;
    public final Object H;

    public w(Integer num, Integer num2, u00.a aVar, boolean z, b2.r rVar, int i, int i2) {
        this.F = num;
        this.G = num2;
        this.H = aVar;
        this.B = z;
        this.C = rVar;
        this.D = i;
        this.E = i2;
    }

    public w(z0 z0Var, u00.k kVar, b2.r rVar, b2.r rVar2, boolean z, int i, int i2) {
        this.F = z0Var;
        this.G = kVar;
        this.C = rVar;
        this.H = rVar2;
        this.B = z;
        this.D = i;
        this.E = i2;
    }

    public w(boolean z, b2.r rVar, x0 x0Var, y0 y0Var, v1.c cVar, int i, int i2) {
        this.B = z;
        this.C = rVar;
        this.F = x0Var;
        this.G = y0Var;
        this.H = cVar;
        this.D = i;
        this.E = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                ca.v.j((Integer) this.F, (Integer) this.G, (u00.a) this.H, this.B, this.C, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
            case 1:
                ((Integer) obj2).getClass();
                gv.p.t(this.B, this.C, (x0) this.F, (y0) this.G, (v1.c) this.H, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                o0.g((z0) this.F, (u00.k) this.G, this.C, (b2.r) this.H, this.B, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
        }
        return g00.b0.a;
    }
}
