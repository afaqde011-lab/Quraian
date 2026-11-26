package u8;

import a8.b0;
import a8.h0;
import a8.l0;
import a8.m0;
import a8.v;
import a8.y;
import androidx.media3.common.ParserException;
import androidx.media3.common.u0;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaStatus;
import e7.u;
import fh.d2;
import fh.r0;
import fh.t0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import ta.c0;

public final class l implements a8.q {
    public long A;
    public a8.s B;
    public k[] C;
    public long[][] D;
    public int E;
    public j8.b F;

    public final x8.i f15061a;

    public final int f15062b;

    public final boolean f15063c;

    public final u f15064d;

    public final u f15065e;

    public final u f15066f;

    public final u f15067g;

    public final ArrayDeque f15068h;

    public final o f15069i;

    public final ArrayList f15070j;

    public d2 f15071k;
    public int l;
    public int m;

    public long f15072n;

    public int f15073o;

    public u f15074p;

    public int f15075q;

    public int f15076r;

    public int f15077s;

    public int f15078t;

    public boolean f15079u;

    public boolean f15080v;

    public boolean f15081w;

    public long f15082x;

    public boolean f15083y;

    public boolean f15084z;

    public l(x8.i iVar, int i10) {
        this.f15061a = iVar;
        this.f15062b = i10;
        this.f15063c = (i10 & 256) != 0;
        r0 r0Var = t0.B;
        this.f15071k = d2.E;
        this.l = (i10 & 4) != 0 ? 3 : 0;
        this.f15069i = new o();
        this.f15070j = new ArrayList();
        this.f15067g = new u(16);
        this.f15068h = new ArrayDeque();
        this.f15064d = new u(f7.p.f5547a);
        this.f15065e = new u(6);
        this.f15066f = new u();
        this.f15075q = -1;
        this.B = a8.s.f306a;
        this.C = new k[0];
    }

    @Override
    public final void a(a8.s sVar) {
        if ((this.f15062b & 16) == 0) {
            sVar = new c7.c(sVar, this.f15061a);
        }
        this.B = sVar;
    }

    @Override
    public final void b(long j9, long j10) {
        this.f15068h.clear();
        this.f15073o = 0;
        this.f15075q = -1;
        this.f15076r = 0;
        this.f15077s = 0;
        this.f15078t = 0;
        this.f15079u = false;
        this.f15084z = false;
        if (j9 == 0) {
            if (this.l != 3) {
                this.l = 0;
                this.f15073o = 0;
                return;
            } else {
                o oVar = this.f15069i;
                oVar.f15089a.clear();
                oVar.f15090b = 0;
                this.f15070j.clear();
                return;
            }
        }
        for (k kVar : this.C) {
            t tVar = kVar.f15056b;
            int iA = tVar.a(j10);
            if (iA == -1) {
                iA = tVar.b(j10);
            }
            kVar.f15059e = iA;
            m0 m0Var = kVar.f15058d;
            if (m0Var != null) {
                m0Var.f293b = false;
                m0Var.f294c = 0;
            }
        }
    }

    @Override
    public final List c() {
        return this.f15071k;
    }

    @Override
    public final int d(a8.r rVar, a8.u uVar) throws ParserException {
        char c10;
        char c11;
        int i10;
        int i11;
        int i12;
        u uVar2;
        byte b7;
        char c12;
        int i13;
        ArrayList arrayList;
        List listC;
        int i14;
        List listC2;
        boolean z10;
        boolean z11;
        long j9;
        long length;
        f7.c cVar;
        long j10;
        long j11;
        int i15;
        boolean z12;
        long j12;
        long j13;
        long j14;
        boolean z13;
        if (!this.f15063c || !this.f15084z) {
            while (true) {
                int i16 = this.l;
                ArrayDeque arrayDeque = this.f15068h;
                int i17 = this.f15062b;
                u uVar3 = this.f15066f;
                int i18 = 4;
                char c13 = 2;
                if (i16 == 0) {
                    int i19 = this.f15073o;
                    u uVar4 = this.f15067g;
                    if (i19 != 0) {
                        j9 = this.f15072n;
                        if (j9 == 1) {
                            rVar.readFully(uVar4.f5182a, 8, 8);
                            this.f15073o += 8;
                            this.f15072n = uVar4.G();
                        } else if (j9 == 0) {
                            length = rVar.getLength();
                            if (length == -1 && (cVar = (f7.c) arrayDeque.peek()) != null) {
                                length = cVar.C;
                            }
                            if (length != -1) {
                                this.f15072n = (length - rVar.getPosition()) + ((long) this.f15073o);
                            }
                        }
                        j10 = this.f15072n;
                        int i20 = this.f15073o;
                        j11 = i20;
                        if (j10 < j11) {
                            if (this.m == 1718773093 || i20 != 8) {
                                throw ParserException.c("Atom size less than header length (unsupported).");
                            }
                            this.f15072n = j11;
                        }
                        i15 = this.m;
                        if (i15 != 1836019574 || i15 == 1953653099 || i15 == 1835297121 || i15 == 1835626086 || i15 == 1937007212 || i15 == 1701082227 || i15 == 1835365473 || i15 == 1635284069) {
                            z12 = true;
                            long position = rVar.getPosition();
                            j12 = this.f15072n;
                            j13 = this.f15073o;
                            j14 = (position + j12) - j13;
                            if (j12 != j13 && this.m == 1835365473) {
                                uVar3.K(8);
                                rVar.a(0, 8, uVar3.f5182a);
                                c.a(uVar3);
                                rVar.u(uVar3.f5183b);
                                rVar.t();
                            }
                            arrayDeque.push(new f7.c(this.m, j14));
                            if (this.f15072n == this.f15073o) {
                                f(j14);
                            } else {
                                this.l = 0;
                                this.f15073o = 0;
                            }
                        } else if (i15 == 1835296868 || i15 == 1836476516 || i15 == 1751411826 || i15 == 1937011556 || i15 == 1937011827 || i15 == 1937011571 || i15 == 1668576371 || i15 == 1701606260 || i15 == 1937011555 || i15 == 1937011578 || i15 == 1937013298 || i15 == 1937007471 || i15 == 1668232756 || i15 == 1953196132 || i15 == 1718909296 || i15 == 1969517665 || i15 == 1801812339 || i15 == 1768715124) {
                            c0.A(i20 == 8);
                            c0.A(this.f15072n <= 2147483647L);
                            u uVar5 = new u((int) this.f15072n);
                            System.arraycopy(uVar4.f5182a, 0, uVar5.f5182a, 0, 8);
                            this.f15074p = uVar5;
                            z12 = true;
                            this.l = 1;
                        } else {
                            long position2 = rVar.getPosition();
                            long j15 = this.f15073o;
                            long j16 = position2 - j15;
                            if (this.m == 1836086884) {
                                this.F = new j8.b(0L, j16, -9223372036854775807L, j16 + j15, this.f15072n - j15);
                            }
                            this.f15074p = null;
                            this.l = 1;
                            z12 = true;
                        }
                        z13 = z12;
                    } else if (rVar.d(uVar4.f5182a, 0, 8, true)) {
                        this.f15073o = 8;
                        uVar4.N(0);
                        this.f15072n = uVar4.C();
                        this.m = uVar4.m();
                        j9 = this.f15072n;
                        if (j9 == 1) {
                            rVar.readFully(uVar4.f5182a, 8, 8);
                            this.f15073o += 8;
                            this.f15072n = uVar4.G();
                        } else if (j9 == 0) {
                            length = rVar.getLength();
                            if (length == -1) {
                                length = cVar.C;
                            }
                            if (length != -1) {
                                this.f15072n = (length - rVar.getPosition()) + ((long) this.f15073o);
                            }
                        }
                        j10 = this.f15072n;
                        int i21 = this.f15073o;
                        j11 = i21;
                        if (j10 < j11) {
                            if (this.m == 1718773093) {
                            }
                            throw ParserException.c("Atom size less than header length (unsupported).");
                        }
                        i15 = this.m;
                        if (i15 != 1836019574) {
                            z12 = true;
                            long position3 = rVar.getPosition();
                            j12 = this.f15072n;
                            j13 = this.f15073o;
                            j14 = (position3 + j12) - j13;
                            if (j12 != j13) {
                                uVar3.K(8);
                                rVar.a(0, 8, uVar3.f5182a);
                                c.a(uVar3);
                                rVar.u(uVar3.f5183b);
                                rVar.t();
                            }
                            arrayDeque.push(new f7.c(this.m, j14));
                            if (this.f15072n == this.f15073o) {
                                f(j14);
                            } else {
                                this.l = 0;
                                this.f15073o = 0;
                            }
                        } else {
                            z12 = true;
                            long position4 = rVar.getPosition();
                            j12 = this.f15072n;
                            j13 = this.f15073o;
                            j14 = (position4 + j12) - j13;
                            if (j12 != j13) {
                                uVar3.K(8);
                                rVar.a(0, 8, uVar3.f5182a);
                                c.a(uVar3);
                                rVar.u(uVar3.f5183b);
                                rVar.t();
                            }
                            arrayDeque.push(new f7.c(this.m, j14));
                            if (this.f15072n == this.f15073o) {
                                f(j14);
                            } else {
                                this.l = 0;
                                this.f15073o = 0;
                            }
                        }
                        z13 = z12;
                    } else {
                        if (this.E == 2 && (i17 & 2) != 0) {
                            l0 l0VarW = this.B.w(0, 4);
                            j8.b bVar = this.F;
                            v0 v0Var = bVar == null ? null : new v0(bVar);
                            androidx.media3.common.s sVar = new androidx.media3.common.s();
                            sVar.f1501k = v0Var;
                            oi.k.w(sVar, l0VarW);
                            this.B.q();
                            this.B.b(new v(-9223372036854775807L));
                        }
                        z13 = false;
                    }
                    if (!z13) {
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            long position5 = rVar.getPosition();
                            if (this.f15075q == -1) {
                                boolean z14 = true;
                                int i22 = 0;
                                int i23 = -1;
                                int i24 = -1;
                                boolean z15 = true;
                                long j17 = Long.MAX_VALUE;
                                long j18 = Long.MAX_VALUE;
                                long j19 = Long.MAX_VALUE;
                                while (true) {
                                    k[] kVarArr = this.C;
                                    if (i22 >= kVarArr.length) {
                                        break;
                                    }
                                    k kVar = kVarArr[i22];
                                    int i25 = kVar.f15059e;
                                    t tVar = kVar.f15056b;
                                    char c14 = c13;
                                    if (i25 != tVar.f15125b) {
                                        long j20 = tVar.f15126c[i25];
                                        long[][] jArr = this.D;
                                        jArr.getClass();
                                        long j21 = jArr[i22][i25];
                                        long j22 = j20 - position5;
                                        boolean z16 = j22 < 0 || j22 >= MediaStatus.COMMAND_STREAM_TRANSFER;
                                        if ((!z16 && z14) || (z16 == z14 && j22 < j19)) {
                                            z14 = z16;
                                            i24 = i22;
                                            j19 = j22;
                                            j18 = j21;
                                        }
                                        if (j21 < j17) {
                                            z15 = z16;
                                            i23 = i22;
                                            j17 = j21;
                                        }
                                    }
                                    i22++;
                                    c13 = c14;
                                }
                                c10 = c13;
                                if (j17 == Long.MAX_VALUE || !z15 || j18 < j17 + 10485760) {
                                    i23 = i24;
                                }
                                this.f15075q = i23;
                                if (i23 == -1) {
                                    return -1;
                                }
                            } else {
                                c10 = 2;
                            }
                            k kVar2 = this.C[this.f15075q];
                            l0 l0Var = kVar2.f15057c;
                            t tVar2 = kVar2.f15056b;
                            q qVar = kVar2.f15055a;
                            int i26 = kVar2.f15059e;
                            long[] jArr2 = tVar2.f15126c;
                            int[] iArr = tVar2.f15127d;
                            long j23 = jArr2[i26] + this.A;
                            int i27 = iArr[i26];
                            m0 m0Var = kVar2.f15058d;
                            long j24 = (j23 - position5) + ((long) this.f15076r);
                            if (j24 < 0 || j24 >= MediaStatus.COMMAND_STREAM_TRANSFER) {
                                uVar.f307a = j23;
                                return 1;
                            }
                            int i28 = qVar.f15100h;
                            int i29 = qVar.f15103k;
                            androidx.media3.common.t tVar3 = qVar.f15099g;
                            if (i28 == 1) {
                                j24 += 8;
                                i27 -= 8;
                            }
                            rVar.u((int) j24);
                            String str = tVar3.f1594n;
                            String str2 = tVar3.f1594n;
                            if (!Objects.equals(str, "video/avc") ? !Objects.equals(str2, "video/hevc") || (i17 & Cast.MAX_NAMESPACE_LENGTH) == 0 : (i17 & 32) == 0) {
                                c11 = 1;
                                this.f15079u = true;
                            } else {
                                c11 = 1;
                            }
                            if (i29 == 0) {
                                if ("audio/ac4".equals(str2)) {
                                    if (this.f15077s == 0) {
                                        a8.b.g(i27, uVar3);
                                        l0Var.g(7, uVar3);
                                        this.f15077s += 7;
                                    }
                                    i27 += 7;
                                } else if (kVar2.f15060f != null && Objects.equals(str2, "audio/mpeg")) {
                                    androidx.media3.common.t tVar4 = kVar2.f15060f;
                                    uVar3.K(4);
                                    rVar.a(0, 4, uVar3.f5182a);
                                    rVar.t();
                                    b0 b0Var = new b0();
                                    l0 l0Var2 = kVar2.f15057c;
                                    if (b0Var.a(uVar3.m()) && !Objects.equals(tVar4.f1594n, (String) b0Var.f228g)) {
                                        androidx.media3.common.s sVarA = tVar4.a();
                                        String str3 = (String) b0Var.f228g;
                                        str3.getClass();
                                        sVarA.m = x0.n(str3);
                                        tVar4 = new androidx.media3.common.t(sVarA);
                                    }
                                    l0Var2.f(tVar4);
                                    kVar2.f15060f = null;
                                } else if (m0Var != null) {
                                    m0Var.c(rVar);
                                }
                                while (true) {
                                    int i30 = this.f15077s;
                                    if (i30 >= i27) {
                                        break;
                                    }
                                    int iA = l0Var.a(rVar, i27 - i30, false);
                                    this.f15076r += iA;
                                    this.f15077s += iA;
                                    this.f15078t -= iA;
                                }
                            } else {
                                u uVar6 = this.f15065e;
                                byte[] bArr = uVar6.f5182a;
                                bArr[0] = 0;
                                bArr[c11] = 0;
                                bArr[c10] = 0;
                                int i31 = 4 - i29;
                                i27 += i31;
                                while (this.f15077s < i27) {
                                    int i32 = this.f15078t;
                                    if (i32 == 0) {
                                        if (this.f15079u || f7.p.e(tVar3) + i29 > iArr[i26] - this.f15076r) {
                                            i10 = i29;
                                            i11 = 0;
                                        } else {
                                            int iE = f7.p.e(tVar3);
                                            i10 = i29 + iE;
                                            i11 = iE;
                                        }
                                        rVar.readFully(bArr, i31, i10);
                                        this.f15076r += i10;
                                        uVar6.N(0);
                                        int iM = uVar6.m();
                                        if (iM < 0) {
                                            throw ParserException.a(null, "Invalid NAL length");
                                        }
                                        this.f15078t = iM - i11;
                                        u uVar7 = this.f15064d;
                                        uVar7.N(0);
                                        l0Var.g(4, uVar7);
                                        this.f15077s += 4;
                                        if (i11 > 0) {
                                            l0Var.g(i11, uVar6);
                                            this.f15077s += i11;
                                            if (f7.p.d(bArr, i11, tVar3)) {
                                                this.f15079u = true;
                                            }
                                        }
                                    } else {
                                        int iA2 = l0Var.a(rVar, i32, false);
                                        this.f15076r += iA2;
                                        this.f15077s += iA2;
                                        this.f15078t -= iA2;
                                    }
                                }
                            }
                            int i33 = i27;
                            long j25 = tVar2.f15129f[i26];
                            int i34 = tVar2.f15130g[i26];
                            if (!this.f15079u) {
                                i34 |= 67108864;
                            }
                            int i35 = i34;
                            if (m0Var != null) {
                                m0Var.b(l0Var, j25, i35, i33, 0, null);
                                if (i26 + 1 == tVar2.f15125b) {
                                    m0Var.a(l0Var, null);
                                }
                            } else {
                                l0Var.d(j25, i35, i33, 0, null);
                            }
                            kVar2.f15059e++;
                            this.f15075q = -1;
                            this.f15076r = 0;
                            this.f15077s = 0;
                            this.f15078t = 0;
                            this.f15079u = false;
                            return 0;
                        }
                        if (i16 != 3) {
                            throw new IllegalStateException();
                        }
                        o oVar = this.f15069i;
                        ArrayList arrayList2 = oVar.f15089a;
                        int i36 = oVar.f15090b;
                        if (i36 != 0) {
                            if (i36 != 1) {
                                short s6 = 2817;
                                short s10 = 2816;
                                short s11 = 2192;
                                if (i36 == 2) {
                                    long length2 = rVar.getLength();
                                    int i37 = oVar.f15091c - 20;
                                    u uVar8 = new u(i37);
                                    rVar.readFully(uVar8.f5182a, 0, i37);
                                    int i38 = 0;
                                    while (i38 < i37 / 12) {
                                        uVar8.O(2);
                                        short sQ = uVar8.q();
                                        if (sQ != s11 && sQ != s10 && sQ != s6 && sQ != 2819) {
                                            if (sQ != 2820) {
                                                uVar8.O(8);
                                                uVar2 = uVar8;
                                            }
                                            i38++;
                                            uVar8 = uVar2;
                                            s6 = 2817;
                                            s11 = 2192;
                                            s10 = 2816;
                                        }
                                        uVar2 = uVar8;
                                        arrayList2.add(new n((length2 - ((long) oVar.f15091c)) - ((long) uVar8.o()), uVar2.o()));
                                        i38++;
                                        uVar8 = uVar2;
                                        s6 = 2817;
                                        s11 = 2192;
                                        s10 = 2816;
                                    }
                                    if (arrayList2.isEmpty()) {
                                        uVar.f307a = 0L;
                                    } else {
                                        oVar.f15090b = 3;
                                        uVar.f307a = ((n) arrayList2.get(0)).f15085a;
                                    }
                                } else {
                                    if (i36 != 3) {
                                        throw new IllegalStateException();
                                    }
                                    long position6 = rVar.getPosition();
                                    int length3 = (int) ((rVar.getLength() - rVar.getPosition()) - ((long) oVar.f15091c));
                                    u uVar9 = new u(length3);
                                    rVar.readFully(uVar9.f5182a, 0, length3);
                                    int i39 = 0;
                                    while (i39 < arrayList2.size()) {
                                        n nVar = (n) arrayList2.get(i39);
                                        uVar9.N((int) (nVar.f15085a - position6));
                                        uVar9.O(i18);
                                        int iO = uVar9.o();
                                        Charset charset = StandardCharsets.UTF_8;
                                        String strY = uVar9.y(iO, charset);
                                        switch (strY.hashCode()) {
                                            case -1711564334:
                                                if (strY.equals("SlowMotion_Data")) {
                                                    b7 = 0;
                                                }
                                                switch (b7) {
                                                    case 0:
                                                        c12 = 2192;
                                                        break;
                                                    case 1:
                                                        c12 = 2819;
                                                        break;
                                                    case 2:
                                                        c12 = 2816;
                                                        break;
                                                    case 3:
                                                        c12 = 2820;
                                                        break;
                                                    case 4:
                                                        c12 = 2817;
                                                        break;
                                                    default:
                                                        throw ParserException.a(null, "Invalid SEF name");
                                                }
                                                i13 = nVar.f15086b - (iO + 8);
                                                if (c12 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listC = o.f15088e.C(uVar9.y(i13, charset));
                                                    for (i14 = 0; i14 < listC.size(); i14++) {
                                                        listC2 = o.f15087d.C((CharSequence) listC.get(i14));
                                                        if (listC2.size() == 3) {
                                                            throw ParserException.a(null, null);
                                                        }
                                                        try {
                                                            arrayList.add(new p8.a(1 << (Integer.parseInt((String) listC2.get(2)) - 1), Long.parseLong((String) listC2.get(0)), Long.parseLong((String) listC2.get(1))));
                                                        } catch (NumberFormatException e3) {
                                                            throw ParserException.a(e3, null);
                                                        }
                                                    }
                                                    this.f15070j.add(new p8.b(arrayList));
                                                } else if (c12 != 2816 && c12 != 2817 && c12 != 2819 && c12 != 2820) {
                                                    throw new IllegalStateException();
                                                }
                                                i39++;
                                                i18 = 4;
                                                break;
                                            case -1332107749:
                                                if (strY.equals("Super_SlowMotion_Edit_Data")) {
                                                    b7 = 1;
                                                }
                                                switch (b7) {
                                                    case 0:
                                                        c12 = 2192;
                                                        break;
                                                    case 1:
                                                        c12 = 2819;
                                                        break;
                                                    case 2:
                                                        c12 = 2816;
                                                        break;
                                                    case 3:
                                                        c12 = 2820;
                                                        break;
                                                    case 4:
                                                        c12 = 2817;
                                                        break;
                                                    default:
                                                        throw ParserException.a(null, "Invalid SEF name");
                                                }
                                                i13 = nVar.f15086b - (iO + 8);
                                                if (c12 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listC = o.f15088e.C(uVar9.y(i13, charset));
                                                    while (i14 < listC.size()) {
                                                        listC2 = o.f15087d.C((CharSequence) listC.get(i14));
                                                        if (listC2.size() == 3) {
                                                            throw ParserException.a(null, null);
                                                        }
                                                        arrayList.add(new p8.a(1 << (Integer.parseInt((String) listC2.get(2)) - 1), Long.parseLong((String) listC2.get(0)), Long.parseLong((String) listC2.get(1))));
                                                    }
                                                    this.f15070j.add(new p8.b(arrayList));
                                                } else if (c12 != 2816) {
                                                    continue;
                                                }
                                                i39++;
                                                i18 = 4;
                                                break;
                                            case -1251387154:
                                                if (strY.equals("Super_SlowMotion_Data")) {
                                                    b7 = 2;
                                                }
                                                switch (b7) {
                                                    case 0:
                                                        c12 = 2192;
                                                        break;
                                                    case 1:
                                                        c12 = 2819;
                                                        break;
                                                    case 2:
                                                        c12 = 2816;
                                                        break;
                                                    case 3:
                                                        c12 = 2820;
                                                        break;
                                                    case 4:
                                                        c12 = 2817;
                                                        break;
                                                    default:
                                                        throw ParserException.a(null, "Invalid SEF name");
                                                }
                                                i13 = nVar.f15086b - (iO + 8);
                                                if (c12 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listC = o.f15088e.C(uVar9.y(i13, charset));
                                                    while (i14 < listC.size()) {
                                                        listC2 = o.f15087d.C((CharSequence) listC.get(i14));
                                                        if (listC2.size() == 3) {
                                                            throw ParserException.a(null, null);
                                                        }
                                                        arrayList.add(new p8.a(1 << (Integer.parseInt((String) listC2.get(2)) - 1), Long.parseLong((String) listC2.get(0)), Long.parseLong((String) listC2.get(1))));
                                                    }
                                                    this.f15070j.add(new p8.b(arrayList));
                                                } else if (c12 != 2816) {
                                                    continue;
                                                }
                                                i39++;
                                                i18 = 4;
                                                break;
                                            case -830665521:
                                                if (strY.equals("Super_SlowMotion_Deflickering_On")) {
                                                    b7 = 3;
                                                }
                                                switch (b7) {
                                                    case 0:
                                                        c12 = 2192;
                                                        break;
                                                    case 1:
                                                        c12 = 2819;
                                                        break;
                                                    case 2:
                                                        c12 = 2816;
                                                        break;
                                                    case 3:
                                                        c12 = 2820;
                                                        break;
                                                    case 4:
                                                        c12 = 2817;
                                                        break;
                                                    default:
                                                        throw ParserException.a(null, "Invalid SEF name");
                                                }
                                                i13 = nVar.f15086b - (iO + 8);
                                                if (c12 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listC = o.f15088e.C(uVar9.y(i13, charset));
                                                    while (i14 < listC.size()) {
                                                        listC2 = o.f15087d.C((CharSequence) listC.get(i14));
                                                        if (listC2.size() == 3) {
                                                            throw ParserException.a(null, null);
                                                        }
                                                        arrayList.add(new p8.a(1 << (Integer.parseInt((String) listC2.get(2)) - 1), Long.parseLong((String) listC2.get(0)), Long.parseLong((String) listC2.get(1))));
                                                    }
                                                    this.f15070j.add(new p8.b(arrayList));
                                                } else if (c12 != 2816) {
                                                    continue;
                                                }
                                                i39++;
                                                i18 = 4;
                                                break;
                                            case 1760745220:
                                                if (strY.equals("Super_SlowMotion_BGM")) {
                                                    b7 = 4;
                                                }
                                                switch (b7) {
                                                    case 0:
                                                        c12 = 2192;
                                                        break;
                                                    case 1:
                                                        c12 = 2819;
                                                        break;
                                                    case 2:
                                                        c12 = 2816;
                                                        break;
                                                    case 3:
                                                        c12 = 2820;
                                                        break;
                                                    case 4:
                                                        c12 = 2817;
                                                        break;
                                                    default:
                                                        throw ParserException.a(null, "Invalid SEF name");
                                                }
                                                i13 = nVar.f15086b - (iO + 8);
                                                if (c12 != 2192) {
                                                    arrayList = new ArrayList();
                                                    listC = o.f15088e.C(uVar9.y(i13, charset));
                                                    while (i14 < listC.size()) {
                                                        listC2 = o.f15087d.C((CharSequence) listC.get(i14));
                                                        if (listC2.size() == 3) {
                                                            throw ParserException.a(null, null);
                                                        }
                                                        arrayList.add(new p8.a(1 << (Integer.parseInt((String) listC2.get(2)) - 1), Long.parseLong((String) listC2.get(0)), Long.parseLong((String) listC2.get(1))));
                                                    }
                                                    this.f15070j.add(new p8.b(arrayList));
                                                } else if (c12 != 2816) {
                                                    continue;
                                                }
                                                i39++;
                                                i18 = 4;
                                                break;
                                        }
                                        b7 = -1;
                                        switch (b7) {
                                            case 0:
                                                c12 = 2192;
                                                break;
                                            case 1:
                                                c12 = 2819;
                                                break;
                                            case 2:
                                                c12 = 2816;
                                                break;
                                            case 3:
                                                c12 = 2820;
                                                break;
                                            case 4:
                                                c12 = 2817;
                                                break;
                                            default:
                                                throw ParserException.a(null, "Invalid SEF name");
                                        }
                                        i13 = nVar.f15086b - (iO + 8);
                                        if (c12 != 2192) {
                                            arrayList = new ArrayList();
                                            listC = o.f15088e.C(uVar9.y(i13, charset));
                                            while (i14 < listC.size()) {
                                                listC2 = o.f15087d.C((CharSequence) listC.get(i14));
                                                if (listC2.size() == 3) {
                                                    throw ParserException.a(null, null);
                                                }
                                                arrayList.add(new p8.a(1 << (Integer.parseInt((String) listC2.get(2)) - 1), Long.parseLong((String) listC2.get(0)), Long.parseLong((String) listC2.get(1))));
                                            }
                                            this.f15070j.add(new p8.b(arrayList));
                                        } else if (c12 != 2816) {
                                            continue;
                                        }
                                        i39++;
                                        i18 = 4;
                                    }
                                    uVar.f307a = 0L;
                                }
                            } else {
                                u uVar10 = new u(8);
                                rVar.readFully(uVar10.f5182a, 0, 8);
                                oVar.f15091c = uVar10.o() + 8;
                                if (uVar10.m() != 1397048916) {
                                    uVar.f307a = 0L;
                                } else {
                                    uVar.f307a = rVar.getPosition() - ((long) (oVar.f15091c - 12));
                                    oVar.f15090b = 2;
                                }
                            }
                            i12 = 1;
                        } else {
                            long length4 = rVar.getLength();
                            uVar.f307a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                            i12 = 1;
                            oVar.f15090b = 1;
                        }
                        if (uVar.f307a != 0) {
                            return i12;
                        }
                        this.l = 0;
                        this.f15073o = 0;
                        return i12;
                    }
                    long j26 = this.f15072n - ((long) this.f15073o);
                    long position7 = rVar.getPosition() + j26;
                    u uVar11 = this.f15074p;
                    if (uVar11 != null) {
                        rVar.readFully(uVar11.f5182a, this.f15073o, (int) j26);
                        if (this.m == 1718909296) {
                            this.f15080v = true;
                            uVar11.N(8);
                            int iM2 = uVar11.m();
                            int i40 = iM2 != 1751476579 ? iM2 != 1903435808 ? 0 : 1 : 2;
                            if (i40 == 0) {
                                uVar11.O(4);
                                do {
                                    if (uVar11.a() <= 0) {
                                        i40 = 0;
                                        break;
                                    }
                                    int iM3 = uVar11.m();
                                    i40 = iM3 != 1751476579 ? iM3 != 1903435808 ? 0 : 1 : 2;
                                } while (i40 == 0);
                            }
                            this.E = i40;
                        } else if (!arrayDeque.isEmpty()) {
                            ((f7.c) arrayDeque.peek()).D.add(new f7.d(this.m, uVar11));
                        }
                    } else {
                        if (!this.f15080v && this.m == 1835295092) {
                            this.E = 1;
                        }
                        if (j26 < MediaStatus.COMMAND_STREAM_TRANSFER) {
                            rVar.u((int) j26);
                        } else {
                            uVar.f307a = rVar.getPosition() + j26;
                            z10 = true;
                        }
                        f(position7);
                        if (this.f15081w) {
                            this.f15083y = true;
                            uVar.f307a = this.f15082x;
                            this.f15081w = false;
                            z10 = true;
                        }
                        if (z10 || this.l == 2) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            return 1;
                        }
                    }
                    z10 = false;
                    f(position7);
                    if (this.f15081w) {
                        this.f15083y = true;
                        uVar.f307a = this.f15082x;
                        this.f15081w = false;
                        z10 = true;
                    }
                    if (z10) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    @Override
    public final boolean e(a8.r rVar) {
        d2 d2VarS;
        h0 h0VarM = p.m(rVar, false, (this.f15062b & 2) != 0);
        if (h0VarM != null) {
            d2VarS = t0.s(h0VarM);
        } else {
            r0 r0Var = t0.B;
            d2VarS = d2.E;
        }
        this.f15071k = d2VarS;
        return h0VarM == null;
    }

    public final void f(long j9) {
        int i10;
        ArrayList arrayList;
        v0 v0VarF;
        boolean z10;
        ArrayDeque arrayDeque;
        boolean z11;
        v0 v0VarK;
        long[][] jArr;
        int i11;
        String str;
        int i12;
        v0 v0Var;
        long j10;
        int i13;
        int i14;
        int i15;
        v0 v0Var2;
        ArrayList arrayList2;
        v0 v0Var3;
        v0 v0Var4;
        v0 v0Var5;
        v0 v0Var6;
        int i16;
        int i17;
        int i18;
        u0 u0Var;
        u0 u0Var2;
        u0 u0Var3;
        int i19;
        while (true) {
            ArrayDeque arrayDeque2 = this.f15068h;
            int i20 = 0;
            if (arrayDeque2.isEmpty() || ((f7.c) arrayDeque2.peek()).C != j9) {
                break;
            }
            f7.c cVar = (f7.c) arrayDeque2.pop();
            if (cVar.B == 1836019574) {
                f7.c cVarQ = cVar.q(1835365473);
                ArrayList arrayList3 = new ArrayList();
                boolean z12 = this.f15063c;
                long j11 = 0;
                int i21 = this.f15062b;
                if (cVarQ != null) {
                    v0VarF = c.f(cVarQ);
                    if (this.f15083y) {
                        v0VarF.getClass();
                        u0[] u0VarArr = v0VarF.f1660a;
                        int length = u0VarArr.length;
                        int i22 = 0;
                        while (true) {
                            if (i22 >= length) {
                                u0Var2 = null;
                                break;
                            }
                            u0 u0Var4 = u0VarArr[i22];
                            if (f7.a.class.isAssignableFrom(u0Var4.getClass())) {
                                u0Var2 = (u0) f7.a.class.cast(u0Var4);
                                if (!((f7.a) u0Var2).f5489a.equals("auxiliary.tracks.interleaved")) {
                                    u0Var2 = null;
                                }
                            } else {
                                u0Var2 = null;
                            }
                            if (u0Var2 != null) {
                                break;
                            } else {
                                i22++;
                            }
                        }
                        f7.a aVar = (f7.a) u0Var2;
                        if (aVar != null && aVar.f5490b[0] == 0) {
                            this.A = this.f15082x + 16;
                        }
                        int length2 = u0VarArr.length;
                        int i23 = 0;
                        while (true) {
                            if (i23 >= length2) {
                                u0Var3 = null;
                                break;
                            }
                            u0 u0Var5 = u0VarArr[i23];
                            if (f7.a.class.isAssignableFrom(u0Var5.getClass())) {
                                u0Var3 = (u0) f7.a.class.cast(u0Var5);
                                if (!((f7.a) u0Var3).f5489a.equals("auxiliary.tracks.map")) {
                                    u0Var3 = null;
                                }
                            } else {
                                u0Var3 = null;
                            }
                            if (u0Var3 != null) {
                                break;
                            } else {
                                i23++;
                            }
                        }
                        f7.a aVar2 = (f7.a) u0Var3;
                        aVar2.getClass();
                        ArrayList arrayListD = aVar2.d();
                        ArrayList arrayList4 = new ArrayList(arrayListD.size());
                        for (int i24 = 0; i24 < arrayListD.size(); i24++) {
                            int iIntValue = ((Integer) arrayListD.get(i24)).intValue();
                            if (iIntValue == 0) {
                                i19 = 1;
                            } else if (iIntValue != 1) {
                                i19 = 3;
                                if (iIntValue != 2) {
                                    i19 = iIntValue != 3 ? 0 : 4;
                                }
                            } else {
                                i19 = 2;
                            }
                            arrayList4.add(Integer.valueOf(i19));
                        }
                        i10 = 0;
                        arrayList = arrayList4;
                    } else {
                        if (v0VarF == null || (i21 & 64) == 0) {
                            i10 = 0;
                        } else {
                            u0[] u0VarArr2 = v0VarF.f1660a;
                            int length3 = u0VarArr2.length;
                            int i25 = 0;
                            while (true) {
                                if (i25 >= length3) {
                                    i10 = i20;
                                    u0Var = null;
                                    break;
                                }
                                u0 u0Var6 = u0VarArr2[i25];
                                if (f7.a.class.isAssignableFrom(u0Var6.getClass())) {
                                    u0Var = (u0) f7.a.class.cast(u0Var6);
                                    i10 = i20;
                                    if (!((f7.a) u0Var).f5489a.equals("auxiliary.tracks.offset")) {
                                    }
                                    if (u0Var != null) {
                                        break;
                                    }
                                    i25++;
                                    i20 = i10;
                                } else {
                                    i10 = i20;
                                }
                                u0Var = null;
                                if (u0Var != null) {
                                    break;
                                    break;
                                } else {
                                    i25++;
                                    i20 = i10;
                                }
                            }
                            f7.a aVar3 = (f7.a) u0Var;
                            if (aVar3 != null) {
                                long jG = new u(aVar3.f5490b).G();
                                if (jG > 0) {
                                    this.f15082x = jG;
                                    this.f15081w = true;
                                    arrayDeque = arrayDeque2;
                                    z11 = true;
                                    z10 = z12;
                                }
                                arrayDeque.clear();
                                this.f15084z = z11;
                                if (this.f15081w && !z10) {
                                    this.l = 2;
                                }
                            }
                        }
                        arrayList = arrayList3;
                    }
                } else {
                    i10 = 0;
                    arrayList = arrayList3;
                    v0VarF = null;
                }
                ArrayList arrayList5 = new ArrayList();
                boolean z13 = this.E == 1 ? 1 : i10;
                y yVar = new y();
                f7.d dVarR = cVar.r(1969517665);
                if (dVarR != null) {
                    v0VarK = c.k(dVarR);
                    yVar.b(v0VarK);
                } else {
                    v0VarK = null;
                }
                f7.d dVarR2 = cVar.r(1836476516);
                dVarR2.getClass();
                u0[] u0VarArr3 = new u0[1];
                u0VarArr3[i10] = c.g(dVarR2.C);
                v0 v0Var7 = new v0(u0VarArr3);
                v0 v0Var8 = v0VarK;
                ArrayList arrayListJ = c.j(cVar, yVar, -9223372036854775807L, null, (i21 & 1) != 0 ? 1 : i10, z13, new oj.l(25), this.f15063c);
                if (this.f15083y) {
                    boolean z14 = arrayList.size() == arrayListJ.size() ? 1 : i10;
                    Locale locale = Locale.US;
                    c0.z(g4.c.e(arrayList.size(), arrayListJ.size(), "The number of auxiliary track types from metadata (", ") is not same as the number of auxiliary tracks (", ")"), z14);
                }
                String strB = p.b(arrayListJ);
                int i26 = i10;
                int i27 = i26;
                long j12 = -9223372036854775807L;
                int size = -1;
                while (i26 < arrayListJ.size()) {
                    t tVar = (t) arrayListJ.get(i26);
                    int i28 = tVar.f15125b;
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    int i29 = tVar.f15128e;
                    q qVar = tVar.f15124a;
                    if (i28 == 0) {
                        arrayList = arrayList;
                        str = strB;
                        i12 = i26;
                        i11 = i27;
                        v0Var4 = v0Var8;
                        v0Var5 = v0Var7;
                        v0Var6 = v0VarF;
                    } else {
                        a8.s sVar = this.B;
                        i11 = i27 + 1;
                        str = strB;
                        int i30 = qVar.f15094b;
                        androidx.media3.common.t tVar2 = qVar.f15099g;
                        l0 l0VarW = sVar.w(i27, i30);
                        k kVar = new k(qVar, tVar, l0VarW);
                        v0 v0Var9 = v0VarF;
                        long j13 = qVar.f15097e;
                        if (j13 == -9223372036854775807L) {
                            j13 = tVar.f15132i;
                        }
                        l0VarW.c(j13);
                        long jMax = Math.max(j12, j13);
                        String str2 = tVar2.f1594n;
                        String str3 = tVar2.f1594n;
                        int i31 = "audio/true-hd".equals(str2) ? i29 * 16 : i29 + 30;
                        androidx.media3.common.s sVarA = tVar2.a();
                        sVarA.f1502n = i31;
                        if (i30 == 2) {
                            int i32 = tVar2.f1588f;
                            if ((i21 & 8) != 0) {
                                i32 |= size == -1 ? 1 : 2;
                            }
                            int i33 = i32;
                            if (this.f15083y) {
                                i18 = i33 | 32768;
                                sVarA.f1497g = ((Integer) arrayList.get(i26)).intValue();
                            } else {
                                i18 = i33;
                            }
                            sVarA.f1496f = i18;
                        } else {
                            arrayList = arrayList;
                        }
                        long[] jArr2 = tVar.f15129f;
                        int[] iArr = tVar.f15131h;
                        boolean z15 = tVar.f15133j;
                        if (x0.m(str3)) {
                            int iMin = Math.min(z15 ? tVar.f15125b : iArr.length, 20);
                            c0.A(j13 != -9223372036854775807L ? 1 : i10);
                            i12 = i26;
                            v0Var = v0Var9;
                            long jMin = Math.min(j13, 10000000L);
                            int i34 = i10;
                            int i35 = i34;
                            int i36 = -1;
                            while (i34 < iMin) {
                                int i37 = z15 ? i34 : iArr[i34];
                                long j14 = jArr2[i37];
                                if (j14 > jMin) {
                                    break;
                                }
                                if (j14 >= 0 && (i14 = tVar.f15127d[(i13 = i37)]) > i35) {
                                    i35 = i14;
                                    i36 = i13;
                                }
                                i34++;
                            }
                            if (i36 != -1) {
                                j10 = jArr2[i36];
                            }
                            if (j10 != -9223372036854775807L) {
                                j8.c cVar2 = new j8.c(j10);
                                i15 = 1;
                                u0[] u0VarArr4 = new u0[1];
                                u0VarArr4[i10] = cVar2;
                                v0Var2 = new v0(u0VarArr4);
                            } else {
                                i15 = 1;
                                v0Var2 = null;
                            }
                            if (i30 == i15 && (i16 = yVar.f324a) != -1 && (i17 = yVar.f325b) != -1) {
                                sVarA.H = i16;
                                sVarA.I = i17;
                            }
                            v0 v0Var10 = tVar2.l;
                            arrayList2 = this.f15070j;
                            if (arrayList2.isEmpty()) {
                                v0Var3 = null;
                            } else {
                                v0Var3 = new v0(arrayList2);
                            }
                            v0Var4 = v0Var8;
                            v0Var5 = v0Var7;
                            v0[] v0VarArr = {v0Var3, v0Var4, v0Var5, v0Var2};
                            v0Var6 = v0Var;
                            p.l(i30, v0Var6, sVarA, v0Var10, v0VarArr);
                            sVarA.l = x0.n(str);
                            if (Objects.equals(str3, "audio/mpeg")) {
                                kVar.f15060f = new androidx.media3.common.t(sVarA);
                            } else {
                                oi.k.w(sVarA, kVar.f15057c);
                            }
                            if (i30 == 2 && size == -1) {
                                size = arrayList5.size();
                            }
                            arrayList5.add(kVar);
                            j12 = jMax;
                        } else {
                            i12 = i26;
                            v0Var = v0Var9;
                        }
                        j10 = -9223372036854775807L;
                        if (j10 != -9223372036854775807L) {
                            j8.c cVar3 = new j8.c(j10);
                            i15 = 1;
                            u0[] u0VarArr5 = new u0[1];
                            u0VarArr5[i10] = cVar3;
                            v0Var2 = new v0(u0VarArr5);
                        } else {
                            i15 = 1;
                            v0Var2 = null;
                        }
                        if (i30 == i15) {
                            sVarA.H = i16;
                            sVarA.I = i17;
                        }
                        v0 v0Var11 = tVar2.l;
                        arrayList2 = this.f15070j;
                        if (arrayList2.isEmpty()) {
                            v0Var3 = null;
                        } else {
                            v0Var3 = new v0(arrayList2);
                        }
                        v0Var4 = v0Var8;
                        v0Var5 = v0Var7;
                        v0[] v0VarArr2 = {v0Var3, v0Var4, v0Var5, v0Var2};
                        v0Var6 = v0Var;
                        p.l(i30, v0Var6, sVarA, v0Var11, v0VarArr2);
                        sVarA.l = x0.n(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                            kVar.f15060f = new androidx.media3.common.t(sVarA);
                        } else {
                            oi.k.w(sVarA, kVar.f15057c);
                        }
                        if (i30 == 2) {
                            size = arrayList5.size();
                        }
                        arrayList5.add(kVar);
                        j12 = jMax;
                    }
                    int i38 = i12 + 1;
                    v0Var8 = v0Var4;
                    v0VarF = v0Var6;
                    v0Var7 = v0Var5;
                    arrayDeque2 = arrayDeque3;
                    arrayListJ = arrayListJ;
                    i27 = i11;
                    strB = str;
                    z12 = z12;
                    i26 = i38;
                    arrayList = arrayList;
                }
                arrayDeque = arrayDeque2;
                z10 = z12;
                boolean z16 = true;
                int i39 = -1;
                k[] kVarArr = (k[]) arrayList5.toArray(new k[i10]);
                this.C = kVarArr;
                if (z10) {
                    jArr = null;
                } else {
                    jArr = new long[kVarArr.length][];
                    int[] iArr2 = new int[kVarArr.length];
                    long[] jArr3 = new long[kVarArr.length];
                    boolean[] zArr = new boolean[kVarArr.length];
                    for (int i40 = 0; i40 < kVarArr.length; i40++) {
                        jArr[i40] = new long[kVarArr[i40].f15056b.f15125b];
                        jArr3[i40] = kVarArr[i40].f15056b.f15129f[0];
                    }
                    int i41 = 0;
                    while (i41 < kVarArr.length) {
                        long j15 = Long.MAX_VALUE;
                        int i42 = i39;
                        for (int i43 = 0; i43 < kVarArr.length; i43++) {
                            if (!zArr[i43]) {
                                long j16 = jArr3[i43];
                                if (j16 <= j15) {
                                    i42 = i43;
                                    j15 = j16;
                                }
                            }
                        }
                        int i44 = iArr2[i42];
                        long[] jArr4 = jArr[i42];
                        jArr4[i44] = j11;
                        t tVar3 = kVarArr[i42].f15056b;
                        boolean z17 = z16;
                        j11 += (long) tVar3.f15127d[i44];
                        int i45 = i44 + 1;
                        iArr2[i42] = i45;
                        if (i45 < jArr4.length) {
                            jArr3[i42] = tVar3.f15129f[i45];
                        } else {
                            zArr[i42] = z17;
                            i41++;
                        }
                        z16 = z17;
                        i39 = -1;
                    }
                }
                z11 = z16;
                this.D = jArr;
                this.B.q();
                this.B.b(new j(j12, this.C, size));
                arrayDeque.clear();
                this.f15084z = z11;
                if (this.f15081w) {
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((f7.c) arrayDeque2.peek()).E.add(cVar);
            }
        }
        if (this.l != 2) {
            this.l = 0;
            this.f15073o = 0;
        }
    }

    @Override
    public final void release() {
    }
}
