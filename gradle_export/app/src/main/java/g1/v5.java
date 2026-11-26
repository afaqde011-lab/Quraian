package g1;

import com.google.android.gms.cast.Cast;

public abstract class v5 {

    public static final float f6006a = k1.d.f8586a;

    public static final x.r f6007b = k1.r.f8844b;

    public static final void a(b2.r rVar, final long j9, float f3, long j10, int i10, float f10, l1.j jVar, final int i11, final int i12) {
        final b2.r rVar2;
        int i13;
        final float f11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        l1.g0 g0Var;
        final long j11;
        final float f12;
        final int i20;
        l1.r1 r1VarT;
        b2.r rVar3;
        float f13;
        long j12;
        b2.r rVar4;
        float f14;
        int i21;
        float f15;
        final int i22;
        final k2.h hVar;
        final float f16;
        int i23;
        final long j13;
        final x.e0 e0VarH;
        final x.e0 e0VarH2;
        final x.e0 e0VarH3;
        boolean z11;
        boolean z12;
        boolean zG;
        Object objN;
        final float f17;
        long j14;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(333154241);
        int i24 = i12 & 1;
        if (i24 != 0) {
            i13 = i11 | 6;
            rVar2 = rVar;
        } else if ((i11 & 6) == 0) {
            rVar2 = rVar;
            i13 = (g0Var2.g(rVar2) ? 4 : 2) | i11;
        } else {
            rVar2 = rVar;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= g0Var2.f(j9) ? 32 : 16;
        }
        int i25 = i12 & 4;
        if (i25 == 0) {
            if ((i11 & 384) == 0) {
                f11 = f3;
                i13 |= g0Var2.d(f11) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
            }
            i14 = i13 | 1024;
            i15 = i12 & 16;
            if (i15 != 0) {
                i18 = i13 | 25600;
                i16 = i10;
            } else {
                i16 = i10;
                if (g0Var2.e(i16)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i18 = i14 | i17;
            }
            i19 = i18 | 196608;
            if ((74899 & i19) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var2.S(i19 & 1, z10)) {
                g0Var2.X();
                if ((i11 & 1) != 0 || g0Var2.A()) {
                    if (i24 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i25 != 0) {
                        f13 = q5.f5940a;
                    } else {
                        f13 = f11;
                    }
                    float f18 = q5.f5940a;
                    j12 = i2.t.f7166f;
                    int i26 = i19 & (-7169);
                    if (i15 != 0) {
                        i16 = q5.f5942c;
                    }
                    rVar4 = rVar3;
                    f14 = f13;
                    i21 = i26;
                    f15 = q5.f5943d;
                } else {
                    g0Var2.V();
                    i21 = i19 & (-7169);
                    f15 = f10;
                    rVar4 = rVar2;
                    f14 = f11;
                    j12 = j10;
                }
                i22 = i16;
                g0Var2.s();
                hVar = new k2.h(((y3.c) g0Var2.k(c3.o1.f2734h)).A0(f14), 0.0f, i22, 0, null, 26);
                f16 = f14;
                i23 = i21;
                x.g0 g0VarS = x.c.s(null, g0Var2, 1);
                j13 = j12;
                e0VarH = x.c.h(g0VarS, 0.0f, 1080.0f, x.c.r(x.c.w(6000, 0, x.x.f16386c, 2), null, 6), null, g0Var2, 4536, 8);
                e6.c cVar = new e6.c(26);
                x.i0 i0Var = new x.i0();
                cVar.invoke(i0Var);
                e0VarH2 = x.c.h(g0VarS, 0.0f, 360.0f, x.c.r(new x.j0(i0Var), null, 6), null, g0Var2, 4536, 8);
                x.i0 i0Var2 = new x.i0();
                i0Var2.f16302a = 6000;
                i0Var2.a(3000, Float.valueOf(0.87f)).f16292b = f6007b;
                i0Var2.a(6000, Float.valueOf(0.1f));
                e0VarH3 = x.c.h(g0VarS, 0.1f, 0.87f, x.c.r(new x.j0(i0Var2), null, 6), null, g0Var2, 4536, 8);
                g0Var = g0Var2;
                b2.r rVarM = h0.z1.m(j3.q.c(rVar4, true, new z.y0(2)), f6006a);
                boolean zG2 = g0Var.g(e0VarH3);
                if ((57344 & i23) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = zG2 | z11;
                if ((i23 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zG = z13 | z12 | g0Var.g(e0VarH) | g0Var.g(e0VarH2) | g0Var.f(j13) | g0Var.i(hVar) | ((((i23 & 112) ^ 48) <= 32 && g0Var.f(j9)) || (i23 & 48) == 32);
                objN = g0Var.N();
                if (!zG || objN == l1.i.f9868a) {
                    f17 = f15;
                    u00.k kVar = new u00.k() {
                        public final Object invoke(Object obj) {
                            long j15 = j13;
                            k2.h hVar2 = hVar;
                            long j16 = j9;
                            k2.d dVar = (k2.d) obj;
                            float fFloatValue = ((Number) e0VarH3.getValue()).floatValue() * 360.0f;
                            int i27 = i22;
                            float f19 = f17;
                            if (i27 != 0 && Float.intBitsToFloat((int) (dVar.b() & 4294967295L)) <= Float.intBitsToFloat((int) (dVar.b() >> 32))) {
                                f19 += f16;
                            }
                            float fK0 = (f19 / ((float) (((double) dVar.k0(Float.intBitsToFloat((int) (dVar.b() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) e0VarH2.getValue()).floatValue() + ((Number) e0VarH.getValue()).floatValue();
                            long jY0 = dVar.Y0();
                            a1.i iVarG0 = dVar.G0();
                            long jQ = iVarG0.q();
                            iVarG0.n().i();
                            try {
                                ((hf.c) iVarG0.B).F(fFloatValue2, jY0);
                                v5.c(dVar, Math.min(fFloatValue, fK0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fK0) * 2), j15, hVar2);
                                v5.c(dVar, 0.0f, fFloatValue, j16, hVar2);
                                return g00.b0.a;
                            } finally {
                                w.c.t(iVarG0, jQ);
                            }
                        }
                    };
                    j14 = j13;
                    g0Var.n0(kVar);
                    objN = kVar;
                } else {
                    j14 = j13;
                    f17 = f15;
                }
                z.n.b(0, rVarM, g0Var, (u00.k) objN);
                f12 = f17;
                rVar2 = rVar4;
                f11 = f16;
                i20 = i22;
                j11 = j14;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                j11 = j10;
                f12 = f10;
                i20 = i16;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        v5.a(rVar2, j9, f11, j11, i20, f12, (l1.j) obj, l1.q.K(i11 | 1), i12);
                        return g00.b0.a;
                    }
                };
            }
        }
        i13 |= 384;
        f11 = f3;
        i14 = i13 | 1024;
        i15 = i12 & 16;
        if (i15 != 0) {
            i18 = i13 | 25600;
            i16 = i10;
        } else {
            i16 = i10;
            if (g0Var2.e(i16)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i18 = i14 | i17;
        }
        i19 = i18 | 196608;
        if ((74899 & i19) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g0Var2.S(i19 & 1, z10)) {
            g0Var2.X();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                if (i25 != 0) {
                    f13 = q5.f5940a;
                } else {
                    f13 = f11;
                }
                float f19 = q5.f5940a;
                j12 = i2.t.f7166f;
                int i27 = i19 & (-7169);
                if (i15 != 0) {
                    i16 = q5.f5942c;
                }
                rVar4 = rVar3;
                f14 = f13;
                i21 = i27;
                f15 = q5.f5943d;
            } else {
                if (i24 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                if (i25 != 0) {
                    f13 = q5.f5940a;
                } else {
                    f13 = f11;
                }
                float f110 = q5.f5940a;
                j12 = i2.t.f7166f;
                int i28 = i19 & (-7169);
                if (i15 != 0) {
                    i16 = q5.f5942c;
                }
                rVar4 = rVar3;
                f14 = f13;
                i21 = i28;
                f15 = q5.f5943d;
            }
            i22 = i16;
            g0Var2.s();
            hVar = new k2.h(((y3.c) g0Var2.k(c3.o1.f2734h)).A0(f14), 0.0f, i22, 0, null, 26);
            f16 = f14;
            i23 = i21;
            x.g0 g0VarS2 = x.c.s(null, g0Var2, 1);
            j13 = j12;
            e0VarH = x.c.h(g0VarS2, 0.0f, 1080.0f, x.c.r(x.c.w(6000, 0, x.x.f16386c, 2), null, 6), null, g0Var2, 4536, 8);
            e6.c cVar2 = new e6.c(26);
            x.i0 i0Var3 = new x.i0();
            cVar2.invoke(i0Var3);
            e0VarH2 = x.c.h(g0VarS2, 0.0f, 360.0f, x.c.r(new x.j0(i0Var3), null, 6), null, g0Var2, 4536, 8);
            x.i0 i0Var4 = new x.i0();
            i0Var4.f16302a = 6000;
            i0Var4.a(3000, Float.valueOf(0.87f)).f16292b = f6007b;
            i0Var4.a(6000, Float.valueOf(0.1f));
            e0VarH3 = x.c.h(g0VarS2, 0.1f, 0.87f, x.c.r(new x.j0(i0Var4), null, 6), null, g0Var2, 4536, 8);
            g0Var = g0Var2;
            b2.r rVarM2 = h0.z1.m(j3.q.c(rVar4, true, new z.y0(2)), f6006a);
            boolean zG3 = g0Var.g(e0VarH3);
            if ((57344 & i23) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z14 = zG3 | z11;
            if ((i23 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            zG = z14 | z12 | g0Var.g(e0VarH) | g0Var.g(e0VarH2) | g0Var.f(j13) | g0Var.i(hVar) | ((((i23 & 112) ^ 48) <= 32 && g0Var.f(j9)) || (i23 & 48) == 32);
            objN = g0Var.N();
            if (zG) {
                f17 = f15;
                u00.k kVar2 = new u00.k() {
                    public final Object invoke(Object obj) {
                        long j15 = j13;
                        k2.h hVar2 = hVar;
                        long j16 = j9;
                        k2.d dVar = (k2.d) obj;
                        float fFloatValue = ((Number) e0VarH3.getValue()).floatValue() * 360.0f;
                        int i29 = i22;
                        float f111 = f17;
                        if (i29 != 0 && Float.intBitsToFloat((int) (dVar.b() & 4294967295L)) <= Float.intBitsToFloat((int) (dVar.b() >> 32))) {
                            f111 += f16;
                        }
                        float fK0 = (f111 / ((float) (((double) dVar.k0(Float.intBitsToFloat((int) (dVar.b() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) e0VarH2.getValue()).floatValue() + ((Number) e0VarH.getValue()).floatValue();
                        long jY0 = dVar.Y0();
                        a1.i iVarG0 = dVar.G0();
                        long jQ = iVarG0.q();
                        iVarG0.n().i();
                        try {
                            ((hf.c) iVarG0.B).F(fFloatValue2, jY0);
                            v5.c(dVar, Math.min(fFloatValue, fK0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fK0) * 2), j15, hVar2);
                            v5.c(dVar, 0.0f, fFloatValue, j16, hVar2);
                            return g00.b0.a;
                        } finally {
                            w.c.t(iVarG0, jQ);
                        }
                    }
                };
                j14 = j13;
                g0Var.n0(kVar2);
                objN = kVar2;
            } else {
                f17 = f15;
                u00.k kVar3 = new u00.k() {
                    public final Object invoke(Object obj) {
                        long j15 = j13;
                        k2.h hVar2 = hVar;
                        long j16 = j9;
                        k2.d dVar = (k2.d) obj;
                        float fFloatValue = ((Number) e0VarH3.getValue()).floatValue() * 360.0f;
                        int i29 = i22;
                        float f111 = f17;
                        if (i29 != 0 && Float.intBitsToFloat((int) (dVar.b() & 4294967295L)) <= Float.intBitsToFloat((int) (dVar.b() >> 32))) {
                            f111 += f16;
                        }
                        float fK0 = (f111 / ((float) (((double) dVar.k0(Float.intBitsToFloat((int) (dVar.b() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) e0VarH2.getValue()).floatValue() + ((Number) e0VarH.getValue()).floatValue();
                        long jY0 = dVar.Y0();
                        a1.i iVarG0 = dVar.G0();
                        long jQ = iVarG0.q();
                        iVarG0.n().i();
                        try {
                            ((hf.c) iVarG0.B).F(fFloatValue2, jY0);
                            v5.c(dVar, Math.min(fFloatValue, fK0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fK0) * 2), j15, hVar2);
                            v5.c(dVar, 0.0f, fFloatValue, j16, hVar2);
                            return g00.b0.a;
                        } finally {
                            w.c.t(iVarG0, jQ);
                        }
                    }
                };
                j14 = j13;
                g0Var.n0(kVar3);
                objN = kVar3;
            }
            z.n.b(0, rVarM2, g0Var, (u00.k) objN);
            f12 = f17;
            rVar2 = rVar4;
            f11 = f16;
            i20 = i22;
            j11 = j14;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            j11 = j10;
            f12 = f10;
            i20 = i16;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v5.a(rVar2, j9, f11, j11, i20, f12, (l1.j) obj, l1.q.K(i11 | 1), i12);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(final u00.a aVar, final b2.r rVar, final long j9, final float f3, final long j10, int i10, float f10, l1.j jVar, final int i11, final int i12) {
        int i13;
        int i14;
        float f11;
        final int i15;
        final float f12;
        int i16;
        int i17;
        final float f13;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1798883595);
        if ((i11 & 6) == 0) {
            i13 = (g0Var.i(aVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= g0Var.f(j9) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i11 & 3072) == 0) {
            i13 |= g0Var.d(f3) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= g0Var.f(j10) ? 16384 : 8192;
        }
        int i18 = i12 & 32;
        if (i18 != 0) {
            i13 |= 196608;
            i14 = i10;
        } else {
            i14 = i10;
            if ((i11 & 196608) == 0) {
                i13 |= g0Var.e(i14) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
            }
        }
        int i19 = i12 & 64;
        if (i19 != 0) {
            i13 |= 1572864;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i11 & 1572864) == 0) {
                i13 |= g0Var.d(f11) ? 1048576 : 524288;
            }
        }
        if (g0Var.S(i13 & 1, (i13 & 599187) != 599186)) {
            g0Var.X();
            if ((i11 & 1) == 0 || g0Var.A()) {
                int i20 = i18 != 0 ? q5.f5941b : i14;
                if (i19 != 0) {
                    i16 = i20;
                    f11 = q5.f5943d;
                } else {
                    i16 = i20;
                }
            } else {
                g0Var.V();
                i16 = i14;
            }
            g0Var.s();
            boolean z10 = (i13 & 14) == 4;
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (z10 || objN == cVar) {
                objN = new es.b(4, aVar);
                g0Var.n0(objN);
            }
            final u00.a aVar2 = (u00.a) objN;
            final k2.h hVar = new k2.h(((y3.c) g0Var.k(c3.o1.f2734h)).A0(f3), 0.0f, i16, 0, null, 26);
            float f14 = f11;
            boolean zG = g0Var.g(aVar2);
            Object objN2 = g0Var.N();
            if (zG || objN2 == cVar) {
                objN2 = new ca.q(7, aVar2);
                g0Var.n0(objN2);
            }
            b2.r rVarM = h0.z1.m(j3.q.c(rVar, true, (u00.k) objN2), f6006a);
            boolean zG2 = ((i13 & 458752) == 131072) | g0Var.g(aVar2) | ((3670016 & i13) == 1048576) | ((i13 & 7168) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && g0Var.f(j10)) || (i13 & 24576) == 16384) | g0Var.i(hVar) | ((((i13 & 896) ^ 384) > 256 && g0Var.f(j9)) || (i13 & 384) == 256);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == cVar) {
                i17 = 0;
                f13 = f14;
                final int i21 = i16;
                u00.k kVar = new u00.k() {
                    public final Object invoke(Object obj) {
                        k2.d dVar = (k2.d) obj;
                        float fFloatValue = ((Number) aVar2.invoke()).floatValue() * 360.0f;
                        int i22 = i21;
                        float f15 = f13;
                        if (i22 != 0 && Float.intBitsToFloat((int) (dVar.b() & 4294967295L)) <= Float.intBitsToFloat((int) (dVar.b() >> 32))) {
                            f15 += f3;
                        }
                        float fK0 = (f15 / ((float) (((double) dVar.k0(Float.intBitsToFloat((int) (dVar.b() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fMin = Math.min(fFloatValue, fK0) + 270.0f + fFloatValue;
                        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fK0) * 2);
                        long j11 = j10;
                        k2.h hVar2 = hVar;
                        v5.c(dVar, fMin, fMin2, j11, hVar2);
                        v5.c(dVar, 270.0f, fFloatValue, j9, hVar2);
                        return g00.b0.a;
                    }
                };
                g0Var.n0(kVar);
                objN3 = kVar;
            } else {
                f13 = f14;
                i17 = 0;
            }
            z.n.b(i17, rVarM, g0Var, (u00.k) objN3);
            f12 = f13;
            i15 = i16;
        } else {
            g0Var.V();
            i15 = i14;
            f12 = f11;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    v5.b(aVar, rVar, j9, f3, j10, i15, f12, (l1.j) obj, l1.q.K(i11 | 1), i12);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void c(k2.d dVar, float f3, float f10, long j9, k2.h hVar) {
        float f11 = 2;
        float f12 = hVar.f8923a / f11;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.b() >> 32)) - (f11 * f12);
        dVar.K0(j9, f3, f10, (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (832 & 64) != 0 ? 1.0f : 0.0f, hVar);
    }
}
