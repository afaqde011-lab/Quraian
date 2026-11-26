package bt;

import g1.m6;

public final class i0 implements u00.k {
    public final int A;
    public final a40.z B;
    public final m6 C;
    public final u00.k D;

    public i0(a40.z zVar, m6 m6Var, u00.k kVar, int i) {
        this.A = i;
        this.B = zVar;
        this.C = m6Var;
        this.D = kVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                ep.e it = (ep.e) obj;
                kotlin.jvm.internal.m.e(it, "it");
                ta.c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new v0(this.C, this.D, it, null, 0), 31);
                break;
            default:
                ep.e it2 = (ep.e) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                ta.c0.M(this.B, (k00.i) null, (u00.n) null, (u00.k) null, new v0(this.C, this.D, it2, null, 1), 31);
                break;
        }
        return g00.b0.a;
    }
}
