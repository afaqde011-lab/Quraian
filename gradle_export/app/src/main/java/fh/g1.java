package fh;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class g1 extends s2 {
    public int A;
    public Object B;
    public final int C;
    public final Iterator D;
    public final Object E;

    public g1() {
        this.A = 2;
    }

    public g1(m2 m2Var) {
        this();
        this.C = 1;
        this.E = m2Var;
        this.D = m2Var.A.iterator();
    }

    public g1(Iterator it, eh.n nVar) {
        this();
        this.C = 0;
        this.D = it;
        this.E = nVar;
    }

    @Override
    public final boolean hasNext() {
        Object next;
        ta.c0.A(this.A != 4);
        int iB = e4.f.b(this.A);
        if (iB == 0) {
            return true;
        }
        if (iB != 2) {
            this.A = 4;
            switch (this.C) {
                case 0:
                    do {
                        Iterator it = this.D;
                        if (!it.hasNext()) {
                            this.A = 3;
                            next = null;
                        } else {
                            next = it.next();
                        }
                        break;
                    } while (!((eh.n) this.E).apply(next));
                    break;
                default:
                    do {
                        Iterator it2 = this.D;
                        if (!it2.hasNext()) {
                            this.A = 3;
                            next = null;
                        } else {
                            next = it2.next();
                        }
                        break;
                    } while (!((m2) this.E).B.contains(next));
                    break;
            }
            this.B = next;
            if (this.A != 3) {
                this.A = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.A = 2;
        Object obj = this.B;
        this.B = null;
        return obj;
    }
}
