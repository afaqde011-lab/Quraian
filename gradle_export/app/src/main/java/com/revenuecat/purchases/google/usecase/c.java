package com.revenuecat.purchases.google.usecase;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import qd.h;
import qd.q;
import qd.x;

public final class c implements q {
    public final AtomicBoolean A;
    public final QueryProductDetailsUseCase B;
    public final Set C;
    public final String D;
    public final Date E;
    public final q F;

    public c(AtomicBoolean atomicBoolean, QueryProductDetailsUseCase queryProductDetailsUseCase, Set set, String str, Date date, q qVar) {
        this.A = atomicBoolean;
        this.B = queryProductDetailsUseCase;
        this.C = set;
        this.D = str;
        this.E = date;
        this.F = qVar;
    }

    @Override
    public final void b(h hVar, x xVar) {
        QueryProductDetailsUseCase.queryProductDetailsAsyncEnsuringOneResponse$lambda$14(this.A, this.B, this.C, this.D, this.E, this.F, hVar, xVar);
    }
}
