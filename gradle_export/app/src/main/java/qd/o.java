package qd;

import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class o {

    public final String f12919a;

    public final String f12920b;

    public final String f12921c;

    public final db.g f12922d;

    public final ArrayList f12923e;

    public final l f12924f;

    public o(JSONObject jSONObject) throws JSONException {
        this.f12919a = jSONObject.optString("basePlanId");
        String strOptString = jSONObject.optString("offerId");
        this.f12920b = true == strOptString.isEmpty() ? null : strOptString;
        this.f12921c = jSONObject.getString("offerIdToken");
        this.f12922d = new db.g(jSONObject.getJSONArray("pricingPhases"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        this.f12924f = jSONObjectOptJSONObject != null ? new l(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getString("productId");
            jSONObjectOptJSONObject2.optString("title");
            jSONObjectOptJSONObject2.optString("name");
            jSONObjectOptJSONObject2.optString(MediaTrack.ROLE_DESCRIPTION);
            jSONObjectOptJSONObject2.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject3.optString("billingPeriod");
                jSONObjectOptJSONObject3.optString("priceCurrencyCode");
                jSONObjectOptJSONObject3.optString("formattedPrice");
                jSONObjectOptJSONObject3.optLong("priceAmountMicros");
                jSONObjectOptJSONObject3.optInt("recurrenceMode");
                jSONObjectOptJSONObject3.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i10));
            }
        }
        this.f12923e = arrayList;
    }
}
