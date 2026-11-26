package tf;

import android.os.IBinder;
import android.os.IInterface;

public final class n0 extends com.google.android.gms.common.internal.f {
    @Override
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof e0 ? (e0) iInterfaceQueryLocalInterface : new c0(iBinder);
    }

    @Override
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
