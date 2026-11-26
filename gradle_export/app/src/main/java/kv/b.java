package kv;

import b2.r;
import g00.b0;
import l1.j;
import l1.q;
import u00.k;
import u00.n;

public final class b implements n {
    public final int A = 1;
    public final r B;
    public final String C;
    public final k D;
    public final boolean E;
    public final int F;

    public b(r rVar, String str, k kVar, boolean z, int i, int i2) {
        this.B = rVar;
        this.C = str;
        this.D = kVar;
        this.E = z;
        this.F = i2;
    }

    public b(String str, k kVar, r rVar, boolean z, int i) {
        this.C = str;
        this.D = kVar;
        this.B = rVar;
        this.E = z;
        this.F = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.c(q.K(this.F | 1), this.B, this.C, (j) obj, this.D, this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK = q.K(1);
                mu.d.n(this.B, this.C, this.D, this.E, (j) obj, iK, this.F);
                break;
        }
        return b0.a;
    }
}
