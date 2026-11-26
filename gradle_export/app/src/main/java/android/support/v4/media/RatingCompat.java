package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new ah.c(4);
    public final int A;
    public final float B;

    public RatingCompat(int i10, float f3) {
        this.A = i10;
        this.B = f3;
    }

    @Override
    public final int describeContents() {
        return this.A;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.A);
        sb2.append(" rating=");
        float f3 = this.B;
        sb2.append(f3 < 0.0f ? "unrated" : String.valueOf(f3));
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A);
        parcel.writeFloat(this.B);
    }
}
