package wj;

import com.google.android.gms.internal.measurement.x5;

public final class c0 {

    public final String f16127a;

    public final int f16128b;

    public final int f16129c;

    public final boolean f16130d;

    public c0(int i10, int i11, String str, boolean z10) {
        this.f16127a = str;
        this.f16128b = i10;
        this.f16129c = i11;
        this.f16130d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.f16127a, c0Var.f16127a) && this.f16128b == c0Var.f16128b && this.f16129c == c0Var.f16129c && this.f16130d == c0Var.f16130d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16130d) + w.c.d(this.f16129c, w.c.d(this.f16128b, this.f16127a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.f16127a);
        sb2.append(", pid=");
        sb2.append(this.f16128b);
        sb2.append(", importance=");
        sb2.append(this.f16129c);
        sb2.append(", isDefaultProcess=");
        return x5.o(sb2, this.f16130d, ')');
    }
}
