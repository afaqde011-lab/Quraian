package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public final class x implements Parcelable.Creator {
    @Override
    public final Object createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    @Override
    public final Object[] newArray(int i10) {
        return new PlaybackStateCompat.CustomAction[i10];
    }
}
