package a40;

public final class c2 extends f40.p {
    public final ThreadLocal E;
    private volatile boolean threadLocalIsSet;

    public c2(k00.c cVar, k00.i iVar) {
        d2 d2Var = d2.A;
        super(cVar, iVar.get(d2Var) == null ? iVar.plus(d2Var) : iVar);
        this.E = new ThreadLocal();
        if (cVar.getContext().get(k00.d.A) instanceof v) {
            return;
        }
        Object objN = f40.a.n(iVar, null);
        f40.a.g(iVar, objN);
        n0(iVar, objN);
    }

    @Override
    public final void k0() {
        m0();
    }

    public final boolean l0() {
        boolean z = this.threadLocalIsSet && this.E.get() == null;
        this.E.remove();
        return !z;
    }

    public final void m0() {
        if (this.threadLocalIsSet) {
            g00.k kVar = (g00.k) this.E.get();
            if (kVar != null) {
                f40.a.g((k00.i) kVar.A, kVar.B);
            }
            this.E.remove();
        }
    }

    public final void n0(k00.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.E.set(new g00.k(iVar, obj));
    }

    @Override
    public final void o(Object obj) {
        m0();
        Object objA = c0.A(obj);
        k00.c cVar = this.D;
        k00.i context = cVar.getContext();
        Object objN = f40.a.n(context, null);
        c2 c2VarI = objN != f40.a.d ? c0.I(cVar, context, objN) : null;
        try {
            cVar.resumeWith(objA);
        } finally {
            if (c2VarI == null || c2VarI.l0()) {
                f40.a.g(context, objN);
            }
        }
    }
}
