package hf;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.n;

public final class j extends com.google.android.gms.common.internal.k {

    public final Bundle f7056a;

    public j(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, com.google.android.gms.common.api.internal.g gVar, n nVar) {
        super(context, looper, 223, hVar, gVar, nVar);
        this.f7056a = new Bundle();
    }

    @Override
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService", 2);
    }

    @Override
    public final pe.d[] getApiFeatures() {
        return f.f7053c;
    }

    @Override
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f7056a;
    }

    @Override
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
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
