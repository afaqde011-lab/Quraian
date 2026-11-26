package cf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;
import ri.t1;

public final class d extends re.a {
    public static final Parcelable.Creator<d> CREATOR = new k0(11);
    public final o A;
    public final p0 B;
    public final b0 C;
    public final r0 D;
    public final f0 E;
    public final g0 F;
    public final q0 G;
    public final h0 H;
    public final p I;
    public final j0 J;
    public final l0 K;
    public final i0 L;

    public d(o oVar, p0 p0Var, b0 b0Var, r0 r0Var, f0 f0Var, g0 g0Var, q0 q0Var, h0 h0Var, p pVar, j0 j0Var, l0 l0Var, i0 i0Var) {
        this.A = oVar;
        this.C = b0Var;
        this.B = p0Var;
        this.D = r0Var;
        this.E = f0Var;
        this.F = g0Var;
        this.G = q0Var;
        this.H = h0Var;
        this.I = pVar;
        this.J = j0Var;
        this.K = l0Var;
        this.L = i0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return com.google.android.gms.common.internal.d0.k(this.A, dVar.A) && com.google.android.gms.common.internal.d0.k(this.B, dVar.B) && com.google.android.gms.common.internal.d0.k(this.C, dVar.C) && com.google.android.gms.common.internal.d0.k(this.D, dVar.D) && com.google.android.gms.common.internal.d0.k(this.E, dVar.E) && com.google.android.gms.common.internal.d0.k(this.F, dVar.F) && com.google.android.gms.common.internal.d0.k(this.G, dVar.G) && com.google.android.gms.common.internal.d0.k(this.H, dVar.H) && com.google.android.gms.common.internal.d0.k(this.I, dVar.I) && com.google.android.gms.common.internal.d0.k(this.J, dVar.J) && com.google.android.gms.common.internal.d0.k(this.K, dVar.K) && com.google.android.gms.common.internal.d0.k(this.L, dVar.L);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.A);
        String strValueOf2 = String.valueOf(this.B);
        String strValueOf3 = String.valueOf(this.C);
        String strValueOf4 = String.valueOf(this.D);
        String strValueOf5 = String.valueOf(this.E);
        String strValueOf6 = String.valueOf(this.F);
        String strValueOf7 = String.valueOf(this.G);
        String strValueOf8 = String.valueOf(this.H);
        String strValueOf9 = String.valueOf(this.I);
        String strValueOf10 = String.valueOf(this.J);
        String strValueOf11 = String.valueOf(this.K);
        StringBuilder sbS = a1.b.s("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        a1.b.z(sbS, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        a1.b.z(sbS, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        a1.b.z(sbS, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        a1.b.z(sbS, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return x5.n(sbS, strValueOf11, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.a0(parcel, 2, this.A, i10);
        t1.a0(parcel, 3, this.B, i10);
        t1.a0(parcel, 4, this.C, i10);
        t1.a0(parcel, 5, this.D, i10);
        t1.a0(parcel, 6, this.E, i10);
        t1.a0(parcel, 7, this.F, i10);
        t1.a0(parcel, 8, this.G, i10);
        t1.a0(parcel, 9, this.H, i10);
        t1.a0(parcel, 10, this.I, i10);
        t1.a0(parcel, 11, this.J, i10);
        t1.a0(parcel, 12, this.K, i10);
        t1.a0(parcel, 13, this.L, i10);
        t1.h0(iG0, parcel);
    }
}
