package ct;

import com.google.android.gms.internal.measurement.g4;

public final class i0 implements u00.n {
    public final int A;
    public final u00.a B;
    public final b2.r C;
    public final int D;

    public i0(u00.a aVar, b2.r rVar, int i, int i2) {
        this.A = 2;
        this.B = aVar;
        this.C = rVar;
        this.D = i2;
    }

    public i0(u00.a aVar, b2.r rVar, int i, int i2, byte b) {
        this.A = i2;
        this.B = aVar;
        this.C = rVar;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                g4.j(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            case 1:
                iv.n.a(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            default:
                f50.c.a(l1.q.K(1), this.D, this.C, jVar, this.B);
                break;
        }
        return g00.b0.a;
    }
}
