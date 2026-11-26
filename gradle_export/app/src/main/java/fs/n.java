package fs;

import a10.h0;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneId;

public final class n extends h0 {
    public static rs.f X(gs.i from) {
        kotlin.jvm.internal.m.e(from, "from");
        String str = from.a;
        long j = from.b;
        long j2 = from.c;
        int i = from.d;
        long j3 = from.e;
        DayOfWeek dayOfWeek = Instant.ofEpochSecond(j).atZone(ZoneId.systemDefault()).getDayOfWeek();
        kotlin.jvm.internal.m.d(dayOfWeek, "getDayOfWeek(...)");
        return new rs.f(str, j, j2, i, j3, dayOfWeek);
    }
}
