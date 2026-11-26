package com.revenuecat.purchases;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.ConfigureStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchasesFactory$createPurchases$lambda$8$$inlined$log$3 extends n implements u00.a {
    final AppConfig $appConfig$inlined;
    final LogIntent $intent;

    public PurchasesFactory$createPurchases$lambda$8$$inlined$log$3(LogIntent logIntent, AppConfig appConfig) {
        super(0);
        this.$intent = logIntent;
        this.$appConfig$inlined = appConfig;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return a1.b.r(new Object[]{this.$appConfig$inlined.getPackageName()}, 1, ConfigureStrings.PACKAGE_NAME, sb);
    }
}
