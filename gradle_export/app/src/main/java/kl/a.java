package kl;

import b2.o;
import b2.r;
import b3.g;
import b3.h;
import b3.i;
import com.google.android.gms.internal.measurement.y3;
import h0.b;
import h0.c;
import h0.m2;
import h0.t0;
import h0.z1;
import i2.b0;
import i2.t;
import java.util.WeakHashMap;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import p0.f;
import qd.s0;
import z.n;
import z2.w0;

public abstract class a {
    public static final float a = 36;
    public static final float b = 5;

    public static final void a(r rVar, boolean z, j jVar, final int i, final int i2) {
        r rVar2;
        int i3;
        boolean z2;
        boolean z3;
        final r rVar3;
        final boolean z4;
        r1 r1VarT;
        r rVar4;
        t0 t0VarL;
        r rVarB;
        g gVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1960765165);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i | (g0Var.g(rVar2) ? 4 : 2);
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= g0Var.h(z2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i3 & 1, z3)) {
                rVar4 = o.A;
                if (i4 != 0) {
                    rVar2 = rVar4;
                }
                if (i5 != 0) {
                    z2 = true;
                }
                WeakHashMap weakHashMap = m2.w;
                t0VarL = c.l(b.e(g0Var).o, g0Var);
                if (z2) {
                    rVarB = c.B(rVar4, t0VarL);
                } else {
                    rVarB = rVar4;
                }
                r rVarG = c.G(rVar2.V(rVarB), 0.0f, 8, 0.0f, 0.0f, 13);
                w0 w0VarD = h0.o.d(b2.b.B, false);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                r rVarC = b2.a.c(rVarG, g0Var);
                i.c.getClass();
                gVar = h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD, g0Var, h.f);
                q.I(m1VarM, g0Var, h.e);
                q.I(Integer.valueOf(iHashCode), g0Var, h.g);
                q.E(g0Var, h.h);
                q.I(rVarC, g0Var, h.d);
                h0.o.a(n.f(f2.h.c(z1.e(z1.q(rVar4, a), b), f.a(32)), t.b(0.35f, dl.a.i), b0.b), g0Var, 0);
                g0Var.r(true);
            } else {
                g0Var.V();
            }
            rVar3 = rVar2;
            z4 = z2;
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                final int i6 = 2;
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = i6;
                        l1.j jVar2 = (l1.j) obj;
                        ((Integer) obj2).getClass();
                        switch (i7) {
                            case 0:
                                y3.f(rVar3, z4, jVar2, l1.q.K(i | 1), i2);
                                break;
                            case 1:
                                s0.J(rVar3, z4, jVar2, l1.q.K(i | 1), i2);
                                break;
                            default:
                                kl.a.a(rVar3, z4, jVar2, l1.q.K(i | 1), i2);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var.S(i3 & 1, z3)) {
            rVar4 = o.A;
            if (i4 != 0) {
                rVar2 = rVar4;
            }
            if (i5 != 0) {
                z2 = true;
            }
            WeakHashMap weakHashMap2 = m2.w;
            t0VarL = c.l(b.e(g0Var).o, g0Var);
            if (z2) {
                rVarB = c.B(rVar4, t0VarL);
            } else {
                rVarB = rVar4;
            }
            r rVarG2 = c.G(rVar2.V(rVarB), 0.0f, 8, 0.0f, 0.0f, 13);
            w0 w0VarD2 = h0.o.d(b2.b.B, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarG2, g0Var);
            i.c.getClass();
            gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD2, g0Var, h.f);
            q.I(m1VarM2, g0Var, h.e);
            q.I(Integer.valueOf(iHashCode2), g0Var, h.g);
            q.E(g0Var, h.h);
            q.I(rVarC2, g0Var, h.d);
            h0.o.a(n.f(f2.h.c(z1.e(z1.q(rVar4, a), b), f.a(32)), t.b(0.35f, dl.a.i), b0.b), g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        rVar3 = rVar2;
        z4 = z2;
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i7 = 2;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = i7;
                    l1.j jVar2 = (l1.j) obj;
                    ((Integer) obj2).getClass();
                    switch (i8) {
                        case 0:
                            y3.f(rVar3, z4, jVar2, l1.q.K(i | 1), i2);
                            break;
                        case 1:
                            s0.J(rVar3, z4, jVar2, l1.q.K(i | 1), i2);
                            break;
                        default:
                            kl.a.a(rVar3, z4, jVar2, l1.q.K(i | 1), i2);
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }
}
