package vf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x;
import ri.t1;

public final class h extends re.a {
    public static final Parcelable.Creator<h> CREATOR = new f(2);
    public final int A;
    public final pe.b B;
    public final x C;

    public h(int i10, pe.b bVar, x xVar) {
        this.A = i10;
        this.B = bVar;
        this.C = xVar;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A);
        t1.a0(parcel, 2, this.B, i10);
        t1.a0(parcel, 3, this.C, i10);
        t1.h0(iG0, parcel);
    }
}
