package qz;

import a30.x;
import b2.r;
import b3.g;
import b3.h;
import b3.i;
import c4.v;
import com.google.android.gms.internal.measurement.x5;
import h0.o;
import h0.z1;
import i2.b0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import qd.s0;
import u00.n;
import z2.w0;

public abstract class d {
    public static final float a = 560;
    public static final float b = 640;

    public static final void a(final float f, final float f2, final u00.a onDismiss, boolean z, long j, boolean z2, final v1.c cVar, j jVar, final int i, final int i2) {
        int i3;
        final boolean z3;
        final long j2;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        final boolean z6;
        r1 r1VarT;
        final boolean z7;
        final boolean z8;
        final long j3;
        int i6;
        m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1742123358);
        if ((i & 6) == 0) {
            i3 = (g0Var.d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.d(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= g0Var.i(onDismiss) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                z3 = z;
                i3 |= g0Var.h(z3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j2 = j;
                    int i8 = g0Var.f(j2) ? 16384 : 8192;
                    i3 |= i8;
                } else {
                    j2 = j;
                }
                i3 |= i8;
            } else {
                j2 = j;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z4 = z2;
                    if (g0Var.h(z4)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((1572864 & i) != 0) {
                    if (g0Var.i(cVar)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i3 |= i6;
                }
                if ((599187 & i3) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (g0Var.S(i3 & 1, z5)) {
                    g0Var.X();
                    if ((i & 1) != 0 || g0Var.A()) {
                        boolean z9 = i7 == 0 ? z3 : false;
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j2 = dl.a.L;
                        }
                        z7 = i4 == 0 ? z4 : true;
                        z8 = z9;
                        j3 = j2;
                    } else {
                        g0Var.V();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        z8 = z3;
                        j3 = j2;
                        z7 = z4;
                    }
                    g0Var.s();
                    s0.G(onDismiss, new v(false, false, false, false, 231), v1.d.d(-1317909767, new n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            g0 g0Var2 = (j) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            boolean z11 = (iIntValue & 3) != 2;
                            g0 g0Var3 = g0Var2;
                            x xVar = g0Var3.a;
                            if (g0Var3.S(iIntValue & 1, z11)) {
                                float f3 = 24;
                                r rVarC = h0.c.C(h0.c.M(z1.c, h0.c.f), f3);
                                w0 w0VarD = o.d(b2.b.E, false);
                                int iHashCode = Long.hashCode(g0Var3.T);
                                m1 m1VarM = g0Var3.m();
                                r rVarC2 = b2.a.c(rVarC, g0Var2);
                                i.c.getClass();
                                g gVar = h.b;
                                g0Var3.g0();
                                if (g0Var3.S) {
                                    g0Var3.l(gVar);
                                } else {
                                    g0Var3.q0();
                                }
                                b3.f fVar = h.f;
                                q.I(w0VarD, g0Var2, fVar);
                                b3.f fVar2 = h.e;
                                q.I(m1VarM, g0Var2, fVar2);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                b3.f fVar3 = h.g;
                                q.I(numValueOf, g0Var2, fVar3);
                                b3.e eVar = h.h;
                                q.E(g0Var2, eVar);
                                b3.f fVar4 = h.d;
                                q.I(rVarC2, g0Var2, fVar4);
                                boolean z12 = z8;
                                float f4 = f;
                                float f5 = f2;
                                r rVarG = b2.o.A;
                                r rVarF = z.n.f(f2.h.c(z12 ? z1.g(z1.q(rVarG, f4), 0.0f, f5, 1) : z1.g(z1.d(z1.s(rVarG, 0.0f, f4, 1), 1.0f), 0.0f, f5, 1), p0.f.a(f3)), j3, b0.b);
                                if (z7) {
                                    rVarG = z.n.g(rVarG, 1, dl.a.Y, p0.f.a(f3));
                                }
                                r rVarV = rVarF.V(rVarG);
                                w0 w0VarD2 = o.d(b2.b.A, false);
                                int iHashCode2 = Long.hashCode(g0Var3.T);
                                m1 m1VarM2 = g0Var3.m();
                                r rVarC3 = b2.a.c(rVarV, g0Var2);
                                g0Var3.g0();
                                if (g0Var3.S) {
                                    g0Var3.l(gVar);
                                } else {
                                    g0Var3.q0();
                                }
                                q.I(w0VarD2, g0Var2, fVar);
                                q.I(m1VarM2, g0Var2, fVar2);
                                x5.u(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                                q.I(rVarC3, g0Var2, fVar4);
                                cVar.invoke(g0Var2, 0);
                                g0Var3.r(true);
                                g0Var3.r(true);
                            } else {
                                g0Var3.V();
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, ((i3 >> 6) & 14) | 432, 0);
                    z3 = z8;
                    j2 = j3;
                    z6 = z7;
                } else {
                    g0Var.V();
                    z6 = z4;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            d.a(f, f2, onDismiss, z3, j2, z6, cVar, (j) obj, q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            z4 = z2;
            if ((1572864 & i) != 0) {
                if (g0Var.i(cVar)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((599187 & i3) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (g0Var.S(i3 & 1, z5)) {
                g0Var.X();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = dl.a.L;
                    }
                    if (i4 == 0) {
                    }
                    z8 = z9;
                    j3 = j2;
                } else {
                    if (i7 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = dl.a.L;
                    }
                    if (i4 == 0) {
                    }
                    z8 = z9;
                    j3 = j2;
                }
                g0Var.s();
                s0.G(onDismiss, new v(false, false, false, false, 231), v1.d.d(-1317909767, new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        g0 g0Var2 = (j) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        boolean z11 = (iIntValue & 3) != 2;
                        g0 g0Var3 = g0Var2;
                        x xVar = g0Var3.a;
                        if (g0Var3.S(iIntValue & 1, z11)) {
                            float f3 = 24;
                            r rVarC = h0.c.C(h0.c.M(z1.c, h0.c.f), f3);
                            w0 w0VarD = o.d(b2.b.E, false);
                            int iHashCode = Long.hashCode(g0Var3.T);
                            m1 m1VarM = g0Var3.m();
                            r rVarC2 = b2.a.c(rVarC, g0Var2);
                            i.c.getClass();
                            g gVar = h.b;
                            g0Var3.g0();
                            if (g0Var3.S) {
                                g0Var3.l(gVar);
                            } else {
                                g0Var3.q0();
                            }
                            b3.f fVar = h.f;
                            q.I(w0VarD, g0Var2, fVar);
                            b3.f fVar2 = h.e;
                            q.I(m1VarM, g0Var2, fVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            b3.f fVar3 = h.g;
                            q.I(numValueOf, g0Var2, fVar3);
                            b3.e eVar = h.h;
                            q.E(g0Var2, eVar);
                            b3.f fVar4 = h.d;
                            q.I(rVarC2, g0Var2, fVar4);
                            boolean z12 = z8;
                            float f4 = f;
                            float f5 = f2;
                            r rVarG = b2.o.A;
                            r rVarF = z.n.f(f2.h.c(z12 ? z1.g(z1.q(rVarG, f4), 0.0f, f5, 1) : z1.g(z1.d(z1.s(rVarG, 0.0f, f4, 1), 1.0f), 0.0f, f5, 1), p0.f.a(f3)), j3, b0.b);
                            if (z7) {
                                rVarG = z.n.g(rVarG, 1, dl.a.Y, p0.f.a(f3));
                            }
                            r rVarV = rVarF.V(rVarG);
                            w0 w0VarD2 = o.d(b2.b.A, false);
                            int iHashCode2 = Long.hashCode(g0Var3.T);
                            m1 m1VarM2 = g0Var3.m();
                            r rVarC3 = b2.a.c(rVarV, g0Var2);
                            g0Var3.g0();
                            if (g0Var3.S) {
                                g0Var3.l(gVar);
                            } else {
                                g0Var3.q0();
                            }
                            q.I(w0VarD2, g0Var2, fVar);
                            q.I(m1VarM2, g0Var2, fVar2);
                            x5.u(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                            q.I(rVarC3, g0Var2, fVar4);
                            cVar.invoke(g0Var2, 0);
                            g0Var3.r(true);
                            g0Var3.r(true);
                        } else {
                            g0Var3.V();
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, ((i3 >> 6) & 14) | 432, 0);
                z3 = z8;
                j2 = j3;
                z6 = z7;
            } else {
                g0Var.V();
                z6 = z4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d.a(f, f2, onDismiss, z3, j2, z6, cVar, (j) obj, q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 3072;
        z3 = z;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j2 = j;
                if (g0Var.f(j2)) {
                }
                i3 |= i8;
            } else {
                j2 = j;
            }
            i3 |= i8;
        } else {
            j2 = j;
        }
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z4 = z2;
                if (g0Var.h(z4)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((1572864 & i) != 0) {
                if (g0Var.i(cVar)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
            }
            if ((599187 & i3) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (g0Var.S(i3 & 1, z5)) {
                g0Var.X();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = dl.a.L;
                    }
                    if (i4 == 0) {
                    }
                    z8 = z9;
                    j3 = j2;
                } else {
                    if (i7 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        j2 = dl.a.L;
                    }
                    if (i4 == 0) {
                    }
                    z8 = z9;
                    j3 = j2;
                }
                g0Var.s();
                s0.G(onDismiss, new v(false, false, false, false, 231), v1.d.d(-1317909767, new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        g0 g0Var2 = (j) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        boolean z11 = (iIntValue & 3) != 2;
                        g0 g0Var3 = g0Var2;
                        x xVar = g0Var3.a;
                        if (g0Var3.S(iIntValue & 1, z11)) {
                            float f3 = 24;
                            r rVarC = h0.c.C(h0.c.M(z1.c, h0.c.f), f3);
                            w0 w0VarD = o.d(b2.b.E, false);
                            int iHashCode = Long.hashCode(g0Var3.T);
                            m1 m1VarM = g0Var3.m();
                            r rVarC2 = b2.a.c(rVarC, g0Var2);
                            i.c.getClass();
                            g gVar = h.b;
                            g0Var3.g0();
                            if (g0Var3.S) {
                                g0Var3.l(gVar);
                            } else {
                                g0Var3.q0();
                            }
                            b3.f fVar = h.f;
                            q.I(w0VarD, g0Var2, fVar);
                            b3.f fVar2 = h.e;
                            q.I(m1VarM, g0Var2, fVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            b3.f fVar3 = h.g;
                            q.I(numValueOf, g0Var2, fVar3);
                            b3.e eVar = h.h;
                            q.E(g0Var2, eVar);
                            b3.f fVar4 = h.d;
                            q.I(rVarC2, g0Var2, fVar4);
                            boolean z12 = z8;
                            float f4 = f;
                            float f5 = f2;
                            r rVarG = b2.o.A;
                            r rVarF = z.n.f(f2.h.c(z12 ? z1.g(z1.q(rVarG, f4), 0.0f, f5, 1) : z1.g(z1.d(z1.s(rVarG, 0.0f, f4, 1), 1.0f), 0.0f, f5, 1), p0.f.a(f3)), j3, b0.b);
                            if (z7) {
                                rVarG = z.n.g(rVarG, 1, dl.a.Y, p0.f.a(f3));
                            }
                            r rVarV = rVarF.V(rVarG);
                            w0 w0VarD2 = o.d(b2.b.A, false);
                            int iHashCode2 = Long.hashCode(g0Var3.T);
                            m1 m1VarM2 = g0Var3.m();
                            r rVarC3 = b2.a.c(rVarV, g0Var2);
                            g0Var3.g0();
                            if (g0Var3.S) {
                                g0Var3.l(gVar);
                            } else {
                                g0Var3.q0();
                            }
                            q.I(w0VarD2, g0Var2, fVar);
                            q.I(m1VarM2, g0Var2, fVar2);
                            x5.u(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                            q.I(rVarC3, g0Var2, fVar4);
                            cVar.invoke(g0Var2, 0);
                            g0Var3.r(true);
                            g0Var3.r(true);
                        } else {
                            g0Var3.V();
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, ((i3 >> 6) & 14) | 432, 0);
                z3 = z8;
                j2 = j3;
                z6 = z7;
            } else {
                g0Var.V();
                z6 = z4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d.a(f, f2, onDismiss, z3, j2, z6, cVar, (j) obj, q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 196608;
        z4 = z2;
        if ((1572864 & i) != 0) {
            if (g0Var.i(cVar)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((599187 & i3) != 599186) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (g0Var.S(i3 & 1, z5)) {
            g0Var.X();
            if ((i & 1) != 0) {
                if (i7 == 0) {
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j2 = dl.a.L;
                }
                if (i4 == 0) {
                }
                z8 = z9;
                j3 = j2;
            } else {
                if (i7 == 0) {
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    j2 = dl.a.L;
                }
                if (i4 == 0) {
                }
                z8 = z9;
                j3 = j2;
            }
            g0Var.s();
            s0.G(onDismiss, new v(false, false, false, false, 231), v1.d.d(-1317909767, new n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    g0 g0Var2 = (j) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    boolean z11 = (iIntValue & 3) != 2;
                    g0 g0Var3 = g0Var2;
                    x xVar = g0Var3.a;
                    if (g0Var3.S(iIntValue & 1, z11)) {
                        float f3 = 24;
                        r rVarC = h0.c.C(h0.c.M(z1.c, h0.c.f), f3);
                        w0 w0VarD = o.d(b2.b.E, false);
                        int iHashCode = Long.hashCode(g0Var3.T);
                        m1 m1VarM = g0Var3.m();
                        r rVarC2 = b2.a.c(rVarC, g0Var2);
                        i.c.getClass();
                        g gVar = h.b;
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar);
                        } else {
                            g0Var3.q0();
                        }
                        b3.f fVar = h.f;
                        q.I(w0VarD, g0Var2, fVar);
                        b3.f fVar2 = h.e;
                        q.I(m1VarM, g0Var2, fVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b3.f fVar3 = h.g;
                        q.I(numValueOf, g0Var2, fVar3);
                        b3.e eVar = h.h;
                        q.E(g0Var2, eVar);
                        b3.f fVar4 = h.d;
                        q.I(rVarC2, g0Var2, fVar4);
                        boolean z12 = z8;
                        float f4 = f;
                        float f5 = f2;
                        r rVarG = b2.o.A;
                        r rVarF = z.n.f(f2.h.c(z12 ? z1.g(z1.q(rVarG, f4), 0.0f, f5, 1) : z1.g(z1.d(z1.s(rVarG, 0.0f, f4, 1), 1.0f), 0.0f, f5, 1), p0.f.a(f3)), j3, b0.b);
                        if (z7) {
                            rVarG = z.n.g(rVarG, 1, dl.a.Y, p0.f.a(f3));
                        }
                        r rVarV = rVarF.V(rVarG);
                        w0 w0VarD2 = o.d(b2.b.A, false);
                        int iHashCode2 = Long.hashCode(g0Var3.T);
                        m1 m1VarM2 = g0Var3.m();
                        r rVarC3 = b2.a.c(rVarV, g0Var2);
                        g0Var3.g0();
                        if (g0Var3.S) {
                            g0Var3.l(gVar);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(w0VarD2, g0Var2, fVar);
                        q.I(m1VarM2, g0Var2, fVar2);
                        x5.u(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
                        q.I(rVarC3, g0Var2, fVar4);
                        cVar.invoke(g0Var2, 0);
                        g0Var3.r(true);
                        g0Var3.r(true);
                    } else {
                        g0Var3.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, ((i3 >> 6) & 14) | 432, 0);
            z3 = z8;
            j2 = j3;
            z6 = z7;
        } else {
            g0Var.V();
            z6 = z4;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d.a(f, f2, onDismiss, z3, j2, z6, cVar, (j) obj, q.K(i | 1), i2);
                    return g00.b0.a;
                }
            };
        }
    }
}
