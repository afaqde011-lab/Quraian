package nf;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class u extends q implements NavigableSet, e0 {
    public final transient Comparator D;
    public transient u E;

    public u(Comparator comparator) {
        this.D = comparator;
    }

    public static b0 p(Comparator comparator) {
        if (x.B.equals(comparator)) {
            return b0.G;
        }
        k kVar = o.B;
        return new b0(z.E, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Comparator comparator() {
        return this.D;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        b0 b0Var = (b0) this;
        return b0Var.s(0, b0Var.q(obj, z10));
    }

    @Override
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        b0 b0Var = (b0) this;
        return b0Var.s(0, b0Var.q(obj, false));
    }

    public abstract Object last();

    @Override
    public final u descendingSet() {
        u uVarP = this.E;
        if (uVarP == null) {
            b0 b0Var = (b0) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(b0Var.D);
            uVarP = b0Var.isEmpty() ? p(comparatorReverseOrder) : new b0(b0Var.F.i(), comparatorReverseOrder);
            this.E = uVarP;
            uVarP.E = this;
        }
        return uVarP;
    }

    @Override
    public final b0 subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.D.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        b0 b0Var = (b0) this;
        b0 b0VarS = b0Var.s(b0Var.r(obj, z10), b0Var.F.size());
        return b0VarS.s(0, b0VarS.q(obj2, z11));
    }

    @Override
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        b0 b0Var = (b0) this;
        return b0Var.s(b0Var.r(obj, z10), b0Var.F.size());
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        b0 b0Var = (b0) this;
        return b0Var.s(b0Var.r(obj, true), b0Var.F.size());
    }
}
