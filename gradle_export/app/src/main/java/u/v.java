package u;

import java.util.Arrays;

public final class v {

    public int[] f14903a;

    public int f14904b;

    public v() {
        this(16);
    }

    public v(int i10) {
        this.f14903a = i10 == 0 ? n.f14878a : new int[i10];
    }

    public final void a(int i10) {
        b(this.f14904b + 1);
        int[] iArr = this.f14903a;
        int i11 = this.f14904b;
        iArr[i11] = i10;
        this.f14904b = i11 + 1;
    }

    public final void b(int i10) {
        int[] iArr = this.f14903a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f14903a = iArrCopyOf;
        }
    }

    public final int c(int i10) {
        if (i10 >= 0 && i10 < this.f14904b) {
            return this.f14903a[i10];
        }
        v.a.d("Index must be between 0 and size");
        throw null;
    }

    public final int d() {
        int i10 = this.f14904b;
        if (i10 != 0) {
            return this.f14903a[i10 - 1];
        }
        v.a.e("IntList is empty.");
        throw null;
    }

    public final void e(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f14904b)) {
            v.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f14903a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            h00.n.p0(i10, i10 + 1, i11, iArr, iArr);
        }
        this.f14904b--;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            v vVar = (v) obj;
            int i10 = vVar.f14904b;
            int i11 = this.f14904b;
            if (i10 == i11) {
                int[] iArr = this.f14903a;
                int[] iArr2 = vVar.f14903a;
                z00.e eVarI0 = ab.a0.I0(0, i11);
                int i12 = ((z00.c) eVarI0).A;
                int i13 = ((z00.c) eVarI0).B;
                if (i12 > i13) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f14904b) {
            v.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f14903a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    public final int hashCode() {
        int[] iArr = this.f14903a;
        int i10 = this.f14904b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f14903a;
        int i10 = this.f14904b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            sb2.append(i12);
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }
}
