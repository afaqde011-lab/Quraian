package com.revenuecat.purchases.common;

import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
public final class LogWrapperKt$log$fullMessageBuilder$1 extends n implements a {
    final LogIntent $intent;
    final a $messageBuilder;

    public LogWrapperKt$log$fullMessageBuilder$1(LogIntent logIntent, a aVar) {
        super(0);
        this.$intent = logIntent;
        this.$messageBuilder = aVar;
    }

    @Override
    public final String invoke() {
        return q.R0(this.$intent.getEmojiList(), "", null, null, null, 62) + ' ' + ((String) this.$messageBuilder.invoke());
    }
}
