package com.revenuecat.purchases;

public final class a implements Runnable {
    public final int A;
    public final Object B;

    public a(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override
    public final void run() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((u00.a) obj).invoke();
                break;
            case 1:
                ((u00.a) obj).invoke();
                break;
            case 2:
                ((u00.a) obj).invoke();
                break;
            case 3:
                ((u00.a) obj).invoke();
                break;
            default:
                PurchasesFactory.LowPriorityThreadFactory.newThread$lambda$1((Runnable) obj);
                break;
        }
    }
}
