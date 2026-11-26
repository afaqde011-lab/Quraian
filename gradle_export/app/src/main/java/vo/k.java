package vo;

import android.os.Build;
import com.google.android.gms.internal.measurement.x5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lvo/k;", "", "", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "deviceId", "b", "getDeviceType", "deviceType", "c", "getDeviceName", "deviceName", "d", "getEmail", "email", "e", "getPassword", "password", "", "f", "Ljava/lang/Boolean;", "isPurchaseDevice", "()Ljava/lang/Boolean;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    @ck.b("device_id")
    private final String deviceId;

    @ck.b("device_type")
    private final String deviceType;

    @ck.b("device_name")
    private final String deviceName;

    @ck.b("email")
    private final String email;

    @ck.b("password")
    private final String password;

    @ck.b("is_purchase_device")
    private final Boolean isPurchaseDevice;

    public k(Boolean bool, String str, String email, String password) {
        String deviceName = Build.MODEL;
        kotlin.jvm.internal.m.e(deviceName, "deviceName");
        kotlin.jvm.internal.m.e(email, "email");
        kotlin.jvm.internal.m.e(password, "password");
        this.deviceId = str;
        this.deviceType = "android";
        this.deviceName = deviceName;
        this.email = email;
        this.password = password;
        this.isPurchaseDevice = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kotlin.jvm.internal.m.a(this.deviceId, kVar.deviceId) && kotlin.jvm.internal.m.a(this.deviceType, kVar.deviceType) && kotlin.jvm.internal.m.a(this.deviceName, kVar.deviceName) && kotlin.jvm.internal.m.a(this.email, kVar.email) && kotlin.jvm.internal.m.a(this.password, kVar.password) && kotlin.jvm.internal.m.a(this.isPurchaseDevice, kVar.isPurchaseDevice);
    }

    public final int hashCode() {
        int iE = x5.e(x5.e(x5.e(x5.e(this.deviceId.hashCode() * 31, this.deviceType, 31), this.deviceName, 31), this.email, 31), this.password, 31);
        Boolean bool = this.isPurchaseDevice;
        return iE + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        String str = this.deviceId;
        String str2 = this.deviceType;
        String str3 = this.deviceName;
        String str4 = this.email;
        String str5 = this.password;
        Boolean bool = this.isPurchaseDevice;
        StringBuilder sbS = a1.b.s("LoginRequestApiModel(deviceId=", str, ", deviceType=", str2, ", deviceName=");
        a1.b.z(sbS, str3, ", email=", str4, ", password=");
        sbS.append(str5);
        sbS.append(", isPurchaseDevice=");
        sbS.append(bool);
        sbS.append(")");
        return sbS.toString();
    }
}
