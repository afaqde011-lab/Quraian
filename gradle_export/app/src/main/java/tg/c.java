package tg;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import z1.o;

public final class c extends o5.b {
    public static final Parcelable.Creator<c> CREATOR = new o(9);
    public final int C;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.C = parcel.readInt();
    }

    public c(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.C = sideSheetBehavior.f4185h;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.C);
    }
}
