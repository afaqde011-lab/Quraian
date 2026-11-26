package e1;

import c3.c3;
import c3.o1;
import com.google.android.gms.internal.measurement.b5;

public final class b implements u00.n {
    public final int A = 0;
    public final b2.r B;
    public final boolean C;
    public final long D;
    public final Object E;
    public final Object F;

    public b(c3 c3Var, long j9, boolean z10, b2.r rVar, n nVar) {
        this.E = c3Var;
        this.D = j9;
        this.C = z10;
        this.B = rVar;
        this.F = nVar;
    }

    public b(String str, u00.a aVar, b2.r rVar, boolean z10, long j9, int i10) {
        this.E = str;
        this.F = aVar;
        this.B = rVar;
        this.C = z10;
        this.D = j9;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                c3 c3Var = (c3) this.E;
                n nVar = (n) this.F;
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l1.q.a(o1.f2744t.a(c3Var), v1.d.d(1260045569, new d(this.D, this.C, this.B, nVar), jVar), jVar, 56);
                } else {
                    g0Var.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b5.i((String) this.E, (u00.a) this.F, this.B, this.C, this.D, (l1.j) obj, l1.q.K(1));
                break;
        }
        return g00.b0.a;
    }
}
