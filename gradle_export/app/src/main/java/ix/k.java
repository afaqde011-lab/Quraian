package ix;

import g00.b0;
import h0.c1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import i2.t;
import i2.t0;
import l1.g0;
import l1.m1;
import l1.r1;

public abstract class k {
    public static final float a = 16;
    public static final float b = 20;
    public static final float c = 6;
    public static final float d = 4;

    public static final void a(float f, final int i, b2.r rVar, l1.j jVar, final boolean z) {
        final float f2;
        final b2.r rVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1391328494);
        int i2 = i | (g0Var.h(z) ? 4 : 2) | (g0Var.d(f) ? 32 : 16) | 384;
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            float f3 = z ? 108 : 160;
            float f4 = z ? 12 : 24;
            float f5 = z ? 80 : 100;
            float f6 = z ? 18 : 22;
            b2.r rVar3 = b2.o.A;
            b2.r rVarD = z1.d(rVar3, 1.0f);
            float f7 = 12;
            v vVarA = u.a(h0.i.g(f7), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            rVar2 = rVar3;
            e(f, 22, h0.c.E(h0.c.E(rVar3, 0.0f, f7, 1), z ? 16 : 24, 0.0f, 2), 0.0f, g0Var, ((i2 >> 3) & 14) | 48, 8);
            b2.r rVarM = z.n.m(z1.d(rVar2, 1.0f), z.n.l(g0Var), true, false);
            v1 v1VarA = t1.a(h0.i.g(f4), b2.b.J, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarM, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            h0.c.h(z1.q(rVar2, z ? 16 : 24), g0Var);
            g0Var.c0(-858182084);
            for (int i3 = 0; i3 < 9; i3++) {
                v vVarA2 = u.a(h0.i.g(8), b2.b.N, g0Var, 54);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                b2.r rVarC3 = b2.a.c(rVar2, g0Var);
                b3.i.c.getClass();
                b3.g gVar2 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA2, g0Var, b3.h.f);
                l1.q.I(m1VarM3, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC3, g0Var, b3.h.d);
                f(f3, 0, 2, null, g0Var);
                e(f5, f6, null, d, g0Var, 3072, 4);
                g0Var.r(true);
            }
            f2 = f;
            g0Var.r(false);
            h0.c.h(z1.q(rVar2, z ? 16 : 24), g0Var);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            f2 = f;
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(f2, i, rVar2, z) {
                public final boolean A;
                public final float B;
                public final b2.r C;

                {
                    this.A = z;
                    this.C = rVar2;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    k.a(this.B, iK, this.C, (l1.j) obj, this.A);
                    return b0.a;
                }
            };
        }
    }

    public static final void b(int i, b2.r rVar, l1.j jVar, boolean z) {
        b2.r rVar2;
        boolean z2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-862162165);
        int i2 = i | (g0Var.h(z) ? 4 : 2) | 48;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            float f = z ? 108 : 150;
            float f2 = z ? 66 : 100;
            float f3 = z ? 13 : 19;
            rVar2 = b2.o.A;
            b2.r rVarE = z.n.e(f2.h.c(z1.d(rVar2, 1.0f), p0.f.a(b)), sg.f.P(va.a.S(new t[]{new t(dl.a.t), new t(dl.a.L)}), 0.0f, 0.0f, 14), (t0) null, 6);
            h0.d dVar = h0.i.c;
            b2.g gVar = b2.b.M;
            v vVarA = u.a(dVar, gVar, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            if (z) {
                g0Var.c0(-1264889815);
                c(f, f2, f3, h0.c.G(z1.d(rVar2, 1.0f), 0.0f, 23, 0.0f, 0.0f, 13), null, g0Var, 3072, 16);
                g0Var = g0Var;
                g0Var.r(false);
                z2 = true;
            } else {
                g0Var.c0(-1264530401);
                float f4 = 12;
                b2.r rVarE2 = h0.c.E(z1.d(rVar2, 1.0f), 0.0f, f4, 1);
                b2.h hVar = b2.b.K;
                v1 v1VarA = t1.a(h0.i.a, hVar, g0Var, 48);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                b2.r rVarC2 = b2.a.c(rVarE2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(v1VarA, g0Var, fVar);
                l1.q.I(m1VarM2, g0Var, fVar2);
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                l1.q.I(rVarC2, g0Var, fVar4);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                float f5 = 24;
                b2.r rVarG = h0.c.G(new c1(1.0f, true), f5, 0.0f, 0.0f, 0.0f, 14);
                v1 v1VarA2 = t1.a(h0.i.g(f4), hVar, g0Var, 54);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                b2.r rVarC3 = b2.a.c(rVarG, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(v1VarA2, g0Var, fVar);
                l1.q.I(m1VarM3, g0Var, fVar2);
                a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
                l1.q.I(rVarC3, g0Var, fVar4);
                v vVarA2 = u.a(h0.i.g(2), gVar, g0Var, 6);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                b2.r rVarC4 = b2.a.c(rVar2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA2, g0Var, fVar);
                l1.q.I(m1VarM4, g0Var, fVar2);
                a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
                l1.q.I(rVarC4, g0Var, fVar4);
                e(220, f5, null, 0.0f, g0Var, 54, 12);
                float f6 = 20;
                e(120, f6, null, 0.0f, g0Var, 54, 12);
                z2 = true;
                g0Var.r(true);
                e(f6, f6, null, d, g0Var, 3126, 4);
                g0Var.r(true);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                c(f, f2, f3, h0.c.G(new c1(1.0f, true), 0.0f, 0.0f, f5, 0.0f, 11), b2.b.O, g0Var, 24576, 0);
                g0Var = g0Var;
                g0Var.r(true);
                g0Var.r(false);
            }
            g0Var.r(z2);
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new f(z, rVar2, i, 0);
        }
    }

    public static final void c(final float f, final float f2, final float f3, final b2.r rVar, b2.c cVar, l1.j jVar, final int i, final int i2) {
        b2.c cVar2;
        boolean z;
        final b2.c cVar3;
        r1 r1VarT;
        b2.c cVar4;
        b3.g gVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-458491666);
        int i3 = (g0Var.d(f) ? 4 : 2) | i | (g0Var.d(f2) ? 32 : 16) | (g0Var.d(f3) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= g0Var.g(rVar) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                cVar2 = cVar;
                i3 |= g0Var.g(cVar2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                if (i4 != 0) {
                    cVar4 = b2.b.N;
                } else {
                    cVar4 = cVar2;
                }
                b2.r rVarD = z1.d(rVar, 1.0f);
                v1 v1VarA = t1.a(h0.i.h(15, cVar4), b2.b.L, g0Var, 48);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarD, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
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
                b2.o oVar = b2.o.A;
                int i5 = (i3 >> 3) & 14;
                f(f2, i5, 0, h0.c.G(oVar, 0.0f, f3, 0.0f, 0.0f, 13), g0Var);
                f(f, i3 & 14, 2, null, g0Var);
                f(f2, i5, 0, h0.c.G(oVar, 0.0f, f3, 0.0f, 0.0f, 13), g0Var);
                g0Var.r(true);
                cVar3 = cVar4;
            } else {
                g0Var.V();
                cVar3 = cVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.c(f, f2, f3, rVar, cVar3, (l1.j) obj, l1.q.K(i | 1), i2);
                        return b0.a;
                    }
                };
            }
        }
        i3 |= 24576;
        cVar2 = cVar;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i3 & 1, z)) {
            if (i4 != 0) {
                cVar4 = b2.b.N;
            } else {
                cVar4 = cVar2;
            }
            b2.r rVarD2 = z1.d(rVar, 1.0f);
            v1 v1VarA2 = t1.a(h0.i.h(15, cVar4), b2.b.L, g0Var, 48);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarD2, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, b3.h.f);
            l1.q.I(m1VarM2, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            b2.o oVar2 = b2.o.A;
            int i6 = (i3 >> 3) & 14;
            f(f2, i6, 0, h0.c.G(oVar2, 0.0f, f3, 0.0f, 0.0f, 13), g0Var);
            f(f, i3 & 14, 2, null, g0Var);
            f(f2, i6, 0, h0.c.G(oVar2, 0.0f, f3, 0.0f, 0.0f, 13), g0Var);
            g0Var.r(true);
            cVar3 = cVar4;
        } else {
            g0Var.V();
            cVar3 = cVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k.c(f, f2, f3, rVar, cVar3, (l1.j) obj, l1.q.K(i | 1), i2);
                    return b0.a;
                }
            };
        }
    }

    public static final void d(int i, b2.r rVar, l1.j jVar, boolean z) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-590354003);
        int i2 = (g0Var.h(z) ? 4 : 2) | i | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = ((gm.a) g0Var.k(dl.e.a)) == gm.a.A;
            b2.r rVarD = z1.d(rVar, 1.0f);
            h0.b bVar = h0.i.a;
            v vVarA = u.a(h0.i.g(a), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            b(0, null, g0Var, z2);
            if (z) {
                g0Var.c0(-822491785);
                a(z2 ? 130 : 160, 0, null, g0Var, z2);
                g0Var.r(false);
            } else {
                g0Var.c0(-822318805);
                g0Var.r(false);
            }
            a(z2 ? 160 : 180, 0, null, g0Var, z2);
            a(z2 ? 160 : 180, 0, null, g0Var, z2);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new f(z, rVar, i, 1);
        }
    }

    public static final void e(final float f, final float f2, b2.r rVar, float f3, l1.j jVar, final int i, final int i2) {
        int i3;
        b2.r rVar2;
        int i4;
        float f4;
        int i5;
        boolean z;
        final b2.r rVar3;
        final float f5;
        r1 r1VarT;
        float f6;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-644642286);
        if ((i & 6) == 0) {
            i3 = (g0Var.d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.d(f2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                rVar2 = rVar;
                i3 |= g0Var.g(rVar2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    f4 = f3;
                    if (g0Var.d(f4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (g0Var.S(i3 & 1, z)) {
                    if (i6 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i4 != 0) {
                        f6 = c;
                    } else {
                        f6 = f4;
                    }
                    h0.o.a(rd.a.g0(f6, 0, dl.a.s, z1.n(rVar3, f, f2), true), g0Var, 0);
                    f5 = f6;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    f5 = f4;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            k.e(f, f2, rVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                            return b0.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            f4 = f3;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                if (i6 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                if (i4 != 0) {
                    f6 = c;
                } else {
                    f6 = f4;
                }
                h0.o.a(rd.a.g0(f6, 0, dl.a.s, z1.n(rVar3, f, f2), true), g0Var, 0);
                f5 = f6;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                f5 = f4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.e(f, f2, rVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                        return b0.a;
                    }
                };
            }
        }
        i3 |= 384;
        rVar2 = rVar;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                f4 = f3;
                if (g0Var.d(f4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                if (i6 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                if (i4 != 0) {
                    f6 = c;
                } else {
                    f6 = f4;
                }
                h0.o.a(rd.a.g0(f6, 0, dl.a.s, z1.n(rVar3, f, f2), true), g0Var, 0);
                f5 = f6;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                f5 = f4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k.e(f, f2, rVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                        return b0.a;
                    }
                };
            }
        }
        i3 |= 3072;
        f4 = f3;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i3 & 1, z)) {
            if (i6 != 0) {
                rVar3 = b2.o.A;
            } else {
                rVar3 = rVar2;
            }
            if (i4 != 0) {
                f6 = c;
            } else {
                f6 = f4;
            }
            h0.o.a(rd.a.g0(f6, 0, dl.a.s, z1.n(rVar3, f, f2), true), g0Var, 0);
            f5 = f6;
        } else {
            g0Var.V();
            rVar3 = rVar2;
            f5 = f4;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k.e(f, f2, rVar3, f5, (l1.j) obj, l1.q.K(i | 1), i2);
                    return b0.a;
                }
            };
        }
    }

    public static final void f(float f, int i, int i2, b2.r rVar, l1.j jVar) {
        int i3;
        b2.r rVar2;
        boolean z;
        b2.r rVar3;
        r1 r1VarT;
        b2.r rVar4;
        g0 g0Var = (g0) jVar;
        g0Var.e0(801537889);
        if ((i & 6) == 0) {
            i3 = (g0Var.d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                rVar2 = rVar;
                i3 |= g0Var.g(rVar2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                if (i4 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                h0.o.a(rd.a.g0(f / 2, 0, dl.a.s, z1.m(rVar4, f), true), g0Var, 0);
                rVar3 = rVar4;
            } else {
                g0Var.V();
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new j(f, rVar3, i, i2, 0);
            }
        }
        i3 |= 48;
        rVar2 = rVar;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i3 & 1, z)) {
            if (i4 != 0) {
                rVar4 = b2.o.A;
            } else {
                rVar4 = rVar2;
            }
            h0.o.a(rd.a.g0(f / 2, 0, dl.a.s, z1.m(rVar4, f), true), g0Var, 0);
            rVar3 = rVar4;
        } else {
            g0Var.V();
            rVar3 = rVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new j(f, rVar3, i, i2, 0);
        }
    }
}
