package eu;

import com.google.android.gms.internal.measurement.b5;

public final class g implements u00.n {
    public final int A;
    public final u00.a B;
    public final boolean C;
    public final b2.r D;
    public final int E;
    public final Object F;

    public g(Object obj, u00.a aVar, boolean z, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.F = obj;
        this.B = aVar;
        this.C = z;
        this.D = rVar;
        this.E = i;
    }

    public g(String str, boolean z, u00.a aVar, b2.r rVar, int i) {
        this.A = 2;
        this.F = str;
        this.C = z;
        this.B = aVar;
        this.D = rVar;
        this.E = i;
    }

    public g(boolean z, u00.a aVar, u00.a aVar2, b2.r rVar, int i) {
        this.A = 3;
        this.C = z;
        this.B = aVar;
        this.F = aVar2;
        this.D = rVar;
        this.E = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.d((bu.b) this.F, this.B, this.C, this.D, (l1.j) obj, l1.q.K(this.E | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                a.f(l1.q.K(this.E | 1), this.D, (jk.a) this.F, (l1.j) obj, this.B, this.C);
                break;
            case 2:
                ((Integer) obj2).getClass();
                b5.f(l1.q.K(this.E | 1), this.D, (String) this.F, (l1.j) obj, this.B, this.C);
                break;
            default:
                ((Integer) obj2).getClass();
                wr.k.X(this.C, this.B, (u00.a) this.F, this.D, (l1.j) obj, l1.q.K(this.E | 1));
                break;
        }
        return g00.b0.a;
    }
}
