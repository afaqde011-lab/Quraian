package com.revenuecat.purchases.common;

import com.google.android.gms.internal.measurement.g4;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import s30.a;
import s30.b;
import s30.d;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Ls30/a;", "Ljava/util/Date;", "startTime", "endTime", "Ls30/b;", "between", "(Ls30/a;Ljava/util/Date;Ljava/util/Date;)J", "duration1", "duration2", "min-QTBD994", "(JJ)J", "min", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DurationExtensionsKt {
    public static final long between(a aVar, Date startTime, Date endTime) {
        m.e(aVar, "<this>");
        m.e(startTime, "startTime");
        m.e(endTime, "endTime");
        return g4.c0(endTime.getTime() - startTime.getTime(), d.MILLISECONDS);
    }

    public static final long m113minQTBD994(long j, long j2) {
        return b.c(j, j2) < 0 ? j : j2;
    }
}
