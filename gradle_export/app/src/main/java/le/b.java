package le;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.k;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import ne.c;
import ne.d;
import ne.e;
import ne.f;
import oj.p;
import p.l0;
import pe.q;
import ri.t1;
import tf.b4;
import tf.g4;
import tf.i;
import tf.n3;
import tf.q3;
import tf.r;
import tf.r3;
import tf.s;
import tf.s3;

public final class b implements Parcelable.Creator {

    public final int f10291a;

    public b(int i10) {
        this.f10291a = i10;
    }

    public static void a(s sVar, Parcel parcel, int i10) {
        String str = sVar.A;
        int iG0 = t1.g0(20293, parcel);
        t1.b0(parcel, 2, str);
        t1.a0(parcel, 3, sVar.B, i10);
        t1.b0(parcel, 4, sVar.C);
        long j9 = sVar.D;
        t1.f0(parcel, 5, 8);
        parcel.writeLong(j9);
        t1.h0(iG0, parcel);
    }

    public static void b(b4 b4Var, Parcel parcel) {
        int i10 = b4Var.A;
        int iG0 = t1.g0(20293, parcel);
        t1.f0(parcel, 1, 4);
        parcel.writeInt(i10);
        t1.b0(parcel, 2, b4Var.B);
        long j9 = b4Var.C;
        t1.f0(parcel, 3, 8);
        parcel.writeLong(j9);
        Long l = b4Var.D;
        if (l != null) {
            t1.f0(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        t1.b0(parcel, 6, b4Var.E);
        t1.b0(parcel, 7, b4Var.F);
        Double d3 = b4Var.G;
        if (d3 != null) {
            t1.f0(parcel, 8, 8);
            parcel.writeDouble(d3.doubleValue());
        }
        t1.h0(iG0, parcel);
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10291a) {
            case 0:
                int iJ0 = rd.a.j0(parcel);
                String strT = null;
                String strT2 = null;
                String strT3 = null;
                String strT4 = null;
                Uri uri = null;
                String strT5 = null;
                String strT6 = null;
                ArrayList arrayListW = null;
                String strT7 = null;
                String strT8 = null;
                long jW = 0;
                while (parcel.dataPosition() < iJ0) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strT = rd.a.t(i10, parcel);
                            break;
                        case 3:
                            strT2 = rd.a.t(i10, parcel);
                            break;
                        case 4:
                            strT3 = rd.a.t(i10, parcel);
                            break;
                        case 5:
                            strT4 = rd.a.t(i10, parcel);
                            break;
                        case 6:
                            uri = (Uri) rd.a.s(parcel, i10, Uri.CREATOR);
                            break;
                        case 7:
                            strT5 = rd.a.t(i10, parcel);
                            break;
                        case '\b':
                            jW = rd.a.W(i10, parcel);
                            break;
                        case '\t':
                            strT6 = rd.a.t(i10, parcel);
                            break;
                        case '\n':
                            arrayListW = rd.a.w(parcel, i10, Scope.CREATOR);
                            break;
                        case 11:
                            strT7 = rd.a.t(i10, parcel);
                            break;
                        case '\f':
                            strT8 = rd.a.t(i10, parcel);
                            break;
                        default:
                            rd.a.h0(i10, parcel);
                            break;
                    }
                }
                rd.a.A(iJ0, parcel);
                return new GoogleSignInAccount(strT, strT2, strT3, strT4, uri, strT5, jW, strT6, arrayListW, strT7, strT8);
            case 1:
                int iJ1 = rd.a.j0(parcel);
                ArrayList arrayListW2 = null;
                ArrayList arrayListW3 = null;
                Account account = null;
                String strT9 = null;
                String strT10 = null;
                String strT11 = null;
                int iU = 0;
                boolean zQ = false;
                boolean zQ2 = false;
                boolean zQ3 = false;
                while (parcel.dataPosition() < iJ1) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iU = rd.a.U(i11, parcel);
                            break;
                        case 2:
                            arrayListW3 = rd.a.w(parcel, i11, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) rd.a.s(parcel, i11, Account.CREATOR);
                            break;
                        case 4:
                            zQ = rd.a.Q(i11, parcel);
                            break;
                        case 5:
                            zQ2 = rd.a.Q(i11, parcel);
                            break;
                        case 6:
                            zQ3 = rd.a.Q(i11, parcel);
                            break;
                        case 7:
                            strT9 = rd.a.t(i11, parcel);
                            break;
                        case '\b':
                            strT10 = rd.a.t(i11, parcel);
                            break;
                        case '\t':
                            arrayListW2 = rd.a.w(parcel, i11, me.a.CREATOR);
                            break;
                        case '\n':
                            strT11 = rd.a.t(i11, parcel);
                            break;
                        default:
                            rd.a.h0(i11, parcel);
                            break;
                    }
                }
                rd.a.A(iJ1, parcel);
                return new GoogleSignInOptions(iU, arrayListW3, account, zQ, zQ2, zQ3, strT9, strT10, GoogleSignInOptions.b(arrayListW2), strT11);
            case 2:
                int iJ2 = rd.a.j0(parcel);
                String strT12 = RuntimeVersion.SUFFIX;
                GoogleSignInAccount googleSignInAccount = null;
                String strT13 = RuntimeVersion.SUFFIX;
                while (parcel.dataPosition() < iJ2) {
                    int i12 = parcel.readInt();
                    char c10 = (char) i12;
                    if (c10 == 4) {
                        strT12 = rd.a.t(i12, parcel);
                    } else if (c10 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) rd.a.s(parcel, i12, GoogleSignInAccount.CREATOR);
                    } else if (c10 != '\b') {
                        rd.a.h0(i12, parcel);
                    } else {
                        strT13 = rd.a.t(i12, parcel);
                    }
                }
                rd.a.A(iJ2, parcel);
                return new SignInAccount(strT12, googleSignInAccount, strT13);
            case 3:
                int iJ3 = rd.a.j0(parcel);
                Bundle bundleL = null;
                int iU2 = 0;
                int iU3 = 0;
                while (parcel.dataPosition() < iJ3) {
                    int i13 = parcel.readInt();
                    char c11 = (char) i13;
                    if (c11 == 1) {
                        iU2 = rd.a.U(i13, parcel);
                    } else if (c11 == 2) {
                        iU3 = rd.a.U(i13, parcel);
                    } else if (c11 != 3) {
                        rd.a.h0(i13, parcel);
                    } else {
                        bundleL = rd.a.l(i13, parcel);
                    }
                }
                rd.a.A(iJ3, parcel);
                return new me.a(iU2, iU3, bundleL);
            case 4:
                int iJ4 = rd.a.j0(parcel);
                String strT14 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iJ4) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 2) {
                        strT14 = rd.a.t(i14, parcel);
                    } else if (c12 != 5) {
                        rd.a.h0(i14, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) rd.a.s(parcel, i14, GoogleSignInOptions.CREATOR);
                    }
                }
                rd.a.A(iJ4, parcel);
                return new SignInConfiguration(strT14, googleSignInOptions);
            case 5:
                int iJ5 = rd.a.j0(parcel);
                byte[] bArrM = null;
                String strT15 = null;
                while (parcel.dataPosition() < iJ5) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        bArrM = rd.a.m(i15, parcel);
                    } else if (c13 != 2) {
                        rd.a.h0(i15, parcel);
                    } else {
                        strT15 = rd.a.t(i15, parcel);
                    }
                }
                rd.a.A(iJ5, parcel);
                return new d(strT15, bArrM);
            case 6:
                int iJ6 = rd.a.j0(parcel);
                boolean zQ4 = false;
                ArrayList arrayListU = null;
                while (parcel.dataPosition() < iJ6) {
                    int i16 = parcel.readInt();
                    char c14 = (char) i16;
                    if (c14 == 1) {
                        arrayListU = rd.a.u(i16, parcel);
                    } else if (c14 != 2) {
                        rd.a.h0(i16, parcel);
                    } else {
                        zQ4 = rd.a.Q(i16, parcel);
                    }
                }
                rd.a.A(iJ6, parcel);
                return new ne.b(arrayListU, zQ4);
            case 7:
                int iJ7 = rd.a.j0(parcel);
                boolean zQ5 = false;
                ArrayList arrayListU2 = null;
                while (parcel.dataPosition() < iJ7) {
                    int i17 = parcel.readInt();
                    char c15 = (char) i17;
                    if (c15 == 1) {
                        arrayListU2 = rd.a.u(i17, parcel);
                    } else if (c15 != 2) {
                        rd.a.h0(i17, parcel);
                    } else {
                        zQ5 = rd.a.Q(i17, parcel);
                    }
                }
                rd.a.A(iJ7, parcel);
                return new c(arrayListU2, zQ5);
            case 8:
                int iJ8 = rd.a.j0(parcel);
                Bundle bundleL2 = null;
                ArrayList arrayListW4 = null;
                while (parcel.dataPosition() < iJ8) {
                    int i18 = parcel.readInt();
                    char c16 = (char) i18;
                    if (c16 == 1) {
                        bundleL2 = rd.a.l(i18, parcel);
                    } else if (c16 != 2) {
                        rd.a.h0(i18, parcel);
                    } else {
                        arrayListW4 = rd.a.w(parcel, i18, d.CREATOR);
                    }
                }
                rd.a.A(iJ8, parcel);
                return new e(bundleL2, arrayListW4);
            case 9:
                int iJ9 = rd.a.j0(parcel);
                String strT16 = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
                boolean zQ6 = false;
                byte[] bArrM2 = null;
                while (parcel.dataPosition() < iJ9) {
                    int i19 = parcel.readInt();
                    char c17 = (char) i19;
                    if (c17 == 1) {
                        bArrM2 = rd.a.m(i19, parcel);
                    } else if (c17 == 2) {
                        zQ6 = rd.a.Q(i19, parcel);
                    } else if (c17 != 3) {
                        rd.a.h0(i19, parcel);
                    } else {
                        strT16 = rd.a.t(i19, parcel);
                    }
                }
                rd.a.A(iJ9, parcel);
                return new f(strT16, zQ6, bArrM2);
            case 10:
                int iJ10 = rd.a.j0(parcel);
                Bundle bundleL3 = null;
                while (parcel.dataPosition() < iJ10) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 2) {
                        rd.a.h0(i20, parcel);
                    } else {
                        bundleL3 = rd.a.l(i20, parcel);
                    }
                }
                rd.a.A(iJ10, parcel);
                return new p(bundleL3);
            case 11:
                l0 l0Var = new l0(parcel);
                l0Var.A = parcel.readByte() != 0;
                return l0Var;
            case 12:
                int iJ11 = rd.a.j0(parcel);
                PendingIntent pendingIntent = null;
                String strT17 = null;
                Integer numV = null;
                int iU4 = 0;
                int iU5 = 0;
                while (parcel.dataPosition() < iJ11) {
                    int i21 = parcel.readInt();
                    char c18 = (char) i21;
                    if (c18 == 1) {
                        iU4 = rd.a.U(i21, parcel);
                    } else if (c18 == 2) {
                        iU5 = rd.a.U(i21, parcel);
                    } else if (c18 == 3) {
                        pendingIntent = (PendingIntent) rd.a.s(parcel, i21, PendingIntent.CREATOR);
                    } else if (c18 == 4) {
                        strT17 = rd.a.t(i21, parcel);
                    } else if (c18 != 5) {
                        rd.a.h0(i21, parcel);
                    } else {
                        numV = rd.a.V(i21, parcel);
                    }
                }
                rd.a.A(iJ11, parcel);
                return new pe.b(iU4, iU5, pendingIntent, strT17, numV);
            case 13:
                int iJ12 = rd.a.j0(parcel);
                int iU6 = 0;
                boolean zQ7 = false;
                long jW2 = -1;
                String strT18 = null;
                while (parcel.dataPosition() < iJ12) {
                    int i22 = parcel.readInt();
                    char c19 = (char) i22;
                    if (c19 == 1) {
                        strT18 = rd.a.t(i22, parcel);
                    } else if (c19 == 2) {
                        iU6 = rd.a.U(i22, parcel);
                    } else if (c19 == 3) {
                        jW2 = rd.a.W(i22, parcel);
                    } else if (c19 != 4) {
                        rd.a.h0(i22, parcel);
                    } else {
                        zQ7 = rd.a.Q(i22, parcel);
                    }
                }
                rd.a.A(iJ12, parcel);
                return new pe.d(iU6, jW2, strT18, zQ7);
            case 14:
                int iJ13 = rd.a.j0(parcel);
                long jW3 = -1;
                boolean zQ8 = false;
                int iU7 = 0;
                int iU8 = 0;
                String strT19 = null;
                while (parcel.dataPosition() < iJ13) {
                    int i23 = parcel.readInt();
                    char c20 = (char) i23;
                    if (c20 == 1) {
                        zQ8 = rd.a.Q(i23, parcel);
                    } else if (c20 == 2) {
                        strT19 = rd.a.t(i23, parcel);
                    } else if (c20 == 3) {
                        iU7 = rd.a.U(i23, parcel);
                    } else if (c20 == 4) {
                        iU8 = rd.a.U(i23, parcel);
                    } else if (c20 != 5) {
                        rd.a.h0(i23, parcel);
                    } else {
                        jW3 = rd.a.W(i23, parcel);
                    }
                }
                rd.a.A(iJ13, parcel);
                return new q(zQ8, strT19, iU7, iU8, jW3);
            case 15:
                int iJ14 = rd.a.j0(parcel);
                int iU9 = 0;
                int iU10 = 0;
                Uri uri2 = null;
                int iU11 = 0;
                while (parcel.dataPosition() < iJ14) {
                    int i24 = parcel.readInt();
                    char c21 = (char) i24;
                    if (c21 == 1) {
                        iU9 = rd.a.U(i24, parcel);
                    } else if (c21 == 2) {
                        uri2 = (Uri) rd.a.s(parcel, i24, Uri.CREATOR);
                    } else if (c21 == 3) {
                        iU11 = rd.a.U(i24, parcel);
                    } else if (c21 != 4) {
                        rd.a.h0(i24, parcel);
                    } else {
                        iU10 = rd.a.U(i24, parcel);
                    }
                }
                rd.a.A(iJ14, parcel);
                return new qe.a(iU9, uri2, iU11, iU10);
            case 16:
                int iJ15 = rd.a.j0(parcel);
                long jW4 = 0;
                long jW5 = 0;
                int iU12 = 0;
                while (parcel.dataPosition() < iJ15) {
                    int i25 = parcel.readInt();
                    char c22 = (char) i25;
                    if (c22 == 1) {
                        jW4 = rd.a.W(i25, parcel);
                    } else if (c22 == 2) {
                        iU12 = rd.a.U(i25, parcel);
                    } else if (c22 != 3) {
                        rd.a.h0(i25, parcel);
                    } else {
                        jW5 = rd.a.W(i25, parcel);
                    }
                }
                rd.a.A(iJ15, parcel);
                return new tf.d(iU12, jW4, jW5);
            case 17:
                int iJ16 = rd.a.j0(parcel);
                String strT20 = null;
                String strT21 = null;
                b4 b4Var = null;
                String strT22 = null;
                s sVar = null;
                s sVar2 = null;
                s sVar3 = null;
                long jW6 = 0;
                long jW7 = 0;
                long jW8 = 0;
                boolean zQ9 = false;
                while (parcel.dataPosition() < iJ16) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 2:
                            strT20 = rd.a.t(i26, parcel);
                            break;
                        case 3:
                            strT21 = rd.a.t(i26, parcel);
                            break;
                        case 4:
                            b4Var = (b4) rd.a.s(parcel, i26, b4.CREATOR);
                            break;
                        case 5:
                            jW6 = rd.a.W(i26, parcel);
                            break;
                        case 6:
                            zQ9 = rd.a.Q(i26, parcel);
                            break;
                        case 7:
                            strT22 = rd.a.t(i26, parcel);
                            break;
                        case '\b':
                            sVar = (s) rd.a.s(parcel, i26, s.CREATOR);
                            break;
                        case '\t':
                            jW7 = rd.a.W(i26, parcel);
                            break;
                        case '\n':
                            sVar2 = (s) rd.a.s(parcel, i26, s.CREATOR);
                            break;
                        case 11:
                            jW8 = rd.a.W(i26, parcel);
                            break;
                        case '\f':
                            sVar3 = (s) rd.a.s(parcel, i26, s.CREATOR);
                            break;
                        default:
                            rd.a.h0(i26, parcel);
                            break;
                    }
                }
                rd.a.A(iJ16, parcel);
                return new tf.e(strT20, strT21, b4Var, jW6, zQ9, strT22, sVar, jW7, sVar2, jW8, sVar3);
            case TYPE_SINT64_VALUE:
                int iJ17 = rd.a.j0(parcel);
                Bundle bundleL4 = null;
                while (parcel.dataPosition() < iJ17) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        rd.a.h0(i27, parcel);
                    } else {
                        bundleL4 = rd.a.l(i27, parcel);
                    }
                }
                rd.a.A(iJ17, parcel);
                return new i(bundleL4);
            case k.REMOTE_EXCEPTION:
                int iJ18 = rd.a.j0(parcel);
                Bundle bundleL5 = null;
                while (parcel.dataPosition() < iJ18) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 2) {
                        rd.a.h0(i28, parcel);
                    } else {
                        bundleL5 = rd.a.l(i28, parcel);
                    }
                }
                rd.a.A(iJ18, parcel);
                return new r(bundleL5);
            case k.CONNECTION_SUSPENDED_DURING_CALL:
                int iJ19 = rd.a.j0(parcel);
                long jW9 = 0;
                String strT23 = null;
                r rVar = null;
                String strT24 = null;
                while (parcel.dataPosition() < iJ19) {
                    int i29 = parcel.readInt();
                    char c23 = (char) i29;
                    if (c23 == 2) {
                        strT23 = rd.a.t(i29, parcel);
                    } else if (c23 == 3) {
                        rVar = (r) rd.a.s(parcel, i29, r.CREATOR);
                    } else if (c23 == 4) {
                        strT24 = rd.a.t(i29, parcel);
                    } else if (c23 != 5) {
                        rd.a.h0(i29, parcel);
                    } else {
                        jW9 = rd.a.W(i29, parcel);
                    }
                }
                rd.a.A(iJ19, parcel);
                return new s(strT23, rVar, strT24, jW9);
            case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                int iJ20 = rd.a.j0(parcel);
                int iU13 = 0;
                long jW10 = 0;
                String strT25 = null;
                while (parcel.dataPosition() < iJ20) {
                    int i30 = parcel.readInt();
                    char c24 = (char) i30;
                    if (c24 == 1) {
                        strT25 = rd.a.t(i30, parcel);
                    } else if (c24 == 2) {
                        jW10 = rd.a.W(i30, parcel);
                    } else if (c24 != 3) {
                        rd.a.h0(i30, parcel);
                    } else {
                        iU13 = rd.a.U(i30, parcel);
                    }
                }
                rd.a.A(iJ20, parcel);
                return new n3(strT25, jW10, iU13);
            case k.RECONNECTION_TIMED_OUT:
                int iJ21 = rd.a.j0(parcel);
                byte[] bArrM3 = null;
                String strT26 = null;
                Bundle bundleL6 = null;
                String strT27 = null;
                long jW11 = 0;
                long jW12 = 0;
                int iU14 = 0;
                while (parcel.dataPosition() < iJ21) {
                    int i31 = parcel.readInt();
                    switch ((char) i31) {
                        case 1:
                            jW11 = rd.a.W(i31, parcel);
                            break;
                        case 2:
                            bArrM3 = rd.a.m(i31, parcel);
                            break;
                        case 3:
                            strT26 = rd.a.t(i31, parcel);
                            break;
                        case 4:
                            bundleL6 = rd.a.l(i31, parcel);
                            break;
                        case 5:
                            iU14 = rd.a.U(i31, parcel);
                            break;
                        case 6:
                            jW12 = rd.a.W(i31, parcel);
                            break;
                        case 7:
                            strT27 = rd.a.t(i31, parcel);
                            break;
                        default:
                            rd.a.h0(i31, parcel);
                            break;
                    }
                }
                rd.a.A(iJ21, parcel);
                return new q3(jW11, bArrM3, strT26, bundleL6, iU14, jW12, strT27);
            case 23:
                int iJ22 = rd.a.j0(parcel);
                ArrayList arrayListQ = null;
                while (parcel.dataPosition() < iJ22) {
                    int i32 = parcel.readInt();
                    if (((char) i32) != 1) {
                        rd.a.h0(i32, parcel);
                    } else {
                        arrayListQ = rd.a.q(i32, parcel);
                    }
                }
                rd.a.A(iJ22, parcel);
                return new r3(arrayListQ);
            case 24:
                int iJ23 = rd.a.j0(parcel);
                ArrayList arrayListW5 = null;
                while (parcel.dataPosition() < iJ23) {
                    int i33 = parcel.readInt();
                    if (((char) i33) != 1) {
                        rd.a.h0(i33, parcel);
                    } else {
                        arrayListW5 = rd.a.w(parcel, i33, q3.CREATOR);
                    }
                }
                rd.a.A(iJ23, parcel);
                return new s3(arrayListW5);
            case 25:
                int iJ24 = rd.a.j0(parcel);
                String strT28 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strT29 = null;
                String strT30 = null;
                Double dValueOf = null;
                long jW13 = 0;
                int iU15 = 0;
                while (parcel.dataPosition() < iJ24) {
                    int i34 = parcel.readInt();
                    switch ((char) i34) {
                        case 1:
                            iU15 = rd.a.U(i34, parcel);
                            break;
                        case 2:
                            strT28 = rd.a.t(i34, parcel);
                            break;
                        case 3:
                            jW13 = rd.a.W(i34, parcel);
                            break;
                        case 4:
                            int iX = rd.a.X(i34, parcel);
                            if (iX == 0) {
                                lValueOf = null;
                            } else {
                                rd.a.m0(parcel, iX, 8);
                                lValueOf = Long.valueOf(parcel.readLong());
                            }
                            break;
                        case 5:
                            int iX2 = rd.a.X(i34, parcel);
                            if (iX2 == 0) {
                                fValueOf = null;
                            } else {
                                rd.a.m0(parcel, iX2, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case 6:
                            strT29 = rd.a.t(i34, parcel);
                            break;
                        case 7:
                            strT30 = rd.a.t(i34, parcel);
                            break;
                        case '\b':
                            int iX3 = rd.a.X(i34, parcel);
                            if (iX3 == 0) {
                                dValueOf = null;
                            } else {
                                rd.a.m0(parcel, iX3, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            rd.a.h0(i34, parcel);
                            break;
                    }
                }
                rd.a.A(iJ24, parcel);
                return new b4(iU15, strT28, jW13, lValueOf, fValueOf, strT29, strT30, dValueOf);
            case RuntimeVersion.MINOR:
                int iJ25 = rd.a.j0(parcel);
                boolean zQ10 = false;
                int iU16 = 0;
                boolean zQ11 = false;
                boolean zQ12 = false;
                int iU17 = 0;
                int iU18 = 0;
                long jW14 = 0;
                long jW15 = 0;
                long jW16 = 0;
                long jW17 = 0;
                long jW18 = 0;
                long jW19 = 0;
                long jW20 = 0;
                String strT31 = RuntimeVersion.SUFFIX;
                String strT32 = strT31;
                String strT33 = strT32;
                String strT34 = strT33;
                String strT35 = null;
                String strT36 = null;
                String strT37 = null;
                String strT38 = null;
                String strT39 = null;
                String strT40 = null;
                Boolean boolR = null;
                ArrayList arrayListU3 = null;
                String strT41 = null;
                String strT42 = null;
                int iU19 = 100;
                boolean zQ13 = true;
                boolean zQ14 = true;
                long jW21 = -2147483648L;
                while (parcel.dataPosition() < iJ25) {
                    int i35 = parcel.readInt();
                    switch ((char) i35) {
                        case 2:
                            strT35 = rd.a.t(i35, parcel);
                            break;
                        case 3:
                            strT36 = rd.a.t(i35, parcel);
                            break;
                        case 4:
                            strT37 = rd.a.t(i35, parcel);
                            break;
                        case 5:
                            strT38 = rd.a.t(i35, parcel);
                            break;
                        case 6:
                            jW14 = rd.a.W(i35, parcel);
                            break;
                        case 7:
                            jW15 = rd.a.W(i35, parcel);
                            break;
                        case '\b':
                            strT39 = rd.a.t(i35, parcel);
                            break;
                        case '\t':
                            zQ13 = rd.a.Q(i35, parcel);
                            break;
                        case '\n':
                            zQ10 = rd.a.Q(i35, parcel);
                            break;
                        case 11:
                            jW21 = rd.a.W(i35, parcel);
                            break;
                        case '\f':
                            strT40 = rd.a.t(i35, parcel);
                            break;
                        case '\r':
                        case 17:
                        case k.REMOTE_EXCEPTION:
                        case k.CONNECTION_SUSPENDED_DURING_CALL:
                        case 24:
                        case '!':
                        default:
                            rd.a.h0(i35, parcel);
                            break;
                        case 14:
                            jW16 = rd.a.W(i35, parcel);
                            break;
                        case 15:
                            iU16 = rd.a.U(i35, parcel);
                            break;
                        case 16:
                            zQ14 = rd.a.Q(i35, parcel);
                            break;
                        case TYPE_SINT64_VALUE:
                            zQ11 = rd.a.Q(i35, parcel);
                            break;
                        case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                            boolR = rd.a.R(i35, parcel);
                            break;
                        case k.RECONNECTION_TIMED_OUT:
                            jW17 = rd.a.W(i35, parcel);
                            break;
                        case 23:
                            arrayListU3 = rd.a.u(i35, parcel);
                            break;
                        case 25:
                            strT31 = rd.a.t(i35, parcel);
                            break;
                        case RuntimeVersion.MINOR:
                            strT32 = rd.a.t(i35, parcel);
                            break;
                        case 27:
                            strT41 = rd.a.t(i35, parcel);
                            break;
                        case 28:
                            zQ12 = rd.a.Q(i35, parcel);
                            break;
                        case 29:
                            jW18 = rd.a.W(i35, parcel);
                            break;
                        case 30:
                            iU19 = rd.a.U(i35, parcel);
                            break;
                        case 31:
                            strT33 = rd.a.t(i35, parcel);
                            break;
                        case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                            iU17 = rd.a.U(i35, parcel);
                            break;
                        case '\"':
                            jW19 = rd.a.W(i35, parcel);
                            break;
                        case '#':
                            strT42 = rd.a.t(i35, parcel);
                            break;
                        case '$':
                            strT34 = rd.a.t(i35, parcel);
                            break;
                        case '%':
                            jW20 = rd.a.W(i35, parcel);
                            break;
                        case '&':
                            iU18 = rd.a.U(i35, parcel);
                            break;
                    }
                }
                rd.a.A(iJ25, parcel);
                return new g4(strT35, strT36, strT37, strT38, jW14, jW15, strT39, zQ13, zQ10, jW21, strT40, jW16, iU16, zQ14, zQ11, boolR, jW17, arrayListU3, strT31, strT32, strT41, zQ12, jW18, iU19, strT33, iU17, jW19, strT42, strT34, jW20, iU18);
            case 27:
                String string = parcel.readString();
                m.b(string);
                int i36 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i36);
                for (int i37 = 0; i37 < i36; i37++) {
                    String string2 = parcel.readString();
                    m.b(string2);
                    String string3 = parcel.readString();
                    m.b(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new ub.b(string, linkedHashMap);
            case 28:
                return new ParcelImpl(parcel);
            default:
                int iJ26 = rd.a.j0(parcel);
                Intent intent = null;
                int iU20 = 0;
                int iU21 = 0;
                while (parcel.dataPosition() < iJ26) {
                    int i38 = parcel.readInt();
                    char c25 = (char) i38;
                    if (c25 == 1) {
                        iU20 = rd.a.U(i38, parcel);
                    } else if (c25 == 2) {
                        iU21 = rd.a.U(i38, parcel);
                    } else if (c25 != 3) {
                        rd.a.h0(i38, parcel);
                    } else {
                        intent = (Intent) rd.a.s(parcel, i38, Intent.CREATOR);
                    }
                }
                rd.a.A(iJ26, parcel);
                return new vf.b(iU20, iU21, intent);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f10291a) {
            case 0:
                return new GoogleSignInAccount[i10];
            case 1:
                return new GoogleSignInOptions[i10];
            case 2:
                return new SignInAccount[i10];
            case 3:
                return new me.a[i10];
            case 4:
                return new SignInConfiguration[i10];
            case 5:
                return new d[i10];
            case 6:
                return new ne.b[i10];
            case 7:
                return new c[i10];
            case 8:
                return new e[i10];
            case 9:
                return new f[i10];
            case 10:
                return new p[i10];
            case 11:
                return new l0[i10];
            case 12:
                return new pe.b[i10];
            case 13:
                return new pe.d[i10];
            case 14:
                return new q[i10];
            case 15:
                return new qe.a[i10];
            case 16:
                return new tf.d[i10];
            case 17:
                return new tf.e[i10];
            case TYPE_SINT64_VALUE:
                return new i[i10];
            case k.REMOTE_EXCEPTION:
                return new r[i10];
            case k.CONNECTION_SUSPENDED_DURING_CALL:
                return new s[i10];
            case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new n3[i10];
            case k.RECONNECTION_TIMED_OUT:
                return new q3[i10];
            case 23:
                return new r3[i10];
            case 24:
                return new s3[i10];
            case 25:
                return new b4[i10];
            case RuntimeVersion.MINOR:
                return new g4[i10];
            case 27:
                return new ub.b[i10];
            case 28:
                return new ParcelImpl[i10];
            default:
                return new vf.b[i10];
        }
    }
}
