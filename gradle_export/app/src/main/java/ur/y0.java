package ur;

import java.util.List;

public final class y0 {
    public final qr.c a;
    public final qr.t b;
    public final List c;
    public final u30.b d;

    public y0(qr.c data, qr.t eventUi, List favoriteReciterIds, u30.b sections) {
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(eventUi, "eventUi");
        kotlin.jvm.internal.m.e(favoriteReciterIds, "favoriteReciterIds");
        kotlin.jvm.internal.m.e(sections, "sections");
        this.a = data;
        this.b = eventUi;
        this.c = favoriteReciterIds;
        this.d = sections;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return kotlin.jvm.internal.m.a(this.a, y0Var.a) && kotlin.jvm.internal.m.a(this.b, y0Var.b) && kotlin.jvm.internal.m.a(this.c, y0Var.c) && kotlin.jvm.internal.m.a(this.d, y0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + g4.c.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "HomeObservedData(data=" + this.a + ", eventUi=" + this.b + ", favoriteReciterIds=" + this.c + ", sections=" + this.d + ")";
    }
}
