package iw;

import b2.r;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;
import wr.k;

public final class c implements n {
    public final int A;
    public final String B;
    public final long C;
    public final r D;
    public final long E;

    public c(String str, long j, long j2, r rVar, int i, int i2) {
        this.A = i2;
        this.B = str;
        this.C = j;
        this.E = j2;
        this.D = rVar;
    }

    public c(String str, long j, r rVar, long j2, int i) {
        this.A = 1;
        this.B = str;
        this.C = j;
        this.D = rVar;
        this.E = j2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.g(q.K(28039), this.C, this.E, this.D, this.B, (j) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                np.a.a(q.K(1), this.C, this.E, this.D, this.B, (j) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                k.M(q.K(28039), this.C, this.E, this.D, this.B, (j) obj);
                break;
        }
        return b0.a;
    }
}
