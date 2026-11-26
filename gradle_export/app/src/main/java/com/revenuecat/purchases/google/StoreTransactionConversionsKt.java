package com.revenuecat.purchases.google;

import android.text.TextUtils;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import qd.s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aW\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\f\u0010\u0010\"\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u0000*\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lqd/s;", "Lcom/revenuecat/purchases/ProductType;", "productType", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "presentedOfferingContext", "", "subscriptionOptionId", "", "subscriptionOptionIdForProductIDs", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "replacementMode", "Lcom/revenuecat/purchases/models/StoreTransaction;", "toStoreTransaction", "(Lqd/s;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/String;Ljava/util/Map;Lcom/revenuecat/purchases/models/GoogleReplacementMode;)Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/google/PurchaseContext;", "purchaseContext", "(Lqd/s;Lcom/revenuecat/purchases/google/PurchaseContext;)Lcom/revenuecat/purchases/models/StoreTransaction;", "getOriginalGooglePurchase", "(Lcom/revenuecat/purchases/models/StoreTransaction;)Lqd/s;", "originalGooglePurchase", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StoreTransactionConversionsKt {
    public static final s getOriginalGooglePurchase(StoreTransaction storeTransaction) {
        m.e(storeTransaction, "<this>");
        String signature = storeTransaction.getSignature();
        if (signature == null) {
            return null;
        }
        if (storeTransaction.getPurchaseType() != PurchaseType.GOOGLE_PURCHASE) {
            signature = null;
        }
        if (signature != null) {
            return new s(storeTransaction.getOriginalJson().toString(), signature);
        }
        return null;
    }

    public static final StoreTransaction toStoreTransaction(s sVar, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, Map<String, String> map, GoogleReplacementMode googleReplacementMode) {
        m.e(sVar, "<this>");
        m.e(productType, "productType");
        JSONObject jSONObject = sVar.c;
        String strOptString = jSONObject.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = null;
        }
        ArrayList arrayListA = sVar.a();
        long jOptLong = jSONObject.optLong("purchaseTime");
        String strB = sVar.b();
        m.d(strB, "this.purchaseToken");
        return new StoreTransaction(strOptString, arrayListA, productType, jOptLong, strB, PurchaseStateConversionsKt.toRevenueCatPurchaseState(jSONObject.optInt("purchaseState", 1) == 4 ? 2 : 1), Boolean.valueOf(jSONObject.optBoolean("autoRenewing")), sVar.b, new JSONObject(sVar.a), presentedOfferingContext, null, PurchaseType.GOOGLE_PURCHASE, null, str, map, googleReplacementMode);
    }

    public static final StoreTransaction toStoreTransaction(s sVar, PurchaseContext purchaseContext) {
        m.e(sVar, "<this>");
        m.e(purchaseContext, "purchaseContext");
        return toStoreTransaction(sVar, purchaseContext.getProductType(), purchaseContext.getPresentedOfferingContext(), purchaseContext.getSelectedSubscriptionOptionId(), purchaseContext.getSubscriptionOptionIdForProductIDs(), purchaseContext.getReplacementMode());
    }

    public static StoreTransaction toStoreTransaction$default(s sVar, ProductType productType, PresentedOfferingContext presentedOfferingContext, String str, Map map, GoogleReplacementMode googleReplacementMode, int i, Object obj) {
        if ((i & 2) != 0) {
            presentedOfferingContext = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            googleReplacementMode = null;
        }
        return toStoreTransaction(sVar, productType, presentedOfferingContext, str, map, googleReplacementMode);
    }
}
