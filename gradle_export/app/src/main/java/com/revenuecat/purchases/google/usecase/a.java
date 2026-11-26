package com.revenuecat.purchases.google.usecase;

import java.util.List;
import qd.h;
import qd.q;
import qd.t;
import qd.x;

public final class a implements q, t {
    public final BillingClientUseCase A;

    public a(BillingClientUseCase billingClientUseCase) {
        this.A = billingClientUseCase;
    }

    public void a(h hVar, List list) {
        QueryPurchasesByTypeUseCase.AnonymousClass1.invoke$lambda$1$lambda$0((QueryPurchasesByTypeUseCase) this.A, hVar, list);
    }

    public void b(h hVar, x xVar) {
        BillingClientUseCase.processResult$default((QueryProductDetailsUseCase) this.A, hVar, xVar, null, null, 12, null);
    }

    public void c(h hVar) {
        AcknowledgePurchaseUseCase.AnonymousClass1.invoke$lambda$0((AcknowledgePurchaseUseCase) this.A, hVar);
    }

    public void d(h hVar, String str) {
        ConsumePurchaseUseCase.AnonymousClass1.invoke$lambda$0((ConsumePurchaseUseCase) this.A, hVar, str);
    }
}
