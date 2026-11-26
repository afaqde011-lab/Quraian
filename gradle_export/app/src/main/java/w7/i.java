package w7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;
import ta.c0;

public final class i extends Handler implements Runnable {
    public final int A;
    public final j B;
    public final long C;
    public h D;
    public IOException E;
    public int F;
    public Thread G;
    public boolean H;
    public volatile boolean I;
    public final l J;

    public i(l lVar, Looper looper, j jVar, h hVar, int i10, long j9) {
        super(looper);
        this.J = lVar;
        this.B = jVar;
        this.D = hVar;
        this.A = i10;
        this.C = j9;
    }

    public final void a(boolean z10) {
        this.I = z10;
        this.E = null;
        if (hasMessages(1)) {
            this.H = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.H = true;
                    this.B.l();
                    Thread thread = this.G;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.J.f15877b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            h hVar = this.D;
            hVar.getClass();
            hVar.r(this.B, jElapsedRealtime, jElapsedRealtime - this.C, true);
            this.D = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = jElapsedRealtime - this.C;
        h hVar = this.D;
        hVar.getClass();
        hVar.h(this.B, jElapsedRealtime, j9, this.F);
        this.E = null;
        l lVar = this.J;
        x7.a aVar = lVar.f15876a;
        i iVar = lVar.f15877b;
        iVar.getClass();
        aVar.execute(iVar);
    }

    @Override
    public final void handleMessage(Message message) {
        if (this.I) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            b();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        this.J.f15877b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = jElapsedRealtime - this.C;
        h hVar = this.D;
        hVar.getClass();
        if (this.H) {
            hVar.r(this.B, jElapsedRealtime, j9, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                hVar.u(this.B, jElapsedRealtime, j9);
                return;
            } catch (RuntimeException e3) {
                e7.a.e("LoadTask", "Unexpected exception handling load completed", e3);
                this.J.f15878c = new Loader$UnexpectedLoaderException(e3);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.E = iOException;
        int i12 = this.F + 1;
        this.F = i12;
        i9.d dVarF = hVar.f(this.B, jElapsedRealtime, j9, iOException, i12);
        int i13 = dVarF.f7552a;
        if (i13 == 3) {
            this.J.f15878c = this.E;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.F = 1;
            }
            long jMin = dVarF.f7553b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.F - 1) * 1000, 5000);
            }
            l lVar = this.J;
            c0.A(lVar.f15877b == null);
            lVar.f15877b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.H;
                this.G = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.B.getClass().getSimpleName()));
                try {
                    this.B.h();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.G = null;
                Thread.interrupted();
            }
            if (this.I) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e3) {
            if (this.I) {
                return;
            }
            obtainMessage(3, e3).sendToTarget();
        } catch (Exception e10) {
            if (this.I) {
                return;
            }
            e7.a.e("LoadTask", "Unexpected exception loading stream", e10);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e10)).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.I) {
                return;
            }
            e7.a.e("LoadTask", "OutOfMemory error loading stream", e11);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.I) {
                e7.a.e("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
