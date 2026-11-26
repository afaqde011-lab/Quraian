package t30;

import java.io.Serializable;
import kotlin.jvm.internal.m;
import qd.s0;
import r30.r;

public final class b implements Comparable, Serializable {
    public static final b C = new b(0, 0);
    public final long A;
    public final long B;

    public b(long j, long j2) {
        this.A = j;
        this.B = j2;
    }

    @Override
    public final int compareTo(Object obj) {
        b other = (b) obj;
        m.e(other, "other");
        long j = other.A;
        long j2 = this.A;
        return j2 != j ? Long.compareUnsigned(j2, j) : Long.compareUnsigned(this.B, other.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.A == bVar.A && this.B == bVar.B;
    }

    public final int hashCode() {
        return Long.hashCode(this.A ^ this.B);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        s0.e0(this.A, bArr, 0, 0, 4);
        bArr[8] = 45;
        s0.e0(this.A, bArr, 9, 4, 6);
        bArr[13] = 45;
        s0.e0(this.A, bArr, 14, 6, 8);
        bArr[18] = 45;
        s0.e0(this.B, bArr, 19, 0, 2);
        bArr[23] = 45;
        s0.e0(this.B, bArr, 24, 2, 8);
        return r.o0(bArr);
    }
}
