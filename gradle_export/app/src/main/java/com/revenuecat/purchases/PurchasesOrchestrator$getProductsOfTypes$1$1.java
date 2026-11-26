package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import g00.b0;
import h00.q;
import java.util.Date;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Lg00/b0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PurchasesOrchestrator$getProductsOfTypes$1$1 extends n implements k {
    final GetStoreProductsCallback $callback;
    final List<StoreProduct> $collectedStoreProducts;
    final Date $nonNullStartTime;
    final Set<String> $productIds;
    final Set<ProductType> $typesRemaining;
    final PurchasesOrchestrator this$0;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements u00.a {
        final GetStoreProductsCallback $callback;
        final List<StoreProduct> $collectedStoreProducts;
        final Date $nonNullStartTime;
        final Set<String> $productIds;
        final List<StoreProduct> $storeProducts;
        final Set<ProductType> $typesRemaining;
        final PurchasesOrchestrator this$0;

        public AnonymousClass1(PurchasesOrchestrator purchasesOrchestrator, Set<String> set, Set<ProductType> set2, List<? extends StoreProduct> list, List<? extends StoreProduct> list2, Date date, GetStoreProductsCallback getStoreProductsCallback) {
            super(0);
            this.this$0 = purchasesOrchestrator;
            this.$productIds = set;
            this.$typesRemaining = set2;
            this.$collectedStoreProducts = list;
            this.$storeProducts = list2;
            this.$nonNullStartTime = date;
            this.$callback = getStoreProductsCallback;
        }

        @Override
        public Object invoke() {
            m40invoke();
            return b0.a;
        }

        public final void m40invoke() {
            this.this$0.getProductsOfTypes(this.$productIds, this.$typesRemaining, q.Y0(this.$storeProducts, this.$collectedStoreProducts), this.$nonNullStartTime, this.$callback);
        }
    }

    public PurchasesOrchestrator$getProductsOfTypes$1$1(PurchasesOrchestrator purchasesOrchestrator, Set<String> set, Set<ProductType> set2, List<? extends StoreProduct> list, Date date, GetStoreProductsCallback getStoreProductsCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$productIds = set;
        this.$typesRemaining = set2;
        this.$collectedStoreProducts = list;
        this.$nonNullStartTime = date;
        this.$callback = getStoreProductsCallback;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return b0.a;
    }

    public final void invoke(List<? extends StoreProduct> storeProducts) {
        m.e(storeProducts, "storeProducts");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        purchasesOrchestrator.dispatch(new AnonymousClass1(purchasesOrchestrator, this.$productIds, this.$typesRemaining, this.$collectedStoreProducts, storeProducts, this.$nonNullStartTime, this.$callback));
    }
}
