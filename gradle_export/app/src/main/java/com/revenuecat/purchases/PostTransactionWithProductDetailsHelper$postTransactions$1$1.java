package com.revenuecat.purchases;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import g00.b0;
import h00.d0;
import h00.q;
import h00.r;
import h00.v;
import h00.x;
import i00.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Lg00/b0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PostTransactionWithProductDetailsHelper$postTransactions$1$1 extends n implements k {
    final boolean $allowSharingPlayStoreAccount;
    final String $appUserID;
    final PostReceiptInitiationSource $initiationSource;
    final boolean $sdkOriginated;
    final StoreTransaction $transaction;
    final u00.n $transactionPostError;
    final u00.n $transactionPostSuccess;
    final PostTransactionWithProductDetailsHelper this$0;

    public PostTransactionWithProductDetailsHelper$postTransactions$1$1(StoreTransaction storeTransaction, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z2, u00.n nVar, u00.n nVar2) {
        super(1);
        this.$transaction = storeTransaction;
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$allowSharingPlayStoreAccount = z;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$sdkOriginated = z2;
        this.$transactionPostSuccess = nVar;
        this.$transactionPostError = nVar2;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return b0.a;
    }

    public final void invoke(List<? extends StoreProduct> storeProducts) {
        Object next;
        StoreProduct storeProduct;
        ?? arrayList;
        Object next2;
        m.e(storeProducts, "storeProducts");
        f fVarC = null;
        if (this.$transaction.getType() == ProductType.SUBS && this.$transaction.getMarketplace() == null) {
            StoreTransaction storeTransaction = this.$transaction;
            Iterator it = storeProducts.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                SubscriptionOptions subscriptionOptions = ((StoreProduct) next2).getSubscriptionOptions();
                if (subscriptionOptions != null && !subscriptionOptions.isEmpty()) {
                    Iterator<SubscriptionOption> it2 = subscriptionOptions.iterator();
                    while (it2.hasNext()) {
                        if (m.a(it2.next().getId(), storeTransaction.getSubscriptionOptionId())) {
                            break loop0;
                        }
                    }
                }
            }
            storeProduct = (StoreProduct) next2;
        } else {
            StoreTransaction storeTransaction2 = this.$transaction;
            Iterator it3 = storeProducts.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!m.a(((StoreProduct) next).getId(), q.N0(storeTransaction2.getProductIds())));
            storeProduct = (StoreProduct) next;
        }
        StoreProduct storeProduct2 = storeProduct;
        Map subscriptionOptionIdForProductIDs = this.$transaction.getSubscriptionOptionIdForProductIDs();
        if (subscriptionOptionIdForProductIDs != null) {
            ArrayList<GoogleStoreProduct> arrayList2 = new ArrayList();
            for (Object obj : storeProducts) {
                if (obj instanceof GoogleStoreProduct) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (GoogleStoreProduct googleStoreProduct : arrayList2) {
                SubscriptionOptions subscriptionOptions2 = googleStoreProduct.getSubscriptionOptions();
                if (subscriptionOptions2 != null) {
                    arrayList = new ArrayList(r.q0(subscriptionOptions2, 10));
                    for (SubscriptionOption subscriptionOption : subscriptionOptions2) {
                        arrayList.add(new g00.k(googleStoreProduct.getProductId() + '_' + subscriptionOption.getId(), subscriptionOption));
                    }
                } else {
                    arrayList = x.A;
                }
                v.u0(arrayList, arrayList3);
            }
            Map mapY = d0.Y(arrayList3);
            f fVar = new f();
            for (Map.Entry entry : subscriptionOptionIdForProductIDs.entrySet()) {
                String str = (String) entry.getKey();
                SubscriptionOption subscriptionOption2 = (SubscriptionOption) mapY.get(str + '_' + ((String) entry.getValue()));
                if (subscriptionOption2 != null) {
                    fVar.put(str, subscriptionOption2);
                }
            }
            fVarC = fVar.c();
        }
        f fVar2 = fVarC;
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Store product found for transaction: " + storeProduct2);
        }
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, storeProduct2, fVar2, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$sdkOriginated, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
