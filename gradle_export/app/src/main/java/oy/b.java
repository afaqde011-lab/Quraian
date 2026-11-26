package oy;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class b {
    public final c a;
    public final String b;
    public final String c;

    public b(c cVar, String str, String str2) {
        this.a = cVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && m.a(this.b, bVar.b) && m.a(this.c, bVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscriptionCancelResult(status=");
        sb.append(this.a);
        sb.append(", platform=");
        sb.append(this.b);
        sb.append(", managementUrl=");
        return x5.n(sb, this.c, ")");
    }
}
