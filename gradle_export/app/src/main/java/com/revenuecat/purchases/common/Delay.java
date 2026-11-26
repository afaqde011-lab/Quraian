package com.revenuecat.purchases.common;

import com.google.android.gms.internal.measurement.g4;
import kotlin.Metadata;
import s30.a;
import s30.b;
import s30.d;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/Delay;", "", "Ls30/b;", "minDelay", "maxDelay", "<init>", "(Ljava/lang/String;IJJ)V", "J", "getMinDelay-UwyO8pc", "()J", "getMaxDelay-UwyO8pc", "NONE", "DEFAULT", "LONG", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Delay {
    private static final Delay[] $VALUES;
    public static final Delay DEFAULT;
    public static final Delay LONG;
    public static final Delay NONE;
    private final long maxDelay;
    private final long minDelay;

    private static final Delay[] $values() {
        return new Delay[]{NONE, DEFAULT, LONG};
    }

    static {
        a aVar = b.B;
        d dVar = d.MILLISECONDS;
        NONE = new Delay("NONE", 0, g4.b0(0, dVar), g4.b0(0, dVar));
        long jB0 = g4.b0(0, dVar);
        DispatcherConstants dispatcherConstants = DispatcherConstants.INSTANCE;
        DEFAULT = new Delay("DEFAULT", 1, jB0, dispatcherConstants.m111getJitterDelayUwyO8pc());
        LONG = new Delay("LONG", 2, dispatcherConstants.m111getJitterDelayUwyO8pc(), dispatcherConstants.m112getJitterLongDelayUwyO8pc());
        $VALUES = $values();
    }

    private Delay(String str, int i, long j, long j2) {
        super(str, i);
        this.minDelay = j;
        this.maxDelay = j2;
    }

    public static Delay valueOf(String str) {
        return (Delay) Enum.valueOf(Delay.class, str);
    }

    public static Delay[] values() {
        return (Delay[]) $VALUES.clone();
    }

    public final long getMaxDelay() {
        return this.maxDelay;
    }

    public final long getMinDelay() {
        return this.minDelay;
    }
}
