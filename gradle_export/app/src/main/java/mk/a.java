package mk;

import kotlin.jvm.internal.m;

public final class a {

    public static final a f10927e = new a(0.0f, null, 15);

    public static final a f10928f;

    public static final a f10929g;

    public final float f10930a;

    public final float f10931b;

    public final float f10932c;

    public final h f10933d;

    static {
        h.f10946a.getClass();
        f10928f = new a(0.0f, e.f10938c, 7);
        f10929g = new a(0.0f, e.f10939d, 7);
    }

    public a(float f3, float f10, float f11, h hVar) {
        m.e(hVar, "style");
        this.f10930a = f3;
        this.f10931b = f10;
        this.f10932c = f11;
        this.f10933d = hVar;
    }

    public a(float f3, h hVar, int i10) {
        f3 = (i10 & 1) != 0 ? 0.5f : f3;
        float f10 = f3 / 2.0f;
        if ((i10 & 8) != 0) {
            h.f10946a.getClass();
            hVar = e.f10937b;
        }
        this(f3, f10, 1.0f, hVar);
    }

    public static a a(a aVar, float f3, float f10, float f11, int i10) {
        if ((i10 & 1) != 0) {
            f3 = aVar.f10930a;
        }
        if ((i10 & 2) != 0) {
            f10 = aVar.f10931b;
        }
        h hVar = aVar.f10933d;
        aVar.getClass();
        m.e(hVar, "style");
        return new a(f3, f10, f11, hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return y3.f.b(this.f10930a, aVar.f10930a) && y3.f.b(this.f10931b, aVar.f10931b) && Float.compare(this.f10932c, aVar.f10932c) == 0 && m.a(this.f10933d, aVar.f10933d);
    }

    public final int hashCode() {
        return this.f10933d.hashCode() + w.c.c(this.f10932c, w.c.c(this.f10931b, Float.hashCode(this.f10930a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("Highlight(width=", y3.f.c(this.f10930a), ", blurRadius=", y3.f.c(this.f10931b), ", alpha=");
        sbS.append(this.f10932c);
        sbS.append(", style=");
        sbS.append(this.f10933d);
        sbS.append(")");
        return sbS.toString();
    }
}
