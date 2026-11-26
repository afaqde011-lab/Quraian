package com.revenuecat.purchases;

import android.os.Handler;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.models.BillingFeature;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import qd.h;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$Companion$canMakePayments$2$1", "Lqd/c;", "Lqd/h;", "billingResult", "Lg00/b0;", "onBillingSetupFinished", "(Lqd/h;)V", "onBillingServiceDisconnected", "()V", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1 implements qd.c {
    final qd.a $billingClient;
    final Callback<Boolean> $callback;
    final List<BillingFeature> $features;
    final AtomicBoolean $hasResponded;
    final Handler $mainHandler;

    public PurchasesOrchestrator$Companion$canMakePayments$2$1(Handler r1, AtomicBoolean r2, Callback<Boolean> r3, qd.a r4, List<? extends BillingFeature> r5) {
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1.<init>(android.os.Handler, java.util.concurrent.atomic.AtomicBoolean, com.revenuecat.purchases.interfaces.Callback, qd.a, java.util.List):void");
    }

    public static void a(AtomicBoolean r0, h r1, Callback r2, qd.a r3, List r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1.a(java.util.concurrent.atomic.AtomicBoolean, qd.h, com.revenuecat.purchases.interfaces.Callback, qd.a, java.util.List):void");
    }

    public static void b(qd.a r0, AtomicBoolean r1, Callback r2) {
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1.b(qd.a, java.util.concurrent.atomic.AtomicBoolean, com.revenuecat.purchases.interfaces.Callback):void");
    }

    private static final void onBillingServiceDisconnected$lambda$6(qd.a r7, AtomicBoolean r8, Callback r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingServiceDisconnected$lambda$6(qd.a, java.util.concurrent.atomic.AtomicBoolean, com.revenuecat.purchases.interfaces.Callback):void");
    }

    private static final void onBillingSetupFinished$lambda$3(AtomicBoolean r4, h r5, Callback r6, qd.a r7, List r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingSetupFinished$lambda$3(java.util.concurrent.atomic.AtomicBoolean, qd.h, com.revenuecat.purchases.interfaces.Callback, qd.a, java.util.List):void");
    }

    public void onBillingServiceDisconnected() {
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingServiceDisconnected():void");
    }

    public void onBillingSetupFinished(h r9) {
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingSetupFinished(qd.h):void");
    }
}
