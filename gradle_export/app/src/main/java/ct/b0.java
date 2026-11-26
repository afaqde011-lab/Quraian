package ct;

import com.google.android.gms.internal.measurement.z3;

public final class b0 implements u00.n {
    public final int A = 0;
    public final u30.b B;
    public final boolean C;
    public final b2.r D;
    public final int E;

    public b0(u30.b bVar, b2.r rVar, boolean z, int i, int i2) {
        this.B = bVar;
        this.D = rVar;
        this.C = z;
        this.E = i2;
    }

    public b0(u30.b bVar, boolean z, b2.r rVar, int i) {
        this.B = bVar;
        this.C = z;
        this.D = rVar;
        this.E = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                c0.b(this.B, this.D, this.C, (l1.j) obj, iK, this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(this.E | 1);
                z3.h(this.B, this.C, this.D, (l1.j) obj, iK2);
                break;
        }
        return g00.b0.a;
    }
}
