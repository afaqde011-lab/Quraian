package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.SyncAttributesAndOfferingsStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1 extends n implements u00.a {
    final LogIntent $intent;
    final PurchasesOrchestrator this$0;

    public PurchasesOrchestrator$syncAttributesAndOfferingsIfNeeded$$inlined$log$1(LogIntent logIntent, PurchasesOrchestrator purchasesOrchestrator) {
        super(0);
        this.$intent = logIntent;
        this.this$0 = purchasesOrchestrator;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        Integer numValueOf = Integer.valueOf(this.this$0.lastSyncAttributesAndOfferingsRateLimiter.getMaxCallsInPeriod());
        long periodSeconds = this.this$0.lastSyncAttributesAndOfferingsRateLimiter.getPeriodSeconds();
        s30.a aVar = s30.b.B;
        return a1.b.r(new Object[]{numValueOf, Long.valueOf(s30.b.i(periodSeconds, s30.d.SECONDS))}, 2, SyncAttributesAndOfferingsStrings.RATE_LIMIT_REACHED, sb);
    }
}
