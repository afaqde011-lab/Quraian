package nh;

import java.util.Objects;

public final class n extends c {

    public final int f11343b;

    public final int f11344c;

    public final int f11345d;

    public final j f11346e;

    public n(int i10, int i11, int i12, j jVar) {
        this.f11343b = i10;
        this.f11344c = i11;
        this.f11345d = i12;
        this.f11346e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return nVar.f11343b == this.f11343b && nVar.f11344c == this.f11344c && nVar.f11345d == this.f11345d && nVar.f11346e == this.f11346e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11343b), Integer.valueOf(this.f11344c), Integer.valueOf(this.f11345d), this.f11346e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcm Parameters (variant: ");
        sb2.append(this.f11346e);
        sb2.append(", ");
        sb2.append(this.f11344c);
        sb2.append("-byte IV, ");
        sb2.append(this.f11345d);
        sb2.append("-byte tag, and ");
        return g4.c.g(this.f11343b, "-byte key)", sb2);
    }
}
