package tf;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

public final class n2 extends d0 {
    public JobScheduler D;

    @Override
    public final boolean Y0() {
        return true;
    }

    public final void Z0(long j9) {
        h1 h1Var = (h1) this.B;
        W0();
        V0();
        JobScheduler jobScheduler = this.D;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(h1Var.A.getPackageName())).hashCode()) != null) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.O.b("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iA1 = a1();
        if (iA1 != 2) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.O.c(a1.b.C(iA1), "[sgtm] Not eligible for Scion upload");
            return;
        }
        q0 q0Var3 = h1Var.F;
        h1.g(q0Var3);
        q0Var3.O.c(Long.valueOf(j9), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(h1Var.A.getPackageName())).hashCode(), new ComponentName(h1Var.A, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j9).setOverrideDeadline(j9 + j9).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.D;
        com.google.android.gms.common.internal.d0.h(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        q0 q0Var4 = h1Var.F;
        h1.g(q0Var4);
        q0Var4.O.c(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final int a1() {
        h1 h1Var = (h1) this.B;
        W0();
        V0();
        if (this.D == null) {
            return 7;
        }
        Boolean boolH1 = h1Var.D.h1("google_analytics_sgtm_upload_enabled");
        if (!(boolH1 == null ? false : boolH1.booleanValue())) {
            return 8;
        }
        if (h1Var.l().K < 119000) {
            return 6;
        }
        if (e4.o1(h1Var.A)) {
            return !h1Var.j().c1() ? 5 : 2;
        }
        return 3;
    }
}
