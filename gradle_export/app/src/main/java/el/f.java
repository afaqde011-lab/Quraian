package el;

import ab.a0;
import g00.b0;
import g1.m6;
import g1.n6;
import java.util.List;
import l1.f1;
import l1.y0;
import l1.z0;
import u00.k;

public final class f implements u00.a {
    public final int A = 0;
    public final boolean B;
    public final u00.a C;
    public final g00.e D;
    public final Object E;
    public final Object F;

    public f(k kVar, List list, boolean z, u00.a aVar, z0 z0Var) {
        this.D = kVar;
        this.E = list;
        this.B = z;
        this.C = aVar;
        this.F = z0Var;
    }

    public f(boolean z, u00.a aVar, u00.a aVar2, n6 n6Var, k kVar) {
        this.B = z;
        this.C = aVar;
        this.E = aVar2;
        this.F = n6Var;
        this.D = kVar;
    }

    public f(boolean z, u00.a aVar, u00.a aVar2, z0 z0Var, y0 y0Var) {
        this.B = z;
        this.C = aVar;
        this.D = aVar2;
        this.F = z0Var;
        this.E = y0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                k kVar = (k) this.D;
                List list = (List) this.E;
                z0 z0Var = (z0) this.F;
                if (kVar != null) {
                    kVar.invoke(list.get(a0.z(((Number) z0Var.getValue()).intValue(), va.a.L(list))));
                }
                if (this.B) {
                    this.C.invoke();
                }
                return b0.a;
            case 1:
                return new m6(this.B, this.C, (u00.a) this.E, (n6) this.F, (k) this.D);
            default:
                u00.a aVar = (u00.a) this.D;
                z0 z0Var2 = (z0) this.F;
                f1 f1Var = (y0) this.E;
                if (((Boolean) z0Var2.getValue()).booleanValue() || this.B) {
                    this.C.invoke();
                    aVar.invoke();
                } else {
                    f1 f1Var2 = f1Var;
                    f1Var2.i(f1Var2.h() + 1);
                }
                return b0.a;
        }
    }
}
