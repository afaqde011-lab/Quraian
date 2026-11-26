package l9;

import android.os.IBinder;
import android.os.Parcel;

public final class c implements d {

    public IBinder f10125e;

    @Override
    public final void P(b bVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder((u) bVar);
            if (!this.f10125e.transact(4, parcelObtain, parcelObtain2, 0)) {
                int i10 = b0.f10123f;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final void a2(b bVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongBinder((u) bVar);
            if (!this.f10125e.transact(3, parcelObtain, parcelObtain2, 0)) {
                int i10 = b0.f10123f;
            }
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f10125e;
    }

    @Override
    public final j0 getPlaybackState() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f10125e.transact(28, parcelObtain, parcelObtain2, 0)) {
                int i10 = b0.f10123f;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? j0.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final int getRepeatMode() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f10125e.transact(37, parcelObtain, parcelObtain2, 0)) {
                int i10 = b0.f10123f;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final int h() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f10125e.transact(47, parcelObtain, parcelObtain2, 0)) {
                int i10 = b0.f10123f;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override
    public final boolean i() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            if (!this.f10125e.transact(45, parcelObtain, parcelObtain2, 0)) {
                int i10 = b0.f10123f;
            }
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
