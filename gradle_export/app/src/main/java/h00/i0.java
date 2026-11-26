package h00;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

public final class i0 extends f implements RandomAccess {
    public final Object[] A;
    public final int B;
    public int C;
    public int D;

    public i0(int i, Object[] objArr) {
        this.A = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.f(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.B = objArr.length;
            this.D = i;
        } else {
            StringBuilder sbQ = oi.k.q("ring buffer filled size: ", i, " cannot be larger than the buffer size: ");
            sbQ.append(objArr.length);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
    }

    @Override
    public final int a() {
        return this.D;
    }

    public final void c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.f(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.D) {
            StringBuilder sbQ = oi.k.q("n shouldn't be greater than the buffer size: n = ", i, ", size = ");
            sbQ.append(this.D);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        if (i > 0) {
            int i2 = this.C;
            int i3 = this.B;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.A;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.C = i4;
            this.D -= i;
        }
    }

    @Override
    public final Object get(int i) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(w.c.h(i, iA, "index: ", ", size: "));
        }
        return this.A[(this.C + i) % this.B];
    }

    @Override
    public final Iterator iterator() {
        return new h0(this);
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        kotlin.jvm.internal.m.e(array, "array");
        int length = array.length;
        int i = this.D;
        if (length < i) {
            array = Arrays.copyOf(array, i);
            kotlin.jvm.internal.m.d(array, "copyOf(...)");
        }
        int i2 = this.D;
        int i3 = this.C;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.A;
            if (i5 >= i2 || i3 >= this.B) {
                break;
            }
            array[i5] = objArr[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            array[i5] = objArr[i4];
            i5++;
            i4++;
        }
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }
}
