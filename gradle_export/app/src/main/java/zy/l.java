package zy;

import com.google.android.gms.internal.measurement.x5;

public final class l {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;

    public l(String reason, String reasonSpecification, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str3) {
        kotlin.jvm.internal.m.e(reason, "reason");
        kotlin.jvm.internal.m.e(reasonSpecification, "reasonSpecification");
        this.a = reason;
        this.b = reasonSpecification;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = str3;
    }

    public static l a(l lVar, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i3) {
        String reason = lVar.a;
        String reasonSpecification = lVar.b;
        if ((i3 & 4) != 0) {
            str = lVar.c;
        }
        String str3 = str;
        String str4 = lVar.d;
        if ((i3 & 16) != 0) {
            i = lVar.e;
        }
        int i4 = i;
        int i5 = (i3 & 32) != 0 ? lVar.f : i2;
        boolean z5 = (i3 & 64) != 0 ? lVar.g : z;
        boolean z6 = (i3 & 128) != 0 ? lVar.h : z2;
        boolean z7 = (i3 & 256) != 0 ? lVar.i : z3;
        boolean z8 = (i3 & 512) != 0 ? lVar.j : z4;
        String str5 = (i3 & 1024) != 0 ? lVar.k : str2;
        lVar.getClass();
        kotlin.jvm.internal.m.e(reason, "reason");
        kotlin.jvm.internal.m.e(reasonSpecification, "reasonSpecification");
        return new l(reason, reasonSpecification, str3, str4, i4, i5, z5, z6, z7, z8, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.a, lVar.a) && kotlin.jvm.internal.m.a(this.b, lVar.b) && kotlin.jvm.internal.m.a(this.c, lVar.c) && kotlin.jvm.internal.m.a(this.d, lVar.d) && this.e == lVar.e && this.f == lVar.f && this.g == lVar.g && this.h == lVar.h && this.i == lVar.i && this.j == lVar.j && kotlin.jvm.internal.m.a(this.k, lVar.k);
    }

    public final int hashCode() {
        int iE = w.c.e(w.c.e(w.c.e(w.c.e(w.c.d(this.f, w.c.d(this.e, x5.e(x5.e(x5.e(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        String str = this.k;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("DeleteAccountCodeUiState(reason=", this.a, ", reasonSpecification=", this.b, ", code=");
        a1.b.z(sbS, this.c, ", email=", this.d, ", resendSeconds=");
        w.c.u(sbS, this.e, ", resendSecondsLeft=", this.f, ", isResendAvailable=");
        oi.k.y(sbS, this.g, ", isLoading=", this.h, ", isCodeError=");
        oi.k.y(sbS, this.i, ", isCodeSuccess=", this.j, ", codeResendError=");
        return x5.n(sbS, this.k, ")");
    }
}
