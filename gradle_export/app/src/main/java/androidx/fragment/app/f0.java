package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

public final class f0 extends h0 {

    public final s.a f702a;

    public final AtomicReference f703b;

    public final i.a f704c;

    public final h.b f705d;

    public final j0 f706e;

    public f0(j0 j0Var, s.a aVar, AtomicReference atomicReference, i.a aVar2, h.b bVar) {
        this.f706e = j0Var;
        this.f702a = aVar;
        this.f703b = atomicReference;
        this.f704c = aVar2;
        this.f705d = bVar;
    }

    @Override
    public final void a() {
        j0 j0Var = this.f706e;
        this.f703b.set(((h.i) this.f702a.apply(null)).c(j0Var.generateActivityResultKey(), j0Var, this.f704c, this.f705d));
    }
}
