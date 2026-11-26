package vy;

import b2.r;
import com.google.android.gms.internal.measurement.g4;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;
import wr.g;

public final class b implements n {
    public final int A = 1;
    public final int B;
    public final u00.a C;
    public final r D;
    public final int E;

    public b(int i, u00.a aVar, r rVar, int i2) {
        this.B = i;
        this.C = aVar;
        this.D = rVar;
        this.E = i2;
    }

    public b(u00.a aVar, r rVar, int i, int i2) {
        this.C = aVar;
        this.D = rVar;
        this.B = i;
        this.E = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                g4.f(q.K(this.B | 1), this.E, this.D, jVar, this.C);
                break;
            default:
                g.h(this.B, q.K(this.E | 1), this.D, jVar, this.C);
                break;
        }
        return b0.a;
    }
}
