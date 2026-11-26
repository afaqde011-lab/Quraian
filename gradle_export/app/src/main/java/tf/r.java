package tf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

public final class r extends re.a implements Iterable {
    public static final Parcelable.Creator<r> CREATOR = new le.b(19);
    public final Bundle A;

    public r(Bundle bundle) {
        this.A = bundle;
    }

    public final Object a(String str) {
        return this.A.get(str);
    }

    public final Double b() {
        return Double.valueOf(this.A.getDouble("value"));
    }

    public final String c() {
        return this.A.getString("currency");
    }

    public final Bundle e() {
        return new Bundle(this.A);
    }

    @Override
    public final Iterator iterator() {
        return new o20.f0(this);
    }

    public final String toString() {
        return this.A.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = ri.t1.g0(20293, parcel);
        ri.t1.T(parcel, 2, e());
        ri.t1.h0(iG0, parcel);
    }
}
