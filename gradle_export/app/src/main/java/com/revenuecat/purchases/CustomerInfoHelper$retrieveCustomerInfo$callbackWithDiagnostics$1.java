package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.utils.Result;
import g00.b0;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoDataResult;", "customerInfoDataResult", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfoDataResult;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1 extends n implements k {
    final ReceiveCustomerInfoCallback $callback;
    final CacheFetchPolicy $fetchPolicy;
    final Date $startTime;
    final boolean $trackDiagnostics;
    final CustomerInfoHelper this$0;

    public CustomerInfoHelper$retrieveCustomerInfo$callbackWithDiagnostics$1(CustomerInfoHelper customerInfoHelper, boolean z, Date date, CacheFetchPolicy cacheFetchPolicy, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(1);
        this.this$0 = customerInfoHelper;
        this.$trackDiagnostics = z;
        this.$startTime = date;
        this.$fetchPolicy = cacheFetchPolicy;
        this.$callback = receiveCustomerInfoCallback;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((CustomerInfoDataResult) obj);
        return b0.a;
    }

    public final void invoke(CustomerInfoDataResult customerInfoDataResult) {
        m.e(customerInfoDataResult, "customerInfoDataResult");
        this.this$0.trackGetCustomerInfoResultIfNeeded(this.$trackDiagnostics, this.$startTime, customerInfoDataResult, this.$fetchPolicy);
        ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
        if (receiveCustomerInfoCallback != null) {
            Result<CustomerInfo, PurchasesError> result = customerInfoDataResult.getResult();
            if (result instanceof Result.Success) {
                receiveCustomerInfoCallback.onReceived((CustomerInfo) ((Result.Success) customerInfoDataResult.getResult()).getValue());
            } else if (result instanceof Result.Error) {
                receiveCustomerInfoCallback.onError((PurchasesError) ((Result.Error) customerInfoDataResult.getResult()).getValue());
            }
        }
    }
}
