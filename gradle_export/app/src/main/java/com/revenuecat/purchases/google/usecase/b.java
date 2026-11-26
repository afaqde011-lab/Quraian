package com.revenuecat.purchases.google.usecase;

import java.util.concurrent.atomic.AtomicBoolean;
import qd.h;

public final class b {

    public final AtomicBoolean f5318a;

    public final GetBillingConfigUseCase f5319b;

    public b(AtomicBoolean atomicBoolean, GetBillingConfigUseCase getBillingConfigUseCase) {
        this.f5318a = atomicBoolean;
        this.f5319b = getBillingConfigUseCase;
    }

    public final void a(h hVar, qd.d dVar) {
        GetBillingConfigUseCase.AnonymousClass1.invoke$lambda$1(this.f5318a, this.f5319b, hVar, dVar);
    }
}
