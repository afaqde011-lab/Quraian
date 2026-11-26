package nm;

import bt.t1;
import d40.d1;
import d40.o;
import java.util.concurrent.ConcurrentHashMap;
import jo.g;

public final class b {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final d1 b = o.b(0, 2, c40.a.B);

    public final t1 a(String str) {
        return new t1(new g(this.b, str, 1), 12);
    }

    public final void b(Object obj, String str) {
        ConcurrentHashMap concurrentHashMap = this.a;
        concurrentHashMap.put(str, obj);
        this.b.f(concurrentHashMap);
    }
}
