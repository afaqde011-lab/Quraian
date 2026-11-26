package a40;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

public final class v1 extends f40.p {
    public final int E;

    public v1(k00.i iVar, k00.c cVar, int i) {
        super(cVar, iVar);
        this.E = i;
    }

    @Override
    public final boolean y(Throwable th) {
        switch (this.E) {
            case 0:
                return false;
            default:
                if (th instanceof ChildCancelledException) {
                    return true;
                }
                return q(th);
        }
    }
}
