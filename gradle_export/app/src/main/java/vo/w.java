package vo;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvo/w;", "", "", "", "a", "Ljava/util/List;", "getDeviceIds", "()Ljava/util/List;", "deviceIds", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w {

    @ck.b("deviceIds")
    private final List<String> deviceIds;

    public w(ArrayList arrayList) {
        this.deviceIds = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && kotlin.jvm.internal.m.a(this.deviceIds, ((w) obj).deviceIds);
    }

    public final int hashCode() {
        return this.deviceIds.hashCode();
    }

    public final String toString() {
        return "RevokeDevicesRequestApiModel(deviceIds=" + this.deviceIds + ")";
    }
}
