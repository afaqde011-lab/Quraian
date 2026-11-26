package q3;

public final class j implements h {

    public final dh.o f12735a;

    public final a f12736b;

    public final e0 f12737c;

    public final n f12738d;

    public final o10.b f12739e;

    public final q0.a f12740f;

    public j(dh.o oVar, a aVar) {
        e0 e0Var = k.f12741a;
        n nVar = new n(k.f12742b);
        o10.b bVar = new o10.b(11);
        this.f12735a = oVar;
        this.f12736b = aVar;
        this.f12737c = e0Var;
        this.f12738d = nVar;
        this.f12739e = bVar;
        this.f12740f = new q0.a(this, 3);
    }

    public final h0 a(d0 d0Var) {
        e0 e0Var = this.f12737c;
        mu.q qVar = new mu.q(this, d0Var, 11);
        synchronized (((tf.y) e0Var.B)) {
            h0 h0Var = (h0) ((u.s) e0Var.C).c(d0Var);
            if (h0Var != null) {
                if (h0Var.b()) {
                    return h0Var;
                }
            }
            try {
                h0 h0Var2 = (h0) qVar.invoke(new mu.q(e0Var, d0Var, 12));
                synchronized (((tf.y) e0Var.B)) {
                    if (((u.s) e0Var.C).c(d0Var) == null && h0Var2.b()) {
                        ((u.s) e0Var.C).d(d0Var, h0Var2);
                    }
                }
                return h0Var2;
            } catch (Exception e3) {
                throw new IllegalStateException("Could not load font", e3);
            }
        }
    }

    public final h0 b(i iVar, u uVar, int i10, int i11) {
        a aVar = this.f12736b;
        aVar.getClass();
        int i12 = aVar.A;
        u uVar2 = (i12 == 0 || i12 == Integer.MAX_VALUE) ? uVar : new u(ab.a0.y(uVar.A + i12, 1, 1000));
        this.f12735a.getClass();
        return a(new d0(iVar, uVar2, i10, i11, null));
    }
}
