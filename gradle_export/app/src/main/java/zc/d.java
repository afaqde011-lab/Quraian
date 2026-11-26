package zc;

import a40.a0;
import a40.c0;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import bd.g;
import kotlin.jvm.internal.m;
import l9.f0;
import lu.w;
import me.i;

public final class d implements hd.c {
    public final hd.b A = hd.b.A;

    @Override
    public final void a(rc.c cVar) {
        cVar.f().b("Installing AndroidNetworkConnectivityPlugin, offline feature should be supported.");
        Context context = cVar.f13151a.f13173b;
        c0.y(cVar.f13153c, cVar.f13156f, (a0) null, new w(cVar, new f0(context, cVar.f()), (k00.c) null, 26), 2);
        wi.b bVar = new wi.b(cVar, 13);
        cd.b bVarF = cVar.f();
        i iVar = new i(context, bVarF, bVar);
        m.e(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            bVarF.b("ACCESS_NETWORK_STATE permission not granted, skipping network listener setup");
            return;
        }
        try {
            Object systemService = context.getSystemService("connectivity");
            m.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new g(connectivityManager, iVar));
        } catch (Throwable th2) {
            bVarF.c("Error starting network listener: " + th2.getMessage());
        }
    }

    @Override
    public final hd.b getType() {
        return this.A;
    }
}
