package no;

import a40.c0;
import a40.m0;
import a40.w1;
import a40.z;
import ab.a0;
import android.content.Context;
import android.os.SystemClock;
import android.provider.Settings;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import ri.t1;
import vn.s;

public final class d {
    public final Context a;
    public final s b;
    public final au.a c;
    public final z d;
    public final DateTimeFormatter e;
    public String f;
    public h g;
    public float h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;

    public d(Context context, s sVar, au.a aVar) {
        w1 w1VarE = c0.e();
        h40.e eVar = m0.a;
        f40.c cVarC = c0.c(rd.a.P(w1VarE, h40.d.C));
        this.a = context;
        this.b = sVar;
        this.c = aVar;
        this.d = cVarC;
        this.e = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSxxx");
        this.h = 1.0f;
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new c(this, null, 0), 31);
    }

    public static void b(d dVar, ho.l lVar, long j, ho.o oVar, Long l, int i, int i2) {
        int i3;
        h hVar;
        Long lValueOf;
        Object objS;
        long j2 = j;
        ho.o oVar2 = (i2 & 4) != 0 ? null : oVar;
        Long l2 = (i2 & 8) != 0 ? null : l;
        if ((i2 & 16) != 0) {
            long jA = a0.A(dVar.e(), 0L, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS);
            dVar.m = 0L;
            dVar.l = SystemClock.elapsedRealtime();
            i3 = (int) jA;
        } else {
            i3 = i;
        }
        boolean z = (i2 & 32) == 0;
        String str = dVar.f;
        if (str == null || (hVar = dVar.g) == null) {
            return;
        }
        if (z && i3 == 0) {
            return;
        }
        dVar.i = j2;
        OffsetDateTime offsetDateTimeNow = OffsetDateTime.now();
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        int i4 = hVar.a;
        long j3 = 0;
        int i5 = hVar.b;
        String str2 = hVar.c;
        if (j2 < 0) {
            j2 = 0;
        }
        if (l2 != null) {
            long jLongValue = l2.longValue();
            if (jLongValue >= 0) {
                j3 = jLongValue;
            }
            lValueOf = Long.valueOf(j3);
        } else {
            lValueOf = null;
        }
        int iF = w00.a.F(dVar.h * 100);
        boolean z2 = !((Boolean) dVar.c.c.getValue()).booleanValue();
        int totalSeconds = offsetDateTimeNow.getOffset().getTotalSeconds() / 60;
        String str3 = offsetDateTimeNow.format(dVar.e);
        kotlin.jvm.internal.m.d(str3, "format(...)");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Context context = dVar.a;
        kotlin.jvm.internal.m.e(context, "context");
        try {
            objS = Integer.valueOf(Settings.Global.getInt(context.getContentResolver(), "boot_count"));
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        if (objS instanceof g00.m) {
            objS = -1;
        }
        ta.c0.M(dVar.d, (k00.i) null, (u00.n) null, (u00.k) null, new g6.a(dVar, new ho.k(string, str, i4, i5, str2, lVar, j2, lValueOf, i3, iF, z2, totalSeconds, str3, oVar2, jElapsedRealtime, ((Number) objS).intValue()), (k00.c) null, 19), 31);
    }

    public final void a(ho.l lVar, long j) {
        if (this.f == null) {
            return;
        }
        b(this, lVar, j, null, null, 0, 60);
        d();
        this.m = 0L;
        this.f = null;
        this.j = false;
        c();
    }

    public final void c() {
        this.n = SystemClock.elapsedRealtime();
        ta.c0.M(this.d, (k00.i) null, (u00.n) null, (u00.k) null, new c(this, null, 1), 31);
    }

    public final void d() {
        long jE = e();
        if (jE > HTTPTimeoutManager.DEFAULT_TIMEOUT_MS) {
            jE = 30000;
        }
        this.m = jE;
        this.k = false;
        this.l = SystemClock.elapsedRealtime();
    }

    public final long e() {
        long jG = 0;
        if (this.k) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.l;
            jG = w00.a.G((jElapsedRealtime >= 0 ? jElapsedRealtime : 0L) * this.h);
        }
        return this.m + jG;
    }

    public final void f(h hVar, ho.o source, long j, float f) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.f != null) {
            b(this, ho.l.PROGRESS, this.i, null, null, 0, 28);
        }
        this.f = UUID.randomUUID().toString();
        this.g = hVar;
        this.h = f;
        this.j = false;
        this.m = 0L;
        this.l = SystemClock.elapsedRealtime();
        b(this, ho.l.PLAY_START, j, source, null, 0, 56);
    }
}
