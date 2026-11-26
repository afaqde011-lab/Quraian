package androidx.lifecycle;

import c3.s1;

public final class s0 implements u, AutoCloseable {
    public final String A;
    public final r0 B;
    public boolean C;

    public s0(String str, r0 r0Var) {
        this.A = str;
        this.B = r0Var;
    }

    @Override
    public final void a(w wVar, o oVar) {
        if (oVar == o.ON_DESTROY) {
            this.C = false;
            wVar.getLifecycle().d(this);
        }
    }

    @Override
    public final void close() {
    }

    public final void i(q qVar, ia.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "registry");
        kotlin.jvm.internal.m.e(qVar, "lifecycle");
        if (this.C) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.C = true;
        qVar.a(this);
        eVar.c(this.A, (s1) this.B.f1001a.F);
    }
}
