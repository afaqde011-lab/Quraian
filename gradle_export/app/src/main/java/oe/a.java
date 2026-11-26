package oe;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ri.t1;

public final class a extends re.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);
    public final Intent A;

    public a(Intent intent) {
        this.A = intent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.a0(parcel, 1, this.A, i10);
        t1.h0(iG0, parcel);
    }
}
