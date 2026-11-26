package a40;

public final class p0 extends h1 {
    public final int E;
    public final Object F;

    public p0(Object obj, int i) {
        this.E = i;
        this.F = obj;
    }

    @Override
    public final boolean j() {
        switch (this.E) {
        }
        return false;
    }

    @Override
    public final void k(Throwable th) {
        switch (this.E) {
            case 0:
                ((o0) this.F).dispose();
                break;
            case 1:
                ((u00.k) this.F).invoke(th);
                break;
            default:
                i1 i1Var = (i1) this.F;
                Object obj = m1.A.get(i());
                if (!(obj instanceof s)) {
                    i1Var.resumeWith(c0.H(obj));
                } else {
                    i1Var.resumeWith(ri.t1.s(((s) obj).a));
                }
                break;
        }
    }
}
