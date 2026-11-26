package vo;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lvo/p;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", DiagnosticsEntry.NAME_KEY, "b", "city", "country", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p {

    @ck.b(DiagnosticsEntry.NAME_KEY)
    private final String name = null;

    @ck.b("city")
    private final String city = null;

    @ck.b("country")
    private final String country = null;

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.name, pVar.name) && kotlin.jvm.internal.m.a(this.city, pVar.city) && kotlin.jvm.internal.m.a(this.country, pVar.country);
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.city;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.city;
        return x5.n(a1.b.s("PurchaseDeviceResponseApiModel(name=", str, ", city=", str2, ", country="), this.country, ")");
    }
}
