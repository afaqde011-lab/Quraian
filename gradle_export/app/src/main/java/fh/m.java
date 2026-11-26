package fh;

import java.util.List;
import java.util.ListIterator;

public final class m extends d implements ListIterator {
    public final n E;

    public m(n nVar) {
        super(nVar);
        this.E = nVar;
    }

    public m(n nVar, int i10) {
        super(nVar, ((List) nVar.B).listIterator(i10));
        this.E = nVar;
    }

    @Override
    public final void add(Object obj) {
        n nVar = this.E;
        boolean zIsEmpty = nVar.isEmpty();
        b().add(obj);
        nVar.F.F++;
        if (zIsEmpty) {
            nVar.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.B;
    }

    @Override
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override
    public final Object previous() {
        return b().previous();
    }

    @Override
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override
    public final void set(Object obj) {
        b().set(obj);
    }
}
