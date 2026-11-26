package ba;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class l1 implements Parcelable {
    public static final Parcelable.Creator<l1> CREATOR = new ah.c(13);
    public int A;
    public int B;
    public int[] C;
    public boolean D;

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.A + ", mGapDir=" + this.B + ", mHasUnwantedGapAfter=" + this.D + ", mGapPerSpan=" + Arrays.toString(this.C) + '}';
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.D ? 1 : 0);
        int[] iArr = this.C;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.C);
        }
    }
}
