package kc;

public final class g implements b {

    public final int f9610a;

    public g(String str, int i10, boolean z10) {
        this.f9610a = i10;
    }

    @Override
    public final ec.c a(cc.i iVar, cc.a aVar, lc.b bVar) {
        iVar.getClass();
        oc.b.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MergePaths{mode=");
        int i10 = this.f9610a;
        if (i10 == 1) {
            str = "MERGE";
        } else if (i10 == 2) {
            str = "ADD";
        } else if (i10 == 3) {
            str = "SUBTRACT";
        } else if (i10 != 4) {
            str = i10 != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        sb2.append(str);
        sb2.append('}');
        return sb2.toString();
    }
}
