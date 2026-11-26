package wj;

import com.google.android.gms.internal.measurement.x5;

public final class r0 {

    public final String f16205a;

    public final String f16206b;

    public final int f16207c;

    public final long f16208d;

    public final k f16209e;

    public final String f16210f;

    public final String f16211g;

    public r0(String str, String str2, int i10, long j9, k kVar, String str3, String str4) {
        kotlin.jvm.internal.m.e(str, "sessionId");
        kotlin.jvm.internal.m.e(str2, "firstSessionId");
        kotlin.jvm.internal.m.e(str4, "firebaseAuthenticationToken");
        this.f16205a = str;
        this.f16206b = str2;
        this.f16207c = i10;
        this.f16208d = j9;
        this.f16209e = kVar;
        this.f16210f = str3;
        this.f16211g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.m.a(this.f16205a, r0Var.f16205a) && kotlin.jvm.internal.m.a(this.f16206b, r0Var.f16206b) && this.f16207c == r0Var.f16207c && this.f16208d == r0Var.f16208d && kotlin.jvm.internal.m.a(this.f16209e, r0Var.f16209e) && kotlin.jvm.internal.m.a(this.f16210f, r0Var.f16210f) && kotlin.jvm.internal.m.a(this.f16211g, r0Var.f16211g);
    }

    public final int hashCode() {
        return this.f16211g.hashCode() + x5.e((this.f16209e.hashCode() + w.c.f(w.c.d(this.f16207c, x5.e(this.f16205a.hashCode() * 31, this.f16206b, 31), 31), this.f16208d, 31)) * 31, this.f16210f, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f16205a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f16206b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f16207c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f16208d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f16209e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f16210f);
        sb2.append(", firebaseAuthenticationToken=");
        return g4.c.k(sb2, this.f16211g, ')');
    }
}
