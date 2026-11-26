package vn;

import a40.m0;
import a40.w1;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.SystemClock;
import android.provider.Settings;
import com.mchutov.quranify.audiostories.data.worker.AudioStoryEventsWorker;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import l60.o0;
import ri.t1;
import za.j0;

public final class s {
    public final Context a;
    public final co.a b;
    public final xn.c c;
    public final tn.g d;
    public final tn.f e;
    public final wo.c0 f;
    public final ab.y g;
    public final a40.z h;
    public final j40.c i;

    public s(Context context, co.a aVar, xn.c cVar, tn.g gVar, tn.f fVar, wo.c0 c0Var, ab.y yVar) {
        w1 w1VarE = a40.c0.e();
        h40.e eVar = m0.a;
        f40.c cVarC = a40.c0.c(rd.a.P(w1VarE, h40.d.C).plus(new q3.m(a40.w.A, 2)));
        this.a = context;
        this.b = aVar;
        this.c = cVar;
        this.d = gVar;
        this.e = fVar;
        this.f = c0Var;
        this.g = yVar;
        this.h = cVarC;
        this.i = j40.d.a();
    }

    public static final java.lang.Object a(vn.s r11, m00.c r12) {
        throw new UnsupportedOperationException("Method not decompiled: vn.s.a(vn.s, m00.c):java.lang.Object");
    }

    public final void b() {
        za.x xVar = new za.x(AudioStoryEventsWorker.class);
        za.w wVar = za.w.A;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ((j0) xVar).c.j = new za.e(new ib.f((NetworkRequest) null), za.w.B, false, false, false, false, -1L, -1L, h00.q.r1(linkedHashSet));
        za.y yVarB = xVar.e(za.a.A, 30L, TimeUnit.SECONDS).b();
        this.g.x("audio_story_events_upload", za.l.B, yVarB);
    }

    public final Enum c(List list, m00.c cVar) {
        q qVar;
        Object objS;
        Long l;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i = qVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.C = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objD = qVar.A;
        l00.a aVar = l00.a.A;
        int i2 = qVar.C;
        try {
            if (i2 == 0) {
                t1.O(objD);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Context context = this.a;
                kotlin.jvm.internal.m.e(context, "context");
                try {
                    objS = Integer.valueOf(Settings.Global.getInt(context.getContentResolver(), "boot_count"));
                } catch (Throwable th) {
                    objS = t1.s(th);
                }
                int i3 = -1;
                if (objS instanceof g00.m) {
                    objS = -1;
                }
                int iIntValue = ((Number) objS).intValue();
                String str = OffsetDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
                kotlin.jvm.internal.m.d(str, "format(...)");
                ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bo.b bVar = (bo.b) it.next();
                    Long l2 = new Long(bVar.p);
                    Integer num = new Integer(bVar.q);
                    if (num.intValue() == i3 || iIntValue == i3 || num.intValue() == iIntValue) {
                        long jLongValue = jElapsedRealtime - l2.longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        if (0 > jLongValue || jLongValue >= 2592000001L) {
                            l = null;
                        } else {
                            l = lValueOf;
                        }
                    } else {
                        l = null;
                    }
                    this.e.getClass();
                    arrayList.add(new un.f(bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g, bVar.i, bVar.h, bVar.j, bVar.k, bVar.l, bVar.m, bVar.n, l, bVar.o));
                    iIntValue = iIntValue;
                    i3 = -1;
                }
                un.g gVar = new un.g(str, arrayList);
                co.a aVar2 = this.b;
                qVar.C = 1;
                objD = aVar2.d(gVar, qVar);
                if (objD == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objD);
            }
            o0 o0Var = (o0) objD;
            if (o0Var.a.i()) {
                return d0.A;
            }
            return t.a.contains(new Integer(o0Var.a.D)) ? d0.B : d0.C;
        } catch (IOException unused) {
            return d0.C;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
