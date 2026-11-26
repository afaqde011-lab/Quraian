package s20;

import e30.h0;
import e30.m0;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class o implements m0 {
    public final Set A;
    public final g00.p B;

    public o(Set set) {
        h0.B.getClass();
        h0 attributes = h0.C;
        kotlin.jvm.internal.m.e(attributes, "attributes");
        e30.c.v(attributes, this, h00.x.A, g30.l.a(g30.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), false);
        this.B = rd.a.J(new l());
        this.A = set;
    }

    @Override
    public final g10.i d() {
        throw null;
    }

    @Override
    public final j10.h g() {
        return null;
    }

    @Override
    public final List getParameters() {
        return h00.x.A;
    }

    @Override
    public final Collection l() {
        return (List) this.B.getValue();
    }

    @Override
    public final boolean o() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + h00.q.R0(this.A, ",", null, null, m.A, 30) + ']');
        return sb.toString();
    }
}
