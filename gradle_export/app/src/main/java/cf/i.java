package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import java.util.Arrays;
import k9.x0;
import ri.t1;

public final class i extends j {
    public static final Parcelable.Creator<i> CREATOR = new k0(17);
    public final n A;
    public final String B;
    public final int C;

    public i(int i10, String str, int i11) {
        try {
            this.A = n.a(i10);
            this.B = str;
            this.C = i11;
        } catch (ErrorCode$UnsupportedErrorCodeException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return com.google.android.gms.common.internal.d0.k(this.A, iVar.A) && com.google.android.gms.common.internal.d0.k(this.B, iVar.B) && com.google.android.gms.common.internal.d0.k(Integer.valueOf(this.C), Integer.valueOf(iVar.C));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, Integer.valueOf(this.C)});
    }

    public final String toString() {
        x0 x0Var = new x0(getClass().getSimpleName());
        String strValueOf = String.valueOf(this.A.A);
        nf.e eVar = new nf.e((char) 0, 14);
        ((x0) x0Var.D).D = eVar;
        x0Var.D = eVar;
        eVar.C = strValueOf;
        eVar.B = "errorCode";
        String str = this.B;
        if (str != null) {
            x0Var.S(str, "errorMessage");
        }
        return x0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        int i11 = this.A.A;
        t1.f0(parcel, 2, 4);
        parcel.writeInt(i11);
        t1.b0(parcel, 3, this.B);
        t1.f0(parcel, 4, 4);
        parcel.writeInt(this.C);
        t1.h0(iG0, parcel);
    }
}
