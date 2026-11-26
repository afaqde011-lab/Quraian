package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PurchasesError;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class LogUtilsKt$errorLog$$inlined$log$1 extends n implements a {
    final PurchasesError $error$inlined;
    final LogIntent $intent;

    public LogUtilsKt$errorLog$$inlined$log$1(LogIntent logIntent, PurchasesError purchasesError) {
        super(0);
        this.$intent = logIntent;
        this.$error$inlined = purchasesError;
    }

    @Override
    public final String invoke() {
        return q.R0(this.$intent.getEmojiList(), "", null, null, null, 62) + ' ' + this.$error$inlined.toString();
    }
}
