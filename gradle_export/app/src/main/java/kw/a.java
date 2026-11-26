package kw;

import ck.b;
import com.google.android.gms.internal.measurement.x5;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import w.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001a\u0010\u001f\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006¨\u0006#"}, d2 = {"Lkw/a;", "", "", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "token", "b", "getPlatform", "platform", "c", "getDeviceId", "deviceId", "d", "getAppVersion", "appVersion", "e", "getLocale", "locale", "f", "getTimezone", "timezone", "g", "getCountry", "country", "", "h", "Z", "getNotificationsEnabled", "()Z", "notificationsEnabled", "i", "getPermissionStatus", "permissionStatus", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    @b("token")
    private final String token;

    @b("platform")
    private final String platform;

    @b("device_id")
    private final String deviceId;

    @b("app_version")
    private final String appVersion;

    @b("locale")
    private final String locale;

    @b("timezone")
    private final String timezone;

    @b("country")
    private final String country;

    @b("notifications_enabled")
    private final boolean notificationsEnabled;

    @b("permission_status")
    private final String permissionStatus;

    public a(String token, String str, String str2, String str3, String str4, boolean z, String str5) {
        m.e(token, "token");
        this.token = token;
        this.platform = "android";
        this.deviceId = str;
        this.appVersion = "2.4.1";
        this.locale = str2;
        this.timezone = str3;
        this.country = str4;
        this.notificationsEnabled = z;
        this.permissionStatus = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.token, aVar.token) && m.a(this.platform, aVar.platform) && m.a(this.deviceId, aVar.deviceId) && m.a(this.appVersion, aVar.appVersion) && m.a(this.locale, aVar.locale) && m.a(this.timezone, aVar.timezone) && m.a(this.country, aVar.country) && this.notificationsEnabled == aVar.notificationsEnabled && m.a(this.permissionStatus, aVar.permissionStatus);
    }

    public final int hashCode() {
        int iE = x5.e(x5.e(x5.e(x5.e(x5.e(this.token.hashCode() * 31, this.platform, 31), this.deviceId, 31), this.appVersion, 31), this.locale, 31), this.timezone, 31);
        String str = this.country;
        return this.permissionStatus.hashCode() + c.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.notificationsEnabled);
    }

    public final String toString() {
        String str = this.token;
        String str2 = this.platform;
        String str3 = this.deviceId;
        String str4 = this.appVersion;
        String str5 = this.locale;
        String str6 = this.timezone;
        String str7 = this.country;
        boolean z = this.notificationsEnabled;
        String str8 = this.permissionStatus;
        StringBuilder sbS = a1.b.s("RegisterPushTokenRequestApiModel(token=", str, ", platform=", str2, ", deviceId=");
        a1.b.z(sbS, str3, ", appVersion=", str4, ", locale=");
        a1.b.z(sbS, str5, ", timezone=", str6, ", country=");
        sbS.append(str7);
        sbS.append(", notificationsEnabled=");
        sbS.append(z);
        sbS.append(", permissionStatus=");
        return x5.n(sbS, str8, ")");
    }
}
