package k30;

import java.util.Arrays;
import java.util.Iterator;

public final class c extends a {
    public Object[] A;
    public int B;

    @Override
    public final int a() {
        return this.B;
    }

    @Override
    public final void c(int i, e30.g gVar) {
        Object[] objArr = this.A;
        if (objArr.length <= i) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i);
            Object[] objArrCopyOf = Arrays.copyOf(this.A, length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.A = objArrCopyOf;
        }
        Object[] objArr2 = this.A;
        if (objArr2[i] == null) {
            this.B++;
        }
        objArr2[i] = gVar;
    }

    @Override
    public final Object get(int i) {
        return h00.n.I0(i, this.A);
    }

    @Override
    public final Iterator iterator() {
        return new b(this);
    }
}
