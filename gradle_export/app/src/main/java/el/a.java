package el;

import ab.a0;
import b2.o;
import b2.r;
import b3.h;
import c0.g;
import ct.e0;
import d0.o2;
import g00.b0;
import g1.l8;
import g1.m8;
import g1.s;
import g1.x5;
import g1.z;
import g1.z6;
import h0.c1;
import h0.n1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.w;
import h0.z1;
import h00.q;
import i2.t;
import i2.t0;
import j0.v;
import j0.x;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i;
import l1.j;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z0;
import m3.r0;
import qd.s0;
import u00.k;
import u00.n;
import x3.l;
import z.u;

public abstract class a {
    public static final v1.c a = new v1.c(new ax.a(10), -1390403457, false);

    public static final void a(final boolean z, final int i, final String title, final String subtitle, final String buttonText, final u00.a onDismiss, r rVar, int i2, float f, int i3, float f2, long j, long j2, boolean z2, boolean z3, r0 r0Var, k kVar, boolean z4, boolean z5, j jVar, final int i4, final int i5, final int i6) {
        int i7;
        k kVar2;
        int i8;
        boolean z6;
        int i9;
        int i11;
        boolean z7;
        int i12;
        boolean z8;
        j jVar2;
        final r rVar2;
        final int i13;
        final float f3;
        final long j3;
        final boolean z9;
        final boolean z11;
        final r0 r0Var2;
        final boolean z12;
        final k kVar3;
        final boolean z13;
        final int i14;
        final float f4;
        final long j4;
        r1 r1VarT;
        long j5;
        long j6;
        int i15;
        r rVar3;
        final int i16;
        final float f5;
        r0 r0Var3;
        boolean z14;
        boolean z15;
        int i17;
        final float f6;
        int i18;
        boolean z16;
        int i19;
        boolean z17;
        boolean z18;
        Object objN;
        Object obj;
        boolean z19;
        final List list;
        boolean z21;
        Object objN2;
        int iIndexOf;
        final z0 z0Var;
        final v vVarA;
        Object objN3;
        final p2 p2Var;
        final k kVar4;
        final r rVar4;
        final boolean z22;
        final long j7;
        final long j8;
        final boolean z23;
        final boolean z24;
        final boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        Object objN4;
        m.e(title, "title");
        m.e(subtitle, "subtitle");
        m.e(buttonText, "buttonText");
        m.e(onDismiss, "onDismiss");
        j jVar3 = (g0) jVar;
        jVar3.e0(2142672547);
        if ((i4 & 6) == 0) {
            i7 = (jVar3.h(z) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= jVar3.e(i) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= jVar3.g(title) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 |= jVar3.g(subtitle) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i7 |= jVar3.g(buttonText) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i7 |= jVar3.i(onDismiss) ? 131072 : 65536;
        }
        int i21 = i7 | 920125440;
        int i22 = i5 | 6;
        if ((i5 & 48) == 0) {
            i22 = i5 | 22;
        }
        if ((i5 & 384) == 0) {
            i22 |= 128;
        }
        int i23 = i22 | 27648;
        int i24 = i6 & 65536;
        if (i24 == 0) {
            if ((1572864 & i5) == 0) {
                kVar2 = kVar;
                i23 |= jVar3.i(kVar2) ? 1048576 : 524288;
            }
            i8 = i6 & 131072;
            if (i8 != 0) {
                i23 |= 12582912;
                z6 = z4;
            } else {
                z6 = z4;
                if ((i5 & 12582912) == 0) {
                    if (jVar3.h(z6)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i23 |= i9;
                }
            }
            i11 = i6 & 262144;
            if (i11 != 0) {
                i23 |= 100663296;
                z7 = z5;
            } else {
                z7 = z5;
                if ((i5 & 100663296) == 0) {
                    if (jVar3.h(z7)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i23 |= i12;
                }
            }
            if ((i21 & 306783379) == 306783378 || (38282387 & i23) != 38282386) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (jVar3.S(i21 & 1, z8)) {
                jVar3.X();
                if ((i4 & 1) != 0 || jVar3.A()) {
                    float f7 = 56;
                    float f8 = 1;
                    j5 = dl.a.J;
                    j6 = dl.a.K;
                    r0 r0Var4 = ((l8) jVar3.k(m8.a)).f;
                    i15 = i23 & (-459761);
                    if (i24 != 0) {
                        kVar2 = null;
                    }
                    if (i8 != 0) {
                        z6 = false;
                    }
                    rVar3 = o.A;
                    i16 = 3;
                    f5 = f8;
                    r0Var3 = r0Var4;
                    if (i11 != 0) {
                        z14 = true;
                        z15 = true;
                        z7 = true;
                    } else {
                        z14 = true;
                        z15 = true;
                    }
                    i17 = 2;
                    f6 = f7;
                    i18 = 1;
                } else {
                    jVar3.V();
                    int i25 = i23 & (-459761);
                    rVar3 = rVar;
                    f6 = f;
                    i16 = i3;
                    f5 = f2;
                    j5 = j;
                    j6 = j2;
                    z14 = z2;
                    z15 = z3;
                    r0Var3 = r0Var;
                    i15 = i25;
                    i17 = 2;
                    i18 = i2;
                }
                jVar3.s();
                z16 = z14;
                i19 = i21 & 29360128;
                z17 = z15;
                if (i19 == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objN = jVar3.N();
                obj = i.a;
                if (!z18 || objN == obj) {
                    z19 = true;
                    objN = q.n1(a0.E0(i18, new z00.e(1, 180, 1)));
                    jVar3.n0(objN);
                } else {
                    z19 = true;
                }
                list = (List) objN;
                if (i19 == 8388608) {
                    z21 = z19;
                } else {
                    z21 = false;
                }
                objN2 = jVar3.N();
                if (z21 || objN2 == obj) {
                    iIndexOf = list.indexOf(Integer.valueOf(i - (i % i18)));
                    if (iIndexOf < 0) {
                        iIndexOf = 0;
                    }
                    objN2 = l1.q.z(Integer.valueOf(iIndexOf));
                    jVar3.n0(objN2);
                }
                z0Var = (z0) objN2;
                vVarA = x.a(((Number) z0Var.getValue()).intValue() + (list.size() * 5000), jVar3, i17);
                objN3 = jVar3.N();
                if (objN3 == obj) {
                    objN3 = l1.q.r(new b(vVarA, 0));
                    jVar3.n0(objN3);
                }
                p2Var = (p2) objN3;
                if (z) {
                    jVar3.c0(555144075);
                    if ((i15 & 29360128) == 8388608) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if ((458752 & i21) == 131072) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z26 | z27;
                    objN4 = jVar3.N();
                    if (z28 || objN4 == obj) {
                        objN4 = new g(z6, onDismiss, 1);
                        jVar3.n0(objN4);
                    }
                    boolean z29 = !z6;
                    c4.v vVar = new c4.v(z29, z29, false);
                    rVar4 = rVar3;
                    z25 = z6;
                    j7 = j5;
                    j8 = j6;
                    z23 = z16;
                    z24 = z17;
                    jVar2 = jVar3;
                    kVar4 = kVar2;
                    z22 = z7;
                    s0.G((u00.a) objN4, vVar, v1.d.d(-74928591, new n() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3) {
                            g0 g0Var = (j) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            g0 g0Var2 = g0Var;
                            if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                                r rVarC = h0.c.C(z1.s(o.A, 0.0f, 500, 1), 16);
                                p0.e eVarA = p0.f.a(32);
                                u uVarA = z.n.a(1, t.b(0.8f, dl.a.J));
                                z zVarI = x5.i(dl.a.K, 0L, g0Var, 0, 14);
                                final r rVar5 = rVar4;
                                final String str = title;
                                final k kVar5 = kVar4;
                                final List list2 = list;
                                final z0 z0Var2 = z0Var;
                                final boolean z31 = z22;
                                final u00.a aVar = onDismiss;
                                final boolean z32 = z25;
                                final p2 p2Var2 = p2Var;
                                final String str2 = buttonText;
                                final float f9 = f6;
                                final int i26 = i16;
                                final float f11 = f5;
                                final long j9 = j7;
                                final long j11 = j8;
                                final boolean z33 = z23;
                                final boolean z34 = z24;
                                final v vVar2 = vVarA;
                                final String str3 = subtitle;
                                x5.b(rVarC, eVarA, zVarI, (g1.a0) null, uVarA, v1.d.d(-1353898241, new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        w Card = (w) obj4;
                                        g0 g0Var3 = (j) obj5;
                                        int iIntValue2 = ((Integer) obj6).intValue();
                                        m.e(Card, "$this$Card");
                                        boolean z35 = false;
                                        boolean z36 = (iIntValue2 & 17) != 16;
                                        g0 g0Var4 = g0Var3;
                                        a30.x xVar = g0Var4.a;
                                        if (g0Var4.S(iIntValue2 & 1, z36)) {
                                            r rVarD = z1.d(rVar5, 1.0f);
                                            h0.v vVarA2 = h0.u.a(h0.i.c, b2.b.N, g0Var3, 48);
                                            int iHashCode = Long.hashCode(g0Var4.T);
                                            m1 m1VarM = g0Var4.m();
                                            r rVarC2 = b2.a.c(rVarD, g0Var3);
                                            b3.i.c.getClass();
                                            b3.g gVar = h.b;
                                            g0Var4.g0();
                                            if (g0Var4.S) {
                                                g0Var4.l(gVar);
                                            } else {
                                                g0Var4.q0();
                                            }
                                            b3.f fVar = h.f;
                                            l1.q.I(vVarA2, g0Var3, fVar);
                                            b3.f fVar2 = h.e;
                                            l1.q.I(m1VarM, g0Var3, fVar2);
                                            Integer numValueOf = Integer.valueOf(iHashCode);
                                            b3.f fVar3 = h.g;
                                            l1.q.I(numValueOf, g0Var3, fVar3);
                                            b3.e eVar = h.h;
                                            l1.q.E(g0Var3, eVar);
                                            b3.f fVar4 = h.d;
                                            l1.q.I(rVarC2, g0Var3, fVar4);
                                            o oVar = o.A;
                                            r rVarC3 = h0.c.C(z1.d(oVar, 1.0f), 16);
                                            b2.h hVar = b2.b.K;
                                            v1 v1VarA = t1.a(h0.i.a, hVar, g0Var3, 48);
                                            int iHashCode2 = Long.hashCode(g0Var4.T);
                                            m1 m1VarM2 = g0Var4.m();
                                            r rVarC4 = b2.a.c(rVarC3, g0Var3);
                                            g0Var4.g0();
                                            if (g0Var4.S) {
                                                g0Var4.l(gVar);
                                            } else {
                                                g0Var4.q0();
                                            }
                                            l1.q.I(v1VarA, g0Var3, fVar);
                                            l1.q.I(m1VarM2, g0Var3, fVar2);
                                            com.google.android.gms.internal.measurement.x5.u(iHashCode2, g0Var3, fVar3, g0Var3, eVar);
                                            l1.q.I(rVarC4, g0Var3, fVar4);
                                            if (1.0f <= 0.0d) {
                                                i0.a.a("invalid weight; must be greater than zero");
                                            }
                                            c1 c1Var = new c1(1.0f, true);
                                            long jZ = kh.o.z(16);
                                            long jZ2 = kh.o.z(16);
                                            long j12 = dl.a.k;
                                            q3.u uVar = q3.u.C;
                                            z6.b(str, c1Var, j12, jZ, uVar, (q3.i) null, 0L, (l) null, (x3.k) null, jZ2, 0, false, 0, 0, (k) null, (r0) null, g0Var3, 1597440, 48, 260008);
                                            float f12 = 12;
                                            h0.c.h(z1.q(oVar, f12), g0Var3);
                                            k kVar6 = kVar5;
                                            boolean zG = g0Var4.g(kVar6);
                                            List list3 = list2;
                                            boolean zI = zG | g0Var4.i(list3);
                                            z0 z0Var3 = z0Var2;
                                            boolean zG2 = zI | g0Var4.g(z0Var3);
                                            boolean z37 = z31;
                                            boolean zH = zG2 | g0Var4.h(z37);
                                            u00.a aVar2 = aVar;
                                            boolean zG3 = zH | g0Var4.g(aVar2);
                                            Object objN5 = g0Var4.N();
                                            Object obj7 = i.a;
                                            if (zG3 || objN5 == obj7) {
                                                objN5 = new f(kVar6, list3, z37, aVar2, z0Var3);
                                                g0Var4.n0(objN5);
                                            }
                                            u00.a aVar3 = (u00.a) objN5;
                                            boolean zBooleanValue = ((Boolean) p2Var2.getValue()).booleanValue();
                                            boolean z38 = z32;
                                            if (!zBooleanValue && !z38) {
                                                z35 = true;
                                            }
                                            p1 p1Var = s.a;
                                            long j13 = dl.a.i;
                                            x5.a(aVar3, (r) null, z35, (t0) null, s.a(t.b(0.05f, j13), j13, t.b(0.05f, j13), dl.a.p, g0Var3, 0), (g1.u) null, (n1) null, (f0.i) null, v1.d.d(-1965659915, new e0(z38, str2, 2), g0Var3), g0Var3, 805306368, 490);
                                            g0Var4.r(true);
                                            v1 v1VarA2 = t1.a(h0.i.g(f12), hVar, g0Var3, 54);
                                            int iHashCode3 = Long.hashCode(g0Var4.T);
                                            m1 m1VarM3 = g0Var4.m();
                                            r rVarC5 = b2.a.c(oVar, g0Var3);
                                            g0Var4.g0();
                                            if (g0Var4.S) {
                                                g0Var4.l(gVar);
                                            } else {
                                                g0Var4.q0();
                                            }
                                            l1.q.I(v1VarA2, g0Var3, fVar);
                                            l1.q.I(m1VarM3, g0Var3, fVar2);
                                            com.google.android.gms.internal.measurement.x5.u(iHashCode3, g0Var3, fVar3, g0Var3, eVar);
                                            l1.q.I(rVarC5, g0Var3, fVar4);
                                            int iIntValue3 = ((Number) z0Var3.getValue()).intValue();
                                            boolean zG4 = g0Var4.g(z0Var3);
                                            Object objN6 = g0Var4.N();
                                            if (zG4 || objN6 == obj7) {
                                                objN6 = new o2(z0Var3, 1);
                                                g0Var4.n0(objN6);
                                            }
                                            f50.k.g(list3, iIntValue3, (k) objN6, z1.q(oVar, 80), a.a, f9, i26, f11, j9, j11, z33, z34, vVar2, false, null, false, false, g0Var3, 27648, 0, 122880);
                                            z6.b(str3, (r) null, j12, kh.o.z(16), uVar, (q3.i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (k) null, (r0) null, g0Var3, 1597440, 0, 262058);
                                            g0Var4.r(true);
                                            g0Var4.r(true);
                                        } else {
                                            g0Var4.V();
                                        }
                                        return b0.a;
                                    }
                                }, g0Var), g0Var, 196614, 8);
                            } else {
                                g0Var2.V();
                            }
                            return b0.a;
                        }
                    }, jVar2), jVar2, 384, 0);
                    jVar2.r(false);
                } else {
                    jVar2 = jVar3;
                    kVar4 = kVar2;
                    rVar4 = rVar3;
                    z22 = z7;
                    j7 = j5;
                    j8 = j6;
                    z23 = z16;
                    z24 = z17;
                    z25 = z6;
                    jVar2.c0(560052863);
                    jVar2.r(false);
                }
                i14 = i18;
                rVar2 = rVar4;
                i13 = i16;
                j4 = j7;
                z11 = z24;
                r0Var2 = r0Var3;
                long j9 = j8;
                kVar3 = kVar4;
                z12 = z25;
                f3 = f5;
                z9 = z23;
                z13 = z22;
                f4 = f6;
                j3 = j9;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar2 = rVar;
                i13 = i3;
                f3 = f2;
                j3 = j2;
                z9 = z2;
                z11 = z3;
                r0Var2 = r0Var;
                z12 = z6;
                kVar3 = kVar2;
                z13 = z7;
                i14 = i2;
                f4 = f;
                j4 = j;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iK = l1.q.K(i4 | 1);
                        int iK2 = l1.q.K(i5);
                        a.a(z, i, title, subtitle, buttonText, onDismiss, rVar2, i14, f4, i13, f3, j4, j3, z9, z11, r0Var2, kVar3, z12, z13, (j) obj2, iK, iK2, i6);
                        return b0.a;
                    }
                };
            }
        }
        i23 = 1600512 | i22;
        kVar2 = kVar;
        i8 = i6 & 131072;
        if (i8 != 0) {
            i23 |= 12582912;
            z6 = z4;
        } else {
            z6 = z4;
            if ((i5 & 12582912) == 0) {
                if (jVar3.h(z6)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i23 |= i9;
            }
        }
        i11 = i6 & 262144;
        if (i11 != 0) {
            i23 |= 100663296;
            z7 = z5;
        } else {
            z7 = z5;
            if ((i5 & 100663296) == 0) {
                if (jVar3.h(z7)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i23 |= i12;
            }
        }
        if ((i21 & 306783379) == 306783378) {
            z8 = true;
        } else {
            z8 = true;
        }
        if (jVar3.S(i21 & 1, z8)) {
            jVar3.X();
            if ((i4 & 1) != 0) {
                float f9 = 56;
                float f11 = 1;
                j5 = dl.a.J;
                j6 = dl.a.K;
                r0 r0Var5 = ((l8) jVar3.k(m8.a)).f;
                i15 = i23 & (-459761);
                if (i24 != 0) {
                    kVar2 = null;
                }
                if (i8 != 0) {
                    z6 = false;
                }
                rVar3 = o.A;
                i16 = 3;
                f5 = f11;
                r0Var3 = r0Var5;
                if (i11 != 0) {
                    z14 = true;
                    z15 = true;
                    z7 = true;
                } else {
                    z14 = true;
                    z15 = true;
                }
                i17 = 2;
                f6 = f9;
                i18 = 1;
            } else {
                float f12 = 56;
                float f13 = 1;
                j5 = dl.a.J;
                j6 = dl.a.K;
                r0 r0Var6 = ((l8) jVar3.k(m8.a)).f;
                i15 = i23 & (-459761);
                if (i24 != 0) {
                    kVar2 = null;
                }
                if (i8 != 0) {
                    z6 = false;
                }
                rVar3 = o.A;
                i16 = 3;
                f5 = f13;
                r0Var3 = r0Var6;
                if (i11 != 0) {
                    z14 = true;
                    z15 = true;
                    z7 = true;
                } else {
                    z14 = true;
                    z15 = true;
                }
                i17 = 2;
                f6 = f12;
                i18 = 1;
            }
            jVar3.s();
            z16 = z14;
            i19 = i21 & 29360128;
            z17 = z15;
            if (i19 == 8388608) {
                z18 = true;
            } else {
                z18 = false;
            }
            objN = jVar3.N();
            obj = i.a;
            if (z18) {
                z19 = true;
                objN = q.n1(a0.E0(i18, new z00.e(1, 180, 1)));
                jVar3.n0(objN);
            } else {
                z19 = true;
                objN = q.n1(a0.E0(i18, new z00.e(1, 180, 1)));
                jVar3.n0(objN);
            }
            list = (List) objN;
            if (i19 == 8388608) {
                z21 = z19;
            } else {
                z21 = false;
            }
            objN2 = jVar3.N();
            if (z21) {
                iIndexOf = list.indexOf(Integer.valueOf(i - (i % i18)));
                if (iIndexOf < 0) {
                    iIndexOf = 0;
                }
                objN2 = l1.q.z(Integer.valueOf(iIndexOf));
                jVar3.n0(objN2);
            } else {
                iIndexOf = list.indexOf(Integer.valueOf(i - (i % i18)));
                if (iIndexOf < 0) {
                    iIndexOf = 0;
                }
                objN2 = l1.q.z(Integer.valueOf(iIndexOf));
                jVar3.n0(objN2);
            }
            z0Var = (z0) objN2;
            vVarA = x.a(((Number) z0Var.getValue()).intValue() + (list.size() * 5000), jVar3, i17);
            objN3 = jVar3.N();
            if (objN3 == obj) {
                objN3 = l1.q.r(new b(vVarA, 0));
                jVar3.n0(objN3);
            }
            p2Var = (p2) objN3;
            if (z) {
                jVar3.c0(555144075);
                if ((i15 & 29360128) == 8388608) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if ((458752 & i21) == 131072) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z26 | z27;
                objN4 = jVar3.N();
                if (z28) {
                    objN4 = new g(z6, onDismiss, 1);
                    jVar3.n0(objN4);
                } else {
                    objN4 = new g(z6, onDismiss, 1);
                    jVar3.n0(objN4);
                }
                boolean z210 = !z6;
                c4.v vVar2 = new c4.v(z210, z210, false);
                rVar4 = rVar3;
                z25 = z6;
                j7 = j5;
                j8 = j6;
                z23 = z16;
                z24 = z17;
                jVar2 = jVar3;
                kVar4 = kVar2;
                z22 = z7;
                s0.G((u00.a) objN4, vVar2, v1.d.d(-74928591, new n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        g0 g0Var = (j) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        g0 g0Var2 = g0Var;
                        if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                            r rVarC = h0.c.C(z1.s(o.A, 0.0f, 500, 1), 16);
                            p0.e eVarA = p0.f.a(32);
                            u uVarA = z.n.a(1, t.b(0.8f, dl.a.J));
                            z zVarI = x5.i(dl.a.K, 0L, g0Var, 0, 14);
                            final r rVar5 = rVar4;
                            final String str = title;
                            final k kVar5 = kVar4;
                            final List list2 = list;
                            final z0 z0Var2 = z0Var;
                            final boolean z31 = z22;
                            final u00.a aVar = onDismiss;
                            final boolean z32 = z25;
                            final p2 p2Var2 = p2Var;
                            final String str2 = buttonText;
                            final float f14 = f6;
                            final int i26 = i16;
                            final float f15 = f5;
                            final long j11 = j7;
                            final long j12 = j8;
                            final boolean z33 = z23;
                            final boolean z34 = z24;
                            final v vVar3 = vVarA;
                            final String str3 = subtitle;
                            x5.b(rVarC, eVarA, zVarI, (g1.a0) null, uVarA, v1.d.d(-1353898241, new u00.o() {
                                @Override
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    w Card = (w) obj4;
                                    g0 g0Var3 = (j) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    m.e(Card, "$this$Card");
                                    boolean z35 = false;
                                    boolean z36 = (iIntValue2 & 17) != 16;
                                    g0 g0Var4 = g0Var3;
                                    a30.x xVar = g0Var4.a;
                                    if (g0Var4.S(iIntValue2 & 1, z36)) {
                                        r rVarD = z1.d(rVar5, 1.0f);
                                        h0.v vVarA2 = h0.u.a(h0.i.c, b2.b.N, g0Var3, 48);
                                        int iHashCode = Long.hashCode(g0Var4.T);
                                        m1 m1VarM = g0Var4.m();
                                        r rVarC2 = b2.a.c(rVarD, g0Var3);
                                        b3.i.c.getClass();
                                        b3.g gVar = h.b;
                                        g0Var4.g0();
                                        if (g0Var4.S) {
                                            g0Var4.l(gVar);
                                        } else {
                                            g0Var4.q0();
                                        }
                                        b3.f fVar = h.f;
                                        l1.q.I(vVarA2, g0Var3, fVar);
                                        b3.f fVar2 = h.e;
                                        l1.q.I(m1VarM, g0Var3, fVar2);
                                        Integer numValueOf = Integer.valueOf(iHashCode);
                                        b3.f fVar3 = h.g;
                                        l1.q.I(numValueOf, g0Var3, fVar3);
                                        b3.e eVar = h.h;
                                        l1.q.E(g0Var3, eVar);
                                        b3.f fVar4 = h.d;
                                        l1.q.I(rVarC2, g0Var3, fVar4);
                                        o oVar = o.A;
                                        r rVarC3 = h0.c.C(z1.d(oVar, 1.0f), 16);
                                        b2.h hVar = b2.b.K;
                                        v1 v1VarA = t1.a(h0.i.a, hVar, g0Var3, 48);
                                        int iHashCode2 = Long.hashCode(g0Var4.T);
                                        m1 m1VarM2 = g0Var4.m();
                                        r rVarC4 = b2.a.c(rVarC3, g0Var3);
                                        g0Var4.g0();
                                        if (g0Var4.S) {
                                            g0Var4.l(gVar);
                                        } else {
                                            g0Var4.q0();
                                        }
                                        l1.q.I(v1VarA, g0Var3, fVar);
                                        l1.q.I(m1VarM2, g0Var3, fVar2);
                                        com.google.android.gms.internal.measurement.x5.u(iHashCode2, g0Var3, fVar3, g0Var3, eVar);
                                        l1.q.I(rVarC4, g0Var3, fVar4);
                                        if (1.0f <= 0.0d) {
                                            i0.a.a("invalid weight; must be greater than zero");
                                        }
                                        c1 c1Var = new c1(1.0f, true);
                                        long jZ = kh.o.z(16);
                                        long jZ2 = kh.o.z(16);
                                        long j13 = dl.a.k;
                                        q3.u uVar = q3.u.C;
                                        z6.b(str, c1Var, j13, jZ, uVar, (q3.i) null, 0L, (l) null, (x3.k) null, jZ2, 0, false, 0, 0, (k) null, (r0) null, g0Var3, 1597440, 48, 260008);
                                        float f16 = 12;
                                        h0.c.h(z1.q(oVar, f16), g0Var3);
                                        k kVar6 = kVar5;
                                        boolean zG = g0Var4.g(kVar6);
                                        List list3 = list2;
                                        boolean zI = zG | g0Var4.i(list3);
                                        z0 z0Var3 = z0Var2;
                                        boolean zG2 = zI | g0Var4.g(z0Var3);
                                        boolean z37 = z31;
                                        boolean zH = zG2 | g0Var4.h(z37);
                                        u00.a aVar2 = aVar;
                                        boolean zG3 = zH | g0Var4.g(aVar2);
                                        Object objN5 = g0Var4.N();
                                        Object obj7 = i.a;
                                        if (zG3 || objN5 == obj7) {
                                            objN5 = new f(kVar6, list3, z37, aVar2, z0Var3);
                                            g0Var4.n0(objN5);
                                        }
                                        u00.a aVar3 = (u00.a) objN5;
                                        boolean zBooleanValue = ((Boolean) p2Var2.getValue()).booleanValue();
                                        boolean z38 = z32;
                                        if (!zBooleanValue && !z38) {
                                            z35 = true;
                                        }
                                        p1 p1Var = s.a;
                                        long j14 = dl.a.i;
                                        x5.a(aVar3, (r) null, z35, (t0) null, s.a(t.b(0.05f, j14), j14, t.b(0.05f, j14), dl.a.p, g0Var3, 0), (g1.u) null, (n1) null, (f0.i) null, v1.d.d(-1965659915, new e0(z38, str2, 2), g0Var3), g0Var3, 805306368, 490);
                                        g0Var4.r(true);
                                        v1 v1VarA2 = t1.a(h0.i.g(f16), hVar, g0Var3, 54);
                                        int iHashCode3 = Long.hashCode(g0Var4.T);
                                        m1 m1VarM3 = g0Var4.m();
                                        r rVarC5 = b2.a.c(oVar, g0Var3);
                                        g0Var4.g0();
                                        if (g0Var4.S) {
                                            g0Var4.l(gVar);
                                        } else {
                                            g0Var4.q0();
                                        }
                                        l1.q.I(v1VarA2, g0Var3, fVar);
                                        l1.q.I(m1VarM3, g0Var3, fVar2);
                                        com.google.android.gms.internal.measurement.x5.u(iHashCode3, g0Var3, fVar3, g0Var3, eVar);
                                        l1.q.I(rVarC5, g0Var3, fVar4);
                                        int iIntValue3 = ((Number) z0Var3.getValue()).intValue();
                                        boolean zG4 = g0Var4.g(z0Var3);
                                        Object objN6 = g0Var4.N();
                                        if (zG4 || objN6 == obj7) {
                                            objN6 = new o2(z0Var3, 1);
                                            g0Var4.n0(objN6);
                                        }
                                        f50.k.g(list3, iIntValue3, (k) objN6, z1.q(oVar, 80), a.a, f14, i26, f15, j11, j12, z33, z34, vVar3, false, null, false, false, g0Var3, 27648, 0, 122880);
                                        z6.b(str3, (r) null, j13, kh.o.z(16), uVar, (q3.i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (k) null, (r0) null, g0Var3, 1597440, 0, 262058);
                                        g0Var4.r(true);
                                        g0Var4.r(true);
                                    } else {
                                        g0Var4.V();
                                    }
                                    return b0.a;
                                }
                            }, g0Var), g0Var, 196614, 8);
                        } else {
                            g0Var2.V();
                        }
                        return b0.a;
                    }
                }, jVar2), jVar2, 384, 0);
                jVar2.r(false);
            } else {
                jVar2 = jVar3;
                kVar4 = kVar2;
                rVar4 = rVar3;
                z22 = z7;
                j7 = j5;
                j8 = j6;
                z23 = z16;
                z24 = z17;
                z25 = z6;
                jVar2.c0(560052863);
                jVar2.r(false);
            }
            i14 = i18;
            rVar2 = rVar4;
            i13 = i16;
            j4 = j7;
            z11 = z24;
            r0Var2 = r0Var3;
            long j11 = j8;
            kVar3 = kVar4;
            z12 = z25;
            f3 = f5;
            z9 = z23;
            z13 = z22;
            f4 = f6;
            j3 = j11;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
            i13 = i3;
            f3 = f2;
            j3 = j2;
            z9 = z2;
            z11 = z3;
            r0Var2 = r0Var;
            z12 = z6;
            kVar3 = kVar2;
            z13 = z7;
            i14 = i2;
            f4 = f;
            j4 = j;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iK = l1.q.K(i4 | 1);
                    int iK2 = l1.q.K(i5);
                    a.a(z, i, title, subtitle, buttonText, onDismiss, rVar2, i14, f4, i13, f3, j4, j3, z9, z11, r0Var2, kVar3, z12, z13, (j) obj2, iK, iK2, i6);
                    return b0.a;
                }
            };
        }
    }
}
