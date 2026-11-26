package tf;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

public final class x0 implements ServiceConnection {
    public final String A;
    public final y0 B;

    public x0(y0 y0Var, String str) {
        Objects.requireNonNull(y0Var);
        this.B = y0Var;
        this.A = str;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        y0 y0Var = this.B;
        if (iBinder == null) {
            q0 q0Var = y0Var.f14764b.F;
            h1.g(q0Var);
            q0Var.J.b("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i10 = com.google.android.gms.internal.measurement.b0.f3673e;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            com.google.android.gms.internal.measurement.c0 a0Var = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.c0 ? (com.google.android.gms.internal.measurement.c0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.a0(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
            h1 h1Var = y0Var.f14764b;
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.O.b("Install Referrer Service connected");
            e1 e1Var = h1Var.G;
            h1.g(e1Var);
            e1Var.e1(new kh.r(this, a0Var, this));
        } catch (RuntimeException e3) {
            q0 q0Var3 = y0Var.f14764b.F;
            h1.g(q0Var3);
            q0Var3.J.c(e3, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        q0 q0Var = this.B.f14764b.F;
        h1.g(q0Var);
        q0Var.O.b("Install Referrer Service disconnected");
    }
}
