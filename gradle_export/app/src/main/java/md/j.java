package md;

import h00.n;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j extends f5.c {
    public final String C;

    public j(JSONObject jSONObject) throws JSONException {
        super(f.TOO_MANY_REQUESTS, 7);
        this.C = bi.b.F(jSONObject);
        if (jSONObject.has("exceeded_daily_quota_users")) {
            m.d(jSONObject.getJSONObject("exceeded_daily_quota_users").keySet(), "keySet(...)");
        }
        if (jSONObject.has("exceeded_daily_quota_devices")) {
            m.d(jSONObject.getJSONObject("exceeded_daily_quota_devices").keySet(), "keySet(...)");
        }
        if (jSONObject.has("throttled_events")) {
            JSONArray jSONArray = jSONObject.getJSONArray("throttled_events");
            m.d(jSONArray, "getJSONArray(...)");
            n.W0(bi.b.X(jSONArray));
        }
        if (jSONObject.has("throttled_users")) {
            m.d(jSONObject.getJSONObject("throttled_users").keySet(), "keySet(...)");
        }
        if (jSONObject.has("throttled_devices")) {
            m.d(jSONObject.getJSONObject("throttled_devices").keySet(), "keySet(...)");
        }
    }
}
