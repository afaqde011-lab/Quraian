package tf;

public abstract class o1 extends f5.c {
    public boolean C;

    public o1(h1 h1Var) {
        super(h1Var);
        ((h1) this.B).f14625a0++;
    }

    public abstract boolean W0();

    public final void X0() {
        if (!this.C) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void Y0() {
        if (this.C) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (W0()) {
            return;
        }
        ((h1) this.B).f14627c0.incrementAndGet();
        this.C = true;
    }
}
