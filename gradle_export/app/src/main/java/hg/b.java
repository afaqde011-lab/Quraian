package hg;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.k0;
import com.google.android.gms.internal.measurement.x5;

public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new k0(10);
    public int A;

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" CheckedState=");
        int i10 = this.A;
        if (i10 != 1) {
            str = i10 != 2 ? "unchecked" : "indeterminate";
        } else {
            str = "checked";
        }
        return x5.n(sb2, str, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Integer.valueOf(this.A));
    }
}
