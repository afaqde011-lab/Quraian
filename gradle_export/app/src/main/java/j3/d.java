package j3;

public final class d {

    public final int f7930a;

    public final int f7931b;

    public d(int i10, int i11) {
        this.f7930a = i10;
        this.f7931b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7930a == dVar.f7930a && this.f7931b == dVar.f7931b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7931b) + (Integer.hashCode(this.f7930a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollectionInfo(rowCount=");
        sb2.append(this.f7930a);
        sb2.append(", columnCount=");
        return oi.k.l(sb2, this.f7931b, ')');
    }
}
