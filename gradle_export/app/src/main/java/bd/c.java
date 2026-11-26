package bd;

import ab.a0;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import c40.h;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.v0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Objects;
import kotlin.jvm.internal.m;
import oj.s;
import ri.t1;
import tf.e1;
import tf.g3;
import tf.h1;
import tf.i2;
import tf.j3;
import tf.q0;
import tf.q2;
import tf.s2;
import tf.t2;
import tf.u;
import tf.v;
import tf.z1;

public final class c implements Application.ActivityLifecycleCallbacks {
    public final int A;
    public final Object B;

    public c(int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                this.B = new ArrayDeque(10);
                break;
            default:
                this.B = t1.b(Integer.MAX_VALUE, 6, null);
                break;
        }
    }

    public c(i2 i2Var) {
        this.A = 2;
        this.B = i2Var;
    }

    private final void a(Activity activity) {
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity, Bundle bundle) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    public void i(u0 u0Var, Bundle bundle) {
        t2 t2Var;
        h1 h1Var;
        Uri uri;
        i2 i2Var = (i2) this.B;
        try {
            try {
                h1 h1Var2 = (h1) i2Var.B;
                q0 q0Var = h1Var2.F;
                h1.g(q0Var);
                q0Var.O.b("onActivityCreated");
                Intent intent = u0Var.C;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                                uri = data;
                            }
                        }
                        uri = null;
                    } else {
                        uri = data;
                    }
                    if (uri != null && uri.isHierarchical()) {
                        h1.e(h1Var2.I);
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                        String queryParameter = uri.getQueryParameter("referrer");
                        boolean z10 = bundle == null;
                        e1 e1Var = h1Var2.G;
                        h1.g(e1Var);
                        e1Var.e1(new z1(this, z10, uri, str, queryParameter));
                        h1Var = (h1) i2Var.B;
                    }
                    t2Var = h1Var.L;
                }
                h1Var = (h1) i2Var.B;
            } catch (RuntimeException e3) {
                q0 q0Var2 = ((h1) i2Var.B).F;
                h1.g(q0Var2);
                q0Var2.G.c(e3, "Throwable caught in onActivityCreated");
            }
            t2Var = h1Var.L;
        } finally {
            t2Var = ((h1) i2Var.B).L;
            h1.f(t2Var);
            t2Var.d1(u0Var, bundle);
        }
    }

    public void j(u0 u0Var) {
        t2 t2Var = ((h1) ((i2) this.B).B).L;
        h1.f(t2Var);
        synchronized (t2Var.M) {
            try {
                if (Objects.equals(t2Var.H, u0Var)) {
                    t2Var.H = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((h1) t2Var.B).D.j1()) {
            t2Var.G.remove(Integer.valueOf(u0Var.A));
        }
    }

    public void k(u0 u0Var) {
        h1 h1Var = (h1) ((i2) this.B).B;
        t2 t2Var = h1Var.L;
        h1.f(t2Var);
        synchronized (t2Var.M) {
            t2Var.L = false;
            t2Var.I = true;
        }
        h1 h1Var2 = (h1) t2Var.B;
        h1Var2.K.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (h1Var2.D.j1()) {
            q2 q2VarA1 = t2Var.a1(u0Var);
            t2Var.E = t2Var.D;
            t2Var.D = null;
            e1 e1Var = h1Var2.G;
            h1.g(e1Var);
            e1Var.e1(new s(t2Var, q2VarA1, jElapsedRealtime));
        } else {
            t2Var.D = null;
            e1 e1Var2 = h1Var2.G;
            h1.g(e1Var2);
            e1Var2.e1(new u(t2Var, jElapsedRealtime));
        }
        j3 j3Var = h1Var.H;
        h1.f(j3Var);
        h1 h1Var3 = (h1) j3Var.B;
        h1Var3.K.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        e1 e1Var3 = h1Var3.G;
        h1.g(e1Var3);
        e1Var3.e1(new g3(j3Var, jElapsedRealtime2, 1));
    }

    public void l(u0 u0Var) {
        h1 h1Var = (h1) ((i2) this.B).B;
        j3 j3Var = h1Var.H;
        h1.f(j3Var);
        h1 h1Var2 = (h1) j3Var.B;
        h1Var2.K.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        e1 e1Var = h1Var2.G;
        h1.g(e1Var);
        e1Var.e1(new g3(j3Var, jElapsedRealtime, 0));
        t2 t2Var = h1Var.L;
        h1.f(t2Var);
        Object obj = t2Var.M;
        synchronized (obj) {
            t2Var.L = true;
            if (!Objects.equals(u0Var, t2Var.H)) {
                synchronized (obj) {
                    t2Var.H = u0Var;
                    t2Var.I = false;
                    h1 h1Var3 = (h1) t2Var.B;
                    if (h1Var3.D.j1()) {
                        t2Var.J = null;
                        e1 e1Var2 = h1Var3.G;
                        h1.g(e1Var2);
                        e1Var2.e1(new s2(t2Var, 1));
                    }
                }
            }
        }
        h1 h1Var4 = (h1) t2Var.B;
        if (!h1Var4.D.j1()) {
            t2Var.D = t2Var.J;
            e1 e1Var3 = h1Var4.G;
            h1.g(e1Var3);
            e1Var3.e1(new s2(t2Var, 0));
            return;
        }
        t2Var.e1(u0Var.B, t2Var.a1(u0Var), false);
        v vVar = ((h1) t2Var.B).N;
        h1.d(vVar);
        h1 h1Var5 = (h1) vVar.B;
        h1Var5.K.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        e1 e1Var4 = h1Var5.G;
        h1.g(e1Var4);
        e1Var4.e1(new u(vVar, jElapsedRealtime2));
    }

    public void m(u0 u0Var, Bundle bundle) {
        q2 q2Var;
        t2 t2Var = ((h1) ((i2) this.B).B).L;
        h1.f(t2Var);
        if (!((h1) t2Var.B).D.j1() || bundle == null || (q2Var = (q2) t2Var.G.get(Integer.valueOf(u0Var.A))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", q2Var.f14696c);
        bundle2.putString("name", q2Var.f14694a);
        bundle2.putString("referrer_name", q2Var.f14695b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.A) {
            case 0:
                m.e(activity, "activity");
                ((h) this.B).j(new a(new WeakReference(activity), b.A));
                break;
            case 1:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.B;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e3) {
                        Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e3);
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null) {
                            if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                                fi.b bVar = (fi.b) bi.g.c().b(fi.b.class);
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                                }
                                if (bVar != null) {
                                    String string2 = bundle2.getString("google.c.a.c_id");
                                    fi.c cVar = (fi.c) bVar;
                                    if (gi.a.a("fcm") && gi.a.c("fcm", "_ln")) {
                                        j1 j1Var = (j1) cVar.f5698a.B;
                                        j1Var.c(new v0(j1Var, string2, 0));
                                    }
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("source", "Firebase");
                                    bundle3.putString("medium", "notification");
                                    bundle3.putString("campaign", string2);
                                    cVar.a("fcm", "_cmp", bundle3);
                                } else {
                                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                                }
                            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                            }
                        }
                        a0.m0("_no", bundle2);
                    }
                    break;
                }
                break;
            default:
                i(u0.a(activity), bundle);
                break;
        }
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        switch (this.A) {
            case 0:
                m.e(activity, "activity");
                ((h) this.B).j(new a(new WeakReference(activity), b.F));
                break;
            case 1:
                break;
            default:
                j(u0.a(activity));
                break;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        switch (this.A) {
            case 0:
                m.e(activity, "activity");
                ((h) this.B).j(new a(new WeakReference(activity), b.D));
                break;
            case 1:
                break;
            default:
                k(u0.a(activity));
                break;
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        switch (this.A) {
            case 0:
                m.e(activity, "activity");
                ((h) this.B).j(new a(new WeakReference(activity), b.C));
                break;
            case 1:
                break;
            default:
                l(u0.a(activity));
                break;
        }
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.A) {
            case 0:
                m.e(activity, "activity");
                m.e(bundle, "outState");
                break;
            case 1:
                break;
            default:
                m(u0.a(activity), bundle);
                break;
        }
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        switch (this.A) {
            case 0:
                m.e(activity, "activity");
                ((h) this.B).j(new a(new WeakReference(activity), b.B));
                break;
        }
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        switch (this.A) {
            case 0:
                m.e(activity, "activity");
                ((h) this.B).j(new a(new WeakReference(activity), b.E));
                break;
        }
    }
}
