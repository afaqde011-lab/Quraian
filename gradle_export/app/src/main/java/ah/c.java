package ah;

import android.app.PendingIntent;
import android.media.MediaDescription;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.fragment.app.e1;
import androidx.fragment.app.k1;
import androidx.fragment.app.o1;
import ba.l1;
import ba.m1;
import ba.v;
import cf.a0;
import cf.f0;
import cf.g0;
import cf.h0;
import cf.i0;
import cf.j0;
import cf.p;
import cf.q;
import cf.r;
import cf.r0;
import cf.s;
import cf.t;
import cf.u;
import cf.w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.player.presentation.screen.bottomsheet.FullScreenLauncher;
import com.mchutov.quranify.player.presentation.screen.bottomsheet.TafsirPickerLauncher;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import nf.u0;

public final class c implements Parcelable.Creator {

    public final int f476a;

    public c(int i10) {
        this.f476a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        c.b bVar = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        int iU = 0;
        boolean zQ = false;
        boolean zQ2 = false;
        boolean zQ3 = false;
        switch (this.f476a) {
            case 0:
                return new b((PendingIntent) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() != 0);
            case 1:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 2:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 3:
                return new MediaMetadataCompat(parcel);
            case 4:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 5:
                return new androidx.fragment.app.b(parcel);
            case 6:
                return new androidx.fragment.app.c(parcel);
            case 7:
                e1 e1Var = new e1();
                e1Var.A = parcel.readString();
                e1Var.B = parcel.readInt();
                return e1Var;
            case 8:
                k1 k1Var = new k1();
                k1Var.E = null;
                k1Var.F = new ArrayList();
                k1Var.G = new ArrayList();
                k1Var.A = parcel.createStringArrayList();
                k1Var.B = parcel.createStringArrayList();
                k1Var.C = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                k1Var.D = parcel.readInt();
                k1Var.E = parcel.readString();
                k1Var.F = parcel.createStringArrayList();
                k1Var.G = parcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                k1Var.H = parcel.createTypedArrayList(e1.CREATOR);
                return k1Var;
            case 9:
                return new o1(parcel);
            case 10:
                m.e(parcel, "parcel");
                return new FullScreenLauncher(parcel.readInt() != 0);
            case 11:
                m.e(parcel, "parcel");
                return new TafsirPickerLauncher(parcel.readInt() != 0, yu.g.valueOf(parcel.readString()), ot.e.valueOf(parcel.readString()));
            case 12:
                v vVar = new v();
                vVar.A = parcel.readInt();
                vVar.B = parcel.readInt();
                vVar.C = parcel.readInt() == 1;
                return vVar;
            case 13:
                l1 l1Var = new l1();
                l1Var.A = parcel.readInt();
                l1Var.B = parcel.readInt();
                l1Var.D = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    l1Var.C = iArr;
                    parcel.readIntArray(iArr);
                }
                return l1Var;
            case 14:
                m1 m1Var = new m1();
                m1Var.A = parcel.readInt();
                m1Var.B = parcel.readInt();
                int i11 = parcel.readInt();
                m1Var.C = i11;
                if (i11 > 0) {
                    int[] iArr2 = new int[i11];
                    m1Var.D = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i12 = parcel.readInt();
                m1Var.E = i12;
                if (i12 > 0) {
                    int[] iArr3 = new int[i12];
                    m1Var.F = iArr3;
                    parcel.readIntArray(iArr3);
                }
                m1Var.H = parcel.readInt() == 1;
                m1Var.I = parcel.readInt() == 1;
                m1Var.J = parcel.readInt() == 1;
                m1Var.G = parcel.readArrayList(l1.class.getClassLoader());
                return m1Var;
            case 15:
                c.d dVar = new c.d();
                IBinder strongBinder = parcel.readStrongBinder();
                int i13 = c.c.f2573f;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(c.b.f2572b);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c.b)) {
                        c.a aVar = new c.a();
                        aVar.f2571e = strongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (c.b) iInterfaceQueryLocalInterface;
                    }
                }
                dVar.A = bVar;
                return dVar;
            case 16:
                try {
                    return cf.b.a(parcel.readString());
                } catch (Attachment$UnsupportedAttachmentException e3) {
                    throw new RuntimeException(e3);
                }
            case 17:
                int iJ0 = rd.a.j0(parcel);
                while (parcel.dataPosition() < iJ0) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        rd.a.h0(i14, parcel);
                    } else {
                        zQ3 = rd.a.Q(i14, parcel);
                    }
                }
                rd.a.A(iJ0, parcel);
                return new r0(zQ3);
            case TYPE_SINT64_VALUE:
                int iJ1 = rd.a.j0(parcel);
                long jW = 0;
                while (parcel.dataPosition() < iJ1) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        rd.a.h0(i15, parcel);
                    } else {
                        jW = rd.a.W(i15, parcel);
                    }
                }
                rd.a.A(iJ1, parcel);
                return new f0(jW);
            case k.REMOTE_EXCEPTION:
                int iJ2 = rd.a.j0(parcel);
                while (parcel.dataPosition() < iJ2) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        rd.a.h0(i16, parcel);
                    } else {
                        zQ2 = rd.a.Q(i16, parcel);
                    }
                }
                rd.a.A(iJ2, parcel);
                return new g0(zQ2);
            case k.CONNECTION_SUSPENDED_DURING_CALL:
                int iJ3 = rd.a.j0(parcel);
                while (parcel.dataPosition() < iJ3) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        rd.a.h0(i17, parcel);
                    } else {
                        zQ = rd.a.Q(i17, parcel);
                    }
                }
                rd.a.A(iJ3, parcel);
                return new p(zQ);
            case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                int iJ4 = rd.a.j0(parcel);
                while (parcel.dataPosition() < iJ4) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        rd.a.h0(i18, parcel);
                    } else {
                        strT4 = rd.a.t(i18, parcel);
                    }
                }
                rd.a.A(iJ4, parcel);
                return new h0(strT4);
            case k.RECONNECTION_TIMED_OUT:
                int iJ5 = rd.a.j0(parcel);
                byte[] bArrM = null;
                byte[] bArrM2 = null;
                byte[] bArrM3 = null;
                while (parcel.dataPosition() < iJ5) {
                    int i19 = parcel.readInt();
                    char c10 = (char) i19;
                    if (c10 == 1) {
                        bArrM = rd.a.m(i19, parcel);
                    } else if (c10 == 2) {
                        bArrM2 = rd.a.m(i19, parcel);
                    } else if (c10 == 3) {
                        bArrM3 = rd.a.m(i19, parcel);
                    } else if (c10 != 4) {
                        rd.a.h0(i19, parcel);
                    } else {
                        iU = rd.a.U(i19, parcel);
                    }
                }
                rd.a.A(iJ5, parcel);
                return new i0(bArrM == null ? null : u0.l(bArrM.length, bArrM), bArrM2 == null ? null : u0.l(bArrM2.length, bArrM2), bArrM3 != null ? u0.l(bArrM3.length, bArrM3) : null, iU);
            case 23:
                int iJ6 = rd.a.j0(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (true) {
                        if (parcel.dataPosition() >= iJ6) {
                            rd.a.A(iJ6, parcel);
                            return new j0(bArr);
                        }
                        int i20 = parcel.readInt();
                        if (((char) i20) != 1) {
                            rd.a.h0(i20, parcel);
                        } else {
                            int iX = rd.a.X(i20, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iX == 0) {
                            }
                            int i21 = parcel.readInt();
                            byte[][] bArr2 = new byte[i21][];
                            for (int i22 = 0; i22 < i21; i22++) {
                                bArr2[i22] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iX);
                            bArr = bArr2;
                        }
                        break;
                    }
                }
                break;
            case 24:
                int iJ7 = rd.a.j0(parcel);
                u uVar = null;
                w wVar = null;
                byte[] bArrM4 = null;
                ArrayList arrayListW = null;
                Double dValueOf = null;
                ArrayList arrayListW2 = null;
                cf.k kVar = null;
                Integer numV = null;
                a0 a0Var = null;
                String strT5 = null;
                cf.d dVar2 = null;
                String strT6 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < iJ7) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 2:
                            uVar = (u) rd.a.s(parcel, i23, u.CREATOR);
                            break;
                        case 3:
                            wVar = (w) rd.a.s(parcel, i23, w.CREATOR);
                            break;
                        case 4:
                            bArrM4 = rd.a.m(i23, parcel);
                            break;
                        case 5:
                            arrayListW = rd.a.w(parcel, i23, t.CREATOR);
                            break;
                        case 6:
                            int iX2 = rd.a.X(i23, parcel);
                            if (iX2 == 0) {
                                dValueOf = null;
                            } else {
                                rd.a.m0(parcel, iX2, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        case 7:
                            arrayListW2 = rd.a.w(parcel, i23, s.CREATOR);
                            break;
                        case '\b':
                            kVar = (cf.k) rd.a.s(parcel, i23, cf.k.CREATOR);
                            break;
                        case '\t':
                            numV = rd.a.V(i23, parcel);
                            break;
                        case '\n':
                            a0Var = (a0) rd.a.s(parcel, i23, a0.CREATOR);
                            break;
                        case 11:
                            strT5 = rd.a.t(i23, parcel);
                            break;
                        case '\f':
                            dVar2 = (cf.d) rd.a.s(parcel, i23, cf.d.CREATOR);
                            break;
                        case '\r':
                            strT6 = rd.a.t(i23, parcel);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) rd.a.s(parcel, i23, ResultReceiver.CREATOR);
                            break;
                        default:
                            rd.a.h0(i23, parcel);
                            break;
                    }
                }
                rd.a.A(iJ7, parcel);
                return new r(uVar, wVar, bArrM4, arrayListW, dValueOf, arrayListW2, kVar, numV, a0Var, strT5, dVar2, strT6, resultReceiver);
            case 25:
                int iJ8 = rd.a.j0(parcel);
                String strT7 = null;
                String strT8 = null;
                byte[] bArrM5 = null;
                cf.h hVar = null;
                cf.g gVar = null;
                cf.i iVar = null;
                cf.e eVar = null;
                String strT9 = null;
                while (parcel.dataPosition() < iJ8) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            strT7 = rd.a.t(i24, parcel);
                            break;
                        case 2:
                            strT8 = rd.a.t(i24, parcel);
                            break;
                        case 3:
                            bArrM5 = rd.a.m(i24, parcel);
                            break;
                        case 4:
                            hVar = (cf.h) rd.a.s(parcel, i24, cf.h.CREATOR);
                            break;
                        case 5:
                            gVar = (cf.g) rd.a.s(parcel, i24, cf.g.CREATOR);
                            break;
                        case 6:
                            iVar = (cf.i) rd.a.s(parcel, i24, cf.i.CREATOR);
                            break;
                        case 7:
                            eVar = (cf.e) rd.a.s(parcel, i24, cf.e.CREATOR);
                            break;
                        case '\b':
                            strT9 = rd.a.t(i24, parcel);
                            break;
                        case '\t':
                            rd.a.t(i24, parcel);
                            break;
                        default:
                            rd.a.h0(i24, parcel);
                            break;
                    }
                }
                rd.a.A(iJ8, parcel);
                return new q(strT7, strT8, bArrM5, hVar, gVar, iVar, eVar, strT9);
            case RuntimeVersion.MINOR:
                int iJ9 = rd.a.j0(parcel);
                byte[] bArrM6 = null;
                ArrayList arrayListW3 = null;
                while (parcel.dataPosition() < iJ9) {
                    int i25 = parcel.readInt();
                    char c11 = (char) i25;
                    if (c11 == 2) {
                        strT3 = rd.a.t(i25, parcel);
                    } else if (c11 == 3) {
                        bArrM6 = rd.a.m(i25, parcel);
                    } else if (c11 != 4) {
                        rd.a.h0(i25, parcel);
                    } else {
                        arrayListW3 = rd.a.w(parcel, i25, Transport.CREATOR);
                    }
                }
                rd.a.A(iJ9, parcel);
                return new s(strT3, bArrM6, arrayListW3);
            case 27:
                int iJ10 = rd.a.j0(parcel);
                Integer numV2 = null;
                while (parcel.dataPosition() < iJ10) {
                    int i26 = parcel.readInt();
                    char c12 = (char) i26;
                    if (c12 == 2) {
                        strT2 = rd.a.t(i26, parcel);
                    } else if (c12 != 3) {
                        rd.a.h0(i26, parcel);
                    } else {
                        numV2 = rd.a.V(i26, parcel);
                    }
                }
                rd.a.A(iJ10, parcel);
                return new t(strT2, numV2.intValue());
            case 28:
                int iJ11 = rd.a.j0(parcel);
                String strT10 = null;
                String strT11 = null;
                while (parcel.dataPosition() < iJ11) {
                    int i27 = parcel.readInt();
                    char c13 = (char) i27;
                    if (c13 == 2) {
                        strT = rd.a.t(i27, parcel);
                    } else if (c13 == 3) {
                        strT10 = rd.a.t(i27, parcel);
                    } else if (c13 != 4) {
                        rd.a.h0(i27, parcel);
                    } else {
                        strT11 = rd.a.t(i27, parcel);
                    }
                }
                rd.a.A(iJ11, parcel);
                return new u(strT, strT10, strT11);
            default:
                try {
                    return cf.v.a(parcel.readString());
                } catch (PublicKeyCredentialType$UnsupportedPublicKeyCredTypeException e10) {
                    throw new RuntimeException(e10);
                }
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f476a) {
            case 0:
                return new a[i10];
            case 1:
                return new MediaBrowserCompat$MediaItem[i10];
            case 2:
                return new MediaDescriptionCompat[i10];
            case 3:
                return new MediaMetadataCompat[i10];
            case 4:
                return new RatingCompat[i10];
            case 5:
                return new androidx.fragment.app.b[i10];
            case 6:
                return new androidx.fragment.app.c[i10];
            case 7:
                return new e1[i10];
            case 8:
                return new k1[i10];
            case 9:
                return new o1[i10];
            case 10:
                return new FullScreenLauncher[i10];
            case 11:
                return new TafsirPickerLauncher[i10];
            case 12:
                return new v[i10];
            case 13:
                return new l1[i10];
            case 14:
                return new m1[i10];
            case 15:
                return new c.d[i10];
            case 16:
                return new cf.b[i10];
            case 17:
                return new r0[i10];
            case TYPE_SINT64_VALUE:
                return new f0[i10];
            case k.REMOTE_EXCEPTION:
                return new g0[i10];
            case k.CONNECTION_SUSPENDED_DURING_CALL:
                return new p[i10];
            case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new h0[i10];
            case k.RECONNECTION_TIMED_OUT:
                return new i0[i10];
            case 23:
                return new j0[i10];
            case 24:
                return new r[i10];
            case 25:
                return new q[i10];
            case RuntimeVersion.MINOR:
                return new s[i10];
            case 27:
                return new t[i10];
            case 28:
                return new u[i10];
            default:
                return new cf.v[i10];
        }
    }
}
