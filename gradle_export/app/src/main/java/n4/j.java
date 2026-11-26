package n4;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import k9.x0;

public final class j {
    public final ArrayList A;

    public final Context f11065a;

    public CharSequence f11069e;

    public CharSequence f11070f;

    public PendingIntent f11071g;

    public IconCompat f11072h;

    public int f11073i;

    public int f11074j;
    public boolean l;
    public f5.c m;

    public CharSequence f11076n;

    public int f11077o;

    public int f11078p;

    public String f11079q;

    public Bundle f11081s;

    public String f11084v;

    public final boolean f11087y;

    public final Notification f11088z;

    public final ArrayList f11066b = new ArrayList();

    public final ArrayList f11067c = new ArrayList();

    public final ArrayList f11068d = new ArrayList();

    public boolean f11075k = true;

    public boolean f11080r = false;

    public int f11082t = 0;

    public int f11083u = 0;

    public int f11085w = 0;

    public int f11086x = 0;

    public j(Context context, String str) {
        Notification notification = new Notification();
        this.f11088z = notification;
        this.f11065a = context;
        this.f11084v = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f11074j = 0;
        this.A = new ArrayList();
        this.f11087y = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(int i10, PendingIntent pendingIntent, String str) {
        this.f11066b.add(new f(i10 != 0 ? IconCompat.a(null, RuntimeVersion.SUFFIX, i10) : null, str, pendingIntent));
    }

    public final Notification b() {
        Bundle bundle;
        String strI0;
        x0 x0Var = new x0(this);
        j jVar = (j) x0Var.C;
        f5.c cVar = jVar.m;
        if (cVar != null) {
            cVar.A0(x0Var);
        }
        Notification notificationBuild = ((Notification.Builder) x0Var.B).build();
        if (cVar != null) {
            jVar.m.getClass();
        }
        if (cVar != null && (bundle = notificationBuild.extras) != null && (strI0 = cVar.I0()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strI0);
        }
        return notificationBuild;
    }

    public final void d(int i10, boolean z10) {
        Notification notification = this.f11088z;
        if (z10) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    public final void e(f5.c cVar) {
        if (this.m != cVar) {
            this.m = cVar;
            if (((j) cVar.B) != this) {
                cVar.B = this;
                e(cVar);
            }
        }
    }
}
