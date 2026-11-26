package wf;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ve.e;
import ve.f;
import xf.k;

public final class a {

    public static final long f16067n = TimeUnit.DAYS.toMillis(366);

    public static volatile ScheduledExecutorService f16068o = null;

    public static final Object f16069p = new Object();

    public final Object f16070a;

    public final PowerManager.WakeLock f16071b;

    public int f16072c;

    public ScheduledFuture f16073d;

    public long f16074e;

    public final HashSet f16075f;

    public boolean f16076g;

    public pf.a f16077h;

    public final ve.b f16078i;

    public final String f16079j;

    public final HashMap f16080k;
    public final AtomicInteger l;
    public final ScheduledExecutorService m;

    public a(Context context) {
        boolean zBooleanValue;
        String packageName = context.getPackageName();
        this.f16070a = new Object();
        this.f16072c = 0;
        this.f16075f = new HashSet();
        this.f16076g = true;
        this.f16078i = ve.b.f15619a;
        this.f16080k = new HashMap();
        this.l = new AtomicInteger(0);
        d0.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f16077h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f16079j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f16079j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f16071b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        Method method = f.f15629a;
        synchronized (f.class) {
            Boolean bool = f.f15631c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = n4.b.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
                f.f15631c = Boolean.valueOf(zBooleanValue);
            }
        }
        if (zBooleanValue) {
            int i10 = e.f15628a;
            packageName = packageName == null || packageName.trim().isEmpty() ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = xe.b.a(context).a(0, packageName);
                    if (applicationInfoA == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i11 = applicationInfoA.uid;
                        workSource = new WorkSource();
                        Method method2 = f.f15630b;
                        if (method2 != null) {
                            try {
                                method2.invoke(workSource, Integer.valueOf(i11), packageName);
                            } catch (Exception e3) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                            }
                        } else {
                            Method method3 = f.f15629a;
                            if (method3 != null) {
                                try {
                                    method3.invoke(workSource, Integer.valueOf(i11));
                                } catch (Exception e10) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f16071b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e11) {
                    Log.wtf("WakeLock", e11.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f16068o;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f16069p) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f16068o;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f16068o = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.m = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j9) {
        this.l.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f16067n), 1L);
        if (j9 > 0) {
            jMax = Math.min(j9, jMax);
        }
        synchronized (this.f16070a) {
            try {
                if (!b()) {
                    this.f16077h = pf.a.A;
                    this.f16071b.acquire();
                    this.f16078i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f16072c++;
                if (this.f16076g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f16080k.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f16080k.put(null, bVar);
                }
                bVar.f16081a++;
                this.f16078i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j10 > this.f16074e) {
                    this.f16074e = j10;
                    ScheduledFuture scheduledFuture = this.f16073d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f16073d = this.m.schedule(new k(this, 1), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f16070a) {
            z10 = this.f16072c > 0;
        }
        return z10;
    }

    public final void c() {
        if (this.l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f16079j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f16070a) {
            try {
                if (this.f16076g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f16080k.containsKey(null)) {
                    b bVar = (b) this.f16080k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f16081a - 1;
                        bVar.f16081a = i10;
                        if (i10 == 0) {
                            this.f16080k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f16079j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f16075f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f16070a) {
            try {
                if (b()) {
                    if (this.f16076g) {
                        int i10 = this.f16072c - 1;
                        this.f16072c = i10;
                        if (i10 > 0) {
                            return;
                        }
                    } else {
                        this.f16072c = 0;
                    }
                    d();
                    Iterator it = this.f16080k.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f16081a = 0;
                    }
                    this.f16080k.clear();
                    ScheduledFuture scheduledFuture = this.f16073d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f16073d = null;
                        this.f16074e = 0L;
                    }
                    if (this.f16071b.isHeld()) {
                        try {
                            try {
                                this.f16071b.release();
                                if (this.f16077h != null) {
                                    this.f16077h = null;
                                }
                            } catch (RuntimeException e3) {
                                if (!e3.getClass().equals(RuntimeException.class)) {
                                    throw e3;
                                }
                                Log.e("WakeLock", String.valueOf(this.f16079j).concat(" failed to release!"), e3);
                                if (this.f16077h != null) {
                                    this.f16077h = null;
                                }
                            }
                        } catch (Throwable th2) {
                            if (this.f16077h != null) {
                                this.f16077h = null;
                            }
                            throw th2;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f16079j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
