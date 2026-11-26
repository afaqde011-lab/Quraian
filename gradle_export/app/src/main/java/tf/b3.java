package tf;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public final class b3 implements ServiceConnection, com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {
    public volatile boolean A;
    public volatile n0 B;
    public final c3 C;

    public b3(c3 c3Var) {
        this.C = c3Var;
    }

    @Override
    public final void b(Bundle bundle) {
        e1 e1Var = ((h1) this.C.B).G;
        h1.g(e1Var);
        e1Var.a1();
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.d0.h(this.B);
                e0 e0Var = (e0) this.B.getService();
                e1 e1Var2 = ((h1) this.C.B).G;
                h1.g(e1Var2);
                e1Var2.e1(new kh.r(21, this, e0Var, false));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.B = null;
                this.A = false;
            }
        }
    }

    @Override
    public final void d(pe.b bVar) {
        c3 c3Var = this.C;
        e1 e1Var = ((h1) c3Var.B).G;
        h1.g(e1Var);
        e1Var.a1();
        q0 q0Var = ((h1) c3Var.B).F;
        if (q0Var == null || !q0Var.C) {
            q0Var = null;
        }
        if (q0Var != null) {
            q0Var.O.c(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.A = false;
            this.B = null;
        }
        e1 e1Var2 = ((h1) this.C.B).G;
        h1.g(e1Var2);
        e1Var2.e1(new com.google.android.gms.internal.play_billing.r0(21, this, bVar, false));
    }

    @Override
    public final void f(int i10) {
        h1 h1Var = (h1) this.C.B;
        e1 e1Var = h1Var.G;
        h1.g(e1Var);
        e1Var.a1();
        q0 q0Var = h1Var.F;
        h1.g(q0Var);
        q0Var.N.b("Service connection suspended");
        e1 e1Var2 = h1Var.G;
        h1.g(e1Var2);
        e1Var2.e1(new a50.d(this, 21));
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e1 e1Var = ((h1) this.C.B).G;
        h1.g(e1Var);
        e1Var.a1();
        synchronized (this) {
            if (iBinder == null) {
                this.A = false;
                q0 q0Var = ((h1) this.C.B).F;
                h1.g(q0Var);
                q0Var.G.b("Service connected with null binder");
                return;
            }
            Object c0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c0Var = iInterfaceQueryLocalInterface instanceof e0 ? (e0) iInterfaceQueryLocalInterface : new c0(iBinder);
                    q0 q0Var2 = ((h1) this.C.B).F;
                    h1.g(q0Var2);
                    q0Var2.O.b("Bound to IMeasurementService interface");
                } else {
                    q0 q0Var3 = ((h1) this.C.B).F;
                    h1.g(q0Var3);
                    q0Var3.G.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                q0 q0Var4 = ((h1) this.C.B).F;
                h1.g(q0Var4);
                q0Var4.G.b("Service connect failed to get IMeasurementService");
            }
            if (c0Var == null) {
                this.A = false;
                try {
                    ue.a aVarB = ue.a.b();
                    c3 c3Var = this.C;
                    aVarB.c(((h1) c3Var.B).A, c3Var.D);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                e1 e1Var2 = ((h1) this.C.B).G;
                h1.g(e1Var2);
                e1Var2.e1(new com.google.android.gms.internal.play_billing.r0(20, this, c0Var, false));
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        h1 h1Var = (h1) this.C.B;
        e1 e1Var = h1Var.G;
        h1.g(e1Var);
        e1Var.a1();
        q0 q0Var = h1Var.F;
        h1.g(q0Var);
        q0Var.N.b("Service disconnected");
        e1 e1Var2 = h1Var.G;
        h1.g(e1Var2);
        e1Var2.e1(new kh.r(20, this, componentName, false));
    }
}
