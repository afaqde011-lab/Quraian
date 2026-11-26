package s7;

import androidx.media3.common.k2;

public abstract class m1 extends j {

    public final a f13714k;

    public m1(a aVar) {
        this.f13714k = aVar;
    }

    public final void A() {
        x(null, this.f13714k);
    }

    public void B() {
        A();
    }

    @Override
    public final k2 g() {
        return this.f13714k.g();
    }

    @Override
    public final androidx.media3.common.q0 h() {
        return this.f13714k.h();
    }

    @Override
    public final boolean i() {
        return this.f13714k.i();
    }

    @Override
    public final void l(g7.s sVar) {
        this.f13698j = sVar;
        this.f13697i = e7.i0.l(null);
        B();
    }

    @Override
    public void s(androidx.media3.common.q0 q0Var) {
        this.f13714k.s(q0Var);
    }

    @Override
    public final a0 t(Object obj, a0 a0Var) {
        return y(a0Var);
    }

    @Override
    public final long u(Object obj, long j9) {
        return j9;
    }

    @Override
    public final int v(int i10, Object obj) {
        return i10;
    }

    @Override
    public final void w(Object obj, a aVar, k2 k2Var) {
        z(k2Var);
    }

    public a0 y(a0 a0Var) {
        return a0Var;
    }

    public abstract void z(k2 k2Var);
}
