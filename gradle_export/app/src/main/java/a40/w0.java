package a40;

public abstract class w0 extends v {
    public static final int F = 0;
    public long C;
    public boolean D;
    public h00.m E;

    @Override
    public final v q0(int i) {
        f40.a.a(1);
        return this;
    }

    public final void r0(boolean z) {
        long j = this.C - (z ? 4294967296L : 1L);
        this.C = j;
        if (j <= 0 && this.D) {
            shutdown();
        }
    }

    public final void s0(k0 k0Var) {
        h00.m mVar = this.E;
        if (mVar == null) {
            mVar = new h00.m();
            this.E = mVar;
        }
        mVar.addLast(k0Var);
    }

    public abstract void shutdown();

    public abstract Thread t0();

    public final void u0(boolean z) {
        this.C = (z ? 4294967296L : 1L) + this.C;
        if (z) {
            return;
        }
        this.D = true;
    }

    public abstract long v0();

    public final boolean w0() {
        h00.m mVar = this.E;
        if (mVar == null) {
            return false;
        }
        k0 k0Var = (k0) (mVar.isEmpty() ? null : mVar.removeFirst());
        if (k0Var == null) {
            return false;
        }
        k0Var.run();
        return true;
    }

    public void x0(long j, t0 t0Var) {
        d0.J.C0(j, t0Var);
    }
}
