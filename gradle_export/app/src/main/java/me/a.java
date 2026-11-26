package me;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ri.t1;

public final class a extends re.a {
    public static final Parcelable.Creator<a> CREATOR = new le.b(3);
    public final int A;
    public final int B;
    public final Bundle C;

    public a(int i10, int i11, Bundle bundle) {
        this.A = i10;
        this.B = i11;
        this.C = bundle;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A);
        t1.f0(parcel, 2, 4);
        parcel.writeInt(this.B);
        t1.T(parcel, 3, this.C);
        t1.h0(iG0, parcel);
    }
}
