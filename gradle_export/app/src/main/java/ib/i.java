package ib;

import android.app.Application;
import android.content.Context;
import za.v;

public abstract class i {
    static {
        kotlin.jvm.internal.m.d(v.f("ProcessUtils"), "tagWithPrefix(...)");
    }

    public static final boolean a(Context context, za.b bVar) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(bVar, "configuration");
        String processName = Application.getProcessName();
        kotlin.jvm.internal.m.d(processName, "getProcessName(...)");
        return processName.equals(context.getApplicationInfo().processName);
    }
}
