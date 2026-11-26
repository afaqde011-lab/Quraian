package d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public abstract class z {

    public boolean f4400b;

    public final ArrayList f4399a = new ArrayList();

    public final CopyOnWriteArrayList f4401c = new CopyOnWriteArrayList();

    public z(boolean z10) {
        this.f4400b = z10;
    }

    public void a() {
    }

    public abstract void b();

    public void c(b bVar) {
    }

    public void d(b bVar) {
    }

    public final void e() throws Exception {
        boolean zIsTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4401c;
        Iterator it = copyOnWriteArrayList.iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    throw new IllegalArgumentException();
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z10 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z10) {
                                executorService.shutdownNow();
                                z10 = true;
                            }
                        }
                    }
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        copyOnWriteArrayList.clear();
        ArrayList arrayList = this.f4399a;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((y) it2.next()).f();
        }
        arrayList.clear();
    }

    public final void f(boolean z10) {
        this.f4400b = z10;
        for (y yVar : this.f4399a) {
            yVar.g(yVar.f4398i && z10);
        }
    }
}
