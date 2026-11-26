package ca;

import android.os.Looper;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import ri.t1;

public abstract class t {

    public f40.c f3090a;

    public k00.i f3091b;

    public Executor f3092c;

    public z f3093d;

    public p f3094e;

    public g f3095f;

    public boolean f3097h;

    public final l9.f0 f3096g = new l9.f0(new av.k(0, this, t.class, "onClosed", "onClosed()V", 0, 3));

    public final ThreadLocal f3098i = new ThreadLocal();

    public final LinkedHashMap f3099j = new LinkedHashMap();

    public boolean f3100k = true;

    public final void a() {
        if (this.f3097h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        na.a aVarL = h().L();
        if (!aVarL.g()) {
            t1.J(new a1.a0(g(), (k00.c) null, 6));
        }
        if (aVarL.Y()) {
            aVarL.H();
        } else {
            aVarL.k();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h00.d0.P(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(k00.f.D((a10.d) entry.getKey()), entry.getValue());
        }
        return h00.x.A;
    }

    public abstract g d();

    public ba.y e() throws g00.j {
        throw new g00.j();
    }

    public final void f() {
        h().L().P();
        if (l()) {
            return;
        }
        g gVarG = g();
        gVarG.f3039b.e(gVarG.f3042e, gVarG.f3043f);
    }

    public final g g() {
        g gVar = this.f3095f;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.m.k("internalTracker");
        throw null;
    }

    public final na.c h() {
        p pVar = this.f3094e;
        if (pVar == null) {
            kotlin.jvm.internal.m.k("connectionManager");
            throw null;
        }
        na.c cVar = (na.c) pVar.f3071h;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public Set i() {
        return h00.q.r1(new ArrayList(h00.r.q0(h00.z.A, 10)));
    }

    public LinkedHashMap j() {
        int iP = h00.d0.P(h00.r.q0(h00.z.A, 10));
        if (iP < 16) {
            iP = 16;
        }
        return new LinkedHashMap(iP);
    }

    public final boolean k() {
        p pVar = this.f3094e;
        if (pVar != null) {
            return ((na.c) pVar.f3071h) != null;
        }
        kotlin.jvm.internal.m.k("connectionManager");
        throw null;
    }

    public final boolean l() {
        return n() && h().L().g();
    }

    public final void m(ma.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "connection");
        g gVarG = g();
        l0 l0Var = gVarG.f3039b;
        l0Var.getClass();
        ma.c cVarK0 = aVar.k0("PRAGMA query_only");
        try {
            cVarK0.d0();
            boolean zC = cVarK0.C();
            v.s(cVarK0, null);
            if (!zC) {
                a10.h0.v(aVar, "PRAGMA temp_store = MEMORY");
                a10.h0.v(aVar, "PRAGMA recursive_triggers = 1");
                a10.h0.v(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (l0Var.f3056d) {
                    a10.h0.v(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    a10.h0.v(aVar, r30.r.v0("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", RuntimeVersion.SUFFIX));
                }
                k kVar = l0Var.f3060h;
                ReentrantLock reentrantLock = kVar.f3047a;
                reentrantLock.lock();
                try {
                    kVar.f3050d = true;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            synchronized (gVarG.f3044g) {
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                v.s(cVarK0, th3);
                throw th4;
            }
        }
    }

    public final boolean n() {
        p pVar = this.f3094e;
        if (pVar == null) {
            kotlin.jvm.internal.m.k("connectionManager");
            throw null;
        }
        na.a aVar = (na.a) pVar.f3072i;
        if (aVar != null) {
            return aVar.isOpen();
        }
        return false;
    }

    public final Object o(u00.a aVar) {
        if (!k()) {
            return rd.a.M(this, false, true, new q(0, aVar));
        }
        b();
        try {
            Object objInvoke = aVar.invoke();
            p();
            return objInvoke;
        } finally {
            f();
        }
    }

    public final void p() {
        h().L().E();
    }

    public final Object q(boolean z10, u00.n nVar, m00.c cVar) {
        p pVar = this.f3094e;
        if (pVar != null) {
            return ((ea.b) pVar.f3070g).j(z10, nVar, cVar);
        }
        kotlin.jvm.internal.m.k("connectionManager");
        throw null;
    }
}
