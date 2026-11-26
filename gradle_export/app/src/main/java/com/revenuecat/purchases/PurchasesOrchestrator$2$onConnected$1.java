package com.revenuecat.purchases;

import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.strings.BillingStrings;
import g00.b0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "countryCode", "Lg00/b0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PurchasesOrchestrator$2$onConnected$1 extends n implements k {
    final PurchasesOrchestrator this$0;

    public PurchasesOrchestrator$2$onConnected$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(1);
        this.this$0 = purchasesOrchestrator;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((String) obj);
        return b0.a;
    }

    public final void invoke(String countryCode) {
        m.e(countryCode, "countryCode");
        this.this$0.storefrontCountryCode = countryCode;
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), String.format(BillingStrings.BILLING_COUNTRY_CODE, Arrays.copyOf(new Object[]{countryCode}, 1)));
        }
    }
}
