package o9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cast.a3;
import java.util.ArrayList;
import java.util.List;

public final class s0 extends t implements ServiceConnection {
    public static final int Q = 0;
    public final ComponentName I;
    public final a3 J;
    public final ArrayList K;
    public boolean L;
    public boolean M;
    public n0 N;
    public boolean O;
    public k7.t P;

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public s0(Context context, ComponentName componentName) {
        super(context, new q(componentName, 0));
        this.K = new ArrayList();
        this.I = componentName;
        this.J = new a3();
    }

    @Override
    public final p a(String str, s sVar) {
        if (str == null) {
            throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
        }
        b20.z zVar = this.G;
        if (zVar == null) {
            return null;
        }
        List list = zVar.b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m) list.get(i10)).d().equals(str)) {
                q0 q0Var = new q0(this, str, sVar);
                this.K.add(q0Var);
                if (this.O) {
                    q0Var.b(this.N);
                }
                l();
                return q0Var;
            }
        }
        return null;
    }

    @Override
    public final r c(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return i(str, str2, s.f11865b);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    @Override
    public final r d(String str, s sVar) {
        if (str != null) {
            return i(str, null, sVar);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override
    public final void e(n nVar) {
        if (this.O) {
            n0 n0Var = this.N;
            int i10 = n0Var.f11831d;
            n0Var.f11831d = i10 + 1;
            n0Var.b(10, i10, 0, nVar != null ? nVar.f11826a : null, null);
        }
        l();
    }

    public final void h() {
        if (this.M) {
            return;
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.I);
        try {
            this.M = this.A.bindService(intent, this, 4097);
        } catch (SecurityException unused) {
        }
    }

    public final r0 i(String str, String str2, s sVar) {
        b20.z zVar = this.G;
        if (zVar == null) {
            return null;
        }
        List list = zVar.b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m) list.get(i10)).d().equals(str)) {
                r0 r0Var = new r0(this, str, str2, sVar);
                this.K.add(r0Var);
                if (this.O) {
                    r0Var.b(this.N);
                }
                l();
                return r0Var;
            }
        }
        return null;
    }

    public final void j() {
        if (this.N != null) {
            f(null);
            this.O = false;
            ArrayList arrayList = this.K;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((o0) arrayList.get(i10)).c();
            }
            n0 n0Var = this.N;
            n0Var.b(2, 0, 0, null, null);
            n0Var.f11829b.f8380b.clear();
            n0Var.f11828a.getBinder().unlinkToDeath(n0Var, 0);
            n0Var.f11836i.J.post(new m0(n0Var, 0));
            this.N = null;
        }
    }

    public final void k() {
        if (this.M) {
            this.M = false;
            j();
            try {
                this.A.unbindService(this);
            } catch (IllegalArgumentException e3) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e3);
            }
        }
    }

    public final void l() {
        if (!this.L || (this.E == null && this.K.isEmpty())) {
            k();
        } else {
            h();
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.M) {
            j();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        n0 n0Var = new n0(this, messenger);
                        int i10 = n0Var.f11831d;
                        n0Var.f11831d = i10 + 1;
                        n0Var.f11834g = i10;
                        if (n0Var.b(1, i10, 4, null, null)) {
                            try {
                                n0Var.f11828a.getBinder().linkToDeath(n0Var, 0);
                                this.N = n0Var;
                                return;
                            } catch (RemoteException unused) {
                                n0Var.binderDied();
                                return;
                            }
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        j();
    }

    public final String toString() {
        return "Service connection " + this.I.flattenToShortString();
    }
}
