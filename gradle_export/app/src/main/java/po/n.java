package po;

import a10.h0;
import a40.z;
import android.content.res.Configuration;
import as.f0;
import b2.r;
import c3.o0;
import c3.o1;
import c4.c0;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g1.g6;
import g1.m6;
import g1.o3;
import g1.t4;
import g1.u4;
import g1.z6;
import h0.s;
import h0.t1;
import h0.v;
import h0.v1;
import h0.x1;
import h0.z1;
import hb.u;
import i2.b0;
import i2.t;
import i2.t0;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import l1.z0;
import m3.r0;
import qd.s0;
import tf.x;
import x.y;
import z.p1;
import z2.d0;
import z2.w0;

public abstract class n {
    public static final v1.c a = new v1.c(new lu.a(26), -576774767, false);
    public static final v1.c b = new v1.c(new ou.a(11), 316189574, false);
    public static final v1.c c = new v1.c(new ou.a(12), -1260013891, false);
    public static final v1.c d = new v1.c(new ny.a(7), 529482708, false);

    public static final void a(u30.b episodes, u00.k onEpisodeSelected, u00.k onDownloadClicked, u00.a onDismiss, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(episodes, "episodes");
        kotlin.jvm.internal.m.e(onEpisodeSelected, "onEpisodeSelected");
        kotlin.jvm.internal.m.e(onDownloadClicked, "onDownloadClicked");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(52362450);
        int i2 = (g0Var.g(episodes) ? 4 : 2) | i | (g0Var.i(onEpisodeSelected) ? 32 : 16) | (g0Var.i(onDownloadClicked) ? 256 : 128) | (g0Var.i(onDismiss) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            Configuration configuration = (Configuration) g0Var.k(o0.a);
            kotlin.jvm.internal.m.e(configuration, "configuration");
            if (configuration.smallestScreenWidthDp > 600) {
                g0Var.c0(856886941);
                j(episodes, onEpisodeSelected, onDownloadClicked, onDismiss, g0Var, i2 & 8190);
                g0Var.r(false);
            } else {
                g0Var.c0(857102174);
                k(episodes, onEpisodeSelected, onDownloadClicked, onDismiss, g0Var, i2 & 8190);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a(episodes, onEpisodeSelected, onDownloadClicked, onDismiss, i, 0);
        }
    }

    public static final void b(u30.b languages, boolean z, String str, u00.a onClick, u00.a onDismiss, u00.k onLanguageSelected, r rVar, boolean z2, jk.a aVar, l1.j jVar, int i, int i2) {
        int i3;
        boolean z3;
        r rVar2;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z5;
        l1.j jVar2;
        jk.a aVar2;
        r rVar3;
        boolean z6;
        r1 r1VarT;
        d dVar;
        r rVar4;
        r rVar5;
        boolean z7;
        jk.a aVar3;
        Iterator it;
        Object obj;
        lo.r rVar6;
        boolean z8;
        jk.a aVar4;
        boolean z9;
        h00.b bVar;
        boolean z11;
        y3.c cVar;
        Object objN;
        Object obj2;
        p2 p2Var;
        boolean zG;
        Object objN2;
        b3.g gVar;
        b3.f fVar;
        b3.f fVar2;
        b3.f fVar3;
        b3.e eVar;
        boolean z12;
        b3.f fVar4;
        i2.o0 o0Var;
        boolean z13;
        p2 p2Var2;
        l1.j jVar3;
        jk.a aVar5;
        boolean z14;
        r rVarN;
        boolean z15;
        boolean z16;
        int i9;
        r rVarN2;
        boolean z17;
        r rVarN3;
        float f;
        Object next;
        kotlin.jvm.internal.m.e(languages, "languages");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.e(onLanguageSelected, "onLanguageSelected");
        l1.j jVar4 = (g0) jVar;
        jVar4.e0(-302752411);
        if ((i & 6) == 0) {
            i3 = (jVar4.g(languages) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i3 |= jVar4.h(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i3 |= jVar4.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= jVar4.i(onClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= jVar4.i(onDismiss) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= jVar4.i(onLanguageSelected) ? 131072 : 65536;
        }
        int i11 = i2 & 64;
        if (i11 == 0) {
            if ((1572864 & i) == 0) {
                rVar2 = rVar;
                i3 |= jVar4.g(rVar2) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    z4 = z2;
                    if (jVar4.h(z4)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (jVar4.i(aVar)) {
                        i7 = 67108864;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 38347923) != 38347922) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (jVar4.S(i8 & 1, z5)) {
                    rVar4 = b2.o.A;
                    if (i11 != 0) {
                        rVar5 = rVar4;
                    } else {
                        rVar5 = rVar2;
                    }
                    if (i4 != 0) {
                        z7 = false;
                    } else {
                        z7 = z4;
                    }
                    if (i6 != 0) {
                        aVar3 = null;
                    } else {
                        aVar3 = aVar;
                    }
                    it = languages.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        }
                        next = it.next();
                        if (((lo.r) next).c) {
                            obj = next;
                            break;
                        }
                    }
                    rVar6 = (lo.r) obj;
                    if (rVar6 == null) {
                        r1VarT = jVar4.t();
                        if (r1VarT != null) {
                            return;
                        } else {
                            dVar = new d(languages, z3, str, onClick, onDismiss, onLanguageSelected, rVar5, z7, aVar3, i, i2, 0);
                        }
                    } else {
                        r rVar7 = rVar5;
                        z8 = z7;
                        aVar4 = aVar3;
                        if (str != null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        bVar = (h00.b) languages;
                        if (bVar.a() > 1 || z9) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        cVar = (y3.c) jVar4.k(o1.h);
                        objN = jVar4.N();
                        obj2 = l1.i.a;
                        if (objN == obj2) {
                            objN = x5.s(0, jVar4);
                        }
                        p2Var = (z0) objN;
                        zG = jVar4.g(cVar);
                        objN2 = jVar4.N();
                        if (zG || objN2 == obj2) {
                            objN2 = new f0(cVar, p2Var, 15);
                            jVar4.n0(objN2);
                        }
                        r rVarO = d0.o(rVar7, (u00.k) objN2);
                        w0 w0VarD = h0.o.d(b2.b.A, false);
                        int iHashCode = Long.hashCode(((g0) jVar4).T);
                        m1 m1VarM = jVar4.m();
                        r rVarC = b2.a.c(rVarO, jVar4);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        jVar4.g0();
                        if (((g0) jVar4).S) {
                            jVar4.l(gVar);
                        } else {
                            jVar4.q0();
                        }
                        fVar = b3.h.f;
                        q.I(w0VarD, jVar4, fVar);
                        fVar2 = b3.h.e;
                        q.I(m1VarM, jVar4, fVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        fVar3 = b3.h.g;
                        q.I(numValueOf, jVar4, fVar3);
                        eVar = b3.h.h;
                        q.E(jVar4, eVar);
                        z12 = z9;
                        fVar4 = b3.h.d;
                        q.I(rVarC, jVar4, fVar4);
                        o0Var = b0.b;
                        if (z8) {
                            jVar4.c0(641696212);
                            z17 = z11;
                            p2Var2 = p2Var;
                            r rVarF = z.n.f(f2.h.c(z1.m(rVar4, 36), p0.f.a), t.b(0.15f, t.c), o0Var);
                            if (z17) {
                                rVarN3 = w50.c.n(rVar4, true, onClick);
                            } else {
                                rVarN3 = rVar4;
                            }
                            r rVarV = rVarF.V(rVarN3);
                            if (bVar.a() > 1) {
                                f = 1.0f;
                            } else {
                                f = 0.4f;
                            }
                            r rVarA = f2.h.a(rVarV, f);
                            w0 w0VarD2 = h0.o.d(b2.b.E, false);
                            int iHashCode2 = Long.hashCode(((g0) jVar4).T);
                            m1 m1VarM2 = jVar4.m();
                            r rVarC2 = b2.a.c(rVarA, jVar4);
                            jVar4.g0();
                            if (((g0) jVar4).S) {
                                jVar4.l(gVar);
                            } else {
                                jVar4.q0();
                            }
                            q.I(w0VarD2, jVar4, fVar);
                            q.I(m1VarM2, jVar4, fVar2);
                            a1.b.v(iHashCode2, jVar4, fVar3, jVar4, eVar);
                            q.I(rVarC2, jVar4, fVar4);
                            jVar3 = jVar4;
                            o3.a(y3.R(2131231188, jVar4, 0), z3.U(jVar4, 2131886529), z1.m(rVar4, 20), dl.a.n, jVar3, 392, 0);
                            jVar3.r(true);
                            jVar3.r(false);
                            aVar5 = aVar4;
                            z14 = z12;
                            i9 = 0;
                            z15 = true;
                        } else {
                            z13 = z11;
                            p2Var2 = p2Var;
                            jVar3 = jVar4;
                            if (aVar4 != null) {
                                jVar3.c0(642491207);
                                p0.e eVar2 = p0.f.a;
                                r rVarC3 = f2.h.c(rVar4, eVar2);
                                if (z13) {
                                    rVarN2 = w50.c.n(rVar4, true, onClick);
                                } else {
                                    rVarN2 = rVar4;
                                }
                                z14 = z12;
                                w00.a.c(aVar4, eVar2, rVarC3.V(rVarN2), 0.0f, 0L, 0.0f, 0.0f, 0.0f, null, v1.d.d(-430688337, new c0.f(rVar6, languages, 17), jVar3), jVar3, ((i8 >> 24) & 14) | 805306368, 504);
                                aVar5 = aVar4;
                                jVar3 = jVar3;
                                jVar3.r(false);
                                i9 = 0;
                                z15 = true;
                            } else {
                                aVar5 = aVar4;
                                z14 = z12;
                                jVar3.c0(643422106);
                                r rVarS = z1.s(z1.g(rVar4, 36, 0.0f, 2), 60, 0.0f, 2);
                                p0.e eVar3 = p0.f.a;
                                r rVarC4 = f2.h.c(rVarS, eVar3);
                                long j = t.c;
                                r rVarG = z.n.g(z.n.f(rVarC4, t.b(0.15f, j), o0Var), 1, t.b(0.12f, j), eVar3);
                                if (z13) {
                                    rVarN = w50.c.n(rVar4, true, onClick);
                                } else {
                                    rVarN = rVar4;
                                }
                                r rVarE = h0.c.E(rVarG.V(rVarN), 12, 0.0f, 2);
                                b2.h hVar = b2.b.K;
                                h0.b bVar2 = h0.i.a;
                                v1 v1VarA = t1.a(h0.i.h(5, b2.b.N), hVar, jVar3, 54);
                                int iHashCode3 = Long.hashCode(((g0) jVar3).T);
                                m1 m1VarM3 = jVar3.m();
                                r rVarC5 = b2.a.c(rVarE, jVar3);
                                jVar3.g0();
                                if (((g0) jVar3).S) {
                                    jVar3.l(gVar);
                                } else {
                                    jVar3.q0();
                                }
                                q.I(v1VarA, jVar3, fVar);
                                q.I(m1VarM3, jVar3, fVar2);
                                a1.b.v(iHashCode3, jVar3, fVar3, jVar3, eVar);
                                q.I(rVarC5, jVar3, fVar4);
                                String str2 = rVar6.b;
                                z15 = true;
                                if (bVar.a() > 1) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                i9 = 0;
                                m(str2, z16, jVar3, 0);
                                jVar3.r(true);
                                jVar3.r(false);
                            }
                        }
                        float f2 = 200;
                        l1.j jVar5 = jVar3;
                        g1.m.a(z, onDismiss, z1.q(rVar4, f2), (((long) Float.floatToRawIntBits((((y3.f) p2Var2.getValue()).A - f2) / 2)) << 32) | (((long) Float.floatToRawIntBits(i9)) & 4294967295L), (p1) null, (c0) null, p0.f.a(16), dl.a.s, 0.0f, 0.0f, v1.d.d(-1108452336, new as.o0(languages, str, z14, onLanguageSelected), jVar3), jVar5, ((i8 >> 3) & 14) | 384 | ((i8 >> 9) & 112), 1840);
                        jVar2 = jVar5;
                        jVar2.r(true);
                        z6 = z8;
                        rVar3 = rVar7;
                        aVar2 = aVar5;
                    }
                    r1VarT.d = dVar;
                }
                jVar2 = jVar4;
                jVar2.V();
                aVar2 = aVar;
                rVar3 = rVar2;
                z6 = z4;
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    dVar = new d(languages, z, str, onClick, onDismiss, onLanguageSelected, rVar3, z6, aVar2, i, i2, 1);
                    r1VarT.d = dVar;
                }
            }
            i3 |= 12582912;
            z4 = z2;
            i6 = i2 & 256;
            if (i6 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (jVar4.i(aVar)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (jVar4.S(i8 & 1, z5)) {
                rVar4 = b2.o.A;
                if (i11 != 0) {
                    rVar5 = rVar4;
                } else {
                    rVar5 = rVar2;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i6 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                it = languages.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    next = it.next();
                    if (((lo.r) next).c) {
                        obj = next;
                        break;
                    }
                }
                rVar6 = (lo.r) obj;
                if (rVar6 == null) {
                    r1VarT = jVar4.t();
                    if (r1VarT != null) {
                        return;
                    } else {
                        dVar = new d(languages, z3, str, onClick, onDismiss, onLanguageSelected, rVar5, z7, aVar3, i, i2, 0);
                    }
                } else {
                    r rVar8 = rVar5;
                    z8 = z7;
                    aVar4 = aVar3;
                    if (str != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bVar = (h00.b) languages;
                    if (bVar.a() > 1) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    cVar = (y3.c) jVar4.k(o1.h);
                    objN = jVar4.N();
                    obj2 = l1.i.a;
                    if (objN == obj2) {
                        objN = x5.s(0, jVar4);
                    }
                    p2Var = (z0) objN;
                    zG = jVar4.g(cVar);
                    objN2 = jVar4.N();
                    if (zG) {
                        objN2 = new f0(cVar, p2Var, 15);
                        jVar4.n0(objN2);
                    } else {
                        objN2 = new f0(cVar, p2Var, 15);
                        jVar4.n0(objN2);
                    }
                    r rVarO2 = d0.o(rVar8, (u00.k) objN2);
                    w0 w0VarD3 = h0.o.d(b2.b.A, false);
                    int iHashCode4 = Long.hashCode(((g0) jVar4).T);
                    m1 m1VarM4 = jVar4.m();
                    r rVarC6 = b2.a.c(rVarO2, jVar4);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    jVar4.g0();
                    if (((g0) jVar4).S) {
                        jVar4.l(gVar);
                    } else {
                        jVar4.q0();
                    }
                    fVar = b3.h.f;
                    q.I(w0VarD3, jVar4, fVar);
                    fVar2 = b3.h.e;
                    q.I(m1VarM4, jVar4, fVar2);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    fVar3 = b3.h.g;
                    q.I(numValueOf2, jVar4, fVar3);
                    eVar = b3.h.h;
                    q.E(jVar4, eVar);
                    z12 = z9;
                    fVar4 = b3.h.d;
                    q.I(rVarC6, jVar4, fVar4);
                    o0Var = b0.b;
                    if (z8) {
                        jVar4.c0(641696212);
                        z17 = z11;
                        p2Var2 = p2Var;
                        r rVarF2 = z.n.f(f2.h.c(z1.m(rVar4, 36), p0.f.a), t.b(0.15f, t.c), o0Var);
                        if (z17) {
                            rVarN3 = w50.c.n(rVar4, true, onClick);
                        } else {
                            rVarN3 = rVar4;
                        }
                        r rVarV2 = rVarF2.V(rVarN3);
                        if (bVar.a() > 1) {
                            f = 1.0f;
                        } else {
                            f = 0.4f;
                        }
                        r rVarA2 = f2.h.a(rVarV2, f);
                        w0 w0VarD4 = h0.o.d(b2.b.E, false);
                        int iHashCode5 = Long.hashCode(((g0) jVar4).T);
                        m1 m1VarM5 = jVar4.m();
                        r rVarC7 = b2.a.c(rVarA2, jVar4);
                        jVar4.g0();
                        if (((g0) jVar4).S) {
                            jVar4.l(gVar);
                        } else {
                            jVar4.q0();
                        }
                        q.I(w0VarD4, jVar4, fVar);
                        q.I(m1VarM5, jVar4, fVar2);
                        a1.b.v(iHashCode5, jVar4, fVar3, jVar4, eVar);
                        q.I(rVarC7, jVar4, fVar4);
                        jVar3 = jVar4;
                        o3.a(y3.R(2131231188, jVar4, 0), z3.U(jVar4, 2131886529), z1.m(rVar4, 20), dl.a.n, jVar3, 392, 0);
                        jVar3.r(true);
                        jVar3.r(false);
                        aVar5 = aVar4;
                        z14 = z12;
                        i9 = 0;
                        z15 = true;
                    } else {
                        z13 = z11;
                        p2Var2 = p2Var;
                        jVar3 = jVar4;
                        if (aVar4 != null) {
                            jVar3.c0(642491207);
                            p0.e eVar4 = p0.f.a;
                            r rVarC8 = f2.h.c(rVar4, eVar4);
                            if (z13) {
                                rVarN2 = w50.c.n(rVar4, true, onClick);
                            } else {
                                rVarN2 = rVar4;
                            }
                            z14 = z12;
                            w00.a.c(aVar4, eVar4, rVarC8.V(rVarN2), 0.0f, 0L, 0.0f, 0.0f, 0.0f, null, v1.d.d(-430688337, new c0.f(rVar6, languages, 17), jVar3), jVar3, ((i8 >> 24) & 14) | 805306368, 504);
                            aVar5 = aVar4;
                            jVar3 = jVar3;
                            jVar3.r(false);
                            i9 = 0;
                            z15 = true;
                        } else {
                            aVar5 = aVar4;
                            z14 = z12;
                            jVar3.c0(643422106);
                            r rVarS2 = z1.s(z1.g(rVar4, 36, 0.0f, 2), 60, 0.0f, 2);
                            p0.e eVar5 = p0.f.a;
                            r rVarC9 = f2.h.c(rVarS2, eVar5);
                            long j2 = t.c;
                            r rVarG2 = z.n.g(z.n.f(rVarC9, t.b(0.15f, j2), o0Var), 1, t.b(0.12f, j2), eVar5);
                            if (z13) {
                                rVarN = w50.c.n(rVar4, true, onClick);
                            } else {
                                rVarN = rVar4;
                            }
                            r rVarE2 = h0.c.E(rVarG2.V(rVarN), 12, 0.0f, 2);
                            b2.h hVar2 = b2.b.K;
                            h0.b bVar3 = h0.i.a;
                            v1 v1VarA2 = t1.a(h0.i.h(5, b2.b.N), hVar2, jVar3, 54);
                            int iHashCode6 = Long.hashCode(((g0) jVar3).T);
                            m1 m1VarM6 = jVar3.m();
                            r rVarC10 = b2.a.c(rVarE2, jVar3);
                            jVar3.g0();
                            if (((g0) jVar3).S) {
                                jVar3.l(gVar);
                            } else {
                                jVar3.q0();
                            }
                            q.I(v1VarA2, jVar3, fVar);
                            q.I(m1VarM6, jVar3, fVar2);
                            a1.b.v(iHashCode6, jVar3, fVar3, jVar3, eVar);
                            q.I(rVarC10, jVar3, fVar4);
                            String str3 = rVar6.b;
                            z15 = true;
                            if (bVar.a() > 1) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            i9 = 0;
                            m(str3, z16, jVar3, 0);
                            jVar3.r(true);
                            jVar3.r(false);
                        }
                    }
                    float f3 = 200;
                    l1.j jVar6 = jVar3;
                    g1.m.a(z, onDismiss, z1.q(rVar4, f3), (((long) Float.floatToRawIntBits((((y3.f) p2Var2.getValue()).A - f3) / 2)) << 32) | (((long) Float.floatToRawIntBits(i9)) & 4294967295L), (p1) null, (c0) null, p0.f.a(16), dl.a.s, 0.0f, 0.0f, v1.d.d(-1108452336, new as.o0(languages, str, z14, onLanguageSelected), jVar3), jVar6, ((i8 >> 3) & 14) | 384 | ((i8 >> 9) & 112), 1840);
                    jVar2 = jVar6;
                    jVar2.r(true);
                    z6 = z8;
                    rVar3 = rVar8;
                    aVar2 = aVar5;
                }
                r1VarT.d = dVar;
            }
            jVar2 = jVar4;
            jVar2.V();
            aVar2 = aVar;
            rVar3 = rVar2;
            z6 = z4;
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                dVar = new d(languages, z, str, onClick, onDismiss, onLanguageSelected, rVar3, z6, aVar2, i, i2, 1);
                r1VarT.d = dVar;
            }
        }
        i3 |= 1572864;
        rVar2 = rVar;
        i4 = i2 & 128;
        if (i4 != 0) {
            if ((12582912 & i) == 0) {
                z4 = z2;
                if (jVar4.h(z4)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            i6 = i2 & 256;
            if (i6 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (jVar4.i(aVar)) {
                    i7 = 67108864;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 38347923) != 38347922) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (jVar4.S(i8 & 1, z5)) {
                rVar4 = b2.o.A;
                if (i11 != 0) {
                    rVar5 = rVar4;
                } else {
                    rVar5 = rVar2;
                }
                if (i4 != 0) {
                    z7 = false;
                } else {
                    z7 = z4;
                }
                if (i6 != 0) {
                    aVar3 = null;
                } else {
                    aVar3 = aVar;
                }
                it = languages.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = null;
                        break;
                    }
                    next = it.next();
                    if (((lo.r) next).c) {
                        obj = next;
                        break;
                    }
                }
                rVar6 = (lo.r) obj;
                if (rVar6 == null) {
                    r1VarT = jVar4.t();
                    if (r1VarT != null) {
                        return;
                    } else {
                        dVar = new d(languages, z3, str, onClick, onDismiss, onLanguageSelected, rVar5, z7, aVar3, i, i2, 0);
                    }
                } else {
                    r rVar9 = rVar5;
                    z8 = z7;
                    aVar4 = aVar3;
                    if (str != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bVar = (h00.b) languages;
                    if (bVar.a() > 1) {
                        z11 = false;
                    } else {
                        z11 = false;
                    }
                    cVar = (y3.c) jVar4.k(o1.h);
                    objN = jVar4.N();
                    obj2 = l1.i.a;
                    if (objN == obj2) {
                        objN = x5.s(0, jVar4);
                    }
                    p2Var = (z0) objN;
                    zG = jVar4.g(cVar);
                    objN2 = jVar4.N();
                    if (zG) {
                        objN2 = new f0(cVar, p2Var, 15);
                        jVar4.n0(objN2);
                    } else {
                        objN2 = new f0(cVar, p2Var, 15);
                        jVar4.n0(objN2);
                    }
                    r rVarO3 = d0.o(rVar9, (u00.k) objN2);
                    w0 w0VarD5 = h0.o.d(b2.b.A, false);
                    int iHashCode7 = Long.hashCode(((g0) jVar4).T);
                    m1 m1VarM7 = jVar4.m();
                    r rVarC11 = b2.a.c(rVarO3, jVar4);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    jVar4.g0();
                    if (((g0) jVar4).S) {
                        jVar4.l(gVar);
                    } else {
                        jVar4.q0();
                    }
                    fVar = b3.h.f;
                    q.I(w0VarD5, jVar4, fVar);
                    fVar2 = b3.h.e;
                    q.I(m1VarM7, jVar4, fVar2);
                    Integer numValueOf3 = Integer.valueOf(iHashCode7);
                    fVar3 = b3.h.g;
                    q.I(numValueOf3, jVar4, fVar3);
                    eVar = b3.h.h;
                    q.E(jVar4, eVar);
                    z12 = z9;
                    fVar4 = b3.h.d;
                    q.I(rVarC11, jVar4, fVar4);
                    o0Var = b0.b;
                    if (z8) {
                        jVar4.c0(641696212);
                        z17 = z11;
                        p2Var2 = p2Var;
                        r rVarF3 = z.n.f(f2.h.c(z1.m(rVar4, 36), p0.f.a), t.b(0.15f, t.c), o0Var);
                        if (z17) {
                            rVarN3 = w50.c.n(rVar4, true, onClick);
                        } else {
                            rVarN3 = rVar4;
                        }
                        r rVarV3 = rVarF3.V(rVarN3);
                        if (bVar.a() > 1) {
                            f = 1.0f;
                        } else {
                            f = 0.4f;
                        }
                        r rVarA3 = f2.h.a(rVarV3, f);
                        w0 w0VarD6 = h0.o.d(b2.b.E, false);
                        int iHashCode8 = Long.hashCode(((g0) jVar4).T);
                        m1 m1VarM8 = jVar4.m();
                        r rVarC12 = b2.a.c(rVarA3, jVar4);
                        jVar4.g0();
                        if (((g0) jVar4).S) {
                            jVar4.l(gVar);
                        } else {
                            jVar4.q0();
                        }
                        q.I(w0VarD6, jVar4, fVar);
                        q.I(m1VarM8, jVar4, fVar2);
                        a1.b.v(iHashCode8, jVar4, fVar3, jVar4, eVar);
                        q.I(rVarC12, jVar4, fVar4);
                        jVar3 = jVar4;
                        o3.a(y3.R(2131231188, jVar4, 0), z3.U(jVar4, 2131886529), z1.m(rVar4, 20), dl.a.n, jVar3, 392, 0);
                        jVar3.r(true);
                        jVar3.r(false);
                        aVar5 = aVar4;
                        z14 = z12;
                        i9 = 0;
                        z15 = true;
                    } else {
                        z13 = z11;
                        p2Var2 = p2Var;
                        jVar3 = jVar4;
                        if (aVar4 != null) {
                            jVar3.c0(642491207);
                            p0.e eVar6 = p0.f.a;
                            r rVarC13 = f2.h.c(rVar4, eVar6);
                            if (z13) {
                                rVarN2 = w50.c.n(rVar4, true, onClick);
                            } else {
                                rVarN2 = rVar4;
                            }
                            z14 = z12;
                            w00.a.c(aVar4, eVar6, rVarC13.V(rVarN2), 0.0f, 0L, 0.0f, 0.0f, 0.0f, null, v1.d.d(-430688337, new c0.f(rVar6, languages, 17), jVar3), jVar3, ((i8 >> 24) & 14) | 805306368, 504);
                            aVar5 = aVar4;
                            jVar3 = jVar3;
                            jVar3.r(false);
                            i9 = 0;
                            z15 = true;
                        } else {
                            aVar5 = aVar4;
                            z14 = z12;
                            jVar3.c0(643422106);
                            r rVarS3 = z1.s(z1.g(rVar4, 36, 0.0f, 2), 60, 0.0f, 2);
                            p0.e eVar7 = p0.f.a;
                            r rVarC14 = f2.h.c(rVarS3, eVar7);
                            long j3 = t.c;
                            r rVarG3 = z.n.g(z.n.f(rVarC14, t.b(0.15f, j3), o0Var), 1, t.b(0.12f, j3), eVar7);
                            if (z13) {
                                rVarN = w50.c.n(rVar4, true, onClick);
                            } else {
                                rVarN = rVar4;
                            }
                            r rVarE3 = h0.c.E(rVarG3.V(rVarN), 12, 0.0f, 2);
                            b2.h hVar3 = b2.b.K;
                            h0.b bVar4 = h0.i.a;
                            v1 v1VarA3 = t1.a(h0.i.h(5, b2.b.N), hVar3, jVar3, 54);
                            int iHashCode9 = Long.hashCode(((g0) jVar3).T);
                            m1 m1VarM9 = jVar3.m();
                            r rVarC15 = b2.a.c(rVarE3, jVar3);
                            jVar3.g0();
                            if (((g0) jVar3).S) {
                                jVar3.l(gVar);
                            } else {
                                jVar3.q0();
                            }
                            q.I(v1VarA3, jVar3, fVar);
                            q.I(m1VarM9, jVar3, fVar2);
                            a1.b.v(iHashCode9, jVar3, fVar3, jVar3, eVar);
                            q.I(rVarC15, jVar3, fVar4);
                            String str4 = rVar6.b;
                            z15 = true;
                            if (bVar.a() > 1) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            i9 = 0;
                            m(str4, z16, jVar3, 0);
                            jVar3.r(true);
                            jVar3.r(false);
                        }
                    }
                    float f4 = 200;
                    l1.j jVar7 = jVar3;
                    g1.m.a(z, onDismiss, z1.q(rVar4, f4), (((long) Float.floatToRawIntBits((((y3.f) p2Var2.getValue()).A - f4) / 2)) << 32) | (((long) Float.floatToRawIntBits(i9)) & 4294967295L), (p1) null, (c0) null, p0.f.a(16), dl.a.s, 0.0f, 0.0f, v1.d.d(-1108452336, new as.o0(languages, str, z14, onLanguageSelected), jVar3), jVar7, ((i8 >> 3) & 14) | 384 | ((i8 >> 9) & 112), 1840);
                    jVar2 = jVar7;
                    jVar2.r(true);
                    z6 = z8;
                    rVar3 = rVar9;
                    aVar2 = aVar5;
                }
                r1VarT.d = dVar;
            }
            jVar2 = jVar4;
            jVar2.V();
            aVar2 = aVar;
            rVar3 = rVar2;
            z6 = z4;
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                dVar = new d(languages, z, str, onClick, onDismiss, onLanguageSelected, rVar3, z6, aVar2, i, i2, 1);
                r1VarT.d = dVar;
            }
        }
        i3 |= 12582912;
        z4 = z2;
        i6 = i2 & 256;
        if (i6 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (jVar4.i(aVar)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        i8 = i3;
        if ((i8 & 38347923) != 38347922) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (jVar4.S(i8 & 1, z5)) {
            rVar4 = b2.o.A;
            if (i11 != 0) {
                rVar5 = rVar4;
            } else {
                rVar5 = rVar2;
            }
            if (i4 != 0) {
                z7 = false;
            } else {
                z7 = z4;
            }
            if (i6 != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar;
            }
            it = languages.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = null;
                    break;
                }
                next = it.next();
                if (((lo.r) next).c) {
                    obj = next;
                    break;
                }
            }
            rVar6 = (lo.r) obj;
            if (rVar6 == null) {
                r1VarT = jVar4.t();
                if (r1VarT != null) {
                    return;
                } else {
                    dVar = new d(languages, z3, str, onClick, onDismiss, onLanguageSelected, rVar5, z7, aVar3, i, i2, 0);
                }
            } else {
                r rVar10 = rVar5;
                z8 = z7;
                aVar4 = aVar3;
                if (str != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                bVar = (h00.b) languages;
                if (bVar.a() > 1) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                cVar = (y3.c) jVar4.k(o1.h);
                objN = jVar4.N();
                obj2 = l1.i.a;
                if (objN == obj2) {
                    objN = x5.s(0, jVar4);
                }
                p2Var = (z0) objN;
                zG = jVar4.g(cVar);
                objN2 = jVar4.N();
                if (zG) {
                    objN2 = new f0(cVar, p2Var, 15);
                    jVar4.n0(objN2);
                } else {
                    objN2 = new f0(cVar, p2Var, 15);
                    jVar4.n0(objN2);
                }
                r rVarO4 = d0.o(rVar10, (u00.k) objN2);
                w0 w0VarD7 = h0.o.d(b2.b.A, false);
                int iHashCode10 = Long.hashCode(((g0) jVar4).T);
                m1 m1VarM10 = jVar4.m();
                r rVarC16 = b2.a.c(rVarO4, jVar4);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar4.g0();
                if (((g0) jVar4).S) {
                    jVar4.l(gVar);
                } else {
                    jVar4.q0();
                }
                fVar = b3.h.f;
                q.I(w0VarD7, jVar4, fVar);
                fVar2 = b3.h.e;
                q.I(m1VarM10, jVar4, fVar2);
                Integer numValueOf4 = Integer.valueOf(iHashCode10);
                fVar3 = b3.h.g;
                q.I(numValueOf4, jVar4, fVar3);
                eVar = b3.h.h;
                q.E(jVar4, eVar);
                z12 = z9;
                fVar4 = b3.h.d;
                q.I(rVarC16, jVar4, fVar4);
                o0Var = b0.b;
                if (z8) {
                    jVar4.c0(641696212);
                    z17 = z11;
                    p2Var2 = p2Var;
                    r rVarF4 = z.n.f(f2.h.c(z1.m(rVar4, 36), p0.f.a), t.b(0.15f, t.c), o0Var);
                    if (z17) {
                        rVarN3 = w50.c.n(rVar4, true, onClick);
                    } else {
                        rVarN3 = rVar4;
                    }
                    r rVarV4 = rVarF4.V(rVarN3);
                    if (bVar.a() > 1) {
                        f = 1.0f;
                    } else {
                        f = 0.4f;
                    }
                    r rVarA4 = f2.h.a(rVarV4, f);
                    w0 w0VarD8 = h0.o.d(b2.b.E, false);
                    int iHashCode11 = Long.hashCode(((g0) jVar4).T);
                    m1 m1VarM11 = jVar4.m();
                    r rVarC17 = b2.a.c(rVarA4, jVar4);
                    jVar4.g0();
                    if (((g0) jVar4).S) {
                        jVar4.l(gVar);
                    } else {
                        jVar4.q0();
                    }
                    q.I(w0VarD8, jVar4, fVar);
                    q.I(m1VarM11, jVar4, fVar2);
                    a1.b.v(iHashCode11, jVar4, fVar3, jVar4, eVar);
                    q.I(rVarC17, jVar4, fVar4);
                    jVar3 = jVar4;
                    o3.a(y3.R(2131231188, jVar4, 0), z3.U(jVar4, 2131886529), z1.m(rVar4, 20), dl.a.n, jVar3, 392, 0);
                    jVar3.r(true);
                    jVar3.r(false);
                    aVar5 = aVar4;
                    z14 = z12;
                    i9 = 0;
                    z15 = true;
                } else {
                    z13 = z11;
                    p2Var2 = p2Var;
                    jVar3 = jVar4;
                    if (aVar4 != null) {
                        jVar3.c0(642491207);
                        p0.e eVar8 = p0.f.a;
                        r rVarC18 = f2.h.c(rVar4, eVar8);
                        if (z13) {
                            rVarN2 = w50.c.n(rVar4, true, onClick);
                        } else {
                            rVarN2 = rVar4;
                        }
                        z14 = z12;
                        w00.a.c(aVar4, eVar8, rVarC18.V(rVarN2), 0.0f, 0L, 0.0f, 0.0f, 0.0f, null, v1.d.d(-430688337, new c0.f(rVar6, languages, 17), jVar3), jVar3, ((i8 >> 24) & 14) | 805306368, 504);
                        aVar5 = aVar4;
                        jVar3 = jVar3;
                        jVar3.r(false);
                        i9 = 0;
                        z15 = true;
                    } else {
                        aVar5 = aVar4;
                        z14 = z12;
                        jVar3.c0(643422106);
                        r rVarS4 = z1.s(z1.g(rVar4, 36, 0.0f, 2), 60, 0.0f, 2);
                        p0.e eVar9 = p0.f.a;
                        r rVarC19 = f2.h.c(rVarS4, eVar9);
                        long j4 = t.c;
                        r rVarG4 = z.n.g(z.n.f(rVarC19, t.b(0.15f, j4), o0Var), 1, t.b(0.12f, j4), eVar9);
                        if (z13) {
                            rVarN = w50.c.n(rVar4, true, onClick);
                        } else {
                            rVarN = rVar4;
                        }
                        r rVarE4 = h0.c.E(rVarG4.V(rVarN), 12, 0.0f, 2);
                        b2.h hVar4 = b2.b.K;
                        h0.b bVar5 = h0.i.a;
                        v1 v1VarA4 = t1.a(h0.i.h(5, b2.b.N), hVar4, jVar3, 54);
                        int iHashCode12 = Long.hashCode(((g0) jVar3).T);
                        m1 m1VarM12 = jVar3.m();
                        r rVarC110 = b2.a.c(rVarE4, jVar3);
                        jVar3.g0();
                        if (((g0) jVar3).S) {
                            jVar3.l(gVar);
                        } else {
                            jVar3.q0();
                        }
                        q.I(v1VarA4, jVar3, fVar);
                        q.I(m1VarM12, jVar3, fVar2);
                        a1.b.v(iHashCode12, jVar3, fVar3, jVar3, eVar);
                        q.I(rVarC110, jVar3, fVar4);
                        String str5 = rVar6.b;
                        z15 = true;
                        if (bVar.a() > 1) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        i9 = 0;
                        m(str5, z16, jVar3, 0);
                        jVar3.r(true);
                        jVar3.r(false);
                    }
                }
                float f5 = 200;
                l1.j jVar8 = jVar3;
                g1.m.a(z, onDismiss, z1.q(rVar4, f5), (((long) Float.floatToRawIntBits((((y3.f) p2Var2.getValue()).A - f5) / 2)) << 32) | (((long) Float.floatToRawIntBits(i9)) & 4294967295L), (p1) null, (c0) null, p0.f.a(16), dl.a.s, 0.0f, 0.0f, v1.d.d(-1108452336, new as.o0(languages, str, z14, onLanguageSelected), jVar3), jVar8, ((i8 >> 3) & 14) | 384 | ((i8 >> 9) & 112), 1840);
                jVar2 = jVar8;
                jVar2.r(true);
                z6 = z8;
                rVar3 = rVar10;
                aVar2 = aVar5;
            }
            r1VarT.d = dVar;
        }
        jVar2 = jVar4;
        jVar2.V();
        aVar2 = aVar;
        rVar3 = rVar2;
        z6 = z4;
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            dVar = new d(languages, z, str, onClick, onDismiss, onLanguageSelected, rVar3, z6, aVar2, i, i2, 1);
            r1VarT.d = dVar;
        }
    }

    public static final void c(final boolean z, final float f, final ru.d sleepTimer, final boolean z2, final boolean z3, final u00.a onSpeedClicked, final u00.k onSpeedSelected, final u00.a onSkipBackClicked, final u00.a onPlayPauseClicked, final u00.a onSkipForwardClicked, final u00.a onSleepTimerClicked, final u00.k onSleepTimerSelected, final u00.a onMenuDismissed, r rVar, boolean z4, boolean z5, u00.a aVar, u00.a aVar2, l1.j jVar, final int i, final int i2, final int i3) {
        int i4;
        boolean z6;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z7;
        final r rVar2;
        final boolean z8;
        final u00.a aVar3;
        final u00.a aVar4;
        final boolean z9;
        r1 r1VarT;
        boolean z11;
        boolean z12;
        Object obj;
        u00.a aVar5;
        u00.a aVar6;
        int i11;
        boolean z13;
        boolean z14;
        Object objN;
        boolean z15;
        float f2;
        boolean z16;
        p2 p2VarB;
        boolean z17;
        boolean z18;
        r rVarJ;
        r rVar3;
        boolean z19;
        u00.a aVar7;
        b3.g gVar;
        float f3;
        long j;
        int i12;
        r rVar4;
        int i13;
        int i14;
        r rVar5;
        int i15;
        boolean z21;
        boolean z22;
        boolean z23;
        Object objN2;
        Object obj2;
        u00.a aVar8;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objN3;
        u00.a aVar9;
        Object objN4;
        Object objN5;
        kotlin.jvm.internal.m.e(sleepTimer, "sleepTimer");
        kotlin.jvm.internal.m.e(onSpeedClicked, "onSpeedClicked");
        kotlin.jvm.internal.m.e(onSpeedSelected, "onSpeedSelected");
        kotlin.jvm.internal.m.e(onSkipBackClicked, "onSkipBackClicked");
        kotlin.jvm.internal.m.e(onPlayPauseClicked, "onPlayPauseClicked");
        kotlin.jvm.internal.m.e(onSkipForwardClicked, "onSkipForwardClicked");
        kotlin.jvm.internal.m.e(onSleepTimerClicked, "onSleepTimerClicked");
        kotlin.jvm.internal.m.e(onSleepTimerSelected, "onSleepTimerSelected");
        kotlin.jvm.internal.m.e(onMenuDismissed, "onMenuDismissed");
        g0 g0Var = (g0) jVar;
        g0Var.e0(556621508);
        int i16 = (g0Var.e(sleepTimer.ordinal()) ? 256 : 128) | i | (g0Var.h(z) ? 4 : 2) | (g0Var.d(f) ? 32 : 16) | (g0Var.h(z2) ? 2048 : 1024) | (g0Var.h(z3) ? 16384 : 8192) | (g0Var.i(onSpeedClicked) ? 131072 : 65536) | (g0Var.i(onSpeedSelected) ? 1048576 : 524288) | (g0Var.i(onSkipBackClicked) ? 8388608 : 4194304) | (g0Var.i(onPlayPauseClicked) ? 67108864 : 33554432) | (g0Var.i(onSkipForwardClicked) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i4 = i2 | (g0Var.i(onSleepTimerClicked) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= g0Var.i(onSleepTimerSelected) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= g0Var.i(onMenuDismissed) ? 256 : 128;
        }
        int i17 = i4;
        int i18 = i17 | 3072;
        int i19 = i3 & 16384;
        if (i19 == 0) {
            if ((i2 & 24576) == 0) {
                z6 = z4;
                i18 |= g0Var.h(z6) ? 16384 : 8192;
            }
            i5 = i3 & 32768;
            if (i5 != 0) {
                if ((i2 & 196608) == 0) {
                    if (g0Var.h(z5)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i18 |= i6;
                }
                i7 = i3 & 65536;
                if (i7 != 0) {
                    i18 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i18 |= g0Var.i(aVar) ? 1048576 : 524288;
                }
                i8 = i3 & 131072;
                if (i8 != 0) {
                    i18 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i18 |= g0Var.i(aVar2) ? 8388608 : 4194304;
                }
                i9 = i18;
                if ((i16 & 306783379) == 306783378 || (4793491 & i9) != 4793490) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (g0Var.S(i16 & 1, z7)) {
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z6;
                    }
                    if (i5 != 0) {
                        z12 = false;
                    } else {
                        z12 = z5;
                    }
                    obj = l1.i.a;
                    if (i7 != 0) {
                        objN5 = g0Var.N();
                        if (objN5 == obj) {
                            objN5 = new a2.f(24);
                            g0Var.n0(objN5);
                        }
                        aVar5 = (u00.a) objN5;
                    } else {
                        z11 = z11;
                        aVar5 = aVar;
                    }
                    if (i8 != 0) {
                        objN4 = g0Var.N();
                        if (objN4 == obj) {
                            objN4 = new a2.f(24);
                            g0Var.n0(objN4);
                        }
                        aVar6 = (u00.a) objN4;
                    } else {
                        aVar5 = aVar5;
                        aVar6 = aVar2;
                    }
                    i11 = i16 & 112;
                    z13 = z12;
                    if (i11 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objN = g0Var.N();
                    if (z14 || objN == obj) {
                        yu.f.B.getClass();
                        objN = x.a(f).a();
                        g0Var.n0(objN);
                    }
                    String str = (String) objN;
                    if (f == 1.0f) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z27 = !z15;
                    if (z15) {
                        f2 = 0.7f;
                    } else {
                        f2 = 1.0f;
                    }
                    p2 p2VarB2 = x.d.b(f2, (y) null, (String) null, g0Var, 0, 30);
                    if (sleepTimer != ru.d.OFF) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    p2VarB = x.d.b(z16 ? 1.0f : 0.7f, (y) null, (String) null, g0Var, 0, 30);
                    z17 = z16;
                    if (g0Var.k(o1.n) == y3.m.B) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    rVarJ = h0.c.j(-8);
                    rVar3 = b2.o.A;
                    z19 = z18;
                    r rVarD = z1.d(rVar3, 1.0f);
                    aVar7 = aVar6;
                    v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    r rVarC = b2.a.c(rVarD, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    b3.f fVar = b3.h.f;
                    q.I(v1VarA, g0Var, fVar);
                    b3.f fVar2 = b3.h.e;
                    q.I(m1VarM, g0Var, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.g;
                    q.I(numValueOf, g0Var, fVar3);
                    b3.e eVar = b3.h.h;
                    q.E(g0Var, eVar);
                    b3.f fVar4 = b3.h.d;
                    q.I(rVarC, g0Var, fVar4);
                    f3 = 44;
                    r rVarS = z1.s(rVar3, f3, 0.0f, 2);
                    b2.i iVar = b2.b.E;
                    w0 w0VarD = h0.o.d(iVar, false);
                    int iHashCode2 = Long.hashCode(g0Var.T);
                    m1 m1VarM2 = g0Var.m();
                    r rVarC2 = b2.a.c(rVarS, g0Var);
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
                    j = dl.a.i;
                    gv.p.j(str, t.b(((Number) p2VarB2.getValue()).floatValue(), j), z27, onSpeedClicked, null, kh.o.z(15), g0Var, ((i16 >> 6) & 7168) | 196608);
                    int i21 = i16 >> 9;
                    i12 = i9 & 896;
                    gv.p.m(z2, f, onMenuDismissed, onSpeedSelected, g0Var, (i21 & 7168) | (i21 & 14) | i11 | i12);
                    g0Var.r(true);
                    x1 x1Var = x1.a;
                    h0.c.h(x1Var.a(rVar3), g0Var);
                    String strU = z3.U(g0Var, 2131886764);
                    if (z19) {
                        rVar4 = rVarJ;
                    } else {
                        rVar4 = rVar3;
                    }
                    int i22 = i16 >> 12;
                    to.m.a(2131231377, false, strU, onSkipBackClicked, rVar4, 0.0f, 0.0f, 0L, g0Var, (i22 & 7168) | 48, 224);
                    h0.c.h(x1Var.a(rVar3), g0Var);
                    if (z) {
                        i13 = 2131231354;
                    } else {
                        i13 = 2131231358;
                    }
                    if (z) {
                        i14 = 2131886141;
                    } else {
                        i14 = 2131886151;
                    }
                    int i23 = i16 >> 18;
                    g(i13, z3.U(g0Var, i14), onPlayPauseClicked, 64, 36, g0Var, (i23 & 896) | 27648);
                    h0.c.h(x1Var.a(rVar3), g0Var);
                    String strU2 = z3.U(g0Var, 2131886766);
                    if (z19) {
                        rVar5 = rVar3;
                    } else {
                        rVar5 = rVarJ;
                    }
                    to.m.a(2131231379, true, strU2, onSkipForwardClicked, rVar5, 0.0f, 0.0f, 0L, g0Var, (i23 & 7168) | 48, 224);
                    h0.c.h(x1Var.a(rVar3), g0Var);
                    r rVarS2 = z1.s(rVar3, f3, 0.0f, 2);
                    w0 w0VarD2 = h0.o.d(iVar, false);
                    int iHashCode3 = Long.hashCode(g0Var.T);
                    m1 m1VarM3 = g0Var.m();
                    r rVarC3 = b2.a.c(rVarS2, g0Var);
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    q.I(w0VarD2, g0Var, fVar);
                    q.I(m1VarM3, g0Var, fVar2);
                    a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
                    q.I(rVarC3, g0Var, fVar4);
                    if (z11) {
                        g0Var.c0(967635705);
                        u00.a aVar10 = aVar5;
                        gv.p.i(y3.R(2131231396, g0Var, 0), t.b(((Number) p2VarB.getValue()).floatValue(), j), z17, aVar10, null, false, 20, f3, 0L, g0Var, 14155784 | ((i9 >> 9) & 7168), RCHTTPStatusCodes.NOT_MODIFIED);
                        aVar5 = aVar10;
                        i15 = i12;
                        if (i15 == 256) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if ((i9 & 14) == 4) {
                            z22 = true;
                        } else {
                            z22 = false;
                        }
                        z23 = z22 | z21;
                        objN2 = g0Var.N();
                        if (z23) {
                            obj2 = obj;
                        } else {
                            obj2 = obj;
                            if (objN2 == obj2) {
                                aVar8 = onMenuDismissed;
                            }
                            u00.a aVar11 = (u00.a) objN2;
                            if (i15 == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if ((i9 & 29360128) == 8388608) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            z26 = z25 | z24;
                            objN3 = g0Var.N();
                            if (!z26 || objN3 == obj2) {
                                aVar9 = aVar7;
                                objN3 = new e(aVar8, aVar9, 1);
                                g0Var.n0(objN3);
                            } else {
                                aVar9 = aVar7;
                            }
                            gv.p.q(z13, onMenuDismissed, null, aVar11, false, (u00.a) objN3, g0Var, ((i9 >> 15) & 14) | 384 | ((i9 >> 3) & 112), 16);
                            g0Var.r(false);
                            g0Var = g0Var;
                            aVar7 = aVar9;
                        }
                        aVar8 = onMenuDismissed;
                        objN2 = new e(aVar8, onSleepTimerClicked, 0);
                        g0Var.n0(objN2);
                        u00.a aVar12 = (u00.a) objN2;
                        if (i15 == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if ((i9 & 29360128) == 8388608) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z25 | z24;
                        objN3 = g0Var.N();
                        if (z26) {
                            aVar9 = aVar7;
                            objN3 = new e(aVar8, aVar9, 1);
                            g0Var.n0(objN3);
                        } else {
                            aVar9 = aVar7;
                            objN3 = new e(aVar8, aVar9, 1);
                            g0Var.n0(objN3);
                        }
                        gv.p.q(z13, onMenuDismissed, null, aVar12, false, (u00.a) objN3, g0Var, ((i9 >> 15) & 14) | 384 | ((i9 >> 3) & 112), 16);
                        g0Var.r(false);
                        g0Var = g0Var;
                        aVar7 = aVar9;
                    } else {
                        i15 = i12;
                        g0Var.c0(968598782);
                        gv.p.i(y3.R(2131231392, g0Var, 0), t.b(((Number) p2VarB.getValue()).floatValue(), j), z17, onSleepTimerClicked, null, false, 20, f3, 0L, g0Var, 14155784 | ((i9 << 9) & 7168), RCHTTPStatusCodes.NOT_MODIFIED);
                        g0Var = g0Var;
                        g0Var.r(false);
                    }
                    ru.d.B.getClass();
                    gv.p.x(z3, sleepTimer, onMenuDismissed, onSleepTimerSelected, 2131886149, ru.d.D, g0Var, (i22 & 14) | ((i16 >> 3) & 112) | i15 | ((i9 << 6) & 7168), 0);
                    g0Var.r(true);
                    g0Var.r(true);
                    rVar2 = rVar3;
                    aVar3 = aVar5;
                    z9 = z11;
                    z8 = z13;
                    aVar4 = aVar7;
                } else {
                    g0Var.V();
                    rVar2 = rVar;
                    z8 = z5;
                    aVar3 = aVar;
                    aVar4 = aVar2;
                    z9 = z6;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n(z, f, sleepTimer, z2, z3, onSpeedClicked, onSpeedSelected, onSkipBackClicked, onPlayPauseClicked, onSkipForwardClicked, onSleepTimerClicked, onSleepTimerSelected, onMenuDismissed, rVar2, z9, z8, aVar3, aVar4, i, i2, i3) {
                        public final boolean A;
                        public final float B;
                        public final ru.d C;
                        public final boolean D;
                        public final boolean E;
                        public final u00.a F;
                        public final u00.k G;
                        public final u00.a H;
                        public final u00.a I;
                        public final u00.a J;
                        public final u00.a K;
                        public final u00.k L;
                        public final u00.a M;
                        public final r N;
                        public final boolean O;
                        public final boolean P;
                        public final u00.a Q;
                        public final u00.a R;
                        public final int S;
                        public final int T;

                        {
                            this.S = i2;
                            this.T = i3;
                        }

                        @Override
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iK = q.K(1);
                            int iK2 = q.K(this.S);
                            n.c(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (l1.j) obj3, iK, iK2, this.T);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i18 |= 196608;
            i7 = i3 & 65536;
            if (i7 != 0) {
                i18 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i18 |= g0Var.i(aVar) ? 1048576 : 524288;
            }
            i8 = i3 & 131072;
            if (i8 != 0) {
                i18 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i18 |= g0Var.i(aVar2) ? 8388608 : 4194304;
            }
            i9 = i18;
            if ((i16 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (g0Var.S(i16 & 1, z7)) {
                if (i19 != 0) {
                    z11 = false;
                } else {
                    z11 = z6;
                }
                if (i5 != 0) {
                    z12 = false;
                } else {
                    z12 = z5;
                }
                obj = l1.i.a;
                if (i7 != 0) {
                    objN5 = g0Var.N();
                    if (objN5 == obj) {
                        objN5 = new a2.f(24);
                        g0Var.n0(objN5);
                    }
                    aVar5 = (u00.a) objN5;
                } else {
                    z11 = z11;
                    aVar5 = aVar;
                }
                if (i8 != 0) {
                    objN4 = g0Var.N();
                    if (objN4 == obj) {
                        objN4 = new a2.f(24);
                        g0Var.n0(objN4);
                    }
                    aVar6 = (u00.a) objN4;
                } else {
                    aVar5 = aVar5;
                    aVar6 = aVar2;
                }
                i11 = i16 & 112;
                z13 = z12;
                if (i11 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objN = g0Var.N();
                if (z14) {
                    yu.f.B.getClass();
                    objN = x.a(f).a();
                    g0Var.n0(objN);
                } else {
                    yu.f.B.getClass();
                    objN = x.a(f).a();
                    g0Var.n0(objN);
                }
                String str2 = (String) objN;
                if (f == 1.0f) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z28 = !z15;
                if (z15) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.7f;
                }
                p2 p2VarB3 = x.d.b(f2, (y) null, (String) null, g0Var, 0, 30);
                if (sleepTimer != ru.d.OFF) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                p2VarB = x.d.b(z16 ? 1.0f : 0.7f, (y) null, (String) null, g0Var, 0, 30);
                z17 = z16;
                if (g0Var.k(o1.n) == y3.m.B) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                rVarJ = h0.c.j(-8);
                rVar3 = b2.o.A;
                z19 = z18;
                r rVarD2 = z1.d(rVar3, 1.0f);
                aVar7 = aVar6;
                v1 v1VarA2 = t1.a(h0.i.a, b2.b.K, g0Var, 48);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                r rVarC4 = b2.a.c(rVarD2, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
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
                b3.e eVar2 = b3.h.h;
                q.E(g0Var, eVar2);
                b3.f fVar8 = b3.h.d;
                q.I(rVarC4, g0Var, fVar8);
                f3 = 44;
                r rVarS3 = z1.s(rVar3, f3, 0.0f, 2);
                b2.i iVar2 = b2.b.E;
                w0 w0VarD3 = h0.o.d(iVar2, false);
                int iHashCode5 = Long.hashCode(g0Var.T);
                m1 m1VarM5 = g0Var.m();
                r rVarC5 = b2.a.c(rVarS3, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD3, g0Var, fVar5);
                q.I(m1VarM5, g0Var, fVar6);
                a1.b.v(iHashCode5, g0Var, fVar7, g0Var, eVar2);
                q.I(rVarC5, g0Var, fVar8);
                j = dl.a.i;
                gv.p.j(str2, t.b(((Number) p2VarB3.getValue()).floatValue(), j), z28, onSpeedClicked, null, kh.o.z(15), g0Var, ((i16 >> 6) & 7168) | 196608);
                int i24 = i16 >> 9;
                i12 = i9 & 896;
                gv.p.m(z2, f, onMenuDismissed, onSpeedSelected, g0Var, (i24 & 7168) | (i24 & 14) | i11 | i12);
                g0Var.r(true);
                x1 x1Var2 = x1.a;
                h0.c.h(x1Var2.a(rVar3), g0Var);
                String strU3 = z3.U(g0Var, 2131886764);
                if (z19) {
                    rVar4 = rVarJ;
                } else {
                    rVar4 = rVar3;
                }
                int i25 = i16 >> 12;
                to.m.a(2131231377, false, strU3, onSkipBackClicked, rVar4, 0.0f, 0.0f, 0L, g0Var, (i25 & 7168) | 48, 224);
                h0.c.h(x1Var2.a(rVar3), g0Var);
                if (z) {
                    i13 = 2131231354;
                } else {
                    i13 = 2131231358;
                }
                if (z) {
                    i14 = 2131886141;
                } else {
                    i14 = 2131886151;
                }
                int i26 = i16 >> 18;
                g(i13, z3.U(g0Var, i14), onPlayPauseClicked, 64, 36, g0Var, (i26 & 896) | 27648);
                h0.c.h(x1Var2.a(rVar3), g0Var);
                String strU4 = z3.U(g0Var, 2131886766);
                if (z19) {
                    rVar5 = rVar3;
                } else {
                    rVar5 = rVarJ;
                }
                to.m.a(2131231379, true, strU4, onSkipForwardClicked, rVar5, 0.0f, 0.0f, 0L, g0Var, (i26 & 7168) | 48, 224);
                h0.c.h(x1Var2.a(rVar3), g0Var);
                r rVarS4 = z1.s(rVar3, f3, 0.0f, 2);
                w0 w0VarD4 = h0.o.d(iVar2, false);
                int iHashCode6 = Long.hashCode(g0Var.T);
                m1 m1VarM6 = g0Var.m();
                r rVarC6 = b2.a.c(rVarS4, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD4, g0Var, fVar5);
                q.I(m1VarM6, g0Var, fVar6);
                a1.b.v(iHashCode6, g0Var, fVar7, g0Var, eVar2);
                q.I(rVarC6, g0Var, fVar8);
                if (z11) {
                    g0Var.c0(967635705);
                    u00.a aVar13 = aVar5;
                    gv.p.i(y3.R(2131231396, g0Var, 0), t.b(((Number) p2VarB.getValue()).floatValue(), j), z17, aVar13, null, false, 20, f3, 0L, g0Var, 14155784 | ((i9 >> 9) & 7168), RCHTTPStatusCodes.NOT_MODIFIED);
                    aVar5 = aVar13;
                    i15 = i12;
                    if (i15 == 256) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if ((i9 & 14) == 4) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z22 | z21;
                    objN2 = g0Var.N();
                    if (z23) {
                        obj2 = obj;
                        if (objN2 == obj2) {
                            aVar8 = onMenuDismissed;
                        }
                        u00.a aVar14 = (u00.a) objN2;
                        if (i15 == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if ((i9 & 29360128) == 8388608) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z25 | z24;
                        objN3 = g0Var.N();
                        if (z26) {
                            aVar9 = aVar7;
                            objN3 = new e(aVar8, aVar9, 1);
                            g0Var.n0(objN3);
                        } else {
                            aVar9 = aVar7;
                            objN3 = new e(aVar8, aVar9, 1);
                            g0Var.n0(objN3);
                        }
                        gv.p.q(z13, onMenuDismissed, null, aVar14, false, (u00.a) objN3, g0Var, ((i9 >> 15) & 14) | 384 | ((i9 >> 3) & 112), 16);
                        g0Var.r(false);
                        g0Var = g0Var;
                        aVar7 = aVar9;
                    } else {
                        obj2 = obj;
                    }
                    aVar8 = onMenuDismissed;
                    objN2 = new e(aVar8, onSleepTimerClicked, 0);
                    g0Var.n0(objN2);
                    u00.a aVar15 = (u00.a) objN2;
                    if (i15 == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i9 & 29360128) == 8388608) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z25 | z24;
                    objN3 = g0Var.N();
                    if (z26) {
                        aVar9 = aVar7;
                        objN3 = new e(aVar8, aVar9, 1);
                        g0Var.n0(objN3);
                    } else {
                        aVar9 = aVar7;
                        objN3 = new e(aVar8, aVar9, 1);
                        g0Var.n0(objN3);
                    }
                    gv.p.q(z13, onMenuDismissed, null, aVar15, false, (u00.a) objN3, g0Var, ((i9 >> 15) & 14) | 384 | ((i9 >> 3) & 112), 16);
                    g0Var.r(false);
                    g0Var = g0Var;
                    aVar7 = aVar9;
                } else {
                    i15 = i12;
                    g0Var.c0(968598782);
                    gv.p.i(y3.R(2131231392, g0Var, 0), t.b(((Number) p2VarB.getValue()).floatValue(), j), z17, onSleepTimerClicked, null, false, 20, f3, 0L, g0Var, 14155784 | ((i9 << 9) & 7168), RCHTTPStatusCodes.NOT_MODIFIED);
                    g0Var = g0Var;
                    g0Var.r(false);
                }
                ru.d.B.getClass();
                gv.p.x(z3, sleepTimer, onMenuDismissed, onSleepTimerSelected, 2131886149, ru.d.D, g0Var, (i25 & 14) | ((i16 >> 3) & 112) | i15 | ((i9 << 6) & 7168), 0);
                g0Var.r(true);
                g0Var.r(true);
                rVar2 = rVar3;
                aVar3 = aVar5;
                z9 = z11;
                z8 = z13;
                aVar4 = aVar7;
            } else {
                g0Var.V();
                rVar2 = rVar;
                z8 = z5;
                aVar3 = aVar;
                aVar4 = aVar2;
                z9 = z6;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n(z, f, sleepTimer, z2, z3, onSpeedClicked, onSpeedSelected, onSkipBackClicked, onPlayPauseClicked, onSkipForwardClicked, onSleepTimerClicked, onSleepTimerSelected, onMenuDismissed, rVar2, z9, z8, aVar3, aVar4, i, i2, i3) {
                    public final boolean A;
                    public final float B;
                    public final ru.d C;
                    public final boolean D;
                    public final boolean E;
                    public final u00.a F;
                    public final u00.k G;
                    public final u00.a H;
                    public final u00.a I;
                    public final u00.a J;
                    public final u00.a K;
                    public final u00.k L;
                    public final u00.a M;
                    public final r N;
                    public final boolean O;
                    public final boolean P;
                    public final u00.a Q;
                    public final u00.a R;
                    public final int S;
                    public final int T;

                    {
                        this.S = i2;
                        this.T = i3;
                    }

                    @Override
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iK = q.K(1);
                        int iK2 = q.K(this.S);
                        n.c(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (l1.j) obj3, iK, iK2, this.T);
                        return g00.b0.a;
                    }
                };
            }
        }
        i18 = i17 | 27648;
        z6 = z4;
        i5 = i3 & 32768;
        if (i5 != 0) {
            if ((i2 & 196608) == 0) {
                if (g0Var.h(z5)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i18 |= i6;
            }
            i7 = i3 & 65536;
            if (i7 != 0) {
                i18 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i18 |= g0Var.i(aVar) ? 1048576 : 524288;
            }
            i8 = i3 & 131072;
            if (i8 != 0) {
                i18 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                i18 |= g0Var.i(aVar2) ? 8388608 : 4194304;
            }
            i9 = i18;
            if ((i16 & 306783379) == 306783378) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (g0Var.S(i16 & 1, z7)) {
                if (i19 != 0) {
                    z11 = false;
                } else {
                    z11 = z6;
                }
                if (i5 != 0) {
                    z12 = false;
                } else {
                    z12 = z5;
                }
                obj = l1.i.a;
                if (i7 != 0) {
                    objN5 = g0Var.N();
                    if (objN5 == obj) {
                        objN5 = new a2.f(24);
                        g0Var.n0(objN5);
                    }
                    aVar5 = (u00.a) objN5;
                } else {
                    z11 = z11;
                    aVar5 = aVar;
                }
                if (i8 != 0) {
                    objN4 = g0Var.N();
                    if (objN4 == obj) {
                        objN4 = new a2.f(24);
                        g0Var.n0(objN4);
                    }
                    aVar6 = (u00.a) objN4;
                } else {
                    aVar5 = aVar5;
                    aVar6 = aVar2;
                }
                i11 = i16 & 112;
                z13 = z12;
                if (i11 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objN = g0Var.N();
                if (z14) {
                    yu.f.B.getClass();
                    objN = x.a(f).a();
                    g0Var.n0(objN);
                } else {
                    yu.f.B.getClass();
                    objN = x.a(f).a();
                    g0Var.n0(objN);
                }
                String str3 = (String) objN;
                if (f == 1.0f) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z29 = !z15;
                if (z15) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.7f;
                }
                p2 p2VarB4 = x.d.b(f2, (y) null, (String) null, g0Var, 0, 30);
                if (sleepTimer != ru.d.OFF) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                p2VarB = x.d.b(z16 ? 1.0f : 0.7f, (y) null, (String) null, g0Var, 0, 30);
                z17 = z16;
                if (g0Var.k(o1.n) == y3.m.B) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                rVarJ = h0.c.j(-8);
                rVar3 = b2.o.A;
                z19 = z18;
                r rVarD3 = z1.d(rVar3, 1.0f);
                aVar7 = aVar6;
                v1 v1VarA3 = t1.a(h0.i.a, b2.b.K, g0Var, 48);
                int iHashCode7 = Long.hashCode(g0Var.T);
                m1 m1VarM7 = g0Var.m();
                r rVarC7 = b2.a.c(rVarD3, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                b3.f fVar9 = b3.h.f;
                q.I(v1VarA3, g0Var, fVar9);
                b3.f fVar10 = b3.h.e;
                q.I(m1VarM7, g0Var, fVar10);
                Integer numValueOf3 = Integer.valueOf(iHashCode7);
                b3.f fVar11 = b3.h.g;
                q.I(numValueOf3, g0Var, fVar11);
                b3.e eVar3 = b3.h.h;
                q.E(g0Var, eVar3);
                b3.f fVar12 = b3.h.d;
                q.I(rVarC7, g0Var, fVar12);
                f3 = 44;
                r rVarS5 = z1.s(rVar3, f3, 0.0f, 2);
                b2.i iVar3 = b2.b.E;
                w0 w0VarD5 = h0.o.d(iVar3, false);
                int iHashCode8 = Long.hashCode(g0Var.T);
                m1 m1VarM8 = g0Var.m();
                r rVarC8 = b2.a.c(rVarS5, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD5, g0Var, fVar9);
                q.I(m1VarM8, g0Var, fVar10);
                a1.b.v(iHashCode8, g0Var, fVar11, g0Var, eVar3);
                q.I(rVarC8, g0Var, fVar12);
                j = dl.a.i;
                gv.p.j(str3, t.b(((Number) p2VarB4.getValue()).floatValue(), j), z29, onSpeedClicked, null, kh.o.z(15), g0Var, ((i16 >> 6) & 7168) | 196608);
                int i27 = i16 >> 9;
                i12 = i9 & 896;
                gv.p.m(z2, f, onMenuDismissed, onSpeedSelected, g0Var, (i27 & 7168) | (i27 & 14) | i11 | i12);
                g0Var.r(true);
                x1 x1Var3 = x1.a;
                h0.c.h(x1Var3.a(rVar3), g0Var);
                String strU5 = z3.U(g0Var, 2131886764);
                if (z19) {
                    rVar4 = rVarJ;
                } else {
                    rVar4 = rVar3;
                }
                int i28 = i16 >> 12;
                to.m.a(2131231377, false, strU5, onSkipBackClicked, rVar4, 0.0f, 0.0f, 0L, g0Var, (i28 & 7168) | 48, 224);
                h0.c.h(x1Var3.a(rVar3), g0Var);
                if (z) {
                    i13 = 2131231354;
                } else {
                    i13 = 2131231358;
                }
                if (z) {
                    i14 = 2131886141;
                } else {
                    i14 = 2131886151;
                }
                int i29 = i16 >> 18;
                g(i13, z3.U(g0Var, i14), onPlayPauseClicked, 64, 36, g0Var, (i29 & 896) | 27648);
                h0.c.h(x1Var3.a(rVar3), g0Var);
                String strU6 = z3.U(g0Var, 2131886766);
                if (z19) {
                    rVar5 = rVar3;
                } else {
                    rVar5 = rVarJ;
                }
                to.m.a(2131231379, true, strU6, onSkipForwardClicked, rVar5, 0.0f, 0.0f, 0L, g0Var, (i29 & 7168) | 48, 224);
                h0.c.h(x1Var3.a(rVar3), g0Var);
                r rVarS6 = z1.s(rVar3, f3, 0.0f, 2);
                w0 w0VarD6 = h0.o.d(iVar3, false);
                int iHashCode9 = Long.hashCode(g0Var.T);
                m1 m1VarM9 = g0Var.m();
                r rVarC9 = b2.a.c(rVarS6, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD6, g0Var, fVar9);
                q.I(m1VarM9, g0Var, fVar10);
                a1.b.v(iHashCode9, g0Var, fVar11, g0Var, eVar3);
                q.I(rVarC9, g0Var, fVar12);
                if (z11) {
                    g0Var.c0(967635705);
                    u00.a aVar16 = aVar5;
                    gv.p.i(y3.R(2131231396, g0Var, 0), t.b(((Number) p2VarB.getValue()).floatValue(), j), z17, aVar16, null, false, 20, f3, 0L, g0Var, 14155784 | ((i9 >> 9) & 7168), RCHTTPStatusCodes.NOT_MODIFIED);
                    aVar5 = aVar16;
                    i15 = i12;
                    if (i15 == 256) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if ((i9 & 14) == 4) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    z23 = z22 | z21;
                    objN2 = g0Var.N();
                    if (z23) {
                        obj2 = obj;
                        if (objN2 == obj2) {
                            aVar8 = onMenuDismissed;
                        }
                        u00.a aVar17 = (u00.a) objN2;
                        if (i15 == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if ((i9 & 29360128) == 8388608) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z25 | z24;
                        objN3 = g0Var.N();
                        if (z26) {
                            aVar9 = aVar7;
                            objN3 = new e(aVar8, aVar9, 1);
                            g0Var.n0(objN3);
                        } else {
                            aVar9 = aVar7;
                            objN3 = new e(aVar8, aVar9, 1);
                            g0Var.n0(objN3);
                        }
                        gv.p.q(z13, onMenuDismissed, null, aVar17, false, (u00.a) objN3, g0Var, ((i9 >> 15) & 14) | 384 | ((i9 >> 3) & 112), 16);
                        g0Var.r(false);
                        g0Var = g0Var;
                        aVar7 = aVar9;
                    } else {
                        obj2 = obj;
                    }
                    aVar8 = onMenuDismissed;
                    objN2 = new e(aVar8, onSleepTimerClicked, 0);
                    g0Var.n0(objN2);
                    u00.a aVar18 = (u00.a) objN2;
                    if (i15 == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i9 & 29360128) == 8388608) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z25 | z24;
                    objN3 = g0Var.N();
                    if (z26) {
                        aVar9 = aVar7;
                        objN3 = new e(aVar8, aVar9, 1);
                        g0Var.n0(objN3);
                    } else {
                        aVar9 = aVar7;
                        objN3 = new e(aVar8, aVar9, 1);
                        g0Var.n0(objN3);
                    }
                    gv.p.q(z13, onMenuDismissed, null, aVar18, false, (u00.a) objN3, g0Var, ((i9 >> 15) & 14) | 384 | ((i9 >> 3) & 112), 16);
                    g0Var.r(false);
                    g0Var = g0Var;
                    aVar7 = aVar9;
                } else {
                    i15 = i12;
                    g0Var.c0(968598782);
                    gv.p.i(y3.R(2131231392, g0Var, 0), t.b(((Number) p2VarB.getValue()).floatValue(), j), z17, onSleepTimerClicked, null, false, 20, f3, 0L, g0Var, 14155784 | ((i9 << 9) & 7168), RCHTTPStatusCodes.NOT_MODIFIED);
                    g0Var = g0Var;
                    g0Var.r(false);
                }
                ru.d.B.getClass();
                gv.p.x(z3, sleepTimer, onMenuDismissed, onSleepTimerSelected, 2131886149, ru.d.D, g0Var, (i28 & 14) | ((i16 >> 3) & 112) | i15 | ((i9 << 6) & 7168), 0);
                g0Var.r(true);
                g0Var.r(true);
                rVar2 = rVar3;
                aVar3 = aVar5;
                z9 = z11;
                z8 = z13;
                aVar4 = aVar7;
            } else {
                g0Var.V();
                rVar2 = rVar;
                z8 = z5;
                aVar3 = aVar;
                aVar4 = aVar2;
                z9 = z6;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n(z, f, sleepTimer, z2, z3, onSpeedClicked, onSpeedSelected, onSkipBackClicked, onPlayPauseClicked, onSkipForwardClicked, onSleepTimerClicked, onSleepTimerSelected, onMenuDismissed, rVar2, z9, z8, aVar3, aVar4, i, i2, i3) {
                    public final boolean A;
                    public final float B;
                    public final ru.d C;
                    public final boolean D;
                    public final boolean E;
                    public final u00.a F;
                    public final u00.k G;
                    public final u00.a H;
                    public final u00.a I;
                    public final u00.a J;
                    public final u00.a K;
                    public final u00.k L;
                    public final u00.a M;
                    public final r N;
                    public final boolean O;
                    public final boolean P;
                    public final u00.a Q;
                    public final u00.a R;
                    public final int S;
                    public final int T;

                    {
                        this.S = i2;
                        this.T = i3;
                    }

                    @Override
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iK = q.K(1);
                        int iK2 = q.K(this.S);
                        n.c(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (l1.j) obj3, iK, iK2, this.T);
                        return g00.b0.a;
                    }
                };
            }
        }
        i18 |= 196608;
        i7 = i3 & 65536;
        if (i7 != 0) {
            i18 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i18 |= g0Var.i(aVar) ? 1048576 : 524288;
        }
        i8 = i3 & 131072;
        if (i8 != 0) {
            i18 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i18 |= g0Var.i(aVar2) ? 8388608 : 4194304;
        }
        i9 = i18;
        if ((i16 & 306783379) == 306783378) {
            z7 = true;
        } else {
            z7 = true;
        }
        if (g0Var.S(i16 & 1, z7)) {
            if (i19 != 0) {
                z11 = false;
            } else {
                z11 = z6;
            }
            if (i5 != 0) {
                z12 = false;
            } else {
                z12 = z5;
            }
            obj = l1.i.a;
            if (i7 != 0) {
                objN5 = g0Var.N();
                if (objN5 == obj) {
                    objN5 = new a2.f(24);
                    g0Var.n0(objN5);
                }
                aVar5 = (u00.a) objN5;
            } else {
                z11 = z11;
                aVar5 = aVar;
            }
            if (i8 != 0) {
                objN4 = g0Var.N();
                if (objN4 == obj) {
                    objN4 = new a2.f(24);
                    g0Var.n0(objN4);
                }
                aVar6 = (u00.a) objN4;
            } else {
                aVar5 = aVar5;
                aVar6 = aVar2;
            }
            i11 = i16 & 112;
            z13 = z12;
            if (i11 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objN = g0Var.N();
            if (z14) {
                yu.f.B.getClass();
                objN = x.a(f).a();
                g0Var.n0(objN);
            } else {
                yu.f.B.getClass();
                objN = x.a(f).a();
                g0Var.n0(objN);
            }
            String str4 = (String) objN;
            if (f == 1.0f) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z210 = !z15;
            if (z15) {
                f2 = 1.0f;
            } else {
                f2 = 0.7f;
            }
            p2 p2VarB5 = x.d.b(f2, (y) null, (String) null, g0Var, 0, 30);
            if (sleepTimer != ru.d.OFF) {
                z16 = true;
            } else {
                z16 = false;
            }
            p2VarB = x.d.b(z16 ? 1.0f : 0.7f, (y) null, (String) null, g0Var, 0, 30);
            z17 = z16;
            if (g0Var.k(o1.n) == y3.m.B) {
                z18 = true;
            } else {
                z18 = false;
            }
            rVarJ = h0.c.j(-8);
            rVar3 = b2.o.A;
            z19 = z18;
            r rVarD4 = z1.d(rVar3, 1.0f);
            aVar7 = aVar6;
            v1 v1VarA4 = t1.a(h0.i.a, b2.b.K, g0Var, 48);
            int iHashCode10 = Long.hashCode(g0Var.T);
            m1 m1VarM10 = g0Var.m();
            r rVarC10 = b2.a.c(rVarD4, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar13 = b3.h.f;
            q.I(v1VarA4, g0Var, fVar13);
            b3.f fVar14 = b3.h.e;
            q.I(m1VarM10, g0Var, fVar14);
            Integer numValueOf4 = Integer.valueOf(iHashCode10);
            b3.f fVar15 = b3.h.g;
            q.I(numValueOf4, g0Var, fVar15);
            b3.e eVar4 = b3.h.h;
            q.E(g0Var, eVar4);
            b3.f fVar16 = b3.h.d;
            q.I(rVarC10, g0Var, fVar16);
            f3 = 44;
            r rVarS7 = z1.s(rVar3, f3, 0.0f, 2);
            b2.i iVar4 = b2.b.E;
            w0 w0VarD7 = h0.o.d(iVar4, false);
            int iHashCode11 = Long.hashCode(g0Var.T);
            m1 m1VarM11 = g0Var.m();
            r rVarC11 = b2.a.c(rVarS7, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD7, g0Var, fVar13);
            q.I(m1VarM11, g0Var, fVar14);
            a1.b.v(iHashCode11, g0Var, fVar15, g0Var, eVar4);
            q.I(rVarC11, g0Var, fVar16);
            j = dl.a.i;
            gv.p.j(str4, t.b(((Number) p2VarB5.getValue()).floatValue(), j), z210, onSpeedClicked, null, kh.o.z(15), g0Var, ((i16 >> 6) & 7168) | 196608);
            int i210 = i16 >> 9;
            i12 = i9 & 896;
            gv.p.m(z2, f, onMenuDismissed, onSpeedSelected, g0Var, (i210 & 7168) | (i210 & 14) | i11 | i12);
            g0Var.r(true);
            x1 x1Var4 = x1.a;
            h0.c.h(x1Var4.a(rVar3), g0Var);
            String strU7 = z3.U(g0Var, 2131886764);
            if (z19) {
                rVar4 = rVarJ;
            } else {
                rVar4 = rVar3;
            }
            int i211 = i16 >> 12;
            to.m.a(2131231377, false, strU7, onSkipBackClicked, rVar4, 0.0f, 0.0f, 0L, g0Var, (i211 & 7168) | 48, 224);
            h0.c.h(x1Var4.a(rVar3), g0Var);
            if (z) {
                i13 = 2131231354;
            } else {
                i13 = 2131231358;
            }
            if (z) {
                i14 = 2131886141;
            } else {
                i14 = 2131886151;
            }
            int i212 = i16 >> 18;
            g(i13, z3.U(g0Var, i14), onPlayPauseClicked, 64, 36, g0Var, (i212 & 896) | 27648);
            h0.c.h(x1Var4.a(rVar3), g0Var);
            String strU8 = z3.U(g0Var, 2131886766);
            if (z19) {
                rVar5 = rVar3;
            } else {
                rVar5 = rVarJ;
            }
            to.m.a(2131231379, true, strU8, onSkipForwardClicked, rVar5, 0.0f, 0.0f, 0L, g0Var, (i212 & 7168) | 48, 224);
            h0.c.h(x1Var4.a(rVar3), g0Var);
            r rVarS8 = z1.s(rVar3, f3, 0.0f, 2);
            w0 w0VarD8 = h0.o.d(iVar4, false);
            int iHashCode12 = Long.hashCode(g0Var.T);
            m1 m1VarM12 = g0Var.m();
            r rVarC12 = b2.a.c(rVarS8, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD8, g0Var, fVar13);
            q.I(m1VarM12, g0Var, fVar14);
            a1.b.v(iHashCode12, g0Var, fVar15, g0Var, eVar4);
            q.I(rVarC12, g0Var, fVar16);
            if (z11) {
                g0Var.c0(967635705);
                u00.a aVar19 = aVar5;
                gv.p.i(y3.R(2131231396, g0Var, 0), t.b(((Number) p2VarB.getValue()).floatValue(), j), z17, aVar19, null, false, 20, f3, 0L, g0Var, 14155784 | ((i9 >> 9) & 7168), RCHTTPStatusCodes.NOT_MODIFIED);
                aVar5 = aVar19;
                i15 = i12;
                if (i15 == 256) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if ((i9 & 14) == 4) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z23 = z22 | z21;
                objN2 = g0Var.N();
                if (z23) {
                    obj2 = obj;
                    if (objN2 == obj2) {
                        aVar8 = onMenuDismissed;
                    }
                    u00.a aVar110 = (u00.a) objN2;
                    if (i15 == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if ((i9 & 29360128) == 8388608) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z25 | z24;
                    objN3 = g0Var.N();
                    if (z26) {
                        aVar9 = aVar7;
                        objN3 = new e(aVar8, aVar9, 1);
                        g0Var.n0(objN3);
                    } else {
                        aVar9 = aVar7;
                        objN3 = new e(aVar8, aVar9, 1);
                        g0Var.n0(objN3);
                    }
                    gv.p.q(z13, onMenuDismissed, null, aVar110, false, (u00.a) objN3, g0Var, ((i9 >> 15) & 14) | 384 | ((i9 >> 3) & 112), 16);
                    g0Var.r(false);
                    g0Var = g0Var;
                    aVar7 = aVar9;
                } else {
                    obj2 = obj;
                }
                aVar8 = onMenuDismissed;
                objN2 = new e(aVar8, onSleepTimerClicked, 0);
                g0Var.n0(objN2);
                u00.a aVar111 = (u00.a) objN2;
                if (i15 == 256) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if ((i9 & 29360128) == 8388608) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = z25 | z24;
                objN3 = g0Var.N();
                if (z26) {
                    aVar9 = aVar7;
                    objN3 = new e(aVar8, aVar9, 1);
                    g0Var.n0(objN3);
                } else {
                    aVar9 = aVar7;
                    objN3 = new e(aVar8, aVar9, 1);
                    g0Var.n0(objN3);
                }
                gv.p.q(z13, onMenuDismissed, null, aVar111, false, (u00.a) objN3, g0Var, ((i9 >> 15) & 14) | 384 | ((i9 >> 3) & 112), 16);
                g0Var.r(false);
                g0Var = g0Var;
                aVar7 = aVar9;
            } else {
                i15 = i12;
                g0Var.c0(968598782);
                gv.p.i(y3.R(2131231392, g0Var, 0), t.b(((Number) p2VarB.getValue()).floatValue(), j), z17, onSleepTimerClicked, null, false, 20, f3, 0L, g0Var, 14155784 | ((i9 << 9) & 7168), RCHTTPStatusCodes.NOT_MODIFIED);
                g0Var = g0Var;
                g0Var.r(false);
            }
            ru.d.B.getClass();
            gv.p.x(z3, sleepTimer, onMenuDismissed, onSleepTimerSelected, 2131886149, ru.d.D, g0Var, (i211 & 14) | ((i16 >> 3) & 112) | i15 | ((i9 << 6) & 7168), 0);
            g0Var.r(true);
            g0Var.r(true);
            rVar2 = rVar3;
            aVar3 = aVar5;
            z9 = z11;
            z8 = z13;
            aVar4 = aVar7;
        } else {
            g0Var.V();
            rVar2 = rVar;
            z8 = z5;
            aVar3 = aVar;
            aVar4 = aVar2;
            z9 = z6;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(z, f, sleepTimer, z2, z3, onSpeedClicked, onSpeedSelected, onSkipBackClicked, onPlayPauseClicked, onSkipForwardClicked, onSleepTimerClicked, onSleepTimerSelected, onMenuDismissed, rVar2, z9, z8, aVar3, aVar4, i, i2, i3) {
                public final boolean A;
                public final float B;
                public final ru.d C;
                public final boolean D;
                public final boolean E;
                public final u00.a F;
                public final u00.k G;
                public final u00.a H;
                public final u00.a I;
                public final u00.a J;
                public final u00.a K;
                public final u00.k L;
                public final u00.a M;
                public final r N;
                public final boolean O;
                public final boolean P;
                public final u00.a Q;
                public final u00.a R;
                public final int S;
                public final int T;

                {
                    this.S = i2;
                    this.T = i3;
                }

                @Override
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iK = q.K(1);
                    int iK2 = q.K(this.S);
                    n.c(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (l1.j) obj3, iK, iK2, this.T);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d(lo.i state, u00.a onClick, r rVar, l1.j jVar, int i) {
        r rVar2;
        int i2;
        kotlin.jvm.internal.m.e(state, "state");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1275292026);
        int i3 = i | (g0Var.g(state) ? 4 : 2) | (g0Var.i(onClick) ? 32 : 16) | 384;
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            boolean zEquals = state.equals(lo.h.a);
            lo.f fVar = lo.f.a;
            if (zEquals) {
                i2 = 2131886130;
            } else if (state instanceof lo.g) {
                i2 = 2131886125;
            } else {
                if (!state.equals(fVar)) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = 2131886131;
            }
            String strU = z3.U(g0Var, i2);
            r rVar3 = b2.o.A;
            r rVarV = z.n.f(f2.h.c(z1.m(rVar3, 36), p0.f.a), t.b(0.15f, t.c), b0.b).V(state.equals(fVar) ? rVar3 : w50.c.n(rVar3, true, onClick));
            boolean zG = g0Var.g(strU);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = new u(strU, 21);
                g0Var.n0(objN);
            }
            r rVarC = j3.q.c(rVarV, false, (u00.k) objN);
            b2.i iVar = b2.b.E;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarC, g0Var);
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
            q.I(rVarC2, g0Var, b3.h.d);
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                objN2 = new m3.c0(24);
                g0Var.n0(objN2);
            }
            u00.k kVar = (u00.k) objN2;
            Object objN3 = g0Var.N();
            if (objN3 == cVar) {
                objN3 = new m3.c0(25);
                g0Var.n0(objN3);
            }
            w.m.a(state, (r) null, kVar, iVar, (String) null, (u00.k) objN3, d, g0Var, (i3 & 14) | 1772928, 18);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 26, state, onClick, rVar2);
        }
    }

    public static final void e(u00.a onClick, r rVar, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(238160913);
        int i2 = (g0Var.i(onClick) ? 4 : 2) | i | 48;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            r rVar2 = b2.o.A;
            r rVarN = w50.c.n(z.n.f(f2.h.c(z1.m(rVar2, 36), p0.f.a), t.b(0.15f, t.c), b0.b), true, onClick);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarN, g0Var);
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
            o3.a(y3.R(2131231383, g0Var, 0), z3.U(g0Var, 2131887263), z1.m(rVar2, 20), dl.a.n, g0Var, 392, 0);
            g0Var.r(true);
            rVar = rVar2;
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ev.m(onClick, rVar, i, 8);
        }
    }

    public static final void f(lo.e eVar, u00.a onStartOverClicked, r rVar, l1.j jVar, int i) {
        u00.a aVar;
        r rVar2;
        l1.j jVar2;
        b3.e eVar2;
        long j;
        r rVar3;
        t0 t0Var;
        kotlin.jvm.internal.m.e(onStartOverClicked, "onStartOverClicked");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1129073364);
        int i2 = i | (jVar3.g(eVar) ? 4 : 2) | (jVar3.i(onStartOverClicked) ? 32 : 16) | 384;
        if (jVar3.S(i2 & 1, (i2 & 147) != 146)) {
            r rVar4 = z1.c;
            long j2 = dl.a.L;
            t0 t0Var2 = b0.b;
            r rVarF = z.n.f(rVar4, j2, t0Var2);
            Object objN = jVar3.N();
            if (objN == l1.i.a) {
                objN = new a2.f(24);
                jVar3.n0(objN);
            }
            r rVarO = w50.c.o(rVarF, false, null, (u00.a) objN, 7);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(((g0) jVar3).T);
            m1 m1VarM = jVar3.m();
            r rVarC = b2.a.c(rVarO, jVar3);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            jVar3.g0();
            if (((g0) jVar3).S) {
                jVar3.l(gVar);
            } else {
                jVar3.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(w0VarD, jVar3, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, jVar3, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, jVar3, fVar3);
            b3.e eVar3 = b3.h.h;
            q.E(jVar3, eVar3);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, jVar3, fVar4);
            if (eVar == null) {
                jVar3.c0(197385940);
                jVar3.r(false);
                j = j2;
                jVar2 = jVar3;
                rVar3 = rVar4;
                t0Var = t0Var2;
                eVar2 = eVar3;
            } else {
                jVar3.c0(197385941);
                jVar2 = jVar3;
                eVar2 = eVar3;
                j = j2;
                rVar3 = rVar4;
                t0Var = t0Var2;
                h0.a(eVar, f2.h.b(rVar4, 100, (i2.o0) null), 0.0f, false, null, false, jVar2, 3072, 52);
                jVar2.r(false);
            }
            h0.o.a(z.n.f(rVar3, t.b(0.45f, t.b), t0Var), jVar2, 6);
            b2.i iVar = b2.b.E;
            s sVar = s.a;
            r rVar5 = b2.o.A;
            r rVarE = h0.c.E(sVar.a(rVar5, iVar), 32, 0.0f, 2);
            b2.g gVar2 = b2.b.N;
            v vVarA = h0.u.a(h0.i.g(16), gVar2, jVar2, 54);
            int iHashCode2 = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM2 = jVar2.m();
            r rVarC2 = b2.a.c(rVarE, jVar2);
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            q.I(vVarA, jVar2, fVar);
            q.I(m1VarM2, jVar2, fVar2);
            a1.b.v(iHashCode2, jVar2, fVar3, jVar2, eVar2);
            q.I(rVarC2, jVar2, fVar4);
            m2.b bVarR = y3.R(2131231369, jVar2, 0);
            long j3 = dl.a.n;
            l1.j jVar4 = jVar2;
            b3.e eVar4 = eVar2;
            t0 t0Var3 = t0Var;
            o3.a(bVarR, (String) null, z1.m(rVar5, 48), j3, jVar4, 440, 0);
            float f = 8;
            v vVarA2 = h0.u.a(h0.i.g(f), gVar2, jVar4, 54);
            int iHashCode3 = Long.hashCode(((g0) jVar4).T);
            m1 m1VarM3 = jVar4.m();
            r rVarC3 = b2.a.c(rVar5, jVar4);
            jVar4.g0();
            if (((g0) jVar4).S) {
                jVar4.l(gVar);
            } else {
                jVar4.q0();
            }
            q.I(vVarA2, jVar4, fVar);
            q.I(m1VarM3, jVar4, fVar2);
            a1.b.v(iHashCode3, jVar4, fVar3, jVar4, eVar4);
            q.I(rVarC3, jVar4, fVar4);
            z6.b(z3.U(jVar4, 2131886146), (r) null, j3, kh.o.z(20), q3.u.L, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(25), 0, false, 0, 0, (u00.k) null, (r0) null, jVar4, 1597440, 48, 258986);
            z6.b(z3.U(jVar4, 2131886145), (r) null, dl.a.p, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, jVar4, 24576, 48, 259050);
            jVar4.r(true);
            h0.c.h(z1.e(rVar5, f), jVar4);
            aVar = onStartOverClicked;
            r rVarD = h0.c.D(w50.c.n(z.n.f(f2.h.c(z1.g(z1.d(z1.s(rVar5, 0.0f, 320, 1), 1.0f), 52, 0.0f, 2), p0.f.a), j3, t0Var3), true, aVar), 20, f);
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode4 = Long.hashCode(((g0) jVar4).T);
            m1 m1VarM4 = jVar4.m();
            r rVarC4 = b2.a.c(rVarD, jVar4);
            jVar4.g0();
            if (((g0) jVar4).S) {
                jVar4.l(gVar);
            } else {
                jVar4.q0();
            }
            q.I(w0VarD2, jVar4, fVar);
            q.I(m1VarM4, jVar4, fVar2);
            a1.b.v(iHashCode4, jVar4, fVar3, jVar4, eVar4);
            q.I(rVarC4, jVar4, fVar4);
            z6.b(z3.U(jVar4, 2131886147), (r) null, j, kh.o.z(16), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 1, 0, (u00.k) null, (r0) null, jVar4, 1597440, 24576, 245674);
            jVar3 = jVar4;
            x5.z(jVar3, true, true, true);
            rVar2 = rVar5;
        } else {
            aVar = onStartOverClicked;
            jVar3.V();
            rVar2 = rVar;
        }
        r1 r1VarT = jVar3.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 27, eVar, aVar, rVar2);
        }
    }

    public static final void g(final int i, String str, final u00.a aVar, final int i2, final int i3, l1.j jVar, final int i4) {
        int i5;
        String str2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(954107913);
        if ((i4 & 6) == 0) {
            i5 = (g0Var.e(i) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= g0Var.g(str) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= g0Var.i(aVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= g0Var.e(i2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= g0Var.e(i3) ? 16384 : 8192;
        }
        if (g0Var.S(i5 & 1, (i5 & 9363) != 9362)) {
            b2.o oVar = b2.o.A;
            r rVarO = w50.c.o(z1.m(oVar, i2), false, null, aVar, 7);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarO, g0Var);
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
            str2 = str;
            o3.a(y3.R(i, g0Var, i5 & 14), str2, z1.m(oVar, i3), dl.a.n, g0Var, 8 | (i5 & 112), 0);
            g0Var.r(true);
        } else {
            str2 = str;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final String str3 = str2;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n.g(i, str3, aVar, i2, i3, (l1.j) obj, q.K(i4 | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void h(final jk.a aVar, final u00.a aVar2, final r rVar, l1.j jVar, final int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1273189475);
        int i2 = i | (g0Var.i(aVar) ? 4 : 2) | (g0Var.i(aVar2) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            w50.c.f(aVar2, aVar, rVar, false, false, 36, null, 0L, t.b(0.5f, dl.a.P), 10.0f, p0.f.a, 11, a, g0Var, ((i2 >> 3) & 14) | 805502976 | ((i2 << 3) & 112) | (i2 & 896), 432, 216);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i3 = 0;
            r1VarT.d = new u00.n(aVar, aVar2, rVar, i, i3) {
                public final int A;
                public final jk.a B;
                public final u00.a C;
                public final r D;

                {
                    this.A = i3;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = this.A;
                    l1.j jVar2 = (l1.j) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            n.h(this.B, this.C, this.D, jVar2, q.K(1));
                            break;
                        default:
                            c7.i.a(this.B, this.C, this.D, jVar2, q.K(1));
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void i(u30.b bVar, u00.k kVar, u00.k kVar2, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(363883629);
        int i2 = i | (g0Var.g(bVar) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.i(kVar2) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objN = g0Var.N();
            if (z || objN == l1.i.a) {
                objN = new b1.l(bVar, kVar, kVar2, 26);
                g0Var.n0(objN);
            }
            k00.f.d(null, null, null, null, null, null, false, null, (u00.k) objN, g0Var, 0, 511);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 25, bVar, kVar, kVar2);
        }
    }

    public static final void j(u30.b bVar, u00.k kVar, u00.k kVar2, u00.a aVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-765242530);
        int i2 = i | (g0Var.g(bVar) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | (g0Var.i(kVar2) ? 256 : 128) | (g0Var.i(aVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            s0.G(aVar, new c4.v(3, false), v1.d.d(806156725, new cz.g(kk.e.d(g0Var), aVar, bVar, kVar, kVar2), g0Var), g0Var, ((i2 >> 9) & 14) | 432, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a(bVar, kVar, kVar2, aVar, i, 1);
        }
    }

    public static final void k(u30.b bVar, u00.k kVar, u00.k kVar2, u00.a aVar, l1.j jVar, int i) {
        l1.j jVar2;
        i2.o0 o0VarA;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-448985421);
        int i2 = i | (jVar3.g(bVar) ? 4 : 2) | (jVar3.i(kVar) ? 32 : 16) | (jVar3.i(kVar2) ? 256 : 128) | (jVar3.i(aVar) ? 2048 : 1024);
        if (jVar3.S(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((Configuration) jVar3.k(o0.a)).orientation == 2;
            m6 m6VarF = t4.f(z, (u00.k) null, jVar3, 0, 2);
            Object objN = jVar3.N();
            if (objN == l1.i.a) {
                objN = q.o(jVar3);
                jVar3.n0(objN);
            }
            z zVar = (z) objN;
            long j = dl.a.x;
            float f = z ? Float.NaN : g1.p.b;
            if (z) {
                jVar3.c0(-1978233279);
                jVar3.r(false);
                o0VarA = b0.b;
            } else {
                jVar3.c0(-1978232000);
                g1.p pVar = g1.p.a;
                o0VarA = g6.a(k1.y.a, jVar3);
                jVar3.r(false);
            }
            jVar2 = jVar3;
            t4.a(aVar, (r) null, m6VarF, f, false, o0VarA, j, 0L, 0.0f, 0L, (u00.n) null, (u00.n) null, (u4) null, v1.d.d(-1674435563, new gz.z0(zVar, m6VarF, aVar, bVar, kVar, kVar2, 4), jVar3), jVar2, (i2 >> 9) & 14, 3072, 8082);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new a(bVar, kVar, kVar2, aVar, i, 2);
        }
    }

    public static final void l(u00.a aVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-506819585);
        int i2 = (g0Var.i(aVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            b2.o oVar = b2.o.A;
            float f = 16;
            r rVarG = h0.c.G(h0.c.E(z1.d(oVar, 1.0f), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
            b2.i iVar = b2.b.E;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarG, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            r rVarM = z1.m(s.a.a(oVar, b2.b.D), 44);
            p0.e eVar2 = p0.f.a;
            r rVarC2 = f2.h.c(rVarM, eVar2);
            long j = dl.a.i;
            r rVarN = w50.c.n(z.n.g(z.n.f(rVarC2, t.b(0.1f, j), b0.b), 1, t.b(0.1f, j), eVar2), true, aVar);
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC3 = b2.a.c(rVarN, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD2, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC3, g0Var, fVar4);
            m2.b bVarR = y3.R(2131231104, g0Var, 0);
            String strU = z3.U(g0Var, 2131886127);
            long j2 = dl.a.n;
            o3.a(bVarR, strU, z1.m(oVar, f), j2, g0Var, 392, 0);
            g0Var.r(true);
            z6.b(z3.U(g0Var, 2131886134), (r) null, j2, kh.o.z(17), q3.u.L, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 261034);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.d(aVar, i, 15);
        }
    }

    public static final void m(String str, boolean z, l1.j jVar, int i) {
        l1.j jVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1924886034);
        int i2 = i | (jVar3.g(str) ? 4 : 2) | (jVar3.h(z) ? 32 : 16);
        if (jVar3.S(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                jVar3.c0(-2123409721);
                o3.a(y3.R(2131231074, jVar3, 0), (String) null, z1.m(b2.o.A, 16), dl.a.n, jVar3, 440, 0);
                jVar3.r(false);
            } else {
                jVar3.c0(-2123210608);
                jVar3.r(false);
            }
            jVar2 = jVar3;
            z6.b(str, (r) null, dl.a.n, kh.o.z(14), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 1, 0, (u00.k) null, (r0) null, jVar2, (14 & i2) | 1597440, 24576, 245674);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new dl.d(str, z, i, 2);
        }
    }
}
