package wj;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

public final class s0 implements Application.ActivityLifecycleCallbacks {
    public final x0 A;

    public s0(x0 x0Var) {
        kotlin.jvm.internal.m.e(x0Var, "sharedSessionRepository");
        this.A = x0Var;
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        this.A.b();
    }

    @Override
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
        x0 x0Var = this.A;
        x0Var.f16224i = true;
        f0 f0Var = x0Var.f16223h;
        if (f0Var == null) {
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        if (f0Var == null) {
            kotlin.jvm.internal.m.k("localSessionData");
            throw null;
        }
        Log.d("FirebaseSessions", "App foregrounded on " + x0Var.f16221f.a());
        if (x0Var.d(f0Var) || x0Var.c(f0Var)) {
            a40.c0.y(a40.c0.c(x0Var.f16222g), (k00.i) null, (a40.a0) null, new rm.c(x0Var, f0Var, (k00.c) null, 22), 3);
        }
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
        kotlin.jvm.internal.m.e(bundle, "outState");
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }
}
