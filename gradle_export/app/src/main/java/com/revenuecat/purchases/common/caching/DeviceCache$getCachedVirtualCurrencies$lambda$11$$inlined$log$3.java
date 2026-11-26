package com.revenuecat.purchases.common.caching;

import a1.b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.VirtualCurrencyStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3 extends n implements a {
    final IllegalArgumentException $error$inlined;
    final LogIntent $intent;

    public DeviceCache$getCachedVirtualCurrencies$lambda$11$$inlined$log$3(LogIntent logIntent, IllegalArgumentException illegalArgumentException) {
        super(0);
        this.$intent = logIntent;
        this.$error$inlined = illegalArgumentException;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return b.r(new Object[]{this.$error$inlined}, 1, VirtualCurrencyStrings.ERROR_DECODING_CACHED_VIRTUAL_CURRENCIES, sb);
    }
}
