package po;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b2.r;
import bv.d3;
import c3.o1;
import com.google.android.gms.internal.measurement.z3;
import d0.o2;
import d40.n1;
import g1.b1;
import g1.v;
import g1.v5;
import g1.z6;
import h0.p1;
import h0.u;
import h0.z1;
import i2.b0;
import i2.s0;
import i2.t;
import java.util.ListIterator;
import java.util.Map;
import kh.o;
import l1.g0;
import l1.g1;
import l1.m1;
import l1.p2;
import l1.q;
import l1.q2;
import l1.r1;
import l1.z0;
import lo.a0;
import lo.w;
import lo.x;
import lo.y;
import lo.z;
import m3.c0;
import m3.i0;
import m3.r0;
import oo.q0;
import v2.f0;
import z2.d0;
import z2.l1;
import z2.v0;
import z2.w0;
import z2.y0;

public abstract class m {
    public static final p1 a = h0.c.g(0.0f, 48, 0.0f, 100, 5);

    public static final void a(z state, n1 n1Var, boolean z, u00.k onParagraphClicked, u00.a onRetryClicked, r rVar, u00.k kVar, u00.a aVar, h0.n1 n1Var2, l1.j jVar, int i, int i2) {
        int i3;
        int i4;
        u00.k kVar2;
        int i5;
        int i6;
        u00.a aVar2;
        int i7;
        int i8;
        int i9;
        int i11;
        boolean z2;
        r rVar2;
        g0 g0Var;
        u00.k kVar3;
        u00.a aVar3;
        h0.n1 n1Var3;
        r1 r1VarT;
        r rVar3;
        r rVar4;
        l1.c cVar;
        u00.k kVar4;
        u00.a aVar4;
        h0.n1 n1Var4;
        b3.g gVar;
        g0 g0Var2;
        y3.m mVar;
        Object objN;
        Object objN2;
        kotlin.jvm.internal.m.e(state, "state");
        kotlin.jvm.internal.m.e(onParagraphClicked, "onParagraphClicked");
        kotlin.jvm.internal.m.e(onRetryClicked, "onRetryClicked");
        g0 g0Var3 = (g0) jVar;
        g0Var3.e0(1534573205);
        if ((i & 6) == 0) {
            i3 = (g0Var3.g(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var3.i(n1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= g0Var3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= g0Var3.i(onParagraphClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= g0Var3.i(onRetryClicked) ? 16384 : 8192;
        }
        int i12 = i2 & 32;
        if (i12 == 0) {
            if ((196608 & i) == 0) {
                i3 |= g0Var3.g(rVar) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    kVar2 = kVar;
                    if (g0Var3.i(kVar2)) {
                        i5 = 1048576;
                    } else {
                        i5 = 524288;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    if ((12582912 & i) == 0) {
                        aVar2 = aVar;
                        if (g0Var3.i(aVar2)) {
                            i7 = 8388608;
                        } else {
                            i7 = 4194304;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                        if ((i & 100663296) == 0) {
                            int i13 = i3;
                            if (g0Var3.g(n1Var2)) {
                                i9 = 67108864;
                            } else {
                                i9 = 33554432;
                            }
                            i11 = i13 | i9;
                        }
                        if ((i11 & 38347923) != 38347922) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (g0Var3.S(i11 & 1, z2)) {
                            rVar3 = b2.o.A;
                            if (i12 != 0) {
                                rVar4 = rVar3;
                            } else {
                                rVar4 = rVar;
                            }
                            cVar = l1.i.a;
                            if (i4 != 0) {
                                objN2 = g0Var3.N();
                                if (objN2 == cVar) {
                                    objN2 = new c0(26);
                                    g0Var3.n0(objN2);
                                }
                                kVar4 = (u00.k) objN2;
                            } else {
                                kVar4 = kVar2;
                            }
                            if (i6 != 0) {
                                objN = g0Var3.N();
                                if (objN == cVar) {
                                    objN = new h.e(19);
                                    g0Var3.n0(objN);
                                }
                                aVar4 = (u00.a) objN;
                            } else {
                                aVar4 = aVar2;
                            }
                            if (i8 != 0) {
                                n1Var4 = a;
                            } else {
                                n1Var4 = n1Var2;
                            }
                            r rVarV = rVar4.V(z1.c);
                            w0 w0VarD = h0.o.d(b2.b.E, false);
                            int iHashCode = Long.hashCode(g0Var3.T);
                            m1 m1VarM = g0Var3.m();
                            r rVarC = b2.a.c(rVarV, g0Var3);
                            b3.i.c.getClass();
                            gVar = b3.h.b;
                            g0Var3.g0();
                            r rVar5 = rVar4;
                            if (g0Var3.S) {
                                g0Var3.l(gVar);
                            } else {
                                g0Var3.q0();
                            }
                            q.I(w0VarD, g0Var3, b3.h.f);
                            q.I(m1VarM, g0Var3, b3.h.e);
                            q.I(Integer.valueOf(iHashCode), g0Var3, b3.h.g);
                            q.E(g0Var3, b3.h.h);
                            q.I(rVarC, g0Var3, b3.h.d);
                            if (state.equals(x.a)) {
                                g0Var3.c0(-716648702);
                                v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                                g0Var2 = g0Var3;
                                g0Var2.r(false);
                            } else {
                                g0Var2 = g0Var3;
                                if (state.equals(w.a)) {
                                    g0Var2.c0(-716641865);
                                    b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                                    g0Var2.r(false);
                                } else {
                                    if (state instanceof y) {
                                        throw oi.k.r(g0Var2, -716649962, false);
                                    }
                                    g0Var2.c0(-740960924);
                                    if (((y) state).a.c) {
                                        mVar = y3.m.B;
                                    } else {
                                        mVar = y3.m.A;
                                    }
                                    q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                                    g0Var2.r(false);
                                }
                                g0Var2.r(true);
                                aVar3 = aVar4;
                                g0Var = g0Var2;
                                rVar2 = rVar5;
                                n1Var3 = n1Var4;
                                kVar3 = kVar4;
                            }
                            g0Var2.r(true);
                            aVar3 = aVar4;
                            g0Var = g0Var2;
                            rVar2 = rVar5;
                            n1Var3 = n1Var4;
                            kVar3 = kVar4;
                        } else {
                            g0Var3.V();
                            rVar2 = rVar;
                            g0Var = g0Var3;
                            kVar3 = kVar2;
                            aVar3 = aVar2;
                            n1Var3 = n1Var2;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
                        }
                    }
                    i3 |= 100663296;
                    i11 = i3;
                    if ((i11 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (g0Var3.S(i11 & 1, z2)) {
                        rVar3 = b2.o.A;
                        if (i12 != 0) {
                            rVar4 = rVar3;
                        } else {
                            rVar4 = rVar;
                        }
                        cVar = l1.i.a;
                        if (i4 != 0) {
                            objN2 = g0Var3.N();
                            if (objN2 == cVar) {
                                objN2 = new c0(26);
                                g0Var3.n0(objN2);
                            }
                            kVar4 = (u00.k) objN2;
                        } else {
                            kVar4 = kVar2;
                        }
                        if (i6 != 0) {
                            objN = g0Var3.N();
                            if (objN == cVar) {
                                objN = new h.e(19);
                                g0Var3.n0(objN);
                            }
                            aVar4 = (u00.a) objN;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i8 != 0) {
                            n1Var4 = a;
                        } else {
                            n1Var4 = n1Var2;
                        }
                        r rVarV2 = rVar4.V(z1.c);
                        w0 w0VarD2 = h0.o.d(b2.b.E, false);
                        int iHashCode2 = Long.hashCode(g0Var3.T);
                        m1 m1VarM2 = g0Var3.m();
                        r rVarC2 = b2.a.c(rVarV2, g0Var3);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var3.g0();
                        r rVar6 = rVar4;
                        if (g0Var3.S) {
                            g0Var3.l(gVar);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(w0VarD2, g0Var3, b3.h.f);
                        q.I(m1VarM2, g0Var3, b3.h.e);
                        q.I(Integer.valueOf(iHashCode2), g0Var3, b3.h.g);
                        q.E(g0Var3, b3.h.h);
                        q.I(rVarC2, g0Var3, b3.h.d);
                        if (state.equals(x.a)) {
                            g0Var3.c0(-716648702);
                            v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                            g0Var2 = g0Var3;
                            g0Var2.r(false);
                        } else {
                            g0Var2 = g0Var3;
                            if (state.equals(w.a)) {
                                g0Var2.c0(-716641865);
                                b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                                g0Var2.r(false);
                            } else {
                                if (state instanceof y) {
                                    throw oi.k.r(g0Var2, -716649962, false);
                                }
                                g0Var2.c0(-740960924);
                                if (((y) state).a.c) {
                                    mVar = y3.m.B;
                                } else {
                                    mVar = y3.m.A;
                                }
                                q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                                g0Var2.r(false);
                            }
                            g0Var2.r(true);
                            aVar3 = aVar4;
                            g0Var = g0Var2;
                            rVar2 = rVar6;
                            n1Var3 = n1Var4;
                            kVar3 = kVar4;
                        }
                        g0Var2.r(true);
                        aVar3 = aVar4;
                        g0Var = g0Var2;
                        rVar2 = rVar6;
                        n1Var3 = n1Var4;
                        kVar3 = kVar4;
                    } else {
                        g0Var3.V();
                        rVar2 = rVar;
                        g0Var = g0Var3;
                        kVar3 = kVar2;
                        aVar3 = aVar2;
                        n1Var3 = n1Var2;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
                    }
                }
                i3 |= 12582912;
                aVar2 = aVar;
                i8 = i2 & 256;
                if (i8 != 0) {
                    if ((i & 100663296) == 0) {
                        int i14 = i3;
                        if (g0Var3.g(n1Var2)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                        i11 = i14 | i9;
                    }
                    if ((i11 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (g0Var3.S(i11 & 1, z2)) {
                        rVar3 = b2.o.A;
                        if (i12 != 0) {
                            rVar4 = rVar3;
                        } else {
                            rVar4 = rVar;
                        }
                        cVar = l1.i.a;
                        if (i4 != 0) {
                            objN2 = g0Var3.N();
                            if (objN2 == cVar) {
                                objN2 = new c0(26);
                                g0Var3.n0(objN2);
                            }
                            kVar4 = (u00.k) objN2;
                        } else {
                            kVar4 = kVar2;
                        }
                        if (i6 != 0) {
                            objN = g0Var3.N();
                            if (objN == cVar) {
                                objN = new h.e(19);
                                g0Var3.n0(objN);
                            }
                            aVar4 = (u00.a) objN;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i8 != 0) {
                            n1Var4 = a;
                        } else {
                            n1Var4 = n1Var2;
                        }
                        r rVarV3 = rVar4.V(z1.c);
                        w0 w0VarD3 = h0.o.d(b2.b.E, false);
                        int iHashCode3 = Long.hashCode(g0Var3.T);
                        m1 m1VarM3 = g0Var3.m();
                        r rVarC3 = b2.a.c(rVarV3, g0Var3);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var3.g0();
                        r rVar7 = rVar4;
                        if (g0Var3.S) {
                            g0Var3.l(gVar);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(w0VarD3, g0Var3, b3.h.f);
                        q.I(m1VarM3, g0Var3, b3.h.e);
                        q.I(Integer.valueOf(iHashCode3), g0Var3, b3.h.g);
                        q.E(g0Var3, b3.h.h);
                        q.I(rVarC3, g0Var3, b3.h.d);
                        if (state.equals(x.a)) {
                            g0Var3.c0(-716648702);
                            v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                            g0Var2 = g0Var3;
                            g0Var2.r(false);
                        } else {
                            g0Var2 = g0Var3;
                            if (state.equals(w.a)) {
                                g0Var2.c0(-716641865);
                                b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                                g0Var2.r(false);
                            } else {
                                if (state instanceof y) {
                                    throw oi.k.r(g0Var2, -716649962, false);
                                }
                                g0Var2.c0(-740960924);
                                if (((y) state).a.c) {
                                    mVar = y3.m.B;
                                } else {
                                    mVar = y3.m.A;
                                }
                                q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                                g0Var2.r(false);
                            }
                            g0Var2.r(true);
                            aVar3 = aVar4;
                            g0Var = g0Var2;
                            rVar2 = rVar7;
                            n1Var3 = n1Var4;
                            kVar3 = kVar4;
                        }
                        g0Var2.r(true);
                        aVar3 = aVar4;
                        g0Var = g0Var2;
                        rVar2 = rVar7;
                        n1Var3 = n1Var4;
                        kVar3 = kVar4;
                    } else {
                        g0Var3.V();
                        rVar2 = rVar;
                        g0Var = g0Var3;
                        kVar3 = kVar2;
                        aVar3 = aVar2;
                        n1Var3 = n1Var2;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
                    }
                }
                i3 |= 100663296;
                i11 = i3;
                if ((i11 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (g0Var3.S(i11 & 1, z2)) {
                    rVar3 = b2.o.A;
                    if (i12 != 0) {
                        rVar4 = rVar3;
                    } else {
                        rVar4 = rVar;
                    }
                    cVar = l1.i.a;
                    if (i4 != 0) {
                        objN2 = g0Var3.N();
                        if (objN2 == cVar) {
                            objN2 = new c0(26);
                            g0Var3.n0(objN2);
                        }
                        kVar4 = (u00.k) objN2;
                    } else {
                        kVar4 = kVar2;
                    }
                    if (i6 != 0) {
                        objN = g0Var3.N();
                        if (objN == cVar) {
                            objN = new h.e(19);
                            g0Var3.n0(objN);
                        }
                        aVar4 = (u00.a) objN;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i8 != 0) {
                        n1Var4 = a;
                    } else {
                        n1Var4 = n1Var2;
                    }
                    r rVarV4 = rVar4.V(z1.c);
                    w0 w0VarD4 = h0.o.d(b2.b.E, false);
                    int iHashCode4 = Long.hashCode(g0Var3.T);
                    m1 m1VarM4 = g0Var3.m();
                    r rVarC4 = b2.a.c(rVarV4, g0Var3);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var3.g0();
                    r rVar8 = rVar4;
                    if (g0Var3.S) {
                        g0Var3.l(gVar);
                    } else {
                        g0Var3.q0();
                    }
                    q.I(w0VarD4, g0Var3, b3.h.f);
                    q.I(m1VarM4, g0Var3, b3.h.e);
                    q.I(Integer.valueOf(iHashCode4), g0Var3, b3.h.g);
                    q.E(g0Var3, b3.h.h);
                    q.I(rVarC4, g0Var3, b3.h.d);
                    if (state.equals(x.a)) {
                        g0Var3.c0(-716648702);
                        v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                        g0Var2 = g0Var3;
                        g0Var2.r(false);
                    } else {
                        g0Var2 = g0Var3;
                        if (state.equals(w.a)) {
                            g0Var2.c0(-716641865);
                            b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                            g0Var2.r(false);
                        } else {
                            if (state instanceof y) {
                                throw oi.k.r(g0Var2, -716649962, false);
                            }
                            g0Var2.c0(-740960924);
                            if (((y) state).a.c) {
                                mVar = y3.m.B;
                            } else {
                                mVar = y3.m.A;
                            }
                            q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                            g0Var2.r(false);
                        }
                        g0Var2.r(true);
                        aVar3 = aVar4;
                        g0Var = g0Var2;
                        rVar2 = rVar8;
                        n1Var3 = n1Var4;
                        kVar3 = kVar4;
                    }
                    g0Var2.r(true);
                    aVar3 = aVar4;
                    g0Var = g0Var2;
                    rVar2 = rVar8;
                    n1Var3 = n1Var4;
                    kVar3 = kVar4;
                } else {
                    g0Var3.V();
                    rVar2 = rVar;
                    g0Var = g0Var3;
                    kVar3 = kVar2;
                    aVar3 = aVar2;
                    n1Var3 = n1Var2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
                }
            }
            i3 |= 1572864;
            kVar2 = kVar;
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    aVar2 = aVar;
                    if (g0Var3.i(aVar2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    if ((i & 100663296) == 0) {
                        int i15 = i3;
                        if (g0Var3.g(n1Var2)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                        i11 = i15 | i9;
                    }
                    if ((i11 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (g0Var3.S(i11 & 1, z2)) {
                        rVar3 = b2.o.A;
                        if (i12 != 0) {
                            rVar4 = rVar3;
                        } else {
                            rVar4 = rVar;
                        }
                        cVar = l1.i.a;
                        if (i4 != 0) {
                            objN2 = g0Var3.N();
                            if (objN2 == cVar) {
                                objN2 = new c0(26);
                                g0Var3.n0(objN2);
                            }
                            kVar4 = (u00.k) objN2;
                        } else {
                            kVar4 = kVar2;
                        }
                        if (i6 != 0) {
                            objN = g0Var3.N();
                            if (objN == cVar) {
                                objN = new h.e(19);
                                g0Var3.n0(objN);
                            }
                            aVar4 = (u00.a) objN;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i8 != 0) {
                            n1Var4 = a;
                        } else {
                            n1Var4 = n1Var2;
                        }
                        r rVarV5 = rVar4.V(z1.c);
                        w0 w0VarD5 = h0.o.d(b2.b.E, false);
                        int iHashCode5 = Long.hashCode(g0Var3.T);
                        m1 m1VarM5 = g0Var3.m();
                        r rVarC5 = b2.a.c(rVarV5, g0Var3);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var3.g0();
                        r rVar9 = rVar4;
                        if (g0Var3.S) {
                            g0Var3.l(gVar);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(w0VarD5, g0Var3, b3.h.f);
                        q.I(m1VarM5, g0Var3, b3.h.e);
                        q.I(Integer.valueOf(iHashCode5), g0Var3, b3.h.g);
                        q.E(g0Var3, b3.h.h);
                        q.I(rVarC5, g0Var3, b3.h.d);
                        if (state.equals(x.a)) {
                            g0Var3.c0(-716648702);
                            v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                            g0Var2 = g0Var3;
                            g0Var2.r(false);
                        } else {
                            g0Var2 = g0Var3;
                            if (state.equals(w.a)) {
                                g0Var2.c0(-716641865);
                                b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                                g0Var2.r(false);
                            } else {
                                if (state instanceof y) {
                                    throw oi.k.r(g0Var2, -716649962, false);
                                }
                                g0Var2.c0(-740960924);
                                if (((y) state).a.c) {
                                    mVar = y3.m.B;
                                } else {
                                    mVar = y3.m.A;
                                }
                                q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                                g0Var2.r(false);
                            }
                            g0Var2.r(true);
                            aVar3 = aVar4;
                            g0Var = g0Var2;
                            rVar2 = rVar9;
                            n1Var3 = n1Var4;
                            kVar3 = kVar4;
                        }
                        g0Var2.r(true);
                        aVar3 = aVar4;
                        g0Var = g0Var2;
                        rVar2 = rVar9;
                        n1Var3 = n1Var4;
                        kVar3 = kVar4;
                    } else {
                        g0Var3.V();
                        rVar2 = rVar;
                        g0Var = g0Var3;
                        kVar3 = kVar2;
                        aVar3 = aVar2;
                        n1Var3 = n1Var2;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
                    }
                }
                i3 |= 100663296;
                i11 = i3;
                if ((i11 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (g0Var3.S(i11 & 1, z2)) {
                    rVar3 = b2.o.A;
                    if (i12 != 0) {
                        rVar4 = rVar3;
                    } else {
                        rVar4 = rVar;
                    }
                    cVar = l1.i.a;
                    if (i4 != 0) {
                        objN2 = g0Var3.N();
                        if (objN2 == cVar) {
                            objN2 = new c0(26);
                            g0Var3.n0(objN2);
                        }
                        kVar4 = (u00.k) objN2;
                    } else {
                        kVar4 = kVar2;
                    }
                    if (i6 != 0) {
                        objN = g0Var3.N();
                        if (objN == cVar) {
                            objN = new h.e(19);
                            g0Var3.n0(objN);
                        }
                        aVar4 = (u00.a) objN;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i8 != 0) {
                        n1Var4 = a;
                    } else {
                        n1Var4 = n1Var2;
                    }
                    r rVarV6 = rVar4.V(z1.c);
                    w0 w0VarD6 = h0.o.d(b2.b.E, false);
                    int iHashCode6 = Long.hashCode(g0Var3.T);
                    m1 m1VarM6 = g0Var3.m();
                    r rVarC6 = b2.a.c(rVarV6, g0Var3);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var3.g0();
                    r rVar10 = rVar4;
                    if (g0Var3.S) {
                        g0Var3.l(gVar);
                    } else {
                        g0Var3.q0();
                    }
                    q.I(w0VarD6, g0Var3, b3.h.f);
                    q.I(m1VarM6, g0Var3, b3.h.e);
                    q.I(Integer.valueOf(iHashCode6), g0Var3, b3.h.g);
                    q.E(g0Var3, b3.h.h);
                    q.I(rVarC6, g0Var3, b3.h.d);
                    if (state.equals(x.a)) {
                        g0Var3.c0(-716648702);
                        v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                        g0Var2 = g0Var3;
                        g0Var2.r(false);
                    } else {
                        g0Var2 = g0Var3;
                        if (state.equals(w.a)) {
                            g0Var2.c0(-716641865);
                            b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                            g0Var2.r(false);
                        } else {
                            if (state instanceof y) {
                                throw oi.k.r(g0Var2, -716649962, false);
                            }
                            g0Var2.c0(-740960924);
                            if (((y) state).a.c) {
                                mVar = y3.m.B;
                            } else {
                                mVar = y3.m.A;
                            }
                            q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                            g0Var2.r(false);
                        }
                        g0Var2.r(true);
                        aVar3 = aVar4;
                        g0Var = g0Var2;
                        rVar2 = rVar10;
                        n1Var3 = n1Var4;
                        kVar3 = kVar4;
                    }
                    g0Var2.r(true);
                    aVar3 = aVar4;
                    g0Var = g0Var2;
                    rVar2 = rVar10;
                    n1Var3 = n1Var4;
                    kVar3 = kVar4;
                } else {
                    g0Var3.V();
                    rVar2 = rVar;
                    g0Var = g0Var3;
                    kVar3 = kVar2;
                    aVar3 = aVar2;
                    n1Var3 = n1Var2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
                }
            }
            i3 |= 12582912;
            aVar2 = aVar;
            i8 = i2 & 256;
            if (i8 != 0) {
                if ((i & 100663296) == 0) {
                    int i16 = i3;
                    if (g0Var3.g(n1Var2)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i11 = i16 | i9;
                }
                if ((i11 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (g0Var3.S(i11 & 1, z2)) {
                    rVar3 = b2.o.A;
                    if (i12 != 0) {
                        rVar4 = rVar3;
                    } else {
                        rVar4 = rVar;
                    }
                    cVar = l1.i.a;
                    if (i4 != 0) {
                        objN2 = g0Var3.N();
                        if (objN2 == cVar) {
                            objN2 = new c0(26);
                            g0Var3.n0(objN2);
                        }
                        kVar4 = (u00.k) objN2;
                    } else {
                        kVar4 = kVar2;
                    }
                    if (i6 != 0) {
                        objN = g0Var3.N();
                        if (objN == cVar) {
                            objN = new h.e(19);
                            g0Var3.n0(objN);
                        }
                        aVar4 = (u00.a) objN;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i8 != 0) {
                        n1Var4 = a;
                    } else {
                        n1Var4 = n1Var2;
                    }
                    r rVarV7 = rVar4.V(z1.c);
                    w0 w0VarD7 = h0.o.d(b2.b.E, false);
                    int iHashCode7 = Long.hashCode(g0Var3.T);
                    m1 m1VarM7 = g0Var3.m();
                    r rVarC7 = b2.a.c(rVarV7, g0Var3);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var3.g0();
                    r rVar11 = rVar4;
                    if (g0Var3.S) {
                        g0Var3.l(gVar);
                    } else {
                        g0Var3.q0();
                    }
                    q.I(w0VarD7, g0Var3, b3.h.f);
                    q.I(m1VarM7, g0Var3, b3.h.e);
                    q.I(Integer.valueOf(iHashCode7), g0Var3, b3.h.g);
                    q.E(g0Var3, b3.h.h);
                    q.I(rVarC7, g0Var3, b3.h.d);
                    if (state.equals(x.a)) {
                        g0Var3.c0(-716648702);
                        v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                        g0Var2 = g0Var3;
                        g0Var2.r(false);
                    } else {
                        g0Var2 = g0Var3;
                        if (state.equals(w.a)) {
                            g0Var2.c0(-716641865);
                            b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                            g0Var2.r(false);
                        } else {
                            if (state instanceof y) {
                                throw oi.k.r(g0Var2, -716649962, false);
                            }
                            g0Var2.c0(-740960924);
                            if (((y) state).a.c) {
                                mVar = y3.m.B;
                            } else {
                                mVar = y3.m.A;
                            }
                            q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                            g0Var2.r(false);
                        }
                        g0Var2.r(true);
                        aVar3 = aVar4;
                        g0Var = g0Var2;
                        rVar2 = rVar11;
                        n1Var3 = n1Var4;
                        kVar3 = kVar4;
                    }
                    g0Var2.r(true);
                    aVar3 = aVar4;
                    g0Var = g0Var2;
                    rVar2 = rVar11;
                    n1Var3 = n1Var4;
                    kVar3 = kVar4;
                } else {
                    g0Var3.V();
                    rVar2 = rVar;
                    g0Var = g0Var3;
                    kVar3 = kVar2;
                    aVar3 = aVar2;
                    n1Var3 = n1Var2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
                }
            }
            i3 |= 100663296;
            i11 = i3;
            if ((i11 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (g0Var3.S(i11 & 1, z2)) {
                rVar3 = b2.o.A;
                if (i12 != 0) {
                    rVar4 = rVar3;
                } else {
                    rVar4 = rVar;
                }
                cVar = l1.i.a;
                if (i4 != 0) {
                    objN2 = g0Var3.N();
                    if (objN2 == cVar) {
                        objN2 = new c0(26);
                        g0Var3.n0(objN2);
                    }
                    kVar4 = (u00.k) objN2;
                } else {
                    kVar4 = kVar2;
                }
                if (i6 != 0) {
                    objN = g0Var3.N();
                    if (objN == cVar) {
                        objN = new h.e(19);
                        g0Var3.n0(objN);
                    }
                    aVar4 = (u00.a) objN;
                } else {
                    aVar4 = aVar2;
                }
                if (i8 != 0) {
                    n1Var4 = a;
                } else {
                    n1Var4 = n1Var2;
                }
                r rVarV8 = rVar4.V(z1.c);
                w0 w0VarD8 = h0.o.d(b2.b.E, false);
                int iHashCode8 = Long.hashCode(g0Var3.T);
                m1 m1VarM8 = g0Var3.m();
                r rVarC8 = b2.a.c(rVarV8, g0Var3);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var3.g0();
                r rVar12 = rVar4;
                if (g0Var3.S) {
                    g0Var3.l(gVar);
                } else {
                    g0Var3.q0();
                }
                q.I(w0VarD8, g0Var3, b3.h.f);
                q.I(m1VarM8, g0Var3, b3.h.e);
                q.I(Integer.valueOf(iHashCode8), g0Var3, b3.h.g);
                q.E(g0Var3, b3.h.h);
                q.I(rVarC8, g0Var3, b3.h.d);
                if (state.equals(x.a)) {
                    g0Var3.c0(-716648702);
                    v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                    g0Var2 = g0Var3;
                    g0Var2.r(false);
                } else {
                    g0Var2 = g0Var3;
                    if (state.equals(w.a)) {
                        g0Var2.c0(-716641865);
                        b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                        g0Var2.r(false);
                    } else {
                        if (state instanceof y) {
                            throw oi.k.r(g0Var2, -716649962, false);
                        }
                        g0Var2.c0(-740960924);
                        if (((y) state).a.c) {
                            mVar = y3.m.B;
                        } else {
                            mVar = y3.m.A;
                        }
                        q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                        g0Var2.r(false);
                    }
                    g0Var2.r(true);
                    aVar3 = aVar4;
                    g0Var = g0Var2;
                    rVar2 = rVar12;
                    n1Var3 = n1Var4;
                    kVar3 = kVar4;
                }
                g0Var2.r(true);
                aVar3 = aVar4;
                g0Var = g0Var2;
                rVar2 = rVar12;
                n1Var3 = n1Var4;
                kVar3 = kVar4;
            } else {
                g0Var3.V();
                rVar2 = rVar;
                g0Var = g0Var3;
                kVar3 = kVar2;
                aVar3 = aVar2;
                n1Var3 = n1Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
            }
        }
        i3 |= 196608;
        i4 = i2 & 64;
        if (i4 != 0) {
            if ((1572864 & i) == 0) {
                kVar2 = kVar;
                if (g0Var3.i(kVar2)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
                if ((12582912 & i) == 0) {
                    aVar2 = aVar;
                    if (g0Var3.i(aVar2)) {
                        i7 = 8388608;
                    } else {
                        i7 = 4194304;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    if ((i & 100663296) == 0) {
                        int i17 = i3;
                        if (g0Var3.g(n1Var2)) {
                            i9 = 67108864;
                        } else {
                            i9 = 33554432;
                        }
                        i11 = i17 | i9;
                    }
                    if ((i11 & 38347923) != 38347922) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (g0Var3.S(i11 & 1, z2)) {
                        rVar3 = b2.o.A;
                        if (i12 != 0) {
                            rVar4 = rVar3;
                        } else {
                            rVar4 = rVar;
                        }
                        cVar = l1.i.a;
                        if (i4 != 0) {
                            objN2 = g0Var3.N();
                            if (objN2 == cVar) {
                                objN2 = new c0(26);
                                g0Var3.n0(objN2);
                            }
                            kVar4 = (u00.k) objN2;
                        } else {
                            kVar4 = kVar2;
                        }
                        if (i6 != 0) {
                            objN = g0Var3.N();
                            if (objN == cVar) {
                                objN = new h.e(19);
                                g0Var3.n0(objN);
                            }
                            aVar4 = (u00.a) objN;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i8 != 0) {
                            n1Var4 = a;
                        } else {
                            n1Var4 = n1Var2;
                        }
                        r rVarV9 = rVar4.V(z1.c);
                        w0 w0VarD9 = h0.o.d(b2.b.E, false);
                        int iHashCode9 = Long.hashCode(g0Var3.T);
                        m1 m1VarM9 = g0Var3.m();
                        r rVarC9 = b2.a.c(rVarV9, g0Var3);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var3.g0();
                        r rVar13 = rVar4;
                        if (g0Var3.S) {
                            g0Var3.l(gVar);
                        } else {
                            g0Var3.q0();
                        }
                        q.I(w0VarD9, g0Var3, b3.h.f);
                        q.I(m1VarM9, g0Var3, b3.h.e);
                        q.I(Integer.valueOf(iHashCode9), g0Var3, b3.h.g);
                        q.E(g0Var3, b3.h.h);
                        q.I(rVarC9, g0Var3, b3.h.d);
                        if (state.equals(x.a)) {
                            g0Var3.c0(-716648702);
                            v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                            g0Var2 = g0Var3;
                            g0Var2.r(false);
                        } else {
                            g0Var2 = g0Var3;
                            if (state.equals(w.a)) {
                                g0Var2.c0(-716641865);
                                b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                                g0Var2.r(false);
                            } else {
                                if (state instanceof y) {
                                    throw oi.k.r(g0Var2, -716649962, false);
                                }
                                g0Var2.c0(-740960924);
                                if (((y) state).a.c) {
                                    mVar = y3.m.B;
                                } else {
                                    mVar = y3.m.A;
                                }
                                q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                                g0Var2.r(false);
                            }
                            g0Var2.r(true);
                            aVar3 = aVar4;
                            g0Var = g0Var2;
                            rVar2 = rVar13;
                            n1Var3 = n1Var4;
                            kVar3 = kVar4;
                        }
                        g0Var2.r(true);
                        aVar3 = aVar4;
                        g0Var = g0Var2;
                        rVar2 = rVar13;
                        n1Var3 = n1Var4;
                        kVar3 = kVar4;
                    } else {
                        g0Var3.V();
                        rVar2 = rVar;
                        g0Var = g0Var3;
                        kVar3 = kVar2;
                        aVar3 = aVar2;
                        n1Var3 = n1Var2;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
                    }
                }
                i3 |= 100663296;
                i11 = i3;
                if ((i11 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (g0Var3.S(i11 & 1, z2)) {
                    rVar3 = b2.o.A;
                    if (i12 != 0) {
                        rVar4 = rVar3;
                    } else {
                        rVar4 = rVar;
                    }
                    cVar = l1.i.a;
                    if (i4 != 0) {
                        objN2 = g0Var3.N();
                        if (objN2 == cVar) {
                            objN2 = new c0(26);
                            g0Var3.n0(objN2);
                        }
                        kVar4 = (u00.k) objN2;
                    } else {
                        kVar4 = kVar2;
                    }
                    if (i6 != 0) {
                        objN = g0Var3.N();
                        if (objN == cVar) {
                            objN = new h.e(19);
                            g0Var3.n0(objN);
                        }
                        aVar4 = (u00.a) objN;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i8 != 0) {
                        n1Var4 = a;
                    } else {
                        n1Var4 = n1Var2;
                    }
                    r rVarV10 = rVar4.V(z1.c);
                    w0 w0VarD10 = h0.o.d(b2.b.E, false);
                    int iHashCode10 = Long.hashCode(g0Var3.T);
                    m1 m1VarM10 = g0Var3.m();
                    r rVarC10 = b2.a.c(rVarV10, g0Var3);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var3.g0();
                    r rVar14 = rVar4;
                    if (g0Var3.S) {
                        g0Var3.l(gVar);
                    } else {
                        g0Var3.q0();
                    }
                    q.I(w0VarD10, g0Var3, b3.h.f);
                    q.I(m1VarM10, g0Var3, b3.h.e);
                    q.I(Integer.valueOf(iHashCode10), g0Var3, b3.h.g);
                    q.E(g0Var3, b3.h.h);
                    q.I(rVarC10, g0Var3, b3.h.d);
                    if (state.equals(x.a)) {
                        g0Var3.c0(-716648702);
                        v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                        g0Var2 = g0Var3;
                        g0Var2.r(false);
                    } else {
                        g0Var2 = g0Var3;
                        if (state.equals(w.a)) {
                            g0Var2.c0(-716641865);
                            b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                            g0Var2.r(false);
                        } else {
                            if (state instanceof y) {
                                throw oi.k.r(g0Var2, -716649962, false);
                            }
                            g0Var2.c0(-740960924);
                            if (((y) state).a.c) {
                                mVar = y3.m.B;
                            } else {
                                mVar = y3.m.A;
                            }
                            q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                            g0Var2.r(false);
                        }
                        g0Var2.r(true);
                        aVar3 = aVar4;
                        g0Var = g0Var2;
                        rVar2 = rVar14;
                        n1Var3 = n1Var4;
                        kVar3 = kVar4;
                    }
                    g0Var2.r(true);
                    aVar3 = aVar4;
                    g0Var = g0Var2;
                    rVar2 = rVar14;
                    n1Var3 = n1Var4;
                    kVar3 = kVar4;
                } else {
                    g0Var3.V();
                    rVar2 = rVar;
                    g0Var = g0Var3;
                    kVar3 = kVar2;
                    aVar3 = aVar2;
                    n1Var3 = n1Var2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
                }
            }
            i3 |= 12582912;
            aVar2 = aVar;
            i8 = i2 & 256;
            if (i8 != 0) {
                if ((i & 100663296) == 0) {
                    int i18 = i3;
                    if (g0Var3.g(n1Var2)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i11 = i18 | i9;
                }
                if ((i11 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (g0Var3.S(i11 & 1, z2)) {
                    rVar3 = b2.o.A;
                    if (i12 != 0) {
                        rVar4 = rVar3;
                    } else {
                        rVar4 = rVar;
                    }
                    cVar = l1.i.a;
                    if (i4 != 0) {
                        objN2 = g0Var3.N();
                        if (objN2 == cVar) {
                            objN2 = new c0(26);
                            g0Var3.n0(objN2);
                        }
                        kVar4 = (u00.k) objN2;
                    } else {
                        kVar4 = kVar2;
                    }
                    if (i6 != 0) {
                        objN = g0Var3.N();
                        if (objN == cVar) {
                            objN = new h.e(19);
                            g0Var3.n0(objN);
                        }
                        aVar4 = (u00.a) objN;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i8 != 0) {
                        n1Var4 = a;
                    } else {
                        n1Var4 = n1Var2;
                    }
                    r rVarV11 = rVar4.V(z1.c);
                    w0 w0VarD11 = h0.o.d(b2.b.E, false);
                    int iHashCode11 = Long.hashCode(g0Var3.T);
                    m1 m1VarM11 = g0Var3.m();
                    r rVarC11 = b2.a.c(rVarV11, g0Var3);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var3.g0();
                    r rVar15 = rVar4;
                    if (g0Var3.S) {
                        g0Var3.l(gVar);
                    } else {
                        g0Var3.q0();
                    }
                    q.I(w0VarD11, g0Var3, b3.h.f);
                    q.I(m1VarM11, g0Var3, b3.h.e);
                    q.I(Integer.valueOf(iHashCode11), g0Var3, b3.h.g);
                    q.E(g0Var3, b3.h.h);
                    q.I(rVarC11, g0Var3, b3.h.d);
                    if (state.equals(x.a)) {
                        g0Var3.c0(-716648702);
                        v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                        g0Var2 = g0Var3;
                        g0Var2.r(false);
                    } else {
                        g0Var2 = g0Var3;
                        if (state.equals(w.a)) {
                            g0Var2.c0(-716641865);
                            b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                            g0Var2.r(false);
                        } else {
                            if (state instanceof y) {
                                throw oi.k.r(g0Var2, -716649962, false);
                            }
                            g0Var2.c0(-740960924);
                            if (((y) state).a.c) {
                                mVar = y3.m.B;
                            } else {
                                mVar = y3.m.A;
                            }
                            q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                            g0Var2.r(false);
                        }
                        g0Var2.r(true);
                        aVar3 = aVar4;
                        g0Var = g0Var2;
                        rVar2 = rVar15;
                        n1Var3 = n1Var4;
                        kVar3 = kVar4;
                    }
                    g0Var2.r(true);
                    aVar3 = aVar4;
                    g0Var = g0Var2;
                    rVar2 = rVar15;
                    n1Var3 = n1Var4;
                    kVar3 = kVar4;
                } else {
                    g0Var3.V();
                    rVar2 = rVar;
                    g0Var = g0Var3;
                    kVar3 = kVar2;
                    aVar3 = aVar2;
                    n1Var3 = n1Var2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
                }
            }
            i3 |= 100663296;
            i11 = i3;
            if ((i11 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (g0Var3.S(i11 & 1, z2)) {
                rVar3 = b2.o.A;
                if (i12 != 0) {
                    rVar4 = rVar3;
                } else {
                    rVar4 = rVar;
                }
                cVar = l1.i.a;
                if (i4 != 0) {
                    objN2 = g0Var3.N();
                    if (objN2 == cVar) {
                        objN2 = new c0(26);
                        g0Var3.n0(objN2);
                    }
                    kVar4 = (u00.k) objN2;
                } else {
                    kVar4 = kVar2;
                }
                if (i6 != 0) {
                    objN = g0Var3.N();
                    if (objN == cVar) {
                        objN = new h.e(19);
                        g0Var3.n0(objN);
                    }
                    aVar4 = (u00.a) objN;
                } else {
                    aVar4 = aVar2;
                }
                if (i8 != 0) {
                    n1Var4 = a;
                } else {
                    n1Var4 = n1Var2;
                }
                r rVarV12 = rVar4.V(z1.c);
                w0 w0VarD12 = h0.o.d(b2.b.E, false);
                int iHashCode12 = Long.hashCode(g0Var3.T);
                m1 m1VarM12 = g0Var3.m();
                r rVarC12 = b2.a.c(rVarV12, g0Var3);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var3.g0();
                r rVar16 = rVar4;
                if (g0Var3.S) {
                    g0Var3.l(gVar);
                } else {
                    g0Var3.q0();
                }
                q.I(w0VarD12, g0Var3, b3.h.f);
                q.I(m1VarM12, g0Var3, b3.h.e);
                q.I(Integer.valueOf(iHashCode12), g0Var3, b3.h.g);
                q.E(g0Var3, b3.h.h);
                q.I(rVarC12, g0Var3, b3.h.d);
                if (state.equals(x.a)) {
                    g0Var3.c0(-716648702);
                    v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                    g0Var2 = g0Var3;
                    g0Var2.r(false);
                } else {
                    g0Var2 = g0Var3;
                    if (state.equals(w.a)) {
                        g0Var2.c0(-716641865);
                        b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                        g0Var2.r(false);
                    } else {
                        if (state instanceof y) {
                            throw oi.k.r(g0Var2, -716649962, false);
                        }
                        g0Var2.c0(-740960924);
                        if (((y) state).a.c) {
                            mVar = y3.m.B;
                        } else {
                            mVar = y3.m.A;
                        }
                        q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                        g0Var2.r(false);
                    }
                    g0Var2.r(true);
                    aVar3 = aVar4;
                    g0Var = g0Var2;
                    rVar2 = rVar16;
                    n1Var3 = n1Var4;
                    kVar3 = kVar4;
                }
                g0Var2.r(true);
                aVar3 = aVar4;
                g0Var = g0Var2;
                rVar2 = rVar16;
                n1Var3 = n1Var4;
                kVar3 = kVar4;
            } else {
                g0Var3.V();
                rVar2 = rVar;
                g0Var = g0Var3;
                kVar3 = kVar2;
                aVar3 = aVar2;
                n1Var3 = n1Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
            }
        }
        i3 |= 1572864;
        kVar2 = kVar;
        i6 = i2 & 128;
        if (i6 != 0) {
            if ((12582912 & i) == 0) {
                aVar2 = aVar;
                if (g0Var3.i(aVar2)) {
                    i7 = 8388608;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
            i8 = i2 & 256;
            if (i8 != 0) {
                if ((i & 100663296) == 0) {
                    int i19 = i3;
                    if (g0Var3.g(n1Var2)) {
                        i9 = 67108864;
                    } else {
                        i9 = 33554432;
                    }
                    i11 = i19 | i9;
                }
                if ((i11 & 38347923) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (g0Var3.S(i11 & 1, z2)) {
                    rVar3 = b2.o.A;
                    if (i12 != 0) {
                        rVar4 = rVar3;
                    } else {
                        rVar4 = rVar;
                    }
                    cVar = l1.i.a;
                    if (i4 != 0) {
                        objN2 = g0Var3.N();
                        if (objN2 == cVar) {
                            objN2 = new c0(26);
                            g0Var3.n0(objN2);
                        }
                        kVar4 = (u00.k) objN2;
                    } else {
                        kVar4 = kVar2;
                    }
                    if (i6 != 0) {
                        objN = g0Var3.N();
                        if (objN == cVar) {
                            objN = new h.e(19);
                            g0Var3.n0(objN);
                        }
                        aVar4 = (u00.a) objN;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i8 != 0) {
                        n1Var4 = a;
                    } else {
                        n1Var4 = n1Var2;
                    }
                    r rVarV13 = rVar4.V(z1.c);
                    w0 w0VarD13 = h0.o.d(b2.b.E, false);
                    int iHashCode13 = Long.hashCode(g0Var3.T);
                    m1 m1VarM13 = g0Var3.m();
                    r rVarC13 = b2.a.c(rVarV13, g0Var3);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var3.g0();
                    r rVar17 = rVar4;
                    if (g0Var3.S) {
                        g0Var3.l(gVar);
                    } else {
                        g0Var3.q0();
                    }
                    q.I(w0VarD13, g0Var3, b3.h.f);
                    q.I(m1VarM13, g0Var3, b3.h.e);
                    q.I(Integer.valueOf(iHashCode13), g0Var3, b3.h.g);
                    q.E(g0Var3, b3.h.h);
                    q.I(rVarC13, g0Var3, b3.h.d);
                    if (state.equals(x.a)) {
                        g0Var3.c0(-716648702);
                        v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                        g0Var2 = g0Var3;
                        g0Var2.r(false);
                    } else {
                        g0Var2 = g0Var3;
                        if (state.equals(w.a)) {
                            g0Var2.c0(-716641865);
                            b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                            g0Var2.r(false);
                        } else {
                            if (state instanceof y) {
                                throw oi.k.r(g0Var2, -716649962, false);
                            }
                            g0Var2.c0(-740960924);
                            if (((y) state).a.c) {
                                mVar = y3.m.B;
                            } else {
                                mVar = y3.m.A;
                            }
                            q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                            g0Var2.r(false);
                        }
                        g0Var2.r(true);
                        aVar3 = aVar4;
                        g0Var = g0Var2;
                        rVar2 = rVar17;
                        n1Var3 = n1Var4;
                        kVar3 = kVar4;
                    }
                    g0Var2.r(true);
                    aVar3 = aVar4;
                    g0Var = g0Var2;
                    rVar2 = rVar17;
                    n1Var3 = n1Var4;
                    kVar3 = kVar4;
                } else {
                    g0Var3.V();
                    rVar2 = rVar;
                    g0Var = g0Var3;
                    kVar3 = kVar2;
                    aVar3 = aVar2;
                    n1Var3 = n1Var2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
                }
            }
            i3 |= 100663296;
            i11 = i3;
            if ((i11 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (g0Var3.S(i11 & 1, z2)) {
                rVar3 = b2.o.A;
                if (i12 != 0) {
                    rVar4 = rVar3;
                } else {
                    rVar4 = rVar;
                }
                cVar = l1.i.a;
                if (i4 != 0) {
                    objN2 = g0Var3.N();
                    if (objN2 == cVar) {
                        objN2 = new c0(26);
                        g0Var3.n0(objN2);
                    }
                    kVar4 = (u00.k) objN2;
                } else {
                    kVar4 = kVar2;
                }
                if (i6 != 0) {
                    objN = g0Var3.N();
                    if (objN == cVar) {
                        objN = new h.e(19);
                        g0Var3.n0(objN);
                    }
                    aVar4 = (u00.a) objN;
                } else {
                    aVar4 = aVar2;
                }
                if (i8 != 0) {
                    n1Var4 = a;
                } else {
                    n1Var4 = n1Var2;
                }
                r rVarV14 = rVar4.V(z1.c);
                w0 w0VarD14 = h0.o.d(b2.b.E, false);
                int iHashCode14 = Long.hashCode(g0Var3.T);
                m1 m1VarM14 = g0Var3.m();
                r rVarC14 = b2.a.c(rVarV14, g0Var3);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var3.g0();
                r rVar18 = rVar4;
                if (g0Var3.S) {
                    g0Var3.l(gVar);
                } else {
                    g0Var3.q0();
                }
                q.I(w0VarD14, g0Var3, b3.h.f);
                q.I(m1VarM14, g0Var3, b3.h.e);
                q.I(Integer.valueOf(iHashCode14), g0Var3, b3.h.g);
                q.E(g0Var3, b3.h.h);
                q.I(rVarC14, g0Var3, b3.h.d);
                if (state.equals(x.a)) {
                    g0Var3.c0(-716648702);
                    v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                    g0Var2 = g0Var3;
                    g0Var2.r(false);
                } else {
                    g0Var2 = g0Var3;
                    if (state.equals(w.a)) {
                        g0Var2.c0(-716641865);
                        b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                        g0Var2.r(false);
                    } else {
                        if (state instanceof y) {
                            throw oi.k.r(g0Var2, -716649962, false);
                        }
                        g0Var2.c0(-740960924);
                        if (((y) state).a.c) {
                            mVar = y3.m.B;
                        } else {
                            mVar = y3.m.A;
                        }
                        q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                        g0Var2.r(false);
                    }
                    g0Var2.r(true);
                    aVar3 = aVar4;
                    g0Var = g0Var2;
                    rVar2 = rVar18;
                    n1Var3 = n1Var4;
                    kVar3 = kVar4;
                }
                g0Var2.r(true);
                aVar3 = aVar4;
                g0Var = g0Var2;
                rVar2 = rVar18;
                n1Var3 = n1Var4;
                kVar3 = kVar4;
            } else {
                g0Var3.V();
                rVar2 = rVar;
                g0Var = g0Var3;
                kVar3 = kVar2;
                aVar3 = aVar2;
                n1Var3 = n1Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
            }
        }
        i3 |= 12582912;
        aVar2 = aVar;
        i8 = i2 & 256;
        if (i8 != 0) {
            if ((i & 100663296) == 0) {
                int i110 = i3;
                if (g0Var3.g(n1Var2)) {
                    i9 = 67108864;
                } else {
                    i9 = 33554432;
                }
                i11 = i110 | i9;
            }
            if ((i11 & 38347923) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (g0Var3.S(i11 & 1, z2)) {
                rVar3 = b2.o.A;
                if (i12 != 0) {
                    rVar4 = rVar3;
                } else {
                    rVar4 = rVar;
                }
                cVar = l1.i.a;
                if (i4 != 0) {
                    objN2 = g0Var3.N();
                    if (objN2 == cVar) {
                        objN2 = new c0(26);
                        g0Var3.n0(objN2);
                    }
                    kVar4 = (u00.k) objN2;
                } else {
                    kVar4 = kVar2;
                }
                if (i6 != 0) {
                    objN = g0Var3.N();
                    if (objN == cVar) {
                        objN = new h.e(19);
                        g0Var3.n0(objN);
                    }
                    aVar4 = (u00.a) objN;
                } else {
                    aVar4 = aVar2;
                }
                if (i8 != 0) {
                    n1Var4 = a;
                } else {
                    n1Var4 = n1Var2;
                }
                r rVarV15 = rVar4.V(z1.c);
                w0 w0VarD15 = h0.o.d(b2.b.E, false);
                int iHashCode15 = Long.hashCode(g0Var3.T);
                m1 m1VarM15 = g0Var3.m();
                r rVarC15 = b2.a.c(rVarV15, g0Var3);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var3.g0();
                r rVar19 = rVar4;
                if (g0Var3.S) {
                    g0Var3.l(gVar);
                } else {
                    g0Var3.q0();
                }
                q.I(w0VarD15, g0Var3, b3.h.f);
                q.I(m1VarM15, g0Var3, b3.h.e);
                q.I(Integer.valueOf(iHashCode15), g0Var3, b3.h.g);
                q.E(g0Var3, b3.h.h);
                q.I(rVarC15, g0Var3, b3.h.d);
                if (state.equals(x.a)) {
                    g0Var3.c0(-716648702);
                    v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                    g0Var2 = g0Var3;
                    g0Var2.r(false);
                } else {
                    g0Var2 = g0Var3;
                    if (state.equals(w.a)) {
                        g0Var2.c0(-716641865);
                        b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                        g0Var2.r(false);
                    } else {
                        if (state instanceof y) {
                            throw oi.k.r(g0Var2, -716649962, false);
                        }
                        g0Var2.c0(-740960924);
                        if (((y) state).a.c) {
                            mVar = y3.m.B;
                        } else {
                            mVar = y3.m.A;
                        }
                        q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                        g0Var2.r(false);
                    }
                    g0Var2.r(true);
                    aVar3 = aVar4;
                    g0Var = g0Var2;
                    rVar2 = rVar19;
                    n1Var3 = n1Var4;
                    kVar3 = kVar4;
                }
                g0Var2.r(true);
                aVar3 = aVar4;
                g0Var = g0Var2;
                rVar2 = rVar19;
                n1Var3 = n1Var4;
                kVar3 = kVar4;
            } else {
                g0Var3.V();
                rVar2 = rVar;
                g0Var = g0Var3;
                kVar3 = kVar2;
                aVar3 = aVar2;
                n1Var3 = n1Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
            }
        }
        i3 |= 100663296;
        i11 = i3;
        if ((i11 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (g0Var3.S(i11 & 1, z2)) {
            rVar3 = b2.o.A;
            if (i12 != 0) {
                rVar4 = rVar3;
            } else {
                rVar4 = rVar;
            }
            cVar = l1.i.a;
            if (i4 != 0) {
                objN2 = g0Var3.N();
                if (objN2 == cVar) {
                    objN2 = new c0(26);
                    g0Var3.n0(objN2);
                }
                kVar4 = (u00.k) objN2;
            } else {
                kVar4 = kVar2;
            }
            if (i6 != 0) {
                objN = g0Var3.N();
                if (objN == cVar) {
                    objN = new h.e(19);
                    g0Var3.n0(objN);
                }
                aVar4 = (u00.a) objN;
            } else {
                aVar4 = aVar2;
            }
            if (i8 != 0) {
                n1Var4 = a;
            } else {
                n1Var4 = n1Var2;
            }
            r rVarV16 = rVar4.V(z1.c);
            w0 w0VarD16 = h0.o.d(b2.b.E, false);
            int iHashCode16 = Long.hashCode(g0Var3.T);
            m1 m1VarM16 = g0Var3.m();
            r rVarC16 = b2.a.c(rVarV16, g0Var3);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var3.g0();
            r rVar110 = rVar4;
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            q.I(w0VarD16, g0Var3, b3.h.f);
            q.I(m1VarM16, g0Var3, b3.h.e);
            q.I(Integer.valueOf(iHashCode16), g0Var3, b3.h.g);
            q.E(g0Var3, b3.h.h);
            q.I(rVarC16, g0Var3, b3.h.d);
            if (state.equals(x.a)) {
                g0Var3.c0(-716648702);
                v5.a(z1.m(rVar3, 28), dl.a.n, 2, 0L, 0, 0.0f, g0Var3, 390, 56);
                g0Var2 = g0Var3;
                g0Var2.r(false);
            } else {
                g0Var2 = g0Var3;
                if (state.equals(w.a)) {
                    g0Var2.c0(-716641865);
                    b(onRetryClicked, g0Var2, (i11 >> 12) & 14);
                    g0Var2.r(false);
                } else {
                    if (state instanceof y) {
                        throw oi.k.r(g0Var2, -716649962, false);
                    }
                    g0Var2.c0(-740960924);
                    if (((y) state).a.c) {
                        mVar = y3.m.B;
                    } else {
                        mVar = y3.m.A;
                    }
                    q.a(o1.n.a(mVar), v1.d.d(1112402459, new j1.j(state, n1Var, z, onParagraphClicked, kVar4, aVar4, n1Var4), g0Var2), g0Var2, 56);
                    g0Var2.r(false);
                }
                g0Var2.r(true);
                aVar3 = aVar4;
                g0Var = g0Var2;
                rVar2 = rVar110;
                n1Var3 = n1Var4;
                kVar3 = kVar4;
            }
            g0Var2.r(true);
            aVar3 = aVar4;
            g0Var = g0Var2;
            rVar2 = rVar110;
            n1Var3 = n1Var4;
            kVar3 = kVar4;
        } else {
            g0Var3.V();
            rVar2 = rVar;
            g0Var = g0Var3;
            kVar3 = kVar2;
            aVar3 = aVar2;
            n1Var3 = n1Var2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new v(state, n1Var, z, onParagraphClicked, onRetryClicked, rVar2, kVar3, aVar3, n1Var3, i, i2);
        }
    }

    public static final void b(u00.a aVar, l1.j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1146012457);
        if ((i & 6) == 0) {
            i2 = i | (g0Var.i(aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            h0.v vVarA = u.a(h0.i.g(12), b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.o oVar = b2.o.A;
            r rVarC = b2.a.c(oVar, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            String strU = z3.U(g0Var, 2131886153);
            long j = dl.a.n;
            z6.b(strU, (r) null, j, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 0, 262122);
            z6.b(z3.U(g0Var, 2131886155), h0.c.D(w50.c.n(z.n.f(f2.h.c(oVar, p0.f.a), t.b(0.15f, t.c), b0.b), true, aVar), 16, 8), j, kh.o.z(14), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 0, 262120);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new i(aVar, i, 0);
        }
    }

    public static final void c(lo.v vVar, boolean z, boolean z2, u00.a aVar, l1.j jVar, int i) {
        l1.j jVar2;
        Object objR;
        i0 i0Var;
        i0 i0Var2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1605582310);
        int i2 = i | (jVar3.g(vVar) ? 4 : 2) | (jVar3.h(z) ? 32 : 16) | (jVar3.h(z2) ? 256 : 128);
        int i3 = 0;
        if (jVar3.S(i2 & 1, (i2 & 1171) != 1170)) {
            int i4 = i2 & 14;
            int i5 = i2 & 112;
            boolean z3 = (i4 == 4) | (i5 == 32);
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (z3 || objN == cVar) {
                objR = q.r(new gl.a(z, vVar, aVar));
                jVar3.n0(objR);
            } else {
                objR = objN;
            }
            p2 p2Var = (p2) objR;
            boolean zE = (i4 == 4) | (i5 == 32) | ((i2 & 896) == 256) | jVar3.e(((Number) p2Var.getValue()).intValue());
            Object objN2 = jVar3.N();
            if (zE || objN2 == cVar) {
                m3.e eVar = new m3.e();
                for (Object obj : vVar.b) {
                    int i6 = i3 + 1;
                    if (i3 < 0) {
                        va.a.k0();
                        throw null;
                    }
                    a0 a0Var = (a0) obj;
                    if (z2) {
                        i0Var2 = new i0(dl.a.n, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65534);
                    } else {
                        if (!z) {
                            i0Var = new i0(t.b(0.35f, dl.a.n), 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65534);
                        } else if (i3 < ((Number) p2Var.getValue()).intValue()) {
                            i0Var2 = new i0(dl.a.n, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, dl.c.a, 57342);
                        } else {
                            i0Var = new i0(t.b(0.4f, dl.a.n), 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65534);
                        }
                        i0Var2 = i0Var;
                    }
                    int iE = eVar.e(i0Var2);
                    try {
                        eVar.b(a0Var.a);
                        eVar.d(iE);
                        if (i3 < va.a.M(vVar.b)) {
                            eVar.b(" ");
                        }
                        i3 = i6;
                    } catch (Throwable th) {
                        eVar.d(iE);
                        throw th;
                    }
                }
                objN2 = eVar.f();
                jVar3.n0(objN2);
            }
            jVar2 = jVar3;
            z6.c((m3.h) objN2, z1.d(b2.o.A, 1.0f), 0L, kh.o.z(20), q3.u.K, 0L, (x3.k) null, kh.o.z(25), 0, false, 0, 0, (Map) null, (u00.k) null, (r0) null, jVar2, 1597488, 48, 522156);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new gv.n(vVar, z, z2, aVar, i);
        }
    }

    public static final void d(lo.u uVar, n1 n1Var, boolean z, u00.k kVar, u00.k kVar2, u00.a aVar, h0.n1 n1Var2, l1.j jVar, int i) {
        l1.j jVar2;
        no.e eVar;
        g1 g1Var;
        int iNextIndex;
        p pVar;
        j0.v vVar;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1880753011);
        int i2 = i | (jVar3.g(uVar) ? 4 : 2) | (jVar3.i(n1Var) ? 32 : 16) | (jVar3.h(z) ? 256 : 128) | (jVar3.i(kVar) ? 2048 : 1024) | (jVar3.i(kVar2) ? 16384 : 8192) | (jVar3.i(aVar) ? 131072 : 65536) | (jVar3.g(n1Var2) ? 1048576 : 524288);
        if (jVar3.S(i2 & 1, (599187 & i2) != 599186)) {
            e60.a aVarA = q50.c.a(jVar3);
            boolean zG = jVar3.g((Object) null) | jVar3.g(aVarA);
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, no.e.class, aVarA, (b60.a) null, jVar3);
            }
            no.e eVar2 = (no.e) objN;
            Object objN2 = jVar3.N();
            if (objN2 == cVar) {
                objN2 = new g1(((lo.t) n1Var.getValue()).a);
                jVar3.n0(objN2);
            }
            g1 g1Var2 = (g1) objN2;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i2 & 896) == 256) | jVar3.i(eVar2) | jVar3.i(n1Var);
            Object objN3 = jVar3.N();
            if (zI || objN3 == cVar) {
                eVar = eVar2;
                g1Var = g1Var2;
                d3 d3Var = new d3(z, eVar, n1Var, g1Var, null, 2);
                jVar3.n0(d3Var);
                objN3 = d3Var;
            } else {
                eVar = eVar2;
                g1Var = g1Var2;
            }
            q.h(eVar, boolValueOf, (u00.n) objN3, jVar3);
            u30.b bVar = uVar.a;
            boolean zG2 = jVar3.g(bVar);
            Object objN4 = jVar3.N();
            if (zG2 || objN4 == cVar) {
                objN4 = q.r(new l6.c(bVar, g1Var, 10));
                jVar3.n0(objN4);
            }
            p2 p2Var = (p2) objN4;
            ListIterator listIterator = bVar.listIterator(((h00.b) bVar).a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (((lo.v) listIterator.previous()).a <= ((lo.t) n1Var.getValue()).a) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex < 0) {
                iNextIndex = 0;
            }
            j0.v vVarA = j0.x.a(iNextIndex, jVar3, 2);
            q2 q2Var = o1.h;
            float fA0 = ((y3.c) jVar3.k(q2Var)).A0(28);
            Object objN5 = jVar3.N();
            if (objN5 == cVar) {
                objN5 = q.z(Boolean.TRUE);
                jVar3.n0(objN5);
            }
            z0 z0Var = (z0) objN5;
            Object objN6 = jVar3.N();
            if (objN6 == cVar) {
                objN6 = new g1(0L);
                jVar3.n0(objN6);
            }
            g1 g1Var3 = (g1) objN6;
            float f = 12;
            float fA1 = ((y3.c) jVar3.k(q2Var)).A0(f);
            int i3 = i2 >> 12;
            z0 z0VarG = q.G(kVar2, jVar3);
            Object objN7 = jVar3.N();
            if (objN7 == cVar) {
                objN7 = new p(fA1, new o2(z0VarG, 19));
                jVar3.n0(objN7);
            }
            p pVar2 = (p) objN7;
            boolean zG3 = jVar3.g(vVarA) | jVar3.i(pVar2);
            Object objN8 = jVar3.N();
            if (zG3 || objN8 == cVar) {
                objN8 = new l6.v(vVarA, pVar2, z0Var, g1Var3, (k00.c) null, 3);
                pVar = pVar2;
                jVar3.n0(objN8);
            } else {
                pVar = pVar2;
            }
            q.i(vVarA, jVar3, (u00.n) objN8);
            Long lValueOf = Long.valueOf(g1Var3.h());
            Object objN9 = jVar3.N();
            if (objN9 == cVar) {
                objN9 = new g6.a(g1Var3, z0Var, (k00.c) null, 26);
                jVar3.n0(objN9);
            }
            q.i(lValueOf, jVar3, (u00.n) objN9);
            Object objN10 = jVar3.N();
            if (objN10 == cVar) {
                objN10 = q.z(Boolean.FALSE);
                jVar3.n0(objN10);
            }
            z0 z0Var2 = (z0) objN10;
            Object objN11 = jVar3.N();
            if (objN11 == cVar) {
                objN11 = q.z((Object) null);
                jVar3.n0(objN11);
            }
            z0 z0Var3 = (z0) objN11;
            final int iR0 = ((y3.c) jVar3.k(q2Var)).R0(f);
            Integer numValueOf = Integer.valueOf(((Number) p2Var.getValue()).intValue());
            Boolean bool = (Boolean) z0Var.getValue();
            bool.getClass();
            boolean zG4 = jVar3.g(vVarA) | jVar3.g(p2Var);
            Object objN12 = jVar3.N();
            if (zG4 || objN12 == cVar) {
                vVar = vVarA;
                objN12 = new l6.v(vVar, z0Var, z0Var2, p2Var, (k00.c) null, 4);
                jVar3.n0(objN12);
            } else {
                vVar = vVarA;
            }
            q.h(numValueOf, bool, (u00.n) objN12, jVar3);
            h0.a0 a0Var = z1.c;
            boolean zE = jVar3.e(iR0);
            Object objN13 = jVar3.N();
            if (zE || objN13 == cVar) {
                final int i4 = 1;
                objN13 = new u00.o() {
                    @Override
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        switch (i4) {
                            case 0:
                                h0.w TabletLiquidBottomTab = (h0.w) obj;
                                g0 g0Var = (l1.j) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                kotlin.jvm.internal.m.e(TabletLiquidBottomTab, "$this$TabletLiquidBottomTab");
                                g0 g0Var2 = g0Var;
                                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    int i5 = iR0;
                                    int i6 = 2131886564;
                                    if (i5 != 0) {
                                        if (i5 == 1) {
                                            i6 = 2131887186;
                                        } else if (i5 == 2) {
                                            i6 = 2131887119;
                                        } else if (i5 == 3) {
                                            i6 = 2131886594;
                                        } else if (i5 == 4) {
                                            i6 = 2131887260;
                                        }
                                    }
                                    z6.b(z3.U(g0Var, i6), (r) null, dl.a.k, o.z(16), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 0, 262122);
                                } else {
                                    g0Var2.V();
                                }
                                return g00.b0.a;
                            default:
                                y0 layout = (y0) obj;
                                v0 measurable = (v0) obj2;
                                kotlin.jvm.internal.m.e(layout, "$this$layout");
                                kotlin.jvm.internal.m.e(measurable, "measurable");
                                int i7 = iR0;
                                int i8 = i7 * 2;
                                l1 l1VarO = measurable.O(y3.b.j(i8, 0, 2, ((y3.a) obj3).a));
                                int i9 = l1VarO.A - i8;
                                return layout.o0(i9 >= 0 ? i9 : 0, l1VarO.B, h00.y.A, new q0(i7, 2, l1VarO));
                        }
                    }
                };
                jVar3.n0(objN13);
            }
            r rVarA = u2.f.a(d0.l(a0Var, (u00.o) objN13), pVar, (u2.d) null);
            boolean z2 = (i2 & 458752) == 131072;
            Object objN14 = jVar3.N();
            if (z2 || objN14 == cVar) {
                objN14 = new j(aVar, z0Var, 0);
                jVar3.n0(objN14);
            }
            r rVarW = ca.v.w(f0.b(rVarA, g00.b0.a, (PointerInputEventHandler) objN14), 0.0f, fA0, 0.0f, fA0);
            h0.f fVarG = h0.i.g(25);
            boolean zG5 = jVar3.g(bVar) | jVar3.g(p2Var) | ((i2 & 7168) == 2048) | ((i2 & 14) == 4);
            Object objN15 = jVar3.N();
            if (zG5 || objN15 == cVar) {
                b1 b1Var = new b1(bVar, kVar, uVar, p2Var, z0Var3, z0Var, g1Var);
                jVar3.n0(b1Var);
                objN15 = b1Var;
            }
            jVar2 = jVar3;
            k00.f.d(rVarW, vVar, n1Var2, fVarG, null, null, false, null, (u00.k) objN15, jVar2, (i3 & 896) | 24576, 488);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new j1.j(uVar, n1Var, z, kVar, kVar2, aVar, n1Var2, i);
        }
    }
}
