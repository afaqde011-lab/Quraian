package u40;

import java.util.List;
import kotlin.jvm.internal.m;

public final class b {
    public final int a;
    public final float b;
    public final float c;
    public final List d;
    public final List e;
    public final List f;
    public final k00.f g;
    public final g h;
    public final v40.b i;

    public b(int i, float f, float f2, List size, List colors, List shapes, k00.f fVar, g gVar, v40.b bVar) {
        m.e(size, "size");
        m.e(colors, "colors");
        m.e(shapes, "shapes");
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = size;
        this.e = colors;
        this.f = shapes;
        this.g = fVar;
        this.h = gVar;
        this.i = bVar;
    }

    public static b a(b bVar, int i, float f, float f2, v40.b bVar2) {
        List size = bVar.d;
        List colors = bVar.e;
        List shapes = bVar.f;
        k00.f fVar = bVar.g;
        g gVar = bVar.h;
        m.e(size, "size");
        m.e(colors, "colors");
        m.e(shapes, "shapes");
        return new b(i, f, f2, size, colors, shapes, fVar, gVar, bVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0 && Float.compare(0.9f, 0.9f) == 0 && m.a(this.d, bVar.d) && m.a(this.e, bVar.e) && m.a(this.f, bVar.f) && this.g.equals(bVar.g) && this.h.equals(bVar.h) && this.i.equals(bVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + w.c.d(0, (this.g.hashCode() + ((((Long.hashCode(3000L) + g4.c.a(g4.c.a(g4.c.a(w.c.c(0.9f, w.c.c(this.c, w.c.c(this.b, w.c.d(this.a, Integer.hashCode(270) * 31, 31), 31), 31), 31), 31, this.d), 31, this.e), 31, this.f)) * 31) + 1) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "Party(angle=270, spread=" + this.a + ", speed=" + this.b + ", maxSpeed=" + this.c + ", damping=0.9, size=" + this.d + ", colors=" + this.e + ", shapes=" + this.f + ", timeToLive=3000, fadeOutEnabled=true, position=" + this.g + ", delay=0, rotation=" + this.h + ", emitter=" + this.i + ')';
    }
}
