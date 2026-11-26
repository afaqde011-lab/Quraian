package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.strings.PurchaseStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class PurchasesOrchestrator$startProductChange$$inlined$log$1 extends n implements u00.a {
    final GoogleReplacementMode $googleReplacementMode$inlined;
    final LogIntent $intent;
    final String $oldProductId$inlined;
    final PresentedOfferingContext $presentedOfferingContext$inlined;
    final PurchasingData $purchasingData$inlined;

    public PurchasesOrchestrator$startProductChange$$inlined$log$1(LogIntent logIntent, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, String str, GoogleReplacementMode googleReplacementMode) {
        super(0);
        this.$intent = logIntent;
        this.$purchasingData$inlined = purchasingData;
        this.$presentedOfferingContext$inlined = presentedOfferingContext;
        this.$oldProductId$inlined = str;
        this.$googleReplacementMode$inlined = googleReplacementMode;
    }

    @Override
    public final String invoke() {
        String offeringIdentifier;
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        StringBuilder sb2 = new StringBuilder(" ");
        sb2.append(this.$purchasingData$inlined);
        sb2.append(' ');
        PresentedOfferingContext presentedOfferingContext = this.$presentedOfferingContext$inlined;
        sb2.append((presentedOfferingContext == null || (offeringIdentifier = presentedOfferingContext.getOfferingIdentifier()) == null) ? null : PurchaseStrings.OFFERING.concat(offeringIdentifier));
        sb2.append(" oldProductId: ");
        sb2.append(this.$oldProductId$inlined);
        sb2.append(" googleReplacementMode ");
        sb2.append(this.$googleReplacementMode$inlined);
        return a1.b.r(new Object[]{sb2.toString()}, 1, PurchaseStrings.PRODUCT_CHANGE_STARTED, sb);
    }
}
