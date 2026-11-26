package qd;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.ProxyBillingActivity;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.play_billing.c1;
import com.google.android.gms.internal.play_billing.d1;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.m4;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.n4;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q3;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.v1;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.z3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import tf.l1;

public class b extends a {
    public boolean A;
    public boolean B;
    public boolean C;
    public final a8.o0 D;
    public com.google.android.gms.internal.play_billing.t E;
    public ExecutorService F;
    public final Long G;
    public final v1 H;

    public final String f12841c;

    public final String f12842d;

    public volatile k7.z f12844f;

    public final Context f12845g;

    public final q3.e0 f12846h;

    public volatile com.google.android.gms.internal.play_billing.c f12847i;

    public volatile d0 f12848j;

    public boolean f12849k;
    public boolean l;

    public boolean f12850n;

    public boolean f12851o;

    public boolean f12852p;

    public boolean f12853q;

    public boolean f12854r;

    public boolean f12855s;

    public boolean f12856t;

    public boolean f12857u;

    public boolean f12858v;

    public boolean f12859w;

    public boolean f12860x;

    public boolean f12861y;

    public boolean f12862z;

    public final Object f12839a = new Object();

    public volatile int f12840b = 0;

    public final Handler f12843e = new Handler(Looper.getMainLooper());
    public int m = 0;

    public b(a8.o0 o0Var, Context context, ki.b bVar) {
        int i10 = com.google.android.gms.internal.play_billing.t.C;
        this.E = com.google.android.gms.internal.play_billing.b0.J;
        long jNextLong = new Random().nextLong();
        this.G = Long.valueOf(jNextLong);
        this.H = com.google.android.gms.internal.play_billing.j.f3989a;
        this.f12841c = "9.1.0";
        String strQ = q();
        this.f12842d = strQ;
        this.f12845g = context.getApplicationContext();
        v3 v3VarB = w3.B();
        v3VarB.k();
        if (strQ != null) {
            v3VarB.c();
            w3.A((w3) v3VarB.B, strQ);
        }
        v3VarB.j(this.f12845g.getPackageName());
        v3VarB.c();
        w3.F((w3) v3VarB.B, jNextLong);
        v3VarB.c();
        w3.y((w3) v3VarB.B);
        v3VarB.e(Build.VERSION.SDK_INT);
        v3VarB.h();
        u(v3VarB, context);
        try {
            v3VarB.f(this.f12845g.getPackageManager().getPackageInfo(this.f12845g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Error getting app version code.", th2);
        }
        this.f12846h = new q3.e0(this.f12845g, (w3) v3VarB.a());
        com.google.android.gms.internal.play_billing.q.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f12844f = new k7.z(this.f12845g, null, this.f12846h);
        this.D = o0Var;
        this.f12845g.getPackageName();
    }

    public b(a8.o0 o0Var, Context context, u uVar, ki.b bVar) {
        int i10 = com.google.android.gms.internal.play_billing.t.C;
        this.E = com.google.android.gms.internal.play_billing.b0.J;
        long jNextLong = new Random().nextLong();
        this.G = Long.valueOf(jNextLong);
        this.H = com.google.android.gms.internal.play_billing.j.f3989a;
        this.f12841c = "9.1.0";
        String strQ = q();
        this.f12842d = strQ;
        this.f12845g = context.getApplicationContext();
        v3 v3VarB = w3.B();
        v3VarB.k();
        if (strQ != null) {
            v3VarB.c();
            w3.A((w3) v3VarB.B, strQ);
        }
        v3VarB.j(this.f12845g.getPackageName());
        v3VarB.c();
        w3.F((w3) v3VarB.B, jNextLong);
        v3VarB.c();
        w3.y((w3) v3VarB.B);
        v3VarB.e(Build.VERSION.SDK_INT);
        v3VarB.h();
        u(v3VarB, context);
        try {
            v3VarB.f(this.f12845g.getPackageManager().getPackageInfo(this.f12845g.getPackageName(), 0).versionCode);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Error getting app version code.", th2);
        }
        this.f12846h = new q3.e0(this.f12845g, (w3) v3VarB.a());
        if (uVar == null) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f12844f = new k7.z(this.f12845g, uVar, this.f12846h);
        this.D = o0Var;
        this.f12845g.getPackageName();
    }

    public static Future k(Callable callable, long j9, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new com.google.android.gms.internal.play_billing.r0(futureSubmit, runnable, 12), (long) (j9 * 0.95d));
            return futureSubmit;
        } catch (Exception e3) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Async task throws exception!", e3);
            return null;
        }
    }

    public static String q() {
        try {
            return (String) rd.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void s(b bVar, int i10) {
        bVar.m = i10;
        bVar.C = i10 >= 28;
        bVar.B = i10 >= 26;
        bVar.A = i10 >= 24;
        bVar.f12862z = i10 >= 23;
        bVar.f12861y = i10 >= 21;
        bVar.f12860x = i10 >= 20;
        bVar.f12859w = i10 >= 19;
        bVar.f12858v = i10 >= 18;
        bVar.f12857u = i10 >= 17;
        bVar.f12856t = i10 >= 16;
        bVar.f12855s = i10 >= 15;
        bVar.f12854r = i10 >= 14;
        bVar.f12853q = i10 >= 12;
        bVar.f12852p = i10 >= 9;
        bVar.f12851o = i10 >= 8;
        bVar.f12850n = i10 >= 6;
    }

    public static void t(b bVar, int i10) {
        if (i10 != 0) {
            bVar.I(0);
            return;
        }
        synchronized (bVar.f12839a) {
            try {
                if (bVar.f12840b == 3) {
                    return;
                }
                bVar.I(2);
                k7.z zVar = bVar.f12844f != null ? bVar.f12844f : null;
                if (zVar != null) {
                    boolean z10 = bVar.f12861y;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    zVar.f9187b = z10;
                    u0 u0Var = (u0) zVar.f9191f;
                    Context context = (Context) zVar.f9186a;
                    u0Var.a(context, intentFilter2);
                    if (!zVar.f9187b) {
                        ((u0) zVar.f9190e).a(context, intentFilter);
                        return;
                    }
                    u0 u0Var2 = (u0) zVar.f9190e;
                    synchronized (u0Var2) {
                        if (u0Var2.f12968b) {
                            return;
                        }
                        context.registerReceiver(u0Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != u0Var2.f12969c ? 4 : 2);
                        u0Var2.f12968b = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void u(v3 v3Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i10 = (int) (memoryInfo.totalMem / 1048576);
                v3Var.c();
                w3.x((w3) v3Var.B, i10);
                String str = Build.BRAND;
                v3Var.c();
                w3.t((w3) v3Var.B);
                String str2 = Build.MODEL;
                v3Var.c();
                w3.w((w3) v3Var.B);
                String str3 = Build.MANUFACTURER;
                v3Var.c();
                w3.v((w3) v3Var.B);
                String str4 = Build.FINGERPRINT;
                v3Var.c();
                w3.u((w3) v3Var.B);
            }
        } catch (RuntimeException e3) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Runtime error while populating device info.", e3);
        }
    }

    public final void A(int i10, h hVar, long j9, boolean z10) {
        try {
            int i11 = m0.f12911a;
            try {
                this.f12846h.A(m0.b(i10, 2, hVar, null, s3.BROADCAST_ACTION_UNSPECIFIED), this.m, j9, z10);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void B(int i10, h hVar, String str, long j9, boolean z10) {
        try {
            int i11 = m0.f12911a;
            try {
                this.f12846h.A(m0.b(i10, 2, hVar, str, s3.BROADCAST_ACTION_UNSPECIFIED), this.m, j9, z10);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void C(com.revenuecat.purchases.google.usecase.a aVar, String str, h hVar, int i10, String str2, Exception exc) {
        com.google.android.gms.internal.play_billing.q.i("BillingClient", str2, exc);
        z(i10, 4, hVar, m0.a(exc));
        aVar.d(hVar, str);
    }

    public final void D(com.revenuecat.purchases.google.usecase.b bVar, h hVar, int i10, Exception exc) {
        com.google.android.gms.internal.play_billing.q.i("BillingClient", "getBillingConfig got an exception.", exc);
        z(i10, 13, hVar, m0.a(exc));
        bVar.a(hVar, (d) null);
    }

    public final void E(int i10, int i11, Exception exc) {
        m3 m3Var;
        com.google.android.gms.internal.play_billing.q.i("BillingClient", "showInAppMessages error.", exc);
        String strA = m0.a(exc);
        try {
            p3 p3VarS = q3.s();
            p3VarS.f(i10);
            if (i11 != 0) {
                p3VarS.e(i11);
            }
            if (strA != null) {
                p3VarS.c();
                q3.t((q3) p3VarS.B, strA);
            }
            l3 l3VarU = m3.u();
            l3VarU.e(p3VarS);
            l3VarU.g(30);
            m3Var = (m3) l3VarU.a();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to create logging payload", th2);
            m3Var = null;
        }
        this.f12846h.w(m3Var);
    }

    public final void F(m3 m3Var) {
        try {
            this.f12846h.x(m3Var, this.m);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void G(o3 o3Var) {
        try {
            q3.e0 e0Var = this.f12846h;
            int i10 = this.m;
            e0Var.getClass();
            try {
                v3 v3Var = (v3) ((w3) e0Var.B).l();
                v3Var.c();
                w3.E((w3) v3Var.B, i10);
                w3 w3Var = (w3) v3Var.a();
                e0Var.B = w3Var;
                try {
                    e0Var.H(o3Var, w3Var);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
                }
            } catch (Throwable th3) {
                com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th3);
            }
        } catch (Throwable th4) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th4);
        }
    }

    public final void H(int i10, h hVar) {
        try {
            int i11 = m0.f12911a;
            l3 l3Var = (l3) m0.b(i10, 6, hVar, null, s3.BROADCAST_ACTION_UNSPECIFIED).l();
            m4 m4VarR = n4.r();
            m4VarR.e(false);
            m4VarR.f();
            l3Var.f(m4VarR);
            F((m3) l3Var.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void I(int i10) {
        String str;
        String str2;
        synchronized (this.f12839a) {
            try {
                if (this.f12840b == 3) {
                    return;
                }
                int i11 = this.f12840b;
                if (i11 == 0) {
                    str = "DISCONNECTED";
                } else if (i11 != 1) {
                    str = i11 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i10 == 0) {
                    str2 = "DISCONNECTED";
                } else if (i10 != 1) {
                    str2 = i10 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                com.google.android.gms.internal.play_billing.q.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f12840b = i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void J(c cVar) {
        int i10;
        h hVarN;
        h hVar;
        synchronized (this.f12839a) {
            try {
                if (N()) {
                    hVarN = n();
                } else {
                    if (this.f12840b == 1) {
                        com.google.android.gms.internal.play_billing.q.h("BillingClient", "Client is already in the process of connecting to billing service.");
                        hVar = o0.f12928d;
                        H(37, hVar);
                    } else if (this.f12840b == 3) {
                        com.google.android.gms.internal.play_billing.q.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        hVar = o0.f12934j;
                        H(38, hVar);
                    } else {
                        I(1);
                        K();
                        com.google.android.gms.internal.play_billing.q.g("BillingClient", "Starting in-app billing setup.");
                        this.f12848j = new d0(this, cVar);
                        d0 d0Var = this.f12848j;
                        synchronized (d0Var.D.f12839a) {
                            com.google.android.gms.internal.play_billing.l lVar = d0Var.B;
                            lVar.f3999c = 0L;
                            lVar.f3998b = false;
                            lVar.a();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f12845g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            i10 = 41;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i10 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    com.google.android.gms.internal.play_billing.q.h("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f12841c);
                                    synchronized (this.f12839a) {
                                        try {
                                            if (this.f12840b == 2) {
                                                hVarN = n();
                                            } else if (this.f12840b != 1) {
                                                com.google.android.gms.internal.play_billing.q.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                hVar = o0.f12934j;
                                                H(105, hVar);
                                            } else {
                                                d0 d0Var2 = this.f12848j;
                                                if (this.f12845g.bindService(intent2, d0Var2, 1)) {
                                                    com.google.android.gms.internal.play_billing.q.g("BillingClient", "Service was bonded successfully.");
                                                    hVarN = null;
                                                } else {
                                                    com.google.android.gms.internal.play_billing.q.h("BillingClient", "Connection to Billing service is blocked.");
                                                    i10 = 39;
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                com.google.android.gms.internal.play_billing.q.h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        I(0);
                        com.google.android.gms.internal.play_billing.q.g("BillingClient", "Billing service unavailable on device.");
                        h hVar2 = o0.f12926b;
                        H(i10, hVar2);
                        hVarN = hVar2;
                    }
                    hVarN = hVar;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (hVarN != null) {
            cVar.onBillingSetupFinished(hVarN);
        }
    }

    public final void K() {
        synchronized (this.f12839a) {
            if (this.f12848j != null) {
                try {
                    this.f12845g.unbindService(this.f12848j);
                    this.f12847i = null;
                    this.f12848j = null;
                } catch (Throwable th2) {
                    try {
                        com.google.android.gms.internal.play_billing.q.i("BillingClient", "There was an exception while unbinding service!", th2);
                        this.f12847i = null;
                        this.f12848j = null;
                    } catch (Throwable th3) {
                        this.f12847i = null;
                        this.f12848j = null;
                        throw th3;
                    }
                }
            }
        }
    }

    public final boolean L() {
        try {
            com.google.android.gms.internal.play_billing.q.g("BillingClient", "Already connected or not opted into auto reconnection.");
            h hVar = o0.f12933i;
            TimeUnit.MILLISECONDS.getClass();
            int i10 = hVar.f12892a;
            if (i10 == 0) {
                com.google.android.gms.internal.play_billing.q.g("BillingClient", "Reconnection succeeded with result: " + i10);
            } else {
                com.google.android.gms.internal.play_billing.q.h("BillingClient", "Reconnection failed with result: " + i10);
            }
        } catch (Exception e3) {
            if (e3 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Error during reconnection attempt: ", e3);
        }
        return N();
    }

    public final boolean M(long j9) {
        v1 v1Var = this.H;
        if (v1Var == null) {
            throw new NullPointerException("ticker");
        }
        long jD = v1Var.d();
        int i10 = y3.f3923e;
        long jConvert = j9;
        for (int i11 = 1; i11 <= i10; i11++) {
            try {
                if (Math.max(0L, jConvert) <= 0) {
                    com.google.android.gms.internal.play_billing.q.h("BillingClient", "No time remaining for reconnection attempt.");
                    return N();
                }
                com.google.android.gms.internal.play_billing.q.g("BillingClient", "Already connected or not opted into auto reconnection.");
                h hVar = o0.f12933i;
                TimeUnit.MILLISECONDS.getClass();
                int i12 = hVar.f12892a;
                if (i12 == 0) {
                    com.google.android.gms.internal.play_billing.q.g("BillingClient", "Reconnection succeeded with result: " + i12);
                    return N();
                }
                com.google.android.gms.internal.play_billing.q.h("BillingClient", "Reconnection failed with result: " + i12);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long jD2 = (v1Var.d() - jD) + 0;
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                jConvert = j9 - timeUnit.convert(jD2, timeUnit2);
                long jPow = ((long) Math.pow(2.0d, i11 - 1)) * 1000;
                if (jConvert < jPow) {
                    com.google.android.gms.internal.play_billing.q.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return N();
                }
                if (i11 < i10 && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jConvert = j9 - timeUnit.convert((v1Var.d() - jD) + 0, timeUnit2);
                    } catch (InterruptedException e3) {
                        Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.q.i("BillingClient", "Error sleeping during reconnection attempt: ", e3);
                    }
                }
            } catch (Exception e10) {
                if (e10 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.q.i("BillingClient", "Error during reconnection attempt: ", e10);
            }
        }
        com.google.android.gms.internal.play_billing.q.h("BillingClient", "Max retries reached.");
        return N();
    }

    public final boolean N() {
        boolean z10;
        synchronized (this.f12839a) {
            try {
                z10 = false;
                if (this.f12840b == 2 && this.f12847i != null && this.f12848j != null) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final void O(h hVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f12843e.post(new kh.r(this, hVar, 12));
    }

    @Override
    public void a(bh.f fVar, com.revenuecat.purchases.google.usecase.a aVar) {
        if (k(new ef.a(this, aVar, fVar, 5), NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, new com.google.android.gms.internal.play_billing.r0(this, aVar, 11), l(), j()) == null) {
            h hVarO = o();
            x(25, 3, hVarO);
            aVar.c(hVarO);
        }
    }

    @Override
    public void b(com.revenuecat.purchases.google.usecase.a aVar, eh.l lVar) {
        if (k(new ef.a(this, aVar, lVar, 6), NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, new ca.u(this, aVar, lVar, 3), l(), j()) == null) {
            h hVarO = o();
            x(25, 4, hVarO);
            aVar.d(hVarO, lVar.B);
        }
    }

    @Override
    public void c() {
        ExecutorService executorService;
        try {
            int i10 = m0.f12911a;
            G(m0.c(12, s3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f12839a) {
            try {
                if (this.f12844f != null) {
                    k7.z zVar = this.f12844f;
                    u0 u0Var = (u0) zVar.f9190e;
                    Context context = (Context) zVar.f9186a;
                    u0Var.c(context);
                    ((u0) zVar.f9191f).c(context);
                    try {
                        com.google.android.gms.internal.play_billing.q.g("BillingClient", "Unbinding from service.");
                        K();
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.q.i("BillingClient", "There was an exception while unbinding from the service while ending connection!", th3);
                    }
                    try {
                        synchronized (this) {
                            executorService = this.F;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                this.F = null;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            com.google.android.gms.internal.play_billing.q.i("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th4);
                        } catch (Throwable th5) {
                            I(3);
                            throw th5;
                        }
                    }
                    I(3);
                } else {
                    com.google.android.gms.internal.play_billing.q.g("BillingClient", "Unbinding from service.");
                    K();
                    synchronized (this) {
                        executorService = this.F;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.F = null;
                        }
                        I(3);
                    }
                }
            } catch (Throwable th6) {
                com.google.android.gms.internal.play_billing.q.i("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th6);
            }
            throw th;
        }
    }

    @Override
    public final h d(String str) {
        if (!L()) {
            h hVar = o0.f12934j;
            if (hVar.f12892a != 0) {
                x(2, 5, hVar);
                return hVar;
            }
            try {
                int i10 = m0.f12911a;
                G(m0.c(5, s3.BROADCAST_ACTION_UNSPECIFIED));
                return hVar;
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
                return hVar;
            }
        }
        h hVar2 = o0.f12925a;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals("subscriptionsUpdate")) {
                    h hVar3 = this.l ? o0.f12933i : o0.m;
                    w(10, 3, hVar3);
                    return hVar3;
                }
                break;
            case 96321:
                if (str.equals("aaa")) {
                    h hVar4 = this.f12855s ? o0.f12933i : o0.f12937o;
                    w(31, 6, hVar4);
                    return hVar4;
                }
                break;
            case 97314:
                if (str.equals("bbb")) {
                    h hVar5 = this.f12853q ? o0.f12933i : o0.f12942t;
                    w(30, 5, hVar5);
                    return hVar5;
                }
                break;
            case 98307:
                if (str.equals("ccc")) {
                    h hVar6 = this.f12856t ? o0.f12933i : o0.f12938p;
                    w(19, 8, hVar6);
                    return hVar6;
                }
                break;
            case 99300:
                if (str.equals("ddd")) {
                    h hVar7 = this.f12854r ? o0.f12933i : o0.f12939q;
                    w(21, 7, hVar7);
                    return hVar7;
                }
                break;
            case 100293:
                if (str.equals("eee")) {
                    h hVar8 = this.f12856t ? o0.f12933i : o0.f12938p;
                    w(61, 9, hVar8);
                    return hVar8;
                }
                break;
            case 101286:
                if (str.equals("fff")) {
                    h hVar9 = this.f12857u ? o0.f12933i : o0.f12941s;
                    w(20, 10, hVar9);
                    return hVar9;
                }
                break;
            case 102279:
                if (str.equals("ggg")) {
                    h hVar10 = this.f12858v ? o0.f12933i : o0.f12948z;
                    w(32, 11, hVar10);
                    return hVar10;
                }
                break;
            case 103272:
                if (str.equals("hhh")) {
                    h hVar11 = this.f12858v ? o0.f12933i : o0.A;
                    w(33, 12, hVar11);
                    return hVar11;
                }
                break;
            case 104265:
                if (str.equals("iii")) {
                    h hVar12 = this.f12860x ? o0.f12933i : o0.C;
                    w(60, 13, hVar12);
                    return hVar12;
                }
                break;
            case 105258:
                if (str.equals("jjj")) {
                    h hVar13 = this.f12861y ? o0.f12933i : o0.D;
                    w(66, 14, hVar13);
                    return hVar13;
                }
                break;
            case 106251:
                if (str.equals("kkk")) {
                    h hVar14 = this.A ? o0.f12933i : o0.f12943u;
                    w(83, 18, hVar14);
                    return hVar14;
                }
                break;
            case 107244:
                if (str.equals("lll")) {
                    h hVar15 = this.f12862z ? o0.f12933i : o0.f12944v;
                    w(MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, 19, hVar15);
                    return hVar15;
                }
                break;
            case 108237:
                if (str.equals("mmm")) {
                    h hVar16 = this.A ? o0.f12933i : o0.f12945w;
                    w(119, 20, hVar16);
                    return hVar16;
                }
                break;
            case 109230:
                if (str.equals("nnn")) {
                    h hVar17 = this.B ? o0.f12933i : o0.f12946x;
                    w(138, 21, hVar17);
                    return hVar17;
                }
                break;
            case 110223:
                if (str.equals("ooo")) {
                    h hVar18 = this.C ? o0.f12933i : o0.f12940r;
                    w(143, 22, hVar18);
                    return hVar18;
                }
                break;
            case 207616302:
                if (str.equals("priceChangeConfirmation")) {
                    h hVar19 = this.f12851o ? o0.f12933i : o0.f12936n;
                    w(35, 4, hVar19);
                    return hVar19;
                }
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    h hVar20 = this.f12849k ? o0.f12933i : o0.l;
                    w(9, 2, hVar20);
                    return hVar20;
                }
                break;
        }
        com.google.android.gms.internal.play_billing.q.h("BillingClient", "Unsupported feature: ".concat(str));
        h hVar21 = o0.f12947y;
        w(34, 1, hVar21);
        return hVar21;
    }

    @Override
    public h e(Activity activity, final g gVar) {
        String str;
        String str2;
        h hVarA;
        m mVar;
        h hVarA2;
        long j9;
        boolean z10;
        String str3;
        Future futureK;
        String str4;
        ?? r7;
        ?? r4;
        ?? r10;
        ?? r11;
        int iA;
        int i10;
        String string;
        String str5;
        boolean z11;
        String str6;
        ArrayList arrayList;
        boolean z12;
        int i11;
        long jNextLong = new Random().nextLong();
        if (this.f12844f == null || ((u) this.f12844f.f9188c) == null) {
            h hVar = o0.E;
            y(12, hVar, jNextLong);
            return hVar;
        }
        gVar.getClass();
        if (!L()) {
            h hVar2 = o0.f12934j;
            y(2, hVar2, jNextLong);
            O(hVar2);
            return hVar2;
        }
        synchronized (this.f12839a) {
            try {
                if (this.f12848j != null) {
                    this.f12848j.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(gVar.f12888e);
        com.google.android.gms.internal.play_billing.r rVar = gVar.f12887d;
        Iterator it = arrayList2.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new ClassCastException();
        }
        com.google.android.gms.internal.play_billing.o oVar = (com.google.android.gms.internal.play_billing.o) rVar.iterator();
        f fVar = (f) (oVar.hasNext() ? oVar.next() : null);
        p pVar = fVar.f12878a;
        String str7 = pVar.f12951c;
        String str8 = pVar.f12952d;
        if (str8.equals("subs") && !this.f12849k) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Current client doesn't support subscriptions.");
            h hVar3 = o0.l;
            A(9, hVar3, jNextLong, false);
            O(hVar3);
            return hVar3;
        }
        if (gVar.f12885b == null) {
            a2.n nVar = gVar.f12886c;
            nVar.getClass();
            if (nVar.f167b == 0 && !gVar.f12884a && !gVar.f12889f) {
                com.google.android.gms.internal.play_billing.r rVar2 = gVar.f12887d;
                if (rVar2 != null) {
                    int size = rVar2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((f) rVar2.get(i12)).getClass();
                    }
                }
            } else if (!this.f12850n) {
                com.google.android.gms.internal.play_billing.q.h("BillingClient", "Current client doesn't support extra params for buy intent.");
                h hVar4 = o0.f12930f;
                A(18, hVar4, jNextLong, false);
                O(hVar4);
                return hVar4;
            }
        } else if (!this.f12850n) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            h hVar5 = o0.f12930f;
            A(18, hVar5, jNextLong, false);
            O(hVar5);
            return hVar5;
        }
        if (arrayList2.size() > 1 && !this.f12856t) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Current client doesn't support multi-item purchases.");
            h hVar6 = o0.f12938p;
            A(19, hVar6, jNextLong, false);
            O(hVar6);
            return hVar6;
        }
        if (!rVar.isEmpty() && !this.f12857u) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            h hVar7 = o0.f12941s;
            A(20, hVar7, jNextLong, false);
            O(hVar7);
            return hVar7;
        }
        com.google.android.gms.internal.play_billing.o oVarListIterator = rVar.listIterator(0);
        while (oVarListIterator.hasNext()) {
            String str9 = ((f) oVarListIterator.next()).f12879b;
            if (str9 != null) {
                if (str9.contains(":") && !this.C) {
                    com.google.android.gms.internal.play_billing.q.h("BillingClient", "Current Play Store version doesn't support gift code purchase.");
                    h hVar8 = o0.f12940r;
                    A(143, hVar8, jNextLong, false);
                    O(hVar8);
                    return hVar8;
                }
            }
        }
        if (!gVar.f12887d.isEmpty()) {
            f fVar2 = (f) gVar.f12887d.get(0);
            int i13 = 1;
            str = null;
            while (true) {
                if (i13 >= gVar.f12887d.size()) {
                    str2 = str7;
                    p pVar2 = fVar2.f12878a;
                    String strOptString = pVar2.f12950b.optString("packageName");
                    HashMap map = new HashMap();
                    HashSet hashSet = new HashSet();
                    com.google.android.gms.internal.play_billing.r rVar3 = gVar.f12887d;
                    int size2 = rVar3.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size2) {
                            com.google.android.gms.internal.play_billing.r rVar4 = rVar3;
                            f fVar3 = (f) rVar3.get(i14);
                            fVar3.getClass();
                            int i15 = size2;
                            p pVar3 = fVar3.f12878a;
                            int i16 = i14;
                            ArrayList arrayList3 = pVar3.f12958j;
                            String str10 = pVar3.f12951c;
                            if (arrayList3 != null && fVar3.f12879b == null) {
                                hVarA = o0.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str10);
                                break;
                            }
                            if (map.containsKey(str10)) {
                                hVarA = o0.a(5, "ProductId can not be duplicated. Invalid product id: " + str10 + ".");
                                break;
                            }
                            map.put(str10, fVar3);
                            if (!pVar2.f12952d.equals("play_pass_subs") && !pVar3.f12952d.equals("play_pass_subs") && !strOptString.equals(pVar3.f12950b.optString("packageName"))) {
                                hVarA = o0.a(5, "All products must have the same package name.");
                                break;
                            }
                            i14 = i16 + 1;
                            size2 = i15;
                            rVar3 = rVar4;
                            hashSet = hashSet;
                        } else {
                            Iterator it2 = hashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    ArrayList arrayList4 = pVar2.f12959k;
                                    String str11 = fVar2.f12879b;
                                    if (str11 != null && arrayList4 != null) {
                                        Iterator it3 = arrayList4.iterator();
                                        do {
                                            if (!it3.hasNext()) {
                                                mVar = null;
                                                break;
                                            }
                                            mVar = (m) it3.next();
                                        } while (!str11.equals(mVar.f12907d));
                                        if (mVar != null && mVar.f12910g != null) {
                                            hVarA = o0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                            break;
                                        }
                                        hVarA = o0.f12933i;
                                        break;
                                    }
                                    hVarA = o0.f12933i;
                                    break;
                                }
                                String str12 = (String) it2.next();
                                if (map.containsKey(str12)) {
                                    ((f) map.get(str12)).getClass();
                                    hVarA = o0.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str12 + ".");
                                    break;
                                }
                            }
                        }
                    }
                    hVarA2 = hVarA;
                    break;
                }
                f fVar4 = (f) gVar.f12887d.get(i13);
                str2 = str7;
                if (!fVar4.f12878a.f12952d.equals(fVar2.f12878a.f12952d) && !fVar4.f12878a.f12952d.equals("play_pass_subs")) {
                    hVarA2 = o0.a(5, "All products should have same ProductType.");
                    break;
                }
                i13++;
                str7 = str2;
            }
        } else {
            str2 = str7;
            hVarA2 = o0.f12933i;
            str = null;
        }
        if (hVarA2 != o0.f12933i) {
            A(108, hVarA2, jNextLong, false);
            O(hVarA2);
            return hVarA2;
        }
        Bundle bundle = null;
        long j10 = r4;
        if (this.f12850n) {
            boolean z13 = this.f12852p;
            boolean z14 = this.f12859w;
            this.D.getClass();
            boolean z15 = this.D.f304a;
            String str13 = this.f12842d;
            long jLongValue = this.G.longValue();
            this.f12845g.getPackageName();
            int i17 = com.google.android.gms.internal.play_billing.q.f4028a;
            z10 = false;
            final Bundle bundle2 = new Bundle();
            com.google.android.gms.internal.play_billing.q.b(bundle2, str13, jLongValue);
            bundle2.putLong("billingClientTransactionId", j10);
            int i18 = gVar.f12886c.f167b;
            if (i18 != 0) {
                bundle2.putInt("prorationMode", i18);
            }
            if (!TextUtils.isEmpty(gVar.f12885b)) {
                bundle2.putString("accountId", gVar.f12885b);
            }
            if (TextUtils.isEmpty(str)) {
                str5 = str;
            } else {
                str5 = str;
                bundle2.putString("obfuscatedProfileId", str5);
            }
            if (gVar.f12889f) {
                bundle2.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!TextUtils.isEmpty(str5)) {
                bundle2.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(str5)));
            }
            if (!TextUtils.isEmpty(gVar.f12886c.f166a)) {
                bundle2.putString("oldSkuPurchaseToken", gVar.f12886c.f166a);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("oldSkuPurchaseId", null);
            }
            gVar.f12886c.getClass();
            if (!TextUtils.isEmpty(null)) {
                gVar.f12886c.getClass();
                bundle2.putString("originalExternalTransactionId", null);
            }
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("paymentsPurchaseParams", null);
            }
            if (z13) {
                z11 = true;
                bundle2.putBoolean("enablePendingPurchases", true);
            } else {
                z11 = true;
            }
            if (z14 && z15) {
                bundle2.putBoolean("enablePendingPurchaseForSubscriptions", z11);
            }
            ArrayList arrayList5 = new ArrayList();
            com.google.android.gms.internal.play_billing.o oVarListIterator2 = gVar.f12887d.listIterator(0);
            while (oVarListIterator2.hasNext()) {
                ((f) oVarListIterator2.next()).getClass();
            }
            if (!arrayList5.isEmpty()) {
                c1 c1VarR = d1.r();
                c1VarR.c();
                d1.s((d1) c1VarR.B, arrayList5);
                bundle2.putByteArray("subscriptionProductReplacementParamsList", ((d1) c1VarR.a()).b());
            }
            if (arrayList2.isEmpty()) {
                ArrayList<String> arrayList6 = new ArrayList<>(rVar.size() - 1);
                ArrayList<String> arrayList7 = new ArrayList<>(rVar.size() - 1);
                ArrayList<String> arrayList8 = new ArrayList<>();
                ArrayList<String> arrayList9 = new ArrayList<>();
                ArrayList<String> arrayList10 = new ArrayList<>();
                ArrayList<Integer> arrayList11 = new ArrayList<>();
                int i19 = 0;
                while (i19 < rVar.size()) {
                    f fVar5 = (f) rVar.get(i19);
                    p pVar4 = fVar5.f12878a;
                    long j11 = j10;
                    if (!pVar4.f12956h.isEmpty()) {
                        arrayList8.add(pVar4.f12956h);
                    }
                    String str14 = fVar5.f12879b;
                    arrayList9.add(str14);
                    if (TextUtils.isEmpty(str14) || (arrayList = pVar4.f12959k) == null || arrayList.isEmpty()) {
                        str6 = pVar4.f12957i;
                        break;
                    }
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            str6 = pVar4.f12957i;
                            break;
                        }
                        m mVar2 = (m) it4.next();
                        Iterator it5 = it4;
                        if (!TextUtils.isEmpty(mVar2.f12909f) && Objects.equals(mVar2.f12907d, str14)) {
                            str6 = mVar2.f12909f;
                            break;
                        }
                        it4 = it5;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        arrayList10.add(str6);
                    }
                    if (i19 > 0) {
                        arrayList6.add(((f) rVar.get(i19)).f12878a.f12951c);
                        arrayList7.add(((f) rVar.get(i19)).f12878a.f12952d);
                    }
                    i19++;
                    j10 = j11;
                }
                j9 = j10;
                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList9);
                if (!arrayList11.isEmpty()) {
                    bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList11);
                }
                if (!arrayList8.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList8);
                }
                if (!arrayList10.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                if (!arrayList6.isEmpty()) {
                    bundle2.putStringArrayList("additionalSkus", arrayList6);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList7);
                }
            } else {
                ArrayList<String> arrayList12 = new ArrayList<>();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                new ArrayList();
                Iterator it6 = arrayList2.iterator();
                if (it6.hasNext()) {
                    throw a1.b.j(it6);
                }
                if (!arrayList12.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList12);
                }
                if (arrayList2.size() > 1) {
                    ArrayList<String> arrayList13 = new ArrayList<>(arrayList2.size() - 1);
                    ArrayList<String> arrayList14 = new ArrayList<>(arrayList2.size() - 1);
                    if (arrayList2.size() > 1) {
                        arrayList2.get(1).getClass();
                        throw new ClassCastException();
                    }
                    bundle2.putStringArrayList("additionalSkus", arrayList13);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList14);
                }
                j9 = j10;
            }
            if (bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f12854r) {
                h hVar9 = o0.f12939q;
                A(21, hVar9, j9, false);
                O(hVar9);
                return hVar9;
            }
            if (TextUtils.isEmpty(fVar.f12878a.f12950b.optString("packageName"))) {
                z12 = false;
            } else {
                bundle2.putString("skuPackageName", fVar.f12878a.f12950b.optString("packageName"));
                z12 = true;
            }
            str3 = null;
            if (!TextUtils.isEmpty(null)) {
                bundle2.putString("accountName", null);
            }
            Intent intent = activity.getIntent();
            if (intent == null) {
                com.google.android.gms.internal.play_billing.q.h("BillingClient", "Activity's intent is null.");
            } else if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle2.putString("proxyPackage", stringExtra);
                try {
                    bundle2.putString("proxyPackageVersion", this.f12845g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle2.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.C) {
                i11 = 28;
            } else if (this.f12857u && !rVar.isEmpty()) {
                i11 = 17;
            } else if (this.f12855s && z12) {
                i11 = 15;
            } else {
                i11 = this.f12852p ? 9 : 6;
            }
            final int i20 = i11;
            final String str15 = str2;
            final String str16 = str8;
            futureK = k(new Callable(i20, str15, str16, gVar, bundle2) {

                public final int f12835b;

                public final String f12836c;

                public final String f12837d;

                public final Bundle f12838e;

                {
                    this.f12838e = bundle2;
                }

                @Override
                public final Object call() {
                    Bundle bundleC;
                    com.google.android.gms.internal.play_billing.c cVar;
                    b bVar = this.f12834a;
                    int i21 = this.f12835b;
                    String str17 = this.f12836c;
                    String str18 = this.f12837d;
                    Bundle bundle3 = this.f12838e;
                    try {
                        synchronized (bVar.f12839a) {
                            cVar = bVar.f12847i;
                        }
                        if (cVar == null) {
                            return com.google.android.gms.internal.play_billing.q.c(107, o0.f12934j);
                        }
                        return ((com.google.android.gms.internal.play_billing.a) cVar).u2(i21, bVar.f12845g.getPackageName(), str17, str18, bundle3);
                    } catch (DeadObjectException e3) {
                        h hVar10 = o0.f12934j;
                        String strA = m0.a(e3);
                        bundleC = com.google.android.gms.internal.play_billing.q.c(5, hVar10);
                        if (strA != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                        }
                        return bundleC;
                    } catch (Exception e10) {
                        h hVar11 = o0.f12932h;
                        String strA2 = m0.a(e10);
                        bundleC = com.google.android.gms.internal.play_billing.q.c(5, hVar11);
                        if (strA2 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                        }
                        return bundleC;
                    }
                }
            }, 5000L, null, this.f12843e, j());
            str4 = str16;
            bundle = bundle2;
        } else {
            j9 = j10;
            z10 = false;
            str3 = str;
            String str17 = str8;
            futureK = k(new ef.a(this, str2, str17, 4), 5000L, null, this.f12843e, j());
            str4 = str17;
        }
        try {
            try {
                if (futureK == null) {
                    try {
                        h hVar10 = o0.f12927c;
                        A(25, hVar10, j9, z10);
                        O(hVar10);
                        return hVar10;
                    } catch (CancellationException | TimeoutException e3) {
                        e = e3;
                        r10 = z10;
                        r11 = j9;
                        com.google.android.gms.internal.play_billing.q.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                        h hVar11 = o0.f12935k;
                        B(4, hVar11, m0.a(e), r11, r10);
                        O(hVar11);
                        return hVar11;
                    } catch (Exception e10) {
                        e = e10;
                        r7 = z10;
                        r4 = j9;
                        com.google.android.gms.internal.play_billing.q.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                        h hVar12 = o0.f12934j;
                        B(5, hVar12, m0.a(e), r4, r7);
                        O(hVar12);
                        return hVar12;
                    }
                }
                boolean z16 = z10;
                long j12 = j9;
                Bundle bundle3 = (Bundle) futureK.get(5000L, TimeUnit.MILLISECONDS);
                int iA2 = com.google.android.gms.internal.play_billing.q.a("BillingClient", bundle3);
                String strF = com.google.android.gms.internal.play_billing.q.f("BillingClient", bundle3);
                if (iA2 == 0) {
                    Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    intent2.putExtra("BUY_INTENT", (PendingIntent) bundle3.getParcelable("BUY_INTENT"));
                    intent2.putExtra("billingClientTransactionId", j12);
                    intent2.putExtra("wasServiceAutoReconnected", z16);
                    activity.startActivity(intent2);
                    return o0.f12933i;
                }
                com.google.android.gms.internal.play_billing.q.h("BillingClient", bi.b.c0(iA2, "Unable to buy item, Error response code: "));
                h hVarA3 = o0.a(iA2, strF);
                if (bundle3 == null) {
                    i10 = 1;
                    iA = 1;
                } else {
                    try {
                        Object obj = bundle3.get("LOG_REASON");
                        if (obj != null) {
                            if (obj instanceof Integer) {
                                iA = x5.a(((Integer) obj).intValue());
                                i10 = 1;
                            } else {
                                com.google.android.gms.internal.play_billing.q.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                            }
                        }
                    } catch (Throwable th3) {
                        com.google.android.gms.internal.play_billing.q.h("BillingClient", "Failed to get log reason from bundle: ".concat(String.valueOf(th3.getMessage())));
                    }
                    i10 = 1;
                    iA = 1;
                }
                if (iA == i10) {
                    iA = 23;
                }
                if (bundle3 == null) {
                    string = str3;
                } else {
                    try {
                        string = bundle3.getString("ADDITIONAL_LOG_DETAILS");
                    } catch (Throwable th4) {
                        com.google.android.gms.internal.play_billing.q.h("BillingClient", "Failed to get additional log details from bundle: ".concat(String.valueOf(th4.getMessage())));
                        string = str3;
                    }
                }
                try {
                    B(iA, hVarA3, string, j12, z16);
                    O(hVarA3);
                    return hVarA3;
                } catch (CancellationException | TimeoutException e11) {
                    e = e11;
                    r11 = j12;
                    r10 = z16;
                    com.google.android.gms.internal.play_billing.q.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    h hVar13 = o0.f12935k;
                    B(4, hVar13, m0.a(e), r11, r10);
                    O(hVar13);
                    return hVar13;
                } catch (Exception e12) {
                    e = e12;
                    r4 = j12;
                    r7 = z16;
                    com.google.android.gms.internal.play_billing.q.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    h hVar14 = o0.f12934j;
                    B(5, hVar14, m0.a(e), r4, r7);
                    O(hVar14);
                    return hVar14;
                }
            } catch (Exception e13) {
                e = e13;
                r4 = str4;
                r7 = bundle;
            }
        } catch (CancellationException | TimeoutException e14) {
            e = e14;
            r11 = str4;
            r10 = bundle;
        }
    }

    @Override
    public void f(w wVar, com.revenuecat.purchases.google.usecase.c cVar) {
        if (k(new ef.a(this, cVar, wVar, 7), NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, new kh.r(this, cVar, 14), l(), j()) == null) {
            h hVarO = o();
            x(25, 7, hVarO);
            com.google.android.gms.internal.play_billing.o oVar = com.google.android.gms.internal.play_billing.r.B;
            com.google.android.gms.internal.play_billing.v vVar = com.google.android.gms.internal.play_billing.v.E;
            cVar.b(hVarO, new x(vVar, vVar));
        }
    }

    @Override
    public final void g(y yVar, t tVar) {
        if (k(new ef.a(this, tVar, yVar.f12976a), NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, new com.google.android.gms.internal.play_billing.r0(this, tVar, 10), l(), j()) == null) {
            h hVarO = o();
            x(25, 9, hVarO);
            com.google.android.gms.internal.play_billing.o oVar = com.google.android.gms.internal.play_billing.r.B;
            tVar.a(hVarO, com.google.android.gms.internal.play_billing.v.E);
        }
    }

    @Override
    public final h h(Activity activity, i iVar, j jVar) {
        if (!L()) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Service disconnected.");
            return o0.f12934j;
        }
        if (!this.f12853q) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Current client doesn't support showing in-app messages.");
            return o0.f12942t;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        if (windowToken == null) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Could not retrieve the window token from the activity instance.");
        }
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        Bundle bundle = new Bundle();
        bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f12841c);
        String str = this.f12842d;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", iVar.f12897a);
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        Handler handler = this.f12843e;
        k(new l1(this, bundle, activity, new ah.d(this, handler, jVar)), 5000L, null, handler, j());
        return o0.f12933i;
    }

    @Override
    public void i(c cVar) {
        J(cVar);
    }

    public final synchronized ExecutorService j() {
        try {
            if (this.F == null) {
                this.F = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.q.f4028a, new c0(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.F;
    }

    public final Handler l() {
        return Looper.myLooper() == null ? this.f12843e : new Handler(Looper.myLooper());
    }

    public final oe.o m(h hVar, int i10, String str, Exception exc) {
        com.google.android.gms.internal.play_billing.q.i("BillingClient", str, exc);
        z(i10, 7, hVar, m0.a(exc));
        return new oe.o(hVar.f12892a, hVar.f12894c, new ArrayList(), new ArrayList());
    }

    public final h n() {
        com.google.android.gms.internal.play_billing.q.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        n3 n3VarS = o3.s();
        n3VarS.c();
        o3.r((o3) n3VarS.B, 6);
        m4 m4VarR = n4.r();
        m4VarR.c();
        n4.w((n4) m4VarR.B);
        m4VarR.e(false);
        m4VarR.f();
        n3VarS.c();
        o3.x((o3) n3VarS.B, (n4) m4VarR.a());
        G((o3) n3VarS.a());
        return o0.f12933i;
    }

    public final h o() {
        int[] iArr = {0, 3};
        synchronized (this.f12839a) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.f12840b == iArr[i10]) {
                    return o0.f12934j;
                }
            }
            return o0.f12932h;
        }
    }

    public final void p() {
        if (TextUtils.isEmpty(null)) {
            this.f12845g.getPackageName();
        }
    }

    public final void r(com.revenuecat.purchases.google.usecase.a aVar, h hVar, int i10, Exception exc) {
        com.google.android.gms.internal.play_billing.q.i("BillingClient", "Error in acknowledge purchase!", exc);
        z(i10, 3, hVar, m0.a(exc));
        aVar.c(hVar);
    }

    public final h1.l v(h hVar, int i10, String str, Exception exc) {
        z(i10, 9, hVar, m0.a(exc));
        com.google.android.gms.internal.play_billing.q.i("BillingClient", str, exc);
        return new h1.l(hVar, (Object) null);
    }

    public final void w(int i10, int i11, h hVar) {
        o3 o3Var = null;
        m3 m3Var = null;
        if (hVar.f12892a == 0) {
            int i12 = m0.f12911a;
            try {
                n3 n3VarS = o3.s();
                n3VarS.c();
                o3.r((o3) n3VarS.B, 5);
                com.google.android.gms.internal.play_billing.y3 y3VarR = z3.r();
                y3VarR.c();
                z3.s((z3) y3VarR.B, i11);
                z3 z3Var = (z3) y3VarR.a();
                n3VarS.c();
                o3.v((o3) n3VarS.B, z3Var);
                o3Var = (o3) n3VarS.a();
            } catch (Exception e3) {
                com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to create logging payload", e3);
            }
            G(o3Var);
            return;
        }
        int i13 = m0.f12911a;
        try {
            l3 l3VarU = m3.u();
            p3 p3VarS = q3.s();
            p3VarS.f(hVar.f12892a);
            String str = hVar.f12894c;
            p3VarS.c();
            q3.u((q3) p3VarS.B, str);
            p3VarS.e(i10);
            l3VarU.e(p3VarS);
            l3VarU.g(5);
            com.google.android.gms.internal.play_billing.y3 y3VarR2 = z3.r();
            y3VarR2.c();
            z3.s((z3) y3VarR2.B, i11);
            z3 z3Var2 = (z3) y3VarR2.a();
            l3VarU.c();
            m3.z((m3) l3VarU.B, z3Var2);
            m3Var = (m3) l3VarU.a();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to create logging payload", e10);
        }
        F(m3Var);
    }

    public final void x(int i10, int i11, h hVar) {
        try {
            int i12 = m0.f12911a;
            F(m0.b(i10, i11, hVar, null, s3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void y(int i10, h hVar, long j9) {
        try {
            int i11 = m0.f12911a;
            try {
                this.f12846h.y(m0.b(i10, 2, hVar, null, s3.BROADCAST_ACTION_UNSPECIFIED), this.m, j9);
            } catch (Throwable th2) {
                com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void z(int i10, int i11, h hVar, String str) {
        try {
            int i12 = m0.f12911a;
            F(m0.b(i10, i11, hVar, str, s3.BROADCAST_ACTION_UNSPECIFIED));
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Unable to log.", th2);
        }
    }
}
