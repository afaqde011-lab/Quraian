package ii;

public final class i {

    public final p f7697a;

    public final boolean f7698b;

    public i(p pVar, boolean z10) {
        this.f7697a = pVar;
        this.f7698b = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f7697a.equals(this.f7697a) && iVar.f7698b == this.f7698b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f7698b).hashCode() ^ ((this.f7697a.hashCode() ^ 1000003) * 1000003);
    }
}
