package com.revenuecat.purchases;

import com.revenuecat.purchases.common.caching.LocalTransactionMetadata;
import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import com.revenuecat.purchases.utils.Result;
import g00.b0;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "it", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1 extends n implements k {
    final k $onError;
    final k $onSuccess;
    final ConcurrentLinkedQueue<Result<CustomerInfo, PurchasesError>> $results;
    final List<LocalTransactionMetadata> $transactionMetadataToSync;
    final PostReceiptHelper this$0;

    public PostReceiptHelper$postRemainingCachedTransactionMetadata$1$1(ConcurrentLinkedQueue<Result<CustomerInfo, PurchasesError>> concurrentLinkedQueue, PostReceiptHelper postReceiptHelper, List<LocalTransactionMetadata> list, k kVar, k kVar2) {
        super(1);
        this.$results = concurrentLinkedQueue;
        this.this$0 = postReceiptHelper;
        this.$transactionMetadataToSync = list;
        this.$onError = kVar;
        this.$onSuccess = kVar2;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((PostReceiptResponse) obj);
        return b0.a;
    }

    public final void invoke(PostReceiptResponse it) {
        m.e(it, "it");
        this.$results.add(new Result.Success(it.getCustomerInfo()));
        this.this$0.callTransactionMetadataCompletionFromResults(this.$transactionMetadataToSync, this.$results, this.$onError, this.$onSuccess);
    }
}
