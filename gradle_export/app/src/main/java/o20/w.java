package o20;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public final class w implements Iterator {
    public final Stack A = new Stack();
    public t B;

    public w(e eVar) {
        while (eVar instanceof y) {
            y yVar = (y) eVar;
            this.A.push(yVar);
            eVar = yVar.C;
        }
        this.B = (t) eVar;
    }

    @Override
    public final t next() {
        t tVar;
        t tVar2 = this.B;
        if (tVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            Stack stack = this.A;
            if (stack.isEmpty()) {
                tVar = null;
                break;
            }
            e eVar = ((y) stack.pop()).D;
            while (eVar instanceof y) {
                y yVar = (y) eVar;
                stack.push(yVar);
                eVar = yVar.C;
            }
            tVar = (t) eVar;
        } while (tVar.B.length == 0);
        this.B = tVar;
        return tVar2;
    }

    @Override
    public final boolean hasNext() {
        return this.B != null;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
