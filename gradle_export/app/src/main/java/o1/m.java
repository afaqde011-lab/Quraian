package o1;

import java.util.Iterator;

public final class m implements a2.d, Iterable, v00.a {
    public final h A;
    public final int B;
    public final f C;

    public m(h hVar, int i10, c cVar, f fVar) {
        this.A = hVar;
        this.B = i10;
        this.C = fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.B == this.B && mVar.A.equals(this.A) && mVar.C.equals(this.C);
    }

    public final int hashCode() {
        return this.C.hashCode() + ((this.A.hashCode() + (this.B * 31)) * 31);
    }

    @Override
    public final Iterator iterator() {
        return new l(this.A, this.B, null, this.C);
    }
}
