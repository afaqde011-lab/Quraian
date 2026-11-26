package cf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import ri.t1;

public final class e extends re.a {
    public static final Parcelable.Creator<e> CREATOR = new k0(10);
    public final d0 A;
    public final m0 B;
    public final f C;
    public final n0 D;
    public final String E;

    public e(d0 d0Var, m0 m0Var, f fVar, n0 n0Var, String str) {
        this.A = d0Var;
        this.B = m0Var;
        this.C = fVar;
        this.D = n0Var;
        this.E = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return com.google.android.gms.common.internal.d0.k(this.A, eVar.A) && com.google.android.gms.common.internal.d0.k(this.B, eVar.B) && com.google.android.gms.common.internal.d0.k(this.C, eVar.C) && com.google.android.gms.common.internal.d0.k(this.D, eVar.D) && com.google.android.gms.common.internal.d0.k(this.E, eVar.E);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.C, this.D, this.E});
    }

    public final String toString() {
        return a1.b.p("AuthenticationExtensionsClientOutputs{", zza().toString(), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.a0(parcel, 1, this.A, i10);
        t1.a0(parcel, 2, this.B, i10);
        t1.a0(parcel, 3, this.C, i10);
        t1.a0(parcel, 4, this.D, i10);
        t1.b0(parcel, 5, this.E);
        t1.h0(iG0, parcel);
    }

    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            f fVar = this.C;
            if (fVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", fVar.A);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e3) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e3);
                }
            }
            d0 d0Var = this.A;
            if (d0Var != null) {
                jSONObject.put("uvm", d0Var.a());
            }
            n0 n0Var = this.D;
            if (n0Var != null) {
                jSONObject.put("prf", n0Var.zza());
            }
            String str = this.E;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e10);
        }
    }
}
