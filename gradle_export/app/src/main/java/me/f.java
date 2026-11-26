package me;

import android.os.Parcel;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;

public final class f extends bh.a implements j {

    public final int f10892f;

    public final g f10893g;

    public f(g gVar, int i10) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 3);
        this.f10892f = i10;
        this.f10893g = gVar;
    }

    @Override
    public void K0(Status status) {
        switch (this.f10892f) {
            case 1:
                this.f10893g.setResult(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public void h1(Status status) {
        switch (this.f10892f) {
            case 0:
                this.f10893g.setResult(status);
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean i2(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 101:
                hf.h.b(parcel);
                throw new UnsupportedOperationException();
            case MediaError.DetailedErrorCode.MEDIA_DECODE:
                Status status = (Status) hf.h.a(parcel, Status.CREATOR);
                hf.h.b(parcel);
                h1(status);
                break;
            case MediaError.DetailedErrorCode.MEDIA_NETWORK:
                Status status2 = (Status) hf.h.a(parcel, Status.CREATOR);
                hf.h.b(parcel);
                K0(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
