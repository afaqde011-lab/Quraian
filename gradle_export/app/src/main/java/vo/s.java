package vo;

import com.google.android.gms.internal.measurement.x5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001a\u0010%\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lvo/s;", "", "", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "deviceId", "b", "getDeviceType", "deviceType", "c", "getDeviceName", "deviceName", "d", "getSignupToken", "signupToken", "e", "getPassword", "password", "f", "getUsername", "username", "g", "getSex", "sex", "h", "getBirthDate", "birthDate", "i", "getCountry", "country", "", "j", "Z", "getMarketingEnabled", "()Z", "marketingEnabled", "k", "Ljava/lang/Boolean;", "isPurchaseDevice", "()Ljava/lang/Boolean;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    @ck.b("device_id")
    private final String deviceId;

    @ck.b("device_type")
    private final String deviceType;

    @ck.b("device_name")
    private final String deviceName;

    @ck.b("signup_token")
    private final String signupToken;

    @ck.b("password")
    private final String password;

    @ck.b("username")
    private final String username;

    @ck.b("sex")
    private final String sex;

    @ck.b("birth_date")
    private final String birthDate;

    @ck.b("country")
    private final String country;

    @ck.b("marketing_enabled")
    private final boolean marketingEnabled;

    @ck.b("is_purchase_device")
    private final Boolean isPurchaseDevice;

    public s(String deviceId, String deviceType, String deviceName, String signupToken, String password, String username, String sex, String birthDate, String str, boolean z, Boolean bool) {
        kotlin.jvm.internal.m.e(deviceId, "deviceId");
        kotlin.jvm.internal.m.e(deviceType, "deviceType");
        kotlin.jvm.internal.m.e(deviceName, "deviceName");
        kotlin.jvm.internal.m.e(signupToken, "signupToken");
        kotlin.jvm.internal.m.e(password, "password");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(sex, "sex");
        kotlin.jvm.internal.m.e(birthDate, "birthDate");
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.deviceName = deviceName;
        this.signupToken = signupToken;
        this.password = password;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.country = str;
        this.marketingEnabled = z;
        this.isPurchaseDevice = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.m.a(this.deviceId, sVar.deviceId) && kotlin.jvm.internal.m.a(this.deviceType, sVar.deviceType) && kotlin.jvm.internal.m.a(this.deviceName, sVar.deviceName) && kotlin.jvm.internal.m.a(this.signupToken, sVar.signupToken) && kotlin.jvm.internal.m.a(this.password, sVar.password) && kotlin.jvm.internal.m.a(this.username, sVar.username) && kotlin.jvm.internal.m.a(this.sex, sVar.sex) && kotlin.jvm.internal.m.a(this.birthDate, sVar.birthDate) && kotlin.jvm.internal.m.a(this.country, sVar.country) && this.marketingEnabled == sVar.marketingEnabled && kotlin.jvm.internal.m.a(this.isPurchaseDevice, sVar.isPurchaseDevice);
    }

    public final int hashCode() {
        int iE = x5.e(x5.e(x5.e(x5.e(x5.e(x5.e(x5.e(this.deviceId.hashCode() * 31, this.deviceType, 31), this.deviceName, 31), this.signupToken, 31), this.password, 31), this.username, 31), this.sex, 31), this.birthDate, 31);
        String str = this.country;
        int iE2 = w.c.e((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.marketingEnabled);
        Boolean bool = this.isPurchaseDevice;
        return iE2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.deviceId;
        String str2 = this.deviceType;
        String str3 = this.deviceName;
        String str4 = this.signupToken;
        String str5 = this.password;
        String str6 = this.username;
        String str7 = this.sex;
        String str8 = this.birthDate;
        String str9 = this.country;
        boolean z = this.marketingEnabled;
        Boolean bool = this.isPurchaseDevice;
        StringBuilder sbS = a1.b.s("RegisterCompleteRequestApiModel(deviceId=", str, ", deviceType=", str2, ", deviceName=");
        a1.b.z(sbS, str3, ", signupToken=", str4, ", password=");
        a1.b.z(sbS, str5, ", username=", str6, ", sex=");
        a1.b.z(sbS, str7, ", birthDate=", str8, ", country=");
        sbS.append(str9);
        sbS.append(", marketingEnabled=");
        sbS.append(z);
        sbS.append(", isPurchaseDevice=");
        sbS.append(bool);
        sbS.append(")");
        return sbS.toString();
    }
}
