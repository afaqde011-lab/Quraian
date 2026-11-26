package com.revenuecat.purchases.common.caching;

import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2 extends n implements a {
    final DeviceCache this$0;

    public DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2(DeviceCache deviceCache) {
        super(0);
        this.this$0 = deviceCache;
    }

    @Override
    public final String invoke() {
        return this.this$0.getApiKeyPrefix() + ".productEntitlementMappingLastUpdated";
    }
}
