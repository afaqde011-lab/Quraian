package ac;

import mb.k;
import wb.j;
import wb.p;

public final class a implements e {

    public final int f428b;

    public a(int i10) {
        this.f428b = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override
    public final f a(k kVar, j jVar) {
        if ((jVar instanceof p) && ((p) jVar).f15977c != nb.e.A) {
            return new b(kVar, jVar, this.f428b);
        }
        return new d(kVar, jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f428b == ((a) obj).f428b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f428b * 31);
    }
}
