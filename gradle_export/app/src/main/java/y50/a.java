package y50;

import a10.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kh.n;
import kotlin.jvm.internal.m;
import u00.k;
import w50.b;

public final class a {
    public final String a = n.H();
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashSet d = new LinkedHashSet();
    public final ArrayList e = new ArrayList();

    public final void a(b bVar) {
        String value;
        v50.a aVar = bVar.a;
        d dVar = aVar.b;
        b60.a aVar2 = aVar.c;
        b60.a aVar3 = aVar.a;
        StringBuilder sb = new StringBuilder();
        sb.append(g60.a.a(dVar));
        sb.append(':');
        if (aVar2 == null || (value = aVar2.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        sb.append(':');
        sb.append(aVar3);
        String mapping = sb.toString();
        m.e(mapping, "mapping");
        this.c.put(mapping, bVar);
    }

    public final void b(b60.b bVar, k kVar) {
        kVar.invoke(new f60.a(bVar, this));
        this.d.add(bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return m.a(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
