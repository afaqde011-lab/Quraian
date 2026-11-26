package a40;

import kotlinx.coroutines.TimeoutCancellationException;

public final class z1 extends f40.p implements Runnable {
    public final long E;

    public z1(long j, m00.c cVar) {
        super(cVar, cVar.getContext());
        this.E = j;
    }

    @Override
    public final String U() {
        return super.U() + "(timeMillis=" + this.E + ')';
    }

    @Override
    public final void run() {
        c0.p(this.C);
        q(new TimeoutCancellationException("Timed out waiting for " + this.E + " ms", this));
    }
}
