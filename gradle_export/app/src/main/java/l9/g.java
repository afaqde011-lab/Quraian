package l9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new com.google.android.gms.common.internal.k0(22);
    public final int A;
    public final x B;

    public g(Parcel parcel) {
        this.A = parcel.readInt();
        this.B = x.CREATOR.createFromParcel(parcel);
    }

    public g(x xVar, int i10) {
        if (TextUtils.isEmpty(xVar.A)) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.A = i10;
        this.B = xVar;
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
