package h;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;
import kotlin.jvm.internal.m;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new k0(8);
    public final int A;
    public final Intent B;

    public a(Intent intent, int i10) {
        this.A = i10;
        this.B = intent;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb2 = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.A;
        if (i10 != -1) {
            strValueOf = i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb2.append(strValueOf);
        sb2.append(", data=");
        sb2.append(this.B);
        sb2.append('}');
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        m.e(parcel, "dest");
        parcel.writeInt(this.A);
        Intent intent = this.B;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
