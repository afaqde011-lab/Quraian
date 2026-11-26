package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.interfaces.GetStorefrontCallback;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PurchasesOrchestrator$getStorefrontCountryCode$2$2 extends n implements k {
    final GetStorefrontCallback $callback;

    public PurchasesOrchestrator$getStorefrontCountryCode$2$2(GetStorefrontCallback getStorefrontCallback) {
        super(1);
        this.$callback = getStorefrontCallback;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return b0.a;
    }

    public final void invoke(PurchasesError error) {
        m.e(error, "error");
        LogUtilsKt.errorLog(error);
        this.$callback.onError(error);
    }
}
