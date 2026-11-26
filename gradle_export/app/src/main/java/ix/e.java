package ix;

import g00.b0;

public final class e implements u00.n {
    public final int A;
    public final String B;
    public final String C;
    public final u00.a D;
    public final b2.r E;

    public e(int i, int i2, b2.r rVar, String str, String str2, u00.a aVar) {
        this.A = i2;
        this.B = str;
        this.C = str2;
        this.D = aVar;
        this.E = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                a.f(this.B, this.C, this.D, this.E, (l1.j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1);
                iz.d.d(this.B, this.C, this.D, this.E, (l1.j) obj, iK2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK3 = l1.q.K(3073);
                st.j.a(this.B, this.C, this.D, this.E, (l1.j) obj, iK3);
                break;
        }
        return b0.a;
    }
}
