package e30;

import java.util.List;

public final class y extends w {
    public final d30.o B;
    public final u00.a C;
    public final d30.i D;

    public y(d30.o storageManager, u00.a aVar) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.B = storageManager;
        this.C = aVar;
        this.D = new d30.i((d30.l) storageManager, aVar);
    }

    @Override
    public final x20.n N() {
        return z0().N();
    }

    @Override
    public final List e0() {
        return z0().e0();
    }

    @Override
    public final h0 k0() {
        return z0().k0();
    }

    @Override
    public final m0 m0() {
        return z0().m0();
    }

    @Override
    public final boolean t0() {
        return z0().t0();
    }

    public final String toString() {
        d30.i iVar = this.D;
        return (iVar.C == d30.k.A || iVar.C == d30.k.B) ? "<Not computed yet>" : z0().toString();
    }

    @Override
    public final w A0(f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new y(this.B, new a20.a(kotlinTypeRefiner, this, 16));
    }

    @Override
    public final z0 y0() {
        w wVarZ0 = z0();
        while (wVarZ0 instanceof y) {
            wVarZ0 = ((y) wVarZ0).z0();
        }
        kotlin.jvm.internal.m.c(wVarZ0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (z0) wVarZ0;
    }

    public final w z0() {
        return (w) this.D.invoke();
    }
}
