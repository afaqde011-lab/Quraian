package bu;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class b {
    public final d a;
    public final String b;
    public final Double c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;

    public b(d dVar, String str, Double d, String str2, Integer num, int i) {
        this(dVar, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : d, (i & 8) != 0 ? "" : str2, null, null, (i & 64) != 0 ? null : num);
    }

    public b(d dVar, String currencyCode, Double d, String formattedPrice, String str, String str2, Integer num) {
        m.e(currencyCode, "currencyCode");
        m.e(formattedPrice, "formattedPrice");
        this.a = dVar;
        this.b = currencyCode;
        this.c = d;
        this.d = formattedPrice;
        this.e = str;
        this.f = str2;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && m.a(this.b, bVar.b) && m.a(this.c, bVar.c) && m.a(this.d, bVar.d) && m.a(this.e, bVar.e) && m.a(this.f, bVar.f) && m.a(this.g, bVar.g);
    }

    public final int hashCode() {
        int iE = x5.e(this.a.hashCode() * 31, this.b, 31);
        Double d = this.c;
        int iE2 = x5.e((iE + (d == null ? 0 : d.hashCode())) * 31, this.d, 31);
        String str = this.e;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaywallPlan(subscriptionType=");
        sb.append(this.a);
        sb.append(", currencyCode=");
        sb.append(this.b);
        sb.append(", price=");
        sb.append(this.c);
        sb.append(", formattedPrice=");
        sb.append(this.d);
        sb.append(", perMonthPrice=");
        a1.b.z(sb, this.e, ", salePercent=", this.f, ", freeTrialDays=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
