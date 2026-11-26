package tf;

import android.os.Parcel;
import android.os.Parcelable;

public final class b4 extends re.a {
    public static final Parcelable.Creator<b4> CREATOR = new le.b(25);
    public final int A;
    public final String B;
    public final long C;
    public final Long D;
    public final String E;
    public final String F;
    public final Double G;

    public b4(int i10, String str, long j9, Long l, Float f3, String str2, String str3, Double d3) {
        this.A = i10;
        this.B = str;
        this.C = j9;
        this.D = l;
        this.G = i10 == 1 ? f3 != null ? Double.valueOf(f3.doubleValue()) : null : d3;
        this.E = str2;
        this.F = str3;
    }

    public b4(long j9, Object obj, String str, String str2) {
        com.google.android.gms.common.internal.d0.e(str);
        this.A = 2;
        this.B = str;
        this.C = j9;
        this.F = str2;
        if (obj == null) {
            this.D = null;
            this.G = null;
            this.E = null;
            return;
        }
        if (obj instanceof Long) {
            this.D = (Long) obj;
            this.G = null;
            this.E = null;
        } else if (obj instanceof String) {
            this.D = null;
            this.G = null;
            this.E = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("User attribute given of un-supported type");
            }
            this.D = null;
            this.G = (Double) obj;
            this.E = null;
        }
    }

    public b4(c4 c4Var) {
        this(c4Var.f14611d, c4Var.f14612e, c4Var.f14610c, c4Var.f14609b);
    }

    public final Object a() {
        Long l = this.D;
        if (l != null) {
            return l;
        }
        Double d3 = this.G;
        if (d3 != null) {
            return d3;
        }
        String str = this.E;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        le.b.b(this, parcel);
    }
}
