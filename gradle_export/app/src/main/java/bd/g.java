package bd;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.m;
import me.i;

public final class g extends ConnectivityManager.NetworkCallback {

    public f f2494a;

    public final ConnectivityManager f2495b;

    public final i f2496c;

    public g(ConnectivityManager connectivityManager, i iVar) {
        this.f2495b = connectivityManager;
        this.f2496c = iVar;
    }

    @Override
    public final void onAvailable(Network network) {
        m.e(network, "network");
        NetworkCapabilities networkCapabilities = this.f2495b.getNetworkCapabilities(network);
        wi.b bVar = (wi.b) this.f2496c.B;
        boolean z10 = true;
        if (networkCapabilities != null) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (!networkCapabilities.hasCapability(12) || !zHasCapability) {
                z10 = false;
            }
        }
        f fVar = new f();
        fVar.C = network;
        fVar.D = bVar;
        fVar.A = z10;
        fVar.B = false;
        fVar.f();
        this.f2494a = fVar;
    }

    @Override
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        m.e(network, "network");
        f fVar = this.f2494a;
        if (fVar != null) {
            f.i(fVar, network, false, z10, 2);
        }
    }

    @Override
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        m.e(network, "network");
        m.e(networkCapabilities, "networkCapabilities");
        f fVar = this.f2494a;
        if (fVar != null) {
            f.i(fVar, network, networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16), false, 4);
        }
    }

    @Override
    public final void onLost(Network network) {
        m.e(network, "network");
        f fVar = this.f2494a;
        if (fVar != null) {
            f.i(fVar, network, false, false, 4);
        }
    }

    @Override
    public final void onUnavailable() {
        rc.c cVar = (rc.c) ((wi.b) this.f2496c.B).B;
        cVar.f().b("AndroidNetworkListener, onNetworkUnavailable.");
        cVar.f13151a.f13186q = Boolean.TRUE;
    }
}
