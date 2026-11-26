package hb;

import h1.v0;
import java.util.Iterator;
import java.util.Set;

public final class z {

    public final ca.t f7033a;

    public final b f7034b = new b(6);

    public z(ca.t tVar) {
        this.f7033a = tVar;
    }

    public void a(String str, Set set) {
        kotlin.jvm.internal.m.e(str, "id");
        kotlin.jvm.internal.m.e(set, "tags");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            rd.a.M(this.f7033a, false, true, new v0(this, new y((String) it.next(), str), 8));
        }
    }
}
