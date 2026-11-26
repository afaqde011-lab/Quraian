package ab;

import a1.o1;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import bt.a2;
import bt.y1;
import g1.j7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import qd.s0;
import ri.t1;

public final class y extends t1 {

    public static y f417k;
    public static y l;
    public static final Object m;

    public final Context f418a;

    public final za.b f419b;

    public final WorkDatabase f420c;

    public final jb.b f421d;

    public final List f422e;

    public final g f423f;

    public final gi.c f424g;

    public boolean f425h = false;

    public BroadcastReceiver.PendingResult f426i;

    public final fb.g f427j;

    static {
        za.v.f("WorkManagerImpl");
        f417k = null;
        l = null;
        m = new Object();
    }

    public y(Context context, final za.b bVar, jb.b bVar2, final WorkDatabase workDatabase, final List list, g gVar, fb.g gVar2) {
        int i10 = 0;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        za.v vVar = new za.v(bVar.f17344h);
        synchronized (za.v.f17401b) {
            try {
                if (za.v.f17402c == null) {
                    za.v.f17402c = vVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f418a = applicationContext;
        this.f421d = bVar2;
        this.f420c = workDatabase;
        this.f423f = gVar;
        this.f427j = gVar2;
        this.f419b = bVar;
        this.f422e = list;
        a40.v vVar2 = bVar2.f8259b;
        kotlin.jvm.internal.m.d(vVar2, "getTaskCoroutineDispatcher(...)");
        f40.c cVarC = a40.c0.c(vVar2);
        this.f424g = new gi.c(workDatabase, 7);
        final ca.z zVar = bVar2.f8258a;
        String str = l.f385a;
        gVar.a(new b() {
            @Override
            public final void d(hb.i iVar, boolean z10) {
                zVar.execute(new k(list, iVar, bVar, workDatabase, 0));
            }
        });
        bVar2.f8258a.execute(new ib.d(applicationContext, this));
        String str2 = p.f399a;
        if (ib.i.a(applicationContext, bVar)) {
            ea.l lVarO = rd.a.o(workDatabase.w().f7028a, false, new String[]{"workspec"}, new j7(22));
            k00.c cVar = null;
            a40.c0.y(cVarC, (k00.i) null, (a40.a0) null, new a1.a0(new d40.z(d40.o.o(d40.o.g(new y1(lVarO, new n(4, null), 4), -1)), new o(applicationContext, cVar, i10), 1), cVar, 11), 3);
        }
    }

    public static y l0(Context context) {
        y yVar;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        yVar = f417k;
                        if (yVar == null) {
                            yVar = l;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return yVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (yVar != null) {
            return yVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    @Override
    public final d40.i A(String str) {
        hb.x xVarW = this.f420c.w();
        a40.v vVar = this.f421d.f8259b;
        kotlin.jvm.internal.m.e(xVarW, "<this>");
        kotlin.jvm.internal.m.e(vVar, "dispatcher");
        return d40.o.v(d40.o.o(new a2(rd.a.o(xVarW.f7028a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new hb.s(str, xVarW, 1)), 7)), vVar);
    }

    @Override
    public final za.b0 H() {
        WorkDatabase workDatabase = this.f420c;
        kotlin.jvm.internal.m.e(workDatabase, "<this>");
        za.b bVar = this.f419b;
        kotlin.jvm.internal.m.e(bVar, "configuration");
        jb.b bVar2 = this.f421d;
        kotlin.jvm.internal.m.e(bVar2, "executor");
        za.i iVar = bVar.m;
        ca.z zVar = bVar2.f8258a;
        kotlin.jvm.internal.m.d(zVar, "getSerialTaskExecutor(...)");
        return s0.k0(iVar, "PruneWork", zVar, new g1.l0(workDatabase, 11));
    }

    public final za.b0 j0(String str) {
        kotlin.jvm.internal.m.e(str, "tag");
        za.i iVar = this.f419b.m;
        String strConcat = "CancelWorkByTag_".concat(str);
        ca.z zVar = this.f421d.f8258a;
        kotlin.jvm.internal.m.d(zVar, "getSerialTaskExecutor(...)");
        return s0.k0(iVar, strConcat, zVar, new ib.b(this, str));
    }

    public final PendingIntent k0(UUID uuid) {
        String string = uuid.toString();
        String str = gb.b.J;
        Context context = this.f418a;
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse("workspec://" + string));
        intent.putExtra("KEY_WORKSPEC_ID", string);
        return PendingIntent.getService(context, 0, intent, 167772160);
    }

    public final void m0() {
        synchronized (m) {
            try {
                this.f425h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f426i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f426i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final za.b0 n(String str) {
        za.i iVar = this.f419b.m;
        String strConcat = "CancelWorkByName_".concat(str);
        ca.z zVar = this.f421d.f8258a;
        kotlin.jvm.internal.m.d(zVar, "getSerialTaskExecutor(...)");
        return s0.k0(iVar, strConcat, zVar, new ib.b(str, this));
    }

    public final void n0() {
        za.i iVar = this.f419b.m;
        final int i10 = 0;
        ?? r4 = new u00.a(this) {
            public final y B;

            {
                this.B = this;
            }

            public final Object invoke() {
                int i11 = i10;
                g00.b0 b0Var = g00.b0.a;
                y yVar = this.B;
                switch (i11) {
                    case 0:
                        WorkDatabase workDatabase = yVar.f420c;
                        Context context = yVar.f418a;
                        String str = cb.d.F;
                        if (Build.VERSION.SDK_INT >= 34) {
                            cb.a.b(context).cancelAll();
                        }
                        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                        ArrayList arrayListE = cb.d.e(context, jobScheduler);
                        if (arrayListE != null && !arrayListE.isEmpty()) {
                            Iterator it = arrayListE.iterator();
                            while (it.hasNext()) {
                                cb.d.d(jobScheduler, ((JobInfo) it.next()).getId());
                            }
                        }
                        ((Number) rd.a.M(workDatabase.w().f7028a, false, true, new j7(24))).intValue();
                        l.b(yVar.f419b, workDatabase, yVar.f422e);
                        break;
                    default:
                        WorkDatabase workDatabase2 = yVar.f420c;
                        kotlin.jvm.internal.m.d(workDatabase2, "getWorkDatabase(...)");
                        workDatabase2.o(new a1.z(new f(workDatabase2, yVar, 21), 14));
                        break;
                }
                return b0Var;
            }
        };
        kotlin.jvm.internal.m.e(iVar, "<this>");
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            try {
                kh.o.n("ReschedulingWork");
            } finally {
                if (zIsEnabled) {
                    Trace.endSection();
                }
            }
        }
        r4.invoke();
    }

    @Override
    public final za.b0 o(UUID uuid) {
        kotlin.jvm.internal.m.e(uuid, "id");
        za.i iVar = this.f419b.m;
        ca.z zVar = this.f421d.f8258a;
        kotlin.jvm.internal.m.d(zVar, "getSerialTaskExecutor(...)");
        return s0.k0(iVar, "CancelWorkById", zVar, new o1(this, uuid, 17));
    }
}
