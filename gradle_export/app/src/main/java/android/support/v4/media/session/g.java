package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ri.t1;

public final class g extends Binder implements b {

    public final WeakReference f495e;

    public g(androidx.mediarouter.app.s sVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f495e = new WeakReference(sVar);
    }

    @Override
    public final void L(Bundle bundle) {
        throw new AssertionError();
    }

    @Override
    public final void O(ArrayList arrayList) {
        throw new AssertionError();
    }

    @Override
    public final void V0(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override
    public final void Z1(PlaybackStateCompat playbackStateCompat) {
        androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) this.f495e.get();
        if (sVar != null) {
            sVar.e(2, playbackStateCompat, null);
        }
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }

    @Override
    public final void c1() {
        throw new AssertionError();
    }

    @Override
    public final void d2(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override
    public final void e1(MediaMetadataCompat mediaMetadataCompat) {
        throw new AssertionError();
    }

    @Override
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.f495e;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                Bundle bundle = (Bundle) t1.f(parcel, Bundle.CREATOR);
                androidx.mediarouter.app.s sVar = (androidx.mediarouter.app.s) weakReference.get();
                if (sVar != null) {
                    sVar.e(1, string, bundle);
                }
                return true;
            case 2:
                c1();
                return true;
            case 3:
                Z1((PlaybackStateCompat) t1.f(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                e1((MediaMetadataCompat) t1.f(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                O(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                V0((CharSequence) t1.f(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                L((Bundle) t1.f(parcel, Bundle.CREATOR));
                return true;
            case 8:
                d2((ParcelableVolumeInfo) t1.f(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                int i12 = parcel.readInt();
                androidx.mediarouter.app.s sVar2 = (androidx.mediarouter.app.s) weakReference.get();
                if (sVar2 != null) {
                    sVar2.e(9, Integer.valueOf(i12), null);
                    return true;
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z10 = parcel.readInt() != 0;
                androidx.mediarouter.app.s sVar3 = (androidx.mediarouter.app.s) weakReference.get();
                if (sVar3 != null) {
                    sVar3.e(11, Boolean.valueOf(z10), null);
                    return true;
                }
                return true;
            case 12:
                int i13 = parcel.readInt();
                androidx.mediarouter.app.s sVar4 = (androidx.mediarouter.app.s) weakReference.get();
                if (sVar4 != null) {
                    sVar4.e(12, Integer.valueOf(i13), null);
                    return true;
                }
                return true;
            case 13:
                androidx.mediarouter.app.s sVar5 = (androidx.mediarouter.app.s) weakReference.get();
                if (sVar5 != null) {
                    sVar5.e(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i10, parcel, parcel2, i11);
        }
    }
}
