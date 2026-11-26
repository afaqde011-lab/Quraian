package h9;

import a8.l0;
import a8.n0;
import androidx.media3.common.ParserException;
import androidx.media3.common.x0;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import e7.i0;
import fh.d2;
import fh.t0;
import g1.c3;

public final class v implements i {

    public String f6900e;

    public l0 f6901f;

    public boolean f6904i;

    public int f6906k;
    public int l;

    public int f6907n;

    public int f6908o;

    public int f6912s;

    public boolean f6914u;

    public int f6899d = 0;

    public final e7.u f6896a = new e7.u(2, new byte[15]);

    public final n0 f6897b = new n0();

    public final e7.u f6898c = new e7.u();

    public final w f6909p = new w();

    public int f6910q = -2147483647;

    public int f6911r = -1;

    public long f6913t = -1;

    public boolean f6905j = true;
    public boolean m = true;

    public double f6902g = -9.223372036854776E18d;

    public double f6903h = -9.223372036854776E18d;

    @Override
    public final void a() {
        this.f6899d = 0;
        this.l = 0;
        this.f6896a.K(2);
        this.f6907n = 0;
        this.f6908o = 0;
        this.f6910q = -2147483647;
        this.f6911r = -1;
        this.f6912s = 0;
        this.f6913t = -1L;
        this.f6914u = false;
        this.f6904i = false;
        this.m = true;
        this.f6905j = true;
        this.f6902g = -9.223372036854776E18d;
        this.f6903h = -9.223372036854776E18d;
    }

    @Override
    public final void b(e7.u uVar) throws ParserException {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c10;
        byte[] bArr;
        long j9;
        long j10;
        d2 d2VarT;
        int i15;
        long j11;
        boolean z10;
        int i16;
        this.f6901f.getClass();
        while (uVar.a() > 0) {
            int i17 = this.f6899d;
            int i18 = 8;
            int i19 = 3;
            int i20 = 1;
            if (i17 != 0) {
                e7.u uVar2 = this.f6898c;
                w wVar = this.f6909p;
                if (i17 == 1) {
                    int iA = uVar.a();
                    e7.u uVar3 = this.f6896a;
                    int iMin = Math.min(iA, uVar3.a());
                    uVar.k(uVar3.f5183b, iMin, uVar3.f5182a);
                    uVar3.O(iMin);
                    if (uVar3.a() == 0) {
                        int i21 = uVar3.f5184c;
                        byte[] bArr2 = uVar3.f5182a;
                        n0 n0Var = this.f6897b;
                        n0Var.o(i21, bArr2);
                        n0Var.f();
                        int iM0 = p30.f.m0(n0Var, 3, 8, 8);
                        wVar.B = iM0;
                        if (iM0 != -1) {
                            ta.c0.s(Math.max(Math.max(2, 8), 32) <= 63);
                            z3.s(z3.s(3L, 255L), 4294967296L);
                            if (n0Var.b() < 2) {
                                j11 = -1;
                            } else {
                                long jK = n0Var.k(2);
                                if (jK == 3) {
                                    if (n0Var.b() >= 8) {
                                        long jK2 = n0Var.k(8);
                                        jK += jK2;
                                        if (jK2 == 255) {
                                            if (n0Var.b() >= 32) {
                                                jK = n0Var.k(32) + jK;
                                            }
                                        }
                                    }
                                    j11 = -1;
                                }
                                j11 = jK;
                            }
                            wVar.C = j11;
                            if (j11 == -1) {
                                z10 = false;
                            } else {
                                if (j11 > 16) {
                                    throw ParserException.c("Contains sub-stream with an invalid packet label " + wVar.C);
                                }
                                if (j11 == 0) {
                                    int i22 = wVar.B;
                                    if (i22 == 1) {
                                        throw ParserException.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i22 == 2) {
                                        throw ParserException.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i22 == 17) {
                                        throw ParserException.a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iM1 = p30.f.m0(n0Var, 11, 24, 24);
                                wVar.D = iM1;
                                if (iM1 != -1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            i16 = 0;
                            this.f6907n = 0;
                            this.f6908o = wVar.D + i21 + this.f6908o;
                        } else {
                            i16 = 0;
                        }
                        if (z10) {
                            uVar3.N(i16);
                            this.f6901f.g(uVar3.f5184c, uVar3);
                            uVar3.K(2);
                            uVar2.K(wVar.D);
                            this.m = true;
                            this.f6899d = 2;
                        } else {
                            int i23 = uVar3.f5184c;
                            if (i23 < 15) {
                                uVar3.M(i23 + 1);
                                this.m = false;
                            }
                        }
                    } else {
                        this.m = false;
                    }
                } else {
                    if (i17 != 2) {
                        throw new IllegalStateException();
                    }
                    int i24 = wVar.B;
                    if (i24 == 1 || i24 == 17) {
                        int i25 = uVar.f5183b;
                        int iMin2 = Math.min(uVar.a(), uVar2.a());
                        uVar.k(uVar2.f5183b, iMin2, uVar2.f5182a);
                        uVar2.O(iMin2);
                        uVar.N(i25);
                    }
                    int iMin3 = Math.min(uVar.a(), wVar.D - this.f6907n);
                    this.f6901f.g(iMin3, uVar);
                    int i26 = this.f6907n + iMin3;
                    this.f6907n = i26;
                    if (i26 != wVar.D) {
                        continue;
                    } else {
                        int i27 = wVar.B;
                        if (i27 == 1) {
                            byte[] bArr3 = uVar2.f5182a;
                            n0 n0Var2 = new n0(bArr3.length, bArr3);
                            int i28 = n0Var2.i(8);
                            int i29 = n0Var2.i(5);
                            if (i29 != 31) {
                                switch (i29) {
                                    case 0:
                                        i13 = 96000;
                                        break;
                                    case 1:
                                        i13 = 88200;
                                        break;
                                    case 2:
                                        i13 = 64000;
                                        break;
                                    case 3:
                                        i13 = 48000;
                                        break;
                                    case 4:
                                        i13 = 44100;
                                        break;
                                    case 5:
                                        i13 = 32000;
                                        break;
                                    case 6:
                                        i13 = 24000;
                                        break;
                                    case 7:
                                        i13 = 22050;
                                        break;
                                    case 8:
                                        i13 = 16000;
                                        break;
                                    case 9:
                                        i13 = 12000;
                                        break;
                                    case 10:
                                        i13 = 11025;
                                        break;
                                    case 11:
                                        i13 = 8000;
                                        break;
                                    case 12:
                                        i13 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.c("Unsupported sampling rate index " + i29);
                                    case 15:
                                        i13 = 57600;
                                        break;
                                    case 16:
                                        i13 = 51200;
                                        break;
                                    case 17:
                                        i13 = 40000;
                                        break;
                                    case TYPE_SINT64_VALUE:
                                        i13 = 38400;
                                        break;
                                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                                        i13 = 34150;
                                        break;
                                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                                        i13 = 28800;
                                        break;
                                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                                        i13 = 25600;
                                        break;
                                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                                        i13 = 20000;
                                        break;
                                    case 23:
                                        i13 = 19200;
                                        break;
                                    case 24:
                                        i13 = 17075;
                                        break;
                                    case 25:
                                        i13 = 14400;
                                        break;
                                    case RuntimeVersion.MINOR:
                                        i13 = 12800;
                                        break;
                                    case 27:
                                        i13 = 9600;
                                        break;
                                }
                            } else {
                                i13 = n0Var2.i(24);
                            }
                            int i30 = n0Var2.i(3);
                            if (i30 == 0) {
                                i14 = 768;
                            } else if (i30 == 1) {
                                i14 = 1024;
                            } else if (i30 == 2 || i30 == 3) {
                                i14 = 2048;
                            } else {
                                if (i30 != 4) {
                                    throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i30);
                                }
                                i14 = 4096;
                            }
                            int i31 = i14;
                            if (i30 == 0 || i30 == 1) {
                                c10 = 0;
                            } else if (i30 == 2) {
                                c10 = 2;
                            } else if (i30 == 3) {
                                c10 = 3;
                            } else {
                                if (i30 != 4) {
                                    throw ParserException.c("Unsupported coreSbrFrameLengthIndex " + i30);
                                }
                                c10 = 1;
                            }
                            n0Var2.t(2);
                            p30.f.q0(n0Var2);
                            int i32 = n0Var2.i(5);
                            int i33 = 0;
                            int iM2 = 0;
                            while (true) {
                                int i34 = i20;
                                int i35 = 16;
                                if (i33 < i32 + 1) {
                                    int i36 = n0Var2.i(3);
                                    iM2 = p30.f.m0(n0Var2, 5, 8, 16) + 1 + iM2;
                                    if ((i36 == 0 || i36 == 2) && n0Var2.h()) {
                                        p30.f.q0(n0Var2);
                                    }
                                    i33++;
                                    i20 = i34;
                                } else {
                                    int iM3 = p30.f.m0(n0Var2, 4, 8, 16) + 1;
                                    n0Var2.s();
                                    int i37 = 0;
                                    while (true) {
                                        double d3 = 2.0d;
                                        if (i37 < iM3) {
                                            int i38 = n0Var2.i(2);
                                            if (i38 == 0) {
                                                n0Var2.t(i19);
                                                if (n0Var2.h()) {
                                                    n0Var2.t(13);
                                                }
                                                if (c10 > 0) {
                                                    p30.f.p0(n0Var2);
                                                }
                                            } else if (i38 == i34) {
                                                n0Var2.t(i19);
                                                boolean zH = n0Var2.h();
                                                if (zH) {
                                                    n0Var2.t(13);
                                                }
                                                if (zH) {
                                                    n0Var2.s();
                                                }
                                                if (c10 > 0) {
                                                    p30.f.p0(n0Var2);
                                                    i15 = n0Var2.i(2);
                                                } else {
                                                    i15 = 0;
                                                }
                                                if (i15 > 0) {
                                                    n0Var2.t(6);
                                                    int i39 = n0Var2.i(2);
                                                    n0Var2.t(4);
                                                    if (n0Var2.h()) {
                                                        n0Var2.t(5);
                                                    }
                                                    if (i15 == 2 || i15 == i19) {
                                                        n0Var2.t(6);
                                                    }
                                                    if (i39 == 2) {
                                                        n0Var2.s();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iM2 - 1) / Math.log(2.0d))) + 1;
                                                int i40 = n0Var2.i(2);
                                                if (i40 > 0 && n0Var2.h()) {
                                                    n0Var2.t(iFloor);
                                                }
                                                if (n0Var2.h()) {
                                                    n0Var2.t(iFloor);
                                                }
                                                if (c10 == 0 && i40 == 0) {
                                                    n0Var2.s();
                                                }
                                            } else if (i38 == i19) {
                                                p30.f.m0(n0Var2, 4, i18, i35);
                                                int iM4 = p30.f.m0(n0Var2, 4, i18, i35);
                                                if (n0Var2.h()) {
                                                    p30.f.m0(n0Var2, i18, i35, 0);
                                                }
                                                n0Var2.s();
                                                if (iM4 > 0) {
                                                    n0Var2.t(iM4 * 8);
                                                }
                                            }
                                            i37++;
                                            i18 = 8;
                                            i19 = 3;
                                            i35 = 16;
                                            i34 = 1;
                                        } else {
                                            if (n0Var2.h()) {
                                                int i41 = 8;
                                                int iM5 = p30.f.m0(n0Var2, 2, 4, 8) + 1;
                                                int i42 = 0;
                                                bArr = null;
                                                while (i42 < iM5) {
                                                    int iM6 = p30.f.m0(n0Var2, 4, i41, 16);
                                                    int iM7 = p30.f.m0(n0Var2, 4, i41, 16);
                                                    if (iM6 == 7) {
                                                        int i43 = n0Var2.i(4) + 1;
                                                        n0Var2.t(4);
                                                        byte[] bArr4 = new byte[i43];
                                                        for (int i44 = 0; i44 < i43; i44++) {
                                                            bArr4[i44] = (byte) n0Var2.i(i41);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        n0Var2.t(iM7 * i41);
                                                    }
                                                    i42++;
                                                    i41 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i13) {
                                                case 14700:
                                                case 16000:
                                                    d3 = 3.0d;
                                                    this.f6910q = (int) (((double) i13) * d3);
                                                    this.f6911r = (int) (((double) i31) * d3);
                                                    j9 = this.f6913t;
                                                    j10 = wVar.C;
                                                    if (j9 != j10) {
                                                        this.f6913t = j10;
                                                        String strConcat = i28 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i28))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            d2VarT = null;
                                                        } else {
                                                            d2VarT = t0.t(i0.f5137b, bArr);
                                                        }
                                                        androidx.media3.common.s sVar = new androidx.media3.common.s();
                                                        sVar.f1491a = this.f6900e;
                                                        sVar.l = x0.n("video/mp2t");
                                                        sVar.m = x0.n("audio/mhm1");
                                                        sVar.F = this.f6910q;
                                                        sVar.f1500j = strConcat;
                                                        sVar.f1504p = d2VarT;
                                                        this.f6901f.f(new androidx.media3.common.t(sVar));
                                                    }
                                                    i11 = 1;
                                                    this.f6914u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f6910q = (int) (((double) i13) * d3);
                                                    this.f6911r = (int) (((double) i31) * d3);
                                                    j9 = this.f6913t;
                                                    j10 = wVar.C;
                                                    if (j9 != j10) {
                                                        this.f6913t = j10;
                                                        if (i28 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            d2VarT = null;
                                                        } else {
                                                            d2VarT = null;
                                                        }
                                                        androidx.media3.common.s sVar2 = new androidx.media3.common.s();
                                                        sVar2.f1491a = this.f6900e;
                                                        sVar2.l = x0.n("video/mp2t");
                                                        sVar2.m = x0.n("audio/mhm1");
                                                        sVar2.F = this.f6910q;
                                                        sVar2.f1500j = strConcat;
                                                        sVar2.f1504p = d2VarT;
                                                        this.f6901f.f(new androidx.media3.common.t(sVar2));
                                                    }
                                                    i11 = 1;
                                                    this.f6914u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d3 = 1.5d;
                                                    this.f6910q = (int) (((double) i13) * d3);
                                                    this.f6911r = (int) (((double) i31) * d3);
                                                    j9 = this.f6913t;
                                                    j10 = wVar.C;
                                                    if (j9 != j10) {
                                                        this.f6913t = j10;
                                                        if (i28 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            d2VarT = null;
                                                        } else {
                                                            d2VarT = null;
                                                        }
                                                        androidx.media3.common.s sVar3 = new androidx.media3.common.s();
                                                        sVar3.f1491a = this.f6900e;
                                                        sVar3.l = x0.n("video/mp2t");
                                                        sVar3.m = x0.n("audio/mhm1");
                                                        sVar3.F = this.f6910q;
                                                        sVar3.f1500j = strConcat;
                                                        sVar3.f1504p = d2VarT;
                                                        this.f6901f.f(new androidx.media3.common.t(sVar3));
                                                    }
                                                    i11 = 1;
                                                    this.f6914u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d3 = 1.0d;
                                                    this.f6910q = (int) (((double) i13) * d3);
                                                    this.f6911r = (int) (((double) i31) * d3);
                                                    j9 = this.f6913t;
                                                    j10 = wVar.C;
                                                    if (j9 != j10) {
                                                        this.f6913t = j10;
                                                        if (i28 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            d2VarT = null;
                                                        } else {
                                                            d2VarT = null;
                                                        }
                                                        androidx.media3.common.s sVar4 = new androidx.media3.common.s();
                                                        sVar4.f1491a = this.f6900e;
                                                        sVar4.l = x0.n("video/mp2t");
                                                        sVar4.m = x0.n("audio/mhm1");
                                                        sVar4.F = this.f6910q;
                                                        sVar4.f1500j = strConcat;
                                                        sVar4.f1504p = d2VarT;
                                                        this.f6901f.f(new androidx.media3.common.t(sVar4));
                                                    }
                                                    i11 = 1;
                                                    this.f6914u = true;
                                                    break;
                                                default:
                                                    throw ParserException.c("Unsupported sampling rate " + i13);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i27 == 17) {
                                byte[] bArr5 = uVar2.f5182a;
                                n0 n0Var3 = new n0(bArr5.length, bArr5);
                                if (n0Var3.h()) {
                                    n0Var3.t(2);
                                    i12 = n0Var3.i(13);
                                } else {
                                    i12 = 0;
                                }
                                this.f6912s = i12;
                            } else if (i27 == 2) {
                                if (this.f6914u) {
                                    this.f6905j = false;
                                    i10 = 1;
                                } else {
                                    i10 = 0;
                                }
                                double d5 = (((double) (this.f6911r - this.f6912s)) * 1000000.0d) / ((double) this.f6910q);
                                long jRound = Math.round(this.f6902g);
                                if (this.f6904i) {
                                    this.f6904i = false;
                                    this.f6902g = this.f6903h;
                                } else {
                                    this.f6902g += d5;
                                }
                                this.f6901f.d(jRound, i10, this.f6908o, 0, null);
                                this.f6914u = false;
                                this.f6912s = 0;
                                this.f6908o = 0;
                            }
                            i11 = 1;
                        }
                        this.f6899d = i11;
                    }
                }
            } else {
                int i45 = this.f6906k;
                if ((i45 & 2) == 0) {
                    uVar.N(uVar.f5184c);
                } else {
                    if ((i45 & 4) == 0) {
                        while (true) {
                            if (uVar.a() > 0) {
                                int i46 = this.l << 8;
                                this.l = i46;
                                int iA2 = i46 | uVar.A();
                                this.l = iA2;
                                if ((iA2 & 16777215) == 12583333) {
                                    uVar.N(uVar.f5183b - 3);
                                    this.l = 0;
                                }
                            }
                        }
                    }
                    this.f6899d = 1;
                }
            }
        }
    }

    @Override
    public final void c(a8.s sVar, c3 c3Var) {
        c3Var.a();
        c3Var.b();
        this.f6900e = (String) c3Var.E;
        c3Var.b();
        this.f6901f = sVar.w(c3Var.C, 1);
    }

    @Override
    public final void d(boolean z10) {
    }

    @Override
    public final void e(int i10, long j9) {
        this.f6906k = i10;
        if (!this.f6905j && (this.f6908o != 0 || !this.m)) {
            this.f6904i = true;
        }
        if (j9 != -9223372036854775807L) {
            if (this.f6904i) {
                this.f6903h = j9;
            } else {
                this.f6902g = j9;
            }
        }
    }
}
