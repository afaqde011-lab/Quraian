package za;

import android.content.Context;
import androidx.work.WorkerParameters;

public final class i {

    public static final i f17381a = new i();

    public static final i f17382b = new i();

    public u a(Context context, String str, WorkerParameters workerParameters) {
        kotlin.jvm.internal.m.e(context, "appContext");
        kotlin.jvm.internal.m.e(str, "workerClassName");
        kotlin.jvm.internal.m.e(workerParameters, "workerParameters");
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(u.class);
            kotlin.jvm.internal.m.b(clsAsSubclass);
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                kotlin.jvm.internal.m.b(objNewInstance);
                u uVar = (u) objNewInstance;
                if (!uVar.f17400e) {
                    return uVar;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th2) {
                v.d().c(l0.f17390a, "Could not instantiate ".concat(str), th2);
                throw th2;
            }
        } catch (Throwable th3) {
            v.d().c(l0.f17390a, "Invalid class: ".concat(str), th3);
            throw th3;
        }
    }
}
