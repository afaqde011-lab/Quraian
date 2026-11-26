package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.strings.RestoreStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import qd.s;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1 extends n implements u00.a {
    final LogIntent $intent;
    final s $it$inlined;

    public QueryPurchaseHistoryUseCase$executeAsync$1$invoke$lambda$7$lambda$6$lambda$3$$inlined$log$1(LogIntent logIntent, s sVar) {
        super(0);
        this.$intent = logIntent;
        this.$it$inlined = sVar;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        s it = this.$it$inlined;
        m.d(it, "it");
        return a1.b.r(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(this.$it$inlined)}, 1, RestoreStrings.PURCHASE_HISTORY_RETRIEVED, sb);
    }
}
