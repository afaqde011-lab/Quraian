package g30;

import e30.m0;
import h00.x;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class j implements m0 {
    public final k A;
    public final String[] B;
    public final String C;

    public j(k kind, String... formatParams) {
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        this.A = kind;
        this.B = formatParams;
        b[] bVarArr = b.A;
        String str = kind.A;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.C = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override
    public final g10.i d() {
        return (g10.e) g10.e.f.getValue();
    }

    @Override
    public final j10.h g() {
        l.a.getClass();
        return l.c;
    }

    @Override
    public final List getParameters() {
        return x.A;
    }

    @Override
    public final Collection l() {
        return x.A;
    }

    @Override
    public final boolean o() {
        return false;
    }

    public final String toString() {
        return this.C;
    }
}
