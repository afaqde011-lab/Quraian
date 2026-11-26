package h00;

import java.util.RandomAccess;

public final class o extends f implements RandomAccess {
    public final int[] A;

    public o(int[] iArr) {
        this.A = iArr;
    }

    @Override
    public final int a() {
        return this.A.length;
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return n.n0(this.A, ((Number) obj).intValue());
    }

    @Override
    public final Object get(int i) {
        return Integer.valueOf(this.A[i]);
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.A;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iIntValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.A.length == 0;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.A;
        kotlin.jvm.internal.m.e(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        return -1;
    }
}
