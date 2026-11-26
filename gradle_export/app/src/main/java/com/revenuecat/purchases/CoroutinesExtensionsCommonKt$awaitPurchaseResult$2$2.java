package com.revenuecat.purchases;

import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import ri.t1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "", "userCancelled", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$2 extends n implements u00.n {
    final k00.c<g00.n> $continuation;

    public CoroutinesExtensionsCommonKt$awaitPurchaseResult$2$2(k00.c<? super g00.n> cVar) {
        super(2);
        this.$continuation = cVar;
    }

    @Override
    public Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return b0.a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z) {
        m.e(purchasesError, "purchasesError");
        this.$continuation.resumeWith(new g00.n(t1.s(new PurchasesTransactionException(purchasesError, z))));
    }
}
