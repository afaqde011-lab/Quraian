package nh;

import java.util.Objects;

public final class k extends c {

    public final int f11335b;

    public final int f11336c;

    public final int f11337d;

    public final j f11338e;

    public k(int i10, int i11, int i12, j jVar) {
        this.f11335b = i10;
        this.f11336c = i11;
        this.f11337d = i12;
        this.f11338e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f11335b == this.f11335b && kVar.f11336c == this.f11336c && kVar.f11337d == this.f11337d && kVar.f11338e == this.f11338e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11335b), Integer.valueOf(this.f11336c), Integer.valueOf(this.f11337d), this.f11338e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesEax Parameters (variant: ");
        sb2.append(this.f11338e);
        sb2.append(", ");
        sb2.append(this.f11336c);
        sb2.append("-byte IV, ");
        sb2.append(this.f11337d);
        sb2.append("-byte tag, and ");
        return g4.c.g(this.f11335b, "-byte key)", sb2);
    }
}
