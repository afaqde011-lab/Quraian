package kx;

import b2.r;
import g00.b0;
import l1.q;

public final class n implements u00.n {
    public final int A;
    public final Object B;
    public final r C;
    public final long D;
    public final int E;
    public final int F;

    public n(Object obj, r rVar, long j, int i, int i2, int i3) {
        this.A = i3;
        this.B = obj;
        this.C = rVar;
        this.D = j;
        this.E = i;
        this.F = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.n((String) this.B, this.C, this.D, (l1.j) obj, q.K(this.E | 1), this.F);
                break;
            case 1:
                ((Integer) obj2).getClass();
                rx.a.f((String) this.B, this.C, this.D, (l1.j) obj, q.K(this.E | 1), this.F);
                break;
            default:
                ((Integer) obj2).getClass();
                q0.c.a((e1.n) this.B, this.C, this.D, (l1.j) obj, q.K(this.E | 1), this.F);
                break;
        }
        return b0.a;
    }
}
