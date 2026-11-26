package eg;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import z1.o;

public final class c extends o5.b {
    public static final Parcelable.Creator<c> CREATOR = new o(3);
    public final int C;
    public final int D;
    public final boolean E;
    public final boolean F;
    public final boolean G;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readInt() == 1;
        this.F = parcel.readInt() == 1;
        this.G = parcel.readInt() == 1;
    }

    public c(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.C = bottomSheetBehavior.N;
        this.D = bottomSheetBehavior.f4114e;
        this.E = bottomSheetBehavior.f4108b;
        this.F = bottomSheetBehavior.I;
        this.G = bottomSheetBehavior.J;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F ? 1 : 0);
        parcel.writeInt(this.G ? 1 : 0);
    }
}
