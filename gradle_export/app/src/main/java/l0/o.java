package l0;

public final class o {

    public final int f9780a;

    public final int f9781b;

    public o(int i10, int i11) {
        this.f9780a = i10;
        this.f9781b = i11;
        if (!(i10 >= 0)) {
            g0.a.a("negative start index");
        }
        if (i11 >= i10) {
            return;
        }
        g0.a.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f9780a == oVar.f9780a && this.f9781b == oVar.f9781b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9781b) + (Integer.hashCode(this.f9780a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Interval(start=");
        sb2.append(this.f9780a);
        sb2.append(", end=");
        return oi.k.l(sb2, this.f9781b, ')');
    }
}
