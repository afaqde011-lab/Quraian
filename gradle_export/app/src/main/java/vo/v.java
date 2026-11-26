package vo;

import android.os.Build;
import com.google.android.gms.internal.measurement.x5;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0014"}, d2 = {"Lvo/v;", "", "", "a", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "deviceId", "b", "getDeviceType", "deviceType", "c", "getDeviceName", "deviceName", "d", "getResetToken", "resetToken", "e", "getNewPassword", "newPassword", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    @ck.b("device_id")
    private final String deviceId;

    @ck.b("device_type")
    private final String deviceType;

    @ck.b("device_name")
    private final String deviceName;

    @ck.b("reset_token")
    private final String resetToken;

    @ck.b("new_password")
    private final String newPassword;

    public v(String str, String resetToken, String newPassword) {
        String deviceName = Build.MODEL;
        kotlin.jvm.internal.m.e(deviceName, "deviceName");
        kotlin.jvm.internal.m.e(resetToken, "resetToken");
        kotlin.jvm.internal.m.e(newPassword, "newPassword");
        this.deviceId = str;
        this.deviceType = "android";
        this.deviceName = deviceName;
        this.resetToken = resetToken;
        this.newPassword = newPassword;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.m.a(this.deviceId, vVar.deviceId) && kotlin.jvm.internal.m.a(this.deviceType, vVar.deviceType) && kotlin.jvm.internal.m.a(this.deviceName, vVar.deviceName) && kotlin.jvm.internal.m.a(this.resetToken, vVar.resetToken) && kotlin.jvm.internal.m.a(this.newPassword, vVar.newPassword);
    }

    public final int hashCode() {
        return this.newPassword.hashCode() + x5.e(x5.e(x5.e(this.deviceId.hashCode() * 31, this.deviceType, 31), this.deviceName, 31), this.resetToken, 31);
    }

    public final String toString() {
        String str = this.deviceId;
        String str2 = this.deviceType;
        String str3 = this.deviceName;
        String str4 = this.resetToken;
        String str5 = this.newPassword;
        StringBuilder sbS = a1.b.s("ResetPasswordRequestApiModel(deviceId=", str, ", deviceType=", str2, ", deviceName=");
        a1.b.z(sbS, str3, ", resetToken=", str4, ", newPassword=");
        return x5.n(sbS, str5, ")");
    }
}
