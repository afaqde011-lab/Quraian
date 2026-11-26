package e30;

import java.util.Collection;
import java.util.List;

public abstract class f implements m0 {
    public int A;
    public final d30.d B;

    public f(d30.o storageManager) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.B = new d30.d((d30.l) storageManager, new a30.l(this, 27), new a20.d(this, 11));
    }

    public abstract Collection a();

    public abstract w b();

    public abstract j10.o0 c();

    @Override
    public final List l() {
        return ((e) this.B.invoke()).b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m0) && obj.hashCode() == hashCode()) {
            m0 m0Var = (m0) obj;
            if (m0Var.getParameters().size() == getParameters().size()) {
                j10.h hVarG = g();
                j10.h hVarG2 = m0Var.g();
                if (hVarG2 == null || g30.l.f(hVarG) || q20.d.m(hVarG) || g30.l.f(hVarG2) || q20.d.m(hVarG2)) {
                    return false;
                }
                return f(hVarG2);
            }
        }
        return false;
    }

    public abstract boolean f(j10.h hVar);

    public List h(List list) {
        return list;
    }

    public final int hashCode() {
        int i = this.A;
        if (i != 0) {
            return i;
        }
        j10.h hVarG = g();
        int iIdentityHashCode = (g30.l.f(hVarG) || q20.d.m(hVarG)) ? System.identityHashCode(this) : q20.d.f(hVarG).a.hashCode();
        this.A = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
