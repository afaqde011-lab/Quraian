package tf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.x5;

public final class s extends re.a {
    public static final Parcelable.Creator<s> CREATOR = new le.b(20);
    public final String A;
    public final r B;
    public final String C;
    public final long D;

    public s(String str, r rVar, String str2, long j9) {
        this.A = str;
        this.B = rVar;
        this.C = str2;
        this.D = j9;
    }

    public s(s sVar, long j9) {
        com.google.android.gms.common.internal.d0.h(sVar);
        this.A = sVar.A;
        this.B = sVar.B;
        this.C = sVar.C;
        this.D = j9;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.B);
        String str = this.C;
        int length = String.valueOf(str).length();
        String str2 = this.A;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        a1.b.z(sb2, "origin=", str, ",name=", str2);
        return x5.n(sb2, ",params=", strValueOf);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        le.b.a(this, parcel, i10);
    }
}
