package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;
import ri.t1;

public final class k extends re.a {
    public static final Parcelable.Creator<k> CREATOR = new k0(18);
    public final b A;
    public final Boolean B;
    public final c0 C;
    public final y D;

    public k(Boolean bool, String str, String str2, String str3) {
        b bVarA;
        y yVarA = null;
        if (str == null) {
            bVarA = null;
        } else {
            try {
                bVarA = b.a(str);
            } catch (Attachment$UnsupportedAttachmentException | ResidentKeyRequirement$UnsupportedResidentKeyRequirementException | zzbc e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        this.A = bVarA;
        this.B = bool;
        this.C = str2 == null ? null : c0.a(str2);
        if (str3 != null) {
            yVarA = y.a(str3);
        }
        this.D = yVarA;
    }

    public final y a() {
        y yVar = this.D;
        if (yVar == null) {
            yVar = null;
            Boolean bool = this.B;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return y.RESIDENT_KEY_REQUIRED;
                }
                return null;
            }
        }
        return yVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return com.google.android.gms.common.internal.d0.k(this.A, kVar.A) && com.google.android.gms.common.internal.d0.k(this.B, kVar.B) && com.google.android.gms.common.internal.d0.k(this.C, kVar.C) && com.google.android.gms.common.internal.d0.k(a(), kVar.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.C, a()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.A);
        String strValueOf2 = String.valueOf(this.C);
        String strValueOf3 = String.valueOf(this.D);
        StringBuilder sbN = g4.c.n("AuthenticatorSelectionCriteria{\n attachment=", strValueOf, ", \n requireResidentKey=");
        sbN.append(this.B);
        sbN.append(", \n requireUserVerification=");
        sbN.append(strValueOf2);
        sbN.append(", \n residentKeyRequirement=");
        return x5.n(sbN, strValueOf3, "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        b bVar = this.A;
        t1.b0(parcel, 2, bVar == null ? null : bVar.A);
        t1.S(parcel, 3, this.B);
        c0 c0Var = this.C;
        t1.b0(parcel, 4, c0Var == null ? null : c0Var.A);
        y yVarA = a();
        t1.b0(parcel, 5, yVarA != null ? yVarA.A : null);
        t1.h0(iG0, parcel);
    }
}
