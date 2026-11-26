package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new ah.c(1);
    public final int A;
    public final MediaDescriptionCompat B;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.A = parcel.readInt();
        this.B = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.A + ", mDescription=" + this.B + '}';
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A);
        this.B.writeToParcel(parcel, i10);
    }
}
