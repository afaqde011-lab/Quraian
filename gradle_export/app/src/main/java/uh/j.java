package uh;

import java.util.Objects;

public final class j extends nh.c {

    public final int f15281b;

    public final int f15282c;

    public final c f15283d;

    public final c f15284e;

    public j(int i10, int i11, c cVar, c cVar2) {
        this.f15281b = i10;
        this.f15282c = i11;
        this.f15283d = cVar;
        this.f15284e = cVar2;
    }

    public final int a() {
        c cVar = c.f15268o;
        int i10 = this.f15282c;
        c cVar2 = this.f15283d;
        if (cVar2 == cVar) {
            return i10;
        }
        if (cVar2 != c.l && cVar2 != c.m && cVar2 != c.f15267n) {
            throw new IllegalStateException("Unknown variant");
        }
        return i10 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f15281b == this.f15281b && jVar.a() == a() && jVar.f15283d == this.f15283d && jVar.f15284e == this.f15284e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15281b), Integer.valueOf(this.f15282c), this.f15283d, this.f15284e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HMAC Parameters (variant: ");
        sb2.append(this.f15283d);
        sb2.append(", hashType: ");
        sb2.append(this.f15284e);
        sb2.append(", ");
        sb2.append(this.f15282c);
        sb2.append("-byte tags, and ");
        return g4.c.g(this.f15281b, "-byte key)", sb2);
    }
}
