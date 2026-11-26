package qy;

import a10.h0;
import g00.m;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import pm.c;
import ri.t1;

public final class a extends h0 {
    public final c f;

    public a(c cVar) {
        this.f = cVar;
    }

    public static Instant X(String str) {
        Object objS;
        Object objS2;
        Object objS3;
        try {
            objS = Instant.parse(str);
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        if (objS instanceof m) {
            objS = null;
        }
        Instant instant = (Instant) objS;
        if (instant != null) {
            return instant;
        }
        try {
            objS2 = OffsetDateTime.parse(str).toInstant();
        } catch (Throwable th2) {
            objS2 = t1.s(th2);
        }
        if (objS2 instanceof m) {
            objS2 = null;
        }
        Instant instant2 = (Instant) objS2;
        if (instant2 != null) {
            return instant2;
        }
        try {
            objS3 = LocalDateTime.parse(str).atZone(ZoneId.systemDefault()).toInstant();
        } catch (Throwable th3) {
            objS3 = t1.s(th3);
        }
        return (Instant) (objS3 instanceof m ? null : objS3);
    }
}
