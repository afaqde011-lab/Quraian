package vg;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class y extends o5.b {
    public static final Parcelable.Creator<y> CREATOR = new z1.o(10);
    public CharSequence C;
    public boolean D;

    public y(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.D = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.C) + "}";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        TextUtils.writeToParcel(this.C, parcel, i10);
        parcel.writeInt(this.D ? 1 : 0);
    }
}
