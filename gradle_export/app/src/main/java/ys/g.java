package ys;

public final class g {
    public final String a;
    public final l b;

    public g(String id, l lVar) {
        kotlin.jvm.internal.m.e(id, "id");
        this.a = id;
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.m.a(this.a, gVar.a) && kotlin.jvm.internal.m.a(this.b, gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsightsYearOverviewCellDvo(id=" + this.a + ", state=" + this.b + ")";
    }
}
