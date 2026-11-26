package g1;

import com.google.android.gms.cast.Cast;
import kotlin.NoWhenBranchMatchedException;

public abstract class j0 {

    public static final float f5842a;

    public static final float f5843b = 20;

    public static final float f5844c;

    static {
        float f3 = 2;
        f5842a = f3;
        f5844c = f3;
    }

    public static final void a(final boolean z10, final u00.k kVar, b2.r rVar, boolean z11, e0 e0Var, l1.j jVar, int i10, int i11) {
        b2.r rVar2;
        int i12;
        boolean z12;
        b2.r rVar3;
        b2.r rVar4;
        boolean z13;
        u00.a aVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1406741137);
        int i13 = i10 | (g0Var.h(z10) ? 4 : 2);
        if ((i10 & 48) == 0) {
            i13 |= g0Var.i(kVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 = i13 | 384;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i12 = i13 | (g0Var.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        }
        int i15 = i12 | 3072 | (g0Var.g(e0Var) ? 16384 : 8192) | 196608;
        if (g0Var.S(i15 & 1, (74899 & i15) != 74898)) {
            g0Var.X();
            if ((i10 & 1) == 0 || g0Var.A()) {
                rVar4 = i14 != 0 ? b2.o.A : rVar2;
                z13 = true;
            } else {
                g0Var.V();
                z13 = z11;
                rVar4 = rVar2;
            }
            g0Var.s();
            float fFloor = (float) Math.floor(((y3.c) g0Var.k(c3.o1.f2734h)).A0(f0.f5785a));
            l3.a aVar2 = z10 ? l3.a.A : l3.a.B;
            if (kVar != null) {
                g0Var.c0(2066152950);
                boolean z14 = ((i15 & 112) == 32) | ((i15 & 14) == 4);
                Object objN = g0Var.N();
                if (z14 || objN == l1.i.f9868a) {
                    final int i16 = 0;
                    objN = new u00.a() {
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    kVar.invoke(Boolean.valueOf(!z10));
                                    break;
                                default:
                                    kVar.invoke(Boolean.valueOf(!z10));
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var.n0(objN);
                }
                aVar = (u00.a) objN;
                g0Var.r(false);
            } else {
                g0Var.c0(2066218639);
                g0Var.r(false);
                aVar = null;
            }
            c(aVar2, aVar, new k2.h(fFloor, 0.0f, 2, 0, null, 26), new k2.h(fFloor, 0.0f, 0, 0, null, 30), rVar4, z13, e0Var, g0Var, (i15 << 6) & 33546240);
            rVar3 = rVar4;
            z12 = z13;
        } else {
            g0Var.V();
            z12 = z11;
            rVar3 = rVar2;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new h0(z10, kVar, rVar3, z12, e0Var, i10, i11);
        }
    }

    public static final void b(boolean z10, l3.a aVar, b2.r rVar, e0 e0Var, final k2.h hVar, final k2.h hVar2, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var;
        float f3;
        float f10;
        float f11;
        x.y z0Var;
        final x.m1 m1VarO;
        Object objN;
        l1.c cVar;
        final d0 d0Var;
        long j9;
        final l1.p2 p2VarA;
        l1.g0 g0Var2;
        int iOrdinal;
        long j10;
        final l1.p2 p2VarG;
        int iOrdinal2;
        long j11;
        l1.p2 p2VarG2;
        boolean zG;
        Object objN2;
        int i12;
        int iOrdinal3;
        int iOrdinal4;
        l1.g0 g0Var3 = (l1.g0) jVar;
        g0Var3.e0(-891330208);
        if ((i10 & 6) == 0) {
            i11 = (g0Var3.h(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var3.e(aVar.ordinal()) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var3.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var3.g(e0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var3.i(hVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var3.i(hVar2) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if (g0Var3.S(i11 & 1, (74899 & i11) != 74898)) {
            x.n1 n1VarY = x.c.y(aVar, null, g0Var3, (i11 >> 3) & 14, 2);
            l1.i1 i1Var = n1VarY.f16326d;
            f5.c cVar2 = n1VarY.f16323a;
            x.y yVarP = x5.p(k1.q.A, g0Var3);
            x.r1 r1Var = x.c.f16258k;
            l3.a aVar2 = (l3.a) cVar2.J0();
            g0Var3.c0(-768316570);
            int iOrdinal5 = aVar2.ordinal();
            float f12 = 0.0f;
            if (iOrdinal5 == 0) {
                f3 = 1.0f;
            } else if (iOrdinal5 != 1) {
                if (iOrdinal5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            g0Var3.r(false);
            Float fValueOf = Float.valueOf(f3);
            l3.a aVar3 = (l3.a) i1Var.getValue();
            g0Var3.c0(-768316570);
            int iOrdinal6 = aVar3.ordinal();
            if (iOrdinal6 == 0) {
                f10 = 1.0f;
            } else if (iOrdinal6 != 1) {
                if (iOrdinal6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            g0Var3.r(false);
            Float fValueOf2 = Float.valueOf(f10);
            x.k1 k1VarF = n1VarY.f();
            g0Var3.c0(1780794470);
            Object objA = k1VarF.a();
            l3.a aVar4 = l3.a.B;
            x.y z0Var2 = (objA != aVar4 && k1VarF.c() == aVar4) ? new x.z0(100) : yVarP;
            g0Var3.r(false);
            final x.m1 m1VarO2 = x.c.o(n1VarY, fValueOf, fValueOf2, z0Var2, r1Var, g0Var3, 0);
            l3.a aVar5 = (l3.a) cVar2.J0();
            g0Var3.c0(1840054703);
            int iOrdinal7 = aVar5.ordinal();
            if (iOrdinal7 == 0 || iOrdinal7 == 1) {
                f11 = 0.0f;
            } else {
                if (iOrdinal7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f11 = 1.0f;
            }
            g0Var3.r(false);
            Float fValueOf3 = Float.valueOf(f11);
            l3.a aVar6 = (l3.a) i1Var.getValue();
            g0Var3.c0(1840054703);
            int iOrdinal8 = aVar6.ordinal();
            if (iOrdinal8 != 0 && iOrdinal8 != 1) {
                if (iOrdinal8 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f12 = 1.0f;
            }
            g0Var3.r(false);
            Float fValueOf4 = Float.valueOf(f12);
            x.k1 k1VarF2 = n1VarY.f();
            g0Var3.c0(630790831);
            if (k1VarF2.a() == aVar4) {
                yVarP = x.c.u();
            } else {
                if (k1VarF2.c() == aVar4) {
                    z0Var = new x.z0(100);
                }
                g0Var3.r(false);
                m1VarO = x.c.o(n1VarY, fValueOf3, fValueOf4, z0Var, r1Var, g0Var3, 0);
                objN = g0Var3.N();
                cVar = l1.i.f9868a;
                if (objN == cVar) {
                    objN = new d0();
                    g0Var3.n0(objN);
                }
                d0Var = (d0) objN;
                if (aVar == aVar4) {
                    j9 = e0Var.f5764b;
                } else {
                    j9 = e0Var.f5763a;
                }
                p2VarA = w.b2.a(j9, e0.a(aVar, g0Var3), null, g0Var3, 0, 12);
                g0Var2 = g0Var3;
                if (z10) {
                    iOrdinal4 = aVar.ordinal();
                    if (iOrdinal4 == 0) {
                        j10 = e0Var.f5765c;
                    } else if (iOrdinal4 != 1) {
                        if (iOrdinal4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j10 = e0Var.f5765c;
                    } else {
                        j10 = e0Var.f5766d;
                    }
                } else {
                    iOrdinal = aVar.ordinal();
                    if (iOrdinal != 0) {
                        j10 = e0Var.f5767e;
                    } else if (iOrdinal != 1) {
                        j10 = e0Var.f5768f;
                    } else {
                        if (iOrdinal == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j10 = e0Var.f5769g;
                    }
                }
                if (z10) {
                    g0Var2.c0(496051715);
                    p2VarG = w.b2.a(j10, e0.a(aVar, g0Var2), null, g0Var2, 0, 12);
                    g0Var2 = g0Var2;
                    g0Var2.r(false);
                } else {
                    g0Var2.c0(496141925);
                    p2VarG = l1.q.G(new i2.t(j10), g0Var2);
                    g0Var2.r(false);
                }
                if (z10) {
                    iOrdinal3 = aVar.ordinal();
                    if (iOrdinal3 == 0) {
                        j11 = e0Var.f5770h;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j11 = e0Var.f5770h;
                    } else {
                        j11 = e0Var.f5771i;
                    }
                } else {
                    iOrdinal2 = aVar.ordinal();
                    if (iOrdinal2 != 0) {
                        j11 = e0Var.f5772j;
                    } else if (iOrdinal2 != 1) {
                        j11 = e0Var.f5773k;
                    } else {
                        if (iOrdinal2 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        j11 = e0Var.l;
                    }
                }
                if (z10) {
                    g0Var2.c0(633231558);
                    l1.g0 g0Var4 = g0Var2;
                    p2VarG2 = w.b2.a(j11, e0.a(aVar, g0Var2), null, g0Var4, 0, 12);
                    g0Var = g0Var4;
                    g0Var.r(false);
                } else {
                    long j12 = j11;
                    g0Var = g0Var2;
                    g0Var.c0(633321768);
                    p2VarG2 = l1.q.G(new i2.t(j12), g0Var);
                    g0Var.r(false);
                }
                b2.r rVarI = h0.z1.i(h0.z1.v(rVar, 2), f5843b);
                zG = g0Var.g(p2VarG) | g0Var.g(p2VarG2) | g0Var.i(hVar2) | g0Var.g(p2VarA) | g0Var.g(m1VarO2) | g0Var.g(m1VarO) | g0Var.i(hVar);
                objN2 = g0Var.N();
                if (!zG || objN2 == cVar) {
                    final l1.p2 p2Var = p2VarG2;
                    i12 = 0;
                    u00.k kVar = new u00.k() {
                        public final Object invoke(Object obj) {
                            float f13;
                            k2.d dVar = (k2.d) obj;
                            long j13 = ((i2.t) p2VarG.getValue()).f7169a;
                            long j14 = ((i2.t) p2Var.getValue()).f7169a;
                            float fA0 = dVar.A0(j0.f5844c);
                            k2.h hVar3 = hVar2;
                            float f14 = hVar3.f8923a;
                            float f15 = f14 / 2.0f;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.b() >> 32));
                            boolean zC = i2.t.c(j13, j14);
                            k2.g gVar = k2.g.f8922a;
                            if (zC) {
                                k2.d.a1(dVar, j13, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fA0)) << 32) | (((long) Float.floatToRawIntBits(fA0)) & 4294967295L), gVar, 226);
                                f13 = 0.0f;
                            } else {
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
                                float f16 = fIntBitsToFloat - (2 * f14);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
                                float fMax = Math.max(0.0f, fA0 - f14);
                                f13 = 0.0f;
                                k2.d.a1(dVar, j13, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), gVar, 224);
                                float f17 = fIntBitsToFloat - f14;
                                float f18 = fA0 - f15;
                                k2.d.a1(dVar, j14, (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32), (((long) Float.floatToRawIntBits(f17)) & 4294967295L) | (((long) Float.floatToRawIntBits(f17)) << 32), (((long) Float.floatToRawIntBits(f18)) & 4294967295L) | (((long) Float.floatToRawIntBits(f18)) << 32), hVar3, 224);
                            }
                            long j15 = ((i2.t) p2VarA.getValue()).f7169a;
                            float fFloatValue = ((Number) m1VarO2.getValue()).floatValue();
                            float fFloatValue2 = ((Number) m1VarO.getValue()).floatValue();
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.b() >> 32));
                            float fA = com.google.android.gms.internal.measurement.b5.A(0.4f, 0.5f, fFloatValue2);
                            float fA2 = com.google.android.gms.internal.measurement.b5.A(0.7f, 0.5f, fFloatValue2);
                            float fA3 = com.google.android.gms.internal.measurement.b5.A(0.5f, 0.5f, fFloatValue2);
                            float fA4 = com.google.android.gms.internal.measurement.b5.A(0.3f, 0.5f, fFloatValue2);
                            d0 d0Var2 = d0Var;
                            d0Var2.f5753a.i();
                            i2.g gVar2 = d0Var2.f5753a;
                            gVar2.f(0.2f * fIntBitsToFloat2, fA3 * fIntBitsToFloat2);
                            gVar2.e(fA * fIntBitsToFloat2, fA2 * fIntBitsToFloat2);
                            gVar2.e(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fA4);
                            i2.i iVar = d0Var2.f5754b;
                            iVar.f7138a.setPath(gVar2 != null ? gVar2.f7128a : null, false);
                            i2.g gVar3 = d0Var2.f5755c;
                            gVar3.i();
                            iVar.a(f13, iVar.f7138a.getLength() * fFloatValue, gVar3);
                            k2.d.X0(dVar, d0Var2.f5755c, j15, 0.0f, hVar, 52);
                            return g00.b0.a;
                        }
                    };
                    g0Var.n0(kVar);
                    objN2 = kVar;
                } else {
                    i12 = 0;
                }
                z.n.b(i12, rVarI, g0Var, (u00.k) objN2);
            }
            z0Var = yVarP;
            g0Var3.r(false);
            m1VarO = x.c.o(n1VarY, fValueOf3, fValueOf4, z0Var, r1Var, g0Var3, 0);
            objN = g0Var3.N();
            cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = new d0();
                g0Var3.n0(objN);
            }
            d0Var = (d0) objN;
            if (aVar == aVar4) {
                j9 = e0Var.f5764b;
            } else {
                j9 = e0Var.f5763a;
            }
            p2VarA = w.b2.a(j9, e0.a(aVar, g0Var3), null, g0Var3, 0, 12);
            g0Var2 = g0Var3;
            if (z10) {
                iOrdinal4 = aVar.ordinal();
                if (iOrdinal4 == 0) {
                    j10 = e0Var.f5765c;
                } else if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j10 = e0Var.f5765c;
                } else {
                    j10 = e0Var.f5766d;
                }
            } else {
                iOrdinal = aVar.ordinal();
                if (iOrdinal != 0) {
                    j10 = e0Var.f5767e;
                } else if (iOrdinal != 1) {
                    j10 = e0Var.f5768f;
                } else {
                    if (iOrdinal == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j10 = e0Var.f5769g;
                }
            }
            if (z10) {
                g0Var2.c0(496051715);
                p2VarG = w.b2.a(j10, e0.a(aVar, g0Var2), null, g0Var2, 0, 12);
                g0Var2 = g0Var2;
                g0Var2.r(false);
            } else {
                g0Var2.c0(496141925);
                p2VarG = l1.q.G(new i2.t(j10), g0Var2);
                g0Var2.r(false);
            }
            if (z10) {
                iOrdinal3 = aVar.ordinal();
                if (iOrdinal3 == 0) {
                    j11 = e0Var.f5770h;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j11 = e0Var.f5770h;
                } else {
                    j11 = e0Var.f5771i;
                }
            } else {
                iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 != 0) {
                    j11 = e0Var.f5772j;
                } else if (iOrdinal2 != 1) {
                    j11 = e0Var.f5773k;
                } else {
                    if (iOrdinal2 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j11 = e0Var.l;
                }
            }
            if (z10) {
                g0Var2.c0(633231558);
                l1.g0 g0Var5 = g0Var2;
                p2VarG2 = w.b2.a(j11, e0.a(aVar, g0Var2), null, g0Var5, 0, 12);
                g0Var = g0Var5;
                g0Var.r(false);
            } else {
                long j13 = j11;
                g0Var = g0Var2;
                g0Var.c0(633321768);
                p2VarG2 = l1.q.G(new i2.t(j13), g0Var);
                g0Var.r(false);
            }
            b2.r rVarI2 = h0.z1.i(h0.z1.v(rVar, 2), f5843b);
            zG = g0Var.g(p2VarG) | g0Var.g(p2VarG2) | g0Var.i(hVar2) | g0Var.g(p2VarA) | g0Var.g(m1VarO2) | g0Var.g(m1VarO) | g0Var.i(hVar);
            objN2 = g0Var.N();
            if (zG) {
                final l1.p2 p2Var2 = p2VarG2;
                i12 = 0;
                u00.k kVar2 = new u00.k() {
                    public final Object invoke(Object obj) {
                        float f13;
                        k2.d dVar = (k2.d) obj;
                        long j14 = ((i2.t) p2VarG.getValue()).f7169a;
                        long j15 = ((i2.t) p2Var2.getValue()).f7169a;
                        float fA0 = dVar.A0(j0.f5844c);
                        k2.h hVar3 = hVar2;
                        float f14 = hVar3.f8923a;
                        float f15 = f14 / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.b() >> 32));
                        boolean zC = i2.t.c(j14, j15);
                        k2.g gVar = k2.g.f8922a;
                        if (zC) {
                            k2.d.a1(dVar, j14, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fA0)) << 32) | (((long) Float.floatToRawIntBits(fA0)) & 4294967295L), gVar, 226);
                            f13 = 0.0f;
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
                            float f16 = fIntBitsToFloat - (2 * f14);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
                            float fMax = Math.max(0.0f, fA0 - f14);
                            f13 = 0.0f;
                            k2.d.a1(dVar, j14, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), gVar, 224);
                            float f17 = fIntBitsToFloat - f14;
                            float f18 = fA0 - f15;
                            k2.d.a1(dVar, j15, (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32), (((long) Float.floatToRawIntBits(f17)) & 4294967295L) | (((long) Float.floatToRawIntBits(f17)) << 32), (((long) Float.floatToRawIntBits(f18)) & 4294967295L) | (((long) Float.floatToRawIntBits(f18)) << 32), hVar3, 224);
                        }
                        long j16 = ((i2.t) p2VarA.getValue()).f7169a;
                        float fFloatValue = ((Number) m1VarO2.getValue()).floatValue();
                        float fFloatValue2 = ((Number) m1VarO.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.b() >> 32));
                        float fA = com.google.android.gms.internal.measurement.b5.A(0.4f, 0.5f, fFloatValue2);
                        float fA2 = com.google.android.gms.internal.measurement.b5.A(0.7f, 0.5f, fFloatValue2);
                        float fA3 = com.google.android.gms.internal.measurement.b5.A(0.5f, 0.5f, fFloatValue2);
                        float fA4 = com.google.android.gms.internal.measurement.b5.A(0.3f, 0.5f, fFloatValue2);
                        d0 d0Var2 = d0Var;
                        d0Var2.f5753a.i();
                        i2.g gVar2 = d0Var2.f5753a;
                        gVar2.f(0.2f * fIntBitsToFloat2, fA3 * fIntBitsToFloat2);
                        gVar2.e(fA * fIntBitsToFloat2, fA2 * fIntBitsToFloat2);
                        gVar2.e(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fA4);
                        i2.i iVar = d0Var2.f5754b;
                        iVar.f7138a.setPath(gVar2 != null ? gVar2.f7128a : null, false);
                        i2.g gVar3 = d0Var2.f5755c;
                        gVar3.i();
                        iVar.a(f13, iVar.f7138a.getLength() * fFloatValue, gVar3);
                        k2.d.X0(dVar, d0Var2.f5755c, j16, 0.0f, hVar, 52);
                        return g00.b0.a;
                    }
                };
                g0Var.n0(kVar2);
                objN2 = kVar2;
            } else {
                final l1.p2 p2Var3 = p2VarG2;
                i12 = 0;
                u00.k kVar3 = new u00.k() {
                    public final Object invoke(Object obj) {
                        float f13;
                        k2.d dVar = (k2.d) obj;
                        long j14 = ((i2.t) p2VarG.getValue()).f7169a;
                        long j15 = ((i2.t) p2Var3.getValue()).f7169a;
                        float fA0 = dVar.A0(j0.f5844c);
                        k2.h hVar3 = hVar2;
                        float f14 = hVar3.f8923a;
                        float f15 = f14 / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.b() >> 32));
                        boolean zC = i2.t.c(j14, j15);
                        k2.g gVar = k2.g.f8922a;
                        if (zC) {
                            k2.d.a1(dVar, j14, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fA0)) << 32) | (((long) Float.floatToRawIntBits(fA0)) & 4294967295L), gVar, 226);
                            f13 = 0.0f;
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
                            float f16 = fIntBitsToFloat - (2 * f14);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L);
                            float fMax = Math.max(0.0f, fA0 - f14);
                            f13 = 0.0f;
                            k2.d.a1(dVar, j14, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), gVar, 224);
                            float f17 = fIntBitsToFloat - f14;
                            float f18 = fA0 - f15;
                            k2.d.a1(dVar, j15, (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32), (((long) Float.floatToRawIntBits(f17)) & 4294967295L) | (((long) Float.floatToRawIntBits(f17)) << 32), (((long) Float.floatToRawIntBits(f18)) & 4294967295L) | (((long) Float.floatToRawIntBits(f18)) << 32), hVar3, 224);
                        }
                        long j16 = ((i2.t) p2VarA.getValue()).f7169a;
                        float fFloatValue = ((Number) m1VarO2.getValue()).floatValue();
                        float fFloatValue2 = ((Number) m1VarO.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar.b() >> 32));
                        float fA = com.google.android.gms.internal.measurement.b5.A(0.4f, 0.5f, fFloatValue2);
                        float fA2 = com.google.android.gms.internal.measurement.b5.A(0.7f, 0.5f, fFloatValue2);
                        float fA3 = com.google.android.gms.internal.measurement.b5.A(0.5f, 0.5f, fFloatValue2);
                        float fA4 = com.google.android.gms.internal.measurement.b5.A(0.3f, 0.5f, fFloatValue2);
                        d0 d0Var2 = d0Var;
                        d0Var2.f5753a.i();
                        i2.g gVar2 = d0Var2.f5753a;
                        gVar2.f(0.2f * fIntBitsToFloat2, fA3 * fIntBitsToFloat2);
                        gVar2.e(fA * fIntBitsToFloat2, fA2 * fIntBitsToFloat2);
                        gVar2.e(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fA4);
                        i2.i iVar = d0Var2.f5754b;
                        iVar.f7138a.setPath(gVar2 != null ? gVar2.f7128a : null, false);
                        i2.g gVar3 = d0Var2.f5755c;
                        gVar3.i();
                        iVar.a(f13, iVar.f7138a.getLength() * fFloatValue, gVar3);
                        k2.d.X0(dVar, d0Var2.f5755c, j16, 0.0f, hVar, 52);
                        return g00.b0.a;
                    }
                };
                g0Var.n0(kVar3);
                objN2 = kVar3;
            }
            z.n.b(i12, rVarI2, g0Var, (u00.k) objN2);
        } else {
            g0Var = g0Var3;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c0.h(z10, aVar, rVar, e0Var, hVar, hVar2, i10);
        }
    }

    public static final void c(l3.a aVar, u00.a aVar2, k2.h hVar, k2.h hVar2, b2.r rVar, boolean z10, e0 e0Var, l1.j jVar, int i10) {
        int i11;
        e0 e0Var2;
        l3.a aVar3;
        b2.r rVarB;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-406243761);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.e(aVar.ordinal()) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(aVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(hVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.i(hVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.g(rVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.h(z10) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i10) == 0) {
            e0Var2 = e0Var;
            i11 |= g0Var.g(e0Var2) ? 1048576 : 524288;
        } else {
            e0Var2 = e0Var;
        }
        if ((12582912 & i10) == 0) {
            i11 |= g0Var.g(null) ? 8388608 : 4194304;
        }
        if (g0Var.S(i11 & 1, (4793491 & i11) != 4793490)) {
            g0Var.X();
            if ((i10 & 1) != 0 && !g0Var.A()) {
                g0Var.V();
            }
            g0Var.s();
            b2.r rVar2 = b2.o.A;
            if (aVar2 != null) {
                aVar3 = aVar;
                rVarB = o0.c.b(aVar3, y5.a(k1.c.f8574d / 2, 4, false), z10, new j3.k(1), aVar2);
            } else {
                aVar3 = aVar;
                rVarB = rVar2;
            }
            if (aVar2 != null) {
                z2.r rVar3 = r3.f5951a;
                rVar2 = a4.B;
            }
            b2.r rVarC = h0.c.C(rVar.V(rVar2).V(rVarB), f5842a);
            int i12 = ((i11 >> 15) & 14) | ((i11 << 3) & 112) | ((i11 >> 9) & 7168);
            int i13 = i11 << 6;
            b(z10, aVar3, rVarC, e0Var2, hVar, hVar2, g0Var, i12 | (57344 & i13) | (i13 & 458752));
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new eu.m(aVar, aVar2, hVar, hVar2, rVar, z10, e0Var, i10);
        }
    }
}
