package bk;

import java.util.ArrayList;
import java.util.Iterator;

public final class n extends q implements Iterable {
    public final ArrayList A = new ArrayList();

    @Override
    public final int a() {
        return h().a();
    }

    @Override
    public final String e() {
        return h().e();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof n) && ((n) obj).A.equals(this.A);
        }
        return true;
    }

    public final q h() {
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        throw new IllegalStateException(g4.c.f(size, "Array must have size 1, but has size "));
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return this.A.iterator();
    }
}
