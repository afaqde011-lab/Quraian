package d;

import android.window.OnBackInvokedDispatcher;

public final class e0 {

    public final Runnable f4382a;

    public final g00.p f4383b = rd.a.J(new a1.z(this, 15));

    public e0(Runnable runnable) {
        this.f4382a = runnable;
    }

    public final void a(androidx.lifecycle.w wVar, z zVar) {
        kotlin.jvm.internal.m.e(zVar, "onBackPressedCallback");
        final androidx.lifecycle.q lifecycle = wVar.getLifecycle();
        if (lifecycle.b() == androidx.lifecycle.p.A) {
            return;
        }
        y yVar = new y(zVar, new a0(wVar, zVar));
        zVar.f4399a.add(yVar);
        yVar.h(false);
        s9.c.a(b().f4380c, yVar);
        final androidx.lifecycle.f fVar = new androidx.lifecycle.f(yVar, this, lifecycle);
        lifecycle.a(fVar);
        zVar.f4401c.add(new AutoCloseable() {
            @Override
            public final void close() {
                lifecycle.d(fVar);
            }
        });
    }

    public final c0 b() {
        return (c0) this.f4383b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().f4380c.c(new s9.m(onBackInvokedDispatcher, 0), 1);
        b().f4380c.c(new s9.m(onBackInvokedDispatcher, 1000000), 0);
    }
}
