package k9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import java.util.Objects;

public final class q0 implements ServiceConnection {
    public final Bundle A;
    public final t0 B;

    public q0(t0 t0Var, Bundle bundle) {
        this.B = t0Var;
        this.A = bundle;
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        u uVar = this.B.f9438a;
        Objects.requireNonNull(uVar);
        uVar.b(new androidx.lifecycle.i0(uVar, 26));
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        androidx.lifecycle.i0 i0Var;
        t0 t0Var = this.B;
        f4 f4Var = t0Var.f9442e;
        u uVar = t0Var.f9438a;
        try {
            try {
                if (f4Var.f9293a.j().equals(componentName.getPackageName())) {
                    o oVarD = v2.d(iBinder);
                    if (oVarD != null) {
                        String packageName = t0Var.f9441d.getPackageName();
                        int iMyPid = Process.myPid();
                        Bundle bundle = this.A;
                        uVar.getClass();
                        oVarD.E(t0Var.f9440c, new g(packageName, iMyPid, bundle).b());
                        return;
                    }
                    e7.a.d("MCImplBase", "Service interface is missing.");
                    Objects.requireNonNull(uVar);
                    i0Var = new androidx.lifecycle.i0(uVar, 26);
                } else {
                    e7.a.d("MCImplBase", "Expected connection to " + f4Var.f9293a.j() + " but is connected to " + componentName);
                    Objects.requireNonNull(uVar);
                    i0Var = new androidx.lifecycle.i0(uVar, 26);
                }
            } catch (RemoteException unused) {
                e7.a.m("MCImplBase", "Service " + componentName + " has died prematurely");
                Objects.requireNonNull(uVar);
                i0Var = new androidx.lifecycle.i0(uVar, 26);
            }
            uVar.b(i0Var);
        } catch (Throwable th2) {
            Objects.requireNonNull(uVar);
            uVar.b(new androidx.lifecycle.i0(uVar, 26));
            throw th2;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        u uVar = this.B.f9438a;
        Objects.requireNonNull(uVar);
        uVar.b(new androidx.lifecycle.i0(uVar, 26));
    }
}
