package h;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;
import kotlin.jvm.internal.m;

public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new k0(9);
    public final IntentSender A;
    public final Intent B;
    public final int C;
    public final int D;

    public k(IntentSender intentSender, Intent intent, int i10, int i11) {
        m.e(intentSender, "intentSender");
        this.A = intentSender;
        this.B = intent;
        this.C = i10;
        this.D = i11;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        m.e(parcel, "dest");
        parcel.writeParcelable(this.A, i10);
        parcel.writeParcelable(this.B, i10);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
    }
}
