package a40;

import kotlinx.coroutines.DispatchException;

public final class r0 extends t0 {
    public final k C;
    public final v0 D;

    public r0(v0 v0Var, long j, k kVar) {
        super(j);
        this.D = v0Var;
        this.C = kVar;
    }

    @Override
    public final void run() throws DispatchException {
        this.C.D(this.D, g00.b0.a);
    }

    @Override
    public final String toString() {
        return super.toString() + this.C;
    }
}
