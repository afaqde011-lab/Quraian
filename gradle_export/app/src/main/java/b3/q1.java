package b3;

import com.google.android.gms.cast.Cast;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public abstract class q1 {

    public static final u.c0 f2124a;

    static {
        u.c0 c0Var = u.n0.f14879a;
        f2124a = new u.c0();
    }

    public static final void a(b2.q qVar, int i10, int i11) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (!(qVar instanceof l)) {
            b(qVar, i10 & qVar.C, i11);
            return;
        }
        l lVar = (l) qVar;
        int i12 = lVar.O;
        b(qVar, i12 & i10, i11);
        int i13 = (~i12) & i10;
        for (b2.q qVar2 = lVar.P; qVar2 != null; qVar2 = qVar2.F) {
            a(qVar2, i13, i11);
        }
    }

    public static final void b(b2.q qVar, int i10, int i11) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        if (i11 != 0 || qVar.q1()) {
            if ((i10 & 2) != 0 && (qVar instanceof y)) {
                m.n((y) qVar);
                if (i11 == 2) {
                    m.v(qVar, 2).L1();
                }
            }
            if ((i10 & Cast.MAX_NAMESPACE_LENGTH) != 0 && i11 != 2) {
                m.y(qVar).G();
            }
            if ((4194304 & i10) != 0 && i11 != 2) {
                m.y(qVar).W(false);
            }
            if ((i10 & 256) != 0 && (qVar instanceof p)) {
                if (i11 == 1) {
                    l0 l0VarY = m.y(qVar);
                    l0VarY.c0(l0VarY.f2069q0 + 1);
                } else if (i11 == 2) {
                    l0 l0VarY2 = m.y(qVar);
                    l0VarY2.c0(l0VarY2.f2069q0 - 1);
                }
                if (i11 != 2) {
                    l0 l0VarY3 = m.y(qVar);
                    if (l0VarY3.f2069q0 != 0 && !l0VarY3.q() && !l0VarY3.r() && !l0VarY3.f2068p0) {
                        c3.z zVar = (c3.z) p0.a(l0VarY3);
                        a1.u0 u0Var = zVar.f2819y0.f1993e;
                        u0Var.getClass();
                        if (l0VarY3.f2069q0 > 0) {
                            ((m1.e) u0Var.B).b(l0VarY3);
                            l0VarY3.f2068p0 = true;
                        }
                        zVar.F(null);
                    }
                }
            }
            if ((i10 & 4) != 0 && (qVar instanceof o)) {
                m.m((o) qVar);
            }
            if ((i10 & 8) != 0 && (qVar instanceof j2)) {
                m.y(qVar).S = true;
            }
            if ((i10 & 64) != 0 && (qVar instanceof c2)) {
                q0 q0Var = m.y((c2) qVar).f2060h0;
                q0Var.f2122p.Q = true;
                y0 y0Var = q0Var.f2123q;
                if (y0Var != null) {
                    y0Var.W = true;
                }
            }
            if ((i10 & 2048) != 0 && (qVar instanceof g2.s)) {
                g2.s sVar = (g2.s) qVar;
                d.f2024b = null;
                sVar.q0(d.f2023a);
                if (d.f2024b != null) {
                    b2.q qVar2 = (b2.q) sVar;
                    if (!qVar2.A.N) {
                        y2.a.c("visitChildren called on an unattached node");
                    }
                    m1.e eVar = new m1.e(0, new b2.q[16]);
                    b2.q qVar3 = qVar2.A;
                    b2.q qVar4 = qVar3.F;
                    if (qVar4 == null) {
                        m.b(eVar, qVar3);
                    } else {
                        eVar.b(qVar4);
                    }
                    while (true) {
                        int i12 = eVar.C;
                        if (i12 == 0) {
                            break;
                        }
                        b2.q qVarE = (b2.q) eVar.k(i12 - 1);
                        if ((qVarE.D & 1024) == 0) {
                            m.b(eVar, qVarE);
                        } else {
                            while (qVarE != null) {
                                if ((qVarE.C & 1024) != 0) {
                                    m1.e eVar2 = null;
                                    while (qVarE != null) {
                                        if (qVarE instanceof g2.a0) {
                                            g2.a0 a0Var = (g2.a0) qVarE;
                                            g2.i iVar = ((g2.n) ((c3.z) m.z(a0Var)).getFocusOwner()).f6074d;
                                            if (iVar.f6068c.a(a0Var)) {
                                                iVar.a();
                                            }
                                        } else if ((qVarE.C & 1024) != 0 && (qVarE instanceof l)) {
                                            int i13 = 0;
                                            for (b2.q qVar5 = ((l) qVarE).P; qVar5 != null; qVar5 = qVar5.F) {
                                                if ((qVar5.C & 1024) != 0) {
                                                    i13++;
                                                    if (i13 == 1) {
                                                        qVarE = qVar5;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new m1.e(0, new b2.q[16]);
                                                        }
                                                        if (qVarE != null) {
                                                            eVar2.b(qVarE);
                                                            qVarE = null;
                                                        }
                                                        eVar2.b(qVar5);
                                                    }
                                                }
                                            }
                                            if (i13 == 1) {
                                            }
                                        }
                                        qVarE = m.e(eVar2);
                                    }
                                    break;
                                }
                                qVarE = qVarE.F;
                            }
                        }
                    }
                }
            }
            if ((i10 & 4096) != 0 && (qVar instanceof g2.g)) {
                g2.g gVar = (g2.g) qVar;
                g2.i iVar2 = ((g2.n) ((c3.z) m.z(gVar)).getFocusOwner()).f6074d;
                if (iVar2.f6069d.a(gVar)) {
                    iVar2.a();
                }
            }
            if ((i10 & 2097152) != 0 && (qVar instanceof s2.c) && i11 == 2) {
                ((s2.c) qVar).C0();
            }
        }
    }

    public static final void c(b2.q qVar) {
        if (!qVar.N) {
            y2.a.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(qVar, -1, 0);
    }

    public static final int d(b2.p pVar) {
        int i10 = pVar instanceof z2.g0 ? 3 : 1;
        if (pVar instanceof f2.g) {
            i10 |= 4;
        }
        if (pVar instanceof j3.p) {
            i10 |= 8;
        }
        if (pVar instanceof v2.y) {
            i10 |= 16;
        }
        if (pVar instanceof b1.h) {
            i10 |= 256;
        }
        if (pVar instanceof z2.i1) {
            i10 |= 64;
        }
        return pVar instanceof g3.a ? 524288 | i10 : i10;
    }

    public static final int e(b2.q qVar) {
        int i10 = qVar.C;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = qVar.getClass();
        u.c0 c0Var = f2124a;
        int iD = c0Var.d(cls);
        if (iD >= 0) {
            return c0Var.f14833c[iD];
        }
        int i11 = qVar instanceof y ? 3 : 1;
        if (qVar instanceof o) {
            i11 |= 4;
        }
        if (qVar instanceof j2) {
            i11 |= 8;
        }
        if (qVar instanceof e2) {
            i11 |= 16;
        }
        if (qVar instanceof a3.c) {
            i11 |= 32;
        }
        if (qVar instanceof c2) {
            i11 |= 64;
        }
        if (qVar instanceof x) {
            i11 |= 4194432;
        } else if (qVar instanceof d1) {
            i11 |= Cast.MAX_NAMESPACE_LENGTH;
        }
        if (qVar instanceof p) {
            i11 |= 256;
        }
        if (qVar instanceof w.f1) {
            i11 |= 512;
        }
        if (qVar instanceof g2.a0) {
            i11 |= 1024;
        }
        if (qVar instanceof g2.s) {
            i11 |= 2048;
        }
        if (qVar instanceof g2.g) {
            i11 |= 4096;
        }
        if (qVar instanceof t2.e) {
            i11 |= 8192;
        }
        if (qVar instanceof c3.n) {
            i11 |= 16384;
        }
        if (qVar instanceof j) {
            i11 |= 32768;
        }
        if (qVar instanceof o2) {
            i11 |= 262144;
        }
        if (qVar instanceof g3.a) {
            i11 |= 524288;
        }
        if (qVar instanceof s2.c) {
            i11 |= 2097152;
        }
        if (qVar instanceof l0.t) {
            i11 |= 8388608;
        }
        c0Var.g(i11, cls);
        return i11;
    }

    public static final int f(b2.q qVar) {
        if (!(qVar instanceof l)) {
            return e(qVar);
        }
        l lVar = (l) qVar;
        int iF = lVar.O;
        for (b2.q qVar2 = lVar.P; qVar2 != null; qVar2 = qVar2.F) {
            iF |= f(qVar2);
        }
        return iF;
    }

    public static final boolean g(int i10) {
        return ((i10 & Cast.MAX_NAMESPACE_LENGTH) != 0) | ((i10 & 4194304) != 0);
    }
}
