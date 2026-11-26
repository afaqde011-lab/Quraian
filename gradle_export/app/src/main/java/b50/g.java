package b50;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import qd.s0;
import x40.q;
import x40.w;

public final class g implements Runnable {
    public final x40.f A;
    public volatile AtomicInteger B = new AtomicInteger(0);
    public final j C;

    public g(j jVar, x40.f fVar) {
        this.C = jVar;
        this.A = fVar;
    }

    @Override
    public final void run() {
        w wVar;
        String strConcat = "OkHttp ".concat(((q) this.C.B.C).g());
        j jVar = this.C;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            jVar.D.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.A.f(jVar.h());
                        wVar = jVar.A;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            f50.m mVar = f50.m.a;
                            f50.m mVar2 = f50.m.a;
                            String str = "Callback failure for " + j.a(jVar);
                            mVar2.getClass();
                            f50.m.g(str, 4, e);
                        } else {
                            this.A.h(jVar, e);
                        }
                        wVar = jVar.A;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        jVar.cancel();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            s0.V(iOException, th);
                            this.A.h(jVar, iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    jVar.A.A.l(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            wVar.A.l(this);
            threadCurrentThread.setName(name);
        } catch (Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
