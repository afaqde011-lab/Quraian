package wj;

import android.os.Build;
import com.google.android.gms.internal.measurement.x5;

public final class b {

    public final String f16117a;

    public final a f16118b;

    public b(String str, a aVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        v vVar = v.LOG_ENVIRONMENT_PROD;
        kotlin.jvm.internal.m.e(str, "appId");
        kotlin.jvm.internal.m.e(str2, "deviceModel");
        kotlin.jvm.internal.m.e(str3, "osVersion");
        this.f16117a = str;
        this.f16118b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!kotlin.jvm.internal.m.a(this.f16117a, bVar.f16117a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!kotlin.jvm.internal.m.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        if (!kotlin.jvm.internal.m.a(str2, str2)) {
            return false;
        }
        v vVar = v.LOG_ENVIRONMENT_PROD;
        return this.f16118b.equals(bVar.f16118b);
    }

    public final int hashCode() {
        return this.f16118b.hashCode() + ((v.LOG_ENVIRONMENT_PROD.hashCode() + x5.e((((Build.MODEL.hashCode() + (this.f16117a.hashCode() * 31)) * 31) + 48517562) * 31, Build.VERSION.RELEASE, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f16117a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.3, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + v.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f16118b + ')';
    }
}
