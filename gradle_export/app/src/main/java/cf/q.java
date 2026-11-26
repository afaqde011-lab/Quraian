package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import nf.k1;
import nf.u0;

public final class q extends re.a {
    public static final Parcelable.Creator<q> CREATOR = new ah.c(25);
    public final String A;
    public final String B;
    public final u0 C;
    public final h D;
    public final g E;
    public final i F;
    public final e G;
    public final String H;

    public q(String str, String str2, byte[] bArr, h hVar, g gVar, i iVar, e eVar, String str3) {
        u0 u0VarL = bArr == null ? null : u0.l(bArr.length, bArr);
        boolean z10 = false;
        com.google.android.gms.common.internal.d0.a("Must provide a response object.", (hVar != null && gVar == null && iVar == null) || (hVar == null && gVar != null && iVar == null) || (hVar == null && gVar == null && iVar != null));
        if (iVar != null || (str != null && u0VarL != null)) {
            z10 = true;
        }
        com.google.android.gms.common.internal.d0.a("Must provide id and rawId if not an error response.", z10);
        this.A = str;
        this.B = str2;
        this.C = u0VarL;
        this.D = hVar;
        this.E = gVar;
        this.F = iVar;
        this.G = eVar;
        this.H = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return com.google.android.gms.common.internal.d0.k(this.A, qVar.A) && com.google.android.gms.common.internal.d0.k(this.B, qVar.B) && com.google.android.gms.common.internal.d0.k(this.C, qVar.C) && com.google.android.gms.common.internal.d0.k(this.D, qVar.D) && com.google.android.gms.common.internal.d0.k(this.E, qVar.E) && com.google.android.gms.common.internal.d0.k(this.F, qVar.F) && com.google.android.gms.common.internal.d0.k(this.G, qVar.G) && com.google.android.gms.common.internal.d0.k(this.H, qVar.H);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.C, this.E, this.D, this.F, this.G, this.H});
    }

    public final String toString() {
        u0 u0Var = this.C;
        String strC = ve.c.c(u0Var == null ? null : u0Var.m());
        String strValueOf = String.valueOf(this.D);
        String strValueOf2 = String.valueOf(this.E);
        String strValueOf3 = String.valueOf(this.F);
        String strValueOf4 = String.valueOf(this.G);
        StringBuilder sbS = a1.b.s("PublicKeyCredential{\n id='", this.A, "', \n type='", this.B, "', \n rawId=");
        a1.b.z(sbS, strC, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        a1.b.z(sbS, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        return oi.k.m(sbS, strValueOf4, ", \n authenticatorAttachment='", this.H, "'}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        k1.f11235a.b();
        throw null;
    }
}
