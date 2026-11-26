package l9;

import android.os.IBinder;
import android.os.Parcel;

public final class a implements b {

    public IBinder f10121e;

    @Override
    public final IBinder asBinder() {
        return this.f10121e;
    }

    @Override
    public final void e(int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i10);
            if (!this.f10121e.transact(9, parcelObtain, null, 1)) {
                int i11 = u.f10181f;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void u1(int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(i10);
            if (!this.f10121e.transact(12, parcelObtain, null, 1)) {
                int i11 = u.f10181f;
            }
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void z1(j0 j0Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            parcelObtain.writeInt(1);
            j0Var.writeToParcel(parcelObtain, 0);
            if (!this.f10121e.transact(3, parcelObtain, null, 1)) {
                int i10 = u.f10181f;
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}
