package com.revenuecat.purchases.subscriberattributes;

import h00.d0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import org.json.JSONObject;
import q30.l;
import u00.k;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0006*\u00020\u0004H\u0000\u001a0\u0010\u0007\u001a&\u0012\b\u0012\u00060\u0002j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00060\u0001j\u0002`\t*\u00020\u0004H\u0000¨\u0006\n"}, d2 = {"buildLegacySubscriberAttributes", "", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lorg/json/JSONObject;", "buildSubscriberAttributesMap", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "buildSubscriberAttributesMapPerUser", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributesFactoriesKt {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "attributeKey", "Lg00/k;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "invoke", "(Ljava/lang/String;)Lg00/k;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final JSONObject $this_buildSubscriberAttributesMap;

        public AnonymousClass1(JSONObject jSONObject) {
            super(1);
            this.$this_buildSubscriberAttributesMap = jSONObject;
        }

        @Override
        public final g00.k invoke(String str) throws JSONException {
            Object obj = this.$this_buildSubscriberAttributesMap.get(str);
            m.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return new g00.k(str, new SubscriberAttribute((JSONObject) obj));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "kotlin.jvm.PlatformType", "userId", "Lg00/k;", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "invoke", "(Ljava/lang/String;)Lg00/k;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C01221 extends n implements k {
        final JSONObject $attributesJSONObject;

        public C01221(JSONObject jSONObject) {
            super(1);
            this.$attributesJSONObject = jSONObject;
        }

        @Override
        public final g00.k invoke(String str) throws JSONException {
            Object obj = this.$attributesJSONObject.get(str);
            m.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            return new g00.k(str, SubscriberAttributesFactoriesKt.buildSubscriberAttributesMap((JSONObject) obj));
        }
    }

    public static final Map<String, SubscriberAttribute> buildLegacySubscriberAttributes(JSONObject jSONObject) throws JSONException {
        m.e(jSONObject, "<this>");
        JSONObject attributesJSONObject = jSONObject.getJSONObject("attributes");
        m.d(attributesJSONObject, "attributesJSONObject");
        return buildSubscriberAttributesMap(attributesJSONObject);
    }

    public static final Map<String, SubscriberAttribute> buildSubscriberAttributesMap(JSONObject jSONObject) {
        m.e(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        m.d(itKeys, "this.keys()");
        return d0.a0(l.r0(l.j0(itKeys), new AnonymousClass1(jSONObject)));
    }

    public static final Map<String, Map<String, SubscriberAttribute>> buildSubscriberAttributesMapPerUser(JSONObject jSONObject) throws JSONException {
        m.e(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        Iterator<String> itKeys = jSONObject2.keys();
        m.d(itKeys, "attributesJSONObject.keys()");
        return d0.a0(l.r0(l.j0(itKeys), new C01221(jSONObject2)));
    }
}
