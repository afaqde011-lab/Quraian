package f20;

import e30.w;
import j10.n0;
import java.util.Map;

public final class c implements k10.b {
    public static final c a = new c();

    @Override
    public final n20.c a() {
        j10.e eVarD = u20.d.d(this);
        if (eVarD != null) {
            if (g30.l.f(eVarD)) {
                eVarD = null;
            }
            if (eVarD != null) {
                return u20.d.c(eVarD);
            }
        }
        return null;
    }

    @Override
    public final Map b() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override
    public final w getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override
    public final n0 o() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
