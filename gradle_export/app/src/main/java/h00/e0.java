package h00;

import java.util.List;
import java.util.ListIterator;

public final class e0 implements ListIterator, v00.a {
    public final int A = 0;
    public final Object B;
    public final Object C;

    public e0(f0 f0Var, int i) {
        this.C = f0Var;
        this.B = f0Var.A.listIterator(q.B0(i, f0Var));
    }

    public e0(g0 g0Var, int i) {
        this.C = g0Var;
        this.B = ((List) g0Var.B).listIterator(q.B0(i, g0Var));
    }

    public e0(kotlin.jvm.internal.x xVar, z1.e0 e0Var) {
        this.B = xVar;
        this.C = e0Var;
    }

    @Override
    public final void add(Object obj) {
        switch (this.A) {
            case 0:
                ListIterator listIterator = (ListIterator) this.B;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return ((ListIterator) this.B).hasPrevious();
            case 1:
                return ((ListIterator) this.B).hasPrevious();
            default:
                return ((kotlin.jvm.internal.x) this.B).A < ((z1.e0) this.C).D - 1;
        }
    }

    @Override
    public final boolean hasPrevious() {
        switch (this.A) {
            case 0:
                return ((ListIterator) this.B).hasNext();
            case 1:
                return ((ListIterator) this.B).hasNext();
            default:
                return ((kotlin.jvm.internal.x) this.B).A >= 0;
        }
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                return ((ListIterator) this.B).previous();
            case 1:
                return ((ListIterator) this.B).previous();
            default:
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.B;
                int i = xVar.A + 1;
                z1.e0 e0Var = (z1.e0) this.C;
                z1.q.a(i, e0Var.D);
                xVar.A = i;
                return e0Var.get(i);
        }
    }

    @Override
    public final int nextIndex() {
        int iPreviousIndex;
        int iM;
        switch (this.A) {
            case 0:
                f0 f0Var = (f0) this.C;
                iPreviousIndex = ((ListIterator) this.B).previousIndex();
                iM = va.a.M(f0Var);
                break;
            case 1:
                g0 g0Var = (g0) this.C;
                iPreviousIndex = ((ListIterator) this.B).previousIndex();
                iM = va.a.M(g0Var);
                break;
            default:
                return ((kotlin.jvm.internal.x) this.B).A + 1;
        }
        return iM - iPreviousIndex;
    }

    @Override
    public final Object previous() {
        switch (this.A) {
            case 0:
                return ((ListIterator) this.B).next();
            case 1:
                return ((ListIterator) this.B).next();
            default:
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.B;
                int i = xVar.A;
                z1.e0 e0Var = (z1.e0) this.C;
                z1.q.a(i, e0Var.D);
                xVar.A = i - 1;
                return e0Var.get(i);
        }
    }

    @Override
    public final int previousIndex() {
        int iNextIndex;
        int iM;
        switch (this.A) {
            case 0:
                f0 f0Var = (f0) this.C;
                iNextIndex = ((ListIterator) this.B).nextIndex();
                iM = va.a.M(f0Var);
                break;
            case 1:
                g0 g0Var = (g0) this.C;
                iNextIndex = ((ListIterator) this.B).nextIndex();
                iM = va.a.M(g0Var);
                break;
            default:
                return ((kotlin.jvm.internal.x) this.B).A;
        }
        return iM - iNextIndex;
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                ((ListIterator) this.B).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override
    public final void set(Object obj) {
        switch (this.A) {
            case 0:
                ((ListIterator) this.B).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }
}
