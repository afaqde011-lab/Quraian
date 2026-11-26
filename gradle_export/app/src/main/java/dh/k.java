package dh;

import java.util.Iterator;

public final class k extends i {
    public static final Object[] F;
    public static final k G;
    public final transient Object[] D;
    public final transient Object[] E;

    static {
        Object[] objArr = new Object[0];
        F = objArr;
        G = new k(objArr, objArr);
    }

    public k(Object[] objArr, Object[] objArr2) {
        this.D = objArr;
        this.E = objArr2;
    }

    @Override
    public final int a(Object[] objArr) {
        System.arraycopy(this.D, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final int c() {
        return 0;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.E.length;
        return false;
    }

    @Override
    public final Object[] e() {
        return this.D;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override
    public final Iterator iterator() {
        j jVar = this.B;
        if (jVar == null) {
            f fVar = h.B;
            jVar = j.D;
            this.B = jVar;
        }
        return jVar.listIterator(0);
    }

    @Override
    public final int size() {
        return 0;
    }
}
