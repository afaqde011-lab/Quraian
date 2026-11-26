package l9;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new com.google.android.gms.common.internal.k0(26);
    public final MediaSession.Token B;
    public d C;
    public final Object A = new Object();
    public va.d D = null;

    public e0(MediaSession.Token token, d dVar) {
        this.B = token;
        this.C = dVar;
    }

    public final d a() {
        d dVar;
        synchronized (this.A) {
            dVar = this.C;
        }
        return dVar;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return this.B.equals(((e0) obj).B);
        }
        return false;
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.B, i10);
    }
}
