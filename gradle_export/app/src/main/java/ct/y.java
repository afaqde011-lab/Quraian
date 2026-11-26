package ct;

import com.google.android.gms.internal.measurement.z3;

public final class y implements u00.n {
    public final int A = 1;
    public final boolean B;
    public final float C;
    public final int D;
    public final Object E;

    public y(float f, int i, b2.r rVar, boolean z) {
        this.B = z;
        this.E = rVar;
        this.C = f;
        this.D = i;
    }

    public y(ys.e eVar, boolean z, float f, int i) {
        this.E = eVar;
        this.B = z;
        this.C = f;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).intValue();
                int iK = l1.q.K(this.D | 1);
                c0.d((ys.e) this.E, this.B, this.C, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(this.D | 1);
                z3.c(this.C, iK2, (b2.r) this.E, (l1.j) obj, this.B);
                break;
        }
        return g00.b0.a;
    }
}
