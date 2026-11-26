package wj;

import android.util.Log;
import androidx.datastore.core.DataStore;
import com.google.android.gms.internal.measurement.g4;
import com.google.protobuf.RuntimeVersion;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class x0 {

    public final zj.j f16216a;

    public final p0 f16217b;

    public final m0 f16218c;

    public final b1 f16219d;

    public final DataStore f16220e;

    public final a0 f16221f;

    public final k00.i f16222g;

    public f0 f16223h;

    public boolean f16224i;

    public String f16225j;

    public x0(zj.j jVar, p0 p0Var, m0 m0Var, b1 b1Var, DataStore dataStore, a0 a0Var, k00.i iVar) {
        kotlin.jvm.internal.m.e(jVar, "sessionsSettings");
        kotlin.jvm.internal.m.e(p0Var, "sessionGenerator");
        kotlin.jvm.internal.m.e(m0Var, "sessionFirelogPublisher");
        kotlin.jvm.internal.m.e(b1Var, "timeProvider");
        kotlin.jvm.internal.m.e(dataStore, "sessionDataStore");
        kotlin.jvm.internal.m.e(a0Var, "processDataManager");
        kotlin.jvm.internal.m.e(iVar, "backgroundDispatcher");
        this.f16216a = jVar;
        this.f16217b = p0Var;
        this.f16218c = m0Var;
        this.f16219d = b1Var;
        this.f16220e = dataStore;
        this.f16221f = a0Var;
        this.f16222g = iVar;
        u0 u0Var = u0.A;
        this.f16225j = RuntimeVersion.SUFFIX;
        a40.c0.y(a40.c0.c(iVar), (k00.i) null, (a40.a0) null, new t0(this, null, 0), 3);
    }

    public static final Object a(x0 x0Var, String str, u0 u0Var, k00.c cVar) throws NoWhenBranchMatchedException {
        w0 w0Var;
        String str2;
        x0Var.getClass();
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i10 = w0Var.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                w0Var.E = i10 - Integer.MIN_VALUE;
            } else {
                w0Var = new w0(x0Var, cVar);
            }
        } else {
            w0Var = new w0(x0Var, cVar);
        }
        Object objB = w0Var.C;
        l00.a aVar = l00.a.A;
        int i11 = w0Var.E;
        if (i11 == 0) {
            t1.O(objB);
            if (kotlin.jvm.internal.m.a(x0Var.f16225j, str)) {
                return g00.b0.a;
            }
            x0Var.f16225j = str;
            xj.c cVar2 = xj.c.f16578a;
            w0Var.A = str;
            w0Var.B = u0Var;
            w0Var.E = 1;
            objB = cVar2.b(w0Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u0Var = w0Var.B;
            str = w0Var.A;
            t1.O(objB);
        }
        for (oi.j jVar : ((Map) objB).values()) {
            xj.e eVar = new xj.e(str);
            jVar.getClass();
            String str3 = "App Quality Sessions session changed: " + eVar;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
            oi.i iVar = jVar.f12007b;
            synchronized (iVar) {
                if (!Objects.equals(iVar.f12005c, str)) {
                    oi.i.a(iVar.f12003a, iVar.f12004b, str);
                    iVar.f12005c = str;
                }
            }
            int iOrdinal = u0Var.ordinal();
            if (iOrdinal == 0) {
                str2 = "Notified " + xj.d.A + " of new session " + str;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "Notified " + xj.d.A + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return g00.b0.a;
    }

    public final void b() {
        this.f16224i = false;
        if (this.f16223h == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f16221f.a());
        a40.c0.y(a40.c0.c(this.f16222g), (k00.i) null, (a40.a0) null, new t0(this, null, 1), 3);
    }

    public final boolean c(f0 f0Var) {
        Map map = f0Var.f16152c;
        boolean z10 = true;
        a0 a0Var = this.f16221f;
        if (map == null) {
            Log.d("FirebaseSessions", "No process data for " + a0Var.a());
            return true;
        }
        a0Var.getClass();
        y yVar = (y) map.get(a0Var.a());
        if (yVar != null && yVar.f16226a == a0Var.f16110c && kotlin.jvm.internal.m.a(yVar.f16227b, (String) a0Var.f16111d.getValue())) {
            z10 = false;
        }
        if (z10) {
            Log.d("FirebaseSessions", "Process " + a0Var.a() + " is stale");
        }
        return z10;
    }

    public final boolean d(f0 f0Var) {
        s30.b bVarB;
        long jB0;
        a1 a1Var = f0Var.f16151b;
        j0 j0Var = f0Var.f16150a;
        if (a1Var == null) {
            Log.d("FirebaseSessions", "Session " + j0Var.f16180a + " has not backgrounded yet");
            return false;
        }
        a1 a1VarA = this.f16219d.a();
        s30.a aVar = s30.b.B;
        long jC0 = g4.c0(a1VarA.f16114a - a1Var.f16114a, s30.d.D);
        zj.j jVar = this.f16216a;
        s30.b bVarB2 = jVar.f17520a.b();
        if (bVarB2 != null) {
            jB0 = bVarB2.A;
            if (jB0 <= 0 || s30.b.g(jB0)) {
                bVarB = jVar.f17521b.b();
                if (bVarB != null) {
                    jB0 = bVarB.A;
                    if (jB0 > 0 || s30.b.g(jB0)) {
                        jB0 = g4.b0(30, s30.d.F);
                    }
                } else {
                    jB0 = g4.b0(30, s30.d.F);
                }
            }
        } else {
            bVarB = jVar.f17521b.b();
            if (bVarB != null) {
                jB0 = bVarB.A;
                if (jB0 > 0) {
                    jB0 = g4.b0(30, s30.d.F);
                } else {
                    jB0 = g4.b0(30, s30.d.F);
                }
            } else {
                jB0 = g4.b0(30, s30.d.F);
            }
        }
        boolean z10 = s30.b.c(jC0, jB0) > 0;
        if (z10) {
            Log.d("FirebaseSessions", "Session " + j0Var.f16180a + " is expired");
        }
        return z10;
    }
}
