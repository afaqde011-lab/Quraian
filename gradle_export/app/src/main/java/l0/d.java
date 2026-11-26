package l0;

import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll0/d;", "Lb3/e1;", "Ll0/c;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends b3.e1 {
    public c B;
    public a40.q C;

    @Override
    public final b2.q d() {
        return new c(this);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "AwaitFirstLayoutModifier";
    }

    public final int hashCode() {
        return 234;
    }

    @Override
    public final void i(b2.q qVar) {
    }

    public final Object j(m00.c cVar) {
        a40.q qVarB = this.C;
        if (qVarB == null) {
            qVarB = a40.c0.b();
            this.C = qVarB;
            c cVar2 = this.B;
            if (cVar2 != null && cVar2.N) {
                cVar2.B1();
            }
        }
        Object objP = qVarB.p(cVar);
        return objP == l00.a.A ? objP : g00.b0.a;
    }
}
