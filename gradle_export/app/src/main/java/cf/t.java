package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import java.util.Arrays;
import ri.t1;

public final class t extends re.a {
    public static final Parcelable.Creator<t> CREATOR = new ah.c(27);
    public final v A;
    public final l B;

    public t(String str, int i10) {
        com.google.android.gms.common.internal.d0.h(str);
        try {
            this.A = v.a(str);
            try {
                this.B = l.a(i10);
            } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e3) {
                throw new IllegalArgumentException(e3);
            }
        } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.A.equals(tVar.A) && this.B.equals(tVar.B);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B});
    }

    public final String toString() {
        return a1.b.q("PublicKeyCredentialParameters{\n type=", String.valueOf(this.A), ", \n algorithm=", String.valueOf(this.B), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        this.A.getClass();
        t1.b0(parcel, 2, "public-key");
        t1.Y(parcel, 3, Integer.valueOf(this.B.A.a()));
        t1.h0(iG0, parcel);
    }
}
