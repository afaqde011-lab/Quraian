package ib;

import ab.y;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import g1.j7;
import hb.p;
import hb.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import za.g0;
import za.v;

public final class d implements Runnable {
    public static final String E = v.f("ForceStopRunnable");
    public static final long F = TimeUnit.DAYS.toMillis(3650);
    public final Context A;
    public final y B;
    public final gi.c C;
    public int D = 0;

    public d(Context context, y yVar) {
        this.A = context.getApplicationContext();
        this.B = yVar;
        this.C = yVar.f424g;
    }

    public final void a() {
        boolean z10;
        gi.c cVar = this.C;
        y yVar = this.B;
        WorkDatabase workDatabase = yVar.f420c;
        za.b bVar = yVar.f419b;
        gi.c cVar2 = yVar.f424g;
        WorkDatabase workDatabase2 = yVar.f420c;
        String str = cb.d.F;
        Context context = this.A;
        JobScheduler jobSchedulerB = cb.a.b(context);
        ArrayList<JobInfo> arrayListE = cb.d.e(context, jobSchedulerB);
        List list = (List) rd.a.M(workDatabase.t().f6974a, true, false, new j7(14));
        HashSet hashSet = new HashSet(arrayListE != null ? arrayListE.size() : 0);
        if (arrayListE != null && !arrayListE.isEmpty()) {
            for (JobInfo jobInfo : arrayListE) {
                hb.i iVarF = cb.d.f(jobInfo);
                if (iVarF != null) {
                    hashSet.add(iVarF.f6976a);
                } else {
                    cb.d.d(jobSchedulerB, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    v.d().a(cb.d.F, "Reconciling jobs");
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            workDatabase.b();
            try {
                x xVarW = workDatabase.w();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    xVarW.g(-1L, (String) it2.next());
                }
                workDatabase.p();
                workDatabase.f();
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
        x xVarW2 = workDatabase2.w();
        hb.m mVarV = workDatabase2.v();
        workDatabase2.b();
        try {
            List<p> list2 = (List) rd.a.M(xVarW2.f7028a, true, false, new j7(17));
            boolean z11 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z11) {
                for (p pVar : list2) {
                    g0 g0Var = g0.A;
                    String str2 = pVar.f7004a;
                    xVarW2.j(g0Var, str2);
                    xVarW2.k(-512, str2);
                    xVarW2.g(-1L, str2);
                }
            }
            rd.a.M(mVarV.f6984a, false, true, new j7(15));
            workDatabase2.p();
            workDatabase2.f();
            boolean z12 = z11 || z10;
            Long lA = ((WorkDatabase) cVar2.B).s().a("reschedule_needed");
            String str3 = E;
            if (lA != null && lA.longValue() == 1) {
                v.d().a(str3, "Rescheduling Workers.");
                yVar.n0();
                cVar2.getClass();
                ((WorkDatabase) cVar2.B).s().b(new hb.d("reschedule_needed", 0L));
                return;
            }
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, 570425344);
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = ((WorkDatabase) cVar.B).s().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i10 = 0; i10 < historicalProcessExitReasons.size(); i10++) {
                        ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i10);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jLongValue) {
                            v.d().a(str3, "Application was force-stopped, rescheduling.");
                            yVar.n0();
                            bVar.f17340d.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            cVar.getClass();
                            ((WorkDatabase) cVar.B).s().b(new hb.d("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis)));
                            return;
                        }
                    }
                }
                if (z12) {
                    v.d().a(str3, "Found unfinished work, scheduling it.");
                    ab.l.b(bVar, workDatabase2, yVar.f422e);
                }
            } catch (IllegalArgumentException | SecurityException e3) {
                if (v.d().f17403a <= 5) {
                    Log.w(str3, "Ignoring exception", e3);
                }
            }
        } catch (Throwable th3) {
            workDatabase2.f();
            throw th3;
        }
    }

    public final boolean b() {
        za.b bVar = this.B.f419b;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = E;
        if (zIsEmpty) {
            v.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = i.a(this.A, bVar);
        v.d().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override
    public final void run() {
        Context context = this.A;
        String str = E;
        y yVar = this.B;
        try {
            if (!b()) {
                yVar.m0();
                return;
            }
            while (true) {
                try {
                    kh.o.D(context);
                    v.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        yVar.m0();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e3) {
                        int i10 = this.D + 1;
                        this.D = i10;
                        if (i10 >= 3) {
                            String str2 = f50.k.s(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            v.d().c(str, str2, e3);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e3);
                            yVar.f419b.getClass();
                            throw illegalStateException;
                        }
                        long j9 = ((long) i10) * 300;
                        String str3 = "Retrying after " + j9;
                        if (v.d().f17403a <= 3) {
                            Log.d(str, str3, e3);
                        }
                        try {
                            Thread.sleep(((long) this.D) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e10) {
                    v.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e10);
                    yVar.f419b.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th2) {
            yVar.m0();
            throw th2;
        }
    }
}
