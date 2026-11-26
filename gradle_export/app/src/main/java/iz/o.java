package iz;

import ev.s;
import ev.t;
import g00.b0;

public final class o implements u00.n {
    public final int A;
    public final boolean B;
    public final boolean C;
    public final Object D;
    public final g00.e E;
    public final int F;

    public o(t tVar, u00.k kVar, boolean z, boolean z2, int i) {
        this.A = 2;
        this.D = tVar;
        this.E = kVar;
        this.B = z;
        this.C = z2;
        this.F = i;
    }

    public o(boolean z, boolean z2, u00.a aVar, u00.a aVar2, int i, int i2) {
        this.A = i2;
        this.B = z;
        this.C = z2;
        this.D = aVar;
        this.E = aVar2;
        this.F = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                d.r(this.B, this.C, (u00.a) this.D, (u00.a) this.E, (l1.j) obj, l1.q.K(this.F | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                d.r(this.B, this.C, (u00.a) this.D, (u00.a) this.E, (l1.j) obj, l1.q.K(this.F | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                s.c((t) this.D, (u00.k) this.E, this.B, this.C, (l1.j) obj, l1.q.K(this.F | 1));
                break;
        }
        return b0.a;
    }
}
