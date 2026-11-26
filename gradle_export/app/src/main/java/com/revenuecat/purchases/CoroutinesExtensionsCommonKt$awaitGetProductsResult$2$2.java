package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import g00.b0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Lg00/b0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2 extends n implements k {
    final k00.c<g00.n> $continuation;

    public CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2(k00.c<? super g00.n> cVar) {
        super(1);
        this.$continuation = cVar;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return b0.a;
    }

    public final void invoke(List<? extends StoreProduct> storeProducts) {
        m.e(storeProducts, "storeProducts");
        this.$continuation.resumeWith(new g00.n(storeProducts));
    }
}
