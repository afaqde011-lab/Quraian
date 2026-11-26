package md;

import h00.n;
import h00.q;
import h00.z;
import java.util.Set;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends f5.c {
    public final String C;
    public final Set D;
    public final Set E;
    public final Set F;
    public final Set G;

    public a(JSONObject jSONObject) throws JSONException {
        super(f.BAD_REQUEST, 7);
        this.C = bi.b.F(jSONObject);
        z zVar = z.A;
        this.D = zVar;
        this.E = zVar;
        this.F = zVar;
        this.G = zVar;
        if (jSONObject.has("events_with_invalid_fields")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events_with_invalid_fields");
            m.d(jSONObject2, "getJSONObject(...)");
            this.D = bi.b.t(jSONObject2);
        }
        if (jSONObject.has("events_with_missing_fields")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("events_with_missing_fields");
            m.d(jSONObject3, "getJSONObject(...)");
            this.E = bi.b.t(jSONObject3);
        }
        if (jSONObject.has("silenced_devices")) {
            Object jSONArray = jSONObject.getJSONArray("silenced_devices");
            m.d(jSONArray, "getJSONArray(...)");
            this.G = q.r1((Iterable) jSONArray);
        }
        if (jSONObject.has("silenced_events")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("silenced_events");
            m.d(jSONArray2, "getJSONArray(...)");
            this.F = n.W0(bi.b.X(jSONArray2));
        }
    }
}
