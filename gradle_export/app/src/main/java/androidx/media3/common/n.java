package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
    public int A;
    public final UUID B;
    public final String C;
    public final String D;
    public final byte[] E;

    public n(Parcel parcel) {
        this.B = new UUID(parcel.readLong(), parcel.readLong());
        this.C = parcel.readString();
        String string = parcel.readString();
        String str = e7.i0.f5136a;
        this.D = string;
        this.E = parcel.createByteArray();
    }

    public n(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.B = uuid;
        this.C = str;
        str2.getClass();
        this.D = x0.n(str2);
        this.E = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = h.f1214a;
        UUID uuid3 = this.B;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        n nVar = (n) obj;
        return Objects.equals(this.C, nVar.C) && Objects.equals(this.D, nVar.D) && Objects.equals(this.B, nVar.B) && Arrays.equals(this.E, nVar.E);
    }

    public final int hashCode() {
        if (this.A == 0) {
            int iHashCode = this.B.hashCode() * 31;
            String str = this.C;
            this.A = Arrays.hashCode(this.E) + x5.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.D, 31);
        }
        return this.A;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.B;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeByteArray(this.E);
    }
}
