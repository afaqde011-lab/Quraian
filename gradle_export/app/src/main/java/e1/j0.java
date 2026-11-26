package e1;

import com.google.android.gms.internal.measurement.z3;

public final class j0 implements u00.n {
    public final int A;
    public final b2.r B;
    public final v1.c C;

    public j0(b2.r rVar, v1.c cVar, int i11, int i12) {
        this.A = i12;
        this.B = rVar;
        this.C = cVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                z3.m(this.B, this.C, jVar, l1.q.K(49));
                break;
            case 1:
                f50.k.e(this.B, this.C, jVar, l1.q.K(49));
                break;
            case 2:
                mz.a.f(this.B, this.C, jVar, l1.q.K(49));
                break;
            default:
                ox.a.l(this.B, this.C, jVar, l1.q.K(49));
                break;
        }
        return g00.b0.f7770a;
    }
}
