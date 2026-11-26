package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.OfferingStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import qd.z;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1 extends n implements u00.a {
    final LogIntent $intent;
    final z $it$inlined;
    final QueryProductDetailsUseCase this$0;

    public QueryProductDetailsUseCase$onOk$lambda$12$$inlined$log$1(LogIntent logIntent, z zVar, QueryProductDetailsUseCase queryProductDetailsUseCase) {
        super(0);
        this.$intent = logIntent;
        this.$it$inlined = zVar;
        this.this$0 = queryProductDetailsUseCase;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        z zVar = this.$it$inlined;
        return a1.b.r(new Object[]{zVar.b, zVar.c, this.this$0.convertUnfetchedProductStatusCodeToString(zVar.d), this.$it$inlined.e}, 4, OfferingStrings.LIST_UNFETCHED_PRODUCTS, sb);
    }
}
