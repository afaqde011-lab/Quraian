package ab;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import androidx.credentials.playservices.HiddenActivity;
import androidx.media3.common.c1;
import androidx.media3.common.c2;
import androidx.media3.common.d1;
import androidx.media3.common.v0;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.RuntimeVersion;
import du.t0;
import fh.r1;
import fh.w1;
import gz.e1;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l1.z0;
import z4.g1;
import z4.j1;

public final class r implements na.b, e7.n, z4.r, fe.a, dk.o, xf.c, h.b, a8.h, r1, h0.g, f7.t, xf.e, xf.d, e7.m {
    public final int A;
    public final Object B;

    public r(j7.a aVar, i7.c cVar) {
        this.A = 28;
        this.B = cVar;
    }

    public r(j7.a aVar, s7.r rVar, s7.w wVar, IOException iOException, boolean z10) {
        this.A = 29;
        this.B = wVar;
    }

    public r(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public j1 B(View view, j1 j1Var) {
        c5.g gVar = (c5.g) this.B;
        ArrayList arrayList = gVar.f2883b;
        g1 g1Var = j1Var.f17202a;
        q4.b bVarB = q4.b.b(g1Var.i(519), g1Var.i(64));
        q4.b bVarB2 = q4.b.b(g1Var.j(519), g1Var.j(64));
        if (!bVarB.equals(gVar.f2884c) || !bVarB2.equals(gVar.f2885d)) {
            gVar.f2884c = bVarB;
            gVar.f2885d = bVarB2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c5.c cVar = (c5.c) arrayList.get(size);
                cVar.f2878c = bVarB;
                cVar.f2879d = bVarB2;
                cVar.c();
            }
        }
        return j1Var;
    }

    @Override
    public void a(Object obj) {
        ((u00.k) ((z0) this.B).getValue()).invoke(obj);
    }

    @Override
    public long b(long j9) {
        a8.w wVar = (a8.w) this.B;
        return e7.i0.i((j9 * ((long) wVar.f315e)) / 1000000, 0L, wVar.f320j - 1);
    }

    @Override
    public Object c(Object obj, Object obj2) {
        return fh.w.A(new l9.f0(((w1) this.B).F, obj, 27), (List) ((Collection) obj2));
    }

    @Override
    public void d(long j9, e7.u uVar) {
        int i10 = this.A;
        h9.d0 d0Var = (h9.d0) this.B;
        switch (i10) {
            case 16:
                a8.b.d(j9, uVar, d0Var.f6688c);
                break;
            default:
                a8.b.e(j9, uVar, d0Var.f6688c);
                break;
        }
    }

    @Override
    public na.c g(e7.l0 l0Var) {
        Context context = (Context) this.B;
        String str = (String) l0Var.f5150d;
        qd.j0 j0Var = (qd.j0) l0Var.f5151e;
        kotlin.jvm.internal.m.e(j0Var, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new oa.g(context, str, j0Var, true, true);
    }

    @Override
    public void h(Object obj, androidx.media3.common.r rVar) {
        ((d1) obj).l((c2) this.B, new c1(rVar));
    }

    @Override
    public Object i() {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 4:
                ee.h hVar = (ee.h) ((ee.c) obj);
                hVar.getClass();
                int i11 = ae.a.f448e;
                oj.q qVar = new oj.q(4);
                qVar.C = null;
                qVar.D = new ArrayList();
                qVar.E = null;
                qVar.B = RuntimeVersion.SUFFIX;
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseA = hVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    ae.a aVar = (ae.a) ee.h.F(sQLiteDatabaseA.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new ce.a(hVar, map, qVar, 3));
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return aVar;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            case 5:
                ee.h hVar2 = (ee.h) ((ee.d) obj);
                long jH = hVar2.B.h() - hVar2.D.f5361d;
                SQLiteDatabase sQLiteDatabaseA2 = hVar2.a();
                sQLiteDatabaseA2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jH)};
                    Cursor cursorRawQuery = sQLiteDatabaseA2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            hVar2.v(cursorRawQuery.getInt(0), ae.c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th2) {
                            cursorRawQuery.close();
                            throw th2;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseA2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseA2.setTransactionSuccessful();
                    sQLiteDatabaseA2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th3) {
                    sQLiteDatabaseA2.endTransaction();
                    throw th3;
                }
            case 6:
                ee.h hVar3 = (ee.h) ((ee.c) ((a30.k) obj).i);
                SQLiteDatabase sQLiteDatabaseA3 = hVar3.a();
                sQLiteDatabaseA3.beginTransaction();
                try {
                    sQLiteDatabaseA3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseA3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.B.h()).execute();
                    sQLiteDatabaseA3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseA3.endTransaction();
                }
            default:
                oj.q qVar2 = (oj.q) obj;
                Iterator it = ((Iterable) ((ee.h) ((ee.d) qVar2.C)).l(new du.w(7))).iterator();
                while (it.hasNext()) {
                    ((a1.i) qVar2.D).x((xd.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override
    public void invoke(Object obj) {
        int i10 = this.A;
        Object obj2 = this.B;
        switch (i10) {
            case 24:
                ((d1) obj).t((d7.c) obj2);
                break;
            case 25:
                ((d1) obj).D(((i7.v) obj2).A.T);
                break;
            case RuntimeVersion.MINOR:
                ((d1) obj).H((v0) obj2);
                break;
            case 27:
            default:
                j7.i iVar = (j7.i) obj;
                iVar.getClass();
                iVar.f8244w = ((s7.w) obj2).f13781a;
                break;
            case 28:
                i7.c cVar = (i7.c) obj2;
                j7.i iVar2 = (j7.i) obj;
                iVar2.f8246y += cVar.f7240g;
                iVar2.f8247z += cVar.f7238e;
                break;
        }
    }

    @Override
    public Object j() {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 8:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e3) {
                    k00.f fVar = gk.c.f6361a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
                } catch (InstantiationException e10) {
                    throw new RuntimeException("Failed to invoke constructor '" + gk.c.b(constructor) + "' with no args", e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to invoke constructor '" + gk.c.b(constructor) + "' with no args", e11.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return dk.t.f4928a.a(cls);
                } catch (Exception e12) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e12);
                }
        }
    }

    @Override
    public int k(int i10, y3.m mVar) {
        return ((b2.c) this.B).a(0, i10, mVar);
    }

    @Override
    public void onComplete(Task task) {
        t0 t0Var = (t0) this.B;
        kotlin.jvm.internal.m.e(task, "task");
        if (task.o()) {
            Object objK = task.k();
            kotlin.jvm.internal.m.d(objK, "getResult(...)");
            a0.A0(t0Var, new du.c0((ah.a) objK));
        }
    }

    @Override
    public void onFailure(Exception exc) {
        ((hq.b) this.B).e.set(0);
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.A;
        Object obj2 = this.B;
        switch (i10) {
            case TYPE_SINT64_VALUE:
                ((e1) obj2).invoke(obj);
                break;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
            default:
                int i11 = HiddenActivity.C;
                ((i5.d) obj2).invoke(obj);
                break;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                int i12 = HiddenActivity.C;
                ((i5.d) obj2).invoke(obj);
                break;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                int i13 = HiddenActivity.C;
                ((i5.d) obj2).invoke(obj);
                break;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                int i14 = HiddenActivity.C;
                ((i5.d) obj2).invoke(obj);
                break;
        }
    }
}
