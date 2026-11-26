package ne;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ri.t1;

public final class e extends re.a {
    public static final Parcelable.Creator<e> CREATOR = new le.b(8);
    public final Bundle A;
    public final List B;
    public final HashMap C;

    public e(Bundle bundle, ArrayList arrayList) {
        this.A = bundle;
        this.B = arrayList;
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            map.put(dVar.B, dVar);
        }
        this.C = map;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.T(parcel, 1, this.A);
        t1.e0(parcel, 2, this.B);
        t1.h0(iG0, parcel);
    }
}
