package eq;

import b2.r;
import com.google.android.gms.internal.measurement.y3;
import g00.b0;
import l1.q;
import u00.n;

public final class i implements n {
    public final int A;
    public final u00.k B;
    public final r C;

    public i(u00.k kVar, r rVar, int i11, int i12) {
        this.A = i12;
        this.B = kVar;
        this.C = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.a(q.K(7), this.C, jVar, this.B);
                break;
            default:
                y3.c(q.K(1), this.C, jVar, this.B);
                break;
        }
        return b0.f7770a;
    }
}
