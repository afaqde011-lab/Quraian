package qd;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class s {

    public final String f12963a;

    public final String f12964b;

    public final JSONObject f12965c;

    public s(String str, String str2) {
        this.f12963a = str;
        this.f12964b = str2;
        this.f12965c = new JSONObject(str);
        int i10 = com.google.android.gms.internal.play_billing.t.C;
        Object[] objArr = com.google.android.gms.internal.play_billing.b0.I;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f12965c;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final String b() {
        JSONObject jSONObject = this.f12965c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return TextUtils.equals(this.f12963a, sVar.f12963a) && TextUtils.equals(this.f12964b, sVar.f12964b);
    }

    public final int hashCode() {
        return this.f12963a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f12963a));
    }
}
