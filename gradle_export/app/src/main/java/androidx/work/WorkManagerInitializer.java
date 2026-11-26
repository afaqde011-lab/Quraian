package androidx.work;

import ab.a0;
import ab.y;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.m;
import ra.b;
import za.i;
import za.v;

public final class WorkManagerInitializer implements b {

    public static final String f1901a = v.f("WrkMgrInitializer");

    @Override
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override
    public final Object b(Context context) {
        v.d().a(f1901a, "Initializing WorkManager with default configuration.");
        za.b bVar = new za.b(new i());
        m.e(context, "context");
        synchronized (y.m) {
            try {
                y yVar = y.f417k;
                if (yVar != null && y.l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (yVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (y.l == null) {
                        y.l = a0.K(applicationContext, bVar);
                    }
                    y.f417k = y.l;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y.l0(context);
    }
}
