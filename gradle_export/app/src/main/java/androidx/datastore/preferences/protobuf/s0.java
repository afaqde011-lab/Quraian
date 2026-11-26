package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

public final class s0 extends b implements RandomAccess {
    public static final s0 D = new s0(new Object[0], 0, false);
    public Object[] B;
    public int C;

    public s0(Object[] objArr, int i10, boolean z10) {
        this.A = z10;
        this.B = objArr;
        this.C = i10;
    }

    @Override
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.C)) {
            StringBuilder sbQ = oi.k.q("Index:", i10, ", Size:");
            sbQ.append(this.C);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        Object[] objArr = this.B;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[a1.b.A(i11, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.B, i10, objArr2, i10 + 1, this.C - i10);
            this.B = objArr2;
        }
        this.B[i10] = obj;
        this.C++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean add(Object obj) {
        a();
        int i10 = this.C;
        Object[] objArr = this.B;
        if (i10 == objArr.length) {
            this.B = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.B;
        int i11 = this.C;
        this.C = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.C) {
            StringBuilder sbQ = oi.k.q("Index:", i10, ", Size:");
            sbQ.append(this.C);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    public final s0 c(int i10) {
        if (i10 >= this.C) {
            return new s0(Arrays.copyOf(this.B, i10), this.C, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final Object get(int i10) {
        b(i10);
        return this.B[i10];
    }

    @Override
    public final Object remove(int i10) {
        a();
        b(i10);
        Object[] objArr = this.B;
        Object obj = objArr[i10];
        int i11 = this.C;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.C--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override
    public final Object set(int i10, Object obj) {
        a();
        b(i10);
        Object[] objArr = this.B;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override
    public final int size() {
        return this.C;
    }
}
