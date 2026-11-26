package qd;

import android.text.TextUtils;
import org.json.JSONObject;

public final class z {

    public final String f12977a;

    public final String f12978b;

    public final String f12979c;

    public final int f12980d;

    public final String f12981e;

    public z(String str) {
        this.f12977a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f12978b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f12979c = strOptString;
        this.f12980d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f12981e = jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return TextUtils.equals(this.f12977a, ((z) obj).f12977a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12977a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f12978b);
        sb2.append("', productType='");
        sb2.append(this.f12979c);
        sb2.append("', statusCode=");
        return g4.c.g(this.f12980d, "}", sb2);
    }
}
