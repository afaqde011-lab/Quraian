package gv;

import g1.g2;
import l1.p2;
import w.b2;

public abstract class v {
    public static final float a = 16;

    public static final void a(bv.o1 uiState, u00.k kVar, kk.c cVar, b2.r rVar, boolean z, boolean z2, l1.j jVar, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        boolean z6;
        boolean z7;
        l1.r1 r1VarT;
        boolean z8;
        boolean z9;
        long jB;
        float f;
        p2 p2VarB;
        Object objN;
        Object obj;
        l1.y0 y0Var;
        Object objN2;
        l1.y0 y0Var2;
        Object objN3;
        l1.y0 y0Var3;
        int iR0;
        Object objN4;
        b3.g gVar;
        b1.i iVar;
        Object objN5;
        int i6;
        bv.o1 o1Var;
        Object objN6;
        l1.y0 y0Var4;
        boolean zE;
        Object objN7;
        boolean z11;
        Object objN8;
        u00.k onAction = kVar;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.j jVar2 = (l1.g0) jVar;
        jVar2.e0(-276633120);
        if ((i & 6) == 0) {
            i3 = (jVar2.g(uiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= jVar2.i(onAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= jVar2.i(cVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= jVar2.g(rVar) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                z3 = z;
                i3 |= jVar2.h(z3) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z4 = z2;
                    if (jVar2.h(z4)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((74899 & i3) != 74898) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (jVar2.S(i3 & 1, z5)) {
                    if (i7 != 0) {
                        z8 = true;
                    } else {
                        z8 = z3;
                    }
                    if (i4 != 0) {
                        z9 = false;
                    } else {
                        z9 = z4;
                    }
                    if (uiState.m == null) {
                        jB = i2.t.b(0.5f, dl.a.P);
                    } else {
                        jB = i2.t.b(0.1f, dl.a.i);
                    }
                    p2 p2VarA = b2.a(jB, (x.y) null, (String) null, jVar2, 0, 14);
                    if (z9) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    p2VarB = x.d.b(f, p.J(), (String) null, jVar2, 0, 28);
                    objN = jVar2.N();
                    obj = l1.i.a;
                    if (objN == obj) {
                        objN = oi.k.s(0, jVar2);
                    }
                    y0Var = (l1.y0) objN;
                    objN2 = jVar2.N();
                    if (objN2 == obj) {
                        objN2 = oi.k.s(0, jVar2);
                    }
                    y0Var2 = (l1.y0) objN2;
                    objN3 = jVar2.N();
                    if (objN3 == obj) {
                        objN3 = oi.k.s(0, jVar2);
                    }
                    y0Var3 = (l1.y0) objN3;
                    iR0 = ((y3.c) jVar2.k(c3.o1.h)).R0(a);
                    objN4 = jVar2.N();
                    if (objN4 == obj) {
                        objN4 = new e(y0Var, 1);
                        jVar2.n0(objN4);
                    }
                    b2.r rVarO = z2.d0.o(rVar, (u00.k) objN4);
                    z2.w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode = Long.hashCode(((l1.g0) jVar2).T);
                    l1.m1 m1VarM = jVar2.m();
                    b2.r rVarC = b2.a.c(rVarO, jVar2);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    jVar2.g0();
                    if (((l1.g0) jVar2).S) {
                        jVar2.l(gVar);
                    } else {
                        jVar2.q0();
                    }
                    b3.f fVar = b3.h.f;
                    l1.q.I(w0VarD, jVar2, fVar);
                    b3.f fVar2 = b3.h.e;
                    l1.q.I(m1VarM, jVar2, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.g;
                    l1.q.I(numValueOf, jVar2, fVar3);
                    b3.e eVar = b3.h.h;
                    l1.q.E(jVar2, eVar);
                    b3.f fVar4 = b3.h.d;
                    l1.q.I(rVarC, jVar2, fVar4);
                    b2.o oVar = b2.o.A;
                    b2.r rVarD = h0.z1.d(oVar, 1.0f);
                    b2.h hVar = b2.b.K;
                    if (z8) {
                        iVar = h0.i.g;
                    } else {
                        iVar = h0.i.a;
                    }
                    h0.v1 v1VarA = h0.t1.a(iVar, hVar, jVar2, 48);
                    int iHashCode2 = Long.hashCode(((l1.g0) jVar2).T);
                    l1.m1 m1VarM2 = jVar2.m();
                    b2.r rVarC2 = b2.a.c(rVarD, jVar2);
                    jVar2.g0();
                    if (((l1.g0) jVar2).S) {
                        jVar2.l(gVar);
                    } else {
                        jVar2.q0();
                    }
                    l1.q.I(v1VarA, jVar2, fVar);
                    l1.q.I(m1VarM2, jVar2, fVar2);
                    a1.b.v(iHashCode2, jVar2, fVar3, jVar2, eVar);
                    l1.q.I(rVarC2, jVar2, fVar4);
                    objN5 = jVar2.N();
                    if (objN5 == obj) {
                        objN5 = new e(y0Var2, 2);
                        jVar2.n0(objN5);
                    }
                    int i8 = i3 & 112;
                    int i9 = i3 & 896;
                    i6 = i3;
                    jVar2 = jVar2;
                    s.c(uiState, kVar, cVar, z2.d0.o(oVar, (u00.k) objN5), jVar2, (i3 & 14) | 3072 | i8 | i9);
                    if (z8) {
                        jVar2.c0(2119412671);
                        o1Var = uiState;
                        onAction = kVar;
                        s.b(o1Var, onAction, cVar, null, jVar2, i6 & 1022);
                        jVar2.r(false);
                    } else {
                        o1Var = uiState;
                        onAction = kVar;
                        jVar2.c0(2119609676);
                        jVar2.r(false);
                    }
                    jVar2.r(true);
                    b2.r rVarA = h0.s.a.a(oVar, b2.b.D);
                    objN6 = jVar2.N();
                    if (objN6 == obj) {
                        y0Var4 = y0Var3;
                        objN6 = new e(y0Var4, 3);
                        jVar2.n0(objN6);
                    } else {
                        y0Var4 = y0Var3;
                    }
                    b2.r rVarO2 = z2.d0.o(rVarA, (u00.k) objN6);
                    zE = jVar2.e(iR0) | jVar2.g(p2VarB);
                    objN7 = jVar2.N();
                    if (zE || objN7 == obj) {
                        objN7 = new g2(iR0, y0Var, y0Var4, y0Var2, p2VarB, 1);
                        jVar2.n0(objN7);
                    }
                    b2.r rVarY = h0.c.y(rVarO2, (u00.k) objN7);
                    zz.a aVar = o1Var.m;
                    long j = ((i2.t) p2VarA.getValue()).a;
                    z11 = i8 == 32;
                    objN8 = jVar2.N();
                    if (z11 || objN8 == obj) {
                        objN8 = new fy.r(12, onAction);
                        jVar2.n0(objN8);
                    }
                    p.c(aVar, (u00.a) objN8, cVar, j, rVarY, jVar2, i9, 0);
                    jVar2.r(true);
                    z6 = z8;
                    z7 = z9;
                } else {
                    jVar2.V();
                    z6 = z3;
                    z7 = z4;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new u(uiState, onAction, cVar, rVar, z6, z7, i, i2);
                }
            }
            i3 |= 196608;
            z4 = z2;
            if ((74899 & i3) != 74898) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (jVar2.S(i3 & 1, z5)) {
                if (i7 != 0) {
                    z8 = true;
                } else {
                    z8 = z3;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z4;
                }
                if (uiState.m == null) {
                    jB = i2.t.b(0.5f, dl.a.P);
                } else {
                    jB = i2.t.b(0.1f, dl.a.i);
                }
                p2 p2VarA2 = b2.a(jB, (x.y) null, (String) null, jVar2, 0, 14);
                if (z9) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                p2VarB = x.d.b(f, p.J(), (String) null, jVar2, 0, 28);
                objN = jVar2.N();
                obj = l1.i.a;
                if (objN == obj) {
                    objN = oi.k.s(0, jVar2);
                }
                y0Var = (l1.y0) objN;
                objN2 = jVar2.N();
                if (objN2 == obj) {
                    objN2 = oi.k.s(0, jVar2);
                }
                y0Var2 = (l1.y0) objN2;
                objN3 = jVar2.N();
                if (objN3 == obj) {
                    objN3 = oi.k.s(0, jVar2);
                }
                y0Var3 = (l1.y0) objN3;
                iR0 = ((y3.c) jVar2.k(c3.o1.h)).R0(a);
                objN4 = jVar2.N();
                if (objN4 == obj) {
                    objN4 = new e(y0Var, 1);
                    jVar2.n0(objN4);
                }
                b2.r rVarO3 = z2.d0.o(rVar, (u00.k) objN4);
                z2.w0 w0VarD2 = h0.o.d(b2.b.E, false);
                int iHashCode3 = Long.hashCode(((l1.g0) jVar2).T);
                l1.m1 m1VarM3 = jVar2.m();
                b2.r rVarC3 = b2.a.c(rVarO3, jVar2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar);
                } else {
                    jVar2.q0();
                }
                b3.f fVar5 = b3.h.f;
                l1.q.I(w0VarD2, jVar2, fVar5);
                b3.f fVar6 = b3.h.e;
                l1.q.I(m1VarM3, jVar2, fVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                b3.f fVar7 = b3.h.g;
                l1.q.I(numValueOf2, jVar2, fVar7);
                b3.e eVar2 = b3.h.h;
                l1.q.E(jVar2, eVar2);
                b3.f fVar8 = b3.h.d;
                l1.q.I(rVarC3, jVar2, fVar8);
                b2.o oVar2 = b2.o.A;
                b2.r rVarD2 = h0.z1.d(oVar2, 1.0f);
                b2.h hVar2 = b2.b.K;
                if (z8) {
                    iVar = h0.i.g;
                } else {
                    iVar = h0.i.a;
                }
                h0.v1 v1VarA2 = h0.t1.a(iVar, hVar2, jVar2, 48);
                int iHashCode4 = Long.hashCode(((l1.g0) jVar2).T);
                l1.m1 m1VarM4 = jVar2.m();
                b2.r rVarC4 = b2.a.c(rVarD2, jVar2);
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar);
                } else {
                    jVar2.q0();
                }
                l1.q.I(v1VarA2, jVar2, fVar5);
                l1.q.I(m1VarM4, jVar2, fVar6);
                a1.b.v(iHashCode4, jVar2, fVar7, jVar2, eVar2);
                l1.q.I(rVarC4, jVar2, fVar8);
                objN5 = jVar2.N();
                if (objN5 == obj) {
                    objN5 = new e(y0Var2, 2);
                    jVar2.n0(objN5);
                }
                int i11 = i3 & 112;
                int i12 = i3 & 896;
                i6 = i3;
                jVar2 = jVar2;
                s.c(uiState, kVar, cVar, z2.d0.o(oVar2, (u00.k) objN5), jVar2, (i3 & 14) | 3072 | i11 | i12);
                if (z8) {
                    jVar2.c0(2119412671);
                    o1Var = uiState;
                    onAction = kVar;
                    s.b(o1Var, onAction, cVar, null, jVar2, i6 & 1022);
                    jVar2.r(false);
                } else {
                    o1Var = uiState;
                    onAction = kVar;
                    jVar2.c0(2119609676);
                    jVar2.r(false);
                }
                jVar2.r(true);
                b2.r rVarA2 = h0.s.a.a(oVar2, b2.b.D);
                objN6 = jVar2.N();
                if (objN6 == obj) {
                    y0Var4 = y0Var3;
                    objN6 = new e(y0Var4, 3);
                    jVar2.n0(objN6);
                } else {
                    y0Var4 = y0Var3;
                }
                b2.r rVarO4 = z2.d0.o(rVarA2, (u00.k) objN6);
                zE = jVar2.e(iR0) | jVar2.g(p2VarB);
                objN7 = jVar2.N();
                if (zE) {
                    objN7 = new g2(iR0, y0Var, y0Var4, y0Var2, p2VarB, 1);
                    jVar2.n0(objN7);
                } else {
                    objN7 = new g2(iR0, y0Var, y0Var4, y0Var2, p2VarB, 1);
                    jVar2.n0(objN7);
                }
                b2.r rVarY2 = h0.c.y(rVarO4, (u00.k) objN7);
                zz.a aVar2 = o1Var.m;
                long j2 = ((i2.t) p2VarA2.getValue()).a;
                if (i11 == 32) {
                }
                objN8 = jVar2.N();
                if (z11) {
                    objN8 = new fy.r(12, onAction);
                    jVar2.n0(objN8);
                } else {
                    objN8 = new fy.r(12, onAction);
                    jVar2.n0(objN8);
                }
                p.c(aVar2, (u00.a) objN8, cVar, j2, rVarY2, jVar2, i12, 0);
                jVar2.r(true);
                z6 = z8;
                z7 = z9;
            } else {
                jVar2.V();
                z6 = z3;
                z7 = z4;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u(uiState, onAction, cVar, rVar, z6, z7, i, i2);
            }
        }
        i3 |= 24576;
        z3 = z;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z4 = z2;
                if (jVar2.h(z4)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) != 74898) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (jVar2.S(i3 & 1, z5)) {
                if (i7 != 0) {
                    z8 = true;
                } else {
                    z8 = z3;
                }
                if (i4 != 0) {
                    z9 = false;
                } else {
                    z9 = z4;
                }
                if (uiState.m == null) {
                    jB = i2.t.b(0.5f, dl.a.P);
                } else {
                    jB = i2.t.b(0.1f, dl.a.i);
                }
                p2 p2VarA3 = b2.a(jB, (x.y) null, (String) null, jVar2, 0, 14);
                if (z9) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                p2VarB = x.d.b(f, p.J(), (String) null, jVar2, 0, 28);
                objN = jVar2.N();
                obj = l1.i.a;
                if (objN == obj) {
                    objN = oi.k.s(0, jVar2);
                }
                y0Var = (l1.y0) objN;
                objN2 = jVar2.N();
                if (objN2 == obj) {
                    objN2 = oi.k.s(0, jVar2);
                }
                y0Var2 = (l1.y0) objN2;
                objN3 = jVar2.N();
                if (objN3 == obj) {
                    objN3 = oi.k.s(0, jVar2);
                }
                y0Var3 = (l1.y0) objN3;
                iR0 = ((y3.c) jVar2.k(c3.o1.h)).R0(a);
                objN4 = jVar2.N();
                if (objN4 == obj) {
                    objN4 = new e(y0Var, 1);
                    jVar2.n0(objN4);
                }
                b2.r rVarO5 = z2.d0.o(rVar, (u00.k) objN4);
                z2.w0 w0VarD3 = h0.o.d(b2.b.E, false);
                int iHashCode5 = Long.hashCode(((l1.g0) jVar2).T);
                l1.m1 m1VarM5 = jVar2.m();
                b2.r rVarC5 = b2.a.c(rVarO5, jVar2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar);
                } else {
                    jVar2.q0();
                }
                b3.f fVar9 = b3.h.f;
                l1.q.I(w0VarD3, jVar2, fVar9);
                b3.f fVar10 = b3.h.e;
                l1.q.I(m1VarM5, jVar2, fVar10);
                Integer numValueOf3 = Integer.valueOf(iHashCode5);
                b3.f fVar11 = b3.h.g;
                l1.q.I(numValueOf3, jVar2, fVar11);
                b3.e eVar3 = b3.h.h;
                l1.q.E(jVar2, eVar3);
                b3.f fVar12 = b3.h.d;
                l1.q.I(rVarC5, jVar2, fVar12);
                b2.o oVar3 = b2.o.A;
                b2.r rVarD3 = h0.z1.d(oVar3, 1.0f);
                b2.h hVar3 = b2.b.K;
                if (z8) {
                    iVar = h0.i.g;
                } else {
                    iVar = h0.i.a;
                }
                h0.v1 v1VarA3 = h0.t1.a(iVar, hVar3, jVar2, 48);
                int iHashCode6 = Long.hashCode(((l1.g0) jVar2).T);
                l1.m1 m1VarM6 = jVar2.m();
                b2.r rVarC6 = b2.a.c(rVarD3, jVar2);
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar);
                } else {
                    jVar2.q0();
                }
                l1.q.I(v1VarA3, jVar2, fVar9);
                l1.q.I(m1VarM6, jVar2, fVar10);
                a1.b.v(iHashCode6, jVar2, fVar11, jVar2, eVar3);
                l1.q.I(rVarC6, jVar2, fVar12);
                objN5 = jVar2.N();
                if (objN5 == obj) {
                    objN5 = new e(y0Var2, 2);
                    jVar2.n0(objN5);
                }
                int i13 = i3 & 112;
                int i14 = i3 & 896;
                i6 = i3;
                jVar2 = jVar2;
                s.c(uiState, kVar, cVar, z2.d0.o(oVar3, (u00.k) objN5), jVar2, (i3 & 14) | 3072 | i13 | i14);
                if (z8) {
                    jVar2.c0(2119412671);
                    o1Var = uiState;
                    onAction = kVar;
                    s.b(o1Var, onAction, cVar, null, jVar2, i6 & 1022);
                    jVar2.r(false);
                } else {
                    o1Var = uiState;
                    onAction = kVar;
                    jVar2.c0(2119609676);
                    jVar2.r(false);
                }
                jVar2.r(true);
                b2.r rVarA3 = h0.s.a.a(oVar3, b2.b.D);
                objN6 = jVar2.N();
                if (objN6 == obj) {
                    y0Var4 = y0Var3;
                    objN6 = new e(y0Var4, 3);
                    jVar2.n0(objN6);
                } else {
                    y0Var4 = y0Var3;
                }
                b2.r rVarO6 = z2.d0.o(rVarA3, (u00.k) objN6);
                zE = jVar2.e(iR0) | jVar2.g(p2VarB);
                objN7 = jVar2.N();
                if (zE) {
                    objN7 = new g2(iR0, y0Var, y0Var4, y0Var2, p2VarB, 1);
                    jVar2.n0(objN7);
                } else {
                    objN7 = new g2(iR0, y0Var, y0Var4, y0Var2, p2VarB, 1);
                    jVar2.n0(objN7);
                }
                b2.r rVarY3 = h0.c.y(rVarO6, (u00.k) objN7);
                zz.a aVar3 = o1Var.m;
                long j3 = ((i2.t) p2VarA3.getValue()).a;
                if (i13 == 32) {
                }
                objN8 = jVar2.N();
                if (z11) {
                    objN8 = new fy.r(12, onAction);
                    jVar2.n0(objN8);
                } else {
                    objN8 = new fy.r(12, onAction);
                    jVar2.n0(objN8);
                }
                p.c(aVar3, (u00.a) objN8, cVar, j3, rVarY3, jVar2, i14, 0);
                jVar2.r(true);
                z6 = z8;
                z7 = z9;
            } else {
                jVar2.V();
                z6 = z3;
                z7 = z4;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u(uiState, onAction, cVar, rVar, z6, z7, i, i2);
            }
        }
        i3 |= 196608;
        z4 = z2;
        if ((74899 & i3) != 74898) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (jVar2.S(i3 & 1, z5)) {
            if (i7 != 0) {
                z8 = true;
            } else {
                z8 = z3;
            }
            if (i4 != 0) {
                z9 = false;
            } else {
                z9 = z4;
            }
            if (uiState.m == null) {
                jB = i2.t.b(0.5f, dl.a.P);
            } else {
                jB = i2.t.b(0.1f, dl.a.i);
            }
            p2 p2VarA4 = b2.a(jB, (x.y) null, (String) null, jVar2, 0, 14);
            if (z9) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            p2VarB = x.d.b(f, p.J(), (String) null, jVar2, 0, 28);
            objN = jVar2.N();
            obj = l1.i.a;
            if (objN == obj) {
                objN = oi.k.s(0, jVar2);
            }
            y0Var = (l1.y0) objN;
            objN2 = jVar2.N();
            if (objN2 == obj) {
                objN2 = oi.k.s(0, jVar2);
            }
            y0Var2 = (l1.y0) objN2;
            objN3 = jVar2.N();
            if (objN3 == obj) {
                objN3 = oi.k.s(0, jVar2);
            }
            y0Var3 = (l1.y0) objN3;
            iR0 = ((y3.c) jVar2.k(c3.o1.h)).R0(a);
            objN4 = jVar2.N();
            if (objN4 == obj) {
                objN4 = new e(y0Var, 1);
                jVar2.n0(objN4);
            }
            b2.r rVarO7 = z2.d0.o(rVar, (u00.k) objN4);
            z2.w0 w0VarD4 = h0.o.d(b2.b.E, false);
            int iHashCode7 = Long.hashCode(((l1.g0) jVar2).T);
            l1.m1 m1VarM7 = jVar2.m();
            b2.r rVarC7 = b2.a.c(rVarO7, jVar2);
            b3.i.c.getClass();
            gVar = b3.h.b;
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            b3.f fVar13 = b3.h.f;
            l1.q.I(w0VarD4, jVar2, fVar13);
            b3.f fVar14 = b3.h.e;
            l1.q.I(m1VarM7, jVar2, fVar14);
            Integer numValueOf4 = Integer.valueOf(iHashCode7);
            b3.f fVar15 = b3.h.g;
            l1.q.I(numValueOf4, jVar2, fVar15);
            b3.e eVar4 = b3.h.h;
            l1.q.E(jVar2, eVar4);
            b3.f fVar16 = b3.h.d;
            l1.q.I(rVarC7, jVar2, fVar16);
            b2.o oVar4 = b2.o.A;
            b2.r rVarD4 = h0.z1.d(oVar4, 1.0f);
            b2.h hVar4 = b2.b.K;
            if (z8) {
                iVar = h0.i.g;
            } else {
                iVar = h0.i.a;
            }
            h0.v1 v1VarA4 = h0.t1.a(iVar, hVar4, jVar2, 48);
            int iHashCode8 = Long.hashCode(((l1.g0) jVar2).T);
            l1.m1 m1VarM8 = jVar2.m();
            b2.r rVarC8 = b2.a.c(rVarD4, jVar2);
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            l1.q.I(v1VarA4, jVar2, fVar13);
            l1.q.I(m1VarM8, jVar2, fVar14);
            a1.b.v(iHashCode8, jVar2, fVar15, jVar2, eVar4);
            l1.q.I(rVarC8, jVar2, fVar16);
            objN5 = jVar2.N();
            if (objN5 == obj) {
                objN5 = new e(y0Var2, 2);
                jVar2.n0(objN5);
            }
            int i15 = i3 & 112;
            int i16 = i3 & 896;
            i6 = i3;
            jVar2 = jVar2;
            s.c(uiState, kVar, cVar, z2.d0.o(oVar4, (u00.k) objN5), jVar2, (i3 & 14) | 3072 | i15 | i16);
            if (z8) {
                jVar2.c0(2119412671);
                o1Var = uiState;
                onAction = kVar;
                s.b(o1Var, onAction, cVar, null, jVar2, i6 & 1022);
                jVar2.r(false);
            } else {
                o1Var = uiState;
                onAction = kVar;
                jVar2.c0(2119609676);
                jVar2.r(false);
            }
            jVar2.r(true);
            b2.r rVarA4 = h0.s.a.a(oVar4, b2.b.D);
            objN6 = jVar2.N();
            if (objN6 == obj) {
                y0Var4 = y0Var3;
                objN6 = new e(y0Var4, 3);
                jVar2.n0(objN6);
            } else {
                y0Var4 = y0Var3;
            }
            b2.r rVarO8 = z2.d0.o(rVarA4, (u00.k) objN6);
            zE = jVar2.e(iR0) | jVar2.g(p2VarB);
            objN7 = jVar2.N();
            if (zE) {
                objN7 = new g2(iR0, y0Var, y0Var4, y0Var2, p2VarB, 1);
                jVar2.n0(objN7);
            } else {
                objN7 = new g2(iR0, y0Var, y0Var4, y0Var2, p2VarB, 1);
                jVar2.n0(objN7);
            }
            b2.r rVarY4 = h0.c.y(rVarO8, (u00.k) objN7);
            zz.a aVar4 = o1Var.m;
            long j4 = ((i2.t) p2VarA4.getValue()).a;
            if (i15 == 32) {
            }
            objN8 = jVar2.N();
            if (z11) {
                objN8 = new fy.r(12, onAction);
                jVar2.n0(objN8);
            } else {
                objN8 = new fy.r(12, onAction);
                jVar2.n0(objN8);
            }
            p.c(aVar4, (u00.a) objN8, cVar, j4, rVarY4, jVar2, i16, 0);
            jVar2.r(true);
            z6 = z8;
            z7 = z9;
        } else {
            jVar2.V();
            z6 = z3;
            z7 = z4;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u(uiState, onAction, cVar, rVar, z6, z7, i, i2);
        }
    }
}
