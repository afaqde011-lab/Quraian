package com.revenuecat.purchases.blockstore;

import u00.k;
import xf.d;
import xf.e;

public final class a implements e, d {
    public final g00.e A;

    public a(g00.e eVar) {
        this.A = eVar;
    }

    public void onFailure(Exception exc) {
        BlockstoreHelper.C00861.invokeSuspend$lambda$2((u00.a) this.A, exc);
    }

    public void onSuccess(Object obj) {
        ((k) this.A).invoke(obj);
    }
}
