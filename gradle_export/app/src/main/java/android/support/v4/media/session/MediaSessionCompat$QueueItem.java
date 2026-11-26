package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new s(1);
    public final MediaDescriptionCompat A;
    public final long B;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.A = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.B = parcel.readLong();
    }

    public MediaSessionCompat$QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j9) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j9 == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.A = mediaDescriptionCompat;
        this.B = j9;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
        sb2.append(this.A);
        sb2.append(", Id=");
        return a1.b.k(this.B, " }", sb2);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        this.A.writeToParcel(parcel, i10);
        parcel.writeLong(this.B);
    }
}
