package m0;

import android.os.Trace;
import java.util.List;
import k9.x0;
import l0.u0;
import l0.v0;
import qd.s0;

public final class j {

    public final gi.c f10337a;

    public final u.w f10338b;

    public final u.x f10339c;

    public final u.u f10340d;

    public final u.w f10341e;

    public float f10342f;

    public int f10343g;

    public int f10344h;

    public int f10345i;

    public int f10346j;

    public int f10347k;
    public boolean l;
    public int m;

    public final v0 f10348n;

    public final x0 f10349o;

    public j(gi.c cVar, v0 v0Var, c cVar2) {
        this.f10337a = cVar;
        u.w wVar = u.m.f14876a;
        this.f10338b = new u.w();
        this.f10339c = new u.x();
        int i10 = u.i.f14855a;
        this.f10340d = new u.u();
        this.f10341e = new u.w();
        this.f10343g = -1;
        this.f10344h = Integer.MAX_VALUE;
        this.f10345i = Integer.MIN_VALUE;
        this.f10348n = v0Var;
        this.f10349o = new x0(cVar2, 4);
    }

    public final int a(x0 x0Var, int i10, boolean z10) {
        List list;
        List list2;
        u.w wVar = this.f10341e;
        if (wVar.a(i10)) {
            Object objB = wVar.b(i10);
            kotlin.jvm.internal.m.b(objB);
            return ((l0.g) objB).f9742b;
        }
        u.w wVar2 = this.f10338b;
        int i11 = 0;
        if (wVar2.a(i10)) {
            if (!z10 || (list2 = (List) wVar2.b(i10)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i11 < size) {
                ((u0) list2.get(i11)).a();
                i11++;
            }
            return -1;
        }
        l0.e eVar = new l0.e(this, x0Var, 0);
        long j9 = x0Var.C().f10383u;
        v0 v0Var = (v0) x0Var.D;
        if (v0Var == null) {
            kotlin.jvm.internal.m.k("state");
            throw null;
        }
        wVar2.i(i10, va.a.R(v0Var.a(i10, j9, true, new h1.v0(eVar, x0Var, 27))));
        if (!z10 || (list = (List) wVar2.b(i10)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i11 < size2) {
            ((u0) list.get(i11)).a();
            i11++;
        }
        return -1;
    }

    public final boolean b() {
        return (this.f10344h == Integer.MAX_VALUE || this.f10345i == Integer.MIN_VALUE) ? false : true;
    }

    public final void c(x0 x0Var, int i10, int i11) {
        int i12;
        int i13;
        u.w wVar = this.f10341e;
        l0.g gVar = (l0.g) wVar.b(i10);
        l0.f fVar = l0.g.f9740c;
        if (gVar != null) {
            gVar.f9742b = i11;
            gVar.f9741a = fVar;
        } else {
            gVar = new l0.g();
            gVar.f9741a = fVar;
            gVar.f9742b = i11;
        }
        wVar.i(i10, gVar);
        if (i10 > this.f10345i) {
            this.f10345i = i10;
            this.f10347k -= i11;
        } else if (i10 < this.f10344h) {
            this.f10344h = i10;
            this.f10346j -= i11;
        }
        if (Math.signum(this.f10342f) <= 0.0f) {
            if (this.f10347k > 0) {
                i12 = this.f10345i + 1;
                i13 = i12;
            } else {
                i13 = -1;
            }
        } else if (Math.signum(this.f10342f) <= 0.0f || this.f10346j <= 0) {
            i13 = -1;
        } else {
            i12 = this.f10344h - 1;
            i13 = i12;
        }
        if (i13 > 0) {
            x0Var.getClass();
            if (i13 != -1 && i13 < this.m) {
                l0.e eVar = new l0.e(this, x0Var, 1);
                long j9 = x0Var.C().f10383u;
                v0 v0Var = (v0) x0Var.D;
                if (v0Var == null) {
                    kotlin.jvm.internal.m.k("state");
                    throw null;
                }
                this.f10338b.i(i13, va.a.R(v0Var.a(i13, j9, true, new h1.v0(eVar, x0Var, 27))));
            }
        }
        h();
    }

    public final void d(x0 x0Var, int i10, int i11, int i12, int i13, int i14, float f3, boolean z10) {
        int i15;
        int i16;
        boolean z11 = Math.signum(f3) == Math.signum(this.f10342f);
        if (!z10) {
            if (!z11 || this.l) {
                this.f10346j = i12 - i14;
                this.f10344h = i10;
            } else {
                int iF = w00.a.F(Math.abs(f3)) + this.f10346j;
                int i17 = i12 - i14;
                if (iF > i17) {
                    iF = i17;
                }
                this.f10346j = iF;
            }
            while (this.f10346j > 0 && (i15 = this.f10344h) > 0) {
                int iA = a(x0Var, this.f10344h - 1, i15 + (-1) == i10 + (-1) && ((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)) != 0) && Math.abs(f3) >= ((float) i14));
                if (iA == -1) {
                    return;
                }
                this.f10344h--;
                this.f10346j -= iA;
            }
            return;
        }
        if (!z11 || this.l) {
            this.f10347k = i12 - i13;
            this.f10345i = i11;
        } else {
            int iF2 = w00.a.F(Math.abs(f3)) + this.f10347k;
            int i18 = i12 - i13;
            if (iF2 > i18) {
                iF2 = i18;
            }
            this.f10347k = iF2;
        }
        while (this.f10347k > 0) {
            int i19 = this.f10345i;
            x0Var.getClass();
            if (i19 == -1 || (i16 = this.f10345i) >= this.m - 1) {
                return;
            }
            int iA2 = a(x0Var, this.f10345i + 1, i16 + 1 == i11 + 1 && ((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)) != 0) && Math.abs(f3) >= ((float) i13));
            if (iA2 == -1) {
                return;
            }
            this.f10345i++;
            this.f10347k -= iA2;
        }
    }

    public final void e(float f3, q qVar) {
        j jVar;
        boolean z10;
        int i10;
        int i11;
        int i12;
        x0 x0Var = this.f10349o;
        x0Var.C = qVar;
        x0Var.D = this.f10348n;
        float f10 = -f3;
        h();
        if (x0Var.z()) {
            s0.h0(x0Var.C());
            x0Var.C();
            this.m = x0Var.H();
            int iX = x0Var.x();
            int iB = x0Var.B();
            int iH = x0Var.H();
            int iE = x0Var.E();
            int iD = x0Var.D();
            u.w wVar = this.f10341e;
            if (f10 <= 0.0f) {
                this.f10346j = 0 - iE;
                this.f10344h = iX;
                while (this.f10346j > 0 && (i12 = this.f10344h) > 0 && wVar.a(i12 - 1)) {
                    Object objB = wVar.b(this.f10344h - 1);
                    kotlin.jvm.internal.m.b(objB);
                    int i13 = ((l0.g) objB).f9742b;
                    this.f10344h--;
                    this.f10346j -= i13;
                }
                f(0, this.f10344h - 1);
            } else {
                this.f10347k = 0 - iD;
                this.f10345i = iB;
                while (this.f10347k > 0 && (i11 = this.f10345i) < iH - 1 && wVar.a(i11 + 1)) {
                    Object objB2 = wVar.b(this.f10345i + 1);
                    kotlin.jvm.internal.m.b(objB2);
                    int i14 = ((l0.g) objB2).f9742b;
                    this.f10345i++;
                    this.f10347k -= i14;
                }
                f(this.f10345i + 1, iH - 1);
            }
        }
        if (x0Var.z()) {
            s0.h0(x0Var.C());
            if (x0Var.C().f10382t != null) {
                i10 = ((w) this.f10337a.B).f10397o;
                z10 = false;
            } else {
                z10 = false;
                i10 = 0;
            }
            jVar = this;
            jVar.d(x0Var, x0Var.x(), x0Var.B(), i10, x0Var.D(), x0Var.E(), f10, f10 <= 0.0f ? true : z10);
        } else {
            jVar = this;
        }
        jVar.f10342f = f10;
        jVar.h();
    }

    public final void f(int i10, int i11) {
        char c10;
        long j9;
        long j10;
        long j11;
        char c11;
        int[] iArr;
        long[] jArr;
        int i12;
        char c12;
        int i13;
        u.x xVar = this.f10339c;
        xVar.b();
        u.w wVar = this.f10338b;
        int[] iArr2 = wVar.f14872b;
        long[] jArr2 = wVar.f14871a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i14 = 0;
            j9 = 128;
            j10 = 255;
            while (true) {
                long j12 = jArr2[i14];
                c10 = 7;
                j11 = -9187201950435737472L;
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i14 != length) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((j12 & 255) < 128 && i10 <= (i13 = iArr2[(i14 << 3) + i16]) && i13 <= i11) {
                            xVar.a(i13);
                        }
                        j12 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    } else if (i14 != length) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        } else {
            c10 = 7;
            j9 = 128;
            j10 = 255;
            j11 = -9187201950435737472L;
        }
        u.u uVar = this.f10340d;
        int[] iArr3 = uVar.f14898b;
        long[] jArr3 = uVar.f14897a;
        int length2 = jArr3.length - 2;
        if (length2 >= 0) {
            int i17 = 0;
            while (true) {
                long j13 = jArr3[i17];
                if ((((~j13) << c10) & j13 & j11) != j11) {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j13 & j10) < j9) {
                            c12 = c10;
                            int i20 = iArr3[(i17 << 3) + i19];
                            if (i10 <= i20 && i20 <= i11) {
                                xVar.a(i20);
                            }
                        } else {
                            c12 = c10;
                        }
                        j13 >>= 8;
                        i19++;
                        c10 = c12;
                    }
                    c11 = c10;
                    if (i18 != 8) {
                        break;
                    }
                } else {
                    c11 = c10;
                }
                if (i17 == length2) {
                    break;
                }
                i17++;
                c10 = c11;
            }
        } else {
            c11 = c10;
        }
        u.w wVar2 = this.f10341e;
        int[] iArr4 = wVar2.f14872b;
        long[] jArr4 = wVar2.f14871a;
        int length3 = jArr4.length - 2;
        if (length3 >= 0) {
            int i21 = 0;
            while (true) {
                long j14 = jArr4[i21];
                if ((((~j14) << c11) & j14 & j11) == j11) {
                    if (i21 != length3) {
                        break;
                        break;
                    }
                    i21++;
                } else {
                    int i22 = 8 - ((~(i21 - length3)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j14 & j10) < j9 && i10 <= (i12 = iArr4[(i21 << 3) + i23]) && i12 <= i11) {
                            xVar.a(i12);
                        }
                        j14 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    } else if (i21 != length3) {
                        break;
                    } else {
                        i21++;
                    }
                }
            }
        }
        int[] iArr5 = xVar.f14907b;
        long[] jArr5 = xVar.f14906a;
        int length4 = jArr5.length - 2;
        if (length4 < 0) {
            return;
        }
        int i24 = 0;
        while (true) {
            long j15 = jArr5[i24];
            if ((((~j15) << c11) & j15 & j11) != j11) {
                int i25 = 8 - ((~(i24 - length4)) >>> 31);
                int i26 = 0;
                while (i26 < i25) {
                    if ((j15 & j10) < j9) {
                        int i27 = iArr5[(i24 << 3) + i26];
                        List list = (List) wVar.g(i27);
                        if (list != null) {
                            int size = list.size();
                            for (int i28 = 0; i28 < size; i28++) {
                                ((u0) list.get(i28)).cancel();
                            }
                        }
                        int iC = uVar.c(i27);
                        if (iC >= 0) {
                            uVar.f14901e--;
                            long[] jArr6 = uVar.f14897a;
                            int i29 = uVar.f14900d;
                            int i30 = iC >> 3;
                            int i31 = (iC & 7) << 3;
                            long j16 = (jArr6[i30] & (~(255 << i31))) | (254 << i31);
                            jArr6[i30] = j16;
                            jArr6[(((iC - 7) & i29) + (i29 & 7)) >> 3] = j16;
                        }
                        wVar2.g(i27);
                    } else {
                        iArr5 = iArr5;
                        jArr5 = jArr5;
                    }
                    j15 >>= 8;
                    i26++;
                    iArr5 = iArr5;
                    jArr5 = jArr5;
                }
                iArr = iArr5;
                jArr = jArr5;
                if (i25 != 8) {
                    return;
                }
            } else {
                iArr = iArr5;
                jArr = jArr5;
            }
            if (i24 == length4) {
                return;
            }
            i24++;
            iArr5 = iArr;
            jArr5 = jArr;
        }
    }

    public final void g() {
        this.f10344h = Integer.MAX_VALUE;
        this.f10345i = Integer.MIN_VALUE;
        this.f10346j = 0;
        this.f10347k = 0;
        this.l = false;
        this.f10340d.a();
        this.f10341e.c();
        u.w wVar = this.f10338b;
        long[] jArr = wVar.f14871a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        int i13 = (i10 << 3) + i12;
                        int i14 = wVar.f14872b[i13];
                        List list = (List) wVar.f14873c[i13];
                        int size = list.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            ((u0) list.get(i15)).cancel();
                        }
                        wVar.h(i13);
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void h() {
        Trace.setCounter("prefetchWindowStartExtraSpace", this.f10346j);
        Trace.setCounter("prefetchWindowEndExtraSpace", this.f10347k);
        Trace.setCounter("prefetchWindowStartIndex", this.f10344h);
        Trace.setCounter("prefetchWindowEndIndex", this.f10345i);
    }
}
