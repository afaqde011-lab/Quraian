package up;

import b2.o;
import b2.r;
import c3.l2;
import c3.m0;
import ez.n;
import g1.m3;
import h0.a0;
import h0.s;
import h0.u;
import h0.v;
import h0.w;
import h0.z1;
import i2.b0;
import i2.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import u00.k;
import z2.w0;

public abstract class f {
    public static final float a = 32;
    public static final float b = 350;

    public static final void a(u00.a onBackClicked, r rVar, r rVar2, ip.a aVar, boolean z, v1.c cVar, j jVar, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        r rVar3;
        r rVar4;
        boolean z3;
        r1 r1VarT;
        r rVar5;
        r rVar6;
        boolean z4;
        r rVar7;
        m.e(onBackClicked, "onBackClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-2047688723);
        if ((i & 6) == 0) {
            i3 = (g0Var.i(onBackClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 48;
        int i6 = i2 & 4;
        if (i6 != 0) {
            i4 = i3 | 432;
        } else {
            i4 = i5 | (g0Var.g(rVar2) ? 256 : 128);
        }
        int i7 = i4 | (g0Var.g(aVar) ? 2048 : 1024);
        int i8 = i2 & 16;
        if (i8 == 0) {
            if ((i & 24576) == 0) {
                i7 |= g0Var.h(z) ? 16384 : 8192;
            }
            if ((74899 & i7) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (g0Var.S(i7 & 1, z2)) {
                rVar5 = o.A;
                if (i6 != 0) {
                    rVar6 = rVar5;
                } else {
                    rVar6 = rVar2;
                }
                if (i8 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (((Boolean) g0Var.k(tp.h.a)).booleanValue()) {
                    g0Var.c0(-1273915776);
                    rVar7 = rVar5;
                    b(onBackClicked, z4, aVar, rVar7, rVar6, cVar, g0Var, (i7 & 14) | ((i7 >> 9) & 112) | ((i7 >> 3) & 896) | 3072 | ((i7 << 6) & 57344) | 196608);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-1273634916);
                    rVar7 = rVar5;
                    c(onBackClicked, z4, aVar, rVar7, rVar6, cVar, g0Var, (i7 & 14) | ((i7 >> 9) & 112) | ((i7 >> 3) & 896) | 3072 | ((i7 << 6) & 57344) | 196608);
                    g0Var.r(false);
                }
                rVar4 = rVar6;
                z3 = z4;
                rVar3 = rVar7;
            } else {
                g0Var.V();
                rVar3 = rVar;
                rVar4 = rVar2;
                z3 = z;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new m3(i, i2, rVar3, rVar4, aVar, onBackClicked, cVar, z3);
            }
        }
        i7 |= 24576;
        if ((74899 & i7) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (g0Var.S(i7 & 1, z2)) {
            rVar5 = o.A;
            if (i6 != 0) {
                rVar6 = rVar5;
            } else {
                rVar6 = rVar2;
            }
            if (i8 != 0) {
                z4 = true;
            } else {
                z4 = z;
            }
            if (((Boolean) g0Var.k(tp.h.a)).booleanValue()) {
                g0Var.c0(-1273915776);
                rVar7 = rVar5;
                b(onBackClicked, z4, aVar, rVar7, rVar6, cVar, g0Var, (i7 & 14) | ((i7 >> 9) & 112) | ((i7 >> 3) & 896) | 3072 | ((i7 << 6) & 57344) | 196608);
                g0Var.r(false);
            } else {
                g0Var.c0(-1273634916);
                rVar7 = rVar5;
                c(onBackClicked, z4, aVar, rVar7, rVar6, cVar, g0Var, (i7 & 14) | ((i7 >> 9) & 112) | ((i7 >> 3) & 896) | 3072 | ((i7 << 6) & 57344) | 196608);
                g0Var.r(false);
            }
            rVar4 = rVar6;
            z3 = z4;
            rVar3 = rVar7;
        } else {
            g0Var.V();
            rVar3 = rVar;
            rVar4 = rVar2;
            z3 = z;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m3(i, i2, rVar3, rVar4, aVar, onBackClicked, cVar, z3);
        }
    }

    public static final void b(u00.a aVar, boolean z, ip.a aVar2, r rVar, r rVar2, v1.c cVar, j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(529403461);
        if ((i & 6) == 0) {
            i2 = (g0Var.i(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.g(aVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.g(rVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var.g(rVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= g0Var.i(cVar) ? 131072 : 65536;
        }
        if (g0Var.S(i2 & 1, (74899 & i2) != 74898)) {
            h0.c.a(rVar.V(z1.c), (b2.d) null, false, v1.d.d(-33539429, new n(m0.u(g0Var), aVar2, z, aVar, cVar, rVar2), g0Var), g0Var, 3072, 6);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new e(i, 1, rVar, rVar2, aVar2, aVar, cVar, z);
        }
    }

    public static final void c(u00.a aVar, boolean z, ip.a aVar2, r rVar, r rVar2, v1.c cVar, j jVar, int i) {
        int i2;
        g0 g0Var;
        float f;
        jk.a aVar3;
        k kVar;
        ?? r8;
        ip.a aVar4 = aVar2;
        v1.c cVar2 = cVar;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-553164846);
        if ((i & 6) == 0) {
            i2 = (g0Var2.i(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var2.g(aVar4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var2.g(rVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var2.g(rVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= g0Var2.i(cVar2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (g0Var2.S(i3 & 1, (i3 & 74899) != 74898)) {
            jk.a aVarD = kk.e.d(g0Var2);
            int iOrdinal = ((gm.a) g0Var2.k(dl.e.a)).ordinal();
            if (iOrdinal == 0) {
                f = 16;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 24;
            }
            l2 l2VarU = m0.u(g0Var2);
            a0 a0Var = z1.c;
            r rVarF = z.n.f(rVar.V(a0Var), dl.a.L, b0.b);
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            r rVarC = b2.a.c(rVarF, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(w0VarD, g0Var2, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var2, fVar4);
            o oVar = o.A;
            r rVarV = kk.e.a(oVar, aVarD).V(a0Var);
            k kVar2 = h0.c.e;
            r rVarE = h0.c.E(h0.c.M(h0.c.M(h0.c.M(rVarV, kVar2), h0.c.g), h0.c.f), f, 0.0f, 2);
            float f2 = 44;
            float f3 = 16;
            r rVarG = h0.c.G(rVarE, 0.0f, f2 + f3, 0.0f, 0.0f, 13);
            h0.d dVar = h0.i.c;
            b2.g gVar2 = b2.b.M;
            v vVarA = u.a(dVar, gVar2, g0Var2, 0);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            r rVarC2 = b2.a.c(rVarG, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(vVarA, g0Var2, fVar);
            q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC2, g0Var2, fVar4);
            r rVarG2 = h0.c.G(z.n.p(u2.f.a(w.a(z1.d(oVar, 1.0f), 1.0f), l2VarU, (u2.d) null), z.n.l(g0Var2), false, 14), 0.0f, 0.0f, 0.0f, a, 7);
            int i4 = ((i3 >> 6) & 7168) | 48;
            v vVarA2 = u.a(h0.i.g(8), gVar2, g0Var2, 6);
            int iHashCode3 = Long.hashCode(g0Var2.T);
            m1 m1VarM3 = g0Var2.m();
            r rVarC3 = b2.a.c(rVarG2, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(vVarA2, g0Var2, fVar);
            q.I(m1VarM3, g0Var2, fVar2);
            a1.b.v(iHashCode3, g0Var2, fVar3, g0Var2, eVar);
            q.I(rVarC3, g0Var2, fVar4);
            cVar2 = cVar;
            cVar2.invoke(w.a, g0Var2, Integer.valueOf(((i4 >> 6) & 112) | 6));
            g0Var2.r(true);
            if (aVar2 != null) {
                g0Var2.c0(-1053522586);
                aVar4 = aVar2;
                r8 = 0;
                aVar3 = aVarD;
                kVar = kVar2;
                kh.n.l(aVar4.a, aVar4.d, h0.c.G(z1.d(rVar2, 1.0f), 0.0f, 0.0f, 0.0f, f3, 7), 32, 54, aVar4.b, aVar4.c, gl.d.Secondary, true, (u00.n) null, g0Var2, 905997312, 0, 7232);
                g0Var = g0Var2;
                g0Var.r(false);
            } else {
                aVar4 = aVar2;
                g0Var = g0Var2;
                aVar3 = aVarD;
                kVar = kVar2;
                r8 = 0;
                g0Var.c0(-1053003212);
                g0Var.r(false);
            }
            g0Var.r((boolean) r1);
            if (z) {
                g0Var.c0(-1406760777);
                r rVarM = h0.c.M(h0.c.E(oVar, f3, 0.0f, 2), kVar);
                g0 g0Var3 = g0Var;
                w50.c.f(aVar, aVar3, s.a.a(rVarM, iVar), false, false, 0.0f, new y3.f(f2), 0L, t.b(0.5f, dl.a.P), 10.0f, p0.f.a, (float) r8, i.a, g0Var3, (i3 & 14) | 806879232, 432, 184);
                g0Var = g0Var3;
                g0Var.r((boolean) r8);
            } else {
                g0Var.c0(-1406056054);
                g0Var.r((boolean) r8);
            }
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new e(i, 0, rVar, rVar2, aVar4, aVar, cVar2, z);
        }
    }
}
