package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

public final class o implements Comparator, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new m(0);
    public final n[] A;
    public int B;
    public final String C;
    public final int D;

    public o(Parcel parcel) {
        this.C = parcel.readString();
        n[] nVarArr = (n[]) parcel.createTypedArray(n.CREATOR);
        String str = e7.i0.f5136a;
        this.A = nVarArr;
        this.D = nVarArr.length;
    }

    public o(String str, ArrayList arrayList) {
        this(str, false, (n[]) arrayList.toArray(new n[0]));
    }

    public o(String str, boolean z10, n... nVarArr) {
        this.C = str;
        nVarArr = z10 ? (n[]) nVarArr.clone() : nVarArr;
        this.A = nVarArr;
        this.D = nVarArr.length;
        Arrays.sort(nVarArr, this);
    }

    public final o a(String str) {
        return Objects.equals(this.C, str) ? this : new o(str, false, this.A);
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        UUID uuid = h.f1214a;
        if (uuid.equals(nVar.B)) {
            return uuid.equals(nVar2.B) ? 0 : 1;
        }
        return nVar.B.compareTo(nVar2.B);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (Objects.equals(this.C, oVar.C) && Arrays.equals(this.A, oVar.A)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.B == 0) {
            String str = this.C;
            this.B = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.A);
        }
        return this.B;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.C);
        parcel.writeTypedArray(this.A, 0);
    }
}
