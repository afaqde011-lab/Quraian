package a50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import k00.f;
import kotlin.jvm.internal.m;

public final class c {
    public final e a;
    public final String b;
    public boolean c;
    public a d;
    public final ArrayList e;
    public boolean f;

    public c(e eVar, String name) {
        m.e(name, "name");
        this.a = eVar;
        this.b = name;
        this.e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = y40.b.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.d;
        if (aVar != null && aVar.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).b) {
                a aVar2 = (a) arrayList.get(size);
                if (e.i.isLoggable(Level.FINE)) {
                    f.m(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(a task, long j) {
        m.e(task, "task");
        synchronized (this.a) {
            if (!this.c) {
                if (d(task, j, false)) {
                    this.a.d(this);
                }
            } else if (task.b) {
                if (e.i.isLoggable(Level.FINE)) {
                    f.m(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (e.i.isLoggable(Level.FINE)) {
                    f.m(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a task, long j, boolean z) {
        Iterator it;
        int size;
        String strConcat;
        m.e(task, "task");
        c cVar = task.c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            task.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.d = j2;
            if (e.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(f.x(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(f.x(j2 - jNanoTime));
                }
                f.m(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).d - jNanoTime > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (task.d > j2) {
            arrayList.remove(iIndexOf);
            task.d = j2;
            if (e.i.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(f.x(j2 - jNanoTime));
                } else {
                    strConcat = "scheduled after ".concat(f.x(j2 - jNanoTime));
                }
                f.m(task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((a) it.next()).d - jNanoTime > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (e.i.isLoggable(Level.FINE)) {
            f.m(task, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void e() {
        byte[] bArr = y40.b.a;
        synchronized (this.a) {
            this.c = true;
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
