package up;

import b2.o;
import b2.r;
import g00.b0;
import g1.f0;
import g1.j0;
import g1.r3;
import g1.z6;
import h0.c1;
import h0.j2;
import h0.t1;
import h0.v1;
import h0.z1;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import m3.r0;
import q3.u;
import u00.k;
import u00.n;
import x3.l;

public abstract class c {
    public static final float a;
    public static final float b;

    static {
        float f = 16;
        a = f;
        b = f / 20.0f;
    }

    public static final void a(final String title, final boolean z, final k onCheckedChange, r rVar, long j, long j2, float f, boolean z2, j jVar, final int i, final int i2) {
        int i3;
        r rVar2;
        int i4;
        long j3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        boolean z3;
        final long j4;
        final boolean z4;
        final r rVar3;
        final long j5;
        final float f2;
        r1 r1VarT;
        r rVar4;
        long jZ;
        long jZ2;
        final float f3;
        final boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objN;
        b3.g gVar;
        r rVar5;
        float f4;
        long j6;
        b2.h hVar = b2.b.K;
        m.e(title, "title");
        m.e(onCheckedChange, "onCheckedChange");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-419399635);
        if ((i & 6) == 0) {
            i3 = (g0Var.g(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= g0Var.i(onCheckedChange) ? 256 : 128;
        }
        int i13 = i2 & 8;
        if (i13 == 0) {
            if ((i & 3072) == 0) {
                rVar2 = rVar;
                i3 |= g0Var.g(rVar2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                i3 |= 24576;
                j3 = j;
            } else {
                j3 = j;
                if ((i & 24576) == 0) {
                    if (g0Var.f(j3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (g0Var.f(j2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i3 | 1572864;
            i9 = i2 & 128;
            if (i9 != 0) {
                if ((12582912 & i) == 0) {
                    if (g0Var.h(z2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i8 |= i11;
                }
                i12 = i8;
                if ((i12 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (g0Var.S(i12 & 1, z3)) {
                    if (i13 != 0) {
                        rVar4 = o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i4 != 0) {
                        jZ = kh.o.z(10);
                    } else {
                        jZ = j3;
                    }
                    if (i6 != 0) {
                        jZ2 = kh.o.z(14);
                    } else {
                        jZ2 = j2;
                    }
                    f3 = 6;
                    if (i9 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    r rVarD = z1.d(rVar4, 1.0f);
                    j3.k kVar = new j3.k(1);
                    if ((i12 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if ((i12 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    z8 = z7 | z6;
                    objN = g0Var.N();
                    if (z8 || objN == l1.i.a) {
                        objN = new g1.g0(1, onCheckedChange, z);
                        g0Var.n0(objN);
                    }
                    r rVarO = w50.c.o(rVarD, false, kVar, (u00.a) objN, 3);
                    if (!z5) {
                        hVar = b2.b.J;
                    }
                    v1 v1VarA = t1.a(h0.i.g(8), hVar, g0Var, 6);
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    r rVarC = b2.a.c(rVarO, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    q.I(v1VarA, g0Var, b3.h.f);
                    q.I(m1VarM, g0Var, b3.h.e);
                    q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    q.E(g0Var, b3.h.h);
                    q.I(rVarC, g0Var, b3.h.d);
                    q.a(r3.c.a(new y3.f(Float.NaN)), v1.d.d(1490255497, new n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            g0 g0Var2 = (j) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            g0 g0Var3 = g0Var2;
                            if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                                r rVarV = z1.v(z1.m(o.A, c.a), 1);
                                float f5 = c.b;
                                r rVarG = h0.c.G(f2.h.i(rVarV, f5, f5), 0.0f, z5 ? 0 : f3, 0.0f, 0.0f, 13);
                                float f6 = f0.a;
                                j0.a(z, (k) null, rVarG, false, f0.a(dl.a.i, dl.a.o, dl.a.L, g0Var2), g0Var2, 48, 40);
                            } else {
                                g0Var3.V();
                            }
                            return b0.a;
                        }
                    }, g0Var), g0Var, 56);
                    if (z5) {
                        g0Var.c0(-2018153088);
                        r rVar6 = rVar4;
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        int i14 = i12 >> 3;
                        j6 = jZ2;
                        rVar5 = rVar6;
                        f4 = f3;
                        k00.f.a(title, new c1(1.0f, true).V(new j2()), dl.a.n, jZ, new y3.o(jZ2), u.B, null, 1, 0.0f, null, g0Var, (i14 & 57344) | (i14 & 7168) | (i12 & 14) | 12779520, 832);
                        g0Var.r(false);
                    } else {
                        rVar5 = rVar4;
                        long j7 = jZ2;
                        f4 = f3;
                        g0Var.c0(-2017750522);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        z6.b(title, new c1(1.0f, true).V(new j2()), dl.a.n, jZ, u.B, (q3.i) null, 0L, (l) null, (x3.k) null, j7, 0, false, 0, 0, (k) null, (r0) null, g0Var, (i12 & 14) | 1572864 | (i12 & 57344), (i12 >> 12) & 112, 260008);
                        j6 = j7;
                        g0Var = g0Var;
                        g0Var.r(false);
                    }
                    g0Var.r(true);
                    j5 = jZ;
                    j4 = j6;
                    rVar3 = rVar5;
                    f2 = f4;
                    z4 = z5;
                } else {
                    g0Var.V();
                    j4 = j2;
                    z4 = z2;
                    rVar3 = rVar2;
                    j5 = j3;
                    f2 = f;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            c.a(title, z, onCheckedChange, rVar3, j5, j4, f2, z4, (j) obj, q.K(i | 1), i2);
                            return b0.a;
                        }
                    };
                }
            }
            i8 = i3 | 14155776;
            i12 = i8;
            if ((i12 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i12 & 1, z3)) {
                if (i13 != 0) {
                    rVar4 = o.A;
                } else {
                    rVar4 = rVar2;
                }
                if (i4 != 0) {
                    jZ = kh.o.z(10);
                } else {
                    jZ = j3;
                }
                if (i6 != 0) {
                    jZ2 = kh.o.z(14);
                } else {
                    jZ2 = j2;
                }
                f3 = 6;
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                r rVarD2 = z1.d(rVar4, 1.0f);
                j3.k kVar2 = new j3.k(1);
                if ((i12 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i12 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7 | z6;
                objN = g0Var.N();
                if (z8) {
                    objN = new g1.g0(1, onCheckedChange, z);
                    g0Var.n0(objN);
                } else {
                    objN = new g1.g0(1, onCheckedChange, z);
                    g0Var.n0(objN);
                }
                r rVarO2 = w50.c.o(rVarD2, false, kVar2, (u00.a) objN, 3);
                if (!z5) {
                    hVar = b2.b.J;
                }
                v1 v1VarA2 = t1.a(h0.i.g(8), hVar, g0Var, 6);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC2 = b2.a.c(rVarO2, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA2, g0Var, b3.h.f);
                q.I(m1VarM2, g0Var, b3.h.e);
                q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
                q.E(g0Var, b3.h.h);
                q.I(rVarC2, g0Var, b3.h.d);
                q.a(r3.c.a(new y3.f(Float.NaN)), v1.d.d(1490255497, new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        g0 g0Var2 = (j) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        g0 g0Var3 = g0Var2;
                        if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                            r rVarV = z1.v(z1.m(o.A, c.a), 1);
                            float f5 = c.b;
                            r rVarG = h0.c.G(f2.h.i(rVarV, f5, f5), 0.0f, z5 ? 0 : f3, 0.0f, 0.0f, 13);
                            float f6 = f0.a;
                            j0.a(z, (k) null, rVarG, false, f0.a(dl.a.i, dl.a.o, dl.a.L, g0Var2), g0Var2, 48, 40);
                        } else {
                            g0Var3.V();
                        }
                        return b0.a;
                    }
                }, g0Var), g0Var, 56);
                if (z5) {
                    g0Var.c0(-2018153088);
                    r rVar7 = rVar4;
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    int i15 = i12 >> 3;
                    j6 = jZ2;
                    rVar5 = rVar7;
                    f4 = f3;
                    k00.f.a(title, new c1(1.0f, true).V(new j2()), dl.a.n, jZ, new y3.o(jZ2), u.B, null, 1, 0.0f, null, g0Var, (i15 & 57344) | (i15 & 7168) | (i12 & 14) | 12779520, 832);
                    g0Var.r(false);
                } else {
                    rVar5 = rVar4;
                    long j8 = jZ2;
                    f4 = f3;
                    g0Var.c0(-2017750522);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    z6.b(title, new c1(1.0f, true).V(new j2()), dl.a.n, jZ, u.B, (q3.i) null, 0L, (l) null, (x3.k) null, j8, 0, false, 0, 0, (k) null, (r0) null, g0Var, (i12 & 14) | 1572864 | (i12 & 57344), (i12 >> 12) & 112, 260008);
                    j6 = j8;
                    g0Var = g0Var;
                    g0Var.r(false);
                }
                g0Var.r(true);
                j5 = jZ;
                j4 = j6;
                rVar3 = rVar5;
                f2 = f4;
                z4 = z5;
            } else {
                g0Var.V();
                j4 = j2;
                z4 = z2;
                rVar3 = rVar2;
                j5 = j3;
                f2 = f;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c.a(title, z, onCheckedChange, rVar3, j5, j4, f2, z4, (j) obj, q.K(i | 1), i2);
                        return b0.a;
                    }
                };
            }
        }
        i3 |= 3072;
        rVar2 = rVar;
        i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 24576) == 0) {
                if (g0Var.f(j3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (g0Var.f(j2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        i8 = i3 | 1572864;
        i9 = i2 & 128;
        if (i9 != 0) {
            if ((12582912 & i) == 0) {
                if (g0Var.h(z2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i8 |= i11;
            }
            i12 = i8;
            if ((i12 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i12 & 1, z3)) {
                if (i13 != 0) {
                    rVar4 = o.A;
                } else {
                    rVar4 = rVar2;
                }
                if (i4 != 0) {
                    jZ = kh.o.z(10);
                } else {
                    jZ = j3;
                }
                if (i6 != 0) {
                    jZ2 = kh.o.z(14);
                } else {
                    jZ2 = j2;
                }
                f3 = 6;
                if (i9 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                r rVarD3 = z1.d(rVar4, 1.0f);
                j3.k kVar3 = new j3.k(1);
                if ((i12 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((i12 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7 | z6;
                objN = g0Var.N();
                if (z8) {
                    objN = new g1.g0(1, onCheckedChange, z);
                    g0Var.n0(objN);
                } else {
                    objN = new g1.g0(1, onCheckedChange, z);
                    g0Var.n0(objN);
                }
                r rVarO3 = w50.c.o(rVarD3, false, kVar3, (u00.a) objN, 3);
                if (!z5) {
                    hVar = b2.b.J;
                }
                v1 v1VarA3 = t1.a(h0.i.g(8), hVar, g0Var, 6);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                r rVarC3 = b2.a.c(rVarO3, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA3, g0Var, b3.h.f);
                q.I(m1VarM3, g0Var, b3.h.e);
                q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.g);
                q.E(g0Var, b3.h.h);
                q.I(rVarC3, g0Var, b3.h.d);
                q.a(r3.c.a(new y3.f(Float.NaN)), v1.d.d(1490255497, new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        g0 g0Var2 = (j) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        g0 g0Var3 = g0Var2;
                        if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                            r rVarV = z1.v(z1.m(o.A, c.a), 1);
                            float f5 = c.b;
                            r rVarG = h0.c.G(f2.h.i(rVarV, f5, f5), 0.0f, z5 ? 0 : f3, 0.0f, 0.0f, 13);
                            float f6 = f0.a;
                            j0.a(z, (k) null, rVarG, false, f0.a(dl.a.i, dl.a.o, dl.a.L, g0Var2), g0Var2, 48, 40);
                        } else {
                            g0Var3.V();
                        }
                        return b0.a;
                    }
                }, g0Var), g0Var, 56);
                if (z5) {
                    g0Var.c0(-2018153088);
                    r rVar8 = rVar4;
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    int i16 = i12 >> 3;
                    j6 = jZ2;
                    rVar5 = rVar8;
                    f4 = f3;
                    k00.f.a(title, new c1(1.0f, true).V(new j2()), dl.a.n, jZ, new y3.o(jZ2), u.B, null, 1, 0.0f, null, g0Var, (i16 & 57344) | (i16 & 7168) | (i12 & 14) | 12779520, 832);
                    g0Var.r(false);
                } else {
                    rVar5 = rVar4;
                    long j9 = jZ2;
                    f4 = f3;
                    g0Var.c0(-2017750522);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    z6.b(title, new c1(1.0f, true).V(new j2()), dl.a.n, jZ, u.B, (q3.i) null, 0L, (l) null, (x3.k) null, j9, 0, false, 0, 0, (k) null, (r0) null, g0Var, (i12 & 14) | 1572864 | (i12 & 57344), (i12 >> 12) & 112, 260008);
                    j6 = j9;
                    g0Var = g0Var;
                    g0Var.r(false);
                }
                g0Var.r(true);
                j5 = jZ;
                j4 = j6;
                rVar3 = rVar5;
                f2 = f4;
                z4 = z5;
            } else {
                g0Var.V();
                j4 = j2;
                z4 = z2;
                rVar3 = rVar2;
                j5 = j3;
                f2 = f;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        c.a(title, z, onCheckedChange, rVar3, j5, j4, f2, z4, (j) obj, q.K(i | 1), i2);
                        return b0.a;
                    }
                };
            }
        }
        i8 = i3 | 14155776;
        i12 = i8;
        if ((i12 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var.S(i12 & 1, z3)) {
            if (i13 != 0) {
                rVar4 = o.A;
            } else {
                rVar4 = rVar2;
            }
            if (i4 != 0) {
                jZ = kh.o.z(10);
            } else {
                jZ = j3;
            }
            if (i6 != 0) {
                jZ2 = kh.o.z(14);
            } else {
                jZ2 = j2;
            }
            f3 = 6;
            if (i9 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            r rVarD4 = z1.d(rVar4, 1.0f);
            j3.k kVar4 = new j3.k(1);
            if ((i12 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i12 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z7 | z6;
            objN = g0Var.N();
            if (z8) {
                objN = new g1.g0(1, onCheckedChange, z);
                g0Var.n0(objN);
            } else {
                objN = new g1.g0(1, onCheckedChange, z);
                g0Var.n0(objN);
            }
            r rVarO4 = w50.c.o(rVarD4, false, kVar4, (u00.a) objN, 3);
            if (!z5) {
                hVar = b2.b.J;
            }
            v1 v1VarA4 = t1.a(h0.i.g(8), hVar, g0Var, 6);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            r rVarC4 = b2.a.c(rVarO4, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA4, g0Var, b3.h.f);
            q.I(m1VarM4, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode4), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC4, g0Var, b3.h.d);
            q.a(r3.c.a(new y3.f(Float.NaN)), v1.d.d(1490255497, new n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    g0 g0Var2 = (j) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    g0 g0Var3 = g0Var2;
                    if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        r rVarV = z1.v(z1.m(o.A, c.a), 1);
                        float f5 = c.b;
                        r rVarG = h0.c.G(f2.h.i(rVarV, f5, f5), 0.0f, z5 ? 0 : f3, 0.0f, 0.0f, 13);
                        float f6 = f0.a;
                        j0.a(z, (k) null, rVarG, false, f0.a(dl.a.i, dl.a.o, dl.a.L, g0Var2), g0Var2, 48, 40);
                    } else {
                        g0Var3.V();
                    }
                    return b0.a;
                }
            }, g0Var), g0Var, 56);
            if (z5) {
                g0Var.c0(-2018153088);
                r rVar9 = rVar4;
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                int i17 = i12 >> 3;
                j6 = jZ2;
                rVar5 = rVar9;
                f4 = f3;
                k00.f.a(title, new c1(1.0f, true).V(new j2()), dl.a.n, jZ, new y3.o(jZ2), u.B, null, 1, 0.0f, null, g0Var, (i17 & 57344) | (i17 & 7168) | (i12 & 14) | 12779520, 832);
                g0Var.r(false);
            } else {
                rVar5 = rVar4;
                long j11 = jZ2;
                f4 = f3;
                g0Var.c0(-2017750522);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                z6.b(title, new c1(1.0f, true).V(new j2()), dl.a.n, jZ, u.B, (q3.i) null, 0L, (l) null, (x3.k) null, j11, 0, false, 0, 0, (k) null, (r0) null, g0Var, (i12 & 14) | 1572864 | (i12 & 57344), (i12 >> 12) & 112, 260008);
                j6 = j11;
                g0Var = g0Var;
                g0Var.r(false);
            }
            g0Var.r(true);
            j5 = jZ;
            j4 = j6;
            rVar3 = rVar5;
            f2 = f4;
            z4 = z5;
        } else {
            g0Var.V();
            j4 = j2;
            z4 = z2;
            rVar3 = rVar2;
            j5 = j3;
            f2 = f;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c.a(title, z, onCheckedChange, rVar3, j5, j4, f2, z4, (j) obj, q.K(i | 1), i2);
                    return b0.a;
                }
            };
        }
    }
}
