package se;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.t;
import pe.d;

public final class c extends k {

    public final t f14141a;

    public c(Context context, Looper looper, h hVar, t tVar, g gVar, n nVar) {
        super(context, looper, 270, hVar, gVar, nVar);
        this.f14141a = tVar;
    }

    @Override
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 3);
    }

    @Override
    public final d[] getApiFeatures() {
        return kf.c.f9658b;
    }

    @Override
    public final Bundle getGetServiceRequestExtraArgs() {
        t tVar = this.f14141a;
        tVar.getClass();
        Bundle bundle = new Bundle();
        String str = tVar.A;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
