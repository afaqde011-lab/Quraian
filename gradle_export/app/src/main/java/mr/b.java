package mr;

import kotlin.jvm.internal.m;

public final class b {
    public final String a;
    public final c b;

    public b(String str, c type) {
        m.e(type, "type");
        this.a = str;
        this.b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.a, bVar.a) && this.b == bVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeScreenSection(slug=" + this.a + ", type=" + this.b + ")";
    }
}
