package b3;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class q implements ListIterator, v00.a {
    public final int A;
    public int B;
    public int C;
    public int D;
    public final Object E;

    public q(s sVar, int i10, int i11) {
        this(sVar, (i11 & 1) != 0 ? 0 : i10, 0, sVar.A.f14838b);
        this.A = 0;
    }

    public q(s sVar, int i10, int i11, int i12) {
        this.A = 0;
        this.E = sVar;
        this.B = i10;
        this.C = i11;
        this.D = i12;
    }

    public q(i00.a aVar, int i10) {
        this.A = 1;
        this.E = aVar;
        this.B = i10;
        this.C = -1;
        this.D = i00.a.e(aVar);
    }

    public q(i00.b bVar, int i10) {
        this.A = 2;
        this.E = bVar;
        this.B = i10;
        this.C = -1;
        this.D = i00.b.e(bVar);
    }

    public q(z1.p pVar, int i10) {
        this.A = 3;
        this.E = pVar;
        this.B = i10 - 1;
        this.C = -1;
        this.D = z1.q.j(pVar);
    }

    public void a() {
        if (i00.b.e(((i00.a) this.E).E) != this.D) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final void add(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                i00.a aVar = (i00.a) this.E;
                int i10 = this.B;
                this.B = i10 + 1;
                aVar.add(i10, obj);
                this.C = -1;
                this.D = i00.a.e(aVar);
                return;
            case 2:
                c();
                i00.b bVar = (i00.b) this.E;
                int i11 = this.B;
                this.B = i11 + 1;
                bVar.add(i11, obj);
                this.C = -1;
                this.D = i00.b.e(bVar);
                return;
            default:
                e();
                z1.p pVar = (z1.p) this.E;
                pVar.add(this.B + 1, obj);
                this.C = -1;
                this.B++;
                this.D = z1.q.j(pVar);
                return;
        }
    }

    public void c() {
        if (i00.b.e((i00.b) this.E) != this.D) {
            throw new ConcurrentModificationException();
        }
    }

    public void e() {
        if (z1.q.j((z1.p) this.E) != this.D) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return this.B < this.D;
            case 1:
                return this.B < ((i00.a) this.E).C;
            case 2:
                return this.B < ((i00.b) this.E).B;
            default:
                return this.B < ((z1.p) this.E).size() - 1;
        }
    }

    @Override
    public final boolean hasPrevious() {
        switch (this.A) {
            case 0:
                return this.B > this.C;
            case 1:
                return this.B > 0;
            case 2:
                return this.B > 0;
            default:
                return this.B >= 0;
        }
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                u.d0 d0Var = ((s) this.E).A;
                int i10 = this.B;
                this.B = i10 + 1;
                Object objF = d0Var.f(i10);
                kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (b2.q) objF;
            case 1:
                a();
                int i11 = this.B;
                i00.a aVar = (i00.a) this.E;
                if (i11 >= aVar.C) {
                    throw new NoSuchElementException();
                }
                this.B = i11 + 1;
                this.C = i11;
                return aVar.A[aVar.B + i11];
            case 2:
                c();
                int i12 = this.B;
                i00.b bVar = (i00.b) this.E;
                if (i12 >= bVar.B) {
                    throw new NoSuchElementException();
                }
                this.B = i12 + 1;
                this.C = i12;
                return bVar.A[i12];
            default:
                e();
                int i13 = this.B + 1;
                this.C = i13;
                z1.p pVar = (z1.p) this.E;
                z1.q.a(i13, pVar.size());
                Object obj = pVar.get(i13);
                this.B = i13;
                return obj;
        }
    }

    @Override
    public final int nextIndex() {
        switch (this.A) {
            case 0:
                return this.B - this.C;
            case 1:
                return this.B;
            case 2:
                return this.B;
            default:
                return this.B + 1;
        }
    }

    @Override
    public final Object previous() {
        switch (this.A) {
            case 0:
                u.d0 d0Var = ((s) this.E).A;
                int i10 = this.B - 1;
                this.B = i10;
                Object objF = d0Var.f(i10);
                kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (b2.q) objF;
            case 1:
                a();
                int i11 = this.B;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.B = i12;
                this.C = i12;
                i00.a aVar = (i00.a) this.E;
                return aVar.A[aVar.B + i12];
            case 2:
                c();
                int i13 = this.B;
                if (i13 <= 0) {
                    throw new NoSuchElementException();
                }
                int i14 = i13 - 1;
                this.B = i14;
                this.C = i14;
                return ((i00.b) this.E).A[i14];
            default:
                e();
                int i15 = this.B;
                z1.p pVar = (z1.p) this.E;
                z1.q.a(i15, pVar.size());
                int i16 = this.B;
                this.C = i16;
                Object obj = pVar.get(i16);
                this.B--;
                return obj;
        }
    }

    @Override
    public final int previousIndex() {
        int i10;
        switch (this.A) {
            case 0:
                return (this.B - this.C) - 1;
            case 1:
                i10 = this.B;
                break;
            case 2:
                i10 = this.B;
                break;
            default:
                return this.B;
        }
        return i10 - 1;
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                i00.a aVar = (i00.a) this.E;
                a();
                int i10 = this.C;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                aVar.c(i10);
                this.B = this.C;
                this.C = -1;
                this.D = i00.a.e(aVar);
                return;
            case 2:
                i00.b bVar = (i00.b) this.E;
                c();
                int i11 = this.C;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.c(i11);
                this.B = this.C;
                this.C = -1;
                this.D = i00.b.e(bVar);
                return;
            default:
                e();
                z1.p pVar = (z1.p) this.E;
                pVar.remove(this.C);
                this.B--;
                this.C = -1;
                this.D = z1.q.j(pVar);
                return;
        }
    }

    @Override
    public final void set(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i10 = this.C;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((i00.a) this.E).set(i10, obj);
                return;
            case 2:
                c();
                int i11 = this.C;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((i00.b) this.E).set(i11, obj);
                return;
            default:
                z1.p pVar = (z1.p) this.E;
                e();
                int i12 = this.C;
                if (i12 < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                pVar.set(i12, obj);
                this.D = z1.q.j(pVar);
                return;
        }
    }
}
