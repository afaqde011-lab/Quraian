package v30;

import c7.i;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import ri.t1;

public final class c extends a {
    public final Object[] A;
    public final Object[] B;
    public final int C;
    public final int D;

    public c(Object[] root, Object[] tail, int i, int i2) {
        m.e(root, "root");
        m.e(tail, "tail");
        this.A = root;
        this.B = tail;
        this.C = i;
        this.D = i2;
        if (a() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + a()).toString());
    }

    @Override
    public final int a() {
        return this.C;
    }

    @Override
    public final Object get(int i) {
        Object[] objArr;
        int i2 = this.C;
        i.o(i, i2);
        if (((i2 - 1) & (-32)) <= i) {
            objArr = this.B;
        } else {
            Object[] objArr2 = this.A;
            for (int i3 = this.D; i3 > 0; i3 -= 5) {
                Object[] objArr3 = objArr2[t1.C(i, i3)];
                m.c(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override
    public final ListIterator listIterator(int i) {
        i.p(i, this.C);
        return new e(i, this.C, (this.D / 5) + 1, this.A, this.B);
    }
}
