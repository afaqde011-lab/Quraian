package ji;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class h extends d4.g implements ScheduledFuture {
    public final ScheduledFuture H;

    public h(g gVar) {
        this.H = gVar.a(new gi.c(this, 11));
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.H.compareTo(delayed);
    }

    @Override
    public final void d() {
        ScheduledFuture scheduledFuture = this.H;
        Object obj = this.A;
        scheduledFuture.cancel((obj instanceof d4.a) && ((d4.a) obj).f4594a);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.H.getDelay(timeUnit);
    }
}
