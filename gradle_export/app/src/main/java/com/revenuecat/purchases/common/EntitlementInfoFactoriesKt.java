package com.revenuecat.purchases.common;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.responses.EntitlementsResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.DateActive;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.EntitlementInfoHelper;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a,\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a,\u0010\r\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0003H\u0000¨\u0006\u0018"}, d2 = {"isDateActive", "", "identifier", "", "expirationDate", "Ljava/util/Date;", "requestDate", "buildEntitlementInfo", "Lcom/revenuecat/purchases/EntitlementInfo;", "Lorg/json/JSONObject;", "productData", "verificationResult", "Lcom/revenuecat/purchases/VerificationResult;", "buildEntitlementInfos", "Lcom/revenuecat/purchases/EntitlementInfos;", CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, "nonSubscriptionsLatestPurchases", "getStore", "Lcom/revenuecat/purchases/Store;", DiagnosticsEntry.NAME_KEY, "optOwnershipType", "Lcom/revenuecat/purchases/OwnershipType;", "optPeriodType", "Lcom/revenuecat/purchases/PeriodType;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EntitlementInfoFactoriesKt {
    public static final EntitlementInfo buildEntitlementInfo(JSONObject jSONObject, String identifier, JSONObject productData, Date requestDate, VerificationResult verificationResult) throws JSONException {
        m.e(jSONObject, "<this>");
        m.e(identifier, "identifier");
        m.e(productData, "productData");
        m.e(requestDate, "requestDate");
        m.e(verificationResult, "verificationResult");
        Date dateOptDate = JSONObjectExtensionsKt.optDate(jSONObject, "expires_date");
        Date dateOptDate2 = JSONObjectExtensionsKt.optDate(productData, ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT);
        Date dateOptDate3 = JSONObjectExtensionsKt.optDate(productData, ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT);
        PeriodType periodTypeOptPeriodType = optPeriodType(productData, ProductResponseJsonKeys.PERIOD_TYPE);
        Store store = getStore(productData, ProductResponseJsonKeys.STORE);
        boolean zIsDateActive = isDateActive(identifier, dateOptDate, requestDate);
        boolean willRenew = EntitlementInfoHelper.INSTANCE.getWillRenew(store, dateOptDate, dateOptDate2, dateOptDate3, periodTypeOptPeriodType);
        Date date = JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date");
        Date date2 = JSONObjectExtensionsKt.getDate(productData, "original_purchase_date");
        String string = jSONObject.getString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
        m.d(string, "getString(EntitlementsRe…nKeys.PRODUCT_IDENTIFIER)");
        return new EntitlementInfo(identifier, zIsDateActive, willRenew, periodTypeOptPeriodType, date, date2, dateOptDate, store, string, JSONObjectExtensionsKt.optNullableString(jSONObject, "product_plan_identifier"), productData.getBoolean(ProductResponseJsonKeys.IS_SANDBOX), dateOptDate2, dateOptDate3, optOwnershipType(productData, ProductResponseJsonKeys.OWNERSHIP_TYPE), jSONObject, verificationResult);
    }

    public static final EntitlementInfos buildEntitlementInfos(JSONObject jSONObject, JSONObject subscriptions, JSONObject nonSubscriptionsLatestPurchases, Date requestDate, VerificationResult verificationResult) {
        m.e(jSONObject, "<this>");
        m.e(subscriptions, "subscriptions");
        m.e(nonSubscriptionsLatestPurchases, "nonSubscriptionsLatestPurchases");
        m.e(requestDate, "requestDate");
        m.e(verificationResult, "verificationResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        m.d(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String entitlementId = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(entitlementId);
            String it = jSONObject2.optString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
            m.d(it, "it");
            if (it.length() <= 0) {
                it = null;
            }
            if (it != null) {
                if (subscriptions.has(it)) {
                    m.d(entitlementId, "entitlementId");
                    JSONObject jSONObject3 = subscriptions.getJSONObject(it);
                    m.d(jSONObject3, "subscriptions.getJSONObject(productIdentifier)");
                    linkedHashMap.put(entitlementId, buildEntitlementInfo(jSONObject2, entitlementId, jSONObject3, requestDate, verificationResult));
                } else if (nonSubscriptionsLatestPurchases.has(it)) {
                    m.d(entitlementId, "entitlementId");
                    JSONObject jSONObject4 = nonSubscriptionsLatestPurchases.getJSONObject(it);
                    m.d(jSONObject4, "nonSubscriptionsLatestPu…Object(productIdentifier)");
                    linkedHashMap.put(entitlementId, buildEntitlementInfo(jSONObject2, entitlementId, jSONObject4, requestDate, verificationResult));
                }
            }
        }
        return new EntitlementInfos(linkedHashMap, verificationResult);
    }

    public static final Store getStore(JSONObject jSONObject, String name) throws JSONException {
        m.e(jSONObject, "<this>");
        m.e(name, "name");
        Store.Companion companion = Store.INSTANCE;
        String string = jSONObject.getString(name);
        m.d(string, "getString(name)");
        return companion.fromString(string);
    }

    private static final boolean isDateActive(String str, Date date, Date date2) {
        DateActive dateActiveM255isDateActiveSxA4cEA$default = DateHelper.Companion.m255isDateActiveSxA4cEA$default(DateHelper.INSTANCE, date, date2, 0L, 4, null);
        if (!dateActiveM255isDateActiveSxA4cEA$default.isActive() && !dateActiveM255isDateActiveSxA4cEA$default.getInGracePeriod()) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w(x5.k(logLevel, new StringBuilder("[Purchases] - ")), String.format(PurchaseStrings.ENTITLEMENT_EXPIRED_OUTSIDE_GRACE_PERIOD, Arrays.copyOf(new Object[]{str, date, date2}, 3)));
            }
        }
        return dateActiveM255isDateActiveSxA4cEA$default.isActive();
    }

    public static final OwnershipType optOwnershipType(JSONObject jSONObject, String name) {
        m.e(jSONObject, "<this>");
        m.e(name, "name");
        String strOptString = jSONObject.optString(name);
        if (m.a(strOptString, "PURCHASED")) {
            return OwnershipType.PURCHASED;
        }
        return m.a(strOptString, "FAMILY_SHARED") ? OwnershipType.FAMILY_SHARED : OwnershipType.UNKNOWN;
    }

    public static final PeriodType optPeriodType(JSONObject jSONObject, String name) {
        m.e(jSONObject, "<this>");
        m.e(name, "name");
        String strOptString = jSONObject.optString(name);
        if (strOptString != null) {
            switch (strOptString.hashCode()) {
                case -1039745817:
                    if (strOptString.equals("normal")) {
                        return PeriodType.NORMAL;
                    }
                    break;
                case -318370833:
                    if (strOptString.equals("prepaid")) {
                        return PeriodType.PREPAID;
                    }
                    break;
                case 100361836:
                    if (strOptString.equals("intro")) {
                        return PeriodType.INTRO;
                    }
                    break;
                case 110628630:
                    if (strOptString.equals("trial")) {
                        return PeriodType.TRIAL;
                    }
                    break;
            }
        }
        return PeriodType.NORMAL;
    }
}
