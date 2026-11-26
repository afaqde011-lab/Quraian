package z1;

import z.y0;

public final class e extends f {

    public final u00.k f17017e;

    public int f17018f;

    public e(long j9, j jVar, u00.k kVar) {
        super(j9, jVar);
        this.f17017e = kVar;
        this.f17018f = 1;
    }

    @Override
    public final void c() {
        if (this.f17021c) {
            return;
        }
        l();
        this.f17021c = true;
        synchronized (l.f17038c) {
            o();
        }
    }

    @Override
    public final u00.k e() {
        return this.f17017e;
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
        this.f17018f++;
    }

    @Override
    public final void l() {
        int i10 = this.f17018f - 1;
        this.f17018f = i10;
        if (i10 == 0) {
            a();
        }
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
        l.c(this);
        return new d(this.f17020b, this.f17019a, l.k(true, kVar, this.f17017e), this);
    }
}
