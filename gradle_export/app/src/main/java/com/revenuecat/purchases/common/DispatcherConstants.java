package com.revenuecat.purchases.common;

import com.google.android.gms.internal.measurement.g4;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import kotlin.Metadata;
import s30.a;
import s30.b;
import s30.d;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/DispatcherConstants;", "", "<init>", "()V", "Ls30/b;", "jitterDelay", "J", "getJitterDelay-UwyO8pc", "()J", "jitterLongDelay", "getJitterLongDelay-UwyO8pc", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DispatcherConstants {
    public static final DispatcherConstants INSTANCE = new DispatcherConstants();
    private static final long jitterDelay;
    private static final long jitterLongDelay;

    static {
        a aVar = b.B;
        d dVar = d.MILLISECONDS;
        jitterDelay = g4.c0(HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, dVar);
        jitterLongDelay = g4.c0(10000L, dVar);
    }

    private DispatcherConstants() {
    }

    public final long m111getJitterDelayUwyO8pc() {
        return jitterDelay;
    }

    public final long m112getJitterLongDelayUwyO8pc() {
        return jitterLongDelay;
    }
}
