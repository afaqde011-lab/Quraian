package hf;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.n;

public final class e extends com.google.android.gms.common.internal.k {

    public final Bundle f7050a;

    public e(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.internal.g gVar, n nVar) {
        super(context, looper, 212, hVar, gVar, nVar);
        this.f7050a = new Bundle();
    }

    @Override
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new l(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService", 2);
    }

    @Override
    public final pe.d[] getApiFeatures() {
        return f.f7053c;
    }

    @Override
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f7050a;
    }

    @Override
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
    }

    @Override
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override
    public final boolean usesClientTelemetry() {
        return true;
    }
}
