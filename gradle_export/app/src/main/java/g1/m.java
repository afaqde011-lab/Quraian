package g1;

import com.google.android.gms.cast.Cast;

public abstract class m {

    public static final c4.c0 f5883a = new c4.c0(true);

    public static final void a(final boolean z10, final u00.a aVar, b2.r rVar, long j9, z.p1 p1Var, c4.c0 c0Var, i2.t0 t0Var, long j10, float f3, float f10, final v1.c cVar, l1.j jVar, final int i10, final int i11) {
        int i12;
        u00.a aVar2;
        b2.r rVar2;
        int i13;
        long j11;
        int i14;
        int i15;
        i2.t0 t0Var2;
        long j12;
        int i16;
        boolean z11;
        final c4.c0 c0Var2;
        final b2.r rVar3;
        final long j13;
        final i2.t0 t0Var3;
        final long j14;
        final z.p1 p1Var2;
        final float f11;
        final float f12;
        l1.r1 r1VarT;
        b2.r rVar4;
        long jFloatToRawIntBits;
        int i17;
        int i18;
        i2.t0 t0VarA;
        long jE;
        c4.c0 c0Var3;
        b2.r rVar5;
        z.p1 p1Var3;
        float f13;
        i2.t0 t0Var4;
        long j15;
        float f14;
        int i19;
        Object objN;
        l1.c cVar2;
        x.k0 k0Var;
        Object objN2;
        l1.z0 z0Var;
        y3.c cVar3;
        boolean zG;
        Object objN3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1725609375);
        if ((i10 & 6) == 0) {
            i12 = (g0Var.h(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            i12 |= g0Var.i(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        int i20 = i11 & 4;
        if (i20 == 0) {
            if ((i10 & 384) == 0) {
                rVar2 = rVar;
                i12 |= g0Var.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    j11 = j9;
                    if (g0Var.f(j11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    i12 |= 8192;
                }
                i15 = i12 | 196608;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        t0Var2 = t0Var;
                        int i21 = g0Var.g(t0Var2) ? 1048576 : 524288;
                        i15 |= i21;
                    } else {
                        t0Var2 = t0Var;
                    }
                    i15 |= i21;
                } else {
                    t0Var2 = t0Var;
                }
                if ((12582912 & i10) == 0) {
                    if ((i11 & Cast.MAX_NAMESPACE_LENGTH) == 0) {
                        j12 = j10;
                        int i22 = g0Var.f(j12) ? 8388608 : 4194304;
                        i15 |= i22;
                    } else {
                        j12 = j10;
                    }
                    i15 |= i22;
                } else {
                    j12 = j10;
                }
                i16 = i15 | 905969664;
                if ((i16 & 306783379) == 306783378) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (g0Var.S(i16 & 1, z11)) {
                    g0Var.X();
                    if ((i10 & 1) != 0 || g0Var.A()) {
                        if (i20 != 0) {
                            rVar4 = b2.o.A;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i13 != 0) {
                            float f15 = 0;
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = j11;
                        }
                        z.p1 p1VarL = z.n.l(g0Var);
                        i17 = i16 & (-57345);
                        if ((i11 & 64) != 0) {
                            float f16 = v3.f6003a;
                            t0VarA = g6.a(k1.p.f8842c, g0Var);
                            i18 = i16 & (-3727361);
                        } else {
                            i18 = i17;
                            t0VarA = t0Var2;
                        }
                        if ((i11 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                            float f17 = v3.f6003a;
                            jE = r0.e(k1.p.f8840a, g0Var);
                            i18 &= -29360129;
                        } else {
                            jE = j12;
                        }
                        float f18 = v3.f6003a;
                        float f19 = v3.f6004b;
                        c0Var3 = f5883a;
                        rVar5 = rVar4;
                        p1Var3 = p1VarL;
                        f13 = f18;
                        t0Var4 = t0VarA;
                        j15 = jE;
                        f14 = f19;
                        i19 = i18;
                        j11 = jFloatToRawIntBits;
                    } else {
                        g0Var.V();
                        i19 = i16 & (-57345);
                        if ((i11 & 64) != 0) {
                            i19 = i16 & (-3727361);
                        }
                        if ((i11 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                            i19 &= -29360129;
                        }
                        p1Var3 = p1Var;
                        f13 = f3;
                        f14 = f10;
                        rVar5 = rVar2;
                        t0Var4 = t0Var2;
                        j15 = j12;
                        c0Var3 = c0Var;
                    }
                    g0Var.s();
                    objN = g0Var.N();
                    cVar2 = l1.i.f9868a;
                    if (objN == cVar2) {
                        objN = new x.k0(Boolean.FALSE);
                        g0Var.n0(objN);
                    }
                    k0Var = (x.k0) objN;
                    k0Var.W0(Boolean.valueOf(z10));
                    if (!((Boolean) k0Var.C.getValue()).booleanValue() || ((Boolean) k0Var.D.getValue()).booleanValue()) {
                        g0Var.c0(1165905588);
                        objN2 = g0Var.N();
                        if (objN2 == cVar2) {
                            objN2 = l1.q.z(new i2.w0(i2.w0.f7175b));
                            g0Var.n0(objN2);
                        }
                        z0Var = (l1.z0) objN2;
                        cVar3 = (y3.c) g0Var.k(c3.o1.f2734h);
                        zG = ((i19 & 7168) == 2048) | g0Var.g(cVar3);
                        objN3 = g0Var.N();
                        if (zG || objN3 == cVar2) {
                            objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                            g0Var.n0(objN3);
                        }
                        c4.n.a((h1.e0) objN3, aVar2, c0Var3, v1.d.d(-917492520, new l(rVar5, k0Var, z0Var, p1Var3, t0Var4, j15, f13, f14, cVar), g0Var), g0Var, ((i19 >> 9) & 896) | (i19 & 112) | 3072, 0);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1166965571);
                        g0Var.r(false);
                    }
                    j13 = j11;
                    c0Var2 = c0Var3;
                    rVar3 = rVar5;
                    p1Var2 = p1Var3;
                    t0Var3 = t0Var4;
                    j14 = j15;
                    f11 = f13;
                    f12 = f14;
                } else {
                    g0Var.V();
                    c0Var2 = c0Var;
                    rVar3 = rVar2;
                    j13 = j11;
                    t0Var3 = t0Var2;
                    j14 = j12;
                    p1Var2 = p1Var;
                    f11 = f3;
                    f12 = f10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iK = l1.q.K(i10 | 1);
                            m.a(z10, aVar, rVar3, j13, p1Var2, c0Var2, t0Var3, j14, f11, f12, cVar, (l1.j) obj, iK, i11);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i12 |= 3072;
            j11 = j9;
            if ((i10 & 24576) == 0) {
                i12 |= 8192;
            }
            i15 = i12 | 196608;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    t0Var2 = t0Var;
                    if (g0Var.g(t0Var2)) {
                    }
                    i15 |= i21;
                } else {
                    t0Var2 = t0Var;
                }
                i15 |= i21;
            } else {
                t0Var2 = t0Var;
            }
            if ((12582912 & i10) == 0) {
                if ((i11 & Cast.MAX_NAMESPACE_LENGTH) == 0) {
                    j12 = j10;
                    if (g0Var.f(j12)) {
                    }
                    i15 |= i22;
                } else {
                    j12 = j10;
                }
                i15 |= i22;
            } else {
                j12 = j10;
            }
            i16 = i15 | 905969664;
            if ((i16 & 306783379) == 306783378) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (g0Var.S(i16 & 1, z11)) {
                g0Var.X();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i13 != 0) {
                        float f110 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f110)) << 32) | (((long) Float.floatToRawIntBits(f110)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    z.p1 p1VarL2 = z.n.l(g0Var);
                    i17 = i16 & (-57345);
                    if ((i11 & 64) != 0) {
                        float f111 = v3.f6003a;
                        t0VarA = g6.a(k1.p.f8842c, g0Var);
                        i18 = i16 & (-3727361);
                    } else {
                        i18 = i17;
                        t0VarA = t0Var2;
                    }
                    if ((i11 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                        float f112 = v3.f6003a;
                        jE = r0.e(k1.p.f8840a, g0Var);
                        i18 &= -29360129;
                    } else {
                        jE = j12;
                    }
                    float f113 = v3.f6003a;
                    float f114 = v3.f6004b;
                    c0Var3 = f5883a;
                    rVar5 = rVar4;
                    p1Var3 = p1VarL2;
                    f13 = f113;
                    t0Var4 = t0VarA;
                    j15 = jE;
                    f14 = f114;
                    i19 = i18;
                    j11 = jFloatToRawIntBits;
                } else {
                    if (i20 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i13 != 0) {
                        float f115 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f115)) << 32) | (((long) Float.floatToRawIntBits(f115)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    z.p1 p1VarL3 = z.n.l(g0Var);
                    i17 = i16 & (-57345);
                    if ((i11 & 64) != 0) {
                        float f116 = v3.f6003a;
                        t0VarA = g6.a(k1.p.f8842c, g0Var);
                        i18 = i16 & (-3727361);
                    } else {
                        i18 = i17;
                        t0VarA = t0Var2;
                    }
                    if ((i11 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                        float f117 = v3.f6003a;
                        jE = r0.e(k1.p.f8840a, g0Var);
                        i18 &= -29360129;
                    } else {
                        jE = j12;
                    }
                    float f118 = v3.f6003a;
                    float f119 = v3.f6004b;
                    c0Var3 = f5883a;
                    rVar5 = rVar4;
                    p1Var3 = p1VarL3;
                    f13 = f118;
                    t0Var4 = t0VarA;
                    j15 = jE;
                    f14 = f119;
                    i19 = i18;
                    j11 = jFloatToRawIntBits;
                }
                g0Var.s();
                objN = g0Var.N();
                cVar2 = l1.i.f9868a;
                if (objN == cVar2) {
                    objN = new x.k0(Boolean.FALSE);
                    g0Var.n0(objN);
                }
                k0Var = (x.k0) objN;
                k0Var.W0(Boolean.valueOf(z10));
                if (((Boolean) k0Var.C.getValue()).booleanValue()) {
                    g0Var.c0(1165905588);
                    objN2 = g0Var.N();
                    if (objN2 == cVar2) {
                        objN2 = l1.q.z(new i2.w0(i2.w0.f7175b));
                        g0Var.n0(objN2);
                    }
                    z0Var = (l1.z0) objN2;
                    cVar3 = (y3.c) g0Var.k(c3.o1.f2734h);
                    zG = ((i19 & 7168) == 2048) | g0Var.g(cVar3);
                    objN3 = g0Var.N();
                    if (zG) {
                        objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                        g0Var.n0(objN3);
                    } else {
                        objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                        g0Var.n0(objN3);
                    }
                    c4.n.a((h1.e0) objN3, aVar2, c0Var3, v1.d.d(-917492520, new l(rVar5, k0Var, z0Var, p1Var3, t0Var4, j15, f13, f14, cVar), g0Var), g0Var, ((i19 >> 9) & 896) | (i19 & 112) | 3072, 0);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1165905588);
                    objN2 = g0Var.N();
                    if (objN2 == cVar2) {
                        objN2 = l1.q.z(new i2.w0(i2.w0.f7175b));
                        g0Var.n0(objN2);
                    }
                    z0Var = (l1.z0) objN2;
                    cVar3 = (y3.c) g0Var.k(c3.o1.f2734h);
                    zG = ((i19 & 7168) == 2048) | g0Var.g(cVar3);
                    objN3 = g0Var.N();
                    if (zG) {
                        objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                        g0Var.n0(objN3);
                    } else {
                        objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                        g0Var.n0(objN3);
                    }
                    c4.n.a((h1.e0) objN3, aVar2, c0Var3, v1.d.d(-917492520, new l(rVar5, k0Var, z0Var, p1Var3, t0Var4, j15, f13, f14, cVar), g0Var), g0Var, ((i19 >> 9) & 896) | (i19 & 112) | 3072, 0);
                    g0Var.r(false);
                }
                j13 = j11;
                c0Var2 = c0Var3;
                rVar3 = rVar5;
                p1Var2 = p1Var3;
                t0Var3 = t0Var4;
                j14 = j15;
                f11 = f13;
                f12 = f14;
            } else {
                g0Var.V();
                c0Var2 = c0Var;
                rVar3 = rVar2;
                j13 = j11;
                t0Var3 = t0Var2;
                j14 = j12;
                p1Var2 = p1Var;
                f11 = f3;
                f12 = f10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i10 | 1);
                        m.a(z10, aVar, rVar3, j13, p1Var2, c0Var2, t0Var3, j14, f11, f12, cVar, (l1.j) obj, iK, i11);
                        return g00.b0.a;
                    }
                };
            }
        }
        i12 |= 384;
        rVar2 = rVar;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                j11 = j9;
                if (g0Var.f(j11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                i12 |= 8192;
            }
            i15 = i12 | 196608;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    t0Var2 = t0Var;
                    if (g0Var.g(t0Var2)) {
                    }
                    i15 |= i21;
                } else {
                    t0Var2 = t0Var;
                }
                i15 |= i21;
            } else {
                t0Var2 = t0Var;
            }
            if ((12582912 & i10) == 0) {
                if ((i11 & Cast.MAX_NAMESPACE_LENGTH) == 0) {
                    j12 = j10;
                    if (g0Var.f(j12)) {
                    }
                    i15 |= i22;
                } else {
                    j12 = j10;
                }
                i15 |= i22;
            } else {
                j12 = j10;
            }
            i16 = i15 | 905969664;
            if ((i16 & 306783379) == 306783378) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (g0Var.S(i16 & 1, z11)) {
                g0Var.X();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i13 != 0) {
                        float f1110 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f1110)) << 32) | (((long) Float.floatToRawIntBits(f1110)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    z.p1 p1VarL4 = z.n.l(g0Var);
                    i17 = i16 & (-57345);
                    if ((i11 & 64) != 0) {
                        float f1111 = v3.f6003a;
                        t0VarA = g6.a(k1.p.f8842c, g0Var);
                        i18 = i16 & (-3727361);
                    } else {
                        i18 = i17;
                        t0VarA = t0Var2;
                    }
                    if ((i11 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                        float f1112 = v3.f6003a;
                        jE = r0.e(k1.p.f8840a, g0Var);
                        i18 &= -29360129;
                    } else {
                        jE = j12;
                    }
                    float f1113 = v3.f6003a;
                    float f1114 = v3.f6004b;
                    c0Var3 = f5883a;
                    rVar5 = rVar4;
                    p1Var3 = p1VarL4;
                    f13 = f1113;
                    t0Var4 = t0VarA;
                    j15 = jE;
                    f14 = f1114;
                    i19 = i18;
                    j11 = jFloatToRawIntBits;
                } else {
                    if (i20 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i13 != 0) {
                        float f1115 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f1115)) << 32) | (((long) Float.floatToRawIntBits(f1115)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = j11;
                    }
                    z.p1 p1VarL5 = z.n.l(g0Var);
                    i17 = i16 & (-57345);
                    if ((i11 & 64) != 0) {
                        float f1116 = v3.f6003a;
                        t0VarA = g6.a(k1.p.f8842c, g0Var);
                        i18 = i16 & (-3727361);
                    } else {
                        i18 = i17;
                        t0VarA = t0Var2;
                    }
                    if ((i11 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                        float f1117 = v3.f6003a;
                        jE = r0.e(k1.p.f8840a, g0Var);
                        i18 &= -29360129;
                    } else {
                        jE = j12;
                    }
                    float f1118 = v3.f6003a;
                    float f1119 = v3.f6004b;
                    c0Var3 = f5883a;
                    rVar5 = rVar4;
                    p1Var3 = p1VarL5;
                    f13 = f1118;
                    t0Var4 = t0VarA;
                    j15 = jE;
                    f14 = f1119;
                    i19 = i18;
                    j11 = jFloatToRawIntBits;
                }
                g0Var.s();
                objN = g0Var.N();
                cVar2 = l1.i.f9868a;
                if (objN == cVar2) {
                    objN = new x.k0(Boolean.FALSE);
                    g0Var.n0(objN);
                }
                k0Var = (x.k0) objN;
                k0Var.W0(Boolean.valueOf(z10));
                if (((Boolean) k0Var.C.getValue()).booleanValue()) {
                    g0Var.c0(1165905588);
                    objN2 = g0Var.N();
                    if (objN2 == cVar2) {
                        objN2 = l1.q.z(new i2.w0(i2.w0.f7175b));
                        g0Var.n0(objN2);
                    }
                    z0Var = (l1.z0) objN2;
                    cVar3 = (y3.c) g0Var.k(c3.o1.f2734h);
                    zG = ((i19 & 7168) == 2048) | g0Var.g(cVar3);
                    objN3 = g0Var.N();
                    if (zG) {
                        objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                        g0Var.n0(objN3);
                    } else {
                        objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                        g0Var.n0(objN3);
                    }
                    c4.n.a((h1.e0) objN3, aVar2, c0Var3, v1.d.d(-917492520, new l(rVar5, k0Var, z0Var, p1Var3, t0Var4, j15, f13, f14, cVar), g0Var), g0Var, ((i19 >> 9) & 896) | (i19 & 112) | 3072, 0);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1165905588);
                    objN2 = g0Var.N();
                    if (objN2 == cVar2) {
                        objN2 = l1.q.z(new i2.w0(i2.w0.f7175b));
                        g0Var.n0(objN2);
                    }
                    z0Var = (l1.z0) objN2;
                    cVar3 = (y3.c) g0Var.k(c3.o1.f2734h);
                    zG = ((i19 & 7168) == 2048) | g0Var.g(cVar3);
                    objN3 = g0Var.N();
                    if (zG) {
                        objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                        g0Var.n0(objN3);
                    } else {
                        objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                        g0Var.n0(objN3);
                    }
                    c4.n.a((h1.e0) objN3, aVar2, c0Var3, v1.d.d(-917492520, new l(rVar5, k0Var, z0Var, p1Var3, t0Var4, j15, f13, f14, cVar), g0Var), g0Var, ((i19 >> 9) & 896) | (i19 & 112) | 3072, 0);
                    g0Var.r(false);
                }
                j13 = j11;
                c0Var2 = c0Var3;
                rVar3 = rVar5;
                p1Var2 = p1Var3;
                t0Var3 = t0Var4;
                j14 = j15;
                f11 = f13;
                f12 = f14;
            } else {
                g0Var.V();
                c0Var2 = c0Var;
                rVar3 = rVar2;
                j13 = j11;
                t0Var3 = t0Var2;
                j14 = j12;
                p1Var2 = p1Var;
                f11 = f3;
                f12 = f10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i10 | 1);
                        m.a(z10, aVar, rVar3, j13, p1Var2, c0Var2, t0Var3, j14, f11, f12, cVar, (l1.j) obj, iK, i11);
                        return g00.b0.a;
                    }
                };
            }
        }
        i12 |= 3072;
        j11 = j9;
        if ((i10 & 24576) == 0) {
            i12 |= 8192;
        }
        i15 = i12 | 196608;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                t0Var2 = t0Var;
                if (g0Var.g(t0Var2)) {
                }
                i15 |= i21;
            } else {
                t0Var2 = t0Var;
            }
            i15 |= i21;
        } else {
            t0Var2 = t0Var;
        }
        if ((12582912 & i10) == 0) {
            if ((i11 & Cast.MAX_NAMESPACE_LENGTH) == 0) {
                j12 = j10;
                if (g0Var.f(j12)) {
                }
                i15 |= i22;
            } else {
                j12 = j10;
            }
            i15 |= i22;
        } else {
            j12 = j10;
        }
        i16 = i15 | 905969664;
        if ((i16 & 306783379) == 306783378) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (g0Var.S(i16 & 1, z11)) {
            g0Var.X();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if (i13 != 0) {
                    float f11110 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11110)) << 32) | (((long) Float.floatToRawIntBits(f11110)) & 4294967295L);
                } else {
                    jFloatToRawIntBits = j11;
                }
                z.p1 p1VarL6 = z.n.l(g0Var);
                i17 = i16 & (-57345);
                if ((i11 & 64) != 0) {
                    float f11111 = v3.f6003a;
                    t0VarA = g6.a(k1.p.f8842c, g0Var);
                    i18 = i16 & (-3727361);
                } else {
                    i18 = i17;
                    t0VarA = t0Var2;
                }
                if ((i11 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                    float f11112 = v3.f6003a;
                    jE = r0.e(k1.p.f8840a, g0Var);
                    i18 &= -29360129;
                } else {
                    jE = j12;
                }
                float f11113 = v3.f6003a;
                float f11114 = v3.f6004b;
                c0Var3 = f5883a;
                rVar5 = rVar4;
                p1Var3 = p1VarL6;
                f13 = f11113;
                t0Var4 = t0VarA;
                j15 = jE;
                f14 = f11114;
                i19 = i18;
                j11 = jFloatToRawIntBits;
            } else {
                if (i20 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if (i13 != 0) {
                    float f11115 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f11115)) << 32) | (((long) Float.floatToRawIntBits(f11115)) & 4294967295L);
                } else {
                    jFloatToRawIntBits = j11;
                }
                z.p1 p1VarL7 = z.n.l(g0Var);
                i17 = i16 & (-57345);
                if ((i11 & 64) != 0) {
                    float f11116 = v3.f6003a;
                    t0VarA = g6.a(k1.p.f8842c, g0Var);
                    i18 = i16 & (-3727361);
                } else {
                    i18 = i17;
                    t0VarA = t0Var2;
                }
                if ((i11 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
                    float f11117 = v3.f6003a;
                    jE = r0.e(k1.p.f8840a, g0Var);
                    i18 &= -29360129;
                } else {
                    jE = j12;
                }
                float f11118 = v3.f6003a;
                float f11119 = v3.f6004b;
                c0Var3 = f5883a;
                rVar5 = rVar4;
                p1Var3 = p1VarL7;
                f13 = f11118;
                t0Var4 = t0VarA;
                j15 = jE;
                f14 = f11119;
                i19 = i18;
                j11 = jFloatToRawIntBits;
            }
            g0Var.s();
            objN = g0Var.N();
            cVar2 = l1.i.f9868a;
            if (objN == cVar2) {
                objN = new x.k0(Boolean.FALSE);
                g0Var.n0(objN);
            }
            k0Var = (x.k0) objN;
            k0Var.W0(Boolean.valueOf(z10));
            if (((Boolean) k0Var.C.getValue()).booleanValue()) {
                g0Var.c0(1165905588);
                objN2 = g0Var.N();
                if (objN2 == cVar2) {
                    objN2 = l1.q.z(new i2.w0(i2.w0.f7175b));
                    g0Var.n0(objN2);
                }
                z0Var = (l1.z0) objN2;
                cVar3 = (y3.c) g0Var.k(c3.o1.f2734h);
                zG = ((i19 & 7168) == 2048) | g0Var.g(cVar3);
                objN3 = g0Var.N();
                if (zG) {
                    objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                    g0Var.n0(objN3);
                } else {
                    objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                    g0Var.n0(objN3);
                }
                c4.n.a((h1.e0) objN3, aVar2, c0Var3, v1.d.d(-917492520, new l(rVar5, k0Var, z0Var, p1Var3, t0Var4, j15, f13, f14, cVar), g0Var), g0Var, ((i19 >> 9) & 896) | (i19 & 112) | 3072, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(1165905588);
                objN2 = g0Var.N();
                if (objN2 == cVar2) {
                    objN2 = l1.q.z(new i2.w0(i2.w0.f7175b));
                    g0Var.n0(objN2);
                }
                z0Var = (l1.z0) objN2;
                cVar3 = (y3.c) g0Var.k(c3.o1.f2734h);
                zG = ((i19 & 7168) == 2048) | g0Var.g(cVar3);
                objN3 = g0Var.N();
                if (zG) {
                    objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                    g0Var.n0(objN3);
                } else {
                    objN3 = new h1.e0(j11, cVar3, new i(z0Var, 0));
                    g0Var.n0(objN3);
                }
                c4.n.a((h1.e0) objN3, aVar2, c0Var3, v1.d.d(-917492520, new l(rVar5, k0Var, z0Var, p1Var3, t0Var4, j15, f13, f14, cVar), g0Var), g0Var, ((i19 >> 9) & 896) | (i19 & 112) | 3072, 0);
                g0Var.r(false);
            }
            j13 = j11;
            c0Var2 = c0Var3;
            rVar3 = rVar5;
            p1Var2 = p1Var3;
            t0Var3 = t0Var4;
            j14 = j15;
            f11 = f13;
            f12 = f14;
        } else {
            g0Var.V();
            c0Var2 = c0Var;
            rVar3 = rVar2;
            j13 = j11;
            t0Var3 = t0Var2;
            j14 = j12;
            p1Var2 = p1Var;
            f11 = f3;
            f12 = f10;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i10 | 1);
                    m.a(z10, aVar, rVar3, j13, p1Var2, c0Var2, t0Var3, j14, f11, f12, cVar, (l1.j) obj, iK, i11);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(v1.c cVar, u00.a aVar, b2.r rVar, u00.n nVar, boolean z10, w3 w3Var, h0.n1 n1Var, l1.j jVar, int i10, int i11) {
        b2.r rVar2;
        int i12;
        int i13;
        u00.n nVar2;
        int i14;
        int i15;
        int i16;
        boolean z11;
        l1.g0 g0Var;
        boolean z12;
        w3 w3Var2;
        h0.n1 n1Var2;
        u00.n nVar3;
        l1.r1 r1VarT;
        b2.r rVar3;
        q0 q0Var;
        w3 w3Var3;
        w3 w3Var4;
        h0.n1 n1Var3;
        boolean z13;
        w3 w3Var5;
        b2.r rVar4;
        int i17;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-532959117);
        int i18 = (g0Var2.i(aVar) ? 32 : 16) | i10;
        int i19 = i11 & 4;
        if (i19 == 0) {
            if ((i10 & 384) == 0) {
                rVar2 = rVar;
                i18 |= g0Var2.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
            }
            i12 = i18 | 3072;
            i13 = i11 & 16;
            if (i13 != 0) {
                i15 = i18 | 27648;
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                if (g0Var2.i(nVar2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i15 = i12 | i14;
            }
            i16 = i15 | 113967104;
            if ((38347923 & i16) != 38347922) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var2.S(i16 & 1, z11)) {
                g0Var2.X();
                if ((i10 & 1) != 0 || g0Var2.A()) {
                    if (i19 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i13 != 0) {
                        nVar2 = null;
                    }
                    float f3 = v3.f6003a;
                    q0Var = (q0) g0Var2.k(r0.f5948a);
                    w3Var3 = q0Var.f5912c0;
                    if (w3Var3 == null) {
                        w3Var4 = new w3(r0.d(q0Var, k1.o.f8836g), r0.d(q0Var, k1.o.f8837h), r0.d(q0Var, k1.o.f8838i), i2.t.b(k1.o.f8831b, r0.d(q0Var, k1.o.f8830a)), i2.t.b(k1.o.f8833d, r0.d(q0Var, k1.o.f8832c)), i2.t.b(k1.o.f8835f, r0.d(q0Var, k1.o.f8834e)));
                        q0Var.f5912c0 = w3Var4;
                    } else {
                        w3Var4 = w3Var3;
                    }
                    n1Var3 = v3.f6005c;
                    z13 = true;
                    w3Var5 = w3Var4;
                    rVar4 = rVar3;
                    i17 = i16 & (-3670017);
                } else {
                    g0Var2.V();
                    i17 = i16 & (-3670017);
                    z13 = z10;
                    w3Var5 = w3Var;
                    n1Var3 = n1Var;
                    rVar4 = rVar2;
                }
                u00.n nVar4 = nVar2;
                g0Var2.s();
                g0Var = g0Var2;
                z3.b(cVar, aVar, rVar4, nVar4, z13, w3Var5, n1Var3, g0Var, i17 & 268435454);
                rVar2 = rVar4;
                nVar3 = nVar4;
                z12 = z13;
                w3Var2 = w3Var5;
                n1Var2 = n1Var3;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                z12 = z10;
                w3Var2 = w3Var;
                n1Var2 = n1Var;
                nVar3 = nVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new k(cVar, aVar, rVar2, nVar3, z12, w3Var2, n1Var2, i10, i11);
            }
        }
        i18 |= 384;
        rVar2 = rVar;
        i12 = i18 | 3072;
        i13 = i11 & 16;
        if (i13 != 0) {
            i15 = i18 | 27648;
            nVar2 = nVar;
        } else {
            nVar2 = nVar;
            if (g0Var2.i(nVar2)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i15 = i12 | i14;
        }
        i16 = i15 | 113967104;
        if ((38347923 & i16) != 38347922) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g0Var2.S(i16 & 1, z11)) {
            g0Var2.X();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                if (i13 != 0) {
                    nVar2 = null;
                }
                float f10 = v3.f6003a;
                q0Var = (q0) g0Var2.k(r0.f5948a);
                w3Var3 = q0Var.f5912c0;
                if (w3Var3 == null) {
                    w3Var4 = new w3(r0.d(q0Var, k1.o.f8836g), r0.d(q0Var, k1.o.f8837h), r0.d(q0Var, k1.o.f8838i), i2.t.b(k1.o.f8831b, r0.d(q0Var, k1.o.f8830a)), i2.t.b(k1.o.f8833d, r0.d(q0Var, k1.o.f8832c)), i2.t.b(k1.o.f8835f, r0.d(q0Var, k1.o.f8834e)));
                    q0Var.f5912c0 = w3Var4;
                } else {
                    w3Var4 = w3Var3;
                }
                n1Var3 = v3.f6005c;
                z13 = true;
                w3Var5 = w3Var4;
                rVar4 = rVar3;
                i17 = i16 & (-3670017);
            } else {
                if (i19 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                if (i13 != 0) {
                    nVar2 = null;
                }
                float f11 = v3.f6003a;
                q0Var = (q0) g0Var2.k(r0.f5948a);
                w3Var3 = q0Var.f5912c0;
                if (w3Var3 == null) {
                    w3Var4 = new w3(r0.d(q0Var, k1.o.f8836g), r0.d(q0Var, k1.o.f8837h), r0.d(q0Var, k1.o.f8838i), i2.t.b(k1.o.f8831b, r0.d(q0Var, k1.o.f8830a)), i2.t.b(k1.o.f8833d, r0.d(q0Var, k1.o.f8832c)), i2.t.b(k1.o.f8835f, r0.d(q0Var, k1.o.f8834e)));
                    q0Var.f5912c0 = w3Var4;
                } else {
                    w3Var4 = w3Var3;
                }
                n1Var3 = v3.f6005c;
                z13 = true;
                w3Var5 = w3Var4;
                rVar4 = rVar3;
                i17 = i16 & (-3670017);
            }
            u00.n nVar5 = nVar2;
            g0Var2.s();
            g0Var = g0Var2;
            z3.b(cVar, aVar, rVar4, nVar5, z13, w3Var5, n1Var3, g0Var, i17 & 268435454);
            rVar2 = rVar4;
            nVar3 = nVar5;
            z12 = z13;
            w3Var2 = w3Var5;
            n1Var2 = n1Var3;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            z12 = z10;
            w3Var2 = w3Var;
            n1Var2 = n1Var;
            nVar3 = nVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new k(cVar, aVar, rVar2, nVar3, z12, w3Var2, n1Var2, i10, i11);
        }
    }
}
