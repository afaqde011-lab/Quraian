package cs;

import b2.r;
import g00.b0;
import g1.x5;
import l1.q;

public final class j implements u00.n {
    public final int A = 0;
    public final r B;
    public final float C;
    public final long D;
    public final int E;
    public final int F;

    public j(int i, int i2, float f, long j, r rVar, int i3) {
        this.E = i;
        this.F = i2;
        this.C = f;
        this.D = j;
        this.B = rVar;
    }

    public j(r rVar, float f, long j, int i, int i2) {
        this.B = rVar;
        this.C = f;
        this.D = j;
        this.E = i;
        this.F = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = q.K(1);
                a.a(this.E, this.F, this.C, this.D, this.B, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                x5.c(this.B, this.C, this.D, (l1.j) obj, q.K(this.E | 1), this.F);
                break;
        }
        return b0.a;
    }
}
