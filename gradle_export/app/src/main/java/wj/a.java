package wj;

import android.os.Build;
import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;

public final class a {

    public final String f16103a;

    public final String f16104b;

    public final String f16105c;

    public final c0 f16106d;

    public final ArrayList f16107e;

    public a(String str, String str2, String str3, c0 c0Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        kotlin.jvm.internal.m.e(str2, "versionName");
        kotlin.jvm.internal.m.e(str3, "appBuildVersion");
        kotlin.jvm.internal.m.e(str4, "deviceManufacturer");
        this.f16103a = str;
        this.f16104b = str2;
        this.f16105c = str3;
        this.f16106d = c0Var;
        this.f16107e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f16103a.equals(aVar.f16103a) || !kotlin.jvm.internal.m.a(this.f16104b, aVar.f16104b) || !kotlin.jvm.internal.m.a(this.f16105c, aVar.f16105c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return kotlin.jvm.internal.m.a(str, str) && this.f16106d.equals(aVar.f16106d) && this.f16107e.equals(aVar.f16107e);
    }

    public final int hashCode() {
        return this.f16107e.hashCode() + ((this.f16106d.hashCode() + x5.e(x5.e(x5.e(this.f16103a.hashCode() * 31, this.f16104b, 31), this.f16105c, 31), Build.MANUFACTURER, 31)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f16103a + ", versionName=" + this.f16104b + ", appBuildVersion=" + this.f16105c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.f16106d + ", appProcessDetails=" + this.f16107e + ')';
    }
}
