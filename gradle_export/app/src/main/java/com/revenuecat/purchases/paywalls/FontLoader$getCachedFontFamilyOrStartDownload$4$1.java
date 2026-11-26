package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.z;
import u00.k;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class FontLoader$getCachedFontFamilyOrStartDownload$4$1 extends n implements k {
    final z $cachedFontFamily;

    public FontLoader$getCachedFontFamilyOrStartDownload$4$1(z zVar) {
        super(1);
        this.$cachedFontFamily = zVar;
    }

    @Override
    public final Boolean invoke(Map.Entry<DownloadableFontInfo, String> it) {
        m.e(it, "it");
        return Boolean.valueOf(m.a(it.getValue(), ((DownloadedFontFamily) this.$cachedFontFamily.A).getFamily()));
    }
}
