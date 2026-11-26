package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;
import java.util.Objects;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new k0(4);
    public final q A;
    public final q B;
    public final d C;
    public final q D;
    public final int E;
    public final int F;
    public final int G;

    public b(q qVar, q qVar2, d dVar, q qVar3, int i10) {
        Objects.requireNonNull(qVar, "start cannot be null");
        Objects.requireNonNull(qVar2, "end cannot be null");
        Objects.requireNonNull(dVar, "validator cannot be null");
        this.A = qVar;
        this.B = qVar2;
        this.D = qVar3;
        this.E = i10;
        this.C = dVar;
        if (qVar3 != null && qVar.A.compareTo(qVar3.A) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (qVar3 != null && qVar3.A.compareTo(qVar2.A) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > y.c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.G = qVar.d(qVar2) + 1;
        this.F = (qVar2.C - qVar.C) + 1;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.A.equals(bVar.A) && this.B.equals(bVar.B) && Objects.equals(this.D, bVar.D) && this.E == bVar.E && this.C.equals(bVar.C);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.D, Integer.valueOf(this.E), this.C});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.A, 0);
        parcel.writeParcelable(this.B, 0);
        parcel.writeParcelable(this.D, 0);
        parcel.writeParcelable(this.C, 0);
        parcel.writeInt(this.E);
    }
}
