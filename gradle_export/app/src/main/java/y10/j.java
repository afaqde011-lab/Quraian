package y10;

import a10.w;
import d30.l;
import eo.p;
import g10.o;
import java.util.Map;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import oj.q;

public final class j extends b {
    public static final w[] g = {a0.a.h(new s(j.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    public final d30.i f;

    public j(p10.e annotation, q c) {
        super(c, annotation, o.t);
        m.e(annotation, "annotation");
        m.e(c, "c");
        d30.o oVar = ((a20.b) c.B).a;
        p pVar = new p(this, 26);
        l lVar = (l) oVar;
        lVar.getClass();
        this.f = new d30.i(lVar, pVar);
    }

    @Override
    public final Map b() {
        return (Map) ze.d.A(this.f, g[0]);
    }
}
