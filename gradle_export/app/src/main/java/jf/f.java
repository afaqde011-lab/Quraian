package jf;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.b5;
import xf.g;

public final class f extends bh.a {

    public final int f8282f;

    public final g f8283g;

    public f(int i10, g gVar) {
        super("com.google.android.gms.auth.blockstore.internal.IStoreBytesCallback", 4);
        this.f8282f = i10;
        switch (i10) {
            case 1:
                this.f8283g = gVar;
                super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback", 4);
                break;
            case 2:
                this.f8283g = gVar;
                super("com.google.android.gms.auth.blockstore.internal.IDeleteBytesCallback", 4);
                break;
            default:
                this.f8283g = gVar;
                break;
        }
    }

    @Override
    public final boolean d(int i10, Parcel parcel) {
        switch (this.f8282f) {
            case 0:
                if (i10 != 1) {
                    return false;
                }
                Status status = (Status) c.a(parcel, Status.CREATOR);
                int i11 = parcel.readInt();
                bh.a.h2(parcel);
                b5.N(status, Integer.valueOf(i11), this.f8283g);
                return true;
            case 1:
                if (i10 == 1) {
                    parcel.createByteArray();
                    bh.a.h2(parcel);
                    throw new UnsupportedOperationException();
                }
                if (i10 != 2) {
                    return false;
                }
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                ne.e eVar = (ne.e) c.a(parcel, ne.e.CREATOR);
                bh.a.h2(parcel);
                b5.N(status2, eVar, this.f8283g);
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                Status status3 = (Status) c.a(parcel, Status.CREATOR);
                boolean z10 = parcel.readInt() != 0;
                bh.a.h2(parcel);
                b5.N(status3, Boolean.valueOf(z10), this.f8283g);
                return true;
        }
    }
}
