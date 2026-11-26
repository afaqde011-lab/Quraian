package iz;

import b2.r;
import g00.b0;

public final class q implements u00.n {
    public final int A;
    public final String B;
    public final String C;
    public final r D;

    public q(String str, String str2, r rVar, int i, int i2) {
        this.A = i2;
        this.B = str;
        this.C = str2;
        this.D = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                d.t(this.B, this.C, this.D, jVar, l1.q.K(385));
                break;
            default:
                ox.a.d(this.B, this.C, this.D, jVar, l1.q.K(385));
                break;
        }
        return b0.a;
    }
}
