package a30;

import java.util.Set;

public final class g {
    public static final Set c;
    public final i a;
    public final d30.j b;

    static {
        n20.c cVarI = g10.o.c.i();
        c = w50.c.g0(new n20.b(cVarI.b(), cVarI.a.g()));
    }

    public g(i iVar) {
        this.a = iVar;
        this.b = iVar.a.c(new a20.d(this, 3));
    }

    public final j10.e a(n20.b classId, d dVar) {
        kotlin.jvm.internal.m.e(classId, "classId");
        return (j10.e) this.b.invoke(new f(classId, dVar));
    }
}
