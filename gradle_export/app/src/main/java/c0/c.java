package c0;

import i2.t;

public final class c {

    public final long f2577a;

    public final long f2578b;

    public final long f2579c;

    public final long f2580d;

    public final long f2581e;

    public c(long j9, long j10, long j11, long j12, long j13) {
        this.f2577a = j9;
        this.f2578b = j10;
        this.f2579c = j11;
        this.f2580d = j12;
        this.f2581e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return t.c(this.f2577a, cVar.f2577a) && t.c(this.f2578b, cVar.f2578b) && t.c(this.f2579c, cVar.f2579c) && t.c(this.f2580d, cVar.f2580d) && t.c(this.f2581e, cVar.f2581e);
    }

    public final int hashCode() {
        int i10 = t.f7168h;
        return Long.hashCode(this.f2581e) + w.c.f(w.c.f(w.c.f(Long.hashCode(this.f2577a) * 31, this.f2578b, 31), this.f2579c, 31), this.f2580d, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        w.c.s(this.f2577a, ", textColor=", sb2);
        w.c.s(this.f2578b, ", iconColor=", sb2);
        w.c.s(this.f2579c, ", disabledTextColor=", sb2);
        w.c.s(this.f2580d, ", disabledIconColor=", sb2);
        sb2.append((Object) t.i(this.f2581e));
        sb2.append(')');
        return sb2.toString();
    }
}
