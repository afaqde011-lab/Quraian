package ke;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;
import ri.t1;

public final class i extends re.a {
    public static final Parcelable.Creator<i> CREATOR = new k0(19);
    public final PendingIntent A;

    public i(PendingIntent pendingIntent) {
        d0.h(pendingIntent);
        this.A = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return d0.k(this.A, ((i) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.a0(parcel, 1, this.A, i10);
        t1.h0(iG0, parcel);
    }
}
