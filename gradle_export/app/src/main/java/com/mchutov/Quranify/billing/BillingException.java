package com.mchutov.quranify.billing;

import com.revenuecat.purchases.PurchasesError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/mchutov/quranify/billing/BillingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BillingException extends Exception {
    public final PurchasesError A;

    public BillingException(PurchasesError purchasesError) {
        super(purchasesError.getMessage());
        this.A = purchasesError;
    }
}
