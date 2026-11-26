package q30;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e implements Iterator, v00.a {
    public final int A;
    public final Iterator B;
    public int C;
    public Object D;
    public final j E;

    public e(f fVar) {
        this.A = 0;
        this.E = fVar;
        this.B = fVar.a.iterator();
        this.C = -1;
    }

    public e(g gVar) {
        this.A = 1;
        this.E = gVar;
        this.B = gVar.a.iterator();
    }

    public void a() {
        Object next;
        f fVar = (f) this.E;
        do {
            Iterator it = this.B;
            if (!it.hasNext()) {
                this.C = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) fVar.c.invoke(next)).booleanValue() != fVar.b);
        this.D = next;
        this.C = 1;
    }

    public boolean c() {
        Iterator it;
        Iterator it2 = (Iterator) this.D;
        if (it2 != null && it2.hasNext()) {
            this.C = 1;
            return true;
        }
        do {
            Iterator it3 = this.B;
            if (!it3.hasNext()) {
                this.C = 2;
                this.D = null;
                return false;
            }
            Object next = it3.next();
            g gVar = (g) this.E;
            it = (Iterator) gVar.c.invoke(gVar.b.invoke(next));
        } while (!it.hasNext());
        this.D = it;
        this.C = 1;
        return true;
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                if (this.C == -1) {
                    a();
                }
                return this.C == 1;
            default:
                int i = this.C;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return c();
        }
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                if (this.C == -1) {
                    a();
                }
                if (this.C == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.D;
                this.D = null;
                this.C = -1;
                return obj;
            default:
                int i = this.C;
                if (i == 2) {
                    throw new NoSuchElementException();
                }
                if (i == 0 && !c()) {
                    throw new NoSuchElementException();
                }
                this.C = 0;
                Iterator it = (Iterator) this.D;
                kotlin.jvm.internal.m.b(it);
                return it.next();
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
