package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nf.u0;
import ri.t1;

public final class s extends re.a {
    public static final Parcelable.Creator<s> CREATOR;
    public final v A;
    public final u0 B;
    public final List C;

    static {
        nf.q.i(2, nf.b.C, nf.b.D);
        CREATOR = new ah.c(26);
    }

    public s(String str, byte[] bArr, ArrayList arrayList) {
        u0 u0Var = u0.C;
        u0 u0VarL = u0.l(bArr.length, bArr);
        com.google.android.gms.common.internal.d0.h(str);
        try {
            this.A = v.a(str);
            this.B = u0VarL;
            this.C = arrayList;
        } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        List list = sVar.C;
        if (!this.A.equals(sVar.A) || !com.google.android.gms.common.internal.d0.k(this.B, sVar.B)) {
            return false;
        }
        List list2 = this.C;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.C});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.A);
        String strC = ve.c.c(this.B.m());
        return x5.n(a1.b.s("PublicKeyCredentialDescriptor{\n type=", strValueOf, ", \n id=", strC, ", \n transports="), String.valueOf(this.C), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        this.A.getClass();
        t1.b0(parcel, 2, "public-key");
        t1.U(parcel, 3, this.B.m());
        t1.e0(parcel, 4, this.C);
        t1.h0(iG0, parcel);
    }
}
