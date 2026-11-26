package d6;

import com.google.android.gms.internal.measurement.x5;

public final class y1 {

    public final s1 f4716a;

    public final boolean f4717b;

    public final boolean f4718c;

    public y1(s1 s1Var, boolean z10, boolean z11) {
        this.f4716a = s1Var;
        this.f4717b = z10;
        this.f4718c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.f4716a == y1Var.f4716a && this.f4717b == y1Var.f4717b && this.f4718c == y1Var.f4718c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4718c) + w.c.e(this.f4716a.hashCode() * 31, 31, this.f4717b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RowColumnChildSelector(type=");
        sb2.append(this.f4716a);
        sb2.append(", expandWidth=");
        sb2.append(this.f4717b);
        sb2.append(", expandHeight=");
        return x5.o(sb2, this.f4718c, ')');
    }
}
