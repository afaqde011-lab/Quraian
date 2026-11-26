package nf;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public final class l1 extends com.google.android.gms.common.internal.k {
    @Override
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        return iInterfaceQueryLocalInterface instanceof m1 ? (m1) iInterfaceQueryLocalInterface : new m1(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    @Override
    public final pe.d[] getApiFeatures() {
        return new pe.d[]{af.a.f464b, af.a.f463a};
    }

    @Override
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }

    @Override
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override
    public final boolean usesClientTelemetry() {
        return true;
    }
}
