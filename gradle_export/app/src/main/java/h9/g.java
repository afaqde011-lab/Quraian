package h9;

import a8.l0;
import a8.n0;
import androidx.media3.common.ParserException;
import androidx.media3.common.x0;
import e7.i0;
import g1.c3;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

public final class g implements i {

    public final e7.u f6729a;

    public final String f6731c;

    public final int f6732d;

    public String f6734f;

    public l0 f6735g;

    public int f6737i;

    public int f6738j;

    public long f6739k;
    public androidx.media3.common.t l;
    public int m;

    public int f6740n;

    public int f6736h = 0;

    public long f6743q = -9223372036854775807L;

    public final AtomicInteger f6730b = new AtomicInteger();

    public int f6741o = -1;

    public int f6742p = -1;

    public final String f6733e = "video/mp2t";

    public g(String str, int i10, int i11) {
        this.f6729a = new e7.u(new byte[i11]);
        this.f6731c = str;
        this.f6732d = i10;
    }

    @Override
    public final void a() {
        this.f6736h = 0;
        this.f6737i = 0;
        this.f6738j = 0;
        this.f6743q = -9223372036854775807L;
        this.f6730b.set(0);
    }

    @Override
    public final void b(e7.u uVar) throws ParserException {
        int i10;
        byte b7;
        int i11;
        byte b10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long jQ;
        int i18;
        long jQ2;
        int i19;
        int i20;
        int i21;
        int i22;
        this.f6735g.getClass();
        while (uVar.a() > 0) {
            int i23 = this.f6736h;
            e7.u uVar2 = this.f6729a;
            switch (i23) {
                case 0:
                    while (uVar.a() > 0) {
                        int i24 = this.f6738j << 8;
                        this.f6738j = i24;
                        int iA = i24 | uVar.A();
                        this.f6738j = iA;
                        int iJ = a8.b.j(iA);
                        this.f6740n = iJ;
                        if (iJ != 0) {
                            byte[] bArr = uVar2.f5182a;
                            int i25 = this.f6738j;
                            bArr[0] = (byte) ((i25 >> 24) & 255);
                            bArr[1] = (byte) ((i25 >> 16) & 255);
                            bArr[2] = (byte) ((i25 >> 8) & 255);
                            bArr[3] = (byte) (i25 & 255);
                            this.f6737i = 4;
                            this.f6738j = 0;
                            if (iJ != 3 && iJ != 4) {
                                if (iJ == 1) {
                                    this.f6736h = 1;
                                } else {
                                    this.f6736h = 2;
                                }
                            }
                            this.f6736h = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (f(uVar, uVar2.f5182a, 18)) {
                        byte[] bArr2 = uVar2.f5182a;
                        if (this.l == null) {
                            String str = this.f6734f;
                            n0 n0VarL = a8.b.l(bArr2);
                            n0VarL.t(60);
                            int i26 = a8.b.f208j[n0VarL.i(6)];
                            int i27 = a8.b.f209k[n0VarL.i(4)];
                            int i28 = n0VarL.i(5);
                            int i29 = i28 >= 29 ? -1 : (a8.b.l[i28] * 1000) / 2;
                            n0VarL.t(10);
                            int i30 = i26 + (n0VarL.i(2) > 0 ? 1 : 0);
                            androidx.media3.common.s sVar = new androidx.media3.common.s();
                            sVar.f1491a = str;
                            sVar.l = x0.n(this.f6733e);
                            sVar.m = x0.n("audio/vnd.dts");
                            sVar.f1498h = i29;
                            sVar.E = i30;
                            sVar.F = i27;
                            sVar.f1505q = null;
                            sVar.f1494d = this.f6731c;
                            sVar.f1496f = this.f6732d;
                            androidx.media3.common.t tVar = new androidx.media3.common.t(sVar);
                            this.l = tVar;
                            this.f6735g.f(tVar);
                        }
                        this.m = a8.b.h(bArr2);
                        byte b11 = bArr2[0];
                        if (b11 != -2) {
                            if (b11 == -1) {
                                i10 = (bArr2[4] & 7) << 4;
                                b10 = bArr2[7];
                            } else if (b11 != 31) {
                                i10 = (bArr2[4] & 1) << 6;
                                b7 = bArr2[5];
                            } else {
                                i10 = (bArr2[5] & 7) << 4;
                                b10 = bArr2[6];
                            }
                            i11 = b10 & 60;
                            this.f6739k = bi.b.s(i0.O(this.l.G, (((i11 >> 2) | i10) + 1) * 32));
                            uVar2.N(0);
                            this.f6735g.g(18, uVar2);
                            this.f6736h = 6;
                        } else {
                            i10 = (bArr2[5] & 1) << 6;
                            b7 = bArr2[4];
                        }
                        i11 = b7 & 252;
                        this.f6739k = bi.b.s(i0.O(this.l.G, (((i11 >> 2) | i10) + 1) * 32));
                        uVar2.N(0);
                        this.f6735g.g(18, uVar2);
                        this.f6736h = 6;
                        break;
                    }
                    break;
                case 2:
                    if (f(uVar, uVar2.f5182a, 7)) {
                        n0 n0VarL2 = a8.b.l(uVar2.f5182a);
                        n0VarL2.t(42);
                        this.f6741o = n0VarL2.i(n0VarL2.h() ? 12 : 8) + 1;
                        this.f6736h = 3;
                    }
                    break;
                case 3:
                    int i31 = 8;
                    if (f(uVar, uVar2.f5182a, this.f6741o)) {
                        n0 n0VarL3 = a8.b.l(uVar2.f5182a);
                        n0VarL3.t(40);
                        int i32 = n0VarL3.i(2);
                        if (n0VarL3.h()) {
                            i12 = 20;
                            i13 = 12;
                        } else {
                            i12 = 16;
                            i13 = 8;
                        }
                        n0VarL3.t(i13);
                        int i33 = n0VarL3.i(i12) + 1;
                        boolean zH = n0VarL3.h();
                        if (zH) {
                            i14 = n0VarL3.i(2);
                            i15 = (n0VarL3.i(3) + 1) * 512;
                            if (n0VarL3.h()) {
                                n0VarL3.t(36);
                            }
                            int i34 = n0VarL3.i(3) + 1;
                            int i35 = n0VarL3.i(3) + 1;
                            if (i34 != 1 || i35 != 1) {
                                throw ParserException.c("Multiple audio presentations or assets not supported");
                            }
                            int i36 = i32 + 1;
                            int i37 = n0VarL3.i(i36);
                            int i38 = 0;
                            while (i38 < i36) {
                                if (((i37 >> i38) & 1) == 1) {
                                    n0VarL3.t(i31);
                                }
                                i38++;
                                i31 = 8;
                            }
                            if (n0VarL3.h()) {
                                n0VarL3.t(2);
                                int i39 = (n0VarL3.i(2) + 1) << 2;
                                int i40 = n0VarL3.i(2) + 1;
                                for (int i41 = 0; i41 < i40; i41++) {
                                    n0VarL3.t(i39);
                                }
                            }
                        } else {
                            i14 = -1;
                            i15 = 0;
                        }
                        n0VarL3.t(i12);
                        n0VarL3.t(12);
                        if (zH) {
                            if (n0VarL3.h()) {
                                n0VarL3.t(4);
                            }
                            if (n0VarL3.h()) {
                                n0VarL3.t(24);
                            }
                            if (n0VarL3.h()) {
                                n0VarL3.u(n0VarL3.i(10) + 1);
                            }
                            n0VarL3.t(5);
                            i17 = a8.b.m[n0VarL3.i(4)];
                            i16 = n0VarL3.i(8) + 1;
                        } else {
                            i16 = -1;
                            i17 = -2147483647;
                        }
                        if (zH) {
                            if (i14 == 0) {
                                i18 = 32000;
                            } else if (i14 == 1) {
                                i18 = 44100;
                            } else {
                                if (i14 != 2) {
                                    throw ParserException.a(null, "Unsupported reference clock code in DTS HD header: " + i14);
                                }
                                i18 = 48000;
                            }
                            String str2 = i0.f5136a;
                            jQ = i0.Q(i15, 1000000L, i18, RoundingMode.DOWN);
                        } else {
                            jQ = -9223372036854775807L;
                        }
                        g(new a8.a(i16, i17, i33, jQ, "audio/vnd.dts.hd;profile=lbr"));
                        this.m = i33;
                        this.f6739k = jQ == -9223372036854775807L ? 0L : jQ;
                        uVar2.N(0);
                        this.f6735g.g(this.f6741o, uVar2);
                        this.f6736h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (f(uVar, uVar2.f5182a, 6)) {
                        n0 n0VarL4 = a8.b.l(uVar2.f5182a);
                        n0VarL4.t(32);
                        int iS = a8.b.s(n0VarL4, a8.b.f214r) + 1;
                        this.f6742p = iS;
                        int i42 = this.f6737i;
                        if (i42 > iS) {
                            int i43 = i42 - iS;
                            this.f6737i = i42 - i43;
                            uVar.N(uVar.f5183b - i43);
                        }
                        this.f6736h = 5;
                    }
                    break;
                case 5:
                    if (f(uVar, uVar2.f5182a, this.f6742p)) {
                        byte[] bArr3 = uVar2.f5182a;
                        n0 n0VarL5 = a8.b.l(bArr3);
                        int i44 = n0VarL5.i(32) == 1078008818 ? 1 : 0;
                        int iS2 = a8.b.s(n0VarL5, a8.b.f210n);
                        int i45 = iS2 + 1;
                        if (i44 == 0) {
                            jQ2 = -9223372036854775807L;
                            i19 = -2147483647;
                        } else {
                            if (!n0VarL5.h()) {
                                throw ParserException.c("Only supports full channel mask-based audio presentation");
                            }
                            int i46 = iS2 - 1;
                            int i47 = ((bArr3[i46] << 8) & 65535) | (bArr3[iS2] & 255);
                            String str3 = i0.f5136a;
                            int i48 = 65535;
                            for (int i49 = 0; i49 < i46; i49++) {
                                byte b12 = bArr3[i49];
                                int[] iArr = i0.f5146k;
                                int i50 = (iArr[(((b12 & 255) >> 4) ^ ((i48 >> 12) & 255)) & 255] ^ ((i48 << 4) & 65535)) & 65535;
                                i48 = (iArr[((b12 & 15) ^ ((i50 >> 12) & 255)) & 255] ^ ((i50 << 4) & 65535)) & 65535;
                            }
                            if (i47 != i48) {
                                throw ParserException.a(null, "CRC check failed");
                            }
                            int i51 = n0VarL5.i(2);
                            if (i51 != 0) {
                                if (i51 == 1) {
                                    i21 = 480;
                                } else {
                                    if (i51 != 2) {
                                        throw ParserException.a(null, "Unsupported base duration index in DTS UHD header: " + i51);
                                    }
                                    i21 = 384;
                                }
                                i20 = 3;
                            } else {
                                i20 = 3;
                                i21 = 512;
                            }
                            int i52 = (n0VarL5.i(i20) + 1) * i21;
                            int i53 = n0VarL5.i(2);
                            if (i53 == 0) {
                                i22 = 32000;
                            } else if (i53 == 1) {
                                i22 = 44100;
                            } else {
                                if (i53 != 2) {
                                    throw ParserException.a(null, "Unsupported clock rate index in DTS UHD header: " + i53);
                                }
                                i22 = 48000;
                            }
                            if (n0VarL5.h()) {
                                n0VarL5.t(36);
                            }
                            int i54 = i22 * (1 << n0VarL5.i(2));
                            jQ2 = i0.Q(i52, 1000000L, i22, RoundingMode.DOWN);
                            i19 = i54;
                        }
                        int iS3 = 0;
                        for (int i55 = 0; i55 < i44; i55++) {
                            iS3 += a8.b.s(n0VarL5, a8.b.f211o);
                        }
                        AtomicInteger atomicInteger = this.f6730b;
                        if (i44 != 0) {
                            atomicInteger.set(a8.b.s(n0VarL5, a8.b.f212p));
                        }
                        int iS4 = iS3 + (atomicInteger.get() != 0 ? a8.b.s(n0VarL5, a8.b.f213q) : 0) + i45;
                        a8.a aVar = new a8.a(2, i19, iS4, jQ2, "audio/vnd.dts.uhd;profile=p2");
                        if (this.f6740n == 3) {
                            g(aVar);
                        }
                        this.m = iS4;
                        this.f6739k = jQ2 == -9223372036854775807L ? 0L : jQ2;
                        uVar2.N(0);
                        this.f6735g.g(this.f6742p, uVar2);
                        this.f6736h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(uVar.a(), this.m - this.f6737i);
                    this.f6735g.g(iMin, uVar);
                    int i56 = this.f6737i + iMin;
                    this.f6737i = i56;
                    if (i56 == this.m) {
                        ta.c0.A(this.f6743q != -9223372036854775807L);
                        this.f6735g.d(this.f6743q, this.f6740n == 4 ? 0 : 1, this.m, 0, null);
                        this.f6743q += this.f6739k;
                        this.f6736h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override
    public final void c(a8.s sVar, c3 c3Var) {
        c3Var.a();
        c3Var.b();
        this.f6734f = (String) c3Var.E;
        c3Var.b();
        this.f6735g = sVar.w(c3Var.C, 1);
    }

    @Override
    public final void d(boolean z10) {
    }

    @Override
    public final void e(int i10, long j9) {
        this.f6743q = j9;
    }

    public final boolean f(e7.u uVar, byte[] bArr, int i10) {
        int iMin = Math.min(uVar.a(), i10 - this.f6737i);
        uVar.k(this.f6737i, iMin, bArr);
        int i11 = this.f6737i + iMin;
        this.f6737i = i11;
        return i11 == i10;
    }

    public final void g(a8.a aVar) {
        int i10 = aVar.f194b;
        String str = aVar.f193a;
        int i11 = aVar.f195c;
        if (i10 == -2147483647 || i11 == -1) {
            return;
        }
        androidx.media3.common.t tVar = this.l;
        if (tVar != null && i11 == tVar.F && i10 == tVar.G && str.equals(tVar.f1594n)) {
            return;
        }
        androidx.media3.common.t tVar2 = this.l;
        androidx.media3.common.s sVar = tVar2 == null ? new androidx.media3.common.s() : tVar2.a();
        sVar.f1491a = this.f6734f;
        sVar.l = x0.n(this.f6733e);
        sVar.m = x0.n(str);
        sVar.E = i11;
        sVar.F = i10;
        sVar.f1494d = this.f6731c;
        sVar.f1496f = this.f6732d;
        androidx.media3.common.t tVar3 = new androidx.media3.common.t(sVar);
        this.l = tVar3;
        this.f6735g.f(tVar3);
    }
}
