package com.revenuecat.purchases.common;

import h00.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1 extends n implements a {
    final LogIntent $intent;
    final List $revenueCatKeys$inlined;

    public SharedPreferencesManager$getRevenueCatKeysToMigrate$$inlined$log$1(LogIntent logIntent, List list) {
        super(0);
        this.$intent = logIntent;
        this.$revenueCatKeys$inlined = list;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        sb.append("Found " + this.$revenueCatKeys$inlined.size() + " RevenueCat keys to migrate: " + this.$revenueCatKeys$inlined);
        return sb.toString();
    }
}
