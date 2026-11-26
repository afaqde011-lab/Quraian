package com.revenuecat.purchases.google.attribution;

import a1.b;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.AttributionStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2 extends n implements a {
    final GooglePlayServicesNotAvailableException $e$inlined;
    final LogIntent $intent;

    public GoogleDeviceIdentifiersFetcher$getAdvertisingID$$inlined$log$2(LogIntent logIntent, GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException) {
        super(0);
        this.$intent = logIntent;
        this.$e$inlined = googlePlayServicesNotAvailableException;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return b.r(new Object[]{this.$e$inlined.getLocalizedMessage()}, 1, AttributionStrings.GOOGLE_PLAY_SERVICES_NOT_INSTALLED_FETCHING_ADVERTISING_IDENTIFIER, sb);
    }
}
