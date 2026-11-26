package w;

public final class a extends a2 {

    public final p10.a f15733a;

    public final l1.i1 f15734b;

    public final l1.i1 f15735c;

    public a(p10.a aVar, f1 f1Var, h2.c cVar) {
        this.f15733a = aVar;
        this.f15734b = l1.q.z(f1Var);
        this.f15735c = l1.q.z(cVar);
    }

    @Override
    public final a2 a(j1 j1Var, f1 f1Var, long j9, long j10, long j11) {
        l1.i1 i1Var = this.f15734b;
        c0.i(this.f15733a, j9, j10, j11, !kotlin.jvm.internal.m.a((f1) i1Var.getValue(), f1Var));
        i1Var.setValue(f1Var);
        return this;
    }

    @Override
    public final h2.c c() {
        return (h2.c) this.f15735c.getValue();
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final p10.a e() {
        return this.f15733a;
    }

    @Override
    public final a2 g(f1 f1Var) {
        return this;
    }

    @Override
    public final a2 h() {
        p10.a aVar = this.f15733a;
        bi.b.g(h2.b.f(((h2.b) ((l1.i1) aVar.D).getValue()).f6544a, ((h2.b) ((l1.i1) aVar.C).getValue()).f6544a), ((h2.e) ((l1.i1) aVar.A).getValue()).f6558a);
        k1 k1Var = ((f1) this.f15734b.getValue()).Q;
        l1.i1 i1Var = k1Var.I;
        m1 m1Var = (m1) ((r1) i1Var.getValue()).f15804b.getValue();
        z2.a0 a0Var = k1Var.e().f15781b.F;
        if (a0Var == null) {
            throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
        }
        kh.n.m0(a0Var.p());
        m1Var.getClass();
        return c1.f15743a;
    }

    @Override
    public final void i(h2.c cVar) {
        this.f15735c.setValue(cVar);
    }
}
