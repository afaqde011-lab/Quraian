package ct;

import com.google.android.gms.internal.measurement.y3;
import qd.s0;

public final class d0 implements u00.n {
    public final int A;
    public final b2.r B;
    public final boolean C;
    public final int D;
    public final int E;

    public d0(b2.r rVar, boolean z11, int i11, int i12, int i13) {
        this.A = i13;
        this.B = rVar;
        this.C = z11;
        this.D = i11;
        this.E = i12;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                y3.f(this.B, this.C, jVar, l1.q.K(this.D | 1), this.E);
                break;
            case 1:
                s0.J(this.B, this.C, jVar, l1.q.K(this.D | 1), this.E);
                break;
            default:
                kl.a.a(this.B, this.C, jVar, l1.q.K(this.D | 1), this.E);
                break;
        }
        return g00.b0.f7770a;
    }
}
