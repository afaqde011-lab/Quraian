package d0;

import com.google.android.gms.internal.measurement.x5;

public final class i1 {

    public final long f4434a;

    public final long f4435b;

    public final boolean f4436c;

    public i1(long j9, long j10, boolean z10) {
        this.f4434a = j9;
        this.f4435b = j10;
        this.f4436c = z10;
    }

    public final i1 a(i1 i1Var) {
        return new i1(h2.b.f(this.f4434a, i1Var.f4434a), Math.max(this.f4435b, i1Var.f4435b), this.f4436c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return h2.b.b(this.f4434a, i1Var.f4434a) && this.f4435b == i1Var.f4435b && this.f4436c == i1Var.f4436c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4436c) + w.c.f(Long.hashCode(this.f4434a) * 31, this.f4435b, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MouseWheelScrollDelta(value=");
        sb2.append((Object) h2.b.h(this.f4434a));
        sb2.append(", timeMillis=");
        sb2.append(this.f4435b);
        sb2.append(", shouldApplyImmediately=");
        return x5.o(sb2, this.f4436c, ')');
    }
}
