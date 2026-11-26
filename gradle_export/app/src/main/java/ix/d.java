package ix;

import g00.b0;

public final class d implements u00.n {
    public final int A;
    public final bx.c B;
    public final boolean C;

    public d(bx.c cVar, boolean z, int i, int i2) {
        this.A = i2;
        this.B = cVar;
        this.C = z;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.i(this.B, this.C, jVar, l1.q.K(57));
                break;
            default:
                a.j(this.B, this.C, jVar, l1.q.K(57));
                break;
        }
        return b0.a;
    }
}
