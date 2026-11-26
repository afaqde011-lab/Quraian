package p9;

import java.util.Map;
import kotlin.jvm.internal.m;
import u00.k;

public final class c {

    public final a10.d f12461a;

    public final k f12462b;

    public final Map f12463c;

    public final v1.c f12464d;

    public c(a10.d dVar, k kVar, Map map, v1.c cVar) {
        this.f12461a = dVar;
        this.f12462b = kVar;
        this.f12463c = map;
        this.f12464d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.f12461a, cVar.f12461a) && m.a(this.f12462b, cVar.f12462b) && m.a(this.f12463c, cVar.f12463c) && this.f12464d.equals(cVar.f12464d);
    }

    public final int hashCode() {
        return this.f12464d.hashCode() + ((this.f12463c.hashCode() + ((this.f12462b.hashCode() + (this.f12461a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EntryClassProvider(clazz=" + this.f12461a + ", clazzContentKey=" + this.f12462b + ", metadata=" + this.f12463c + ", content=" + this.f12464d + ')';
    }
}
