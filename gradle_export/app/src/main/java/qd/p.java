package qd;

import android.text.TextUtils;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class p {

    public final String f12949a;

    public final JSONObject f12950b;

    public final String f12951c;

    public final String f12952d;

    public final String f12953e;

    public final String f12954f;

    public final String f12955g;

    public final String f12956h;

    public final String f12957i;

    public final ArrayList f12958j;

    public final ArrayList f12959k;

    public p(String str) {
        this.f12949a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f12950b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f12951c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f12952d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f12953e = jSONObject.optString("title");
        this.f12954f = jSONObject.optString("name");
        this.f12955g = jSONObject.optString(MediaTrack.ROLE_DESCRIPTION);
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f12956h = jSONObject.optString("skuDetailsToken");
        this.f12957i = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new o(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f12958j = arrayList;
        } else {
            this.f12958j = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f12950b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f12950b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new m(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f12959k = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f12959k = null;
        } else {
            arrayList2.add(new m(jSONObjectOptJSONObject));
            this.f12959k = arrayList2;
        }
    }

    public final m a() {
        ArrayList arrayList = this.f12959k;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (m) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return TextUtils.equals(this.f12949a, ((p) obj).f12949a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12949a.hashCode();
    }

    public final String toString() {
        String string = this.f12950b.toString();
        String strValueOf = String.valueOf(this.f12958j);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        a1.b.z(sb2, this.f12949a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f12951c);
        sb2.append("', productType='");
        sb2.append(this.f12952d);
        sb2.append("', title='");
        sb2.append(this.f12953e);
        sb2.append("', productDetailsToken='");
        return oi.k.m(sb2, this.f12956h, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
