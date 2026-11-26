package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.strings.OfferingStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1 extends n implements u00.a {
    final DiagnosticsTracker.CacheStatus $cacheStatus$inlined;
    final LogIntent $intent;

    public OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1(LogIntent logIntent, DiagnosticsTracker.CacheStatus cacheStatus) {
        super(0);
        this.$intent = logIntent;
        this.$cacheStatus$inlined = cacheStatus;
    }

    @Override
    public final String invoke() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        int i = OfferingsManager.WhenMappings.$EnumSwitchMapping$0[this.$cacheStatus$inlined.ordinal()];
        if (i == 1) {
            str = OfferingStrings.FORCE_OFFERINGS_FETCHING_NETWORK;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unexpected cache status for fetch: " + this.$cacheStatus$inlined);
            }
            str = OfferingStrings.NO_CACHED_OFFERINGS_FETCHING_NETWORK;
        }
        sb.append(str);
        return sb.toString();
    }
}
