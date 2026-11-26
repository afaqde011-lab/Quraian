package g1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.cast.Cast;

public abstract class t4 {

    public static final float f5966a = 48;

    public static final float f5967b = 24;

    public static final long f5968c = i2.b0.h(0.5f, 0.0f);

    public static final void a(final u00.a aVar, b2.r rVar, m6 m6Var, float f3, boolean z10, i2.t0 t0Var, final long j9, long j10, float f10, long j11, u00.n nVar, u00.n nVar2, u4 u4Var, final v1.c cVar, l1.j jVar, final int i10, final int i11, final int i12) {
        int i13;
        float f11;
        int i14;
        i2.t0 t0VarA;
        int i15;
        int i16;
        u00.n nVar3;
        int i17;
        int i18;
        u00.n nVar4;
        boolean z11;
        boolean z12;
        l1.g0 g0Var;
        final b2.r rVar2;
        final boolean z13;
        final long j12;
        final u4 u4Var2;
        final float f12;
        final u00.n nVar5;
        final long j13;
        final u00.n nVar6;
        final i2.t0 t0Var2;
        final float f13;
        l1.r1 r1VarT;
        float f14;
        long jB;
        u00.n nVar7;
        u4 u4Var3;
        float f15;
        b2.r rVar3;
        boolean z14;
        int i19;
        i2.t0 t0Var3;
        u00.n nVar8;
        boolean z15;
        long j14;
        x.b1 b1VarP;
        x.b1 b1VarP2;
        x.b1 b1VarP3;
        int i20;
        boolean zI;
        Object objN;
        l1.c cVar2;
        m6 m6Var2;
        Object objN2;
        a40.z zVar;
        int i21;
        boolean z16;
        boolean z17;
        Object objN3;
        b2.r rVar4;
        boolean z18;
        boolean z19;
        boolean z20;
        Object objN4;
        Object objN5;
        x.b bVar;
        boolean z21;
        boolean z22;
        Object objN6;
        Object objN7;
        int i22;
        int i23;
        final m6 m6Var3 = m6Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1904798512);
        if ((i10 & 6) == 0) {
            i13 = (g0Var2.i(aVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i24 = i13 | 48;
        if ((i10 & 384) == 0) {
            i24 |= g0Var2.g(m6Var3) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        int i25 = i12 & 8;
        if (i25 == 0) {
            if ((i10 & 3072) == 0) {
                f11 = f3;
                i24 |= g0Var2.d(f11) ? 2048 : 1024;
            }
            i14 = i24 | 24576;
            if ((196608 & i10) == 0) {
                if ((i12 & 32) == 0) {
                    t0VarA = t0Var;
                    if (g0Var2.g(t0VarA)) {
                        i23 = 131072;
                    }
                    i14 |= i23;
                } else {
                    t0VarA = t0Var;
                }
                i23 = Cast.MAX_MESSAGE_LENGTH;
                i14 |= i23;
            } else {
                t0VarA = t0Var;
            }
            if ((1572864 & i10) == 0) {
                if (g0Var2.f(j9)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i14 |= i22;
            }
            if ((12582912 & i10) == 0) {
                i14 |= 4194304;
            }
            i15 = 100663296 | i14;
            if ((805306368 & i10) == 0) {
                i15 = 369098752 | i14;
            }
            i16 = i12 & 1024;
            if (i16 != 0) {
                i17 = 3078;
                nVar3 = nVar;
            } else if ((i11 & 6) == 0) {
                nVar3 = nVar;
                if (g0Var2.i(nVar3)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i17 = i11 | i18;
            } else {
                nVar3 = nVar;
                i17 = i11;
            }
            if ((i12 & 2048) == 0) {
                nVar4 = nVar2;
                int i26 = g0Var2.i(nVar4) ? 32 : 16;
                int i27 = i17 | i26 | 384;
                z11 = true;
                if ((i15 & 306783379) == 306783378 || (i27 & 1171) != 1170) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (g0Var2.S(i15 & 1, z12)) {
                    g0Var2.X();
                    if ((i10 & 1) != 0 || g0Var2.A()) {
                        if (i25 != 0) {
                            f14 = p.f5898b;
                        } else {
                            f14 = f11;
                        }
                        if ((i12 & 32) != 0) {
                            p pVar = p.f5897a;
                            i15 &= -458753;
                            t0VarA = g6.a(k1.y.f8907a, g0Var2);
                        }
                        long jB2 = r0.b(j9, g0Var2);
                        float f16 = 0;
                        p pVar2 = p.f5897a;
                        jB = i2.t.b(0.32f, r0.e(k1.v.f8897a, g0Var2));
                        int i28 = i15 & (-1908408321);
                        if (i16 != 0) {
                            nVar3 = t0.f5965a;
                        }
                        if ((i12 & 2048) != 0) {
                            nVar4 = s0.E;
                        }
                        nVar7 = nVar4;
                        u4Var3 = new u4();
                        f15 = f16;
                        rVar3 = b2.o.A;
                        z14 = false;
                        f11 = f14;
                        i19 = i28;
                        t0Var3 = t0VarA;
                        nVar8 = nVar3;
                        z15 = true;
                        j14 = jB2;
                    } else {
                        g0Var2.V();
                        if ((i12 & 32) != 0) {
                            i15 &= -458753;
                        }
                        i19 = i15 & (-1908408321);
                        rVar3 = rVar;
                        f15 = f10;
                        jB = j11;
                        z14 = false;
                        nVar7 = nVar4;
                        t0Var3 = t0VarA;
                        nVar8 = nVar3;
                        z15 = z10;
                        j14 = j10;
                        u4Var3 = u4Var;
                    }
                    g0Var2.s();
                    k1.q qVar = k1.q.A;
                    u00.n nVar9 = nVar8;
                    b1VarP = x5.p(qVar, g0Var2);
                    b1VarP2 = x5.p(qVar, g0Var2);
                    u4 u4Var4 = u4Var3;
                    b1VarP3 = x5.p(k1.q.D, g0Var2);
                    long j15 = jB;
                    i20 = (i19 & 896) ^ 384;
                    zI = (((i20 > 256 || !g0Var2.g(m6Var3)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(b1VarP2) | g0Var2.i(b1VarP3) | g0Var2.i(b1VarP);
                    objN = g0Var2.N();
                    cVar2 = l1.i.f9868a;
                    if (!zI || objN == cVar2) {
                        objN = new ct.m(m6Var, b1VarP2, b1VarP3, b1VarP, 2);
                        m6Var2 = m6Var;
                        g0Var2.n0(objN);
                    } else {
                        m6Var2 = m6Var;
                    }
                    l1.q.k((u00.a) objN, g0Var2);
                    objN2 = g0Var2.N();
                    if (objN2 == cVar2) {
                        objN2 = l1.q.o(g0Var2);
                        g0Var2.n0(objN2);
                    }
                    zVar = (a40.z) objN2;
                    boolean zI2 = (((i20 > 256 || !g0Var2.g(m6Var2)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(zVar);
                    i21 = i19 & 14;
                    if (i21 == 4) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    z17 = zI2 | z16;
                    objN3 = g0Var2.N();
                    if (z17 || objN3 == cVar2) {
                        objN3 = new cz.c(m6Var2, zVar, aVar);
                        g0Var2.n0(objN3);
                    }
                    u00.a aVar2 = (u00.a) objN3;
                    boolean zI3 = g0Var2.i(zVar);
                    if (i20 > 256 || !g0Var2.g(m6Var2)) {
                        rVar4 = rVar3;
                        if ((i19 & 384) != 256) {
                            z18 = z14;
                        }
                        boolean z23 = zI3 | z18;
                        if (i21 == 4) {
                            z19 = true;
                        } else {
                            z19 = z14;
                        }
                        z20 = z23 | z19;
                        objN4 = g0Var2.N();
                        if (z20 || objN4 == cVar2) {
                            objN4 = new b1.l(zVar, m6Var2, aVar, 10);
                            g0Var2.n0(objN4);
                        }
                        u00.k kVar = (u00.k) objN4;
                        objN5 = g0Var2.N();
                        if (objN5 == cVar2) {
                            objN5 = x.c.a(0.0f, 0.01f);
                            g0Var2.n0(objN5);
                        }
                        bVar = (x.b) objN5;
                        boolean zI4 = (((i20 > 256 || !g0Var2.g(m6Var2)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(zVar) | g0Var2.i(bVar);
                        if (i21 == 4) {
                            z21 = true;
                        } else {
                            z21 = z14;
                        }
                        z22 = z21 | zI4;
                        objN6 = g0Var2.N();
                        if (z22 || objN6 == cVar2) {
                            objN6 = new ct.m(m6Var, zVar, bVar, aVar, 3);
                            g0Var2.n0(objN6);
                        }
                        u00.a aVar3 = (u00.a) objN6;
                        int i29 = i19;
                        float f17 = f15;
                        m6Var3 = m6Var;
                        g0Var = g0Var2;
                        x5.g(aVar3, j14, u4Var4, bVar, v1.d.d(1010026864, new n4(j15, aVar2, m6Var, u4Var4, bVar, zVar, kVar, rVar4, f11, z15, t0Var3, j9, j14, f17, nVar9, nVar7, cVar), g0Var), g0Var, 29056);
                        if (m6Var3.f5887d.g().f6524a.containsKey(n6.B)) {
                            g0Var.c0(748459762);
                            if ((i20 > 256 || !g0Var.g(m6Var3)) && (i29 & 384) != 256) {
                            }
                            objN7 = g0Var.N();
                            if (z11 || objN7 == cVar2) {
                                objN7 = new m4(m6Var3, null, 2);
                                g0Var.n0(objN7);
                            }
                            l1.q.i(m6Var3, g0Var, (u00.n) objN7);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(748521266);
                            g0Var.r(false);
                        }
                        f12 = f11;
                        t0Var2 = t0Var3;
                        j13 = j14;
                        nVar5 = nVar9;
                        nVar6 = nVar7;
                        j12 = j15;
                        u4Var2 = u4Var4;
                        z13 = z15;
                        f13 = f17;
                        rVar2 = rVar4;
                    } else {
                        rVar4 = rVar3;
                    }
                    z18 = true;
                    boolean z24 = zI3 | z18;
                    if (i21 == 4) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    z20 = z24 | z19;
                    objN4 = g0Var2.N();
                    if (z20) {
                        objN4 = new b1.l(zVar, m6Var2, aVar, 10);
                        g0Var2.n0(objN4);
                    } else {
                        objN4 = new b1.l(zVar, m6Var2, aVar, 10);
                        g0Var2.n0(objN4);
                    }
                    u00.k kVar2 = (u00.k) objN4;
                    objN5 = g0Var2.N();
                    if (objN5 == cVar2) {
                        objN5 = x.c.a(0.0f, 0.01f);
                        g0Var2.n0(objN5);
                    }
                    bVar = (x.b) objN5;
                    boolean zI5 = (((i20 > 256 || !g0Var2.g(m6Var2)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(zVar) | g0Var2.i(bVar);
                    if (i21 == 4) {
                        z21 = true;
                    } else {
                        z21 = z14;
                    }
                    z22 = z21 | zI5;
                    objN6 = g0Var2.N();
                    if (z22) {
                        objN6 = new ct.m(m6Var, zVar, bVar, aVar, 3);
                        g0Var2.n0(objN6);
                    } else {
                        objN6 = new ct.m(m6Var, zVar, bVar, aVar, 3);
                        g0Var2.n0(objN6);
                    }
                    u00.a aVar4 = (u00.a) objN6;
                    int i210 = i19;
                    float f18 = f15;
                    m6Var3 = m6Var;
                    g0Var = g0Var2;
                    x5.g(aVar4, j14, u4Var4, bVar, v1.d.d(1010026864, new n4(j15, aVar2, m6Var, u4Var4, bVar, zVar, kVar2, rVar4, f11, z15, t0Var3, j9, j14, f18, nVar9, nVar7, cVar), g0Var), g0Var, 29056);
                    if (m6Var3.f5887d.g().f6524a.containsKey(n6.B)) {
                        g0Var.c0(748459762);
                        z11 = i20 > 256 ? false : false;
                        objN7 = g0Var.N();
                        if (z11) {
                            objN7 = new m4(m6Var3, null, 2);
                            g0Var.n0(objN7);
                        } else {
                            objN7 = new m4(m6Var3, null, 2);
                            g0Var.n0(objN7);
                        }
                        l1.q.i(m6Var3, g0Var, (u00.n) objN7);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(748521266);
                        g0Var.r(false);
                    }
                    f12 = f11;
                    t0Var2 = t0Var3;
                    j13 = j14;
                    nVar5 = nVar9;
                    nVar6 = nVar7;
                    j12 = j15;
                    u4Var2 = u4Var4;
                    z13 = z15;
                    f13 = f18;
                    rVar2 = rVar4;
                } else {
                    g0Var = g0Var2;
                    g0Var.V();
                    rVar2 = rVar;
                    z13 = z10;
                    j12 = j11;
                    u4Var2 = u4Var;
                    f12 = f11;
                    nVar5 = nVar3;
                    j13 = j10;
                    nVar6 = nVar4;
                    t0Var2 = t0VarA;
                    f13 = f10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iK = l1.q.K(i10 | 1);
                            int iK2 = l1.q.K(i11);
                            t4.a(aVar, rVar2, m6Var3, f12, z13, t0Var2, j9, j13, f13, j12, nVar5, nVar6, u4Var2, cVar, (l1.j) obj, iK, iK2, i12);
                            return g00.b0.a;
                        }
                    };
                }
            }
            nVar4 = nVar2;
            int i211 = i17 | i26 | 384;
            z11 = true;
            if ((i15 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (g0Var2.S(i15 & 1, z12)) {
                g0Var2.X();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        f14 = p.f5898b;
                    } else {
                        f14 = f11;
                    }
                    if ((i12 & 32) != 0) {
                        p pVar3 = p.f5897a;
                        i15 &= -458753;
                        t0VarA = g6.a(k1.y.f8907a, g0Var2);
                    }
                    long jB3 = r0.b(j9, g0Var2);
                    float f19 = 0;
                    p pVar4 = p.f5897a;
                    jB = i2.t.b(0.32f, r0.e(k1.v.f8897a, g0Var2));
                    int i212 = i15 & (-1908408321);
                    if (i16 != 0) {
                        nVar3 = t0.f5965a;
                    }
                    if ((i12 & 2048) != 0) {
                        nVar4 = s0.E;
                    }
                    nVar7 = nVar4;
                    u4Var3 = new u4();
                    f15 = f19;
                    rVar3 = b2.o.A;
                    z14 = false;
                    f11 = f14;
                    i19 = i212;
                    t0Var3 = t0VarA;
                    nVar8 = nVar3;
                    z15 = true;
                    j14 = jB3;
                } else {
                    if (i25 != 0) {
                        f14 = p.f5898b;
                    } else {
                        f14 = f11;
                    }
                    if ((i12 & 32) != 0) {
                        p pVar5 = p.f5897a;
                        i15 &= -458753;
                        t0VarA = g6.a(k1.y.f8907a, g0Var2);
                    }
                    long jB4 = r0.b(j9, g0Var2);
                    float f110 = 0;
                    p pVar6 = p.f5897a;
                    jB = i2.t.b(0.32f, r0.e(k1.v.f8897a, g0Var2));
                    int i213 = i15 & (-1908408321);
                    if (i16 != 0) {
                        nVar3 = t0.f5965a;
                    }
                    if ((i12 & 2048) != 0) {
                        nVar4 = s0.E;
                    }
                    nVar7 = nVar4;
                    u4Var3 = new u4();
                    f15 = f110;
                    rVar3 = b2.o.A;
                    z14 = false;
                    f11 = f14;
                    i19 = i213;
                    t0Var3 = t0VarA;
                    nVar8 = nVar3;
                    z15 = true;
                    j14 = jB4;
                }
                g0Var2.s();
                k1.q qVar2 = k1.q.A;
                u00.n nVar10 = nVar8;
                b1VarP = x5.p(qVar2, g0Var2);
                b1VarP2 = x5.p(qVar2, g0Var2);
                u4 u4Var5 = u4Var3;
                b1VarP3 = x5.p(k1.q.D, g0Var2);
                long j16 = jB;
                i20 = (i19 & 896) ^ 384;
                zI = (((i20 > 256 || !g0Var2.g(m6Var3)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(b1VarP2) | g0Var2.i(b1VarP3) | g0Var2.i(b1VarP);
                objN = g0Var2.N();
                cVar2 = l1.i.f9868a;
                if (zI) {
                    objN = new ct.m(m6Var, b1VarP2, b1VarP3, b1VarP, 2);
                    m6Var2 = m6Var;
                    g0Var2.n0(objN);
                } else {
                    objN = new ct.m(m6Var, b1VarP2, b1VarP3, b1VarP, 2);
                    m6Var2 = m6Var;
                    g0Var2.n0(objN);
                }
                l1.q.k((u00.a) objN, g0Var2);
                objN2 = g0Var2.N();
                if (objN2 == cVar2) {
                    objN2 = l1.q.o(g0Var2);
                    g0Var2.n0(objN2);
                }
                zVar = (a40.z) objN2;
                boolean zI6 = (((i20 > 256 || !g0Var2.g(m6Var2)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(zVar);
                i21 = i19 & 14;
                if (i21 == 4) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                z17 = zI6 | z16;
                objN3 = g0Var2.N();
                if (z17) {
                    objN3 = new cz.c(m6Var2, zVar, aVar);
                    g0Var2.n0(objN3);
                } else {
                    objN3 = new cz.c(m6Var2, zVar, aVar);
                    g0Var2.n0(objN3);
                }
                u00.a aVar5 = (u00.a) objN3;
                boolean zI7 = g0Var2.i(zVar);
                if (i20 > 256) {
                    rVar4 = rVar3;
                    if ((i19 & 384) != 256) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                } else {
                    rVar4 = rVar3;
                    if ((i19 & 384) != 256) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                }
                boolean z25 = zI7 | z18;
                if (i21 == 4) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                z20 = z25 | z19;
                objN4 = g0Var2.N();
                if (z20) {
                    objN4 = new b1.l(zVar, m6Var2, aVar, 10);
                    g0Var2.n0(objN4);
                } else {
                    objN4 = new b1.l(zVar, m6Var2, aVar, 10);
                    g0Var2.n0(objN4);
                }
                u00.k kVar3 = (u00.k) objN4;
                objN5 = g0Var2.N();
                if (objN5 == cVar2) {
                    objN5 = x.c.a(0.0f, 0.01f);
                    g0Var2.n0(objN5);
                }
                bVar = (x.b) objN5;
                boolean zI8 = (((i20 > 256 || !g0Var2.g(m6Var2)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(zVar) | g0Var2.i(bVar);
                if (i21 == 4) {
                    z21 = true;
                } else {
                    z21 = z14;
                }
                z22 = z21 | zI8;
                objN6 = g0Var2.N();
                if (z22) {
                    objN6 = new ct.m(m6Var, zVar, bVar, aVar, 3);
                    g0Var2.n0(objN6);
                } else {
                    objN6 = new ct.m(m6Var, zVar, bVar, aVar, 3);
                    g0Var2.n0(objN6);
                }
                u00.a aVar6 = (u00.a) objN6;
                int i214 = i19;
                float f111 = f15;
                m6Var3 = m6Var;
                g0Var = g0Var2;
                x5.g(aVar6, j14, u4Var5, bVar, v1.d.d(1010026864, new n4(j16, aVar5, m6Var, u4Var5, bVar, zVar, kVar3, rVar4, f11, z15, t0Var3, j9, j14, f111, nVar10, nVar7, cVar), g0Var), g0Var, 29056);
                if (m6Var3.f5887d.g().f6524a.containsKey(n6.B)) {
                    g0Var.c0(748459762);
                    if (i20 > 256) {
                    }
                    objN7 = g0Var.N();
                    if (z11) {
                        objN7 = new m4(m6Var3, null, 2);
                        g0Var.n0(objN7);
                    } else {
                        objN7 = new m4(m6Var3, null, 2);
                        g0Var.n0(objN7);
                    }
                    l1.q.i(m6Var3, g0Var, (u00.n) objN7);
                    g0Var.r(false);
                } else {
                    g0Var.c0(748521266);
                    g0Var.r(false);
                }
                f12 = f11;
                t0Var2 = t0Var3;
                j13 = j14;
                nVar5 = nVar10;
                nVar6 = nVar7;
                j12 = j16;
                u4Var2 = u4Var5;
                z13 = z15;
                f13 = f111;
                rVar2 = rVar4;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                rVar2 = rVar;
                z13 = z10;
                j12 = j11;
                u4Var2 = u4Var;
                f12 = f11;
                nVar5 = nVar3;
                j13 = j10;
                nVar6 = nVar4;
                t0Var2 = t0VarA;
                f13 = f10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i10 | 1);
                        int iK2 = l1.q.K(i11);
                        t4.a(aVar, rVar2, m6Var3, f12, z13, t0Var2, j9, j13, f13, j12, nVar5, nVar6, u4Var2, cVar, (l1.j) obj, iK, iK2, i12);
                        return g00.b0.a;
                    }
                };
            }
        }
        i24 |= 3072;
        f11 = f3;
        i14 = i24 | 24576;
        if ((196608 & i10) == 0) {
            if ((i12 & 32) == 0) {
                t0VarA = t0Var;
                if (g0Var2.g(t0VarA)) {
                    i23 = 131072;
                }
                i14 |= i23;
            } else {
                t0VarA = t0Var;
            }
            i23 = Cast.MAX_MESSAGE_LENGTH;
            i14 |= i23;
        } else {
            t0VarA = t0Var;
        }
        if ((1572864 & i10) == 0) {
            if (g0Var2.f(j9)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i14 |= i22;
        }
        if ((12582912 & i10) == 0) {
            i14 |= 4194304;
        }
        i15 = 100663296 | i14;
        if ((805306368 & i10) == 0) {
            i15 = 369098752 | i14;
        }
        i16 = i12 & 1024;
        if (i16 != 0) {
            i17 = 3078;
            nVar3 = nVar;
        } else if ((i11 & 6) == 0) {
            nVar3 = nVar;
            if (g0Var2.i(nVar3)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i17 = i11 | i18;
        } else {
            nVar3 = nVar;
            i17 = i11;
        }
        if ((i12 & 2048) == 0) {
            nVar4 = nVar2;
            if (g0Var2.i(nVar4)) {
            }
            int i215 = i17 | i26 | 384;
            z11 = true;
            if ((i15 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (g0Var2.S(i15 & 1, z12)) {
                g0Var2.X();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        f14 = p.f5898b;
                    } else {
                        f14 = f11;
                    }
                    if ((i12 & 32) != 0) {
                        p pVar7 = p.f5897a;
                        i15 &= -458753;
                        t0VarA = g6.a(k1.y.f8907a, g0Var2);
                    }
                    long jB5 = r0.b(j9, g0Var2);
                    float f112 = 0;
                    p pVar8 = p.f5897a;
                    jB = i2.t.b(0.32f, r0.e(k1.v.f8897a, g0Var2));
                    int i216 = i15 & (-1908408321);
                    if (i16 != 0) {
                        nVar3 = t0.f5965a;
                    }
                    if ((i12 & 2048) != 0) {
                        nVar4 = s0.E;
                    }
                    nVar7 = nVar4;
                    u4Var3 = new u4();
                    f15 = f112;
                    rVar3 = b2.o.A;
                    z14 = false;
                    f11 = f14;
                    i19 = i216;
                    t0Var3 = t0VarA;
                    nVar8 = nVar3;
                    z15 = true;
                    j14 = jB5;
                } else {
                    if (i25 != 0) {
                        f14 = p.f5898b;
                    } else {
                        f14 = f11;
                    }
                    if ((i12 & 32) != 0) {
                        p pVar9 = p.f5897a;
                        i15 &= -458753;
                        t0VarA = g6.a(k1.y.f8907a, g0Var2);
                    }
                    long jB6 = r0.b(j9, g0Var2);
                    float f113 = 0;
                    p pVar10 = p.f5897a;
                    jB = i2.t.b(0.32f, r0.e(k1.v.f8897a, g0Var2));
                    int i217 = i15 & (-1908408321);
                    if (i16 != 0) {
                        nVar3 = t0.f5965a;
                    }
                    if ((i12 & 2048) != 0) {
                        nVar4 = s0.E;
                    }
                    nVar7 = nVar4;
                    u4Var3 = new u4();
                    f15 = f113;
                    rVar3 = b2.o.A;
                    z14 = false;
                    f11 = f14;
                    i19 = i217;
                    t0Var3 = t0VarA;
                    nVar8 = nVar3;
                    z15 = true;
                    j14 = jB6;
                }
                g0Var2.s();
                k1.q qVar3 = k1.q.A;
                u00.n nVar11 = nVar8;
                b1VarP = x5.p(qVar3, g0Var2);
                b1VarP2 = x5.p(qVar3, g0Var2);
                u4 u4Var6 = u4Var3;
                b1VarP3 = x5.p(k1.q.D, g0Var2);
                long j17 = jB;
                i20 = (i19 & 896) ^ 384;
                zI = (((i20 > 256 || !g0Var2.g(m6Var3)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(b1VarP2) | g0Var2.i(b1VarP3) | g0Var2.i(b1VarP);
                objN = g0Var2.N();
                cVar2 = l1.i.f9868a;
                if (zI) {
                    objN = new ct.m(m6Var, b1VarP2, b1VarP3, b1VarP, 2);
                    m6Var2 = m6Var;
                    g0Var2.n0(objN);
                } else {
                    objN = new ct.m(m6Var, b1VarP2, b1VarP3, b1VarP, 2);
                    m6Var2 = m6Var;
                    g0Var2.n0(objN);
                }
                l1.q.k((u00.a) objN, g0Var2);
                objN2 = g0Var2.N();
                if (objN2 == cVar2) {
                    objN2 = l1.q.o(g0Var2);
                    g0Var2.n0(objN2);
                }
                zVar = (a40.z) objN2;
                boolean zI9 = (((i20 > 256 || !g0Var2.g(m6Var2)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(zVar);
                i21 = i19 & 14;
                if (i21 == 4) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                z17 = zI9 | z16;
                objN3 = g0Var2.N();
                if (z17) {
                    objN3 = new cz.c(m6Var2, zVar, aVar);
                    g0Var2.n0(objN3);
                } else {
                    objN3 = new cz.c(m6Var2, zVar, aVar);
                    g0Var2.n0(objN3);
                }
                u00.a aVar7 = (u00.a) objN3;
                boolean zI10 = g0Var2.i(zVar);
                if (i20 > 256) {
                    rVar4 = rVar3;
                    if ((i19 & 384) != 256) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                } else {
                    rVar4 = rVar3;
                    if ((i19 & 384) != 256) {
                        z18 = true;
                    } else {
                        z18 = z14;
                    }
                }
                boolean z26 = zI10 | z18;
                if (i21 == 4) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                z20 = z26 | z19;
                objN4 = g0Var2.N();
                if (z20) {
                    objN4 = new b1.l(zVar, m6Var2, aVar, 10);
                    g0Var2.n0(objN4);
                } else {
                    objN4 = new b1.l(zVar, m6Var2, aVar, 10);
                    g0Var2.n0(objN4);
                }
                u00.k kVar4 = (u00.k) objN4;
                objN5 = g0Var2.N();
                if (objN5 == cVar2) {
                    objN5 = x.c.a(0.0f, 0.01f);
                    g0Var2.n0(objN5);
                }
                bVar = (x.b) objN5;
                boolean zI11 = (((i20 > 256 || !g0Var2.g(m6Var2)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(zVar) | g0Var2.i(bVar);
                if (i21 == 4) {
                    z21 = true;
                } else {
                    z21 = z14;
                }
                z22 = z21 | zI11;
                objN6 = g0Var2.N();
                if (z22) {
                    objN6 = new ct.m(m6Var, zVar, bVar, aVar, 3);
                    g0Var2.n0(objN6);
                } else {
                    objN6 = new ct.m(m6Var, zVar, bVar, aVar, 3);
                    g0Var2.n0(objN6);
                }
                u00.a aVar8 = (u00.a) objN6;
                int i218 = i19;
                float f114 = f15;
                m6Var3 = m6Var;
                g0Var = g0Var2;
                x5.g(aVar8, j14, u4Var6, bVar, v1.d.d(1010026864, new n4(j17, aVar7, m6Var, u4Var6, bVar, zVar, kVar4, rVar4, f11, z15, t0Var3, j9, j14, f114, nVar11, nVar7, cVar), g0Var), g0Var, 29056);
                if (m6Var3.f5887d.g().f6524a.containsKey(n6.B)) {
                    g0Var.c0(748459762);
                    if (i20 > 256) {
                    }
                    objN7 = g0Var.N();
                    if (z11) {
                        objN7 = new m4(m6Var3, null, 2);
                        g0Var.n0(objN7);
                    } else {
                        objN7 = new m4(m6Var3, null, 2);
                        g0Var.n0(objN7);
                    }
                    l1.q.i(m6Var3, g0Var, (u00.n) objN7);
                    g0Var.r(false);
                } else {
                    g0Var.c0(748521266);
                    g0Var.r(false);
                }
                f12 = f11;
                t0Var2 = t0Var3;
                j13 = j14;
                nVar5 = nVar11;
                nVar6 = nVar7;
                j12 = j17;
                u4Var2 = u4Var6;
                z13 = z15;
                f13 = f114;
                rVar2 = rVar4;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                rVar2 = rVar;
                z13 = z10;
                j12 = j11;
                u4Var2 = u4Var;
                f12 = f11;
                nVar5 = nVar3;
                j13 = j10;
                nVar6 = nVar4;
                t0Var2 = t0VarA;
                f13 = f10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i10 | 1);
                        int iK2 = l1.q.K(i11);
                        t4.a(aVar, rVar2, m6Var3, f12, z13, t0Var2, j9, j13, f13, j12, nVar5, nVar6, u4Var2, cVar, (l1.j) obj, iK, iK2, i12);
                        return g00.b0.a;
                    }
                };
            }
        }
        nVar4 = nVar2;
        int i219 = i17 | i26 | 384;
        z11 = true;
        if ((i15 & 306783379) == 306783378) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (g0Var2.S(i15 & 1, z12)) {
            g0Var2.X();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    f14 = p.f5898b;
                } else {
                    f14 = f11;
                }
                if ((i12 & 32) != 0) {
                    p pVar11 = p.f5897a;
                    i15 &= -458753;
                    t0VarA = g6.a(k1.y.f8907a, g0Var2);
                }
                long jB7 = r0.b(j9, g0Var2);
                float f115 = 0;
                p pVar12 = p.f5897a;
                jB = i2.t.b(0.32f, r0.e(k1.v.f8897a, g0Var2));
                int i2110 = i15 & (-1908408321);
                if (i16 != 0) {
                    nVar3 = t0.f5965a;
                }
                if ((i12 & 2048) != 0) {
                    nVar4 = s0.E;
                }
                nVar7 = nVar4;
                u4Var3 = new u4();
                f15 = f115;
                rVar3 = b2.o.A;
                z14 = false;
                f11 = f14;
                i19 = i2110;
                t0Var3 = t0VarA;
                nVar8 = nVar3;
                z15 = true;
                j14 = jB7;
            } else {
                if (i25 != 0) {
                    f14 = p.f5898b;
                } else {
                    f14 = f11;
                }
                if ((i12 & 32) != 0) {
                    p pVar13 = p.f5897a;
                    i15 &= -458753;
                    t0VarA = g6.a(k1.y.f8907a, g0Var2);
                }
                long jB8 = r0.b(j9, g0Var2);
                float f116 = 0;
                p pVar14 = p.f5897a;
                jB = i2.t.b(0.32f, r0.e(k1.v.f8897a, g0Var2));
                int i2111 = i15 & (-1908408321);
                if (i16 != 0) {
                    nVar3 = t0.f5965a;
                }
                if ((i12 & 2048) != 0) {
                    nVar4 = s0.E;
                }
                nVar7 = nVar4;
                u4Var3 = new u4();
                f15 = f116;
                rVar3 = b2.o.A;
                z14 = false;
                f11 = f14;
                i19 = i2111;
                t0Var3 = t0VarA;
                nVar8 = nVar3;
                z15 = true;
                j14 = jB8;
            }
            g0Var2.s();
            k1.q qVar4 = k1.q.A;
            u00.n nVar12 = nVar8;
            b1VarP = x5.p(qVar4, g0Var2);
            b1VarP2 = x5.p(qVar4, g0Var2);
            u4 u4Var7 = u4Var3;
            b1VarP3 = x5.p(k1.q.D, g0Var2);
            long j18 = jB;
            i20 = (i19 & 896) ^ 384;
            zI = (((i20 > 256 || !g0Var2.g(m6Var3)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(b1VarP2) | g0Var2.i(b1VarP3) | g0Var2.i(b1VarP);
            objN = g0Var2.N();
            cVar2 = l1.i.f9868a;
            if (zI) {
                objN = new ct.m(m6Var, b1VarP2, b1VarP3, b1VarP, 2);
                m6Var2 = m6Var;
                g0Var2.n0(objN);
            } else {
                objN = new ct.m(m6Var, b1VarP2, b1VarP3, b1VarP, 2);
                m6Var2 = m6Var;
                g0Var2.n0(objN);
            }
            l1.q.k((u00.a) objN, g0Var2);
            objN2 = g0Var2.N();
            if (objN2 == cVar2) {
                objN2 = l1.q.o(g0Var2);
                g0Var2.n0(objN2);
            }
            zVar = (a40.z) objN2;
            boolean zI12 = (((i20 > 256 || !g0Var2.g(m6Var2)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(zVar);
            i21 = i19 & 14;
            if (i21 == 4) {
                z16 = true;
            } else {
                z16 = z14;
            }
            z17 = zI12 | z16;
            objN3 = g0Var2.N();
            if (z17) {
                objN3 = new cz.c(m6Var2, zVar, aVar);
                g0Var2.n0(objN3);
            } else {
                objN3 = new cz.c(m6Var2, zVar, aVar);
                g0Var2.n0(objN3);
            }
            u00.a aVar9 = (u00.a) objN3;
            boolean zI13 = g0Var2.i(zVar);
            if (i20 > 256) {
                rVar4 = rVar3;
                if ((i19 & 384) != 256) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
            } else {
                rVar4 = rVar3;
                if ((i19 & 384) != 256) {
                    z18 = true;
                } else {
                    z18 = z14;
                }
            }
            boolean z27 = zI13 | z18;
            if (i21 == 4) {
                z19 = true;
            } else {
                z19 = z14;
            }
            z20 = z27 | z19;
            objN4 = g0Var2.N();
            if (z20) {
                objN4 = new b1.l(zVar, m6Var2, aVar, 10);
                g0Var2.n0(objN4);
            } else {
                objN4 = new b1.l(zVar, m6Var2, aVar, 10);
                g0Var2.n0(objN4);
            }
            u00.k kVar5 = (u00.k) objN4;
            objN5 = g0Var2.N();
            if (objN5 == cVar2) {
                objN5 = x.c.a(0.0f, 0.01f);
                g0Var2.n0(objN5);
            }
            bVar = (x.b) objN5;
            boolean zI14 = (((i20 > 256 || !g0Var2.g(m6Var2)) && (i19 & 384) != 256) ? z14 : true) | g0Var2.i(zVar) | g0Var2.i(bVar);
            if (i21 == 4) {
                z21 = true;
            } else {
                z21 = z14;
            }
            z22 = z21 | zI14;
            objN6 = g0Var2.N();
            if (z22) {
                objN6 = new ct.m(m6Var, zVar, bVar, aVar, 3);
                g0Var2.n0(objN6);
            } else {
                objN6 = new ct.m(m6Var, zVar, bVar, aVar, 3);
                g0Var2.n0(objN6);
            }
            u00.a aVar10 = (u00.a) objN6;
            int i2112 = i19;
            float f117 = f15;
            m6Var3 = m6Var;
            g0Var = g0Var2;
            x5.g(aVar10, j14, u4Var7, bVar, v1.d.d(1010026864, new n4(j18, aVar9, m6Var, u4Var7, bVar, zVar, kVar5, rVar4, f11, z15, t0Var3, j9, j14, f117, nVar12, nVar7, cVar), g0Var), g0Var, 29056);
            if (m6Var3.f5887d.g().f6524a.containsKey(n6.B)) {
                g0Var.c0(748459762);
                if (i20 > 256) {
                }
                objN7 = g0Var.N();
                if (z11) {
                    objN7 = new m4(m6Var3, null, 2);
                    g0Var.n0(objN7);
                } else {
                    objN7 = new m4(m6Var3, null, 2);
                    g0Var.n0(objN7);
                }
                l1.q.i(m6Var3, g0Var, (u00.n) objN7);
                g0Var.r(false);
            } else {
                g0Var.c0(748521266);
                g0Var.r(false);
            }
            f12 = f11;
            t0Var2 = t0Var3;
            j13 = j14;
            nVar5 = nVar12;
            nVar6 = nVar7;
            j12 = j18;
            u4Var2 = u4Var7;
            z13 = z15;
            f13 = f117;
            rVar2 = rVar4;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
            z13 = z10;
            j12 = j11;
            u4Var2 = u4Var;
            f12 = f11;
            nVar5 = nVar3;
            j13 = j10;
            nVar6 = nVar4;
            t0Var2 = t0VarA;
            f13 = f10;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i10 | 1);
                    int iK2 = l1.q.K(i11);
                    t4.a(aVar, rVar2, m6Var3, f12, z13, t0Var2, j9, j13, f13, j12, nVar5, nVar6, u4Var2, cVar, (l1.j) obj, iK, iK2, i12);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(final x.b bVar, final a40.z zVar, final u00.a aVar, final u00.k kVar, final b2.r rVar, final m6 m6Var, final float f3, final boolean z10, final i2.t0 t0Var, final long j9, final long j10, final float f10, final u00.n nVar, final u00.n nVar2, final v1.c cVar, l1.j jVar, final int i10) {
        l1.g0 g0Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-37400432);
        int i11 = i10 | (g0Var2.i(bVar) ? 32 : 16) | (g0Var2.i(zVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var2.i(aVar) ? 2048 : 1024) | (g0Var2.i(kVar) ? 16384 : 8192);
        boolean zG = g0Var2.g(rVar);
        int i12 = Cast.MAX_MESSAGE_LENGTH;
        int i13 = i11 | (zG ? 131072 : 65536) | (g0Var2.g(m6Var) ? 1048576 : 524288) | (g0Var2.d(f3) ? 8388608 : 4194304) | (g0Var2.h(z10) ? 67108864 : 33554432) | (g0Var2.g(t0Var) ? 536870912 : 268435456);
        int i14 = (g0Var2.f(j9) ? 4 : 2) | (g0Var2.f(j10) ? 32 : 16) | (g0Var2.d(f10) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var2.i(nVar) ? 2048 : 1024) | (g0Var2.i(nVar2) ? 16384 : 8192);
        if (g0Var2.i(cVar)) {
            i12 = 131072;
        }
        int i15 = i14 | i12;
        if (g0Var2.S(i13 & 1, ((i13 & 306783379) == 306783378 && (i15 & 74899) == 74898) ? false : true)) {
            g0Var2.X();
            if ((i10 & 1) != 0 && !g0Var2.A()) {
                g0Var2.V();
            }
            g0Var2.s();
            String strL = h1.f.l(g0Var2, 2131886654);
            b2.r rVarD = h0.z1.d(h0.z1.s(h0.s.f6456a.a(rVar, b2.b.B), 0.0f, f3, 1), 1.0f);
            b2.r rVarA = b2.o.A;
            l1.c cVar2 = l1.i.f9868a;
            if (z10) {
                g0Var2.c0(-1582035383);
                boolean z11 = (((i13 & 3670016) ^ 1572864) > 1048576 && g0Var2.g(m6Var)) || (i13 & 1572864) == 1048576;
                Object objN = g0Var2.N();
                if (z11 || objN == cVar2) {
                    d0.q1 q1Var = d0.q1.A;
                    float f11 = j6.f5846a;
                    objN = new i6(m6Var, kVar);
                    g0Var2.n0(objN);
                }
                rVarA = u2.f.a(rVarA, (u2.a) objN, null);
                g0Var2.r(false);
            } else {
                g0Var2.c0(-1582020872);
                g0Var2.r(false);
            }
            b2.r rVarV = rVarD.V(rVarA);
            fc.n nVar3 = m6Var.f5887d;
            fc.n nVar4 = m6Var.f5887d;
            d0.q1 q1Var2 = d0.q1.A;
            int i16 = (i13 & 3670016) ^ 1572864;
            boolean z12 = (i16 > 1048576 && g0Var2.g(m6Var)) || (i13 & 1572864) == 1048576;
            Object objN2 = g0Var2.N();
            if (z12 || objN2 == cVar2) {
                objN2 = new a1.y1(m6Var, 17);
                g0Var2.n0(objN2);
            }
            b2.r rVarH = h1.f.h(rVarV, nVar3, (u00.n) objN2);
            h1.l lVar = (h1.l) nVar4.f5631f;
            boolean z13 = z10 && m6Var.d();
            boolean z14 = ((l1.i1) nVar4.l).getValue() != null;
            boolean z15 = (i13 & 57344) == 16384;
            Object objN3 = g0Var2.N();
            if (z15 || objN3 == cVar2) {
                objN3 = new o4(kVar, null);
                g0Var2.n0(objN3);
            }
            b2.r rVarA2 = d0.r0.a(rVarH, lVar, q1Var2, z13, null, z14, (u00.o) objN3, false, 168);
            boolean zG2 = g0Var2.g(strL);
            Object objN4 = g0Var2.N();
            if (zG2 || objN4 == cVar2) {
                objN4 = new b6.o(strL, 10);
                g0Var2.n0(objN4);
            }
            b2.r rVarC = j3.q.c(rVarA2, false, (u00.k) objN4);
            int iH = (int) ((l1.e1) nVar4.f5635j).h();
            if (iH < 0) {
                iH = 0;
            }
            b2.r rVarQ = h0.c.q(rVarC, h0.c.i(iH, 13));
            boolean z16 = ((i16 > 1048576 && g0Var2.g(m6Var)) || (i13 & 1572864) == 1048576) | ((i13 & 112) == 32 || g0Var2.i(bVar));
            Object objN5 = g0Var2.N();
            if (z16 || objN5 == cVar2) {
                objN5 = new al.l(m6Var, bVar, 15);
                g0Var2.n0(objN5);
            }
            int i17 = i15 << 6;
            g0Var = g0Var2;
            s6.a(i2.b0.p(i2.b0.p(rVarQ, (u00.k) objN5), new q(m6Var, 1)), t0Var, j9, j10, f10, 0.0f, null, v1.d.d(728743275, new r4(nVar2, bVar, m6Var, nVar, cVar, aVar, zVar, z10), g0Var2), g0Var, ((i13 >> 24) & 112) | 12582912 | (i17 & 896) | (i17 & 7168) | (i17 & 57344), 96);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n(zVar, aVar, kVar, rVar, m6Var, f3, z10, t0Var, j9, j10, f10, nVar, nVar2, cVar, i10) {
                public final a40.z B;
                public final u00.a C;
                public final u00.k D;
                public final b2.r E;
                public final m6 F;
                public final float G;
                public final boolean H;
                public final i2.t0 I;
                public final long J;
                public final long K;
                public final float L;
                public final u00.n M;
                public final u00.n N;
                public final v1.c O;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(71);
                    t4.b(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void c(final long j9, final u00.a aVar, final boolean z10, final boolean z11, l1.j jVar, final int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-391613911);
        int i11 = i10 | (g0Var.f(j9) ? 4 : 2) | (g0Var.i(aVar) ? 32 : 16) | (g0Var.h(z10) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.h(z11) ? 2048 : 1024);
        if (!g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            g0Var.V();
        } else if (j9 != 16) {
            g0Var.c0(-1438582326);
            l1.p2 p2VarB = x.d.b(z10 ? 1.0f : 0.0f, x5.p(k1.q.C, g0Var), null, g0Var, 0, 28);
            String strL = h1.f.l(g0Var, 2131886340);
            b2.r rVarC = b2.o.A;
            l1.c cVar = l1.i.f9868a;
            if (z11) {
                g0Var.c0(-1438283579);
                int i12 = i11 & 112;
                boolean z12 = i12 == 32;
                Object objN = g0Var.N();
                if (z12 || objN == cVar) {
                    objN = new s4(0, aVar);
                    g0Var.n0(objN);
                }
                b2.r rVarB = v2.f0.b(rVarC, aVar, (PointerInputEventHandler) objN);
                boolean zG = (i12 == 32) | g0Var.g(strL);
                Object objN2 = g0Var.N();
                if (zG || objN2 == cVar) {
                    objN2 = new al.l(strL, aVar, 16);
                    g0Var.n0(objN2);
                }
                rVarC = j3.q.c(rVarB, true, (u00.k) objN2);
                g0Var.r(false);
            } else {
                g0Var.c0(-1437857391);
                g0Var.r(false);
            }
            b2.r rVarV = h0.z1.f6478c.V(rVarC);
            boolean zG2 = g0Var.g(p2VarB) | ((i11 & 14) == 4);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == cVar) {
                objN3 = new cl.b(j9, p2VarB, 2);
                g0Var.n0(objN3);
            }
            z.n.b(0, rVarV, g0Var, (u00.k) objN3);
            g0Var.r(false);
        } else {
            g0Var.c0(-1437676103);
            g0Var.r(false);
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n(j9, aVar, z10, z11, i10) {
                public final long A;
                public final u00.a B;
                public final boolean C;
                public final boolean D;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    t4.c(this.A, this.B, this.C, this.D, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final float d(i2.c0 c0Var, float f3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0Var.b() >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (com.google.android.gms.internal.measurement.b5.A(0.0f, Math.min(c0Var.c() * f5966a, fIntBitsToFloat), f3) / fIntBitsToFloat);
    }

    public static final float e(i2.c0 c0Var, float f3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0Var.b() & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (com.google.android.gms.internal.measurement.b5.A(0.0f, Math.min(c0Var.c() * f5967b, fIntBitsToFloat), f3) / fIntBitsToFloat);
    }

    public static final m6 f(boolean z10, u00.k kVar, l1.j jVar, int i10, int i11) {
        n6 n6Var = n6.A;
        final int i12 = 0;
        boolean z11 = (i11 & 1) != 0 ? false : z10;
        int i13 = i11 & 2;
        l1.c cVar = l1.i.f9868a;
        if (i13 != 0) {
            l1.g0 g0Var = (l1.g0) jVar;
            Object objN = g0Var.N();
            if (objN == cVar) {
                objN = new e6.c(23);
                g0Var.n0(objN);
            }
            kVar = (u00.k) objN;
        }
        u00.k kVar2 = kVar;
        int i14 = (i10 & 14) | 384;
        float f3 = j6.f5846a;
        final float f10 = p.f5899c;
        final float f11 = p.f5900d;
        l1.g0 g0Var2 = (l1.g0) jVar;
        final y3.c cVar2 = (y3.c) g0Var2.k(c3.o1.f2734h);
        boolean zG = g0Var2.g(cVar2) | g0Var2.d(f10);
        Object objN2 = g0Var2.N();
        Object obj = objN2;
        if (zG || objN2 == cVar) {
            u00.a aVar = new u00.a() {
                public final Object invoke() {
                    float fA0;
                    switch (i12) {
                        case 0:
                            fA0 = cVar2.A0(f10);
                            break;
                        default:
                            fA0 = cVar2.A0(f10);
                            break;
                    }
                    return Float.valueOf(fA0);
                }
            };
            g0Var2.n0(aVar);
            obj = aVar;
        }
        u00.a aVar2 = (u00.a) obj;
        boolean zG2 = g0Var2.g(cVar2) | g0Var2.d(f11);
        Object objN3 = g0Var2.N();
        final int i15 = 1;
        Object obj2 = objN3;
        if (zG2 || objN3 == cVar) {
            u00.a aVar3 = new u00.a() {
                public final Object invoke() {
                    float fA0;
                    switch (i15) {
                        case 0:
                            fA0 = cVar2.A0(f11);
                            break;
                        default:
                            fA0 = cVar2.A0(f11);
                            break;
                    }
                    return Float.valueOf(fA0);
                }
            };
            g0Var2.n0(aVar3);
            obj2 = aVar3;
        }
        u00.a aVar4 = (u00.a) obj2;
        Object[] objArr = {Boolean.valueOf(z11), kVar2, Boolean.FALSE};
        s10.w0 w0Var = new s10.w0(new fo.b(29, (byte) 0), new ab.d0(z11, aVar2, aVar4, kVar2), 15);
        if ((((i14 & 14) ^ 6) <= 4 || !g0Var2.h(z11)) && (i14 & 6) != 4) {
            i15 = 0;
        }
        boolean z12 = ((((g0Var2.g(aVar2) ? 1 : 0) | i15) | (g0Var2.g(aVar4) ? 1 : 0)) == true ? 1 : 0) | (g0Var2.g(kVar2) ? 1 : 0) | (g0Var2.h(false) ? 1 : 0);
        Object objN4 = g0Var2.N();
        if (z12 || objN4 == cVar) {
            el.f fVar = new el.f(z11, aVar2, aVar4, n6Var, kVar2);
            g0Var2.n0(fVar);
            objN4 = fVar;
        }
        return (m6) y1.k.f(objArr, w0Var, (u00.a) objN4, jVar, 0);
    }
}
