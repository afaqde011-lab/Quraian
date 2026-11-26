package h1;

import c3.o1;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.g4;
import g1.l8;
import g1.m8;
import g1.n5;
import g1.r3;
import g1.r4;
import g1.t6;
import g1.w6;
import g1.x5;
import h0.n1;
import kotlin.NoWhenBranchMatchedException;
import l1.i1;
import l1.p2;
import x.k1;
import x.m1;
import x.r1;

public abstract class e1 {

    public static final float f6496a;

    public static final float f6497b = 4;

    public static final float f6498c = 2;

    public static final float f6499d = 24;

    public static final float f6500e;

    public static final float f6501f;

    static {
        float f3 = 16;
        f6496a = f3;
        f6500e = f3;
        f6501f = f3;
    }

    public static final void a(final CharSequence charSequence, final u00.n nVar, final w6 w6Var, final u00.o oVar, final u00.n nVar2, final u00.n nVar3, final u00.n nVar4, final u00.n nVar5, final boolean z10, final boolean z11, final boolean z12, final f0.i iVar, final n1 n1Var, final t6 t6Var, final v1.c cVar, l1.j jVar, final int i10, final int i11) {
        int i12;
        int i13;
        l1.g0 g0Var;
        h0 h0Var;
        long j9;
        float f3;
        float f10;
        i1 i1Var;
        float f11;
        int iOrdinal;
        float f12;
        k1 k1VarF;
        h0 h0Var2;
        long j10;
        h0 h0Var3;
        x.b1 b1Var;
        m1 m1VarO;
        int iOrdinal2;
        float f13;
        int iOrdinal3;
        m1 m1VarO2;
        h0 h0Var4;
        int[] iArr;
        long j11;
        j2.c cVarF;
        boolean zG;
        Object objN;
        l1.c cVar2;
        h0 h0Var5;
        long j12;
        h0 h0Var6;
        long j13;
        m1 m1VarO3;
        j2.c cVarF2;
        boolean zG2;
        Object objN2;
        int i14;
        m1 m1VarO4;
        Object objN3;
        b1 b1Var2;
        int i15;
        m3.r0 r0Var;
        v1.c cVar3;
        v1.c cVar4;
        long j14;
        Object objN4;
        v1.c cVar5;
        Object objN5;
        long j15;
        v1.c cVar6;
        long j16;
        int i16;
        v1.c cVar7;
        long j17;
        Object[] objArr;
        v1.c cVar8;
        Object objN6;
        l1.z0 z0Var;
        int i17;
        int i18;
        Object objN7;
        w.f fVar = w.f.G;
        f1[] f1VarArr = f1.A;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(546805032);
        if ((i10 & 6) == 0) {
            i12 = (g0Var2.e(1) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var2.i(charSequence) ? 32 : 16;
        }
        int i19 = i12;
        int i20 = i10 & 384;
        int i21 = Cast.MAX_NAMESPACE_LENGTH;
        if (i20 == 0) {
            i19 |= g0Var2.i(nVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i19 |= g0Var2.g(w6Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i19 |= g0Var2.i(oVar) ? 16384 : 8192;
        }
        int i22 = i10 & 196608;
        int i23 = Cast.MAX_MESSAGE_LENGTH;
        if (i22 == 0) {
            i19 |= g0Var2.i(nVar2) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i19 |= g0Var2.i(nVar3) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i19 |= g0Var2.i(nVar4) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i19 |= g0Var2.i(null) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i19 |= g0Var2.i(null) ? 536870912 : 268435456;
        }
        int i24 = i19;
        if ((i11 & 6) == 0) {
            i13 = i11 | (g0Var2.i(nVar5) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= g0Var2.h(z10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            if (g0Var2.h(z11)) {
                i21 = 256;
            }
            i13 |= i21;
        }
        if ((i11 & 3072) == 0) {
            i13 |= g0Var2.h(z12) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= g0Var2.g(iVar) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            if (g0Var2.g(n1Var)) {
                i23 = 131072;
            }
            i13 |= i23;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= g0Var2.g(t6Var) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= g0Var2.i(cVar) ? 8388608 : 4194304;
        }
        int i25 = i13;
        if (g0Var2.S(i24 & 1, ((i24 & 306783379) == 306783378 && (i25 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) g4.x(iVar, g0Var2, (i25 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                h0Var = h0.A;
            } else {
                h0Var = charSequence.length() == 0 ? h0.B : h0.C;
            }
            if (!z11) {
                j9 = t6Var.f5992z;
            } else if (z12) {
                j9 = t6Var.A;
            } else {
                j9 = zBooleanValue ? t6Var.f5990x : t6Var.f5991y;
            }
            l8 l8Var = (l8) g0Var2.k(m8.f5890a);
            m3.r0 r0Var2 = l8Var.f5868j;
            m3.r0 r0Var3 = l8Var.l;
            long jC = r0Var2.c();
            long j18 = i2.t.f7167g;
            boolean z13 = (i2.t.c(jC, j18) && !i2.t.c(r0Var3.c(), j18)) || (!i2.t.c(r0Var2.c(), j18) && i2.t.c(r0Var3.c(), j18));
            long jC2 = r0Var3.c();
            if (z13 && jC2 == 16) {
                jC2 = j9;
            }
            long jC3 = r0Var2.c();
            long j19 = (z13 && jC3 == 16) ? j9 : jC3;
            boolean z14 = oVar != null && (w6Var instanceof w6);
            boolean z15 = z13;
            x.n1 n1VarY = x.c.y(h0Var, "TextFieldInputState", g0Var2, 48, 0);
            f5.c cVar9 = n1VarY.f16323a;
            i1 i1Var2 = n1VarY.f16326d;
            x.b1 b1VarP = x5.p(k1.q.B, g0Var2);
            r1 r1Var = x.c.f16258k;
            h0 h0Var7 = (h0) cVar9.J0();
            g0Var2.c0(-1436405362);
            int iOrdinal4 = h0Var7.ordinal();
            float f14 = 0.0f;
            if (iOrdinal4 == 0) {
                f3 = 1.0f;
            } else {
                if (iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z14) {
                    f3 = 0.0f;
                }
                f3 = 1.0f;
            }
            g0Var2.r(false);
            Float fValueOf = Float.valueOf(f3);
            h0 h0Var8 = (h0) i1Var2.getValue();
            g0Var2.c0(-1436405362);
            int iOrdinal5 = h0Var8.ordinal();
            if (iOrdinal5 == 0) {
                f10 = 1.0f;
            } else {
                if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z14) {
                    f10 = 0.0f;
                }
                f10 = 1.0f;
            }
            g0Var2.r(false);
            Float fValueOf2 = Float.valueOf(f10);
            n1VarY.f();
            g0Var2.c0(-709912974);
            g0Var2.r(false);
            m1 m1VarO5 = x.c.o(n1VarY, fValueOf, fValueOf2, b1VarP, r1Var, g0Var2, 196608);
            k1.q qVar = k1.q.D;
            x.b1 b1VarP2 = x5.p(qVar, g0Var2);
            x.b1 b1VarP3 = x5.p(k1.q.E, g0Var2);
            h0 h0Var9 = (h0) cVar9.J0();
            g0Var2.c0(-1093194547);
            int iOrdinal6 = h0Var9.ordinal();
            if (iOrdinal6 != 0) {
                i1Var = i1Var2;
                if (iOrdinal6 == 1) {
                    if (z14) {
                    }
                    g0Var2.r(false);
                    Float fValueOf3 = Float.valueOf(f11);
                    h0 h0Var10 = (h0) i1Var.getValue();
                    g0Var2.c0(-1093194547);
                    iOrdinal = h0Var10.ordinal();
                    if (iOrdinal == 0) {
                        f12 = 1.0f;
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z14) {
                            f12 = 1.0f;
                        }
                        f12 = 0.0f;
                    }
                    g0Var2.r(false);
                    Float fValueOf4 = Float.valueOf(f12);
                    k1VarF = n1VarY.f();
                    g0Var2.c0(-984009111);
                    h0Var2 = h0.A;
                    j10 = jC2;
                    h0Var3 = h0.B;
                    if (k1VarF.b(h0Var2, h0Var3) && (k1VarF.b(h0Var3, h0Var2) || k1VarF.b(h0.C, h0Var3))) {
                        b1Var = b1VarP3;
                    } else {
                        b1Var = b1VarP2;
                    }
                    g0Var2.r(false);
                    m1VarO = x.c.o(n1VarY, fValueOf3, fValueOf4, b1Var, r1Var, g0Var2, 196608);
                    h0 h0Var11 = (h0) cVar9.J0();
                    g0Var2.c0(-1258455321);
                    iOrdinal2 = h0Var11.ordinal();
                    if (iOrdinal2 == 0) {
                        f13 = 1.0f;
                    } else {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z14) {
                            f13 = 0.0f;
                        }
                        f13 = 1.0f;
                    }
                    g0Var2.r(false);
                    Float fValueOf5 = Float.valueOf(f13);
                    h0 h0Var12 = (h0) i1Var.getValue();
                    g0Var2.c0(-1258455321);
                    iOrdinal3 = h0Var12.ordinal();
                    if (iOrdinal3 == 0) {
                        f14 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z14) {
                        }
                        f14 = 1.0f;
                    }
                    g0Var2.r(false);
                    Float fValueOf6 = Float.valueOf(f14);
                    n1VarY.f();
                    g0Var2.c0(2126293195);
                    g0Var2.r(false);
                    m1VarO2 = x.c.o(n1VarY, fValueOf5, fValueOf6, b1VarP2, r1Var, g0Var2, 196608);
                    x.b1 b1VarP4 = x5.p(qVar, g0Var2);
                    h0Var4 = (h0) i1Var.getValue();
                    g0Var2.c0(-12973394);
                    iArr = c1.f6495a;
                    if (iArr[h0Var4.ordinal()] == 1) {
                        j11 = j10;
                    } else {
                        j11 = j19;
                    }
                    g0Var2.r(false);
                    cVarF = i2.t.f(j11);
                    zG = g0Var2.g(cVarF);
                    objN = g0Var2.N();
                    cVar2 = l1.i.f9868a;
                    if (zG || objN == cVar2) {
                        objN = new r1(fVar, new w.g(cVarF, 3));
                        g0Var2.n0(objN);
                    }
                    r1 r1Var2 = (r1) objN;
                    h0Var5 = (h0) cVar9.J0();
                    g0Var2.c0(-12973394);
                    if (iArr[h0Var5.ordinal()] == 1) {
                        j12 = j10;
                    } else {
                        j12 = j19;
                    }
                    g0Var2.r(false);
                    i2.t tVar = new i2.t(j12);
                    h0Var6 = (h0) i1Var.getValue();
                    g0Var2.c0(-12973394);
                    if (iArr[h0Var6.ordinal()] == 1) {
                        j13 = j10;
                    } else {
                        j13 = j19;
                    }
                    g0Var2.r(false);
                    i2.t tVar2 = new i2.t(j13);
                    n1VarY.f();
                    g0Var2.c0(1954111929);
                    g0Var2.r(false);
                    m1VarO3 = x.c.o(n1VarY, tVar, tVar2, b1VarP4, r1Var2, g0Var2, 196608);
                    g0Var2.c0(-464752477);
                    g0Var2.r(false);
                    cVarF2 = i2.t.f(j9);
                    zG2 = g0Var2.g(cVarF2);
                    objN2 = g0Var2.N();
                    if (!zG2 || objN2 == cVar2) {
                        i14 = 3;
                        r1 r1Var3 = new r1(fVar, new w.g(cVarF2, i14));
                        g0Var2.n0(r1Var3);
                        objN2 = r1Var3;
                    } else {
                        i14 = 3;
                    }
                    r1 r1Var4 = (r1) objN2;
                    g0Var2.c0(-464752477);
                    g0Var2.r(false);
                    i2.t tVar3 = new i2.t(j9);
                    g0Var2.c0(-464752477);
                    g0Var2.r(false);
                    i2.t tVar4 = new i2.t(j9);
                    n1VarY.f();
                    g0Var2.c0(1190923886);
                    g0Var2.r(false);
                    m1VarO4 = x.c.o(n1VarY, tVar3, tVar4, b1VarP4, r1Var4, g0Var2, 196608);
                    g0Var = g0Var2;
                    objN3 = g0Var.N();
                    if (objN3 == cVar2) {
                        objN3 = new b1();
                        g0Var.n0(objN3);
                    }
                    b1Var2 = (b1) objN3;
                    if (oVar == null) {
                        g0Var.c0(-1891724857);
                        g0Var.r(false);
                        i15 = i24;
                        r0Var = r0Var2;
                        cVar4 = null;
                        cVar3 = null;
                    } else {
                        g0Var.c0(-1891724856);
                        i15 = i24;
                        r0Var = r0Var2;
                        cVar3 = null;
                        v1.c cVarD = v1.d.d(-1076580032, new r4(r0Var, r0Var3, m1VarO5, m1VarO4, z15, m1VarO3, oVar, b1Var2), g0Var);
                        g0Var.r(false);
                        cVar4 = cVarD;
                    }
                    if (!z11) {
                        j14 = t6Var.D;
                    } else if (z12) {
                        j14 = t6Var.E;
                    } else if (zBooleanValue) {
                        j14 = t6Var.B;
                    } else {
                        j14 = t6Var.C;
                    }
                    objN4 = g0Var.N();
                    if (objN4 == cVar2) {
                        objN4 = l1.q.q(l1.c.G, new ds.l(m1VarO, 6));
                        g0Var.n0(objN4);
                    }
                    p2 p2Var = (p2) objN4;
                    if (nVar2 == null && charSequence.length() == 0 && ((Boolean) p2Var.getValue()).booleanValue()) {
                        g0Var.c0(-1890614312);
                        v1.c cVarD2 = v1.d.d(1405547205, new a1(m1VarO, j14, r0Var, nVar2), g0Var);
                        g0Var.r(false);
                        cVar5 = cVarD2;
                    } else {
                        g0Var.c0(-1890217110);
                        g0Var.r(false);
                        cVar5 = cVar3;
                    }
                    objN5 = g0Var.N();
                    if (objN5 == cVar2) {
                        objN5 = l1.q.q(l1.c.G, new ds.l(m1VarO2, 7));
                        g0Var.n0(objN5);
                    }
                    g0Var.c0(-1889500886);
                    g0Var.r(false);
                    g0Var.c0(-1888924534);
                    g0Var.r(false);
                    if (!z11) {
                        j15 = t6Var.f5984r;
                    } else if (z12) {
                        j15 = t6Var.f5985s;
                    } else if (zBooleanValue) {
                        j15 = t6Var.f5982p;
                    } else {
                        j15 = t6Var.f5983q;
                    }
                    if (nVar3 == null) {
                        g0Var.c0(-1888749663);
                        g0Var.r(false);
                        cVar6 = cVar3;
                    } else {
                        g0Var.c0(-1888749662);
                        v1.c cVarD3 = v1.d.d(-1736293487, new z0(j15, nVar3, 0), g0Var);
                        g0Var.r(false);
                        cVar6 = cVarD3;
                    }
                    if (!z11) {
                        j16 = t6Var.f5988v;
                    } else if (z12) {
                        j16 = t6Var.f5989w;
                    } else if (zBooleanValue) {
                        j16 = t6Var.f5986t;
                    } else {
                        j16 = t6Var.f5987u;
                    }
                    if (nVar4 == null) {
                        g0Var.c0(-1888469888);
                        g0Var.r(false);
                        cVar7 = cVar3;
                        i16 = 1;
                    } else {
                        g0Var.c0(-1888469887);
                        i16 = 1;
                        v1.c cVarD4 = v1.d.d(1334518521, new z0(j16, nVar4, i16), g0Var);
                        g0Var.r(false);
                        cVar7 = cVarD4;
                    }
                    if (!z11) {
                        j17 = t6Var.H;
                    } else if (z12) {
                        j17 = t6Var.I;
                    } else if (zBooleanValue) {
                        j17 = t6Var.F;
                    } else {
                        j17 = t6Var.G;
                    }
                    if (nVar5 == null) {
                        g0Var.c0(-1888176380);
                        g0Var.r(false);
                        objArr = false;
                        cVar8 = cVar3;
                    } else {
                        g0Var.c0(-1888176379);
                        long j20 = j17;
                        objArr = false;
                        v1.c cVarD5 = v1.d.d(837168720, new g1.x(j20, r0Var3, nVar5, 1), g0Var);
                        g0Var.r(false);
                        cVar8 = cVarD5;
                    }
                    g0Var.c0(-1886778186);
                    objN6 = g0Var.N();
                    if (objN6 == cVar2) {
                        objN6 = l1.q.z(new h2.e(0L));
                        g0Var.n0(objN6);
                    }
                    z0Var = (l1.z0) objN6;
                    v1.c cVarD6 = v1.d.d(528115858, new d10.e(z0Var, w6Var, n1Var, cVar, 2), g0Var);
                    v1.c cVar10 = cVar4;
                    d1 d1Var = new d1(new f40.h(0, 2, p2.class, m1VarO5, "value", "getValue()Ljava/lang/Object;"));
                    i17 = i15;
                    if ((i17 & 7168) != 2048) {
                        i16 = 0;
                    }
                    i18 = i16 | (g0Var.g(m1VarO5) ? 1 : 0);
                    objN7 = g0Var.N();
                    if (i18 == 0 || objN7 == cVar2) {
                        objN7 = new al.l(w6Var, m1VarO5, z0Var);
                        g0Var.n0(objN7);
                    }
                    n5.d(nVar, cVar5, cVar10, cVar6, cVar7, cVar3, cVar3, z10, w6Var, d1Var, (u00.k) objN7, cVarD6, cVar8, n1Var, g0Var, ((i17 >> 3) & 112) | 6 | ((i25 << 21) & 234881024) | ((i17 << 18) & 1879048192), (57344 & (i25 >> 3)) | 384);
                    g0Var.r(false);
                } else if (iOrdinal6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f11 = 0.0f;
                g0Var2.r(false);
                Float fValueOf7 = Float.valueOf(f11);
                h0 h0Var13 = (h0) i1Var.getValue();
                g0Var2.c0(-1093194547);
                iOrdinal = h0Var13.ordinal();
                if (iOrdinal == 0) {
                    f12 = 1.0f;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z14) {
                        f12 = 1.0f;
                    }
                    f12 = 0.0f;
                }
                g0Var2.r(false);
                Float fValueOf8 = Float.valueOf(f12);
                k1VarF = n1VarY.f();
                g0Var2.c0(-984009111);
                h0Var2 = h0.A;
                j10 = jC2;
                h0Var3 = h0.B;
                if (k1VarF.b(h0Var2, h0Var3)) {
                    b1Var = b1VarP2;
                } else {
                    b1Var = b1VarP3;
                }
                g0Var2.r(false);
                m1VarO = x.c.o(n1VarY, fValueOf7, fValueOf8, b1Var, r1Var, g0Var2, 196608);
                h0 h0Var14 = (h0) cVar9.J0();
                g0Var2.c0(-1258455321);
                iOrdinal2 = h0Var14.ordinal();
                if (iOrdinal2 == 0) {
                    f13 = 1.0f;
                } else {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z14) {
                        f13 = 0.0f;
                    }
                    f13 = 1.0f;
                }
                g0Var2.r(false);
                Float fValueOf9 = Float.valueOf(f13);
                h0 h0Var15 = (h0) i1Var.getValue();
                g0Var2.c0(-1258455321);
                iOrdinal3 = h0Var15.ordinal();
                if (iOrdinal3 == 0) {
                    f14 = 1.0f;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z14) {
                    }
                    f14 = 1.0f;
                }
                g0Var2.r(false);
                Float fValueOf10 = Float.valueOf(f14);
                n1VarY.f();
                g0Var2.c0(2126293195);
                g0Var2.r(false);
                m1VarO2 = x.c.o(n1VarY, fValueOf9, fValueOf10, b1VarP2, r1Var, g0Var2, 196608);
                x.b1 b1VarP5 = x5.p(qVar, g0Var2);
                h0Var4 = (h0) i1Var.getValue();
                g0Var2.c0(-12973394);
                iArr = c1.f6495a;
                if (iArr[h0Var4.ordinal()] == 1) {
                    j11 = j10;
                } else {
                    j11 = j19;
                }
                g0Var2.r(false);
                cVarF = i2.t.f(j11);
                zG = g0Var2.g(cVarF);
                objN = g0Var2.N();
                cVar2 = l1.i.f9868a;
                if (zG) {
                    objN = new r1(fVar, new w.g(cVarF, 3));
                    g0Var2.n0(objN);
                } else {
                    objN = new r1(fVar, new w.g(cVarF, 3));
                    g0Var2.n0(objN);
                }
                r1 r1Var5 = (r1) objN;
                h0Var5 = (h0) cVar9.J0();
                g0Var2.c0(-12973394);
                if (iArr[h0Var5.ordinal()] == 1) {
                    j12 = j10;
                } else {
                    j12 = j19;
                }
                g0Var2.r(false);
                i2.t tVar5 = new i2.t(j12);
                h0Var6 = (h0) i1Var.getValue();
                g0Var2.c0(-12973394);
                if (iArr[h0Var6.ordinal()] == 1) {
                    j13 = j10;
                } else {
                    j13 = j19;
                }
                g0Var2.r(false);
                i2.t tVar6 = new i2.t(j13);
                n1VarY.f();
                g0Var2.c0(1954111929);
                g0Var2.r(false);
                m1VarO3 = x.c.o(n1VarY, tVar5, tVar6, b1VarP5, r1Var5, g0Var2, 196608);
                g0Var2.c0(-464752477);
                g0Var2.r(false);
                cVarF2 = i2.t.f(j9);
                zG2 = g0Var2.g(cVarF2);
                objN2 = g0Var2.N();
                if (zG2) {
                    i14 = 3;
                    r1 r1Var6 = new r1(fVar, new w.g(cVarF2, i14));
                    g0Var2.n0(r1Var6);
                    objN2 = r1Var6;
                } else {
                    i14 = 3;
                    r1 r1Var7 = new r1(fVar, new w.g(cVarF2, i14));
                    g0Var2.n0(r1Var7);
                    objN2 = r1Var7;
                }
                r1 r1Var8 = (r1) objN2;
                g0Var2.c0(-464752477);
                g0Var2.r(false);
                i2.t tVar7 = new i2.t(j9);
                g0Var2.c0(-464752477);
                g0Var2.r(false);
                i2.t tVar8 = new i2.t(j9);
                n1VarY.f();
                g0Var2.c0(1190923886);
                g0Var2.r(false);
                m1VarO4 = x.c.o(n1VarY, tVar7, tVar8, b1VarP5, r1Var8, g0Var2, 196608);
                g0Var = g0Var2;
                objN3 = g0Var.N();
                if (objN3 == cVar2) {
                    objN3 = new b1();
                    g0Var.n0(objN3);
                }
                b1Var2 = (b1) objN3;
                if (oVar == null) {
                    g0Var.c0(-1891724857);
                    g0Var.r(false);
                    i15 = i24;
                    r0Var = r0Var2;
                    cVar4 = null;
                    cVar3 = null;
                } else {
                    g0Var.c0(-1891724856);
                    i15 = i24;
                    r0Var = r0Var2;
                    cVar3 = null;
                    v1.c cVarD7 = v1.d.d(-1076580032, new r4(r0Var, r0Var3, m1VarO5, m1VarO4, z15, m1VarO3, oVar, b1Var2), g0Var);
                    g0Var.r(false);
                    cVar4 = cVarD7;
                }
                if (!z11) {
                    j14 = t6Var.D;
                } else if (z12) {
                    j14 = t6Var.E;
                } else if (zBooleanValue) {
                    j14 = t6Var.B;
                } else {
                    j14 = t6Var.C;
                }
                objN4 = g0Var.N();
                if (objN4 == cVar2) {
                    objN4 = l1.q.q(l1.c.G, new ds.l(m1VarO, 6));
                    g0Var.n0(objN4);
                }
                p2 p2Var2 = (p2) objN4;
                if (nVar2 == null) {
                    g0Var.c0(-1890217110);
                    g0Var.r(false);
                    cVar5 = cVar3;
                } else {
                    g0Var.c0(-1890217110);
                    g0Var.r(false);
                    cVar5 = cVar3;
                }
                objN5 = g0Var.N();
                if (objN5 == cVar2) {
                    objN5 = l1.q.q(l1.c.G, new ds.l(m1VarO2, 7));
                    g0Var.n0(objN5);
                }
                g0Var.c0(-1889500886);
                g0Var.r(false);
                g0Var.c0(-1888924534);
                g0Var.r(false);
                if (!z11) {
                    j15 = t6Var.f5984r;
                } else if (z12) {
                    j15 = t6Var.f5985s;
                } else if (zBooleanValue) {
                    j15 = t6Var.f5982p;
                } else {
                    j15 = t6Var.f5983q;
                }
                if (nVar3 == null) {
                    g0Var.c0(-1888749663);
                    g0Var.r(false);
                    cVar6 = cVar3;
                } else {
                    g0Var.c0(-1888749662);
                    v1.c cVarD8 = v1.d.d(-1736293487, new z0(j15, nVar3, 0), g0Var);
                    g0Var.r(false);
                    cVar6 = cVarD8;
                }
                if (!z11) {
                    j16 = t6Var.f5988v;
                } else if (z12) {
                    j16 = t6Var.f5989w;
                } else if (zBooleanValue) {
                    j16 = t6Var.f5986t;
                } else {
                    j16 = t6Var.f5987u;
                }
                if (nVar4 == null) {
                    g0Var.c0(-1888469888);
                    g0Var.r(false);
                    cVar7 = cVar3;
                    i16 = 1;
                } else {
                    g0Var.c0(-1888469887);
                    i16 = 1;
                    v1.c cVarD9 = v1.d.d(1334518521, new z0(j16, nVar4, i16), g0Var);
                    g0Var.r(false);
                    cVar7 = cVarD9;
                }
                if (!z11) {
                    j17 = t6Var.H;
                } else if (z12) {
                    j17 = t6Var.I;
                } else if (zBooleanValue) {
                    j17 = t6Var.F;
                } else {
                    j17 = t6Var.G;
                }
                if (nVar5 == null) {
                    g0Var.c0(-1888176380);
                    g0Var.r(false);
                    objArr = false;
                    cVar8 = cVar3;
                } else {
                    g0Var.c0(-1888176379);
                    long j21 = j17;
                    objArr = false;
                    v1.c cVarD10 = v1.d.d(837168720, new g1.x(j21, r0Var3, nVar5, 1), g0Var);
                    g0Var.r(false);
                    cVar8 = cVarD10;
                }
                g0Var.c0(-1886778186);
                objN6 = g0Var.N();
                if (objN6 == cVar2) {
                    objN6 = l1.q.z(new h2.e(0L));
                    g0Var.n0(objN6);
                }
                z0Var = (l1.z0) objN6;
                v1.c cVarD11 = v1.d.d(528115858, new d10.e(z0Var, w6Var, n1Var, cVar, 2), g0Var);
                v1.c cVar11 = cVar4;
                d1 d1Var2 = new d1(new f40.h(0, 2, p2.class, m1VarO5, "value", "getValue()Ljava/lang/Object;"));
                i17 = i15;
                if ((i17 & 7168) != 2048) {
                    i16 = 0;
                }
                i18 = i16 | (g0Var.g(m1VarO5) ? 1 : 0);
                objN7 = g0Var.N();
                if (i18 == 0) {
                    objN7 = new al.l(w6Var, m1VarO5, z0Var);
                    g0Var.n0(objN7);
                } else {
                    objN7 = new al.l(w6Var, m1VarO5, z0Var);
                    g0Var.n0(objN7);
                }
                n5.d(nVar, cVar5, cVar11, cVar6, cVar7, cVar3, cVar3, z10, w6Var, d1Var2, (u00.k) objN7, cVarD11, cVar8, n1Var, g0Var, ((i17 >> 3) & 112) | 6 | ((i25 << 21) & 234881024) | ((i17 << 18) & 1879048192), (57344 & (i25 >> 3)) | 384);
                g0Var.r(false);
            } else {
                i1Var = i1Var2;
            }
            f11 = 1.0f;
            g0Var2.r(false);
            Float fValueOf11 = Float.valueOf(f11);
            h0 h0Var16 = (h0) i1Var.getValue();
            g0Var2.c0(-1093194547);
            iOrdinal = h0Var16.ordinal();
            if (iOrdinal == 0) {
                f12 = 1.0f;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z14) {
                    f12 = 1.0f;
                }
                f12 = 0.0f;
            }
            g0Var2.r(false);
            Float fValueOf12 = Float.valueOf(f12);
            k1VarF = n1VarY.f();
            g0Var2.c0(-984009111);
            h0Var2 = h0.A;
            j10 = jC2;
            h0Var3 = h0.B;
            if (k1VarF.b(h0Var2, h0Var3)) {
                b1Var = b1VarP2;
            } else {
                b1Var = b1VarP3;
            }
            g0Var2.r(false);
            m1VarO = x.c.o(n1VarY, fValueOf11, fValueOf12, b1Var, r1Var, g0Var2, 196608);
            h0 h0Var17 = (h0) cVar9.J0();
            g0Var2.c0(-1258455321);
            iOrdinal2 = h0Var17.ordinal();
            if (iOrdinal2 == 0) {
                f13 = 1.0f;
            } else {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z14) {
                    f13 = 0.0f;
                }
                f13 = 1.0f;
            }
            g0Var2.r(false);
            Float fValueOf13 = Float.valueOf(f13);
            h0 h0Var18 = (h0) i1Var.getValue();
            g0Var2.c0(-1258455321);
            iOrdinal3 = h0Var18.ordinal();
            if (iOrdinal3 == 0) {
                f14 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z14) {
                }
                f14 = 1.0f;
            }
            g0Var2.r(false);
            Float fValueOf14 = Float.valueOf(f14);
            n1VarY.f();
            g0Var2.c0(2126293195);
            g0Var2.r(false);
            m1VarO2 = x.c.o(n1VarY, fValueOf13, fValueOf14, b1VarP2, r1Var, g0Var2, 196608);
            x.b1 b1VarP6 = x5.p(qVar, g0Var2);
            h0Var4 = (h0) i1Var.getValue();
            g0Var2.c0(-12973394);
            iArr = c1.f6495a;
            if (iArr[h0Var4.ordinal()] == 1) {
                j11 = j10;
            } else {
                j11 = j19;
            }
            g0Var2.r(false);
            cVarF = i2.t.f(j11);
            zG = g0Var2.g(cVarF);
            objN = g0Var2.N();
            cVar2 = l1.i.f9868a;
            if (zG) {
                objN = new r1(fVar, new w.g(cVarF, 3));
                g0Var2.n0(objN);
            } else {
                objN = new r1(fVar, new w.g(cVarF, 3));
                g0Var2.n0(objN);
            }
            r1 r1Var9 = (r1) objN;
            h0Var5 = (h0) cVar9.J0();
            g0Var2.c0(-12973394);
            if (iArr[h0Var5.ordinal()] == 1) {
                j12 = j10;
            } else {
                j12 = j19;
            }
            g0Var2.r(false);
            i2.t tVar9 = new i2.t(j12);
            h0Var6 = (h0) i1Var.getValue();
            g0Var2.c0(-12973394);
            if (iArr[h0Var6.ordinal()] == 1) {
                j13 = j10;
            } else {
                j13 = j19;
            }
            g0Var2.r(false);
            i2.t tVar10 = new i2.t(j13);
            n1VarY.f();
            g0Var2.c0(1954111929);
            g0Var2.r(false);
            m1VarO3 = x.c.o(n1VarY, tVar9, tVar10, b1VarP6, r1Var9, g0Var2, 196608);
            g0Var2.c0(-464752477);
            g0Var2.r(false);
            cVarF2 = i2.t.f(j9);
            zG2 = g0Var2.g(cVarF2);
            objN2 = g0Var2.N();
            if (zG2) {
                i14 = 3;
                r1 r1Var10 = new r1(fVar, new w.g(cVarF2, i14));
                g0Var2.n0(r1Var10);
                objN2 = r1Var10;
            } else {
                i14 = 3;
                r1 r1Var11 = new r1(fVar, new w.g(cVarF2, i14));
                g0Var2.n0(r1Var11);
                objN2 = r1Var11;
            }
            r1 r1Var12 = (r1) objN2;
            g0Var2.c0(-464752477);
            g0Var2.r(false);
            i2.t tVar11 = new i2.t(j9);
            g0Var2.c0(-464752477);
            g0Var2.r(false);
            i2.t tVar12 = new i2.t(j9);
            n1VarY.f();
            g0Var2.c0(1190923886);
            g0Var2.r(false);
            m1VarO4 = x.c.o(n1VarY, tVar11, tVar12, b1VarP6, r1Var12, g0Var2, 196608);
            g0Var = g0Var2;
            objN3 = g0Var.N();
            if (objN3 == cVar2) {
                objN3 = new b1();
                g0Var.n0(objN3);
            }
            b1Var2 = (b1) objN3;
            if (oVar == null) {
                g0Var.c0(-1891724857);
                g0Var.r(false);
                i15 = i24;
                r0Var = r0Var2;
                cVar4 = null;
                cVar3 = null;
            } else {
                g0Var.c0(-1891724856);
                i15 = i24;
                r0Var = r0Var2;
                cVar3 = null;
                v1.c cVarD12 = v1.d.d(-1076580032, new r4(r0Var, r0Var3, m1VarO5, m1VarO4, z15, m1VarO3, oVar, b1Var2), g0Var);
                g0Var.r(false);
                cVar4 = cVarD12;
            }
            if (!z11) {
                j14 = t6Var.D;
            } else if (z12) {
                j14 = t6Var.E;
            } else if (zBooleanValue) {
                j14 = t6Var.B;
            } else {
                j14 = t6Var.C;
            }
            objN4 = g0Var.N();
            if (objN4 == cVar2) {
                objN4 = l1.q.q(l1.c.G, new ds.l(m1VarO, 6));
                g0Var.n0(objN4);
            }
            p2 p2Var3 = (p2) objN4;
            if (nVar2 == null) {
                g0Var.c0(-1890217110);
                g0Var.r(false);
                cVar5 = cVar3;
            } else {
                g0Var.c0(-1890217110);
                g0Var.r(false);
                cVar5 = cVar3;
            }
            objN5 = g0Var.N();
            if (objN5 == cVar2) {
                objN5 = l1.q.q(l1.c.G, new ds.l(m1VarO2, 7));
                g0Var.n0(objN5);
            }
            g0Var.c0(-1889500886);
            g0Var.r(false);
            g0Var.c0(-1888924534);
            g0Var.r(false);
            if (!z11) {
                j15 = t6Var.f5984r;
            } else if (z12) {
                j15 = t6Var.f5985s;
            } else if (zBooleanValue) {
                j15 = t6Var.f5982p;
            } else {
                j15 = t6Var.f5983q;
            }
            if (nVar3 == null) {
                g0Var.c0(-1888749663);
                g0Var.r(false);
                cVar6 = cVar3;
            } else {
                g0Var.c0(-1888749662);
                v1.c cVarD13 = v1.d.d(-1736293487, new z0(j15, nVar3, 0), g0Var);
                g0Var.r(false);
                cVar6 = cVarD13;
            }
            if (!z11) {
                j16 = t6Var.f5988v;
            } else if (z12) {
                j16 = t6Var.f5989w;
            } else if (zBooleanValue) {
                j16 = t6Var.f5986t;
            } else {
                j16 = t6Var.f5987u;
            }
            if (nVar4 == null) {
                g0Var.c0(-1888469888);
                g0Var.r(false);
                cVar7 = cVar3;
                i16 = 1;
            } else {
                g0Var.c0(-1888469887);
                i16 = 1;
                v1.c cVarD14 = v1.d.d(1334518521, new z0(j16, nVar4, i16), g0Var);
                g0Var.r(false);
                cVar7 = cVarD14;
            }
            if (!z11) {
                j17 = t6Var.H;
            } else if (z12) {
                j17 = t6Var.I;
            } else if (zBooleanValue) {
                j17 = t6Var.F;
            } else {
                j17 = t6Var.G;
            }
            if (nVar5 == null) {
                g0Var.c0(-1888176380);
                g0Var.r(false);
                objArr = false;
                cVar8 = cVar3;
            } else {
                g0Var.c0(-1888176379);
                long j22 = j17;
                objArr = false;
                v1.c cVarD15 = v1.d.d(837168720, new g1.x(j22, r0Var3, nVar5, 1), g0Var);
                g0Var.r(false);
                cVar8 = cVarD15;
            }
            g0Var.c0(-1886778186);
            objN6 = g0Var.N();
            if (objN6 == cVar2) {
                objN6 = l1.q.z(new h2.e(0L));
                g0Var.n0(objN6);
            }
            z0Var = (l1.z0) objN6;
            v1.c cVarD16 = v1.d.d(528115858, new d10.e(z0Var, w6Var, n1Var, cVar, 2), g0Var);
            v1.c cVar12 = cVar4;
            d1 d1Var3 = new d1(new f40.h(0, 2, p2.class, m1VarO5, "value", "getValue()Ljava/lang/Object;"));
            i17 = i15;
            if ((i17 & 7168) != 2048) {
                i16 = 0;
            }
            i18 = i16 | (g0Var.g(m1VarO5) ? 1 : 0);
            objN7 = g0Var.N();
            if (i18 == 0) {
                objN7 = new al.l(w6Var, m1VarO5, z0Var);
                g0Var.n0(objN7);
            } else {
                objN7 = new al.l(w6Var, m1VarO5, z0Var);
                g0Var.n0(objN7);
            }
            n5.d(nVar, cVar5, cVar12, cVar6, cVar7, cVar3, cVar3, z10, w6Var, d1Var3, (u00.k) objN7, cVarD16, cVar8, n1Var, g0Var, ((i17 >> 3) & 112) | 6 | ((i25 << 21) & 234881024) | ((i17 << 18) & 1879048192), (57344 & (i25 >> 3)) | 384);
            g0Var.r(false);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                {
                    f1[] f1VarArr2 = f1.A;
                }

                public final Object invoke(Object obj, Object obj2) {
                    f1[] f1VarArr2 = f1.A;
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i10 | 1);
                    int iK2 = l1.q.K(i11);
                    e1.a(charSequence, nVar, w6Var, oVar, nVar2, nVar3, nVar4, nVar5, z10, z11, z12, iVar, n1Var, t6Var, cVar, (l1.j) obj, iK, iK2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(long j9, m3.r0 r0Var, u00.n nVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(396611577);
        int i11 = (g0Var.f(j9) ? 4 : 2) | i10 | (g0Var.g(r0Var) ? 32 : 16);
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(nVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            f.c(j9, r0Var, nVar, g0Var, i11 & 1022);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new t0(j9, r0Var, nVar, i10, 1);
        }
    }

    public static final void c(long j9, u00.n nVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(590397809);
        int i11 = (g0Var.f(j9) ? 4 : 2) | i10 | (g0Var.i(nVar) ? 32 : 16);
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            l1.q.a(g1.y0.f6028a.a(new i2.t(j9)), nVar, g0Var, (i11 & 112) | 8);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new w0(j9, nVar, i10);
        }
    }

    public static final b2.r d(b2.r rVar, boolean z10, String str) {
        return z10 ? j3.q.c(rVar, false, new b6.o(str, 17)) : rVar;
    }

    public static final b2.c e(w6 w6Var) {
        if (w6Var instanceof w6) {
            return w6Var.f6024a;
        }
        throw new IllegalArgumentException("Unknown position: " + w6Var);
    }

    public static final float f(l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        long j9 = ((l8) g0Var.k(m8.f5890a)).l.f10523b.f10539c;
        long j10 = k1.e0.l;
        if ((1095216660480L & j9) != 4294967296L) {
            j9 = j10;
        }
        return ((y3.c) g0Var.k(o1.f2734h)).H(j9) / 2;
    }

    public static final float g(l1.j jVar) {
        float f3 = ((y3.f) ((l1.g0) jVar).k(r3.f5953c)).A;
        if (Float.isNaN(f3)) {
            f3 = 0;
        }
        float f10 = (f3 - k1.z.f8915d) / 2;
        float f11 = 0;
        return f10 < f11 ? f11 : f10;
    }
}
