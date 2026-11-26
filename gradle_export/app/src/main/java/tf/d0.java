package tf;

public abstract class d0 extends z {
    public boolean C;

    public d0(h1 h1Var) {
        super(h1Var);
        ((h1) this.B).f14625a0++;
    }

    public final void W0() {
        if (!this.C) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void X0() {
        if (this.C) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (Y0()) {
            return;
        }
        ((h1) this.B).f14627c0.incrementAndGet();
        this.C = true;
    }

    public abstract boolean Y0();
}
