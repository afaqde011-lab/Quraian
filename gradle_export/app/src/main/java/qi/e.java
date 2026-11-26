package qi;

import android.util.Log;
import com.google.protobuf.RuntimeVersion;
import java.util.HashMap;
import java.util.Map;

public final class e {

    public final HashMap f13021a = new HashMap();

    public final int f13022b = 64;

    public final int f13023c;

    public e(int i10) {
        this.f13023c = i10;
    }

    public static String a(int i10, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i10) {
                return str.substring(0, i10);
            }
        }
        return str;
    }

    public final synchronized boolean b(String str) {
        boolean zEquals;
        String strA = a(this.f13023c, "com.crashlytics.version-control-info");
        if (this.f13021a.size() >= this.f13022b && !this.f13021a.containsKey(strA)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"com.crashlytics.version-control-info\" when adding custom keys. Maximum allowable: " + this.f13022b, null);
            return false;
        }
        String strA2 = a(this.f13023c, str);
        String str2 = (String) this.f13021a.get(strA);
        if (str2 == null) {
            zEquals = strA2 == null;
        } else {
            zEquals = str2.equals(strA2);
        }
        if (zEquals) {
            return false;
        }
        this.f13021a.put(strA, strA2);
        return true;
    }

    public final synchronized void c(Map map) {
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String strA = a(this.f13023c, str);
                if (this.f13021a.size() < this.f13022b || this.f13021a.containsKey(strA)) {
                    String str2 = (String) entry.getValue();
                    this.f13021a.put(strA, str2 == null ? RuntimeVersion.SUFFIX : a(this.f13023c, str2));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f13022b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
