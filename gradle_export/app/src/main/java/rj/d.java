package rj;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

public final class d implements com.google.android.gms.common.api.internal.b {

    public static final AtomicReference f13596a = new AtomicReference();

    @Override
    public final void a(boolean z10) {
        Random random = e.f13597j;
        synchronized (e.class) {
            Iterator it = e.f13598k.values().iterator();
            while (it.hasNext()) {
                ((b) it.next()).c(z10);
            }
        }
    }
}
