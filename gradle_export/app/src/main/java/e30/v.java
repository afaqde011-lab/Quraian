package e30;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public final class v implements m0, h30.l {
    public w A;
    public final LinkedHashSet B;
    public final int C;

    public v(AbstractCollection typesToIntersect) {
        kotlin.jvm.internal.m.e(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.B = linkedHashSet;
        this.C = linkedHashSet.hashCode();
    }

    public final a0 a() {
        h0.B.getClass();
        return c.w(h0.C, this, h00.x.A, false, kh.n.A("member scope for intersection type", this.B), new a20.d(this, 12));
    }

    public final String b(u00.k getProperTypeRelatedToStringify) {
        kotlin.jvm.internal.m.e(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return h00.q.R0(h00.q.i1(this.B, new ay.b(getProperTypeRelatedToStringify, 2)), " & ", "{", "}", new az.m(1, getProperTypeRelatedToStringify), 24);
    }

    @Override
    public final g10.i d() {
        g10.i iVarD = ((w) this.B.iterator().next()).m0().d();
        kotlin.jvm.internal.m.d(iVarD, "getBuiltIns(...)");
        return iVarD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.B, ((v) obj).B);
    }

    @Override
    public final j10.h g() {
        return null;
    }

    @Override
    public final List getParameters() {
        return h00.x.A;
    }

    public final int hashCode() {
        return this.C;
    }

    @Override
    public final Collection l() {
        return this.B;
    }

    @Override
    public final boolean o() {
        return false;
    }

    public final String toString() {
        return b(u.B);
    }
}
