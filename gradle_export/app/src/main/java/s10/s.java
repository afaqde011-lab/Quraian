package s10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class s {
    public final String a;
    public final Map b;

    public s(String className, Map map) {
        kotlin.jvm.internal.m.e(className, "className");
        this.a = className;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.m.a(this.a, sVar.a) && kotlin.jvm.internal.m.a(this.b, sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() throws IOException {
        Iterable iterable;
        Map map = this.b;
        int size = map.size();
        Iterable iterableR = h00.x.A;
        if (size == 0) {
            iterable = iterableR;
        } else {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList(map.size());
                    arrayList.add(new g00.k(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new g00.k(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                    iterable = arrayList;
                } else {
                    iterableR = va.a.R(new g00.k(entry.getKey(), entry.getValue()));
                    iterable = iterableR;
                }
            } else {
                iterable = iterableR;
            }
        }
        return "@" + this.a + '(' + h00.q.R0(iterable, null, null, null, r.A, 31) + ')';
    }
}
