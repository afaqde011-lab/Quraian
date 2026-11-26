package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.models.StoreProduct;
import g00.b0;
import h00.d0;
import h00.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "inAppProducts", "Lg00/b0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class OfferingsFactory$getStoreProductsById$1$1$1 extends n implements k {
    final k $onCompleted;
    final Map<String, List<StoreProduct>> $productsById;
    final OfferingsFactory this$0;

    public OfferingsFactory$getStoreProductsById$1$1$1(OfferingsFactory offeringsFactory, Map<String, List<StoreProduct>> map, k kVar) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$productsById = map;
        this.$onCompleted = kVar;
    }

    public static final void invoke$lambda$1(Map map, List list, k kVar) {
        ArrayList arrayList = new ArrayList(r.q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StoreProduct storeProduct = (StoreProduct) it.next();
            arrayList.add(new g00.k(storeProduct.getPurchasingData().getProductId(), va.a.R(storeProduct)));
        }
        d0.X(map, arrayList);
        kVar.invoke(map);
    }

    @Override
    public Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return b0.a;
    }

    public final void invoke(final List<? extends StoreProduct> inAppProducts) {
        m.e(inAppProducts, "inAppProducts");
        Dispatcher dispatcher = this.this$0.dispatcher;
        final Map<String, List<StoreProduct>> map = this.$productsById;
        final k kVar = this.$onCompleted;
        Dispatcher.enqueue$default(dispatcher, new Runnable() {
            @Override
            public final void run() {
                OfferingsFactory$getStoreProductsById$1$1$1.invoke$lambda$1(map, inAppProducts, kVar);
            }
        }, null, 2, null);
    }
}
