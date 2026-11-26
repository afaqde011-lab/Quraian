package j3;

import b3.e1;
import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lj3/c;", "Lb3/e1;", "Lj3/e;", "Lj3/p;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends e1 implements p {
    public final u00.k B;

    public c(u00.k kVar) {
        this.B = kVar;
    }

    @Override
    public final b2.q d() {
        return new e(false, true, this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.B == ((c) obj).B;
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "clearAndSetSemantics";
        q.a(d2Var, k1());
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        ((e) qVar).Q = this.B;
    }

    @Override
    public final o k1() {
        o oVar = new o();
        oVar.C = false;
        oVar.D = true;
        this.B.invoke(oVar);
        return oVar;
    }
}
