package com.revenuecat.purchases.common.events;

import com.revenuecat.purchases.DebugEvent;
import com.revenuecat.purchases.DebugEventListener;
import g00.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/DebugEvent;", "event", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/DebugEvent;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class EventsManager$debugEventListener$callback$1$1 extends n implements k {
    final DebugEventListener $listener;

    public EventsManager$debugEventListener$callback$1$1(DebugEventListener debugEventListener) {
        super(1);
        this.$listener = debugEventListener;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((DebugEvent) obj);
        return b0.a;
    }

    public final void invoke(DebugEvent event) {
        m.e(event, "event");
        this.$listener.onDebugEventReceived(event);
    }
}
