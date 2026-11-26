package v30;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import ri.t1;

public final class h extends r1.a {
    public int D;
    public Object[] E;
    public boolean F;

    public h(Object[] root, int i, int i2, int i3) {
        super(i, i2, 1);
        m.e(root, "root");
        this.D = i3;
        Object[] objArr = new Object[i3];
        this.E = objArr;
        ?? r5 = i == i2 ? 1 : 0;
        this.F = r5;
        objArr[0] = root;
        c(i - r5, 1);
    }

    public final Object a() {
        int i = ((r1.a) this).B & 31;
        Object obj = this.E[this.D - 1];
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i];
    }

    public final void c(int i, int i2) {
        int i3 = (this.D - i2) * 5;
        while (i2 < this.D) {
            Object[] objArr = this.E;
            Object obj = objArr[i2 - 1];
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[t1.C(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void e(int i) {
        int i2 = 0;
        while (t1.C(((r1.a) this).B, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            c(((r1.a) this).B, ((this.D - 1) - (i2 / 5)) + 1);
        }
    }

    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i = ((r1.a) this).B + 1;
        ((r1.a) this).B = i;
        if (i == ((r1.a) this).C) {
            this.F = true;
            return objA;
        }
        e(0);
        return objA;
    }

    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        ((r1.a) this).B--;
        if (this.F) {
            this.F = false;
            return a();
        }
        e(31);
        return a();
    }
}
