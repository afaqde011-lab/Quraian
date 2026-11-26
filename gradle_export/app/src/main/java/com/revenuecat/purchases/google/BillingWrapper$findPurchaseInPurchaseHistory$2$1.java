package com.revenuecat.purchases.google;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import g00.b0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchasesList", "Lg00/b0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BillingWrapper$findPurchaseInPurchaseHistory$2$1 extends n implements k {
    final k $onCompletion;
    final k $onError;
    final String $productId;

    public BillingWrapper$findPurchaseInPurchaseHistory$2$1(k kVar, String str, k kVar2) {
        super(1);
        this.$onCompletion = kVar;
        this.$productId = str;
        this.$onError = kVar2;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((List<StoreTransaction>) obj);
        return b0.a;
    }

    public final void invoke(List<StoreTransaction> purchasesList) {
        Object next;
        m.e(purchasesList, "purchasesList");
        String str = this.$productId;
        Iterator<T> it = purchasesList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((StoreTransaction) next).getProductIds().contains(str));
        StoreTransaction storeTransaction = (StoreTransaction) next;
        if (storeTransaction != null) {
            this.$onCompletion.invoke(storeTransaction);
            return;
        }
        this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1))));
    }
}
