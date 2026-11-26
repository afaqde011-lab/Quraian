package com.revenuecat.purchases.subscriberattributes;

import a1.b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import h00.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributesManager$markAsSynced$$inlined$log$1 extends n implements u00.a {
    final List $attributeErrors$inlined;
    final LogIntent $intent;

    public SubscriberAttributesManager$markAsSynced$$inlined$log$1(LogIntent logIntent, List list) {
        super(0);
        this.$intent = logIntent;
        this.$attributeErrors$inlined = list;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return b.r(new Object[]{this.$attributeErrors$inlined}, 1, AttributionStrings.SUBSCRIBER_ATTRIBUTES_ERROR, sb);
    }
}
