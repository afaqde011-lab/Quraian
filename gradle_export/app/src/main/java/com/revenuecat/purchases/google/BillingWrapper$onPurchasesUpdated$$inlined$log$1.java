package com.revenuecat.purchases.google;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.BillingStrings;
import h00.q;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import qd.h;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class BillingWrapper$onPurchasesUpdated$$inlined$log$1 extends n implements u00.a {
    final h $billingResult$inlined;
    final LogIntent $intent;
    final List $notNullPurchasesList$inlined;

    public BillingWrapper$onPurchasesUpdated$$inlined$log$1(LogIntent logIntent, h hVar, List list) {
        super(0);
        this.$intent = logIntent;
        this.$billingResult$inlined = hVar;
        this.$notNullPurchasesList$inlined = list;
    }

    @Override
    public final String invoke() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        String str2 = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(this.$billingResult$inlined)}, 1));
        List list = this.$notNullPurchasesList$inlined;
        if (list.isEmpty()) {
            list = null;
        }
        List list2 = list;
        if (list2 != null) {
            str = " Purchases:" + q.R0(list2, ", ", null, null, BillingWrapper$onPurchasesUpdated$2$2$1.INSTANCE, 30);
            if (str == null) {
                str = " No purchases received";
            }
        } else {
            str = " No purchases received";
        }
        sb.append(str2.concat(str));
        return sb.toString();
    }
}
