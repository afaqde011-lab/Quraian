package ze;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.x;

public final class g extends x {
    public final ye.a p2(ye.b bVar, String str, int i10, ye.b bVar2) {
        Parcel parcelI2 = i2();
        mf.g.b(parcelI2, bVar);
        parcelI2.writeString(str);
        parcelI2.writeInt(i10);
        mf.g.b(parcelI2, bVar2);
        Parcel parcelG2 = g2(2, parcelI2);
        ye.a aVarK2 = ye.b.k2(parcelG2.readStrongBinder());
        parcelG2.recycle();
        return aVarK2;
    }

    public final ye.a q2(ye.b bVar, String str, int i10, ye.b bVar2) {
        Parcel parcelI2 = i2();
        mf.g.b(parcelI2, bVar);
        parcelI2.writeString(str);
        parcelI2.writeInt(i10);
        mf.g.b(parcelI2, bVar2);
        Parcel parcelG2 = g2(3, parcelI2);
        ye.a aVarK2 = ye.b.k2(parcelG2.readStrongBinder());
        parcelG2.recycle();
        return aVarK2;
    }
}
