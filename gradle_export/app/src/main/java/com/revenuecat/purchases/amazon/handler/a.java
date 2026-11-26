package com.revenuecat.purchases.amazon.handler;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.RequestId;

public final class a implements Runnable {
    public final int A;
    public final RequestId B;
    public final PurchasingListener C;

    public a(PurchasingListener purchasingListener, RequestId requestId, int i) {
        this.A = i;
        this.C = purchasingListener;
        this.B = requestId;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                ProductDataHandler.addTimeoutToProductDataRequest$lambda$12((ProductDataHandler) this.C, this.B);
                break;
            default:
                UserDataHandler.addTimeoutToUserDataRequest$lambda$8((UserDataHandler) this.C, this.B);
                break;
        }
    }
}
