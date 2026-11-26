package ns;

import a40.m0;
import a40.u1;
import a40.w1;
import ab.a0;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import androidx.media3.common.f1;
import androidx.media3.common.q0;
import androidx.media3.common.t0;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import d40.p1;
import g00.b0;
import h00.x;
import is.c0;
import is.y;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import oj.q;
import ri.t1;
import ss.r;
import ss.t;
import ss.u;
import u00.n;

public final class j {
    public final Context a;
    public final c0 b;
    public final c c;
    public final y d;
    public final wo.c0 e;
    public final au.a f;
    public final f40.c g;
    public u1 h;
    public final AtomicReference i;
    public final DateTimeFormatter j;
    public nv.a k;
    public nv.a l;
    public nv.a m;
    public f1 n;
    public String o;
    public q p;
    public long q;
    public long r;
    public int s;
    public boolean t;
    public boolean u;
    public final no.i v;

    public j(Context context, c0 c0Var, c cVar, y yVar, wo.c0 c0Var2, au.a aVar) {
        this.a = context;
        this.b = c0Var;
        this.c = cVar;
        this.d = yVar;
        this.e = c0Var2;
        this.f = aVar;
        w1 w1VarE = a40.c0.e();
        h40.e eVar = m0.a;
        this.g = a40.c0.c(rd.a.P(w1VarE, h40.d.C));
        this.i = new AtomicReference(x.A);
        this.j = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssxxx");
        this.o = "";
        this.v = new no.i(this, 1);
    }

    public static final java.lang.Object a(ns.j r7, m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: ns.j.a(ns.j, m00.c):java.lang.Object");
    }

    public static final void b(j jVar, m00.c cVar) throws Throwable {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i = gVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.C = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(jVar, cVar);
            }
        } else {
            gVar = new g(jVar, cVar);
        }
        Object obj = gVar.A;
        l00.a aVar = l00.a.A;
        int i2 = gVar.C;
        if (i2 != 0) {
            if (i2 == 1) {
                throw a1.b.t(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(obj);
        p1 p1Var = jVar.f.c;
        a1.c cVar2 = new a1.c(jVar, 15);
        gVar.C = 1;
        p1Var.collect(cVar2, gVar);
    }

    public static final java.lang.Object c(ns.j r10, m00.c r11) {
        throw new UnsupportedOperationException("Method not decompiled: ns.j.c(ns.j, m00.c):java.lang.Object");
    }

    public static q l(f1 f1Var) {
        t0 t0Var;
        Bundle bundle;
        q0 currentMediaItem = f1Var.getCurrentMediaItem();
        if (currentMediaItem == null || (t0Var = currentMediaItem.d) == null || (bundle = t0Var.I) == null) {
            return null;
        }
        long j = bundle.getLong("surahId", -1L);
        Long lValueOf = Long.valueOf(j);
        if (j < 0) {
            lValueOf = null;
        }
        int i = bundle.getInt("reciterId", -1);
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            numValueOf = null;
        }
        int i2 = bundle.getInt("surahNumber", -1);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i2 <= 0) {
            numValueOf2 = null;
        }
        q qVar = new q(lValueOf, numValueOf, numValueOf2);
        if (lValueOf == null && (numValueOf == null || numValueOf2 == null)) {
            return null;
        }
        return qVar;
    }

    public final void d(q qVar, int i, boolean z) {
        Integer num = (Integer) qVar.D;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = (Integer) qVar.E;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if (i <= 0) {
                    return;
                }
                nv.a aVar = this.l;
                zz.a aVar2 = aVar != null ? (zz.a) aVar.invoke() : null;
                nv.a aVar3 = this.m;
                rs.e eVar = new rs.e(iIntValue2, iIntValue, aVar2, aVar3 != null ? ((Number) aVar3.invoke()).floatValue() : 0.0f);
                y yVar = this.d;
                if (i <= 0) {
                    return;
                }
                ta.c0.M(yVar.m, (k00.i) null, (n) null, (u00.k) null, new is.q(yVar, i, LocalDateTime.now(), eVar, z, null), 31);
            }
        }
    }

    public final ss.d e(ss.f fVar, q qVar, long j, int i) {
        g00.k kVar;
        Object objS;
        zz.a aVar;
        String str;
        Long l = (Long) qVar.C;
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        nv.a aVar2 = this.l;
        if (aVar2 == null || (aVar = (zz.a) aVar2.invoke()) == null || (str = aVar.a) == null) {
            kVar = new g00.k(null, null);
        } else {
            if (r30.k.L0(str)) {
                str = null;
            }
            if (str == null) {
                kVar = new g00.k(null, null);
            } else {
                nv.a aVar3 = this.m;
                kVar = new g00.k(str, Integer.valueOf(a0.y((int) ((aVar3 != null ? ((Number) aVar3.invoke()).floatValue() : 0.0f) * 1000), 0, 1000)));
            }
        }
        String str2 = (String) kVar.A;
        Integer num = (Integer) kVar.B;
        String string = UUID.randomUUID().toString();
        m.d(string, "toString(...)");
        String str3 = this.o;
        int iY = a0.y(i, 0, 30000);
        int totalSeconds = OffsetDateTime.now().getOffset().getTotalSeconds() / 60;
        String str4 = OffsetDateTime.now().format(this.j);
        m.d(str4, "format(...)");
        Integer num2 = (Integer) qVar.D;
        Integer num3 = (Integer) qVar.E;
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
        try {
            objS = Integer.valueOf(Settings.Global.getInt(this.a.getContentResolver(), "boot_count"));
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        if (objS instanceof g00.m) {
            objS = -1;
        }
        ss.e eVar = new ss.e(string, str3, jLongValue, j, iY, totalSeconds, str4, str2, num, num2, num3, lValueOf, Integer.valueOf(((Number) objS).intValue()));
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return new r(eVar);
        }
        if (iOrdinal == 1) {
            return new ss.q(eVar);
        }
        if (iOrdinal == 2) {
            return new u(eVar);
        }
        if (iOrdinal == 3) {
            return new t(eVar);
        }
        if (iOrdinal == 4) {
            return new ss.y(eVar);
        }
        if (iOrdinal == 5) {
            return new ss.a(eVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ss.d f(f1 f1Var, ss.f fVar, Long l) {
        q qVarL = l(f1Var);
        if (qVarL == null) {
            qVarL = this.p;
        }
        q qVar = qVarL;
        if (qVar == null) {
            this.r = SystemClock.elapsedRealtime();
            return null;
        }
        long jLongValue = l != null ? l.longValue() : f1Var.getCurrentPosition();
        long j = jLongValue >= 0 ? jLongValue : 0L;
        this.q = j;
        int iG = g();
        if (!this.e.a.isAuthorized()) {
            d(qVar, iG, fVar != ss.f.PROGRESS);
            return null;
        }
        if (fVar == ss.f.PROGRESS && iG == 0) {
            return null;
        }
        return e(fVar, qVar, j, iG);
    }

    public final int g() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jA = this.t ? a0.A(jElapsedRealtime - this.r, 0L, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS) : 0L;
        this.r = jElapsedRealtime;
        long jA2 = a0.A(((long) this.s) + jA, 0L, HTTPTimeoutManager.DEFAULT_TIMEOUT_MS);
        this.s = 0;
        return (int) jA2;
    }

    public final void h(f1 f1Var) {
        j jVar;
        q qVarL = l(f1Var);
        if (qVarL == null) {
            return;
        }
        String str = (String) qVarL.B;
        q qVar = this.p;
        ss.d dVarE = null;
        if (m.a(str, qVar != null ? (String) qVar.B : null)) {
            return;
        }
        q qVar2 = this.p;
        long j = this.q;
        int iG = g();
        long currentPosition = f1Var.getCurrentPosition();
        long j2 = currentPosition >= 0 ? currentPosition : 0L;
        this.p = qVarL;
        this.q = j2;
        if (!this.e.a.isAuthorized()) {
            if (qVar2 != null) {
                d(qVar2, iG, false);
                return;
            }
            return;
        }
        if (qVar2 == null) {
            jVar = this;
        } else {
            q qVar3 = iG > 0 ? qVar2 : null;
            if (qVar3 != null) {
                dVarE = e(ss.f.PROGRESS, qVar3, j, iG);
                jVar = this;
            } else {
                jVar = this;
            }
        }
        jVar.k(h00.n.C0(new ss.d[]{dVarE, jVar.e(ss.f.TRACK_CHANGE, qVarL, j2, 0)}), k.A);
    }

    public final void i() {
        nv.a aVar = this.k;
        f1 f1Var = aVar != null ? (f1) aVar.invoke() : null;
        f1 f1Var2 = this.n;
        if (f1Var == f1Var2) {
            return;
        }
        no.i iVar = this.v;
        if (f1Var2 != null) {
            try {
                f1Var2.removeListener(iVar);
            } catch (Throwable th) {
                t1.s(th);
            }
        }
        this.n = f1Var;
        if (f1Var != null) {
            f1Var.addListener(iVar);
        }
    }

    public final Object j(k00.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.C = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.A;
        l00.a aVar = l00.a.A;
        int i2 = fVar.C;
        c cVar2 = this.c;
        if (i2 == 0) {
            t1.O(objJ);
            fVar.C = 1;
            h40.e eVar = m0.a;
            objJ = a40.c0.J(new d6.e(cVar2, (k00.c) null, 6), h40.d.C, fVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objJ);
        }
        if (!((Boolean) objJ).booleanValue()) {
            cVar2.b();
        }
        return b0.a;
    }

    public final void k(List list, k kVar) {
        if (list.isEmpty() && kVar == k.A) {
            return;
        }
        ta.c0.M(this.g, (k00.i) null, (n) null, (u00.k) null, new gc.n(list, kVar, this, (k00.c) null), 31);
    }
}
