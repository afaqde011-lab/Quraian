package i2;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.List;

public final class g0 extends r0 {

    public final List f7132c;

    public final List f7133d;

    public final long f7134e;

    public final long f7135f;

    public g0(List list, ArrayList arrayList, long j9, long j10) {
        this.f7132c = list;
        this.f7133d = arrayList;
        this.f7134e = j9;
        this.f7135f = j10;
    }

    @Override
    public final Shader b(long j9) {
        long j10 = this.f7134e;
        int i10 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j9 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j9 & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i11);
        long j11 = this.f7135f;
        int i12 = (int) (j11 >> 32);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j9 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i12);
        int i13 = (int) (j11 & 4294967295L);
        if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
            i13 = (int) (j9 & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i13);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.f7132c;
        List list2 = this.f7133d;
        b0.G(list, list2);
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i14 = 0; i14 < size; i14++) {
            iArr[i14] = b0.C(((t) list.get(i14)).f7169a);
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, b0.v(list2, list), b0.B(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return kotlin.jvm.internal.m.a(this.f7132c, g0Var.f7132c) && kotlin.jvm.internal.m.a(this.f7133d, g0Var.f7133d) && h2.b.b(this.f7134e, g0Var.f7134e) && h2.b.b(this.f7135f, g0Var.f7135f);
    }

    public final int hashCode() {
        int iHashCode = this.f7132c.hashCode() * 31;
        List list = this.f7133d;
        return Integer.hashCode(0) + w.c.f(w.c.f((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.f7134e, 31), this.f7135f, 31);
    }

    public final String toString() {
        String str;
        long j9 = this.f7134e;
        long j10 = (((j9 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L);
        String str2 = RuntimeVersion.SUFFIX;
        if (j10 == 0) {
            str = "start=" + ((Object) h2.b.h(j9)) + ", ";
        } else {
            str = RuntimeVersion.SUFFIX;
        }
        long j11 = this.f7135f;
        if (((((j11 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) h2.b.h(j11)) + ", ";
        }
        return "LinearGradient(colors=" + this.f7132c + ", stops=" + this.f7133d + ", " + str + str2 + "tileMode=" + ((Object) b0.F(0)) + ')';
    }
}
