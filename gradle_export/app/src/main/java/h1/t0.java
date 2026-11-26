package h1;

import d6.f2;

public final class t0 implements u00.n {
    public final int A;
    public final long B;
    public final Object C;
    public final u00.n D;
    public final int E;

    public t0(long j9, Object obj, u00.n nVar, int i10, int i11) {
        this.A = i11;
        this.B = j9;
        this.C = obj;
        this.D = nVar;
        this.E = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).intValue();
                f.c(this.B, (m3.r0) this.C, this.D, (l1.j) obj, l1.q.K(this.E | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                e1.b(this.B, (m3.r0) this.C, this.D, (l1.j) obj, l1.q.K(this.E | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                d6.w.c(l1.q.K(this.E | 1), this.B, (f2) this.C, (l1.j) obj, this.D);
                break;
        }
        return g00.b0.a;
    }
}
