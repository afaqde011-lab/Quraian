package pl;

import b2.r;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import g00.b0;

public final class c implements u00.n {
    public final int A;
    public final boolean B;
    public final u00.a C;
    public final r D;
    public final long E;
    public final v1.c F;
    public final int G;

    public c(boolean z, u00.a aVar, r rVar, long j, v1.c cVar, int i, int i2) {
        this.A = i2;
        this.B = z;
        this.C = aVar;
        this.D = rVar;
        this.E = j;
        this.F = cVar;
        this.G = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                g4.k(this.B, this.C, this.D, this.E, this.F, (l1.j) obj, l1.q.K(this.G | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                b5.g(this.B, this.C, this.D, this.E, this.F, (l1.j) obj, l1.q.K(this.G | 1));
                break;
        }
        return b0.a;
    }
}
