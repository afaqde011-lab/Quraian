package qd;

import org.json.JSONObject;

public final class n {

    public final String f12912a;

    public final long f12913b;

    public final String f12914c;

    public final String f12915d;

    public final int f12916e;

    public final int f12917f;

    public n(JSONObject jSONObject) {
        this.f12915d = jSONObject.optString("billingPeriod");
        this.f12914c = jSONObject.optString("priceCurrencyCode");
        this.f12912a = jSONObject.optString("formattedPrice");
        this.f12913b = jSONObject.optLong("priceAmountMicros");
        this.f12917f = jSONObject.optInt("recurrenceMode");
        this.f12916e = jSONObject.optInt("billingCycleCount");
    }
}
