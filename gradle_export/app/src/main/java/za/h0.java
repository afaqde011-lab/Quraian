package za;

import java.util.HashSet;
import java.util.UUID;

public final class h0 {

    public final UUID f17370a;

    public final g0 f17371b;

    public final HashSet f17372c;

    public final g f17373d;

    public final g f17374e;

    public final int f17375f;

    public final int f17376g;

    public final e f17377h;

    public final long f17378i;

    public final f0 f17379j;

    public final long f17380k;
    public final int l;

    public h0(UUID uuid, g0 g0Var, HashSet hashSet, g gVar, g gVar2, int i10, int i11, e eVar, long j9, f0 f0Var, long j10, int i12) {
        kotlin.jvm.internal.m.e(gVar, "outputData");
        kotlin.jvm.internal.m.e(gVar2, "progress");
        this.f17370a = uuid;
        this.f17371b = g0Var;
        this.f17372c = hashSet;
        this.f17373d = gVar;
        this.f17374e = gVar2;
        this.f17375f = i10;
        this.f17376g = i11;
        this.f17377h = eVar;
        this.f17378i = j9;
        this.f17379j = f0Var;
        this.f17380k = j10;
        this.l = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !h0.class.equals(obj.getClass())) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (this.f17375f == h0Var.f17375f && this.f17376g == h0Var.f17376g && this.f17370a.equals(h0Var.f17370a) && this.f17371b == h0Var.f17371b && kotlin.jvm.internal.m.a(this.f17373d, h0Var.f17373d) && this.f17377h.equals(h0Var.f17377h) && this.f17378i == h0Var.f17378i && kotlin.jvm.internal.m.a(this.f17379j, h0Var.f17379j) && this.f17380k == h0Var.f17380k && this.l == h0Var.l && this.f17372c.equals(h0Var.f17372c)) {
            return kotlin.jvm.internal.m.a(this.f17374e, h0Var.f17374e);
        }
        return false;
    }

    public final int hashCode() {
        int iF = w.c.f((this.f17377h.hashCode() + ((((((this.f17374e.hashCode() + ((this.f17372c.hashCode() + ((this.f17373d.hashCode() + ((this.f17371b.hashCode() + (this.f17370a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f17375f) * 31) + this.f17376g) * 31)) * 31, this.f17378i, 31);
        f0 f0Var = this.f17379j;
        return Integer.hashCode(this.l) + w.c.f((iF + (f0Var != null ? f0Var.hashCode() : 0)) * 31, this.f17380k, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f17370a + "', state=" + this.f17371b + ", outputData=" + this.f17373d + ", tags=" + this.f17372c + ", progress=" + this.f17374e + ", runAttemptCount=" + this.f17375f + ", generation=" + this.f17376g + ", constraints=" + this.f17377h + ", initialDelayMillis=" + this.f17378i + ", periodicityInfo=" + this.f17379j + ", nextScheduleTimeMillis=" + this.f17380k + "}, stopReason=" + this.l;
    }
}
