package tf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class r3 extends re.a {
    public static final Parcelable.Creator<r3> CREATOR = new le.b(23);
    public final List A;

    public r3(ArrayList arrayList) {
        this.A = arrayList;
    }

    public static r3 a(p2... p2VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(p2VarArr[0].A));
        return new r3(arrayList);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = ri.t1.g0(20293, parcel);
        ri.t1.X(parcel, 1, this.A);
        ri.t1.h0(iG0, parcel);
    }
}
