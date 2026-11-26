package u;

import java.util.Arrays;

public final class y {

    public long[] f14911a;

    public int f14912b;

    public y() {
        this(16);
    }

    public y(int i10) {
        this.f14911a = i10 == 0 ? p.f14883a : new long[i10];
    }

    public final void a(long j9) {
        int i10 = this.f14912b + 1;
        long[] jArr = this.f14911a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
            this.f14911a = jArrCopyOf;
        }
        long[] jArr2 = this.f14911a;
        int i11 = this.f14912b;
        jArr2[i11] = j9;
        this.f14912b = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            int i10 = yVar.f14912b;
            int i11 = this.f14912b;
            if (i10 == i11) {
                long[] jArr = this.f14911a;
                long[] jArr2 = yVar.f14911a;
                z00.e eVarI0 = ab.a0.I0(0, i11);
                int i12 = ((z00.c) eVarI0).A;
                int i13 = ((z00.c) eVarI0).B;
                if (i12 > i13) {
                    return true;
                }
                while (jArr[i12] == jArr2[i12]) {
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

    public final int hashCode() {
        long[] jArr = this.f14911a;
        int i10 = this.f14912b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f14911a;
        int i10 = this.f14912b;
        for (int i11 = 0; i11 < i10; i11++) {
            long j9 = jArr[i11];
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            sb2.append(j9);
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }
}
