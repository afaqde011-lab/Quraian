package com.revenuecat.purchases;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.LogIntent;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator$special$$inlined$log$1 extends n implements u00.a {
    final LogIntent $intent;

    public PurchasesOrchestrator$special$$inlined$log$1(LogIntent logIntent) {
        super(0);
        this.$intent = logIntent;
    }

    @Override
    public final String invoke() {
        return x5.n(new StringBuilder(), q.R0(this.$intent.getEmojiList(), "", null, null, null, 62), " Automatic syncing of purchases has been disabled. \nRevenueCat won’t observe the new purchases from the store, and it will not sync any purchase \nautomatically. Call syncPurchases whenever a new transaction is completed so the \nreceipt is sent to RevenueCat’s backend. Consumables disappear from the receipt \nafter the transaction is finished, so make sure purchases are synced before \nfinishing any consumable transaction, otherwise RevenueCat won’t register the \npurchase.");
    }
}
