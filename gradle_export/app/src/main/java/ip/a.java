package ip;

import kotlin.jvm.internal.m;
import w.c;

public final class a {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final u00.a d;

    public a(String title, boolean z, boolean z2, u00.a onClick) {
        m.e(title, "title");
        m.e(onClick, "onClick");
        this.a = title;
        this.b = z;
        this.c = z2;
        this.d = onClick;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && m.a(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + c.e(c.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "ActionButtonDvo(title=" + this.a + ", enabled=" + this.b + ", loading=" + this.c + ", onClick=" + this.d + ")";
    }
}
