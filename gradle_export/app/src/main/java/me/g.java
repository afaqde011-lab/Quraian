package me;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.t;

public final class g extends com.google.android.gms.common.api.internal.d {

    public final int f10894a;

    public g(q qVar, int i10) {
        super(je.a.f8271a, qVar);
        this.f10894a = i10;
    }

    @Override
    public final t createFailedResult(Status status) {
        int i10 = this.f10894a;
        return status;
    }

    @Override
    public final void doExecute(com.google.android.gms.common.api.b bVar) {
        switch (this.f10894a) {
            case 0:
                e eVar = (e) bVar;
                k kVar = (k) eVar.getService();
                f fVar = new f(this, 0);
                GoogleSignInOptions googleSignInOptions = eVar.f10891a;
                Parcel parcelD = kVar.d();
                int i10 = hf.h.f7055a;
                parcelD.writeStrongBinder(fVar);
                hf.h.c(parcelD, googleSignInOptions);
                kVar.f(MediaError.DetailedErrorCode.MEDIA_DECODE, parcelD);
                break;
            default:
                e eVar2 = (e) bVar;
                k kVar2 = (k) eVar2.getService();
                f fVar2 = new f(this, 1);
                GoogleSignInOptions googleSignInOptions2 = eVar2.f10891a;
                Parcel parcelD2 = kVar2.d();
                int i11 = hf.h.f7055a;
                parcelD2.writeStrongBinder(fVar2);
                hf.h.c(parcelD2, googleSignInOptions2);
                kVar2.f(MediaError.DetailedErrorCode.MEDIA_NETWORK, parcelD2);
                break;
        }
    }
}
