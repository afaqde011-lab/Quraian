package rc;

import android.content.Context;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.measurement.x5;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

public final class g {

    public final String f13172a;

    public final Context f13173b;

    public final int f13174c;

    public final int f13175d;

    public final String f13176e;

    public final fd.e f13177f;

    public final qj.c f13178g;

    public final int f13179h;

    public final fd.b f13180i;

    public final b0 f13181j;

    public final boolean f13182k;
    public final long l;
    public final long m;

    public final fd.e f13183n;

    public final sg.f f13184o;

    public final boolean f13185p;

    public Boolean f13186q;

    public final u f13187r;

    public File f13188s;

    public Set f13189t;

    public g(Context context, String str) {
        qj.c cVar = new qj.c(9, (byte) 0);
        fd.b bVar = fd.b.A;
        b0 b0Var = new b0();
        b0Var.f13150a = new HashSet();
        Set setG0 = w50.c.g0(e.C);
        Boolean bool = Boolean.FALSE;
        u uVar = new u();
        kotlin.jvm.internal.m.e(str, "apiKey");
        kotlin.jvm.internal.m.e(str, "apiKey");
        this.f13172a = str;
        this.f13173b = context;
        this.f13174c = 30;
        this.f13175d = 30000;
        this.f13176e = "$default_instance";
        this.f13177f = ad.d.f441a;
        this.f13178g = cVar;
        this.f13179h = 5;
        this.f13180i = bVar;
        this.f13181j = b0Var;
        this.f13182k = true;
        this.l = 300000L;
        this.m = NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS;
        this.f13183n = ad.d.f443c;
        this.f13184o = ad.d.f442b;
        this.f13185p = true;
        this.f13186q = bool;
        this.f13187r = uVar;
        this.f13189t = h00.q.q1(setG0);
        new i(true, false, false, false).f13194e.add(new b3.a(this, 26));
    }

    public final File a() {
        if (this.f13188s == null) {
            Context context = this.f13173b;
            File dir = context.getDir("amplitude", 0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getPackageName());
            sb2.append('/');
            File file = new File(dir, x5.n(sb2, this.f13176e, "/analytics/"));
            this.f13188s = file;
            file.mkdirs();
        }
        File file2 = this.f13188s;
        kotlin.jvm.internal.m.b(file2);
        return file2;
    }
}
