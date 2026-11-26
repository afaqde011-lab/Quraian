package gv;

import com.google.android.gms.internal.measurement.z3;

public final class l0 implements u00.n {
    public final int A = 0;
    public final b2.r B;
    public final long C;
    public final int D;
    public final Object E;
    public final Object F;

    public l0(jk.a aVar, long j, u00.a aVar2, b2.r rVar, int i) {
        this.E = aVar;
        this.C = j;
        this.F = aVar2;
        this.B = rVar;
        this.D = i;
    }

    public l0(o2.f fVar, String str, b2.r rVar, long j, int i) {
        this.E = fVar;
        this.F = str;
        this.B = rVar;
        this.C = j;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                p.u((jk.a) this.E, this.C, (u00.a) this.F, this.B, (l1.j) obj, l1.q.K(this.D | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                z3.k((o2.f) this.E, (String) this.F, this.B, this.C, (l1.j) obj, l1.q.K(this.D | 1));
                break;
        }
        return g00.b0.a;
    }
}
