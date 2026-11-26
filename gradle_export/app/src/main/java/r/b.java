package r;

import java.util.Iterator;

public final class b extends e implements Iterator {
    public c A;
    public c B;
    public final int C;

    public b(c cVar, c cVar2, int i10) {
        this.C = i10;
        this.A = cVar2;
        this.B = cVar;
    }

    @Override
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.A == cVar && cVar == this.B) {
            this.B = null;
            this.A = null;
        }
        c cVar3 = this.A;
        if (cVar3 == cVar) {
            switch (this.C) {
                case 0:
                    cVar2 = cVar3.D;
                    break;
                default:
                    cVar2 = cVar3.C;
                    break;
            }
            this.A = cVar2;
        }
        c cVar4 = this.B;
        if (cVar4 == cVar) {
            c cVar5 = this.A;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.B = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.C) {
            case 0:
                return cVar.C;
            default:
                return cVar.D;
        }
    }

    @Override
    public final boolean hasNext() {
        return this.B != null;
    }

    @Override
    public final Object next() {
        c cVar = this.B;
        c cVar2 = this.A;
        this.B = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
