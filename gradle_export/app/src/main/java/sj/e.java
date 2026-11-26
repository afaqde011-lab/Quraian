package sj;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    public static final Date f14253h = new Date(0);

    public final JSONObject f14254a;

    public final JSONObject f14255b;

    public final Date f14256c;

    public final JSONArray f14257d;

    public final JSONObject f14258e;

    public final long f14259f;

    public final JSONArray f14260g;

    public e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j9, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j9);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f14255b = jSONObject;
        this.f14256c = date;
        this.f14257d = jSONArray;
        this.f14258e = jSONObject2;
        this.f14259f = j9;
        this.f14260g = jSONArray2;
        this.f14254a = jSONObject3;
    }

    public static e a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    public static d c() {
        d dVar = new d();
        dVar.f14247a = new JSONObject();
        dVar.f14248b = f14253h;
        dVar.f14249c = new JSONArray();
        dVar.f14250d = new JSONObject();
        dVar.f14251e = 0L;
        dVar.f14252f = new JSONArray();
        return dVar;
    }

    public final HashMap b() throws JSONException {
        HashMap map = new HashMap();
        int i10 = 0;
        while (true) {
            JSONArray jSONArray = this.f14260g;
            if (i10 >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String string3 = jSONArray2.getString(i11);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f14254a.toString().equals(((e) obj).f14254a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f14254a.hashCode();
    }

    public final String toString() {
        return this.f14254a.toString();
    }
}
