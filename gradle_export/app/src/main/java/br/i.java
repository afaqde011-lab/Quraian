package br;

import a40.c0;
import a40.m0;
import a40.q;
import a40.u1;
import a40.w1;
import a40.z;
import ab.a0;
import android.os.SystemClock;
import androidx.datastore.core.DataStore;
import b1.w;
import com.mchutov.quranify.ListeningTimerModel;
import d40.o;
import d40.p1;
import g00.b0;
import g00.n;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.m;
import ri.t1;

public final class i {
    public final DataStore a;
    public final z b;
    public final Object c;
    public String d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public int i;
    public u1 j;
    public final q k;
    public final p1 l;

    public i(DataStore dataStore) {
        w1 w1VarE = c0.e();
        h40.e eVar = m0.a;
        f40.c cVarC = c0.c(rd.a.P(w1VarE, h40.d.C));
        this.a = dataStore;
        this.b = cVarC;
        this.c = new Object();
        LocalDate localDateNow = LocalDate.now();
        m.d(localDateNow, "now(...)");
        this.d = f50.c.z(localDateNow);
        this.g = -1L;
        this.k = c0.b();
        this.l = o.c(0);
        c0.y(cVarC, null, null, new a(this, null, 0), 3);
    }

    public static final Object a(i iVar, m00.c cVar) throws Throwable {
        d dVar;
        Object obj;
        int i;
        long j;
        String str;
        int i2;
        Object objS;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i3 = dVar.F;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.F = i3 - Integer.MIN_VALUE;
            } else {
                dVar = new d(iVar, cVar);
            }
        } else {
            dVar = new d(iVar, cVar);
        }
        d dVar2 = dVar;
        Object objUpdateData = dVar2.D;
        l00.a aVar = l00.a.A;
        int i4 = dVar2.F;
        if (i4 == 0) {
            t1.O(objUpdateData);
            q qVar = iVar.k;
            dVar2.F = 1;
            if (qVar.p(dVar2) != aVar) {
            }
            return aVar;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = dVar2.C;
            j = dVar2.B;
            str = dVar2.A;
            try {
                t1.O(objUpdateData);
                objS = (ListeningTimerModel) objUpdateData;
            } catch (Throwable th) {
                th = th;
                objS = t1.s(th);
            }
            if (n.a(objS) != null) {
                synchronized (iVar.c) {
                    if (m.a(iVar.d, str) && i2 == iVar.i) {
                        iVar.f += j;
                    }
                }
            }
            return b0.a;
        }
        t1.O(objUpdateData);
        Object obj2 = iVar.c;
        synchronized (obj2) {
            try {
                long j2 = iVar.f;
                iVar.f = 0L;
                obj = obj2;
                try {
                    String str2 = iVar.d;
                    Long l = new Long(j2);
                    Integer num = new Integer(iVar.i);
                    long jLongValue = l.longValue();
                    int iIntValue = num.intValue();
                    if (jLongValue <= 0) {
                        return b0.a;
                    }
                    try {
                        DataStore dataStore = iVar.a;
                        i = iIntValue;
                        j = jLongValue;
                        try {
                            w wVar = new w(str2, iVar, j, i, (k00.c) null);
                            dVar2.A = str2;
                            dVar2.B = j;
                            dVar2.C = i;
                            dVar2.F = 2;
                            objUpdateData = dataStore.updateData(wVar, dVar2);
                            if (objUpdateData != aVar) {
                                str = str2;
                                i2 = i;
                                objS = (ListeningTimerModel) objUpdateData;
                                if (n.a(objS) != null) {
                                    synchronized (iVar.c) {
                                        if (m.a(iVar.d, str)) {
                                            iVar.f += j;
                                        }
                                    }
                                }
                                return b0.a;
                            }
                            return aVar;
                        } catch (Throwable th2) {
                            th = th2;
                            int i5 = i;
                            str = str2;
                            i2 = i5;
                            objS = t1.s(th);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i = iIntValue;
                        j = jLongValue;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    public static final java.lang.Object b(br.i r5, java.lang.String r6, long r7, m00.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: br.i.b(br.i, java.lang.String, long, m00.c):java.lang.Object");
    }

    public static final Object c(i iVar, m00.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i = gVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.C = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(iVar, cVar);
            }
        } else {
            gVar = new g(iVar, cVar);
        }
        Object objS = gVar.A;
        l00.a aVar = l00.a.A;
        int i2 = gVar.C;
        if (i2 == 0) {
            t1.O(objS);
            d40.i data = iVar.a.getData();
            gVar.C = 1;
            objS = o.s(data, gVar);
            if (objS == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objS);
        }
        ListeningTimerModel listeningTimerModel = (ListeningTimerModel) objS;
        synchronized (iVar.c) {
            iVar.g();
            if (m.a(listeningTimerModel.getTodaysDate(), iVar.d) && !iVar.h) {
                iVar.e += a0.A(listeningTimerModel.getOverallPassedMs() > 0 ? listeningTimerModel.getOverallPassedMs() : listeningTimerModel.getOverallPassedSeconds() * 1000, 0L, 86400000L);
            }
        }
        return b0.a;
    }

    public final java.lang.Object d(m00.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: br.i.d(m00.c):java.lang.Object");
    }

    public final long e() {
        long jA;
        synchronized (this.c) {
            g();
            long j = this.e;
            long j2 = this.g;
            long j3 = 0;
            if (j2 != -1) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
                if (jElapsedRealtime >= 0) {
                    j3 = jElapsedRealtime;
                }
            }
            jA = a0.A((j3 + j) / 1000, 0L, 86400L);
        }
        return jA;
    }

    public final void f() {
        p1 p1Var;
        Object value;
        do {
            p1Var = this.l;
            value = p1Var.getValue();
        } while (!p1Var.i(value, Integer.valueOf(((Number) value).intValue() + 1)));
    }

    public final void g() {
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.systemDefault());
        LocalDate localDate = zonedDateTimeNow.toLocalDate();
        m.d(localDate, "toLocalDate(...)");
        String strZ = f50.c.z(localDate);
        if (strZ.equals(this.d)) {
            return;
        }
        this.d = strZ;
        this.e = 0L;
        this.f = 0L;
        this.h = false;
        this.i++;
        if (this.g != -1) {
            long epochMilli = zonedDateTimeNow.toInstant().toEpochMilli() - zonedDateTimeNow.toLocalDate().atStartOfDay(zonedDateTimeNow.getZone()).toInstant().toEpochMilli();
            this.g = Math.max(this.g, SystemClock.elapsedRealtime() - (epochMilli >= 0 ? epochMilli : 0L));
        }
    }

    public final void h(String str, Long l) {
        if (l == null) {
            return;
        }
        long jA = a0.A(l.longValue(), 0L, 86400000L);
        synchronized (this.c) {
            g();
            if (str.equals(this.d)) {
                if (this.h && jA == this.e) {
                    return;
                }
                if (this.g != -1) {
                    this.g = SystemClock.elapsedRealtime();
                }
                this.e = jA;
                this.f = 0L;
                this.h = true;
                this.i++;
                f();
                c0.y(this.b, null, null, new h(this, str, jA, (k00.c) null), 3);
            }
        }
    }

    public final void i() {
        synchronized (this.c) {
            try {
                g();
                long j = this.g;
                if (j == -1) {
                    return;
                }
                long j2 = 0;
                if (j != -1) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                    if (jElapsedRealtime >= 0) {
                        j2 = jElapsedRealtime;
                    }
                }
                this.e += j2;
                this.f += j2;
                this.g = -1L;
                u1 u1Var = this.j;
                k00.c cVar = null;
                if (u1Var != null) {
                    u1Var.i(null);
                }
                this.j = null;
                f();
                c0.y(this.b, null, null, new a(this, cVar, 1), 3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
