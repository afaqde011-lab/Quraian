package com.revenuecat.purchases.common.events;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/common/events/BackendStoredEvent;", "jsonString", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class EventsManager$Companion$backendEvents$2 extends n implements k {
    public static final EventsManager$Companion$backendEvents$2 INSTANCE = new EventsManager$Companion$backendEvents$2();

    public EventsManager$Companion$backendEvents$2() {
        super(1);
    }

    @Override
    public final BackendStoredEvent invoke(String jsonString) {
        m.e(jsonString, "jsonString");
        return (BackendStoredEvent) EventsManager.json.b(jsonString, BackendStoredEvent.INSTANCE.serializer());
    }
}
