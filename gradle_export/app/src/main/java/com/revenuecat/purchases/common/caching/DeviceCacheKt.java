package com.revenuecat.purchases.common.caching;

import com.google.android.gms.internal.measurement.g4;
import kotlin.Metadata;
import l40.a;
import p40.b1;
import s30.b;
import s30.d;
import ta.c0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ls30/b;", "PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD", "J", "", "SHARED_PREFERENCES_PREFIX", "Ljava/lang/String;", "Ll40/a;", "", "Lcom/revenuecat/purchases/common/caching/TokenCacheEntry;", "tokenMapSerializer", "Ll40/a;", "", "CUSTOMER_INFO_SCHEMA_VERSION", "I", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DeviceCacheKt {
    public static final int CUSTOMER_INFO_SCHEMA_VERSION = 3;
    private static final long PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD;
    private static final String SHARED_PREFERENCES_PREFIX = "com.revenuecat.purchases.";
    private static final a tokenMapSerializer;

    static {
        s30.a aVar = b.B;
        PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD = g4.b0(25, d.HOURS);
        tokenMapSerializer = c0.c(b1.a, TokenCacheEntry.INSTANCE.serializer());
    }
}
