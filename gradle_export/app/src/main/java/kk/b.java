package kk;

import kotlin.jvm.internal.m;
import u00.k;
import z2.a0;

public final class b implements jk.a {

    public final jk.a f9705a;

    public final jk.a f9706b;

    public final boolean f9707c;

    public b(jk.a aVar, jk.a aVar2) {
        m.e(aVar, "backdrop1");
        m.e(aVar2, "backdrop2");
        this.f9705a = aVar;
        this.f9706b = aVar2;
        this.f9707c = aVar.a() || aVar2.a();
    }

    @Override
    public final boolean a() {
        return this.f9707c;
    }

    @Override
    public final void b(k2.d dVar, y3.c cVar, a0 a0Var, k kVar) {
        m.e(dVar, "<this>");
        m.e(cVar, "density");
        this.f9705a.b(dVar, cVar, a0Var, kVar);
        this.f9706b.b(dVar, cVar, a0Var, kVar);
    }
}
