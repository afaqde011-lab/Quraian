package g1;

public final class m6 {

    public final boolean f5884a;

    public final u00.k f5885b;

    public x.i f5886c;

    public final fc.n f5887d;

    public x.y f5888e;

    public x.y f5889f;

    public m6(boolean z10, u00.a aVar, u00.a aVar2, n6 n6Var, u00.k kVar) {
        this.f5884a = z10;
        this.f5885b = kVar;
        if (z10 && n6Var == n6.C) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        this.f5886c = j6.f5847b;
        this.f5887d = new fc.n(n6Var, new ca.q(8, aVar), aVar2, new l0(this, 3), kVar);
        this.f5888e = x.c.u();
        this.f5889f = x.c.u();
    }

    public static Object a(m6 m6Var, n6 n6Var, x.y yVar, k00.c cVar) {
        Object objC = m6Var.f5887d.c(n6Var, z.b1.A, new l6(m6Var, ((l1.e1) m6Var.f5887d.f5636k).h(), yVar, null), cVar);
        return objC == l00.a.A ? objC : g00.b0.a;
    }

    public final Object b(m00.i iVar) {
        Object objA;
        n6 n6Var = n6.B;
        return (((Boolean) this.f5885b.invoke(n6Var)).booleanValue() && (objA = a(this, n6Var, this.f5888e, iVar)) == l00.a.A) ? objA : g00.b0.a;
    }

    public final Object c(k00.c cVar) {
        Object objA;
        n6 n6Var = n6.A;
        return (((Boolean) this.f5885b.invoke(n6Var)).booleanValue() && (objA = a(this, n6Var, this.f5889f, cVar)) == l00.a.A) ? objA : g00.b0.a;
    }

    public final boolean d() {
        return ((l1.i1) this.f5887d.f5632g).getValue() != n6.A;
    }

    public final Object e(m00.i iVar) {
        Object objA;
        if (this.f5884a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        n6 n6Var = n6.C;
        return (((Boolean) this.f5885b.invoke(n6Var)).booleanValue() && (objA = a(this, n6Var, this.f5889f, iVar)) == l00.a.A) ? objA : g00.b0.a;
    }

    public final Object f(m00.i iVar) {
        Object objA;
        h1.n0 n0VarG = this.f5887d.g();
        n6 n6Var = n6.C;
        if (!n0VarG.f6524a.containsKey(n6Var)) {
            n6Var = n6.B;
        }
        return (((Boolean) this.f5885b.invoke(n6Var)).booleanValue() && (objA = a(this, n6Var, this.f5888e, iVar)) == l00.a.A) ? objA : g00.b0.a;
    }
}
