package eu;

import android.content.Context;
import android.content.res.Configuration;
import as.p0;
import bv.i2;
import c3.o0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g1.o3;
import g1.x5;
import g1.z6;
import h0.c1;
import h0.n1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.z1;
import i2.t0;
import java.util.Iterator;
import java.util.List;
import l1.f1;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.y0;
import l1.z0;
import m3.r0;
import qd.s0;
import w.c0;
import z.h1;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new al.c(24), 1754806456, false);
    public static final v1.c b = new v1.c(new al.c(25), 481675178, false);
    public static final v1.c c = new v1.c(new al.c(26), -1068877025, false);
    public static final v1.c d = new v1.c(new al.c(27), 2014268552, false);
    public static final v1.c e = new v1.c(new al.c(28), -2002065013, false);
    public static final v1.c f = new v1.c(new al.c(29), 677335889, false);
    public static final v1.c g = new v1.c(new b(0), -1907014357, false);
    public static final v1.c h = new v1.c(new b(1), -719423788, false);
    public static final v1.c i = new v1.c(new b(2), 1399627187, false);
    public static final v1.c j = new v1.c(new b(3), -776289134, false);
    public static final v1.c k = new v1.c(new b(4), 1342761841, false);
    public static final v1.c l = new v1.c(new b(5), -833154480, false);
    public static final v1.c m = new v1.c(new b(6), 2094934509, false);
    public static final v1.c n = new v1.c(new b(7), 1058536787, false);
    public static final v1.c o = new v1.c(new b(8), -342354702, false);
    public static final v1.c p = new v1.c(new b(9), -1743246191, false);
    public static final v1.c q = new v1.c(new dm.a(19), 715828463, false);
    public static final v1.c r = new v1.c(new b(10), 912438487, false);
    public static final v1.c s = new v1.c(new b(11), -299383232, false);
    public static final v1.c t = new v1.c(new b(12), 1717893190, false);

    public static final void a(final ep.k kVar, final u00.a onDismiss, l1.j jVar, final int i2) {
        int i3;
        r1 r1VarT;
        u00.n nVar;
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(868039623);
        if ((i2 & 6) == 0) {
            i3 = (g0Var.e(kVar == null ? -1 : kVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g0Var.i(onDismiss) ? 32 : 16;
        }
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            if (kVar == null) {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                }
                final int i4 = 0;
                nVar = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        l1.j jVar2 = (l1.j) obj;
                        ((Integer) obj2).getClass();
                        switch (i5) {
                            case 0:
                                a.a(kVar, onDismiss, jVar2, l1.q.K(i2 | 1));
                                break;
                            default:
                                a.a(kVar, onDismiss, jVar2, l1.q.K(i2 | 1));
                                break;
                        }
                        return g00.b0.a;
                    }
                };
            } else {
                wr.k.H(null, z3.U(g0Var, kVar.a()), onDismiss, z1.q(b2.o.A, 350), 0L, null, null, v1.d.d(-1397097272, new d(0, onDismiss), g0Var), g0Var, ((i3 << 3) & 896) | 12585990, 112);
            }
            r1VarT.d = nVar;
        }
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i5 = 1;
            nVar = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    l1.j jVar2 = (l1.j) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            a.a(kVar, onDismiss, jVar2, l1.q.K(i2 | 1));
                            break;
                        default:
                            a.a(kVar, onDismiss, jVar2, l1.q.K(i2 | 1));
                            break;
                    }
                    return g00.b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }

    public static final void b(u00.a aVar, l1.j jVar, int i2) {
        int i3;
        u00.a onUpdateClicked = aVar;
        kotlin.jvm.internal.m.e(onUpdateClicked, "onUpdateClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(819695126);
        int i4 = i2 | (g0Var.i(onUpdateClicked) ? 4 : 2);
        if (g0Var.S(i4 & 1, (i4 & 3) != 2)) {
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = new a2.f(24);
                g0Var.n0(objN);
            }
            s0.E(true, (u00.a) objN, g0Var, 54, 0);
            float f2 = 24;
            b2.r rVarE = h0.c.E(z.n.e(z1.c, dl.a.b0, (t0) null, 6), f2, 0.0f, 2);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            h0.v vVarA = h0.u.a(h0.i.e, b2.b.N, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC2 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            float f3 = 100;
            b2.r rVarM = z1.m(oVar, f3);
            b2.i iVar = b2.b.C;
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarM, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            z.n.c(y3.R(2131230843, g0Var, 0), (String) null, z1.m(oVar, f3), (b2.d) null, (z2.p) null, 0.0f, g0Var, 440, 120);
            String strU = z3.U(g0Var, 2131886555);
            long j2 = i2.t.c;
            float f4 = 10;
            z6.b(strU, h0.c.D(z.n.f(f2.h.c(h0.c.z(h0.s.a.a(oVar, iVar), f4, -8), p0.f.a(f2)), dl.a.C, i2.b0.b), f4, 2), j2, kh.o.z(11), q3.u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597824, 0, 262056);
            g0Var.r(true);
            h0.c.h(z1.e(oVar, f2), g0Var);
            z6.b(z3.U(g0Var, 2131886558), (b2.r) null, j2, kh.o.z(36), q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597824, 0, 261034);
            h0.c.h(z1.e(oVar, 12), g0Var);
            z6.b(z3.U(g0Var, 2131886557), (b2.r) null, i2.t.b(0.85f, j2), kh.o.z(18), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(24), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24960, 48, 259050);
            float f5 = 28;
            h0.c.h(z1.e(oVar, f5), g0Var);
            b2.r rVarD = z1.d(oVar, 1.0f);
            p0.e eVarA = p0.f.a(f5);
            p1 p1Var = g1.s.a;
            i3 = 1;
            onUpdateClicked = aVar;
            x5.a(onUpdateClicked, rVarD, false, eVarA, g1.s.a(dl.a.i, dl.a.N, 0L, 0L, g0Var, 12), (g1.u) null, (n1) null, (f0.i) null, b, g0Var, (i4 & 14) | 805306416, 484);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            i3 = 1;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d(onUpdateClicked, i2, i3);
        }
    }

    public static final void c(final boolean z, final u00.a onMergeClicked, final u00.a onKeepAccountClicked, l1.j jVar, final int i2) {
        int i3;
        u00.a aVar;
        r1 r1VarT;
        u00.n nVar;
        kotlin.jvm.internal.m.e(onMergeClicked, "onMergeClicked");
        kotlin.jvm.internal.m.e(onKeepAccountClicked, "onKeepAccountClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1621119196);
        if ((i2 & 6) == 0) {
            i3 = (g0Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g0Var.i(onMergeClicked) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g0Var.i(onKeepAccountClicked) ? 256 : 128;
        }
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                aVar = onKeepAccountClicked;
                b2.r rVarG = z.n.g(z1.q(b2.o.A, 350), 1, i2.t.b(0.8f, dl.a.J), p0.f.a(32));
                Object objN = g0Var.N();
                if (objN == l1.i.a) {
                    objN = new a2.f(24);
                    g0Var.n0(objN);
                }
                wr.k.H(null, null, (u00.a) objN, rVarG, 0L, null, null, v1.d.d(-178525573, new f(onMergeClicked, aVar, 0), g0Var), g0Var, 12583350, 112);
            } else {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                }
                final int i4 = 0;
                nVar = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        l1.j jVar2 = (l1.j) obj;
                        ((Integer) obj2).getClass();
                        switch (i5) {
                            case 0:
                                a.c(z, onMergeClicked, onKeepAccountClicked, jVar2, l1.q.K(i2 | 1));
                                break;
                            default:
                                a.c(z, onMergeClicked, onKeepAccountClicked, jVar2, l1.q.K(i2 | 1));
                                break;
                        }
                        return g00.b0.a;
                    }
                };
            }
            r1VarT.d = nVar;
        }
        aVar = onKeepAccountClicked;
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i5 = 1;
            final u00.a aVar2 = aVar;
            nVar = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    l1.j jVar2 = (l1.j) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            a.c(z, onMergeClicked, aVar2, jVar2, l1.q.K(i2 | 1));
                            break;
                        default:
                            a.c(z, onMergeClicked, aVar2, jVar2, l1.q.K(i2 | 1));
                            break;
                    }
                    return g00.b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }

    public static final void d(bu.b bVar, u00.a onSubscribe, boolean z, b2.r rVar, l1.j jVar, int i2) {
        int i3;
        b2.r rVar2;
        String strT;
        String strT2;
        String str;
        String str2 = bVar.d;
        bu.d dVar = bVar.a;
        Integer num = bVar.g;
        kotlin.jvm.internal.m.e(onSubscribe, "onSubscribe");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-911091104);
        if ((i2 & 6) == 0) {
            i3 = (g0Var.g(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g0Var.i(onSubscribe) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g0Var.h(z) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if (g0Var.S(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zE = g0Var.e(dVar.ordinal()) | g0Var.g(num);
            Object objN = g0Var.N();
            if (zE || objN == l1.i.a) {
                int i5 = 2131887010;
                if (dVar != bu.d.B && num != null) {
                    i5 = 2131887024;
                }
                objN = Integer.valueOf(i5);
                g0Var.n0(objN);
            }
            int iIntValue = ((Number) objN).intValue();
            b2.r rVar3 = b2.o.A;
            b2.r rVarG = h0.c.G(rVar3, 0.0f, 16, 0.0f, 0.0f, 13);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            b2.r rVarD = z1.d(rVar3, 1.0f);
            v1 v1VarA = t1.a(h0.i.e, b2.b.K, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            m2.b bVarR = y3.R(2131231094, g0Var, 0);
            b2.r rVarM = z1.m(rVar3, 14);
            long j2 = dl.a.i;
            z3.j(bVarR, (String) null, rVarM, j2, g0Var, 440, 0);
            b2.r rVarG2 = h0.c.G(rVar3, 6, 0.0f, 0.0f, 0.0f, 14);
            String strU = z3.U(g0Var, iIntValue);
            long jZ = kh.o.z(15);
            q3.u uVar = q3.u.L;
            z6.b(strU, rVarG2, j2, jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597488, 0, 262056);
            g0Var.r(true);
            float f2 = 12;
            h0.c.h(z1.e(rVar3, f2), g0Var);
            b2.r rVarN = w50.c.n(z.n.f(f2.h.c(z1.e(z1.d(rVar3, 1.0f), 58), p0.f.a), j2, i2.b0.b), true, onSubscribe);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarN, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            b2.r rVarE = h0.c.E(rVar3, f2, 0.0f, 2);
            if (num == null) {
                strT = oi.k.o(g0Var, -1267798877, 2131887011, g0Var, false);
            } else {
                g0Var.c0(-1267731390);
                strT = z3.T(2131887012, new Object[]{num}, g0Var);
                g0Var.r(false);
            }
            z6.b(strT, rVarE, dl.a.L, kh.o.z(16), uVar, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(16), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597488, 48, 258984);
            g0Var.r(true);
            h0.c.h(z1.e(rVar3, 10), g0Var);
            int iOrdinal = dVar.ordinal();
            if (iOrdinal == 0) {
                g0Var.c0(-152768683);
                String strU2 = u(bVar, g0Var);
                if (num == null) {
                    g0Var.c0(1339894640);
                    strT2 = z3.T(2131887016, new Object[]{str2}, g0Var);
                    g0Var.r(false);
                } else if (strU2 != null) {
                    g0Var.c0(1340038666);
                    strT2 = z3.T(2131887015, new Object[]{num, str2, strU2}, g0Var);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1340293176);
                    strT2 = z3.T(2131887014, new Object[]{num, str2}, g0Var);
                    g0Var.r(false);
                }
                g0Var.r(false);
                str = strT2;
            } else {
                if (iOrdinal != 1) {
                    throw oi.k.r(g0Var, -152771134, false);
                }
                g0Var.c0(-152766250);
                String strT3 = z3.T(2131887017, new Object[]{str2}, g0Var);
                g0Var.r(false);
                str = strT3;
            }
            z6.b(str, h0.c.G(z1.d(rVar3, 1.0f), 0.0f, 0.0f, 0.0f, 8, 7).V(z ? h0.c.M(rVar3, h0.c.g) : rVar3), dl.a.o, kh.o.z(12), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(12), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 259048);
            g0Var = g0Var;
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g(bVar, onSubscribe, z, rVar2, i2, 0);
        }
    }

    public static final void e(long j2, bu.b bVar, final bu.b bVar2, final bu.b bVar3, boolean z, u00.k kVar, u00.a onSubscribe, b2.r rVar, l1.j jVar, int i2) {
        g0 g0Var;
        final u00.k onPlanSelected = kVar;
        bu.d dVar = bVar.a;
        kotlin.jvm.internal.m.e(onPlanSelected, "onPlanSelected");
        kotlin.jvm.internal.m.e(onSubscribe, "onSubscribe");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(346857436);
        int i3 = i2 | (g0Var2.g(bVar) ? 32 : 16) | (g0Var2.g(bVar2) ? 256 : 128) | (g0Var2.g(bVar3) ? 2048 : 1024) | (g0Var2.h(z) ? 16384 : 8192) | (g0Var2.i(onPlanSelected) ? 131072 : 65536) | (g0Var2.i(onSubscribe) ? 1048576 : 524288) | (g0Var2.g(rVar) ? 8388608 : 4194304);
        if (g0Var2.S(i3 & 1, (i3 & 4793491) != 4793490)) {
            b2.r rVarE = z.n.e(z1.d(rVar, 1.0f), sg.f.P(va.a.S(new i2.t[]{new i2.t(i2.t.f), new i2.t(j2), new i2.t(j2), new i2.t(j2), new i2.t(j2), new i2.t(j2), new i2.t(j2), new i2.t(j2)}), 0.0f, 0.0f, 14), (t0) null, 6);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var2, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var2, fVar4);
            b2.o oVar = b2.o.A;
            float f2 = 8;
            b2.r rVarG = h0.c.G(h0.c.E(z1.d(oVar, 1.0f), 16, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2, 7);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarG, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA, g0Var2, fVar);
            l1.q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC2, g0Var2, fVar4);
            h0.c.h(z1.e(oVar, 45), g0Var2);
            b2.r rVarD = z1.d(oVar, 1.0f);
            v1 v1VarA = t1.a(h0.i.g(f2), b2.b.J, g0Var2, 6);
            int iHashCode3 = Long.hashCode(g0Var2.T);
            m1 m1VarM3 = g0Var2.m();
            b2.r rVarC3 = b2.a.c(rVarD, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(v1VarA, g0Var2, fVar);
            l1.q.I(m1VarM3, g0Var2, fVar2);
            a1.b.v(iHashCode3, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC3, g0Var2, fVar4);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            boolean z2 = dVar == bu.d.B;
            String strU = z3.U(g0Var2, 2131887032);
            g0Var2.c0(-1574563542);
            String strU2 = bVar2.d;
            if (r30.k.L0(strU2)) {
                strU2 = z3.U(g0Var2, 2131887022);
            }
            g0Var2.r(false);
            int i4 = 458752 & i3;
            boolean z3 = (i4 == 131072) | ((i3 & 896) == 256);
            Object objN = g0Var2.N();
            Object obj = l1.i.a;
            if (z3 || objN == obj) {
                final int i5 = 0;
                onPlanSelected = kVar;
                objN = new u00.a() {
                    @Override
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                onPlanSelected.invoke(bVar2);
                                break;
                            default:
                                onPlanSelected.invoke(bVar2);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var2.n0(objN);
            } else {
                onPlanSelected = kVar;
            }
            String str = strU2;
            boolean z4 = false;
            l(z2, (u00.a) objN, strU, null, str, c1Var, null, g0Var2, 1575936);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var2 = new c1(1.0f, true);
            boolean z5 = dVar == bu.d.A;
            g0Var2.c0(-1574547063);
            String strU3 = bVar3.d;
            if (r30.k.L0(strU3)) {
                strU3 = z3.U(g0Var2, 2131887009);
            }
            String str2 = strU3;
            g0Var2.r(false);
            String strU4 = u(bVar3, g0Var2);
            String strU5 = z3.U(g0Var2, 2131887031);
            String str3 = bVar3.f;
            boolean z6 = i4 == 131072;
            if ((i3 & 7168) == 2048) {
                z4 = true;
            }
            boolean z7 = z6 | z4;
            Object objN2 = g0Var2.N();
            if (z7 || objN2 == obj) {
                final int i6 = 1;
                objN2 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                onPlanSelected.invoke(bVar3);
                                break;
                            default:
                                onPlanSelected.invoke(bVar3);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var2.n0(objN2);
            }
            l(z5, (u00.a) objN2, strU5, str3, str2, c1Var2, strU4, g0Var2, 0);
            g0Var = g0Var2;
            g0Var.r(true);
            d(bVar, onSubscribe, z, null, g0Var, ((i3 >> 3) & 14) | ((i3 >> 15) & 112) | ((i3 >> 6) & 896));
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new i(j2, bVar, bVar2, bVar3, z, onPlanSelected, onSubscribe, rVar, i2);
        }
    }

    public static final void f(int i2, b2.r rVar, jk.a backdrop, l1.j jVar, u00.a onDismiss, boolean z) {
        g0 g0Var;
        b2.r rVar2;
        u00.n nVar;
        b2.r rVar3;
        u00.n nVar2;
        b2.r rVarG;
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-1150310493);
        int i3 = (g0Var2.i(backdrop) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= g0Var2.i(onDismiss) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g0Var2.h(z) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if (g0Var2.S(i4 & 1, (i4 & 1171) != 1170)) {
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVar4 = b2.o.A;
            b2.r rVarC = b2.a.c(rVar4, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            u00.n nVar3 = b3.h.f;
            l1.q.I(w0VarD, g0Var2, nVar3);
            b3.f fVar = b3.h.e;
            l1.q.I(m1VarM, g0Var2, fVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar2 = b3.h.g;
            l1.q.I(numValueOf, g0Var2, fVar2);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var2, eVar);
            u00.n nVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var2, nVar4);
            b2.r rVarD = z1.d(rVar4, 1.0f);
            if (z) {
                rVarG = h0.c.M(rVar4, h0.c.e);
                rVar3 = rVarD;
                nVar2 = nVar3;
                nVar = nVar4;
            } else {
                nVar = nVar4;
                rVar3 = rVarD;
                nVar2 = nVar3;
                rVarG = h0.c.G(rVar4, 0.0f, 24, 0.0f, 0.0f, 13);
            }
            b2.r rVarV = rVar3.V(h0.c.G(rVarG, 24, 0.0f, 0.0f, 0.0f, 14));
            b2.i iVar = b2.b.D;
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarV, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD2, g0Var2, nVar2);
            l1.q.I(m1VarM2, g0Var2, fVar);
            a1.b.v(iHashCode2, g0Var2, fVar2, g0Var2, eVar);
            l1.q.I(rVarC2, g0Var2, nVar);
            w50.c.f(onDismiss, backdrop, h0.s.a.a(rVar4, iVar), false, false, 0.0f, null, 0L, i2.t.b(0.5f, dl.a.O), 0.0f, null, 0.0f, e, g0Var2, ((i4 >> 3) & 14) | ((i4 << 3) & 112), 384, 3832);
            g0Var = g0Var2;
            g0Var.r(true);
            g0Var.r(true);
            rVar2 = rVar4;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g(backdrop, onDismiss, z, rVar2, i2, 1);
        }
    }

    public static final void g(final int i2, b2.r rVar, l1.j jVar, final boolean z) {
        int i3;
        g0 g0Var;
        final b2.r rVar2;
        y0 y0Var;
        x.v vVar;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(513714117);
        if ((i2 & 6) == 0) {
            i3 = i2 | (g0Var2.h(z) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if (g0Var2.S(i4 & 1, (i4 & 19) != 18)) {
            Object objN = g0Var2.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = va.a.S(new Integer[]{2131231618, 2131231615, 2131231616, 2131231617});
                g0Var2.n0(objN);
            }
            List list = (List) objN;
            int i5 = i4 & 14;
            boolean z2 = i5 == 4;
            Object objN2 = g0Var2.N();
            if (z2 || objN2 == obj) {
                objN2 = oi.k.s(((Number) h00.q.L0(list)).intValue(), g0Var2);
            }
            y0 y0Var2 = (y0) objN2;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zG = (i5 == 4) | g0Var2.g(y0Var2) | g0Var2.i(list);
            Object objN3 = g0Var2.N();
            k00.c cVar = null;
            if (zG || objN3 == obj) {
                y0Var = y0Var2;
                i2 i2Var = new i2(z, list, y0Var, cVar, 2);
                vVar = null;
                g0Var2.n0(i2Var);
                objN3 = i2Var;
            } else {
                vVar = null;
                y0Var = y0Var2;
            }
            l1.q.i(boolValueOf, g0Var2, (u00.n) objN3);
            b2.r rVar3 = b2.o.A;
            b2.r rVarD = z1.d(rVar3, 1.0f);
            b2.i iVar = b2.b.H;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var2, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var2, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var2, fVar4);
            c0.f(Integer.valueOf(((f1) y0Var).h()), z1.d(rVar3, 1.0f), x.c.w(800, 0, vVar, 6), "paywallBackground", f, g0Var2, 28080, 0);
            wb.h hVar = new wb.h((Context) g0Var2.k(o0.b));
            hVar.c = 2131231625;
            z.n.c(mb.l.i(w.c.q(hVar, 1000), vVar, g0Var2, 0, 62), (String) null, h0.c.G(z1.d(rVar3, 0.7f), 0.0f, 40, 0.0f, 0.0f, 13), (b2.d) null, (z2.p) null, 0.0f, g0Var2, 432, 120);
            b2.r rVarE = z1.e(z1.d(h0.s.a.a(rVar3, iVar), 1.0f), 175.0f);
            i2.t tVar = new i2.t(i2.t.f);
            long j2 = dl.a.L;
            h0.o.a(f2.h.b(z.n.e(rVarE, sg.f.P(va.a.S(new i2.t[]{tVar, new i2.t(i2.t.b(0.9f, j2)), new i2.t(j2)}), 0.0f, 0.0f, 14), vVar, 6), RCHTTPStatusCodes.UNSUCCESSFUL, i2.b0.b), g0Var2, 0);
            b2.r rVarG = z1.g(z1.d(rVar3, 1.0f), 120, 0.0f, 2);
            h0.v vVarA = h0.u.a(h0.i.g(12), b2.b.N, g0Var2, 54);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarG, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA, g0Var2, fVar);
            l1.q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC2, g0Var2, fVar4);
            String strU = z3.U(g0Var2, 2131887054);
            long j3 = dl.a.i;
            k00.f.a(strU, z1.d(rVar3, 1.0f), j3, kh.o.z(34), new y3.o(kh.o.z(41)), q3.u.M, new x3.k(3), 1, 0.0f, null, g0Var2, 12807216, 768);
            z6.b(z3.U(g0Var2, 2131887013), h0.c.E(z1.d(rVar3, 1.0f), 16, 0.0f, 2), j3, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(20), 2, false, 2, 0, (u00.k) null, (r0) null, g0Var2, 24624, 25008, 238568);
            g0Var = g0Var2;
            g0Var.r(true);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i6 = 0;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    int i7 = i6;
                    l1.j jVar2 = (l1.j) obj2;
                    ((Integer) obj3).getClass();
                    switch (i7) {
                        case 0:
                            a.g(l1.q.K(i2 | 1), rVar2, jVar2, z);
                            break;
                        default:
                            bi.b.f(l1.q.K(i2 | 1), rVar2, jVar2, z);
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void h(u00.a onTermsClick, u00.a onPrivacyClick, u00.a onRestoreClick, b2.r rVar, l1.j jVar, int i2) {
        b2.r rVar2;
        kotlin.jvm.internal.m.e(onTermsClick, "onTermsClick");
        kotlin.jvm.internal.m.e(onPrivacyClick, "onPrivacyClick");
        kotlin.jvm.internal.m.e(onRestoreClick, "onRestoreClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-63407911);
        int i3 = i2 | (g0Var.i(onTermsClick) ? 4 : 2) | (g0Var.i(onPrivacyClick) ? 32 : 16) | (g0Var.i(onRestoreClick) ? 256 : 128) | 3072;
        if (g0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            b2.r rVar3 = b2.o.A;
            b2.r rVarD = h0.c.D(z1.d(rVar3, 1.0f), 16, 20);
            v1 v1VarA = t1.a(h0.i.e, b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            i(z3.U(g0Var, 2131887021), onTermsClick, g0Var, (i3 << 3) & 112);
            j(g0Var, 0);
            i(z3.U(g0Var, 2131887018), onPrivacyClick, g0Var, i3 & 112);
            j(g0Var, 0);
            i(z3.U(g0Var, 2131887019), onRestoreClick, g0Var, (i3 >> 3) & 112);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k(onTermsClick, onPrivacyClick, onRestoreClick, rVar2, i2, 2);
        }
    }

    public static final void i(String text, u00.a onClick, l1.j jVar, int i2) {
        int i3;
        l1.j jVar2;
        kotlin.jvm.internal.m.e(text, "text");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(589710212);
        if ((i2 & 6) == 0) {
            i3 = i2 | (jVar3.g(text) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= jVar3.i(onClick) ? 32 : 16;
        }
        if (jVar3.S(i3 & 1, (i3 & 19) != 18)) {
            jVar2 = jVar3;
            z6.b(text, w50.c.o(b2.o.A, false, null, onClick, 7), dl.a.o, kh.o.z(11), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(11), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, (i3 & 14) | 24576, 48, 260072);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new k(text, onClick, i2, 0);
        }
    }

    public static final void j(l1.j jVar, int i2) {
        l1.j jVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-625433786);
        if (jVar3.S(i2 & 1, i2 != 0)) {
            jVar2 = jVar3;
            z6.b(z3.U(jVar3, 2131887020), h0.c.E(b2.o.A, 8, 0.0f, 2), dl.a.o, kh.o.z(13), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(13), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, 24624, 48, 260072);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new dm.a(i2, 20);
        }
    }

    public static final void k(int i2, int i3, l1.j jVar, int i4) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1079674322);
        int i5 = (g0Var.e(i2) ? 4 : 2) | i4 | (g0Var.e(i3) ? 32 : 16);
        if (g0Var.S(i5 & 1, (i5 & 19) != 18)) {
            b2.o oVar = b2.o.A;
            b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f), 0.0f, 0.0f, 0.0f, 16, 7);
            h0.v vVarA = h0.u.a(h0.i.g(12), b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            m2.b bVarR = y3.R(i2, g0Var, i5 & 14);
            b2.r rVarM = z1.m(oVar, 32);
            long j2 = dl.a.i;
            z3.j(bVarR, (String) null, rVarM, j2, g0Var, 440, 0);
            k00.f.a(z3.U(g0Var, i3), z1.d(oVar, 1.0f), j2, kh.o.z(13), new y3.o(kh.o.z(18)), null, new x3.k(3), 2, 0.0f, null, g0Var, 12610608, 800);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l(i2, i3, i4, 0);
        }
    }

    public static final void l(boolean z, u00.a onClick, String planTitle, String str, String planPrice, b2.r rVar, String str2, l1.j jVar, int i2) {
        boolean z2;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        kotlin.jvm.internal.m.e(planTitle, "planTitle");
        kotlin.jvm.internal.m.e(planPrice, "planPrice");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-610845795);
        int i3 = (g0Var.h(z) ? 4 : 2) | i2 | (g0Var.i(onClick) ? 32 : 16) | (g0Var.g(planTitle) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i3 |= g0Var.g(str) ? 2048 : 1024;
        }
        int i4 = i3 | (g0Var.g(planPrice) ? 16384 : 8192) | (g0Var.g(rVar) ? 131072 : 65536);
        if ((1572864 & i2) == 0) {
            i4 |= g0Var.g(str2) ? 1048576 : 524288;
        }
        int i5 = i4;
        if (g0Var.S(i5 & 1, (i5 & 599187) != 599186)) {
            boolean z3 = ((Configuration) g0Var.k(o0.a)).densityDpi <= 320;
            long jZ = z3 ? kh.o.z(13) : kh.o.z(15);
            long jZ2 = z3 ? kh.o.z(13) : kh.o.z(15);
            long jB = z ? dl.a.i : i2.t.b(0.18f, dl.a.i);
            float f2 = z ? 2 : 0;
            b2.r rVarD = z1.d(rVar, 1.0f);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            b2.o oVar = b2.o.A;
            float f3 = 28;
            b2.r rVarC2 = f2.h.c(z1.e(z1.d(oVar, 1.0f), 105), p0.f.a(f3));
            long j2 = dl.a.X;
            i2.o0 o0Var = i2.b0.b;
            b2.r rVarN = w50.c.n(z.n.g(z.n.f(rVarC2, j2, o0Var), f2, jB, p0.f.a(f3)), true, onClick);
            float f4 = 14;
            b2.r rVarF = h0.c.F(rVarN, f4, str == null ? 12 : f4, f4, 12);
            h0.v vVarA = h0.u.a(h0.i.g, b2.b.M, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarF, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            float f5 = 4;
            b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f), 0.0f, f5, 0.0f, 0.0f, 13);
            long j3 = dl.a.i;
            k00.f.a(planTitle, rVarG, j3, jZ, new y3.o(jZ2), q3.u.M, null, 2, 0.0f, null, g0Var, ((i5 >> 6) & 14) | 12779568, 832);
            h0.c.h(z1.e(oVar, 6), g0Var);
            long j4 = dl.a.n;
            long jZ3 = kh.o.z(18);
            y3.o oVar2 = new y3.o(kh.o.z(20));
            q3.u uVar = q3.u.L;
            k00.f.a(planPrice, null, j4, jZ3, oVar2, uVar, null, 1, 0.0f, null, g0Var, ((i5 >> 12) & 14) | 12807168, 834);
            if (str2 == null) {
                g0Var.c0(1187339419);
                z2 = false;
                g0Var.r(false);
            } else {
                g0Var.c0(1187339420);
                k00.f.a(str2, h0.c.G(oVar, 0.0f, 2, 0.0f, 0.0f, 13), dl.a.o, kh.o.z(11), new y3.o(kh.o.z(11)), null, null, 1, 0.0f, null, g0Var, 12610608, 864);
                z2 = false;
                g0Var.r(false);
            }
            g0Var.r(true);
            if (str == null) {
                g0Var.c0(-97496456);
                g0Var.r(z2);
            } else {
                g0Var.c0(-97496455);
                k00.f.a(z3.T(2131887034, new Object[]{str}, g0Var), h0.c.D(z.n.f(f2.h.c(h0.c.A(h0.s.a.a(oVar, b2.b.C), 0.0f, -8, 1), p0.f.a), dl.a.C, o0Var), 8, f5), j3, kh.o.z(12), new y3.o(kh.o.z(12)), uVar, null, 1, 0.5f, null, g0Var, 113470464, 576);
                g0Var = g0Var;
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m(z, onClick, planTitle, str, planPrice, rVar, str2, i2);
        }
    }

    public static final void m(b2.r rVar, l1.j jVar, int i2) {
        b2.r rVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1467544927);
        int i3 = i2 | 6;
        if (g0Var.S(i3 & 1, (i3 & 3) != 2)) {
            k0.b bVar = new k0.b(3);
            rVar2 = b2.o.A;
            float f2 = 16;
            b2.r rVarF = z.n.f(z1.e(f2.h.c(h0.c.E(z1.d(rVar2, 1.0f), f2, 0.0f, 2), p0.f.a(28)), 240), i2.t.b(0.1f, dl.a.i), i2.b0.b);
            float f3 = 20;
            float f4 = 24;
            p1 p1Var = new p1(f3, f4, f3, f4);
            h0.f fVarG = h0.i.g(f2);
            h0.f fVarG2 = h0.i.g(f2);
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = new e6.c(7);
                g0Var.n0(objN);
            }
            kh.n.i(bVar, rVarF, (k0.y) null, p1Var, fVarG, fVarG2, (d0.t0) null, false, (h1) null, (u00.k) objN, g0Var, 102435840, 6, 660);
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar2, i2, 6);
        }
    }

    public static final void n(bu.c cVar, b2.r rVar, l1.j jVar, int i2) {
        b2.r rVar2;
        bu.c review = cVar;
        kotlin.jvm.internal.m.e(review, "review");
        g0 g0Var = (g0) jVar;
        g0Var.e0(758145115);
        int i3 = i2 | (g0Var.g(review) ? 4 : 2) | 48;
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            hVar.c = Integer.valueOf(review.a);
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            b2.r rVar3 = b2.o.A;
            b2.r rVarC = f2.h.c(h0.c.E(z1.d(rVar3, 1.0f), 16, 0.0f, 2), p0.f.a(18));
            long j2 = dl.a.i;
            float f2 = 10;
            b2.r rVarD = h0.c.D(z.n.f(rVarC, i2.t.b(0.08f, j2), i2.b0.b), 12, f2);
            h0.f fVarG = h0.i.g(8);
            b2.g gVar = b2.b.M;
            h0.v vVarA = h0.u.a(fVarG, gVar, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC2, g0Var, fVar4);
            b2.r rVarD2 = z1.d(rVar3, 1.0f);
            v1 v1VarA = t1.a(h0.i.g, b2.b.J, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            v1 v1VarA2 = t1.a(h0.i.g(f2), b2.b.K, g0Var, 54);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVar3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC4, g0Var, fVar4);
            z.n.c(jVarI, (String) null, f2.h.c(z1.m(rVar3, 40), p0.f.a), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            h0.v vVarA2 = h0.u.a(h0.i.g(-4), gVar, g0Var, 6);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC5 = b2.a.c(rVar3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC5, g0Var, fVar4);
            review = cVar;
            rVar2 = rVar3;
            z6.b(z3.U(g0Var, review.b), (b2.r) null, j2, kh.o.z(16), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(21), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260010);
            z6.b(z3.U(g0Var, review.c), (b2.r) null, i2.t.b(0.5f, dl.a.k), kh.o.z(13), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 0, 262122);
            g0Var.r(true);
            g0Var.r(true);
            z6.b(z3.U(g0Var, 2131887295), (b2.r) null, dl.a.f, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 0, 262122);
            g0Var.r(true);
            z6.b(z3.U(g0Var, review.d), (b2.r) null, i2.t.b(0.9f, j2), kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 2, false, 5, 0, (u00.k) null, (r0) null, g0Var, 24576, 25008, 239594);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new al.i(review, rVar2, i2, 10);
        }
    }

    public static final void o(String ratingLabel, l1.j jVar, int i2) {
        kotlin.jvm.internal.m.e(ratingLabel, "ratingLabel");
        l1.j jVar2 = (g0) jVar;
        jVar2.e0(863881379);
        int i3 = i2 | (jVar2.g(ratingLabel) ? 4 : 2);
        if (jVar2.S(i3 & 1, (i3 & 3) != 2)) {
            boolean z = ((Configuration) jVar2.k(o0.a)).densityDpi <= 320;
            long jZ = kh.o.z(z ? 15 : 18);
            float f2 = z ? 24 : 32;
            v1 v1VarA = t1.a(h0.i.a, b2.b.K, jVar2, 48);
            int iHashCode = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM = jVar2.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC = b2.a.c(oVar, jVar2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            l1.q.I(v1VarA, jVar2, b3.h.f);
            l1.q.I(m1VarM, jVar2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), jVar2, b3.h.g);
            l1.q.E(jVar2, b3.h.h);
            l1.q.I(rVarC, jVar2, b3.h.d);
            m2.b bVarR = y3.R(2131231365, jVar2, 0);
            long j2 = dl.a.f;
            z3.j(bVarR, (String) null, z1.m(oVar, f2), j2, jVar2, 56, 0);
            long j3 = dl.a.i;
            q3.u uVar = q3.u.C;
            long jZ2 = kh.o.z(20);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(ratingLabel, new c1(1.0f, false), j3, jZ, uVar, (q3.i) null, 0L, (x3.l) null, new x3.k(3), jZ2, 2, false, 1, 0, (u00.k) null, (r0) null, jVar2, (i3 & 14) | 1572864, 25008, 238504);
            jVar2 = jVar2;
            z3.j(y3.R(2131231366, jVar2, 0), (String) null, z1.m(oVar, f2), j2, jVar2, 56, 0);
            jVar2.r(true);
        } else {
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new n(ratingLabel, i2, 0);
        }
    }

    public static final void p(b2.r rVar, l1.j jVar, int i2) {
        b2.r rVar2;
        l1.j jVar2 = (g0) jVar;
        jVar2.e0(-312119969);
        int i3 = i2 | 6;
        if (jVar2.S(i3 & 1, (i3 & 3) != 2)) {
            b2.r rVar3 = b2.o.A;
            float f2 = 16;
            b2.r rVarE = h0.c.E(z1.d(rVar3, 1.0f), f2, 0.0f, 2);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, jVar2, 0);
            int iHashCode = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM = jVar2.m();
            b2.r rVarC = b2.a.c(rVarE, jVar2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, jVar2, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, jVar2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, jVar2, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(jVar2, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, jVar2, fVar4);
            float f3 = 24;
            h0.c.h(z1.e(rVar3, f3), jVar2);
            b2.r rVarD = z1.d(rVar3, 1.0f);
            v1 v1VarA = t1.a(h0.i.f, b2.b.K, jVar2, 54);
            int iHashCode2 = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM2 = jVar2.m();
            b2.r rVarC2 = b2.a.c(rVarD, jVar2);
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            l1.q.I(v1VarA, jVar2, fVar);
            l1.q.I(m1VarM2, jVar2, fVar2);
            a1.b.v(iHashCode2, jVar2, fVar3, jVar2, eVar);
            l1.q.I(rVarC2, jVar2, fVar4);
            o(z3.U(jVar2, 2131887033), jVar2, 0);
            jVar2.r(true);
            h0.c.h(z1.e(rVar3, f3), jVar2);
            z6.b(z3.U(jVar2, 2131887192), (b2.r) null, dl.a.k, kh.o.z(17), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(22), 2, false, 1, 0, (u00.k) null, (r0) null, jVar2, 1597440, 25008, 239530);
            jVar2 = jVar2;
            rVar2 = rVar3;
            h0.c.h(z1.e(rVar2, f2), jVar2);
            jVar2.r(true);
        } else {
            jVar2.V();
            rVar2 = rVar;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar2, i2, 7);
        }
    }

    public static final void q(b2.r rVar, l1.j jVar, int i2) {
        b2.r rVar2;
        u00.a aVar;
        u00.a aVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(2076265673);
        int i3 = i2 | 6;
        if (g0Var.S(i3 & 1, (i3 & 3) != 2)) {
            List listS = va.a.S(new Integer[]{2131231678, 2131231679, 2131231680});
            b2.r rVar3 = b2.o.A;
            float f2 = 16;
            b2.r rVarE = h0.c.E(z1.d(rVar3, 1.0f), f2, 0.0f, 2);
            h0.d dVar = h0.i.c;
            b2.g gVar = b2.b.M;
            h0.v vVarA = h0.u.a(dVar, gVar, g0Var, 0);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
            b3.i.c.getClass();
            u00.a aVar3 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar3);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            b2.r rVarD = z1.d(rVar3, 1.0f);
            b2.h hVar = b2.b.K;
            float f3 = 12;
            v1 v1VarA = t1.a(h0.i.g(f3), hVar, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarD, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar3);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            o3.a(y3.R(2131231176, g0Var, 0), (String) null, z1.m(rVar3, 24), dl.a.U, g0Var, 440, 0);
            String strU = z3.U(g0Var, 2131887322);
            long j2 = dl.a.i;
            z6.b(strU, (b2.r) null, j2, kh.o.z(22), q3.u.E, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(28), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 239530);
            g0Var.r(true);
            h0.c.h(z1.e(rVar3, f3), g0Var);
            b2.r rVarF = z.n.f(f2.h.c(z1.d(rVar3, 1.0f), p0.f.a(28)), i2.t.b(0.08f, j2), i2.b0.b);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarF, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                aVar = aVar3;
                g0Var.l(aVar);
            } else {
                aVar = aVar3;
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            b2.r rVarC4 = h0.c.C(z1.d(rVar3, 1.0f), f2);
            h0.v vVarA2 = h0.u.a(dVar, gVar, g0Var, 0);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            b2.r rVarC5 = b2.a.c(rVarC4, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM4, g0Var, fVar2);
            a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC5, g0Var, fVar4);
            u00.a aVar4 = aVar;
            z6.b(z3.U(g0Var, 2131887035), (b2.r) null, dl.a.k, kh.o.z(17), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(22), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260074);
            g0 g0Var2 = g0Var;
            h0.c.h(z1.e(rVar3, f2), g0Var2);
            b2.r rVarD2 = z1.d(rVar3, 1.0f);
            v1 v1VarA2 = t1.a(h0.i.b, hVar, g0Var2, 54);
            int iHashCode5 = Long.hashCode(g0Var2.T);
            m1 m1VarM5 = g0Var2.m();
            b2.r rVarC6 = b2.a.c(rVarD2, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                aVar2 = aVar4;
                g0Var2.l(aVar2);
            } else {
                aVar2 = aVar4;
                g0Var2.q0();
            }
            l1.q.I(v1VarA2, g0Var2, fVar);
            l1.q.I(m1VarM5, g0Var2, fVar2);
            a1.b.v(iHashCode5, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC6, g0Var2, fVar4);
            v1 v1VarA3 = t1.a(h0.i.g(-3.6f), b2.b.J, g0Var2, 6);
            int iHashCode6 = Long.hashCode(g0Var2.T);
            m1 m1VarM6 = g0Var2.m();
            b2.r rVarC7 = b2.a.c(rVar3, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(aVar2);
            } else {
                g0Var2.q0();
            }
            l1.q.I(v1VarA3, g0Var2, fVar);
            l1.q.I(m1VarM6, g0Var2, fVar2);
            a1.b.v(iHashCode6, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC7, g0Var2, fVar4);
            g0Var2.c0(-999524540);
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                wb.h hVar2 = new wb.h((Context) g0Var2.k(o0.b));
                hVar2.c = Integer.valueOf(iIntValue);
                g0 g0Var3 = g0Var2;
                z.n.c(mb.l.i(w.c.q(hVar2, 600), (z2.p) null, g0Var2, 0, 62), (String) null, f2.h.c(z1.m(rVar3, 20), p0.f.a), (b2.d) null, z2.o.a, 0.0f, g0Var3, 24624, 104);
                g0Var2 = g0Var3;
            }
            g0Var2.r(false);
            g0Var2.r(true);
            h0.c.h(z1.q(rVar3, 8), g0Var2);
            g0 g0Var4 = g0Var2;
            z6.b(z3.U(g0Var2, 2131887142), (b2.r) null, dl.a.k, kh.o.z(17), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(22), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var4, 24576, 25008, 239594);
            g0Var = g0Var4;
            g0Var.r(true);
            g0Var.r(true);
            g0Var.r(true);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar2, i2, 8);
        }
    }

    public static final void r(final boolean z, final bu.b bVar, final bu.b bVar2, final bu.b bVar3, final u00.a onDismiss, final u00.k onPlanSelected, final u00.a onSubscribe, final u00.a onTermsClick, final u00.a onPrivacyClick, final u00.a onRestoreClick, l1.j jVar, final int i2) {
        l1.j jVar2;
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.e(onPlanSelected, "onPlanSelected");
        kotlin.jvm.internal.m.e(onSubscribe, "onSubscribe");
        kotlin.jvm.internal.m.e(onTermsClick, "onTermsClick");
        kotlin.jvm.internal.m.e(onPrivacyClick, "onPrivacyClick");
        kotlin.jvm.internal.m.e(onRestoreClick, "onRestoreClick");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1563112732);
        int i3 = i2 | (jVar3.h(z) ? 4 : 2) | (jVar3.g(bVar) ? 32 : 16) | (jVar3.g(bVar2) ? 256 : 128) | (jVar3.g(bVar3) ? 2048 : 1024) | (jVar3.i(onDismiss) ? 16384 : 8192) | (jVar3.i(onPlanSelected) ? 131072 : 65536) | (jVar3.i(onSubscribe) ? 1048576 : 524288) | (jVar3.i(onTermsClick) ? 8388608 : 4194304) | (jVar3.i(onPrivacyClick) ? 67108864 : 33554432) | (jVar3.i(onRestoreClick) ? 536870912 : 268435456);
        if (!jVar3.S(i3 & 1, (i3 & 306783379) != 306783378)) {
            jVar2 = jVar3;
            jVar2.V();
        } else {
            if (!z) {
                r1 r1VarT = jVar3.t();
                if (r1VarT != null) {
                    final int i4 = 0;
                    r1VarT.d = new u00.n(z, bVar, bVar2, bVar3, onDismiss, onPlanSelected, onSubscribe, onTermsClick, onPrivacyClick, onRestoreClick, i2, i4) {
                        public final int A;
                        public final boolean B;
                        public final bu.b C;
                        public final bu.b D;
                        public final bu.b E;
                        public final u00.a F;
                        public final u00.k G;
                        public final u00.a H;
                        public final u00.a I;
                        public final u00.a J;
                        public final u00.a K;

                        {
                            this.A = i4;
                        }

                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.A) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iK = l1.q.K(1);
                                    a.r(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (l1.j) obj, iK);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iK2 = l1.q.K(1);
                                    a.r(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (l1.j) obj, iK2);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                    return;
                }
                return;
            }
            boolean z2 = ((Configuration) jVar3.k(o0.a)).densityDpi <= 320;
            final j0.v vVarA = j0.x.a(0, jVar3, 3);
            final p2 p2VarB = sm.a.b(vVarA, jVar3);
            final float f2 = z2 ? 310 : RCHTTPStatusCodes.UNSUCCESSFUL;
            final boolean z3 = jVar3.k(dl.e.a) == gm.a.A;
            final kk.c cVarD = kk.e.d(jVar3);
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (objN == cVar) {
                objN = new i2.t(z3 ? dl.a.L : dl.a.W);
                jVar3.n0(objN);
            }
            final long j2 = ((i2.t) objN).a;
            u30.b bVar4 = bu.a.a;
            boolean zG = jVar3.g(bVar4);
            Object objN2 = jVar3.N();
            if (zG || objN2 == cVar) {
                objN2 = l1.q.z(bVar4);
                jVar3.n0(objN2);
            }
            final z0 z0Var = (z0) objN2;
            jVar2 = jVar3;
            s0.G(onDismiss, new c4.v(false, false, false, !z3, 231), v1.d.d(1695388069, new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    g0 g0Var = (l1.j) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    g0 g0Var2 = g0Var;
                    if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        h0.a0 a0Var = b2.o.A;
                        i2.o0 o0Var = i2.b0.b;
                        boolean z4 = z3;
                        long j3 = j2;
                        b2.r rVarF = z4 ? z.n.f(z1.c, j3, o0Var) : z.n.g(z.n.f(f2.h.c(z1.g(z1.r(h0.c.E(a0Var, 0.0f, 44, 1), 380, RCHTTPStatusCodes.BAD_REQUEST), 0.0f, 700, 1), p0.f.a(32.0f)), dl.a.W, o0Var), 2, dl.a.Y, p0.f.a(32.0f));
                        w0 w0VarD = h0.o.d(b2.b.A, false);
                        int iHashCode = Long.hashCode(g0Var2.T);
                        m1 m1VarM = g0Var2.m();
                        b2.r rVarC = b2.a.c(rVarF, g0Var);
                        b3.i.c.getClass();
                        b3.g gVar = b3.h.b;
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar);
                        } else {
                            g0Var2.q0();
                        }
                        l1.q.I(w0VarD, g0Var, b3.h.f);
                        l1.q.I(m1VarM, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC, g0Var, b3.h.d);
                        b2.r rVarV = z1.d(a0Var, 1.0f).V(z4 ? z1.c : a0Var);
                        kk.c cVar2 = cVarD;
                        b2.r rVarA = kk.e.a(rVarV, cVar2);
                        final boolean z5 = z;
                        boolean zH = g0Var2.h(z5);
                        final z0 z0Var2 = z0Var;
                        boolean zG2 = zH | g0Var2.g(z0Var2);
                        final u00.a aVar = onTermsClick;
                        boolean zG3 = zG2 | g0Var2.g(aVar);
                        final u00.a aVar2 = onPrivacyClick;
                        boolean zG4 = zG3 | g0Var2.g(aVar2);
                        final u00.a aVar3 = onRestoreClick;
                        boolean zG5 = zG4 | g0Var2.g(aVar3);
                        final float f3 = f2;
                        boolean zD = zG5 | g0Var2.d(f3);
                        Object objN3 = g0Var2.N();
                        if (zD || objN3 == l1.i.a) {
                            objN3 = new u00.k() {
                                @Override
                                public final Object invoke(Object obj3) {
                                    j0.h LazyColumn = (j0.h) obj3;
                                    kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                                    j0.h.q(LazyColumn, (Object) null, new v1.c(new cz.o(1, z5), -1713003222, true), 3);
                                    j0.h.q(LazyColumn, (Object) null, a.n, 3);
                                    j0.h.q(LazyColumn, (Object) null, a.o, 3);
                                    j0.h.q(LazyColumn, (Object) null, a.p, 3);
                                    u30.b bVar5 = (u30.b) z0Var2.getValue();
                                    LazyColumn.r(((h00.b) bVar5).a(), (u00.k) null, new as.r0(3, bVar5), new v1.c(new u(0, bVar5), 802480018, true));
                                    j0.h.q(LazyColumn, (Object) null, new v1.c(new az.j(aVar, aVar2, aVar3, 4), 1150829616, true), 3);
                                    j0.h.q(LazyColumn, (Object) null, new v1.c(new p0(f3, 1), -250061873, true), 3);
                                    return g00.b0.a;
                                }
                            };
                            g0Var2.n0(objN3);
                        }
                        k00.f.d(rVarA, vVarA, null, null, null, null, false, null, (u00.k) objN3, g0Var, 0, 508);
                        b2.i iVar = b2.b.B;
                        h0.s sVar = h0.s.a;
                        sm.a.a(z3.U(g0Var, 2131887054), ((Number) p2VarB.getValue()).floatValue(), sVar.a(a0Var, iVar), 0.0f, g0Var, 0);
                        a.f(0, null, cVar2, g0Var, onDismiss, z4);
                        a.e(j3, bVar, bVar3, bVar2, z4, onPlanSelected, onSubscribe, sVar.a(a0Var, b2.b.H), g0Var, 6);
                        g0Var2.r(true);
                    } else {
                        g0Var2.V();
                    }
                    return g00.b0.a;
                }
            }, jVar2), jVar2, ((i3 >> 12) & 14) | 384, 0);
        }
        r1 r1VarT2 = jVar2.t();
        if (r1VarT2 != null) {
            final int i5 = 1;
            r1VarT2.d = new u00.n(z, bVar, bVar2, bVar3, onDismiss, onPlanSelected, onSubscribe, onTermsClick, onPrivacyClick, onRestoreClick, i2, i5) {
                public final int A;
                public final boolean B;
                public final bu.b C;
                public final bu.b D;
                public final bu.b E;
                public final u00.a F;
                public final u00.k G;
                public final u00.a H;
                public final u00.a I;
                public final u00.a J;
                public final u00.a K;

                {
                    this.A = i5;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.A) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iK = l1.q.K(1);
                            a.r(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (l1.j) obj, iK);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iK2 = l1.q.K(1);
                            a.r(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (l1.j) obj, iK2);
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void s(boolean z, u00.a onPositiveAnswerClicked, u00.a onNegativeAnswerClicked, u00.a onLaterClicked, u00.a onDismiss, l1.j jVar, int i2) {
        kotlin.jvm.internal.m.e(onPositiveAnswerClicked, "onPositiveAnswerClicked");
        kotlin.jvm.internal.m.e(onNegativeAnswerClicked, "onNegativeAnswerClicked");
        kotlin.jvm.internal.m.e(onLaterClicked, "onLaterClicked");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-638125898);
        int i3 = i2 | (g0Var.h(z) ? 4 : 2) | (g0Var.i(onPositiveAnswerClicked) ? 32 : 16) | (g0Var.i(onNegativeAnswerClicked) ? 256 : 128) | (g0Var.i(onLaterClicked) ? 2048 : 1024) | (g0Var.i(onDismiss) ? 16384 : 8192);
        if (!g0Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            g0Var.V();
        } else if (z) {
            g0Var.c0(-883086207);
            b2.r rVarQ = z1.q(b2.o.A, 350);
            String strU = z3.U(g0Var, 2131887140);
            String strU2 = z3.U(g0Var, 2131887135);
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = new a2.f(24);
                g0Var.n0(objN);
            }
            wr.k.H(strU, strU2, (u00.a) objN, rVarQ, 0L, null, null, v1.d.d(-591235558, new dz.k(onPositiveAnswerClicked, onNegativeAnswerClicked, onLaterClicked, onDismiss), g0Var), g0Var, 12586368, 112);
            g0Var.r(false);
        } else {
            g0Var.c0(-880886292);
            g0Var.r(false);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.k(z, onPositiveAnswerClicked, onNegativeAnswerClicked, onLaterClicked, onDismiss, i2, 2);
        }
    }

    public static final void t(final int i2, l1.j jVar, final boolean z) {
        int i3;
        r1 r1VarT;
        u00.n nVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(728966246);
        if ((i2 & 6) == 0) {
            i3 = (g0Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (g0Var.S(i3 & 1, (i3 & 3) != 2)) {
            if (z) {
                Object objN = g0Var.N();
                if (objN == l1.i.a) {
                    objN = new a2.f(24);
                    g0Var.n0(objN);
                }
                s0.G((u00.a) objN, new c4.v(4, false), q, g0Var, 438, 0);
            } else {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                }
                final int i4 = 0;
                nVar = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        int i5 = i4;
                        l1.j jVar2 = (l1.j) obj;
                        ((Integer) obj2).getClass();
                        switch (i5) {
                            case 0:
                                a.t(l1.q.K(i2 | 1), jVar2, z);
                                break;
                            default:
                                a.t(l1.q.K(i2 | 1), jVar2, z);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
            }
            r1VarT.d = nVar;
        }
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i5 = 1;
            nVar = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    l1.j jVar2 = (l1.j) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            a.t(l1.q.K(i2 | 1), jVar2, z);
                            break;
                        default:
                            a.t(l1.q.K(i2 | 1), jVar2, z);
                            break;
                    }
                    return g00.b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }

    public static final String u(bu.b bVar, l1.j jVar) {
        String str = bVar.e;
        if (str == null || r30.k.L0(bVar.d)) {
            g0 g0Var = (g0) jVar;
            g0Var.c0(-1001067970);
            g0Var.r(false);
            return null;
        }
        g0 g0Var2 = (g0) jVar;
        g0Var2.c0(-1001157188);
        String strT = z3.T(2131887008, new Object[]{str}, jVar);
        g0Var2.r(false);
        return strT;
    }
}
