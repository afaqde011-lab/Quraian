package vf;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.n0;
import kh.r;

public abstract class c extends kf.a {
    @Override
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 3:
                kf.b.b(parcel);
                break;
            case 4:
                kf.b.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                kf.b.b(parcel);
                break;
            case 7:
                kf.b.b(parcel);
                break;
            case 8:
                h hVar = (h) kf.b.a(parcel, h.CREATOR);
                kf.b.b(parcel);
                n0 n0Var = (n0) this;
                n0Var.f3203f.post(new r(5, n0Var, hVar, false));
                break;
            case 9:
                kf.b.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
