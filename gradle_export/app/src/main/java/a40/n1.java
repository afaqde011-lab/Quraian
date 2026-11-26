package a40;

import kotlinx.coroutines.DispatchException;

public final class n1 extends g0 {
    public final k00.c D;

    public n1(k00.i iVar, u00.n nVar) {
        super(iVar, false);
        this.D = qd.s0.Z(this, this, nVar);
    }

    @Override
    public final void Y() throws Throwable {
        try {
            f40.a.h(g00.b0.a, qd.s0.j0(this.D));
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).A;
            }
            resumeWith(ri.t1.s(th));
            throw th;
        }
    }
}
