package ne;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import ri.t1;

public final class c extends re.a {
    public static final Parcelable.Creator<c> CREATOR = new le.b(7);
    public final ArrayList A;
    public final boolean B;

    public c(ArrayList arrayList, boolean z10) {
        if (z10) {
            boolean z11 = true;
            if (arrayList != null && !arrayList.isEmpty()) {
                z11 = false;
            }
            d0.j("retrieveAll was set to true but other constraint(s) was also provided: keys", z11);
        }
        this.B = z10;
        this.A = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                d0.f(str, "Element in keys cannot be null or empty");
                this.A.add(str);
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.c0(parcel, 1, Collections.unmodifiableList(this.A));
        t1.f0(parcel, 2, 4);
        parcel.writeInt(this.B ? 1 : 0);
        t1.h0(iG0, parcel);
    }
}
