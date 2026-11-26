package tf;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

public final class o3 extends t3 {
    public final AlarmManager E;
    public i3 F;
    public Integer G;

    public o3(y3 y3Var) {
        super(y3Var);
        this.E = (AlarmManager) ((h1) this.B).A.getSystemService("alarm");
    }

    @Override
    public final void Y0() {
        AlarmManager alarmManager = this.E;
        if (alarmManager != null) {
            Context context = ((h1) this.B).A;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 33554432));
        }
        b1();
    }

    public final void Z0() {
        W0();
        h1 h1Var = (h1) this.B;
        q0 q0Var = h1Var.F;
        h1.g(q0Var);
        q0Var.O.b("Unscheduling upload");
        AlarmManager alarmManager = this.E;
        if (alarmManager != null) {
            Context context = h1Var.A;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 33554432));
        }
        a1().c();
        b1();
    }

    public final n a1() {
        if (this.F == null) {
            this.F = new i3(this, this.C.L, 1);
        }
        return this.F;
    }

    public final void b1() {
        JobScheduler jobScheduler = (JobScheduler) ((h1) this.B).A.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(c1());
        }
    }

    public final int c1() {
        if (this.G == null) {
            this.G = Integer.valueOf("measurement".concat(String.valueOf(((h1) this.B).A.getPackageName())).hashCode());
        }
        return this.G.intValue();
    }
}
