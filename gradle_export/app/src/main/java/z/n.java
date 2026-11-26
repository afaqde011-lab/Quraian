package z;

import android.widget.EdgeEffect;
import b3.o2;
import com.google.android.gms.cast.Cast;
import d0.n2;

public abstract class n {
    public static final u a(float f3, long j9) {
        return new u(f3, new i2.v0(j9));
    }

    public static final void b(int i10, b2.r rVar, l1.j jVar, u00.k kVar) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (g0Var.i(kVar) ? 32 : 16);
        if (g0Var.S(i12 & 1, (i12 & 19) != 18)) {
            h0.c.h(f2.h.e(rVar, kVar), g0Var);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(rVar, kVar, i10, 17);
        }
    }

    public static final void c(final m2.b bVar, final String str, b2.r rVar, b2.d dVar, z2.p pVar, float f3, l1.j jVar, final int i10, final int i11) {
        b2.r rVar2;
        int i12;
        b2.d dVar2;
        int i13;
        int i14;
        z2.p pVar2;
        int i15;
        int i16;
        float f10;
        int i17;
        int i18;
        boolean z10;
        final b2.r rVar3;
        final b2.d dVar3;
        final z2.p pVar3;
        final float f11;
        l1.r1 r1VarT;
        b2.r rVarC;
        b2.r rVar4;
        b2.d dVar4;
        float f12;
        l1.c cVar;
        Object objN;
        b3.g gVar;
        boolean z11;
        Object objN2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1142754848);
        int i19 = ((i10 & 8) == 0 ? g0Var.g(bVar) : g0Var.i(bVar) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i19 |= g0Var.g(str) ? 32 : 16;
        }
        int i20 = i11 & 4;
        if (i20 == 0) {
            if ((i10 & 384) == 0) {
                rVar2 = rVar;
                i19 |= g0Var.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
            }
            i12 = i11 & 8;
            if (i12 != 0) {
                if ((i10 & 3072) == 0) {
                    dVar2 = dVar;
                    if (g0Var.g(dVar2)) {
                        i13 = 2048;
                    } else {
                        i13 = 1024;
                    }
                    i19 |= i13;
                }
                i14 = i11 & 16;
                if (i14 != 0) {
                    if ((i10 & 24576) == 0) {
                        pVar2 = pVar;
                        if (g0Var.g(pVar2)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i19 |= i15;
                    }
                    i16 = i11 & 32;
                    if (i16 != 0) {
                        if ((196608 & i10) == 0) {
                            f10 = f3;
                            if (g0Var.d(f10)) {
                                i17 = 131072;
                            } else {
                                i17 = Cast.MAX_MESSAGE_LENGTH;
                            }
                            i19 |= i17;
                        }
                        i18 = i19 | 1572864;
                        if ((599187 & i18) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (g0Var.S(i18 & 1, z10)) {
                            rVarC = b2.o.A;
                            if (i20 != 0) {
                                rVar4 = rVarC;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i12 != 0) {
                                dVar4 = b2.b.E;
                            } else {
                                dVar4 = dVar2;
                            }
                            if (i14 != 0) {
                                pVar2 = z2.o.f17146b;
                            }
                            if (i16 != 0) {
                                f12 = 1.0f;
                            } else {
                                f12 = f10;
                            }
                            cVar = l1.i.f9868a;
                            if (str != null) {
                                g0Var.c0(1899222916);
                                if ((i18 & 112) == 32) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objN2 = g0Var.N();
                                if (z11 || objN2 == cVar) {
                                    objN2 = new hb.u(str, 27);
                                    g0Var.n0(objN2);
                                }
                                rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                                g0Var.r(false);
                            } else {
                                g0Var.c0(1899381698);
                                g0Var.r(false);
                            }
                            z2.p pVar4 = pVar2;
                            b2.r rVarH = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar4, f12, null, 2);
                            objN = g0Var.N();
                            if (objN == cVar) {
                                objN = r0.f16960a;
                                g0Var.n0(objN);
                            }
                            z2.w0 w0Var = (z2.w0) objN;
                            int iHashCode = Long.hashCode(g0Var.T);
                            b2.r rVarC2 = b2.a.c(rVarH, g0Var);
                            l1.m1 m1VarM = g0Var.m();
                            b3.i.f2042c.getClass();
                            gVar = b3.h.f2035b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(w0Var, g0Var, b3.h.f2039f);
                            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
                            l1.q.E(g0Var, b3.h.f2041h);
                            l1.q.I(rVarC2, g0Var, b3.h.f2037d);
                            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
                            g0Var.r(true);
                            pVar3 = pVar4;
                            f11 = f12;
                            rVar3 = rVar4;
                            dVar3 = dVar4;
                        } else {
                            g0Var.V();
                            rVar3 = rVar2;
                            dVar3 = dVar2;
                            pVar3 = pVar2;
                            f11 = f10;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            r1VarT.f9921d = new u00.n() {
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                                    return g00.b0.a;
                                }
                            };
                        }
                    }
                    i19 |= 196608;
                    f10 = f3;
                    i18 = i19 | 1572864;
                    if ((599187 & i18) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i18 & 1, z10)) {
                        rVarC = b2.o.A;
                        if (i20 != 0) {
                            rVar4 = rVarC;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i12 != 0) {
                            dVar4 = b2.b.E;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i14 != 0) {
                            pVar2 = z2.o.f17146b;
                        }
                        if (i16 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f10;
                        }
                        cVar = l1.i.f9868a;
                        if (str != null) {
                            g0Var.c0(1899222916);
                            if ((i18 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objN2 = g0Var.N();
                            if (z11) {
                                objN2 = new hb.u(str, 27);
                                g0Var.n0(objN2);
                            } else {
                                objN2 = new hb.u(str, 27);
                                g0Var.n0(objN2);
                            }
                            rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(1899381698);
                            g0Var.r(false);
                        }
                        z2.p pVar5 = pVar2;
                        b2.r rVarH2 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar5, f12, null, 2);
                        objN = g0Var.N();
                        if (objN == cVar) {
                            objN = r0.f16960a;
                            g0Var.n0(objN);
                        }
                        z2.w0 w0Var2 = (z2.w0) objN;
                        int iHashCode2 = Long.hashCode(g0Var.T);
                        b2.r rVarC3 = b2.a.c(rVarH2, g0Var);
                        l1.m1 m1VarM2 = g0Var.m();
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(w0Var2, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM2, g0Var, b3.h.f2038e);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC3, g0Var, b3.h.f2037d);
                        l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.f2040g);
                        g0Var.r(true);
                        pVar3 = pVar5;
                        f11 = f12;
                        rVar3 = rVar4;
                        dVar3 = dVar4;
                    } else {
                        g0Var.V();
                        rVar3 = rVar2;
                        dVar3 = dVar2;
                        pVar3 = pVar2;
                        f11 = f10;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new u00.n() {
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i19 |= 24576;
                pVar2 = pVar;
                i16 = i11 & 32;
                if (i16 != 0) {
                    if ((196608 & i10) == 0) {
                        f10 = f3;
                        if (g0Var.d(f10)) {
                            i17 = 131072;
                        } else {
                            i17 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i19 |= i17;
                    }
                    i18 = i19 | 1572864;
                    if ((599187 & i18) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i18 & 1, z10)) {
                        rVarC = b2.o.A;
                        if (i20 != 0) {
                            rVar4 = rVarC;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i12 != 0) {
                            dVar4 = b2.b.E;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i14 != 0) {
                            pVar2 = z2.o.f17146b;
                        }
                        if (i16 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f10;
                        }
                        cVar = l1.i.f9868a;
                        if (str != null) {
                            g0Var.c0(1899222916);
                            if ((i18 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objN2 = g0Var.N();
                            if (z11) {
                                objN2 = new hb.u(str, 27);
                                g0Var.n0(objN2);
                            } else {
                                objN2 = new hb.u(str, 27);
                                g0Var.n0(objN2);
                            }
                            rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(1899381698);
                            g0Var.r(false);
                        }
                        z2.p pVar6 = pVar2;
                        b2.r rVarH3 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar6, f12, null, 2);
                        objN = g0Var.N();
                        if (objN == cVar) {
                            objN = r0.f16960a;
                            g0Var.n0(objN);
                        }
                        z2.w0 w0Var3 = (z2.w0) objN;
                        int iHashCode3 = Long.hashCode(g0Var.T);
                        b2.r rVarC4 = b2.a.c(rVarH3, g0Var);
                        l1.m1 m1VarM3 = g0Var.m();
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(w0Var3, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM3, g0Var, b3.h.f2038e);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC4, g0Var, b3.h.f2037d);
                        l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.f2040g);
                        g0Var.r(true);
                        pVar3 = pVar6;
                        f11 = f12;
                        rVar3 = rVar4;
                        dVar3 = dVar4;
                    } else {
                        g0Var.V();
                        rVar3 = rVar2;
                        dVar3 = dVar2;
                        pVar3 = pVar2;
                        f11 = f10;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new u00.n() {
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i19 |= 196608;
                f10 = f3;
                i18 = i19 | 1572864;
                if ((599187 & i18) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i18 & 1, z10)) {
                    rVarC = b2.o.A;
                    if (i20 != 0) {
                        rVar4 = rVarC;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i12 != 0) {
                        dVar4 = b2.b.E;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i14 != 0) {
                        pVar2 = z2.o.f17146b;
                    }
                    if (i16 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f10;
                    }
                    cVar = l1.i.f9868a;
                    if (str != null) {
                        g0Var.c0(1899222916);
                        if ((i18 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN2 = g0Var.N();
                        if (z11) {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        }
                        rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1899381698);
                        g0Var.r(false);
                    }
                    z2.p pVar7 = pVar2;
                    b2.r rVarH4 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar7, f12, null, 2);
                    objN = g0Var.N();
                    if (objN == cVar) {
                        objN = r0.f16960a;
                        g0Var.n0(objN);
                    }
                    z2.w0 w0Var4 = (z2.w0) objN;
                    int iHashCode4 = Long.hashCode(g0Var.T);
                    b2.r rVarC5 = b2.a.c(rVarH4, g0Var);
                    l1.m1 m1VarM4 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0Var4, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM4, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC5, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode4), g0Var, b3.h.f2040g);
                    g0Var.r(true);
                    pVar3 = pVar7;
                    f11 = f12;
                    rVar3 = rVar4;
                    dVar3 = dVar4;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    pVar3 = pVar2;
                    f11 = f10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i19 |= 3072;
            dVar2 = dVar;
            i14 = i11 & 16;
            if (i14 != 0) {
                if ((i10 & 24576) == 0) {
                    pVar2 = pVar;
                    if (g0Var.g(pVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i19 |= i15;
                }
                i16 = i11 & 32;
                if (i16 != 0) {
                    if ((196608 & i10) == 0) {
                        f10 = f3;
                        if (g0Var.d(f10)) {
                            i17 = 131072;
                        } else {
                            i17 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i19 |= i17;
                    }
                    i18 = i19 | 1572864;
                    if ((599187 & i18) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i18 & 1, z10)) {
                        rVarC = b2.o.A;
                        if (i20 != 0) {
                            rVar4 = rVarC;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i12 != 0) {
                            dVar4 = b2.b.E;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i14 != 0) {
                            pVar2 = z2.o.f17146b;
                        }
                        if (i16 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f10;
                        }
                        cVar = l1.i.f9868a;
                        if (str != null) {
                            g0Var.c0(1899222916);
                            if ((i18 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objN2 = g0Var.N();
                            if (z11) {
                                objN2 = new hb.u(str, 27);
                                g0Var.n0(objN2);
                            } else {
                                objN2 = new hb.u(str, 27);
                                g0Var.n0(objN2);
                            }
                            rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(1899381698);
                            g0Var.r(false);
                        }
                        z2.p pVar8 = pVar2;
                        b2.r rVarH5 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar8, f12, null, 2);
                        objN = g0Var.N();
                        if (objN == cVar) {
                            objN = r0.f16960a;
                            g0Var.n0(objN);
                        }
                        z2.w0 w0Var5 = (z2.w0) objN;
                        int iHashCode5 = Long.hashCode(g0Var.T);
                        b2.r rVarC6 = b2.a.c(rVarH5, g0Var);
                        l1.m1 m1VarM5 = g0Var.m();
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(w0Var5, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM5, g0Var, b3.h.f2038e);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC6, g0Var, b3.h.f2037d);
                        l1.q.I(Integer.valueOf(iHashCode5), g0Var, b3.h.f2040g);
                        g0Var.r(true);
                        pVar3 = pVar8;
                        f11 = f12;
                        rVar3 = rVar4;
                        dVar3 = dVar4;
                    } else {
                        g0Var.V();
                        rVar3 = rVar2;
                        dVar3 = dVar2;
                        pVar3 = pVar2;
                        f11 = f10;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new u00.n() {
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i19 |= 196608;
                f10 = f3;
                i18 = i19 | 1572864;
                if ((599187 & i18) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i18 & 1, z10)) {
                    rVarC = b2.o.A;
                    if (i20 != 0) {
                        rVar4 = rVarC;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i12 != 0) {
                        dVar4 = b2.b.E;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i14 != 0) {
                        pVar2 = z2.o.f17146b;
                    }
                    if (i16 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f10;
                    }
                    cVar = l1.i.f9868a;
                    if (str != null) {
                        g0Var.c0(1899222916);
                        if ((i18 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN2 = g0Var.N();
                        if (z11) {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        }
                        rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1899381698);
                        g0Var.r(false);
                    }
                    z2.p pVar9 = pVar2;
                    b2.r rVarH6 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar9, f12, null, 2);
                    objN = g0Var.N();
                    if (objN == cVar) {
                        objN = r0.f16960a;
                        g0Var.n0(objN);
                    }
                    z2.w0 w0Var6 = (z2.w0) objN;
                    int iHashCode6 = Long.hashCode(g0Var.T);
                    b2.r rVarC7 = b2.a.c(rVarH6, g0Var);
                    l1.m1 m1VarM6 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0Var6, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM6, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC7, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode6), g0Var, b3.h.f2040g);
                    g0Var.r(true);
                    pVar3 = pVar9;
                    f11 = f12;
                    rVar3 = rVar4;
                    dVar3 = dVar4;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    pVar3 = pVar2;
                    f11 = f10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i19 |= 24576;
            pVar2 = pVar;
            i16 = i11 & 32;
            if (i16 != 0) {
                if ((196608 & i10) == 0) {
                    f10 = f3;
                    if (g0Var.d(f10)) {
                        i17 = 131072;
                    } else {
                        i17 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i19 |= i17;
                }
                i18 = i19 | 1572864;
                if ((599187 & i18) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i18 & 1, z10)) {
                    rVarC = b2.o.A;
                    if (i20 != 0) {
                        rVar4 = rVarC;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i12 != 0) {
                        dVar4 = b2.b.E;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i14 != 0) {
                        pVar2 = z2.o.f17146b;
                    }
                    if (i16 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f10;
                    }
                    cVar = l1.i.f9868a;
                    if (str != null) {
                        g0Var.c0(1899222916);
                        if ((i18 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN2 = g0Var.N();
                        if (z11) {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        }
                        rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1899381698);
                        g0Var.r(false);
                    }
                    z2.p pVar10 = pVar2;
                    b2.r rVarH7 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar10, f12, null, 2);
                    objN = g0Var.N();
                    if (objN == cVar) {
                        objN = r0.f16960a;
                        g0Var.n0(objN);
                    }
                    z2.w0 w0Var7 = (z2.w0) objN;
                    int iHashCode7 = Long.hashCode(g0Var.T);
                    b2.r rVarC8 = b2.a.c(rVarH7, g0Var);
                    l1.m1 m1VarM7 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0Var7, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM7, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC8, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode7), g0Var, b3.h.f2040g);
                    g0Var.r(true);
                    pVar3 = pVar10;
                    f11 = f12;
                    rVar3 = rVar4;
                    dVar3 = dVar4;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    pVar3 = pVar2;
                    f11 = f10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i19 |= 196608;
            f10 = f3;
            i18 = i19 | 1572864;
            if ((599187 & i18) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i18 & 1, z10)) {
                rVarC = b2.o.A;
                if (i20 != 0) {
                    rVar4 = rVarC;
                } else {
                    rVar4 = rVar2;
                }
                if (i12 != 0) {
                    dVar4 = b2.b.E;
                } else {
                    dVar4 = dVar2;
                }
                if (i14 != 0) {
                    pVar2 = z2.o.f17146b;
                }
                if (i16 != 0) {
                    f12 = 1.0f;
                } else {
                    f12 = f10;
                }
                cVar = l1.i.f9868a;
                if (str != null) {
                    g0Var.c0(1899222916);
                    if ((i18 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objN2 = g0Var.N();
                    if (z11) {
                        objN2 = new hb.u(str, 27);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new hb.u(str, 27);
                        g0Var.n0(objN2);
                    }
                    rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1899381698);
                    g0Var.r(false);
                }
                z2.p pVar11 = pVar2;
                b2.r rVarH8 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar11, f12, null, 2);
                objN = g0Var.N();
                if (objN == cVar) {
                    objN = r0.f16960a;
                    g0Var.n0(objN);
                }
                z2.w0 w0Var8 = (z2.w0) objN;
                int iHashCode8 = Long.hashCode(g0Var.T);
                b2.r rVarC9 = b2.a.c(rVarH8, g0Var);
                l1.m1 m1VarM8 = g0Var.m();
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0Var8, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM8, g0Var, b3.h.f2038e);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC9, g0Var, b3.h.f2037d);
                l1.q.I(Integer.valueOf(iHashCode8), g0Var, b3.h.f2040g);
                g0Var.r(true);
                pVar3 = pVar11;
                f11 = f12;
                rVar3 = rVar4;
                dVar3 = dVar4;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                dVar3 = dVar2;
                pVar3 = pVar2;
                f11 = f10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                        return g00.b0.a;
                    }
                };
            }
        }
        i19 |= 384;
        rVar2 = rVar;
        i12 = i11 & 8;
        if (i12 != 0) {
            if ((i10 & 3072) == 0) {
                dVar2 = dVar;
                if (g0Var.g(dVar2)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i19 |= i13;
            }
            i14 = i11 & 16;
            if (i14 != 0) {
                if ((i10 & 24576) == 0) {
                    pVar2 = pVar;
                    if (g0Var.g(pVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i19 |= i15;
                }
                i16 = i11 & 32;
                if (i16 != 0) {
                    if ((196608 & i10) == 0) {
                        f10 = f3;
                        if (g0Var.d(f10)) {
                            i17 = 131072;
                        } else {
                            i17 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i19 |= i17;
                    }
                    i18 = i19 | 1572864;
                    if ((599187 & i18) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (g0Var.S(i18 & 1, z10)) {
                        rVarC = b2.o.A;
                        if (i20 != 0) {
                            rVar4 = rVarC;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i12 != 0) {
                            dVar4 = b2.b.E;
                        } else {
                            dVar4 = dVar2;
                        }
                        if (i14 != 0) {
                            pVar2 = z2.o.f17146b;
                        }
                        if (i16 != 0) {
                            f12 = 1.0f;
                        } else {
                            f12 = f10;
                        }
                        cVar = l1.i.f9868a;
                        if (str != null) {
                            g0Var.c0(1899222916);
                            if ((i18 & 112) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objN2 = g0Var.N();
                            if (z11) {
                                objN2 = new hb.u(str, 27);
                                g0Var.n0(objN2);
                            } else {
                                objN2 = new hb.u(str, 27);
                                g0Var.n0(objN2);
                            }
                            rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                            g0Var.r(false);
                        } else {
                            g0Var.c0(1899381698);
                            g0Var.r(false);
                        }
                        z2.p pVar12 = pVar2;
                        b2.r rVarH9 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar12, f12, null, 2);
                        objN = g0Var.N();
                        if (objN == cVar) {
                            objN = r0.f16960a;
                            g0Var.n0(objN);
                        }
                        z2.w0 w0Var9 = (z2.w0) objN;
                        int iHashCode9 = Long.hashCode(g0Var.T);
                        b2.r rVarC10 = b2.a.c(rVarH9, g0Var);
                        l1.m1 m1VarM9 = g0Var.m();
                        b3.i.f2042c.getClass();
                        gVar = b3.h.f2035b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(w0Var9, g0Var, b3.h.f2039f);
                        l1.q.I(m1VarM9, g0Var, b3.h.f2038e);
                        l1.q.E(g0Var, b3.h.f2041h);
                        l1.q.I(rVarC10, g0Var, b3.h.f2037d);
                        l1.q.I(Integer.valueOf(iHashCode9), g0Var, b3.h.f2040g);
                        g0Var.r(true);
                        pVar3 = pVar12;
                        f11 = f12;
                        rVar3 = rVar4;
                        dVar3 = dVar4;
                    } else {
                        g0Var.V();
                        rVar3 = rVar2;
                        dVar3 = dVar2;
                        pVar3 = pVar2;
                        f11 = f10;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new u00.n() {
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i19 |= 196608;
                f10 = f3;
                i18 = i19 | 1572864;
                if ((599187 & i18) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i18 & 1, z10)) {
                    rVarC = b2.o.A;
                    if (i20 != 0) {
                        rVar4 = rVarC;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i12 != 0) {
                        dVar4 = b2.b.E;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i14 != 0) {
                        pVar2 = z2.o.f17146b;
                    }
                    if (i16 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f10;
                    }
                    cVar = l1.i.f9868a;
                    if (str != null) {
                        g0Var.c0(1899222916);
                        if ((i18 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN2 = g0Var.N();
                        if (z11) {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        }
                        rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1899381698);
                        g0Var.r(false);
                    }
                    z2.p pVar13 = pVar2;
                    b2.r rVarH10 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar13, f12, null, 2);
                    objN = g0Var.N();
                    if (objN == cVar) {
                        objN = r0.f16960a;
                        g0Var.n0(objN);
                    }
                    z2.w0 w0Var10 = (z2.w0) objN;
                    int iHashCode10 = Long.hashCode(g0Var.T);
                    b2.r rVarC11 = b2.a.c(rVarH10, g0Var);
                    l1.m1 m1VarM10 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0Var10, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM10, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC11, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode10), g0Var, b3.h.f2040g);
                    g0Var.r(true);
                    pVar3 = pVar13;
                    f11 = f12;
                    rVar3 = rVar4;
                    dVar3 = dVar4;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    pVar3 = pVar2;
                    f11 = f10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i19 |= 24576;
            pVar2 = pVar;
            i16 = i11 & 32;
            if (i16 != 0) {
                if ((196608 & i10) == 0) {
                    f10 = f3;
                    if (g0Var.d(f10)) {
                        i17 = 131072;
                    } else {
                        i17 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i19 |= i17;
                }
                i18 = i19 | 1572864;
                if ((599187 & i18) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i18 & 1, z10)) {
                    rVarC = b2.o.A;
                    if (i20 != 0) {
                        rVar4 = rVarC;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i12 != 0) {
                        dVar4 = b2.b.E;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i14 != 0) {
                        pVar2 = z2.o.f17146b;
                    }
                    if (i16 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f10;
                    }
                    cVar = l1.i.f9868a;
                    if (str != null) {
                        g0Var.c0(1899222916);
                        if ((i18 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN2 = g0Var.N();
                        if (z11) {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        }
                        rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1899381698);
                        g0Var.r(false);
                    }
                    z2.p pVar14 = pVar2;
                    b2.r rVarH11 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar14, f12, null, 2);
                    objN = g0Var.N();
                    if (objN == cVar) {
                        objN = r0.f16960a;
                        g0Var.n0(objN);
                    }
                    z2.w0 w0Var11 = (z2.w0) objN;
                    int iHashCode11 = Long.hashCode(g0Var.T);
                    b2.r rVarC12 = b2.a.c(rVarH11, g0Var);
                    l1.m1 m1VarM11 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0Var11, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM11, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC12, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode11), g0Var, b3.h.f2040g);
                    g0Var.r(true);
                    pVar3 = pVar14;
                    f11 = f12;
                    rVar3 = rVar4;
                    dVar3 = dVar4;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    pVar3 = pVar2;
                    f11 = f10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i19 |= 196608;
            f10 = f3;
            i18 = i19 | 1572864;
            if ((599187 & i18) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i18 & 1, z10)) {
                rVarC = b2.o.A;
                if (i20 != 0) {
                    rVar4 = rVarC;
                } else {
                    rVar4 = rVar2;
                }
                if (i12 != 0) {
                    dVar4 = b2.b.E;
                } else {
                    dVar4 = dVar2;
                }
                if (i14 != 0) {
                    pVar2 = z2.o.f17146b;
                }
                if (i16 != 0) {
                    f12 = 1.0f;
                } else {
                    f12 = f10;
                }
                cVar = l1.i.f9868a;
                if (str != null) {
                    g0Var.c0(1899222916);
                    if ((i18 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objN2 = g0Var.N();
                    if (z11) {
                        objN2 = new hb.u(str, 27);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new hb.u(str, 27);
                        g0Var.n0(objN2);
                    }
                    rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1899381698);
                    g0Var.r(false);
                }
                z2.p pVar15 = pVar2;
                b2.r rVarH12 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar15, f12, null, 2);
                objN = g0Var.N();
                if (objN == cVar) {
                    objN = r0.f16960a;
                    g0Var.n0(objN);
                }
                z2.w0 w0Var12 = (z2.w0) objN;
                int iHashCode12 = Long.hashCode(g0Var.T);
                b2.r rVarC13 = b2.a.c(rVarH12, g0Var);
                l1.m1 m1VarM12 = g0Var.m();
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0Var12, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM12, g0Var, b3.h.f2038e);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC13, g0Var, b3.h.f2037d);
                l1.q.I(Integer.valueOf(iHashCode12), g0Var, b3.h.f2040g);
                g0Var.r(true);
                pVar3 = pVar15;
                f11 = f12;
                rVar3 = rVar4;
                dVar3 = dVar4;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                dVar3 = dVar2;
                pVar3 = pVar2;
                f11 = f10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                        return g00.b0.a;
                    }
                };
            }
        }
        i19 |= 3072;
        dVar2 = dVar;
        i14 = i11 & 16;
        if (i14 != 0) {
            if ((i10 & 24576) == 0) {
                pVar2 = pVar;
                if (g0Var.g(pVar2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i19 |= i15;
            }
            i16 = i11 & 32;
            if (i16 != 0) {
                if ((196608 & i10) == 0) {
                    f10 = f3;
                    if (g0Var.d(f10)) {
                        i17 = 131072;
                    } else {
                        i17 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i19 |= i17;
                }
                i18 = i19 | 1572864;
                if ((599187 & i18) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (g0Var.S(i18 & 1, z10)) {
                    rVarC = b2.o.A;
                    if (i20 != 0) {
                        rVar4 = rVarC;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i12 != 0) {
                        dVar4 = b2.b.E;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i14 != 0) {
                        pVar2 = z2.o.f17146b;
                    }
                    if (i16 != 0) {
                        f12 = 1.0f;
                    } else {
                        f12 = f10;
                    }
                    cVar = l1.i.f9868a;
                    if (str != null) {
                        g0Var.c0(1899222916);
                        if ((i18 & 112) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objN2 = g0Var.N();
                        if (z11) {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        } else {
                            objN2 = new hb.u(str, 27);
                            g0Var.n0(objN2);
                        }
                        rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1899381698);
                        g0Var.r(false);
                    }
                    z2.p pVar16 = pVar2;
                    b2.r rVarH13 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar16, f12, null, 2);
                    objN = g0Var.N();
                    if (objN == cVar) {
                        objN = r0.f16960a;
                        g0Var.n0(objN);
                    }
                    z2.w0 w0Var13 = (z2.w0) objN;
                    int iHashCode13 = Long.hashCode(g0Var.T);
                    b2.r rVarC14 = b2.a.c(rVarH13, g0Var);
                    l1.m1 m1VarM13 = g0Var.m();
                    b3.i.f2042c.getClass();
                    gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0Var13, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM13, g0Var, b3.h.f2038e);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC14, g0Var, b3.h.f2037d);
                    l1.q.I(Integer.valueOf(iHashCode13), g0Var, b3.h.f2040g);
                    g0Var.r(true);
                    pVar3 = pVar16;
                    f11 = f12;
                    rVar3 = rVar4;
                    dVar3 = dVar4;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    dVar3 = dVar2;
                    pVar3 = pVar2;
                    f11 = f10;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new u00.n() {
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i19 |= 196608;
            f10 = f3;
            i18 = i19 | 1572864;
            if ((599187 & i18) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i18 & 1, z10)) {
                rVarC = b2.o.A;
                if (i20 != 0) {
                    rVar4 = rVarC;
                } else {
                    rVar4 = rVar2;
                }
                if (i12 != 0) {
                    dVar4 = b2.b.E;
                } else {
                    dVar4 = dVar2;
                }
                if (i14 != 0) {
                    pVar2 = z2.o.f17146b;
                }
                if (i16 != 0) {
                    f12 = 1.0f;
                } else {
                    f12 = f10;
                }
                cVar = l1.i.f9868a;
                if (str != null) {
                    g0Var.c0(1899222916);
                    if ((i18 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objN2 = g0Var.N();
                    if (z11) {
                        objN2 = new hb.u(str, 27);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new hb.u(str, 27);
                        g0Var.n0(objN2);
                    }
                    rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1899381698);
                    g0Var.r(false);
                }
                z2.p pVar17 = pVar2;
                b2.r rVarH14 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar17, f12, null, 2);
                objN = g0Var.N();
                if (objN == cVar) {
                    objN = r0.f16960a;
                    g0Var.n0(objN);
                }
                z2.w0 w0Var14 = (z2.w0) objN;
                int iHashCode14 = Long.hashCode(g0Var.T);
                b2.r rVarC15 = b2.a.c(rVarH14, g0Var);
                l1.m1 m1VarM14 = g0Var.m();
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0Var14, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM14, g0Var, b3.h.f2038e);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC15, g0Var, b3.h.f2037d);
                l1.q.I(Integer.valueOf(iHashCode14), g0Var, b3.h.f2040g);
                g0Var.r(true);
                pVar3 = pVar17;
                f11 = f12;
                rVar3 = rVar4;
                dVar3 = dVar4;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                dVar3 = dVar2;
                pVar3 = pVar2;
                f11 = f10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                        return g00.b0.a;
                    }
                };
            }
        }
        i19 |= 24576;
        pVar2 = pVar;
        i16 = i11 & 32;
        if (i16 != 0) {
            if ((196608 & i10) == 0) {
                f10 = f3;
                if (g0Var.d(f10)) {
                    i17 = 131072;
                } else {
                    i17 = Cast.MAX_MESSAGE_LENGTH;
                }
                i19 |= i17;
            }
            i18 = i19 | 1572864;
            if ((599187 & i18) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i18 & 1, z10)) {
                rVarC = b2.o.A;
                if (i20 != 0) {
                    rVar4 = rVarC;
                } else {
                    rVar4 = rVar2;
                }
                if (i12 != 0) {
                    dVar4 = b2.b.E;
                } else {
                    dVar4 = dVar2;
                }
                if (i14 != 0) {
                    pVar2 = z2.o.f17146b;
                }
                if (i16 != 0) {
                    f12 = 1.0f;
                } else {
                    f12 = f10;
                }
                cVar = l1.i.f9868a;
                if (str != null) {
                    g0Var.c0(1899222916);
                    if ((i18 & 112) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objN2 = g0Var.N();
                    if (z11) {
                        objN2 = new hb.u(str, 27);
                        g0Var.n0(objN2);
                    } else {
                        objN2 = new hb.u(str, 27);
                        g0Var.n0(objN2);
                    }
                    rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1899381698);
                    g0Var.r(false);
                }
                z2.p pVar18 = pVar2;
                b2.r rVarH15 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar18, f12, null, 2);
                objN = g0Var.N();
                if (objN == cVar) {
                    objN = r0.f16960a;
                    g0Var.n0(objN);
                }
                z2.w0 w0Var15 = (z2.w0) objN;
                int iHashCode15 = Long.hashCode(g0Var.T);
                b2.r rVarC16 = b2.a.c(rVarH15, g0Var);
                l1.m1 m1VarM15 = g0Var.m();
                b3.i.f2042c.getClass();
                gVar = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0Var15, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM15, g0Var, b3.h.f2038e);
                l1.q.E(g0Var, b3.h.f2041h);
                l1.q.I(rVarC16, g0Var, b3.h.f2037d);
                l1.q.I(Integer.valueOf(iHashCode15), g0Var, b3.h.f2040g);
                g0Var.r(true);
                pVar3 = pVar18;
                f11 = f12;
                rVar3 = rVar4;
                dVar3 = dVar4;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                dVar3 = dVar2;
                pVar3 = pVar2;
                f11 = f10;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new u00.n() {
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                        return g00.b0.a;
                    }
                };
            }
        }
        i19 |= 196608;
        f10 = f3;
        i18 = i19 | 1572864;
        if ((599187 & i18) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g0Var.S(i18 & 1, z10)) {
            rVarC = b2.o.A;
            if (i20 != 0) {
                rVar4 = rVarC;
            } else {
                rVar4 = rVar2;
            }
            if (i12 != 0) {
                dVar4 = b2.b.E;
            } else {
                dVar4 = dVar2;
            }
            if (i14 != 0) {
                pVar2 = z2.o.f17146b;
            }
            if (i16 != 0) {
                f12 = 1.0f;
            } else {
                f12 = f10;
            }
            cVar = l1.i.f9868a;
            if (str != null) {
                g0Var.c0(1899222916);
                if ((i18 & 112) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objN2 = g0Var.N();
                if (z11) {
                    objN2 = new hb.u(str, 27);
                    g0Var.n0(objN2);
                } else {
                    objN2 = new hb.u(str, 27);
                    g0Var.n0(objN2);
                }
                rVarC = j3.q.c(rVarC, false, (u00.k) objN2);
                g0Var.r(false);
            } else {
                g0Var.c0(1899381698);
                g0Var.r(false);
            }
            z2.p pVar19 = pVar2;
            b2.r rVarH16 = f2.h.h(f2.h.d(rVar4.V(rVarC)), bVar, dVar4, pVar19, f12, null, 2);
            objN = g0Var.N();
            if (objN == cVar) {
                objN = r0.f16960a;
                g0Var.n0(objN);
            }
            z2.w0 w0Var16 = (z2.w0) objN;
            int iHashCode16 = Long.hashCode(g0Var.T);
            b2.r rVarC17 = b2.a.c(rVarH16, g0Var);
            l1.m1 m1VarM16 = g0Var.m();
            b3.i.f2042c.getClass();
            gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0Var16, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM16, g0Var, b3.h.f2038e);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC17, g0Var, b3.h.f2037d);
            l1.q.I(Integer.valueOf(iHashCode16), g0Var, b3.h.f2040g);
            g0Var.r(true);
            pVar3 = pVar19;
            f11 = f12;
            rVar3 = rVar4;
            dVar3 = dVar4;
        } else {
            g0Var.V();
            rVar3 = rVar2;
            dVar3 = dVar2;
            pVar3 = pVar2;
            f11 = f10;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n.c(bVar, str, rVar3, dVar3, pVar3, f11, (l1.j) obj, l1.q.K(i10 | 1), i11);
                    return g00.b0.a;
                }
            };
        }
    }

    public static float d(EdgeEffect edgeEffect, float f3, float f10, y3.c cVar) {
        float distance;
        float f11 = c0.f16895a;
        double dC = cVar.c() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f3) * 0.35f;
        double d3 = ((double) c0.f16895a) * dC;
        float fExp = (float) (Math.exp((c0.f16896b / c0.f16897c) * Math.log(dAbs / d3)) * d3);
        try {
            distance = edgeEffect.getDistance();
        } catch (Throwable unused) {
            distance = 0.0f;
        }
        if (fExp > distance * f10) {
            return 0.0f;
        }
        edgeEffect.onAbsorb(w00.a.F(f3));
        return f3;
    }

    public static b2.r e(b2.r rVar, i2.q qVar, i2.t0 t0Var, int i10) {
        if ((i10 & 2) != 0) {
            t0Var = i2.b0.f7111b;
        }
        return rVar.V(new m(0L, qVar, t0Var, 1));
    }

    public static final b2.r f(b2.r rVar, long j9, i2.t0 t0Var) {
        return rVar.V(new m(j9, null, t0Var, 2));
    }

    public static final b2.r g(b2.r rVar, float f3, long j9, i2.t0 t0Var) {
        return rVar.V(new t(f3, new i2.v0(j9), t0Var));
    }

    public static final void h(long j9, d0.q1 q1Var) {
        if (q1Var == d0.q1.A) {
            if (y3.a.g(j9) != Integer.MAX_VALUE) {
                return;
            }
            g0.a.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (y3.a.h(j9) != Integer.MAX_VALUE) {
                return;
            }
            g0.a.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final b2.r i(b2.r rVar, boolean z10, f0.i iVar) {
        return rVar.V(z10 ? new e0(iVar) : b2.o.A);
    }

    public static final i0 j(b3.l lVar) {
        o2 o2VarJ = b3.m.j(lVar, j0.P);
        j0 j0Var = o2VarJ instanceof j0 ? (j0) o2VarJ : null;
        if (j0Var != null) {
            return j0Var.O;
        }
        return null;
    }

    public static b2.r k(b2.r rVar, f0.i iVar) {
        return rVar.V(new l0(iVar));
    }

    public static final p1 l(l1.j jVar) {
        Object[] objArr = new Object[0];
        boolean zE = ((l1.g0) jVar).e(0);
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        if (zE || objN == l1.i.f9868a) {
            objN = new sy.e(25);
            g0Var.n0(objN);
        }
        return (p1) y1.k.f(objArr, p1.f16950j, (u00.a) objN, jVar, 0);
    }

    public static b2.r m(b2.r rVar, p1 p1Var, boolean z10, boolean z11) {
        d0.q1 q1Var = z11 ? d0.q1.A : d0.q1.B;
        f0.i iVar = p1Var.f16954d;
        float f3 = x.f16972a;
        d0.q1 q1Var2 = d0.q1.A;
        b2.o oVar = b2.o.A;
        return rVar.V(q1Var == q1Var2 ? f2.h.c(oVar, k0.f16942c) : f2.h.c(oVar, k0.f16941b)).V(new q1(null, null, q1Var, p1Var, iVar, null, z10, true)).V(new s1(p1Var, z11));
    }

    public static final b2.r n(b2.r rVar, n2 n2Var, d0.q1 q1Var, h1 h1Var, boolean z10, d0.t0 t0Var, f0.i iVar, m0.i iVar2) {
        float f3 = x.f16972a;
        d0.q1 q1Var2 = d0.q1.A;
        b2.o oVar = b2.o.A;
        return rVar.V(q1Var == q1Var2 ? f2.h.c(oVar, k0.f16942c) : f2.h.c(oVar, k0.f16941b)).V(new q1(iVar2, t0Var, q1Var, n2Var, iVar, h1Var, z10, false));
    }

    public static final long o(float f3, long j9) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j9 >> 32)) - f3);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j9 & 4294967295L)) - f3);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static b2.r p(b2.r rVar, p1 p1Var, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return m(rVar, p1Var, z10, true);
    }
}
