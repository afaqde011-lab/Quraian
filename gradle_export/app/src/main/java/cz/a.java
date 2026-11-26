package cz;

import a40.z;
import b2.r;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.m6;
import g1.o3;
import g1.t4;
import g1.u4;
import g1.z6;
import h0.c1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.z1;
import i2.b0;
import i2.s0;
import i2.t;
import i2.t0;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.m1;
import l1.q;
import l1.r1;
import m3.i0;
import m3.r0;
import q3.p;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new al.c(17), -1813794547, false);

    public static final void a(ry.a device, boolean z, u00.a onClick, u00.a onTerminateOthers, r rVar, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(device, "device");
        String str = device.g;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        kotlin.jvm.internal.m.e(onTerminateOthers, "onTerminateOthers");
        g0 g0Var = (g0) jVar;
        g0Var.e0(958949696);
        int i2 = i | (g0Var.g(device) ? 4 : 2) | (g0Var.h(z) ? 32 : 16) | (g0Var.i(onClick) ? 256 : 128) | (g0Var.i(onTerminateOthers) ? 2048 : 1024) | (g0Var.g(rVar) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            r rVarF = z.n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(24)), t.b(0.08f, dl.a.i), b0.b);
            v vVarA = u.a(h0.i.c, b2.b.M, g0Var, 0);
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
            b3.f fVar = b3.h.f;
            q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            g0Var.c0(-1321358625);
            m3.e eVar2 = new m3.e();
            g0Var.c0(-1321357876);
            int iE = eVar2.e(new i0(dl.a.E, 0L, (q3.u) null, (q3.o) null, (p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (s0) null, 65534));
            try {
                eVar2.b(z3.U(g0Var, 2131887243));
                eVar2.d(iE);
                g0Var.r(false);
                if (!r30.k.L0(str)) {
                    eVar2.b(" · ".concat(str));
                }
                m3.h hVarF = eVar2.f();
                g0Var.r(false);
                g(device, hVarF, onClick, g0Var, i2 & 910);
                long jB = t.b(z ? 1.0f : 0.4f, dl.a.U);
                b2.o oVar = b2.o.A;
                float f = 16;
                r rVarG = h0.c.G(w50.c.n(z1.d(oVar, 1.0f), z, onTerminateOthers), f, 0.0f, f, f, 2);
                v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC2 = b2.a.c(rVarG, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA, g0Var, fVar);
                q.I(m1VarM2, g0Var, fVar2);
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC2, g0Var, fVar4);
                o3.a(y3.R(2131231380, g0Var, 0), (String) null, z1.m(oVar, 18), jB, g0Var, 440, 0);
                k00.f.a(z3.U(g0Var, 2131887237), null, jB, kh.o.z(15), null, q3.u.C, null, 1, 0.0f, null, g0Var, 12782592, 850);
                g0Var = g0Var;
                g0Var.r(true);
                g0Var.r(true);
            } catch (Throwable th) {
                eVar2.d(iE);
                throw th;
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.k(device, z, onClick, onTerminateOthers, rVar, i, 1);
        }
    }

    public static final void b(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(737012996);
        if (g0Var.S(i & 1, i != 0)) {
            b2.o oVar = b2.o.A;
            r rVarF = z.n.f(f2.h.c(z1.d(oVar, 1.0f), p0.f.a(24)), t.b(0.08f, dl.a.i), b0.b);
            v vVarA = u.a(h0.i.c, b2.b.M, g0Var, 0);
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
            b3.f fVar = b3.h.f;
            q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            f(g0Var, 0);
            float f = 16;
            r rVarG = h0.c.G(z1.d(oVar, 1.0f), f, 0.0f, f, f, 2);
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarG, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            h0.o.a(rd.a.g0(4, 6, 0L, z1.m(oVar, 18), false), g0Var, 0);
            h0.o.a(rd.a.g0(6, 6, 0L, z1.n(oVar, 180, 15), false), g0Var, 0);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new cp.a(i, 8);
        }
    }

    public static final void c(String str, String str2, l1.j jVar, int i) {
        String str3;
        l1.j jVar2 = (g0) jVar;
        jVar2.e0(1564565333);
        int i2 = i | (jVar2.g(str) ? 4 : 2) | (jVar2.g(str2) ? 32 : 16);
        if (jVar2.S(i2 & 1, (i2 & 19) != 18)) {
            float f = 12;
            r rVarD = h0.c.D(z1.d(b2.o.A, 1.0f), 16, f);
            v1 v1VarA = t1.a(h0.i.g(f), b2.b.K, jVar2, 54);
            int iHashCode = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM = jVar2.m();
            r rVarC = b2.a.c(rVarD, jVar2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            q.I(v1VarA, jVar2, b3.h.f);
            q.I(m1VarM, jVar2, b3.h.e);
            q.I(Integer.valueOf(iHashCode), jVar2, b3.h.g);
            q.E(jVar2, b3.h.h);
            q.I(rVarC, jVar2, b3.h.d);
            long j = dl.a.k;
            z6.b(str, (r) null, t.b(0.5f, j), kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, (i2 & 14) | 24576, 48, 260074);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            jVar2 = jVar2;
            str3 = str2;
            k00.f.a(str3, new c1(1.0f, true), j, kh.o.z(15), new y3.o(kh.o.z(20)), q3.u.C, new x3.k(6), 1, 0.0f, null, jVar2, ((i2 >> 3) & 14) | 12807168, 768);
            jVar2.r(true);
        } else {
            str3 = str2;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new d(i, 0, str, str3);
        }
    }

    public static final void d(final ry.a aVar, final u00.a onDismiss, final u00.a onTerminate, l1.j jVar, final int i) {
        l1.j jVar2;
        r1 r1VarT;
        u00.n nVar;
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.e(onTerminate, "onTerminate");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-65510495);
        int i2 = i | (jVar3.g(aVar) ? 4 : 2) | (jVar3.i(onDismiss) ? 32 : 16) | (jVar3.i(onTerminate) ? 256 : 128);
        if (jVar3.S(i2 & 1, (i2 & 147) != 146)) {
            m6 m6VarF = t4.f(true, (u00.k) null, jVar3, 6, 2);
            Object objN = jVar3.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = q.o(jVar3);
                jVar3.n0(objN);
            }
            z zVar = (z) objN;
            if (aVar == null) {
                r1VarT = jVar3.t();
                if (r1VarT == null) {
                    return;
                }
                final int i3 = 0;
                nVar = new u00.n(aVar, onDismiss, onTerminate, i, i3) {
                    public final int A;
                    public final ry.a B;
                    public final u00.a C;
                    public final u00.a D;

                    {
                        this.A = i3;
                    }

                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        int i4 = this.A;
                        l1.j jVar4 = (l1.j) obj2;
                        ((Integer) obj3).getClass();
                        switch (i4) {
                            case 0:
                                a.d(this.B, this.C, this.D, jVar4, q.K(1));
                                break;
                            default:
                                a.d(this.B, this.C, this.D, jVar4, q.K(1));
                                break;
                        }
                        return g00.b0.a;
                    }
                };
            } else {
                boolean zI = jVar3.i(zVar) | jVar3.g(m6VarF) | ((i2 & 112) == 32);
                Object objN2 = jVar3.N();
                if (zI || objN2 == obj) {
                    objN2 = new c(zVar, m6VarF, onDismiss, 0);
                    jVar3.n0(objN2);
                }
                jVar2 = jVar3;
                t4.a((u00.a) objN2, (r) null, m6VarF, 0.0f, false, (t0) null, dl.a.q, 0L, 0.0f, 0L, (u00.n) null, new cp.a(6), (u4) null, v1.d.d(2047366015, new c0.f(aVar, onTerminate, 2), jVar3), jVar2, 0, 3078, 5050);
            }
            r1VarT.d = nVar;
        }
        jVar2 = jVar3;
        jVar2.V();
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            final int i4 = 1;
            nVar = new u00.n(aVar, onDismiss, onTerminate, i, i4) {
                public final int A;
                public final ry.a B;
                public final u00.a C;
                public final u00.a D;

                {
                    this.A = i4;
                }

                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = this.A;
                    l1.j jVar4 = (l1.j) obj2;
                    ((Integer) obj3).getClass();
                    switch (i5) {
                        case 0:
                            a.d(this.B, this.C, this.D, jVar4, q.K(1));
                            break;
                        default:
                            a.d(this.B, this.C, this.D, jVar4, q.K(1));
                            break;
                    }
                    return g00.b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }

    public static final void e(ry.a aVar, u00.a aVar2, l1.j jVar, int i) {
        u00.a aVar3;
        String strO;
        int i2;
        t0 t0Var;
        r rVar;
        boolean z;
        float f;
        b2.i iVar = b2.b.E;
        g0 g0Var = (g0) jVar;
        g0Var.e0(961082166);
        int i3 = i | (g0Var.g(aVar) ? 4 : 2) | (g0Var.i(aVar2) ? 32 : 16);
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            g0Var.c0(181997051);
            String strT = aVar.h;
            ry.e eVar = aVar.c;
            String str = aVar.g;
            boolean z2 = aVar.f;
            if (r30.k.L0(strT)) {
                if (z2) {
                    g0Var.c0(544026667);
                    strT = z3.T(2131887226, new Object[]{"2.4.1"}, g0Var);
                    g0Var.r(false);
                } else {
                    g0Var.c0(544138484);
                    g0Var.r(false);
                    strT = "";
                }
            }
            g0Var.r(false);
            if (z2) {
                strO = oi.k.o(g0Var, 1347172268, 2131887232, g0Var, false);
            } else {
                g0Var.c0(1347240809);
                g0Var.r(false);
                strO = aVar.d;
            }
            String str2 = strO;
            g0Var.c0(182008700);
            i00.b bVarS = va.a.s();
            if (r30.k.L0(str)) {
                g0Var.c0(-1628884870);
                g0Var.r(false);
            } else {
                g0Var.c0(-1628979048);
                bVarS.add(new g00.k(z3.U(g0Var, 2131887229), str));
                g0Var.r(false);
            }
            if (r30.k.L0(strT)) {
                g0Var.c0(-1628749958);
                g0Var.r(false);
            } else {
                g0Var.c0(-1628843175);
                bVarS.add(new g00.k(z3.U(g0Var, 2131887225), strT));
                g0Var.r(false);
            }
            i00.b bVarK = va.a.k(bVarS);
            g0Var.r(false);
            boolean zE = g0Var.e(eVar.ordinal());
            Object objN = g0Var.N();
            if (zE || objN == l1.i.a) {
                int iOrdinal = eVar.ordinal();
                if (iOrdinal == 0) {
                    i2 = 2131231113;
                } else if (iOrdinal == 1) {
                    i2 = 2131231114;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 2131231111;
                }
                objN = Integer.valueOf(i2);
                g0Var.n0(objN);
            }
            int iIntValue = ((Number) objN).intValue();
            r rVar2 = b2.o.A;
            r rVarD = z1.d(rVar2, 1.0f);
            long j = dl.a.q;
            t0 t0Var2 = b0.b;
            r rVarM = h0.c.M(z.n.f(rVarD, j, t0Var2), h0.c.g);
            float f2 = 16;
            r rVarG = h0.c.G(h0.c.E(rVarM, f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, 24, 7);
            v vVarA = u.a(h0.i.g(8), b2.b.N, g0Var, 54);
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
            q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar2 = b3.h.h;
            q.E(g0Var, eVar2);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            r rVarD2 = z1.d(rVar2, 1.0f);
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarD2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar2);
            q.I(rVarC2, g0Var, fVar4);
            kl.a.a(null, false, g0Var, 48, 1);
            g0Var.r(true);
            m2.b bVarR = y3.R(iIntValue, g0Var, 0);
            long j2 = dl.a.k;
            float f3 = 20;
            o3.a(bVarR, (String) null, z1.m(h0.c.G(rVar2, 0.0f, f3, 0.0f, 0.0f, 13), 40), j2, g0Var, 440, 0);
            float f4 = 12;
            z6.b(aVar.b, h0.c.G(rVar2, 0.0f, f4, 0.0f, 0.0f, 13), j2, kh.o.z(22), q3.u.E, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(26), 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, 1597488, 25008, 238504);
            g0Var = g0Var;
            if (r30.k.L0(str2)) {
                g0Var.c0(-2002062218);
                g0Var.r(false);
            } else {
                g0Var.c0(-2002254418);
                z6.b(str2, (r) null, t.b(0.5f, j2), kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260074);
                g0Var = g0Var;
                g0Var.r(false);
            }
            if (bVarK.isEmpty()) {
                t0Var = t0Var2;
                rVar = rVar2;
                z = true;
                f = 1.0f;
                g0Var.c0(-2001603914);
                g0Var.r(false);
            } else {
                g0Var.c0(-2002014261);
                rVar = rVar2;
                f = 1.0f;
                t0Var = t0Var2;
                r rVarF = z.n.f(f2.h.c(z1.d(h0.c.G(rVar, 0.0f, f3, 0.0f, 0.0f, 13), 1.0f), p0.f.a(f2)), t.b(0.08f, dl.a.i), t0Var);
                v vVarA2 = u.a(h0.i.c, b2.b.M, g0Var, 0);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                r rVarC3 = b2.a.c(rVarF, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(vVarA2, g0Var, fVar);
                q.I(m1VarM3, g0Var, fVar2);
                a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar2);
                q.I(rVarC3, g0Var, fVar4);
                g0Var.c0(1672998179);
                b3.q qVarListIterator = bVarK.listIterator(0);
                while (true) {
                    b3.q qVar = qVarListIterator;
                    if (!qVar.hasNext()) {
                        break;
                    }
                    g00.k kVar = (g00.k) qVar.next();
                    c((String) kVar.A, (String) kVar.B, g0Var, 0);
                }
                z = true;
                x5.z(g0Var, false, true, false);
            }
            if (z2) {
                aVar3 = aVar2;
                g0Var.c0(-2000886698);
                g0Var.r(false);
            } else {
                g0Var.c0(-2001550749);
                aVar3 = aVar2;
                r rVarN = w50.c.n(z.n.f(f2.h.c(z1.e(z1.d(h0.c.G(rVar, 0.0f, f4, 0.0f, 0.0f, 13), f), 52), p0.f.a(32)), t.b(0.08f, dl.a.i), t0Var), z, aVar3);
                w0 w0VarD2 = h0.o.d(iVar, false);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                r rVarC4 = b2.a.c(rVarN, g0Var);
                b3.i.c.getClass();
                b3.g gVar2 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD2, g0Var, b3.h.f);
                q.I(m1VarM4, g0Var, b3.h.e);
                q.I(Integer.valueOf(iHashCode4), g0Var, b3.h.g);
                q.E(g0Var, b3.h.h);
                q.I(rVarC4, g0Var, b3.h.d);
                g0 g0Var2 = g0Var;
                z6.b(z3.U(g0Var, 2131887234), (r) null, dl.a.k, kh.o.z(16), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1597440, 0, 262058);
                g0Var = g0Var2;
                g0Var.r(z);
                g0Var.r(false);
            }
            g0Var.r(z);
        } else {
            aVar3 = aVar2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new al.i(aVar, aVar3, i, 6);
        }
    }

    public static final void f(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(2004364665);
        if (g0Var.S(i & 1, i != 0)) {
            b2.o oVar = b2.o.A;
            float f = 16;
            r rVarC = h0.c.C(z1.d(oVar, 1.0f), f);
            v1 v1VarA = t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
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
            q.I(rVarC2, g0Var, fVar4);
            h0.o.a(rd.a.g0(22, 6, 0L, f2.h.c(z1.m(oVar, 44), p0.f.a), false), g0Var, 0);
            v vVarA = u.a(h0.i.g(4), b2.b.M, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC3 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC3, g0Var, fVar4);
            float f2 = 6;
            h0.o.a(rd.a.g0(f2, 6, 0L, z1.n(oVar, 160, f), false), g0Var, 0);
            h0.o.a(rd.a.g0(f2, 6, 0L, z1.n(oVar, 120, 13), false), g0Var, 0);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new cp.a(i, 7);
        }
    }

    public static final void g(ry.a device, m3.h hVar, u00.a onClick, l1.j jVar, int i) {
        int i2;
        int i3;
        boolean z;
        kotlin.jvm.internal.m.e(device, "device");
        ry.e eVar = device.c;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(889604946);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(device) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.g(hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(onClick) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            boolean zE = g0Var.e(eVar.ordinal());
            Object objN = g0Var.N();
            if (zE || objN == l1.i.a) {
                int iOrdinal = eVar.ordinal();
                if (iOrdinal == 0) {
                    i3 = 2131231113;
                } else if (iOrdinal == 1) {
                    i3 = 2131231114;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 2131231111;
                }
                objN = Integer.valueOf(i3);
                g0Var.n0(objN);
            }
            int iIntValue = ((Number) objN).intValue();
            b2.o oVar = b2.o.A;
            r rVarC = h0.c.C(w50.c.n(z1.d(oVar, 1.0f), true, onClick), 16);
            v1 v1VarA = t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
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
            b3.f fVar = b3.h.f;
            q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar2 = b3.h.h;
            q.E(g0Var, eVar2);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC2, g0Var, fVar4);
            r rVarF = z.n.f(f2.h.c(z1.m(oVar, 44), p0.f.a), t.b(0.12f, dl.a.i), b0.b);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC3 = b2.a.c(rVarF, g0Var);
            g0Var.g0();
            int i4 = i2;
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar2);
            q.I(rVarC3, g0Var, fVar4);
            m2.b bVarR = y3.R(iIntValue, g0Var, 0);
            long j = dl.a.k;
            o3.a(bVarR, (String) null, z1.m(oVar, 22), j, g0Var, 440, 0);
            g0Var.r(true);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v vVarA = u.a(h0.i.g(4), b2.b.M, g0Var, 6);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC4 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar);
            q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar2);
            q.I(rVarC4, g0Var, fVar4);
            z6.b(device.b, (r) null, j, kh.o.z(16), q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 239530);
            g0Var = g0Var;
            if (hVar.B.length() > 0) {
                g0Var.c0(-1743557448);
                z = true;
                z6.c(hVar, (r) null, t.b(0.5f, j), kh.o.z(13), (q3.u) null, 0L, (x3.k) null, kh.o.z(18), 2, false, 1, 0, (Map) null, (u00.k) null, (r0) null, g0Var, ((i4 >> 3) & 14) | 24576, 25008, 501738);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                z = true;
                g0Var.c0(-1743268714);
                g0Var.r(false);
            }
            g0Var.r(z);
            g0Var.r(z);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.f(i, 3, device, hVar, onClick);
        }
    }

    public static final void h(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(2084687309);
        if (g0Var.S(i & 1, (i & 3) != 2)) {
            r rVarF = z.n.f(f2.h.c(z1.d(b2.o.A, 1.0f), p0.f.a(24)), t.b(0.08f, dl.a.i), b0.b);
            v vVarA = u.a(h0.i.c, b2.b.M, g0Var, 0);
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
            q.I(vVarA, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            g0Var.c0(1505660927);
            for (int i2 = 0; i2 < 2; i2++) {
                f(g0Var, 0);
            }
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new cp.a(i, 9);
        }
    }

    public static final void i(r rVar, l1.j jVar, int i) {
        l1.j jVar2;
        r rVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-356391043);
        int i2 = i | 6;
        if (jVar3.S(i2 & 1, (i2 & 3) != 2)) {
            r rVar3 = b2.o.A;
            float f = 24;
            jVar2 = jVar3;
            z6.b(z3.U(jVar3, 2131887231), h0.c.D(z.n.f(f2.h.c(z1.d(rVar3, 1.0f), p0.f.a(f)), t.b(0.08f, dl.a.i), b0.b), 16, f), t.b(0.5f, dl.a.k), kh.o.z(15), q3.u.B, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, 1597440, 48, 258984);
            rVar2 = rVar3;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar2, i, 3);
        }
    }

    public static final void j(r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1742333795);
        int i2 = (g0Var.g(rVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            h0.f fVarG = h0.i.g(20);
            b2.g gVar = b2.b.M;
            v vVarA = u.a(fVarG, gVar, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVar, g0Var);
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
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            b(g0Var, 0);
            v vVarA2 = u.a(h0.i.c, gVar, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.o oVar = b2.o.A;
            r rVarC2 = b2.a.c(oVar, g0Var);
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
            h0.o.a(rd.a.g0(6, 6, 0L, z1.n(h0.c.G(oVar, 0.0f, 8, 0.0f, 16, 5), 140, 15), false), g0Var, 0);
            h(g0Var, 6);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar, i, 4);
        }
    }

    public static final void k(final boolean z, final boolean z2, final u00.a onDismiss, final u00.a onConfirm, l1.j jVar, final int i) {
        l1.j jVar2;
        r1 r1VarT;
        u00.n nVar;
        Object lVar;
        m6 m6Var;
        u00.a aVar;
        boolean z3;
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.e(onConfirm, "onConfirm");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(986416226);
        int i2 = i | (jVar3.h(z) ? 4 : 2) | (jVar3.h(z2) ? 32 : 16) | (jVar3.e(2131887240) ? 256 : 128) | (jVar3.e(2131887238) ? 2048 : 1024) | (jVar3.i(onDismiss) ? 16384 : 8192) | (jVar3.i(onConfirm) ? 131072 : 65536);
        if (jVar3.S(i2 & 1, (74899 & i2) != 74898)) {
            m6 m6VarF = t4.f(true, (u00.k) null, jVar3, 6, 2);
            Object objN = jVar3.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = q.o(jVar3);
                jVar3.n0(objN);
            }
            z zVar = (z) objN;
            if (z) {
                boolean zI = ((i2 & 112) == 32) | jVar3.i(zVar) | jVar3.g(m6VarF) | ((i2 & 57344) == 16384);
                Object objN2 = jVar3.N();
                if (zI || objN2 == obj) {
                    lVar = new l(zVar, m6VarF, onDismiss, z2, 0);
                    m6Var = m6VarF;
                    aVar = onDismiss;
                    z3 = z2;
                    jVar3.n0(lVar);
                } else {
                    aVar = onDismiss;
                    lVar = objN2;
                    m6Var = m6VarF;
                    z3 = z2;
                }
                jVar2 = jVar3;
                t4.a((u00.a) lVar, (r) null, m6Var, 0.0f, false, (t0) null, dl.a.q, 0L, 0.0f, 0L, (u00.n) null, new cp.a(10), (u4) null, v1.d.d(-967541696, new m(z3, onConfirm, aVar, 0), jVar3), jVar2, 0, 3078, 5050);
            } else {
                r1VarT = jVar3.t();
                if (r1VarT == null) {
                    return;
                }
                final int i3 = 0;
                nVar = new u00.n(z, z2, onDismiss, onConfirm, i, i3) {
                    public final int A;
                    public final boolean B;
                    public final boolean C;
                    public final u00.a D;
                    public final u00.a E;

                    {
                        this.A = i3;
                    }

                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (this.A) {
                            case 0:
                                ((Integer) obj3).getClass();
                                int iK = q.K(1);
                                a.k(this.B, this.C, this.D, this.E, (l1.j) obj2, iK);
                                break;
                            default:
                                ((Integer) obj3).getClass();
                                int iK2 = q.K(1);
                                a.k(this.B, this.C, this.D, this.E, (l1.j) obj2, iK2);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
            }
            r1VarT.d = nVar;
        }
        jVar2 = jVar3;
        jVar2.V();
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            final int i4 = 1;
            nVar = new u00.n(z, z2, onDismiss, onConfirm, i, i4) {
                public final int A;
                public final boolean B;
                public final boolean C;
                public final u00.a D;
                public final u00.a E;

                {
                    this.A = i4;
                }

                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    switch (this.A) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int iK = q.K(1);
                            a.k(this.B, this.C, this.D, this.E, (l1.j) obj2, iK);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int iK2 = q.K(1);
                            a.k(this.B, this.C, this.D, this.E, (l1.j) obj2, iK2);
                            break;
                    }
                    return g00.b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }

    public static final void l(final boolean z, final String message, final boolean z2, final u00.a onDismiss, final u00.a onConfirm, l1.j jVar, final int i) {
        int i2;
        String str;
        boolean z3;
        u00.a aVar;
        r1 r1VarT;
        u00.n nVar;
        kotlin.jvm.internal.m.e(message, "message");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.e(onConfirm, "onConfirm");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1978603605);
        if ((i & 6) == 0) {
            i2 = (g0Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.g(message) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.i(onDismiss) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var.i(onConfirm) ? 16384 : 8192;
        }
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                str = message;
                z3 = z2;
                aVar = onConfirm;
                wr.k.H(null, null, onDismiss, z1.q(b2.o.A, 320), dl.a.A, null, null, v1.d.d(816083530, new c00.l(str, z3, aVar, onDismiss), g0Var), g0Var, ((i2 >> 3) & 896) | 12586038, 96);
            } else {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                }
                final int i3 = 0;
                nVar = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i3) {
                            case 0:
                                ((Integer) obj2).getClass();
                                a.l(z, message, z2, onDismiss, onConfirm, (l1.j) obj, q.K(i | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                a.l(z, message, z2, onDismiss, onConfirm, (l1.j) obj, q.K(i | 1));
                                break;
                        }
                        return g00.b0.a;
                    }
                };
            }
            r1VarT.d = nVar;
        }
        str = message;
        z3 = z2;
        aVar = onConfirm;
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i4 = 1;
            final String str2 = str;
            final boolean z4 = z3;
            final u00.a aVar2 = aVar;
            nVar = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            ((Integer) obj2).getClass();
                            a.l(z, str2, z4, onDismiss, aVar2, (l1.j) obj, q.K(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            a.l(z, str2, z4, onDismiss, aVar2, (l1.j) obj, q.K(i | 1));
                            break;
                    }
                    return g00.b0.a;
                }
            };
            r1VarT.d = nVar;
        }
    }
}
