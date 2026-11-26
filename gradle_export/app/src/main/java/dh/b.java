package dh;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public final class b extends x {
    public final int B = 0;
    public final Object C;

    public b(bh.k kVar) {
        this.C = kVar;
    }

    public b(c cVar) {
        Objects.requireNonNull(cVar);
        this.C = cVar;
    }

    @Override
    public final void b() {
        switch (this.B) {
            case 0:
                c cVar = (c) ((bh.k) this.C).B;
                cVar.f4878b.b("unlinkToDeath", new Object[0]);
                ((s) cVar.f4888n).f4893e.unlinkToDeath(cVar.f4887k, 0);
                cVar.f4888n = null;
                cVar.f4883g = false;
                return;
            default:
                c cVar2 = (c) this.C;
                synchronized (cVar2.f4882f) {
                    try {
                        if (cVar2.l.get() > 0 && cVar2.l.decrementAndGet() > 0) {
                            cVar2.f4878b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (cVar2.f4888n != null) {
                            cVar2.f4878b.b("Unbind from service.", new Object[0]);
                            cVar2.f4877a.unbindService(cVar2.m);
                            cVar2.f4883g = false;
                            cVar2.f4888n = null;
                            cVar2.m = null;
                        }
                        HashSet hashSet = cVar2.f4881e;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((xf.g) it.next()).c(new RemoteException(String.valueOf(cVar2.f4879c).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
        }
    }
}
