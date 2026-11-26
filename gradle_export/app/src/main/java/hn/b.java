package hn;

import kotlin.jvm.internal.m;

public final class b {
    public final u30.b a;

    public b(u30.b items) {
        m.e(items, "items");
        this.a = items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && m.a(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FavoritesWidgetState(items=" + this.a + ")";
    }
}
