package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class a0 extends b implements c0, RandomAccess, v0 {
    public static final a0 D = new a0(new int[0], 0, false);
    public int[] B;
    public int C;

    public a0(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.B = iArr;
        this.C = i10;
    }

    @Override
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.C)) {
            StringBuilder sbQ = oi.k.q("Index:", i10, ", Size:");
            sbQ.append(this.C);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
        int[] iArr = this.B;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[a1.b.A(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.B, i10, iArr2, i10 + 1, this.C - i10);
            this.B = iArr2;
        }
        this.B[i10] = iIntValue;
        this.C++;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }

    @Override
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = e0.f885a;
        collection.getClass();
        if (!(collection instanceof a0)) {
            return super.addAll(collection);
        }
        a0 a0Var = (a0) collection;
        int i10 = a0Var.C;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.C;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.B;
        if (i12 > iArr.length) {
            this.B = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(a0Var.B, 0, this.B, this.C, a0Var.C);
        this.C = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addInt(int i10) {
        a();
        int i11 = this.C;
        int[] iArr = this.B;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[a1.b.A(i11, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.B = iArr2;
        }
        int[] iArr3 = this.B;
        int i12 = this.C;
        this.C = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void b(int i10) {
        if (i10 < 0 || i10 >= this.C) {
            StringBuilder sbQ = oi.k.q("Index:", i10, ", Size:");
            sbQ.append(this.C);
            throw new IndexOutOfBoundsException(sbQ.toString());
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return super.equals(obj);
        }
        a0 a0Var = (a0) obj;
        if (this.C != a0Var.C) {
            return false;
        }
        int[] iArr = a0Var.B;
        for (int i10 = 0; i10 < this.C; i10++) {
            if (this.B[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    public final int getInt(int i10) {
        b(i10);
        return this.B[i10];
    }

    @Override
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.C; i11++) {
            i10 = (i10 * 31) + this.B[i11];
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.C;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.B[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override
    public final d0 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.C) {
            return new a0(Arrays.copyOf(this.B, i10), this.C, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public final Object remove(int i10) {
        a();
        b(i10);
        int[] iArr = this.B;
        int i11 = iArr[i10];
        int i12 = this.C;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.C--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override
    public final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.B;
        System.arraycopy(iArr, i11, iArr, i10, this.C - i11);
        this.C -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        b(i10);
        int[] iArr = this.B;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override
    public final int size() {
        return this.C;
    }
}
