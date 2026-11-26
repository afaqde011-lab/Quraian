package com.revenuecat.purchases;

import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CoroutinesExtensionsKt$awaitLogOut$2$2 extends n implements k {
    final k00.c<CustomerInfo> $continuation;

    public CoroutinesExtensionsKt$awaitLogOut$2$2(k00.c<? super CustomerInfo> cVar) {
        super(1);
        this.$continuation = cVar;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return b0.a;
    }

    public final void invoke(CustomerInfo it) {
        m.e(it, "it");
        this.$continuation.resumeWith(it);
    }
}
