package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import g00.b0;
import java.util.List;
import k00.f;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import u00.k;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public class CoroutinesExtensionsCommonKt$awaitGetProducts$2$1 extends j implements k {
    public CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(Object obj) {
        super(1, 1, f.class, obj, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V");
    }

    @Override
    public Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return b0.a;
    }

    public final void invoke(List<? extends StoreProduct> p0) {
        m.e(p0, "p0");
        ((k00.c) this.receiver).resumeWith(p0);
    }
}
