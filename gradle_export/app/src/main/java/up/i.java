package up;

import b2.o;
import b2.r;
import c00.s;
import com.google.android.gms.internal.measurement.y3;
import g00.b0;
import g1.c5;
import g1.c6;
import g1.n5;
import g1.o3;
import g1.t6;
import g1.w6;
import g1.z6;
import h0.c1;
import h0.p1;
import h0.t1;
import h0.v;
import h0.v1;
import h0.z1;
import i2.t;
import ix.l;
import l1.g0;
import l1.j;
import l1.m1;
import l1.r1;
import l1.z0;
import m3.r0;
import pz.m;
import q0.i1;
import q3.u;
import r3.d0;
import r3.e0;
import r3.q;
import u00.k;
import u00.n;

public abstract class i {
    public static final v1.c a = new v1.c(new m(13), -1967893249, false);

    public static final void a(u00.a onClear, j jVar, int i) {
        kotlin.jvm.internal.m.e(onClear, "onClear");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1923831679);
        int i2 = (g0Var.i(onClear) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            o3.a(y3.R(2131231100, g0Var, 0), (String) null, w50.c.o(o.A, false, null, onClear, 7), t.b(0.5f, dl.a.i), g0Var, 56, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.d(onClear, i, 23);
        }
    }

    public static final void b(final String str, final k kVar, final String str2, final boolean z, final e0 e0Var, final i1 i1Var, final u00.a aVar, final n nVar, final r rVar, j jVar, final int i) {
        int i2;
        g0 g0Var;
        qp.b bVar;
        boolean z2;
        n nVarD;
        v1.c cVarD;
        int i3;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-176272135);
        if ((i & 6) == 0) {
            i2 = (g0Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var2.i(kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var2.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var2.h(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= g0Var2.h(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= g0Var2.g(e0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= g0Var2.g(i1Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= g0Var2.i(aVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= g0Var2.i(nVar) ? 536870912 : 268435456;
        }
        if (g0Var2.S(i2 & 1, ((i2 & 306783379) == 306783378 && ((g0Var2.g(rVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            int i4 = i2 & 14;
            z0.g gVarH = z0.h.h(str, g0Var2, i4);
            boolean z3 = e0Var instanceof q;
            Object objN = g0Var2.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = l1.q.z(Boolean.FALSE);
                g0Var2.n0(objN);
            }
            z0 z0Var = (z0) objN;
            r rVarE = z1.e(rVar, 48);
            p1 p1VarE = h0.c.e(16, 0.0f, 2);
            if (aVar == null) {
                g0Var2.c0(1422542627);
                z2 = false;
                g0Var2.r(false);
                bVar = null;
            } else {
                g0Var2.c0(1422542628);
                boolean zG = g0Var2.g(aVar);
                Object objN2 = g0Var2.N();
                if (zG || objN2 == obj) {
                    objN2 = new qp.b(aVar, 1);
                    g0Var2.n0(objN2);
                }
                bVar = (qp.b) objN2;
                z2 = false;
                g0Var2.r(false);
            }
            if (z3) {
                g0Var2.c0(1422689475);
                nVarD = v1.d.d(189332549, new g1.i(z0Var, 3), g0Var2);
                g0Var2.r(false);
            } else {
                g0Var2.c0(1422886573);
                g0Var2.r(z2);
                nVarD = nVar;
            }
            if (str2 == null) {
                g0Var2.c0(1422990267);
                g0Var2.r(false);
                cVarD = null;
            } else {
                g0Var2.c0(1422990268);
                cVarD = v1.d.d(1012031396, new eu.n(str2, 9), g0Var2);
                g0Var2.r(false);
            }
            c5 c5Var = c5.a;
            v1.c cVar = cVarD;
            long j = dl.a.Z;
            long jB = t.b(0.19f, j);
            long jB2 = t.b(0.08f, j);
            qp.b bVar2 = bVar;
            long jB3 = t.b(0.08f, dl.a.i);
            long j2 = t.f;
            long j3 = dl.a.U;
            long jB4 = t.b(0.19f, j);
            long j4 = dl.a.k;
            boolean z4 = true;
            t6 t6VarC = c5.c(j4, j4, j4, j4, jB, jB2, jB3, jB4, dl.a.H, j2, j2, j2, j3, t.b(0.5f, j4), t.b(0.5f, j4), t.b(0.5f, j4), g0Var2, 1207928320);
            boolean zG2 = (i4 == 4) | g0Var2.g(gVarH);
            Object objN3 = g0Var2.N();
            if (zG2 || objN3 == obj) {
                i3 = 2;
                objN3 = new l(str, gVarH, null, 2);
                g0Var2.n0(objN3);
            } else {
                i3 = 2;
            }
            l1.q.i(str, g0Var2, (n) objN3);
            boolean zG3 = g0Var2.g(gVarH);
            if ((i2 & 112) != 32) {
                z4 = false;
            }
            boolean z5 = zG3 | z4;
            Object objN4 = g0Var2.N();
            if (z5 || objN4 == obj) {
                objN4 = new s(gVarH, kVar, null, 9);
                g0Var2.n0(objN4);
            }
            l1.q.i(gVarH, g0Var2, (n) objN4);
            if (z3) {
                g0Var2.c0(1424535153);
                c6.a(gVarH, rVarE, (r0) null, (w6) null, cVar, nVarD, z, ((Boolean) z0Var.getValue()).booleanValue() ? 0 : i3, (char) 0, i1Var, bVar2, p0.f.a(32), t6VarC, p1VarE, g0Var2, (i2 >> 6) & 896, (i2 >> 3) & 3670912);
                g0Var = g0Var2;
                g0Var.r(false);
            } else {
                g0Var2.c0(1425212627);
                n5.c(gVarH, rVarE, true, (r0) null, (w6) null, cVar, (n) null, nVarD, z, i1Var, bVar2, z0.e.B, (z.p1) null, p0.f.a(32), t6VarC, p1VarE, g0Var2, (i2 >> 6) & 8064, (i2 & 7168) | 100663296 | ((i2 >> 3) & 3670016), 18406768);
                g0Var = g0Var2;
                g0Var.r(false);
            }
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    i.b(str, kVar, str2, z, e0Var, i1Var, aVar, nVar, rVar, (j) obj2, l1.q.K(i | 1));
                    return b0.a;
                }
            };
        }
    }

    public static final void c(boolean z, u00.a aVar, j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(638778953);
        int i2 = (g0Var.h(z) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            o3.a(y3.R(z ? 2131231408 : 2131231407, g0Var, 0), (String) null, w50.c.o(z1.m(o.A, 24), false, null, aVar, 7), t.b(0.5f, dl.a.i), g0Var, 56, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.n(z, aVar, i, 5);
        }
    }

    public static final void d(String str, String str2, boolean z, boolean z2, n nVar, u00.a aVar, r rVar, j jVar, int i) {
        int i2;
        String str3;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-559635769);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var.i(nVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= g0Var.i(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= g0Var.g(rVar) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (g0Var.S(i3 & 1, (i3 & 599187) != 599186)) {
            p0.e eVarA = p0.f.a(32);
            r rVarF = z.n.f(f2.h.c(z1.e(rVar, 48), eVarA), t.b(0.08f, dl.a.Z), i2.b0.b);
            r rVarA = o.A;
            r rVarO = w50.c.o(rVarF.V(z ? z.n.g(rVarA, 1, dl.a.U, eVarA) : rVarA), z2, null, aVar, 6);
            if (!z2) {
                rVarA = f2.h.a(rVarA, 0.5f);
            }
            r rVarE = h0.c.E(rVarO.V(rVarA), 16, 0.0f, 2);
            v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarE, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            if (str.length() == 0) {
                str3 = str2 == null ? "" : str2;
            } else {
                str3 = str;
            }
            long jB = str.length() == 0 ? t.b(0.5f, dl.a.k) : dl.a.k;
            long jZ = kh.o.z(16);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(str3, new c1(1.0f, true), jB, jZ, (u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (k) null, (r0) null, g0Var, 24576, 24960, 241640);
            if (nVar == null) {
                g0Var.c0(-821096682);
            } else {
                g0Var.c0(804797003);
                nVar.invoke(g0Var, Integer.valueOf((i3 >> 12) & 14));
            }
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sx.a(str, str2, z, z2, nVar, aVar, rVar, i);
        }
    }

    public static final void e(final String value, final k onValueChange, final r rVar, final String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, e0 e0Var, i1 i1Var, u00.a aVar, n nVar, u00.a aVar2, g2.t tVar, j jVar, final int i, final int i2, final int i3) {
        int i4;
        String str3;
        String str4;
        int i5;
        boolean z5;
        int i6;
        int i7;
        boolean z6;
        int i8;
        int i9;
        int i11;
        boolean z7;
        int i12;
        int i13;
        boolean z8;
        int i14;
        int i15;
        e0 e0Var2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        boolean z9;
        g0 g0Var;
        final boolean z11;
        final boolean z12;
        final e0 e0Var3;
        final u00.a aVar3;
        final n nVar2;
        final g2.t tVar2;
        final String str5;
        final boolean z13;
        final boolean z14;
        final i1 i1Var2;
        final u00.a aVar4;
        r1 r1VarT;
        e0 e0Var4;
        i1 i1Var3;
        u00.a aVar5;
        u00.a aVar6;
        g2.t tVar3;
        boolean z15;
        boolean z16;
        boolean z17;
        r rVarJ;
        r rVarV;
        n nVarD;
        h0.f fVarG;
        int i32;
        n nVar3;
        e0 e0Var5;
        b3.g gVar;
        u00.a aVar7;
        u00.a aVar8;
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(onValueChange, "onValueChange");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-1627764130);
        if ((i & 6) == 0) {
            i4 = (g0Var2.g(value) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= g0Var2.i(onValueChange) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= g0Var2.g(rVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str3 = str;
            i4 |= g0Var2.g(str3) ? 2048 : 1024;
        } else {
            str3 = str;
        }
        int i33 = i3 & 16;
        if (i33 == 0) {
            if ((i & 24576) == 0) {
                str4 = str2;
                i4 |= g0Var2.g(str4) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                i4 |= 196608;
                z5 = z;
            } else {
                z5 = z;
                if ((i & 196608) == 0) {
                    if (g0Var2.h(z5)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                i4 |= 1572864;
                z6 = z2;
            } else {
                z6 = z2;
                if ((i & 1572864) == 0) {
                    if (g0Var2.h(z6)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
            }
            i9 = i4 | 12582912;
            i11 = i3 & 256;
            if (i11 != 0) {
                if ((100663296 & i) == 0) {
                    z7 = z3;
                    if (g0Var2.h(z7)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i9 |= i12;
                }
                i13 = i3 & 512;
                if (i13 != 0) {
                    i9 |= 805306368;
                    z8 = z4;
                } else {
                    z8 = z4;
                    if ((i & 805306368) == 0) {
                        if (g0Var2.h(z8)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i9 |= i14;
                    }
                }
                i15 = i3 & 1024;
                if (i15 != 0) {
                    i17 = i2 | 6;
                    e0Var2 = e0Var;
                } else {
                    e0Var2 = e0Var;
                    if (g0Var2.g(e0Var2)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i17 = i2 | i16;
                }
                i18 = i3 & 2048;
                if (i18 != 0) {
                    i17 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (g0Var2.g(i1Var)) {
                        i19 = 32;
                    } else {
                        i19 = 16;
                    }
                    i17 |= i19;
                }
                i21 = i17;
                i22 = i3 & 4096;
                if (i22 != 0) {
                    i24 = i21 | 384;
                } else {
                    if (g0Var2.i(aVar)) {
                        i23 = 256;
                    } else {
                        i23 = 128;
                    }
                    i24 = i21 | i23;
                }
                i25 = i3 & 8192;
                if (i25 != 0) {
                    i27 = i24 | 3072;
                } else {
                    int i34 = i24;
                    if (g0Var2.i(nVar)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i27 = i34 | i26;
                }
                i28 = i3 & 16384;
                if (i28 != 0) {
                    i29 = i27 | 24576;
                } else {
                    i29 = i27 | (g0Var2.i(aVar2) ? 16384 : 8192);
                }
                i31 = i3 & 32768;
                if (i31 != 0) {
                    i29 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i29 |= g0Var2.g(tVar) ? 131072 : 65536;
                }
                if ((i9 & 306783379) == 306783378 || (i29 & 74899) != 74898) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (g0Var2.S(i9 & 1, z9)) {
                    if (i33 != 0) {
                        str4 = null;
                    }
                    if (i5 != 0) {
                        z5 = false;
                    }
                    if (i7 != 0) {
                        z6 = false;
                    }
                    if (i11 != 0) {
                        z7 = true;
                    }
                    if (i13 != 0) {
                        z8 = true;
                    }
                    if (i15 != 0) {
                        e0Var4 = d0.A;
                    } else {
                        e0Var4 = e0Var2;
                    }
                    if (i18 != 0) {
                        i1Var3 = i1.g;
                    } else {
                        i1Var3 = i1Var;
                    }
                    if (i22 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar;
                    }
                    if (i25 != 0) {
                        nVar2 = null;
                    } else {
                        nVar2 = nVar;
                    }
                    if (i28 != 0) {
                        aVar6 = null;
                    } else {
                        aVar6 = aVar2;
                    }
                    if (i31 != 0) {
                        tVar3 = null;
                    } else {
                        tVar3 = tVar;
                    }
                    if (z6 && str4 == null) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (z5 && str4 == null) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    z17 = z7;
                    rVarJ = o.A;
                    r rVarD = z1.d(rVarJ, 1.0f);
                    if (tVar3 != null) {
                        rVarJ = g2.d.j(rVarJ, tVar3);
                    }
                    rVarV = rVarD.V(rVarJ);
                    boolean z18 = e0Var4 instanceof q;
                    if (nVar2 == null) {
                        nVarD = nVar2;
                    } else if (aVar6 == null || z18 || !z8 || value.length() <= 0) {
                        g0Var2.c0(1755844432);
                        g0Var2.r(false);
                        nVarD = null;
                    } else {
                        g0Var2.c0(1755745604);
                        nVarD = v1.d.d(1297498418, new bs.e(10, onValueChange), g0Var2);
                        g0Var2.r(false);
                    }
                    if (z16) {
                        fVarG = h0.i.g(4);
                    } else {
                        fVarG = h0.i.c;
                    }
                    i32 = i9 >> 6;
                    nVar3 = nVarD;
                    e0Var5 = e0Var4;
                    v vVarA = h0.u.a(fVarG, b2.b.M, g0Var2, 0);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    r rVarC = b2.a.c(rVar, g0Var2);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(vVarA, g0Var2, b3.h.f);
                    l1.q.I(m1VarM, g0Var2, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
                    l1.q.E(g0Var2, b3.h.h);
                    l1.q.I(rVarC, g0Var2, b3.h.d);
                    if (aVar6 != null) {
                        g0Var2.c0(-1029970236);
                        u00.a aVar9 = aVar6;
                        d(value, str3, z15, z17, nVar3, aVar9, rVarV, g0Var2, (458752 & (i29 << 3)) | (i9 & 14) | (i32 & 112) | ((i9 >> 15) & 7168));
                        aVar7 = aVar9;
                        g0Var = g0Var2;
                        g0Var.r(false);
                        aVar8 = aVar5;
                    } else {
                        g0Var = g0Var2;
                        aVar7 = aVar6;
                        g0Var.c0(-1029630507);
                        int i35 = i29 << 18;
                        u00.a aVar10 = aVar5;
                        b(value, onValueChange, str, z15, e0Var5, i1Var3, aVar10, nVar3, rVarV, g0Var, (i32 & 458752) | (i9 & 14) | 24576 | (i9 & 112) | ((i9 >> 3) & 896) | (3670016 & i35) | (29360128 & i35) | (i35 & 234881024));
                        aVar8 = aVar10;
                        g0Var.r(false);
                    }
                    if (z16) {
                        g0Var.c0(-1029082520);
                        d.a(((i9 >> 12) & 14) | ((i9 >> 9) & 896), null, str4, g0Var, z5);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(-1028953746);
                        g0Var.r(false);
                    }
                    g0Var.r(true);
                    aVar3 = aVar8;
                    str5 = str4;
                    z13 = z6;
                    z14 = z8;
                    tVar2 = tVar3;
                    aVar4 = aVar7;
                    i1Var2 = i1Var3;
                    z11 = z17;
                    z12 = z5;
                    e0Var3 = e0Var5;
                } else {
                    g0Var = g0Var2;
                    g0Var.V();
                    e0 e0Var6 = e0Var2;
                    z11 = z7;
                    z12 = z5;
                    e0Var3 = e0Var6;
                    aVar3 = aVar;
                    nVar2 = nVar;
                    tVar2 = tVar;
                    str5 = str4;
                    z13 = z6;
                    z14 = z8;
                    i1Var2 = i1Var;
                    aVar4 = aVar2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iK = l1.q.K(i | 1);
                            int iK2 = l1.q.K(i2);
                            i.e(value, onValueChange, rVar, str, str5, z12, z13, z11, z14, e0Var3, i1Var2, aVar3, nVar2, aVar4, tVar2, (j) obj, iK, iK2, i3);
                            return b0.a;
                        }
                    };
                }
            }
            i9 = i4 | 113246208;
            z7 = z3;
            i13 = i3 & 512;
            if (i13 != 0) {
                i9 |= 805306368;
                z8 = z4;
            } else {
                z8 = z4;
                if ((i & 805306368) == 0) {
                    if (g0Var2.h(z8)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i9 |= i14;
                }
            }
            i15 = i3 & 1024;
            if (i15 != 0) {
                i17 = i2 | 6;
                e0Var2 = e0Var;
            } else {
                e0Var2 = e0Var;
                if (g0Var2.g(e0Var2)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i17 = i2 | i16;
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
                i17 |= 48;
            } else if ((i2 & 48) != 0) {
                if (g0Var2.g(i1Var)) {
                    i19 = 32;
                } else {
                    i19 = 16;
                }
                i17 |= i19;
            }
            i21 = i17;
            i22 = i3 & 4096;
            if (i22 != 0) {
                i24 = i21 | 384;
            } else {
                if (g0Var2.i(aVar)) {
                    i23 = 256;
                } else {
                    i23 = 128;
                }
                i24 = i21 | i23;
            }
            i25 = i3 & 8192;
            if (i25 != 0) {
                i27 = i24 | 3072;
            } else {
                int i36 = i24;
                if (g0Var2.i(nVar)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i27 = i36 | i26;
            }
            i28 = i3 & 16384;
            if (i28 != 0) {
                i29 = i27 | 24576;
            } else {
                i29 = i27 | (g0Var2.i(aVar2) ? 16384 : 8192);
            }
            i31 = i3 & 32768;
            if (i31 != 0) {
                i29 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i29 |= g0Var2.g(tVar) ? 131072 : 65536;
            }
            if ((i9 & 306783379) == 306783378) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (g0Var2.S(i9 & 1, z9)) {
                if (i33 != 0) {
                    str4 = null;
                }
                if (i5 != 0) {
                    z5 = false;
                }
                if (i7 != 0) {
                    z6 = false;
                }
                if (i11 != 0) {
                    z7 = true;
                }
                if (i13 != 0) {
                    z8 = true;
                }
                if (i15 != 0) {
                    e0Var4 = d0.A;
                } else {
                    e0Var4 = e0Var2;
                }
                if (i18 != 0) {
                    i1Var3 = i1.g;
                } else {
                    i1Var3 = i1Var;
                }
                if (i22 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar;
                }
                if (i25 != 0) {
                    nVar2 = null;
                } else {
                    nVar2 = nVar;
                }
                if (i28 != 0) {
                    aVar6 = null;
                } else {
                    aVar6 = aVar2;
                }
                if (i31 != 0) {
                    tVar3 = null;
                } else {
                    tVar3 = tVar;
                }
                if (z6) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (z5) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                z17 = z7;
                rVarJ = o.A;
                r rVarD2 = z1.d(rVarJ, 1.0f);
                if (tVar3 != null) {
                    rVarJ = g2.d.j(rVarJ, tVar3);
                }
                rVarV = rVarD2.V(rVarJ);
                boolean z19 = e0Var4 instanceof q;
                if (nVar2 == null) {
                    nVarD = nVar2;
                } else if (aVar6 == null) {
                    g0Var2.c0(1755844432);
                    g0Var2.r(false);
                    nVarD = null;
                } else {
                    g0Var2.c0(1755844432);
                    g0Var2.r(false);
                    nVarD = null;
                }
                if (z16) {
                    fVarG = h0.i.g(4);
                } else {
                    fVarG = h0.i.c;
                }
                i32 = i9 >> 6;
                nVar3 = nVarD;
                e0Var5 = e0Var4;
                v vVarA2 = h0.u.a(fVarG, b2.b.M, g0Var2, 0);
                int iHashCode2 = Long.hashCode(g0Var2.T);
                m1 m1VarM2 = g0Var2.m();
                r rVarC2 = b2.a.c(rVar, g0Var2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(vVarA2, g0Var2, b3.h.f);
                l1.q.I(m1VarM2, g0Var2, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode2), g0Var2, b3.h.g);
                l1.q.E(g0Var2, b3.h.h);
                l1.q.I(rVarC2, g0Var2, b3.h.d);
                if (aVar6 != null) {
                    g0Var2.c0(-1029970236);
                    u00.a aVar11 = aVar6;
                    d(value, str3, z15, z17, nVar3, aVar11, rVarV, g0Var2, (458752 & (i29 << 3)) | (i9 & 14) | (i32 & 112) | ((i9 >> 15) & 7168));
                    aVar7 = aVar11;
                    g0Var = g0Var2;
                    g0Var.r(false);
                    aVar8 = aVar5;
                } else {
                    g0Var = g0Var2;
                    aVar7 = aVar6;
                    g0Var.c0(-1029630507);
                    int i37 = i29 << 18;
                    u00.a aVar12 = aVar5;
                    b(value, onValueChange, str, z15, e0Var5, i1Var3, aVar12, nVar3, rVarV, g0Var, (i32 & 458752) | (i9 & 14) | 24576 | (i9 & 112) | ((i9 >> 3) & 896) | (3670016 & i37) | (29360128 & i37) | (i37 & 234881024));
                    aVar8 = aVar12;
                    g0Var.r(false);
                }
                if (z16) {
                    g0Var.c0(-1029082520);
                    d.a(((i9 >> 12) & 14) | ((i9 >> 9) & 896), null, str4, g0Var, z5);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-1028953746);
                    g0Var.r(false);
                }
                g0Var.r(true);
                aVar3 = aVar8;
                str5 = str4;
                z13 = z6;
                z14 = z8;
                tVar2 = tVar3;
                aVar4 = aVar7;
                i1Var2 = i1Var3;
                z11 = z17;
                z12 = z5;
                e0Var3 = e0Var5;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                e0 e0Var7 = e0Var2;
                z11 = z7;
                z12 = z5;
                e0Var3 = e0Var7;
                aVar3 = aVar;
                nVar2 = nVar;
                tVar2 = tVar;
                str5 = str4;
                z13 = z6;
                z14 = z8;
                i1Var2 = i1Var;
                aVar4 = aVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i | 1);
                        int iK2 = l1.q.K(i2);
                        i.e(value, onValueChange, rVar, str, str5, z12, z13, z11, z14, e0Var3, i1Var2, aVar3, nVar2, aVar4, tVar2, (j) obj, iK, iK2, i3);
                        return b0.a;
                    }
                };
            }
        }
        i4 |= 24576;
        str4 = str2;
        i5 = i3 & 32;
        if (i5 != 0) {
            i4 |= 196608;
            z5 = z;
        } else {
            z5 = z;
            if ((i & 196608) == 0) {
                if (g0Var2.h(z5)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
            z6 = z2;
        } else {
            z6 = z2;
            if ((i & 1572864) == 0) {
                if (g0Var2.h(z6)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
        }
        i9 = i4 | 12582912;
        i11 = i3 & 256;
        if (i11 != 0) {
            if ((100663296 & i) == 0) {
                z7 = z3;
                if (g0Var2.h(z7)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i9 |= i12;
            }
            i13 = i3 & 512;
            if (i13 != 0) {
                i9 |= 805306368;
                z8 = z4;
            } else {
                z8 = z4;
                if ((i & 805306368) == 0) {
                    if (g0Var2.h(z8)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i9 |= i14;
                }
            }
            i15 = i3 & 1024;
            if (i15 != 0) {
                i17 = i2 | 6;
                e0Var2 = e0Var;
            } else {
                e0Var2 = e0Var;
                if (g0Var2.g(e0Var2)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i17 = i2 | i16;
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
                i17 |= 48;
            } else if ((i2 & 48) != 0) {
                if (g0Var2.g(i1Var)) {
                    i19 = 32;
                } else {
                    i19 = 16;
                }
                i17 |= i19;
            }
            i21 = i17;
            i22 = i3 & 4096;
            if (i22 != 0) {
                i24 = i21 | 384;
            } else {
                if (g0Var2.i(aVar)) {
                    i23 = 256;
                } else {
                    i23 = 128;
                }
                i24 = i21 | i23;
            }
            i25 = i3 & 8192;
            if (i25 != 0) {
                i27 = i24 | 3072;
            } else {
                int i38 = i24;
                if (g0Var2.i(nVar)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i27 = i38 | i26;
            }
            i28 = i3 & 16384;
            if (i28 != 0) {
                i29 = i27 | 24576;
            } else {
                i29 = i27 | (g0Var2.i(aVar2) ? 16384 : 8192);
            }
            i31 = i3 & 32768;
            if (i31 != 0) {
                i29 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i29 |= g0Var2.g(tVar) ? 131072 : 65536;
            }
            if ((i9 & 306783379) == 306783378) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (g0Var2.S(i9 & 1, z9)) {
                if (i33 != 0) {
                    str4 = null;
                }
                if (i5 != 0) {
                    z5 = false;
                }
                if (i7 != 0) {
                    z6 = false;
                }
                if (i11 != 0) {
                    z7 = true;
                }
                if (i13 != 0) {
                    z8 = true;
                }
                if (i15 != 0) {
                    e0Var4 = d0.A;
                } else {
                    e0Var4 = e0Var2;
                }
                if (i18 != 0) {
                    i1Var3 = i1.g;
                } else {
                    i1Var3 = i1Var;
                }
                if (i22 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar;
                }
                if (i25 != 0) {
                    nVar2 = null;
                } else {
                    nVar2 = nVar;
                }
                if (i28 != 0) {
                    aVar6 = null;
                } else {
                    aVar6 = aVar2;
                }
                if (i31 != 0) {
                    tVar3 = null;
                } else {
                    tVar3 = tVar;
                }
                if (z6) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (z5) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                z17 = z7;
                rVarJ = o.A;
                r rVarD3 = z1.d(rVarJ, 1.0f);
                if (tVar3 != null) {
                    rVarJ = g2.d.j(rVarJ, tVar3);
                }
                rVarV = rVarD3.V(rVarJ);
                boolean z110 = e0Var4 instanceof q;
                if (nVar2 == null) {
                    nVarD = nVar2;
                } else if (aVar6 == null) {
                    g0Var2.c0(1755844432);
                    g0Var2.r(false);
                    nVarD = null;
                } else {
                    g0Var2.c0(1755844432);
                    g0Var2.r(false);
                    nVarD = null;
                }
                if (z16) {
                    fVarG = h0.i.g(4);
                } else {
                    fVarG = h0.i.c;
                }
                i32 = i9 >> 6;
                nVar3 = nVarD;
                e0Var5 = e0Var4;
                v vVarA3 = h0.u.a(fVarG, b2.b.M, g0Var2, 0);
                int iHashCode3 = Long.hashCode(g0Var2.T);
                m1 m1VarM3 = g0Var2.m();
                r rVarC3 = b2.a.c(rVar, g0Var2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(vVarA3, g0Var2, b3.h.f);
                l1.q.I(m1VarM3, g0Var2, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode3), g0Var2, b3.h.g);
                l1.q.E(g0Var2, b3.h.h);
                l1.q.I(rVarC3, g0Var2, b3.h.d);
                if (aVar6 != null) {
                    g0Var2.c0(-1029970236);
                    u00.a aVar13 = aVar6;
                    d(value, str3, z15, z17, nVar3, aVar13, rVarV, g0Var2, (458752 & (i29 << 3)) | (i9 & 14) | (i32 & 112) | ((i9 >> 15) & 7168));
                    aVar7 = aVar13;
                    g0Var = g0Var2;
                    g0Var.r(false);
                    aVar8 = aVar5;
                } else {
                    g0Var = g0Var2;
                    aVar7 = aVar6;
                    g0Var.c0(-1029630507);
                    int i39 = i29 << 18;
                    u00.a aVar14 = aVar5;
                    b(value, onValueChange, str, z15, e0Var5, i1Var3, aVar14, nVar3, rVarV, g0Var, (i32 & 458752) | (i9 & 14) | 24576 | (i9 & 112) | ((i9 >> 3) & 896) | (3670016 & i39) | (29360128 & i39) | (i39 & 234881024));
                    aVar8 = aVar14;
                    g0Var.r(false);
                }
                if (z16) {
                    g0Var.c0(-1029082520);
                    d.a(((i9 >> 12) & 14) | ((i9 >> 9) & 896), null, str4, g0Var, z5);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-1028953746);
                    g0Var.r(false);
                }
                g0Var.r(true);
                aVar3 = aVar8;
                str5 = str4;
                z13 = z6;
                z14 = z8;
                tVar2 = tVar3;
                aVar4 = aVar7;
                i1Var2 = i1Var3;
                z11 = z17;
                z12 = z5;
                e0Var3 = e0Var5;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                e0 e0Var8 = e0Var2;
                z11 = z7;
                z12 = z5;
                e0Var3 = e0Var8;
                aVar3 = aVar;
                nVar2 = nVar;
                tVar2 = tVar;
                str5 = str4;
                z13 = z6;
                z14 = z8;
                i1Var2 = i1Var;
                aVar4 = aVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i | 1);
                        int iK2 = l1.q.K(i2);
                        i.e(value, onValueChange, rVar, str, str5, z12, z13, z11, z14, e0Var3, i1Var2, aVar3, nVar2, aVar4, tVar2, (j) obj, iK, iK2, i3);
                        return b0.a;
                    }
                };
            }
        }
        i9 = i4 | 113246208;
        z7 = z3;
        i13 = i3 & 512;
        if (i13 != 0) {
            i9 |= 805306368;
            z8 = z4;
        } else {
            z8 = z4;
            if ((i & 805306368) == 0) {
                if (g0Var2.h(z8)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i9 |= i14;
            }
        }
        i15 = i3 & 1024;
        if (i15 != 0) {
            i17 = i2 | 6;
            e0Var2 = e0Var;
        } else {
            e0Var2 = e0Var;
            if (g0Var2.g(e0Var2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i17 = i2 | i16;
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i2 & 48) != 0) {
            if (g0Var2.g(i1Var)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i17 |= i19;
        }
        i21 = i17;
        i22 = i3 & 4096;
        if (i22 != 0) {
            i24 = i21 | 384;
        } else {
            if (g0Var2.i(aVar)) {
                i23 = 256;
            } else {
                i23 = 128;
            }
            i24 = i21 | i23;
        }
        i25 = i3 & 8192;
        if (i25 != 0) {
            i27 = i24 | 3072;
        } else {
            int i310 = i24;
            if (g0Var2.i(nVar)) {
                i26 = 2048;
            } else {
                i26 = 1024;
            }
            i27 = i310 | i26;
        }
        i28 = i3 & 16384;
        if (i28 != 0) {
            i29 = i27 | 24576;
        } else {
            i29 = i27 | (g0Var2.i(aVar2) ? 16384 : 8192);
        }
        i31 = i3 & 32768;
        if (i31 != 0) {
            i29 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i29 |= g0Var2.g(tVar) ? 131072 : 65536;
        }
        if ((i9 & 306783379) == 306783378) {
            z9 = true;
        } else {
            z9 = true;
        }
        if (g0Var2.S(i9 & 1, z9)) {
            if (i33 != 0) {
                str4 = null;
            }
            if (i5 != 0) {
                z5 = false;
            }
            if (i7 != 0) {
                z6 = false;
            }
            if (i11 != 0) {
                z7 = true;
            }
            if (i13 != 0) {
                z8 = true;
            }
            if (i15 != 0) {
                e0Var4 = d0.A;
            } else {
                e0Var4 = e0Var2;
            }
            if (i18 != 0) {
                i1Var3 = i1.g;
            } else {
                i1Var3 = i1Var;
            }
            if (i22 != 0) {
                aVar5 = null;
            } else {
                aVar5 = aVar;
            }
            if (i25 != 0) {
                nVar2 = null;
            } else {
                nVar2 = nVar;
            }
            if (i28 != 0) {
                aVar6 = null;
            } else {
                aVar6 = aVar2;
            }
            if (i31 != 0) {
                tVar3 = null;
            } else {
                tVar3 = tVar;
            }
            if (z6) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (z5) {
                z16 = true;
            } else {
                z16 = true;
            }
            z17 = z7;
            rVarJ = o.A;
            r rVarD4 = z1.d(rVarJ, 1.0f);
            if (tVar3 != null) {
                rVarJ = g2.d.j(rVarJ, tVar3);
            }
            rVarV = rVarD4.V(rVarJ);
            boolean z111 = e0Var4 instanceof q;
            if (nVar2 == null) {
                nVarD = nVar2;
            } else if (aVar6 == null) {
                g0Var2.c0(1755844432);
                g0Var2.r(false);
                nVarD = null;
            } else {
                g0Var2.c0(1755844432);
                g0Var2.r(false);
                nVarD = null;
            }
            if (z16) {
                fVarG = h0.i.g(4);
            } else {
                fVarG = h0.i.c;
            }
            i32 = i9 >> 6;
            nVar3 = nVarD;
            e0Var5 = e0Var4;
            v vVarA4 = h0.u.a(fVarG, b2.b.M, g0Var2, 0);
            int iHashCode4 = Long.hashCode(g0Var2.T);
            m1 m1VarM4 = g0Var2.m();
            r rVarC4 = b2.a.c(rVar, g0Var2);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA4, g0Var2, b3.h.f);
            l1.q.I(m1VarM4, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode4), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC4, g0Var2, b3.h.d);
            if (aVar6 != null) {
                g0Var2.c0(-1029970236);
                u00.a aVar15 = aVar6;
                d(value, str3, z15, z17, nVar3, aVar15, rVarV, g0Var2, (458752 & (i29 << 3)) | (i9 & 14) | (i32 & 112) | ((i9 >> 15) & 7168));
                aVar7 = aVar15;
                g0Var = g0Var2;
                g0Var.r(false);
                aVar8 = aVar5;
            } else {
                g0Var = g0Var2;
                aVar7 = aVar6;
                g0Var.c0(-1029630507);
                int i311 = i29 << 18;
                u00.a aVar16 = aVar5;
                b(value, onValueChange, str, z15, e0Var5, i1Var3, aVar16, nVar3, rVarV, g0Var, (i32 & 458752) | (i9 & 14) | 24576 | (i9 & 112) | ((i9 >> 3) & 896) | (3670016 & i311) | (29360128 & i311) | (i311 & 234881024));
                aVar8 = aVar16;
                g0Var.r(false);
            }
            if (z16) {
                g0Var.c0(-1029082520);
                d.a(((i9 >> 12) & 14) | ((i9 >> 9) & 896), null, str4, g0Var, z5);
                g0Var.r(false);
            } else {
                g0Var.c0(-1028953746);
                g0Var.r(false);
            }
            g0Var.r(true);
            aVar3 = aVar8;
            str5 = str4;
            z13 = z6;
            z14 = z8;
            tVar2 = tVar3;
            aVar4 = aVar7;
            i1Var2 = i1Var3;
            z11 = z17;
            z12 = z5;
            e0Var3 = e0Var5;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            e0 e0Var9 = e0Var2;
            z11 = z7;
            z12 = z5;
            e0Var3 = e0Var9;
            aVar3 = aVar;
            nVar2 = nVar;
            tVar2 = tVar;
            str5 = str4;
            z13 = z6;
            z14 = z8;
            i1Var2 = i1Var;
            aVar4 = aVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i | 1);
                    int iK2 = l1.q.K(i2);
                    i.e(value, onValueChange, rVar, str, str5, z12, z13, z11, z14, e0Var3, i1Var2, aVar3, nVar2, aVar4, tVar2, (j) obj, iK, iK2, i3);
                    return b0.a;
                }
            };
        }
    }
}
