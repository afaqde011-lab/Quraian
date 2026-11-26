package ke;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.k0;
import ri.t1;

public final class f extends re.a {
    public static final Parcelable.Creator<f> CREATOR = new k0(12);
    public final PendingIntent A;

    public f(PendingIntent pendingIntent) {
        d0.h(pendingIntent);
        this.A = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.a0(parcel, 1, this.A, i10);
        t1.h0(iG0, parcel);
    }
}
