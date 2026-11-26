package uw;

import a10.h0;
import g00.m;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import ri.t1;

public final class e extends h0 {
    public static Long X(String str, String str2) {
        Object objS;
        try {
            objS = Long.valueOf(((Instant) DateTimeFormatter.ofPattern(str2).parse(str, new d())).toEpochMilli());
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        if (objS instanceof m) {
            objS = null;
        }
        return (Long) objS;
    }
}
