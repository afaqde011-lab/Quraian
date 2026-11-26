package u4;

import ta.t;

public final class b {

    public boolean f14939a;

    public ce.a f14940b;

    public boolean f14941c;

    public final void a() {
        synchronized (this) {
            try {
                if (this.f14939a) {
                    return;
                }
                this.f14939a = true;
                this.f14941c = true;
                ce.a aVar = this.f14940b;
                if (aVar != null) {
                    try {
                        Runnable runnable = (Runnable) aVar.D;
                        t tVar = (t) aVar.C;
                        Runnable runnable2 = (Runnable) aVar.B;
                        if (runnable == null) {
                            tVar.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f14941c = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    this.f14941c = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
