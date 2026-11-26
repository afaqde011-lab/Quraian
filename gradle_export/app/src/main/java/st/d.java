package st;

import ab.a0;
import b2.o;
import b2.r;
import c3.o1;
import g1.z6;
import h0.u;
import h0.v;
import h0.z1;
import i2.b0;
import i2.s0;
import i2.t;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import m3.r0;
import m3.z;
import mu.w;
import u00.k;
import x.b1;
import x3.l;
import z.n;

public abstract class d {
    public static final float a = 12;

    public static final void a(final String label, final String str, final boolean z, final String str2, final boolean z2, ot.b visibility, final boolean z3, final boolean z4, final u00.a onClick, r rVar, final int i, boolean z5, boolean z6, l1.j jVar, final int i2, final int i3, final int i4) {
        r rVar2;
        int i5;
        boolean z7;
        int i6;
        ot.b bVar;
        g0 g0Var;
        final boolean z8;
        final boolean z9;
        float f;
        char c;
        float f2;
        p2 p2VarB;
        float f3;
        p2 p2VarB2;
        float f4;
        p2 p2VarB3;
        float f5;
        p2 p2VarB4;
        float f6;
        p2 p2VarB5;
        boolean zD;
        Object objN;
        float fFloatValue;
        float f7;
        long jH;
        boolean zG;
        Object objN2;
        boolean z11;
        b2.g gVar;
        b3.g gVar2;
        int i7;
        ?? r9;
        int i8;
        boolean z12;
        ?? r13;
        boolean z13;
        r0 r0VarA;
        m.e(label, "label");
        m.e(visibility, "visibility");
        m.e(onClick, "onClick");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1177572261);
        int i9 = i2 | (g0Var2.g(label) ? 4 : 2) | (g0Var2.g(str) ? 32 : 16) | (g0Var2.h(z) ? 256 : 128) | (g0Var2.g(str2) ? 2048 : 1024) | (g0Var2.h(z2) ? 16384 : 8192) | (g0Var2.g(visibility) ? 131072 : 65536);
        if ((i2 & 1572864) == 0) {
            i9 |= g0Var2.h(z3) ? 1048576 : 524288;
        }
        int i11 = i9 | (g0Var2.h(z4) ? 8388608 : 4194304) | (g0Var2.i(onClick) ? 67108864 : 33554432);
        int i12 = i4 & 512;
        if (i12 != 0) {
            i5 = i11 | 805306368;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i5 = i11 | (g0Var2.g(rVar2) ? 536870912 : 268435456);
        }
        int i13 = i5;
        int i14 = i3 | (g0Var2.e(i) ? 4 : 2);
        int i15 = i4 & 2048;
        if (i15 != 0) {
            i14 |= 48;
            z7 = z5;
        } else {
            z7 = z5;
            if ((i3 & 48) == 0) {
                i14 |= g0Var2.h(z7) ? 32 : 16;
            }
        }
        int i16 = i4 & 4096;
        if (i16 != 0) {
            i6 = i14 | 384;
        } else {
            i6 = i14 | (g0Var2.h(z6) ? 256 : 128);
        }
        if (g0Var2.S(i13 & 1, ((i13 & 306783379) == 306783378 && (i6 & 147) == 146) ? false : true)) {
            r rVar3 = o.A;
            r rVar4 = i12 != 0 ? rVar3 : rVar2;
            boolean z14 = i15 != 0 ? false : z7;
            boolean z15 = i16 != 0 ? false : z6;
            boolean z16 = z3 || z14;
            if (z4) {
                f = 0.35f;
            } else {
                if (z16) {
                    f = 1.0f;
                    c = 0;
                } else {
                    f = 0.5f;
                }
                p2 p2VarB6 = x.d.b(f, c(), (String) null, g0Var2, 0, 28);
                if (z3) {
                    f2 = 0.15f;
                } else {
                    f2 = 0.05f;
                }
                p2VarB = x.d.b(f2, c(), (String) null, g0Var2, 0, 28);
                if (z3) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.5f;
                }
                p2VarB2 = x.d.b(f3, c(), (String) null, g0Var2, 0, 28);
                if (z16) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.98f;
                }
                p2VarB3 = x.d.b(f4, c(), (String) null, g0Var2, 0, 28);
                if (z16 || z4) {
                    f5 = 0.0f;
                } else {
                    f5 = 1.0f;
                }
                p2VarB4 = x.d.b(f5, c(), (String) null, g0Var2, 0, 28);
                if (z15) {
                    f6 = 0.4f;
                } else {
                    f6 = 1.0f;
                }
                p2VarB5 = x.d.b(f6, c(), (String) null, g0Var2, 0, 28);
                zD = g0Var2.d(((Number) p2VarB4.getValue()).floatValue());
                objN = g0Var2.N();
                l1.c cVar = l1.i.a;
                if (zD || objN == cVar) {
                    fFloatValue = ((Number) p2VarB4.getValue()).floatValue();
                    if (fFloatValue <= 0.0f) {
                        objN = null;
                    } else {
                        s0 s0Var = dl.c.a;
                        long j = s0Var.a;
                        objN = s0.a(s0Var, t.b(t.d(j) * fFloatValue, j), s0Var.c * fFloatValue, 2);
                    }
                    g0Var2.n0(objN);
                }
                s0 s0Var2 = (s0) objN;
                if (z14) {
                    f7 = 0.5f;
                } else if (z) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                jH = b0.h(f7, 0.5f);
                r rVarD = z1.d(rVar4, 1.0f);
                zG = g0Var2.g(p2VarB3) | g0Var2.f(jH) | g0Var2.g(p2VarB5);
                r rVar5 = rVar4;
                objN2 = g0Var2.N();
                if (zG || objN2 == cVar) {
                    objN2 = new w(jH, p2VarB3, p2VarB5, 1);
                    g0Var2.n0(objN2);
                }
                r rVarP = b0.p(rVarD, (k) objN2);
                if (!z4 || z15) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                r rVarO = w50.c.o(rVarP, z11, null, onClick, 6);
                if (z14) {
                    gVar = b2.b.N;
                } else if (z) {
                    gVar = b2.a.c;
                } else {
                    gVar = b2.b.O;
                }
                h0.b bVar2 = h0.i.a;
                v vVarA = u.a(h0.i.g(a), gVar, g0Var2, 6);
                int iHashCode = Long.hashCode(g0Var2.T);
                m1 m1VarM = g0Var2.m();
                r rVarC = b2.a.c(rVarO, g0Var2);
                b3.i.c.getClass();
                gVar2 = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar2);
                } else {
                    g0Var2.q0();
                }
                q.I(vVarA, g0Var2, b3.h.f);
                q.I(m1VarM, g0Var2, b3.h.e);
                q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
                q.E(g0Var2, b3.h.h);
                q.I(rVarC, g0Var2, b3.h.d);
                if (z14) {
                    i7 = i6;
                    r9 = 0;
                    g0Var2.c0(-2142626605);
                    g0Var2.r(false);
                } else {
                    g0Var2.c0(-2143073780);
                    r0 r0Var = dl.c.b;
                    long j2 = dl.a.k;
                    i7 = i6;
                    z6.b(label, h0.c.D(n.f(rVar3, t.b(((Number) p2VarB.getValue()).floatValue(), j2), p0.f.a(16)), 8, 4), t.b(((Number) p2VarB2.getValue()).floatValue(), j2), 0L, (q3.u) null, (q3.i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (k) null, r0Var, g0Var2, i13 & 14, 0, 131064);
                    g0Var2 = g0Var2;
                    r9 = 0;
                    g0Var2.r(false);
                }
                bVar = visibility;
                if (bVar.a || str.length() <= 0) {
                    i8 = i;
                    g0Var = g0Var2;
                    z12 = z14;
                    r13 = 1;
                    g0Var.c0(-2141708013);
                    g0Var.r((boolean) r9);
                } else {
                    g0Var2.c0(-2142531590);
                    if (z) {
                        r0 r0Var2 = dl.c.d;
                        List list = ot.c.c;
                        int i17 = ot.c.d;
                        i8 = i;
                        z13 = true;
                        r0VarA = r0.a(r0Var2, 0L, kh.o.F(((Number) list.get(a0.y(i8, (int) r9, i17 - 1))).floatValue(), 4294967296L), (q3.u) null, (q3.i) null, 0L, (s0) null, 0, kh.o.F(((Number) list.get(a0.y(i8, (int) r9, i17 - 1))).floatValue() * 1.38f, 4294967296L), (z) null, (x3.i) null, 16646141);
                    } else {
                        i8 = i;
                        z13 = true;
                        r0 r0Var3 = dl.c.c;
                        List list2 = ot.c.a;
                        int i18 = ot.c.d;
                        r0VarA = r0.a(r0Var3, 0L, kh.o.F(((Number) list2.get(a0.y(i8, (int) r9, i18 - 1))).floatValue(), 4294967296L), (q3.u) null, (q3.i) null, 0L, (s0) null, 0, kh.o.F(((Number) list2.get(a0.y(i8, (int) r9, i18 - 1))).floatValue() * 1.86f, 4294967296L), (z) null, (x3.i) null, 16646141);
                    }
                    g0Var = g0Var2;
                    r13 = z13;
                    z12 = z14;
                    b(str, r0.a(r0VarA, 0L, 0L, (q3.u) null, (q3.i) null, 0L, s0Var2, 0, 0L, (z) null, (x3.i) null, 16769023), t.b(((Number) p2VarB6.getValue()).floatValue(), dl.a.k), !z, null, z12, g0Var, ((i13 >> 3) & 14) | ((i7 << 12) & 458752));
                    g0Var.r((boolean) r9);
                }
                if (bVar.b || str2.length() <= 0) {
                    g0Var.c0(-2140986829);
                    g0Var.r((boolean) r9);
                } else {
                    g0Var.c0(-2141615323);
                    r0 r0Var4 = z2 ? dl.c.f : dl.c.e;
                    List list3 = ot.c.b;
                    int i19 = ot.c.d;
                    b(str2, r0.a(r0Var4, 0L, kh.o.F(((Number) list3.get(a0.y(i8, (int) r9, i19 - 1))).floatValue(), 4294967296L), (q3.u) null, (q3.i) null, 0L, s0Var2, 0, kh.o.F(((Number) list3.get(a0.y(i8, (int) r9, i19 - r13))).floatValue() * 1.18f, 4294967296L), (z) null, (x3.i) null, 16637949), t.b(((Number) p2VarB6.getValue()).floatValue(), dl.a.k), z2, null, z12, g0Var, ((i13 >> 9) & 14) | ((i13 >> 3) & 7168) | ((i7 << 12) & 458752));
                    g0Var.r((boolean) r9);
                }
                g0Var.r((boolean) r13);
                z9 = z12;
                z8 = z15;
                rVar2 = rVar5;
            }
            c = 0;
            p2 p2VarB7 = x.d.b(f, c(), (String) null, g0Var2, 0, 28);
            if (z3) {
                f2 = 0.15f;
            } else {
                f2 = 0.05f;
            }
            p2VarB = x.d.b(f2, c(), (String) null, g0Var2, 0, 28);
            if (z3) {
                f3 = 1.0f;
            } else {
                f3 = 0.5f;
            }
            p2VarB2 = x.d.b(f3, c(), (String) null, g0Var2, 0, 28);
            if (z16) {
                f4 = 1.0f;
            } else {
                f4 = 0.98f;
            }
            p2VarB3 = x.d.b(f4, c(), (String) null, g0Var2, 0, 28);
            if (z16) {
                f5 = 0.0f;
            } else {
                f5 = 0.0f;
            }
            p2VarB4 = x.d.b(f5, c(), (String) null, g0Var2, 0, 28);
            if (z15) {
                f6 = 0.4f;
            } else {
                f6 = 1.0f;
            }
            p2VarB5 = x.d.b(f6, c(), (String) null, g0Var2, 0, 28);
            zD = g0Var2.d(((Number) p2VarB4.getValue()).floatValue());
            objN = g0Var2.N();
            l1.c cVar2 = l1.i.a;
            if (zD) {
                fFloatValue = ((Number) p2VarB4.getValue()).floatValue();
                if (fFloatValue <= 0.0f) {
                    objN = null;
                } else {
                    s0 s0Var3 = dl.c.a;
                    long j3 = s0Var3.a;
                    objN = s0.a(s0Var3, t.b(t.d(j3) * fFloatValue, j3), s0Var3.c * fFloatValue, 2);
                }
                g0Var2.n0(objN);
            } else {
                fFloatValue = ((Number) p2VarB4.getValue()).floatValue();
                if (fFloatValue <= 0.0f) {
                    objN = null;
                } else {
                    s0 s0Var4 = dl.c.a;
                    long j4 = s0Var4.a;
                    objN = s0.a(s0Var4, t.b(t.d(j4) * fFloatValue, j4), s0Var4.c * fFloatValue, 2);
                }
                g0Var2.n0(objN);
            }
            s0 s0Var5 = (s0) objN;
            if (z14) {
                f7 = 0.5f;
            } else if (z) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            jH = b0.h(f7, 0.5f);
            r rVarD2 = z1.d(rVar4, 1.0f);
            zG = g0Var2.g(p2VarB3) | g0Var2.f(jH) | g0Var2.g(p2VarB5);
            r rVar6 = rVar4;
            objN2 = g0Var2.N();
            if (zG) {
                objN2 = new w(jH, p2VarB3, p2VarB5, 1);
                g0Var2.n0(objN2);
            } else {
                objN2 = new w(jH, p2VarB3, p2VarB5, 1);
                g0Var2.n0(objN2);
            }
            r rVarP2 = b0.p(rVarD2, (k) objN2);
            if (z4) {
                z11 = false;
            } else {
                z11 = false;
            }
            r rVarO2 = w50.c.o(rVarP2, z11, null, onClick, 6);
            if (z14) {
                gVar = b2.b.N;
            } else if (z) {
                gVar = b2.a.c;
            } else {
                gVar = b2.b.O;
            }
            h0.b bVar3 = h0.i.a;
            v vVarA2 = u.a(h0.i.g(a), gVar, g0Var2, 6);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            r rVarC2 = b2.a.c(rVarO2, g0Var2);
            b3.i.c.getClass();
            gVar2 = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar2);
            } else {
                g0Var2.q0();
            }
            q.I(vVarA2, g0Var2, b3.h.f);
            q.I(m1VarM2, g0Var2, b3.h.e);
            q.I(Integer.valueOf(iHashCode2), g0Var2, b3.h.g);
            q.E(g0Var2, b3.h.h);
            q.I(rVarC2, g0Var2, b3.h.d);
            if (z14) {
                g0Var2.c0(-2143073780);
                r0 r0Var5 = dl.c.b;
                long j5 = dl.a.k;
                i7 = i6;
                z6.b(label, h0.c.D(n.f(rVar3, t.b(((Number) p2VarB.getValue()).floatValue(), j5), p0.f.a(16)), 8, 4), t.b(((Number) p2VarB2.getValue()).floatValue(), j5), 0L, (q3.u) null, (q3.i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (k) null, r0Var5, g0Var2, i13 & 14, 0, 131064);
                g0Var2 = g0Var2;
                r9 = 0;
                g0Var2.r(false);
            } else {
                i7 = i6;
                r9 = 0;
                g0Var2.c0(-2142626605);
                g0Var2.r(false);
            }
            bVar = visibility;
            if (bVar.a) {
                i8 = i;
                g0Var = g0Var2;
                z12 = z14;
                r13 = 1;
                g0Var.c0(-2141708013);
                g0Var.r((boolean) r9);
            } else {
                i8 = i;
                g0Var = g0Var2;
                z12 = z14;
                r13 = 1;
                g0Var.c0(-2141708013);
                g0Var.r((boolean) r9);
            }
            if (bVar.b) {
                g0Var.c0(-2140986829);
                g0Var.r((boolean) r9);
            } else {
                g0Var.c0(-2140986829);
                g0Var.r((boolean) r9);
            }
            g0Var.r((boolean) r13);
            z9 = z12;
            z8 = z15;
            rVar2 = rVar6;
        } else {
            bVar = visibility;
            g0Var = g0Var2;
            g0Var.V();
            z8 = z6;
            z9 = z7;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final ot.b bVar4 = bVar;
            final r rVar7 = rVar2;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(i2 | 1);
                    int iK2 = q.K(i3);
                    d.a(label, str, z, str2, z2, bVar4, z3, z4, onClick, rVar7, i, z9, z8, (l1.j) obj, iK, iK2, i4);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(final String str, final r0 r0Var, final long j, final boolean z, r rVar, final boolean z2, l1.j jVar, final int i) {
        int i2;
        final r rVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1052904699);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.g(r0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.h(z) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= g0Var.h(z2) ? 131072 : 65536;
        }
        if (g0Var.S(i3 & 1, (74899 & i3) != 74898)) {
            q.a(o1.n.a(z ? y3.m.B : y3.m.A), v1.d.d(1172887109, new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    g0 g0Var2 = (l1.j) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    g0 g0Var3 = g0Var2;
                    if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z6.b(str, z1.d(o.A, 1.0f), j, 0L, (q3.u) null, (q3.i) null, 0L, (l) null, new x3.k(z2 ? 3 : 5), 0L, 0, false, 0, 0, (k) null, r0.a(r0Var, 0L, 0L, (q3.u) null, (q3.i) null, 0L, (s0) null, z ? 2 : 1, 0L, (z) null, (x3.i) null, 16711679), g0Var2, 0, 0, 130040);
                    } else {
                        g0Var3.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 56);
            rVar2 = o.A;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d.b(str, r0Var, j, z, rVar2, z2, (l1.j) obj, q.K(i | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final b1 c() {
        return x.c.v(0.86f, 158.0f, (Object) null, 4);
    }
}
