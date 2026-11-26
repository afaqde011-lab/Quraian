package qd;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class c0 implements ThreadFactory {

    public final int f12866a;

    public final ThreadFactory f12867b;

    public final Serializable f12868c;

    public c0(String str) {
        this.f12866a = 1;
        this.f12867b = Executors.defaultThreadFactory();
        this.f12868c = str;
    }

    public c0(b bVar) {
        this.f12866a = 0;
        this.f12867b = Executors.defaultThreadFactory();
        this.f12868c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f12866a) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.f12868c;
                Thread threadNewThread = this.f12867b.newThread(runnable);
                threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return threadNewThread;
            default:
                Thread threadNewThread2 = this.f12867b.newThread(new ji.j(runnable, 1));
                threadNewThread2.setName((String) this.f12868c);
                return threadNewThread2;
        }
    }
}
