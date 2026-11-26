package d6;

import java.util.Map;

public final class j1 {

    public final int f4655a;

    public final int f4656b;

    public final Map f4657c;

    public j1(int i10, int i11) {
        this((i11 & 1) != 0 ? -1 : i10, -1, h00.y.A);
    }

    public j1(int i10, int i11, Map map) {
        this.f4655a = i10;
        this.f4656b = i11;
        this.f4657c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f4655a == j1Var.f4655a && this.f4656b == j1Var.f4656b && kotlin.jvm.internal.m.a(this.f4657c, j1Var.f4657c);
    }

    public final int hashCode() {
        return this.f4657c.hashCode() + w.c.d(this.f4656b, Integer.hashCode(this.f4655a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsertedViewInfo(mainViewId=");
        sb2.append(this.f4655a);
        sb2.append(", complexViewId=");
        sb2.append(this.f4656b);
        sb2.append(", children=");
        return w.c.m(sb2, this.f4657c, ')');
    }
}
