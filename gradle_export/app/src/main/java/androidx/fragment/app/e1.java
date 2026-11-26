package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class e1 implements Parcelable {
    public static final Parcelable.Creator<e1> CREATOR = new ah.c(7);
    public String A;
    public int B;

    public e1(String str, int i10) {
        this.A = str;
        this.B = i10;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
    }
}
