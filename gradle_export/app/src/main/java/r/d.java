package r;

import java.util.Iterator;

public final class d extends e implements Iterator {
    public c A;
    public boolean B = true;
    public final f C;

    public d(f fVar) {
        this.C = fVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2 = this.A;
        if (cVar == cVar2) {
            c cVar3 = cVar2.D;
            this.A = cVar3;
            this.B = cVar3 == null;
        }
    }

    @Override
    public final boolean hasNext() {
        if (this.B) {
            return this.C.A != null;
        }
        c cVar = this.A;
        return (cVar == null || cVar.C == null) ? false : true;
    }

    @Override
    public final Object next() {
        if (this.B) {
            this.B = false;
            this.A = this.C.A;
        } else {
            c cVar = this.A;
            this.A = cVar != null ? cVar.C : null;
        }
        return this.A;
    }
}
