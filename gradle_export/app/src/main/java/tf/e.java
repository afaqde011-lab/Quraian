package tf;

import android.os.Parcel;
import android.os.Parcelable;

public final class e extends re.a {
    public static final Parcelable.Creator<e> CREATOR = new le.b(17);
    public String A;
    public String B;
    public b4 C;
    public long D;
    public boolean E;
    public String F;
    public final s G;
    public long H;
    public s I;
    public final long J;
    public final s K;

    public e(String str, String str2, b4 b4Var, long j9, boolean z10, String str3, s sVar, long j10, s sVar2, long j11, s sVar3) {
        this.A = str;
        this.B = str2;
        this.C = b4Var;
        this.D = j9;
        this.E = z10;
        this.F = str3;
        this.G = sVar;
        this.H = j10;
        this.I = sVar2;
        this.J = j11;
        this.K = sVar3;
    }

    public e(e eVar) {
        com.google.android.gms.common.internal.d0.h(eVar);
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.D = eVar.D;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.I = eVar.I;
        this.J = eVar.J;
        this.K = eVar.K;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = ri.t1.g0(20293, parcel);
        ri.t1.b0(parcel, 2, this.A);
        ri.t1.b0(parcel, 3, this.B);
        ri.t1.a0(parcel, 4, this.C, i10);
        long j9 = this.D;
        ri.t1.f0(parcel, 5, 8);
        parcel.writeLong(j9);
        boolean z10 = this.E;
        ri.t1.f0(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        ri.t1.b0(parcel, 7, this.F);
        ri.t1.a0(parcel, 8, this.G, i10);
        long j10 = this.H;
        ri.t1.f0(parcel, 9, 8);
        parcel.writeLong(j10);
        ri.t1.a0(parcel, 10, this.I, i10);
        ri.t1.f0(parcel, 11, 8);
        parcel.writeLong(this.J);
        ri.t1.a0(parcel, 12, this.K, i10);
        ri.t1.h0(iG0, parcel);
    }
}
