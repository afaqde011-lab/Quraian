package oj;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class a0 extends Binder {

    public final o10.b f12083e;

    public a0(o10.b bVar) {
        this.f12083e = bVar;
    }

    public final void a(b0 b0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = b0Var.f12086a;
        g gVar = (g) this.f12083e.B;
        xf.g gVar2 = new xf.g();
        gVar.A.execute(new ab.e(gVar, intent, gVar2, 23));
        gVar2.f16565a.c(new f5.d(0), new k7.t(b0Var, 15));
    }
}
