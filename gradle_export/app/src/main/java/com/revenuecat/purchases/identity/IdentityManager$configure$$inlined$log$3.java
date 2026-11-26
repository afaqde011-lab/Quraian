package com.revenuecat.purchases.identity;

import a1.b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.IdentityStrings;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.a;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/revenuecat/purchases/common/LogWrapperKt$log$fullMessageBuilder$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class IdentityManager$configure$$inlined$log$3 extends n implements a {
    final String $appUserIDToUse$inlined;
    final LogIntent $intent;

    public IdentityManager$configure$$inlined$log$3(LogIntent logIntent, String str) {
        super(0);
        this.$intent = logIntent;
        this.$appUserIDToUse$inlined = str;
    }

    @Override
    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append(q.R0(this.$intent.getEmojiList(), "", null, null, null, 62));
        sb.append(' ');
        return b.r(new Object[]{this.$appUserIDToUse$inlined}, 1, IdentityStrings.IDENTIFYING_APP_USER_ID, sb);
    }
}
