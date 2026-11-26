package za;

import java.util.concurrent.atomic.AtomicBoolean;

public final class p implements Runnable {
    public final int A;
    public final AtomicBoolean B;
    public final d4.h C;
    public final u00.a D;

    public p(AtomicBoolean atomicBoolean, d4.h hVar, u00.a aVar, int i10) {
        this.A = i10;
        this.B = atomicBoolean;
        this.C = hVar;
        this.D = aVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                d4.h hVar = this.C;
                u00.a aVar = this.D;
                if (!this.B.get()) {
                    try {
                        hVar.a(aVar.invoke());
                    } catch (Throwable th2) {
                        hVar.c(th2);
                        return;
                    }
                    break;
                }
                break;
            default:
                d4.h hVar2 = this.C;
                u00.a aVar2 = this.D;
                if (!this.B.get()) {
                    try {
                        hVar2.a(aVar2.invoke());
                    } catch (Throwable th3) {
                        hVar2.c(th3);
                    }
                    break;
                }
                break;
        }
    }
}
