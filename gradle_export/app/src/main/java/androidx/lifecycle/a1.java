package androidx.lifecycle;

import java.util.Iterator;

public abstract class a1 {

    public final v6.b f974b = new v6.b();

    public final void d(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        v6.b bVar = this.f974b;
        if (bVar != null) {
            if (bVar.f15484d) {
                v6.b.a(autoCloseable);
                return;
            }
            synchronized (bVar.f15481a) {
                autoCloseable2 = (AutoCloseable) bVar.f15482b.put(str, autoCloseable);
            }
            v6.b.a(autoCloseable2);
        }
    }

    public final void e() {
        v6.b bVar = this.f974b;
        if (bVar != null && !bVar.f15484d) {
            bVar.f15484d = true;
            synchronized (bVar.f15481a) {
                try {
                    Iterator it = bVar.f15482b.values().iterator();
                    while (it.hasNext()) {
                        v6.b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = bVar.f15483c.iterator();
                    while (it2.hasNext()) {
                        v6.b.a((AutoCloseable) it2.next());
                    }
                    bVar.f15483c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        g();
    }

    public final AutoCloseable f(String str) {
        AutoCloseable autoCloseable;
        v6.b bVar = this.f974b;
        if (bVar == null) {
            return null;
        }
        synchronized (bVar.f15481a) {
            autoCloseable = (AutoCloseable) bVar.f15482b.get(str);
        }
        return autoCloseable;
    }

    public void g() {
    }
}
