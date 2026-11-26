package s7;

import java.util.concurrent.atomic.AtomicReference;

public final class o0 implements a8.l0 {

    public final z0 f13724a;

    public final z0 f13725b;

    public final a8.p f13726c = new a8.p();

    public final AtomicReference f13727d = new AtomicReference(n0.A);

    public o0(z0 z0Var) {
        this.f13724a = z0Var;
        this.f13725b = z0Var;
    }

    @Override
    public final int a(androidx.media3.common.j jVar, int i10, boolean z10) {
        return h().a(jVar, i10, z10);
    }

    @Override
    public final int b(androidx.media3.common.j jVar, int i10, boolean z10) {
        return h().b(jVar, i10, z10);
    }

    @Override
    public final void c(long j9) {
    }

    @Override
    public final void d(long j9, int i10, int i11, int i12, a8.k0 k0Var) {
        h().d(j9, i10, i11, i12, k0Var);
        AtomicReference atomicReference = this.f13727d;
        if (atomicReference.get() == n0.B) {
            this.f13725b.w(false);
            atomicReference.set(n0.C);
        }
    }

    @Override
    public final void e(e7.u uVar, int i10, int i11) {
        h().e(uVar, i10, i11);
    }

    @Override
    public final void f(androidx.media3.common.t tVar) {
        this.f13724a.f(tVar);
    }

    @Override
    public final void g(int i10, e7.u uVar) {
        h().g(i10, uVar);
    }

    public final a8.l0 h() {
        return this.f13727d.get() == n0.C ? this.f13726c : this.f13725b;
    }
}
