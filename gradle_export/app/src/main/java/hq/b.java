package hq;

import ab.r;
import android.content.Context;
import androidx.fragment.app.i1;
import androidx.fragment.app.o0;
import androidx.mediarouter.app.i;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import d40.o;
import d40.p1;
import gi.c;
import gz.e1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.m;
import vp.x;

public final class b implements gq.a {
    public final x a;
    public final Context b;
    public final p1 c = o.c(Boolean.FALSE);
    public final c d = new c(this, 3);
    public final AtomicInteger e = new AtomicInteger(0);

    public b(Context context, x xVar) {
        this.a = xVar;
        this.b = context.getApplicationContext();
    }

    public final void a(CastContext castContext) {
        AtomicInteger atomicInteger = this.e;
        if (atomicInteger.get() == 2) {
            return;
        }
        castContext.getSessionManager().addSessionManagerListener(this.d, CastSession.class);
        if (this.a.k()) {
            CastSession currentCastSession = castContext.getSessionManager().getCurrentCastSession();
            boolean z = false;
            if (currentCastSession != null && currentCastSession.isConnected()) {
                z = true;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            p1 p1Var = this.c;
            p1Var.getClass();
            p1Var.k(null, boolValueOf);
        } else {
            b();
        }
        atomicInteger.set(2);
    }

    public final void b() {
        Boolean bool = Boolean.FALSE;
        p1 p1Var = this.c;
        p1Var.getClass();
        p1Var.k(null, bool);
        try {
            CastContext sharedInstance = CastContext.getSharedInstance(this.b);
            m.d(sharedInstance, "getSharedInstance(...)");
            if (sharedInstance.getSessionManager().getCurrentCastSession() != null) {
                sharedInstance.getSessionManager().endCurrentSession(true);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void c() {
        Context context = this.b;
        AtomicInteger atomicInteger = this.e;
        if (atomicInteger.get() == 2) {
            return;
        }
        if (atomicInteger.compareAndSet(0, 1) || atomicInteger.get() == 1) {
            try {
                CastContext sharedInstance = CastContext.getSharedInstance(context);
                m.d(sharedInstance, "getSharedInstance(...)");
                a(sharedInstance);
            } catch (IllegalStateException unused) {
                CastContext.getSharedInstance(context, a.a).g(new r(new e1(1, this, b.class, "attachToCastContext", "attachToCastContext(Lcom/google/android/gms/cast/framework/CastContext;)V", 0, 1), 18)).e(new r(this, 19));
            }
        }
    }

    public final void d(o0 o0Var) {
        if (!this.a.k() || o0Var.isFinishing() || o0Var.isDestroyed()) {
            return;
        }
        c();
        try {
            CastContext sharedInstance = CastContext.getSharedInstance(this.b);
            m.b(sharedInstance);
            if (this.e.get() != 2) {
                a(sharedInstance);
            }
            i1 supportFragmentManager = o0Var.getSupportFragmentManager();
            m.d(supportFragmentManager, "getSupportFragmentManager(...)");
            if (supportFragmentManager.D("cast_device_picker") != null) {
                return;
            }
            i iVar = new i();
            if (!supportFragmentManager.O()) {
                iVar.show(supportFragmentManager, "cast_device_picker");
                return;
            }
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.c(0, iVar, "cast_device_picker", 1);
            aVar.f(true, true);
        } catch (IllegalStateException unused) {
        }
    }
}
