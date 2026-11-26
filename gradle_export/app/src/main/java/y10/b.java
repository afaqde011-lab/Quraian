package y10;

import a10.w;
import d30.l;
import d30.o;
import h00.y;
import j10.n0;
import java.util.Map;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import oj.q;

public class b implements z10.g {
    public static final w[] e = {a0.a.h(new s(b.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};
    public final n20.c a;
    public final n0 b;
    public final d30.i c;
    public final e20.a d;

    public b(q c, p10.e eVar, n20.c fqName) {
        m.e(c, "c");
        a20.b bVar = (a20.b) c.B;
        m.e(fqName, "fqName");
        this.a = fqName;
        this.b = eVar != null ? bVar.j.b(eVar) : n0.n;
        o oVar = bVar.a;
        p30.h hVar = new p30.h(c, this, 3);
        l lVar = (l) oVar;
        lVar.getClass();
        this.c = new d30.i(lVar, hVar);
        this.d = eVar != null ? (e20.a) h00.q.M0(eVar.b()) : null;
    }

    @Override
    public final n20.c a() {
        return this.a;
    }

    @Override
    public Map b() {
        return y.A;
    }

    @Override
    public final e30.w getType() {
        return (e30.a0) ze.d.A(this.c, e[0]);
    }

    @Override
    public final n0 o() {
        return this.b;
    }
}
