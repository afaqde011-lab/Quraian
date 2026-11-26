package tf;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;

public final class i3 extends n {

    public final int f14638e;

    public final Object f14639f;

    public i3(Object obj, p1 p1Var, int i10) {
        super(p1Var);
        this.f14638e = i10;
        this.f14639f = obj;
    }

    @Override
    public final void a() {
        switch (this.f14638e) {
            case 0:
                s7.w0 w0Var = (s7.w0) this.f14639f;
                j3 j3Var = (j3) w0Var.D;
                j3Var.V0();
                h1 h1Var = (h1) j3Var.B;
                h1Var.K.getClass();
                w0Var.h(SystemClock.elapsedRealtime(), false, false);
                v vVar = h1Var.N;
                h1.d(vVar);
                h1Var.K.getClass();
                vVar.Y0(SystemClock.elapsedRealtime());
                break;
            case 1:
                o3 o3Var = (o3) this.f14639f;
                o3Var.Z0();
                q0 q0Var = ((h1) o3Var.B).F;
                h1.g(q0Var);
                q0Var.O.b("Starting upload from DelayedRunnable");
                o3Var.C.l();
                break;
            default:
                y3 y3Var = (y3) this.f14639f;
                y3Var.C().V0();
                String str = (String) y3Var.Q.pollFirst();
                if (str != null) {
                    ((ve.b) y3Var.k0()).getClass();
                    y3Var.f14776i0 = SystemClock.elapsedRealtime();
                    y3Var.t().O.c(str, "Sending trigger URI notification to app");
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intent.setPackage(str);
                    Context context = y3Var.L.A;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                    }
                }
                y3Var.E();
                break;
        }
    }
}
