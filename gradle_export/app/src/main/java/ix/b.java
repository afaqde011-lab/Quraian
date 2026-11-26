package ix;

import g00.b0;

public final class b implements u00.n {
    public final int A;
    public final String B;
    public final String C;
    public final u30.b D;
    public final u00.a E;
    public final b2.r F;

    public b(String str, String str2, u30.b bVar, u00.a aVar, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.B = str;
        this.C = str2;
        this.D = bVar;
        this.E = aVar;
        this.F = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                a.b(this.B, this.C, this.D, this.E, this.F, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1);
                a.c(this.B, this.C, this.D, this.E, this.F, (l1.j) obj, iK2);
                break;
        }
        return b0.a;
    }
}
