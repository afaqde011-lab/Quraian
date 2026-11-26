package u8;

import a8.n0;
import a8.y;
import a8.z;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.u0;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import ba.o1;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.play_billing.q1;
import com.google.protobuf.RuntimeVersion;
import e7.i0;
import e7.u;
import fh.d2;
import fh.q0;
import fh.t0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import s7.w0;
import ta.c0;

public abstract class c {

    public static final byte[] f15009a;

    static {
        String str = i0.f5136a;
        f15009a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(u uVar) {
        int i10 = uVar.f5183b;
        uVar.O(4);
        if (uVar.m() != 1751411826) {
            i10 += 4;
        }
        uVar.N(i10);
    }

    public static void b(u uVar, int i10, int i11, int i12, int i13, String str, boolean z10, androidx.media3.common.o oVar, q1 q1Var, int i14) throws ParserException {
        int iH;
        int i15;
        int i16;
        int iH2;
        int iM;
        int i17;
        int i18;
        int i19;
        androidx.media3.common.o oVarA;
        String str2;
        int i20;
        int i21;
        int i22;
        int i23;
        int iW;
        int i24;
        int iA;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean zH;
        int i32;
        int i33;
        int i34;
        int i35;
        boolean z11;
        boolean zH2;
        int i36;
        int i37;
        boolean z12;
        String str3;
        u uVar2 = uVar;
        int iIntValue = i10;
        int i38 = i12;
        int[] iArr = a8.b.f204f;
        int[] iArr2 = a8.b.f202d;
        uVar2.N(i11 + 16);
        if (z10) {
            iH = uVar2.H();
            uVar2.O(6);
        } else {
            uVar2.O(8);
            iH = 0;
        }
        if (iH == 0 || iH == 1) {
            i15 = 2;
            i16 = 4;
            iH2 = uVar2.H();
            uVar2.O(6);
            int iB = uVar2.B();
            uVar2.N(uVar2.f5183b - 4);
            iM = uVar2.m();
            if (iH == 1) {
                uVar2.O(16);
            }
            i17 = iB;
            i18 = -1;
        } else {
            if (iH != 2) {
                return;
            }
            uVar2.O(16);
            i15 = 2;
            int iRound = (int) Math.round(Double.longBitsToDouble(uVar2.u()));
            int iE = uVar2.E();
            uVar2.O(4);
            i16 = 4;
            int iE2 = uVar2.E();
            int iE3 = uVar2.E();
            boolean z13 = (iE3 & 1) != 0;
            boolean z14 = (iE3 & 2) != 0;
            if (z13) {
                if (iE2 == 32) {
                    i18 = 4;
                } else {
                    i18 = -1;
                }
            } else if (iE2 == 8) {
                i18 = 3;
            } else if (iE2 == 16) {
                i18 = z14 ? 268435456 : 2;
            } else if (iE2 == 24) {
                i18 = z14 ? 1342177280 : 21;
            } else if (iE2 == 32) {
                i18 = z14 ? 1610612736 : 22;
            } else {
                i18 = -1;
            }
            uVar2.O(8);
            i17 = iRound;
            iH2 = iE;
            iM = 0;
        }
        if (iIntValue == 1767992678) {
            iH2 = -1;
            i17 = -1;
        } else {
            if (iIntValue != 1935764850) {
                i19 = iIntValue == 1935767394 ? 16000 : 8000;
            }
            i17 = i19;
            iH2 = 1;
        }
        int i39 = uVar2.f5183b;
        if (iIntValue == 1701733217) {
            Pair pairH = h(uVar2, i11, i38);
            if (pairH != null) {
                iIntValue = ((Integer) pairH.first).intValue();
                oVarA = oVar == null ? null : oVar.a(((r) pairH.second).f15105b);
                ((r[]) q1Var.f4032d)[i14] = (r) pairH.second;
            } else {
                oVarA = oVar;
            }
            uVar2.N(i39);
        } else {
            oVarA = oVar;
        }
        String str4 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue == 1936684916) {
            i18 = i15;
            str2 = "audio/raw";
        } else if (iIntValue == 1953984371) {
            str2 = "audio/raw";
            i18 = 268435456;
        } else if (iIntValue == 1819304813) {
            if (i18 == -1) {
                i18 = i15;
            }
            str2 = "audio/raw";
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str2 = "audio/mpeg";
        } else if (iIntValue == 1835557169) {
            str2 = "audio/mha1";
        } else if (iIntValue == 1835560241) {
            str2 = "audio/mhm1";
        } else if (iIntValue == 1634492771) {
            str2 = "audio/alac";
        } else if (iIntValue == 1634492791) {
            str2 = "audio/g711-alaw";
        } else if (iIntValue == 1970037111) {
            str2 = "audio/g711-mlaw";
        } else if (iIntValue == 1332770163) {
            str2 = "audio/opus";
        } else if (iIntValue == 1716281667) {
            str2 = "audio/flac";
        } else if (iIntValue == 1835823201) {
            str2 = "audio/true-hd";
        } else {
            str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
        }
        w0 w0VarC = null;
        String strM = null;
        List listS = null;
        l50.d dVar = null;
        while (i39 - i11 < i38) {
            uVar2.N(i39);
            int iM2 = uVar2.m();
            int i40 = i18;
            a8.b.c("childAtomSize must be positive", iM2 > 0);
            int iM3 = uVar2.m();
            strM = strM;
            if (iM3 == 1835557187) {
                uVar2.N(i39 + 8);
                uVar2.O(1);
                int iA2 = uVar2.A();
                uVar2.O(1);
                String str5 = Objects.equals(str2, str4) ? String.format("mhm1.%02X", Integer.valueOf(iA2)) : String.format("mha1.%02X", Integer.valueOf(iA2));
                int iH3 = uVar2.H();
                byte[] bArr = new byte[iH3];
                String str6 = str5;
                uVar2.k(0, iH3, bArr);
                strM = str6;
                listS = listS == null ? t0.s(bArr) : t0.t(bArr, (byte[]) listS.get(0));
            } else if (iM3 == 1835557200) {
                uVar2.N(i39 + 8);
                int iA3 = uVar2.A();
                if (iA3 > 0) {
                    byte[] bArr2 = new byte[iA3];
                    uVar2.k(0, iA3, bArr2);
                    listS = listS == null ? t0.s(bArr2) : t0.t((byte[]) listS.get(0), bArr2);
                }
                listS = listS;
                strM = strM;
            } else {
                if (iM3 == 1702061171 || (z10 && iM3 == 2002876005)) {
                    String str7 = str2;
                    listS = listS;
                    int i41 = iM2;
                    int i42 = i39;
                    int i43 = iH2;
                    str4 = str4;
                    i20 = iIntValue;
                    if (iM3 == 1702061171) {
                        i22 = i41;
                        i21 = i42;
                        i39 = i21;
                    } else {
                        i21 = uVar2.f5183b;
                        i39 = i42;
                        a8.b.c(null, i21 >= i39);
                        while (true) {
                            i22 = i41;
                            if (i21 - i39 < i22) {
                                uVar2.N(i21);
                                int iM4 = uVar2.m();
                                a8.b.c("childAtomSize must be positive", iM4 > 0);
                                if (uVar2.m() != 1702061171) {
                                    i21 += iM4;
                                    i41 = i22;
                                }
                            } else {
                                i21 = -1;
                            }
                        }
                    }
                    if (i21 != -1) {
                        w0VarC = c(i21, uVar2);
                        String str8 = (String) w0VarC.C;
                        byte[] bArr3 = (byte[]) w0VarC.D;
                        if (bArr3 == null) {
                            iM2 = i22;
                        } else if ("audio/vorbis".equals(str8)) {
                            u uVar3 = new u(bArr3);
                            uVar3.O(1);
                            int i44 = 0;
                            while (uVar3.a() > 0 && uVar3.j() == 255) {
                                i44 += 255;
                                uVar3.O(1);
                            }
                            int iA4 = uVar3.A() + i44;
                            int i45 = 0;
                            while (true) {
                                if (uVar3.a() > 0) {
                                    iM2 = i22;
                                    if (uVar3.j() == 255) {
                                        i45 += 255;
                                        uVar3.O(1);
                                        i22 = iM2;
                                    }
                                } else {
                                    iM2 = i22;
                                }
                            }
                            int iA5 = uVar3.A() + i45;
                            byte[] bArr4 = new byte[iA4];
                            int i46 = uVar3.f5183b;
                            System.arraycopy(bArr3, i46, bArr4, 0, iA4);
                            int i47 = i46 + iA4 + iA5;
                            int length = bArr3.length - i47;
                            byte[] bArr5 = new byte[length];
                            System.arraycopy(bArr3, i47, bArr5, 0, length);
                            listS = t0.t(bArr4, bArr5);
                        } else {
                            iM2 = i22;
                            if ("audio/mp4a-latm".equals(str8)) {
                                a8.a aVarP = a8.b.p(new n0(bArr3.length, bArr3), false);
                                i17 = aVarP.f194b;
                                iH2 = aVarP.f195c;
                                strM = aVarP.f193a;
                            } else {
                                iH2 = i43;
                                strM = strM;
                            }
                            listS = t0.s(bArr3);
                            str2 = str8;
                        }
                        str2 = str8;
                        iH2 = i43;
                        strM = strM;
                    } else {
                        iM2 = i22;
                        w0VarC = w0VarC;
                        iH2 = i43;
                        strM = strM;
                        str2 = str7;
                    }
                } else if (iM3 == 1651798644) {
                    uVar2.N(i39 + 8);
                    uVar2.O(i16);
                    dVar = new l50.d(uVar2.C(), uVar2.C());
                    listS = listS;
                    strM = strM;
                    str2 = str2;
                } else {
                    str2 = str2;
                    str4 = str4;
                    if (iM3 == 1684103987) {
                        uVar2.N(i39 + 8);
                        String string = Integer.toString(i13);
                        n0 n0Var = new n0();
                        n0Var.p(uVar2);
                        int i48 = iArr2[n0Var.i(i15)];
                        n0Var.t(8);
                        int i49 = iArr[n0Var.i(3)];
                        if (n0Var.i(1) != 0) {
                            i49++;
                        }
                        int i50 = a8.b.f205g[n0Var.i(5)] * 1000;
                        n0Var.c();
                        uVar2.N(n0Var.f());
                        androidx.media3.common.s sVar = new androidx.media3.common.s();
                        sVar.f1491a = string;
                        sVar.m = x0.n("audio/ac3");
                        sVar.E = i49;
                        sVar.F = i48;
                        sVar.f1505q = oVarA;
                        sVar.f1494d = str;
                        sVar.f1498h = i50;
                        sVar.f1499i = i50;
                        q1Var.f4033e = new androidx.media3.common.t(sVar);
                        listS = listS;
                        iM2 = iM2;
                        i39 = i39;
                        i23 = iH2;
                        i20 = iIntValue;
                    } else if (iM3 == 1684366131) {
                        uVar2.N(i39 + 8);
                        String string2 = Integer.toString(i13);
                        n0 n0Var2 = new n0();
                        n0Var2.p(uVar2);
                        int i51 = n0Var2.i(13) * 1000;
                        n0Var2.t(3);
                        int i52 = iArr2[n0Var2.i(2)];
                        n0Var2.t(10);
                        int i53 = iArr[n0Var2.i(3)];
                        if (n0Var2.i(1) != 0) {
                            i53++;
                        }
                        int i54 = i53;
                        n0Var2.t(3);
                        int i55 = n0Var2.i(4);
                        n0Var2.t(1);
                        if (i55 > 0) {
                            n0Var2.t(6);
                            if (n0Var2.i(1) != 0) {
                                i54 += 2;
                            }
                            n0Var2.t(1);
                        }
                        int i56 = i54;
                        iM2 = iM2;
                        if (n0Var2.b() > 7) {
                            n0Var2.t(7);
                            if (n0Var2.i(1) != 0) {
                                str3 = "audio/eac3-joc";
                            } else {
                                str3 = "audio/eac3";
                            }
                        } else {
                            str3 = "audio/eac3";
                        }
                        n0Var2.c();
                        uVar2.N(n0Var2.f());
                        androidx.media3.common.s sVar2 = new androidx.media3.common.s();
                        sVar2.f1491a = string2;
                        sVar2.m = x0.n(str3);
                        sVar2.E = i56;
                        sVar2.F = i52;
                        sVar2.f1505q = oVarA;
                        sVar2.f1494d = str;
                        sVar2.f1499i = i51;
                        q1Var.f4033e = new androidx.media3.common.t(sVar2);
                        i20 = iIntValue;
                        i23 = iH2;
                    } else {
                        listS = listS;
                        iM2 = iM2;
                        if (iM3 == 1684103988) {
                            uVar2.N(i39 + 8);
                            String string3 = Integer.toString(i13);
                            n0 n0Var3 = new n0();
                            n0Var3.p(uVar2);
                            int iB2 = n0Var3.b();
                            int i57 = n0Var3.i(3);
                            if (i57 > 1) {
                                throw ParserException.c("Unsupported AC-4 DSI version: " + i57);
                            }
                            int i58 = n0Var3.i(7);
                            int i59 = n0Var3.h() ? 48000 : 44100;
                            n0Var3.t(4);
                            int i60 = n0Var3.i(9);
                            if (i58 > 1) {
                                if (i57 == 0) {
                                    throw ParserException.c("Invalid AC-4 DSI version: " + i57);
                                }
                                if (n0Var3.h()) {
                                    n0Var3.t(16);
                                    if (n0Var3.h()) {
                                        n0Var3.t(Cast.MAX_NAMESPACE_LENGTH);
                                    }
                                }
                            }
                            if (i57 == 1) {
                                if (n0Var3.b() < 66) {
                                    throw ParserException.c("Invalid AC-4 DSI bitrate.");
                                }
                                n0Var3.t(66);
                                n0Var3.c();
                            }
                            a8.c cVar = new a8.c();
                            cVar.f229a = true;
                            cVar.f230b = -1;
                            cVar.f231c = -1;
                            cVar.f232d = true;
                            cVar.f233e = 2;
                            cVar.f234f = 1;
                            cVar.f235g = 0;
                            int i61 = 0;
                            while (true) {
                                if (i61 < i60) {
                                    if (i57 == 0) {
                                        i27 = i17;
                                        zH = n0Var3.h();
                                        i32 = n0Var3.i(5);
                                        i33 = n0Var3.i(5);
                                        i34 = 0;
                                        i35 = 0;
                                        z11 = false;
                                    } else {
                                        int i62 = i60;
                                        int i63 = n0Var3.i(8);
                                        i27 = i17;
                                        int i64 = n0Var3.i(8);
                                        int i65 = i64 == 255 ? n0Var3.i(16) + i64 : i64;
                                        if (i63 > 2) {
                                            n0Var3.t(i65 * 8);
                                            i61++;
                                            i60 = i62;
                                            i17 = i27;
                                        } else {
                                            int iB3 = (iB2 - n0Var3.b()) / 8;
                                            int i66 = n0Var3.i(5);
                                            i35 = iB3;
                                            z11 = i66 == 31;
                                            zH = false;
                                            i33 = i63;
                                            i32 = i66;
                                            i34 = i65;
                                        }
                                    }
                                    cVar.f234f = i33;
                                    i26 = iH2;
                                    if (zH || z11 || i32 != 6) {
                                        cVar.f235g = n0Var3.i(3);
                                        if (n0Var3.h()) {
                                            n0Var3.t(5);
                                        }
                                        n0Var3.t(2);
                                        int i67 = 1;
                                        if (i57 == 1 && (i33 == 1 || i33 == 2)) {
                                            n0Var3.t(2);
                                        }
                                        n0Var3.t(5);
                                        n0Var3.t(10);
                                        if (i57 == 1) {
                                            if (i33 > 0) {
                                                cVar.f229a = n0Var3.h();
                                            }
                                            if (cVar.f229a) {
                                                if (i33 != 1) {
                                                    i36 = 2;
                                                    if (i33 == 2) {
                                                        i37 = n0Var3.i(5);
                                                        if (i37 >= 0 && i37 <= 15) {
                                                            cVar.f230b = i37;
                                                        }
                                                        if (i37 >= 11 || i37 > 14) {
                                                            i36 = 2;
                                                        } else {
                                                            cVar.f232d = n0Var3.h();
                                                            i36 = 2;
                                                            cVar.f233e = n0Var3.i(2);
                                                        }
                                                    }
                                                } else {
                                                    i37 = n0Var3.i(5);
                                                    if (i37 >= 0) {
                                                        cVar.f230b = i37;
                                                    }
                                                    if (i37 >= 11) {
                                                        i36 = 2;
                                                    } else {
                                                        i36 = 2;
                                                    }
                                                }
                                                n0Var3.t(24);
                                                i67 = 1;
                                            } else {
                                                i36 = 2;
                                            }
                                            if (i33 == i67 || i33 == i36) {
                                                if (n0Var3.h() && n0Var3.h()) {
                                                    n0Var3.t(i36);
                                                }
                                                if (n0Var3.h()) {
                                                    n0Var3.s();
                                                    int i68 = 8;
                                                    int i69 = n0Var3.i(8);
                                                    int i70 = 0;
                                                    while (i70 < i69) {
                                                        n0Var3.t(i68);
                                                        i70++;
                                                        i68 = 8;
                                                    }
                                                }
                                            }
                                        }
                                        if (!zH && !z11) {
                                            n0Var3.s();
                                            if (i32 == 0 || i32 == 1 || i32 == 2) {
                                                if (i33 == 0) {
                                                    for (int i71 = 0; i71 < 2; i71++) {
                                                        a8.b.q(n0Var3, cVar);
                                                    }
                                                } else {
                                                    for (int i72 = 0; i72 < 2; i72++) {
                                                        a8.b.r(n0Var3, cVar);
                                                    }
                                                }
                                            } else if (i32 == 3 || i32 == 4) {
                                                if (i33 == 0) {
                                                    for (int i73 = 0; i73 < 3; i73++) {
                                                        a8.b.q(n0Var3, cVar);
                                                    }
                                                } else {
                                                    for (int i74 = 0; i74 < 3; i74++) {
                                                        a8.b.r(n0Var3, cVar);
                                                    }
                                                }
                                            } else if (i32 != 5) {
                                                int i75 = n0Var3.i(7);
                                                for (int i76 = 0; i76 < i75; i76++) {
                                                    n0Var3.t(8);
                                                }
                                            } else if (i33 == 0) {
                                                a8.b.q(n0Var3, cVar);
                                            } else {
                                                int i77 = n0Var3.i(3);
                                                for (int i78 = 0; i78 < i77 + 2; i78++) {
                                                    a8.b.r(n0Var3, cVar);
                                                }
                                            }
                                        } else if (i33 == 0) {
                                            a8.b.q(n0Var3, cVar);
                                        } else {
                                            a8.b.r(n0Var3, cVar);
                                        }
                                        n0Var3.s();
                                        zH2 = n0Var3.h();
                                    } else {
                                        i33 = i33;
                                        zH2 = true;
                                    }
                                    if (zH2) {
                                        int i79 = n0Var3.i(7);
                                        for (int i80 = 0; i80 < i79; i80++) {
                                            n0Var3.t(15);
                                        }
                                    }
                                    if (i33 <= 0) {
                                        i28 = 8;
                                    } else {
                                        if (n0Var3.h()) {
                                            if (n0Var3.b() < 66) {
                                                z12 = false;
                                            } else {
                                                n0Var3.t(66);
                                                z12 = true;
                                            }
                                            if (!z12) {
                                                throw ParserException.c("Can't parse bitrate DSI.");
                                            }
                                        }
                                        if (n0Var3.h()) {
                                            n0Var3.c();
                                            n0Var3.u(n0Var3.i(16));
                                            int i81 = n0Var3.i(5);
                                            for (int i82 = 0; i82 < i81; i82++) {
                                                n0Var3.t(3);
                                                n0Var3.t(8);
                                            }
                                            i28 = 8;
                                        } else {
                                            i28 = 8;
                                        }
                                    }
                                    n0Var3.c();
                                    if (i57 == 1) {
                                        int iB4 = ((iB2 - n0Var3.b()) / 8) - i35;
                                        if (i34 < iB4) {
                                            throw ParserException.c("pres_bytes is smaller than presentation bytes read.");
                                        }
                                        n0Var3.u(i34 - iB4);
                                    }
                                    if (cVar.f229a && cVar.f230b == -1) {
                                        throw ParserException.c("Can't determine channel mode of presentation " + i61);
                                    }
                                } else {
                                    iIntValue = iIntValue;
                                    i26 = iH2;
                                    i27 = i17;
                                    i28 = 8;
                                }
                                if (cVar.f229a) {
                                    int i83 = cVar.f230b;
                                    boolean z15 = cVar.f232d;
                                    int i84 = cVar.f233e;
                                    switch (i83) {
                                        case 0:
                                            i30 = 11;
                                            i31 = 1;
                                            break;
                                        case 1:
                                            i30 = 11;
                                            i31 = 2;
                                            break;
                                        case 2:
                                            i30 = 11;
                                            i31 = 3;
                                            break;
                                        case 3:
                                            i30 = 11;
                                            i31 = 5;
                                            break;
                                        case 4:
                                            i30 = 11;
                                            i31 = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            i30 = 11;
                                            i31 = 7;
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i31 = i28;
                                            i30 = 11;
                                            break;
                                        case 11:
                                            i30 = 11;
                                            i31 = 11;
                                            break;
                                        case 12:
                                            i31 = 12;
                                            i30 = 11;
                                            break;
                                        case 13:
                                            i30 = 11;
                                            i31 = 13;
                                            break;
                                        case 14:
                                            i30 = 11;
                                            i31 = 14;
                                            break;
                                        case 15:
                                            i30 = 11;
                                            i31 = 24;
                                            break;
                                        default:
                                            i30 = 11;
                                            i31 = -1;
                                            break;
                                    }
                                    if (i83 == i30 || i83 == 12 || i83 == 13 || i83 == 14) {
                                        if (!z15) {
                                            i31 -= 2;
                                        }
                                        if (i84 == 0) {
                                            i31 -= 4;
                                        } else if (i84 == 1) {
                                            i31 -= 2;
                                        }
                                    }
                                    i29 = i31;
                                } else {
                                    int i85 = cVar.f231c;
                                    if (i85 > 0) {
                                        i29 = i85 + 1;
                                        if (cVar.f235g == 4 && i29 == 17) {
                                            i29 = 21;
                                        }
                                    } else {
                                        int i86 = cVar.f235g;
                                        if (i86 == 0) {
                                            i29 = 2;
                                        } else if (i86 == 1) {
                                            i29 = 6;
                                        } else if (i86 == 2) {
                                            i29 = i28;
                                        } else if (i86 == 3) {
                                            i29 = 10;
                                        } else if (i86 != 4) {
                                            e7.a.m("Ac4Util", "AC-4 level " + cVar.f235g + " has not been defined.");
                                            i29 = 2;
                                        } else {
                                            i29 = 12;
                                        }
                                    }
                                }
                                if (i29 <= 0) {
                                    throw ParserException.c("Cannot determine channel count of presentation.");
                                }
                                Object[] objArr = {Integer.valueOf(i58), Integer.valueOf(cVar.f234f), Integer.valueOf(cVar.f235g)};
                                String str9 = i0.f5136a;
                                String str10 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                androidx.media3.common.s sVar3 = new androidx.media3.common.s();
                                sVar3.f1491a = string3;
                                sVar3.m = x0.n("audio/ac4");
                                sVar3.E = i29;
                                sVar3.F = i59;
                                sVar3.f1505q = oVarA;
                                sVar3.f1494d = str;
                                sVar3.f1500j = str10;
                                q1Var.f4033e = new androidx.media3.common.t(sVar3);
                                i17 = i27;
                                i23 = i26;
                                i20 = iIntValue;
                            }
                        } else {
                            i20 = iIntValue;
                            i39 = i39;
                            int i87 = iH2;
                            int i88 = i17;
                            if (iM3 == 1684892784) {
                                if (iM <= 0) {
                                    throw ParserException.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + iM);
                                }
                                i17 = iM;
                                iH2 = 2;
                            } else if (iM3 == 1684305011 || iM3 == 1969517683) {
                                i20 = i20;
                                androidx.media3.common.s sVar4 = new androidx.media3.common.s();
                                sVar4.f1491a = Integer.toString(i13);
                                sVar4.m = x0.n(str2);
                                i23 = i87;
                                sVar4.E = i23;
                                i17 = i88;
                                sVar4.F = i17;
                                sVar4.f1505q = oVarA;
                                sVar4.f1494d = str;
                                q1Var.f4033e = new androidx.media3.common.t(sVar4);
                            } else if (iM3 == 1682927731) {
                                int i89 = iM2 - 8;
                                byte[] bArr6 = f15009a;
                                byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i89);
                                uVar2.N(i39 + 8);
                                uVar2.k(bArr6.length, i89, bArrCopyOf);
                                listS = a8.b.a(bArrCopyOf);
                                i17 = i88;
                                iH2 = i87;
                            } else {
                                if (iM3 == 1684425825) {
                                    byte[] bArr7 = new byte[iM2 - 8];
                                    bArr7[0] = 102;
                                    bArr7[1] = 76;
                                    bArr7[2] = 97;
                                    bArr7[3] = 67;
                                    uVar2.N(i39 + 12);
                                    uVar2.k(4, iM2 - 12, bArr7);
                                    listS = t0.s(bArr7);
                                    strM = strM;
                                } else if (iM3 == 1634492771) {
                                    int i90 = iM2 - 12;
                                    byte[] bArr8 = new byte[i90];
                                    uVar2.N(i39 + 12);
                                    uVar2.k(0, i90, bArr8);
                                    byte[] bArr9 = e7.e.f5121a;
                                    u uVar4 = new u(bArr8);
                                    uVar4.N(5);
                                    int iA6 = uVar4.A();
                                    uVar4.N(9);
                                    int iA7 = uVar4.A();
                                    uVar4.N(20);
                                    int[] iArr3 = {uVar4.E(), iA7, iA6};
                                    int i91 = iArr3[0];
                                    int i92 = iArr3[1];
                                    int i93 = iArr3[2];
                                    String str11 = i0.f5136a;
                                    int iW2 = i0.w(i93, ByteOrder.LITTLE_ENDIAN);
                                    listS = t0.s(bArr8);
                                    i40 = iW2;
                                    i17 = i91;
                                    iH2 = i92;
                                    strM = strM;
                                    str2 = str2;
                                    i39 = i39;
                                    i20 = i20;
                                    w0VarC = w0VarC;
                                } else if (iM3 == 1767990114) {
                                    uVar2.N(i39 + 9);
                                    int iF = uVar2.F();
                                    byte[] bArr10 = new byte[iF];
                                    uVar2.k(0, iF, bArr10);
                                    byte[] bArr11 = e7.e.f5121a;
                                    u uVar5 = new u(bArr10);
                                    String str12 = null;
                                    String strY = null;
                                    while (uVar5.a() > 0 && (str12 == null || strY == null)) {
                                        int iA8 = uVar5.A();
                                        int i94 = iA8 >> 3;
                                        boolean z16 = (iA8 & 2) != 0;
                                        boolean z17 = (iA8 & 1) != 0;
                                        int iF2 = uVar5.F();
                                        if (i94 > 4 && i94 < 24 && z16) {
                                            do {
                                                iA = uVar5.A();
                                            } while ((iA & Cast.MAX_NAMESPACE_LENGTH) != 0);
                                            for (i25 = Cast.MAX_NAMESPACE_LENGTH; (uVar5.A() & i25) != 0; i25 = Cast.MAX_NAMESPACE_LENGTH) {
                                            }
                                        }
                                        if (z17) {
                                            uVar5.O(uVar5.F());
                                        }
                                        int i95 = uVar5.f5183b + iF2;
                                        if (i94 == 31) {
                                            uVar5.O(4);
                                            Object[] objArr2 = {Integer.valueOf(uVar5.A()), Integer.valueOf(uVar5.A())};
                                            String str13 = i0.f5136a;
                                            str12 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                        } else {
                                            if (i94 == 0) {
                                                while ((uVar5.A() & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                                                }
                                                strY = uVar5.y(4, StandardCharsets.UTF_8);
                                                if (strY.equals("mp4a")) {
                                                    while ((uVar5.A() & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                                                    }
                                                    uVar5.O(2);
                                                    n0 n0Var4 = new n0();
                                                    n0Var4.p(uVar5);
                                                    int i96 = n0Var4.i(5);
                                                    if (i96 == 31) {
                                                        i96 = n0Var4.i(6) + 32;
                                                    }
                                                    strY = strY + ".40." + i96;
                                                }
                                            }
                                            uVar5.N(i95);
                                        }
                                        uVar5.N(i95);
                                    }
                                    strM = (str12 == null || strY == null) ? null : x5.m(str12, ".", strY);
                                    listS = t0.s(bArr10);
                                } else if (iM3 == 1885564227) {
                                    uVar2.N(i39 + 12);
                                    ByteOrder byteOrder = (uVar2.A() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                    int iA9 = uVar2.A();
                                    i20 = i20;
                                    if (i20 == 1768973165) {
                                        iW = i0.w(iA9, byteOrder);
                                        i24 = -1;
                                    } else {
                                        iW = (i20 == 1718641517 && iA9 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) ? 4 : i40;
                                        i24 = -1;
                                    }
                                    w0VarC = w0VarC;
                                    i40 = iW;
                                    strM = strM;
                                    str2 = iW != i24 ? "audio/raw" : str2;
                                    i39 = i39;
                                    i17 = i88;
                                    iH2 = i87;
                                } else {
                                    i20 = i20;
                                    i17 = i88;
                                    i23 = i87;
                                }
                                str2 = str2;
                                i39 = i39;
                                i17 = i88;
                                iH2 = i87;
                                i20 = i20;
                            }
                        }
                    }
                    w0VarC = w0VarC;
                    iH2 = i23;
                    strM = strM;
                    str2 = str2;
                    i39 = i39;
                }
                i39 += iM2;
                i16 = 4;
                i15 = 2;
                uVar2 = uVar;
                i38 = i12;
                iIntValue = i20;
                w0VarC = w0VarC;
                i18 = i40;
                str4 = str4;
                listS = listS;
            }
            w0VarC = w0VarC;
            i20 = iIntValue;
            i39 += iM2;
            i16 = 4;
            i15 = 2;
            uVar2 = uVar;
            i38 = i12;
            iIntValue = i20;
            w0VarC = w0VarC;
            i18 = i40;
            str4 = str4;
            listS = listS;
        }
        String str14 = strM;
        String str15 = str2;
        List list = listS;
        int i97 = iH2;
        int i98 = i18;
        if (((androidx.media3.common.t) q1Var.f4033e) != null || str15 == null) {
            return;
        }
        androidx.media3.common.s sVar5 = new androidx.media3.common.s();
        sVar5.f1491a = Integer.toString(i13);
        sVar5.m = x0.n(str15);
        sVar5.f1500j = str14;
        sVar5.E = i97;
        sVar5.F = i17;
        sVar5.G = i98;
        sVar5.f1504p = list;
        sVar5.f1505q = oVarA;
        sVar5.f1494d = str;
        if (w0VarC != null) {
            w0 w0Var = w0VarC;
            sVar5.f1498h = bi.b.P(w0Var.A);
            sVar5.f1499i = bi.b.P(w0Var.B);
        } else {
            l50.d dVar2 = dVar;
            if (dVar2 != null) {
                sVar5.f1498h = bi.b.P(dVar2.a);
                sVar5.f1499i = bi.b.P(dVar2.b);
            }
        }
        q1Var.f4033e = new androidx.media3.common.t(sVar5);
    }

    public static w0 c(int i10, u uVar) {
        uVar.N(i10 + 12);
        uVar.O(1);
        d(uVar);
        uVar.O(2);
        int iA = uVar.A();
        if ((iA & Cast.MAX_NAMESPACE_LENGTH) != 0) {
            uVar.O(2);
        }
        if ((iA & 64) != 0) {
            uVar.O(uVar.A());
        }
        if ((iA & 32) != 0) {
            uVar.O(2);
        }
        uVar.O(1);
        d(uVar);
        String strE = x0.e(uVar.A());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new w0(strE, null, -1L, -1L);
        }
        uVar.O(4);
        long jC = uVar.C();
        long jC2 = uVar.C();
        uVar.O(1);
        int iD = d(uVar);
        long j9 = jC2;
        byte[] bArr = new byte[iD];
        uVar.k(0, iD, bArr);
        if (j9 <= 0) {
            j9 = -1;
        }
        return new w0(strE, bArr, j9, jC > 0 ? jC : -1L);
    }

    public static int d(u uVar) {
        int iA = uVar.A();
        int i10 = iA & 127;
        while ((iA & Cast.MAX_NAMESPACE_LENGTH) == 128) {
            iA = uVar.A();
            i10 = (i10 << 7) | (iA & 127);
        }
        return i10;
    }

    public static int e(int i10) {
        return (i10 >> 24) & 255;
    }

    public static v0 f(f7.c cVar) {
        f7.a aVar;
        f7.d dVarR = cVar.r(1751411826);
        f7.d dVarR2 = cVar.r(1801812339);
        f7.d dVarR3 = cVar.r(1768715124);
        if (dVarR != null && dVarR2 != null && dVarR3 != null) {
            u uVar = dVarR.C;
            uVar.N(16);
            if (uVar.m() == 1835299937) {
                u uVar2 = dVarR2.C;
                uVar2.N(12);
                int iM = uVar2.m();
                String[] strArr = new String[iM];
                for (int i10 = 0; i10 < iM; i10++) {
                    int iM2 = uVar2.m();
                    uVar2.O(4);
                    strArr[i10] = uVar2.y(iM2 - 8, StandardCharsets.UTF_8);
                }
                u uVar3 = dVarR3.C;
                uVar3.N(8);
                ArrayList arrayList = new ArrayList();
                while (uVar3.a() > 8) {
                    int i11 = uVar3.f5183b;
                    int iM3 = uVar3.m();
                    int iM4 = uVar3.m() - 1;
                    if (iM4 < 0 || iM4 >= iM) {
                        a1.b.y("Skipped metadata with unknown key index: ", iM4, "BoxParsers");
                    } else {
                        String str = strArr[iM4];
                        int i12 = i11 + iM3;
                        while (true) {
                            int i13 = uVar3.f5183b;
                            if (i13 >= i12) {
                                aVar = null;
                                break;
                            }
                            int iM5 = uVar3.m();
                            if (uVar3.m() == 1684108385) {
                                int iM6 = uVar3.m();
                                int iM7 = uVar3.m();
                                int i14 = iM5 - 16;
                                byte[] bArr = new byte[i14];
                                uVar3.k(0, i14, bArr);
                                aVar = new f7.a(str, bArr, iM7, iM6);
                                break;
                            }
                            uVar3.N(i13 + iM5);
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                    uVar3.N(i11 + iM3);
                }
                if (!arrayList.isEmpty()) {
                    return new v0(arrayList);
                }
            }
        }
        return null;
    }

    public static f7.g g(u uVar) {
        long jU;
        long jU2;
        uVar.N(8);
        if (e(uVar.m()) == 0) {
            jU = uVar.C();
            jU2 = uVar.C();
        } else {
            jU = uVar.u();
            jU2 = uVar.u();
        }
        return new f7.g(jU, jU2, uVar.C());
    }

    public static Pair h(u uVar, int i10, int i11) throws ParserException {
        r rVar;
        Pair pairCreate;
        int i12;
        int i13;
        int i14 = uVar.f5183b;
        while (i14 - i10 < i11) {
            uVar.N(i14);
            int iM = uVar.m();
            a8.b.c("childAtomSize must be positive", iM > 0);
            if (uVar.m() == 1936289382) {
                int i15 = i14 + 8;
                int i16 = 0;
                int i17 = -1;
                Integer numValueOf = null;
                String strY = null;
                while (i15 - i14 < iM) {
                    uVar.N(i15);
                    int iM2 = uVar.m();
                    int iM3 = uVar.m();
                    if (iM3 == 1718775137) {
                        numValueOf = Integer.valueOf(uVar.m());
                    } else if (iM3 == 1935894637) {
                        uVar.O(4);
                        strY = uVar.y(4, StandardCharsets.UTF_8);
                    } else if (iM3 == 1935894633) {
                        i17 = i15;
                        i16 = iM2;
                    }
                    i15 += iM2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strY) || "cbc1".equals(strY) || "cens".equals(strY) || "cbcs".equals(strY)) {
                    a8.b.c("frma atom is mandatory", numValueOf != null);
                    a8.b.c("schi atom is mandatory", i17 != -1);
                    int i18 = i17 + 8;
                    while (true) {
                        if (i18 - i17 >= i16) {
                            rVar = null;
                            break;
                        }
                        uVar.N(i18);
                        int iM4 = uVar.m();
                        if (uVar.m() == 1952804451) {
                            int iE = e(uVar.m());
                            uVar.O(1);
                            if (iE == 0) {
                                uVar.O(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int iA = uVar.A();
                                i12 = iA & 15;
                                i13 = (iA & 240) >> 4;
                            }
                            boolean z10 = uVar.A() == 1;
                            int iA2 = uVar.A();
                            byte[] bArr2 = new byte[16];
                            uVar.k(0, 16, bArr2);
                            if (z10 && iA2 == 0) {
                                int iA3 = uVar.A();
                                byte[] bArr3 = new byte[iA3];
                                uVar.k(0, iA3, bArr3);
                                bArr = bArr3;
                            }
                            rVar = new r(z10, strY, iA2, bArr2, i13, i12, bArr);
                            break;
                        }
                        i18 += iM4;
                    }
                    a8.b.c("tenc atom is mandatory", rVar != null);
                    String str = i0.f5136a;
                    pairCreate = Pair.create(numValueOf, rVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i14 += iM;
        }
        return null;
    }

    public static q1 i(u uVar, o1 o1Var, String str, androidx.media3.common.o oVar, boolean z10) throws ParserException {
        int i10;
        androidx.media3.common.o oVar2;
        String str2;
        int i11;
        int i12;
        int i13;
        char c10;
        int i14;
        int i15;
        int i16;
        String str3;
        byte[] bArrCopyOfRange;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean zH;
        int i21;
        int i22;
        int i23;
        int i24;
        char c11;
        int i25;
        boolean zH2;
        int i26;
        int i27;
        boolean z11;
        int i28;
        int iG;
        androidx.media3.common.i iVar;
        int i29;
        int i30;
        androidx.media3.common.i iVar2;
        int i31;
        int i32;
        o9.q qVar;
        androidx.media3.common.o oVarA;
        int i33;
        int i34;
        String str4;
        d2 d2VarS;
        long j9;
        u uVar2 = uVar;
        o1 o1Var2 = o1Var;
        String str5 = str;
        int i35 = o1Var2.f2372a;
        uVar2.N(12);
        int iM = uVar2.m();
        q1 q1Var = new q1(iM);
        int i36 = 0;
        while (i36 < iM) {
            int i37 = uVar2.f5183b;
            int iM2 = uVar2.m();
            String str6 = "childAtomSize must be positive";
            a8.b.c("childAtomSize must be positive", iM2 > 0);
            int iM3 = uVar2.m();
            byte b7 = 3;
            int i38 = 8;
            if (iM3 == 1635148593 || iM3 == 1635148595 || iM3 == 1701733238 || iM3 == 1831958048 || iM3 == 1836070006 || iM3 == 1752589105 || iM3 == 1751479857 || iM3 == 1932670515 || iM3 == 1211250227 || iM3 == 1748121139 || iM3 == 1987063864 || iM3 == 1987063865 || iM3 == 1635135537 || iM3 == 1685479798 || iM3 == 1685479729 || iM3 == 1685481573 || iM3 == 1685481521 || iM3 == 1634760241) {
                int i39 = o1Var2.f2374c;
                uVar2.N(i37 + 16);
                uVar2.O(16);
                int iH = uVar2.H();
                int iH2 = uVar2.H();
                uVar2.O(50);
                int i40 = uVar2.f5183b;
                i10 = i36;
                if (iM3 == 1701733238) {
                    Pair pairH = h(uVar2, i37, iM2);
                    if (pairH != null) {
                        iM3 = ((Integer) pairH.first).intValue();
                        oVarA = oVar == null ? null : oVar.a(((r) pairH.second).f15105b);
                        ((r[]) q1Var.f4032d)[i10] = (r) pairH.second;
                    } else {
                        i37 = i37;
                        oVarA = oVar;
                    }
                    uVar2.N(i40);
                    oVar2 = oVarA;
                } else {
                    i37 = i37;
                    oVar2 = oVar;
                }
                if (iM3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iM3 == 1211250227 ? "video/3gpp" : null;
                }
                androidx.media3.common.o oVar3 = oVar2;
                i11 = i35;
                i12 = iM;
                int i41 = 8;
                int i42 = 8;
                String str7 = str2;
                float fE = 1.0f;
                int i43 = -1;
                int i44 = -1;
                List listG = null;
                int i45 = -1;
                oj.q qVar2 = null;
                ByteBuffer byteBufferOrder = null;
                boolean z12 = false;
                int i46 = -1;
                int i47 = -1;
                byte[] bArr = null;
                int i48 = -1;
                int i49 = -1;
                String str8 = null;
                l50.d dVar = null;
                w0 w0Var = null;
                int i50 = i40;
                int iG2 = -1;
                while (i50 - i37 < iM2) {
                    uVar2.N(i50);
                    int i51 = uVar2.f5183b;
                    int i52 = i50;
                    int iM4 = uVar2.m();
                    if (iM4 == 0 && uVar2.f5183b - i37 == iM2) {
                        break;
                    }
                    a8.b.c(str6, iM4 > 0);
                    int iM5 = uVar2.m();
                    int i53 = iM2;
                    if (iM5 == 1635148611) {
                        a8.b.c(null, str7 == null);
                        uVar2.N(i51 + 8);
                        a8.e eVarA = a8.e.a(uVar2);
                        listG = eVarA.f241a;
                        q1Var.f4030b = eVarA.f242b;
                        float f3 = !z12 ? eVarA.f251k : fE;
                        String str9 = eVarA.l;
                        int i54 = eVarA.f250j;
                        i45 = eVarA.f247g;
                        int i55 = eVarA.f248h;
                        iG2 = eVarA.f249i;
                        int i56 = eVarA.f245e;
                        i41 = eVarA.f246f;
                        i14 = iM3;
                        fE = f3;
                        str8 = str9;
                        i16 = i38;
                        str7 = "video/avc";
                        i47 = i54;
                        i44 = i55;
                        i15 = i43;
                        i42 = i56;
                    } else {
                        i14 = iM3;
                        if (iM5 == 1752589123) {
                            a8.b.c(null, str7 == null);
                            uVar2.N(i51 + 8);
                            z zVarA = z.a(uVar2, false, null);
                            listG = zVarA.f326a;
                            q1Var.f4030b = zVarA.f327b;
                            float f10 = !z12 ? zVarA.l : fE;
                            int i57 = zVarA.m;
                            int i58 = zVarA.f328c;
                            String str10 = zVarA.f337n;
                            int i59 = zVarA.f336k;
                            if (i59 != -1) {
                                i43 = i59;
                            }
                            int i60 = zVarA.f329d;
                            int i61 = zVarA.f330e;
                            i45 = zVarA.f333h;
                            int i62 = zVarA.f334i;
                            i46 = i58;
                            int i63 = zVarA.f335j;
                            int i64 = zVarA.f331f;
                            i41 = zVarA.f332g;
                            qVar2 = zVarA.f338o;
                            str7 = "video/hevc";
                            i15 = i43;
                            str6 = str6;
                            i49 = i60;
                            q1Var = q1Var;
                            str8 = str10;
                            i48 = i61;
                            i16 = i38;
                            iG2 = i63;
                            i47 = i57;
                            i42 = i64;
                            fE = f10;
                            i44 = i62;
                        } else {
                            int i65 = i43;
                            if (iM5 == 1818785347) {
                                a8.b.c("lhvC must follow hvcC atom", "video/hevc".equals(str7));
                                a8.b.c("must have at least two layers", qVar2 != null && ((t0) qVar2.B).size() >= 2);
                                uVar2.N(i51 + 8);
                                qVar2.getClass();
                                z zVarA2 = z.a(uVar2, true, qVar2);
                                a8.b.c("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", q1Var.f4030b == zVarA2.f327b);
                                int i66 = zVarA2.f333h;
                                if (i66 != -1) {
                                    a8.b.c("colorSpace must be the same for both views", i45 == i66);
                                }
                                int i67 = zVarA2.f334i;
                                if (i67 != -1) {
                                    a8.b.c("colorRange must be the same for both views", i44 == i67);
                                }
                                int i68 = zVarA2.f335j;
                                if (i68 != -1) {
                                    a8.b.c("colorTransfer must be the same for both views", iG2 == i68);
                                }
                                a8.b.c("bitdepthLuma must be the same for both views", i42 == zVarA2.f331f);
                                a8.b.c("bitdepthChroma must be the same for both views", i41 == zVarA2.f332g);
                                if (listG != null) {
                                    q0 q0VarM = t0.m();
                                    q0VarM.e(listG);
                                    q0VarM.e(zVarA2.f326a);
                                    listG = q0VarM.g();
                                } else {
                                    a8.b.c("initializationData must be already set from hvcC atom", false);
                                }
                                str7 = "video/mv-hevc";
                                q1Var = q1Var;
                                str8 = zVarA2.f337n;
                                qVar2 = qVar2;
                                i16 = i38;
                                i15 = i65;
                                str6 = str6;
                            } else if (iM5 == 1986361461) {
                                uVar2.N(i51 + 8);
                                int i69 = uVar2.f5183b;
                                o9.q qVar3 = null;
                                while (i69 - i51 < iM4) {
                                    uVar2.N(i69);
                                    int iM6 = uVar2.m();
                                    a8.b.c(str6, iM6 > 0);
                                    int i70 = i41;
                                    if (uVar2.m() == 1702454643) {
                                        uVar2.N(i69 + 8);
                                        int i71 = uVar2.f5183b;
                                        while (true) {
                                            if (i71 - i69 >= iM6) {
                                                qVar = null;
                                                break;
                                            }
                                            uVar2.N(i71);
                                            int iM7 = uVar2.m();
                                            a8.b.c(str6, iM7 > 0);
                                            int i72 = i71;
                                            if (uVar2.m() == 1937011305) {
                                                uVar2.O(4);
                                                int iA = uVar2.A();
                                                qVar = new o9.q(new k7.f((iA & 1) == 1, (iA & 2) == 2, (iA & 8) == i38), 24);
                                                break;
                                            }
                                            i71 = i72 + iM7;
                                            i38 = 8;
                                        }
                                        qVar3 = qVar;
                                    } else {
                                        i42 = i42;
                                        i69 = i69;
                                        iM6 = iM6;
                                    }
                                    i69 += iM6;
                                    i41 = i70;
                                    i42 = i42;
                                    i38 = 8;
                                }
                                int i73 = i41;
                                int i74 = i42;
                                o10.b bVar = qVar3 == null ? null : new o10.b(qVar3, 24);
                                if (bVar != null) {
                                    k7.f fVar = (k7.f) ((o9.q) bVar.B).B;
                                    boolean z13 = fVar.f9049c;
                                    if (qVar2 == null || ((t0) qVar2.B).size() < 2) {
                                        i31 = i65;
                                        if (i31 == -1) {
                                            i32 = z13 ? 5 : 4;
                                        } else {
                                            i32 = i31;
                                        }
                                    } else {
                                        a8.b.c("both eye views must be marked as available", fVar.f9047a && fVar.f9048b);
                                        a8.b.c("for MV-HEVC, eye_views_reversed must be set to false", !z13);
                                        i31 = i65;
                                        i32 = i31;
                                    }
                                } else {
                                    i31 = i65;
                                    i32 = i31;
                                }
                                i15 = i32;
                                str6 = str6;
                                str7 = str7;
                                q1Var = q1Var;
                                qVar2 = qVar2;
                                i41 = i73;
                                i42 = i74;
                                i16 = 8;
                            } else {
                                i41 = i41;
                                i42 = i42;
                                i15 = i65;
                                if (iM5 == 1685480259 || iM5 == 1685485123 || iM5 == 1685485379) {
                                    str6 = str6;
                                    String str11 = str7;
                                    q1Var = q1Var;
                                    int i75 = i44;
                                    qVar2 = qVar2;
                                    i16 = 8;
                                    int i76 = iM4 - 8;
                                    byte[] bArr2 = new byte[i76];
                                    uVar2.k(0, i76, bArr2);
                                    if (listG != null) {
                                        q0 q0VarM2 = t0.m();
                                        q0VarM2.e(listG);
                                        q0VarM2.c(bArr2);
                                        listG = q0VarM2.g();
                                    } else {
                                        a8.b.c("initializationData must already be set from hvcC or avcC atom", false);
                                    }
                                    uVar2.N(i51 + 8);
                                    bh.f fVarF = bh.f.f(uVar2);
                                    if (fVarF != null) {
                                        str3 = "video/dolby-vision";
                                        str8 = fVarF.A;
                                    } else {
                                        str3 = str11;
                                    }
                                    str7 = str3;
                                    i44 = i75;
                                } else {
                                    int i77 = 6;
                                    if (iM5 == 1987076931) {
                                        a8.b.c(null, str7 == null);
                                        String str12 = i14 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                        uVar2.N(i51 + 12);
                                        byte bA = (byte) uVar2.A();
                                        byte bA2 = (byte) uVar2.A();
                                        int iA2 = uVar2.A();
                                        int i78 = iA2 >> 4;
                                        byte b10 = (byte) ((iA2 >> 1) & 7);
                                        if (str12.equals("video/x-vnd.on2.vp9")) {
                                            byte[] bArr3 = e7.e.f5121a;
                                            byte[] bArr4 = new byte[12];
                                            bArr4[0] = 1;
                                            bArr4[1] = 1;
                                            bArr4[2] = bA;
                                            bArr4[b7] = 2;
                                            bArr4[4] = 1;
                                            bArr4[5] = bA2;
                                            bArr4[6] = b7;
                                            bArr4[7] = 1;
                                            bArr4[8] = (byte) i78;
                                            bArr4[9] = 4;
                                            bArr4[10] = 1;
                                            bArr4[11] = b10;
                                            listG = t0.s(bArr4);
                                        }
                                        boolean z14 = (iA2 & 1) != 0;
                                        int iA3 = uVar2.A();
                                        int iA4 = uVar2.A();
                                        int iF = androidx.media3.common.i.f(iA3);
                                        int i79 = z14 ? 1 : 2;
                                        iG2 = androidx.media3.common.i.g(iA4);
                                        str6 = str6;
                                        i14 = i14;
                                        q1Var = q1Var;
                                        i42 = i78;
                                        str7 = str12;
                                        qVar2 = qVar2;
                                        i16 = 8;
                                        i45 = iF;
                                        i44 = i79;
                                        i15 = i15;
                                        i41 = i42;
                                    } else {
                                        int i80 = 7;
                                        int i81 = 11;
                                        if (iM5 == 1635135811) {
                                            int i82 = iM4 - 8;
                                            byte[] bArr5 = new byte[i82];
                                            uVar2.k(0, i82, bArr5);
                                            listG = t0.s(bArr5);
                                            uVar2.N(i51 + 8);
                                            byte[] bArr6 = uVar2.f5182a;
                                            n0 n0Var = new n0(bArr6.length, bArr6);
                                            n0Var.q(uVar2.f5183b * 8);
                                            n0Var.u(1);
                                            int i83 = n0Var.i(b7);
                                            n0Var.t(6);
                                            boolean zH3 = n0Var.h();
                                            boolean zH4 = n0Var.h();
                                            int i84 = -1;
                                            if (i83 == 2 && zH3) {
                                                int i85 = zH4 ? 12 : 10;
                                                i19 = zH4 ? 12 : 10;
                                                i17 = i85;
                                            } else {
                                                if (i83 <= 2) {
                                                    int i86 = zH3 ? 10 : 8;
                                                    i19 = zH3 ? 10 : 8;
                                                    i17 = i86;
                                                } else {
                                                    i17 = -1;
                                                    i18 = -1;
                                                }
                                                n0Var.t(13);
                                                n0Var.s();
                                                i20 = n0Var.i(4);
                                                if (i20 != 1) {
                                                    e7.a.h("BoxParsers", "Unsupported obu_type: " + i20);
                                                    iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                } else if (n0Var.h()) {
                                                    e7.a.h("BoxParsers", "Unsupported obu_extension_flag");
                                                    iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                } else {
                                                    zH = n0Var.h();
                                                    n0Var.s();
                                                    if (zH || n0Var.i(8) <= 127) {
                                                        i21 = n0Var.i(3);
                                                        n0Var.s();
                                                        if (n0Var.h()) {
                                                            e7.a.h("BoxParsers", "Unsupported reduced_still_picture_header");
                                                            iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                        } else if (n0Var.h()) {
                                                            e7.a.h("BoxParsers", "Unsupported timing_info_present_flag");
                                                            iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                        } else {
                                                            if (n0Var.h()) {
                                                                e7.a.h("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                                iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                            } else {
                                                                i22 = 5;
                                                                i23 = n0Var.i(5);
                                                                i24 = 0;
                                                                while (i24 <= i23) {
                                                                    n0Var.t(12);
                                                                    if (n0Var.i(i22) > i80) {
                                                                        n0Var.s();
                                                                    }
                                                                    i24++;
                                                                    i22 = 5;
                                                                    i80 = 7;
                                                                }
                                                                c11 = '\f';
                                                                int i87 = n0Var.i(4);
                                                                int i88 = n0Var.i(4);
                                                                n0Var.t(i87 + 1);
                                                                n0Var.t(i88 + 1);
                                                                if (n0Var.h()) {
                                                                    i25 = 7;
                                                                    n0Var.t(7);
                                                                } else {
                                                                    i25 = 7;
                                                                }
                                                                n0Var.t(i25);
                                                                zH2 = n0Var.h();
                                                                if (zH2) {
                                                                    n0Var.t(2);
                                                                }
                                                                if (n0Var.h()) {
                                                                    i26 = 1;
                                                                    i27 = 2;
                                                                } else {
                                                                    i26 = 1;
                                                                    i27 = n0Var.i(1);
                                                                }
                                                                if (i27 > 0 && !n0Var.h()) {
                                                                    n0Var.t(i26);
                                                                }
                                                                if (zH2) {
                                                                    n0Var.t(3);
                                                                }
                                                                n0Var.t(3);
                                                                boolean zH5 = n0Var.h();
                                                                if (i21 == 2 && zH5) {
                                                                    n0Var.s();
                                                                }
                                                                if (i21 == 1 && n0Var.h()) {
                                                                    z11 = true;
                                                                } else {
                                                                    z11 = false;
                                                                }
                                                                if (n0Var.h()) {
                                                                    int i89 = n0Var.i(8);
                                                                    int i90 = n0Var.i(8);
                                                                    int i91 = n0Var.i(8);
                                                                    if (z11 && i89 == 1 && i90 == 13 && i91 == 0) {
                                                                        i29 = 1;
                                                                    } else {
                                                                        i29 = n0Var.i(1);
                                                                    }
                                                                    int iF2 = androidx.media3.common.i.f(i89);
                                                                    if (i29 == 1) {
                                                                        i30 = 1;
                                                                    } else {
                                                                        i30 = 2;
                                                                    }
                                                                    i28 = iF2;
                                                                    iG = androidx.media3.common.i.g(i90);
                                                                    i84 = i30;
                                                                } else {
                                                                    i28 = -1;
                                                                    iG = -1;
                                                                }
                                                                iVar = new androidx.media3.common.i(i28, i84, iG, i17, i18, null);
                                                            }
                                                            int i92 = iVar.f1247e;
                                                            int i93 = iVar.f1248f;
                                                            int i94 = iVar.f1243a;
                                                            i44 = iVar.f1244b;
                                                            iG2 = iVar.f1245c;
                                                            str7 = "video/av01";
                                                            i42 = i92;
                                                            i16 = 8;
                                                            i15 = i15;
                                                            i41 = i93;
                                                            i45 = i94;
                                                        }
                                                    } else {
                                                        e7.a.h("BoxParsers", "Excessive obu_size");
                                                        iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                    }
                                                }
                                                iVar = iVar2;
                                                c11 = '\f';
                                                int i95 = iVar.f1247e;
                                                int i96 = iVar.f1248f;
                                                int i97 = iVar.f1243a;
                                                i44 = iVar.f1244b;
                                                iG2 = iVar.f1245c;
                                                str7 = "video/av01";
                                                i42 = i95;
                                                i16 = 8;
                                                i15 = i15;
                                                i41 = i96;
                                                i45 = i97;
                                            }
                                            i18 = i19;
                                            n0Var.t(13);
                                            n0Var.s();
                                            i20 = n0Var.i(4);
                                            if (i20 != 1) {
                                                e7.a.h("BoxParsers", "Unsupported obu_type: " + i20);
                                                iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                            } else if (n0Var.h()) {
                                                e7.a.h("BoxParsers", "Unsupported obu_extension_flag");
                                                iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                            } else {
                                                zH = n0Var.h();
                                                n0Var.s();
                                                if (zH) {
                                                    i21 = n0Var.i(3);
                                                    n0Var.s();
                                                    if (n0Var.h()) {
                                                        e7.a.h("BoxParsers", "Unsupported reduced_still_picture_header");
                                                        iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                    } else if (n0Var.h()) {
                                                        e7.a.h("BoxParsers", "Unsupported timing_info_present_flag");
                                                        iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                    } else if (n0Var.h()) {
                                                        e7.a.h("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                        iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                    } else {
                                                        i22 = 5;
                                                        i23 = n0Var.i(5);
                                                        i24 = 0;
                                                        while (i24 <= i23) {
                                                            n0Var.t(12);
                                                            if (n0Var.i(i22) > i80) {
                                                                n0Var.s();
                                                            }
                                                            i24++;
                                                            i22 = 5;
                                                            i80 = 7;
                                                        }
                                                        c11 = '\f';
                                                        int i810 = n0Var.i(4);
                                                        int i811 = n0Var.i(4);
                                                        n0Var.t(i810 + 1);
                                                        n0Var.t(i811 + 1);
                                                        if (n0Var.h()) {
                                                            i25 = 7;
                                                            n0Var.t(7);
                                                        } else {
                                                            i25 = 7;
                                                        }
                                                        n0Var.t(i25);
                                                        zH2 = n0Var.h();
                                                        if (zH2) {
                                                            n0Var.t(2);
                                                        }
                                                        if (n0Var.h()) {
                                                            i26 = 1;
                                                            i27 = 2;
                                                        } else {
                                                            i26 = 1;
                                                            i27 = n0Var.i(1);
                                                        }
                                                        if (i27 > 0) {
                                                            n0Var.t(i26);
                                                        }
                                                        if (zH2) {
                                                            n0Var.t(3);
                                                        }
                                                        n0Var.t(3);
                                                        boolean zH6 = n0Var.h();
                                                        if (i21 == 2) {
                                                            n0Var.s();
                                                        }
                                                        if (i21 == 1) {
                                                            z11 = false;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (n0Var.h()) {
                                                            int i812 = n0Var.i(8);
                                                            int i98 = n0Var.i(8);
                                                            int i99 = n0Var.i(8);
                                                            if (z11) {
                                                                i29 = n0Var.i(1);
                                                            } else {
                                                                i29 = n0Var.i(1);
                                                            }
                                                            int iF3 = androidx.media3.common.i.f(i812);
                                                            if (i29 == 1) {
                                                                i30 = 1;
                                                            } else {
                                                                i30 = 2;
                                                            }
                                                            i28 = iF3;
                                                            iG = androidx.media3.common.i.g(i98);
                                                            i84 = i30;
                                                        } else {
                                                            i28 = -1;
                                                            iG = -1;
                                                        }
                                                        iVar = new androidx.media3.common.i(i28, i84, iG, i17, i18, null);
                                                    }
                                                } else {
                                                    i21 = n0Var.i(3);
                                                    n0Var.s();
                                                    if (n0Var.h()) {
                                                        e7.a.h("BoxParsers", "Unsupported reduced_still_picture_header");
                                                        iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                    } else if (n0Var.h()) {
                                                        e7.a.h("BoxParsers", "Unsupported timing_info_present_flag");
                                                        iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                    } else if (n0Var.h()) {
                                                        e7.a.h("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                        iVar2 = new androidx.media3.common.i(-1, -1, -1, i17, i18, null);
                                                    } else {
                                                        i22 = 5;
                                                        i23 = n0Var.i(5);
                                                        i24 = 0;
                                                        while (i24 <= i23) {
                                                            n0Var.t(12);
                                                            if (n0Var.i(i22) > i80) {
                                                                n0Var.s();
                                                            }
                                                            i24++;
                                                            i22 = 5;
                                                            i80 = 7;
                                                        }
                                                        c11 = '\f';
                                                        int i813 = n0Var.i(4);
                                                        int i814 = n0Var.i(4);
                                                        n0Var.t(i813 + 1);
                                                        n0Var.t(i814 + 1);
                                                        if (n0Var.h()) {
                                                            i25 = 7;
                                                            n0Var.t(7);
                                                        } else {
                                                            i25 = 7;
                                                        }
                                                        n0Var.t(i25);
                                                        zH2 = n0Var.h();
                                                        if (zH2) {
                                                            n0Var.t(2);
                                                        }
                                                        if (n0Var.h()) {
                                                            i26 = 1;
                                                            i27 = 2;
                                                        } else {
                                                            i26 = 1;
                                                            i27 = n0Var.i(1);
                                                        }
                                                        if (i27 > 0) {
                                                            n0Var.t(i26);
                                                        }
                                                        if (zH2) {
                                                            n0Var.t(3);
                                                        }
                                                        n0Var.t(3);
                                                        boolean zH7 = n0Var.h();
                                                        if (i21 == 2) {
                                                            n0Var.s();
                                                        }
                                                        if (i21 == 1) {
                                                            z11 = false;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (n0Var.h()) {
                                                            int i815 = n0Var.i(8);
                                                            int i910 = n0Var.i(8);
                                                            int i911 = n0Var.i(8);
                                                            if (z11) {
                                                                i29 = n0Var.i(1);
                                                            } else {
                                                                i29 = n0Var.i(1);
                                                            }
                                                            int iF4 = androidx.media3.common.i.f(i815);
                                                            if (i29 == 1) {
                                                                i30 = 1;
                                                            } else {
                                                                i30 = 2;
                                                            }
                                                            i28 = iF4;
                                                            iG = androidx.media3.common.i.g(i910);
                                                            i84 = i30;
                                                        } else {
                                                            i28 = -1;
                                                            iG = -1;
                                                        }
                                                        iVar = new androidx.media3.common.i(i28, i84, iG, i17, i18, null);
                                                    }
                                                }
                                                int i912 = iVar.f1247e;
                                                int i913 = iVar.f1248f;
                                                int i914 = iVar.f1243a;
                                                i44 = iVar.f1244b;
                                                iG2 = iVar.f1245c;
                                                str7 = "video/av01";
                                                i42 = i912;
                                                i16 = 8;
                                                i15 = i15;
                                                i41 = i913;
                                                i45 = i914;
                                            }
                                            iVar = iVar2;
                                            c11 = '\f';
                                            int i915 = iVar.f1247e;
                                            int i916 = iVar.f1248f;
                                            int i917 = iVar.f1243a;
                                            i44 = iVar.f1244b;
                                            iG2 = iVar.f1245c;
                                            str7 = "video/av01";
                                            i42 = i915;
                                            i16 = 8;
                                            i15 = i15;
                                            i41 = i916;
                                            i45 = i917;
                                        } else {
                                            if (iM5 == 1668050025) {
                                                if (byteBufferOrder == null) {
                                                    byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                }
                                                ByteBuffer byteBuffer = byteBufferOrder;
                                                byteBuffer.position(21);
                                                byteBuffer.putShort(uVar2.x());
                                                byteBuffer.putShort(uVar2.x());
                                                byteBufferOrder = byteBuffer;
                                            } else if (iM5 == 1835295606) {
                                                if (byteBufferOrder == null) {
                                                    byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                }
                                                ByteBuffer byteBuffer2 = byteBufferOrder;
                                                short sX = uVar2.x();
                                                short sX2 = uVar2.x();
                                                short sX3 = uVar2.x();
                                                short sX4 = uVar2.x();
                                                short sX5 = uVar2.x();
                                                short sX6 = uVar2.x();
                                                int i100 = i44;
                                                short sX7 = uVar2.x();
                                                short sX8 = uVar2.x();
                                                long jC = uVar2.C();
                                                long jC2 = uVar2.C();
                                                byteBuffer2.position(1);
                                                byteBuffer2.putShort(sX5);
                                                byteBuffer2.putShort(sX6);
                                                byteBuffer2.putShort(sX);
                                                byteBuffer2.putShort(sX2);
                                                byteBuffer2.putShort(sX3);
                                                byteBuffer2.putShort(sX4);
                                                byteBuffer2.putShort(sX7);
                                                byteBuffer2.putShort(sX8);
                                                byteBuffer2.putShort((short) (jC / NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS));
                                                byteBuffer2.putShort((short) (jC2 / NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS));
                                                byteBufferOrder = byteBuffer2;
                                                i44 = i100;
                                            } else {
                                                str6 = str6;
                                                str7 = str7;
                                                q1Var = q1Var;
                                                int i101 = i44;
                                                qVar2 = qVar2;
                                                if (iM5 == 1681012275) {
                                                    a8.b.c(null, str7 == null);
                                                    i15 = i15;
                                                    str7 = "video/3gpp";
                                                    i41 = i41;
                                                    i42 = i42;
                                                    i44 = i101;
                                                } else if (iM5 == 1702061171) {
                                                    a8.b.c(null, str7 == null);
                                                    w0 w0VarC = c(i51, uVar2);
                                                    String str13 = (String) w0VarC.C;
                                                    byte[] bArr7 = (byte[]) w0VarC.D;
                                                    if (bArr7 != null) {
                                                        listG = t0.s(bArr7);
                                                    }
                                                    w0Var = w0VarC;
                                                    str7 = str13;
                                                    i44 = i101;
                                                    i16 = 8;
                                                } else {
                                                    if (iM5 == 1651798644) {
                                                        uVar2.N(i51 + 8);
                                                        uVar2.O(4);
                                                        i15 = i15;
                                                        dVar = new l50.d(uVar2.C(), uVar2.C());
                                                    } else if (iM5 == 1885434736) {
                                                        uVar2.N(i51 + 8);
                                                        i15 = i15;
                                                        fE = uVar2.E() / uVar2.E();
                                                        i41 = i41;
                                                        i42 = i42;
                                                        i44 = i101;
                                                        i16 = 8;
                                                        z12 = true;
                                                    } else if (iM5 == 1937126244) {
                                                        int i102 = i51 + 8;
                                                        while (true) {
                                                            if (i102 - i51 >= iM4) {
                                                                bArrCopyOfRange = null;
                                                                break;
                                                            }
                                                            uVar2.N(i102);
                                                            int iM8 = uVar2.m();
                                                            if (uVar2.m() == 1886547818) {
                                                                bArrCopyOfRange = Arrays.copyOfRange(uVar2.f5182a, i102, iM8 + i102);
                                                                break;
                                                            }
                                                            i102 += iM8;
                                                        }
                                                        i15 = i15;
                                                        bArr = bArrCopyOfRange;
                                                    } else if (iM5 == 1936995172) {
                                                        int iA5 = uVar2.A();
                                                        uVar2.O(3);
                                                        if (iA5 == 0) {
                                                            int iA6 = uVar2.A();
                                                            if (iA6 == 0) {
                                                                i15 = 0;
                                                            } else if (iA6 == 1) {
                                                                i15 = 1;
                                                            } else if (iA6 == 2) {
                                                                i15 = 2;
                                                            } else if (iA6 == 3) {
                                                                i15 = 3;
                                                            }
                                                        }
                                                        i15 = i15;
                                                    } else if (iM5 == 1634760259) {
                                                        int i103 = iM4 - 12;
                                                        byte[] bArr8 = new byte[i103];
                                                        uVar2.N(i51 + 12);
                                                        uVar2.k(0, i103, bArr8);
                                                        byte[] bArr9 = e7.e.f5121a;
                                                        c0.q("Invalid APV CSD length: %s", i103, i103 >= 17);
                                                        byte b11 = bArr8[0];
                                                        c0.q("Invalid APV CSD version: %s", b11, b11 == 1);
                                                        byte b12 = bArr8[5];
                                                        byte b13 = bArr8[6];
                                                        byte b14 = bArr8[7];
                                                        String str14 = i0.f5136a;
                                                        Locale locale = Locale.US;
                                                        StringBuilder sbP = oi.k.p(b12, b13, "apv1.apvf", ".apvl", ".apvb");
                                                        sbP.append((int) b14);
                                                        String string = sbP.toString();
                                                        listG = t0.s(bArr8);
                                                        u uVar3 = new u(bArr8);
                                                        n0 n0Var2 = new n0(i103, bArr8);
                                                        i16 = 8;
                                                        n0Var2.q(uVar3.f5183b * 8);
                                                        n0Var2.u(1);
                                                        int i104 = n0Var2.i(8);
                                                        int i105 = -1;
                                                        int i106 = -1;
                                                        int i107 = 0;
                                                        int i108 = -1;
                                                        int i109 = -1;
                                                        int i110 = -1;
                                                        while (i107 < i104) {
                                                            n0Var2.u(1);
                                                            int i111 = n0Var2.i(8);
                                                            int iG3 = i110;
                                                            int i112 = i109;
                                                            int i113 = i108;
                                                            int i114 = i106;
                                                            int i115 = 0;
                                                            while (i115 < i111) {
                                                                n0Var2.t(i77);
                                                                boolean zH8 = n0Var2.h();
                                                                n0Var2.s();
                                                                n0Var2.u(i81);
                                                                n0Var2.t(4);
                                                                i114 = n0Var2.i(4) + 8;
                                                                n0Var2.u(1);
                                                                if (zH8) {
                                                                    int i116 = n0Var2.i(8);
                                                                    int i117 = n0Var2.i(8);
                                                                    n0Var2.u(1);
                                                                    boolean zH9 = n0Var2.h();
                                                                    int iF5 = androidx.media3.common.i.f(i116);
                                                                    int i118 = zH9 ? 1 : 2;
                                                                    iG3 = androidx.media3.common.i.g(i117);
                                                                    i113 = i118;
                                                                    i112 = iF5;
                                                                }
                                                                i115++;
                                                                i105 = i114;
                                                                i77 = 6;
                                                                i81 = 11;
                                                            }
                                                            i107++;
                                                            i106 = i114;
                                                            i108 = i113;
                                                            i109 = i112;
                                                            i110 = iG3;
                                                            i77 = 6;
                                                            i81 = 11;
                                                        }
                                                        i41 = i105;
                                                        str7 = "video/apv";
                                                        i42 = i106;
                                                        str8 = string;
                                                        i44 = i108;
                                                        i45 = i109;
                                                        iG2 = i110;
                                                    } else {
                                                        i16 = 8;
                                                        if (iM5 == 1668246642 && i45 == -1 && iG2 == -1) {
                                                            int iM9 = uVar2.m();
                                                            if (iM9 == 1852009592 || iM9 == 1852009571) {
                                                                int iH3 = uVar2.H();
                                                                int iH4 = uVar2.H();
                                                                uVar2.O(2);
                                                                boolean z15 = iM4 == 19 && (uVar2.A() & Cast.MAX_NAMESPACE_LENGTH) != 0;
                                                                int iF6 = androidx.media3.common.i.f(iH3);
                                                                i44 = z15 ? 1 : 2;
                                                                iG2 = androidx.media3.common.i.g(iH4);
                                                                i45 = iF6;
                                                                i41 = i41;
                                                                i42 = i42;
                                                            } else {
                                                                e7.a.m("BoxParsers", "Unsupported color type: " + f7.e.b(iM9));
                                                                i41 = i41;
                                                                i42 = i42;
                                                                i44 = i101;
                                                            }
                                                        } else {
                                                            i41 = i41;
                                                            i42 = i42;
                                                            i44 = i101;
                                                        }
                                                    }
                                                    i41 = i41;
                                                    i42 = i42;
                                                    i44 = i101;
                                                }
                                                i16 = 8;
                                            }
                                            i16 = 8;
                                        }
                                    }
                                }
                                i15 = i15;
                                i41 = i41;
                            }
                            i50 = i52 + iM4;
                            i43 = i15;
                            i38 = i16;
                            iM2 = i53;
                            iM3 = i14;
                            str6 = str6;
                            str7 = str7;
                            qVar2 = qVar2;
                            q1Var = q1Var;
                            b7 = 3;
                        }
                        i50 = i52 + iM4;
                        i43 = i15;
                        i38 = i16;
                        iM2 = i53;
                        iM3 = i14;
                        str6 = str6;
                        str7 = str7;
                        qVar2 = qVar2;
                        q1Var = q1Var;
                        b7 = 3;
                    }
                    i50 = i52 + iM4;
                    i43 = i15;
                    i38 = i16;
                    iM2 = i53;
                    iM3 = i14;
                    str6 = str6;
                    str7 = str7;
                    qVar2 = qVar2;
                    q1Var = q1Var;
                    b7 = 3;
                }
                int i119 = i41;
                int i120 = i42;
                i13 = iM2;
                int i121 = i43;
                String str15 = str7;
                q1 q1Var2 = q1Var;
                int i122 = i44;
                c10 = '\f';
                if (str15 == null) {
                    str5 = str;
                    q1Var = q1Var2;
                } else {
                    androidx.media3.common.s sVar = new androidx.media3.common.s();
                    sVar.f1491a = Integer.toString(i11);
                    sVar.m = x0.n(str15);
                    sVar.f1500j = str8;
                    sVar.f1508t = iH;
                    sVar.f1509u = iH2;
                    sVar.f1510v = i49;
                    sVar.f1511w = i48;
                    sVar.f1514z = fE;
                    sVar.f1513y = i39;
                    sVar.A = bArr;
                    sVar.B = i121;
                    sVar.f1504p = listG;
                    sVar.f1503o = i47;
                    sVar.D = i46;
                    sVar.f1505q = oVar3;
                    str5 = str;
                    sVar.f1494d = str5;
                    sVar.C = new androidx.media3.common.i(i45, i122, iG2, i120, i119, byteBufferOrder != null ? byteBufferOrder.array() : null);
                    l50.d dVar2 = dVar;
                    if (dVar2 != null) {
                        sVar.f1498h = bi.b.P(dVar2.a);
                        sVar.f1499i = bi.b.P(dVar2.b);
                    } else {
                        w0 w0Var2 = w0Var;
                        if (w0Var2 != null) {
                            sVar.f1498h = bi.b.P(w0Var2.A);
                            sVar.f1499i = bi.b.P(w0Var2.B);
                        }
                    }
                    q1Var = q1Var2;
                    q1Var.f4033e = new androidx.media3.common.t(sVar);
                }
            } else {
                if (iM3 == 1836069985 || iM3 == 1701733217 || iM3 == 1633889587 || iM3 == 1700998451 || iM3 == 1633889588 || iM3 == 1835823201 || iM3 == 1685353315 || iM3 == 1685353317 || iM3 == 1685353320 || iM3 == 1685353324 || iM3 == 1685353336 || iM3 == 1935764850 || iM3 == 1935767394 || iM3 == 1819304813 || iM3 == 1936684916 || iM3 == 1953984371 || iM3 == 778924082 || iM3 == 778924083 || iM3 == 1835557169 || iM3 == 1835560241 || iM3 == 1634492771 || iM3 == 1634492791 || iM3 == 1970037111 || iM3 == 1332770163 || iM3 == 1716281667 || iM3 == 1767992678 || iM3 == 1768973165 || iM3 == 1718641517) {
                    uVar2 = uVar;
                    i37 = i37;
                    iM2 = iM2;
                    b(uVar2, iM3, i37, iM2, o1Var2.f2372a, str5, z10, oVar, q1Var, i36);
                    str5 = str;
                } else if (iM3 == 1414810956 || iM3 == 1954034535 || iM3 == 2004251764 || iM3 == 1937010800 || iM3 == 1664495672 || iM3 == 1836070003) {
                    uVar2.N(i37 + 16);
                    String str16 = "application/ttml+xml";
                    long j10 = Long.MAX_VALUE;
                    if (iM3 != 1414810956) {
                        if (iM3 == 1954034535) {
                            int i123 = iM2 - 16;
                            byte[] bArr10 = new byte[i123];
                            uVar2.k(0, i123, bArr10);
                            d2VarS = t0.s(bArr10);
                            str16 = "application/x-quicktime-tx3g";
                            i33 = i37;
                            i34 = iM2;
                        } else {
                            if (iM3 == 2004251764) {
                                str16 = "application/x-mp4-vtt";
                            } else if (iM3 == 1937010800) {
                                j10 = 0;
                            } else if (iM3 == 1664495672) {
                                q1Var.f4031c = 1;
                                str16 = "application/x-mp4-cea-608";
                            } else {
                                if (iM3 != 1836070003) {
                                    throw new IllegalStateException();
                                }
                                int i124 = uVar2.f5183b;
                                uVar2.O(4);
                                if (uVar2.m() == 1702061171) {
                                    byte[] bArr11 = (byte[]) c(i124, uVar2).D;
                                    if (bArr11 == null || bArr11.length != 64) {
                                        i33 = i37;
                                        i34 = iM2;
                                    } else {
                                        int i125 = o1Var2.f2375d;
                                        int i126 = o1Var2.f2376e;
                                        c0.A(bArr11.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i127 = 0;
                                        while (i127 < bArr11.length - 3) {
                                            byte[] bArr12 = bArr11;
                                            int iB = bi.b.B(bArr11[i127], bArr11[i127 + 1], bArr11[i127 + 2], bArr12[i127 + 3]);
                                            int i128 = (iB >> 16) & 255;
                                            int i129 = ((iB >> 8) & 255) - 128;
                                            int i130 = (iB & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(i0.h(a1.b.A(i130, 17790, 10000, i128), 0, 255) | (i0.h((i128 - ((i130 * 3455) / 10000)) - ((i129 * 7169) / 10000), 0, 255) << 8) | (i0.h(a1.b.A(i129, 14075, 10000, i128), 0, 255) << 16))));
                                            i127 += 4;
                                            bArr11 = bArr12;
                                            i37 = i37;
                                            iM2 = iM2;
                                        }
                                        i33 = i37;
                                        i34 = iM2;
                                        StringBuilder sbP2 = oi.k.p(i125, i126, "size: ", "x", "\npalette: ");
                                        sbP2.append(new eh.l(", ").b(arrayList));
                                        sbP2.append("\n");
                                        String string2 = sbP2.toString();
                                        String str17 = i0.f5136a;
                                        d2VarS = t0.s(string2.getBytes(StandardCharsets.UTF_8));
                                        str4 = "application/vobsub";
                                    }
                                } else {
                                    i33 = i37;
                                    i34 = iM2;
                                    str4 = null;
                                    d2VarS = null;
                                }
                                str16 = str4;
                            }
                            i33 = i37;
                            i34 = iM2;
                            j9 = j10;
                            d2VarS = null;
                            if (str16 != null) {
                                androidx.media3.common.s sVar2 = new androidx.media3.common.s();
                                sVar2.f1491a = Integer.toString(i35);
                                sVar2.m = x0.n(str16);
                                sVar2.f1494d = str5;
                                sVar2.f1506r = j9;
                                sVar2.f1504p = d2VarS;
                                q1Var.f4033e = new androidx.media3.common.t(sVar2);
                            }
                        }
                        j9 = Long.MAX_VALUE;
                        if (str16 != null) {
                            androidx.media3.common.s sVar3 = new androidx.media3.common.s();
                            sVar3.f1491a = Integer.toString(i35);
                            sVar3.m = x0.n(str16);
                            sVar3.f1494d = str5;
                            sVar3.f1506r = j9;
                            sVar3.f1504p = d2VarS;
                            q1Var.f4033e = new androidx.media3.common.t(sVar3);
                        }
                    } else {
                        i33 = i37;
                        i34 = iM2;
                        j9 = j10;
                        d2VarS = null;
                        if (str16 != null) {
                            androidx.media3.common.s sVar4 = new androidx.media3.common.s();
                            sVar4.f1491a = Integer.toString(i35);
                            sVar4.m = x0.n(str16);
                            sVar4.f1494d = str5;
                            sVar4.f1506r = j9;
                            sVar4.f1504p = d2VarS;
                            q1Var.f4033e = new androidx.media3.common.t(sVar4);
                        }
                    }
                    c10 = '\f';
                    uVar2 = uVar;
                    i11 = i35;
                    i12 = iM;
                    i37 = i33;
                    i13 = i34;
                    i10 = i36;
                } else if (iM3 == 1835365492) {
                    uVar2.N(i37 + 16);
                    if (iM3 == 1835365492) {
                        uVar2.v();
                        String strV = uVar2.v();
                        if (strV != null) {
                            androidx.media3.common.s sVar5 = new androidx.media3.common.s();
                            sVar5.f1491a = Integer.toString(i35);
                            sVar5.m = x0.n(strV);
                            q1Var.f4033e = new androidx.media3.common.t(sVar5);
                        }
                    }
                } else if (iM3 == 1667329389) {
                    androidx.media3.common.s sVar6 = new androidx.media3.common.s();
                    sVar6.f1491a = Integer.toString(i35);
                    sVar6.m = x0.n("application/x-camera-motion");
                    q1Var.f4033e = new androidx.media3.common.t(sVar6);
                }
                i37 = i37;
                i13 = iM2;
                i10 = i36;
                i11 = i35;
                i12 = iM;
                c10 = '\f';
            }
            uVar2.N(i37 + i13);
            i36 = i10 + 1;
            o1Var2 = o1Var;
            i35 = i11;
            iM = i12;
        }
        return q1Var;
    }

    public static ArrayList j(f7.c cVar, y yVar, long j9, androidx.media3.common.o oVar, boolean z10, boolean z11, eh.k kVar, boolean z12) {
        int i10;
        int i11;
        long j10;
        long jQ;
        long jC;
        ArrayList arrayList;
        int i12;
        o1 o1Var;
        long j11;
        long j12;
        long j13;
        long jQ2;
        u uVar;
        int iE;
        int i13;
        long jC2;
        int i14;
        int i15;
        int i16;
        long j14;
        char[] cArr;
        int i17;
        String str;
        f7.d dVarR;
        q1 q1VarI;
        long[] jArr;
        long[] jArr2;
        androidx.media3.common.t tVar;
        int i18;
        androidx.media3.common.t tVar2;
        q qVar;
        f7.b bVar;
        v0 v0Var;
        v0 v0Var2;
        f7.c cVarQ;
        Pair pairCreate;
        char c10;
        long jG;
        long j15;
        b nVar;
        boolean z13;
        int iE2;
        int iE3;
        int iE4;
        int i19;
        u uVar2;
        boolean z14;
        ArrayList arrayList2;
        boolean z15;
        long[] jArr3;
        b bVar2;
        int[] iArr;
        long[] jArr4;
        int[] iArrCopyOf;
        int i20;
        int i21;
        int i22;
        long j16;
        long j17;
        long j18;
        int i23;
        int iM;
        int i24;
        int iE5;
        int iM2;
        int iE6;
        int iE7;
        u uVar3;
        int i25;
        int i26;
        long[] jArr5;
        long[] jArrCopyOf;
        int i27;
        int[] iArr2;
        boolean z16;
        String str2;
        int i28;
        int[] iArr3;
        int i29;
        long j19;
        long j20;
        boolean zA;
        int i30;
        int iU;
        int[] iArr4;
        int i31;
        long[] jArr6;
        int i32;
        int i33;
        long[] jArr7;
        int[] iArr5;
        long[] jArr8;
        long j21;
        int i34;
        long j22;
        androidx.media3.common.t tVar3;
        long[] jArr9;
        long[] jArr10;
        long jQ3;
        int[] iArrU;
        long[] jArr11;
        ArrayList arrayList3;
        long j23;
        int[] iArr6;
        int i35;
        boolean z17;
        int[] iArr7;
        int[] iArr8;
        ArrayList arrayList4;
        int i36;
        int i37;
        int i38;
        boolean z18;
        int[] iArr9;
        long[] jArr12;
        boolean z19;
        boolean z20;
        long[] jArr13;
        int[] iArr10;
        int[] iArr11;
        ArrayList arrayList5;
        long[] jArr14;
        int i39;
        boolean z21;
        int i40;
        long j24;
        androidx.media3.common.t tVar4;
        t tVar5;
        long j25;
        int i41;
        boolean z22;
        int i42;
        int i43;
        int i44;
        long jQ4;
        int[] iArr12;
        int i45;
        long j26;
        int[] iArr13;
        long jQ5;
        int iB;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        boolean z23;
        int i51;
        t tVar6;
        long j27;
        int i52;
        long jQ6;
        long jQ7;
        int i53;
        long[] jArr15;
        int[] iArr14;
        long j28;
        int i54;
        int i55;
        int iF;
        int[] iArr15;
        int i56;
        int i57;
        int i58;
        int i59;
        int i60;
        long j29;
        int iMax;
        int i61;
        int i62;
        f7.c cVar2 = cVar;
        ArrayList arrayList6 = new ArrayList();
        int i63 = 0;
        for (ArrayList arrayList7 = cVar2.E; i63 < arrayList7.size(); arrayList7 = arrayList) {
            f7.c cVar3 = (f7.c) arrayList7.get(i63);
            if (cVar3.B != 1953653099) {
                arrayList = arrayList7;
                arrayList6 = arrayList6;
                i11 = i63;
            } else {
                f7.d dVarR2 = cVar2.r(1836476516);
                dVarR2.getClass();
                f7.c cVarQ2 = cVar3.q(1835297121);
                cVarQ2.getClass();
                f7.d dVarR3 = cVarQ2.r(1751411826);
                dVarR3.getClass();
                u uVar4 = dVarR3.C;
                uVar4.N(16);
                int iM3 = uVar4.m();
                if (iM3 == 1936684398) {
                    i10 = 1;
                } else if (iM3 == 1986618469) {
                    i10 = 2;
                } else if (iM3 == 1952807028 || iM3 == 1935832172 || iM3 == 1937072756 || iM3 == 1668047728 || iM3 == 1937072752) {
                    i10 = 3;
                } else {
                    i10 = iM3 == 1835365473 ? 5 : -1;
                }
                int i64 = 1;
                i11 = i63;
                if (i10 == -1) {
                    arrayList = arrayList7;
                    qVar = null;
                    j10 = 0;
                } else {
                    j10 = 0;
                    f7.d dVarR4 = cVar3.r(1953196132);
                    dVarR4.getClass();
                    u uVar5 = dVarR4.C;
                    uVar5.N(8);
                    int iE8 = e(uVar5.m());
                    uVar5.O(iE8 != 0 ? 16 : 8);
                    int iM4 = uVar5.m();
                    uVar5.O(4);
                    int i65 = uVar5.f5183b;
                    int i66 = iE8 == 0 ? 4 : 8;
                    int i67 = 0;
                    while (true) {
                        jQ = -9223372036854775807L;
                        if (i67 >= i66) {
                            uVar5.O(i66);
                        } else {
                            if (uVar5.f5182a[i65 + i67] != -1) {
                                jC = iE8 == 0 ? uVar5.C() : uVar5.G();
                                if (jC != 0) {
                                    break;
                                }
                                break;
                            }
                            i67++;
                        }
                        jC = -9223372036854775807L;
                        break;
                    }
                    uVar5.O(10);
                    int iH = uVar5.H();
                    uVar5.O(4);
                    int iM5 = uVar5.m();
                    int iM6 = uVar5.m();
                    uVar5.O(4);
                    int iM7 = uVar5.m();
                    int iM8 = uVar5.m();
                    if (iM5 == 0 && iM6 == 65536) {
                        arrayList = arrayList7;
                        if ((iM7 == -65536 || iM7 == 65536) && iM8 == 0) {
                            i12 = 90;
                        }
                        uVar5.O(16);
                        short sX = uVar5.x();
                        uVar5.O(2);
                        short sX2 = uVar5.x();
                        o1Var = new o1();
                        o1Var.f2372a = iM4;
                        o1Var.f2373b = iH;
                        o1Var.f2374c = i12;
                        o1Var.f2375d = sX;
                        o1Var.f2376e = sX2;
                        if (j9 == -9223372036854775807L) {
                            j11 = jC;
                        } else {
                            j11 = j9;
                        }
                        j12 = g(dVarR2.C).f5498c;
                        if (j11 == -9223372036854775807L) {
                            j13 = j12;
                            jQ2 = -9223372036854775807L;
                        } else {
                            String str3 = i0.f5136a;
                            j13 = j12;
                            jQ2 = i0.Q(j11, 1000000L, j13, RoundingMode.DOWN);
                        }
                        f7.c cVarQ3 = cVarQ2.q(1835626086);
                        cVarQ3.getClass();
                        f7.c cVarQ4 = cVarQ3.q(1937007212);
                        cVarQ4.getClass();
                        f7.d dVarR5 = cVarQ2.r(1835296868);
                        dVarR5.getClass();
                        uVar = dVarR5.C;
                        uVar.N(8);
                        iE = e(uVar.m());
                        if (iE == 0) {
                            i13 = 8;
                        } else {
                            i13 = 16;
                        }
                        uVar.O(i13);
                        jC2 = uVar.C();
                        i14 = uVar.f5183b;
                        if (iE == 0) {
                            i15 = 4;
                        } else {
                            i15 = 8;
                        }
                        i16 = 0;
                        while (true) {
                            if (i16 < i15) {
                                uVar.O(i15);
                                break;
                            }
                            if (uVar.f5182a[i14 + i16] != -1) {
                                if (iE == 0) {
                                    jG = uVar.C();
                                } else {
                                    jG = uVar.G();
                                }
                                j15 = jG;
                                if (j15 != 0) {
                                    break;
                                }
                                String str4 = i0.f5136a;
                                jQ = i0.Q(j15, 1000000L, jC2, RoundingMode.DOWN);
                                break;
                            }
                            i16++;
                        }
                        j14 = jQ;
                        int iH2 = uVar.H();
                        cArr = new char[]{(char) (((iH2 >> 10) & 31) + 96), (char) (((iH2 >> 5) & 31) + 96), (char) ((iH2 & 31) + 96)};
                        i17 = 0;
                        while (true) {
                            if (i17 < 3) {
                                str = new String(cArr);
                                break;
                            }
                            c10 = cArr[i17];
                            if (c10 >= 'a' || c10 > 'z') {
                                str = null;
                                break;
                            }
                            i17++;
                        }
                        dVarR = cVarQ4.r(1937011556);
                        if (dVarR == null) {
                            e7.a.m("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        } else {
                            q1VarI = i(dVarR.C, o1Var, str, oVar, z11);
                            if (!z10 || (cVarQ = cVar3.q(1701082227)) == null) {
                                jArr = null;
                                jArr2 = null;
                            } else {
                                f7.d dVarR6 = cVarQ.r(1701606260);
                                if (dVarR6 == null) {
                                    pairCreate = null;
                                } else {
                                    u uVar6 = dVarR6.C;
                                    uVar6.N(8);
                                    int iE9 = e(uVar6.m());
                                    int iE10 = uVar6.E();
                                    long[] jArr16 = new long[iE10];
                                    long[] jArr17 = new long[iE10];
                                    int i68 = 0;
                                    while (i68 < iE10) {
                                        int i69 = i64;
                                        jArr16[i68] = iE9 == i69 ? uVar6.G() : uVar6.C();
                                        jArr17[i68] = iE9 == i69 ? uVar6.u() : uVar6.m();
                                        if (uVar6.x() != 1) {
                                            throw new IllegalArgumentException("Unsupported media rate.");
                                        }
                                        uVar6.O(2);
                                        i68++;
                                        i64 = 1;
                                    }
                                    pairCreate = Pair.create(jArr16, jArr17);
                                }
                                if (pairCreate != null) {
                                    long[] jArr18 = (long[]) pairCreate.first;
                                    jArr2 = (long[]) pairCreate.second;
                                    jArr = jArr18;
                                } else {
                                    jArr = null;
                                    jArr2 = null;
                                }
                            }
                            tVar = (androidx.media3.common.t) q1VarI.f4033e;
                            if (tVar == null) {
                                i18 = o1Var.f2373b;
                                if (i18 != 0) {
                                    bVar = new f7.b(i18);
                                    androidx.media3.common.s sVarA = tVar.a();
                                    v0Var = ((androidx.media3.common.t) q1VarI.f4033e).l;
                                    if (v0Var != null) {
                                        v0Var2 = v0Var.a(bVar);
                                    } else {
                                        v0Var2 = new v0(bVar);
                                    }
                                    sVarA.f1501k = v0Var2;
                                    tVar2 = new androidx.media3.common.t(sVarA);
                                } else {
                                    tVar2 = tVar;
                                }
                                qVar = new q(o1Var.f2372a, i10, jC2, j13, jQ2, j14, tVar2, q1VarI.f4031c, (r[]) q1VarI.f4032d, q1VarI.f4030b, jArr, jArr2);
                            }
                        }
                        qVar = null;
                    } else {
                        arrayList = arrayList7;
                    }
                    i12 = (iM5 == 0 && iM6 == -65536 && (iM7 == 65536 || iM7 == -65536) && iM8 == 0) ? 270 : ((iM5 == -65536 || iM5 == 65536) && iM6 == 0 && iM7 == 0 && iM8 == -65536) ? 180 : 0;
                    uVar5.O(16);
                    short sX3 = uVar5.x();
                    uVar5.O(2);
                    short sX4 = uVar5.x();
                    o1Var = new o1();
                    o1Var.f2372a = iM4;
                    o1Var.f2373b = iH;
                    o1Var.f2374c = i12;
                    o1Var.f2375d = sX3;
                    o1Var.f2376e = sX4;
                    if (j9 == -9223372036854775807L) {
                        j11 = jC;
                    } else {
                        j11 = j9;
                    }
                    j12 = g(dVarR2.C).f5498c;
                    if (j11 == -9223372036854775807L) {
                        j13 = j12;
                        jQ2 = -9223372036854775807L;
                    } else {
                        String str5 = i0.f5136a;
                        j13 = j12;
                        jQ2 = i0.Q(j11, 1000000L, j13, RoundingMode.DOWN);
                    }
                    f7.c cVarQ5 = cVarQ2.q(1835626086);
                    cVarQ5.getClass();
                    f7.c cVarQ6 = cVarQ5.q(1937007212);
                    cVarQ6.getClass();
                    f7.d dVarR7 = cVarQ2.r(1835296868);
                    dVarR7.getClass();
                    uVar = dVarR7.C;
                    uVar.N(8);
                    iE = e(uVar.m());
                    if (iE == 0) {
                        i13 = 8;
                    } else {
                        i13 = 16;
                    }
                    uVar.O(i13);
                    jC2 = uVar.C();
                    i14 = uVar.f5183b;
                    if (iE == 0) {
                        i15 = 4;
                    } else {
                        i15 = 8;
                    }
                    i16 = 0;
                    while (true) {
                        if (i16 < i15) {
                            uVar.O(i15);
                            break;
                        }
                        if (uVar.f5182a[i14 + i16] != -1) {
                            if (iE == 0) {
                                jG = uVar.C();
                            } else {
                                jG = uVar.G();
                            }
                            j15 = jG;
                            if (j15 != 0) {
                                break;
                            }
                            String str6 = i0.f5136a;
                            jQ = i0.Q(j15, 1000000L, jC2, RoundingMode.DOWN);
                            break;
                        }
                        i16++;
                    }
                    j14 = jQ;
                    int iH3 = uVar.H();
                    cArr = new char[]{(char) (((iH3 >> 10) & 31) + 96), (char) (((iH3 >> 5) & 31) + 96), (char) ((iH3 & 31) + 96)};
                    i17 = 0;
                    while (true) {
                        if (i17 < 3) {
                            c10 = cArr[i17];
                            if (c10 >= 'a') {
                            }
                            str = null;
                            break;
                        }
                        str = new String(cArr);
                        break;
                        i17++;
                    }
                    dVarR = cVarQ6.r(1937011556);
                    if (dVarR == null) {
                        e7.a.m("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                    } else {
                        q1VarI = i(dVarR.C, o1Var, str, oVar, z11);
                        if (z10) {
                            jArr = null;
                            jArr2 = null;
                        } else {
                            jArr = null;
                            jArr2 = null;
                        }
                        tVar = (androidx.media3.common.t) q1VarI.f4033e;
                        if (tVar == null) {
                            i18 = o1Var.f2373b;
                            if (i18 != 0) {
                                bVar = new f7.b(i18);
                                androidx.media3.common.s sVarA2 = tVar.a();
                                v0Var = ((androidx.media3.common.t) q1VarI.f4033e).l;
                                if (v0Var != null) {
                                    v0Var2 = v0Var.a(bVar);
                                } else {
                                    v0Var2 = new v0(bVar);
                                }
                                sVarA2.f1501k = v0Var2;
                                tVar2 = new androidx.media3.common.t(sVarA2);
                            } else {
                                tVar2 = tVar;
                            }
                            qVar = new q(o1Var.f2372a, i10, jC2, j13, jQ2, j14, tVar2, q1VarI.f4031c, (r[]) q1VarI.f4032d, q1VarI.f4030b, jArr, jArr2);
                        }
                    }
                    qVar = null;
                }
                q qVarA = (q) kVar.apply(qVar);
                if (qVarA == null) {
                    arrayList6 = arrayList6;
                } else {
                    androidx.media3.common.t tVar7 = qVarA.f15099g;
                    f7.c cVarQ7 = cVar3.q(1835297121);
                    cVarQ7.getClass();
                    f7.c cVarQ8 = cVarQ7.q(1835626086);
                    cVarQ8.getClass();
                    f7.c cVarQ9 = cVarQ8.q(1937007212);
                    cVarQ9.getClass();
                    f7.d dVarR8 = cVarQ9.r(1937011578);
                    if (dVarR8 != null) {
                        nVar = new bg.b(dVarR8, tVar7);
                    } else {
                        f7.d dVarR9 = cVarQ9.r(1937013298);
                        if (dVarR9 == null) {
                            throw ParserException.a(null, "Track has no sample table size information");
                        }
                        nVar = new com.google.android.material.datepicker.n(dVarR9);
                    }
                    int iS = nVar.s();
                    if (iS == 0) {
                        tVar5 = new t(qVarA, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (qVarA.f15094b == 2) {
                            long j30 = qVarA.f15098f;
                            if (j30 > j10) {
                                androidx.media3.common.s sVarA3 = tVar7.a();
                                sVarA3.f1512x = iS / (j30 / 1000000.0f);
                                qVarA = qVarA.a(new androidx.media3.common.t(sVarA3));
                            }
                        }
                        androidx.media3.common.t tVar8 = qVarA.f15099g;
                        f7.d dVarR10 = cVarQ9.r(1937007471);
                        if (dVarR10 == null) {
                            dVarR10 = cVarQ9.r(1668232756);
                            dVarR10.getClass();
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        u uVar7 = dVarR10.C;
                        f7.d dVarR11 = cVarQ9.r(1937011555);
                        dVarR11.getClass();
                        u uVar8 = dVarR11.C;
                        f7.d dVarR12 = cVarQ9.r(1937011827);
                        dVarR12.getClass();
                        u uVar9 = dVarR12.C;
                        f7.d dVarR13 = cVarQ9.r(1937011571);
                        u uVar10 = dVarR13 != null ? dVarR13.C : null;
                        f7.d dVarR14 = cVarQ9.r(1668576371);
                        u uVar11 = dVarR14 != null ? dVarR14.C : null;
                        a aVar = new a(uVar8, uVar7, z13);
                        uVar9.N(12);
                        int iE11 = uVar9.E() - 1;
                        int iE12 = uVar9.E();
                        int iE13 = uVar9.E();
                        if (uVar11 != null) {
                            uVar11.N(12);
                            iE2 = uVar11.E();
                        } else {
                            iE2 = 0;
                        }
                        if (uVar10 != null) {
                            uVar10.N(12);
                            iE3 = uVar10.E();
                            if (iE3 > 0) {
                                iE4 = uVar10.E() - 1;
                            } else {
                                uVar10 = null;
                            }
                            i19 = nVar.i();
                            uVar2 = uVar11;
                            String str7 = tVar8.f1594n;
                            if (i19 == -1 && (("audio/raw".equals(str7) || "audio/g711-mlaw".equals(str7) || "audio/g711-alaw".equals(str7)) && iE11 == 0 && iE2 == 0 && iE3 == 0)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            arrayList2 = new ArrayList();
                            if (uVar10 == null) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z14) {
                                i53 = aVar.f15000a;
                                jArr15 = new long[i53];
                                iArr14 = new int[i53];
                                while (aVar.a()) {
                                    int i70 = aVar.f15001b;
                                    jArr15[i70] = aVar.f15003d;
                                    iArr14[i70] = aVar.f15002c;
                                }
                                j28 = iE13;
                                i54 = 8192 / i19;
                                iF = 0;
                                for (i55 = 0; i55 < i53; i55++) {
                                    iF += i0.f(iArr14[i55], i54);
                                }
                                jArr5 = new long[iF];
                                iArr2 = new int[iF];
                                jArrCopyOf = new long[iF];
                                iArr15 = new int[iF];
                                i56 = 0;
                                i57 = 0;
                                i58 = 0;
                                i59 = 0;
                                i60 = 0;
                                while (i56 < i53) {
                                    int i71 = iArr14[i56];
                                    j29 = jArr15[i56];
                                    int i72 = i60;
                                    int i73 = i56;
                                    iMax = i59;
                                    i61 = i72;
                                    int i74 = i53;
                                    i62 = i71;
                                    while (i62 > 0) {
                                        int iMin = Math.min(i54, i62);
                                        jArr5[i61] = j29;
                                        int i75 = i62;
                                        int i76 = i19 * iMin;
                                        iArr2[i61] = i76;
                                        iMax = Math.max(iMax, i76);
                                        long j31 = j28;
                                        jArrCopyOf[i61] = j31 * ((long) i57);
                                        iArr15[i61] = 1;
                                        j29 += (long) iArr2[i61];
                                        i57 += iMin;
                                        i61++;
                                        i58 += i76;
                                        i62 = i75 - iMin;
                                        j28 = j31;
                                    }
                                    int i77 = i73 + 1;
                                    i60 = i61;
                                    i59 = iMax;
                                    i56 = i77;
                                    i53 = i74;
                                }
                                j19 = ((long) i57) * j28;
                                j20 = i58;
                                if (z12) {
                                    jArr5 = new long[0];
                                }
                                if (z12) {
                                    iArr2 = new int[0];
                                }
                                if (z12) {
                                    jArrCopyOf = new long[0];
                                }
                                if (z12) {
                                    iArr15 = new int[0];
                                }
                                i28 = iF;
                                iArr3 = iArr15;
                                i29 = i59;
                            } else {
                                if (z12) {
                                    jArr3 = new long[0];
                                } else {
                                    jArr3 = new long[iS];
                                }
                                bVar2 = nVar;
                                if (z12) {
                                    iArr = new int[0];
                                } else {
                                    iArr = new int[iS];
                                }
                                int i78 = iE3;
                                if (z12) {
                                    jArr4 = new long[0];
                                } else {
                                    jArr4 = new long[iS];
                                }
                                if (z12) {
                                    iArrCopyOf = new int[0];
                                } else {
                                    iArrCopyOf = new int[iS];
                                }
                                i20 = iE2;
                                i21 = i78;
                                i22 = iE11;
                                j16 = j10;
                                j17 = j16;
                                j18 = j17;
                                i23 = 0;
                                iM = 0;
                                i24 = 0;
                                iE5 = 0;
                                iM2 = iE13;
                                iE6 = iE12;
                                iE7 = iE4;
                                uVar3 = uVar10;
                                i25 = 0;
                                while (true) {
                                    if (i25 < iS) {
                                        i26 = i21;
                                        jArr5 = jArr3;
                                        jArrCopyOf = jArr4;
                                        i27 = i24;
                                        iArr2 = iArr;
                                        break;
                                    }
                                    zA = true;
                                    while (i24 == 0) {
                                        zA = aVar.a();
                                        if (zA) {
                                            break;
                                        }
                                        j18 = aVar.f15003d;
                                        i24 = aVar.f15002c;
                                        i21 = i21;
                                        iM = iM;
                                    }
                                    i30 = iM;
                                    i26 = i21;
                                    if (!zA) {
                                        e7.a.m("BoxParsers", "Unexpected end of chunk data");
                                        if (z12) {
                                            long[] jArrCopyOf2 = Arrays.copyOf(jArr3, i25);
                                            int[] iArrCopyOf2 = Arrays.copyOf(iArr, i25);
                                            jArr5 = jArrCopyOf2;
                                            jArrCopyOf = Arrays.copyOf(jArr4, i25);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i25);
                                            iS = i25;
                                            i27 = i24;
                                            iArr2 = iArrCopyOf2;
                                            iM = i30;
                                            break;
                                        }
                                        jArr5 = jArr3;
                                        jArrCopyOf = jArr4;
                                        iS = i25;
                                        i27 = i24;
                                        iM = i30;
                                        iArr2 = iArr;
                                        break;
                                    }
                                    iM = i30;
                                    if (uVar2 != null) {
                                        while (iE5 == 0 && i20 > 0) {
                                            iE5 = uVar2.E();
                                            iM = uVar2.m();
                                            i20--;
                                        }
                                        iE5--;
                                    }
                                    iU = bVar2.u();
                                    int i79 = iS;
                                    iArr4 = iArr;
                                    long j32 = iU;
                                    j17 += j32;
                                    if (iU > i23) {
                                        i23 = iU;
                                    }
                                    if (z12) {
                                        i31 = i23;
                                        jArr6 = jArr3;
                                    } else {
                                        jArr3[i25] = j18;
                                        iArr4[i25] = iU;
                                        i31 = i23;
                                        jArr6 = jArr3;
                                        jArr4[i25] = j16 + ((long) iM);
                                        if (uVar3 == null) {
                                            i33 = 1;
                                        } else {
                                            i33 = 0;
                                        }
                                        iArrCopyOf[i25] = i33;
                                        if (i25 == iE7) {
                                            iArrCopyOf[i25] = 1;
                                            arrayList2.add(Integer.valueOf(i25));
                                        }
                                    }
                                    if (uVar3 != null && i25 == iE7) {
                                        i32 = i26 - 1;
                                        if (i32 > 0) {
                                            i26 = i32;
                                            iE7 = uVar3.E() - 1;
                                        } else {
                                            i26 = i32;
                                        }
                                    }
                                    j16 += (long) iM2;
                                    iE6--;
                                    if (iE6 != 0 && i22 > 0) {
                                        i22--;
                                        iE6 = uVar9.E();
                                        iM2 = uVar9.m();
                                    }
                                    j18 += j32;
                                    i24--;
                                    i25++;
                                    jArr3 = jArr6;
                                    iS = i79;
                                    i21 = i26;
                                    i23 = i31;
                                    iArr = iArr4;
                                }
                                long j33 = j16 + ((long) iM);
                                if (uVar2 != null) {
                                    z16 = true;
                                    break;
                                }
                                while (true) {
                                    if (i20 > 0) {
                                        z16 = true;
                                        break;
                                    }
                                    if (uVar2.E() != 0) {
                                        z16 = false;
                                        break;
                                    }
                                    uVar2.m();
                                    i20--;
                                }
                                if (i26 == 0 || iE6 != 0 || i27 != 0 || i22 != 0 || iE5 != 0 || !z16) {
                                    StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                    w.c.u(sb2, qVarA.f15093a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                                    w.c.u(sb2, iE6, ", remainingSamplesInChunk ", i27, ", remainingTimestampDeltaChanges ");
                                    sb2.append(i22);
                                    sb2.append(", remainingSamplesAtTimestampOffset ");
                                    sb2.append(iE5);
                                    if (z16) {
                                        str2 = RuntimeVersion.SUFFIX;
                                    } else {
                                        str2 = ", ctts invalid";
                                    }
                                    sb2.append(str2);
                                    e7.a.m("BoxParsers", sb2.toString());
                                }
                                i28 = iS;
                                iArr3 = iArrCopyOf;
                                i29 = i23;
                                j19 = j33;
                                j20 = j17;
                            }
                            jArr7 = jArr5;
                            iArr5 = iArr2;
                            jArr8 = jArrCopyOf;
                            j21 = qVarA.f15098f;
                            if (j21 > j10) {
                                jQ7 = i0.Q(j20 * 8, 1000000L, j21, RoundingMode.HALF_DOWN);
                                if (jQ7 > j10 && jQ7 < 2147483647L) {
                                    androidx.media3.common.s sVarA4 = tVar8.a();
                                    sVarA4.f1498h = (int) jQ7;
                                    qVarA = qVarA.a(new androidx.media3.common.t(sVarA4));
                                }
                            }
                            i34 = qVarA.f15094b;
                            j22 = qVarA.f15095c;
                            tVar3 = qVarA.f15099g;
                            jArr9 = qVarA.f15102j;
                            jArr10 = qVarA.f15101i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jQ3 = i0.Q(j19, 1000000L, j22, roundingMode);
                            iArrU = bi.b.U(arrayList2);
                            if (jArr10 == null) {
                                if (!z12) {
                                    i0.P(jArr8, j22);
                                }
                                tVar6 = new t(qVarA, jArr7, iArr5, i29, jArr8, iArr3, iArrU, z15, jQ3, i28);
                            } else if (z12) {
                                jArr9.getClass();
                                if (jArr10.length == 1 || jArr10[0] != j10) {
                                    j27 = j10;
                                    for (i52 = 0; i52 < jArr10.length; i52++) {
                                        if (jArr9[i52] != -1) {
                                            j27 += jArr10[i52];
                                        }
                                    }
                                    jQ6 = i0.Q(j27, 1000000L, qVarA.f15096d, RoundingMode.DOWN);
                                } else {
                                    jQ6 = i0.Q(j19 - jArr9[0], 1000000L, qVarA.f15095c, roundingMode);
                                }
                                tVar6 = new t(qVarA, jArr7, iArr5, i29, jArr8, iArr3, iArrU, z15, jQ6, i28);
                            } else {
                                jArr11 = jArr9;
                                if (jArr10.length == 1 || i34 != 1 || jArr8.length < 2) {
                                    arrayList3 = arrayList2;
                                    j23 = -1;
                                } else {
                                    jArr11.getClass();
                                    long j34 = jArr11[0];
                                    j23 = -1;
                                    arrayList3 = arrayList2;
                                    long jQ8 = j34 + i0.Q(jArr10[0], qVarA.f15095c, qVarA.f15096d, roundingMode);
                                    int length = jArr8.length - 1;
                                    if (jArr8[0] <= j34 && j34 < jArr8[i0.h(4, 0, length)] && jArr8[i0.h(jArr8.length + (-4), 0, length)] < jQ8 && jQ8 <= 2 + j19) {
                                        long jMax = Math.max(j10, j19 - jQ8);
                                        long jQ9 = i0.Q(j34 - jArr8[0], tVar3.G, qVarA.f15095c, roundingMode);
                                        j19 = j19;
                                        long jQ10 = i0.Q(jMax, tVar3.G, qVarA.f15095c, roundingMode);
                                        if (!(jQ9 == j10 && jQ10 == j10) && jQ9 <= 2147483647L && jQ10 <= 2147483647L) {
                                            yVar.f324a = (int) jQ9;
                                            yVar.f325b = (int) jQ10;
                                            i0.P(jArr8, j22);
                                            tVar6 = new t(qVarA, jArr7, iArr5, i29, jArr8, iArr3, iArrU, z15, i0.Q(jArr10[0], 1000000L, qVarA.f15096d, roundingMode), i28);
                                        } else {
                                            if (jArr10.length == 1 || jArr10[0] != 0) {
                                                iArr6 = iArr3;
                                                i35 = i28;
                                                if (i34 == 1) {
                                                    z17 = true;
                                                } else {
                                                    z17 = false;
                                                }
                                                iArr7 = new int[jArr10.length];
                                                iArr8 = new int[jArr10.length];
                                                jArr11.getClass();
                                                arrayList4 = arrayList3;
                                                i36 = 0;
                                                i37 = 0;
                                                i38 = 0;
                                                z18 = false;
                                                while (i38 < jArr10.length) {
                                                    iArr12 = iArr8;
                                                    i45 = i38;
                                                    j26 = jArr11[i45];
                                                    if (j26 != j23) {
                                                        boolean z24 = z18;
                                                        jQ5 = i0.Q(jArr10[i45], qVarA.f15095c, qVarA.f15096d, RoundingMode.DOWN) + j26;
                                                        iArr13 = iArr12;
                                                        iArr7[i45] = i0.e(jArr8, j26, true);
                                                        iB = i0.b(jArr8, jQ5, z17) - 1;
                                                        i47 = 0;
                                                        for (i46 = r5; i46 < jArr8.length; i46++) {
                                                            if (jArr8[i46] < jQ5) {
                                                                i47++;
                                                                if (i47 > tVar3.f1596p) {
                                                                    break;
                                                                }
                                                            } else {
                                                                iB = i46;
                                                            }
                                                        }
                                                        iArr13[i45] = iB + 1;
                                                        i48 = iArr7[i45];
                                                        while (true) {
                                                            i49 = iArr7[i45];
                                                            if (i49 > 0 || (iArr6[i49] & 1) != 0) {
                                                                break;
                                                                break;
                                                            }
                                                            iArr7[i45] = i49 - 1;
                                                        }
                                                        if (i49 == 0 && (iArr6[0] & 1) == 0) {
                                                            iArr7[i45] = i48;
                                                            while (true) {
                                                                i51 = iArr7[i45];
                                                                if (i51 >= iArr13[i45] || (iArr6[i51] & 1) != 0) {
                                                                    break;
                                                                }
                                                                iArr7[i45] = i51 + 1;
                                                            }
                                                        }
                                                        int i80 = iArr13[i45];
                                                        i50 = iArr7[i45];
                                                        int i81 = (i80 - i50) + i36;
                                                        if (i37 != i50) {
                                                            z23 = true;
                                                        } else {
                                                            z23 = false;
                                                        }
                                                        z18 = z24 | z23;
                                                        i37 = i80;
                                                        i36 = i81;
                                                    } else {
                                                        iArr13 = iArr12;
                                                    }
                                                    i38 = i45 + 1;
                                                    jArr11 = jArr11;
                                                    iArr8 = iArr13;
                                                    z17 = z17;
                                                }
                                                iArr9 = iArr8;
                                                jArr12 = jArr11;
                                                boolean z25 = z18;
                                                if (i36 != i35) {
                                                    z19 = true;
                                                } else {
                                                    z19 = false;
                                                }
                                                z20 = z25 | z19;
                                                if (z20) {
                                                    jArr13 = new long[i36];
                                                } else {
                                                    jArr13 = jArr7;
                                                }
                                                if (z20) {
                                                    iArr10 = new int[i36];
                                                } else {
                                                    iArr10 = iArr5;
                                                }
                                                if (z20) {
                                                    i29 = 0;
                                                }
                                                if (z20) {
                                                    iArr11 = new int[i36];
                                                } else {
                                                    iArr11 = iArr6;
                                                }
                                                if (z20) {
                                                    arrayList5 = new ArrayList();
                                                } else {
                                                    arrayList5 = arrayList4;
                                                }
                                                jArr14 = new long[i36];
                                                i39 = 0;
                                                z21 = false;
                                                i40 = 0;
                                                j24 = 0;
                                                while (i39 < jArr10.length) {
                                                    j25 = jArr12[i39];
                                                    i41 = iArr7[i39];
                                                    z22 = z20;
                                                    i42 = iArr9[i39];
                                                    androidx.media3.common.t tVar9 = tVar3;
                                                    if (z22) {
                                                        int i82 = i42 - i41;
                                                        System.arraycopy(jArr7, i41, jArr13, i40, i82);
                                                        System.arraycopy(iArr5, i41, iArr10, i40, i82);
                                                        System.arraycopy(iArr6, i41, iArr11, i40, i82);
                                                    }
                                                    i43 = i29;
                                                    while (i41 < i42) {
                                                        i44 = i41;
                                                        int i83 = i42;
                                                        long j35 = qVarA.f15096d;
                                                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                        long jQ11 = i0.Q(j24, 1000000L, j35, roundingMode2);
                                                        jQ4 = i0.Q(jArr8[i44] - j25, 1000000L, qVarA.f15095c, roundingMode2);
                                                        if (jQ4 < 0) {
                                                            z21 = true;
                                                        }
                                                        jArr14[i40] = jQ11 + jQ4;
                                                        if (z22 && iArr10[i40] > i43) {
                                                            i43 = iArr5[i44];
                                                        }
                                                        if (!z22 && !z15 && (iArr11[i40] & 1) != 0) {
                                                            arrayList5.add(Integer.valueOf(i40));
                                                        }
                                                        i40++;
                                                        i41 = i44 + 1;
                                                        i42 = i83;
                                                    }
                                                    j24 += jArr10[i39];
                                                    i39++;
                                                    i29 = i43;
                                                    z20 = z22;
                                                    tVar3 = tVar9;
                                                }
                                                tVar4 = tVar3;
                                                long jQ12 = i0.Q(j24, 1000000L, qVarA.f15096d, RoundingMode.DOWN);
                                                if (z21) {
                                                    androidx.media3.common.s sVarA5 = tVar4.a();
                                                    sVarA5.f1507s = true;
                                                    qVarA = qVarA.a(new androidx.media3.common.t(sVarA5));
                                                }
                                                tVar5 = new t(qVarA, jArr13, iArr10, i29, jArr14, iArr11, bi.b.U(arrayList5), z15, jQ12, jArr13.length);
                                                arrayList6 = arrayList6;
                                            } else {
                                                jArr11.getClass();
                                                long j36 = jArr11[0];
                                                for (int i84 = 0; i84 < jArr8.length; i84++) {
                                                    jArr8[i84] = i0.Q(jArr8[i84] - j36, 1000000L, qVarA.f15095c, RoundingMode.DOWN);
                                                }
                                                tVar6 = new t(qVarA, jArr7, iArr5, i29, jArr8, iArr3, iArrU, z15, i0.Q(j19 - j36, 1000000L, qVarA.f15095c, RoundingMode.DOWN), i28);
                                            }
                                            arrayList6.add(tVar5);
                                        }
                                    }
                                }
                                if (jArr10.length == 1) {
                                }
                                iArr6 = iArr3;
                                i35 = i28;
                                if (i34 == 1) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                iArr7 = new int[jArr10.length];
                                iArr8 = new int[jArr10.length];
                                jArr11.getClass();
                                arrayList4 = arrayList3;
                                i36 = 0;
                                i37 = 0;
                                i38 = 0;
                                z18 = false;
                                while (i38 < jArr10.length) {
                                    iArr12 = iArr8;
                                    i45 = i38;
                                    j26 = jArr11[i45];
                                    if (j26 != j23) {
                                        boolean z26 = z18;
                                        jQ5 = i0.Q(jArr10[i45], qVarA.f15095c, qVarA.f15096d, RoundingMode.DOWN) + j26;
                                        iArr13 = iArr12;
                                        iArr7[i45] = i0.e(jArr8, j26, true);
                                        iB = i0.b(jArr8, jQ5, z17) - 1;
                                        i47 = 0;
                                        while (i46 < jArr8.length) {
                                            if (jArr8[i46] < jQ5) {
                                                i47++;
                                                if (i47 > tVar3.f1596p) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i46;
                                            }
                                        }
                                        iArr13[i45] = iB + 1;
                                        i48 = iArr7[i45];
                                        while (true) {
                                            i49 = iArr7[i45];
                                            if (i49 > 0) {
                                                break;
                                            }
                                            iArr7[i45] = i49 - 1;
                                        }
                                        if (i49 == 0) {
                                            iArr7[i45] = i48;
                                            while (true) {
                                                i51 = iArr7[i45];
                                                if (i51 >= iArr13[i45]) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i45] = i51 + 1;
                                            }
                                        }
                                        int i85 = iArr13[i45];
                                        i50 = iArr7[i45];
                                        int i86 = (i85 - i50) + i36;
                                        if (i37 != i50) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        z18 = z26 | z23;
                                        i37 = i85;
                                        i36 = i86;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i38 = i45 + 1;
                                    jArr11 = jArr11;
                                    iArr8 = iArr13;
                                    z17 = z17;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr11;
                                boolean z27 = z18;
                                if (i36 != i35) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z20 = z27 | z19;
                                if (z20) {
                                    jArr13 = new long[i36];
                                } else {
                                    jArr13 = jArr7;
                                }
                                if (z20) {
                                    iArr10 = new int[i36];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z20) {
                                    i29 = 0;
                                }
                                if (z20) {
                                    iArr11 = new int[i36];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z20) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i36];
                                i39 = 0;
                                z21 = false;
                                i40 = 0;
                                j24 = 0;
                                while (i39 < jArr10.length) {
                                    j25 = jArr12[i39];
                                    i41 = iArr7[i39];
                                    z22 = z20;
                                    i42 = iArr9[i39];
                                    androidx.media3.common.t tVar10 = tVar3;
                                    if (z22) {
                                        int i87 = i42 - i41;
                                        System.arraycopy(jArr7, i41, jArr13, i40, i87);
                                        System.arraycopy(iArr5, i41, iArr10, i40, i87);
                                        System.arraycopy(iArr6, i41, iArr11, i40, i87);
                                    }
                                    i43 = i29;
                                    while (i41 < i42) {
                                        i44 = i41;
                                        int i88 = i42;
                                        long j37 = qVarA.f15096d;
                                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                                        long jQ13 = i0.Q(j24, 1000000L, j37, roundingMode3);
                                        jQ4 = i0.Q(jArr8[i44] - j25, 1000000L, qVarA.f15095c, roundingMode3);
                                        if (jQ4 < 0) {
                                            z21 = true;
                                        }
                                        jArr14[i40] = jQ13 + jQ4;
                                        if (z22) {
                                            i43 = iArr5[i44];
                                        }
                                        if (!z22) {
                                        }
                                        i40++;
                                        i41 = i44 + 1;
                                        i42 = i88;
                                    }
                                    j24 += jArr10[i39];
                                    i39++;
                                    i29 = i43;
                                    z20 = z22;
                                    tVar3 = tVar10;
                                }
                                tVar4 = tVar3;
                                long jQ14 = i0.Q(j24, 1000000L, qVarA.f15096d, RoundingMode.DOWN);
                                if (z21) {
                                    androidx.media3.common.s sVarA6 = tVar4.a();
                                    sVarA6.f1507s = true;
                                    qVarA = qVarA.a(new androidx.media3.common.t(sVarA6));
                                }
                                tVar5 = new t(qVarA, jArr13, iArr10, i29, jArr14, iArr11, bi.b.U(arrayList5), z15, jQ14, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(tVar5);
                            }
                            tVar5 = tVar6;
                        } else {
                            iE3 = 0;
                        }
                        iE4 = -1;
                        i19 = nVar.i();
                        uVar2 = uVar11;
                        String str8 = tVar8.f1594n;
                        if (i19 == -1) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        arrayList2 = new ArrayList();
                        if (uVar10 == null) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (z14) {
                            i53 = aVar.f15000a;
                            jArr15 = new long[i53];
                            iArr14 = new int[i53];
                            while (aVar.a()) {
                                int i710 = aVar.f15001b;
                                jArr15[i710] = aVar.f15003d;
                                iArr14[i710] = aVar.f15002c;
                            }
                            j28 = iE13;
                            i54 = 8192 / i19;
                            iF = 0;
                            while (i55 < i53) {
                                iF += i0.f(iArr14[i55], i54);
                            }
                            jArr5 = new long[iF];
                            iArr2 = new int[iF];
                            jArrCopyOf = new long[iF];
                            iArr15 = new int[iF];
                            i56 = 0;
                            i57 = 0;
                            i58 = 0;
                            i59 = 0;
                            i60 = 0;
                            while (i56 < i53) {
                                int i711 = iArr14[i56];
                                j29 = jArr15[i56];
                                int i712 = i60;
                                int i713 = i56;
                                iMax = i59;
                                i61 = i712;
                                int i714 = i53;
                                i62 = i711;
                                while (i62 > 0) {
                                    int iMin2 = Math.min(i54, i62);
                                    jArr5[i61] = j29;
                                    int i715 = i62;
                                    int i716 = i19 * iMin2;
                                    iArr2[i61] = i716;
                                    iMax = Math.max(iMax, i716);
                                    long j38 = j28;
                                    jArrCopyOf[i61] = j38 * ((long) i57);
                                    iArr15[i61] = 1;
                                    j29 += (long) iArr2[i61];
                                    i57 += iMin2;
                                    i61++;
                                    i58 += i716;
                                    i62 = i715 - iMin2;
                                    j28 = j38;
                                }
                                int i717 = i713 + 1;
                                i60 = i61;
                                i59 = iMax;
                                i56 = i717;
                                i53 = i714;
                            }
                            j19 = ((long) i57) * j28;
                            j20 = i58;
                            if (z12) {
                                jArr5 = new long[0];
                            }
                            if (z12) {
                                iArr2 = new int[0];
                            }
                            if (z12) {
                                jArrCopyOf = new long[0];
                            }
                            if (z12) {
                                iArr15 = new int[0];
                            }
                            i28 = iF;
                            iArr3 = iArr15;
                            i29 = i59;
                        } else {
                            if (z12) {
                                jArr3 = new long[0];
                            } else {
                                jArr3 = new long[iS];
                            }
                            bVar2 = nVar;
                            if (z12) {
                                iArr = new int[0];
                            } else {
                                iArr = new int[iS];
                            }
                            int i718 = iE3;
                            if (z12) {
                                jArr4 = new long[0];
                            } else {
                                jArr4 = new long[iS];
                            }
                            if (z12) {
                                iArrCopyOf = new int[0];
                            } else {
                                iArrCopyOf = new int[iS];
                            }
                            i20 = iE2;
                            i21 = i718;
                            i22 = iE11;
                            j16 = j10;
                            j17 = j16;
                            j18 = j17;
                            i23 = 0;
                            iM = 0;
                            i24 = 0;
                            iE5 = 0;
                            iM2 = iE13;
                            iE6 = iE12;
                            iE7 = iE4;
                            uVar3 = uVar10;
                            i25 = 0;
                            while (true) {
                                if (i25 < iS) {
                                    i26 = i21;
                                    jArr5 = jArr3;
                                    jArrCopyOf = jArr4;
                                    i27 = i24;
                                    iArr2 = iArr;
                                    break;
                                }
                                zA = true;
                                while (i24 == 0) {
                                    zA = aVar.a();
                                    if (zA) {
                                        break;
                                        break;
                                    }
                                    j18 = aVar.f15003d;
                                    i24 = aVar.f15002c;
                                    i21 = i21;
                                    iM = iM;
                                }
                                i30 = iM;
                                i26 = i21;
                                if (!zA) {
                                    e7.a.m("BoxParsers", "Unexpected end of chunk data");
                                    if (z12) {
                                        jArr5 = jArr3;
                                        jArrCopyOf = jArr4;
                                        iS = i25;
                                        i27 = i24;
                                        iM = i30;
                                        iArr2 = iArr;
                                        break;
                                    }
                                    long[] jArrCopyOf3 = Arrays.copyOf(jArr3, i25);
                                    int[] iArrCopyOf3 = Arrays.copyOf(iArr, i25);
                                    jArr5 = jArrCopyOf3;
                                    jArrCopyOf = Arrays.copyOf(jArr4, i25);
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i25);
                                    iS = i25;
                                    i27 = i24;
                                    iArr2 = iArrCopyOf3;
                                    iM = i30;
                                    break;
                                }
                                iM = i30;
                                if (uVar2 != null) {
                                    while (iE5 == 0) {
                                        iE5 = uVar2.E();
                                        iM = uVar2.m();
                                        i20--;
                                    }
                                    iE5--;
                                }
                                iU = bVar2.u();
                                int i719 = iS;
                                iArr4 = iArr;
                                long j39 = iU;
                                j17 += j39;
                                if (iU > i23) {
                                    i23 = iU;
                                }
                                if (z12) {
                                    jArr3[i25] = j18;
                                    iArr4[i25] = iU;
                                    i31 = i23;
                                    jArr6 = jArr3;
                                    jArr4[i25] = j16 + ((long) iM);
                                    if (uVar3 == null) {
                                        i33 = 1;
                                    } else {
                                        i33 = 0;
                                    }
                                    iArrCopyOf[i25] = i33;
                                    if (i25 == iE7) {
                                        iArrCopyOf[i25] = 1;
                                        arrayList2.add(Integer.valueOf(i25));
                                    }
                                } else {
                                    i31 = i23;
                                    jArr6 = jArr3;
                                }
                                if (uVar3 != null) {
                                    i32 = i26 - 1;
                                    if (i32 > 0) {
                                        i26 = i32;
                                        iE7 = uVar3.E() - 1;
                                    } else {
                                        i26 = i32;
                                    }
                                }
                                j16 += (long) iM2;
                                iE6--;
                                if (iE6 != 0) {
                                }
                                j18 += j39;
                                i24--;
                                i25++;
                                jArr3 = jArr6;
                                iS = i719;
                                i21 = i26;
                                i23 = i31;
                                iArr = iArr4;
                            }
                            long j310 = j16 + ((long) iM);
                            if (uVar2 != null) {
                                z16 = true;
                                break;
                            }
                            while (true) {
                                if (i20 > 0) {
                                    z16 = true;
                                    break;
                                }
                                if (uVar2.E() != 0) {
                                    z16 = false;
                                    break;
                                }
                                uVar2.m();
                                i20--;
                            }
                            if (i26 == 0) {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                w.c.u(sb3, qVarA.f15093a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                                w.c.u(sb3, iE6, ", remainingSamplesInChunk ", i27, ", remainingTimestampDeltaChanges ");
                                sb3.append(i22);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(iE5);
                                if (z16) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = RuntimeVersion.SUFFIX;
                                }
                                sb3.append(str2);
                                e7.a.m("BoxParsers", sb3.toString());
                            } else {
                                StringBuilder sb4 = new StringBuilder("Inconsistent stbl box for track ");
                                w.c.u(sb4, qVarA.f15093a, ": remainingSynchronizationSamples ", i26, ", remainingSamplesAtTimestampDelta ");
                                w.c.u(sb4, iE6, ", remainingSamplesInChunk ", i27, ", remainingTimestampDeltaChanges ");
                                sb4.append(i22);
                                sb4.append(", remainingSamplesAtTimestampOffset ");
                                sb4.append(iE5);
                                if (z16) {
                                    str2 = ", ctts invalid";
                                } else {
                                    str2 = RuntimeVersion.SUFFIX;
                                }
                                sb4.append(str2);
                                e7.a.m("BoxParsers", sb4.toString());
                            }
                            i28 = iS;
                            iArr3 = iArrCopyOf;
                            i29 = i23;
                            j19 = j310;
                            j20 = j17;
                        }
                        jArr7 = jArr5;
                        iArr5 = iArr2;
                        jArr8 = jArrCopyOf;
                        j21 = qVarA.f15098f;
                        if (j21 > j10) {
                            jQ7 = i0.Q(j20 * 8, 1000000L, j21, RoundingMode.HALF_DOWN);
                            if (jQ7 > j10) {
                                androidx.media3.common.s sVarA7 = tVar8.a();
                                sVarA7.f1498h = (int) jQ7;
                                qVarA = qVarA.a(new androidx.media3.common.t(sVarA7));
                            }
                        }
                        i34 = qVarA.f15094b;
                        j22 = qVarA.f15095c;
                        tVar3 = qVarA.f15099g;
                        jArr9 = qVarA.f15102j;
                        jArr10 = qVarA.f15101i;
                        RoundingMode roundingMode4 = RoundingMode.DOWN;
                        jQ3 = i0.Q(j19, 1000000L, j22, roundingMode4);
                        iArrU = bi.b.U(arrayList2);
                        if (jArr10 == null) {
                            if (!z12) {
                                i0.P(jArr8, j22);
                            }
                            tVar6 = new t(qVarA, jArr7, iArr5, i29, jArr8, iArr3, iArrU, z15, jQ3, i28);
                        } else if (z12) {
                            jArr9.getClass();
                            if (jArr10.length == 1) {
                                j27 = j10;
                                while (i52 < jArr10.length) {
                                    if (jArr9[i52] != -1) {
                                        j27 += jArr10[i52];
                                    }
                                }
                                jQ6 = i0.Q(j27, 1000000L, qVarA.f15096d, RoundingMode.DOWN);
                            } else {
                                j27 = j10;
                                while (i52 < jArr10.length) {
                                    if (jArr9[i52] != -1) {
                                        j27 += jArr10[i52];
                                    }
                                }
                                jQ6 = i0.Q(j27, 1000000L, qVarA.f15096d, RoundingMode.DOWN);
                            }
                            tVar6 = new t(qVarA, jArr7, iArr5, i29, jArr8, iArr3, iArrU, z15, jQ6, i28);
                        } else {
                            jArr11 = jArr9;
                            if (jArr10.length == 1) {
                                arrayList3 = arrayList2;
                                j23 = -1;
                                if (jArr10.length == 1) {
                                }
                                iArr6 = iArr3;
                                i35 = i28;
                                if (i34 == 1) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                iArr7 = new int[jArr10.length];
                                iArr8 = new int[jArr10.length];
                                jArr11.getClass();
                                arrayList4 = arrayList3;
                                i36 = 0;
                                i37 = 0;
                                i38 = 0;
                                z18 = false;
                                while (i38 < jArr10.length) {
                                    iArr12 = iArr8;
                                    i45 = i38;
                                    j26 = jArr11[i45];
                                    if (j26 != j23) {
                                        boolean z28 = z18;
                                        jQ5 = i0.Q(jArr10[i45], qVarA.f15095c, qVarA.f15096d, RoundingMode.DOWN) + j26;
                                        iArr13 = iArr12;
                                        iArr7[i45] = i0.e(jArr8, j26, true);
                                        iB = i0.b(jArr8, jQ5, z17) - 1;
                                        i47 = 0;
                                        while (i46 < jArr8.length) {
                                            if (jArr8[i46] < jQ5) {
                                                i47++;
                                                if (i47 > tVar3.f1596p) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i46;
                                            }
                                        }
                                        iArr13[i45] = iB + 1;
                                        i48 = iArr7[i45];
                                        while (true) {
                                            i49 = iArr7[i45];
                                            if (i49 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr7[i45] = i49 - 1;
                                        }
                                        if (i49 == 0) {
                                            iArr7[i45] = i48;
                                            while (true) {
                                                i51 = iArr7[i45];
                                                if (i51 >= iArr13[i45]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i45] = i51 + 1;
                                            }
                                        }
                                        int i89 = iArr13[i45];
                                        i50 = iArr7[i45];
                                        int i810 = (i89 - i50) + i36;
                                        if (i37 != i50) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        z18 = z28 | z23;
                                        i37 = i89;
                                        i36 = i810;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i38 = i45 + 1;
                                    jArr11 = jArr11;
                                    iArr8 = iArr13;
                                    z17 = z17;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr11;
                                boolean z29 = z18;
                                if (i36 != i35) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z20 = z29 | z19;
                                if (z20) {
                                    jArr13 = new long[i36];
                                } else {
                                    jArr13 = jArr7;
                                }
                                if (z20) {
                                    iArr10 = new int[i36];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z20) {
                                    i29 = 0;
                                }
                                if (z20) {
                                    iArr11 = new int[i36];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z20) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i36];
                                i39 = 0;
                                z21 = false;
                                i40 = 0;
                                j24 = 0;
                                while (i39 < jArr10.length) {
                                    j25 = jArr12[i39];
                                    i41 = iArr7[i39];
                                    z22 = z20;
                                    i42 = iArr9[i39];
                                    androidx.media3.common.t tVar11 = tVar3;
                                    if (z22) {
                                        int i811 = i42 - i41;
                                        System.arraycopy(jArr7, i41, jArr13, i40, i811);
                                        System.arraycopy(iArr5, i41, iArr10, i40, i811);
                                        System.arraycopy(iArr6, i41, iArr11, i40, i811);
                                    }
                                    i43 = i29;
                                    while (i41 < i42) {
                                        i44 = i41;
                                        int i812 = i42;
                                        long j311 = qVarA.f15096d;
                                        RoundingMode roundingMode5 = RoundingMode.DOWN;
                                        long jQ15 = i0.Q(j24, 1000000L, j311, roundingMode5);
                                        jQ4 = i0.Q(jArr8[i44] - j25, 1000000L, qVarA.f15095c, roundingMode5);
                                        if (jQ4 < 0) {
                                            z21 = true;
                                        }
                                        jArr14[i40] = jQ15 + jQ4;
                                        if (z22) {
                                            i43 = iArr5[i44];
                                        }
                                        if (!z22) {
                                        }
                                        i40++;
                                        i41 = i44 + 1;
                                        i42 = i812;
                                    }
                                    j24 += jArr10[i39];
                                    i39++;
                                    i29 = i43;
                                    z20 = z22;
                                    tVar3 = tVar11;
                                }
                                tVar4 = tVar3;
                                long jQ16 = i0.Q(j24, 1000000L, qVarA.f15096d, RoundingMode.DOWN);
                                if (z21) {
                                    androidx.media3.common.s sVarA8 = tVar4.a();
                                    sVarA8.f1507s = true;
                                    qVarA = qVarA.a(new androidx.media3.common.t(sVarA8));
                                }
                                tVar5 = new t(qVarA, jArr13, iArr10, i29, jArr14, iArr11, bi.b.U(arrayList5), z15, jQ16, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(tVar5);
                            } else {
                                arrayList3 = arrayList2;
                                j23 = -1;
                                if (jArr10.length == 1) {
                                }
                                iArr6 = iArr3;
                                i35 = i28;
                                if (i34 == 1) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                iArr7 = new int[jArr10.length];
                                iArr8 = new int[jArr10.length];
                                jArr11.getClass();
                                arrayList4 = arrayList3;
                                i36 = 0;
                                i37 = 0;
                                i38 = 0;
                                z18 = false;
                                while (i38 < jArr10.length) {
                                    iArr12 = iArr8;
                                    i45 = i38;
                                    j26 = jArr11[i45];
                                    if (j26 != j23) {
                                        boolean z210 = z18;
                                        jQ5 = i0.Q(jArr10[i45], qVarA.f15095c, qVarA.f15096d, RoundingMode.DOWN) + j26;
                                        iArr13 = iArr12;
                                        iArr7[i45] = i0.e(jArr8, j26, true);
                                        iB = i0.b(jArr8, jQ5, z17) - 1;
                                        i47 = 0;
                                        while (i46 < jArr8.length) {
                                            if (jArr8[i46] < jQ5) {
                                                i47++;
                                                if (i47 > tVar3.f1596p) {
                                                    break;
                                                    break;
                                                }
                                            } else {
                                                iB = i46;
                                            }
                                        }
                                        iArr13[i45] = iB + 1;
                                        i48 = iArr7[i45];
                                        while (true) {
                                            i49 = iArr7[i45];
                                            if (i49 > 0) {
                                                break;
                                                break;
                                            }
                                            iArr7[i45] = i49 - 1;
                                        }
                                        if (i49 == 0) {
                                            iArr7[i45] = i48;
                                            while (true) {
                                                i51 = iArr7[i45];
                                                if (i51 >= iArr13[i45]) {
                                                    break;
                                                    break;
                                                }
                                                break;
                                                break;
                                                iArr7[i45] = i51 + 1;
                                            }
                                        }
                                        int i813 = iArr13[i45];
                                        i50 = iArr7[i45];
                                        int i814 = (i813 - i50) + i36;
                                        if (i37 != i50) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        z18 = z210 | z23;
                                        i37 = i813;
                                        i36 = i814;
                                    } else {
                                        iArr13 = iArr12;
                                    }
                                    i38 = i45 + 1;
                                    jArr11 = jArr11;
                                    iArr8 = iArr13;
                                    z17 = z17;
                                }
                                iArr9 = iArr8;
                                jArr12 = jArr11;
                                boolean z211 = z18;
                                if (i36 != i35) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                z20 = z211 | z19;
                                if (z20) {
                                    jArr13 = new long[i36];
                                } else {
                                    jArr13 = jArr7;
                                }
                                if (z20) {
                                    iArr10 = new int[i36];
                                } else {
                                    iArr10 = iArr5;
                                }
                                if (z20) {
                                    i29 = 0;
                                }
                                if (z20) {
                                    iArr11 = new int[i36];
                                } else {
                                    iArr11 = iArr6;
                                }
                                if (z20) {
                                    arrayList5 = new ArrayList();
                                } else {
                                    arrayList5 = arrayList4;
                                }
                                jArr14 = new long[i36];
                                i39 = 0;
                                z21 = false;
                                i40 = 0;
                                j24 = 0;
                                while (i39 < jArr10.length) {
                                    j25 = jArr12[i39];
                                    i41 = iArr7[i39];
                                    z22 = z20;
                                    i42 = iArr9[i39];
                                    androidx.media3.common.t tVar12 = tVar3;
                                    if (z22) {
                                        int i815 = i42 - i41;
                                        System.arraycopy(jArr7, i41, jArr13, i40, i815);
                                        System.arraycopy(iArr5, i41, iArr10, i40, i815);
                                        System.arraycopy(iArr6, i41, iArr11, i40, i815);
                                    }
                                    i43 = i29;
                                    while (i41 < i42) {
                                        i44 = i41;
                                        int i816 = i42;
                                        long j312 = qVarA.f15096d;
                                        RoundingMode roundingMode6 = RoundingMode.DOWN;
                                        long jQ17 = i0.Q(j24, 1000000L, j312, roundingMode6);
                                        jQ4 = i0.Q(jArr8[i44] - j25, 1000000L, qVarA.f15095c, roundingMode6);
                                        if (jQ4 < 0) {
                                            z21 = true;
                                        }
                                        jArr14[i40] = jQ17 + jQ4;
                                        if (z22) {
                                            i43 = iArr5[i44];
                                        }
                                        if (!z22) {
                                        }
                                        i40++;
                                        i41 = i44 + 1;
                                        i42 = i816;
                                    }
                                    j24 += jArr10[i39];
                                    i39++;
                                    i29 = i43;
                                    z20 = z22;
                                    tVar3 = tVar12;
                                }
                                tVar4 = tVar3;
                                long jQ18 = i0.Q(j24, 1000000L, qVarA.f15096d, RoundingMode.DOWN);
                                if (z21) {
                                    androidx.media3.common.s sVarA9 = tVar4.a();
                                    sVarA9.f1507s = true;
                                    qVarA = qVarA.a(new androidx.media3.common.t(sVarA9));
                                }
                                tVar5 = new t(qVarA, jArr13, iArr10, i29, jArr14, iArr11, bi.b.U(arrayList5), z15, jQ18, jArr13.length);
                                arrayList6 = arrayList6;
                                arrayList6.add(tVar5);
                            }
                        }
                        tVar5 = tVar6;
                    }
                    arrayList6.add(tVar5);
                }
            }
            i63 = i11 + 1;
            cVar2 = cVar;
            arrayList6 = arrayList6;
        }
        return arrayList6;
    }

    public static v0 k(f7.d dVar) {
        int i10;
        boolean z10;
        v0 v0Var;
        v0 v0Var2;
        int iB;
        v0 v0Var3;
        Object objK;
        u uVar = dVar.C;
        int i11 = 8;
        uVar.N(8);
        boolean z11 = false;
        v0 v0Var4 = new v0(new u0[0]);
        while (uVar.a() >= i11) {
            int i12 = uVar.f5183b;
            int iM = uVar.m();
            int iM2 = uVar.m();
            String str = null;
            if (iM2 == 1835365473) {
                uVar.N(i12);
                int i13 = i12 + iM;
                uVar.O(i11);
                a(uVar);
                while (true) {
                    int i14 = uVar.f5183b;
                    if (i14 < i13) {
                        int iM3 = uVar.m();
                        if (uVar.m() == 1768715124) {
                            uVar.N(i14);
                            int i15 = i14 + iM3;
                            uVar.O(i11);
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                int i16 = uVar.f5183b;
                                if (i16 >= i15) {
                                    break;
                                }
                                int iM4 = uVar.m() + i16;
                                int iM5 = uVar.m();
                                int i17 = (iM5 >> 24) & 255;
                                if (i17 == 169 || i17 == 253) {
                                    int i18 = 16777215 & iM5;
                                    if (i18 == 6516084) {
                                        objK = p.d(iM5, uVar);
                                    } else if (i18 == 7233901 || i18 == 7631467) {
                                        objK = p.k(iM5, uVar, "TIT2");
                                    } else if (i18 == 6516589 || i18 == 7828084) {
                                        objK = p.k(iM5, uVar, "TCOM");
                                    } else if (i18 == 6578553) {
                                        objK = p.k(iM5, uVar, "TDRC");
                                    } else if (i18 == 4280916) {
                                        objK = p.k(iM5, uVar, "TPE1");
                                    } else if (i18 == 7630703) {
                                        objK = p.k(iM5, uVar, "TSSE");
                                    } else if (i18 == 6384738) {
                                        objK = p.k(iM5, uVar, "TALB");
                                    } else if (i18 == 7108978) {
                                        objK = p.k(iM5, uVar, "USLT");
                                    } else if (i18 == 6776174) {
                                        objK = p.k(iM5, uVar, "TCON");
                                    } else if (i18 == 6779504) {
                                        objK = p.k(iM5, uVar, "TIT1");
                                    } else if (i18 == 7173742) {
                                        objK = p.k(iM5, uVar, "MVNM");
                                    } else if (i18 == 7173737) {
                                        objK = p.h(iM5, "MVIN", uVar, true, false);
                                    } else {
                                        e7.a.b("MetadataUtil", "Skipped unknown metadata entry: " + f7.e.b(iM5));
                                        uVar.N(iM4);
                                        objK = null;
                                    }
                                    uVar.N(iM4);
                                } else {
                                    if (iM5 == 1735291493) {
                                        try {
                                            String strA = o8.k.a(p.g(uVar) - 1);
                                            if (strA != null) {
                                                objK = new o8.o("TCON", str, t0.s(strA));
                                            } else {
                                                e7.a.m("MetadataUtil", "Failed to parse standard genre code");
                                                objK = str;
                                            }
                                        } catch (Throwable th2) {
                                            uVar.N(iM4);
                                            throw th2;
                                        }
                                    } else if (iM5 == 1684632427) {
                                        objK = p.f(iM5, uVar, "TPOS");
                                    } else if (iM5 == 1953655662) {
                                        objK = p.f(iM5, uVar, "TRCK");
                                    } else if (iM5 == 1953329263) {
                                        objK = p.h(iM5, "TBPM", uVar, true, z11);
                                    } else if (iM5 == 1668311404) {
                                        objK = p.h(iM5, "TCMP", uVar, true, true);
                                    } else if (iM5 == 1668249202) {
                                        objK = p.e(uVar);
                                    } else if (iM5 == 1631670868) {
                                        objK = p.k(iM5, uVar, "TPE2");
                                    } else if (iM5 == 1936682605) {
                                        objK = p.k(iM5, uVar, "TSOT");
                                    } else if (iM5 == 1936679276) {
                                        objK = p.k(iM5, uVar, "TSOA");
                                    } else if (iM5 == 1936679282) {
                                        objK = p.k(iM5, uVar, "TSOP");
                                    } else if (iM5 == 1936679265) {
                                        objK = p.k(iM5, uVar, "TSO2");
                                    } else if (iM5 == 1936679791) {
                                        objK = p.k(iM5, uVar, "TSOC");
                                    } else if (iM5 == 1920233063) {
                                        objK = p.h(iM5, "ITUNESADVISORY", uVar, z11, z11);
                                    } else if (iM5 == 1885823344) {
                                        objK = p.h(iM5, "ITUNESGAPLESS", uVar, z11, true);
                                    } else if (iM5 == 1936683886) {
                                        objK = p.k(iM5, uVar, "TVSHOWSORT");
                                    } else if (iM5 == 1953919848) {
                                        objK = p.k(iM5, uVar, "TVSHOW");
                                    } else if (iM5 == 757935405) {
                                        String strW = str;
                                        String strW2 = strW;
                                        int i19 = -1;
                                        int i20 = -1;
                                        while (true) {
                                            int i21 = uVar.f5183b;
                                            if (i21 >= iM4) {
                                                break;
                                            }
                                            int iM6 = uVar.m();
                                            int iM7 = uVar.m();
                                            uVar.O(4);
                                            if (iM7 == 1835360622) {
                                                strW = uVar.w(iM6 - 12);
                                            } else if (iM7 == 1851878757) {
                                                strW2 = uVar.w(iM6 - 12);
                                            } else {
                                                if (iM7 == 1684108385) {
                                                    i19 = i21;
                                                    i20 = iM6;
                                                }
                                                uVar.O(iM6 - 12);
                                            }
                                        }
                                        if (strW == null || strW2 == null || i19 == -1) {
                                            objK = null;
                                        } else {
                                            uVar.N(i19);
                                            uVar.O(16);
                                            objK = new o8.l(strW, strW2, uVar.w(i20 - 16));
                                        }
                                        uVar.N(iM4);
                                    } else {
                                        e7.a.b("MetadataUtil", "Skipped unknown metadata entry: " + f7.e.b(iM5));
                                        uVar.N(iM4);
                                        objK = null;
                                    }
                                    uVar.N(iM4);
                                }
                                if (objK != null) {
                                    arrayList.add(objK);
                                }
                                z11 = false;
                                str = null;
                            }
                            if (!arrayList.isEmpty()) {
                                v0Var3 = new v0(arrayList);
                                break;
                            }
                            break;
                        }
                        uVar.N(i14 + iM3);
                        i11 = 8;
                        z11 = false;
                        str = null;
                    }
                    v0Var3 = null;
                    break;
                }
                v0Var4 = v0Var4.b(v0Var3);
                i10 = 8;
            } else if (iM2 == 1936553057) {
                uVar.N(i12);
                int i22 = i12 + iM;
                uVar.O(12);
                while (true) {
                    int i23 = uVar.f5183b;
                    if (i23 < i22) {
                        int iM8 = uVar.m();
                        if (uVar.m() == 1935766900) {
                            if (iM8 >= 16) {
                                uVar.O(4);
                                int i24 = -1;
                                int i25 = 0;
                                for (int i26 = 0; i26 < 2; i26++) {
                                    int iA = uVar.A();
                                    int iA2 = uVar.A();
                                    if (iA == 0) {
                                        i24 = iA2;
                                    } else if (iA == 1) {
                                        i25 = iA2;
                                    }
                                }
                                if (i24 != 12) {
                                    if (i24 != 13) {
                                        if (i24 != 21) {
                                            iB = -2147483647;
                                        } else {
                                            i10 = 8;
                                            if (uVar.a() < 8 || uVar.f5183b + 8 > i22) {
                                                iB = -2147483647;
                                            } else {
                                                int iM9 = uVar.m();
                                                int iM10 = uVar.m();
                                                if (iM9 < 12 || iM10 != 1936877170) {
                                                    iB = -2147483647;
                                                } else {
                                                    iB = uVar.B();
                                                }
                                            }
                                        }
                                        if (iB == -2147483647) {
                                            v0Var2 = new v0(new p8.c(iB, i25));
                                            break;
                                        }
                                        break;
                                    }
                                    iB = 120;
                                } else {
                                    iB = 240;
                                }
                                i10 = 8;
                                if (iB == -2147483647) {
                                    v0Var2 = new v0(new p8.c(iB, i25));
                                    break;
                                }
                                break;
                            }
                            v0Var2 = null;
                            i10 = 8;
                            break;
                        }
                        uVar.N(i23 + iM8);
                    } else {
                        i10 = 8;
                    }
                    v0Var2 = null;
                    break;
                }
                v0Var4 = v0Var4.b(v0Var2);
            } else {
                i10 = 8;
                if (iM2 == -1451722374) {
                    short sX = uVar.x();
                    uVar.O(2);
                    String strY = uVar.y(sX, StandardCharsets.UTF_8);
                    int iMax = Math.max(strY.lastIndexOf(43), strY.lastIndexOf(45));
                    try {
                        try {
                            f7.f fVar = new f7.f(Float.parseFloat(strY.substring(0, iMax)), Float.parseFloat(strY.substring(iMax, strY.length() - 1)));
                            u0[] u0VarArr = new u0[1];
                            z10 = false;
                            try {
                                u0VarArr[0] = fVar;
                                v0Var = new v0(u0VarArr);
                            } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                v0Var = null;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                            z10 = false;
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                        z10 = false;
                    }
                    v0Var4 = v0Var4.b(v0Var);
                }
                uVar.N(i12 + iM);
                i11 = i10;
                z11 = z10;
            }
            z10 = false;
            uVar.N(i12 + iM);
            i11 = i10;
            z11 = z10;
        }
        return v0Var4;
    }
}
