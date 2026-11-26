package ld;

import com.google.protobuf.RuntimeVersion;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import r30.r;

public final class g extends n implements u00.k {
    public static final g A = new g(1);

    public final Object invoke(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        kotlin.jvm.internal.m.e(jSONObject, "it");
        String string = jSONObject.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return r.v0(string, "\u0000", RuntimeVersion.SUFFIX);
    }
}
