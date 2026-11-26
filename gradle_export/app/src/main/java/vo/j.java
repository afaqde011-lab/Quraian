package vo;

import com.google.android.gms.internal.measurement.x5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u001c\u0010'\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!¨\u0006("}, d2 = {"Lvo/j;", "", "", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "deviceId", "b", "getDeviceType", "deviceType", "c", "getDeviceName", "deviceName", "d", "getIdToken", "idToken", "e", "getUsername", "username", "f", "getSex", "sex", "g", "getBirthDate", "birthDate", "h", "getCountry", "country", "", "i", "Ljava/lang/Boolean;", "getMarketingEnabled", "()Ljava/lang/Boolean;", "marketingEnabled", "j", "getCode", "code", "k", "isPurchaseDevice", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    @ck.b("device_id")
    private final String deviceId;

    @ck.b("device_type")
    private final String deviceType;

    @ck.b("device_name")
    private final String deviceName;

    @ck.b("id_token")
    private final String idToken;

    @ck.b("username")
    private final String username;

    @ck.b("sex")
    private final String sex;

    @ck.b("birth_date")
    private final String birthDate;

    @ck.b("country")
    private final String country;

    @ck.b("marketing_enabled")
    private final Boolean marketingEnabled;

    @ck.b("code")
    private final String code;

    @ck.b("is_purchase_device")
    private final Boolean isPurchaseDevice;

    public j(String deviceId, String deviceType, String deviceName, String idToken, String username, String sex, String birthDate, String str, Boolean bool, String str2, Boolean bool2) {
        kotlin.jvm.internal.m.e(deviceId, "deviceId");
        kotlin.jvm.internal.m.e(deviceType, "deviceType");
        kotlin.jvm.internal.m.e(deviceName, "deviceName");
        kotlin.jvm.internal.m.e(idToken, "idToken");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(sex, "sex");
        kotlin.jvm.internal.m.e(birthDate, "birthDate");
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.idToken = idToken;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.country = str;
        this.marketingEnabled = bool;
        this.code = str2;
        this.isPurchaseDevice = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.deviceId, jVar.deviceId) && kotlin.jvm.internal.m.a(this.deviceType, jVar.deviceType) && kotlin.jvm.internal.m.a(this.deviceName, jVar.deviceName) && kotlin.jvm.internal.m.a(this.idToken, jVar.idToken) && kotlin.jvm.internal.m.a(this.username, jVar.username) && kotlin.jvm.internal.m.a(this.sex, jVar.sex) && kotlin.jvm.internal.m.a(this.birthDate, jVar.birthDate) && kotlin.jvm.internal.m.a(this.country, jVar.country) && kotlin.jvm.internal.m.a(this.marketingEnabled, jVar.marketingEnabled) && kotlin.jvm.internal.m.a(this.code, jVar.code) && kotlin.jvm.internal.m.a(this.isPurchaseDevice, jVar.isPurchaseDevice);
    }

    public final int hashCode() {
        int iE = x5.e(x5.e(x5.e(x5.e(x5.e(x5.e(this.deviceId.hashCode() * 31, this.deviceType, 31), this.deviceName, 31), this.idToken, 31), this.username, 31), this.sex, 31), this.birthDate, 31);
        String str = this.country;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.marketingEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.code;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.isPurchaseDevice;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.deviceId;
        String str2 = this.deviceType;
        String str3 = this.deviceName;
        String str4 = this.idToken;
        String str5 = this.username;
        String str6 = this.sex;
        String str7 = this.birthDate;
        String str8 = this.country;
        Boolean bool = this.marketingEnabled;
        String str9 = this.code;
        Boolean bool2 = this.isPurchaseDevice;
        StringBuilder sbS = a1.b.s("GoogleAuthRequestApiModel(deviceId=", str, ", deviceType=", str2, ", deviceName=");
        a1.b.z(sbS, str3, ", idToken=", str4, ", username=");
        a1.b.z(sbS, str5, ", sex=", str6, ", birthDate=");
        a1.b.z(sbS, str7, ", country=", str8, ", marketingEnabled=");
        sbS.append(bool);
        sbS.append(", code=");
        sbS.append(str9);
        sbS.append(", isPurchaseDevice=");
        sbS.append(bool2);
        sbS.append(")");
        return sbS.toString();
    }
}
