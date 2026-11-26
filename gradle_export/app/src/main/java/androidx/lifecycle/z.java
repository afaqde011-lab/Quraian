package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class z extends Service implements w {
    public final a1.i A = new a1.i(this);

    @Override
    public final q getLifecycle() {
        return (y) this.A.B;
    }

    @Override
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.m.e(intent, "intent");
        a1.i iVar = this.A;
        iVar.getClass();
        iVar.t(o.ON_START);
        return null;
    }

    @Override
    public void onCreate() {
        a1.i iVar = this.A;
        iVar.getClass();
        iVar.t(o.ON_CREATE);
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        a1.i iVar = this.A;
        iVar.getClass();
        iVar.t(o.ON_STOP);
        iVar.t(o.ON_DESTROY);
        super.onDestroy();
    }

    @Override
    public final void onStart(Intent intent, int i10) {
        a1.i iVar = this.A;
        iVar.getClass();
        iVar.t(o.ON_START);
        super.onStart(intent, i10);
    }
}
