package l0;

public final class r0 {

    public final Object f9785a;

    public final s0 f9786b;

    public int f9788d;

    public r0 f9789e;

    public boolean f9790f;

    public int f9787c = -1;

    public final l1.i1 f9791g = l1.q.z(null);

    public r0(Object obj, s0 s0Var) {
        this.f9785a = obj;
        this.f9786b = s0Var;
    }

    public final r0 a() {
        if (this.f9790f) {
            g0.a.c("Pin should not be called on an already disposed item ");
        }
        if (this.f9788d == 0) {
            this.f9786b.A.add(this);
            r0 r0Var = (r0) this.f9791g.getValue();
            if (r0Var != null) {
                r0Var.a();
            } else {
                r0Var = null;
            }
            this.f9789e = r0Var;
        }
        this.f9788d++;
        return this;
    }

    public final void b() {
        if (this.f9790f) {
            return;
        }
        if (this.f9788d <= 0) {
            g0.a.c("Release should only be called once");
        }
        int i10 = this.f9788d - 1;
        this.f9788d = i10;
        if (i10 == 0) {
            this.f9786b.A.remove(this);
            r0 r0Var = this.f9789e;
            if (r0Var != null) {
                r0Var.b();
            }
            this.f9789e = null;
        }
    }
}
