package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1 extends n implements u00.a {
    final PurchasesError $error$inlined;
    final LogIntent $intent;

    public PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$4$invoke$$inlined$log$1(LogIntent logIntent, PurchasesError purchasesError) {
        super(0);
        this.$intent = logIntent;
        this.$error$inlined = purchasesError;
    }

    @Override
    public final String invoke() {
        return q.R0(this.$intent.getEmojiList(), "", null, null, null, 62) + ' ' + this.$error$inlined.toString();
    }
}
