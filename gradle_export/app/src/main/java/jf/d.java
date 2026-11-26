package jf;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.k;

public final class d extends k {
    @Override
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder, "com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
    }

    @Override
    public final pe.d[] getApiFeatures() {
        return b.f8278e;
    }

    @Override
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    @Override
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.blockstore.service.START";
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
