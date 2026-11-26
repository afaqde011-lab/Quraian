package k10;

import e30.w;
import eo.p;
import j10.n0;
import java.util.Map;

public final class j implements b {
    public final g10.i a;
    public final n20.c b;
    public final Map c;
    public final Object d;

    public j(g10.i builtIns, n20.c fqName, Map map) {
        kotlin.jvm.internal.m.e(builtIns, "builtIns");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        this.a = builtIns;
        this.b = fqName;
        this.c = map;
        this.d = rd.a.I(g00.i.B, new p(this, 6));
    }

    @Override
    public final n20.c a() {
        return this.b;
    }

    @Override
    public final Map b() {
        return this.c;
    }

    @Override
    public final w getType() {
        Object value = this.d.getValue();
        kotlin.jvm.internal.m.d(value, "getValue(...)");
        return (w) value;
    }

    @Override
    public final n0 o() {
        return n0.n;
    }
}
