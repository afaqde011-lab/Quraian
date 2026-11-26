package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class l0 extends View.BaseSavedState {
    public static final Parcelable.Creator<l0> CREATOR = new le.b(11);
    public boolean A;

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
    }
}
