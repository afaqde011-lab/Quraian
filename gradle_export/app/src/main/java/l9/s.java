package l9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;
import k9.m1;

public final class s implements Runnable {
    public final h A;
    public final int B;
    public final String C;
    public final int D;
    public final h E;

    public s(h hVar, h hVar2, int i10, String str, int i11, Bundle bundle) {
        this.E = hVar;
        this.A = hVar2;
        this.B = i10;
        this.C = str;
        this.D = i11;
    }

    @Override
    public final void run() {
        l lVar;
        h hVar = this.A;
        IBinder binder = ((Messenger) hVar.f10149a).getBinder();
        h hVar2 = this.E;
        ((m1) hVar2.f10149a).E.remove(binder);
        m1 m1Var = (m1) hVar2.f10149a;
        Iterator it = m1Var.D.iterator();
        while (true) {
            lVar = null;
            if (!it.hasNext()) {
                break;
            }
            l lVar2 = (l) it.next();
            if (lVar2.f10162c == this.B) {
                lVar = (TextUtils.isEmpty(this.C) || this.D <= 0) ? new l(m1Var, lVar2.f10160a, lVar2.f10161b, lVar2.f10162c, hVar) : null;
                it.remove();
                break;
            }
        }
        if (lVar == null) {
            lVar = new l(m1Var, this.C, this.D, this.B, hVar);
        }
        m1Var.E.put(binder, lVar);
        try {
            binder.linkToDeath(lVar, 0);
        } catch (RemoteException unused) {
            e7.a.m("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
