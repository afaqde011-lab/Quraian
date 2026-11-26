package com.revenuecat.purchases.amazon.handler;

import a1.b;
import com.amazon.device.iap.model.PurchaseResponse;
import com.revenuecat.purchases.amazon.AmazonStrings;
import com.revenuecat.purchases.common.LogIntent;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchaseHandler$onPurchaseResponse$$inlined$log$1 extends n implements u00.a {
    final LogIntent $intent;
    final PurchaseResponse $response$inlined;

    public PurchaseHandler$onPurchaseResponse$$inlined$log$1(LogIntent logIntent, PurchaseResponse purchaseResponse) {
        super(0);
        this.$intent = logIntent;
        this.$response$inlined = purchaseResponse;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return b.r(new Object[]{this.$response$inlined.toJSON().toString(1)}, 1, AmazonStrings.PURCHASE_REQUEST_FINISHED, sb);
    }
}
