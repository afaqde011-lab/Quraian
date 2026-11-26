package za;

import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public abstract class j0 {

    public boolean f17383a;

    public UUID f17384b;

    public hb.p f17385c;

    public final Set f17386d;

    public j0(Class cls) {
        kotlin.jvm.internal.m.e(cls, "workerClass");
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.m.d(uuidRandomUUID, "randomUUID(...)");
        this.f17384b = uuidRandomUUID;
        String string = this.f17384b.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        this.f17385c = new hb.p(string, (g0) null, cls.getName(), (String) null, (g) null, (g) null, 0L, 0L, 0L, (e) null, 0, (a) null, 0L, 0L, 0L, 0L, false, (c0) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(h00.d0.P(1));
        h00.n.T0(strArr, linkedHashSet);
        this.f17386d = linkedHashSet;
    }

    public final j0 a(String str) {
        kotlin.jvm.internal.m.e(str, "tag");
        this.f17386d.add(str);
        return d();
    }

    public final k0 b() {
        k0 k0VarC = c();
        e eVar = this.f17385c.f7013j;
        boolean z10 = eVar.b() || eVar.f17360e || eVar.f17358c || eVar.f17359d;
        hb.p pVar = this.f17385c;
        if (pVar.f7018q) {
            if (z10) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.f7010g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        String str = pVar.f7025x;
        if (str == null) {
            List listW0 = r30.k.W0(pVar.f7006c, new String[]{"."}, 6);
            String strH1 = listW0.size() == 1 ? (String) listW0.get(0) : (String) h00.q.T0(listW0);
            if (strH1.length() > 127) {
                strH1 = r30.k.h1(127, strH1);
            }
            pVar.f7025x = strH1;
        } else if (str.length() > 127) {
            this.f17385c.f7025x = r30.k.h1(127, str);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.m.d(uuidRandomUUID, "randomUUID(...)");
        f(uuidRandomUUID);
        return k0VarC;
    }

    public abstract k0 c();

    public abstract j0 d();

    public final j0 e(a aVar, long j9, TimeUnit timeUnit) {
        kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
        this.f17383a = true;
        hb.p pVar = this.f17385c;
        pVar.l = aVar;
        long millis = timeUnit.toMillis(j9);
        String str = hb.p.f7003z;
        if (millis > 18000000) {
            v.d().g(str, "Backoff delay duration exceeds maximum value");
        }
        if (millis < NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS) {
            v.d().g(str, "Backoff delay duration less than minimum value");
        }
        pVar.m = ab.a0.A(millis, NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, 18000000L);
        return d();
    }

    public final j0 f(UUID uuid) {
        this.f17384b = uuid;
        String string = uuid.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        hb.p pVar = this.f17385c;
        kotlin.jvm.internal.m.e(pVar, "other");
        this.f17385c = new hb.p(string, pVar.f7005b, pVar.f7006c, pVar.f7007d, new g(pVar.f7008e), new g(pVar.f7009f), pVar.f7010g, pVar.f7011h, pVar.f7012i, new e(pVar.f7013j), pVar.f7014k, pVar.l, pVar.m, pVar.f7015n, pVar.f7016o, pVar.f7017p, pVar.f7018q, pVar.f7019r, pVar.f7020s, pVar.f7022u, pVar.f7023v, pVar.f7024w, pVar.f7025x, pVar.f7026y, 524288);
        return d();
    }

    public final j0 g(long j9, TimeUnit timeUnit) {
        kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
        this.f17385c.f7010g = timeUnit.toMillis(j9);
        if (Long.MAX_VALUE - System.currentTimeMillis() > this.f17385c.f7010g) {
            return d();
        }
        throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
    }

    public final j0 h(g gVar) {
        kotlin.jvm.internal.m.e(gVar, "inputData");
        this.f17385c.f7008e = gVar;
        return d();
    }
}
