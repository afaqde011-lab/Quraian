package rx;

import android.content.res.Configuration;
import b2.r;
import c00.p;
import c00.s;
import c3.o0;
import c3.o1;
import com.google.android.gms.internal.measurement.y3;
import ct.a0;
import dq.l;
import eu.x;
import g00.b0;
import g1.c5;
import g1.h0;
import g1.j7;
import g1.n5;
import g1.o3;
import g1.t6;
import g1.w6;
import g1.z6;
import h0.c1;
import h0.m2;
import h0.n1;
import h0.p1;
import h0.t0;
import h0.t1;
import h0.v;
import h0.v1;
import h0.x1;
import h0.z1;
import i2.t;
import java.util.WeakHashMap;
import k0.y;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.i;
import l1.j;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import m3.r0;
import pz.m;
import q0.i1;
import q3.u;
import qx.o;
import u00.k;
import u00.n;
import w.b2;
import w.c0;
import w.x0;
import w.y0;
import z.h1;
import z2.d0;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new m(7), -320367463, false);
    public static final v1.c b = new v1.c(new m(8), -1460719070, false);
    public static final v1.c c = new v1.c(new qs.c(20), 1527881788, false);
    public static final v1.c d = new v1.c(new m(9), 1879990833, false);
    public static final v1.c e = new v1.c(new m(10), 2041782584, false);

    public static final void a(o oVar, k onAction, kk.c cVar, j jVar, int i) {
        n nVar;
        n nVar2;
        b3.f fVar;
        b3.e eVar;
        boolean z;
        ?? r12;
        n nVar3;
        o uiState = oVar;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1364822705);
        int i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(cVar) ? 256 : 128;
        }
        int i3 = 1;
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            Configuration configuration = (Configuration) g0Var.k(o0.a);
            n1 n1Var = (n1) g0Var.k(l.a);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            String str = uiState.c;
            float f = configuration.screenWidthDp;
            boolean zH = g0Var.h(uiState.h) | g0Var.d(f) | g0Var.h(uiState.b());
            Object objN = g0Var.N();
            Object obj = i.a;
            if (zH || objN == obj) {
                objN = q.r(new kx.j(uiState, f, i3));
                g0Var.n0(objN);
            }
            p2 p2Var = (p2) objN;
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.o oVar2 = b2.o.A;
            r rVarC = b2.a.c(oVar2, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            n nVar4 = b3.h.f;
            q.I(w0VarD, g0Var, nVar4);
            n nVar5 = b3.h.e;
            q.I(m1VarM, g0Var, nVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar2 = b3.h.g;
            q.I(numValueOf, g0Var, fVar2);
            b3.e eVar2 = b3.h.h;
            q.E(g0Var, eVar2);
            n nVar6 = b3.h.d;
            q.I(rVarC, g0Var, nVar6);
            r rVarM = h0.c.M(z1.d(h0.c.E(oVar2, 16, 0.0f, 2), 1.0f), h0.c.e);
            w0 w0VarD2 = h0.o.d(iVar, false);
            int i4 = i2;
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarM, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD2, g0Var, nVar4);
            q.I(m1VarM2, g0Var, nVar5);
            a1.b.v(iHashCode2, g0Var, fVar2, g0Var, eVar2);
            q.I(rVarC2, g0Var, nVar6);
            p0.e eVar3 = p0.f.a;
            float f2 = 0;
            float f3 = 44;
            long jB = t.b(0.5f, dl.a.P);
            boolean z2 = (i4 & 112) == 32;
            Object objN2 = g0Var.N();
            if (z2 || objN2 == obj) {
                objN2 = new qt.h(2, onAction);
                g0Var.n0(objN2);
            }
            w50.c.f((u00.a) objN2, cVar, null, false, false, 0.0f, new y3.f(f3), 0L, jB, 10.0f, eVar3, f2, a, g0Var, ((i4 >> 3) & 112) | 806879232, 432, 188);
            g0Var = g0Var;
            if (oVar.b()) {
                g0Var.c0(-336125064);
                r rVarD = z1.d(oVar2, 1.0f);
                h0.b bVar = h0.i.b;
                b2.h hVar = b2.b.J;
                v1 v1VarA = t1.a(bVar, hVar, g0Var, 6);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                r rVarC3 = b2.a.c(rVarD, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA, g0Var, nVar4);
                q.I(m1VarM3, g0Var, nVar5);
                a1.b.v(iHashCode3, g0Var, fVar2, g0Var, eVar2);
                q.I(rVarC3, g0Var, nVar6);
                z = true;
                nVar2 = nVar4;
                c0.d(!((Boolean) p2Var.getValue()).booleanValue(), (r) null, (x0) null, (y0) null, (String) null, v1.d.d(1943504174, new kx.k(onAction, cVar, 1), g0Var), g0Var, 1572870, 30);
                g0Var.r(true);
                r rVarD2 = z1.d(oVar2, 1.0f);
                v1 v1VarA2 = t1.a(bVar, hVar, g0Var, 6);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                r rVarC4 = b2.a.c(rVarD2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA2, g0Var, nVar2);
                nVar = nVar5;
                q.I(m1VarM4, g0Var, nVar);
                fVar = fVar2;
                eVar = eVar2;
                a1.b.v(iHashCode4, g0Var, fVar, g0Var, eVar);
                q.I(rVarC4, g0Var, nVar6);
                nVar3 = nVar6;
                c0.d(((Boolean) p2Var.getValue()).booleanValue(), (r) null, (x0) null, (y0) null, (String) null, v1.d.d(-1497583913, new az.j(19, oVar, cVar, onAction), g0Var), g0Var, 1572870, 30);
                g0Var.r(true);
                r12 = 0;
                g0Var.r(false);
            } else {
                nVar = nVar5;
                nVar2 = nVar4;
                fVar = fVar2;
                eVar = eVar2;
                z = true;
                r12 = 0;
                nVar3 = nVar6;
                g0Var.c0(-334090627);
                g0Var.r(false);
            }
            g0Var.r(z);
            r rVarE = z1.e(z1.d(h0.c.G(oVar2, 0.0f, 32, 0.0f, 0.0f, 13), 1.0f), t0VarL.c() + n1Var.c());
            w0 w0VarD3 = h0.o.d(b2.b.H, (boolean) r12);
            int iHashCode5 = Long.hashCode(g0Var.T);
            m1 m1VarM5 = g0Var.m();
            r rVarC5 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD3, g0Var, nVar2);
            q.I(m1VarM5, g0Var, nVar);
            a1.b.v(iHashCode5, g0Var, fVar, g0Var, eVar);
            q.I(rVarC5, g0Var, nVar3);
            uiState = oVar;
            c(r12, null, str, g0Var, uiState.f);
            g0Var.r(z);
            g0Var.r(z);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.f(uiState, onAction, cVar, i, 21);
        }
    }

    public static final void b(final r rVar, String str, k kVar, jk.a aVar, boolean z, int i, k kVar2, j jVar, final int i2, final int i3) {
        int i4;
        String str2;
        int i5;
        int i6;
        k kVar3;
        int i7;
        int i8;
        jk.a aVarD;
        int i9;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        k kVar4;
        int i15;
        int i16;
        boolean z3;
        j jVar2;
        final int i17;
        final boolean z4;
        final String str3;
        final k kVar5;
        final jk.a aVar2;
        final k kVar6;
        r1 r1VarT;
        int i18;
        Object obj;
        int i19;
        int i21;
        k kVar7;
        jk.a aVar3;
        Object objN;
        Object objN2;
        final z0.g gVarH;
        Object objN3;
        final g2.t tVar;
        boolean z5;
        Object objN4;
        k00.c cVar;
        boolean zG;
        Object objN5;
        j jVar3 = (g0) jVar;
        jVar3.e0(-241794944);
        if ((i2 & 6) == 0) {
            i4 = (jVar3.g(rVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) == 0) {
            str2 = str;
            int i22 = jVar3.g(str2) ? 32 : 16;
            i5 = i4 | i22;
            i6 = i3 & 4;
            if (i6 != 0) {
                i8 = i5 | 384;
                kVar3 = kVar;
            } else {
                kVar3 = kVar;
                if (jVar3.i(kVar3)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i8 = i5 | i7;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    aVarD = aVar;
                    int i23 = jVar3.i(aVarD) ? 2048 : 1024;
                    i8 |= i23;
                } else {
                    aVarD = aVar;
                }
                i8 |= i23;
            } else {
                aVarD = aVar;
            }
            i9 = i8 | 24576;
            i11 = i3 & 32;
            if (i11 != 0) {
                if ((196608 & i2) == 0) {
                    z2 = z;
                    if (jVar3.h(z2)) {
                        i12 = 131072;
                    } else {
                        i12 = 65536;
                    }
                    i9 |= i12;
                }
                i13 = 13107200 | i9;
                i14 = i3 & 256;
                if (i14 != 0) {
                    i16 = i9 | 113770496;
                    kVar4 = kVar2;
                } else {
                    kVar4 = kVar2;
                    if (jVar3.i(kVar4)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i16 = i13 | i15;
                }
                if ((i16 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i16 & 1, z3)) {
                    jVar3.X();
                    i18 = i2 & 1;
                    obj = i.a;
                    if (i18 != 0 || jVar3.A()) {
                        if ((i3 & 2) != 0) {
                            i16 &= -113;
                            str2 = "";
                        }
                        if (i6 != 0) {
                            objN2 = jVar3.N();
                            if (objN2 == obj) {
                                objN2 = new r9.e(5);
                                jVar3.n0(objN2);
                            }
                            kVar3 = (k) objN2;
                        }
                        if ((i3 & 8) != 0) {
                            i16 &= -7169;
                            aVarD = kk.e.d(jVar3);
                        }
                        if (i11 != 0) {
                            z2 = true;
                        }
                        int i24 = i16 & (-3670017);
                        i19 = 2131887198;
                        if (i14 != 0) {
                            objN = jVar3.N();
                            if (objN == obj) {
                                objN = new ks.e(20);
                                jVar3.n0(objN);
                            }
                            kVar4 = (k) objN;
                        }
                        jk.a aVar4 = aVarD;
                        i21 = i24;
                        kVar7 = kVar4;
                        aVar3 = aVar4;
                    } else {
                        jVar3.V();
                        if ((i3 & 2) != 0) {
                            i16 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i16 &= -7169;
                        }
                        jk.a aVar5 = aVarD;
                        i21 = i16 & (-3670017);
                        kVar7 = kVar4;
                        aVar3 = aVar5;
                        i19 = i;
                    }
                    jVar3.s();
                    gVarH = z0.h.h(str2, jVar3, (i21 >> 3) & 14);
                    objN3 = jVar3.N();
                    if (objN3 == obj) {
                        objN3 = new g2.t();
                        jVar3.n0(objN3);
                    }
                    tVar = (g2.t) objN3;
                    if ((458752 & i21) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objN4 = jVar3.N();
                    final String str4 = str2;
                    cVar = null;
                    if (z5 || objN4 == obj) {
                        objN4 = new ix.m(z2, tVar, cVar, 2);
                        jVar3.n0(objN4);
                    }
                    q.i(b0.a, jVar3, (n) objN4);
                    boolean z6 = z2;
                    zG = jVar3.g(gVarH) | ((i21 & 896) == 256);
                    objN5 = jVar3.N();
                    if (zG || objN5 == obj) {
                        objN5 = new s(gVarH, kVar3, null, 8);
                        jVar3.n0(objN5);
                    }
                    q.h(gVarH, false, (n) objN5, jVar3);
                    jVar3.c0(-651889190);
                    jVar3.r(false);
                    final k kVar8 = kVar7;
                    final int i25 = i19;
                    jVar2 = jVar3;
                    va.a.e(rVar.V(b2.o.A), aVar3, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1662782436, new u00.o() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            v1.c cVarD;
                            h0.r LiquidBox = (h0.r) obj2;
                            g0 g0Var = (j) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            kotlin.jvm.internal.m.e(LiquidBox, "$this$LiquidBox");
                            g0 g0Var2 = g0Var;
                            if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                r rVarJ = g2.d.j(z1.d(b2.o.A, 1.0f), tVar);
                                k kVar9 = kVar8;
                                boolean zG2 = g0Var2.g(kVar9);
                                Object objN6 = g0Var2.N();
                                if (zG2 || objN6 == i.a) {
                                    objN6 = new c(1, kVar9);
                                    g0Var2.n0(objN6);
                                }
                                r rVarS = g2.d.s(rVarJ, (k) objN6);
                                p0.e eVarA = p0.f.a(32);
                                z0.e eVar = z0.e.B;
                                c5 c5Var = c5.a;
                                long j = t.f;
                                long j2 = dl.a.k;
                                t6 t6VarC = c5.c(j2, j2, j2, 0L, j, j, j, 0L, 0L, j, j, j, 0L, t.b(0.6f, j2), t.b(0.6f, j2), t.b(0.6f, j2), g0Var, 1207945096);
                                p1 p1VarE = h0.c.e(16, 0.0f, 2);
                                int length = str4.length();
                                z0.g gVar = gVarH;
                                if (length > 0) {
                                    g0Var2.c0(2095372861);
                                    cVarD = v1.d.d(-743056455, new p(gVar, 6), g0Var);
                                    g0Var2.r(false);
                                } else {
                                    g0Var2.c0(2096149690);
                                    g0Var2.r(false);
                                    cVarD = null;
                                }
                                n5.c(gVar, rVarS, false, (r0) null, (w6) null, v1.d.d(657060189, new c00.j(i25, 4), g0Var), a.c, cVarD, false, (i1) null, (qp.b) null, eVar, (z.p1) null, eVarA, t6VarC, p1VarE, g0Var, 113246208, 100663296, 18611316);
                            } else {
                                g0Var2.V();
                            }
                            return b0.a;
                        }
                    }, jVar3), jVar2, ((i21 >> 6) & 112) | 805309440, 240);
                    i17 = i19;
                    kVar5 = kVar3;
                    aVar2 = aVar3;
                    z4 = z6;
                    kVar6 = kVar8;
                    str3 = str4;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    i17 = i;
                    z4 = z2;
                    str3 = str2;
                    kVar5 = kVar3;
                    aVar2 = aVarD;
                    kVar6 = kVar4;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new n() {
                        @Override
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            a.b(rVar, str3, kVar5, aVar2, z4, i17, kVar6, (j) obj2, q.K(i2 | 1), i3);
                            return b0.a;
                        }
                    };
                }
            }
            i9 = 221184 | i8;
            z2 = z;
            i13 = 13107200 | i9;
            i14 = i3 & 256;
            if (i14 != 0) {
                i16 = i9 | 113770496;
                kVar4 = kVar2;
            } else {
                kVar4 = kVar2;
                if (jVar3.i(kVar4)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i16 = i13 | i15;
            }
            if ((i16 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i16 & 1, z3)) {
                jVar3.X();
                i18 = i2 & 1;
                obj = i.a;
                if (i18 != 0) {
                    if ((i3 & 2) != 0) {
                        i16 &= -113;
                        str2 = "";
                    }
                    if (i6 != 0) {
                        objN2 = jVar3.N();
                        if (objN2 == obj) {
                            objN2 = new r9.e(5);
                            jVar3.n0(objN2);
                        }
                        kVar3 = (k) objN2;
                    }
                    if ((i3 & 8) != 0) {
                        i16 &= -7169;
                        aVarD = kk.e.d(jVar3);
                    }
                    if (i11 != 0) {
                        z2 = true;
                    }
                    int i26 = i16 & (-3670017);
                    i19 = 2131887198;
                    if (i14 != 0) {
                        objN = jVar3.N();
                        if (objN == obj) {
                            objN = new ks.e(20);
                            jVar3.n0(objN);
                        }
                        kVar4 = (k) objN;
                    }
                    jk.a aVar6 = aVarD;
                    i21 = i26;
                    kVar7 = kVar4;
                    aVar3 = aVar6;
                } else {
                    if ((i3 & 2) != 0) {
                        i16 &= -113;
                        str2 = "";
                    }
                    if (i6 != 0) {
                        objN2 = jVar3.N();
                        if (objN2 == obj) {
                            objN2 = new r9.e(5);
                            jVar3.n0(objN2);
                        }
                        kVar3 = (k) objN2;
                    }
                    if ((i3 & 8) != 0) {
                        i16 &= -7169;
                        aVarD = kk.e.d(jVar3);
                    }
                    if (i11 != 0) {
                        z2 = true;
                    }
                    int i27 = i16 & (-3670017);
                    i19 = 2131887198;
                    if (i14 != 0) {
                        objN = jVar3.N();
                        if (objN == obj) {
                            objN = new ks.e(20);
                            jVar3.n0(objN);
                        }
                        kVar4 = (k) objN;
                    }
                    jk.a aVar7 = aVarD;
                    i21 = i27;
                    kVar7 = kVar4;
                    aVar3 = aVar7;
                }
                jVar3.s();
                gVarH = z0.h.h(str2, jVar3, (i21 >> 3) & 14);
                objN3 = jVar3.N();
                if (objN3 == obj) {
                    objN3 = new g2.t();
                    jVar3.n0(objN3);
                }
                tVar = (g2.t) objN3;
                if ((458752 & i21) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objN4 = jVar3.N();
                final String str5 = str2;
                cVar = null;
                if (z5) {
                    objN4 = new ix.m(z2, tVar, cVar, 2);
                    jVar3.n0(objN4);
                } else {
                    objN4 = new ix.m(z2, tVar, cVar, 2);
                    jVar3.n0(objN4);
                }
                q.i(b0.a, jVar3, (n) objN4);
                boolean z7 = z2;
                zG = jVar3.g(gVarH) | ((i21 & 896) == 256);
                objN5 = jVar3.N();
                if (zG) {
                    objN5 = new s(gVarH, kVar3, null, 8);
                    jVar3.n0(objN5);
                } else {
                    objN5 = new s(gVarH, kVar3, null, 8);
                    jVar3.n0(objN5);
                }
                q.h(gVarH, false, (n) objN5, jVar3);
                jVar3.c0(-651889190);
                jVar3.r(false);
                final k kVar9 = kVar7;
                final int i28 = i19;
                jVar2 = jVar3;
                va.a.e(rVar.V(b2.o.A), aVar3, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1662782436, new u00.o() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        v1.c cVarD;
                        h0.r LiquidBox = (h0.r) obj2;
                        g0 g0Var = (j) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        kotlin.jvm.internal.m.e(LiquidBox, "$this$LiquidBox");
                        g0 g0Var2 = g0Var;
                        if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                            r rVarJ = g2.d.j(z1.d(b2.o.A, 1.0f), tVar);
                            k kVar10 = kVar9;
                            boolean zG2 = g0Var2.g(kVar10);
                            Object objN6 = g0Var2.N();
                            if (zG2 || objN6 == i.a) {
                                objN6 = new c(1, kVar10);
                                g0Var2.n0(objN6);
                            }
                            r rVarS = g2.d.s(rVarJ, (k) objN6);
                            p0.e eVarA = p0.f.a(32);
                            z0.e eVar = z0.e.B;
                            c5 c5Var = c5.a;
                            long j = t.f;
                            long j2 = dl.a.k;
                            t6 t6VarC = c5.c(j2, j2, j2, 0L, j, j, j, 0L, 0L, j, j, j, 0L, t.b(0.6f, j2), t.b(0.6f, j2), t.b(0.6f, j2), g0Var, 1207945096);
                            p1 p1VarE = h0.c.e(16, 0.0f, 2);
                            int length = str5.length();
                            z0.g gVar = gVarH;
                            if (length > 0) {
                                g0Var2.c0(2095372861);
                                cVarD = v1.d.d(-743056455, new p(gVar, 6), g0Var);
                                g0Var2.r(false);
                            } else {
                                g0Var2.c0(2096149690);
                                g0Var2.r(false);
                                cVarD = null;
                            }
                            n5.c(gVar, rVarS, false, (r0) null, (w6) null, v1.d.d(657060189, new c00.j(i28, 4), g0Var), a.c, cVarD, false, (i1) null, (qp.b) null, eVar, (z.p1) null, eVarA, t6VarC, p1VarE, g0Var, 113246208, 100663296, 18611316);
                        } else {
                            g0Var2.V();
                        }
                        return b0.a;
                    }
                }, jVar3), jVar2, ((i21 >> 6) & 112) | 805309440, 240);
                i17 = i19;
                kVar5 = kVar3;
                aVar2 = aVar3;
                z4 = z7;
                kVar6 = kVar9;
                str3 = str5;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                i17 = i;
                z4 = z2;
                str3 = str2;
                kVar5 = kVar3;
                aVar2 = aVarD;
                kVar6 = kVar4;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        a.b(rVar, str3, kVar5, aVar2, z4, i17, kVar6, (j) obj2, q.K(i2 | 1), i3);
                        return b0.a;
                    }
                };
            }
        }
        str2 = str;
        i5 = i4 | i22;
        i6 = i3 & 4;
        if (i6 != 0) {
            i8 = i5 | 384;
            kVar3 = kVar;
        } else {
            kVar3 = kVar;
            if (jVar3.i(kVar3)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i8 = i5 | i7;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                aVarD = aVar;
                if (jVar3.i(aVarD)) {
                }
                i8 |= i23;
            } else {
                aVarD = aVar;
            }
            i8 |= i23;
        } else {
            aVarD = aVar;
        }
        i9 = i8 | 24576;
        i11 = i3 & 32;
        if (i11 != 0) {
            if ((196608 & i2) == 0) {
                z2 = z;
                if (jVar3.h(z2)) {
                    i12 = 131072;
                } else {
                    i12 = 65536;
                }
                i9 |= i12;
            }
            i13 = 13107200 | i9;
            i14 = i3 & 256;
            if (i14 != 0) {
                i16 = i9 | 113770496;
                kVar4 = kVar2;
            } else {
                kVar4 = kVar2;
                if (jVar3.i(kVar4)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i16 = i13 | i15;
            }
            if ((i16 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i16 & 1, z3)) {
                jVar3.X();
                i18 = i2 & 1;
                obj = i.a;
                if (i18 != 0) {
                    if ((i3 & 2) != 0) {
                        i16 &= -113;
                        str2 = "";
                    }
                    if (i6 != 0) {
                        objN2 = jVar3.N();
                        if (objN2 == obj) {
                            objN2 = new r9.e(5);
                            jVar3.n0(objN2);
                        }
                        kVar3 = (k) objN2;
                    }
                    if ((i3 & 8) != 0) {
                        i16 &= -7169;
                        aVarD = kk.e.d(jVar3);
                    }
                    if (i11 != 0) {
                        z2 = true;
                    }
                    int i29 = i16 & (-3670017);
                    i19 = 2131887198;
                    if (i14 != 0) {
                        objN = jVar3.N();
                        if (objN == obj) {
                            objN = new ks.e(20);
                            jVar3.n0(objN);
                        }
                        kVar4 = (k) objN;
                    }
                    jk.a aVar8 = aVarD;
                    i21 = i29;
                    kVar7 = kVar4;
                    aVar3 = aVar8;
                } else {
                    if ((i3 & 2) != 0) {
                        i16 &= -113;
                        str2 = "";
                    }
                    if (i6 != 0) {
                        objN2 = jVar3.N();
                        if (objN2 == obj) {
                            objN2 = new r9.e(5);
                            jVar3.n0(objN2);
                        }
                        kVar3 = (k) objN2;
                    }
                    if ((i3 & 8) != 0) {
                        i16 &= -7169;
                        aVarD = kk.e.d(jVar3);
                    }
                    if (i11 != 0) {
                        z2 = true;
                    }
                    int i210 = i16 & (-3670017);
                    i19 = 2131887198;
                    if (i14 != 0) {
                        objN = jVar3.N();
                        if (objN == obj) {
                            objN = new ks.e(20);
                            jVar3.n0(objN);
                        }
                        kVar4 = (k) objN;
                    }
                    jk.a aVar9 = aVarD;
                    i21 = i210;
                    kVar7 = kVar4;
                    aVar3 = aVar9;
                }
                jVar3.s();
                gVarH = z0.h.h(str2, jVar3, (i21 >> 3) & 14);
                objN3 = jVar3.N();
                if (objN3 == obj) {
                    objN3 = new g2.t();
                    jVar3.n0(objN3);
                }
                tVar = (g2.t) objN3;
                if ((458752 & i21) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objN4 = jVar3.N();
                final String str6 = str2;
                cVar = null;
                if (z5) {
                    objN4 = new ix.m(z2, tVar, cVar, 2);
                    jVar3.n0(objN4);
                } else {
                    objN4 = new ix.m(z2, tVar, cVar, 2);
                    jVar3.n0(objN4);
                }
                q.i(b0.a, jVar3, (n) objN4);
                boolean z8 = z2;
                zG = jVar3.g(gVarH) | ((i21 & 896) == 256);
                objN5 = jVar3.N();
                if (zG) {
                    objN5 = new s(gVarH, kVar3, null, 8);
                    jVar3.n0(objN5);
                } else {
                    objN5 = new s(gVarH, kVar3, null, 8);
                    jVar3.n0(objN5);
                }
                q.h(gVarH, false, (n) objN5, jVar3);
                jVar3.c0(-651889190);
                jVar3.r(false);
                final k kVar10 = kVar7;
                final int i211 = i19;
                jVar2 = jVar3;
                va.a.e(rVar.V(b2.o.A), aVar3, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1662782436, new u00.o() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        v1.c cVarD;
                        h0.r LiquidBox = (h0.r) obj2;
                        g0 g0Var = (j) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        kotlin.jvm.internal.m.e(LiquidBox, "$this$LiquidBox");
                        g0 g0Var2 = g0Var;
                        if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                            r rVarJ = g2.d.j(z1.d(b2.o.A, 1.0f), tVar);
                            k kVar11 = kVar10;
                            boolean zG2 = g0Var2.g(kVar11);
                            Object objN6 = g0Var2.N();
                            if (zG2 || objN6 == i.a) {
                                objN6 = new c(1, kVar11);
                                g0Var2.n0(objN6);
                            }
                            r rVarS = g2.d.s(rVarJ, (k) objN6);
                            p0.e eVarA = p0.f.a(32);
                            z0.e eVar = z0.e.B;
                            c5 c5Var = c5.a;
                            long j = t.f;
                            long j2 = dl.a.k;
                            t6 t6VarC = c5.c(j2, j2, j2, 0L, j, j, j, 0L, 0L, j, j, j, 0L, t.b(0.6f, j2), t.b(0.6f, j2), t.b(0.6f, j2), g0Var, 1207945096);
                            p1 p1VarE = h0.c.e(16, 0.0f, 2);
                            int length = str6.length();
                            z0.g gVar = gVarH;
                            if (length > 0) {
                                g0Var2.c0(2095372861);
                                cVarD = v1.d.d(-743056455, new p(gVar, 6), g0Var);
                                g0Var2.r(false);
                            } else {
                                g0Var2.c0(2096149690);
                                g0Var2.r(false);
                                cVarD = null;
                            }
                            n5.c(gVar, rVarS, false, (r0) null, (w6) null, v1.d.d(657060189, new c00.j(i211, 4), g0Var), a.c, cVarD, false, (i1) null, (qp.b) null, eVar, (z.p1) null, eVarA, t6VarC, p1VarE, g0Var, 113246208, 100663296, 18611316);
                        } else {
                            g0Var2.V();
                        }
                        return b0.a;
                    }
                }, jVar3), jVar2, ((i21 >> 6) & 112) | 805309440, 240);
                i17 = i19;
                kVar5 = kVar3;
                aVar2 = aVar3;
                z4 = z8;
                kVar6 = kVar10;
                str3 = str6;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                i17 = i;
                z4 = z2;
                str3 = str2;
                kVar5 = kVar3;
                aVar2 = aVarD;
                kVar6 = kVar4;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        a.b(rVar, str3, kVar5, aVar2, z4, i17, kVar6, (j) obj2, q.K(i2 | 1), i3);
                        return b0.a;
                    }
                };
            }
        }
        i9 = 221184 | i8;
        z2 = z;
        i13 = 13107200 | i9;
        i14 = i3 & 256;
        if (i14 != 0) {
            i16 = i9 | 113770496;
            kVar4 = kVar2;
        } else {
            kVar4 = kVar2;
            if (jVar3.i(kVar4)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i16 = i13 | i15;
        }
        if ((i16 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (jVar3.S(i16 & 1, z3)) {
            jVar3.X();
            i18 = i2 & 1;
            obj = i.a;
            if (i18 != 0) {
                if ((i3 & 2) != 0) {
                    i16 &= -113;
                    str2 = "";
                }
                if (i6 != 0) {
                    objN2 = jVar3.N();
                    if (objN2 == obj) {
                        objN2 = new r9.e(5);
                        jVar3.n0(objN2);
                    }
                    kVar3 = (k) objN2;
                }
                if ((i3 & 8) != 0) {
                    i16 &= -7169;
                    aVarD = kk.e.d(jVar3);
                }
                if (i11 != 0) {
                    z2 = true;
                }
                int i212 = i16 & (-3670017);
                i19 = 2131887198;
                if (i14 != 0) {
                    objN = jVar3.N();
                    if (objN == obj) {
                        objN = new ks.e(20);
                        jVar3.n0(objN);
                    }
                    kVar4 = (k) objN;
                }
                jk.a aVar10 = aVarD;
                i21 = i212;
                kVar7 = kVar4;
                aVar3 = aVar10;
            } else {
                if ((i3 & 2) != 0) {
                    i16 &= -113;
                    str2 = "";
                }
                if (i6 != 0) {
                    objN2 = jVar3.N();
                    if (objN2 == obj) {
                        objN2 = new r9.e(5);
                        jVar3.n0(objN2);
                    }
                    kVar3 = (k) objN2;
                }
                if ((i3 & 8) != 0) {
                    i16 &= -7169;
                    aVarD = kk.e.d(jVar3);
                }
                if (i11 != 0) {
                    z2 = true;
                }
                int i213 = i16 & (-3670017);
                i19 = 2131887198;
                if (i14 != 0) {
                    objN = jVar3.N();
                    if (objN == obj) {
                        objN = new ks.e(20);
                        jVar3.n0(objN);
                    }
                    kVar4 = (k) objN;
                }
                jk.a aVar11 = aVarD;
                i21 = i213;
                kVar7 = kVar4;
                aVar3 = aVar11;
            }
            jVar3.s();
            gVarH = z0.h.h(str2, jVar3, (i21 >> 3) & 14);
            objN3 = jVar3.N();
            if (objN3 == obj) {
                objN3 = new g2.t();
                jVar3.n0(objN3);
            }
            tVar = (g2.t) objN3;
            if ((458752 & i21) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            objN4 = jVar3.N();
            final String str7 = str2;
            cVar = null;
            if (z5) {
                objN4 = new ix.m(z2, tVar, cVar, 2);
                jVar3.n0(objN4);
            } else {
                objN4 = new ix.m(z2, tVar, cVar, 2);
                jVar3.n0(objN4);
            }
            q.i(b0.a, jVar3, (n) objN4);
            boolean z9 = z2;
            zG = jVar3.g(gVarH) | ((i21 & 896) == 256);
            objN5 = jVar3.N();
            if (zG) {
                objN5 = new s(gVarH, kVar3, null, 8);
                jVar3.n0(objN5);
            } else {
                objN5 = new s(gVarH, kVar3, null, 8);
                jVar3.n0(objN5);
            }
            q.h(gVarH, false, (n) objN5, jVar3);
            jVar3.c0(-651889190);
            jVar3.r(false);
            final k kVar11 = kVar7;
            final int i214 = i19;
            jVar2 = jVar3;
            va.a.e(rVar.V(b2.o.A), aVar3, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(t.b(0.7f, dl.a.P)), v1.d.d(1662782436, new u00.o() {
                @Override
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    v1.c cVarD;
                    h0.r LiquidBox = (h0.r) obj2;
                    g0 g0Var = (j) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    kotlin.jvm.internal.m.e(LiquidBox, "$this$LiquidBox");
                    g0 g0Var2 = g0Var;
                    if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                        r rVarJ = g2.d.j(z1.d(b2.o.A, 1.0f), tVar);
                        k kVar12 = kVar11;
                        boolean zG2 = g0Var2.g(kVar12);
                        Object objN6 = g0Var2.N();
                        if (zG2 || objN6 == i.a) {
                            objN6 = new c(1, kVar12);
                            g0Var2.n0(objN6);
                        }
                        r rVarS = g2.d.s(rVarJ, (k) objN6);
                        p0.e eVarA = p0.f.a(32);
                        z0.e eVar = z0.e.B;
                        c5 c5Var = c5.a;
                        long j = t.f;
                        long j2 = dl.a.k;
                        t6 t6VarC = c5.c(j2, j2, j2, 0L, j, j, j, 0L, 0L, j, j, j, 0L, t.b(0.6f, j2), t.b(0.6f, j2), t.b(0.6f, j2), g0Var, 1207945096);
                        p1 p1VarE = h0.c.e(16, 0.0f, 2);
                        int length = str7.length();
                        z0.g gVar = gVarH;
                        if (length > 0) {
                            g0Var2.c0(2095372861);
                            cVarD = v1.d.d(-743056455, new p(gVar, 6), g0Var);
                            g0Var2.r(false);
                        } else {
                            g0Var2.c0(2096149690);
                            g0Var2.r(false);
                            cVarD = null;
                        }
                        n5.c(gVar, rVarS, false, (r0) null, (w6) null, v1.d.d(657060189, new c00.j(i214, 4), g0Var), a.c, cVarD, false, (i1) null, (qp.b) null, eVar, (z.p1) null, eVarA, t6VarC, p1VarE, g0Var, 113246208, 100663296, 18611316);
                    } else {
                        g0Var2.V();
                    }
                    return b0.a;
                }
            }, jVar3), jVar2, ((i21 >> 6) & 112) | 805309440, 240);
            i17 = i19;
            kVar5 = kVar3;
            aVar2 = aVar3;
            z4 = z9;
            kVar6 = kVar11;
            str3 = str7;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            i17 = i;
            z4 = z2;
            str3 = str2;
            kVar5 = kVar3;
            aVar2 = aVarD;
            kVar6 = kVar4;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    a.b(rVar, str3, kVar5, aVar2, z4, i17, kVar6, (j) obj2, q.K(i2 | 1), i3);
                    return b0.a;
                }
            };
        }
    }

    public static final void c(int i, r rVar, String str, j jVar, boolean z) {
        r rVar2;
        r rVar3;
        String title = str;
        kotlin.jvm.internal.m.e(title, "title");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-758464023);
        int i2 = i | (g0Var.g(title) ? 4 : 2) | 48 | (g0Var.h(z) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            r rVar4 = b2.o.A;
            if (z) {
                g0Var.c0(421414865);
                v1 v1VarA = t1.a(h0.i.g(6), b2.b.K, g0Var, 54);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                r rVarC = b2.a.c(rVar4, g0Var);
                b3.i.c.getClass();
                b3.g gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA, g0Var, b3.h.f);
                q.I(m1VarM, g0Var, b3.h.e);
                q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                q.E(g0Var, b3.h.h);
                q.I(rVarC, g0Var, b3.h.d);
                o3.a(y3.R(2131231389, g0Var, 0), (String) null, z1.m(rVar4, 18), dl.a.i, g0Var, 440, 0);
                rVar3 = rVar4;
                z6.b(title, (r) null, dl.a.k, kh.o.z(18), u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (k) null, (r0) null, g0Var, (i2 & 14) | 1597440, 0, 262058);
                g0Var = g0Var;
                g0Var.r(true);
                g0Var.r(false);
                title = str;
            } else {
                rVar3 = rVar4;
                g0Var.c0(422003400);
                title = str;
                z6.b(title, rVar3, dl.a.k, kh.o.z(18), u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (k) null, (r0) null, g0Var, (i2 & 14) | 1597488, 0, 262056);
                g0Var = g0Var;
                g0Var.r(false);
            }
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new es.e(title, rVar2, z, i);
        }
    }

    public static final void d(int i, y yVar, kk.c cVar, j jVar, o uiState, k onAction) {
        k kVar;
        Object obj;
        boolean z;
        Object objN;
        boolean z2;
        Object objN2;
        j7 j7Var = h0.c.e;
        b2.h hVar = b2.b.K;
        b2.g gVar = b2.b.M;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1703047608);
        int i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        int i3 = i2 | (g0Var.g(yVar) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= g0Var.i(cVar) ? 2048 : 1024;
        }
        if (g0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            y3.c cVar2 = (y3.c) g0Var.k(o1.h);
            boolean z3 = (i3 & 896) == 256;
            Object objN3 = g0Var.N();
            boolean z4 = z3;
            l1.c cVar3 = i.a;
            if (z4 || objN3 == cVar3) {
                objN3 = q.r(new hw.d(yVar, 2));
                g0Var.n0(objN3);
            }
            int i4 = i3 & 112;
            boolean z5 = i4 == 32;
            Object objN4 = g0Var.N();
            if (z5 || objN4 == cVar3) {
                objN4 = new kx.m(1, null, onAction);
                g0Var.n0(objN4);
            }
            q.i(b0.a, g0Var, (n) objN4);
            boolean z6 = uiState.h;
            b2.o oVar = b2.o.A;
            if (z6) {
                g0Var.c0(957935505);
                r rVarM = h0.c.M(z1.d(oVar, 1.0f), j7Var);
                h0.d dVar = h0.i.c;
                v vVarA = h0.u.a(dVar, gVar, g0Var, 0);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                r rVarC = b2.a.c(rVarM, g0Var);
                b3.i.c.getClass();
                b3.g gVar2 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                b3.f fVar = b3.h.f;
                q.I(vVarA, g0Var, fVar);
                b3.f fVar2 = b3.h.e;
                q.I(m1VarM, g0Var, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                b3.f fVar3 = b3.h.g;
                q.I(numValueOf, g0Var, fVar3);
                b3.e eVar = b3.h.h;
                q.E(g0Var, eVar);
                int i5 = i3;
                b3.f fVar4 = b3.h.d;
                q.I(rVarC, g0Var, fVar4);
                r rVarD = z1.d(oVar, 1.0f);
                boolean zG = (i4 == 32) | g0Var.g(cVar2);
                Object objN5 = g0Var.N();
                if (zG || objN5 == cVar3) {
                    objN5 = new jk.i(onAction, cVar2, 4);
                    g0Var.n0(objN5);
                }
                r rVarO = d0.o(rVarD, (k) objN5);
                v vVarA2 = h0.u.a(dVar, gVar, g0Var, 0);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC2 = b2.a.c(rVarO, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                q.I(vVarA2, g0Var, fVar);
                q.I(m1VarM2, g0Var, fVar2);
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC2, g0Var, fVar4);
                h0.c.h(z1.e(oVar, sm.a.a), g0Var);
                r rVarD2 = z1.d(h0.c.E(oVar, 16, 0.0f, 2), 1.0f);
                v1 v1VarA = t1.a(h0.i.g(8), hVar, g0Var, 54);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                r rVarC3 = b2.a.c(rVarD2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA, g0Var, fVar);
                q.I(m1VarM3, g0Var, fVar2);
                a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC3, g0Var, fVar4);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                r rVarE = z1.e(new c1(1.0f, true), 40);
                String str = uiState.g;
                boolean z7 = i4 == 32;
                Object objN6 = g0Var.N();
                if (z7) {
                    obj = cVar3;
                } else {
                    obj = cVar3;
                    if (objN6 == obj) {
                    }
                    k kVar2 = (k) objN6;
                    if (i4 == 32) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objN = g0Var.N();
                    if (z || objN == obj) {
                        objN = new c(3, onAction);
                        g0Var.n0(objN);
                    }
                    Object obj2 = obj;
                    b(rVarE, str, kVar2, cVar, false, 0, (k) objN, g0Var, i5 & 7168, 240);
                    p0.e eVar2 = p0.f.a;
                    float f = 0;
                    float f2 = 44;
                    long jB = t.b(0.5f, dl.a.P);
                    if (i4 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objN2 = g0Var.N();
                    if (z2 || objN2 == obj2) {
                        objN2 = new qt.h(4, onAction);
                        g0Var.n0(objN2);
                    }
                    w50.c.f((u00.a) objN2, cVar, null, false, false, 0.0f, new y3.f(f2), 0L, jB, 10.0f, eVar2, f, d, g0Var, ((i5 >> 6) & 112) | 806879232, 432, 188);
                    g0Var = g0Var;
                    g0Var.r(true);
                    g0Var.r(true);
                    g0Var.r(true);
                    g0Var.r(false);
                    kVar = onAction;
                }
                objN6 = new c(2, onAction);
                g0Var.n0(objN6);
                k kVar3 = (k) objN6;
                if (i4 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objN = g0Var.N();
                if (z) {
                    objN = new c(3, onAction);
                    g0Var.n0(objN);
                } else {
                    objN = new c(3, onAction);
                    g0Var.n0(objN);
                }
                Object obj3 = obj;
                b(rVarE, str, kVar3, cVar, false, 0, (k) objN, g0Var, i5 & 7168, 240);
                p0.e eVar3 = p0.f.a;
                float f3 = 0;
                float f4 = 44;
                long jB2 = t.b(0.5f, dl.a.P);
                if (i4 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objN2 = g0Var.N();
                if (z2) {
                    objN2 = new qt.h(4, onAction);
                    g0Var.n0(objN2);
                } else {
                    objN2 = new qt.h(4, onAction);
                    g0Var.n0(objN2);
                }
                w50.c.f((u00.a) objN2, cVar, null, false, false, 0.0f, new y3.f(f4), 0L, jB2, 10.0f, eVar3, f3, d, g0Var, ((i5 >> 6) & 112) | 806879232, 432, 188);
                g0Var = g0Var;
                g0Var.r(true);
                g0Var.r(true);
                g0Var.r(true);
                g0Var.r(false);
                kVar = onAction;
            } else {
                g0Var.c0(960371299);
                r rVarM2 = h0.c.M(z1.d(h0.c.E(oVar, 16, 0.0f, 2), 1.0f), j7Var);
                v1 v1VarA2 = t1.a(h0.i.g(8), hVar, g0Var, 54);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                r rVarC4 = b2.a.c(rVarM2, g0Var);
                b3.i.c.getClass();
                b3.g gVar3 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar3);
                } else {
                    g0Var.q0();
                }
                b3.f fVar5 = b3.h.f;
                q.I(v1VarA2, g0Var, fVar5);
                b3.f fVar6 = b3.h.e;
                q.I(m1VarM4, g0Var, fVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                b3.f fVar7 = b3.h.g;
                q.I(numValueOf2, g0Var, fVar7);
                b3.e eVar4 = b3.h.h;
                q.E(g0Var, eVar4);
                b3.f fVar8 = b3.h.d;
                q.I(rVarC4, g0Var, fVar8);
                r rVarD3 = z1.d(oVar, 1.0f);
                int i6 = i3;
                v vVarA3 = h0.u.a(h0.i.g(12), gVar, g0Var, 6);
                int iHashCode5 = Long.hashCode(g0Var.T);
                m1 m1VarM5 = g0Var.m();
                r rVarC5 = b2.a.c(rVarD3, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar3);
                } else {
                    g0Var.q0();
                }
                q.I(vVarA3, g0Var, fVar5);
                q.I(m1VarM5, g0Var, fVar6);
                a1.b.v(iHashCode5, g0Var, fVar7, g0Var, eVar4);
                q.I(rVarC5, g0Var, fVar8);
                r rVarD4 = z1.d(oVar, 1.0f);
                w0 w0VarD = h0.o.d(b2.b.E, false);
                int iHashCode6 = Long.hashCode(g0Var.T);
                m1 m1VarM6 = g0Var.m();
                r rVarC6 = b2.a.c(rVarD4, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar3);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD, g0Var, fVar5);
                q.I(m1VarM6, g0Var, fVar6);
                a1.b.v(iHashCode6, g0Var, fVar7, g0Var, eVar4);
                q.I(rVarC6, g0Var, fVar8);
                r rVarA = h0.s.a.a(oVar, b2.b.D);
                boolean zG2 = g0Var.g(cVar2) | (i4 == 32);
                Object objN7 = g0Var.N();
                if (zG2 || objN7 == cVar3) {
                    kVar = onAction;
                    objN7 = new jk.i(kVar, cVar2, 5);
                    g0Var.n0(objN7);
                } else {
                    kVar = onAction;
                }
                r rVarO2 = d0.o(rVarA, (k) objN7);
                p0.e eVar5 = p0.f.a;
                float f5 = 0;
                float f6 = 44;
                long jB3 = t.b(0.5f, dl.a.P);
                boolean z8 = i4 == 32;
                Object objN8 = g0Var.N();
                if (z8 || objN8 == cVar3) {
                    objN8 = new qt.h(5, kVar);
                    g0Var.n0(objN8);
                }
                w50.c.f((u00.a) objN8, cVar, rVarO2, false, false, 0.0f, new y3.f(f6), 0L, jB3, 10.0f, eVar5, f5, e, g0Var, ((i6 >> 6) & 112) | 806879232, 432, 184);
                g0Var = g0Var;
                g0Var.r(true);
                g0Var.c0(1747829112);
                g0Var.r(false);
                g0Var.r(true);
                g0Var.r(true);
                g0Var.r(false);
            }
        } else {
            kVar = onAction;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new f(uiState, kVar, yVar, cVar, i);
        }
    }

    public static final void e(float f, int i, r rVar, j jVar) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(779745510);
        int i3 = (g0Var.d(f) ? 4 : 2) | i | 48;
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = ((gm.a) g0Var.k(dl.e.a)).ordinal();
            if (iOrdinal == 0) {
                i2 = 165;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 210;
            }
            float f2 = i2;
            r rVar2 = b2.o.A;
            r rVarE = z1.e(z1.q(rVar2, f), f2);
            v vVarA = h0.u.a(h0.i.g(8), b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarE, g0Var);
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
            ox.g.d(f / 2, 0, 0, z1.m(rVar2, f), g0Var);
            ox.g.d(0.0f, 0, 2, z1.n(rVar2, 0.8f * f, 16), g0Var);
            g0Var.r(true);
            rVar = rVar2;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a0(f, rVar, i, 6);
        }
    }

    public static final void f(String text, r rVar, long j, j jVar, int i, int i2) {
        int i3;
        r rVar2;
        long j2;
        boolean z;
        r rVar3;
        long j3;
        r1 r1VarT;
        r rVar4;
        int i4;
        long j4;
        kotlin.jvm.internal.m.e(text, "text");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1760238656);
        if ((i & 6) == 0) {
            i3 = (g0Var.g(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                rVar2 = rVar;
                i3 |= g0Var.g(rVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    int i6 = g0Var.f(j2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    j2 = j;
                }
                i3 |= i6;
            } else {
                j2 = j;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                g0Var.X();
                if ((i & 1) != 0 || g0Var.A()) {
                    if (i5 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if ((i2 & 4) != 0) {
                        g0Var = g0Var;
                        i4 = i3 & (-897);
                        j4 = dl.a.n;
                    }
                    g0Var.s();
                    r rVar5 = rVar4;
                    z6.b(text, rVar5, j4, kh.o.z(32), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 2, false, 1, 0, (k) null, (r0) null, g0Var, (i4 & 14) | 1597440 | (i4 & 112) | (i4 & 896), 25008, 239528);
                    j3 = j4;
                    rVar3 = rVar5;
                } else {
                    g0Var.V();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    rVar4 = rVar2;
                }
                i4 = i3;
                j4 = j2;
                g0Var.s();
                r rVar6 = rVar4;
                z6.b(text, rVar6, j4, kh.o.z(32), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 2, false, 1, 0, (k) null, (r0) null, g0Var, (i4 & 14) | 1597440 | (i4 & 112) | (i4 & 896), 25008, 239528);
                j3 = j4;
                rVar3 = rVar6;
            } else {
                g0Var = g0Var;
                g0Var.V();
                rVar3 = rVar2;
                j3 = j2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new kx.n(text, rVar3, j3, i, i2, 1);
            }
        }
        i3 |= 48;
        rVar2 = rVar;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (g0Var.f(j2)) {
                }
                i3 |= i6;
            } else {
                j2 = j;
            }
            i3 |= i6;
        } else {
            j2 = j;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i3 & 1, z)) {
            g0Var.X();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if ((i2 & 4) != 0) {
                    g0Var = g0Var;
                    i4 = i3 & (-897);
                    j4 = dl.a.n;
                } else {
                    i4 = i3;
                    j4 = j2;
                }
            } else {
                if (i5 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if ((i2 & 4) != 0) {
                    g0Var = g0Var;
                    i4 = i3 & (-897);
                    j4 = dl.a.n;
                } else {
                    i4 = i3;
                    j4 = j2;
                }
            }
            g0Var.s();
            r rVar7 = rVar4;
            z6.b(text, rVar7, j4, kh.o.z(32), u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(32), 2, false, 1, 0, (k) null, (r0) null, g0Var, (i4 & 14) | 1597440 | (i4 & 112) | (i4 & 896), 25008, 239528);
            j3 = j4;
            rVar3 = rVar7;
        } else {
            g0Var = g0Var;
            g0Var.V();
            rVar3 = rVar2;
            j3 = j2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new kx.n(text, rVar3, j3, i, i2, 1);
        }
    }

    public static final void g(u00.a onClick, boolean z, boolean z2, r rVar, jk.a aVar, j jVar, int i, int i2) {
        jk.a aVarD;
        int i3;
        boolean z3;
        jk.a aVar2;
        r1 r1VarT;
        int i4;
        jk.a aVar3;
        long jB;
        long jB2;
        p2 p2VarA;
        v1.c cVarD;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objN;
        b3.g gVar;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objN2;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1167195136);
        int i5 = (g0Var.i(onClick) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= g0Var.h(z) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i5 |= g0Var.g(rVar) ? 2048 : 1024;
        }
        if ((i2 & 16) == 0) {
            aVarD = aVar;
            int i6 = g0Var.i(aVarD) ? 16384 : 8192;
            i3 = i5 | i6;
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i3 & 1, z3)) {
                g0Var.X();
                if ((i & 1) == 0 && !g0Var.A()) {
                    g0Var.V();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                } else if ((i2 & 16) != 0) {
                    aVarD = kk.e.d(g0Var);
                    i3 &= -57345;
                }
                i4 = i3;
                aVar3 = aVarD;
                g0Var.s();
                if (z) {
                    jB = t.f;
                } else {
                    jB = t.b(0.6f, dl.a.k);
                }
                p2 p2VarA2 = b2.a(jB, (x.y) null, (String) null, g0Var, 0, 14);
                if (z) {
                    jB2 = t.f;
                } else if (z2) {
                    jB2 = t.b(0.7f, dl.a.P);
                } else {
                    jB2 = t.b(0.1f, dl.a.i);
                }
                p2VarA = b2.a(jB2, (x.y) null, (String) null, g0Var, 0, 14);
                cVarD = v1.d.d(737060534, new x(p2VarA2, 4), g0Var);
                l1.c cVar = i.a;
                if (z2) {
                    g0Var.c0(-143832237);
                    r rVarE = z1.e(z1.d(rVar, 1.0f), 40);
                    if ((i4 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if ((i4 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z8 | z7;
                    objN2 = g0Var.N();
                    if (z9 || objN2 == cVar) {
                        objN2 = new c0.g(z, onClick, 3);
                        g0Var.n0(objN2);
                    }
                    va.a.e(w50.c.n(rVarE, true, (u00.a) objN2), aVar3, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(((t) p2VarA.getValue()).a), v1.d.d(-1897562527, new gv.r(cVarD, 4), g0Var), g0Var, ((i4 >> 9) & 112) | 805309440, 240);
                    g0Var = g0Var;
                    g0Var.r(false);
                } else {
                    g0Var.c0(-142983116);
                    r rVarF = z.n.f(f2.h.c(z1.e(z1.d(rVar, 1.0f), 40), p0.f.a(32)), ((t) p2VarA.getValue()).a, i2.b0.b);
                    if ((i4 & 112) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((i4 & 14) == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | z4;
                    objN = g0Var.N();
                    if (z6 || objN == cVar) {
                        objN = new c0.g(z, onClick, 4);
                        g0Var.n0(objN);
                    }
                    r rVarE2 = h0.c.E(w50.c.n(rVarF, true, (u00.a) objN), 16, 0.0f, 2);
                    v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    r rVarC = b2.a.c(rVarE2, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    q.I(v1VarA, g0Var, b3.h.f);
                    q.I(m1VarM, g0Var, b3.h.e);
                    q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    q.E(g0Var, b3.h.h);
                    q.I(rVarC, g0Var, b3.h.d);
                    cVarD.invoke(x1.a, g0Var, 54);
                    g0Var.r(true);
                    g0Var.r(false);
                }
                aVar2 = aVar3;
            } else {
                g0Var.V();
                aVar2 = aVarD;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new h0(onClick, z, z2, rVar, aVar2, i, i2);
            }
        }
        aVarD = aVar;
        i3 = i5 | i6;
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var.S(i3 & 1, z3)) {
            g0Var.X();
            if ((i & 1) == 0) {
                if ((i2 & 16) != 0) {
                    aVarD = kk.e.d(g0Var);
                    i3 &= -57345;
                }
            } else if ((i2 & 16) != 0) {
                aVarD = kk.e.d(g0Var);
                i3 &= -57345;
            }
            i4 = i3;
            aVar3 = aVarD;
            g0Var.s();
            if (z) {
                jB = t.f;
            } else {
                jB = t.b(0.6f, dl.a.k);
            }
            p2 p2VarA3 = b2.a(jB, (x.y) null, (String) null, g0Var, 0, 14);
            if (z) {
                jB2 = t.f;
            } else if (z2) {
                jB2 = t.b(0.7f, dl.a.P);
            } else {
                jB2 = t.b(0.1f, dl.a.i);
            }
            p2VarA = b2.a(jB2, (x.y) null, (String) null, g0Var, 0, 14);
            cVarD = v1.d.d(737060534, new x(p2VarA3, 4), g0Var);
            l1.c cVar2 = i.a;
            if (z2) {
                g0Var.c0(-143832237);
                r rVarE3 = z1.e(z1.d(rVar, 1.0f), 40);
                if ((i4 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((i4 & 14) == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z8 | z7;
                objN2 = g0Var.N();
                if (z9) {
                    objN2 = new c0.g(z, onClick, 3);
                    g0Var.n0(objN2);
                } else {
                    objN2 = new c0.g(z, onClick, 3);
                    g0Var.n0(objN2);
                }
                va.a.e(w50.c.n(rVarE3, true, (u00.a) objN2), aVar3, p0.f.a(32), 4.0f, (b2.d) null, false, 0.0f, 0.0f, new t(((t) p2VarA.getValue()).a), v1.d.d(-1897562527, new gv.r(cVarD, 4), g0Var), g0Var, ((i4 >> 9) & 112) | 805309440, 240);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(-142983116);
                r rVarF2 = z.n.f(f2.h.c(z1.e(z1.d(rVar, 1.0f), 40), p0.f.a(32)), ((t) p2VarA.getValue()).a, i2.b0.b);
                if ((i4 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((i4 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | z4;
                objN = g0Var.N();
                if (z6) {
                    objN = new c0.g(z, onClick, 4);
                    g0Var.n0(objN);
                } else {
                    objN = new c0.g(z, onClick, 4);
                    g0Var.n0(objN);
                }
                r rVarE4 = h0.c.E(w50.c.n(rVarF2, true, (u00.a) objN), 16, 0.0f, 2);
                v1 v1VarA2 = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC2 = b2.a.c(rVarE4, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA2, g0Var, b3.h.f);
                q.I(m1VarM2, g0Var, b3.h.e);
                q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
                q.E(g0Var, b3.h.h);
                q.I(rVarC2, g0Var, b3.h.d);
                cVarD.invoke(x1.a, g0Var, 54);
                g0Var.r(true);
                g0Var.r(false);
            }
            aVar2 = aVar3;
        } else {
            g0Var.V();
            aVar2 = aVarD;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new h0(onClick, z, z2, rVar, aVar2, i, i2);
        }
    }

    public static final void h(o uiState, k onAction, j jVar, int i) {
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1403872511);
        int i2 = (g0Var.g(uiState) ? 4 : 2) | i | (g0Var.i(onAction) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            kk.c cVarD = kk.e.d(g0Var);
            y yVarA = k0.a0.a(0, g0Var, 3);
            p2 p2VarC = sm.a.c(yVarA, g0Var);
            r rVarF = z.n.f(z1.c, dl.a.L, i2.b0.b);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            b2.o oVar = b2.o.A;
            int i3 = i2 & 14;
            i(uiState, onAction, yVarA, kk.e.a(oVar, cVarD), g0Var, i2 & 126);
            sm.a.a(uiState.c, uiState.h ? 1.0f : ((Number) p2VarC.getValue()).floatValue(), h0.s.a.a(oVar, b2.b.B), 0.0f, g0Var, 0);
            k(i3 | ((i2 << 6) & 7168), yVarA, cVarD, g0Var, uiState, onAction);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(uiState, onAction, i, 20);
        }
    }

    public static final void i(final o uiState, final k onAction, y yVar, r rVar, j jVar, int i) {
        float fC;
        float f;
        float f2;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        float f3 = uiState.j;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        j jVar2 = (g0) jVar;
        jVar2.e0(-1825133491);
        int i2 = i | (jVar2.g(uiState) ? 4 : 2) | (jVar2.i(onAction) ? 32 : 16) | (jVar2.g(yVar) ? 256 : 128) | (jVar2.g(rVar) ? 2048 : 1024);
        if (jVar2.S(i2 & 1, (i2 & 1171) != 1170)) {
            final gm.a aVar = (gm.a) jVar2.k(dl.e.a);
            n1 n1Var = (n1) jVar2.k(l.a);
            final y3.c cVar = (y3.c) jVar2.k(o1.h);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(jVar2).g, jVar2);
            boolean zE = jVar2.e(aVar.ordinal()) | jVar2.d(f3);
            Object objN = jVar2.N();
            l1.c cVar2 = i.a;
            if (zE || objN == cVar2) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    fC = f3 + t0VarL.c();
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fC = 140;
                }
                objN = oi.k.t(fC, jVar2);
            }
            float f4 = ((y3.f) objN).A;
            boolean zG = jVar2.g(n1Var) | jVar2.g(t0VarL);
            Object objN2 = jVar2.N();
            if (zG || objN2 == cVar2) {
                objN2 = oi.k.t(n1Var.a() + t0VarL.a() + 4, jVar2);
            }
            float f5 = ((y3.f) objN2).A;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objN3 = jVar2.N();
            int i4 = 3;
            if (z || objN3 == cVar2) {
                objN3 = q.r(new hw.d(yVar, i4));
                jVar2.n0(objN3);
            }
            final p2 p2Var = (p2) objN3;
            final p2 p2VarA = b2.a(((Boolean) p2Var.getValue()).booleanValue() ? t.f : dl.a.n, (x.y) null, (String) null, jVar2, 0, 14);
            Configuration configuration = (Configuration) jVar2.k(o0.a);
            boolean zE2 = jVar2.e(aVar.ordinal()) | jVar2.e(configuration.screenWidthDp);
            Object objN4 = jVar2.N();
            if (zE2 || objN4 == cVar2) {
                float f6 = qx.n.a;
                int iOrdinal2 = aVar.ordinal();
                if (iOrdinal2 == 0) {
                    f = qx.n.a;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = qx.n.b * 1.1f;
                }
                int iMax = f <= 0.0f ? 1 : Math.max(3, (int) ((configuration.screenWidthDp - 20) / (f + 12)));
                Integer numValueOf = Integer.valueOf(iMax);
                float f7 = ((configuration.screenWidthDp - 32) - ((iMax - 1) * 12)) / iMax;
                int iOrdinal3 = aVar.ordinal();
                if (iOrdinal3 == 0) {
                    f2 = qx.n.c;
                } else {
                    if (iOrdinal3 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = qx.n.d;
                }
                float fMin = Math.min(f7, f2);
                if (fMin < 1.0f) {
                    fMin = 1.0f;
                }
                g00.k kVar = new g00.k(numValueOf, new y3.f(fMin));
                jVar2.n0(kVar);
                objN4 = kVar;
            }
            g00.k kVar2 = (g00.k) objN4;
            final int iIntValue = ((Number) kVar2.A).intValue();
            final float f8 = ((y3.f) kVar2.B).A;
            r rVarV = rVar.V(z1.c);
            k0.b bVar = new k0.b(iIntValue);
            float f9 = 16;
            p1 p1Var = new p1(f9, f4, f9, f5);
            h0.f fVarG = h0.i.g(8);
            h0.f fVarG2 = h0.i.g(12);
            boolean zE3 = jVar2.e(aVar.ordinal()) | ((i2 & 14) == 4) | jVar2.g(cVar) | ((i2 & 112) == 32) | jVar2.g(p2VarA) | jVar2.g(p2Var) | jVar2.e(iIntValue) | jVar2.d(f8);
            Object objN5 = jVar2.N();
            if (zE3 || objN5 == cVar2) {
                k kVar3 = new k() {
                    @Override
                    public final Object invoke(Object obj) {
                        k0.i LazyVerticalGrid = (k0.i) obj;
                        kotlin.jvm.internal.m.e(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        gm.a aVar2 = gm.a.A;
                        gm.a aVar3 = aVar;
                        o oVar = uiState;
                        k kVar4 = onAction;
                        if (aVar3 == aVar2) {
                            k0.i.p(LazyVerticalGrid, (String) null, new r9.e(6), new v1.c(new g(oVar, cVar, kVar4, p2VarA), -655937252, true), 5);
                            if (oVar.b() || (oVar.a && oVar.b)) {
                                k0.i.p(LazyVerticalGrid, (String) null, new r9.e(7), new v1.c(new az.j(20, oVar, p2Var, kVar4), 1486778487, true), 5);
                            }
                        }
                        boolean z2 = oVar.a;
                        float f11 = f8;
                        if (z2) {
                            k0.i.r(LazyVerticalGrid, iIntValue * 4, new v1.c(new kx.f(f11, 1), -1899516614, true));
                        }
                        u30.b bVar2 = oVar.e;
                        LazyVerticalGrid.q(((h00.b) bVar2).a(), new q0.w0(new r9.e(8), bVar2, 5), new as.r0(21, bVar2), new v1.c(new kx.g(bVar2, oVar, kVar4, f11, 1), -1117249557, true));
                        return b0.a;
                    }
                };
                jVar2.n0(kVar3);
                objN5 = kVar3;
            }
            jVar2 = jVar2;
            kh.n.i(bVar, rVarV, yVar, p1Var, fVarG, fVarG2, (d0.t0) null, false, (h1) null, (k) objN5, jVar2, i3 | 1769472, 0, 912);
        } else {
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k((Object) uiState, onAction, (Object) yVar, (Object) rVar, i, 16);
        }
    }

    public static final void j(String title, boolean z, r rVar, long j, j jVar, int i) {
        j jVar2;
        kotlin.jvm.internal.m.e(title, "title");
        j jVar3 = (g0) jVar;
        jVar3.e0(1451506856);
        int i2 = i | (jVar3.g(title) ? 4 : 2) | (jVar3.h(z) ? 32 : 16) | (jVar3.g(rVar) ? 256 : 128) | (jVar3.f(j) ? 2048 : 1024);
        if (jVar3.S(i2 & 1, (i2 & 1171) != 1170)) {
            jVar3.X();
            if ((i & 1) != 0 && !jVar3.A()) {
                jVar3.V();
            }
            jVar3.s();
            if (z) {
                jVar3.c0(110223475);
                v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, jVar3, 54);
                int iHashCode = Long.hashCode(((g0) jVar3).T);
                m1 m1VarM = jVar3.m();
                r rVarC = b2.a.c(rVar, jVar3);
                b3.i.c.getClass();
                b3.g gVar = b3.h.b;
                jVar3.g0();
                if (((g0) jVar3).S) {
                    jVar3.l(gVar);
                } else {
                    jVar3.q0();
                }
                q.I(v1VarA, jVar3, b3.h.f);
                q.I(m1VarM, jVar3, b3.h.e);
                q.I(Integer.valueOf(iHashCode), jVar3, b3.h.g);
                q.E(jVar3, b3.h.h);
                q.I(rVarC, jVar3, b3.h.d);
                jVar2 = jVar3;
                o3.a(y3.R(2131231389, jVar3, 0), (String) null, z1.m(b2.o.A, 24), dl.a.i, jVar2, 440, 0);
                f(title, null, j, jVar2, (i2 & 14) | ((i2 >> 3) & 896), 2);
                jVar2.r(true);
                jVar2.r(false);
            } else {
                jVar2 = jVar3;
                jVar2.c0(110738354);
                int i3 = i2 & 14;
                int i4 = i2 >> 3;
                f(title, rVar, j, jVar3, i3 | (i4 & 112) | (i4 & 896), 0);
                jVar2.r(false);
            }
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new e1.d(title, z, rVar, j, i);
        }
    }

    public static final void k(int i, y yVar, kk.c cVar, j jVar, o uiState, k onAction) {
        y yVar2;
        o oVar;
        k kVar;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        g0 g0Var = (g0) jVar;
        g0Var.e0(614289794);
        int i2 = (g0Var.g(uiState) ? 4 : 2) | i | (g0Var.i(cVar) ? 32 : 16) | (g0Var.g(yVar) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= g0Var.i(onAction) ? 2048 : 1024;
        }
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            int iOrdinal = ((gm.a) g0Var.k(dl.e.a)).ordinal();
            if (iOrdinal == 0) {
                g0Var.c0(1921982235);
                d((i2 & 14) | ((i2 >> 6) & 112) | (i2 & 896) | ((i2 << 6) & 7168), yVar, cVar, g0Var, uiState, onAction);
                yVar2 = yVar;
                oVar = uiState;
                kVar = onAction;
                g0Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw oi.k.r(g0Var, 1921980595, false);
                }
                g0Var.c0(1921989393);
                a(uiState, onAction, cVar, g0Var, ((i2 << 3) & 896) | (i2 & 14) | ((i2 >> 6) & 112));
                g0Var.r(false);
                yVar2 = yVar;
                oVar = uiState;
                kVar = onAction;
            }
        } else {
            yVar2 = yVar;
            oVar = uiState;
            kVar = onAction;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new f(oVar, cVar, yVar2, kVar, i);
        }
    }
}
