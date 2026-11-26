package tf;

import android.os.Parcel;
import java.util.List;

public final class f0 extends com.google.android.gms.internal.measurement.x implements g0 {
    @Override
    public final void F1(List list) {
        Parcel parcelI2 = i2();
        parcelI2.writeTypedList(list);
        k2(parcelI2);
    }
}
