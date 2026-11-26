package com.revenuecat.purchases.google;

import a2.n;
import android.text.TextUtils;
import c7.g;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import qd.e;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqd/e;", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Lg00/b0;", "setUpgradeInfo", "(Lqd/e;Lcom/revenuecat/purchases/common/ReplaceProductInfo;)V", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BillingFlowParamsExtensionsKt {
    public static final void setUpgradeInfo(e eVar, ReplaceProductInfo replaceProductInfo) {
        int playBillingClientMode;
        m.e(eVar, "<this>");
        m.e(replaceProductInfo, "replaceProductInfo");
        String purchaseToken = replaceProductInfo.getOldPurchase().getPurchaseToken();
        ReplacementMode replacementMode = replaceProductInfo.getReplacementMode();
        if (replacementMode == null) {
            playBillingClientMode = 0;
        } else {
            GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
            if (googleReplacementMode == null) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Got non-Google replacement mode", null);
                playBillingClientMode = 0;
            } else {
                playBillingClientMode = googleReplacementMode.getPlayBillingClientMode();
            }
        }
        boolean z = (TextUtils.isEmpty(purchaseToken) && TextUtils.isEmpty(null)) ? false : true;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z && !zIsEmpty) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!z && zIsEmpty) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        n nVar = new n();
        nVar.a = purchaseToken;
        nVar.b = playBillingClientMode;
        g gVar = new g();
        gVar.c = nVar.a;
        gVar.a = nVar.b;
        eVar.d = gVar;
    }
}
