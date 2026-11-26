package tx;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import d40.d1;
import d40.o;
import d40.p1;
import d40.y0;
import d40.z0;
import g00.b0;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Objects;

public final class a {
    public final SharedPreferences a;
    public final p1 b;
    public final z0 c;
    public final d1 d;
    public final y0 e;
    public long f;

    public a(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        p1 p1VarC = o.c(Boolean.FALSE);
        this.b = p1VarC;
        this.c = new z0(p1VarC);
        d1 d1VarB = o.b(1, 1, c40.a.B);
        this.d = d1VarB;
        this.e = new y0(d1VarB);
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f < HTTPTimeoutManager.REDUCED_TIMEOUT_MS) {
            return;
        }
        this.f = jElapsedRealtime;
        SharedPreferences sharedPreferences = this.a;
        int i = sharedPreferences.getInt("surah_count_key", 0) + 1;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("surah_count_key", i);
        editorEdit.apply();
        if (i < 2) {
            return;
        }
        b(ux.a.A);
    }

    public final void b(ux.a aVar) {
        boolean zIsAfter;
        SharedPreferences sharedPreferences = this.a;
        long j = sharedPreferences.getLong("on_questioner_shown_date", 0L);
        String string = sharedPreferences.getString("questioner_interval_unit", "");
        long j2 = sharedPreferences.getLong("questioner_value", 0L);
        if (j == 0 || string == null || string.length() == 0 || j2 == 0) {
            zIsAfter = true;
        } else {
            ChronoUnit chronoUnit = (!string.equals("month") && string.equals("day")) ? ChronoUnit.DAYS : ChronoUnit.MONTHS;
            ZonedDateTime zonedDateTimePlus = Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).plus(j2, (TemporalUnit) chronoUnit);
            zIsAfter = ZonedDateTime.now().isAfter(zonedDateTimePlus);
            if (!zIsAfter) {
                Objects.toString(aVar);
                Objects.toString(zonedDateTimePlus);
            }
        }
        if (zIsAfter) {
            boolean z = sharedPreferences.getBoolean("is_questioner_answered", false);
            if (aVar != ux.a.A && z) {
                Objects.toString(aVar);
                c(6L, "month");
                this.d.f(b0.a);
            } else {
                Objects.toString(aVar);
                Boolean bool = Boolean.TRUE;
                p1 p1Var = this.b;
                p1Var.getClass();
                p1Var.k(null, bool);
            }
        }
    }

    public final void c(long j, String str) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putLong("on_questioner_shown_date", Instant.now().toEpochMilli());
        editorEdit.putLong("questioner_value", j);
        editorEdit.putString("questioner_interval_unit", str);
        editorEdit.apply();
    }
}
