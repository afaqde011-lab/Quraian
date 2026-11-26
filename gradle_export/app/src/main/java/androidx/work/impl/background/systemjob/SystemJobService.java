package androidx.work.impl.background.systemjob;

import a8.l;
import ab.b;
import ab.e;
import ab.g;
import ab.m;
import ab.y;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Looper;
import android.os.PersistableBundle;
import hb.i;
import java.util.Arrays;
import java.util.HashMap;
import l9.f0;
import s10.w0;
import za.v;

public class SystemJobService extends JobService implements b {
    public static final String E = v.f("SystemJobService");
    public y A;
    public final HashMap B = new HashMap();
    public final l C = new l(1);
    public f0 D;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(a1.b.p("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static i b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new i(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override
    public final void d(i iVar, boolean z10) {
        a("onExecuted");
        v.d().a(E, iVar.f6976a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.B.remove(iVar);
        this.C.c(iVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        try {
            y yVarL0 = y.l0(getApplicationContext());
            this.A = yVarL0;
            g gVar = yVarL0.f423f;
            this.D = new f0(gVar, yVarL0.f421d);
            gVar.a(this);
        } catch (IllegalStateException e3) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e3);
            }
            v.d().g(E, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        y yVar = this.A;
        if (yVar != null) {
            g gVar = yVar.f423f;
            synchronized (gVar.f378k) {
                gVar.f377j.remove(this);
            }
        }
    }

    @Override
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        y yVar = this.A;
        String str = E;
        if (yVar == null) {
            v.d().a(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        i iVarB = b(jobParameters);
        if (iVarB == null) {
            v.d().b(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.B;
        if (map.containsKey(iVarB)) {
            v.d().a(str, "Job is already being executed by SystemJobService: " + iVarB);
            return false;
        }
        v.d().a(str, "onStartJob for " + iVarB);
        map.put(iVarB, jobParameters);
        w0 w0Var = new w0(22);
        if (jobParameters.getTriggeredContentUris() != null) {
            w0Var.C = Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            w0Var.B = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        jobParameters.getNetwork();
        f0 f0Var = this.D;
        m mVarE = this.C.e(iVarB);
        f0Var.getClass();
        ((jb.b) f0Var.C).f8258a.execute(new e(f0Var, mVarE, w0Var, 1));
        return true;
    }

    @Override
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.A == null) {
            v.d().a(E, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        i iVarB = b(jobParameters);
        if (iVarB == null) {
            v.d().b(E, "WorkSpec id not found!");
            return false;
        }
        v.d().a(E, "onStopJob for " + iVarB);
        this.B.remove(iVarB);
        m mVarC = this.C.c(iVarB);
        if (mVarC != null) {
            int stopReason = jobParameters.getStopReason();
            switch (stopReason) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    stopReason = -512;
                    break;
            }
            f0 f0Var = this.D;
            f0Var.getClass();
            f0Var.u(mVarC, stopReason);
        }
        g gVar = this.A.f423f;
        String str = iVarB.f6976a;
        synchronized (gVar.f378k) {
            zContains = gVar.f376i.contains(str);
        }
        return !zContains;
    }
}
