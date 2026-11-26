package v7;

import androidx.media3.common.l2;
import fh.d2;
import fh.q0;
import fh.t0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import oi.y;

public final class d implements m, ud.g {
    public final boolean A;
    public final Object B;
    public final Object C;
    public final Object D;

    public d(boolean z10, Object obj, Object obj2, Object obj3) {
        this.B = obj;
        this.C = obj2;
        this.A = z10;
        this.D = obj3;
    }

    @Override
    public d2 b(int i10, l2 l2Var, int[] iArr) {
        p pVar = (p) this.B;
        j jVar = (j) this.C;
        int[] iArr2 = (int[]) this.D;
        pVar.getClass();
        e eVar = new e(pVar, jVar);
        int i11 = iArr2[i10];
        q0 q0VarM = t0.m();
        for (int i12 = 0; i12 < l2Var.f1338a; i12++) {
            q0VarM.c(new f(i10, l2Var, i12, jVar, iArr[i12], this.A, eVar, i11));
        }
        return q0VarM.g();
    }

    @Override
    public void d(Exception exc) throws Throwable {
        vi.b bVar = (vi.b) this.B;
        xf.g gVar = (xf.g) this.C;
        oi.b bVar2 = (oi.b) this.D;
        if (exc != null) {
            gVar.c(exc);
            return;
        }
        if (this.A) {
            boolean z10 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new oi.p(bVar, countDownLatch, 10)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = y.f12068a;
            boolean z11 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = jNanoTime - System.nanoTime();
                        z11 = true;
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = z11;
            }
        }
        gVar.d(bVar2);
    }
}
