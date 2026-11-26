package tf;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

public final class f4 implements v1 {

    public final com.google.android.gms.internal.measurement.p0 f14616a;

    public final AppMeasurementDynamiteService f14617b;

    public f4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.p0 p0Var) {
        this.f14617b = appMeasurementDynamiteService;
        this.f14616a = p0Var;
    }

    @Override
    public final void a(long j9, Bundle bundle, String str, String str2) {
        try {
            this.f14616a.K(j9, bundle, str, str2);
        } catch (RemoteException e3) {
            h1 h1Var = this.f14617b.f4066e;
            if (h1Var != null) {
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.J.c(e3, "Event listener threw exception");
            }
        }
    }
}
