package w10;

import java.util.ArrayList;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;

public final class g implements u10.h {
    public static final u10.d c = new u10.d(a0.a.b(g.class));
    public boolean a;
    public final ArrayList b = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.c(obj, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension");
        g gVar = (g) obj;
        return this.a == gVar.a && m.a(this.b, gVar.b);
    }

    @Override
    public final u10.d getType() {
        return c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
