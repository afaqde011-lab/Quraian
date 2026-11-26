package androidx.media3.common;

import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;
import java.util.List;

public final class v0 {

    public final u0[] f1660a;

    public final long f1661b;

    public v0(long j9, u0... u0VarArr) {
        this.f1661b = j9;
        this.f1660a = u0VarArr;
    }

    public v0(List list) {
        this((u0[]) list.toArray(new u0[0]));
    }

    public v0(u0... u0VarArr) {
        this(-9223372036854775807L, u0VarArr);
    }

    public final v0 a(u0... u0VarArr) {
        if (u0VarArr.length == 0) {
            return this;
        }
        String str = e7.i0.f5136a;
        u0[] u0VarArr2 = this.f1660a;
        Object[] objArrCopyOf = Arrays.copyOf(u0VarArr2, u0VarArr2.length + u0VarArr.length);
        System.arraycopy(u0VarArr, 0, objArrCopyOf, u0VarArr2.length, u0VarArr.length);
        return new v0(this.f1661b, (u0[]) objArrCopyOf);
    }

    public final v0 b(v0 v0Var) {
        return v0Var == null ? this : a(v0Var.f1660a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            v0 v0Var = (v0) obj;
            if (Arrays.equals(this.f1660a, v0Var.f1660a) && this.f1661b == v0Var.f1661b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return c7.i.G(this.f1661b) + (Arrays.hashCode(this.f1660a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f1660a));
        long j9 = this.f1661b;
        if (j9 == -9223372036854775807L) {
            str = RuntimeVersion.SUFFIX;
        } else {
            str = ", presentationTimeUs=" + j9;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
