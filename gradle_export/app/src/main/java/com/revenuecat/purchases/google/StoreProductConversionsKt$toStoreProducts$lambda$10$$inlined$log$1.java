package com.revenuecat.purchases.google;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.PurchaseStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import qd.p;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class StoreProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1 extends n implements u00.a {
    final LogIntent $intent;
    final p $productDetails$inlined;

    public StoreProductConversionsKt$toStoreProducts$lambda$10$$inlined$log$1(LogIntent logIntent, p pVar) {
        super(0);
        this.$intent = logIntent;
        this.$productDetails$inlined = pVar;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return a1.b.r(new Object[]{this.$productDetails$inlined.c}, 1, PurchaseStrings.INVALID_PRODUCT_NO_PRICE, sb);
    }
}
