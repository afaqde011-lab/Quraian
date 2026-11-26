package k3;

import a1.n;
import b3.c1;
import b3.j0;
import b3.l0;
import b3.m;
import b3.p0;
import b3.p1;
import b3.u;
import b3.z1;
import c3.v1;
import c3.z;
import c50.h;
import i2.b0;
import i2.h0;
import u.d0;
import u.w;
import y3.j;

public final class b {

    public final z f8931a;

    public final h f8932b;

    public final e f8933c;

    public final d0 f8934d;

    public boolean f8935e;

    public boolean f8936f;

    public boolean f8937g;

    public b4.a f8938h;

    public long f8939i;

    public final j0 f8940j;

    public final h2.a f8941k;

    public b(z zVar) {
        this.f8931a = zVar;
        h hVar = new h((char) 0, 11);
        hVar.C = new long[192];
        hVar.D = new long[192];
        this.f8932b = hVar;
        this.f8933c = new e();
        this.f8934d = new d0();
        this.f8939i = -1L;
        this.f8940j = new j0(this, 14);
        this.f8941k = new h2.a();
    }

    public static long d(l0 l0Var) {
        n nVar = l0Var.f2059g0;
        p1 p1Var = (p1) nVar.E;
        long jD = 0;
        for (p1 p1Var2 = (u) nVar.D; p1Var2 != null && p1Var2 != p1Var; p1Var2 = p1Var2.S) {
            z1 z1Var = p1Var2.f2107n0;
            if (z1Var != null && !b0.s(((v1) z1Var).b())) {
                return 9223372034707292159L;
            }
            jD = j.d(jD, p1Var2.f2095b0);
        }
        return jD;
    }

    public static void g(l0 l0Var) {
        if (l0Var.C) {
            z1 z1Var = ((p1) l0Var.f2059g0.E).f2107n0;
            if (z1Var == null || b0.s(((v1) z1Var).b())) {
                l0Var.C = false;
                if (l0Var.E) {
                    l0Var.D = d(l0Var);
                    l0Var.E = false;
                }
                if (j.b(l0Var.D, 9223372034707292159L)) {
                    return;
                }
                m1.e eVarB = l0Var.B();
                Object[] objArr = eVarB.A;
                int i10 = eVarB.C;
                for (int i11 = 0; i11 < i10; i11++) {
                    g((l0) objArr[i11]);
                }
            }
        }
    }

    public final void a() {
        boolean z10;
        long j9;
        int i10;
        long j10;
        long j11;
        int i11;
        Object[] objArr;
        long[] jArr;
        int length;
        d dVar;
        int i12;
        long j12;
        int i13;
        long j13;
        int i14;
        d dVar2;
        long[] jArr2;
        long[] jArr3;
        int i15;
        int i16;
        int i17;
        long j14;
        long j15;
        float[] fArr;
        d dVar3;
        long[] jArr4;
        long j16;
        long j17;
        b4.a aVar = this.f8938h;
        if (aVar != null) {
            this.f8931a.removeCallbacks(aVar);
            this.f8938h = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = this.f8935e;
        boolean z12 = z11 || this.f8936f;
        h hVar = this.f8932b;
        boolean z13 = true;
        e eVar = this.f8933c;
        if (z11) {
            this.f8935e = false;
            d0 d0Var = this.f8934d;
            Object[] objArr2 = d0Var.f14837a;
            int i18 = d0Var.f14838b;
            for (int i19 = 0; i19 < i18; i19++) {
                ((u00.a) objArr2[i19]).invoke();
            }
            long[] jArr5 = (long[]) hVar.C;
            int i20 = hVar.B;
            int i21 = 0;
            while (i21 < jArr5.length - 2 && i21 < i20) {
                long j18 = jArr5[i21 + 2];
                boolean z14 = z13;
                int i22 = i20;
                if ((((int) (j18 >> 60)) & 1) != 0) {
                    long j19 = jArr5[i21];
                    long j20 = jArr5[i21 + 1];
                    d dVar4 = (d) eVar.f8957a.b(((int) j18) & 33554431);
                    while (dVar4 != null) {
                        d dVar5 = dVar4.f8952d;
                        boolean z15 = z12;
                        long j21 = dVar4.f8955g;
                        boolean z16 = (jCurrentTimeMillis - j21 >= 0 || j21 == Long.MIN_VALUE) ? z14 : false;
                        dVar4.f8953e = j19;
                        dVar4.f8954f = j20;
                        if (z16) {
                            dVar4.f8955g = jCurrentTimeMillis;
                            j16 = j19;
                            j17 = j20;
                            dVar4.a(j16, j17, eVar.f8960d, eVar.f8961e, eVar.f8963g);
                        } else {
                            j16 = j19;
                            j17 = j20;
                        }
                        dVar4 = dVar5;
                        j19 = j16;
                        j20 = j17;
                        z12 = z15;
                    }
                }
                i21 += 3;
                z13 = z14;
                i20 = i22;
                z12 = z12;
            }
            z10 = z12;
            j9 = 0;
            long[] jArr6 = (long[]) hVar.C;
            int i23 = hVar.B;
            for (int i24 = 0; i24 < jArr6.length - 2 && i24 < i23; i24 += 3) {
                int i25 = i24 + 2;
                jArr6[i25] = jArr6[i25] & (-1152921504606846977L);
            }
        } else {
            z10 = z12;
            j9 = 0;
        }
        if (this.f8936f) {
            this.f8936f = false;
            long j22 = eVar.f8960d;
            long j23 = eVar.f8961e;
            float[] fArr2 = eVar.f8963g;
            w wVar = eVar.f8957a;
            j10 = 128;
            Object[] objArr3 = wVar.f14873c;
            long[] jArr7 = wVar.f14871a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i26 = 0;
                int i27 = 8;
                j11 = 255;
                while (true) {
                    long j24 = j22;
                    long j25 = jArr7[i26];
                    int i28 = i27;
                    hVar = hVar;
                    if ((((~j25) << 7) & j25 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i29 = 8 - ((~(i26 - length2)) >>> 31);
                        long j26 = j25;
                        int i30 = 0;
                        while (i30 < i29) {
                            if ((j26 & 255) < 128) {
                                d dVar6 = (d) objArr3[(i26 << 3) + i30];
                                while (dVar6 != null) {
                                    eVar.a(dVar6, j24, j23, fArr2, jCurrentTimeMillis);
                                    dVar6 = dVar6.f8952d;
                                    i28 = i28;
                                    jArr7 = jArr7;
                                }
                            }
                            long[] jArr8 = jArr7;
                            int i31 = i28;
                            j26 >>= i31;
                            i30++;
                            j24 = j24;
                            i28 = i31;
                            jArr7 = jArr8;
                        }
                        jArr4 = jArr7;
                        i10 = i28;
                        j22 = j24;
                        if (i29 != i10) {
                            break;
                        }
                    } else {
                        jArr4 = jArr7;
                        i10 = i28;
                        j22 = j24;
                    }
                    if (i26 == length2) {
                        break;
                    }
                    i26++;
                    i27 = i10;
                    hVar = hVar;
                    jArr7 = jArr4;
                }
            } else {
                i10 = 8;
            }
            if (z10) {
                j14 = eVar.f8960d;
                j15 = eVar.f8961e;
                fArr = eVar.f8963g;
                dVar3 = eVar.f8958b;
                if (dVar3 != null) {
                    while (dVar3 != null) {
                        l0 l0VarY = m.y(dVar3.f8950b);
                        long jB = ((z) p0.a(l0VarY)).getRectManager().b(l0VarY);
                        dVar3.f8953e = jB;
                        c1 c1Var = l0VarY.f2060h0.f2122p;
                        dVar3.f8954f = (((long) (c1Var.A + ((int) (jB >> 32)))) << 32) | (((long) (c1Var.B + ((int) (jB & 4294967295L)))) & 4294967295L);
                        eVar.a(dVar3, j14, j15, fArr, jCurrentTimeMillis);
                        dVar3 = dVar3.f8952d;
                    }
                }
            }
            if (this.f8937g) {
                i11 = 0;
                this.f8937g = false;
                h hVar2 = hVar;
                jArr2 = (long[]) hVar2.C;
                int i32 = hVar2.B;
                jArr3 = (long[]) hVar2.D;
                i16 = 0;
                for (i15 = 0; i15 < jArr2.length - 2 && i16 < jArr3.length - 2 && i15 < i32; i15 += 3) {
                    i17 = i15 + 2;
                    if (jArr2[i17] != a.f8930c) {
                        jArr3[i16] = jArr2[i15];
                        jArr3[i16 + 1] = jArr2[i15 + 1];
                        jArr3[i16 + 2] = jArr2[i17];
                        i16 += 3;
                    }
                }
                hVar2.B = i16;
                hVar2.C = jArr3;
                hVar2.D = jArr2;
            } else {
                i11 = 0;
            }
            if (eVar.f8959c <= jCurrentTimeMillis) {
                w wVar2 = eVar.f8957a;
                objArr = wVar2.f14873c;
                jArr = wVar2.f14871a;
                length = jArr.length - 2;
                if (length >= 0) {
                    i12 = i11;
                    while (true) {
                        j12 = jArr[i12];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            if (i12 != length) {
                                break;
                                break;
                            }
                            i12++;
                        } else {
                            i13 = 8 - ((~(i12 - length)) >>> 31);
                            j13 = j12;
                            for (i14 = i11; i14 < i13; i14++) {
                                if ((j13 & j11) < j10) {
                                    for (dVar2 = (d) objArr[(i12 << 3) + i14]; dVar2 != null; dVar2 = dVar2.f8952d) {
                                    }
                                }
                                j13 >>= i10;
                            }
                            if (i13 == i10) {
                                break;
                            } else if (i12 != length) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                    }
                }
                dVar = eVar.f8958b;
                if (dVar != null) {
                    while (dVar != null) {
                        dVar = dVar.f8952d;
                    }
                }
                eVar.f8959c = -1L;
            }
            if (eVar.f8959c > j9) {
                h();
            }
        }
        i10 = 8;
        j10 = 128;
        j11 = 255;
        if (z10) {
            j14 = eVar.f8960d;
            j15 = eVar.f8961e;
            fArr = eVar.f8963g;
            dVar3 = eVar.f8958b;
            if (dVar3 != null) {
                while (dVar3 != null) {
                    l0 l0VarY2 = m.y(dVar3.f8950b);
                    long jB2 = ((z) p0.a(l0VarY2)).getRectManager().b(l0VarY2);
                    dVar3.f8953e = jB2;
                    c1 c1Var2 = l0VarY2.f2060h0.f2122p;
                    dVar3.f8954f = (((long) (c1Var2.A + ((int) (jB2 >> 32)))) << 32) | (((long) (c1Var2.B + ((int) (jB2 & 4294967295L)))) & 4294967295L);
                    eVar.a(dVar3, j14, j15, fArr, jCurrentTimeMillis);
                    dVar3 = dVar3.f8952d;
                }
            }
        }
        if (this.f8937g) {
            i11 = 0;
            this.f8937g = false;
            h hVar3 = hVar;
            jArr2 = (long[]) hVar3.C;
            int i33 = hVar3.B;
            jArr3 = (long[]) hVar3.D;
            i16 = 0;
            while (i15 < jArr2.length - 2) {
                i17 = i15 + 2;
                if (jArr2[i17] != a.f8930c) {
                    jArr3[i16] = jArr2[i15];
                    jArr3[i16 + 1] = jArr2[i15 + 1];
                    jArr3[i16 + 2] = jArr2[i17];
                    i16 += 3;
                }
            }
            hVar3.B = i16;
            hVar3.C = jArr3;
            hVar3.D = jArr2;
        } else {
            i11 = 0;
        }
        if (eVar.f8959c <= jCurrentTimeMillis) {
            w wVar3 = eVar.f8957a;
            objArr = wVar3.f14873c;
            jArr = wVar3.f14871a;
            length = jArr.length - 2;
            if (length >= 0) {
                i12 = i11;
                while (true) {
                    j12 = jArr[i12];
                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                        if (i12 != length) {
                            break;
                            break;
                        }
                        i12++;
                    } else {
                        i13 = 8 - ((~(i12 - length)) >>> 31);
                        j13 = j12;
                        while (i14 < i13) {
                            if ((j13 & j11) < j10) {
                                while (dVar2 != null) {
                                }
                            }
                            j13 >>= i10;
                        }
                        if (i13 == i10) {
                            break;
                            break;
                        } else {
                            if (i12 != length) {
                                break;
                                break;
                            }
                            i12++;
                        }
                    }
                }
            }
            dVar = eVar.f8958b;
            if (dVar != null) {
                while (dVar != null) {
                    dVar = dVar.f8952d;
                }
            }
            eVar.f8959c = -1L;
        }
        if (eVar.f8959c > j9) {
            h();
        }
    }

    public final long b(l0 l0Var) {
        long j9;
        int i10 = l0Var.B & 33554431;
        h hVar = this.f8932b;
        long[] jArr = (long[]) hVar.C;
        int i11 = hVar.B;
        int i12 = 0;
        while (true) {
            if (i12 >= jArr.length - 2 || i12 >= i11) {
                j9 = Long.MAX_VALUE;
                break;
            }
            if ((((int) jArr[i12 + 2]) & 33554431) == i10) {
                j9 = jArr[i12];
                break;
            }
            i12 += 3;
        }
        if (j9 == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) j9)) & 4294967295L) | (((long) ((int) (j9 >> 32))) << 32);
    }

    public final void c(l0 l0Var) {
        boolean z10;
        l0 l0VarX;
        int i10;
        boolean z11 = true;
        l0Var.C = true;
        n nVar = l0Var.f2059g0;
        c1 c1Var = l0Var.f2060h0.f2122p;
        int iJ0 = c1Var.j0();
        float fI0 = c1Var.i0();
        h2.a aVar = this.f8941k;
        aVar.f6540b = 0.0f;
        aVar.f6541c = 0.0f;
        aVar.f6542d = iJ0;
        aVar.f6543e = fI0;
        for (p1 p1Var = (p1) nVar.E; p1Var != null; p1Var = p1Var.S) {
            l0 l0Var2 = p1Var.O;
            if (p1Var == ((p1) l0Var2.f2059g0.E) && !l0Var2.C) {
                long jB = b(l0Var2);
                if (!j.b(jB, 9223372034707292159L)) {
                    aVar.e((((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L));
                    break;
                }
            }
            z1 z1Var = p1Var.f2107n0;
            if (z1Var != null) {
                float[] fArrB = ((v1) z1Var).b();
                if (!b0.s(fArrB)) {
                    h0.c(fArrB, aVar);
                }
            }
            long j9 = p1Var.f2095b0;
            aVar.e((4294967295L & ((long) Float.floatToRawIntBits((int) (j9 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j9 >> 32)) << 32));
        }
        int i11 = (int) aVar.f6540b;
        int i12 = (int) aVar.f6541c;
        int i13 = (int) aVar.f6542d;
        int i14 = (int) aVar.f6543e;
        int i15 = l0Var.B;
        boolean z12 = l0Var.G;
        l0Var.G = true;
        h hVar = this.f8932b;
        if (z12) {
            int i16 = i15 & 33554431;
            long[] jArr = (long[]) hVar.C;
            int i17 = hVar.B;
            int i18 = 0;
            while (true) {
                if (i18 >= jArr.length - 2 || i18 >= i17) {
                    z10 = z11;
                    l0VarX = l0Var.x();
                    if (l0VarX != null) {
                        i10 = l0VarX.B;
                    } else {
                        i10 = -1;
                    }
                    h.q(hVar, i15, i11, i12, i13, i14, i10, nVar.j(1024), nVar.j(16), this.f8933c.f8957a.a(i15), 512);
                } else {
                    int i19 = i18 + 2;
                    long j10 = jArr[i19];
                    z10 = z11;
                    if ((((int) j10) & 33554431) == i16) {
                        jArr[i18] = (((long) i11) << 32) | (((long) i12) & 4294967295L);
                        jArr[i18 + 1] = (((long) i13) << 32) | (((long) i14) & 4294967295L);
                        jArr[i19] = (((j10 >> 63) & 1) << 60) | j10;
                    } else {
                        i18 += 3;
                        z11 = z10;
                    }
                }
            }
        } else {
            z10 = z11;
            l0VarX = l0Var.x();
            if (l0VarX != null) {
                i10 = l0VarX.B;
            } else {
                i10 = -1;
            }
            h.q(hVar, i15, i11, i12, i13, i14, i10, nVar.j(1024), nVar.j(16), this.f8933c.f8957a.a(i15), 512);
        }
        l0Var.F = false;
        this.f8935e = z10;
        m1.e eVarB = l0Var.B();
        Object[] objArr = eVarB.A;
        int i20 = eVarB.C;
        for (int i21 = 0; i21 < i20; i21++) {
            l0 l0Var3 = (l0) objArr[i21];
            if (l0Var3.K()) {
                c(l0Var3);
            }
        }
    }

    public final void e(l0 l0Var) {
        long j9;
        z1 z1Var;
        boolean zK = l0Var.K();
        n nVar = l0Var.f2059g0;
        if (zK && l0Var.F) {
            l0 l0VarX = l0Var.x();
            if (l0VarX == null || l0VarX.C) {
                j9 = l0VarX == null ? 0L : 9223372034707292159L;
            } else {
                if (l0VarX.E) {
                    l0VarX.E = false;
                    l0VarX.D = d(l0VarX);
                }
                j9 = l0VarX.D;
            }
            p1 p1Var = (p1) nVar.E;
            if (j.b(j9, 9223372034707292159L) || !((z1Var = p1Var.f2107n0) == null || b0.s(((v1) z1Var).b()))) {
                c(l0Var);
            } else if (l0Var.C) {
                c(l0Var);
                g(l0Var);
            } else {
                long jD = j.d(j9, p1Var.f2095b0);
                c1 c1Var = l0Var.f2060h0.f2122p;
                int iJ0 = c1Var.j0();
                int iI0 = c1Var.i0();
                int i10 = l0Var.B;
                boolean z10 = l0Var.G;
                h hVar = this.f8932b;
                long j10 = 4294967295L;
                if (!z10) {
                    l0Var.G = true;
                    boolean zJ = nVar.j(1024);
                    boolean zJ2 = nVar.j(16);
                    boolean zA = this.f8933c.f8957a.a(i10);
                    if (l0VarX != null) {
                        int i11 = l0VarX.B;
                        int i12 = (int) (jD >> 32);
                        int i13 = (int) (jD & 4294967295L);
                        int i14 = i10 & 33554431;
                        long[] jArr = (long[]) hVar.C;
                        for (int i15 = hVar.B - 3; i15 >= 0; i15 -= 3) {
                            if ((((int) jArr[i15 + 2]) & 33554431) == i11) {
                                long j11 = jArr[i15];
                                int i16 = ((int) (j11 >> 32)) + i12;
                                int i17 = ((int) j11) + i13;
                                hVar.p(i14, i16, i17, iJ0 + i16, i17 + iI0, i11, zJ, zJ2, zA, i15);
                                break;
                            }
                        }
                    } else {
                        int i18 = (int) (jD >> 32);
                        int i19 = (int) (jD & 4294967295L);
                        h.q(hVar, i10, i18, i19, i18 + iJ0, i19 + iI0, 0, zJ, zJ2, zA, 544);
                    }
                } else if (l0VarX != null) {
                    int i20 = l0VarX.B;
                    int i21 = (int) (jD >> 32);
                    int i22 = (int) (jD & 4294967295L);
                    int i23 = i10 & 33554431;
                    long[] jArr2 = (long[]) hVar.C;
                    int i24 = hVar.B;
                    int i25 = 0;
                    loop0: while (i25 < jArr2.length - 2 && i25 < i24) {
                        long j12 = j10;
                        if ((((int) jArr2[i25 + 2]) & 33554431) == i20) {
                            long j13 = jArr2[i25];
                            int i26 = ((int) (j13 >> 32)) + i21;
                            int i27 = ((int) j13) + i22;
                            int i28 = i26 + iJ0;
                            int i29 = i27 + iI0;
                            i25 += 3;
                            while (i25 < jArr2.length - 2 && i25 < i24) {
                                int i30 = i25 + 2;
                                int i31 = i20;
                                int i32 = i21;
                                long j14 = jArr2[i30];
                                int i33 = i22;
                                if ((((int) j14) & 33554431) == i23) {
                                    long j15 = jArr2[i25];
                                    long[] jArr3 = jArr2;
                                    int i34 = i26 - ((int) (j15 >> 32));
                                    int i35 = i27 - ((int) j15);
                                    jArr3[i25] = (((long) i27) & j12) | (((long) i26) << 32);
                                    jArr3[i25 + 1] = (((long) i28) << 32) | (((long) i29) & j12);
                                    jArr3[i30] = j14 | (((j14 >> 63) & 1) << 60);
                                    if (i34 != 0 || i35 != 0) {
                                        hVar.E(i34, (j14 & a.f8929b) | (((long) ((i25 + 3) & 33554431)) << 25), i35);
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                i25 += 3;
                                i20 = i31;
                                i21 = i32;
                                i22 = i33;
                            }
                        }
                        i25 += 3;
                        jArr2 = jArr2;
                        j10 = j12;
                        i20 = i20;
                        i21 = i21;
                        i22 = i22;
                    }
                } else {
                    int i36 = (int) (jD >> 32);
                    int i37 = (int) (jD & 4294967295L);
                    int i38 = iJ0 + i36;
                    int i39 = i37 + iI0;
                    int i40 = i10 & 33554431;
                    long[] jArr4 = (long[]) hVar.C;
                    int i41 = hVar.B;
                    for (int i42 = 0; i42 < jArr4.length - 2 && i42 < i41; i42 += 3) {
                        int i43 = i42 + 2;
                        long j16 = jArr4[i43];
                        if ((((int) j16) & 33554431) == i40) {
                            long j17 = jArr4[i42];
                            jArr4[i42] = (((long) i36) << 32) | (((long) i37) & 4294967295L);
                            jArr4[i42 + 1] = (((long) i39) & 4294967295L) | (((long) i38) << 32);
                            jArr4[i43] = (((j16 >> 63) & 1) << 60) | j16;
                            int i44 = i36 - ((int) (j17 >> 32));
                            int i45 = i37 - ((int) j17);
                            if (!(i44 != 0) && !(i45 != 0)) {
                                break;
                            }
                            hVar.E(i44, (a.f8929b & j16) | (((long) ((i42 + 3) & 33554431)) << 25), i45);
                            break;
                        }
                    }
                }
            }
            l0Var.F = false;
            this.f8935e = true;
            h();
        }
    }

    public final void f(l0 l0Var) {
        if (l0Var.G) {
            int i10 = l0Var.B & 33554431;
            h hVar = this.f8932b;
            long[] jArr = (long[]) hVar.C;
            int i11 = hVar.B;
            for (int i12 = 0; i12 < jArr.length - 2 && i12 < i11; i12 += 3) {
                int i13 = i12 + 2;
                if ((((int) jArr[i13]) & 33554431) == i10) {
                    jArr[i12] = -1;
                    jArr[i12 + 1] = -1;
                    jArr[i13] = a.f8930c;
                    break;
                }
            }
            l0Var.G = false;
            l0Var.F = true;
            this.f8935e = true;
            this.f8937g = true;
        }
    }

    public final void h() {
        b4.a aVar = this.f8938h;
        boolean z10 = aVar != null;
        long j9 = this.f8933c.f8959c;
        if (j9 >= 0 || !z10) {
            if (this.f8939i == j9 && z10) {
                return;
            }
            z zVar = this.f8931a;
            if (aVar != null) {
                zVar.removeCallbacks(aVar);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j9, ((long) 16) + jCurrentTimeMillis);
            this.f8939i = jMax;
            b4.a aVar2 = new b4.a(2, this.f8940j);
            zVar.postDelayed(aVar2, jMax - jCurrentTimeMillis);
            this.f8938h = aVar2;
        }
    }
}
