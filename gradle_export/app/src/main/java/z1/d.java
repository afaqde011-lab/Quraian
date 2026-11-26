package z1;

import z.y0;

public final class d extends f {

    public final u00.k f17013e;

    public final f f17014f;

    public d(long j9, j jVar, u00.k kVar, f fVar) {
        super(j9, jVar);
        this.f17013e = kVar;
        this.f17014f = fVar;
        fVar.k();
    }

    @Override
    public final void c() {
        f fVar = this.f17014f;
        if (this.f17021c) {
            return;
        }
        if (this.f17020b != fVar.g()) {
            a();
        }
        fVar.l();
        this.f17021c = true;
        synchronized (l.f17038c) {
            o();
        }
    }

    @Override
    public final u00.k e() {
        return this.f17013e;
    }

    @Override
    public final boolean f() {
        return true;
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
    }

    @Override
    public final void n(z zVar) {
        y0 y0Var = l.f17036a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override
    public final f u(u00.k kVar) {
        return new d(this.f17020b, this.f17019a, l.k(true, kVar, this.f17013e), this.f17014f);
    }
}
