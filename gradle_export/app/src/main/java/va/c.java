package va;

import android.os.Parcel;
import android.util.SparseIntArray;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import u.e;

public final class c extends b {

    public final SparseIntArray f15576d;

    public final Parcel f15577e;

    public final int f15578f;

    public final int f15579g;

    public final String f15580h;

    public int f15581i;

    public int f15582j;

    public int f15583k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), RuntimeVersion.SUFFIX, new e(0), new e(0), new e(0));
    }

    public c(Parcel parcel, int i10, int i11, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f15576d = new SparseIntArray();
        this.f15581i = -1;
        this.f15583k = -1;
        this.f15577e = parcel;
        this.f15578f = i10;
        this.f15579g = i11;
        this.f15582j = i10;
        this.f15580h = str;
    }

    @Override
    public final c a() {
        Parcel parcel = this.f15577e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f15582j;
        if (i10 == this.f15578f) {
            i10 = this.f15579g;
        }
        return new c(parcel, iDataPosition, i10, x5.n(new StringBuilder(), this.f15580h, "  "), this.f15573a, this.f15574b, this.f15575c);
    }

    @Override
    public final boolean e(int i10) {
        while (this.f15582j < this.f15579g) {
            int i11 = this.f15583k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f15582j;
            Parcel parcel = this.f15577e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f15583k = parcel.readInt();
            this.f15582j += i13;
        }
        return this.f15583k == i10;
    }

    @Override
    public final void i(int i10) {
        int i11 = this.f15581i;
        SparseIntArray sparseIntArray = this.f15576d;
        Parcel parcel = this.f15577e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f15581i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }
}
