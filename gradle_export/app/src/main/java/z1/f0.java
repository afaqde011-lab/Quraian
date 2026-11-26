package z1;

import u.j0;
import z.y0;

public final class f0 extends b {

    public final b f17023o;

    public final boolean f17024p;

    public final boolean f17025q;

    public u00.k f17026r;

    public u00.k f17027s;

    public final long f17028t;

    public f0(b bVar, u00.k kVar, u00.k kVar2, boolean z10, boolean z11) {
        u00.k kVarI;
        u00.k kVarE;
        y0 y0Var = l.f17036a;
        super(0L, j.E, l.k(z10, kVar, (bVar == null || (kVarE = bVar.e()) == null) ? l.f17045j.f17002e : kVarE), l.l(kVar2, (bVar == null || (kVarI = bVar.i()) == null) ? l.f17045j.f17003f : kVarI));
        this.f17023o = bVar;
        this.f17024p = z10;
        this.f17025q = z11;
        this.f17026r = this.f17002e;
        this.f17027s = this.f17003f;
        this.f17028t = v1.d.b();
    }

    @Override
    public final void B(j0 j0Var) {
        q.o();
        throw null;
    }

    @Override
    public final b C(u00.k kVar, u00.k kVar2) {
        u00.k kVarK = l.k(true, kVar, this.f17026r);
        u00.k kVarL = l.l(kVar2, this.f17027s);
        return !this.f17024p ? new f0(D().C(null, kVarL), kVarK, kVarL, false, true) : D().C(kVarK, kVarL);
    }

    public final b D() {
        b bVar = this.f17023o;
        return bVar == null ? l.f17045j : bVar;
    }

    @Override
    public final void c() {
        b bVar;
        this.f17021c = true;
        if (!this.f17025q || (bVar = this.f17023o) == null) {
            return;
        }
        bVar.c();
    }

    @Override
    public final j d() {
        return D().d();
    }

    @Override
    public final u00.k e() {
        return this.f17026r;
    }

    @Override
    public final boolean f() {
        return D().f();
    }

    @Override
    public final long g() {
        return D().g();
    }

    @Override
    public final int h() {
        return D().h();
    }

    @Override
    public final u00.k i() {
        return this.f17027s;
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
        D().m();
    }

    @Override
    public final void n(z zVar) {
        D().n(zVar);
    }

    @Override
    public final void r(j jVar) {
        q.o();
        throw null;
    }

    @Override
    public final void s(long j9) {
        q.o();
        throw null;
    }

    @Override
    public final void t(int i10) {
        D().t(i10);
    }

    @Override
    public final f u(u00.k kVar) {
        u00.k kVarK = l.k(true, kVar, this.f17026r);
        return !this.f17024p ? l.g(D().u(null), kVarK, true) : D().u(kVarK);
    }

    @Override
    public final q w() {
        return D().w();
    }

    @Override
    public final j0 x() {
        return D().x();
    }

    @Override
    public final u00.k e() {
        return this.f17026r;
    }
}
