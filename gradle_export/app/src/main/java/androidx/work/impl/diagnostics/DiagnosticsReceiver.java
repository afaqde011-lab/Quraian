package androidx.work.impl.diagnostics;

import ab.y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import kotlin.jvm.internal.m;
import za.v;
import za.x;

public class DiagnosticsReceiver extends BroadcastReceiver {

    public static final String f1915a = v.f("DiagnosticsRcvr");

    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        v vVarD = v.d();
        String str = f1915a;
        vVarD.a(str, "Requesting diagnostics");
        try {
            m.e(context, "context");
            y.l0(context).w((za.y) new x(DiagnosticsWorker.class).b());
        } catch (IllegalStateException e3) {
            v.d().c(str, "WorkManager is not initialized", e3);
        }
    }
}
