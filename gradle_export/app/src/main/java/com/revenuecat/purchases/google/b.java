package com.revenuecat.purchases.google;

public final class b implements Runnable {
    public final int A;
    public final BillingWrapper B;

    public b(BillingWrapper billingWrapper, int i) {
        this.A = i;
        this.B = billingWrapper;
    }

    @Override
    public final void run() {
        int i = this.A;
        BillingWrapper billingWrapper = this.B;
        switch (i) {
            case 0:
                BillingWrapper.endConnection$lambda$13(billingWrapper);
                break;
            default:
                billingWrapper.startConnection();
                break;
        }
    }
}
