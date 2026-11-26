package k6;

import b6.l;
import kotlin.jvm.internal.m;

public final class b implements l {

    public final a f8973a;

    public b(a aVar) {
        this.f8973a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && m.a(this.f8973a, ((b) obj).f8973a);
    }

    public final int hashCode() {
        return this.f8973a.hashCode();
    }

    public final String toString() {
        return "SemanticsModifier(configuration=" + this.f8973a + ')';
    }
}
