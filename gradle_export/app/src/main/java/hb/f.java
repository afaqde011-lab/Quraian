package hb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import e7.l0;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import qd.j0;

public final class f implements a8.h, fd.e, zd.b, k00.h, fc.b, ge.a, id.c, na.b, q3.z {
    public static final void l(k50.e eVar, long j9, boolean z10) {
        k50.e eVar2;
        ReentrantLock reentrantLock = k50.e.h;
        if (k50.e.l == null) {
            k50.e.l = new k50.e();
            k50.b bVar = new k50.b("Okio Watchdog");
            bVar.setDaemon(true);
            bVar.start();
        }
        long jNanoTime = System.nanoTime();
        if (j9 != 0 && z10) {
            eVar.g = Math.min(j9, eVar.c() - jNanoTime) + jNanoTime;
        } else if (j9 != 0) {
            eVar.g = j9 + jNanoTime;
        } else {
            if (!z10) {
                throw new AssertionError();
            }
            eVar.g = eVar.c();
        }
        long j10 = eVar.g - jNanoTime;
        k50.e eVar3 = k50.e.l;
        kotlin.jvm.internal.m.b(eVar3);
        while (true) {
            eVar2 = eVar3.f;
            if (eVar2 == null || j10 < eVar2.g - jNanoTime) {
                break;
            }
            kotlin.jvm.internal.m.b(eVar2);
            eVar3 = eVar2;
        }
        eVar.f = eVar2;
        eVar3.f = eVar;
        if (eVar3 == k50.e.l) {
            k50.e.i.signal();
        }
    }

    public static k50.e m() throws InterruptedException {
        k50.e eVar = k50.e.l;
        kotlin.jvm.internal.m.b(eVar);
        k50.e eVar2 = eVar.f;
        if (eVar2 == null) {
            long jNanoTime = System.nanoTime();
            k50.e.i.await(k50.e.j, TimeUnit.MILLISECONDS);
            k50.e eVar3 = k50.e.l;
            kotlin.jvm.internal.m.b(eVar3);
            if (eVar3.f != null || System.nanoTime() - jNanoTime < k50.e.k) {
                return null;
            }
            return k50.e.l;
        }
        long jNanoTime2 = eVar2.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            k50.e.i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        k50.e eVar4 = k50.e.l;
        kotlin.jvm.internal.m.b(eVar4);
        eVar4.f = eVar2.f;
        eVar2.f = null;
        eVar2.e = 2;
        return eVar2;
    }

    public static final CharSequence n(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override
    public fd.d a(rc.c cVar) {
        rc.g gVar = cVar.f13151a;
        SharedPreferences sharedPreferences = gVar.f13173b.getSharedPreferences("amplitude-identify-intercept-" + gVar.f13176e, 0);
        String str = gVar.f13176e;
        cd.b bVarM = gVar.f13178g.M(cVar);
        kotlin.jvm.internal.m.b(sharedPreferences);
        return new ad.f(str, bVarM, sharedPreferences, new File(gVar.a(), "identify-intercept"), cVar.f13162n);
    }

    @Override
    public long b(long j9) {
        return j9;
    }

    @Override
    public boolean c(float f3) {
        throw new IllegalStateException("not implemented");
    }

    @Override
    public pc.a d() {
        throw new IllegalStateException("not implemented");
    }

    @Override
    public boolean e(float f3) {
        return false;
    }

    @Override
    public Object f(k00.c cVar) {
        throw null;
    }

    @Override
    public na.c g(l0 l0Var) {
        return new oa.g((Context) l0Var.f5149c, (String) l0Var.f5150d, (j0) l0Var.f5151e, l0Var.f5147a, l0Var.f5148b);
    }

    public Object get() {
        sg.f fVar = new sg.f();
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(ud.d.A, new de.b(NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(ud.d.C, new de.b(1000L, 86400000L, set));
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(de.c.B)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(ud.d.B, new de.b(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < ud.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new de.a(fVar, map);
    }

    @Override
    public long h() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public float i() {
        return 1.0f;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Object j(k00.c cVar) {
        throw null;
    }

    @Override
    public float k() {
        return 0.0f;
    }
}
