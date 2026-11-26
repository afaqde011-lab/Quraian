package es;

import b2.r;
import com.google.android.gms.internal.measurement.y3;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;

public final class f implements n {
    public final int A;
    public final u00.a B;
    public final u00.a C;
    public final r D;

    public f(u00.a aVar, u00.a aVar2, r rVar, int i11, int i12) {
        this.A = i12;
        this.B = aVar;
        this.C = aVar2;
        this.D = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                y3.i(this.B, this.C, this.D, jVar, q.K(1));
                break;
            default:
                kz.a.c(this.B, this.C, this.D, jVar, q.K(1));
                break;
        }
        return b0.f7770a;
    }
}
