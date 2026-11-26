package b1;

import com.google.android.gms.internal.measurement.x5;

public final class c {

    public static final c f1933f = new c(false, 9205357640488583168L, 0.0f, x3.j.A, false);

    public final boolean f1934a;

    public final long f1935b;

    public final float f1936c;

    public final x3.j f1937d;

    public final boolean f1938e;

    public c(boolean z10, long j9, float f3, x3.j jVar, boolean z11) {
        this.f1934a = z10;
        this.f1935b = j9;
        this.f1936c = f3;
        this.f1937d = jVar;
        this.f1938e = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1934a == cVar.f1934a && h2.b.b(this.f1935b, cVar.f1935b) && Float.compare(this.f1936c, cVar.f1936c) == 0 && this.f1937d == cVar.f1937d && this.f1938e == cVar.f1938e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1938e) + ((this.f1937d.hashCode() + w.c.c(this.f1936c, w.c.f(Boolean.hashCode(this.f1934a) * 31, this.f1935b, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextFieldHandleState(visible=");
        sb2.append(this.f1934a);
        sb2.append(", position=");
        sb2.append((Object) h2.b.h(this.f1935b));
        sb2.append(", lineHeight=");
        sb2.append(this.f1936c);
        sb2.append(", direction=");
        sb2.append(this.f1937d);
        sb2.append(", handlesCrossed=");
        return x5.o(sb2, this.f1938e, ')');
    }
}
