package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import ri.t1;

public final class a implements b {

    public IBinder f488e;

    @Override
    public final void L(Bundle bundle) {
        throw null;
    }

    @Override
    public final void Z1(PlaybackStateCompat playbackStateCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            t1.g(parcelObtain, playbackStateCompat);
            this.f488e.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final IBinder asBinder() {
        return this.f488e;
    }

    @Override
    public final void c1() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.f488e.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void d2(ParcelableVolumeInfo parcelableVolumeInfo) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            t1.g(parcelObtain, parcelableVolumeInfo);
            this.f488e.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override
    public final void e1(MediaMetadataCompat mediaMetadataCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            t1.g(parcelObtain, mediaMetadataCompat);
            this.f488e.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
