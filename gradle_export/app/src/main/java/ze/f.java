package ze;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.x;

public final class f extends x {
    public final ye.a p2(ye.b bVar, String str, int i10) {
        Parcel parcelI2 = i2();
        mf.g.b(parcelI2, bVar);
        parcelI2.writeString(str);
        parcelI2.writeInt(i10);
        Parcel parcelG2 = g2(2, parcelI2);
        ye.a aVarK2 = ye.b.k2(parcelG2.readStrongBinder());
        parcelG2.recycle();
        return aVarK2;
    }

    public final ye.a q2(ye.b bVar, String str, int i10) {
        Parcel parcelI2 = i2();
        mf.g.b(parcelI2, bVar);
        parcelI2.writeString(str);
        parcelI2.writeInt(i10);
        Parcel parcelG2 = g2(4, parcelI2);
        ye.a aVarK2 = ye.b.k2(parcelG2.readStrongBinder());
        parcelG2.recycle();
        return aVarK2;
    }

    public final ye.a r2(ye.b bVar, String str, boolean z10, long j9) {
        Parcel parcelI2 = i2();
        mf.g.b(parcelI2, bVar);
        parcelI2.writeString(str);
        parcelI2.writeInt(z10 ? 1 : 0);
        parcelI2.writeLong(j9);
        Parcel parcelG2 = g2(7, parcelI2);
        ye.a aVarK2 = ye.b.k2(parcelG2.readStrongBinder());
        parcelG2.recycle();
        return aVarK2;
    }

    public final ye.a s2(ye.b bVar, String str, int i10, ye.b bVar2) {
        Parcel parcelI2 = i2();
        mf.g.b(parcelI2, bVar);
        parcelI2.writeString(str);
        parcelI2.writeInt(i10);
        mf.g.b(parcelI2, bVar2);
        Parcel parcelG2 = g2(8, parcelI2);
        ye.a aVarK2 = ye.b.k2(parcelG2.readStrongBinder());
        parcelG2.recycle();
        return aVarK2;
    }
}
