package k9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class n implements o {

    public IBinder f9377e;

    @Override
    public final void E(k kVar, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("androidx.media3.session.IMediaSessionService");
            parcelObtain.writeStrongInterface(kVar);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.f9377e.transact(3001, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f9377e;
    }
}
