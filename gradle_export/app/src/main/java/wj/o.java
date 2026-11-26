package wj;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public final class o {

    public final bi.g f16192a;

    public final zj.j f16193b;

    public o(bi.g gVar, zj.j jVar, k00.i iVar, s0 s0Var) {
        kotlin.jvm.internal.m.e(gVar, "firebaseApp");
        kotlin.jvm.internal.m.e(jVar, "settings");
        kotlin.jvm.internal.m.e(iVar, "backgroundDispatcher");
        kotlin.jvm.internal.m.e(s0Var, "sessionsActivityLifecycleCallbacks");
        this.f16192a = gVar;
        this.f16193b = jVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.3.");
        gVar.a();
        Context applicationContext = gVar.f2531a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(s0Var);
            a40.c0.y(a40.c0.c(iVar), (k00.i) null, (a40.a0) null, new rm.c(this, s0Var, (k00.c) null, 21), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
