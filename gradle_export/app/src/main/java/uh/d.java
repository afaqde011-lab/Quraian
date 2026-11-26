package uh;

import java.util.Objects;

public final class d extends nh.c {

    public final int f15271b;

    public final int f15272c;

    public final c f15273d;

    public d(int i10, int i11, c cVar) {
        this.f15271b = i10;
        this.f15272c = i11;
        this.f15273d = cVar;
    }

    public final int a() {
        c cVar = c.f15261f;
        int i10 = this.f15272c;
        c cVar2 = this.f15273d;
        if (cVar2 == cVar) {
            return i10;
        }
        if (cVar2 != c.f15258c && cVar2 != c.f15259d && cVar2 != c.f15260e) {
            throw new IllegalStateException("Unknown variant");
        }
        return i10 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f15271b == this.f15271b && dVar.a() == a() && dVar.f15273d == this.f15273d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15271b), Integer.valueOf(this.f15272c), this.f15273d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb2.append(this.f15273d);
        sb2.append(", ");
        sb2.append(this.f15272c);
        sb2.append("-byte tags, and ");
        return g4.c.g(this.f15271b, "-byte key)", sb2);
    }
}
