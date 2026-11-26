package e7;

import android.os.SystemClock;

public final class g {

    public final b0 f5134a;

    public boolean f5135b;

    public g() {
        this(b0.f5117a);
    }

    public g(b0 b0Var) {
        this.f5134a = b0Var;
    }

    public final synchronized void a() {
        while (!this.f5135b) {
            this.f5134a.getClass();
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f5135b) {
            try {
                this.f5134a.getClass();
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c(long j9) {
        try {
            if (j9 <= 0) {
                return this.f5135b;
            }
            this.f5134a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = j9 + jElapsedRealtime;
            if (j10 < jElapsedRealtime) {
                b();
            } else {
                boolean z10 = false;
                while (!this.f5135b && jElapsedRealtime < j10) {
                    try {
                        this.f5134a.getClass();
                        wait(j10 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                    this.f5134a.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.f5135b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d() {
        if (this.f5135b) {
            return false;
        }
        this.f5135b = true;
        notifyAll();
        return true;
    }
}
