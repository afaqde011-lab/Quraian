package cf;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import nf.u0;
import org.json.JSONException;
import org.json.JSONObject;
import ri.t1;

public final class n0 extends re.a {
    public static final Parcelable.Creator<n0> CREATOR = new k0(14);
    public final boolean A;
    public final u0 B;

    public n0(boolean z10, u0 u0Var) {
        this.A = z10;
        this.B = u0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.A == n0Var.A && com.google.android.gms.common.internal.d0.k(this.B, n0Var.B);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A), this.B});
    }

    public final String toString() {
        return a1.b.p("AuthenticationExtensionsPrfOutputs{", zza().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(this.A ? 1 : 0);
        u0 u0Var = this.B;
        t1.U(parcel, 2, u0Var == null ? null : u0Var.m());
        t1.h0(iG0, parcel);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.A) {
                jSONObject.put("enabled", true);
            }
            u0 u0Var = this.B;
            byte[] bArrM = u0Var == null ? null : u0Var.m();
            if (bArrM != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrM, 32), 11));
                if (bArrM.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrM, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e3) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e3);
        }
    }
}
