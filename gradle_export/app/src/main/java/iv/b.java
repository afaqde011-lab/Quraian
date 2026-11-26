package iv;

import j0.v;

public final class b implements u00.a {
    public final int A;
    public final v B;
    public final float C;

    public b(v vVar, float f, int i) {
        this.A = i;
        this.B = vVar;
        this.C = f;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return Integer.valueOf(a.m(this.B, this.C));
            default:
                j0.q qVar = this.B.e;
                return Boolean.valueOf(qVar.b.h() > 0 || ((float) qVar.c.h()) > this.C);
        }
    }
}
