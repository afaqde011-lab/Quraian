package jy;

import com.google.android.gms.internal.measurement.x5;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u000b"}, d2 = {"Ljy/d;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "status", "b", "platform", "managementUrl", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    @ck.b("status")
    private final String status;

    @ck.b("platform")
    private final String platform;

    @ck.b("management_url")
    private final String managementUrl;

    public final String getManagementUrl() {
        return this.managementUrl;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m.a(this.status, dVar.status) && m.a(this.platform, dVar.platform) && m.a(this.managementUrl, dVar.managementUrl);
    }

    public final int hashCode() {
        String str = this.status;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platform;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.managementUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.status;
        String str2 = this.platform;
        return x5.n(a1.b.s("SubscriptionCancelResponseApiModel(status=", str, ", platform=", str2, ", managementUrl="), this.managementUrl, ")");
    }
}
