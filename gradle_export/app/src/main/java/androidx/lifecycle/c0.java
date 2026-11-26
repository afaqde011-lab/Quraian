package androidx.lifecycle;

public final class c0 extends d0 implements u {
    public final w E;
    public final e0 F;

    public c0(e0 e0Var, w wVar, g0 g0Var) {
        super(e0Var, g0Var);
        this.F = e0Var;
        this.E = wVar;
    }

    @Override
    public final void a(w wVar, o oVar) {
        w wVar2 = this.E;
        p pVarB = wVar2.getLifecycle().b();
        if (pVarB == p.A) {
            this.F.g(this.A);
            return;
        }
        p pVar = null;
        while (pVar != pVarB) {
            b(e());
            pVar = pVarB;
            pVarB = wVar2.getLifecycle().b();
        }
    }

    @Override
    public final void c() {
        this.E.getLifecycle().d(this);
    }

    @Override
    public final boolean d(w wVar) {
        return this.E == wVar;
    }

    @Override
    public final boolean e() {
        return this.E.getLifecycle().b().compareTo(p.D) >= 0;
    }
}
