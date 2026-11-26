package a50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.m;
import me.i;

public final class e {
    public static final e h;
    public static final Logger i;
    public final i a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final d g = new d(this, 0);

    static {
        String name = y40.b.g + " TaskRunner";
        m.e(name, "name");
        h = new e(new i(new y40.a(name, true)));
        Logger logger = Logger.getLogger(e.class.getName());
        m.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public e(i iVar) {
        this.a = iVar;
    }

    public static final void a(e eVar, a aVar) {
        byte[] bArr = y40.b.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.a);
        try {
            long jA = aVar.a();
            synchronized (eVar) {
                eVar.b(aVar, jA);
            }
        } finally {
            synchronized (eVar) {
                eVar.b(aVar, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(a aVar, long j) {
        byte[] bArr = y40.b.a;
        c cVar = aVar.c;
        m.b(cVar);
        if (cVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = cVar.f;
        cVar.f = false;
        cVar.d = null;
        this.e.remove(cVar);
        if (j != -1 && !z && !cVar.c) {
            cVar.d(aVar, j, true);
        }
        if (cVar.e.isEmpty()) {
            return;
        }
        this.f.add(cVar);
    }

    public final a c() {
        boolean z;
        byte[] bArr = y40.b.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                a aVar2 = (a) ((c) it.next()).e.get(0);
                long jMax = Math.max(0L, aVar2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.e;
            if (aVar != null) {
                byte[] bArr2 = y40.b.a;
                aVar.d = -1L;
                c cVar = aVar.c;
                m.b(cVar);
                cVar.e.remove(aVar);
                arrayList.remove(cVar);
                cVar.d = aVar;
                arrayList2.add(cVar);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    d runnable = this.g;
                    m.e(runnable, "runnable");
                    ((ThreadPoolExecutor) this.a.B).execute(runnable);
                }
                return aVar;
            }
            if (this.c) {
                if (jMin >= this.d - jNanoTime) {
                    break;
                }
                notify();
                break;
            }
            this.c = true;
            this.d = jNanoTime + jMin;
            try {
                try {
                    long j = jMin / 1000000;
                    long j2 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        wait(j, (int) j2);
                    }
                } catch (InterruptedException unused) {
                    for (int size = arrayList2.size() - 1; -1 < size; size--) {
                        ((c) arrayList2.get(size)).b();
                    }
                    for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                        c cVar2 = (c) arrayList.get(size2);
                        cVar2.b();
                        if (cVar2.e.isEmpty()) {
                            arrayList.remove(size2);
                        }
                    }
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
        return null;
    }

    public final void d(c taskQueue) {
        m.e(taskQueue, "taskQueue");
        byte[] bArr = y40.b.a;
        if (taskQueue.d == null) {
            boolean zIsEmpty = taskQueue.e.isEmpty();
            ArrayList arrayList = this.f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                m.e(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.c) {
            notify();
            return;
        }
        d runnable = this.g;
        m.e(runnable, "runnable");
        ((ThreadPoolExecutor) this.a.B).execute(runnable);
    }

    public final c e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new c(this, g4.c.f(i2, "Q"));
    }
}
