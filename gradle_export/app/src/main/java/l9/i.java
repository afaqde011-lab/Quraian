package l9;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.List;
import k9.m1;

public final class i extends q {

    public final l f10153e;

    public final String f10154f;

    public final Bundle f10155g;

    public final Bundle f10156h;

    public final m1 f10157i;

    public i(m1 m1Var, String str, l lVar, String str2, Bundle bundle, Bundle bundle2) {
        super(str);
        this.f10157i = m1Var;
        this.f10153e = lVar;
        this.f10154f = str2;
        this.f10155g = bundle;
        this.f10156h = bundle2;
    }

    @Override
    public final void d(Object obj) {
        List list = (List) obj;
        u.e eVar = this.f10157i.E;
        l lVar = this.f10153e;
        h hVar = lVar.f10164e;
        String str = lVar.f10160a;
        hVar.getClass();
        Object obj2 = eVar.get(((Messenger) hVar.f10149a).getBinder());
        String str2 = this.f10154f;
        if (obj2 != lVar) {
            e7.a.b("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
            return;
        }
        try {
            hVar.c(str2, list, this.f10155g, this.f10156h);
        } catch (RemoteException unused) {
            e7.a.m("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
