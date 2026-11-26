package com.revenuecat.purchases.amazon;

import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class AmazonCache$amazonPostedTokensKey$2 extends n implements a {
    final AmazonCache this$0;

    public AmazonCache$amazonPostedTokensKey$2(AmazonCache amazonCache) {
        super(0);
        this.this$0 = amazonCache;
    }

    @Override
    public final String invoke() {
        return this.this$0.deviceCache.newKey$purchases_defaultsBc8Release("amazon.tokens");
    }
}
