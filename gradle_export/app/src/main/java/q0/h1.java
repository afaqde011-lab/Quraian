package q0;

public final class h1 {

    public static final h1 f12619c = new h1(null, null, 63);

    public final u00.k f12620a;

    public final u00.k f12621b;

    public h1(u00.k kVar, u00.k kVar2, int i10) {
        kVar = (i10 & 1) != 0 ? null : kVar;
        kVar2 = (i10 & 4) != 0 ? null : kVar2;
        this.f12620a = kVar;
        this.f12621b = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f12620a == h1Var.f12620a && this.f12621b == h1Var.f12621b;
    }

    public final int hashCode() {
        u00.k kVar = this.f12620a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 961;
        u00.k kVar2 = this.f12621b;
        return (iHashCode + (kVar2 != null ? kVar2.hashCode() : 0)) * 29791;
    }
}
