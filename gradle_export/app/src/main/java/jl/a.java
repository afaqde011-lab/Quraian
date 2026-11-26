package jl;

import g00.b0;
import l1.g0;
import l1.j;
import l1.q;
import l1.z0;
import p0.e;
import u00.n;
import x.k0;

public final class a implements n {
    public final int A = 1;
    public final k0 B;
    public final z0 C;
    public final long D;
    public final e E;
    public final v1.c F;

    public a(k0 k0Var, z0 z0Var, long j, e eVar, v1.c cVar) {
        this.B = k0Var;
        this.C = z0Var;
        this.D = j;
        this.E = eVar;
        this.F = cVar;
    }

    public a(k0 k0Var, z0 z0Var, long j, e eVar, v1.c cVar, int i) {
        this.B = k0Var;
        this.C = z0Var;
        this.D = j;
        this.E = eVar;
        this.F = cVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                c.a(this.B, this.C, this.D, this.E, this.F, (j) obj, q.K(49));
                break;
            default:
                g0 g0Var = (j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c.a(this.B, this.C, this.D, this.E, this.F, g0Var, 48);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return b0.a;
    }
}
