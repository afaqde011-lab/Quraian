package i00;

import h00.j;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;

public final class i extends j implements Serializable {
    public static final i B;
    public final f A;

    static {
        f fVar = f.N;
        B = new i(f.N);
    }

    public i() {
        this(new f());
    }

    public i(f backing) {
        m.e(backing, "backing");
        this.A = backing;
    }

    @Override
    public final int a() {
        return this.A.I;
    }

    @Override
    public final boolean add(Object obj) {
        return this.A.a(obj) >= 0;
    }

    @Override
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        this.A.e();
        return super.addAll(elements);
    }

    @Override
    public final void clear() {
        this.A.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.A.containsKey(obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        f fVar = this.A;
        fVar.getClass();
        return new c(fVar, 1);
    }

    @Override
    public final boolean remove(Object obj) {
        f fVar = this.A;
        fVar.e();
        int iK = fVar.k(obj);
        if (iK < 0) {
            return false;
        }
        fVar.o(iK);
        return true;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        m.e(elements, "elements");
        this.A.e();
        return super.removeAll(elements);
    }

    @Override
    public final boolean retainAll(Collection elements) {
        m.e(elements, "elements");
        this.A.e();
        return super.retainAll(elements);
    }
}
