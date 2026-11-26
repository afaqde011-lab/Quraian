package k2;

import i2.s;
import y3.m;

public final class a {

    public y3.c f8916a;

    public m f8917b;

    public s f8918c;

    public long f8919d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.m.a(this.f8916a, aVar.f8916a) && this.f8917b == aVar.f8917b && kotlin.jvm.internal.m.a(this.f8918c, aVar.f8918c) && h2.e.a(this.f8919d, aVar.f8919d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8919d) + ((this.f8918c.hashCode() + ((this.f8917b.hashCode() + (this.f8916a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f8916a + ", layoutDirection=" + this.f8917b + ", canvas=" + this.f8918c + ", size=" + ((Object) h2.e.h(this.f8919d)) + ')';
    }
}
