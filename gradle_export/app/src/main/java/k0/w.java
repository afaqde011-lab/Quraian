package k0;

import java.util.Collection;
import java.util.List;
import l0.t0;

public final class w implements u00.k {
    public final int A = 1;
    public final int B;
    public final Object C;

    public w(int i10, Collection collection) {
        this.B = i10;
        this.C = collection;
    }

    public w(y yVar, int i10) {
        this.C = yVar;
        this.B = i10;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                t0 t0Var = (t0) obj;
                j0.a aVar = ((y) this.C).f8543a;
                z1.f fVarF = z1.q.f();
                z1.q.n(fVarF, z1.q.k(fVarF), fVarF != null ? fVarF.e() : null);
                aVar.getClass();
                int i10 = t0Var.f9795a;
                if (i10 == -1) {
                    i10 = 2;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    t0Var.a(this.B + i11);
                }
                return g00.b0.a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.B, (Collection) this.C));
        }
    }
}
