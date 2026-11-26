package com.revenuecat.purchases.common.caching;

import a1.b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.ReceiptStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DateExtensionsKt$isCacheStale$lambda$1$$inlined$log$1 extends n implements a {
    final boolean $appInBackground$inlined;
    final LogIntent $intent;

    public DateExtensionsKt$isCacheStale$lambda$1$$inlined$log$1(LogIntent logIntent, boolean z) {
        super(0);
        this.$intent = logIntent;
        this.$appInBackground$inlined = z;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return b.r(new Object[]{Boolean.valueOf(this.$appInBackground$inlined)}, 1, ReceiptStrings.CHECKING_IF_CACHE_STALE, sb);
    }
}
