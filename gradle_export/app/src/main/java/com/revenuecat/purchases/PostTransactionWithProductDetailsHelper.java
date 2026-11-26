package com.revenuecat.purchases;

import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.StoreTransaction;
import h00.q;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import u00.n;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0083\u0001\u0010\u001a\u001a\u00020\u00142\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\"\b\u0002\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u00152\"\b\u0002\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012j\u0004\u0018\u0001`\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/PostReceiptHelper;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transactions", "", "allowSharingPlayStoreAccount", "", "appUserID", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "sdkOriginated", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lg00/b0;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "transactionPostSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "transactionPostError", "postTransactions", "(Ljava/util/List;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;ZLu00/n;Lu00/n;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PostTransactionWithProductDetailsHelper {
    private final BillingAbstract billing;
    private final PostReceiptHelper postReceiptHelper;

    public PostTransactionWithProductDetailsHelper(BillingAbstract billing, PostReceiptHelper postReceiptHelper) {
        m.e(billing, "billing");
        m.e(postReceiptHelper, "postReceiptHelper");
        this.billing = billing;
        this.postReceiptHelper = postReceiptHelper;
    }

    public static void postTransactions$default(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, List list, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z2, n nVar, n nVar2, int i, Object obj) {
        if ((i & 32) != 0) {
            nVar = null;
        }
        if ((i & 64) != 0) {
            nVar2 = null;
        }
        postTransactionWithProductDetailsHelper.postTransactions(list, z, str, postReceiptInitiationSource, z2, nVar, nVar2);
    }

    public final void postTransactions(List<StoreTransaction> transactions, boolean allowSharingPlayStoreAccount, String appUserID, PostReceiptInitiationSource initiationSource, boolean sdkOriginated, n transactionPostSuccess, n transactionPostError) {
        m.e(transactions, "transactions");
        String appUserID2 = appUserID;
        m.e(appUserID2, "appUserID");
        PostReceiptInitiationSource initiationSource2 = initiationSource;
        m.e(initiationSource2, "initiationSource");
        for (StoreTransaction storeTransaction : transactions) {
            BillingAbstract billingAbstract = this.billing;
            ProductType type = storeTransaction.getType();
            Set<String> setR1 = q.r1(storeTransaction.getProductIds());
            PostTransactionWithProductDetailsHelper$postTransactions$1$1 postTransactionWithProductDetailsHelper$postTransactions$1$1 = new PostTransactionWithProductDetailsHelper$postTransactions$1$1(storeTransaction, this, allowSharingPlayStoreAccount, appUserID2, initiationSource2, sdkOriginated, transactionPostSuccess, transactionPostError);
            appUserID2 = appUserID;
            initiationSource2 = initiationSource;
            billingAbstract.queryProductDetailsAsync(type, setR1, postTransactionWithProductDetailsHelper$postTransactions$1$1, new PostTransactionWithProductDetailsHelper$postTransactions$1$2(this, storeTransaction, allowSharingPlayStoreAccount, appUserID2, initiationSource2, sdkOriginated, transactionPostSuccess, transactionPostError));
        }
    }
}
