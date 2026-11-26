package com.revenuecat.purchases;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.LogIntent;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1 extends n implements u00.a {
    final LogIntent $intent;

    public PurchasesOrchestrator$restorePurchases$4$1$invoke$$inlined$log$1(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    @Override
    public final String invoke() {
        return x5.n(new StringBuilder(), q.R0(this.$intent.getEmojiList(), "", null, null, null, 62), " No purchases found to restore. This will happen if the user does not have any active subscriptions or unconsumed one-time products.Please make sure you're using the correct Store account (Google/Amazon) and that you have configured your one-time products correctly as either consumables (that can be purchased multiple times) or non-consumables (that can only be purchased one by each user) in the RevenueCat dashboard. This will return the current CustomerInfo.");
    }
}
