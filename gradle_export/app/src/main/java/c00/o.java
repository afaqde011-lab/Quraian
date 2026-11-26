package c00;

import g00.b0;

public final class o implements u00.n {
    public final int A = 1;
    public final int B;
    public final u00.k C;

    public o(int i, int i2, u00.k kVar) {
        this.B = i;
        this.C = kVar;
    }

    public o(int i, u00.k kVar) {
        this.C = kVar;
        this.B = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                num.intValue();
                a.d(this.C, jVar, l1.q.K(this.B | 1));
                break;
            default:
                num.getClass();
                st.g.d(this.B, this.C, jVar, l1.q.K(1));
                break;
        }
        return b0.a;
    }
}
