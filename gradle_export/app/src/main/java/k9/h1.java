package k9;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public abstract class h1 extends Service {
    public v2 C;
    public w1 D;
    public qd.j0 E;
    public final Object A = new Object();
    public final Handler B = new Handler(Looper.getMainLooper());
    public final u.e F = new u.e(0);

    public final void a(g1 g1Var) {
        g1 g1Var2;
        ta.c0.w(g1Var, "session must not be null");
        boolean z10 = true;
        ta.c0.r("session is already released", !g1Var.f9307a.o());
        synchronized (this.A) {
            g1Var2 = (g1) this.F.get(g1Var.f9307a.f9421i);
            if (g1Var2 != null && g1Var2 != g1Var) {
                z10 = false;
            }
            ta.c0.r("Session ID should be unique", z10);
            this.F.put(g1Var.f9307a.f9421i, g1Var);
        }
        if (g1Var2 == null) {
            e7.i0.M(this.B, new u2(this, g1Var, 0));
        }
    }

    public final w1 b(oe.o oVar) {
        if (this.D == null) {
            if (oVar == null) {
                ta.c0.w(getBaseContext(), "Accessing service context before onCreate()");
                com.google.android.gms.internal.measurement.f4 f4Var = new com.google.android.gms.internal.measurement.f4(getApplicationContext(), 3);
                ta.c0.A(!f4Var.B);
                oe.o oVar2 = new oe.o(f4Var);
                f4Var.B = true;
                oVar = oVar2;
            }
            if (this.E == null) {
                this.E = new qd.j0(this);
            }
            this.D = new w1(this, oVar, this.E);
        }
        return this.D;
    }

    public final ArrayList c() {
        ArrayList arrayList;
        synchronized (this.A) {
            arrayList = new ArrayList(this.F.values());
        }
        return arrayList;
    }

    public final boolean d(g1 g1Var) {
        boolean zContainsKey;
        synchronized (this.A) {
            zContainsKey = this.F.containsKey(g1Var.f9307a.f9421i);
        }
        return zContainsKey;
    }

    public final IBinder e(Intent intent) {
        String action;
        m1 m1Var;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            v2 v2Var = this.C;
            v2Var.getClass();
            return v2Var;
        }
        if (!action.equals("android.media.browse.MediaBrowserService")) {
            return null;
        }
        if (TextUtils.isEmpty("android.media.session.MediaController")) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        Bundle bundle = Bundle.EMPTY;
        g1 g1Var = ((AudioPlayerService) this).I;
        if (g1Var == null) {
            return null;
        }
        a(g1Var);
        s1 s1Var = g1Var.f9307a;
        synchronized (s1Var.f9413a) {
            try {
                if (s1Var.f9434x == null) {
                    l9.e0 e0Var = ((l9.c0) s1Var.f9420h.f9467j.B).f10128c;
                    m1 m1Var2 = new m1(s1Var);
                    m1Var2.c(e0Var);
                    s1Var.f9434x = m1Var2;
                }
                m1Var = s1Var.f9434x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m1Var.onBind(new Intent("android.media.browse.MediaBrowserService"));
    }

    public final void f(g1 g1Var, boolean z10) {
        fh.t0 t0VarB;
        w1 w1VarB = b(null);
        if (!w1VarB.A.d(g1Var) || !w1VarB.d(g1Var)) {
            w1VarB.A.stopForeground(1);
            w1VarB.K = false;
            if (w1VarB.J != null) {
                w1VarB.C.f11105b.cancel(null, 1001);
                w1VarB.I++;
                w1VarB.J = null;
                return;
            }
            return;
        }
        int i10 = w1VarB.I + 1;
        w1VarB.I = i10;
        u uVarB = w1VarB.b(g1Var);
        uVarB.getClass();
        uVarB.c();
        t tVar = uVarB.f9521d;
        if (tVar.isConnected()) {
            t0VarB = tVar.b();
        } else {
            fh.r0 r0Var = fh.t0.B;
            t0VarB = fh.d2.E;
        }
        e7.i0.M(new Handler(g1Var.a().getApplicationLooper()), new t1(0, w1VarB, g1Var, t0VarB, new androidx.media3.cast.a(w1VarB, i10, g1Var), z10));
    }

    public final void g(g1 g1Var) {
        try {
            f(g1Var, b(null).c());
        } catch (IllegalStateException e3) {
            if (!(e3 instanceof ForegroundServiceStartNotAllowedException)) {
                throw e3;
            }
            e7.a.e("MSessionService", "Failed to start foreground", e3);
            this.B.post(new androidx.lifecycle.i0(this, 27));
        }
    }

    public final void h(g1 g1Var) {
        ta.c0.w(g1Var, "session must not be null");
        synchronized (this.A) {
            ta.c0.r("session not found", this.F.containsKey(g1Var.f9307a.f9421i));
            this.F.remove(g1Var.f9307a.f9421i);
        }
        e7.i0.M(this.B, new u2(this, g1Var, 1));
    }

    @Override
    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!"androidx.media3.session.MediaLibraryService".equals(intent.getAction())) {
            return e(intent);
        }
        v2 v2Var = this.C;
        v2Var.getClass();
        return v2Var;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.C = new v2(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        w1 w1Var = this.D;
        if (w1Var != null) {
            w1Var.a();
        }
        v2 v2Var = this.C;
        if (v2Var != null) {
            v2Var.f9536e.clear();
            v2Var.f9537f.removeCallbacksAndMessages(null);
            Set set = v2Var.f9538g;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.z3.v((k) it.next());
            }
            set.clear();
            this.C = null;
        }
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        g1 g1Var;
        g1 g1Var2;
        if (intent != null) {
            if (this.E == null) {
                this.E = new qd.j0(this);
            }
            qd.j0 j0Var = this.E;
            Uri data = intent.getData();
            if (data != null) {
                synchronized (g1.f9305b) {
                    try {
                        Iterator it = g1.f9306c.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                g1Var2 = null;
                                break;
                            }
                            g1Var2 = (g1) it.next();
                            if (Objects.equals(g1Var2.f9307a.f9414b, data)) {
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                g1Var = g1Var2;
            } else {
                g1Var = null;
            }
            j0Var.getClass();
            if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
                if (g1Var == null) {
                    if (TextUtils.isEmpty("android.media.session.MediaController")) {
                        throw new IllegalArgumentException("packageName should be nonempty");
                    }
                    Bundle bundle = Bundle.EMPTY;
                    g1Var = ((AudioPlayerService) this).I;
                    if (g1Var != null) {
                        a(g1Var);
                    }
                }
                s1 s1Var = g1Var.f9307a;
                s1Var.l.post(new ji.a(s1Var, intent, 19));
                return 1;
            }
            if (g1Var != null && "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                Object obj = extras != null ? extras.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION") : null;
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    Bundle extras2 = intent.getExtras();
                    Object obj2 = extras2 != null ? extras2.get("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS") : null;
                    Bundle bundle2 = obj2 instanceof Bundle ? (Bundle) obj2 : Bundle.EMPTY;
                    w1 w1VarB = b(null);
                    u uVarB = w1VarB.b(g1Var);
                    if (uVarB != null) {
                        e7.i0.M(new Handler(g1Var.a().getApplicationLooper()), new ab.k(w1VarB, g1Var, str, bundle2, uVarB));
                    }
                }
            }
        }
        return 1;
    }

    @Override
    public final void onTaskRemoved(Intent intent) {
        if (b(null).K) {
            ArrayList arrayListC = c();
            for (int i10 = 0; i10 < arrayListC.size(); i10++) {
                if (((g1) arrayListC.get(i10)).a().isPlaying()) {
                    return;
                }
            }
        }
        b(null).a();
        ArrayList arrayListC2 = c();
        for (int i11 = 0; i11 < arrayListC2.size(); i11++) {
            ((g1) arrayListC2.get(i11)).a().setPlayWhenReady(false);
        }
        stopSelf();
    }
}
