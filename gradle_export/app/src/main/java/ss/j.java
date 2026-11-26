package ss;

import com.google.android.gms.internal.measurement.x5;
import java.util.LinkedHashSet;
import java.util.Set;

public final class j {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final Set f;
    public final boolean g;
    public final boolean h;

    public j(String importId, String timezone, int i, String sha256, long j, Set set, boolean z, boolean z2) {
        kotlin.jvm.internal.m.e(importId, "importId");
        kotlin.jvm.internal.m.e(timezone, "timezone");
        kotlin.jvm.internal.m.e(sha256, "sha256");
        this.a = importId;
        this.b = timezone;
        this.c = i;
        this.d = sha256;
        this.e = j;
        this.f = set;
        this.g = z;
        this.h = z2;
    }

    public static j a(j jVar, LinkedHashSet linkedHashSet, int i) {
        String importId = jVar.a;
        String timezone = jVar.b;
        int i2 = jVar.c;
        String sha256 = jVar.d;
        long j = jVar.e;
        Set set = linkedHashSet;
        if ((i & 32) != 0) {
            set = jVar.f;
        }
        Set set2 = set;
        boolean z = (i & 64) != 0 ? jVar.g : true;
        boolean z2 = jVar.h;
        jVar.getClass();
        kotlin.jvm.internal.m.e(importId, "importId");
        kotlin.jvm.internal.m.e(timezone, "timezone");
        kotlin.jvm.internal.m.e(sha256, "sha256");
        return new j(importId, timezone, i2, sha256, j, set2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.a, jVar.a) && kotlin.jvm.internal.m.a(this.b, jVar.b) && this.c == jVar.c && kotlin.jvm.internal.m.a(this.d, jVar.d) && this.e == jVar.e && kotlin.jvm.internal.m.a(this.f, jVar.f) && this.g == jVar.g && this.h == jVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + w.c.e((this.f.hashCode() + w.c.f(x5.e(w.c.d(this.c, x5.e(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), this.e, 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("ListeningImport(importId=", this.a, ", timezone=", this.b, ", dailyGoalMinutes=");
        sbS.append(this.c);
        sbS.append(", sha256=");
        sbS.append(this.d);
        sbS.append(", byteSize=");
        sbS.append(this.e);
        sbS.append(", confirmedParts=");
        sbS.append(this.f);
        sbS.append(", isStarted=");
        sbS.append(this.g);
        sbS.append(", isAddedToSummary=");
        sbS.append(this.h);
        sbS.append(")");
        return sbS.toString();
    }
}
