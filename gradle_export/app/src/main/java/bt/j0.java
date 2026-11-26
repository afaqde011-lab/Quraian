package bt;

import g1.m6;

public final class j0 implements u00.a {
    public final int A;
    public final a40.z B;
    public final m6 C;
    public final u00.k D;

    public j0(a40.z zVar, m6 m6Var, u00.k kVar, int i) {
        this.A = i;
        this.B = zVar;
        this.C = m6Var;
        this.D = kVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                ta.c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new w0(this.C, this.D, null, 0), 31);
                break;
            default:
                ta.c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new w0(this.C, this.D, null, 1), 31);
                break;
        }
        return g00.b0.a;
    }
}
