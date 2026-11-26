package q4;

import android.graphics.Insets;
import oi.k;

public final class b {

    public static final b f12754e = new b(0, 0, 0, 0);

    public final int f12755a;

    public final int f12756b;

    public final int f12757c;

    public final int f12758d;

    public b(int i10, int i11, int i12, int i13) {
        this.f12755a = i10;
        this.f12756b = i11;
        this.f12757c = i12;
        this.f12758d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return c(Math.max(bVar.f12755a, bVar2.f12755a), Math.max(bVar.f12756b, bVar2.f12756b), Math.max(bVar.f12757c, bVar2.f12757c), Math.max(bVar.f12758d, bVar2.f12758d));
    }

    public static b b(b bVar, b bVar2) {
        return c(Math.min(bVar.f12755a, bVar2.f12755a), Math.min(bVar.f12756b, bVar2.f12756b), Math.min(bVar.f12757c, bVar2.f12757c), Math.min(bVar.f12758d, bVar2.f12758d));
    }

    public static b c(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f12754e : new b(i10, i11, i12, i13);
    }

    public static b d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return Insets.of(this.f12755a, this.f12756b, this.f12757c, this.f12758d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12758d == bVar.f12758d && this.f12755a == bVar.f12755a && this.f12757c == bVar.f12757c && this.f12756b == bVar.f12756b;
    }

    public final int hashCode() {
        return (((((this.f12755a * 31) + this.f12756b) * 31) + this.f12757c) * 31) + this.f12758d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f12755a);
        sb2.append(", top=");
        sb2.append(this.f12756b);
        sb2.append(", right=");
        sb2.append(this.f12757c);
        sb2.append(", bottom=");
        return k.l(sb2, this.f12758d, '}');
    }
}
