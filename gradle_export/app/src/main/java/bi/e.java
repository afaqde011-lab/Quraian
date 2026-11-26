package bi;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class e implements com.google.android.gms.common.api.internal.b {

    public static final AtomicReference f2527a = new AtomicReference();

    @Override
    public final void a(boolean z10) {
        synchronized (g.f2530k) {
            try {
                for (g gVar : new ArrayList(g.l.values())) {
                    if (gVar.f2535e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.f2539i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f2526a;
                            if (!z10) {
                                ((gj.d) gVar2.f2538h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
