package vf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import java.util.ArrayList;
import java.util.List;
import ri.t1;

public final class e extends re.a implements t {
    public static final Parcelable.Creator<e> CREATOR = new f(0);
    public final List A;
    public final String B;

    public e(String str, ArrayList arrayList) {
        this.A = arrayList;
        this.B = str;
    }

    @Override
    public final Status getStatus() {
        return this.B != null ? Status.E : Status.I;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.c0(parcel, 1, this.A);
        t1.b0(parcel, 2, this.B);
        t1.h0(iG0, parcel);
    }
}
