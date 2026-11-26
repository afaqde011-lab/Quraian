package qi;

import java.util.Map;

public final class c {

    public final String f13018a;

    public final long f13019b;

    public final Map f13020c;

    public c(String str, long j9, Map map) {
        kotlin.jvm.internal.m.e(map, "additionalCustomKeys");
        this.f13018a = str;
        this.f13019b = j9;
        this.f13020c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f13018a, cVar.f13018a) && this.f13019b == cVar.f13019b && kotlin.jvm.internal.m.a(this.f13020c, cVar.f13020c);
    }

    public final int hashCode() {
        return this.f13020c.hashCode() + w.c.f(this.f13018a.hashCode() * 31, this.f13019b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventMetadata(sessionId=");
        sb2.append(this.f13018a);
        sb2.append(", timestamp=");
        sb2.append(this.f13019b);
        sb2.append(", additionalCustomKeys=");
        return w.c.m(sb2, this.f13020c, ')');
    }
}
