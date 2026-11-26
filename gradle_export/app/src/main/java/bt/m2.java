package bt;

public final class m2 {
    public final int a;
    public final ss.v b;

    public m2(int i, ss.v vVar) {
        this.a = i;
        this.b = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return this.a == m2Var.a && kotlin.jvm.internal.m.a(this.b, m2Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        ss.v vVar = this.b;
        return iHashCode + (vVar == null ? 0 : vVar.hashCode());
    }

    public final String toString() {
        return "PeriodSummary(historyDays=" + this.a + ", summary=" + this.b + ")";
    }
}
