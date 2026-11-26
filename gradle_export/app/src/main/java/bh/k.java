package bh;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.q;
import java.util.Objects;
import qd.l0;

public final class k implements ServiceConnection {
    public final int A;
    public final Object B;

    public k(dh.c cVar) {
        this.A = 1;
        Objects.requireNonNull(cVar);
        this.B = cVar;
    }

    public k(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.h eVar;
        switch (this.A) {
            case 0:
                l lVar = (l) this.B;
                lVar.f2508b.g("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                lVar.a().post(new ah.f(this, iBinder));
                break;
            case 1:
                dh.c cVar = (dh.c) this.B;
                cVar.f4878b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                cVar.a().post(new dh.a(this, iBinder));
                break;
            default:
                q.g("BillingClientTesting", "Billing Override Service connected.");
                l0 l0Var = (l0) this.B;
                int i10 = com.google.android.gms.internal.play_billing.f.f3966f;
                if (iBinder == null) {
                    eVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    eVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.h ? (com.google.android.gms.internal.play_billing.h) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.e(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
                }
                l0Var.K = eVar;
                l0Var.J = 2;
                l0Var.V(26);
                break;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.A) {
            case 0:
                l lVar = (l) this.B;
                lVar.f2508b.g("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                lVar.a().post(new j(this, 1));
                break;
            case 1:
                dh.c cVar = (dh.c) this.B;
                cVar.f4878b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                cVar.a().post(new dh.b(this));
                break;
            default:
                q.h("BillingClientTesting", "Billing Override Service disconnected.");
                l0 l0Var = (l0) this.B;
                l0Var.K = null;
                l0Var.J = 0;
                break;
        }
    }
}
