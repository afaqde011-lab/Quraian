package com.revenuecat.purchases.subscriberattributes;

import ab.a0;
import com.revenuecat.purchases.common.BackendKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import g00.k;
import h00.d0;
import h00.q;
import h00.r;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z00.d;
import z00.e;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000\u001a2\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0005*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0005H\u0000¨\u0006\t"}, d2 = {"getAttributeErrors", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "Lorg/json/JSONObject;", "toBackendMap", "", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BackendHelpersKt {
    public static final List<SubscriberAttributeError> getAttributeErrors(JSONObject jSONObject) throws JSONException {
        x xVar = x.A;
        if (jSONObject == null) {
            return xVar;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(BackendKt.ATTRIBUTES_ERROR_RESPONSE_KEY);
        if (jSONObjectOptJSONObject != null) {
            jSONObject = jSONObjectOptJSONObject;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(BackendKt.ATTRIBUTE_ERRORS_KEY);
        if (jSONArrayOptJSONArray == null) {
            return xVar;
        }
        e eVarI0 = a0.I0(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(r.q0(eVarI0, 10));
        Iterator it = eVarI0.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArrayOptJSONArray.getJSONObject(((d) it).nextInt()));
        }
        ArrayList<JSONObject> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2.has("key_name") && jSONObject2.has("message")) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(r.q0(arrayList2, 10));
        for (JSONObject jSONObject3 : arrayList2) {
            String string = jSONObject3.getString("key_name");
            m.d(string, "it.getString(\"key_name\")");
            String string2 = jSONObject3.getString("message");
            m.d(string2, "it.getString(\"message\")");
            arrayList3.add(new SubscriberAttributeError(string, string2));
        }
        return q.n1(arrayList3);
    }

    public static final Map<String, Map<String, Object>> toBackendMap(Map<String, SubscriberAttribute> map) {
        m.e(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            arrayList.add(new k(entry.getKey(), entry.getValue().toBackendMap()));
        }
        return d0.Y(arrayList);
    }
}
