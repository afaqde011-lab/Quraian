package i7;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.protobuf.RuntimeVersion;

public final class l {
    public boolean A;
    public final String B;

    public final Context f7388a;

    public final e7.b0 f7389b;

    public final eh.x f7390c;

    public final eh.x f7391d;

    public final c7.e f7392e;

    public eh.x f7393f;

    public final c7.e f7394g;

    public final du.w f7395h;

    public final Looper f7396i;

    public final int f7397j;

    public final androidx.media3.common.d f7398k;
    public final int l;
    public final boolean m;

    public final l1 f7399n;

    public final k1 f7400o;

    public long f7401p;

    public long f7402q;

    public final long f7403r;

    public final e f7404s;

    public final long f7405t;

    public final long f7406u;

    public final int f7407v;

    public final int f7408w;

    public final int f7409x;

    public final int f7410y;

    public final boolean f7411z;

    public l(Context context) {
        this(context, new c7.e(context, 1), new c7.e(context, 2));
    }

    public l(Context context, eh.x xVar, eh.x xVar2) {
        c7.e eVar = new c7.e(context, 3);
        eh.z zVar = new eh.z(2);
        c7.e eVar2 = new c7.e(context, 4);
        du.w wVar = new du.w(18);
        context.getClass();
        this.f7388a = context;
        this.f7390c = xVar;
        this.f7391d = xVar2;
        this.f7392e = eVar;
        this.f7393f = zVar;
        this.f7394g = eVar2;
        this.f7395h = wVar;
        this.f7396i = e7.i0.r();
        this.f7398k = androidx.media3.common.d.f1142i;
        this.l = 1;
        this.m = true;
        this.f7399n = l1.f7417e;
        this.f7401p = 5000L;
        this.f7402q = 15000L;
        this.f7403r = 3000L;
        this.f7400o = k1.f7386b;
        this.f7404s = new e(e7.i0.H(20L), e7.i0.H(500L));
        this.f7389b = e7.b0.f5117a;
        this.f7405t = 500L;
        this.f7406u = 2000L;
        this.f7407v = 600000;
        this.f7408w = ExoPlayer.f1692a;
        this.f7409x = 60000;
        this.f7410y = 600000;
        this.f7411z = true;
        this.B = RuntimeVersion.SUFFIX;
        this.f7397j = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public final z a() {
        ta.c0.A(!this.A);
        this.A = true;
        return new z(this);
    }

    public final void b(g gVar) {
        ta.c0.A(!this.A);
        this.f7393f = new k(gVar, 0);
    }
}
