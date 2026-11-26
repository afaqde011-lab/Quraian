package ji;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class d implements g {
    public final int A;
    public final f B;
    public final Runnable C;
    public final long D;
    public final long E;
    public final TimeUnit F;

    public d(f fVar, Runnable runnable, long j9, long j10, TimeUnit timeUnit, int i10) {
        this.A = i10;
        this.B = fVar;
        this.C = runnable;
        this.D = j9;
        this.E = j10;
        this.F = timeUnit;
    }

    @Override
    public final ScheduledFuture a(gi.c cVar) {
        switch (this.A) {
            case 0:
                f fVar = this.B;
                return fVar.B.scheduleAtFixedRate(new e(fVar, this.C, cVar, 0), this.D, this.E, this.F);
            default:
                f fVar2 = this.B;
                return fVar2.B.scheduleWithFixedDelay(new e(fVar2, this.C, cVar, 2), this.D, this.E, this.F);
        }
    }
}
