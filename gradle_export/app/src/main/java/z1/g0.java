package z1;

import z.y0;

public final class g0 extends f {

    public final f f17030e;

    public final boolean f17031f;

    public final boolean f17032g;

    public u00.k f17033h;

    public final long f17034i;

    public g0(f fVar, u00.k kVar, boolean z10, boolean z11) {
        u00.k kVarE;
        super(0L, j.E);
        y0 y0Var = l.f17036a;
        this.f17030e = fVar;
        this.f17031f = z10;
        this.f17032g = z11;
        this.f17033h = l.k(z10, kVar, (fVar == null || (kVarE = fVar.e()) == null) ? l.f17045j.f17002e : kVarE);
        this.f17034i = v1.d.b();
    }

    @Override
    public final void c() {
        f fVar;
        this.f17021c = true;
        if (!this.f17032g || (fVar = this.f17030e) == null) {
            return;
        }
        fVar.c();
    }

    @Override
    public final j d() {
        return v().d();
    }

    @Override
    public final u00.k e() {
        return this.f17033h;
    }

    @Override
    public final boolean f() {
        return v().f();
    }

    @Override
    public final long g() {
        return v().g();
    }

    @Override
    public final u00.k i() {
        return null;
    }

    @Override
    public final void k() {
        q.o();
        throw null;
    }

    @Override
    public final void l() {
        q.o();
        throw null;
    }

    @Override
    public final void m() {
        v().m();
    }

    @Override
    public final void n(z zVar) {
        v().n(zVar);
    }

    @Override
    public final f u(u00.k kVar) {
        u00.k kVarK = l.k(true, kVar, this.f17033h);
        return !this.f17031f ? l.g(v().u(null), kVarK, true) : v().u(kVarK);
    }

    public final f v() {
        f fVar = this.f17030e;
        return fVar == null ? l.f17045j : fVar;
    }
}
