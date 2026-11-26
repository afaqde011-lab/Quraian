package pe;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d0;
import java.util.Arrays;
import l9.f0;
import ri.t1;

public final class d extends re.a {
    public static final Parcelable.Creator<d> CREATOR = new le.b(13);
    public final String A;
    public final int B;
    public final long C;
    public final boolean D;

    public d(int i10, long j9, String str, boolean z10) {
        this.A = str;
        this.B = i10;
        this.C = j9;
        this.D = z10;
    }

    public d(String str, long j9) {
        this(-1, j9, str, false);
    }

    public final long a() {
        long j9 = this.C;
        return j9 == -1 ? this.B : j9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (d0.k(this.A, dVar.A) && a() == dVar.a() && this.D == dVar.D) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, Long.valueOf(a()), Boolean.valueOf(this.D)});
    }

    public final String toString() {
        f0 f0Var = new f0(this);
        f0Var.a(this.A, "name");
        f0Var.a(Long.valueOf(a()), "version");
        f0Var.a(Boolean.valueOf(this.D), "is_fully_rolled_out");
        return f0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.b0(parcel, 1, this.A);
        t1.f0(parcel, 2, 4);
        parcel.writeInt(this.B);
        long jA = a();
        t1.f0(parcel, 3, 8);
        parcel.writeLong(jA);
        t1.f0(parcel, 4, 4);
        parcel.writeInt(this.D ? 1 : 0);
        t1.h0(iG0, parcel);
    }
}
