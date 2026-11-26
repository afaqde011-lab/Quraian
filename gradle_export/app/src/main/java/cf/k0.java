package cf;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException;
import com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException;
import com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException;
import com.google.android.gms.fido.fido2.api.common.zzbc;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import nf.u0;

public final class k0 implements Parcelable.Creator {

    public final int f3148a;

    public k0(int i10) {
        this.f3148a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3148a) {
            case 0:
                int iJ0 = rd.a.j0(parcel);
                byte[] bArrM = null;
                String strT = null;
                String strT2 = null;
                String strT3 = null;
                while (parcel.dataPosition() < iJ0) {
                    int i10 = parcel.readInt();
                    char c10 = (char) i10;
                    if (c10 == 2) {
                        bArrM = rd.a.m(i10, parcel);
                    } else if (c10 == 3) {
                        strT = rd.a.t(i10, parcel);
                    } else if (c10 == 4) {
                        strT2 = rd.a.t(i10, parcel);
                    } else if (c10 != 5) {
                        rd.a.h0(i10, parcel);
                    } else {
                        strT3 = rd.a.t(i10, parcel);
                    }
                }
                rd.a.A(iJ0, parcel);
                return new w(strT, strT2, strT3, bArrM);
            case 1:
                String string = parcel.readString();
                if (string == null) {
                    string = RuntimeVersion.SUFFIX;
                }
                try {
                    return y.a(string);
                } catch (ResidentKeyRequirement$UnsupportedResidentKeyRequirementException e3) {
                    throw new RuntimeException(e3);
                }
            case 2:
                int iJ1 = rd.a.j0(parcel);
                String strT4 = null;
                while (parcel.dataPosition() < iJ1) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        rd.a.h0(i11, parcel);
                    } else {
                        strT4 = rd.a.t(i11, parcel);
                    }
                }
                rd.a.A(iJ1, parcel);
                return new l0(strT4);
            case 3:
                try {
                    return z.a(parcel.readString());
                } catch (TokenBinding$UnsupportedTokenBindingStatusException e10) {
                    throw new RuntimeException(e10);
                }
            case 4:
                int iJ2 = rd.a.j0(parcel);
                String strT5 = null;
                String strT6 = null;
                while (parcel.dataPosition() < iJ2) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 2) {
                        strT5 = rd.a.t(i12, parcel);
                    } else if (c11 != 3) {
                        rd.a.h0(i12, parcel);
                    } else {
                        strT6 = rd.a.t(i12, parcel);
                    }
                }
                rd.a.A(iJ2, parcel);
                return new a0(strT5, strT6);
            case 5:
                try {
                    return c.a(parcel.readString());
                } catch (AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException e11) {
                    throw new RuntimeException(e11);
                }
            case 6:
                int iJ3 = rd.a.j0(parcel);
                boolean zQ = false;
                while (parcel.dataPosition() < iJ3) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        rd.a.h0(i13, parcel);
                    } else {
                        zQ = rd.a.Q(i13, parcel);
                    }
                }
                rd.a.A(iJ3, parcel);
                return new b0(zQ);
            case 7:
                try {
                    return c0.a(parcel.readString());
                } catch (zzbc e12) {
                    throw new RuntimeException(e12);
                }
            case 8:
                int iJ4 = rd.a.j0(parcel);
                ArrayList arrayListW = null;
                while (parcel.dataPosition() < iJ4) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        rd.a.h0(i14, parcel);
                    } else {
                        arrayListW = rd.a.w(parcel, i14, e0.CREATOR);
                    }
                }
                rd.a.A(iJ4, parcel);
                return new d0(arrayListW);
            case 9:
                int iJ5 = rd.a.j0(parcel);
                int iU = 0;
                short s6 = 0;
                short s10 = 0;
                while (parcel.dataPosition() < iJ5) {
                    int i15 = parcel.readInt();
                    char c12 = (char) i15;
                    if (c12 == 1) {
                        iU = rd.a.U(i15, parcel);
                    } else if (c12 == 2) {
                        rd.a.l0(parcel, i15, 4);
                        s6 = (short) parcel.readInt();
                    } else if (c12 != 3) {
                        rd.a.h0(i15, parcel);
                    } else {
                        rd.a.l0(parcel, i15, 4);
                        s10 = (short) parcel.readInt();
                    }
                }
                rd.a.A(iJ5, parcel);
                return new e0(iU, s6, s10);
            case 10:
                int iJ6 = rd.a.j0(parcel);
                d0 d0Var = null;
                m0 m0Var = null;
                f fVar = null;
                n0 n0Var = null;
                String strT7 = null;
                while (parcel.dataPosition() < iJ6) {
                    int i16 = parcel.readInt();
                    char c13 = (char) i16;
                    if (c13 == 1) {
                        d0Var = (d0) rd.a.s(parcel, i16, d0.CREATOR);
                    } else if (c13 == 2) {
                        m0Var = (m0) rd.a.s(parcel, i16, m0.CREATOR);
                    } else if (c13 == 3) {
                        fVar = (f) rd.a.s(parcel, i16, f.CREATOR);
                    } else if (c13 == 4) {
                        n0Var = (n0) rd.a.s(parcel, i16, n0.CREATOR);
                    } else if (c13 != 5) {
                        rd.a.h0(i16, parcel);
                    } else {
                        strT7 = rd.a.t(i16, parcel);
                    }
                }
                rd.a.A(iJ6, parcel);
                return new e(d0Var, m0Var, fVar, n0Var, strT7);
            case 11:
                int iJ7 = rd.a.j0(parcel);
                o oVar = null;
                p0 p0Var = null;
                b0 b0Var = null;
                r0 r0Var = null;
                f0 f0Var = null;
                g0 g0Var = null;
                q0 q0Var = null;
                h0 h0Var = null;
                p pVar = null;
                j0 j0Var = null;
                l0 l0Var = null;
                i0 i0Var = null;
                while (parcel.dataPosition() < iJ7) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            oVar = (o) rd.a.s(parcel, i17, o.CREATOR);
                            break;
                        case 3:
                            p0Var = (p0) rd.a.s(parcel, i17, p0.CREATOR);
                            break;
                        case 4:
                            b0Var = (b0) rd.a.s(parcel, i17, b0.CREATOR);
                            break;
                        case 5:
                            r0Var = (r0) rd.a.s(parcel, i17, r0.CREATOR);
                            break;
                        case 6:
                            f0Var = (f0) rd.a.s(parcel, i17, f0.CREATOR);
                            break;
                        case 7:
                            g0Var = (g0) rd.a.s(parcel, i17, g0.CREATOR);
                            break;
                        case '\b':
                            q0Var = (q0) rd.a.s(parcel, i17, q0.CREATOR);
                            break;
                        case '\t':
                            h0Var = (h0) rd.a.s(parcel, i17, h0.CREATOR);
                            break;
                        case '\n':
                            pVar = (p) rd.a.s(parcel, i17, p.CREATOR);
                            break;
                        case 11:
                            j0Var = (j0) rd.a.s(parcel, i17, j0.CREATOR);
                            break;
                        case '\f':
                            l0Var = (l0) rd.a.s(parcel, i17, l0.CREATOR);
                            break;
                        case '\r':
                            i0Var = (i0) rd.a.s(parcel, i17, i0.CREATOR);
                            break;
                        default:
                            rd.a.h0(i17, parcel);
                            break;
                    }
                }
                rd.a.A(iJ7, parcel);
                return new d(oVar, p0Var, b0Var, r0Var, f0Var, g0Var, q0Var, h0Var, pVar, j0Var, l0Var, i0Var);
            case 12:
                int iJ8 = rd.a.j0(parcel);
                boolean zQ2 = false;
                while (parcel.dataPosition() < iJ8) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        rd.a.h0(i18, parcel);
                    } else {
                        zQ2 = rd.a.Q(i18, parcel);
                    }
                }
                rd.a.A(iJ8, parcel);
                return new f(zQ2);
            case 13:
                int iJ9 = rd.a.j0(parcel);
                byte[] bArrM2 = null;
                byte[] bArrM3 = null;
                while (parcel.dataPosition() < iJ9) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 1) {
                        bArrM2 = rd.a.m(i19, parcel);
                    } else if (c14 != 2) {
                        rd.a.h0(i19, parcel);
                    } else {
                        bArrM3 = rd.a.m(i19, parcel);
                    }
                }
                rd.a.A(iJ9, parcel);
                return new m0(bArrM2 == null ? null : u0.l(bArrM2.length, bArrM2), bArrM3 != null ? u0.l(bArrM3.length, bArrM3) : null);
            case 14:
                int iJ10 = rd.a.j0(parcel);
                boolean zQ3 = false;
                byte[] bArrM4 = null;
                while (parcel.dataPosition() < iJ10) {
                    int i20 = parcel.readInt();
                    char c15 = (char) i20;
                    if (c15 == 1) {
                        zQ3 = rd.a.Q(i20, parcel);
                    } else if (c15 != 2) {
                        rd.a.h0(i20, parcel);
                    } else {
                        bArrM4 = rd.a.m(i20, parcel);
                    }
                }
                rd.a.A(iJ10, parcel);
                return new n0(zQ3, bArrM4 != null ? u0.l(bArrM4.length, bArrM4) : null);
            case 15:
                int iJ11 = rd.a.j0(parcel);
                byte[] bArrM5 = null;
                byte[] bArrM6 = null;
                byte[] bArrM7 = null;
                byte[] bArrM8 = null;
                byte[] bArrM9 = null;
                while (parcel.dataPosition() < iJ11) {
                    int i21 = parcel.readInt();
                    char c16 = (char) i21;
                    if (c16 == 2) {
                        bArrM5 = rd.a.m(i21, parcel);
                    } else if (c16 == 3) {
                        bArrM6 = rd.a.m(i21, parcel);
                    } else if (c16 == 4) {
                        bArrM7 = rd.a.m(i21, parcel);
                    } else if (c16 == 5) {
                        bArrM8 = rd.a.m(i21, parcel);
                    } else if (c16 != 6) {
                        rd.a.h0(i21, parcel);
                    } else {
                        bArrM9 = rd.a.m(i21, parcel);
                    }
                }
                rd.a.A(iJ11, parcel);
                return new g(bArrM5, bArrM6, bArrM7, bArrM8, bArrM9);
            case 16:
                int iJ12 = rd.a.j0(parcel);
                byte[] bArrM10 = null;
                byte[] bArrM11 = null;
                byte[] bArrM12 = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iJ12) {
                    int i22 = parcel.readInt();
                    char c17 = (char) i22;
                    if (c17 == 2) {
                        bArrM10 = rd.a.m(i22, parcel);
                    } else if (c17 == 3) {
                        bArrM11 = rd.a.m(i22, parcel);
                    } else if (c17 == 4) {
                        bArrM12 = rd.a.m(i22, parcel);
                    } else if (c17 != 5) {
                        rd.a.h0(i22, parcel);
                    } else {
                        int iX = rd.a.X(i22, parcel);
                        int iDataPosition = parcel.dataPosition();
                        if (iX == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iX);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                rd.a.A(iJ12, parcel);
                return new h(bArrM10, bArrM11, bArrM12, strArr);
            case 17:
                int iJ13 = rd.a.j0(parcel);
                int iU2 = 0;
                String strT8 = null;
                int iU3 = 0;
                while (parcel.dataPosition() < iJ13) {
                    int i23 = parcel.readInt();
                    char c18 = (char) i23;
                    if (c18 == 2) {
                        iU2 = rd.a.U(i23, parcel);
                    } else if (c18 == 3) {
                        strT8 = rd.a.t(i23, parcel);
                    } else if (c18 != 4) {
                        rd.a.h0(i23, parcel);
                    } else {
                        iU3 = rd.a.U(i23, parcel);
                    }
                }
                rd.a.A(iJ13, parcel);
                return new i(iU2, strT8, iU3);
            case TYPE_SINT64_VALUE:
                int iJ14 = rd.a.j0(parcel);
                String strT9 = null;
                Boolean boolR = null;
                String strT10 = null;
                String strT11 = null;
                while (parcel.dataPosition() < iJ14) {
                    int i24 = parcel.readInt();
                    char c19 = (char) i24;
                    if (c19 == 2) {
                        strT9 = rd.a.t(i24, parcel);
                    } else if (c19 == 3) {
                        boolR = rd.a.R(i24, parcel);
                    } else if (c19 == 4) {
                        strT10 = rd.a.t(i24, parcel);
                    } else if (c19 != 5) {
                        rd.a.h0(i24, parcel);
                    } else {
                        strT11 = rd.a.t(i24, parcel);
                    }
                }
                rd.a.A(iJ14, parcel);
                return new k(boolR, strT9, strT10, strT11);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                try {
                    return l.a(parcel.readInt());
                } catch (COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException e13) {
                    throw new RuntimeException(e13);
                }
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                int iJ15 = rd.a.j0(parcel);
                byte[] bArrM13 = null;
                byte[] bArrM14 = null;
                byte[] bArrM15 = null;
                long jW = 0;
                while (parcel.dataPosition() < iJ15) {
                    int i25 = parcel.readInt();
                    char c20 = (char) i25;
                    if (c20 == 1) {
                        jW = rd.a.W(i25, parcel);
                    } else if (c20 == 2) {
                        bArrM13 = rd.a.m(i25, parcel);
                    } else if (c20 == 3) {
                        bArrM14 = rd.a.m(i25, parcel);
                    } else if (c20 != 4) {
                        rd.a.h0(i25, parcel);
                    } else {
                        bArrM15 = rd.a.m(i25, parcel);
                    }
                }
                rd.a.A(iJ15, parcel);
                return new o0(jW, bArrM13, bArrM14, bArrM15);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                int iJ16 = rd.a.j0(parcel);
                ArrayList arrayListW2 = null;
                while (parcel.dataPosition() < iJ16) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 1) {
                        rd.a.h0(i26, parcel);
                    } else {
                        arrayListW2 = rd.a.w(parcel, i26, o0.CREATOR);
                    }
                }
                rd.a.A(iJ16, parcel);
                return new p0(arrayListW2);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                int iJ17 = rd.a.j0(parcel);
                while (parcel.dataPosition() < iJ17) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        rd.a.h0(i27, parcel);
                    } else {
                        rd.a.Q(i27, parcel);
                    }
                }
                rd.a.A(iJ17, parcel);
                return new q0();
            case 23:
                try {
                    return n.a(parcel.readInt());
                } catch (ErrorCode$UnsupportedErrorCodeException e14) {
                    throw new IllegalArgumentException(e14);
                }
            case 24:
                int iJ18 = rd.a.j0(parcel);
                String strT12 = null;
                while (parcel.dataPosition() < iJ18) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 2) {
                        rd.a.h0(i28, parcel);
                    } else {
                        strT12 = rd.a.t(i28, parcel);
                    }
                }
                rd.a.A(iJ18, parcel);
                return new o(strT12);
            case 25:
                int iJ19 = rd.a.j0(parcel);
                ArrayList arrayListW3 = null;
                int iU4 = 0;
                while (parcel.dataPosition() < iJ19) {
                    int i29 = parcel.readInt();
                    char c21 = (char) i29;
                    if (c21 == 1) {
                        iU4 = rd.a.U(i29, parcel);
                    } else if (c21 != 2) {
                        rd.a.h0(i29, parcel);
                    } else {
                        arrayListW3 = rd.a.w(parcel, i29, com.google.android.gms.common.internal.p.CREATOR);
                    }
                }
                rd.a.A(iJ19, parcel);
                return new com.google.android.gms.common.internal.s(iU4, arrayListW3);
            case RuntimeVersion.MINOR:
                int iJ20 = rd.a.j0(parcel);
                int iU5 = -1;
                int iU6 = 0;
                int iU7 = 0;
                int iU8 = 0;
                int iU9 = 0;
                String strT13 = null;
                String strT14 = null;
                long jW2 = 0;
                long jW3 = 0;
                while (parcel.dataPosition() < iJ20) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 1:
                            iU6 = rd.a.U(i30, parcel);
                            break;
                        case 2:
                            iU7 = rd.a.U(i30, parcel);
                            break;
                        case 3:
                            iU8 = rd.a.U(i30, parcel);
                            break;
                        case 4:
                            jW2 = rd.a.W(i30, parcel);
                            break;
                        case 5:
                            jW3 = rd.a.W(i30, parcel);
                            break;
                        case 6:
                            strT13 = rd.a.t(i30, parcel);
                            break;
                        case 7:
                            strT14 = rd.a.t(i30, parcel);
                            break;
                        case '\b':
                            iU9 = rd.a.U(i30, parcel);
                            break;
                        case '\t':
                            iU5 = rd.a.U(i30, parcel);
                            break;
                        default:
                            rd.a.h0(i30, parcel);
                            break;
                    }
                }
                rd.a.A(iJ20, parcel);
                return new com.google.android.gms.common.internal.p(iU6, iU7, iU8, jW2, jW3, strT13, strT14, iU9, iU5);
            case 27:
                int iJ21 = rd.a.j0(parcel);
                Account account = null;
                int iU10 = 0;
                int iU11 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iJ21) {
                    int i31 = parcel.readInt();
                    char c22 = (char) i31;
                    if (c22 == 1) {
                        iU10 = rd.a.U(i31, parcel);
                    } else if (c22 == 2) {
                        account = (Account) rd.a.s(parcel, i31, Account.CREATOR);
                    } else if (c22 == 3) {
                        iU11 = rd.a.U(i31, parcel);
                    } else if (c22 != 4) {
                        rd.a.h0(i31, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) rd.a.s(parcel, i31, GoogleSignInAccount.CREATOR);
                    }
                }
                rd.a.A(iJ21, parcel);
                return new com.google.android.gms.common.internal.w(iU10, account, iU11, googleSignInAccount);
            case 28:
                int iJ22 = rd.a.j0(parcel);
                int iU12 = 0;
                boolean zQ4 = false;
                boolean zQ5 = false;
                IBinder iBinderT = null;
                pe.b bVar = null;
                while (parcel.dataPosition() < iJ22) {
                    int i32 = parcel.readInt();
                    char c23 = (char) i32;
                    if (c23 == 1) {
                        iU12 = rd.a.U(i32, parcel);
                    } else if (c23 == 2) {
                        iBinderT = rd.a.T(i32, parcel);
                    } else if (c23 == 3) {
                        bVar = (pe.b) rd.a.s(parcel, i32, pe.b.CREATOR);
                    } else if (c23 == 4) {
                        zQ4 = rd.a.Q(i32, parcel);
                    } else if (c23 != 5) {
                        rd.a.h0(i32, parcel);
                    } else {
                        zQ5 = rd.a.Q(i32, parcel);
                    }
                }
                rd.a.A(iJ22, parcel);
                return new com.google.android.gms.common.internal.x(iU12, iBinderT, bVar, zQ4, zQ5);
            default:
                int iJ23 = rd.a.j0(parcel);
                int iU13 = 0;
                int iU14 = 0;
                int iU15 = 0;
                boolean zQ6 = false;
                boolean zQ7 = false;
                while (parcel.dataPosition() < iJ23) {
                    int i33 = parcel.readInt();
                    char c24 = (char) i33;
                    if (c24 == 1) {
                        iU13 = rd.a.U(i33, parcel);
                    } else if (c24 == 2) {
                        zQ6 = rd.a.Q(i33, parcel);
                    } else if (c24 == 3) {
                        zQ7 = rd.a.Q(i33, parcel);
                    } else if (c24 == 4) {
                        iU14 = rd.a.U(i33, parcel);
                    } else if (c24 != 5) {
                        rd.a.h0(i33, parcel);
                    } else {
                        iU15 = rd.a.U(i33, parcel);
                    }
                }
                rd.a.A(iJ23, parcel);
                return new com.google.android.gms.common.internal.r(iU13, iU14, iU15, zQ6, zQ7);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f3148a) {
            case 0:
                return new w[i10];
            case 1:
                return new y[i10];
            case 2:
                return new l0[i10];
            case 3:
                return new z[i10];
            case 4:
                return new a0[i10];
            case 5:
                return new c[i10];
            case 6:
                return new b0[i10];
            case 7:
                return new c0[i10];
            case 8:
                return new d0[i10];
            case 9:
                return new e0[i10];
            case 10:
                return new e[i10];
            case 11:
                return new d[i10];
            case 12:
                return new f[i10];
            case 13:
                return new m0[i10];
            case 14:
                return new n0[i10];
            case 15:
                return new g[i10];
            case 16:
                return new h[i10];
            case 17:
                return new i[i10];
            case TYPE_SINT64_VALUE:
                return new k[i10];
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return new l[i10];
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return new o0[i10];
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new p0[i10];
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return new q0[i10];
            case 23:
                return new n[i10];
            case 24:
                return new o[i10];
            case 25:
                return new com.google.android.gms.common.internal.s[i10];
            case RuntimeVersion.MINOR:
                return new com.google.android.gms.common.internal.p[i10];
            case 27:
                return new com.google.android.gms.common.internal.w[i10];
            case 28:
                return new com.google.android.gms.common.internal.x[i10];
            default:
                return new com.google.android.gms.common.internal.r[i10];
        }
    }
}
