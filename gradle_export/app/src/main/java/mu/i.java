package mu;

import g00.b0;

public final class i implements u00.n {
    public final int A = 0;
    public final String B;
    public final boolean C;
    public final u00.a D;
    public final b2.r E;

    public i(String str, u00.a aVar, b2.r rVar, boolean z, int i) {
        this.B = str;
        this.D = aVar;
        this.E = rVar;
        this.C = z;
    }

    public i(String str, boolean z, u00.a aVar, b2.r rVar, int i) {
        this.B = str;
        this.C = z;
        this.D = aVar;
        this.E = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                d.k(l1.q.K(1), this.E, this.B, (l1.j) obj, this.D, this.C);
                break;
            default:
                ((Integer) obj2).getClass();
                va.a.c(l1.q.K(1), this.E, this.B, (l1.j) obj, this.D, this.C);
                break;
        }
        return b0.a;
    }
}
