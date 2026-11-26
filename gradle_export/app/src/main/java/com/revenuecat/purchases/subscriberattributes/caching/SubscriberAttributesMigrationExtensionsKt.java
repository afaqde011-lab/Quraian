package com.revenuecat.purchases.subscriberattributes.caching;

import android.content.SharedPreferences;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import h00.d0;
import h00.r;
import h00.y;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import r30.k;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\r\u001a\u00020\u0003*\u00020\u00002*\u0010\f\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a&\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n0\u0006j\u0002`\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Landroid/content/SharedPreferences$Editor;", "cacheEditor", "Lg00/b0;", "migrateSubscriberAttributesIfNeeded", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Landroid/content/SharedPreferences$Editor;)V", "", "", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "legacySubscriberAttributesForAppUserID", "migrateSubscriberAttributes", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Ljava/util/Map;Landroid/content/SharedPreferences$Editor;)V", "appUserID", "legacySubscriberAttributesCacheKey", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Ljava/lang/String;)Ljava/lang/String;", "getAllLegacyStoredSubscriberAttributes", "(Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;)Ljava/util/Map;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributesMigrationExtensionsKt {
    public static final synchronized Map<String, Map<String, SubscriberAttribute>> getAllLegacyStoredSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache) {
        LinkedHashMap linkedHashMap;
        Map mapBuildLegacySubscriberAttributes;
        try {
            m.e(subscriberAttributesCache, "<this>");
            String strLegacySubscriberAttributesCacheKey = legacySubscriberAttributesCacheKey(subscriberAttributesCache, "");
            Set<String> setFindKeysThatStartWith$purchases_defaultsBc8Release = subscriberAttributesCache.getDeviceCache().findKeysThatStartWith$purchases_defaultsBc8Release(strLegacySubscriberAttributesCacheKey);
            int iP = d0.P(r.q0(setFindKeysThatStartWith$purchases_defaultsBc8Release, 10));
            if (iP < 16) {
                iP = 16;
            }
            linkedHashMap = new LinkedHashMap(iP);
            for (String str : setFindKeysThatStartWith$purchases_defaultsBc8Release) {
                String str2 = (String) k.W0(str, new String[]{strLegacySubscriberAttributesCacheKey}, 6).get(1);
                JSONObject jSONObjectOrNull$purchases_defaultsBc8Release = subscriberAttributesCache.getDeviceCache().getJSONObjectOrNull$purchases_defaultsBc8Release(str);
                if (jSONObjectOrNull$purchases_defaultsBc8Release == null || (mapBuildLegacySubscriberAttributes = SubscriberAttributesFactoriesKt.buildLegacySubscriberAttributes(jSONObjectOrNull$purchases_defaultsBc8Release)) == null) {
                    mapBuildLegacySubscriberAttributes = y.A;
                }
                linkedHashMap.put(str2, mapBuildLegacySubscriberAttributes);
            }
        } catch (Throwable th) {
            throw th;
        }
        return linkedHashMap;
    }

    public static final String legacySubscriberAttributesCacheKey(SubscriberAttributesCache subscriberAttributesCache, String appUserID) {
        m.e(subscriberAttributesCache, "<this>");
        m.e(appUserID, "appUserID");
        return subscriberAttributesCache.getSubscriberAttributesCacheKey$purchases_defaultsBc8Release() + '.' + appUserID;
    }

    public static final synchronized void migrateSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache, Map<String, ? extends Map<String, SubscriberAttribute>> legacySubscriberAttributesForAppUserID, SharedPreferences.Editor cacheEditor) {
        try {
            m.e(subscriberAttributesCache, "<this>");
            m.e(legacySubscriberAttributesForAppUserID, "legacySubscriberAttributesForAppUserID");
            m.e(cacheEditor, "cacheEditor");
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = subscriberAttributesCache.getAllStoredSubscriberAttributes();
            LinkedHashMap linkedHashMapB0 = d0.b0(allStoredSubscriberAttributes);
            for (Map.Entry<String, ? extends Map<String, SubscriberAttribute>> entry : legacySubscriberAttributesForAppUserID.entrySet()) {
                String key = entry.getKey();
                Map<String, SubscriberAttribute> value = entry.getValue();
                Map<String, SubscriberAttribute> map = allStoredSubscriberAttributes.get(key);
                if (map == null) {
                    map = y.A;
                }
                linkedHashMapB0.put(key, d0.U(value, map));
                cacheEditor.remove(legacySubscriberAttributesCacheKey(subscriberAttributesCache, key));
            }
            cacheEditor.putString(subscriberAttributesCache.getSubscriberAttributesCacheKey$purchases_defaultsBc8Release(), CachingHelpersKt.toJSONObject(linkedHashMapB0).toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final synchronized void migrateSubscriberAttributesIfNeeded(SubscriberAttributesCache subscriberAttributesCache, SharedPreferences.Editor cacheEditor) {
        m.e(subscriberAttributesCache, "<this>");
        m.e(cacheEditor, "cacheEditor");
        Map<String, Map<String, SubscriberAttribute>> allLegacyStoredSubscriberAttributes = getAllLegacyStoredSubscriberAttributes(subscriberAttributesCache);
        if (allLegacyStoredSubscriberAttributes.isEmpty()) {
            allLegacyStoredSubscriberAttributes = null;
        }
        if (allLegacyStoredSubscriberAttributes != null) {
            migrateSubscriberAttributes(subscriberAttributesCache, allLegacyStoredSubscriberAttributes, cacheEditor);
        }
    }
}
