package h9;

import a8.l0;
import a8.n0;
import androidx.media3.common.x0;
import com.google.android.gms.cast.Cast;
import g1.c3;
import java.util.Objects;

public final class b implements i {

    public final int f6655a;

    public final n0 f6656b;

    public final e7.u f6657c;

    public final String f6658d;

    public final int f6659e;

    public final String f6660f;

    public String f6661g;

    public l0 f6662h;

    public int f6663i;

    public int f6664j;

    public boolean f6665k;
    public long l;
    public androidx.media3.common.t m;

    public int f6666n;

    public long f6667o;

    public b(int i10, int i11, String str, String str2) {
        this.f6655a = i11;
        switch (i11) {
            case 1:
                n0 n0Var = new n0(16, new byte[16]);
                this.f6656b = n0Var;
                this.f6657c = new e7.u(n0Var.f300b);
                this.f6663i = 0;
                this.f6664j = 0;
                this.f6665k = false;
                this.f6667o = -9223372036854775807L;
                this.f6658d = str;
                this.f6659e = i10;
                this.f6660f = str2;
                break;
            default:
                n0 n0Var2 = new n0(Cast.MAX_NAMESPACE_LENGTH, new byte[Cast.MAX_NAMESPACE_LENGTH]);
                this.f6656b = n0Var2;
                this.f6657c = new e7.u(n0Var2.f300b);
                this.f6663i = 0;
                this.f6667o = -9223372036854775807L;
                this.f6658d = str;
                this.f6659e = i10;
                this.f6660f = str2;
                break;
        }
    }

    public b(String str) {
        this(0, 0, null, str);
        this.f6655a = 0;
    }

    private final void f(boolean z10) {
    }

    private final void g(boolean z10) {
    }

    @Override
    public final void a() {
        switch (this.f6655a) {
            case 0:
                this.f6663i = 0;
                this.f6664j = 0;
                this.f6665k = false;
                this.f6667o = -9223372036854775807L;
                break;
            default:
                this.f6663i = 0;
                this.f6664j = 0;
                this.f6665k = false;
                this.f6667o = -9223372036854775807L;
                break;
        }
    }

    @Override
    public final void b(e7.u uVar) {
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        byte b7;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        switch (this.f6655a) {
            case 0:
                this.f6662h.getClass();
                while (uVar.a() > 0) {
                    int i27 = this.f6663i;
                    e7.u uVar2 = this.f6657c;
                    if (i27 == 0) {
                        while (uVar.a() > 0) {
                            if (this.f6665k) {
                                int iA = uVar.A();
                                if (iA == 119) {
                                    this.f6665k = false;
                                    this.f6663i = 1;
                                    byte[] bArr = uVar2.f5182a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f6664j = 2;
                                }
                                this.f6665k = iA == 11;
                            } else {
                                this.f6665k = uVar.A() == 11;
                            }
                            break;
                        }
                    } else if (i27 == 1) {
                        byte[] bArr2 = uVar2.f5182a;
                        int iMin = Math.min(uVar.a(), 128 - this.f6664j);
                        uVar.k(this.f6664j, iMin, bArr2);
                        int i28 = this.f6664j + iMin;
                        this.f6664j = i28;
                        if (i28 == 128) {
                            n0 n0Var = this.f6656b;
                            n0Var.q(0);
                            int[] iArr = a8.b.f204f;
                            int[] iArr2 = a8.b.f202d;
                            int iG = n0Var.g();
                            n0Var.t(40);
                            Object[] objArr = n0Var.i(5) > 10;
                            n0Var.q(iG);
                            if (objArr == true) {
                                n0Var.t(16);
                                int i29 = n0Var.i(2);
                                if (i29 == 0) {
                                    b7 = 0;
                                } else if (i29 != 1) {
                                    b7 = i29 != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b7 = 1;
                                }
                                n0Var.t(3);
                                i14 = (n0Var.i(11) + 1) * 2;
                                int i30 = n0Var.i(2);
                                if (i30 == 3) {
                                    i15 = a8.b.f203e[n0Var.i(2)];
                                    i16 = 3;
                                    i17 = 6;
                                } else {
                                    int i31 = n0Var.i(2);
                                    int i32 = a8.b.f201c[i31];
                                    i15 = iArr2[i30];
                                    i16 = i31;
                                    i17 = i32;
                                }
                                i12 = i17 * 256;
                                int i33 = (i14 * i15) / (i17 * 32);
                                int i34 = n0Var.i(3);
                                boolean zH = n0Var.h();
                                i11 = iArr[i34] + (zH ? 1 : 0);
                                n0Var.t(10);
                                if (n0Var.h()) {
                                    n0Var.t(8);
                                }
                                if (i34 == 0) {
                                    n0Var.t(5);
                                    if (n0Var.h()) {
                                        n0Var.t(8);
                                    }
                                }
                                if (b7 == 1 && n0Var.h()) {
                                    n0Var.t(16);
                                }
                                if (n0Var.h()) {
                                    if (i34 > 2) {
                                        n0Var.t(2);
                                    }
                                    if ((i34 & 1) == 0 || i34 <= 2) {
                                        i22 = 6;
                                    } else {
                                        i22 = 6;
                                        n0Var.t(6);
                                    }
                                    if ((i34 & 4) != 0) {
                                        n0Var.t(i22);
                                    }
                                    if (zH && n0Var.h()) {
                                        n0Var.t(5);
                                    }
                                    if (b7 != 0) {
                                        i18 = i16;
                                    } else {
                                        if (n0Var.h()) {
                                            i23 = 6;
                                            n0Var.t(6);
                                        } else {
                                            i23 = 6;
                                        }
                                        if (i34 == 0 && n0Var.h()) {
                                            n0Var.t(i23);
                                        }
                                        if (n0Var.h()) {
                                            n0Var.t(i23);
                                        }
                                        int i35 = n0Var.i(2);
                                        if (i35 == 1) {
                                            n0Var.t(5);
                                            i25 = 2;
                                        } else {
                                            if (i35 == 2) {
                                                n0Var.t(12);
                                            } else if (i35 == 3) {
                                                int i36 = n0Var.i(5);
                                                if (n0Var.h()) {
                                                    n0Var.t(5);
                                                    if (n0Var.h()) {
                                                        i26 = 4;
                                                        n0Var.t(4);
                                                    } else {
                                                        i26 = 4;
                                                    }
                                                    if (n0Var.h()) {
                                                        n0Var.t(i26);
                                                    }
                                                    if (n0Var.h()) {
                                                        n0Var.t(i26);
                                                    }
                                                    if (n0Var.h()) {
                                                        n0Var.t(i26);
                                                    }
                                                    if (n0Var.h()) {
                                                        n0Var.t(i26);
                                                    }
                                                    if (n0Var.h()) {
                                                        n0Var.t(i26);
                                                    }
                                                    if (n0Var.h()) {
                                                        n0Var.t(i26);
                                                    }
                                                    if (n0Var.h()) {
                                                        if (n0Var.h()) {
                                                            n0Var.t(i26);
                                                        }
                                                        if (n0Var.h()) {
                                                            n0Var.t(i26);
                                                        }
                                                    }
                                                }
                                                if (n0Var.h()) {
                                                    n0Var.t(5);
                                                    if (n0Var.h()) {
                                                        n0Var.t(7);
                                                        if (n0Var.h()) {
                                                            i24 = 8;
                                                            n0Var.t(8);
                                                        } else {
                                                            i24 = 8;
                                                        }
                                                    } else {
                                                        i24 = 8;
                                                    }
                                                } else {
                                                    i24 = 8;
                                                }
                                                i25 = 2;
                                                n0Var.t((i36 + 2) * i24);
                                                n0Var.c();
                                            }
                                            i25 = 2;
                                        }
                                        if (i34 < i25) {
                                            if (n0Var.h()) {
                                                n0Var.t(14);
                                            }
                                            if (i34 == 0 && n0Var.h()) {
                                                n0Var.t(14);
                                            }
                                        }
                                        if (n0Var.h()) {
                                            i18 = i16;
                                            if (i18 == 0) {
                                                n0Var.t(5);
                                            } else {
                                                for (int i37 = 0; i37 < i17; i37++) {
                                                    if (n0Var.h()) {
                                                        n0Var.t(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i18 = i16;
                                        }
                                    }
                                } else {
                                    i18 = i16;
                                }
                                if (n0Var.h()) {
                                    n0Var.t(5);
                                    if (i34 == 2) {
                                        n0Var.t(4);
                                    }
                                    if (i34 >= 6) {
                                        n0Var.t(2);
                                    }
                                    if (n0Var.h()) {
                                        i21 = 8;
                                        n0Var.t(8);
                                    } else {
                                        i21 = 8;
                                    }
                                    if (i34 == 0 && n0Var.h()) {
                                        n0Var.t(i21);
                                    }
                                    i19 = 3;
                                    if (i30 < 3) {
                                        n0Var.s();
                                    }
                                } else {
                                    i19 = 3;
                                }
                                if (b7 == 0 && i18 != i19) {
                                    n0Var.s();
                                }
                                if (b7 == 2 && (i18 == i19 || n0Var.h())) {
                                    i20 = 6;
                                    n0Var.t(6);
                                } else {
                                    i20 = 6;
                                }
                                str = (n0Var.h() && n0Var.i(i20) == 1 && n0Var.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i13 = i33;
                            } else {
                                n0Var.t(32);
                                int i38 = n0Var.i(2);
                                String str2 = i38 == 3 ? null : "audio/ac3";
                                int i39 = n0Var.i(6);
                                int i40 = a8.b.f205g[i39 / 2] * 1000;
                                int iF = a8.b.f(i38, i39);
                                n0Var.t(8);
                                int i41 = n0Var.i(3);
                                if ((i41 & 1) == 0 || i41 == 1) {
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    n0Var.t(2);
                                }
                                if ((i41 & 4) != 0) {
                                    n0Var.t(i10);
                                }
                                if (i41 == i10) {
                                    n0Var.t(i10);
                                }
                                int i42 = i38 < 3 ? iArr2[i38] : -1;
                                i11 = iArr[i41] + (n0Var.h() ? 1 : 0);
                                i12 = 1536;
                                str = str2;
                                i13 = i40;
                                i14 = iF;
                                i15 = i42;
                            }
                            androidx.media3.common.t tVar = this.m;
                            if (tVar == null || i11 != tVar.F || i15 != tVar.G || !Objects.equals(str, tVar.f1594n)) {
                                androidx.media3.common.s sVar = new androidx.media3.common.s();
                                sVar.f1491a = this.f6661g;
                                sVar.l = x0.n(this.f6660f);
                                sVar.m = x0.n(str);
                                sVar.E = i11;
                                sVar.F = i15;
                                sVar.f1494d = this.f6658d;
                                sVar.f1496f = this.f6659e;
                                sVar.f1499i = i13;
                                if ("audio/ac3".equals(str)) {
                                    sVar.f1498h = i13;
                                }
                                androidx.media3.common.t tVar2 = new androidx.media3.common.t(sVar);
                                this.m = tVar2;
                                this.f6662h.f(tVar2);
                            }
                            this.f6666n = i14;
                            this.l = (((long) i12) * 1000000) / ((long) this.m.G);
                            uVar2.N(0);
                            this.f6662h.g(Cast.MAX_NAMESPACE_LENGTH, uVar2);
                            this.f6663i = 2;
                        }
                    } else if (i27 == 2) {
                        int iMin2 = Math.min(uVar.a(), this.f6666n - this.f6664j);
                        this.f6662h.g(iMin2, uVar);
                        int i43 = this.f6664j + iMin2;
                        this.f6664j = i43;
                        if (i43 == this.f6666n) {
                            ta.c0.A(this.f6667o != -9223372036854775807L);
                            this.f6662h.d(this.f6667o, 1, this.f6666n, 0, null);
                            this.f6667o += this.l;
                            this.f6663i = 0;
                        }
                    }
                }
                break;
            default:
                this.f6662h.getClass();
                while (uVar.a() > 0) {
                    int i44 = this.f6663i;
                    e7.u uVar3 = this.f6657c;
                    if (i44 == 0) {
                        while (uVar.a() > 0) {
                            if (this.f6665k) {
                                int iA2 = uVar.A();
                                this.f6665k = iA2 == 172;
                                if (iA2 == 64 || iA2 == 65) {
                                    Object[] objArr2 = iA2 == 65;
                                    this.f6663i = 1;
                                    byte[] bArr3 = uVar3.f5182a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.f6664j = 2;
                                }
                            } else {
                                this.f6665k = uVar.A() == 172;
                            }
                            break;
                        }
                    } else if (i44 == 1) {
                        byte[] bArr4 = uVar3.f5182a;
                        int iMin3 = Math.min(uVar.a(), 16 - this.f6664j);
                        uVar.k(this.f6664j, iMin3, bArr4);
                        int i45 = this.f6664j + iMin3;
                        this.f6664j = i45;
                        if (i45 == 16) {
                            n0 n0Var2 = this.f6656b;
                            n0Var2.q(0);
                            a8.d dVarO = a8.b.o(n0Var2);
                            int i46 = dVarO.f238a;
                            androidx.media3.common.t tVar3 = this.m;
                            if (tVar3 == null || 2 != tVar3.F || i46 != tVar3.G || !"audio/ac4".equals(tVar3.f1594n)) {
                                androidx.media3.common.s sVar2 = new androidx.media3.common.s();
                                sVar2.f1491a = this.f6661g;
                                sVar2.l = x0.n(this.f6660f);
                                sVar2.m = x0.n("audio/ac4");
                                sVar2.E = 2;
                                sVar2.F = i46;
                                sVar2.f1494d = this.f6658d;
                                sVar2.f1496f = this.f6659e;
                                androidx.media3.common.t tVar4 = new androidx.media3.common.t(sVar2);
                                this.m = tVar4;
                                this.f6662h.f(tVar4);
                            }
                            this.f6666n = dVarO.f239b;
                            this.l = (((long) dVarO.f240c) * 1000000) / ((long) this.m.G);
                            uVar3.N(0);
                            this.f6662h.g(16, uVar3);
                            this.f6663i = 2;
                        }
                    } else if (i44 == 2) {
                        int iMin4 = Math.min(uVar.a(), this.f6666n - this.f6664j);
                        this.f6662h.g(iMin4, uVar);
                        int i47 = this.f6664j + iMin4;
                        this.f6664j = i47;
                        if (i47 == this.f6666n) {
                            ta.c0.A(this.f6667o != -9223372036854775807L);
                            this.f6662h.d(this.f6667o, 1, this.f6666n, 0, null);
                            this.f6667o += this.l;
                            this.f6663i = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override
    public final void c(a8.s sVar, c3 c3Var) {
        switch (this.f6655a) {
            case 0:
                c3Var.a();
                c3Var.b();
                this.f6661g = (String) c3Var.E;
                c3Var.b();
                this.f6662h = sVar.w(c3Var.C, 1);
                break;
            default:
                c3Var.a();
                c3Var.b();
                this.f6661g = (String) c3Var.E;
                c3Var.b();
                this.f6662h = sVar.w(c3Var.C, 1);
                break;
        }
    }

    @Override
    public final void d(boolean z10) {
        int i10 = this.f6655a;
    }

    @Override
    public final void e(int i10, long j9) {
        switch (this.f6655a) {
            case 0:
                this.f6667o = j9;
                break;
            default:
                this.f6667o = j9;
                break;
        }
    }
}
