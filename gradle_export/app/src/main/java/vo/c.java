package vo;

import android.os.Build;
import com.google.android.gms.internal.measurement.x5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, d2 = {"Lvo/c;", "", "", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "deviceId", "b", "getDeviceType", "deviceType", "c", "getDeviceName", "deviceName", "d", "getCurrentPassword", "currentPassword", "e", "getNewPassword", "newPassword", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    @ck.b("device_id")
    private final String deviceId;

    @ck.b("device_type")
    private final String deviceType;

    @ck.b("device_name")
    private final String deviceName;

    @ck.b("current_password")
    private final String currentPassword;

    @ck.b("new_password")
    private final String newPassword;

    public c(String str, String str2, String str3) {
        String deviceName = Build.MODEL;
        kotlin.jvm.internal.m.e(deviceName, "deviceName");
        this.deviceId = str;
        this.deviceType = "android";
        this.deviceName = deviceName;
        this.currentPassword = str2;
        this.newPassword = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.deviceId, cVar.deviceId) && kotlin.jvm.internal.m.a(this.deviceType, cVar.deviceType) && kotlin.jvm.internal.m.a(this.deviceName, cVar.deviceName) && kotlin.jvm.internal.m.a(this.currentPassword, cVar.currentPassword) && kotlin.jvm.internal.m.a(this.newPassword, cVar.newPassword);
    }

    public final int hashCode() {
        return this.newPassword.hashCode() + x5.e(x5.e(x5.e(this.deviceId.hashCode() * 31, this.deviceType, 31), this.deviceName, 31), this.currentPassword, 31);
    }

    public final String toString() {
        String str = this.deviceId;
        String str2 = this.deviceType;
        String str3 = this.deviceName;
        String str4 = this.currentPassword;
        String str5 = this.newPassword;
        StringBuilder sbS = a1.b.s("ChangePasswordRequestApiModel(deviceId=", str, ", deviceType=", str2, ", deviceName=");
        a1.b.z(sbS, str3, ", currentPassword=", str4, ", newPassword=");
        return x5.n(sbS, str5, ")");
    }
}
