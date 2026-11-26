package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import g00.b0;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;", "cacheStatus", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker$CacheStatus;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1 extends n implements u00.n {
    final k $onError;
    final Date $startTime;
    final OfferingsManager this$0;

    public OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1(OfferingsManager offeringsManager, Date date, k kVar) {
        super(2);
        this.this$0 = offeringsManager;
        this.$startTime = date;
        this.$onError = kVar;
    }

    @Override
    public Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, (DiagnosticsTracker.CacheStatus) obj2);
        return b0.a;
    }

    public final void invoke(PurchasesError error, DiagnosticsTracker.CacheStatus cacheStatus) {
        m.e(error, "error");
        m.e(cacheStatus, "cacheStatus");
        this.this$0.trackGetOfferingsResultIfNeeded(this.$startTime, cacheStatus, error, null, null);
        k kVar = this.$onError;
        if (kVar != null) {
            kVar.invoke(error);
        }
    }
}
