package wb;

import h00.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class n implements Iterable, v00.a {
    public static final n B = new n(y.A);
    public final Map A;

    public n(Map map) {
        this.A = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return kotlin.jvm.internal.m.a(this.A, ((n) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override
    public final Iterator iterator() {
        Map map = this.A;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new g00.k((String) entry.getKey(), (m) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return w.c.m(new StringBuilder("Parameters(entries="), this.A, ')');
    }
}
