package w;

import com.google.android.gms.cast.Cast;
import java.util.List;
import java.util.ListIterator;

public abstract class c0 {
    public static final void a(x.n1 n1Var, u00.k kVar, b2.r rVar, x0 x0Var, y0 y0Var, u00.n nVar, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var;
        l1.c cVar2;
        boolean z10;
        boolean z11;
        x.j1 j1Var;
        x.j1 j1Var2;
        x.j1 j1Var3;
        boolean z12;
        x.j1 j1VarN;
        boolean z13;
        x.j1 j1Var4;
        x.n1 n1Var2;
        x.j1 j1VarN2;
        y0 y0Var2;
        x.n1 n1Var3;
        boolean z14;
        l1.i1 i1Var = n1Var.f16326d;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1912839215);
        if ((i10 & 6) == 0) {
            i11 = (g0Var2.g(n1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var2.i(kVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var2.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var2.g(x0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var2.g(y0Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var2.i(nVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        int i12 = i11 | 1572864;
        if ((12582912 & i10) == 0) {
            i12 |= g0Var2.i(cVar) ? 8388608 : 4194304;
        }
        int i13 = i12;
        if (g0Var2.S(i13 & 1, (i13 & 4793491) != 4793490)) {
            f5.c cVar3 = n1Var.f16323a;
            if (((Boolean) kVar.invoke(i1Var.getValue())).booleanValue() || ((Boolean) kVar.invoke(cVar3.J0())).booleanValue() || n1Var.g() || n1Var.d()) {
                g0Var2.c0(-232386135);
                int i14 = i13 & 14;
                int i15 = i14 | 48;
                int i16 = i15 & 14;
                boolean z15 = ((i16 ^ 6) > 4 && g0Var2.g(n1Var)) || (i15 & 6) == 4;
                Object objN = g0Var2.N();
                l1.c cVar4 = l1.i.f9868a;
                if (z15 || objN == cVar4) {
                    objN = cVar3.J0();
                    g0Var2.n0(objN);
                }
                if (n1Var.g()) {
                    objN = cVar3.J0();
                }
                g0Var2.c0(1844425648);
                l0 l0VarK = k(n1Var, kVar, objN, g0Var2);
                g0Var2.r(false);
                Object value = i1Var.getValue();
                g0Var2.c0(1844425648);
                l0 l0VarK2 = k(n1Var, kVar, value, g0Var2);
                g0Var2.r(false);
                x.n1 n1VarM = x.c.m(n1Var, l0VarK, l0VarK2, "EnterExitTransition", g0Var2, i16 | 3072);
                x.r1 r1Var = s0.f15806a;
                boolean zG = g0Var2.g(n1VarM);
                Object objN2 = g0Var2.N();
                if (zG || objN2 == cVar4) {
                    objN2 = l1.q.z(x0Var);
                    g0Var2.n0(objN2);
                }
                l1.z0 z0Var = (l1.z0) objN2;
                f5.c cVar5 = n1VarM.f16323a;
                f5.c cVar6 = n1VarM.f16323a;
                l1.i1 i1Var2 = n1VarM.f16326d;
                if (cVar5.J0() == i1Var2.getValue() && cVar6.J0() == l0.B) {
                    if (n1VarM.g()) {
                        z0Var.setValue(x0Var);
                    } else {
                        z0Var.setValue(x0.f15819b);
                    }
                } else if (i1Var2.getValue() == l0.B) {
                    z0Var.setValue(((x0) z0Var.getValue()).a(x0Var));
                }
                x0 x0Var2 = (x0) z0Var.getValue();
                boolean zG2 = g0Var2.g(n1VarM);
                Object objN3 = g0Var2.N();
                if (zG2 || objN3 == cVar4) {
                    objN3 = l1.q.z(y0Var);
                    g0Var2.n0(objN3);
                }
                l1.z0 z0Var2 = (l1.z0) objN3;
                if (cVar6.J0() == i1Var2.getValue() && cVar6.J0() == l0.B) {
                    if (n1VarM.g()) {
                        z0Var2.setValue(y0Var);
                    } else {
                        z0Var2.setValue(y0.f15822b);
                    }
                } else if (i1Var2.getValue() != l0.B) {
                    z0Var2.setValue(((y0) z0Var2.getValue()).a(y0Var));
                }
                y0 y0Var3 = (y0) z0Var2.getValue();
                l1.z0 z0VarG = l1.q.G(nVar, g0Var2);
                Object objInvoke = nVar.invoke(cVar6.J0(), i1Var2.getValue());
                boolean zG3 = g0Var2.g(n1VarM) | g0Var2.g(z0VarG);
                Object objN4 = g0Var2.N();
                if (zG3 || objN4 == cVar4) {
                    objN4 = new pz.k(n1VarM, z0VarG, (k00.c) null, 18);
                    g0Var2.n0(objN4);
                }
                l1.z0 z0VarC = l1.q.C(objInvoke, g0Var2, (u00.n) objN4);
                Object objJ0 = cVar6.J0();
                l0 l0Var = l0.C;
                if (objJ0 == l0Var && i1Var2.getValue() == l0Var && ((Boolean) z0VarC.getValue()).booleanValue()) {
                    g0Var2.c0(-229368781);
                    z14 = false;
                    g0Var2.r(false);
                    g0Var = g0Var2;
                } else {
                    g0Var2.c0(-230699766);
                    boolean z16 = i14 == 4;
                    Object objN5 = g0Var2.N();
                    if (z16 || objN5 == cVar4) {
                        objN5 = new e0(n1VarM);
                        g0Var2.n0(objN5);
                    }
                    e0 e0Var = (e0) objN5;
                    x.r1 r1Var2 = x.c.f16262q;
                    Object objN6 = g0Var2.N();
                    if (objN6 == cVar4) {
                        objN6 = p0.B;
                        g0Var2.n0(objN6);
                    }
                    u00.a aVar = (u00.a) objN6;
                    g0Var2.c0(-167964673);
                    g0Var2.r(false);
                    g0Var2.c0(-167961890);
                    g0Var2.r(false);
                    g2 g2Var = x0Var2.f15820a;
                    g2 g2Var2 = y0Var3.f15824a;
                    d2 d2Var = g2Var.f15766b;
                    i0 i0Var = g2Var.f15767c;
                    boolean z17 = (d2Var == null && g2Var2.f15766b == null) ? false : true;
                    boolean z18 = (i0Var == null && g2Var2.f15767c == null) ? false : true;
                    if (z17) {
                        g0Var2.c0(-911488127);
                        Object objN7 = g0Var2.N();
                        if (objN7 == cVar4) {
                            objN7 = "Built-in slide";
                            g0Var2.n0("Built-in slide");
                        }
                        cVar2 = cVar4;
                        z10 = true;
                        z11 = false;
                        x.j1 j1VarN3 = x.c.n(n1VarM, r1Var2, (String) objN7, g0Var2, 384, 0);
                        g0Var = g0Var2;
                        g0Var.r(false);
                        j1Var = j1VarN3;
                    } else {
                        g0Var = g0Var2;
                        cVar2 = cVar4;
                        z10 = true;
                        z11 = false;
                        g0Var.c0(-911382324);
                        g0Var.r(false);
                        j1Var = null;
                    }
                    if (z18 != 0) {
                        g0Var.c0(-911290533);
                        x.r1 r1Var3 = x.c.f16263r;
                        Object objN8 = g0Var.N();
                        if (objN8 == cVar2) {
                            objN8 = "Built-in shrink/expand";
                            g0Var.n0("Built-in shrink/expand");
                        }
                        l1.g0 g0Var3 = g0Var;
                        x.j1 j1VarN4 = x.c.n(n1VarM, r1Var3, (String) objN8, g0Var3, 384, 0);
                        g0Var = g0Var3;
                        g0Var.r(z11);
                        j1Var2 = j1VarN4;
                    } else {
                        g0Var.c0(-911179709);
                        g0Var.r(z11);
                        j1Var2 = null;
                    }
                    if (z18 != 0) {
                        g0Var.c0(-911106083);
                        Object objN9 = g0Var.N();
                        if (objN9 == cVar2) {
                            objN9 = "Built-in InterruptionHandlingOffset";
                            g0Var.n0("Built-in InterruptionHandlingOffset");
                        }
                        l1.g0 g0Var4 = g0Var;
                        x.j1 j1VarN5 = x.c.n(n1VarM, r1Var2, (String) objN9, g0Var4, 384, 0);
                        g0Var = g0Var4;
                        g0Var.r(z11);
                        j1Var3 = j1VarN5;
                    } else {
                        g0Var.c0(-910935677);
                        g0Var.r(z11);
                        j1Var3 = null;
                    }
                    boolean z19 = !z18;
                    float[] fArr = j2.d.f7863a;
                    g0Var.c0(-910130296);
                    g0Var.r(z11);
                    x.r1 r1Var4 = x.c.f16258k;
                    boolean z20 = (g2Var.f15765a == null && g2Var2.f15765a == null) ? false : z10;
                    boolean z21 = (g2Var.f15768d == null && g2Var2.f15768d == null) ? false : z10;
                    if (z20) {
                        g0Var.c0(-703879421);
                        Object objN10 = g0Var.N();
                        if (objN10 == cVar2) {
                            objN10 = "Built-in alpha";
                            g0Var.n0("Built-in alpha");
                        }
                        String str = (String) objN10;
                        z12 = z19;
                        l1.g0 g0Var5 = g0Var;
                        j1VarN = x.c.n(n1VarM, r1Var4, str, g0Var5, 384, 0);
                        g0Var = g0Var5;
                        g0Var.r(false);
                    } else {
                        z12 = z19;
                        g0Var.c0(-703709976);
                        g0Var.r(false);
                        j1VarN = null;
                    }
                    if (z21) {
                        g0Var.c0(-703642333);
                        Object objN11 = g0Var.N();
                        if (objN11 == cVar2) {
                            objN11 = "Built-in scale";
                            g0Var.n0("Built-in scale");
                        }
                        l1.g0 g0Var6 = g0Var;
                        x.j1 j1VarN6 = x.c.n(n1VarM, r1Var4, (String) objN11, g0Var6, 384, 0);
                        g0Var = g0Var6;
                        z13 = false;
                        g0Var.r(false);
                        j1Var4 = j1VarN6;
                    } else {
                        z13 = false;
                        g0Var.c0(-703472888);
                        g0Var.r(false);
                        j1Var4 = null;
                    }
                    if (z21) {
                        g0Var.c0(-703395232);
                        boolean z22 = z13;
                        l1.g0 g0Var7 = g0Var;
                        j1VarN2 = x.c.n(n1VarM, s0.f15806a, "TransformOriginInterruptionHandling", g0Var7, 384, 0);
                        n1Var2 = n1VarM;
                        g0Var = g0Var7;
                        g0Var.r(z22);
                    } else {
                        boolean z23 = z13;
                        n1Var2 = n1VarM;
                        g0Var.c0(-703222904);
                        g0Var.r(z23);
                        j1VarN2 = null;
                    }
                    boolean zI = g0Var.i(j1VarN) | g0Var.g(x0Var2) | g0Var.g(y0Var3) | g0Var.i(j1Var4) | g0Var.g(n1Var2) | g0Var.i(j1VarN2);
                    Object objN12 = g0Var.N();
                    if (zI || objN12 == cVar2) {
                        y0Var2 = y0Var3;
                        n1Var3 = n1Var2;
                        objN12 = new n0(j1VarN, j1Var4, n1Var3, x0Var2, y0Var2, j1VarN2);
                        g0Var.n0(objN12);
                    } else {
                        y0Var2 = y0Var3;
                        n1Var3 = n1Var2;
                    }
                    n0 n0Var = (n0) objN12;
                    boolean zH = g0Var.h(z12) | g0Var.g(aVar);
                    Object objN13 = g0Var.N();
                    if (zH || objN13 == cVar2) {
                        objN13 = new q0(aVar, z12);
                        g0Var.n0(objN13);
                    }
                    b2.o oVar = b2.o.A;
                    b2.r rVarV = i2.b0.p(oVar, (u00.k) objN13).V(new m0(n1Var3, j1Var2, j1Var3, j1Var, x0Var2, y0Var2, aVar, n0Var)).V(oVar);
                    g0Var.c0(-7404393);
                    g0Var.r(false);
                    b2.r rVarV2 = rVar.V(rVarV.V(oVar));
                    Object objN14 = g0Var.N();
                    if (objN14 == cVar2) {
                        objN14 = new w(e0Var);
                        g0Var.n0(objN14);
                    }
                    w wVar = (w) objN14;
                    int iHashCode = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM = g0Var.m();
                    b2.r rVarC = b2.a.c(rVarV2, g0Var);
                    b3.i.f2042c.getClass();
                    b3.g gVar = b3.h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(wVar, g0Var, b3.h.f2039f);
                    l1.q.I(m1VarM, g0Var, b3.h.f2038e);
                    l1.q.v(g0Var, Integer.valueOf(iHashCode), b3.h.f2040g);
                    l1.q.E(g0Var, b3.h.f2041h);
                    l1.q.I(rVarC, g0Var, b3.h.f2037d);
                    cVar.invoke(e0Var, g0Var, Integer.valueOf((i13 >> 18) & 112));
                    g0Var.r(z10);
                    z14 = false;
                    g0Var.r(false);
                }
                g0Var.r(z14);
            } else {
                g0Var2.c0(-229362829);
                g0Var2.r(false);
                g0Var = g0Var2;
            }
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new x(n1Var, kVar, rVar, x0Var, y0Var, nVar, cVar, i10);
        }
    }

    public static final void b(h0.w wVar, boolean z10, b2.r rVar, x0 x0Var, y0 y0Var, String str, v1.c cVar, l1.j jVar, int i10, int i11) {
        int i12;
        x0 x0Var2;
        int i13;
        y0 y0Var2;
        int i14;
        int i15;
        v1.c cVar2;
        boolean z11;
        b2.r rVar2;
        y0 y0Var3;
        String str2;
        l1.r1 r1VarT;
        b2.r rVar3;
        x0 x0VarA;
        y0 y0VarA;
        Object objN;
        int i16;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1799879339);
        if ((i10 & 48) == 0) {
            i12 = (g0Var.h(z10) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= g0Var.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 3072) == 0) {
                x0Var2 = x0Var;
                i12 |= g0Var.g(x0Var2) ? 2048 : 1024;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 24576) == 0) {
                    y0Var2 = y0Var;
                    if (g0Var.g(y0Var2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i12 | 196608;
                if ((1572864 & i10) == 0) {
                    cVar2 = cVar;
                    if (g0Var.i(cVar2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i15 |= i16;
                } else {
                    cVar2 = cVar;
                }
                if ((599185 & i15) != 599184) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (g0Var.S(i15 & 1, z11)) {
                    if (i17 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i18 != 0) {
                        x0VarA = s0.c(null, 3).a(s0.b(null, 15));
                    } else {
                        x0VarA = x0Var2;
                    }
                    if (i13 != 0) {
                        y0VarA = s0.d(null, 3).a(s0.h(null, 15));
                    } else {
                        y0VarA = y0Var2;
                    }
                    int i19 = i15 >> 3;
                    x.n1 n1VarY = x.c.y(Boolean.valueOf(z10), "AnimatedVisibility", g0Var, (i19 & 14) | ((i15 >> 12) & 112), 0);
                    objN = g0Var.N();
                    if (objN == l1.i.f9868a) {
                        objN = f.F;
                        g0Var.n0(objN);
                    }
                    e(n1VarY, (u00.k) objN, rVar3, x0VarA, y0VarA, cVar2, g0Var, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i19 & 458752));
                    y0Var3 = y0VarA;
                    str2 = "AnimatedVisibility";
                    x0Var2 = x0VarA;
                    rVar2 = rVar3;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    y0Var3 = y0Var2;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new a0(wVar, z10, rVar2, x0Var2, y0Var3, str2, cVar, i10, i11);
                }
            }
            i12 |= 24576;
            y0Var2 = y0Var;
            i15 = i12 | 196608;
            if ((1572864 & i10) == 0) {
                cVar2 = cVar;
                if (g0Var.i(cVar2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i15 |= i16;
            } else {
                cVar2 = cVar;
            }
            if ((599185 & i15) != 599184) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var.S(i15 & 1, z11)) {
                if (i17 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                if (i18 != 0) {
                    x0VarA = s0.c(null, 3).a(s0.b(null, 15));
                } else {
                    x0VarA = x0Var2;
                }
                if (i13 != 0) {
                    y0VarA = s0.d(null, 3).a(s0.h(null, 15));
                } else {
                    y0VarA = y0Var2;
                }
                int i110 = i15 >> 3;
                x.n1 n1VarY2 = x.c.y(Boolean.valueOf(z10), "AnimatedVisibility", g0Var, (i110 & 14) | ((i15 >> 12) & 112), 0);
                objN = g0Var.N();
                if (objN == l1.i.f9868a) {
                    objN = f.F;
                    g0Var.n0(objN);
                }
                e(n1VarY2, (u00.k) objN, rVar3, x0VarA, y0VarA, cVar2, g0Var, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i110 & 458752));
                y0Var3 = y0VarA;
                str2 = "AnimatedVisibility";
                x0Var2 = x0VarA;
                rVar2 = rVar3;
            } else {
                g0Var.V();
                rVar2 = rVar;
                y0Var3 = y0Var2;
                str2 = str;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new a0(wVar, z10, rVar2, x0Var2, y0Var3, str2, cVar, i10, i11);
            }
        }
        i12 |= 3072;
        x0Var2 = x0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 24576) == 0) {
                y0Var2 = y0Var;
                if (g0Var.g(y0Var2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i12 | 196608;
            if ((1572864 & i10) == 0) {
                cVar2 = cVar;
                if (g0Var.i(cVar2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i15 |= i16;
            } else {
                cVar2 = cVar;
            }
            if ((599185 & i15) != 599184) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var.S(i15 & 1, z11)) {
                if (i17 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                if (i18 != 0) {
                    x0VarA = s0.c(null, 3).a(s0.b(null, 15));
                } else {
                    x0VarA = x0Var2;
                }
                if (i13 != 0) {
                    y0VarA = s0.d(null, 3).a(s0.h(null, 15));
                } else {
                    y0VarA = y0Var2;
                }
                int i111 = i15 >> 3;
                x.n1 n1VarY3 = x.c.y(Boolean.valueOf(z10), "AnimatedVisibility", g0Var, (i111 & 14) | ((i15 >> 12) & 112), 0);
                objN = g0Var.N();
                if (objN == l1.i.f9868a) {
                    objN = f.F;
                    g0Var.n0(objN);
                }
                e(n1VarY3, (u00.k) objN, rVar3, x0VarA, y0VarA, cVar2, g0Var, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i111 & 458752));
                y0Var3 = y0VarA;
                str2 = "AnimatedVisibility";
                x0Var2 = x0VarA;
                rVar2 = rVar3;
            } else {
                g0Var.V();
                rVar2 = rVar;
                y0Var3 = y0Var2;
                str2 = str;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new a0(wVar, z10, rVar2, x0Var2, y0Var3, str2, cVar, i10, i11);
            }
        }
        i12 |= 24576;
        y0Var2 = y0Var;
        i15 = i12 | 196608;
        if ((1572864 & i10) == 0) {
            cVar2 = cVar;
            if (g0Var.i(cVar2)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i15 |= i16;
        } else {
            cVar2 = cVar;
        }
        if ((599185 & i15) != 599184) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g0Var.S(i15 & 1, z11)) {
            if (i17 != 0) {
                rVar3 = b2.o.A;
            } else {
                rVar3 = rVar;
            }
            if (i18 != 0) {
                x0VarA = s0.c(null, 3).a(s0.b(null, 15));
            } else {
                x0VarA = x0Var2;
            }
            if (i13 != 0) {
                y0VarA = s0.d(null, 3).a(s0.h(null, 15));
            } else {
                y0VarA = y0Var2;
            }
            int i112 = i15 >> 3;
            x.n1 n1VarY4 = x.c.y(Boolean.valueOf(z10), "AnimatedVisibility", g0Var, (i112 & 14) | ((i15 >> 12) & 112), 0);
            objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = f.F;
                g0Var.n0(objN);
            }
            e(n1VarY4, (u00.k) objN, rVar3, x0VarA, y0VarA, cVar2, g0Var, (i15 & 57344) | (i15 & 896) | 48 | (i15 & 7168) | (i112 & 458752));
            y0Var3 = y0VarA;
            str2 = "AnimatedVisibility";
            x0Var2 = x0VarA;
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
            y0Var3 = y0Var2;
            str2 = str;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new a0(wVar, z10, rVar2, x0Var2, y0Var3, str2, cVar, i10, i11);
        }
    }

    public static final void c(boolean z10, b2.r rVar, x0 x0Var, y0 y0Var, String str, v1.c cVar, l1.j jVar, int i10, int i11) {
        boolean z11;
        int i12;
        b2.r rVar2;
        int i13;
        x0 x0VarA;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z12;
        y0 y0Var2;
        b2.r rVar3;
        x0 x0Var2;
        String str2;
        l1.r1 r1VarT;
        b2.r rVar4;
        y0 y0VarA;
        Object objN;
        int i18;
        b2.i iVar = b2.b.I;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1448730565);
        if ((i10 & 6) == 0) {
            z11 = z10;
            i12 = (g0Var.h(z11) ? 4 : 2) | i10;
        } else {
            z11 = z10;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                rVar2 = rVar;
                i12 |= g0Var.g(rVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    x0VarA = x0Var;
                    if (g0Var.g(x0VarA)) {
                        i14 = 256;
                    } else {
                        i14 = Cast.MAX_NAMESPACE_LENGTH;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        if (g0Var.g(y0Var)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i12 | 24576;
                    if ((196608 & i10) == 0) {
                        if (g0Var.i(cVar)) {
                            i18 = 131072;
                        } else {
                            i18 = Cast.MAX_MESSAGE_LENGTH;
                        }
                        i17 |= i18;
                    }
                    if ((74899 & i17) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (g0Var.S(i17 & 1, z12)) {
                        if (i19 != 0) {
                            rVar4 = b2.o.A;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i13 != 0) {
                            long j9 = 1;
                            x0VarA = s0.c(null, 3).a(s0.a(iVar, f.M, x.c.v(0.0f, 400.0f, new y3.l((j9 << 32) | (j9 & 4294967295L)), 1)));
                        }
                        if (i15 != 0) {
                            x.r1 r1Var = s0.f15806a;
                            long j10 = 1;
                            y0VarA = s0.g(iVar, f.O, x.c.v(0.0f, 400.0f, new y3.l((j10 << 32) | (j10 & 4294967295L)), 1)).a(s0.d(null, 3));
                        } else {
                            y0VarA = y0Var;
                        }
                        x.n1 n1VarY = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i17 & 14) | ((i17 >> 9) & 112), 0);
                        objN = g0Var.N();
                        if (objN == l1.i.f9868a) {
                            objN = f.D;
                            g0Var.n0(objN);
                        }
                        u00.k kVar = (u00.k) objN;
                        int i20 = i17 << 3;
                        x0 x0Var3 = x0VarA;
                        e(n1VarY, kVar, rVar4, x0Var3, y0VarA, cVar, g0Var, (i20 & 57344) | (i20 & 896) | 48 | (i20 & 7168) | (i17 & 458752));
                        str2 = "AnimatedVisibility";
                        rVar3 = rVar4;
                        x0Var2 = x0Var3;
                        y0Var2 = y0VarA;
                    } else {
                        g0Var.V();
                        y0Var2 = y0Var;
                        rVar3 = rVar2;
                        x0Var2 = x0VarA;
                        str2 = str;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new z(z11, rVar3, x0Var2, y0Var2, str2, cVar, i10, i11, 0);
                    }
                }
                i12 |= 3072;
                i17 = i12 | 24576;
                if ((196608 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i18 = 131072;
                    } else {
                        i18 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i17 |= i18;
                }
                if ((74899 & i17) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (g0Var.S(i17 & 1, z12)) {
                    if (i19 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i13 != 0) {
                        long j11 = 1;
                        x0VarA = s0.c(null, 3).a(s0.a(iVar, f.M, x.c.v(0.0f, 400.0f, new y3.l((j11 << 32) | (j11 & 4294967295L)), 1)));
                    }
                    if (i15 != 0) {
                        x.r1 r1Var2 = s0.f15806a;
                        long j12 = 1;
                        y0VarA = s0.g(iVar, f.O, x.c.v(0.0f, 400.0f, new y3.l((j12 << 32) | (j12 & 4294967295L)), 1)).a(s0.d(null, 3));
                    } else {
                        y0VarA = y0Var;
                    }
                    x.n1 n1VarY2 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    objN = g0Var.N();
                    if (objN == l1.i.f9868a) {
                        objN = f.D;
                        g0Var.n0(objN);
                    }
                    u00.k kVar2 = (u00.k) objN;
                    int i21 = i17 << 3;
                    x0 x0Var4 = x0VarA;
                    e(n1VarY2, kVar2, rVar4, x0Var4, y0VarA, cVar, g0Var, (i21 & 57344) | (i21 & 896) | 48 | (i21 & 7168) | (i17 & 458752));
                    str2 = "AnimatedVisibility";
                    rVar3 = rVar4;
                    x0Var2 = x0Var4;
                    y0Var2 = y0VarA;
                } else {
                    g0Var.V();
                    y0Var2 = y0Var;
                    rVar3 = rVar2;
                    x0Var2 = x0VarA;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new z(z11, rVar3, x0Var2, y0Var2, str2, cVar, i10, i11, 0);
                }
            }
            i12 |= 384;
            x0VarA = x0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (g0Var.g(y0Var)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i12 | 24576;
                if ((196608 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i18 = 131072;
                    } else {
                        i18 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i17 |= i18;
                }
                if ((74899 & i17) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (g0Var.S(i17 & 1, z12)) {
                    if (i19 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i13 != 0) {
                        long j13 = 1;
                        x0VarA = s0.c(null, 3).a(s0.a(iVar, f.M, x.c.v(0.0f, 400.0f, new y3.l((j13 << 32) | (j13 & 4294967295L)), 1)));
                    }
                    if (i15 != 0) {
                        x.r1 r1Var3 = s0.f15806a;
                        long j14 = 1;
                        y0VarA = s0.g(iVar, f.O, x.c.v(0.0f, 400.0f, new y3.l((j14 << 32) | (j14 & 4294967295L)), 1)).a(s0.d(null, 3));
                    } else {
                        y0VarA = y0Var;
                    }
                    x.n1 n1VarY3 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    objN = g0Var.N();
                    if (objN == l1.i.f9868a) {
                        objN = f.D;
                        g0Var.n0(objN);
                    }
                    u00.k kVar3 = (u00.k) objN;
                    int i22 = i17 << 3;
                    x0 x0Var5 = x0VarA;
                    e(n1VarY3, kVar3, rVar4, x0Var5, y0VarA, cVar, g0Var, (i22 & 57344) | (i22 & 896) | 48 | (i22 & 7168) | (i17 & 458752));
                    str2 = "AnimatedVisibility";
                    rVar3 = rVar4;
                    x0Var2 = x0Var5;
                    y0Var2 = y0VarA;
                } else {
                    g0Var.V();
                    y0Var2 = y0Var;
                    rVar3 = rVar2;
                    x0Var2 = x0VarA;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new z(z11, rVar3, x0Var2, y0Var2, str2, cVar, i10, i11, 0);
                }
            }
            i12 |= 3072;
            i17 = i12 | 24576;
            if ((196608 & i10) == 0) {
                if (g0Var.i(cVar)) {
                    i18 = 131072;
                } else {
                    i18 = Cast.MAX_MESSAGE_LENGTH;
                }
                i17 |= i18;
            }
            if ((74899 & i17) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var.S(i17 & 1, z12)) {
                if (i19 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if (i13 != 0) {
                    long j15 = 1;
                    x0VarA = s0.c(null, 3).a(s0.a(iVar, f.M, x.c.v(0.0f, 400.0f, new y3.l((j15 << 32) | (j15 & 4294967295L)), 1)));
                }
                if (i15 != 0) {
                    x.r1 r1Var4 = s0.f15806a;
                    long j16 = 1;
                    y0VarA = s0.g(iVar, f.O, x.c.v(0.0f, 400.0f, new y3.l((j16 << 32) | (j16 & 4294967295L)), 1)).a(s0.d(null, 3));
                } else {
                    y0VarA = y0Var;
                }
                x.n1 n1VarY4 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i17 & 14) | ((i17 >> 9) & 112), 0);
                objN = g0Var.N();
                if (objN == l1.i.f9868a) {
                    objN = f.D;
                    g0Var.n0(objN);
                }
                u00.k kVar4 = (u00.k) objN;
                int i23 = i17 << 3;
                x0 x0Var6 = x0VarA;
                e(n1VarY4, kVar4, rVar4, x0Var6, y0VarA, cVar, g0Var, (i23 & 57344) | (i23 & 896) | 48 | (i23 & 7168) | (i17 & 458752));
                str2 = "AnimatedVisibility";
                rVar3 = rVar4;
                x0Var2 = x0Var6;
                y0Var2 = y0VarA;
            } else {
                g0Var.V();
                y0Var2 = y0Var;
                rVar3 = rVar2;
                x0Var2 = x0VarA;
                str2 = str;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new z(z11, rVar3, x0Var2, y0Var2, str2, cVar, i10, i11, 0);
            }
        }
        i12 |= 48;
        rVar2 = rVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                x0VarA = x0Var;
                if (g0Var.g(x0VarA)) {
                    i14 = 256;
                } else {
                    i14 = Cast.MAX_NAMESPACE_LENGTH;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (g0Var.g(y0Var)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i12 | 24576;
                if ((196608 & i10) == 0) {
                    if (g0Var.i(cVar)) {
                        i18 = 131072;
                    } else {
                        i18 = Cast.MAX_MESSAGE_LENGTH;
                    }
                    i17 |= i18;
                }
                if ((74899 & i17) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (g0Var.S(i17 & 1, z12)) {
                    if (i19 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i13 != 0) {
                        long j17 = 1;
                        x0VarA = s0.c(null, 3).a(s0.a(iVar, f.M, x.c.v(0.0f, 400.0f, new y3.l((j17 << 32) | (j17 & 4294967295L)), 1)));
                    }
                    if (i15 != 0) {
                        x.r1 r1Var5 = s0.f15806a;
                        long j18 = 1;
                        y0VarA = s0.g(iVar, f.O, x.c.v(0.0f, 400.0f, new y3.l((j18 << 32) | (j18 & 4294967295L)), 1)).a(s0.d(null, 3));
                    } else {
                        y0VarA = y0Var;
                    }
                    x.n1 n1VarY5 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i17 & 14) | ((i17 >> 9) & 112), 0);
                    objN = g0Var.N();
                    if (objN == l1.i.f9868a) {
                        objN = f.D;
                        g0Var.n0(objN);
                    }
                    u00.k kVar5 = (u00.k) objN;
                    int i24 = i17 << 3;
                    x0 x0Var7 = x0VarA;
                    e(n1VarY5, kVar5, rVar4, x0Var7, y0VarA, cVar, g0Var, (i24 & 57344) | (i24 & 896) | 48 | (i24 & 7168) | (i17 & 458752));
                    str2 = "AnimatedVisibility";
                    rVar3 = rVar4;
                    x0Var2 = x0Var7;
                    y0Var2 = y0VarA;
                } else {
                    g0Var.V();
                    y0Var2 = y0Var;
                    rVar3 = rVar2;
                    x0Var2 = x0VarA;
                    str2 = str;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new z(z11, rVar3, x0Var2, y0Var2, str2, cVar, i10, i11, 0);
                }
            }
            i12 |= 3072;
            i17 = i12 | 24576;
            if ((196608 & i10) == 0) {
                if (g0Var.i(cVar)) {
                    i18 = 131072;
                } else {
                    i18 = Cast.MAX_MESSAGE_LENGTH;
                }
                i17 |= i18;
            }
            if ((74899 & i17) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var.S(i17 & 1, z12)) {
                if (i19 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if (i13 != 0) {
                    long j19 = 1;
                    x0VarA = s0.c(null, 3).a(s0.a(iVar, f.M, x.c.v(0.0f, 400.0f, new y3.l((j19 << 32) | (j19 & 4294967295L)), 1)));
                }
                if (i15 != 0) {
                    x.r1 r1Var6 = s0.f15806a;
                    long j110 = 1;
                    y0VarA = s0.g(iVar, f.O, x.c.v(0.0f, 400.0f, new y3.l((j110 << 32) | (j110 & 4294967295L)), 1)).a(s0.d(null, 3));
                } else {
                    y0VarA = y0Var;
                }
                x.n1 n1VarY6 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i17 & 14) | ((i17 >> 9) & 112), 0);
                objN = g0Var.N();
                if (objN == l1.i.f9868a) {
                    objN = f.D;
                    g0Var.n0(objN);
                }
                u00.k kVar6 = (u00.k) objN;
                int i25 = i17 << 3;
                x0 x0Var8 = x0VarA;
                e(n1VarY6, kVar6, rVar4, x0Var8, y0VarA, cVar, g0Var, (i25 & 57344) | (i25 & 896) | 48 | (i25 & 7168) | (i17 & 458752));
                str2 = "AnimatedVisibility";
                rVar3 = rVar4;
                x0Var2 = x0Var8;
                y0Var2 = y0VarA;
            } else {
                g0Var.V();
                y0Var2 = y0Var;
                rVar3 = rVar2;
                x0Var2 = x0VarA;
                str2 = str;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new z(z11, rVar3, x0Var2, y0Var2, str2, cVar, i10, i11, 0);
            }
        }
        i12 |= 384;
        x0VarA = x0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                if (g0Var.g(y0Var)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i12 | 24576;
            if ((196608 & i10) == 0) {
                if (g0Var.i(cVar)) {
                    i18 = 131072;
                } else {
                    i18 = Cast.MAX_MESSAGE_LENGTH;
                }
                i17 |= i18;
            }
            if ((74899 & i17) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var.S(i17 & 1, z12)) {
                if (i19 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if (i13 != 0) {
                    long j111 = 1;
                    x0VarA = s0.c(null, 3).a(s0.a(iVar, f.M, x.c.v(0.0f, 400.0f, new y3.l((j111 << 32) | (j111 & 4294967295L)), 1)));
                }
                if (i15 != 0) {
                    x.r1 r1Var7 = s0.f15806a;
                    long j112 = 1;
                    y0VarA = s0.g(iVar, f.O, x.c.v(0.0f, 400.0f, new y3.l((j112 << 32) | (j112 & 4294967295L)), 1)).a(s0.d(null, 3));
                } else {
                    y0VarA = y0Var;
                }
                x.n1 n1VarY7 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i17 & 14) | ((i17 >> 9) & 112), 0);
                objN = g0Var.N();
                if (objN == l1.i.f9868a) {
                    objN = f.D;
                    g0Var.n0(objN);
                }
                u00.k kVar7 = (u00.k) objN;
                int i26 = i17 << 3;
                x0 x0Var9 = x0VarA;
                e(n1VarY7, kVar7, rVar4, x0Var9, y0VarA, cVar, g0Var, (i26 & 57344) | (i26 & 896) | 48 | (i26 & 7168) | (i17 & 458752));
                str2 = "AnimatedVisibility";
                rVar3 = rVar4;
                x0Var2 = x0Var9;
                y0Var2 = y0VarA;
            } else {
                g0Var.V();
                y0Var2 = y0Var;
                rVar3 = rVar2;
                x0Var2 = x0VarA;
                str2 = str;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new z(z11, rVar3, x0Var2, y0Var2, str2, cVar, i10, i11, 0);
            }
        }
        i12 |= 3072;
        i17 = i12 | 24576;
        if ((196608 & i10) == 0) {
            if (g0Var.i(cVar)) {
                i18 = 131072;
            } else {
                i18 = Cast.MAX_MESSAGE_LENGTH;
            }
            i17 |= i18;
        }
        if ((74899 & i17) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (g0Var.S(i17 & 1, z12)) {
            if (i19 != 0) {
                rVar4 = b2.o.A;
            } else {
                rVar4 = rVar2;
            }
            if (i13 != 0) {
                long j113 = 1;
                x0VarA = s0.c(null, 3).a(s0.a(iVar, f.M, x.c.v(0.0f, 400.0f, new y3.l((j113 << 32) | (j113 & 4294967295L)), 1)));
            }
            if (i15 != 0) {
                x.r1 r1Var8 = s0.f15806a;
                long j114 = 1;
                y0VarA = s0.g(iVar, f.O, x.c.v(0.0f, 400.0f, new y3.l((j114 << 32) | (j114 & 4294967295L)), 1)).a(s0.d(null, 3));
            } else {
                y0VarA = y0Var;
            }
            x.n1 n1VarY8 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i17 & 14) | ((i17 >> 9) & 112), 0);
            objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = f.D;
                g0Var.n0(objN);
            }
            u00.k kVar8 = (u00.k) objN;
            int i27 = i17 << 3;
            x0 x0Var10 = x0VarA;
            e(n1VarY8, kVar8, rVar4, x0Var10, y0VarA, cVar, g0Var, (i27 & 57344) | (i27 & 896) | 48 | (i27 & 7168) | (i17 & 458752));
            str2 = "AnimatedVisibility";
            rVar3 = rVar4;
            x0Var2 = x0Var10;
            y0Var2 = y0VarA;
        } else {
            g0Var.V();
            y0Var2 = y0Var;
            rVar3 = rVar2;
            x0Var2 = x0VarA;
            str2 = str;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new z(z11, rVar3, x0Var2, y0Var2, str2, cVar, i10, i11, 0);
        }
    }

    public static final void d(boolean z10, b2.r rVar, x0 x0Var, y0 y0Var, String str, v1.c cVar, l1.j jVar, int i10, int i11) {
        boolean z11;
        int i12;
        b2.r rVar2;
        int i13;
        x0 x0Var2;
        int i14;
        int i15;
        y0 y0Var2;
        int i16;
        int i17;
        boolean z12;
        String str2;
        x0 x0Var3;
        y0 y0Var3;
        b2.r rVar3;
        l1.r1 r1VarT;
        x0 x0VarA;
        y0 y0VarA;
        Object objN;
        b2.i iVar;
        b2.i iVar2;
        int i18;
        b2.i iVar3 = b2.b.E;
        b2.i iVar4 = b2.b.F;
        b2.i iVar5 = b2.b.D;
        b2.g gVar = b2.b.M;
        b2.g gVar2 = b2.b.O;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(234057107);
        if ((i10 & 48) == 0) {
            z11 = z10;
            i12 = (g0Var.h(z11) ? 32 : 16) | i10;
        } else {
            z11 = z10;
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 384) == 0) {
                rVar2 = rVar;
                i12 |= g0Var.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    x0Var2 = x0Var;
                    if (g0Var.g(x0Var2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        y0Var2 = y0Var;
                        if (g0Var.g(y0Var2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i12 | 196608;
                    if ((i10 & 1572864) == 0) {
                        if (g0Var.i(cVar)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i17 |= i18;
                    }
                    if ((i17 & 599185) != 599184) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (g0Var.S(i17 & 1, z12)) {
                        if (i19 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i13 != 0) {
                            x0 x0VarC = s0.c(null, 3);
                            long j9 = 1;
                            x.b1 b1VarV = x.c.v(0.0f, 400.0f, new y3.l((j9 << 32) | (j9 & 4294967295L)), 1);
                            f fVar = f.L;
                            if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                                iVar2 = iVar5;
                            } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                                iVar2 = iVar4;
                            } else {
                                iVar2 = iVar3;
                            }
                            x0VarA = x0VarC.a(s0.a(iVar2, new r0(0, fVar), b1VarV));
                        } else {
                            x0VarA = x0Var2;
                        }
                        if (i15 != 0) {
                            y0 y0VarD = s0.d(null, 3);
                            long j10 = 1;
                            x.b1 b1VarV2 = x.c.v(0.0f, 400.0f, new y3.l((j10 << 32) | (j10 & 4294967295L)), 1);
                            f fVar2 = f.N;
                            if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                                iVar = iVar5;
                            } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                                iVar = iVar4;
                            } else {
                                iVar = iVar3;
                            }
                            y0VarA = y0VarD.a(s0.g(iVar, new r0(1, fVar2), b1VarV2));
                        } else {
                            y0VarA = y0Var2;
                        }
                        int i20 = i17 >> 3;
                        x.n1 n1VarY = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i20 & 14) | ((i17 >> 12) & 112), 0);
                        objN = g0Var.N();
                        if (objN == l1.i.f9868a) {
                            objN = f.E;
                            g0Var.n0(objN);
                        }
                        e(n1VarY, (u00.k) objN, rVar2, x0VarA, y0VarA, cVar, g0Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i20 & 458752));
                        str2 = "AnimatedVisibility";
                        x0Var3 = x0VarA;
                        y0Var3 = y0VarA;
                    } else {
                        g0Var.V();
                        str2 = str;
                        x0Var3 = x0Var2;
                        y0Var3 = y0Var2;
                    }
                    rVar3 = rVar2;
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.f9921d = new z(z10, rVar3, x0Var3, y0Var3, str2, cVar, i10, i11, 1);
                    }
                }
                i12 |= 24576;
                y0Var2 = y0Var;
                i17 = i12 | 196608;
                if ((i10 & 1572864) == 0) {
                    if (g0Var.i(cVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i17 |= i18;
                }
                if ((i17 & 599185) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (g0Var.S(i17 & 1, z12)) {
                    if (i19 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i13 != 0) {
                        x0 x0VarC2 = s0.c(null, 3);
                        long j11 = 1;
                        x.b1 b1VarV3 = x.c.v(0.0f, 400.0f, new y3.l((j11 << 32) | (j11 & 4294967295L)), 1);
                        f fVar3 = f.L;
                        if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                            iVar2 = iVar5;
                        } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                            iVar2 = iVar4;
                        } else {
                            iVar2 = iVar3;
                        }
                        x0VarA = x0VarC2.a(s0.a(iVar2, new r0(0, fVar3), b1VarV3));
                    } else {
                        x0VarA = x0Var2;
                    }
                    if (i15 != 0) {
                        y0 y0VarD2 = s0.d(null, 3);
                        long j12 = 1;
                        x.b1 b1VarV4 = x.c.v(0.0f, 400.0f, new y3.l((j12 << 32) | (j12 & 4294967295L)), 1);
                        f fVar4 = f.N;
                        if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                            iVar = iVar5;
                        } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                            iVar = iVar4;
                        } else {
                            iVar = iVar3;
                        }
                        y0VarA = y0VarD2.a(s0.g(iVar, new r0(1, fVar4), b1VarV4));
                    } else {
                        y0VarA = y0Var2;
                    }
                    int i21 = i17 >> 3;
                    x.n1 n1VarY2 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i21 & 14) | ((i17 >> 12) & 112), 0);
                    objN = g0Var.N();
                    if (objN == l1.i.f9868a) {
                        objN = f.E;
                        g0Var.n0(objN);
                    }
                    e(n1VarY2, (u00.k) objN, rVar2, x0VarA, y0VarA, cVar, g0Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i21 & 458752));
                    str2 = "AnimatedVisibility";
                    x0Var3 = x0VarA;
                    y0Var3 = y0VarA;
                } else {
                    g0Var.V();
                    str2 = str;
                    x0Var3 = x0Var2;
                    y0Var3 = y0Var2;
                }
                rVar3 = rVar2;
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new z(z10, rVar3, x0Var3, y0Var3, str2, cVar, i10, i11, 1);
                }
            }
            i12 |= 3072;
            x0Var2 = x0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    y0Var2 = y0Var;
                    if (g0Var.g(y0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i12 | 196608;
                if ((i10 & 1572864) == 0) {
                    if (g0Var.i(cVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i17 |= i18;
                }
                if ((i17 & 599185) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (g0Var.S(i17 & 1, z12)) {
                    if (i19 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i13 != 0) {
                        x0 x0VarC3 = s0.c(null, 3);
                        long j13 = 1;
                        x.b1 b1VarV5 = x.c.v(0.0f, 400.0f, new y3.l((j13 << 32) | (j13 & 4294967295L)), 1);
                        f fVar5 = f.L;
                        if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                            iVar2 = iVar5;
                        } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                            iVar2 = iVar4;
                        } else {
                            iVar2 = iVar3;
                        }
                        x0VarA = x0VarC3.a(s0.a(iVar2, new r0(0, fVar5), b1VarV5));
                    } else {
                        x0VarA = x0Var2;
                    }
                    if (i15 != 0) {
                        y0 y0VarD3 = s0.d(null, 3);
                        long j14 = 1;
                        x.b1 b1VarV6 = x.c.v(0.0f, 400.0f, new y3.l((j14 << 32) | (j14 & 4294967295L)), 1);
                        f fVar6 = f.N;
                        if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                            iVar = iVar5;
                        } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                            iVar = iVar4;
                        } else {
                            iVar = iVar3;
                        }
                        y0VarA = y0VarD3.a(s0.g(iVar, new r0(1, fVar6), b1VarV6));
                    } else {
                        y0VarA = y0Var2;
                    }
                    int i22 = i17 >> 3;
                    x.n1 n1VarY3 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i22 & 14) | ((i17 >> 12) & 112), 0);
                    objN = g0Var.N();
                    if (objN == l1.i.f9868a) {
                        objN = f.E;
                        g0Var.n0(objN);
                    }
                    e(n1VarY3, (u00.k) objN, rVar2, x0VarA, y0VarA, cVar, g0Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i22 & 458752));
                    str2 = "AnimatedVisibility";
                    x0Var3 = x0VarA;
                    y0Var3 = y0VarA;
                } else {
                    g0Var.V();
                    str2 = str;
                    x0Var3 = x0Var2;
                    y0Var3 = y0Var2;
                }
                rVar3 = rVar2;
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new z(z10, rVar3, x0Var3, y0Var3, str2, cVar, i10, i11, 1);
                }
            }
            i12 |= 24576;
            y0Var2 = y0Var;
            i17 = i12 | 196608;
            if ((i10 & 1572864) == 0) {
                if (g0Var.i(cVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i17 |= i18;
            }
            if ((i17 & 599185) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var.S(i17 & 1, z12)) {
                if (i19 != 0) {
                    rVar2 = b2.o.A;
                }
                if (i13 != 0) {
                    x0 x0VarC4 = s0.c(null, 3);
                    long j15 = 1;
                    x.b1 b1VarV7 = x.c.v(0.0f, 400.0f, new y3.l((j15 << 32) | (j15 & 4294967295L)), 1);
                    f fVar7 = f.L;
                    if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                        iVar2 = iVar5;
                    } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                        iVar2 = iVar4;
                    } else {
                        iVar2 = iVar3;
                    }
                    x0VarA = x0VarC4.a(s0.a(iVar2, new r0(0, fVar7), b1VarV7));
                } else {
                    x0VarA = x0Var2;
                }
                if (i15 != 0) {
                    y0 y0VarD4 = s0.d(null, 3);
                    long j16 = 1;
                    x.b1 b1VarV8 = x.c.v(0.0f, 400.0f, new y3.l((j16 << 32) | (j16 & 4294967295L)), 1);
                    f fVar8 = f.N;
                    if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                        iVar = iVar5;
                    } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                        iVar = iVar4;
                    } else {
                        iVar = iVar3;
                    }
                    y0VarA = y0VarD4.a(s0.g(iVar, new r0(1, fVar8), b1VarV8));
                } else {
                    y0VarA = y0Var2;
                }
                int i23 = i17 >> 3;
                x.n1 n1VarY4 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i23 & 14) | ((i17 >> 12) & 112), 0);
                objN = g0Var.N();
                if (objN == l1.i.f9868a) {
                    objN = f.E;
                    g0Var.n0(objN);
                }
                e(n1VarY4, (u00.k) objN, rVar2, x0VarA, y0VarA, cVar, g0Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i23 & 458752));
                str2 = "AnimatedVisibility";
                x0Var3 = x0VarA;
                y0Var3 = y0VarA;
            } else {
                g0Var.V();
                str2 = str;
                x0Var3 = x0Var2;
                y0Var3 = y0Var2;
            }
            rVar3 = rVar2;
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new z(z10, rVar3, x0Var3, y0Var3, str2, cVar, i10, i11, 1);
            }
        }
        i12 |= 384;
        rVar2 = rVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                x0Var2 = x0Var;
                if (g0Var.g(x0Var2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    y0Var2 = y0Var;
                    if (g0Var.g(y0Var2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i12 | 196608;
                if ((i10 & 1572864) == 0) {
                    if (g0Var.i(cVar)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i17 |= i18;
                }
                if ((i17 & 599185) != 599184) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (g0Var.S(i17 & 1, z12)) {
                    if (i19 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i13 != 0) {
                        x0 x0VarC5 = s0.c(null, 3);
                        long j17 = 1;
                        x.b1 b1VarV9 = x.c.v(0.0f, 400.0f, new y3.l((j17 << 32) | (j17 & 4294967295L)), 1);
                        f fVar9 = f.L;
                        if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                            iVar2 = iVar5;
                        } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                            iVar2 = iVar4;
                        } else {
                            iVar2 = iVar3;
                        }
                        x0VarA = x0VarC5.a(s0.a(iVar2, new r0(0, fVar9), b1VarV9));
                    } else {
                        x0VarA = x0Var2;
                    }
                    if (i15 != 0) {
                        y0 y0VarD5 = s0.d(null, 3);
                        long j18 = 1;
                        x.b1 b1VarV10 = x.c.v(0.0f, 400.0f, new y3.l((j18 << 32) | (j18 & 4294967295L)), 1);
                        f fVar10 = f.N;
                        if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                            iVar = iVar5;
                        } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                            iVar = iVar4;
                        } else {
                            iVar = iVar3;
                        }
                        y0VarA = y0VarD5.a(s0.g(iVar, new r0(1, fVar10), b1VarV10));
                    } else {
                        y0VarA = y0Var2;
                    }
                    int i24 = i17 >> 3;
                    x.n1 n1VarY5 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i24 & 14) | ((i17 >> 12) & 112), 0);
                    objN = g0Var.N();
                    if (objN == l1.i.f9868a) {
                        objN = f.E;
                        g0Var.n0(objN);
                    }
                    e(n1VarY5, (u00.k) objN, rVar2, x0VarA, y0VarA, cVar, g0Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i24 & 458752));
                    str2 = "AnimatedVisibility";
                    x0Var3 = x0VarA;
                    y0Var3 = y0VarA;
                } else {
                    g0Var.V();
                    str2 = str;
                    x0Var3 = x0Var2;
                    y0Var3 = y0Var2;
                }
                rVar3 = rVar2;
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new z(z10, rVar3, x0Var3, y0Var3, str2, cVar, i10, i11, 1);
                }
            }
            i12 |= 24576;
            y0Var2 = y0Var;
            i17 = i12 | 196608;
            if ((i10 & 1572864) == 0) {
                if (g0Var.i(cVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i17 |= i18;
            }
            if ((i17 & 599185) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var.S(i17 & 1, z12)) {
                if (i19 != 0) {
                    rVar2 = b2.o.A;
                }
                if (i13 != 0) {
                    x0 x0VarC6 = s0.c(null, 3);
                    long j19 = 1;
                    x.b1 b1VarV11 = x.c.v(0.0f, 400.0f, new y3.l((j19 << 32) | (j19 & 4294967295L)), 1);
                    f fVar11 = f.L;
                    if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                        iVar2 = iVar5;
                    } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                        iVar2 = iVar4;
                    } else {
                        iVar2 = iVar3;
                    }
                    x0VarA = x0VarC6.a(s0.a(iVar2, new r0(0, fVar11), b1VarV11));
                } else {
                    x0VarA = x0Var2;
                }
                if (i15 != 0) {
                    y0 y0VarD6 = s0.d(null, 3);
                    long j110 = 1;
                    x.b1 b1VarV12 = x.c.v(0.0f, 400.0f, new y3.l((j110 << 32) | (j110 & 4294967295L)), 1);
                    f fVar12 = f.N;
                    if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                        iVar = iVar5;
                    } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                        iVar = iVar4;
                    } else {
                        iVar = iVar3;
                    }
                    y0VarA = y0VarD6.a(s0.g(iVar, new r0(1, fVar12), b1VarV12));
                } else {
                    y0VarA = y0Var2;
                }
                int i25 = i17 >> 3;
                x.n1 n1VarY6 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i25 & 14) | ((i17 >> 12) & 112), 0);
                objN = g0Var.N();
                if (objN == l1.i.f9868a) {
                    objN = f.E;
                    g0Var.n0(objN);
                }
                e(n1VarY6, (u00.k) objN, rVar2, x0VarA, y0VarA, cVar, g0Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i25 & 458752));
                str2 = "AnimatedVisibility";
                x0Var3 = x0VarA;
                y0Var3 = y0VarA;
            } else {
                g0Var.V();
                str2 = str;
                x0Var3 = x0Var2;
                y0Var3 = y0Var2;
            }
            rVar3 = rVar2;
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new z(z10, rVar3, x0Var3, y0Var3, str2, cVar, i10, i11, 1);
            }
        }
        i12 |= 3072;
        x0Var2 = x0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                y0Var2 = y0Var;
                if (g0Var.g(y0Var2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i12 | 196608;
            if ((i10 & 1572864) == 0) {
                if (g0Var.i(cVar)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i17 |= i18;
            }
            if ((i17 & 599185) != 599184) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (g0Var.S(i17 & 1, z12)) {
                if (i19 != 0) {
                    rVar2 = b2.o.A;
                }
                if (i13 != 0) {
                    x0 x0VarC7 = s0.c(null, 3);
                    long j111 = 1;
                    x.b1 b1VarV13 = x.c.v(0.0f, 400.0f, new y3.l((j111 << 32) | (j111 & 4294967295L)), 1);
                    f fVar13 = f.L;
                    if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                        iVar2 = iVar5;
                    } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                        iVar2 = iVar4;
                    } else {
                        iVar2 = iVar3;
                    }
                    x0VarA = x0VarC7.a(s0.a(iVar2, new r0(0, fVar13), b1VarV13));
                } else {
                    x0VarA = x0Var2;
                }
                if (i15 != 0) {
                    y0 y0VarD7 = s0.d(null, 3);
                    long j112 = 1;
                    x.b1 b1VarV14 = x.c.v(0.0f, 400.0f, new y3.l((j112 << 32) | (j112 & 4294967295L)), 1);
                    f fVar14 = f.N;
                    if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                        iVar = iVar5;
                    } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                        iVar = iVar4;
                    } else {
                        iVar = iVar3;
                    }
                    y0VarA = y0VarD7.a(s0.g(iVar, new r0(1, fVar14), b1VarV14));
                } else {
                    y0VarA = y0Var2;
                }
                int i26 = i17 >> 3;
                x.n1 n1VarY7 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i26 & 14) | ((i17 >> 12) & 112), 0);
                objN = g0Var.N();
                if (objN == l1.i.f9868a) {
                    objN = f.E;
                    g0Var.n0(objN);
                }
                e(n1VarY7, (u00.k) objN, rVar2, x0VarA, y0VarA, cVar, g0Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i26 & 458752));
                str2 = "AnimatedVisibility";
                x0Var3 = x0VarA;
                y0Var3 = y0VarA;
            } else {
                g0Var.V();
                str2 = str;
                x0Var3 = x0Var2;
                y0Var3 = y0Var2;
            }
            rVar3 = rVar2;
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new z(z10, rVar3, x0Var3, y0Var3, str2, cVar, i10, i11, 1);
            }
        }
        i12 |= 24576;
        y0Var2 = y0Var;
        i17 = i12 | 196608;
        if ((i10 & 1572864) == 0) {
            if (g0Var.i(cVar)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i17 |= i18;
        }
        if ((i17 & 599185) != 599184) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (g0Var.S(i17 & 1, z12)) {
            if (i19 != 0) {
                rVar2 = b2.o.A;
            }
            if (i13 != 0) {
                x0 x0VarC8 = s0.c(null, 3);
                long j113 = 1;
                x.b1 b1VarV15 = x.c.v(0.0f, 400.0f, new y3.l((j113 << 32) | (j113 & 4294967295L)), 1);
                f fVar15 = f.L;
                if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                    iVar2 = iVar5;
                } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                    iVar2 = iVar4;
                } else {
                    iVar2 = iVar3;
                }
                x0VarA = x0VarC8.a(s0.a(iVar2, new r0(0, fVar15), b1VarV15));
            } else {
                x0VarA = x0Var2;
            }
            if (i15 != 0) {
                y0 y0VarD8 = s0.d(null, 3);
                long j114 = 1;
                x.b1 b1VarV16 = x.c.v(0.0f, 400.0f, new y3.l((j114 << 32) | (j114 & 4294967295L)), 1);
                f fVar16 = f.N;
                if (kotlin.jvm.internal.m.a(gVar2, gVar)) {
                    iVar = iVar5;
                } else if (kotlin.jvm.internal.m.a(gVar2, gVar2)) {
                    iVar = iVar4;
                } else {
                    iVar = iVar3;
                }
                y0VarA = y0VarD8.a(s0.g(iVar, new r0(1, fVar16), b1VarV16));
            } else {
                y0VarA = y0Var2;
            }
            int i27 = i17 >> 3;
            x.n1 n1VarY8 = x.c.y(Boolean.valueOf(z11), "AnimatedVisibility", g0Var, (i27 & 14) | ((i17 >> 12) & 112), 0);
            objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = f.E;
                g0Var.n0(objN);
            }
            e(n1VarY8, (u00.k) objN, rVar2, x0VarA, y0VarA, cVar, g0Var, (i17 & 896) | 48 | (i17 & 7168) | (57344 & i17) | (i27 & 458752));
            str2 = "AnimatedVisibility";
            x0Var3 = x0VarA;
            y0Var3 = y0VarA;
        } else {
            g0Var.V();
            str2 = str;
            x0Var3 = x0Var2;
            y0Var3 = y0Var2;
        }
        rVar3 = rVar2;
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new z(z10, rVar3, x0Var3, y0Var3, str2, cVar, i10, i11, 1);
        }
    }

    public static final void e(x.n1 n1Var, u00.k kVar, b2.r rVar, x0 x0Var, y0 y0Var, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        x0 x0Var2;
        y0 y0Var2;
        v1.c cVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1706321816);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(n1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(kVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            x0Var2 = x0Var;
            i11 |= g0Var.g(x0Var2) ? 2048 : 1024;
        } else {
            x0Var2 = x0Var;
        }
        if ((i10 & 24576) == 0) {
            y0Var2 = y0Var;
            i11 |= g0Var.g(y0Var2) ? 16384 : 8192;
        } else {
            y0Var2 = y0Var;
        }
        if ((i10 & 196608) == 0) {
            cVar2 = cVar;
            i11 |= g0Var.i(cVar2) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        } else {
            cVar2 = cVar;
        }
        if (g0Var.S(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 112;
            int i13 = i11 & 14;
            boolean z10 = (i12 == 32) | (i13 == 4);
            Object objN = g0Var.N();
            l1.c cVar3 = l1.i.f9868a;
            if (z10 || objN == cVar3) {
                objN = new mb.b0(kVar, n1Var, 1);
                g0Var.n0(objN);
            }
            b2.r rVarL = z2.d0.l(rVar, (u00.o) objN);
            Object objN2 = g0Var.N();
            if (objN2 == cVar3) {
                objN2 = l.C;
                g0Var.n0(objN2);
            }
            a(n1Var, kVar, rVarL, x0Var2, y0Var2, (u00.n) objN2, cVar2, g0Var, 196608 | i13 | i12 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128));
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new k(n1Var, kVar, rVar, x0Var, y0Var, cVar, i10);
        }
    }

    public static final void f(Object obj, b2.r rVar, x.y yVar, String str, v1.c cVar, l1.j jVar, int i10, int i11) {
        int i12;
        String str2;
        boolean z10;
        b2.r rVar2;
        String str3;
        l1.r1 r1VarT;
        String str4;
        int i13;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-513216493);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? g0Var.g(obj) : g0Var.i(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= g0Var.i(yVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        int i15 = i11 & 8;
        if (i15 == 0) {
            if ((i10 & 3072) == 0) {
                str2 = str;
                i12 |= g0Var.g(str2) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                if (g0Var.i(cVar)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i12 |= i13;
            }
            if ((i12 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var.S(i12 & 1, z10)) {
                if (i14 != 0) {
                    rVar = b2.o.A;
                }
                b2.r rVar3 = rVar;
                if (i15 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                g(x.c.y(obj, str4, g0Var, (i12 & 14) | ((i12 >> 6) & 112), 0), rVar3, yVar, null, cVar, g0Var, i12 & 58352);
                str3 = str4;
                rVar2 = rVar3;
            } else {
                g0Var.V();
                rVar2 = rVar;
                str3 = str2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new mb.a(obj, rVar2, yVar, str3, cVar, i10, i11, 1);
            }
        }
        i12 |= 3072;
        str2 = str;
        if ((i10 & 24576) == 0) {
            if (g0Var.i(cVar)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
        }
        if ((i12 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g0Var.S(i12 & 1, z10)) {
            if (i14 != 0) {
                rVar = b2.o.A;
            }
            b2.r rVar4 = rVar;
            if (i15 != 0) {
                str4 = "Crossfade";
            } else {
                str4 = str2;
            }
            g(x.c.y(obj, str4, g0Var, (i12 & 14) | ((i12 >> 6) & 112), 0), rVar4, yVar, null, cVar, g0Var, i12 & 58352);
            str3 = str4;
            rVar2 = rVar4;
        } else {
            g0Var.V();
            rVar2 = rVar;
            str3 = str2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new mb.a(obj, rVar2, yVar, str3, cVar, i10, i11, 1);
        }
    }

    public static final void g(x.n1 n1Var, b2.r rVar, x.y yVar, u00.k kVar, v1.c cVar, l1.j jVar, int i10) {
        x.y yVar2;
        u00.k kVar2;
        x.n1 n1Var2 = n1Var;
        f5.c cVar2 = n1Var2.f16323a;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1877370462);
        int i11 = (i10 & 6) == 0 ? (g0Var.g(n1Var2) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            yVar2 = yVar;
            i11 |= g0Var.i(yVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        } else {
            yVar2 = yVar;
        }
        int i12 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i12 |= g0Var.i(cVar) ? 16384 : 8192;
        }
        if (g0Var.S(i12 & 1, (i12 & 9363) != 9362)) {
            Object objN = g0Var.N();
            l1.c cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                objN = f.H;
                g0Var.n0(objN);
            }
            u00.k kVar3 = (u00.k) objN;
            Object objN2 = g0Var.N();
            Object obj = objN2;
            if (objN2 == cVar3) {
                z1.p pVar = new z1.p();
                pVar.add(cVar2.J0());
                g0Var.n0(pVar);
                obj = pVar;
            }
            z1.p pVar2 = (z1.p) obj;
            Object objN3 = g0Var.N();
            if (objN3 == cVar3) {
                long[] jArr = u.q0.f14885a;
                objN3 = new u.i0();
                g0Var.n0(objN3);
            }
            u.i0 i0Var = (u.i0) objN3;
            l1.i1 i1Var = n1Var2.f16326d;
            if (kotlin.jvm.internal.m.a(cVar2.J0(), i1Var.getValue())) {
                g0Var.c0(321145192);
                if (pVar2.size() == 1 && kotlin.jvm.internal.m.a(pVar2.get(0), i1Var.getValue())) {
                    g0Var.c0(321469824);
                    g0Var.r(false);
                } else {
                    g0Var.c0(321279546);
                    int i13 = i12 & 14;
                    int i14 = 4;
                    boolean z10 = i13 == 4;
                    Object objN4 = g0Var.N();
                    if (z10 || objN4 == cVar3) {
                        objN4 = new g(n1Var2, i14);
                        g0Var.n0(objN4);
                    }
                    h00.v.x0((u00.k) objN4, pVar2);
                    i0Var.a();
                    g0Var.r(false);
                }
                g0Var.r(false);
            } else {
                g0Var.c0(321475776);
                g0Var.r(false);
            }
            if (i0Var.b(i1Var.getValue())) {
                g0Var.c0(322279296);
                g0Var.r(false);
            } else {
                g0Var.c0(321536443);
                ListIterator listIterator = pVar2.listIterator();
                int i15 = 0;
                while (true) {
                    b3.q qVar = (b3.q) listIterator;
                    if (!qVar.hasNext()) {
                        i15 = -1;
                        break;
                    } else if (kotlin.jvm.internal.m.a(kVar3.invoke(qVar.next()), kVar3.invoke(i1Var.getValue()))) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i15 == -1) {
                    pVar2.add(i1Var.getValue());
                } else {
                    pVar2.set(i15, i1Var.getValue());
                }
                i0Var.a();
                int size = pVar2.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj2 = pVar2.get(i16);
                    i0Var.m(obj2, v1.d.d(-934471669, new l50.i(n1Var2, yVar2, obj2, cVar, 1), g0Var));
                    i16++;
                    n1Var2 = n1Var;
                    yVar2 = yVar;
                }
                g0Var.r(false);
            }
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.v(g0Var, Integer.valueOf(iHashCode), b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            g0Var.c0(-1312707512);
            int size2 = pVar2.size();
            for (int i17 = 0; i17 < size2; i17++) {
                Object obj3 = pVar2.get(i17);
                g0Var.Z(1171574969, kVar3.invoke(obj3));
                u00.n nVar = (u00.n) i0Var.g(obj3);
                if (nVar == null) {
                    g0Var.c0(1959122128);
                } else {
                    g0Var.c0(1171576145);
                    nVar.invoke(g0Var, 0);
                }
                g0Var.r(false);
                g0Var.r(false);
            }
            g0Var.r(false);
            g0Var.r(true);
            kVar2 = kVar3;
        } else {
            g0Var.V();
            kVar2 = kVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new k0(n1Var, rVar, yVar, kVar2, cVar, i10);
        }
    }

    public static final h2.c h(j1 j1Var, f1 f1Var) {
        if (f1Var == null) {
            return null;
        }
        List listB = j1Var.b();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (kotlin.jvm.internal.m.a(((k1) listB.get(i10)).L, f1Var)) {
                if (f1Var.N) {
                    return !f1Var.P ? f1Var.O : bi.b.g(f1Var.C1().o(b3.m.x(f1Var), 0L, (6 & 4) != 0), kh.n.m0(b3.m.x(f1Var).C));
                }
                return null;
            }
        }
        return null;
    }

    public static final void i(p10.a aVar, long j9, long j10, long j11, boolean z10) {
        l1.i1 i1Var = (l1.i1) aVar.B;
        l1.i1 i1Var2 = (l1.i1) aVar.D;
        l1.i1 i1Var3 = (l1.i1) aVar.A;
        l1.i1 i1Var4 = (l1.i1) aVar.C;
        if (!h2.b.b(((h2.b) i1Var4.getValue()).f6544a, j11) || !h2.e.a(((h2.e) i1Var3.getValue()).f6558a, j9) || z10) {
            i1Var3.setValue(new h2.e(j9));
            i1Var4.setValue(new h2.b(j11));
            if (z10) {
                i1Var.setValue(new h2.b(h2.b.e(h2.b.e(j10, j11), h2.b.e(((h2.b) i1Var2.getValue()).f6544a, ((h2.b) i1Var.getValue()).f6544a))));
            }
        }
        i1Var2.setValue(new h2.b(h2.b.e(j10, j11)));
    }

    public static final h2.c j(p10.a aVar) {
        return bi.b.g(h2.b.f(((h2.b) ((l1.i1) aVar.B).getValue()).f6544a, ((h2.b) ((l1.i1) aVar.C).getValue()).f6544a), ((h2.e) ((l1.i1) aVar.A).getValue()).f6558a);
    }

    public static final l0 k(x.n1 n1Var, u00.k kVar, Object obj, l1.j jVar) {
        l0 l0Var;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.Z(-422486745, n1Var);
        boolean zG = n1Var.g();
        f5.c cVar = n1Var.f16323a;
        if (zG) {
            g0Var.c0(-212166497);
            g0Var.r(false);
            if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                l0Var = l0.B;
            } else {
                l0Var = ((Boolean) kVar.invoke(cVar.J0())).booleanValue() ? l0.C : l0.A;
            }
        } else {
            g0Var.c0(-211892364);
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = l1.q.z(Boolean.FALSE);
                g0Var.n0(objN);
            }
            l1.z0 z0Var = (l1.z0) objN;
            if (((Boolean) kVar.invoke(cVar.J0())).booleanValue()) {
                z0Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                l0Var = l0.B;
            } else {
                l0Var = ((Boolean) z0Var.getValue()).booleanValue() ? l0.C : l0.A;
            }
            g0Var.r(false);
        }
        g0Var.r(false);
        return l0Var;
    }
}
