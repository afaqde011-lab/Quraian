package com.revenuecat.purchases.common.events;

import ce.c;
import g00.b0;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import q3.e0;
import q40.h;
import u00.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq40/h;", "Lg00/b0;", "invoke", "(Lq40/h;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class EventsManager$Companion$json$1 extends n implements k {
    public static final EventsManager$Companion$json$1 INSTANCE = new EventsManager$Companion$json$1();

    public EventsManager$Companion$json$1() {
        super(1);
    }

    @Override
    public Object invoke(Object obj) {
        invoke((h) obj);
        return b0.a;
    }

    public final void invoke(h Json) {
        m.e(Json, "$this$Json");
        c cVar = new c(14);
        kotlin.jvm.internal.b0 b0Var = a0.a;
        e0 e0Var = new e0(b0Var.b(BackendStoredEvent.class));
        e0Var.t(b0Var.b(BackendStoredEvent.CustomerCenter.class), BackendStoredEvent.CustomerCenter.INSTANCE.serializer());
        e0Var.t(b0Var.b(BackendStoredEvent.Paywalls.class), BackendStoredEvent.Paywalls.INSTANCE.serializer());
        e0Var.t(b0Var.b(BackendStoredEvent.Ad.class), BackendStoredEvent.Ad.INSTANCE.serializer());
        e0Var.t(b0Var.b(BackendStoredEvent.CustomPaywall.class), BackendStoredEvent.CustomPaywall.INSTANCE.serializer());
        e0Var.h(cVar);
        Json.d = new c((HashMap) cVar.B, (HashMap) cVar.C, (HashMap) cVar.D, (HashMap) cVar.E, (HashMap) cVar.F);
        Json.a = false;
    }
}
