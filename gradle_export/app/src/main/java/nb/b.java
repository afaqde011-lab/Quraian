package nb;

public final class b implements g {

    public final k f11198a;

    public final j40.i f11199b;

    public b(int i10, k kVar) {
        this.f11198a = kVar;
        int i11 = j40.j.a;
        this.f11199b = new j40.i(i10, 0);
    }

    @Override
    public final h a(qb.m mVar, wb.l lVar) {
        return new d(mVar.f12824a, lVar, this.f11199b, this.f11198a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof b;
    }

    public final int hashCode() {
        return b.class.hashCode();
    }
}
