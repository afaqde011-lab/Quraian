package jh;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import ta.c0;

public final class b extends AbstractList implements RandomAccess, Serializable {
    public final int[] A;
    public final int B;
    public final int C;

    public b(int[] iArr, int i10, int i11) {
        this.A = iArr;
        this.B = i10;
        this.C = i11;
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.B;
        while (i10 < this.C) {
            if (this.A[i10] == iIntValue) {
                if (i10 != -1) {
                    return true;
                }
                return false;
            }
            i10++;
        }
        i10 = -1;
        if (i10 != -1) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (this.A[this.B + i10] != bVar.A[bVar.B + i10]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i10) {
        c0.u(i10, size());
        return Integer.valueOf(this.A[this.B + i10]);
    }

    @Override
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.B; i11 < this.C; i11++) {
            i10 = (i10 * 31) + this.A[i11];
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.B;
            int i11 = i10;
            while (i11 < this.C) {
                if (this.A[i11] != iIntValue) {
                    i11++;
                } else if (i11 >= 0) {
                    return i11 - i10;
                }
            }
            i11 = -1;
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i11 = this.C;
            do {
                i11--;
                i10 = this.B;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
            } while (this.A[i11] != iIntValue);
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override
    public final Object set(int i10, Object obj) {
        Integer num = (Integer) obj;
        c0.u(i10, size());
        int i11 = this.B + i10;
        int[] iArr = this.A;
        int i12 = iArr[i11];
        num.getClass();
        iArr[i11] = num.intValue();
        return Integer.valueOf(i12);
    }

    @Override
    public final int size() {
        return this.C - this.B;
    }

    @Override
    public final List subList(int i10, int i11) {
        c0.y(i10, i11, size());
        if (i10 == i11) {
            return Collections.EMPTY_LIST;
        }
        int i12 = this.B;
        return new b(this.A, i10 + i12, i12 + i11);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.A;
        int i10 = this.B;
        sb2.append(iArr[i10]);
        while (true) {
            i10++;
            if (i10 >= this.C) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i10]);
        }
    }
}
