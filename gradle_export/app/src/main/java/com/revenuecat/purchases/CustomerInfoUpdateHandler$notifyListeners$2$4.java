package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CustomerInfoUpdateHandler$notifyListeners$2$4 extends n implements u00.a {
    final CustomerInfo $customerInfo;
    final UpdatedCustomerInfoListener $listener;

    public CustomerInfoUpdateHandler$notifyListeners$2$4(UpdatedCustomerInfoListener updatedCustomerInfoListener, CustomerInfo customerInfo) {
        super(0);
        this.$listener = updatedCustomerInfoListener;
        this.$customerInfo = customerInfo;
    }

    @Override
    public Object invoke() {
        m20invoke();
        return b0.a;
    }

    public final void m20invoke() {
        this.$listener.onReceived(this.$customerInfo);
    }
}
