package v8;

import a8.b0;
import a8.n0;
import a8.o0;
import androidx.media3.common.ParserException;
import androidx.media3.common.s;
import androidx.media3.common.t;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import e7.u;
import fh.t0;
import java.util.ArrayList;
import java.util.Arrays;
import s10.w0;

public final class j extends i {

    public a20.g f15565n;

    public int f15566o;

    public boolean f15567p;

    public b0 f15568q;

    public qj.c f15569r;

    @Override
    public final void a(long j9) {
        this.f15560g = j9;
        this.f15567p = j9 != 0;
        b0 b0Var = this.f15568q;
        this.f15566o = b0Var != null ? b0Var.f226e : 0;
    }

    @Override
    public final long b(u uVar) {
        byte b7 = uVar.f5182a[0];
        if ((b7 & 1) == 1) {
            return -1L;
        }
        a20.g gVar = this.f15565n;
        gVar.getClass();
        int i10 = gVar.B;
        b0 b0Var = (b0) gVar.C;
        int i11 = !((o0[]) gVar.F)[(b7 >> 1) & (255 >>> (8 - i10))].f304a ? b0Var.f226e : b0Var.f227f;
        long j9 = this.f15567p ? (this.f15566o + i11) / 4 : 0;
        byte[] bArr = uVar.f5182a;
        int length = bArr.length;
        int i12 = uVar.f5184c + 4;
        if (length < i12) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i12);
            uVar.L(bArrCopyOf.length, bArrCopyOf);
        } else {
            uVar.M(i12);
        }
        byte[] bArr2 = uVar.f5182a;
        int i13 = uVar.f5184c;
        bArr2[i13 - 4] = (byte) (j9 & 255);
        bArr2[i13 - 3] = (byte) ((j9 >>> 8) & 255);
        bArr2[i13 - 2] = (byte) ((j9 >>> 16) & 255);
        bArr2[i13 - 1] = (byte) ((j9 >>> 24) & 255);
        this.f15567p = true;
        this.f15566o = i11;
        return j9;
    }

    @Override
    public final boolean c(u uVar, long j9, w0 w0Var) throws ParserException {
        a20.g gVar;
        if (this.f15565n != null) {
            ((t) w0Var.B).getClass();
            return false;
        }
        b0 b0Var = this.f15568q;
        int i10 = 4;
        if (b0Var != null) {
            qj.c cVar = this.f15569r;
            if (cVar == null) {
                this.f15569r = a8.b.w(uVar, true, true);
            } else {
                int i11 = uVar.f5184c;
                byte[] bArr = new byte[i11];
                System.arraycopy(uVar.f5182a, 0, bArr, 0, i11);
                int i12 = b0Var.f222a;
                int i13 = 5;
                a8.b.y(5, uVar, false);
                int iA = uVar.A() + 1;
                n0 n0Var = new n0(uVar.f5182a);
                int i14 = 8;
                n0Var.t(uVar.f5183b * 8);
                int i15 = 0;
                while (true) {
                    int i16 = 16;
                    if (i15 < iA) {
                        int i17 = i14;
                        if (n0Var.i(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((n0Var.f302d * 8) + n0Var.f303e));
                        }
                        int i18 = n0Var.i(16);
                        int i19 = n0Var.i(24);
                        if (n0Var.h()) {
                            n0Var.t(i13);
                            int i20 = 0;
                            while (i20 < i19) {
                                int i21 = 0;
                                for (int i22 = i19 - i20; i22 > 0; i22 >>>= 1) {
                                    i21++;
                                }
                                i20 += n0Var.i(i21);
                            }
                        } else {
                            boolean zH = n0Var.h();
                            for (int i23 = 0; i23 < i19; i23++) {
                                if (!zH) {
                                    n0Var.t(i13);
                                } else if (n0Var.h()) {
                                    n0Var.t(i13);
                                }
                            }
                        }
                        int i24 = n0Var.i(4);
                        if (i24 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + i24);
                        }
                        if (i24 == 1 || i24 == 2) {
                            n0Var.t(32);
                            n0Var.t(32);
                            int i25 = n0Var.i(4) + 1;
                            n0Var.t(1);
                            n0Var.t((int) ((i24 == 1 ? i18 != 0 ? (long) Math.floor(Math.pow(i19, 1.0d / ((double) i18))) : 0L : ((long) i19) * ((long) i18)) * ((long) i25)));
                        }
                        i15++;
                        i14 = i17;
                        i13 = 5;
                    } else {
                        int i26 = i14;
                        int i27 = 6;
                        int i28 = n0Var.i(6) + 1;
                        for (int i29 = 0; i29 < i28; i29++) {
                            if (n0Var.i(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i30 = 1;
                        int i31 = n0Var.i(6) + 1;
                        int i32 = 0;
                        while (true) {
                            int i33 = 3;
                            if (i32 >= i31) {
                                int i34 = n0Var.i(i27) + 1;
                                int i35 = 0;
                                while (i35 < i34) {
                                    if (n0Var.i(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    n0Var.t(24);
                                    n0Var.t(24);
                                    n0Var.t(24);
                                    int i36 = n0Var.i(i27) + 1;
                                    int i37 = 8;
                                    n0Var.t(8);
                                    int[] iArr = new int[i36];
                                    for (int i38 = 0; i38 < i36; i38++) {
                                        iArr[i38] = ((n0Var.h() ? n0Var.i(5) : 0) * 8) + n0Var.i(3);
                                    }
                                    int i39 = 0;
                                    while (i39 < i36) {
                                        int i40 = 0;
                                        while (i40 < i37) {
                                            if ((iArr[i39] & (1 << i40)) != 0) {
                                                n0Var.t(i37);
                                            }
                                            i40++;
                                            i37 = 8;
                                        }
                                        i39++;
                                        i37 = 8;
                                    }
                                    i35++;
                                    i27 = 6;
                                }
                                int i41 = n0Var.i(i27) + 1;
                                for (int i42 = 0; i42 < i41; i42++) {
                                    int i43 = n0Var.i(16);
                                    if (i43 != 0) {
                                        e7.a.d("VorbisUtil", "mapping type other than 0 not supported: " + i43);
                                    } else {
                                        int i44 = n0Var.h() ? n0Var.i(4) + 1 : 1;
                                        if (n0Var.h()) {
                                            int i45 = n0Var.i(8) + 1;
                                            for (int i46 = 0; i46 < i45; i46++) {
                                                int i47 = i12 - 1;
                                                int i48 = 0;
                                                for (int i49 = i47; i49 > 0; i49 >>>= 1) {
                                                    i48++;
                                                }
                                                n0Var.t(i48);
                                                int i50 = 0;
                                                while (i47 > 0) {
                                                    i50++;
                                                    i47 >>>= 1;
                                                }
                                                n0Var.t(i50);
                                            }
                                        }
                                        if (n0Var.i(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i44 > 1) {
                                            for (int i51 = 0; i51 < i12; i51++) {
                                                n0Var.t(4);
                                            }
                                        }
                                        for (int i52 = 0; i52 < i44; i52++) {
                                            n0Var.t(8);
                                            n0Var.t(8);
                                            n0Var.t(8);
                                        }
                                    }
                                }
                                int i53 = n0Var.i(6);
                                int i54 = i53 + 1;
                                o0[] o0VarArr = new o0[i54];
                                for (int i55 = 0; i55 < i54; i55++) {
                                    boolean zH2 = n0Var.h();
                                    n0Var.i(16);
                                    n0Var.i(16);
                                    n0Var.i(8);
                                    o0VarArr[i55] = new o0(zH2);
                                }
                                if (!n0Var.h()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i56 = 0;
                                while (i53 > 0) {
                                    i56++;
                                    i53 >>>= 1;
                                }
                                gVar = new a20.g(b0Var, cVar, bArr, o0VarArr, i56);
                                break;
                            }
                            int i57 = n0Var.i(i16);
                            if (i57 == 0) {
                                int i58 = i26;
                                n0Var.t(i58);
                                n0Var.t(16);
                                n0Var.t(16);
                                n0Var.t(6);
                                n0Var.t(i58);
                                int i59 = n0Var.i(4) + 1;
                                int i60 = 0;
                                while (i60 < i59) {
                                    n0Var.t(i58);
                                    i60++;
                                    i58 = 8;
                                }
                            } else {
                                if (i57 != i30) {
                                    throw ParserException.a(null, "floor type greater than 1 not decodable: " + i57);
                                }
                                int i61 = n0Var.i(5);
                                int[] iArr2 = new int[i61];
                                int i62 = -1;
                                for (int i63 = 0; i63 < i61; i63++) {
                                    int i64 = n0Var.i(i10);
                                    iArr2[i63] = i64;
                                    if (i64 > i62) {
                                        i62 = i64;
                                    }
                                }
                                int i65 = i62 + 1;
                                int[] iArr3 = new int[i65];
                                int i66 = 0;
                                while (i66 < i65) {
                                    iArr3[i66] = n0Var.i(i33) + 1;
                                    int i67 = n0Var.i(2);
                                    int i68 = i26;
                                    if (i67 > 0) {
                                        n0Var.t(i68);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i69 = 0;
                                    for (int i70 = 1; i69 < (i70 << i67); i70 = 1) {
                                        n0Var.t(i68);
                                        i69++;
                                        i68 = 8;
                                    }
                                    i66++;
                                    iArr3 = iArr4;
                                    i26 = 8;
                                    i33 = 3;
                                }
                                int[] iArr5 = iArr3;
                                n0Var.t(2);
                                int i71 = n0Var.i(4);
                                int i72 = 0;
                                int i73 = 0;
                                for (int i74 = 0; i74 < i61; i74++) {
                                    i72 += iArr5[iArr2[i74]];
                                    while (i73 < i72) {
                                        n0Var.t(i71);
                                        i73++;
                                    }
                                }
                            }
                            i32++;
                            i26 = 8;
                            i27 = 6;
                            i10 = 4;
                            i16 = 16;
                            i30 = 1;
                        }
                    }
                }
            }
            this.f15565n = gVar;
            if (gVar == null) {
                return true;
            }
            b0 b0Var2 = (b0) gVar.C;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) b0Var2.f228g);
            arrayList.add((byte[]) gVar.E);
            v0 v0VarT = a8.b.t(t0.p((String[]) ((qj.c) gVar.D).B));
            s sVar = new s();
            sVar.l = x0.n("audio/ogg");
            sVar.m = x0.n("audio/vorbis");
            sVar.f1498h = b0Var2.f225d;
            sVar.f1499i = b0Var2.f224c;
            sVar.E = b0Var2.f222a;
            sVar.F = b0Var2.f223b;
            sVar.f1504p = arrayList;
            sVar.f1501k = v0VarT;
            w0Var.B = new t(sVar);
            return true;
        }
        a8.b.y(1, uVar, false);
        uVar.s();
        int iA2 = uVar.A();
        int iS = uVar.s();
        int iO = uVar.o();
        if (iO <= 0) {
            iO = -1;
        }
        int iO2 = uVar.o();
        int i75 = iO2 > 0 ? iO2 : -1;
        uVar.o();
        int iA3 = uVar.A();
        int iPow = (int) Math.pow(2.0d, iA3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iA3 & 240) >> 4);
        uVar.A();
        ?? CopyOf = Arrays.copyOf(uVar.f5182a, uVar.f5184c);
        b0 b0Var3 = new b0();
        b0Var3.f222a = iA2;
        b0Var3.f223b = iS;
        b0Var3.f224c = iO;
        b0Var3.f225d = i75;
        b0Var3.f226e = iPow;
        b0Var3.f227f = iPow2;
        b0Var3.f228g = CopyOf;
        this.f15568q = b0Var3;
        gVar = null;
        this.f15565n = gVar;
        if (gVar == null) {
            return true;
        }
        b0 b0Var4 = (b0) gVar.C;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) b0Var4.f228g);
        arrayList2.add((byte[]) gVar.E);
        v0 v0VarT2 = a8.b.t(t0.p((String[]) ((qj.c) gVar.D).B));
        s sVar2 = new s();
        sVar2.l = x0.n("audio/ogg");
        sVar2.m = x0.n("audio/vorbis");
        sVar2.f1498h = b0Var4.f225d;
        sVar2.f1499i = b0Var4.f224c;
        sVar2.E = b0Var4.f222a;
        sVar2.F = b0Var4.f223b;
        sVar2.f1504p = arrayList2;
        sVar2.f1501k = v0VarT2;
        w0Var.B = new t(sVar2);
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f15565n = null;
            this.f15568q = null;
            this.f15569r = null;
        }
        this.f15566o = 0;
        this.f15567p = false;
    }
}
