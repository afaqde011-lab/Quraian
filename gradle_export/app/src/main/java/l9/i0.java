package l9;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new com.google.android.gms.common.internal.k0(28);
    public final String A;
    public final CharSequence B;
    public final int C;
    public final Bundle D;
    public PlaybackState.CustomAction E;

    public i0(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        this.A = string;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.B = charSequence;
        this.C = parcel.readInt();
        this.D = parcel.readBundle(f0.class.getClassLoader());
    }

    public i0(String str, CharSequence charSequence, int i10, Bundle bundle) {
        this.A = str;
        this.B = charSequence;
        this.C = i10;
        this.D = bundle;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.B) + ", mIcon=" + this.C + ", mExtras=" + this.D;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A);
        TextUtils.writeToParcel(this.B, parcel, i10);
        parcel.writeInt(this.C);
        parcel.writeBundle(this.D);
    }
}
