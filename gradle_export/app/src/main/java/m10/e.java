package m10;

import java.util.Collection;
import java.util.List;

public final class e implements e30.m0 {
    public final f A;

    public e(f fVar) {
        this.A = fVar;
    }

    @Override
    public final g10.i d() {
        return u20.d.e(this.A);
    }

    @Override
    public final j10.h g() {
        return this.A;
    }

    @Override
    public final List getParameters() {
        List list = ((c30.u) this.A).Q;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.m.k("typeConstructorParameters");
        throw null;
    }

    @Override
    public final Collection l() {
        Collection collectionL = ((c30.u) this.A).a1().m0().l();
        kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
        return collectionL;
    }

    @Override
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.A.getName().b() + ']';
    }
}
