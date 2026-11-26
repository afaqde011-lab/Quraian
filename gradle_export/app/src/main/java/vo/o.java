package vo;

import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lvo/o;", "", "", "a", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "source", "b", "getDeviceName", "deviceName", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    @ck.b("source")
    private final String source;

    @ck.b("device_name")
    private final String deviceName;

    public o(String str) {
        String deviceName = Build.MODEL;
        kotlin.jvm.internal.m.e(deviceName, "deviceName");
        this.source = str;
        this.deviceName = deviceName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.source, oVar.source) && kotlin.jvm.internal.m.a(this.deviceName, oVar.deviceName);
    }

    public final int hashCode() {
        return this.deviceName.hashCode() + (this.source.hashCode() * 31);
    }

    public final String toString() {
        return a1.b.q("PurchaseDeviceRequestApiModel(source=", this.source, ", deviceName=", this.deviceName, ")");
    }
}
