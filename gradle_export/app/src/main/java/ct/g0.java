package ct;

import com.google.android.gms.internal.measurement.z3;

public final class g0 implements u00.n {
    public final int A;
    public final float B;
    public final float C;
    public final int D;
    public final Object E;

    public g0(float f3, float f11, int i11, int i12, Object obj) {
        this.A = i12;
        this.E = obj;
        this.B = f3;
        this.C = f11;
        this.D = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(this.D | 1);
                z3.f((ys.l) this.E, this.B, this.C, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(this.D | 1);
                iv.a.l((String) this.E, this.B, this.C, (l1.j) obj, iK2);
                break;
        }
        return g00.b0.f7770a;
    }
}
