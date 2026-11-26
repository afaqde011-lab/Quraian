package com.revenuecat.purchases.blockstore;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import u00.k;
import xf.e;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0 implements e {
    private final k function;

    public BlockstoreHelper$sam$com_google_android_gms_tasks_OnSuccessListener$0(k function) {
        m.e(function, "function");
        this.function = function;
    }

    public final void onSuccess(Object obj) {
        this.function.invoke(obj);
    }
}
