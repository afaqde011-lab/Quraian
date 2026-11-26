package q;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import oi.v;

public final class b implements ThreadFactory {

    public final int f12556a;

    public final Number f12557b;

    public b(int i10) {
        this.f12556a = i10;
        switch (i10) {
            case 1:
                this.f12557b = new AtomicInteger(1);
                break;
            default:
                this.f12557b = new AtomicInteger(0);
                break;
        }
    }

    public b(AtomicLong atomicLong) {
        this.f12556a = 2;
        this.f12557b = atomicLong;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f12556a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f12557b).getAndIncrement());
                return thread;
            case 1:
                return new Thread(runnable, "ModernAsyncTask #" + ((AtomicInteger) this.f12557b).getAndIncrement());
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new v(runnable));
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f12557b).getAndIncrement());
                return threadNewThread;
        }
    }
}
