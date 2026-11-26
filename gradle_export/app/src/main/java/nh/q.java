package nh;

import java.util.Objects;

public final class q extends c {

    public final int f11351b;

    public final j f11352c;

    public q(int i10, j jVar) {
        this.f11351b = i10;
        this.f11352c = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f11351b == this.f11351b && qVar.f11352c == this.f11352c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f11351b), this.f11352c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb2.append(this.f11352c);
        sb2.append(", ");
        return g4.c.g(this.f11351b, "-byte key)", sb2);
    }
}
