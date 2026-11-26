package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import g00.b0;
import h00.d0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "deviceIdentifiers", "Lg00/b0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class SubscriberAttributesManager$setAttributionID$setAttributes$1 extends n implements k {
    final String $appUserID;
    final SubscriberAttributeKey.AttributionIds $attributionKey;
    final String $value;
    final SubscriberAttributesManager this$0;

    public SubscriberAttributesManager$setAttributionID$setAttributes$1(SubscriberAttributeKey.AttributionIds attributionIds, String str, SubscriberAttributesManager subscriberAttributesManager, String str2) {
        super(1);
        this.$attributionKey = attributionIds;
        this.$value = str;
        this.this$0 = subscriberAttributesManager;
        this.$appUserID = str2;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((Map<String, String>) obj);
        return b0.a;
    }

    public final void invoke(Map<String, String> deviceIdentifiers) {
        m.e(deviceIdentifiers, "deviceIdentifiers");
        this.this$0.setAttributes(d0.U(d0.Q(new g00.k(this.$attributionKey.getBackendKey(), this.$value)), deviceIdentifiers), this.$appUserID);
    }
}
