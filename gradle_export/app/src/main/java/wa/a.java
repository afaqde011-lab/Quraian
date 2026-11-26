package wa;

import kotlin.jvm.internal.m;
import w.c;

public final class a {

    public final int f15890a;

    public final int f15891b;

    public final int f15892c;

    public final int f15893d;

    static {
        new a(0, 0, 0, 0);
    }

    public a(int i10, int i11, int i12, int i13) {
        this.f15890a = i10;
        this.f15891b = i11;
        this.f15892c = i12;
        this.f15893d = i13;
        if (i10 > i12) {
            throw new IllegalArgumentException(c.h(i10, i12, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i11 > i13) {
            throw new IllegalArgumentException(c.h(i11, i13, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        a aVar = (a) obj;
        return this.f15890a == aVar.f15890a && this.f15891b == aVar.f15891b && this.f15892c == aVar.f15892c && this.f15893d == aVar.f15893d;
    }

    public final int hashCode() {
        return (((((this.f15890a * 31) + this.f15891b) * 31) + this.f15892c) * 31) + this.f15893d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a.class.getSimpleName());
        sb2.append(" { [");
        sb2.append(this.f15890a);
        sb2.append(',');
        sb2.append(this.f15891b);
        sb2.append(',');
        sb2.append(this.f15892c);
        sb2.append(',');
        return g4.c.g(this.f15893d, "] }", sb2);
    }
}
