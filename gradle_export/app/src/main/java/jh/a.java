package jh;

import java.io.Serializable;
import ta.c0;

public final class a implements Serializable {
    public static final a C = new a(new int[0]);
    public final int[] A;
    public final int B;

    public a(int[] iArr) {
        int length = iArr.length;
        this.A = iArr;
        this.B = length;
    }

    public final int a(int i10) {
        c0.u(i10, this.B);
        return this.A[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i10 = aVar.B;
            int i11 = this.B;
            if (i11 == i10) {
                for (int i12 = 0; i12 < i11; i12++) {
                    if (a(i12) == aVar.a(i12)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.B; i11++) {
            i10 = (i10 * 31) + this.A[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.B;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.A;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
