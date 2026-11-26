package a40;

public final class d implements i {
    public final c[] A;

    public d(c[] cVarArr) {
        this.A = cVarArr;
    }

    @Override
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (c cVar : this.A) {
            o0 o0Var = cVar.F;
            if (o0Var == null) {
                kotlin.jvm.internal.m.k("handle");
                throw null;
            }
            o0Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.A + ']';
    }
}
