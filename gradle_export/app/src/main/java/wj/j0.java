package wj;

import com.google.android.gms.internal.measurement.x5;

public final class j0 {
    public static final i0 Companion = new i0();

    public final String f16180a;

    public final String f16181b;

    public final int f16182c;

    public final long f16183d;

    public j0(int i10, int i11, long j9, String str, String str2) {
        if (15 != (i10 & 15)) {
            p40.o0.g(i10, 15, h0.f16165a.getDescriptor());
            throw null;
        }
        this.f16180a = str;
        this.f16181b = str2;
        this.f16182c = i11;
        this.f16183d = j9;
    }

    public j0(String str, int i10, String str2, long j9) {
        this.f16180a = str;
        this.f16181b = str2;
        this.f16182c = i10;
        this.f16183d = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.m.a(this.f16180a, j0Var.f16180a) && kotlin.jvm.internal.m.a(this.f16181b, j0Var.f16181b) && this.f16182c == j0Var.f16182c && this.f16183d == j0Var.f16183d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16183d) + w.c.d(this.f16182c, x5.e(this.f16180a.hashCode() * 31, this.f16181b, 31), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f16180a + ", firstSessionId=" + this.f16181b + ", sessionIndex=" + this.f16182c + ", sessionStartTimestampUs=" + this.f16183d + ')';
    }
}
