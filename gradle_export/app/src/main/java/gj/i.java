package gj;

import a40.c0;
import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k00.j;
import kotlin.jvm.internal.m;

public final class i {

    public static final t5.d f6353b = va.a.U("fire-global");

    public static final t5.d f6354c = va.a.U("fire-count");

    public static final t5.d f6355d = new t5.d("last-used-date");

    public final yi.b f6356a;

    public i(Context context, String str) {
        this.f6356a = new yi.b(context, a1.b.o("FirebaseHeartBeat", str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            yi.b bVar = this.f6356a;
            bVar.getClass();
            for (Map.Entry entry : ((Map) c0.C(j.A, new l6.d(bVar, null, 24))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((t5.d) entry.getKey()).f14357a, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f6356a.a(new h(jCurrentTimeMillis, 0));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized String b(long j9) {
        return new Date(j9).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized t5.d c(t5.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return va.a.i0(((t5.d) entry.getKey()).f14357a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(t5.b bVar, String str) {
        try {
            t5.d dVarC = c(bVar, str);
            if (dVarC == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) a.a.E(bVar, dVarC, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                bVar.d(dVarC);
            } else {
                bVar.f(dVarC, hashSet);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean e(t5.d dVar, long j9) {
        j jVar;
        long jLongValue;
        yi.b bVar = this.f6356a;
        bVar.getClass();
        m.e(dVar, "key");
        rm.c cVar = new rm.c(bVar, dVar, (k00.c) null, 29);
        jVar = j.A;
        jLongValue = ((Long) c0.C(jVar, cVar)).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j9))) {
            return false;
        }
        yi.b bVar2 = this.f6356a;
        Long lValueOf = Long.valueOf(j9);
        bVar2.getClass();
        return true;
    }
}
