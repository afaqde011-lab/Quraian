package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k9.x0;
import nf.u0;
import org.json.JSONException;
import org.json.JSONObject;
import ri.t1;

public final class g extends j {
    public static final Parcelable.Creator<g> CREATOR = new k0(15);
    public final u0 A;
    public final u0 B;
    public final u0 C;
    public final u0 D;
    public final u0 E;

    public g(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        com.google.android.gms.common.internal.d0.h(bArr);
        u0 u0VarL = u0.l(bArr.length, bArr);
        com.google.android.gms.common.internal.d0.h(bArr2);
        u0 u0VarL2 = u0.l(bArr2.length, bArr2);
        com.google.android.gms.common.internal.d0.h(bArr3);
        u0 u0VarL3 = u0.l(bArr3.length, bArr3);
        com.google.android.gms.common.internal.d0.h(bArr4);
        u0 u0VarL4 = u0.l(bArr4.length, bArr4);
        u0 u0VarL5 = bArr5 == null ? null : u0.l(bArr5.length, bArr5);
        this.A = u0VarL;
        this.B = u0VarL2;
        this.C = u0VarL3;
        this.D = u0VarL4;
        this.E = u0VarL5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return com.google.android.gms.common.internal.d0.k(this.A, gVar.A) && com.google.android.gms.common.internal.d0.k(this.B, gVar.B) && com.google.android.gms.common.internal.d0.k(this.C, gVar.C) && com.google.android.gms.common.internal.d0.k(this.D, gVar.D) && com.google.android.gms.common.internal.d0.k(this.E, gVar.E);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.A})), Integer.valueOf(Arrays.hashCode(new Object[]{this.B})), Integer.valueOf(Arrays.hashCode(new Object[]{this.C})), Integer.valueOf(Arrays.hashCode(new Object[]{this.D})), Integer.valueOf(Arrays.hashCode(new Object[]{this.E}))});
    }

    public final String toString() {
        x0 x0Var = new x0(getClass().getSimpleName());
        nf.m0 m0Var = nf.o0.f11248d;
        byte[] bArrM = this.A.m();
        x0Var.S(m0Var.c(bArrM.length, bArrM), "keyHandle");
        byte[] bArrM2 = this.B.m();
        x0Var.S(m0Var.c(bArrM2.length, bArrM2), "clientDataJSON");
        byte[] bArrM3 = this.C.m();
        x0Var.S(m0Var.c(bArrM3.length, bArrM3), "authenticatorData");
        byte[] bArrM4 = this.D.m();
        x0Var.S(m0Var.c(bArrM4.length, bArrM4), "signature");
        u0 u0Var = this.E;
        byte[] bArrM5 = u0Var == null ? null : u0Var.m();
        if (bArrM5 != null) {
            x0Var.S(m0Var.c(bArrM5.length, bArrM5), "userHandle");
        }
        return x0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.U(parcel, 2, this.A.m());
        t1.U(parcel, 3, this.B.m());
        t1.U(parcel, 4, this.C.m());
        t1.U(parcel, 5, this.D.m());
        u0 u0Var = this.E;
        t1.U(parcel, 6, u0Var == null ? null : u0Var.m());
        t1.h0(iG0, parcel);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", ve.c.c(this.B.m()));
            jSONObject.put("authenticatorData", ve.c.c(this.C.m()));
            jSONObject.put("signature", ve.c.c(this.D.m()));
            u0 u0Var = this.E;
            if (u0Var != null) {
                jSONObject.put("userHandle", ve.c.c(u0Var == null ? null : u0Var.m()));
            }
            return jSONObject;
        } catch (JSONException e3) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e3);
        }
    }
}
