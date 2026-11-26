package tf;

public abstract class t3 extends p3 {
    public boolean D;

    public t3(y3 y3Var) {
        super(y3Var);
        this.C.R++;
    }

    public final void W0() {
        if (!this.D) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void X0() {
        if (this.D) {
            throw new IllegalStateException("Can't initialize twice");
        }
        Y0();
        this.C.S++;
        this.D = true;
    }

    public abstract void Y0();
}
