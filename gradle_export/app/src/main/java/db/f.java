package db;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import g00.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import za.v;

public final class f extends ConnectivityManager.NetworkCallback {

    public static final f f4847a = new f();

    public static final Object f4848b = new Object();

    public static final LinkedHashMap f4849c = new LinkedHashMap();

    public static NetworkCapabilities f4850d;

    public static boolean f4851e;

    public static Boolean f4852f;

    public static void a() {
        ArrayList<k> arrayList = new ArrayList();
        synchronized (f4848b) {
            try {
                if (f4851e && f4852f != null) {
                    for (Map.Entry entry : f4849c.entrySet()) {
                        u00.k kVar = (u00.k) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        f fVar = f4847a;
                        NetworkCapabilities networkCapabilities = f4850d;
                        fVar.getClass();
                        Boolean bool = f4852f;
                        m.b(bool);
                        arrayList.add(new k(kVar, !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities) ? a.f4844a : new b(7)));
                    }
                    for (k kVar2 : arrayList) {
                        ((u00.k) kVar2.A).invoke((c) kVar2.B);
                    }
                    return;
                }
                v.d().a(h.f4853a, "Not dispatching constraint state yet: isBlocked=" + f4852f + ", capabilitiesInitialized=" + f4851e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void onBlockedStatusChanged(Network network, boolean z10) {
        m.e(network, "network");
        v.d().a(h.f4853a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z10);
        synchronized (f4848b) {
            if (m.a(f4852f, Boolean.valueOf(z10))) {
                return;
            }
            f4852f = Boolean.valueOf(z10);
            a();
        }
    }

    @Override
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        m.e(network, "network");
        m.e(networkCapabilities, "networkCapabilities");
        v.d().a(h.f4853a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f4848b) {
            f4850d = networkCapabilities;
            f4851e = true;
        }
        a();
    }

    @Override
    public final void onLost(Network network) {
        m.e(network, "network");
        v.d().a(h.f4853a, "NetworkRequestConstraintController onLost callback");
        synchronized (f4848b) {
            f4850d = null;
            Iterator it = f4849c.keySet().iterator();
            while (it.hasNext()) {
                ((u00.k) it.next()).invoke(new b(7));
            }
        }
    }
}
