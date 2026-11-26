package bh;

import android.os.IBinder;
import android.os.RemoteException;
import dh.w;
import dh.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class h implements IBinder.DeathRecipient {

    public final int f2504a;

    public final Object f2505b;

    public h(Object obj, int i10) {
        this.f2504a = i10;
        this.f2505b = obj;
    }

    @Override
    public final void binderDied() {
        int i10 = this.f2504a;
        Object obj = this.f2505b;
        switch (i10) {
            case 0:
                l lVar = (l) obj;
                lVar.f2508b.g("reportBinderDeath", new Object[0]);
                if (lVar.f2515i.get() != null) {
                    throw new ClassCastException();
                }
                lVar.f2508b.g("%s : Binder has died.", lVar.f2509c);
                for (g gVar : lVar.f2510d) {
                    RemoteException remoteException = new RemoteException(String.valueOf(lVar.f2509c).concat(" : Binder has died."));
                    xf.g gVar2 = gVar.A;
                    if (gVar2 != null) {
                        gVar2.c(remoteException);
                    }
                }
                lVar.f2510d.clear();
                synchronized (lVar.f2512f) {
                    lVar.c();
                    break;
                }
                return;
            default:
                dh.c cVar = (dh.c) obj;
                w wVar = cVar.f4878b;
                wVar.b("reportBinderDeath", new Object[0]);
                if (cVar.f4886j.get() != null) {
                    throw new ClassCastException();
                }
                wVar.b("%s : Binder has died.", cVar.f4879c);
                ArrayList arrayList = cVar.f4880d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((x) it.next()).a(new RemoteException(String.valueOf(cVar.f4879c).concat(" : Binder has died.")));
                }
                arrayList.clear();
                synchronized (cVar.f4882f) {
                    HashSet hashSet = cVar.f4881e;
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        ((xf.g) it2.next()).c(new RemoteException(String.valueOf(cVar.f4879c).concat(" : Binder has died.")));
                    }
                    hashSet.clear();
                    break;
                }
                return;
        }
    }
}
