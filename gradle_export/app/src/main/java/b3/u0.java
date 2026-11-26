package b3;

import androidx.compose.ui.node.Owner;
import java.util.Map;

public abstract class u0 extends z2.l1 implements f1, z2.y0 {
    public r0 F;
    public u00.k G;
    public d2 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final z2.r0 L = new z2.r0(this, 0);
    public i2 M;
    public u.i0 N;

    public static void k1(p1 p1Var) {
        m0 m0Var;
        p1 p1Var2 = p1Var.R;
        l0 l0Var = p1Var.O;
        if (!kotlin.jvm.internal.m.a(p1Var2 != null ? p1Var2.O : null, l0Var)) {
            l0Var.f2060h0.f2122p.X.f();
            return;
        }
        b bVarJ = l0Var.f2060h0.f2122p.j();
        if (bVarJ == null || (m0Var = ((c1) bVarJ).X) == null) {
            return;
        }
        m0Var.f();
    }

    public abstract int C0(z2.a aVar);

    public final void E0(d2 d2Var, long j9, long j10) {
        boolean z10;
        char c10;
        long j11;
        long j12;
        long j13;
        l0 l0Var;
        boolean z11;
        int i10;
        char c11;
        long j14;
        b2 snapshotObserver;
        u.i0 i0Var = this.N;
        i2 i2Var = this.M;
        if (i2Var == null) {
            i2Var = new i2();
            this.M = i2Var;
        }
        i2 i2Var2 = i2Var;
        Owner owner = W0().O;
        if (owner != null && (snapshotObserver = ((c3.z) owner).getSnapshotObserver()) != null) {
            snapshotObserver.f2003a.d(d2Var, e.C, new s0(this, j9, j10, d2Var));
        }
        boolean zW0 = w0();
        u.j0 j0Var = (u.j0) i2Var2.f2048e;
        u.j0 j0Var2 = (u.j0) i2Var2.f2049f;
        int i11 = i2Var2.f2044a;
        for (int i12 = 0; i12 < i11; i12++) {
            byte b7 = ((byte[]) i2Var2.f2047d)[i12];
            if (b7 == 3) {
                z2.t tVar = ((z2.t[]) i2Var2.f2045b)[i12];
                kotlin.jvm.internal.m.b(tVar);
                j0Var2.j(tVar);
            } else if (b7 != 0 && i0Var != null) {
                z2.t tVar2 = ((z2.t[]) i2Var2.f2045b)[i12];
                kotlin.jvm.internal.m.b(tVar2);
                u.j0 j0Var3 = (u.j0) i0Var.k(tVar2);
                if (j0Var3 != null) {
                    j0Var.k(j0Var3);
                }
            }
        }
        int i13 = i2Var2.f2044a;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            byte[] bArr = (byte[]) i2Var2.f2047d;
            if (bArr[i15] == 2) {
                i14++;
            } else if (i14 > 0) {
                z2.t[] tVarArr = (z2.t[]) i2Var2.f2045b;
                tVarArr[i15 - i14] = tVarArr[i15];
            }
            bArr[i15] = 2;
        }
        int i16 = i2Var2.f2044a;
        for (int i17 = i16 - i14; i17 < i16; i17++) {
            ((z2.t[]) i2Var2.f2045b)[i17] = null;
        }
        i2Var2.f2044a -= i14;
        u0 u0VarC1 = c1();
        Object[] objArr = j0Var2.f14865b;
        long[] jArr = j0Var2.f14864a;
        int length = jArr.length - 2;
        char c12 = 7;
        long j15 = -9187201950435737472L;
        int i18 = 8;
        if (length >= 0) {
            j12 = 128;
            int i19 = 0;
            while (true) {
                long j16 = jArr[i19];
                j13 = 255;
                if ((((~j16) << c12) & j16 & j15) != j15) {
                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j16 & 255) < 128) {
                            c11 = c12;
                            z2.t tVar3 = (z2.t) objArr[(i19 << 3) + i21];
                            j14 = j15;
                            u0 u0Var = u0VarC1 == null ? this : u0VarC1;
                            i10 = i18;
                            u0 u0Var2 = u0Var;
                            while (true) {
                                i2 i2Var3 = u0Var2.M;
                                if (i2Var3 != null) {
                                    z11 = zW0;
                                    if (h00.n.m0(tVar3, (z2.t[]) i2Var3.f2045b)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z11 = zW0;
                                u0 u0VarC2 = u0Var2.c1();
                                if (u0VarC2 == null) {
                                    break;
                                }
                                u0Var2 = u0VarC2;
                                zW0 = z11;
                            }
                            u.i0 i0Var2 = u0Var2.N;
                            u.j0 j0Var4 = i0Var2 != null ? (u.j0) i0Var2.k(tVar3) : null;
                            if (j0Var4 != null) {
                                u0Var.l1(j0Var4);
                            }
                        } else {
                            z11 = zW0;
                            i10 = i18;
                            c11 = c12;
                            j14 = j15;
                        }
                        j16 >>= i10;
                        i21++;
                        c12 = c11;
                        j15 = j14;
                        i18 = i10;
                        zW0 = z11;
                    }
                    z10 = zW0;
                    c10 = c12;
                    j11 = j15;
                    if (i20 != i18) {
                        break;
                    }
                } else {
                    z10 = zW0;
                    c10 = c12;
                    j11 = j15;
                }
                if (i19 == length) {
                    break;
                }
                i19++;
                c12 = c10;
                j15 = j11;
                zW0 = z10;
                i18 = 8;
            }
        } else {
            z10 = zW0;
            c10 = 7;
            j11 = -9187201950435737472L;
            j12 = 128;
            j13 = 255;
        }
        j0Var2.b();
        Object[] objArr2 = j0Var.f14865b;
        long[] jArr2 = j0Var.f14864a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i22 = 0;
            while (true) {
                long j17 = jArr2[i22];
                if ((((~j17) << c10) & j17 & j11) != j11) {
                    int i23 = 8 - ((~(i22 - length2)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j17 & j13) < j12 && (l0Var = (l0) ((q2) objArr2[(i22 << 3) + i24]).get()) != null) {
                            if (z10) {
                                l0Var.U(false);
                            } else {
                                l0Var.W(false);
                            }
                        }
                        j17 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length2) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        j0Var.b();
    }

    public final void H0(z2.x0 x0Var) {
        long j9;
        long j10;
        u.i0 i0Var = this.N;
        if (this.K) {
            return;
        }
        u00.k kVarE = x0Var.e();
        if (kVarE != null) {
            boolean z10 = this.G != kVarE;
            if (z10 || !i1().A) {
                j9 = 0;
                j10 = 9223372034707292159L;
            } else {
                z2.a0 a0VarO0 = O0();
                long jC = f50.k.C(a0VarO0.G(0L));
                long jP = a0VarO0.p();
                j10 = jC;
                j9 = jP;
                z10 = (y3.j.b(jC, i1().B) && y3.l.b(jP, i1().C)) ? false : true;
            }
            if (z10) {
                d2 d2Var = this.H;
                if (d2Var != null) {
                    d2Var.A = x0Var;
                } else {
                    d2Var = new d2(x0Var, this);
                    this.H = d2Var;
                }
                E0(d2Var, j10, j9);
                this.G = x0Var.e();
                return;
            }
            return;
        }
        if (i0Var != null) {
            Object[] objArr = i0Var.f14858c;
            long[] jArr = i0Var.f14856a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j11 = jArr[i10];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j11) < 128) {
                                l1((u.j0) objArr[(i10 << 3) + i12]);
                            }
                            j11 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            i0Var.a();
        }
    }

    @Override
    public final z2.x0 J(int i10, int i11, Map map, u00.k kVar, u00.k kVar2) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            y2.a.c("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new t0(i10, i11, map, kVar, kVar2, this, 0);
    }

    public final int J0(z2.a aVar) {
        int iC0;
        if (V0() && (iC0 = C0(aVar)) != Integer.MIN_VALUE) {
            return iC0 + ((int) (aVar instanceof z2.y1 ? this.E >> 32 : this.E & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract u0 N0();

    public abstract z2.a0 O0();

    public abstract boolean V0();

    public abstract l0 W0();

    @Override
    public final void X(boolean z10) {
        u0 u0VarC1 = c1();
        l0 l0VarW0 = u0VarC1 != null ? u0VarC1.W0() : null;
        if (kotlin.jvm.internal.m.a(l0VarW0, W0())) {
            this.I = z10;
            return;
        }
        if ((l0VarW0 != null ? l0VarW0.f2060h0.f2112d : null) != f0.C) {
            if ((l0VarW0 != null ? l0VarW0.f2060h0.f2112d : null) != f0.D) {
                return;
            }
        }
        this.I = z10;
    }

    public abstract z2.x0 Z0();

    public abstract u0 c1();

    public abstract long e1();

    public final r0 i1() {
        r0 r0Var = this.F;
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0(this);
        this.F = r0Var2;
        return r0Var2;
    }

    public final void l1(u.j0 j0Var) {
        l0 l0Var;
        Object[] objArr = j0Var.f14865b;
        long[] jArr = j0Var.f14864a;
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
                    if ((255 & j9) < 128 && (l0Var = (l0) ((q2) objArr[(i10 << 3) + i12]).get()) != null) {
                        if (w0()) {
                            l0Var.U(false);
                        } else {
                            l0Var.W(false);
                        }
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

    public abstract void m1();

    @Override
    public boolean w0() {
        return false;
    }

    public final void y0(l0 l0Var, z2.t tVar) {
        char c10;
        long j9;
        long j10;
        long j11;
        long[] jArr;
        long[] jArr2;
        long j12;
        int i10;
        char c11;
        long j13;
        long j14;
        int i11;
        int i12;
        int i13;
        u.i0 i0Var = this.N;
        char c12 = 7;
        long j15 = -9187201950435737472L;
        int i14 = 8;
        if (i0Var != null) {
            Object[] objArr = i0Var.f14858c;
            long[] jArr3 = i0Var.f14856a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i15 = 0;
                long j16 = 128;
                while (true) {
                    long j17 = jArr3[i15];
                    j10 = 255;
                    if ((((~j17) << c12) & j17 & j15) != j15) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j17 & 255) < j16) {
                                c11 = c12;
                                u.j0 j0Var = (u.j0) objArr[(i15 << 3) + i17];
                                j13 = j15;
                                Object[] objArr2 = j0Var.f14865b;
                                long[] jArr4 = j0Var.f14864a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j14 = j16;
                                    int i18 = 0;
                                    int i19 = i14;
                                    while (true) {
                                        int i20 = length2;
                                        long j18 = jArr4[i18];
                                        jArr2 = jArr3;
                                        j12 = j17;
                                        if ((((~j18) << c11) & j18 & j13) != j13) {
                                            int i21 = 8 - ((~(i18 - i20)) >>> 31);
                                            int i22 = 0;
                                            while (i22 < i21) {
                                                if ((j18 & 255) < j14) {
                                                    int i23 = (i18 << 3) + i22;
                                                    l0 l0Var2 = (l0) ((q2) objArr2[i23]).get();
                                                    i12 = i22;
                                                    if (l0Var2 != null) {
                                                        boolean zJ = l0Var2.J();
                                                        i13 = i17;
                                                        if (zJ) {
                                                        }
                                                    } else {
                                                        i13 = i17;
                                                    }
                                                    j0Var.m(i23);
                                                } else {
                                                    i12 = i22;
                                                    i13 = i17;
                                                }
                                                j18 >>= i19;
                                                i22 = i12 + 1;
                                                i17 = i13;
                                            }
                                            i10 = i17;
                                            if (i21 != i19) {
                                                break;
                                            }
                                        } else {
                                            i10 = i17;
                                        }
                                        length2 = i20;
                                        if (i18 == length2) {
                                            break;
                                        }
                                        i18++;
                                        jArr3 = jArr2;
                                        j17 = j12;
                                        i17 = i10;
                                        i19 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j12 = j17;
                                    i10 = i17;
                                    j14 = j16;
                                }
                                i11 = 8;
                            } else {
                                jArr2 = jArr3;
                                j12 = j17;
                                i10 = i17;
                                c11 = c12;
                                j13 = j15;
                                j14 = j16;
                                i11 = i14;
                            }
                            i14 = i11;
                            j17 = j12 >> i11;
                            c12 = c11;
                            j15 = j13;
                            j16 = j14;
                            i17 = i10 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c10 = c12;
                        j9 = j15;
                        j11 = j16;
                        if (i16 != i14) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c10 = c12;
                        j9 = j15;
                        j11 = j16;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                    c12 = c10;
                    j15 = j9;
                    j16 = j11;
                    jArr3 = jArr;
                    i14 = 8;
                }
            } else {
                c10 = 7;
                j9 = -9187201950435737472L;
                j10 = 255;
                j11 = 128;
            }
        } else {
            c10 = 7;
            j9 = -9187201950435737472L;
            j10 = 255;
            j11 = 128;
        }
        u.i0 i0Var2 = this.N;
        if (i0Var2 != null) {
            long[] jArr5 = i0Var2.f14856a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i24 = 0;
                while (true) {
                    long j19 = jArr5[i24];
                    if ((((~j19) << c10) & j19 & j9) != j9) {
                        int i25 = 8 - ((~(i24 - length3)) >>> 31);
                        for (int i26 = 0; i26 < i25; i26++) {
                            if ((j19 & j10) < j11) {
                                int i27 = (i24 << 3) + i26;
                                if (((u.j0) i0Var2.f14858c[i27]).g()) {
                                    i0Var2.l(i27);
                                }
                            }
                            j19 >>= 8;
                        }
                        if (i25 != 8) {
                            break;
                        }
                    }
                    if (i24 == length3) {
                        break;
                    } else {
                        i24++;
                    }
                }
            }
        }
        u.i0 i0Var3 = this.N;
        if (i0Var3 == null) {
            i0Var3 = new u.i0();
            this.N = i0Var3;
        }
        Object objG = i0Var3.g(tVar);
        if (objG == null) {
            objG = new u.j0();
            i0Var3.m(tVar, objG);
        }
        ((u.j0) objG).j(new q2(l0Var));
    }
}
