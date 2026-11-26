package sj;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class l {

    public static final Date f14301e = new Date(-1);

    public static final Date f14302f = new Date(-1);

    public final SharedPreferences f14303a;

    public final Object f14304b = new Object();

    public final Object f14305c = new Object();

    public final Object f14306d = new Object();

    public l(SharedPreferences sharedPreferences) {
        this.f14303a = sharedPreferences;
    }

    public final k a() {
        k kVar;
        synchronized (this.f14305c) {
            int i10 = this.f14303a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f14303a.getLong("backoff_end_time_in_millis", -1L));
            kVar = new k();
            kVar.f14299a = i10;
            kVar.f14300b = date;
        }
        return kVar;
    }

    public final HashMap b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f14303a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public final k c() {
        k kVar;
        synchronized (this.f14306d) {
            int i10 = this.f14303a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f14303a.getLong("realtime_backoff_end_time_in_millis", -1L));
            kVar = new k();
            kVar.f14299a = i10;
            kVar.f14300b = date;
        }
        return kVar;
    }

    public final void d(int i10, Date date) {
        synchronized (this.f14305c) {
            this.f14303a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void e(int i10, Date date) {
        synchronized (this.f14306d) {
            this.f14303a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
