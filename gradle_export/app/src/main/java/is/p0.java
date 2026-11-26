package is;

import android.content.Context;
import android.os.SystemClock;
import android.provider.Settings;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class p0 {
    public final Context a;
    public final ms.b b;
    public final fs.k c;

    public p0(Context context, ms.b bVar, fs.k kVar, fs.e eVar) {
        this.a = context;
        this.b = bVar;
        this.c = kVar;
    }

    public final Object a(int i, m00.c cVar) {
        n0 n0Var;
        fs.k kVar;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i2 = n0Var.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n0Var.D = i2 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objD = n0Var.B;
        l00.a aVar = l00.a.A;
        int i3 = n0Var.D;
        if (i3 == 0) {
            t1.O(objD);
            String id = ZoneId.systemDefault().getId();
            kotlin.jvm.internal.m.d(id, "getId(...)");
            String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
            if (string == null) {
                string = "";
            }
            int iY = ab.a0.y(i, 1, RCHTTPStatusCodes.BAD_REQUEST);
            fs.k kVar2 = this.c;
            n0Var.A = kVar2;
            n0Var.D = 1;
            objD = this.b.d(id, string, iY, n0Var);
            if (objD == aVar) {
                return aVar;
            }
            kVar = kVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = n0Var.A;
            t1.O(objD);
        }
        return kVar.X((hs.t) objD);
    }

    public final Object b(List list, m00.c cVar) {
        o0 o0Var;
        Object objS;
        Long l;
        Integer numValueOf;
        kh.n vVar;
        Integer accepted;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i = o0Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0Var.C = i - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        Object objC = o0Var.A;
        l00.a aVar = l00.a.A;
        int i2 = o0Var.C;
        int i3 = 0;
        if (i2 == 0) {
            t1.O(objC);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                objS = Integer.valueOf(Settings.Global.getInt(this.a.getContentResolver(), "boot_count"));
            } catch (Throwable th) {
                objS = t1.s(th);
            }
            int i4 = -1;
            if (objS instanceof g00.m) {
                objS = -1;
            }
            int iIntValue = ((Number) objS).intValue();
            String str = OffsetDateTime.now().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
            kotlin.jvm.internal.m.d(str, "format(...)");
            List<ss.d> listJ1 = h00.q.j1(list, 100);
            ArrayList arrayList = new ArrayList(h00.r.q0(listJ1, 10));
            for (ss.d dVar : listJ1) {
                Long l2 = dVar.getFields().l;
                Integer num = dVar.getFields().m;
                if (l2 == null || !(num == null || num.intValue() == i4 || iIntValue == i4 || num.intValue() == iIntValue)) {
                    l = null;
                } else {
                    long jLongValue = jElapsedRealtime - l2.longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    if (0 > jLongValue || jLongValue >= 2592000001L) {
                        l = null;
                    } else {
                        l = lValueOf;
                    }
                }
                ss.e fields = dVar.getFields();
                String str2 = fields.h;
                String str3 = (str2 == null || r30.k.L0(str2)) ? null : str2;
                int iY = ab.a0.y(fields.e, i3, 30000);
                if (str3 != null) {
                    Integer num2 = fields.i;
                    numValueOf = num2 != null ? Integer.valueOf(ab.a0.y(num2.intValue(), i3, 1000)) : null;
                } else {
                    numValueOf = null;
                }
                String eventId = fields.a;
                String sessionId = fields.b;
                long j = fields.c;
                long j2 = jElapsedRealtime;
                long j3 = fields.d;
                int i5 = fields.f;
                String occurredAt = fields.g;
                int i6 = iIntValue;
                kotlin.jvm.internal.m.e(eventId, "eventId");
                kotlin.jvm.internal.m.e(sessionId, "sessionId");
                kotlin.jvm.internal.m.e(occurredAt, "occurredAt");
                String str4 = dVar.getType().A;
                int iOrdinal = dVar.getType().ordinal();
                if (iOrdinal == 0) {
                    vVar = new hs.v(eventId, sessionId, j, str4, j3, iY, i5, occurredAt, str3, numValueOf, l);
                } else if (iOrdinal == 1) {
                    vVar = new hs.u(eventId, sessionId, j, str4, j3, iY, i5, occurredAt, str3, numValueOf, l);
                } else if (iOrdinal == 2) {
                    vVar = new hs.y(eventId, sessionId, j, str4, j3, iY, i5, occurredAt, str3, numValueOf, l);
                } else if (iOrdinal == 3) {
                    vVar = new hs.x(eventId, sessionId, j, str4, j3, iY, i5, occurredAt, str3, numValueOf, l);
                } else if (iOrdinal == 4) {
                    vVar = new hs.b0(eventId, sessionId, j, str4, j3, iY, i5, occurredAt, str3, numValueOf, l);
                } else {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vVar = new hs.a(eventId, sessionId, j, str4, j3, iY, i5, occurredAt, str3, numValueOf, l);
                }
                arrayList.add(vVar);
                jElapsedRealtime = j2;
                iIntValue = i6;
                i4 = -1;
                i3 = 0;
            }
            hs.e eVar = new hs.e(str, arrayList);
            o0Var.C = 1;
            objC = this.b.c(eVar, o0Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objC);
        }
        hs.d dVar2 = (hs.d) objC;
        return new ss.g((dVar2 == null || (accepted = dVar2.getAccepted()) == null) ? 0 : accepted.intValue());
    }
}
