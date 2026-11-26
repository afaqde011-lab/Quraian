package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PostTransactionWithProductDetailsHelper$postTransactions$1$2 extends n implements k {
    final boolean $allowSharingPlayStoreAccount;
    final String $appUserID;
    final PostReceiptInitiationSource $initiationSource;
    final boolean $sdkOriginated;
    final StoreTransaction $transaction;
    final u00.n $transactionPostError;
    final u00.n $transactionPostSuccess;
    final PostTransactionWithProductDetailsHelper this$0;

    public PostTransactionWithProductDetailsHelper$postTransactions$1$2(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, StoreTransaction storeTransaction, boolean z, String str, PostReceiptInitiationSource postReceiptInitiationSource, boolean z2, u00.n nVar, u00.n nVar2) {
        super(1);
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$transaction = storeTransaction;
        this.$allowSharingPlayStoreAccount = z;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$sdkOriginated = z2;
        this.$transactionPostSuccess = nVar;
        this.$transactionPostError = nVar2;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return b0.a;
    }

    public final void invoke(PurchasesError it) {
        m.e(it, "it");
        this.this$0.postReceiptHelper.postTransactionAndConsumeIfNeeded(this.$transaction, null, null, this.$allowSharingPlayStoreAccount, this.$appUserID, this.$initiationSource, this.$sdkOriginated, this.$transactionPostSuccess, this.$transactionPostError);
    }
}
