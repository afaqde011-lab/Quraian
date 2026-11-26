package z2;

import com.google.android.gms.cast.Cast;

public abstract class d0 {

    public static final d1 f17098a = new d1(6);

    public static final Object f17099b = new Object();

    public static final void a(v1.c cVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(441837433);
        if (g0Var.S(i10 & 1, (i10 & 3) != 2)) {
            Object objN = g0Var.N();
            Object obj = l1.i.f9868a;
            if (objN == obj) {
                objN = new u0();
                g0Var.n0(objN);
            }
            Object obj2 = (u0) objN;
            Object objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = k.C;
                g0Var.n0(objN2);
            }
            u00.a aVar = (u00.a) objN2;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar);
            } else {
                g0Var.q0();
            }
            if (g0Var.S) {
                g0Var.b(g00.b0.a, new jk.c(18));
            }
            l1.q.I(obj2, g0Var, m.C);
            cVar.invoke(obj2, g0Var, 48);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b2.n(cVar, i10, 8);
        }
    }

    public static final void b(b2.r rVar, u00.n nVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1298353104);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(nVar) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = new v1(d1.B);
                g0Var.n0(objN);
            }
            c((v1) objN, rVar, nVar, g0Var, (i11 << 3) & 1008);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c4.f(rVar, nVar, i10, 1);
        }
    }

    public static final void c(v1 v1Var, b2.r rVar, u00.n nVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-511989831);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(v1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(nVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            int iHashCode = Long.hashCode(g0Var.T);
            l1.e0 e0VarF = l1.q.F(g0Var);
            b2.r rVarC = b2.a.c(rVar, g0Var);
            l1.m1 m1VarM = g0Var.m();
            b3.g gVar = b3.g.C;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1Var, g0Var, v1Var.f17166c);
            l1.q.I(e0VarF, g0Var, v1Var.f17167d);
            l1.q.I(nVar, g0Var, v1Var.f17168e);
            b3.i.f2042c.getClass();
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            g0Var.r(true);
            if (g0Var.C()) {
                g0Var.c0(-1259187287);
                g0Var.r(false);
            } else {
                g0Var.c0(-1259245908);
                boolean zI = g0Var.i(v1Var);
                Object objN = g0Var.N();
                if (zI || objN == l1.i.f9868a) {
                    objN = new q1(v1Var, 0);
                    g0Var.n0(objN);
                }
                l1.q.k((u00.a) objN, g0Var);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new r1(v1Var, rVar, nVar, i10);
        }
    }

    public static final float d(long j9, long j10) {
        return Math.min(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j9 & 4294967295L)));
    }

    public static final float e(k1 k1Var, boolean z10, t[] tVarArr, float f3) {
        float f10 = Float.NaN;
        for (t tVar : tVarArr) {
            float fD = k1Var.d(tVar);
            if (Float.isNaN(f10)) {
                f10 = fD;
            } else if (z10 == (fD > f10)) {
                f10 = fD;
            }
        }
        return Float.isNaN(f10) ? f3 : f10;
    }

    public static final h2.c f(a0 a0Var) {
        a0 a0VarW = a0Var.W();
        return a0VarW != null ? a0VarW.F(a0Var, true) : new h2.c(0.0f, 0.0f, (int) (a0Var.p() >> 32), (int) (a0Var.p() & 4294967295L));
    }

    public static final h2.c g(a0 a0Var, boolean z10) {
        a0 a0VarI = i(a0Var);
        float fP = (int) (a0VarI.p() >> 32);
        float fP2 = (int) (a0VarI.p() & 4294967295L);
        h2.c cVarF = a0VarI.F(a0Var, z10);
        float f3 = cVarF.f6549d;
        float f10 = cVarF.f6548c;
        float f11 = cVarF.f6547b;
        float f12 = cVarF.f6546a;
        if (z10) {
            if (f12 < 0.0f) {
                f12 = 0.0f;
            }
            if (f12 > fP) {
                f12 = fP;
            }
        }
        if (z10) {
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            if (f11 > fP2) {
                f11 = fP2;
            }
        }
        if (z10) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            if (f10 <= fP) {
                fP = f10;
            }
            f10 = fP;
        }
        if (z10) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fP2) {
                fP2 = f3;
            }
            f3 = fP2;
        }
        if (f12 == f10 || f11 == f3) {
            return h2.c.f6545e;
        }
        long jE = a0VarI.e((((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
        long jE2 = a0VarI.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
        long jE3 = a0VarI.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        long jE4 = a0VarI.e((((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jE3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jE & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jE2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jE4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jE3 & 4294967295L));
        return new h2.c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final boolean h(long j9, long j10) {
        return j9 == j10;
    }

    public static final a0 i(a0 a0Var) {
        a0 a0Var2;
        a0 a0VarW = a0Var.W();
        while (true) {
            a0 a0Var3 = a0VarW;
            a0Var2 = a0Var;
            a0Var = a0Var3;
            if (a0Var == null) {
                break;
            }
            a0VarW = a0Var.W();
        }
        b3.p1 p1Var = a0Var2 instanceof b3.p1 ? (b3.p1) a0Var2 : null;
        if (p1Var == null) {
            return a0Var2;
        }
        b3.p1 p1Var2 = p1Var.S;
        while (true) {
            b3.p1 p1Var3 = p1Var2;
            b3.p1 p1Var4 = p1Var;
            p1Var = p1Var3;
            if (p1Var == null) {
                return p1Var4;
            }
            p1Var2 = p1Var.S;
        }
    }

    public static final Object j(v0 v0Var) {
        Object objU = v0Var.U();
        e0 e0Var = objU instanceof e0 ? (e0) objU : null;
        if (e0Var != null) {
            return e0Var.O;
        }
        return null;
    }

    public static final b3.v0 k(b3.v0 v0Var) {
        b3.l0 l0VarX = v0Var.O.O;
        while (true) {
            b3.l0 l0VarX2 = l0VarX.x();
            if ((l0VarX2 != null ? l0VarX2.I : null) == null) {
                b3.v0 v0VarX1 = ((b3.p1) l0VarX.f2059g0.E).x1();
                kotlin.jvm.internal.m.b(v0VarX1);
                return v0VarX1;
            }
            b3.l0 l0VarX3 = l0VarX.x();
            b3.l0 l0Var = l0VarX3 != null ? l0VarX3.I : null;
            kotlin.jvm.internal.m.b(l0Var);
            if (l0Var.H) {
                l0VarX = l0VarX.x();
                kotlin.jvm.internal.m.b(l0VarX);
            } else {
                b3.l0 l0VarX4 = l0VarX.x();
                kotlin.jvm.internal.m.b(l0VarX4);
                l0VarX = l0VarX4.I;
                kotlin.jvm.internal.m.b(l0VarX);
            }
        }
    }

    public static final b2.r l(b2.r rVar, u00.o oVar) {
        return rVar.V(new b0(oVar));
    }

    public static final b2.r m(b2.r rVar, Object obj) {
        return rVar.V(new c0(obj));
    }

    public static final b2.r n(b2.r rVar, u00.k kVar) {
        return rVar.V(new e1(kVar));
    }

    public static final b2.r o(b2.r rVar, u00.k kVar) {
        return rVar.V(new g1(kVar));
    }

    public static final long p(long j9, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * Float.intBitsToFloat((int) (j9 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & 4294967295L)) * Float.intBitsToFloat((int) (j9 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
