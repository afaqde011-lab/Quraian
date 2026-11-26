package b20;

import java.util.Collection;
import java.util.Set;

public final class c0 extends n30.l {
    public final j10.e b;
    public final Set c;
    public final u00.k d;

    public c0(j10.e eVar, Set set, u00.k kVar) {
        this.b = eVar;
        this.c = set;
        this.d = kVar;
    }

    @Override
    public final boolean c(Object obj) {
        j10.e current = (j10.e) obj;
        kotlin.jvm.internal.m.e(current, "current");
        if (current == this.b) {
            return true;
        }
        x20.n nVarK = current.K();
        kotlin.jvm.internal.m.d(nVarK, "getStaticScope(...)");
        if (!(nVarK instanceof e0)) {
            return true;
        }
        this.c.addAll((Collection) this.d.invoke(nVarK));
        return false;
    }

    @Override
    public final Object j() {
        return g00.b0.a;
    }
}
