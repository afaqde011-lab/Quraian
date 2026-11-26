package k7;

import android.os.SystemClock;

public final class b0 {

    public Exception f8988a;

    public long f8989b = -9223372036854775807L;

    public long f8990c = -9223372036854775807L;

    public final void a(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f8988a == null) {
            this.f8988a = exc;
        }
        if (this.f8989b == -9223372036854775807L && c0.f8992c0.get() <= 0) {
            this.f8989b = 200 + jElapsedRealtime;
        }
        long j9 = this.f8989b;
        if (j9 == -9223372036854775807L || jElapsedRealtime < j9) {
            this.f8990c = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.f8988a;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.f8988a;
        this.f8988a = null;
        this.f8989b = -9223372036854775807L;
        this.f8990c = -9223372036854775807L;
        throw exc3;
    }
}
