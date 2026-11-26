package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.OfferingStrings;
import h00.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import qd.x;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class QueryProductDetailsUseCase$onOk$$inlined$log$2 extends n implements u00.a {
    final LogIntent $intent;
    final x $received$inlined;

    public QueryProductDetailsUseCase$onOk$$inlined$log$2(LogIntent logIntent, x xVar) {
        super(0);
        this.$intent = logIntent;
        this.$received$inlined = xVar;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        List list = this.$received$inlined.a;
        m.d(list, "received.productDetailsList");
        return a1.b.r(new Object[]{q.R0(list, null, null, null, QueryProductDetailsUseCase$onOk$2$1.INSTANCE, 31)}, 1, OfferingStrings.RETRIEVED_PRODUCTS, sb);
    }
}
