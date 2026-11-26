package f30;

import e30.l0;
import e30.w;
import e30.z0;

public final class l implements k {
    public final e c = e.a;
    public final q20.j d = new q20.j(q20.j.d);

    public final boolean a(w a, w b) {
        kotlin.jvm.internal.m.e(a, "a");
        kotlin.jvm.internal.m.e(b, "b");
        return e30.d.h(g.l(false, null, this.c, 6), a.y0(), b.y0());
    }

    public final boolean b(w subtype, w supertype) {
        kotlin.jvm.internal.m.e(subtype, "subtype");
        kotlin.jvm.internal.m.e(supertype, "supertype");
        l0 l0VarL = g.l(true, null, this.c, 6);
        z0 z0VarY0 = subtype.y0();
        z0 z0VarY1 = supertype.y0();
        if (z0VarY0 == z0VarY1) {
            return true;
        }
        l0VarL.b(z0VarY0, z0VarY1);
        return e30.d.a.f(l0VarL, l0VarL.c, z0VarY0, z0VarY1);
    }
}
