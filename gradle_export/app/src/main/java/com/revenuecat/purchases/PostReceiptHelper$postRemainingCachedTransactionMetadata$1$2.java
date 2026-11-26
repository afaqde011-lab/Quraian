package com.revenuecat.purchases;

import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.caching.LocalTransactionMetadata;
import com.revenuecat.purchases.utils.Result;
import g00.b0;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import u00.k;
import u00.o;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "<anonymous parameter 1>", "Lorg/json/JSONObject;", "<anonymous parameter 2>", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2 extends n implements o {
    final k $onError;
    final k $onSuccess;
    final ConcurrentLinkedQueue<Result<CustomerInfo, PurchasesError>> $results;
    final List<LocalTransactionMetadata> $transactionMetadataToSync;
    final PostReceiptHelper this$0;

    public PostReceiptHelper$postRemainingCachedTransactionMetadata$1$2(ConcurrentLinkedQueue<Result<CustomerInfo, PurchasesError>> concurrentLinkedQueue, PostReceiptHelper postReceiptHelper, List<LocalTransactionMetadata> list, k kVar, k kVar2) {
        super(3);
        this.$results = concurrentLinkedQueue;
        this.this$0 = postReceiptHelper;
        this.$transactionMetadataToSync = list;
        this.$onError = kVar;
        this.$onSuccess = kVar2;
    }

    @Override
    public Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PurchasesError) obj, (PostReceiptErrorHandlingBehavior) obj2, (JSONObject) obj3);
        return b0.a;
    }

    public final void invoke(PurchasesError backendError, PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, JSONObject jSONObject) {
        m.e(backendError, "backendError");
        m.e(postReceiptErrorHandlingBehavior, "<anonymous parameter 1>");
        this.$results.add(new Result.Error(backendError));
        this.this$0.callTransactionMetadataCompletionFromResults(this.$transactionMetadataToSync, this.$results, this.$onError, this.$onSuccess);
    }
}
