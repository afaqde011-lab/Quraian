package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.paywalls.events.PaywallStoredEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import u00.k;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public class EventsManager$Companion$paywalls$1 extends j implements k {
    public static final EventsManager$Companion$paywalls$1 INSTANCE = new EventsManager$Companion$paywalls$1();

    public EventsManager$Companion$paywalls$1() {
        super(1, PaywallStoredEvent.class, "toString", "toString()Ljava/lang/String;", 0);
    }

    @Override
    public final String invoke(PaywallStoredEvent p0) {
        m.e(p0, "p0");
        return p0.toString();
    }
}
