package vf;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.t;
import ri.t1;

public final class b extends re.a implements t {
    public static final Parcelable.Creator<b> CREATOR = new le.b(29);
    public final int A;
    public final int B;
    public final Intent C;

    public b(int i10, int i11, Intent intent) {
        this.A = i10;
        this.B = i11;
        this.C = intent;
    }

    @Override
    public final Status getStatus() {
        return this.B == 0 ? Status.E : Status.I;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A);
        t1.f0(parcel, 2, 4);
        parcel.writeInt(this.B);
        t1.a0(parcel, 3, this.C, i10);
        t1.h0(iG0, parcel);
    }
}
