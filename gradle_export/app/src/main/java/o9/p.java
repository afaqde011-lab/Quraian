package o9;

import java.util.ArrayList;
import java.util.concurrent.Executor;

public abstract class p extends r {

    public final Object f11842a = new Object();

    public Executor f11843b;

    public a f11844c;

    public m f11845d;

    public ArrayList f11846e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(m mVar, ArrayList arrayList) {
        if (mVar == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.f11842a) {
            try {
                Executor executor = this.f11843b;
                if (executor != null) {
                    executor.execute(new ab.k((Object) this, (Object) this.f11844c, (Object) mVar, (Object) arrayList, 14));
                } else {
                    this.f11845d = mVar;
                    this.f11846e = new ArrayList(arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(ArrayList arrayList);
}
