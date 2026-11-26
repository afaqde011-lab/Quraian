package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import u00.k;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public class EventsManager$Companion$paywalls$2 extends j implements k {
    public EventsManager$Companion$paywalls$2(Object obj) {
        super(1, 0, PaywallStoredEvent.Companion.class, obj, "fromString", "fromString(Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/events/PaywallStoredEvent;");
    }

    @Override
    public final PaywallStoredEvent invoke(String p0) {
        m.e(p0, "p0");
        return ((PaywallStoredEvent.Companion) this.receiver).fromString(p0);
    }
}
