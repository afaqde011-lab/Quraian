package ii;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class k implements fj.c, fj.b {

    public final HashMap f7702a;

    public ArrayDeque f7703b;

    public final ji.l f7704c;

    public k() {
        ji.l lVar = ji.l.A;
        this.f7702a = new HashMap();
        this.f7703b = new ArrayDeque();
        this.f7704c = lVar;
    }

    public final synchronized void a(Executor executor, fj.a aVar) {
        try {
            executor.getClass();
            if (!this.f7702a.containsKey(bi.b.class)) {
                this.f7702a.put(bi.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f7702a.get(bi.b.class)).put(aVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
