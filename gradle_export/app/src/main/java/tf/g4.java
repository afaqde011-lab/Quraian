package tf;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class g4 extends re.a {
    public static final Parcelable.Creator<g4> CREATOR = new le.b(26);
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final long E;
    public final long F;
    public final String G;
    public final boolean H;
    public final boolean I;
    public final long J;
    public final String K;
    public final long L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final Boolean P;
    public final long Q;
    public final List R;
    public final String S;
    public final String T;
    public final String U;
    public final boolean V;
    public final long W;
    public final int X;
    public final String Y;
    public final int Z;

    public final long f14619a0;

    public final String f14620b0;

    public final String f14621c0;

    public final long f14622d0;

    public final int f14623e0;

    public g4(String str, String str2, String str3, long j9, String str4, long j10, long j11, String str5, boolean z10, boolean z11, String str6, long j12, int i10, boolean z12, boolean z13, Boolean bool, long j13, List list, String str7, String str8, String str9, boolean z14, long j14, int i11, String str10, int i12, long j15, String str11, String str12, long j16, int i13) {
        com.google.android.gms.common.internal.d0.e(str);
        this.A = str;
        this.B = true == TextUtils.isEmpty(str2) ? null : str2;
        this.C = str3;
        this.J = j9;
        this.D = str4;
        this.E = j10;
        this.F = j11;
        this.G = str5;
        this.H = z10;
        this.I = z11;
        this.K = str6;
        this.L = j12;
        this.M = i10;
        this.N = z12;
        this.O = z13;
        this.P = bool;
        this.Q = j13;
        this.R = list;
        this.S = str7;
        this.T = str8;
        this.U = str9;
        this.V = z14;
        this.W = j14;
        this.X = i11;
        this.Y = str10;
        this.Z = i12;
        this.f14619a0 = j15;
        this.f14620b0 = str11;
        this.f14621c0 = str12;
        this.f14622d0 = j16;
        this.f14623e0 = i13;
    }

    public g4(String str, String str2, String str3, String str4, long j9, long j10, String str5, boolean z10, boolean z11, long j11, String str6, long j12, int i10, boolean z12, boolean z13, Boolean bool, long j13, ArrayList arrayList, String str7, String str8, String str9, boolean z14, long j14, int i11, String str10, int i12, long j15, String str11, String str12, long j16, int i13) {
        this.A = str;
        this.B = str2;
        this.C = str3;
        this.J = j11;
        this.D = str4;
        this.E = j9;
        this.F = j10;
        this.G = str5;
        this.H = z10;
        this.I = z11;
        this.K = str6;
        this.L = j12;
        this.M = i10;
        this.N = z12;
        this.O = z13;
        this.P = bool;
        this.Q = j13;
        this.R = arrayList;
        this.S = str7;
        this.T = str8;
        this.U = str9;
        this.V = z14;
        this.W = j14;
        this.X = i11;
        this.Y = str10;
        this.Z = i12;
        this.f14619a0 = j15;
        this.f14620b0 = str11;
        this.f14621c0 = str12;
        this.f14622d0 = j16;
        this.f14623e0 = i13;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = ri.t1.g0(20293, parcel);
        ri.t1.b0(parcel, 2, this.A);
        ri.t1.b0(parcel, 3, this.B);
        ri.t1.b0(parcel, 4, this.C);
        ri.t1.b0(parcel, 5, this.D);
        ri.t1.f0(parcel, 6, 8);
        parcel.writeLong(this.E);
        ri.t1.f0(parcel, 7, 8);
        parcel.writeLong(this.F);
        ri.t1.b0(parcel, 8, this.G);
        ri.t1.f0(parcel, 9, 4);
        parcel.writeInt(this.H ? 1 : 0);
        ri.t1.f0(parcel, 10, 4);
        parcel.writeInt(this.I ? 1 : 0);
        ri.t1.f0(parcel, 11, 8);
        parcel.writeLong(this.J);
        ri.t1.b0(parcel, 12, this.K);
        ri.t1.f0(parcel, 14, 8);
        parcel.writeLong(this.L);
        ri.t1.f0(parcel, 15, 4);
        parcel.writeInt(this.M);
        ri.t1.f0(parcel, 16, 4);
        parcel.writeInt(this.N ? 1 : 0);
        ri.t1.f0(parcel, 18, 4);
        parcel.writeInt(this.O ? 1 : 0);
        ri.t1.S(parcel, 21, this.P);
        ri.t1.f0(parcel, 22, 8);
        parcel.writeLong(this.Q);
        ri.t1.c0(parcel, 23, this.R);
        ri.t1.b0(parcel, 25, this.S);
        ri.t1.b0(parcel, 26, this.T);
        ri.t1.b0(parcel, 27, this.U);
        ri.t1.f0(parcel, 28, 4);
        parcel.writeInt(this.V ? 1 : 0);
        ri.t1.f0(parcel, 29, 8);
        parcel.writeLong(this.W);
        ri.t1.f0(parcel, 30, 4);
        parcel.writeInt(this.X);
        ri.t1.b0(parcel, 31, this.Y);
        ri.t1.f0(parcel, 32, 4);
        parcel.writeInt(this.Z);
        ri.t1.f0(parcel, 34, 8);
        parcel.writeLong(this.f14619a0);
        ri.t1.b0(parcel, 35, this.f14620b0);
        ri.t1.b0(parcel, 36, this.f14621c0);
        ri.t1.f0(parcel, 37, 8);
        parcel.writeLong(this.f14622d0);
        ri.t1.f0(parcel, 38, 4);
        parcel.writeInt(this.f14623e0);
        ri.t1.h0(iG0, parcel);
    }
}
