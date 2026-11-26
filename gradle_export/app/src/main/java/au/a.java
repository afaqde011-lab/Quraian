package au;

import a1.z;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import d40.o;
import d40.p1;
import g00.p;
import kotlin.jvm.internal.m;

public final class a extends ConnectivityManager.NetworkCallback {
    public static final int d = 0;
    public final Context a;
    public final p b = rd.a.J(new z(this, 6));
    public final p1 c = o.c(Boolean.FALSE);

    public a(Context context) {
        this.a = context;
    }

    @Override
    public final void onAvailable(Network network) {
        p1 p1Var;
        Object value;
        m.e(network, "network");
        do {
            p1Var = this.c;
            value = p1Var.getValue();
            ((Boolean) value).getClass();
        } while (!p1Var.i(value, Boolean.TRUE));
    }

    @Override
    public final void onLost(Network network) {
        p1 p1Var;
        Object value;
        m.e(network, "network");
        do {
            p1Var = this.c;
            value = p1Var.getValue();
            ((Boolean) value).getClass();
        } while (!p1Var.i(value, Boolean.FALSE));
    }
}
