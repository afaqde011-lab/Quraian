package c0;

import b2.o;
import b2.r;
import c4.d0;
import c4.n;
import com.google.android.gms.cast.Cast;
import h0.c1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.w;
import h0.x0;
import h0.z1;
import i2.b0;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import l1.r1;
import l1.t;
import m3.r0;
import u00.k;
import z2.w0;

public abstract class i {

    public static final c f2597a;

    static {
        d0 d0Var = d0.A;
        t tVar = n.f2838a;
        d0 d0Var2 = d0.A;
        d0 d0Var3 = d0.A;
        long j9 = i2.t.f7163c;
        long j10 = i2.t.f7162b;
        f2597a = new c(j9, j10, j10, i2.t.b(0.38f, j10), i2.t.b(0.38f, j10));
    }

    public static final void a(c cVar, r rVar, v1.c cVar2, j jVar, int i10) {
        int i11;
        r rVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-527864079);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            rVar2 = rVar;
            i11 |= g0Var.g(rVar2) ? 32 : 16;
        } else {
            rVar2 = rVar;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(cVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            r rVarF = z.n.f(f2.h.j(rVar2, e.f2586d, p0.f.a(e.f2587e), 0L, 0L, 28), cVar.f2577a, b0.f7111b);
            x0 x0Var = x0.A;
            r rVarP = z.n.p(h0.c.E(h0.c.K(rVarF), 0.0f, e.f2591i, 1), z.n.l(g0Var), false, 14);
            int i12 = (i11 << 3) & 7168;
            v vVarA = u.a(h0.i.f6408c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarP, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, b3.h.f2039f);
            q.I(m1VarM, g0Var, b3.h.f2038e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            q.E(g0Var, b3.h.f2041h);
            q.I(rVarC, g0Var, b3.h.f2037d);
            cVar2.invoke(w.f6474a, g0Var, Integer.valueOf(((i12 >> 6) & 112) | 6));
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(i10, 2, cVar, rVar, cVar2);
        }
    }

    public static final void b(r rVar, c cVar, k kVar, j jVar, int i10, int i11) {
        int i12;
        int i13;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-625529233);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else {
            i12 = (g0Var.g(rVar) ? 4 : 2) | i10;
        }
        int i15 = i11 & 2;
        if (i15 != 0) {
            i13 = i12 | 48;
        } else {
            i13 = i12 | (g0Var.g(cVar) ? 32 : 16);
        }
        int i16 = i13 | (g0Var.i(kVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i16 & 1, (i16 & 147) != 146)) {
            if (i14 != 0) {
                rVar = o.A;
            }
            if (i15 != 0) {
                cVar = f2597a;
            }
            a(cVar, rVar, v1.d.d(-250345048, new f(kVar, cVar, 0), g0Var), g0Var, ((i16 << 3) & 112) | ((i16 >> 3) & 14) | 384);
        } else {
            g0Var.V();
        }
        r rVar2 = rVar;
        c cVar2 = cVar;
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(rVar2, cVar2, kVar, i10, i11, 1);
        }
    }

    public static final void c(String str, final boolean z10, c cVar, r rVar, u00.o oVar, final u00.a aVar, j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-2001167027);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.h(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(cVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.g(rVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.i(oVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.i(aVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        final int i12 = 0;
        if (g0Var.S(i11 & 1, (74899 & i11) != 74898)) {
            b2.h hVar = e.f2588f;
            h0.b bVar = h0.i.f6406a;
            float f3 = e.f2590h;
            h0.f fVarG = h0.i.g(f3);
            boolean z11 = ((i11 & 112) == 32) | ((458752 & i11) == 131072);
            Object objN = g0Var.N();
            if (z11 || objN == l1.i.f9868a) {
                objN = new u00.a() {
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                if (z10) {
                                    aVar.invoke();
                                }
                                break;
                            case 1:
                                if (!z10) {
                                    aVar.invoke();
                                }
                                break;
                            case 2:
                                if (!z10) {
                                    aVar.invoke();
                                }
                                break;
                            case 3:
                                if (!z10) {
                                    aVar.invoke();
                                }
                                break;
                            default:
                                if (!z10) {
                                    aVar.invoke();
                                }
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN);
            }
            r rVarD = z1.d(androidx.compose.foundation.b.c(str, (u00.a) objN, rVar, z10, 12), 1.0f);
            float f10 = e.f2583a;
            float f11 = e.f2584b;
            float f12 = e.f2585c;
            r rVarE = h0.c.E(z1.o(rVarD, f10, f12, f11, f12), f3, 0.0f, 2);
            v1 v1VarA = t1.a(fVarG, hVar, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarE, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f2039f;
            q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.f2038e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.f2040g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.f2041h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.f2037d;
            q.I(rVarC, g0Var, fVar4);
            if (oVar == null) {
                g0Var.c0(-1597947094);
                g0Var.r(false);
            } else {
                g0Var.c0(-1597947093);
                float f13 = e.f2592j;
                r rVarK = z1.k(o.A, f13, 0.0f, f13, f13, 2);
                w0 w0VarD = h0.o.d(b2.b.A, false);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC2 = b2.a.c(rVarK, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD, g0Var, fVar);
                q.I(m1VarM2, g0Var, fVar2);
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC2, g0Var, fVar4);
                oVar.invoke(new i2.t(z10 ? cVar.f2579c : cVar.f2581e), g0Var, 0);
                g0Var.r(true);
                g0Var.r(false);
            }
            r0 r0Var = new r0(z10 ? cVar.f2578b : cVar.f2580d, e.m, e.f2594n, null, e.f2596p, 0L, e.f2589g, 0, e.f2595o, null, 16613240);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            q0.q.d(str, new c1(1.0f, true), r0Var, null, 0, false, 1, 0, g0Var, (i11 & 14) | 1572864, 952);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new h(str, z10, cVar, rVar, oVar, aVar, i10);
        }
    }
}
