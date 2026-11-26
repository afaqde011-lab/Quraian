package nf;

import java.util.Iterator;

public final class d0 extends q {
    public final transient Object D;

    public d0(Object obj) {
        this.D = obj;
    }

    @Override
    public final int a(Object[] objArr) {
        objArr[0] = this.D;
        return 1;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.D.equals(obj);
    }

    @Override
    public final f0 e() {
        return new v(this.D);
    }

    @Override
    public final int hashCode() {
        return this.D.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new v(this.D);
    }

    @Override
    public final o l() {
        Object[] objArr = {this.D};
        for (int i10 = 0; i10 < 1; i10++) {
            k kVar = o.B;
            if (objArr[i10] == null) {
                throw new NullPointerException(g4.c.f(i10, "at index "));
            }
        }
        return o.l(1, objArr);
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return a1.b.p("[", this.D.toString(), "]");
    }
}
