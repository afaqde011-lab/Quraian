package ab;

import android.content.Context;
import android.content.SharedPreferences;

public final class h extends fa.a {

    public final int f380c = 1;

    public final Context f381d;

    public h(Context context) {
        super(9, 10);
        this.f381d = context;
    }

    public h(Context context, int i10, int i11) {
        super(i10, i11);
        this.f381d = context;
    }

    @Override
    public final void b(na.a aVar) {
        switch (this.f380c) {
            case 0:
                kotlin.jvm.internal.m.e(aVar, "db");
                if (this.f5579b >= 10) {
                    aVar.D(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f381d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                kotlin.jvm.internal.m.e(aVar, "db");
                aVar.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f381d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j9 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j10 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    aVar.k();
                    try {
                        aVar.D(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j9)});
                        aVar.D(new Object[]{"reschedule_needed", Long.valueOf(j10)});
                        sharedPreferences.edit().clear().apply();
                        aVar.E();
                        aVar.P();
                    } catch (Throwable th2) {
                        aVar.P();
                        throw th2;
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    aVar.k();
                    try {
                        aVar.D(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        aVar.D(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        aVar.E();
                        return;
                    } finally {
                        aVar.P();
                    }
                }
                return;
        }
    }
}
