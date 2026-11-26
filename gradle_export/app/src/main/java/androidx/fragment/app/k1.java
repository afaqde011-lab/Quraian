package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class k1 implements Parcelable {
    public static final Parcelable.Creator<k1> CREATOR = new ah.c(8);
    public ArrayList A;
    public ArrayList B;
    public b[] C;
    public int D;
    public String E;
    public ArrayList F;
    public ArrayList G;
    public ArrayList H;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.A);
        parcel.writeStringList(this.B);
        parcel.writeTypedArray(this.C, i10);
        parcel.writeInt(this.D);
        parcel.writeString(this.E);
        parcel.writeStringList(this.F);
        parcel.writeTypedList(this.G);
        parcel.writeTypedList(this.H);
    }
}
