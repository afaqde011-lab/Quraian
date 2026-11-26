package ke;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import cf.q;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.k0;
import java.util.Arrays;
import ri.t1;

public final class j extends re.a {
    public static final Parcelable.Creator<j> CREATOR = new k0(20);
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final Uri E;
    public final String F;
    public final String G;
    public final String H;
    public final q I;

    public j(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, q qVar) {
        d0.h(str);
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.D = str4;
        this.E = uri;
        this.F = str5;
        this.G = str6;
        this.H = str7;
        this.I = qVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return d0.k(this.A, jVar.A) && d0.k(this.B, jVar.B) && d0.k(this.C, jVar.C) && d0.k(this.D, jVar.D) && d0.k(this.E, jVar.E) && d0.k(this.F, jVar.F) && d0.k(this.G, jVar.G) && d0.k(this.H, jVar.H) && d0.k(this.I, jVar.I);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.b0(parcel, 1, this.A);
        t1.b0(parcel, 2, this.B);
        t1.b0(parcel, 3, this.C);
        t1.b0(parcel, 4, this.D);
        t1.a0(parcel, 5, this.E, i10);
        t1.b0(parcel, 6, this.F);
        t1.b0(parcel, 7, this.G);
        t1.b0(parcel, 8, this.H);
        t1.a0(parcel, 9, this.I, i10);
        t1.h0(iG0, parcel);
    }
}
