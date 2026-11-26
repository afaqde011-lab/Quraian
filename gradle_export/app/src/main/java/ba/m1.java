package ba;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class m1 implements Parcelable {
    public static final Parcelable.Creator<m1> CREATOR = new ah.c(14);
    public int A;
    public int B;
    public int C;
    public int[] D;
    public int E;
    public int[] F;
    public ArrayList G;
    public boolean H;
    public boolean I;
    public boolean J;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        if (this.C > 0) {
            parcel.writeIntArray(this.D);
        }
        parcel.writeInt(this.E);
        if (this.E > 0) {
            parcel.writeIntArray(this.F);
        }
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.I ? 1 : 0);
        parcel.writeInt(this.J ? 1 : 0);
        parcel.writeList(this.G);
    }
}
