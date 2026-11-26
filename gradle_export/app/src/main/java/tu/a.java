package tu;

import kotlin.jvm.internal.m;
import su.c;
import su.d;
import su.t;

public final class a {
    public final c a;
    public final d b;
    public final t c;

    public a(c cVar, d dVar, t tVar) {
        this.a = cVar;
        this.b = dVar;
        this.c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && m.a(this.b, aVar.b) && m.a(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SavedMemorizationSession(plan=" + this.a + ", recording=" + this.b + ", window=" + this.c + ")";
    }
}
