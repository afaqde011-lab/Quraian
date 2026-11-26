package oj;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class r {

    public static final long f12101d = TimeUnit.DAYS.toMillis(7);

    public final String f12102a;

    public final String f12103b;

    public final long f12104c;

    public r(String str, long j9, String str2) {
        this.f12102a = str;
        this.f12103b = str2;
        this.f12104c = j9;
    }

    public static String a(String str, long j9, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j9);
            return jSONObject.toString();
        } catch (JSONException e3) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e3);
            return null;
        }
    }

    public static r b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new r(str, 0L, null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new r(jSONObject.getString("token"), jSONObject.getLong("timestamp"), jSONObject.getString("appVersion"));
        } catch (JSONException e3) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e3);
            return null;
        }
    }
}
