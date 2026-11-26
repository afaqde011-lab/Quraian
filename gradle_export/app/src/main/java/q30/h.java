package q30;

import c3.y2;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ri.t1;
import u.g0;
import u.h0;
import u.k0;
import u.l0;

public final class h implements Iterator, v00.a {
    public final int A;
    public int B;
    public Object C;
    public final Object D;

    public h(y2 y2Var) {
        this.A = 2;
        this.D = ((j) y2Var.b).iterator();
        this.B = -1;
    }

    public h(i iVar) {
        this.A = 0;
        this.D = iVar;
        this.B = -2;
    }

    public h(i iVar, byte b) {
        this.A = 3;
        this.D = iVar;
        this.C = new e((g) iVar.b);
    }

    public h(p pVar) {
        this.A = 1;
        this.D = pVar;
        this.C = pVar.a.iterator();
    }

    public h(h0 h0Var) {
        this.A = 4;
        this.D = h0Var;
        this.B = -1;
        this.C = t1.F(new g0(h0Var, this, (k00.c) null));
    }

    public h(l0 l0Var) {
        this.A = 5;
        this.D = l0Var;
        this.B = -1;
        this.C = t1.F(new k0(l0Var, this, (k00.c) null));
    }

    public void a() {
        Object objInvoke;
        i iVar = (i) this.D;
        if (this.B == -2) {
            objInvoke = ((u00.a) iVar.b).invoke();
        } else {
            u00.k kVar = (u00.k) iVar.c;
            Object obj = this.C;
            kotlin.jvm.internal.m.b(obj);
            objInvoke = kVar.invoke(obj);
        }
        this.C = objInvoke;
        this.B = objInvoke == null ? 0 : 1;
    }

    public void c() {
        Iterator it = (Iterator) this.D;
        if (it.hasNext()) {
            Object next = it.next();
            j10.k it2 = (j10.k) next;
            kotlin.jvm.internal.m.e(it2, "it");
            if (it2 instanceof j10.b) {
                this.B = 1;
                this.C = next;
                return;
            }
        }
        this.B = 0;
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                if (this.B < 0) {
                    a();
                }
                return this.B == 1;
            case 1:
                p pVar = (p) this.D;
                Iterator it = (Iterator) this.C;
                while (this.B < pVar.b && it.hasNext()) {
                    it.next();
                    this.B++;
                }
                return this.B < pVar.c && it.hasNext();
            case 2:
                if (this.B == -1) {
                    c();
                }
                return this.B == 1;
            case 3:
                return ((Iterator) this.C).hasNext();
            case 4:
                return ((k) this.C).hasNext();
            default:
                return ((k) this.C).hasNext();
        }
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                if (this.B < 0) {
                    a();
                }
                if (this.B == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.C;
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.B = -1;
                return obj;
            case 1:
                p pVar = (p) this.D;
                Iterator it = (Iterator) this.C;
                while (this.B < pVar.b && it.hasNext()) {
                    it.next();
                    this.B++;
                }
                int i = this.B;
                if (i >= pVar.c) {
                    throw new NoSuchElementException();
                }
                this.B = i + 1;
                return it.next();
            case 2:
                if (this.B == -1) {
                    c();
                }
                if (this.B == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.C;
                this.C = null;
                this.B = -1;
                return obj2;
            case 3:
                d10.e eVar = (d10.e) ((i) this.D).c;
                int i2 = this.B;
                this.B = i2 + 1;
                if (i2 >= 0) {
                    return eVar.invoke(Integer.valueOf(i2), ((Iterator) this.C).next());
                }
                va.a.k0();
                throw null;
            case 4:
                return ((k) this.C).next();
            default:
                return ((k) this.C).next();
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                int i = this.B;
                if (i != -1) {
                    ((h0) this.D).B.h(i);
                    this.B = -1;
                    return;
                }
                return;
            default:
                int i2 = this.B;
                if (i2 != -1) {
                    ((l0) this.D).B.m(i2);
                    this.B = -1;
                    return;
                }
                return;
        }
    }
}
