package yu;

import kotlin.jvm.internal.m;

public final class c implements e {
    public final su.c a;

    public c(su.c cVar) {
        this.a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && m.a(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Start(plan=" + this.a + ")";
    }
}
