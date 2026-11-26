package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/AppLifecycleHandler;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator$lifecycleHandler$2 extends n implements u00.a {
    final PurchasesOrchestrator this$0;

    public PurchasesOrchestrator$lifecycleHandler$2(PurchasesOrchestrator purchasesOrchestrator) {
        super(0);
        this.this$0 = purchasesOrchestrator;
    }

    @Override
    public final AppLifecycleHandler invoke() {
        return new AppLifecycleHandler(this.this$0);
    }
}
