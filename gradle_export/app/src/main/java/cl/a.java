package cl;

import com.google.android.gms.internal.measurement.g4;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;
import wr.g;

public final class a implements n {
    public final int A;
    public final boolean B;
    public final long C;
    public final int D;

    public a(int i, long j, int i2, boolean z) {
        this.A = i2;
        this.B = z;
        this.C = j;
        this.D = i;
    }

    public a(int i, long j, boolean z) {
        this.A = 3;
        this.C = j;
        this.B = z;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                g4.d(q.K(this.D | 1), this.C, jVar, this.B);
                break;
            case 1:
                g4.d(q.K(this.D | 1), this.C, jVar, this.B);
                break;
            case 2:
                g4.d(q.K(this.D | 1), this.C, jVar, this.B);
                break;
            default:
                g.f(q.K(this.D | 1), this.C, jVar, this.B);
                break;
        }
        return b0.a;
    }
}
