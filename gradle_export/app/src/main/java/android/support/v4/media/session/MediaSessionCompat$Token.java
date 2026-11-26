package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new s(2);
    public final Object B;
    public d C;
    public final Object A = new Object();
    public va.d D = null;

    public MediaSessionCompat$Token(Object obj, o oVar) {
        this.B = obj;
        this.C = oVar;
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
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).B;
        Object obj3 = this.B;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.B;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable((Parcelable) this.B, i10);
    }
}
