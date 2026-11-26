package f40;

import a40.c0;
import kotlinx.coroutines.DispatchException;
import qd.s0;

public class p extends a40.a implements m00.d {
    public final k00.c D;

    public p(k00.c cVar, k00.i iVar) {
        super(iVar, true);
        this.D = cVar;
    }

    @Override
    public final boolean R() {
        return true;
    }

    @Override
    public final m00.d getCallerFrame() {
        k00.c cVar = this.D;
        if (cVar instanceof m00.d) {
            return (m00.d) cVar;
        }
        return null;
    }

    public void k0() {
    }

    @Override
    public void n(Object obj) throws DispatchException {
        a.h(c0.A(obj), s0.j0(this.D));
    }

    @Override
    public void o(Object obj) {
        this.D.resumeWith(c0.A(obj));
    }
}
