package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

public final class e2 implements Comparable, Parcelable {
    public static final Parcelable.Creator<e2> CREATOR = new m(2);
    public static final String D;
    public static final String E;
    public static final String F;
    public final int A;
    public final int B;
    public final int C;

    static {
        String str = e7.i0.f5136a;
        D = Integer.toString(0, 36);
        E = Integer.toString(1, 36);
        F = Integer.toString(2, 36);
    }

    public e2(int i10, int i11, int i12) {
        this.A = i10;
        this.B = i11;
        this.C = i12;
    }

    public e2(Parcel parcel) {
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
    }

    @Override
    public final int compareTo(Object obj) {
        e2 e2Var = (e2) obj;
        int i10 = this.A - e2Var.A;
        return (i10 == 0 && (i10 = this.B - e2Var.B) == 0) ? this.C - e2Var.C : i10;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e2.class == obj.getClass()) {
            e2 e2Var = (e2) obj;
            if (this.A == e2Var.A && this.B == e2Var.B && this.C == e2Var.C) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.A * 31) + this.B) * 31) + this.C;
    }

    public final String toString() {
        return this.A + "." + this.B + "." + this.C;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
    }
}
