package i2;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.List;

public final class n0 extends r0 {

    public final List f7147c;

    public final List f7148d;

    public final long f7149e;

    public final float f7150f;

    public n0(List list, ArrayList arrayList, long j9, float f3) {
        this.f7147c = list;
        this.f7148d = arrayList;
        this.f7149e = j9;
        this.f7150f = f3;
    }

    @Override
    public final Shader b(long j9) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j10 = this.f7149e;
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            long jX = ca.v.x(j9);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jX >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jX & 4294967295L));
        } else {
            int i10 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
                i10 = (int) (j9 >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i10);
            int i11 = (int) (j10 & 4294967295L);
            if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
                i11 = (int) (j9 & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i11);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fD = this.f7150f;
        if (fD == Float.POSITIVE_INFINITY) {
            fD = h2.e.d(j9) / 2;
        }
        float f3 = fD;
        List list = this.f7147c;
        List list2 = this.f7148d;
        b0.G(list, list2);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = b0.C(((t) list.get(i12)).f7169a);
        }
        return new RadialGradient(fIntBitsToFloat3, fIntBitsToFloat4, f3, iArr, b0.v(list2, list), b0.B(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f7147c.equals(n0Var.f7147c) && kotlin.jvm.internal.m.a(this.f7148d, n0Var.f7148d) && h2.b.b(this.f7149e, n0Var.f7149e) && this.f7150f == n0Var.f7150f;
    }

    public final int hashCode() {
        int iHashCode = this.f7147c.hashCode() * 31;
        List list = this.f7148d;
        return Integer.hashCode(0) + w.c.c(this.f7150f, w.c.f((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.f7149e, 31), 31);
    }

    public final String toString() {
        String str;
        long j9 = this.f7149e;
        long j10 = 9223372034707292159L & j9;
        String str2 = RuntimeVersion.SUFFIX;
        if (j10 != 9205357640488583168L) {
            str = "center=" + ((Object) h2.b.h(j9)) + ", ";
        } else {
            str = RuntimeVersion.SUFFIX;
        }
        float f3 = this.f7150f;
        if ((Float.floatToRawIntBits(f3) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f3 + ", ";
        }
        return "RadialGradient(colors=" + this.f7147c + ", stops=" + this.f7148d + ", " + str + str2 + "tileMode=" + ((Object) b0.F(0)) + ')';
    }
}
