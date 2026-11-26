package ie;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class c extends Thread {
    public final WeakReference A;
    public final long B;
    public final CountDownLatch C = new CountDownLatch(1);
    public boolean D = false;

    public c(b bVar, long j9) {
        this.A = new WeakReference(bVar);
        this.B = j9;
        start();
    }

    @Override
    public final void run() {
        b bVar;
        WeakReference weakReference = this.A;
        try {
            if (this.C.await(this.B, TimeUnit.MILLISECONDS) || (bVar = (b) weakReference.get()) == null) {
                return;
            }
            bVar.b();
            this.D = true;
        } catch (InterruptedException unused) {
            b bVar2 = (b) weakReference.get();
            if (bVar2 != null) {
                bVar2.b();
                this.D = true;
            }
        }
    }
}
