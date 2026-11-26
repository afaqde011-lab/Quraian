package s8;

import a8.k0;
import a8.l0;
import a8.m;
import a8.m0;
import a8.n0;
import a8.q;
import a8.r;
import a8.s;
import a8.v;
import a8.z;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.common.h;
import androidx.media3.common.n;
import androidx.media3.common.o;
import androidx.media3.common.t;
import androidx.media3.common.u0;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.api.k;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import e7.i0;
import e7.u;
import f7.p;
import fh.t0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import qd.j0;
import ta.c0;
import x8.i;

public final class f implements q {

    public static final byte[] f13861k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    public static final byte[] f13862l0;

    public static final byte[] f13863m0;

    public static final byte[] f13864n0;

    public static final UUID f13865o0;

    public static final Map f13866p0;
    public int A;
    public long B;
    public final SparseArray C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;

    public final b f13867a;

    public int f13868a0;

    public final g f13869b;

    public int f13870b0;

    public final SparseArray f13871c;

    public int f13872c0;

    public final boolean f13873d;

    public boolean f13874d0;

    public final boolean f13875e;

    public boolean f13876e0;

    public final i f13877f;

    public boolean f13878f0;

    public final u f13879g;

    public int f13880g0;

    public final u f13881h;

    public byte f13882h0;

    public final u f13883i;

    public boolean f13884i0;

    public final u f13885j;

    public s f13886j0;

    public final u f13887k;
    public final u l;
    public final u m;

    public final u f13888n;

    public final u f13889o;

    public final u f13890p;

    public ByteBuffer f13891q;

    public long f13892r;

    public long f13893s;

    public long f13894t;

    public long f13895u;

    public long f13896v;

    public boolean f13897w;

    public boolean f13898x;

    public e f13899y;

    public boolean f13900z;

    static {
        String str = i0.f5136a;
        f13862l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f13863m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f13864n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f13865o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        x5.t(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        x5.t(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f13866p0 = Collections.unmodifiableMap(map);
    }

    public f(i iVar, int i10) {
        b bVar = new b();
        this.f13893s = -1L;
        this.f13894t = -9223372036854775807L;
        this.f13895u = -9223372036854775807L;
        this.f13896v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f13867a = bVar;
        bVar.f13826d = new o9.q(this, 12);
        this.f13877f = iVar;
        this.C = new SparseArray();
        this.f13873d = (i10 & 1) == 0;
        this.f13875e = (i10 & 2) == 0;
        this.f13869b = new g();
        this.f13871c = new SparseArray();
        this.f13883i = new u(4);
        this.f13885j = new u(ByteBuffer.allocate(4).putInt(-1).array());
        this.f13887k = new u(4);
        this.f13879g = new u(p.f5547a);
        this.f13881h = new u(4);
        this.l = new u();
        this.m = new u();
        this.f13888n = new u(8);
        this.f13889o = new u();
        this.f13890p = new u();
        this.T = new int[1];
        this.f13898x = true;
    }

    public static byte[] i(long j9, long j10, String str) {
        c0.s(j9 != -9223372036854775807L);
        int i10 = (int) (j9 / 3600000000L);
        long j11 = j9 - (((long) i10) * 3600000000L);
        int i11 = (int) (j11 / 60000000);
        long j12 = j11 - (((long) i11) * 60000000);
        int i12 = (int) (j12 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j12 - (((long) i12) * 1000000)) / j10)));
        String str3 = i0.f5136a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final void a(s sVar) {
        if (this.f13875e) {
            sVar = new c7.c(sVar, this.f13877f);
        }
        this.f13886j0 = sVar;
    }

    @Override
    public final void b(long j9, long j10) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.f13867a;
        bVar.f13827e = 0;
        bVar.f13824b.clear();
        g gVar = bVar.f13825c;
        gVar.f13903b = 0;
        gVar.f13904c = 0;
        g gVar2 = this.f13869b;
        gVar2.f13903b = 0;
        gVar2.f13904c = 0;
        l();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f13900z) {
            this.C.clear();
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f13871c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            m0 m0Var = ((e) sparseArray.valueAt(i10)).V;
            if (m0Var != null) {
                m0Var.f293b = false;
                m0Var.f294c = 0;
            }
            i10++;
        }
    }

    @Override
    public final int d(r rVar, a8.u uVar) throws ParserException {
        boolean z10;
        int i10;
        int i11;
        int i12;
        String str;
        ?? r4;
        int i13;
        int iA;
        ?? r7;
        boolean z11;
        ?? r10;
        int i14;
        byte b7;
        List listSingletonList;
        int iW;
        ?? r11;
        int i15;
        ArrayList arrayList;
        RuntimeException runtimeException;
        Pair pair;
        String str2;
        String str3;
        List list;
        List listS;
        String str4;
        List list2;
        List list3;
        int i16;
        androidx.media3.common.s sVar;
        boolean zJ;
        int i17;
        int i18;
        float f3;
        androidx.media3.common.i iVar;
        String str5;
        int iIntValue;
        byte[] bArr;
        int i19;
        int i20;
        int i21;
        String str6;
        String str7;
        bh.f fVarF;
        List list4;
        int i22;
        List list5;
        int i23;
        long j9;
        long j10;
        long j11;
        v0 v0Var;
        j8.c cVar;
        v0 v0VarA;
        f fVar = this;
        boolean z12 = false;
        fVar.N = false;
        boolean z13 = true;
        boolean z14 = true;
        while (z14 && !fVar.N) {
            ?? r12 = fVar.f13867a;
            ?? r13 = r12.f13825c;
            ArrayDeque arrayDeque = r12.f13824b;
            r12.f13826d.getClass();
            while (true) {
                a aVar = (a) arrayDeque.peek();
                if (aVar == null || rVar.getPosition() < aVar.f13822b) {
                    boolean z15 = z12 ? 1 : 0;
                    ?? r14 = rVar;
                    if (r12.f13827e == 0) {
                        int i24 = 4;
                        long jB = r13.b(r14, true, z15, 4);
                        if (jB == -2) {
                            byte[] bArr2 = r12.f13823a;
                            r14.t();
                            ?? r15 = z15;
                            while (true) {
                                r14.a(r15, i24, bArr2);
                                byte b10 = bArr2[r15];
                                int i25 = 0;
                                while (true) {
                                    if (i25 >= 8) {
                                        i13 = -1;
                                    } else if ((g.f13901d[i25] & ((long) b10)) != 0) {
                                        i13 = i25 + 1;
                                    } else {
                                        i25++;
                                    }
                                }
                                if (i13 != -1 && i13 <= 4) {
                                    iA = (int) g.a(i13, false, bArr2);
                                    Object obj = r12.f13826d.B;
                                    if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                    }
                                }
                                r14.u(1);
                                i24 = 4;
                                r15 = 0;
                            }
                            r14.u(i13);
                            jB = iA;
                        }
                        z10 = true;
                        if (jB == -1) {
                            r4 = 0;
                            z14 = false;
                            r7 = r14;
                        } else {
                            r12.f13828f = (int) jB;
                            r12.f13827e = 1;
                        }
                    } else {
                        z10 = true;
                    }
                    if (r12.f13827e == z10) {
                        r12.f13829g = r13.b(r14, false, z10, 8);
                        r12.f13827e = 2;
                    }
                    ?? r16 = r12.f13826d;
                    int i26 = r12.f13828f;
                    Object obj2 = r16.B;
                    switch (i26) {
                        case 131:
                        case 136:
                        case ModuleDescriptor.MODULE_VERSION:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 240:
                        case 241:
                        case 247:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21938:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            i10 = 2;
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            i10 = 3;
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            i10 = 1;
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            i10 = 4;
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            i10 = 5;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    if (i10 == 0) {
                        r14.u((int) r12.f13829g);
                        r12.f13827e = 0;
                        z12 = false;
                        z13 = true;
                    } else if (i10 == 1) {
                        long position = r14.getPosition();
                        arrayDeque.push(new a(r12.f13828f, r12.f13829g + position));
                        r12.f13826d.U(r12.f13828f, position, r12.f13829g);
                        i11 = 0;
                        r12.f13827e = 0;
                        r10 = r14;
                    } else if (i10 == 2) {
                        long j12 = r12.f13829g;
                        if (j12 > 8) {
                            throw ParserException.a(null, "Invalid integer size: " + r12.f13829g);
                        }
                        r16.O(i26, r12.a(r14, (int) j12));
                        i11 = 0;
                        r12.f13827e = 0;
                        r10 = r14;
                    } else if (i10 == 3) {
                        long j13 = r12.f13829g;
                        if (j13 > 2147483647L) {
                            throw ParserException.a(null, "String element size: " + r12.f13829g);
                        }
                        int i27 = (int) j13;
                        if (i27 == 0) {
                            str = RuntimeVersion.SUFFIX;
                            i12 = 0;
                        } else {
                            byte[] bArr3 = new byte[i27];
                            r14.readFully(bArr3, 0, i27);
                            while (i27 > 0 && bArr3[i27 - 1] == 0) {
                                i27--;
                            }
                            i12 = 0;
                            str = new String(bArr3, 0, i27);
                        }
                        r16.V(i26, str);
                        r12.f13827e = i12;
                        i11 = i12;
                        r10 = r14;
                    } else if (i10 == 4) {
                        r16.F(i26, (int) r12.f13829g, r14);
                        i11 = 0;
                        r12.f13827e = 0;
                        r10 = r14;
                    } else {
                        if (i10 != 5) {
                            throw ParserException.a(null, "Invalid element type " + i10);
                        }
                        long j14 = r12.f13829g;
                        if (j14 != 4 && j14 != 8) {
                            throw ParserException.a(null, "Invalid float size: " + r12.f13829g);
                        }
                        int i28 = (int) j14;
                        long jA = r12.a(r14, i28);
                        double dIntBitsToFloat = i28 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA);
                        f fVar2 = (f) r16.B;
                        if (i26 == 181) {
                            fVar2.g(i26);
                            fVar2.f13899y.S = (int) dIntBitsToFloat;
                        } else if (i26 != 17545) {
                            switch (i26) {
                                case 21969:
                                    fVar2.g(i26);
                                    fVar2.f13899y.F = (float) dIntBitsToFloat;
                                    break;
                                case 21970:
                                    fVar2.g(i26);
                                    fVar2.f13899y.G = (float) dIntBitsToFloat;
                                    break;
                                case 21971:
                                    fVar2.g(i26);
                                    fVar2.f13899y.H = (float) dIntBitsToFloat;
                                    break;
                                case 21972:
                                    fVar2.g(i26);
                                    fVar2.f13899y.I = (float) dIntBitsToFloat;
                                    break;
                                case 21973:
                                    fVar2.g(i26);
                                    fVar2.f13899y.J = (float) dIntBitsToFloat;
                                    break;
                                case 21974:
                                    fVar2.g(i26);
                                    fVar2.f13899y.K = (float) dIntBitsToFloat;
                                    break;
                                case 21975:
                                    fVar2.g(i26);
                                    fVar2.f13899y.L = (float) dIntBitsToFloat;
                                    break;
                                case 21976:
                                    fVar2.g(i26);
                                    fVar2.f13899y.M = (float) dIntBitsToFloat;
                                    break;
                                case 21977:
                                    fVar2.g(i26);
                                    fVar2.f13899y.N = (float) dIntBitsToFloat;
                                    break;
                                case 21978:
                                    fVar2.g(i26);
                                    fVar2.f13899y.O = (float) dIntBitsToFloat;
                                    break;
                                default:
                                    switch (i26) {
                                        case 30323:
                                            fVar2.g(i26);
                                            fVar2.f13899y.f13855u = (float) dIntBitsToFloat;
                                            break;
                                        case 30324:
                                            fVar2.g(i26);
                                            fVar2.f13899y.f13856v = (float) dIntBitsToFloat;
                                            break;
                                        case 30325:
                                            fVar2.g(i26);
                                            fVar2.f13899y.f13857w = (float) dIntBitsToFloat;
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            fVar2.f13895u = (long) dIntBitsToFloat;
                        }
                        i11 = 0;
                        r12.f13827e = 0;
                        r10 = r14;
                    }
                } else {
                    o9.q qVar = r12.f13826d;
                    int i29 = ((a) arrayDeque.pop()).f13821a;
                    f fVar3 = (f) qVar.B;
                    SparseArray sparseArray = fVar3.C;
                    SparseArray sparseArray2 = fVar3.f13871c;
                    fVar3.f13886j0.getClass();
                    if (i29 != 160) {
                        if (i29 == 174) {
                            e eVar = fVar3.f13899y;
                            eVar.getClass();
                            String str8 = eVar.f13838c;
                            if (str8 == null) {
                                throw ParserException.a(null, "CodecId is missing in TrackEntry element");
                            }
                            switch (str8) {
                                case "V_MPEG4/ISO/AP":
                                case "V_MPEG4/ISO/SP":
                                case "A_MS/ACM":
                                case "A_TRUEHD":
                                case "A_VORBIS":
                                case "A_MPEG/L2":
                                case "A_MPEG/L3":
                                case "V_MS/VFW/FOURCC":
                                case "S_DVBSUB":
                                case "V_MPEG4/ISO/ASP":
                                case "V_MPEG4/ISO/AVC":
                                case "S_VOBSUB":
                                case "A_DTS/LOSSLESS":
                                case "A_AAC":
                                case "A_AC3":
                                case "A_DTS":
                                case "V_AV1":
                                case "V_VP8":
                                case "V_VP9":
                                case "S_HDMV/PGS":
                                case "V_THEORA":
                                case "A_DTS/EXPRESS":
                                case "A_PCM/FLOAT/IEEE":
                                case "A_PCM/INT/BIG":
                                case "A_PCM/INT/LIT":
                                case "S_TEXT/ASS":
                                case "S_TEXT/SSA":
                                case "V_MPEGH/ISO/HEVC":
                                case "S_TEXT/WEBVTT":
                                case "S_TEXT/UTF8":
                                case "V_MPEG2":
                                case "A_EAC3":
                                case "A_FLAC":
                                case "A_OPUS":
                                    int i30 = eVar.f13840d;
                                    switch (str8) {
                                        case "V_MPEG4/ISO/AP":
                                            b7 = 0;
                                            break;
                                        case "V_MPEG4/ISO/SP":
                                            b7 = 1;
                                            break;
                                        case "A_MS/ACM":
                                            b7 = 2;
                                            break;
                                        case "A_TRUEHD":
                                            b7 = 3;
                                            break;
                                        case "A_VORBIS":
                                            b7 = 4;
                                            break;
                                        case "A_MPEG/L2":
                                            b7 = 5;
                                            break;
                                        case "A_MPEG/L3":
                                            b7 = 6;
                                            break;
                                        case "V_MS/VFW/FOURCC":
                                            b7 = 7;
                                            break;
                                        case "S_DVBSUB":
                                            b7 = 8;
                                            break;
                                        case "V_MPEG4/ISO/ASP":
                                            b7 = 9;
                                            break;
                                        case "V_MPEG4/ISO/AVC":
                                            b7 = 10;
                                            break;
                                        case "S_VOBSUB":
                                            b7 = 11;
                                            break;
                                        case "A_DTS/LOSSLESS":
                                            b7 = 12;
                                            break;
                                        case "A_AAC":
                                            b7 = 13;
                                            break;
                                        case "A_AC3":
                                            b7 = 14;
                                            break;
                                        case "A_DTS":
                                            b7 = 15;
                                            break;
                                        case "V_AV1":
                                            b7 = 16;
                                            break;
                                        case "V_VP8":
                                            b7 = 17;
                                            break;
                                        case "V_VP9":
                                            b7 = 18;
                                            break;
                                        case "S_HDMV/PGS":
                                            b7 = 19;
                                            break;
                                        case "V_THEORA":
                                            b7 = 20;
                                            break;
                                        case "A_DTS/EXPRESS":
                                            b7 = 21;
                                            break;
                                        case "A_PCM/FLOAT/IEEE":
                                            b7 = 22;
                                            break;
                                        case "A_PCM/INT/BIG":
                                            b7 = 23;
                                            break;
                                        case "A_PCM/INT/LIT":
                                            b7 = 24;
                                            break;
                                        case "S_TEXT/ASS":
                                            b7 = 25;
                                            break;
                                        case "S_TEXT/SSA":
                                            b7 = 26;
                                            break;
                                        case "V_MPEGH/ISO/HEVC":
                                            b7 = 27;
                                            break;
                                        case "S_TEXT/WEBVTT":
                                            b7 = 28;
                                            break;
                                        case "S_TEXT/UTF8":
                                            b7 = 29;
                                            break;
                                        case "V_MPEG2":
                                            b7 = 30;
                                            break;
                                        case "A_EAC3":
                                            b7 = 31;
                                            break;
                                        case "A_FLAC":
                                            b7 = 32;
                                            break;
                                        case "A_OPUS":
                                            b7 = 33;
                                            break;
                                        default:
                                            b7 = -1;
                                            break;
                                    }
                                    String str9 = "video/x-unknown";
                                    switch (b7) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            byte[] bArr4 = eVar.l;
                                            listSingletonList = bArr4 == null ? null : Collections.singletonList(bArr4);
                                            str9 = "video/mp4v-es";
                                            listS = listSingletonList;
                                            iW = -1;
                                            i15 = -1;
                                            list4 = listS;
                                            str3 = null;
                                            list3 = list4;
                                            if (eVar.P != null && (fVarF = bh.f.f(new u(eVar.P))) != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z16 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31 = (z16 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17 || (i19 = eVar.f13852r) == i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = (eVar.f13849o * i18) / (eVar.f13848n * i19);
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f || eVar.G == -1.0f || eVar.H == -1.0f || eVar.I == -1.0f || eVar.J == -1.0f || eVar.K == -1.0f || eVar.L == -1.0f || eVar.M == -1.0f || eVar.N == -1.0f || eVar.O == -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        byte[] bArr5 = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((eVar.F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((eVar.G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((eVar.H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((eVar.I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((eVar.J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((eVar.K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((eVar.L * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((eVar.M * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (eVar.N + 0.5f));
                                                        byteBufferOrder.putShort((short) (eVar.O + 0.5f));
                                                        byteBufferOrder.putShort((short) eVar.D);
                                                        byteBufferOrder.putShort((short) eVar.E);
                                                        bArr = bArr5;
                                                    }
                                                    int i32 = eVar.A;
                                                    int i33 = eVar.C;
                                                    int i34 = eVar.B;
                                                    int i35 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i32, i33, i34, i35, i35, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null && map.containsKey(str5)) {
                                                    iIntValue = ((Integer) map.get(eVar.f13836b)).intValue();
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0 && Float.compare(eVar.f13855u, 0.0f) == 0 && Float.compare(eVar.f13856v, 0.0f) == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0 || Float.compare(eVar.f13857w, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(eVar.f13857w, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9) && !"text/x-ssa".equals(str9) && !"text/vtt".equals(str9) && !"application/vobsub".equals(str9) && !"application/pgs".equals(str9) && !"application/dvbsubs".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null && !map.containsKey(str6)) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i31;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 2:
                                            u uVar2 = new u(eVar.a(eVar.f13838c));
                                            try {
                                                int iT = uVar2.t();
                                                if (iT != 1) {
                                                    if (iT == 65534) {
                                                        uVar2.N(24);
                                                        long jU = uVar2.u();
                                                        UUID uuid = f13865o0;
                                                        if (jU != uuid.getMostSignificantBits() || uVar2.u() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str9 = "audio/x-unknown";
                                                        iW = -1;
                                                        i15 = -1;
                                                        str3 = null;
                                                        list3 = null;
                                                        if (eVar.P != null) {
                                                            str3 = fVarF.A;
                                                            str9 = "video/dolby-vision";
                                                        }
                                                        boolean z17 = eVar.Y;
                                                        if (eVar.X) {
                                                            i16 = 2;
                                                        } else {
                                                            i16 = 0;
                                                        }
                                                        int i36 = (z17 ? 1 : 0) | i16;
                                                        sVar = new androidx.media3.common.s();
                                                        zJ = x0.j(str9);
                                                        Map map2 = f13866p0;
                                                        if (zJ) {
                                                            sVar.E = eVar.Q;
                                                            sVar.F = eVar.S;
                                                            sVar.G = iW;
                                                        } else if (x0.m(str9)) {
                                                            if (eVar.f13853s == 0) {
                                                                i20 = eVar.f13851q;
                                                                i17 = -1;
                                                                if (i20 == -1) {
                                                                    i20 = eVar.f13848n;
                                                                }
                                                                eVar.f13851q = i20;
                                                                i21 = eVar.f13852r;
                                                                if (i21 == -1) {
                                                                    i21 = eVar.f13849o;
                                                                }
                                                                eVar.f13852r = i21;
                                                            } else {
                                                                i17 = -1;
                                                            }
                                                            i18 = eVar.f13851q;
                                                            if (i18 != i17) {
                                                                f3 = -1.0f;
                                                            } else {
                                                                f3 = -1.0f;
                                                            }
                                                            if (eVar.f13860z) {
                                                                if (eVar.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                int i37 = eVar.A;
                                                                int i38 = eVar.C;
                                                                int i39 = eVar.B;
                                                                int i310 = eVar.f13850p;
                                                                iVar = new androidx.media3.common.i(i37, i38, i39, i310, i310, bArr);
                                                            } else {
                                                                iVar = null;
                                                            }
                                                            str5 = eVar.f13836b;
                                                            if (str5 == null) {
                                                                iIntValue = -1;
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (eVar.f13854t == 0) {
                                                                if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            sVar.f1508t = eVar.f13848n;
                                                            sVar.f1509u = eVar.f13849o;
                                                            sVar.f1514z = f3;
                                                            sVar.f1513y = iIntValue;
                                                            sVar.A = eVar.f13858x;
                                                            sVar.B = eVar.f13859y;
                                                            sVar.C = iVar;
                                                        } else if (!"application/x-subrip".equals(str9)) {
                                                            throw ParserException.a(null, "Unexpected MIME type.");
                                                        }
                                                        str6 = eVar.f13836b;
                                                        if (str6 != null) {
                                                            sVar.f1492b = eVar.f13836b;
                                                        }
                                                        sVar.f1491a = Integer.toString(i30);
                                                        if (eVar.f13834a) {
                                                            str7 = "video/webm";
                                                        } else {
                                                            str7 = "video/x-matroska";
                                                        }
                                                        sVar.l = x0.n(str7);
                                                        sVar.m = x0.n(str9);
                                                        sVar.f1502n = i15;
                                                        sVar.f1494d = eVar.Z;
                                                        sVar.f1495e = i36;
                                                        sVar.f1504p = list3;
                                                        sVar.f1500j = str3;
                                                        sVar.f1505q = eVar.m;
                                                        eVar.f13837b0 = sVar.a();
                                                        eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                                        sparseArray2.put(eVar.f13840d, eVar);
                                                    }
                                                    e7.a.m("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iW = -1;
                                                    i15 = -1;
                                                    str3 = null;
                                                    list3 = null;
                                                    if (eVar.P != null) {
                                                        str3 = fVarF.A;
                                                        str9 = "video/dolby-vision";
                                                    }
                                                    boolean z18 = eVar.Y;
                                                    if (eVar.X) {
                                                        i16 = 2;
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    int i311 = (z18 ? 1 : 0) | i16;
                                                    sVar = new androidx.media3.common.s();
                                                    zJ = x0.j(str9);
                                                    Map map3 = f13866p0;
                                                    if (zJ) {
                                                        sVar.E = eVar.Q;
                                                        sVar.F = eVar.S;
                                                        sVar.G = iW;
                                                    } else if (x0.m(str9)) {
                                                        if (eVar.f13853s == 0) {
                                                            i20 = eVar.f13851q;
                                                            i17 = -1;
                                                            if (i20 == -1) {
                                                                i20 = eVar.f13848n;
                                                            }
                                                            eVar.f13851q = i20;
                                                            i21 = eVar.f13852r;
                                                            if (i21 == -1) {
                                                                i21 = eVar.f13849o;
                                                            }
                                                            eVar.f13852r = i21;
                                                        } else {
                                                            i17 = -1;
                                                        }
                                                        i18 = eVar.f13851q;
                                                        if (i18 != i17) {
                                                            f3 = -1.0f;
                                                        } else {
                                                            f3 = -1.0f;
                                                        }
                                                        if (eVar.f13860z) {
                                                            if (eVar.F != -1.0f) {
                                                                bArr = null;
                                                            } else {
                                                                bArr = null;
                                                            }
                                                            int i312 = eVar.A;
                                                            int i313 = eVar.C;
                                                            int i314 = eVar.B;
                                                            int i315 = eVar.f13850p;
                                                            iVar = new androidx.media3.common.i(i312, i313, i314, i315, i315, bArr);
                                                        } else {
                                                            iVar = null;
                                                        }
                                                        str5 = eVar.f13836b;
                                                        if (str5 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (eVar.f13854t == 0) {
                                                            if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        sVar.f1508t = eVar.f13848n;
                                                        sVar.f1509u = eVar.f13849o;
                                                        sVar.f1514z = f3;
                                                        sVar.f1513y = iIntValue;
                                                        sVar.A = eVar.f13858x;
                                                        sVar.B = eVar.f13859y;
                                                        sVar.C = iVar;
                                                    } else if (!"application/x-subrip".equals(str9)) {
                                                        throw ParserException.a(null, "Unexpected MIME type.");
                                                    }
                                                    str6 = eVar.f13836b;
                                                    if (str6 != null) {
                                                        sVar.f1492b = eVar.f13836b;
                                                    }
                                                    sVar.f1491a = Integer.toString(i30);
                                                    if (eVar.f13834a) {
                                                        str7 = "video/webm";
                                                    } else {
                                                        str7 = "video/x-matroska";
                                                    }
                                                    sVar.l = x0.n(str7);
                                                    sVar.m = x0.n(str9);
                                                    sVar.f1502n = i15;
                                                    sVar.f1494d = eVar.Z;
                                                    sVar.f1495e = i311;
                                                    sVar.f1504p = list3;
                                                    sVar.f1500j = str3;
                                                    sVar.f1505q = eVar.m;
                                                    eVar.f13837b0 = sVar.a();
                                                    eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                                    sparseArray2.put(eVar.f13840d, eVar);
                                                    break;
                                                }
                                                int i40 = eVar.R;
                                                String str10 = i0.f5136a;
                                                iW = i0.w(i40, ByteOrder.LITTLE_ENDIAN);
                                                if (iW == 0) {
                                                    e7.a.m("MatroskaExtractor", "Unsupported PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iW = -1;
                                                } else {
                                                    str9 = "audio/raw";
                                                }
                                                i15 = -1;
                                                str3 = null;
                                                list3 = null;
                                                if (eVar.P != null) {
                                                    str3 = fVarF.A;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z19 = eVar.Y;
                                                if (eVar.X) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i316 = (z19 ? 1 : 0) | i16;
                                                sVar = new androidx.media3.common.s();
                                                zJ = x0.j(str9);
                                                Map map4 = f13866p0;
                                                if (zJ) {
                                                    sVar.E = eVar.Q;
                                                    sVar.F = eVar.S;
                                                    sVar.G = iW;
                                                } else if (x0.m(str9)) {
                                                    if (eVar.f13853s == 0) {
                                                        i20 = eVar.f13851q;
                                                        i17 = -1;
                                                        if (i20 == -1) {
                                                            i20 = eVar.f13848n;
                                                        }
                                                        eVar.f13851q = i20;
                                                        i21 = eVar.f13852r;
                                                        if (i21 == -1) {
                                                            i21 = eVar.f13849o;
                                                        }
                                                        eVar.f13852r = i21;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = eVar.f13851q;
                                                    if (i18 != i17) {
                                                        f3 = -1.0f;
                                                    } else {
                                                        f3 = -1.0f;
                                                    }
                                                    if (eVar.f13860z) {
                                                        if (eVar.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i317 = eVar.A;
                                                        int i318 = eVar.C;
                                                        int i319 = eVar.B;
                                                        int i3110 = eVar.f13850p;
                                                        iVar = new androidx.media3.common.i(i317, i318, i319, i3110, i3110, bArr);
                                                    } else {
                                                        iVar = null;
                                                    }
                                                    str5 = eVar.f13836b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (eVar.f13854t == 0) {
                                                        if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    sVar.f1508t = eVar.f13848n;
                                                    sVar.f1509u = eVar.f13849o;
                                                    sVar.f1514z = f3;
                                                    sVar.f1513y = iIntValue;
                                                    sVar.A = eVar.f13858x;
                                                    sVar.B = eVar.f13859y;
                                                    sVar.C = iVar;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw ParserException.a(null, "Unexpected MIME type.");
                                                }
                                                str6 = eVar.f13836b;
                                                if (str6 != null) {
                                                    sVar.f1492b = eVar.f13836b;
                                                }
                                                sVar.f1491a = Integer.toString(i30);
                                                if (eVar.f13834a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                sVar.l = x0.n(str7);
                                                sVar.m = x0.n(str9);
                                                sVar.f1502n = i15;
                                                sVar.f1494d = eVar.Z;
                                                sVar.f1495e = i316;
                                                sVar.f1504p = list3;
                                                sVar.f1500j = str3;
                                                sVar.f1505q = eVar.m;
                                                eVar.f13837b0 = sVar.a();
                                                eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                                sparseArray2.put(eVar.f13840d, eVar);
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw ParserException.a(null, "Error parsing MS/ACM codec private");
                                            }
                                            break;
                                        case 3:
                                            eVar.V = new m0();
                                            str9 = "audio/true-hd";
                                            iW = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z110 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111 = (z110 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map5 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3112 = eVar.A;
                                                    int i3113 = eVar.C;
                                                    int i3114 = eVar.B;
                                                    int i3115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i3112, i3113, i3114, i3115, i3115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i3111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 4:
                                            byte[] bArrA = eVar.a(str8);
                                            try {
                                                r11 = bArrA[0];
                                                try {
                                                    if (r11 != 2) {
                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                    }
                                                    int i41 = 0;
                                                    int i42 = 1;
                                                    while (true) {
                                                        int i43 = bArrA[i42] & 255;
                                                        if (i43 != 255) {
                                                            int i44 = i42 + 1;
                                                            int i45 = i41 + i43;
                                                            int i46 = 0;
                                                            while (true) {
                                                                int i47 = bArrA[i44] & 255;
                                                                if (i47 != 255) {
                                                                    int i48 = i44 + 1;
                                                                    int i49 = i46 + i47;
                                                                    if (bArrA[i48] != 1) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr6 = new byte[i45];
                                                                    System.arraycopy(bArrA, i48, bArr6, 0, i45);
                                                                    int i50 = i48 + i45;
                                                                    if (bArrA[i50] != 3) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    int i51 = i50 + i49;
                                                                    if (bArrA[i51] != 5) {
                                                                        throw ParserException.a(null, "Error parsing vorbis codec private");
                                                                    }
                                                                    byte[] bArr7 = new byte[bArrA.length - i51];
                                                                    System.arraycopy(bArrA, i51, bArr7, 0, bArrA.length - i51);
                                                                    ArrayList arrayList2 = new ArrayList(2);
                                                                    arrayList2.add(bArr6);
                                                                    arrayList2.add(bArr7);
                                                                    str9 = "audio/vorbis";
                                                                    i15 = 8192;
                                                                    arrayList = arrayList2;
                                                                    iW = -1;
                                                                    list4 = arrayList;
                                                                    str3 = null;
                                                                    list3 = list4;
                                                                    if (eVar.P != null) {
                                                                        str3 = fVarF.A;
                                                                        str9 = "video/dolby-vision";
                                                                    }
                                                                    boolean z111 = eVar.Y;
                                                                    if (eVar.X) {
                                                                        i16 = 2;
                                                                    } else {
                                                                        i16 = 0;
                                                                    }
                                                                    int i3116 = (z111 ? 1 : 0) | i16;
                                                                    sVar = new androidx.media3.common.s();
                                                                    zJ = x0.j(str9);
                                                                    Map map6 = f13866p0;
                                                                    if (zJ) {
                                                                        sVar.E = eVar.Q;
                                                                        sVar.F = eVar.S;
                                                                        sVar.G = iW;
                                                                    } else if (x0.m(str9)) {
                                                                        if (eVar.f13853s == 0) {
                                                                            i20 = eVar.f13851q;
                                                                            i17 = -1;
                                                                            if (i20 == -1) {
                                                                                i20 = eVar.f13848n;
                                                                            }
                                                                            eVar.f13851q = i20;
                                                                            i21 = eVar.f13852r;
                                                                            if (i21 == -1) {
                                                                                i21 = eVar.f13849o;
                                                                            }
                                                                            eVar.f13852r = i21;
                                                                        } else {
                                                                            i17 = -1;
                                                                        }
                                                                        i18 = eVar.f13851q;
                                                                        if (i18 != i17) {
                                                                            f3 = -1.0f;
                                                                        } else {
                                                                            f3 = -1.0f;
                                                                        }
                                                                        if (eVar.f13860z) {
                                                                            if (eVar.F != -1.0f) {
                                                                                bArr = null;
                                                                            } else {
                                                                                bArr = null;
                                                                            }
                                                                            int i3117 = eVar.A;
                                                                            int i3118 = eVar.C;
                                                                            int i3119 = eVar.B;
                                                                            int i31110 = eVar.f13850p;
                                                                            iVar = new androidx.media3.common.i(i3117, i3118, i3119, i31110, i31110, bArr);
                                                                        } else {
                                                                            iVar = null;
                                                                        }
                                                                        str5 = eVar.f13836b;
                                                                        if (str5 == null) {
                                                                            iIntValue = -1;
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (eVar.f13854t == 0) {
                                                                            if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        sVar.f1508t = eVar.f13848n;
                                                                        sVar.f1509u = eVar.f13849o;
                                                                        sVar.f1514z = f3;
                                                                        sVar.f1513y = iIntValue;
                                                                        sVar.A = eVar.f13858x;
                                                                        sVar.B = eVar.f13859y;
                                                                        sVar.C = iVar;
                                                                    } else if (!"application/x-subrip".equals(str9)) {
                                                                        throw ParserException.a(null, "Unexpected MIME type.");
                                                                    }
                                                                    str6 = eVar.f13836b;
                                                                    if (str6 != null) {
                                                                        sVar.f1492b = eVar.f13836b;
                                                                    }
                                                                    sVar.f1491a = Integer.toString(i30);
                                                                    if (eVar.f13834a) {
                                                                        str7 = "video/webm";
                                                                    } else {
                                                                        str7 = "video/x-matroska";
                                                                    }
                                                                    sVar.l = x0.n(str7);
                                                                    sVar.m = x0.n(str9);
                                                                    sVar.f1502n = i15;
                                                                    sVar.f1494d = eVar.Z;
                                                                    sVar.f1495e = i3116;
                                                                    sVar.f1504p = list3;
                                                                    sVar.f1500j = str3;
                                                                    sVar.f1505q = eVar.m;
                                                                    eVar.f13837b0 = sVar.a();
                                                                    eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                                                    sparseArray2.put(eVar.f13840d, eVar);
                                                                } else {
                                                                    i46 += 255;
                                                                    i44++;
                                                                }
                                                            }
                                                        } else {
                                                            i41 += 255;
                                                            i42++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw ParserException.a(r11, "Error parsing vorbis codec private");
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r11 = 0;
                                            }
                                            break;
                                        case 5:
                                            str9 = "audio/mpeg-L2";
                                            iW = -1;
                                            i15 = 4096;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z112 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111 = (z112 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map7 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31112 = eVar.A;
                                                    int i31113 = eVar.C;
                                                    int i31114 = eVar.B;
                                                    int i31115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i31112, i31113, i31114, i31115, i31115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i31111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 6:
                                            str9 = "audio/mpeg";
                                            iW = -1;
                                            i15 = 4096;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z113 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31116 = (z113 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map8 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31117 = eVar.A;
                                                    int i31118 = eVar.C;
                                                    int i31119 = eVar.B;
                                                    int i311110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i31117, i31118, i31119, i311110, i311110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i31116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 7:
                                            u uVar3 = new u(eVar.a(eVar.f13838c));
                                            try {
                                                uVar3.O(16);
                                                long jR = uVar3.r();
                                                if (jR == 1482049860) {
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str2 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                        runtimeException = null;
                                                    }
                                                } else {
                                                    if (jR == 859189832) {
                                                        pair = new Pair("video/3gpp", null);
                                                    } else {
                                                        if (jR == 826496599) {
                                                            int i52 = uVar3.f5183b + 20;
                                                            byte[] bArr8 = uVar3.f5182a;
                                                            while (true) {
                                                                if (i52 < bArr8.length - 4) {
                                                                    if (bArr8[i52] == 0 && bArr8[i52 + 1] == 0 && bArr8[i52 + 2] == 1) {
                                                                        if (bArr8[i52 + 3] == 15) {
                                                                            pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr8, i52, bArr8.length)));
                                                                        }
                                                                    }
                                                                    i52++;
                                                                } else {
                                                                    runtimeException = null;
                                                                    try {
                                                                        throw ParserException.a(null, "Failed to find FourCC VC1 initialization data");
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                    }
                                                                }
                                                                throw ParserException.a(runtimeException, "Error parsing FourCC private data");
                                                            }
                                                        }
                                                        e7.a.m("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                        str2 = null;
                                                        pair = new Pair("video/x-unknown", null);
                                                    }
                                                    str2 = null;
                                                }
                                                str9 = (String) pair.first;
                                                str3 = str2;
                                                list = (List) pair.second;
                                                iW = -1;
                                                i15 = -1;
                                                list3 = list;
                                                if (eVar.P != null) {
                                                    str3 = fVarF.A;
                                                    str9 = "video/dolby-vision";
                                                }
                                                boolean z114 = eVar.Y;
                                                if (eVar.X) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i311111 = (z114 ? 1 : 0) | i16;
                                                sVar = new androidx.media3.common.s();
                                                zJ = x0.j(str9);
                                                Map map9 = f13866p0;
                                                if (zJ) {
                                                    sVar.E = eVar.Q;
                                                    sVar.F = eVar.S;
                                                    sVar.G = iW;
                                                } else if (x0.m(str9)) {
                                                    if (eVar.f13853s == 0) {
                                                        i20 = eVar.f13851q;
                                                        i17 = -1;
                                                        if (i20 == -1) {
                                                            i20 = eVar.f13848n;
                                                        }
                                                        eVar.f13851q = i20;
                                                        i21 = eVar.f13852r;
                                                        if (i21 == -1) {
                                                            i21 = eVar.f13849o;
                                                        }
                                                        eVar.f13852r = i21;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = eVar.f13851q;
                                                    if (i18 != i17) {
                                                        f3 = -1.0f;
                                                    } else {
                                                        f3 = -1.0f;
                                                    }
                                                    if (eVar.f13860z) {
                                                        if (eVar.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        int i311112 = eVar.A;
                                                        int i311113 = eVar.C;
                                                        int i311114 = eVar.B;
                                                        int i311115 = eVar.f13850p;
                                                        iVar = new androidx.media3.common.i(i311112, i311113, i311114, i311115, i311115, bArr);
                                                    } else {
                                                        iVar = null;
                                                    }
                                                    str5 = eVar.f13836b;
                                                    if (str5 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (eVar.f13854t == 0) {
                                                        if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    sVar.f1508t = eVar.f13848n;
                                                    sVar.f1509u = eVar.f13849o;
                                                    sVar.f1514z = f3;
                                                    sVar.f1513y = iIntValue;
                                                    sVar.A = eVar.f13858x;
                                                    sVar.B = eVar.f13859y;
                                                    sVar.C = iVar;
                                                } else if (!"application/x-subrip".equals(str9)) {
                                                    throw ParserException.a(null, "Unexpected MIME type.");
                                                }
                                                str6 = eVar.f13836b;
                                                if (str6 != null) {
                                                    sVar.f1492b = eVar.f13836b;
                                                }
                                                sVar.f1491a = Integer.toString(i30);
                                                if (eVar.f13834a) {
                                                    str7 = "video/webm";
                                                } else {
                                                    str7 = "video/x-matroska";
                                                }
                                                sVar.l = x0.n(str7);
                                                sVar.m = x0.n(str9);
                                                sVar.f1502n = i15;
                                                sVar.f1494d = eVar.Z;
                                                sVar.f1495e = i311111;
                                                sVar.f1504p = list3;
                                                sVar.f1500j = str3;
                                                sVar.f1505q = eVar.m;
                                                eVar.f13837b0 = sVar.a();
                                                eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                                sparseArray2.put(eVar.f13840d, eVar);
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                runtimeException = null;
                                            }
                                            break;
                                        case 8:
                                            byte[] bArr9 = new byte[4];
                                            System.arraycopy(eVar.a(str8), 0, bArr9, 0, 4);
                                            listS = t0.s(bArr9);
                                            str9 = "application/dvbsubs";
                                            iW = -1;
                                            i15 = -1;
                                            list4 = listS;
                                            str3 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z115 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311116 = (z115 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map10 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311117 = eVar.A;
                                                    int i311118 = eVar.C;
                                                    int i311119 = eVar.B;
                                                    int i3111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i311117, i311118, i311119, i3111110, i3111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i311116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 10:
                                            a8.e eVarA = a8.e.a(new u(eVar.a(eVar.f13838c)));
                                            ArrayList arrayList3 = eVarA.f241a;
                                            eVar.f13839c0 = eVarA.f242b;
                                            str4 = eVarA.l;
                                            str9 = "video/avc";
                                            list2 = arrayList3;
                                            str3 = str4;
                                            list = list2;
                                            iW = -1;
                                            i15 = -1;
                                            list3 = list;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z116 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111 = (z116 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map11 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111112 = eVar.A;
                                                    int i3111113 = eVar.C;
                                                    int i3111114 = eVar.B;
                                                    int i3111115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i3111112, i3111113, i3111114, i3111115, i3111115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i3111111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 11:
                                            listS = t0.s(eVar.a(str8));
                                            str9 = "application/vobsub";
                                            iW = -1;
                                            i15 = -1;
                                            list4 = listS;
                                            str3 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z117 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111116 = (z117 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map12 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111117 = eVar.A;
                                                    int i3111118 = eVar.C;
                                                    int i3111119 = eVar.B;
                                                    int i31111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i3111117, i3111118, i3111119, i31111110, i31111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i3111116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 12:
                                            str9 = "audio/vnd.dts.hd";
                                            iW = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z118 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111 = (z118 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map13 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111112 = eVar.A;
                                                    int i31111113 = eVar.C;
                                                    int i31111114 = eVar.B;
                                                    int i31111115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i31111112, i31111113, i31111114, i31111115, i31111115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i31111111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 13:
                                            List listSingletonList2 = Collections.singletonList(eVar.a(str8));
                                            byte[] bArr10 = eVar.l;
                                            a8.a aVarP = a8.b.p(new n0(bArr10.length, bArr10), false);
                                            eVar.S = aVarP.f194b;
                                            eVar.Q = aVarP.f195c;
                                            str9 = "audio/mp4a-latm";
                                            list = listSingletonList2;
                                            str3 = aVarP.f193a;
                                            iW = -1;
                                            i15 = -1;
                                            list3 = list;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z119 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111116 = (z119 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map14 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111117 = eVar.A;
                                                    int i31111118 = eVar.C;
                                                    int i31111119 = eVar.B;
                                                    int i311111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i31111117, i31111118, i31111119, i311111110, i311111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i31111116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 14:
                                            str9 = "audio/ac3";
                                            iW = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1110 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111111 = (z1110 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map15 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111112 = eVar.A;
                                                    int i311111113 = eVar.C;
                                                    int i311111114 = eVar.B;
                                                    int i311111115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i311111112, i311111113, i311111114, i311111115, i311111115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i311111111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 15:
                                        case k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                                            eVar.W = true;
                                            str9 = "audio/vnd.dts";
                                            iW = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1111 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111116 = (z1111 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map16 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111117 = eVar.A;
                                                    int i311111118 = eVar.C;
                                                    int i311111119 = eVar.B;
                                                    int i3111111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i311111117, i311111118, i311111119, i3111111110, i3111111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i311111116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 16:
                                            byte[] bArr11 = eVar.l;
                                            listSingletonList = bArr11 == null ? null : t0.s(bArr11);
                                            str9 = "video/av01";
                                            listS = listSingletonList;
                                            iW = -1;
                                            i15 = -1;
                                            list4 = listS;
                                            str3 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1112 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111111 = (z1112 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map17 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111112 = eVar.A;
                                                    int i3111111113 = eVar.C;
                                                    int i3111111114 = eVar.B;
                                                    int i3111111115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i3111111112, i3111111113, i3111111114, i3111111115, i3111111115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i3111111111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 17:
                                            str9 = "video/x-vnd.on2.vp8";
                                            iW = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1113 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111116 = (z1113 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map18 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111117 = eVar.A;
                                                    int i3111111118 = eVar.C;
                                                    int i3111111119 = eVar.B;
                                                    int i31111111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i3111111117, i3111111118, i3111111119, i31111111110, i31111111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i3111111116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case TYPE_SINT64_VALUE:
                                            byte[] bArr12 = eVar.l;
                                            listSingletonList = bArr12 == null ? null : t0.s(bArr12);
                                            str9 = "video/x-vnd.on2.vp9";
                                            listS = listSingletonList;
                                            iW = -1;
                                            i15 = -1;
                                            list4 = listS;
                                            str3 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1114 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111111 = (z1114 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map19 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111112 = eVar.A;
                                                    int i31111111113 = eVar.C;
                                                    int i31111111114 = eVar.B;
                                                    int i31111111115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i31111111112, i31111111113, i31111111114, i31111111115, i31111111115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i31111111111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case k.REMOTE_EXCEPTION:
                                            str9 = "application/pgs";
                                            iW = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1115 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111116 = (z1115 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map110 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111117 = eVar.A;
                                                    int i31111111118 = eVar.C;
                                                    int i31111111119 = eVar.B;
                                                    int i311111111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i31111111117, i31111111118, i31111111119, i311111111110, i311111111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i31111111116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case k.CONNECTION_SUSPENDED_DURING_CALL:
                                            iW = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1116 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111111111 = (z1116 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map111 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111112 = eVar.A;
                                                    int i311111111113 = eVar.C;
                                                    int i311111111114 = eVar.B;
                                                    int i311111111115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i311111111112, i311111111113, i311111111114, i311111111115, i311111111115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i311111111111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case k.RECONNECTION_TIMED_OUT:
                                            if (eVar.R == 32) {
                                                str9 = "audio/raw";
                                                iW = 4;
                                            } else {
                                                e7.a.m("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                str9 = "audio/x-unknown";
                                                iW = -1;
                                            }
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1117 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111111116 = (z1117 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map112 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111117 = eVar.A;
                                                    int i311111111118 = eVar.C;
                                                    int i311111111119 = eVar.B;
                                                    int i3111111111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i311111111117, i311111111118, i311111111119, i3111111111110, i3111111111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i311111111116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 23:
                                            int i53 = eVar.R;
                                            if (i53 == 8) {
                                                str9 = "audio/raw";
                                                iW = 3;
                                            } else {
                                                if (i53 == 16) {
                                                    iW = 268435456;
                                                } else if (i53 == 24) {
                                                    iW = 1342177280;
                                                } else if (i53 == 32) {
                                                    iW = 1610612736;
                                                } else {
                                                    e7.a.m("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                    str9 = "audio/x-unknown";
                                                    iW = -1;
                                                }
                                                str9 = "audio/raw";
                                            }
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1118 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111111111 = (z1118 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map113 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111112 = eVar.A;
                                                    int i3111111111113 = eVar.C;
                                                    int i3111111111114 = eVar.B;
                                                    int i3111111111115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i3111111111112, i3111111111113, i3111111111114, i3111111111115, i3111111111115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i3111111111111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 24:
                                            int i54 = eVar.R;
                                            String str11 = i0.f5136a;
                                            iW = i0.w(i54, ByteOrder.LITTLE_ENDIAN);
                                            if (iW == 0) {
                                                e7.a.m("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + eVar.R + ". Setting mimeType to audio/x-unknown");
                                                str9 = "audio/x-unknown";
                                                iW = -1;
                                            } else {
                                                str9 = "audio/raw";
                                            }
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z1119 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111111116 = (z1119 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map114 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111117 = eVar.A;
                                                    int i3111111111118 = eVar.C;
                                                    int i3111111111119 = eVar.B;
                                                    int i31111111111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i3111111111117, i3111111111118, i3111111111119, i31111111111110, i31111111111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i3111111111116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 25:
                                        case RuntimeVersion.MINOR:
                                            listS = t0.t(f13862l0, eVar.a(str8));
                                            str9 = "text/x-ssa";
                                            iW = -1;
                                            i15 = -1;
                                            list4 = listS;
                                            str3 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11110 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111111111 = (z11110 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map115 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111112 = eVar.A;
                                                    int i31111111111113 = eVar.C;
                                                    int i31111111111114 = eVar.B;
                                                    int i31111111111115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i31111111111112, i31111111111113, i31111111111114, i31111111111115, i31111111111115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i31111111111111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 27:
                                            z zVarA = z.a(new u(eVar.a(eVar.f13838c)), false, null);
                                            List list6 = zVarA.f326a;
                                            eVar.f13839c0 = zVarA.f327b;
                                            str4 = zVarA.f337n;
                                            str9 = "video/hevc";
                                            list2 = list6;
                                            str3 = str4;
                                            list = list2;
                                            iW = -1;
                                            i15 = -1;
                                            list3 = list;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11111 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111111116 = (z11111 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map116 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111117 = eVar.A;
                                                    int i31111111111118 = eVar.C;
                                                    int i31111111111119 = eVar.B;
                                                    int i311111111111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i31111111111117, i31111111111118, i31111111111119, i311111111111110, i311111111111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i31111111111116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 28:
                                            str9 = "text/vtt";
                                            iW = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11112 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111111111111 = (z11112 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map117 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111111112 = eVar.A;
                                                    int i311111111111113 = eVar.C;
                                                    int i311111111111114 = eVar.B;
                                                    int i311111111111115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i311111111111112, i311111111111113, i311111111111114, i311111111111115, i311111111111115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i311111111111111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 29:
                                            str9 = "application/x-subrip";
                                            iW = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11113 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i311111111111116 = (z11113 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map118 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i311111111111117 = eVar.A;
                                                    int i311111111111118 = eVar.C;
                                                    int i311111111111119 = eVar.B;
                                                    int i3111111111111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i311111111111117, i311111111111118, i311111111111119, i3111111111111110, i3111111111111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i311111111111116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 30:
                                            str9 = "video/mpeg2";
                                            iW = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11114 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111111111111 = (z11114 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map119 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111111112 = eVar.A;
                                                    int i3111111111111113 = eVar.C;
                                                    int i3111111111111114 = eVar.B;
                                                    int i3111111111111115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i3111111111111112, i3111111111111113, i3111111111111114, i3111111111111115, i3111111111111115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i3111111111111111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 31:
                                            str9 = "audio/eac3";
                                            iW = -1;
                                            i15 = -1;
                                            str3 = null;
                                            list3 = null;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11115 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i3111111111111116 = (z11115 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map1110 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i3111111111111117 = eVar.A;
                                                    int i3111111111111118 = eVar.C;
                                                    int i3111111111111119 = eVar.B;
                                                    int i31111111111111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i3111111111111117, i3111111111111118, i3111111111111119, i31111111111111110, i31111111111111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i3111111111111116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                                            listSingletonList = Collections.singletonList(eVar.a(str8));
                                            str9 = "audio/flac";
                                            listS = listSingletonList;
                                            iW = -1;
                                            i15 = -1;
                                            list4 = listS;
                                            str3 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11116 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111111111111 = (z11116 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map1111 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111111112 = eVar.A;
                                                    int i31111111111111113 = eVar.C;
                                                    int i31111111111111114 = eVar.B;
                                                    int i31111111111111115 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i31111111111111112, i31111111111111113, i31111111111111114, i31111111111111115, i31111111111111115, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i31111111111111111;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        case 33:
                                            ArrayList arrayList4 = new ArrayList(3);
                                            arrayList4.add(eVar.a(eVar.f13838c));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            arrayList4.add(byteBufferAllocate.order(byteOrder).putLong(eVar.T).array());
                                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(eVar.U).array());
                                            str9 = "audio/opus";
                                            i15 = 5760;
                                            arrayList = arrayList4;
                                            iW = -1;
                                            list4 = arrayList;
                                            str3 = null;
                                            list3 = list4;
                                            if (eVar.P != null) {
                                                str3 = fVarF.A;
                                                str9 = "video/dolby-vision";
                                            }
                                            boolean z11117 = eVar.Y;
                                            if (eVar.X) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i31111111111111116 = (z11117 ? 1 : 0) | i16;
                                            sVar = new androidx.media3.common.s();
                                            zJ = x0.j(str9);
                                            Map map1112 = f13866p0;
                                            if (zJ) {
                                                sVar.E = eVar.Q;
                                                sVar.F = eVar.S;
                                                sVar.G = iW;
                                            } else if (x0.m(str9)) {
                                                if (eVar.f13853s == 0) {
                                                    i20 = eVar.f13851q;
                                                    i17 = -1;
                                                    if (i20 == -1) {
                                                        i20 = eVar.f13848n;
                                                    }
                                                    eVar.f13851q = i20;
                                                    i21 = eVar.f13852r;
                                                    if (i21 == -1) {
                                                        i21 = eVar.f13849o;
                                                    }
                                                    eVar.f13852r = i21;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = eVar.f13851q;
                                                if (i18 != i17) {
                                                    f3 = -1.0f;
                                                } else {
                                                    f3 = -1.0f;
                                                }
                                                if (eVar.f13860z) {
                                                    if (eVar.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    int i31111111111111117 = eVar.A;
                                                    int i31111111111111118 = eVar.C;
                                                    int i31111111111111119 = eVar.B;
                                                    int i311111111111111110 = eVar.f13850p;
                                                    iVar = new androidx.media3.common.i(i31111111111111117, i31111111111111118, i31111111111111119, i311111111111111110, i311111111111111110, bArr);
                                                } else {
                                                    iVar = null;
                                                }
                                                str5 = eVar.f13836b;
                                                if (str5 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (eVar.f13854t == 0) {
                                                    if (Float.compare(eVar.f13857w, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(eVar.f13857w, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(eVar.f13857w, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                sVar.f1508t = eVar.f13848n;
                                                sVar.f1509u = eVar.f13849o;
                                                sVar.f1514z = f3;
                                                sVar.f1513y = iIntValue;
                                                sVar.A = eVar.f13858x;
                                                sVar.B = eVar.f13859y;
                                                sVar.C = iVar;
                                            } else if (!"application/x-subrip".equals(str9)) {
                                                throw ParserException.a(null, "Unexpected MIME type.");
                                            }
                                            str6 = eVar.f13836b;
                                            if (str6 != null) {
                                                sVar.f1492b = eVar.f13836b;
                                            }
                                            sVar.f1491a = Integer.toString(i30);
                                            if (eVar.f13834a) {
                                                str7 = "video/webm";
                                            } else {
                                                str7 = "video/x-matroska";
                                            }
                                            sVar.l = x0.n(str7);
                                            sVar.m = x0.n(str9);
                                            sVar.f1502n = i15;
                                            sVar.f1494d = eVar.Z;
                                            sVar.f1495e = i31111111111111116;
                                            sVar.f1504p = list3;
                                            sVar.f1500j = str3;
                                            sVar.f1505q = eVar.m;
                                            eVar.f13837b0 = sVar.a();
                                            eVar.f13835a0 = fVar3.f13886j0.w(eVar.f13840d, eVar.f13841e);
                                            sparseArray2.put(eVar.f13840d, eVar);
                                            break;
                                        default:
                                            throw ParserException.a(null, "Unrecognized codec identifier.");
                                    }
                                default:
                                    fVar3.f13899y = null;
                                    break;
                            }
                        } else if (i29 != 183) {
                            if (i29 == 19899) {
                                int i55 = fVar3.A;
                                if (i55 != -1) {
                                    long j15 = fVar3.B;
                                    if (j15 != -1) {
                                        if (i55 == 475249515) {
                                            fVar3.K = j15;
                                        }
                                    }
                                }
                                throw ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
                            }
                            if (i29 == 25152) {
                                fVar3.g(i29);
                                e eVar2 = fVar3.f13899y;
                                if (eVar2.f13845i) {
                                    k0 k0Var = eVar2.f13847k;
                                    if (k0Var == null) {
                                        throw ParserException.a(null, "Encrypted Track found but ContentEncKeyID was not found");
                                    }
                                    eVar2.m = new o(null, true, new n(h.f1214a, null, "video/webm", k0Var.f289b));
                                }
                            } else if (i29 == 28032) {
                                fVar3.g(i29);
                                e eVar3 = fVar3.f13899y;
                                if (eVar3.f13845i && eVar3.f13846j != null) {
                                    throw ParserException.a(null, "Combining encryption and compression is not supported");
                                }
                            } else if (i29 == 357149030) {
                                if (fVar3.f13894t == -9223372036854775807L) {
                                    fVar3.f13894t = 1000000L;
                                }
                                long j16 = fVar3.f13895u;
                                if (j16 != -9223372036854775807L) {
                                    fVar3.f13896v = fVar3.m(j16);
                                }
                            } else if (i29 == 374648427) {
                                boolean z20 = z12 ? 1 : 0;
                                if (sparseArray2.size() == 0) {
                                    throw ParserException.a(null, "No valid tracks were found");
                                }
                                boolean z21 = (!fVar3.f13873d || fVar3.K == -1) ? true : z20 ? 1 : 0;
                                int i56 = -1;
                                int i57 = -1;
                                int i58 = -1;
                                int i59 = -1;
                                for (int i60 = z20 ? 1 : 0; i60 < sparseArray2.size(); i60++) {
                                    e eVar4 = (e) sparseArray2.valueAt(i60);
                                    int i61 = eVar4.f13841e;
                                    if (i61 == 2) {
                                        if (eVar4.Y) {
                                            i56 = eVar4.f13840d;
                                        }
                                        if (i57 == -1) {
                                            i57 = eVar4.f13840d;
                                        }
                                    } else if (i61 == 1) {
                                        if (eVar4.Y) {
                                            i58 = eVar4.f13840d;
                                        }
                                        if (i59 == -1) {
                                            i59 = eVar4.f13840d;
                                        }
                                    }
                                    if (z21) {
                                        eVar4.f13835a0.getClass();
                                        if (!eVar4.W) {
                                            l0 l0Var = eVar4.f13835a0;
                                            t tVar = eVar4.f13837b0;
                                            tVar.getClass();
                                            l0Var.f(tVar);
                                        }
                                    }
                                }
                                if (i56 != -1) {
                                    fVar3.I = i56;
                                } else if (i57 != -1) {
                                    fVar3.I = i57;
                                } else if (i58 != -1) {
                                    fVar3.I = i58;
                                } else if (i59 != -1) {
                                    fVar3.I = i59;
                                } else {
                                    fVar3.I = sparseArray2.size() > 0 ? ((e) sparseArray2.valueAt(z20 ? 1 : 0)).f13840d : -1;
                                }
                                if (z21) {
                                    fVar3.j();
                                }
                            } else if (i29 == 475249515 && !fVar3.f13900z) {
                                int i62 = z12 ? 1 : 0;
                                while (true) {
                                    if (i62 < sparseArray.size()) {
                                        if (((List) sparseArray.valueAt(i62)).isEmpty()) {
                                            i62++;
                                        } else if (fVar3.f13896v != -9223372036854775807L) {
                                            for (int i63 = z12 ? 1 : 0; i63 < sparseArray.size(); i63++) {
                                                Collections.sort((List) sparseArray.valueAt(i63));
                                            }
                                            fVar3.f13886j0.b(new d(sparseArray, fVar3.f13896v, fVar3.I, fVar3.f13893s, fVar3.f13892r));
                                        }
                                    }
                                    fVar3.f13886j0.b(new v(fVar3.f13896v));
                                }
                                fVar3.f13900z = z13;
                                fVar3.D = z12;
                                int i64 = z12 ? 1 : 0;
                                while (i64 < sparseArray2.size()) {
                                    e eVar5 = (e) sparseArray2.valueAt(i64);
                                    long j17 = fVar3.f13896v;
                                    long j18 = fVar3.f13893s;
                                    long j19 = fVar3.f13892r;
                                    boolean z22 = z12;
                                    int i65 = z13;
                                    if (eVar5.f13841e != 2 || (list5 = (List) sparseArray.get(eVar5.f13840d)) == null || list5.isEmpty()) {
                                        i23 = i64;
                                    } else {
                                        if (list5.isEmpty()) {
                                            i23 = i64;
                                        } else {
                                            i23 = i64;
                                            int iMin = Math.min(list5.size(), 20);
                                            double d3 = 0.0d;
                                            int i66 = z22 ? 1 : 0;
                                            int i67 = -1;
                                            while (i66 < iMin) {
                                                c cVar2 = (c) list5.get(i66);
                                                long j20 = j18;
                                                long j21 = cVar2.A;
                                                long j22 = cVar2.C;
                                                long j23 = cVar2.B;
                                                if (j21 > 10000000) {
                                                    if (i67 == -1) {
                                                        j9 = ((c) list5.get(i67 == true ? 1 : 0)).A;
                                                    }
                                                    if (j9 != -9223372036854775807L) {
                                                        t tVar2 = eVar5.f13837b0;
                                                        tVar2.getClass();
                                                        v0Var = tVar2.l;
                                                        cVar = new j8.c(j9);
                                                        if (v0Var == null) {
                                                            u0[] u0VarArr = new u0[i65];
                                                            u0VarArr[z22 ? 1 : 0] = cVar;
                                                            v0VarA = new v0(u0VarArr);
                                                        } else {
                                                            u0[] u0VarArr2 = new u0[i65];
                                                            u0VarArr2[z22 ? 1 : 0] = cVar;
                                                            v0VarA = v0Var.a(u0VarArr2);
                                                        }
                                                        androidx.media3.common.s sVarA = eVar5.f13837b0.a();
                                                        sVarA.f1501k = v0VarA;
                                                        eVar5.f13837b0 = new t(sVarA);
                                                    }
                                                } else {
                                                    if (i66 < list5.size() - 1) {
                                                        c cVar3 = (c) list5.get(i66 + 1);
                                                        j10 = (cVar3.B + cVar3.C) - (j23 + j22);
                                                        j11 = cVar3.A - j21;
                                                    } else {
                                                        j10 = (j20 + j19) - (j23 + j22);
                                                        j11 = j17 - j21;
                                                    }
                                                    if (j11 > 0) {
                                                        double d5 = j10 / j11;
                                                        if (d5 > d3) {
                                                            d3 = d5;
                                                            i67 = i66;
                                                        }
                                                    }
                                                    i66++;
                                                    j18 = j20;
                                                }
                                            }
                                            if (i67 == -1) {
                                                j9 = ((c) list5.get(i67 == true ? 1 : 0)).A;
                                            }
                                            if (j9 != -9223372036854775807L) {
                                                t tVar3 = eVar5.f13837b0;
                                                tVar3.getClass();
                                                v0Var = tVar3.l;
                                                cVar = new j8.c(j9);
                                                if (v0Var == null) {
                                                    u0[] u0VarArr3 = new u0[i65];
                                                    u0VarArr3[z22 ? 1 : 0] = cVar;
                                                    v0VarA = new v0(u0VarArr3);
                                                } else {
                                                    u0[] u0VarArr4 = new u0[i65];
                                                    u0VarArr4[z22 ? 1 : 0] = cVar;
                                                    v0VarA = v0Var.a(u0VarArr4);
                                                }
                                                androidx.media3.common.s sVarA2 = eVar5.f13837b0.a();
                                                sVarA2.f1501k = v0VarA;
                                                eVar5.f13837b0 = new t(sVarA2);
                                            }
                                        }
                                        j9 = -9223372036854775807L;
                                        if (j9 != -9223372036854775807L) {
                                            t tVar4 = eVar5.f13837b0;
                                            tVar4.getClass();
                                            v0Var = tVar4.l;
                                            cVar = new j8.c(j9);
                                            if (v0Var == null) {
                                                u0[] u0VarArr5 = new u0[i65];
                                                u0VarArr5[z22 ? 1 : 0] = cVar;
                                                v0VarA = new v0(u0VarArr5);
                                            } else {
                                                u0[] u0VarArr6 = new u0[i65];
                                                u0VarArr6[z22 ? 1 : 0] = cVar;
                                                v0VarA = v0Var.a(u0VarArr6);
                                            }
                                            androidx.media3.common.s sVarA3 = eVar5.f13837b0.a();
                                            sVarA3.f1501k = v0VarA;
                                            eVar5.f13837b0 = new t(sVarA3);
                                        }
                                    }
                                    if (!eVar5.W) {
                                        eVar5.f13835a0.getClass();
                                        l0 l0Var2 = eVar5.f13835a0;
                                        t tVar5 = eVar5.f13837b0;
                                        tVar5.getClass();
                                        l0Var2.f(tVar5);
                                    }
                                    i64 = i23 + 1;
                                    z12 = z22 ? 1 : 0;
                                    z13 = true;
                                }
                                fVar3.j();
                                i14 = z12 ? 1 : 0;
                            }
                        } else if (!fVar3.f13900z) {
                            fVar3.f(i29);
                            if (fVar3.E != -9223372036854775807L && (i22 = fVar3.F) != -1 && fVar3.G != -1) {
                                List arrayList5 = (List) sparseArray.get(i22);
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    sparseArray.put(fVar3.F, arrayList5);
                                }
                                arrayList5.add(new c(fVar3.E, fVar3.f13893s + fVar3.G, fVar3.H));
                            }
                        }
                        i14 = 0;
                    } else if (fVar3.O != 2) {
                        i14 = 0;
                    } else {
                        e eVar6 = (e) sparseArray2.get(fVar3.U);
                        eVar6.f13835a0.getClass();
                        if (fVar3.Z > 0 && "A_OPUS".equals(eVar6.f13838c)) {
                            u uVar4 = fVar3.f13890p;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(fVar3.Z).array();
                            uVar4.getClass();
                            uVar4.L(bArrArray.length, bArrArray);
                        }
                        int i68 = 0;
                        for (int i69 = 0; i69 < fVar3.S; i69++) {
                            i68 += fVar3.T[i69];
                        }
                        int i70 = 0;
                        while (i70 < fVar3.S) {
                            long j24 = fVar3.P + ((long) ((eVar6.f13842f * i70) / 1000));
                            int i71 = fVar3.W;
                            if (i70 == 0 && !fVar3.Y) {
                                i71 |= 1;
                            }
                            int i72 = fVar3.T[i70];
                            int i73 = i68 - i72;
                            fVar3.h(eVar6, j24, i71, i72, i73);
                            i70++;
                            i68 = i73;
                        }
                        i14 = 0;
                        fVar3.O = 0;
                    }
                    r10 = rVar;
                    i11 = i14;
                }
                z14 = true;
                r7 = r10;
                r4 = i11;
            }
            if (z14) {
                long position2 = r7.getPosition();
                fVar = this;
                if (fVar.J) {
                    fVar.L = position2;
                    uVar.f307a = fVar.K;
                    fVar.J = r4;
                    return 1;
                }
                z11 = true;
                if (fVar.f13900z) {
                    long j25 = fVar.L;
                    if (j25 != -1) {
                        uVar.f307a = j25;
                        fVar.L = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                z11 = true;
                fVar = this;
            }
            z13 = z11;
            z12 = false;
        }
        if (z14) {
            return 0;
        }
        int i74 = 0;
        while (true) {
            SparseArray sparseArray3 = fVar.f13871c;
            if (i74 >= sparseArray3.size()) {
                return -1;
            }
            e eVar7 = (e) sparseArray3.valueAt(i74);
            eVar7.f13835a0.getClass();
            m0 m0Var = eVar7.V;
            if (m0Var != null) {
                m0Var.a(eVar7.f13835a0, eVar7.f13847k);
            }
            i74++;
        }
    }

    @Override
    public final boolean e(r rVar) {
        j0 j0Var = new j0(13, (byte) 0);
        u uVar = (u) j0Var.C;
        m mVar = (m) rVar;
        long j9 = mVar.C;
        long j10 = MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
        if (j9 != -1 && j9 <= MediaStatus.COMMAND_QUEUE_REPEAT_ALL) {
            j10 = j9;
        }
        int i10 = (int) j10;
        mVar.i(uVar.f5182a, 0, 4, false);
        j0Var.B = 4;
        for (long jC = uVar.C(); jC != 440786851; jC = ((jC << 8) & (-256)) | ((long) (uVar.f5182a[0] & 255))) {
            int i11 = j0Var.B + 1;
            j0Var.B = i11;
            if (i11 == i10) {
                return false;
            }
            mVar.i(uVar.f5182a, 0, 1, false);
        }
        long jN = j0Var.n(mVar);
        long j11 = j0Var.B;
        if (jN != Long.MIN_VALUE && (j9 == -1 || j11 + jN < j9)) {
            while (true) {
                long j12 = j0Var.B;
                long j13 = j11 + jN;
                if (j12 < j13) {
                    if (j0Var.n(mVar) == Long.MIN_VALUE) {
                        break;
                    }
                    long jN2 = j0Var.n(mVar);
                    if (jN2 < 0 || jN2 > 2147483647L) {
                        break;
                    }
                    if (jN2 != 0) {
                        int i12 = (int) jN2;
                        mVar.b(i12, false);
                        j0Var.B += i12;
                    }
                } else if (j12 == j13) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(int i10) {
        if (this.D) {
            return;
        }
        throw ParserException.a(null, "Element " + i10 + " must be in a Cues");
    }

    public final void g(int i10) {
        if (this.f13899y != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    public final void h(e eVar, long j9, int i10, int i11, int i12) {
        byte[] bArrI;
        int i13;
        int i14;
        m0 m0Var = eVar.V;
        if (m0Var != null) {
            m0Var.b(eVar.f13835a0, j9, i10, i11, i12, eVar.f13847k);
        } else {
            if ("S_TEXT/UTF8".equals(eVar.f13838c) || "S_TEXT/ASS".equals(eVar.f13838c) || "S_TEXT/SSA".equals(eVar.f13838c) || "S_TEXT/WEBVTT".equals(eVar.f13838c)) {
                if (this.S > 1) {
                    e7.a.m("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j10 = this.Q;
                    if (j10 == -9223372036854775807L) {
                        e7.a.m("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = eVar.f13838c;
                        u uVar = this.m;
                        byte[] bArr = uVar.f5182a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                            case "S_TEXT/SSA":
                                bArrI = i(j10, NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, "%01d:%02d:%02d:%02d");
                                i13 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrI = i(j10, 1000L, "%02d:%02d:%02d.%03d");
                                i13 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrI = i(j10, 1000L, "%02d:%02d:%02d,%03d");
                                i13 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrI, 0, bArr, i13, bArrI.length);
                        for (int i15 = uVar.f5183b; i15 < uVar.f5184c; i15++) {
                            if (uVar.f5182a[i15] == 0) {
                                uVar.M(i15);
                                eVar.f13835a0.g(uVar.f5184c, uVar);
                                i14 = i11 + uVar.f5184c;
                            }
                        }
                        eVar.f13835a0.g(uVar.f5184c, uVar);
                        i14 = i11 + uVar.f5184c;
                    }
                }
                i14 = i11;
            } else {
                i14 = i11;
            }
            if ((i10 & 268435456) != 0) {
                int i16 = this.S;
                u uVar2 = this.f13890p;
                if (i16 > 1) {
                    uVar2.K(0);
                } else {
                    int i17 = uVar2.f5184c;
                    eVar.f13835a0.e(uVar2, i17, 2);
                    i14 += i17;
                }
            }
            eVar.f13835a0.d(j9, i10, i14, i12, eVar.f13847k);
        }
        this.N = true;
    }

    public final void j() {
        if (!this.f13898x) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f13871c;
            if (i10 >= sparseArray.size()) {
                s sVar = this.f13886j0;
                sVar.getClass();
                sVar.q();
                this.f13898x = false;
                return;
            }
            if (((e) sparseArray.valueAt(i10)).W) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void k(r rVar, int i10) {
        u uVar = this.f13883i;
        if (uVar.f5184c >= i10) {
            return;
        }
        byte[] bArr = uVar.f5182a;
        if (bArr.length < i10) {
            uVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = uVar.f5182a;
        int i11 = uVar.f5184c;
        rVar.readFully(bArr2, i11, i10 - i11);
        uVar.M(i10);
    }

    public final void l() {
        this.f13868a0 = 0;
        this.f13870b0 = 0;
        this.f13872c0 = 0;
        this.f13874d0 = false;
        this.f13876e0 = false;
        this.f13878f0 = false;
        this.f13880g0 = 0;
        this.f13882h0 = (byte) 0;
        this.f13884i0 = false;
        this.l.K(0);
    }

    public final long m(long j9) throws ParserException {
        long j10 = this.f13894t;
        if (j10 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = i0.f5136a;
        return i0.Q(j9, j10, 1000L, RoundingMode.DOWN);
    }

    public final int n(r rVar, e eVar, int i10, boolean z10) {
        int iA;
        int iA2;
        boolean z11;
        int i11;
        if ("S_TEXT/UTF8".equals(eVar.f13838c)) {
            o(rVar, f13861k0, i10);
            int i12 = this.f13870b0;
            l();
            return i12;
        }
        if ("S_TEXT/ASS".equals(eVar.f13838c) || "S_TEXT/SSA".equals(eVar.f13838c)) {
            o(rVar, f13863m0, i10);
            int i13 = this.f13870b0;
            l();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(eVar.f13838c)) {
            o(rVar, f13864n0, i10);
            int i14 = this.f13870b0;
            l();
            return i14;
        }
        if (eVar.W) {
            eVar.f13837b0.getClass();
            u uVar = new u(i10);
            if (rVar.i(uVar.f5182a, 0, i10, true)) {
                rVar.t();
                if (a8.b.j(uVar.i()) == 1 && uVar.a() >= 10) {
                    byte[] bArr = new byte[10];
                    uVar.k(0, 10, bArr);
                    uVar.N(0);
                    int iH = a8.b.h(bArr);
                    if (iH > 0 && uVar.a() >= iH + 4) {
                        uVar.O(iH);
                        if (a8.b.j(uVar.m()) == 2) {
                            androidx.media3.common.s sVarA = eVar.f13837b0.a();
                            sVarA.m = x0.n("audio/vnd.dts.hd");
                            eVar.f13837b0 = new t(sVarA);
                        }
                    }
                }
            }
            eVar.f13835a0.f(eVar.f13837b0);
            eVar.W = false;
            j();
        }
        l0 l0Var = eVar.f13835a0;
        boolean z12 = this.f13874d0;
        u uVar2 = this.l;
        if (!z12) {
            boolean z13 = eVar.f13845i;
            u uVar3 = this.f13883i;
            if (z13) {
                this.W &= -1073741825;
                boolean z14 = this.f13876e0;
                int i15 = Cast.MAX_NAMESPACE_LENGTH;
                if (!z14) {
                    rVar.readFully(uVar3.f5182a, 0, 1);
                    this.f13868a0++;
                    byte b7 = uVar3.f5182a[0];
                    if ((b7 & 128) == 128) {
                        throw ParserException.a(null, "Extension bit is set in signal byte");
                    }
                    this.f13882h0 = b7;
                    this.f13876e0 = true;
                }
                byte b10 = this.f13882h0;
                if ((b10 & 1) == 1) {
                    boolean z15 = (b10 & 2) == 2;
                    this.W |= 1073741824;
                    if (!this.f13884i0) {
                        u uVar4 = this.f13888n;
                        rVar.readFully(uVar4.f5182a, 0, 8);
                        this.f13868a0 += 8;
                        this.f13884i0 = true;
                        byte[] bArr2 = uVar3.f5182a;
                        if (!z15) {
                            i15 = 0;
                        }
                        bArr2[0] = (byte) (i15 | 8);
                        uVar3.N(0);
                        l0Var.e(uVar3, 1, 1);
                        this.f13870b0++;
                        uVar4.N(0);
                        l0Var.e(uVar4, 8, 1);
                        this.f13870b0 += 8;
                    }
                    if (z15) {
                        if (!this.f13878f0) {
                            rVar.readFully(uVar3.f5182a, 0, 1);
                            this.f13868a0++;
                            uVar3.N(0);
                            this.f13880g0 = uVar3.A();
                            this.f13878f0 = true;
                        }
                        int i16 = this.f13880g0 * 4;
                        uVar3.K(i16);
                        rVar.readFully(uVar3.f5182a, 0, i16);
                        this.f13868a0 += i16;
                        short s6 = (short) ((this.f13880g0 / 2) + 1);
                        int i17 = (s6 * 6) + 2;
                        ByteBuffer byteBuffer = this.f13891q;
                        if (byteBuffer == null || byteBuffer.capacity() < i17) {
                            this.f13891q = ByteBuffer.allocate(i17);
                        }
                        this.f13891q.position(0);
                        this.f13891q.putShort(s6);
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            i11 = this.f13880g0;
                            if (i18 >= i11) {
                                break;
                            }
                            int iE = uVar3.E();
                            if (i18 % 2 == 0) {
                                this.f13891q.putShort((short) (iE - i19));
                            } else {
                                this.f13891q.putInt(iE - i19);
                            }
                            i18++;
                            i19 = iE;
                        }
                        int i20 = (i10 - this.f13868a0) - i19;
                        if (i11 % 2 == 1) {
                            this.f13891q.putInt(i20);
                        } else {
                            this.f13891q.putShort((short) i20);
                            this.f13891q.putInt(0);
                        }
                        byte[] bArrArray = this.f13891q.array();
                        u uVar5 = this.f13889o;
                        uVar5.L(i17, bArrArray);
                        l0Var.e(uVar5, i17, 1);
                        this.f13870b0 += i17;
                    }
                }
            } else {
                byte[] bArr3 = eVar.f13846j;
                if (bArr3 != null) {
                    uVar2.L(bArr3.length, bArr3);
                }
            }
            if ("A_OPUS".equals(eVar.f13838c)) {
                z11 = z10;
            } else {
                z11 = eVar.f13843g > 0;
            }
            if (z11) {
                this.W |= 268435456;
                this.f13890p.K(0);
                int i21 = (uVar2.f5184c + i10) - this.f13868a0;
                uVar3.K(4);
                byte[] bArr4 = uVar3.f5182a;
                bArr4[0] = (byte) ((i21 >> 24) & 255);
                bArr4[1] = (byte) ((i21 >> 16) & 255);
                bArr4[2] = (byte) ((i21 >> 8) & 255);
                bArr4[3] = (byte) (i21 & 255);
                l0Var.e(uVar3, 4, 2);
                this.f13870b0 += 4;
            }
            this.f13874d0 = true;
        }
        int i22 = i10 + uVar2.f5184c;
        if (!"V_MPEG4/ISO/AVC".equals(eVar.f13838c) && !"V_MPEGH/ISO/HEVC".equals(eVar.f13838c)) {
            if (eVar.V != null) {
                c0.A(uVar2.f5184c == 0);
                eVar.V.c(rVar);
            }
            while (true) {
                int i23 = this.f13868a0;
                if (i23 >= i22) {
                    break;
                }
                int i24 = i22 - i23;
                int iA3 = uVar2.a();
                if (iA3 > 0) {
                    iA2 = Math.min(i24, iA3);
                    l0Var.g(iA2, uVar2);
                } else {
                    iA2 = l0Var.a(rVar, i24, false);
                }
                this.f13868a0 += iA2;
                this.f13870b0 += iA2;
            }
        } else {
            u uVar6 = this.f13881h;
            byte[] bArr5 = uVar6.f5182a;
            bArr5[0] = 0;
            bArr5[1] = 0;
            bArr5[2] = 0;
            int i25 = eVar.f13839c0;
            int i26 = 4 - i25;
            while (this.f13868a0 < i22) {
                int i27 = this.f13872c0;
                if (i27 == 0) {
                    int iMin = Math.min(i25, uVar2.a());
                    rVar.readFully(bArr5, i26 + iMin, i25 - iMin);
                    if (iMin > 0) {
                        uVar2.k(i26, iMin, bArr5);
                    }
                    this.f13868a0 += i25;
                    uVar6.N(0);
                    this.f13872c0 = uVar6.E();
                    u uVar7 = this.f13879g;
                    uVar7.N(0);
                    l0Var.g(4, uVar7);
                    this.f13870b0 += 4;
                } else {
                    int iA4 = uVar2.a();
                    if (iA4 > 0) {
                        iA = Math.min(i27, iA4);
                        l0Var.g(iA, uVar2);
                    } else {
                        iA = l0Var.a(rVar, i27, false);
                    }
                    this.f13868a0 += iA;
                    this.f13870b0 += iA;
                    this.f13872c0 -= iA;
                }
            }
        }
        if ("A_VORBIS".equals(eVar.f13838c)) {
            u uVar8 = this.f13885j;
            uVar8.N(0);
            l0Var.g(4, uVar8);
            this.f13870b0 += 4;
        }
        int i28 = this.f13870b0;
        l();
        return i28;
    }

    public final void o(r rVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        u uVar = this.m;
        byte[] bArr2 = uVar.f5182a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i10);
            uVar.getClass();
            uVar.L(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        rVar.readFully(uVar.f5182a, bArr.length, i10);
        uVar.N(0);
        uVar.M(length);
    }

    @Override
    public final void release() {
    }
}
