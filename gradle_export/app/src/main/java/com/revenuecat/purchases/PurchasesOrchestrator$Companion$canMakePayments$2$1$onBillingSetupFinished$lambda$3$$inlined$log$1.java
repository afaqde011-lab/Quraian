package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.PurchaseStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import qd.h;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1 extends n implements u00.a {
    final h $billingResult$inlined;
    final LogIntent $intent;

    public PurchasesOrchestrator$Companion$canMakePayments$2$1$onBillingSetupFinished$lambda$3$$inlined$log$1(LogIntent logIntent, h hVar) {
        super(0);
        this.$intent = logIntent;
        this.$billingResult$inlined = hVar;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return a1.b.r(new Object[]{Integer.valueOf(this.$billingResult$inlined.a)}, 1, PurchaseStrings.EXTRA_CONNECTION_CANMAKEPAYMENTS, sb);
    }
}
