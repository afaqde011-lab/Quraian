package a40;

import java.util.concurrent.ScheduledFuture;

public final class n0 implements o0 {
    public final ScheduledFuture A;

    public n0(ScheduledFuture scheduledFuture) {
        this.A = scheduledFuture;
    }

    @Override
    public final void dispose() {
        this.A.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.A + ']';
    }
}
