package kk;

import kotlin.jvm.internal.m;
import u00.k;
import u00.n;
import z2.a0;

public final class a implements jk.a {

    public final jk.a f9702a;

    public final n f9703b;

    public final boolean f9704c;

    public a(jk.a aVar, n nVar) {
        m.e(aVar, "backdrop");
        m.e(nVar, "onDraw");
        this.f9702a = aVar;
        this.f9703b = nVar;
        this.f9704c = aVar.a();
    }

    @Override
    public final boolean a() {
        return this.f9704c;
    }

    @Override
    public final void b(k2.d dVar, y3.c cVar, a0 a0Var, k kVar) {
        m.e(dVar, "<this>");
        m.e(cVar, "density");
        this.f9703b.invoke(dVar, new az.k(this, cVar, a0Var, kVar, 7));
    }
}
