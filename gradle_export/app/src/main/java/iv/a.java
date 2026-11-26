package iv;

import ab.a0;
import c3.o1;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.o3;
import g1.z6;
import gv.y;
import h0.c1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.x1;
import h0.z1;
import h1.v0;
import i2.o0;
import i2.t;
import j0.x;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z0;
import m3.h0;
import m3.p0;
import m3.r0;
import m3.z;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new ax.a(22), -1759388117, false);

    public static final void a(yu.a aVar, boolean z, m mVar, b2.r rVar, l1.j jVar, int i, int i2) {
        yu.a aVar2;
        int i3;
        b2.r rVar2;
        boolean z2;
        r1 r1VarT;
        b2.r rVar3;
        b2.r rVar4;
        b3.g gVar;
        l1.j jVar2 = (g0) jVar;
        jVar2.e0(-458599284);
        if ((i & 6) == 0) {
            aVar2 = aVar;
            i3 = (jVar2.g(aVar2) ? 4 : 2) | i;
        } else {
            aVar2 = aVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= jVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= jVar2.g(mVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                rVar2 = rVar;
                i3 |= jVar2.g(rVar2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (jVar2.S(i3 & 1, z2)) {
                rVar3 = b2.o.A;
                if (i4 != 0) {
                    rVar4 = rVar3;
                } else {
                    rVar4 = rVar2;
                }
                b2.r rVarD = z1.d(rVar4, 1.0f);
                v vVarA = u.a(h0.i.c, b2.b.M, jVar2, 0);
                int iHashCode = Long.hashCode(((g0) jVar2).T);
                m1 m1VarM = jVar2.m();
                b2.r rVarC = b2.a.c(rVarD, jVar2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar2.g0();
                if (((g0) jVar2).S) {
                    jVar2.l(gVar);
                } else {
                    jVar2.q0();
                }
                l1.q.I(vVarA, jVar2, b3.h.f);
                l1.q.I(m1VarM, jVar2, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), jVar2, b3.h.g);
                l1.q.E(jVar2, b3.h.h);
                l1.q.I(rVarC, jVar2, b3.h.d);
                z6.b(z3.U(jVar2, 2131887086), h0.c.G(rVar3, 0.0f, 12, 0.0f, 8, 5), t.b(0.5f, dl.a.i), kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, 24624, 48, 260072);
                int i5 = i3;
                jVar2 = jVar2;
                c(aVar2, mVar.a, mVar.b, f2.h.a(rVar3, z ? 1.0f : 0.35f), z, jVar2, ((i5 << 9) & 57344) | (i5 & 14));
                jVar2.r(true);
                rVar2 = rVar4;
            } else {
                jVar2.V();
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new y(aVar, z, mVar, rVar2, i, i2);
            }
        }
        i3 |= 3072;
        rVar2 = rVar;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (jVar2.S(i3 & 1, z2)) {
            rVar3 = b2.o.A;
            if (i4 != 0) {
                rVar4 = rVar3;
            } else {
                rVar4 = rVar2;
            }
            b2.r rVarD2 = z1.d(rVar4, 1.0f);
            v vVarA2 = u.a(h0.i.c, b2.b.M, jVar2, 0);
            int iHashCode2 = Long.hashCode(((g0) jVar2).T);
            m1 m1VarM2 = jVar2.m();
            b2.r rVarC2 = b2.a.c(rVarD2, jVar2);
            b3.i.c.getClass();
            gVar = b3.h.b;
            jVar2.g0();
            if (((g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            l1.q.I(vVarA2, jVar2, b3.h.f);
            l1.q.I(m1VarM2, jVar2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode2), jVar2, b3.h.g);
            l1.q.E(jVar2, b3.h.h);
            l1.q.I(rVarC2, jVar2, b3.h.d);
            z6.b(z3.U(jVar2, 2131887086), h0.c.G(rVar3, 0.0f, 12, 0.0f, 8, 5), t.b(0.5f, dl.a.i), kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, 24624, 48, 260072);
            int i6 = i3;
            jVar2 = jVar2;
            c(aVar2, mVar.a, mVar.b, f2.h.a(rVar3, z ? 1.0f : 0.35f), z, jVar2, ((i6 << 9) & 57344) | (i6 & 14));
            jVar2.r(true);
            rVar2 = rVar4;
        } else {
            jVar2.V();
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new y(aVar, z, mVar, rVar2, i, i2);
        }
    }

    public static final void b(final u30.b bVar, final int i, final int i2, final u00.k kVar, final float f, final boolean z, l1.j jVar, final int i3) {
        int i4;
        g0 g0Var;
        j0.v vVar;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-609642724);
        if ((i3 & 6) == 0) {
            i4 = (g0Var2.g(bVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= g0Var2.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= g0Var2.e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= g0Var2.i(kVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= g0Var2.d(f) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= g0Var2.h(z) ? 131072 : 65536;
        }
        if (g0Var2.S(i4 & 1, (74899 & i4) != 74898)) {
            int iZ = a0.z(i - ((Number) h00.q.L0(bVar)).intValue(), va.a.L(bVar));
            j0.v vVarA = x.a(iZ, g0Var2, 2);
            y3.c cVar = (y3.c) g0Var2.k(o1.h);
            float fA0 = cVar.A0(r.f);
            float f2 = r.c;
            float fA1 = cVar.A0(f2);
            boolean zG = g0Var2.g(vVarA) | g0Var2.d(fA1);
            Object objN = g0Var2.N();
            Object obj = l1.i.a;
            if (zG || objN == obj) {
                objN = l1.q.r(new b(vVarA, fA1, 0));
                g0Var2.n0(objN);
            }
            p2 p2Var = (p2) objN;
            z0 z0VarG = l1.q.G(Integer.valueOf(a0.z(i2 - ((Number) h00.q.L0(bVar)).intValue(), va.a.L(bVar))), g0Var2);
            Integer numValueOf = Integer.valueOf(iZ);
            boolean zG2 = g0Var2.g(vVarA) | g0Var2.d(fA1) | g0Var2.e(iZ);
            Object objN2 = g0Var2.N();
            if (zG2 || objN2 == obj) {
                objN2 = new e(vVarA, fA1, iZ, null);
                g0Var2.n0(objN2);
            }
            l1.q.i(numValueOf, g0Var2, (u00.n) objN2);
            boolean zG3 = g0Var2.g(vVarA) | g0Var2.d(fA1) | g0Var2.g(z0VarG);
            Object objN3 = g0Var2.N();
            if (zG3 || objN3 == obj) {
                objN3 = new f1.g(vVarA, fA1, z0VarG, (k00.c) null, 1);
                vVar = vVarA;
                g0Var2.n0(objN3);
            } else {
                vVar = vVarA;
            }
            l1.q.i(vVar, g0Var2, (u00.n) objN3);
            float f3 = r.n;
            b2.o oVar = b2.o.A;
            b2.r rVarW = ca.v.w(h0.c.A(z1.q(oVar, f3), f, 0.0f, 2), 0.0f, fA0, 0.0f, fA0);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarW, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD, g0Var2, b3.h.f);
            l1.q.I(m1VarM, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC, g0Var2, b3.h.d);
            int i5 = i4 & 14;
            boolean z2 = (i5 == 4) | ((i4 & 7168) == 2048);
            Object objN4 = g0Var2.N();
            if (z2 || objN4 == obj) {
                objN4 = new v0(kVar, bVar, 9);
                g0Var2.n0(objN4);
            }
            int i6 = i4;
            long j = t.f;
            f50.k.g(bVar, iZ, (u00.k) objN4, z1.d(oVar, 1.0f), v1.d.d(-1674405807, new c(bVar, p2Var, 0), g0Var2), f2, 5, 0, j, j, false, z, vVar, false, null, false, z, g0Var2, i5 | 920349696, ((i6 >> 12) & 112) | 199686 | ((i6 << 3) & 3670016), 16384);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    a.b(bVar, i, i2, kVar, f, z, (l1.j) obj2, l1.q.K(i3 | 1));
                    return b0.a;
                }
            };
        }
    }

    public static final void c(yu.a draft, hv.j jVar, hv.j jVar2, b2.r rVar, boolean z, l1.j jVar3, int i) {
        int i2;
        String str;
        Object objT;
        kotlin.jvm.internal.m.e(draft, "draft");
        z00.e eVar = draft.a;
        g0 g0Var = (g0) jVar3;
        g0Var.e0(1003418772);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(draft) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(jVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(jVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.g(rVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= g0Var.h(z) ? 16384 : 8192;
        }
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zG = g0Var.g(eVar);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zG || objN == obj) {
                objN = g4.d0(h00.q.n1(eVar));
                g0Var.n0(objN);
            }
            u30.b bVar = (u30.b) objN;
            String strU = z3.U(g0Var, 2131887089);
            p0 p0VarI = h0.i(g0Var);
            y3.c cVar = (y3.c) g0Var.k(o1.h);
            boolean zG2 = g0Var.g(strU) | g0Var.g(cVar);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == obj) {
                str = strU;
                objT = oi.k.t(a0.C(new y3.f(cVar.h0((int) (p0.a(p0VarI, str, new r0(0L, r.o, (q3.u) null, (q3.i) null, 0L, 0L, 0, 0, 0L, (z) null, 16777213), 1, 0L, 1004).c >> 32)) + 2), new y3.f(r.l), new y3.f(r.m)).A, g0Var);
            } else {
                str = strU;
                objT = objN2;
            }
            float f = ((y3.f) objT).A;
            float f2 = f - r.l;
            float f3 = (-f2) / 2;
            b2.r rVarC = f2.h.c(z1.e(z1.d(rVar, 1.0f), r.a), p0.f.a(24));
            long j = dl.a.i;
            long jB = t.b(0.05f, j);
            o0 o0Var = i2.b0.b;
            b2.r rVarE = h0.c.E(z.n.f(rVarC, jB, o0Var), r.b, 0.0f, 2);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            h0.o.a(z.n.f(f2.h.c(z1.e(z1.d(b2.o.A, 1.0f), r.d), p0.f.a(r.e)), t.b(0.1f, j), o0Var), g0Var, 0);
            int i3 = (i2 << 6) & 7168;
            int i4 = i2 << 3;
            b(bVar, draft.b, ((Number) h00.q.L0(bVar)).intValue(), jVar, r.h + f3, z, g0Var, i3 | (458752 & i4));
            b(bVar, draft.c, draft.b, jVar2, r.j + f2 + f3, z, g0Var, i4 & 465920);
            l(z3.U(g0Var, 2131887078), r.g + f3, r.k, g0Var, 384);
            l(str, r.i + f2 + f3, f, g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.r(draft, jVar, jVar2, rVar, z, i);
        }
    }

    public static final void d(su.e value, u00.k onValueChange, b2.r rVar, l1.j jVar, int i) {
        int i2;
        b2.r rVar2;
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(onValueChange, "onValueChange");
        g0 g0Var = (g0) jVar;
        g0Var.e0(151037240);
        if ((i & 6) == 0) {
            i2 = i | (g0Var.e(value.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onValueChange) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            b2.r rVar3 = b2.o.A;
            b2.r rVarC = f2.h.c(z1.e(z1.d(rVar3, 1.0f), 64), p0.f.a(24));
            long j = dl.a.i;
            b2.r rVarE = h0.c.E(z.n.f(rVarC, t.b(0.08f, j), i2.b0.b), 16, 0.0f, 2);
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC2, g0Var, fVar4);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(z3.U(g0Var, 2131887085), new c1(1.0f, true), j, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 24576, 24960, 241640);
            n00.b bVar = su.e.E;
            int i4 = (i3 << 3) & 896;
            k(2131231207, (su.e) h00.q.O0(value.ordinal() - 1, bVar), onValueChange, g0Var, i4);
            b2.i iVar = b2.b.E;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVar3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            z6.b("80x", f2.h.a(rVar3, 0.0f), 0L, kh.o.z(17), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597494, 0, 262060);
            g0Var = g0Var;
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = new hx.t(7);
                g0Var.n0(objN);
            }
            w.m.a(value, (b2.r) null, (u00.k) objN, iVar, "memorizationRepeatCount", (u00.k) null, a, g0Var, (i3 & 14) | 1600896, 34);
            g0Var.r(true);
            k(2131231361, (su.e) h00.q.O0(value.ordinal() + 1, bVar), onValueChange, g0Var, i4);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.f(value, onValueChange, rVar2, i, 9);
        }
    }

    public static final void e(yu.a draft, boolean z, m callbacks, b2.r rVar, boolean z2, l1.j jVar, int i, int i2) {
        boolean z3;
        int i3;
        boolean z4;
        g0 g0Var;
        boolean z5;
        r1 r1VarT;
        b2.o oVar;
        b3.g gVar;
        boolean z6;
        b3.g gVar2;
        boolean z7;
        b2.g gVar3 = b2.b.M;
        kotlin.jvm.internal.m.e(draft, "draft");
        su.e eVar = draft.d;
        su.c cVar = draft.e;
        kotlin.jvm.internal.m.e(callbacks, "callbacks");
        hv.j jVar2 = callbacks.c;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(2137210819);
        int i4 = (g0Var2.g(draft) ? 4 : 2) | i | (g0Var2.h(z) ? 32 : 16) | (g0Var2.g(callbacks) ? 256 : 128) | (g0Var2.g(rVar) ? 2048 : 1024);
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                i4 |= g0Var2.h(z3) ? 16384 : 8192;
            }
            i3 = i4;
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (g0Var2.S(i3 & 1, z4)) {
                if (i5 != 0) {
                    z3 = false;
                }
                oVar = b2.o.A;
                if (z3) {
                    g0Var2.c0(1052567809);
                    v vVarA = u.a(h0.i.g(16), gVar3, g0Var2, 6);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    b2.r rVarC = b2.a.c(rVar, g0Var2);
                    b3.i.c.getClass();
                    gVar2 = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    b3.f fVar = b3.h.f;
                    l1.q.I(vVarA, g0Var2, fVar);
                    b3.f fVar2 = b3.h.e;
                    l1.q.I(m1VarM, g0Var2, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.g;
                    l1.q.I(numValueOf, g0Var2, fVar3);
                    b3.e eVar2 = b3.h.h;
                    l1.q.E(g0Var2, eVar2);
                    b3.f fVar4 = b3.h.d;
                    l1.q.I(rVarC, g0Var2, fVar4);
                    float f = 24;
                    h0.f fVarG = h0.i.g(f);
                    b2.h hVar = b2.b.J;
                    v1 v1VarA = t1.a(fVarG, hVar, g0Var2, 6);
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    m1 m1VarM2 = g0Var2.m();
                    b2.r rVarC2 = b2.a.c(oVar, g0Var2);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(v1VarA, g0Var2, fVar);
                    l1.q.I(m1VarM2, g0Var2, fVar2);
                    a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar2);
                    l1.q.I(rVarC2, g0Var2, fVar4);
                    x1 x1Var = x1.a;
                    b2.r rVarA = x1Var.a(oVar);
                    v vVarA2 = u.a(h0.i.g(f), gVar3, g0Var2, 6);
                    int iHashCode3 = Long.hashCode(g0Var2.T);
                    m1 m1VarM3 = g0Var2.m();
                    b2.r rVarC3 = b2.a.c(rVarA, g0Var2);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(vVarA2, g0Var2, fVar);
                    l1.q.I(m1VarM3, g0Var2, fVar2);
                    a1.b.v(iHashCode3, g0Var2, fVar3, g0Var2, eVar2);
                    l1.q.I(rVarC3, g0Var2, fVar4);
                    if (cVar != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    j(0, g0Var2, z7);
                    d(eVar, jVar2, null, g0Var2, 0);
                    g0Var2.r(true);
                    int i6 = i3 & 14;
                    a(draft, z, callbacks, x1Var.a(oVar), g0Var2, i3 & 1022, 0);
                    g0Var = g0Var2;
                    g0Var.r(true);
                    v1 v1VarA2 = t1.a(h0.i.g(12), hVar, g0Var, 6);
                    int iHashCode4 = Long.hashCode(g0Var.T);
                    m1 m1VarM4 = g0Var.m();
                    b2.r rVarC4 = b2.a.c(oVar, g0Var);
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar2);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(v1VarA2, g0Var, fVar);
                    l1.q.I(m1VarM4, g0Var, fVar2);
                    a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar2);
                    l1.q.I(rVarC4, g0Var, fVar4);
                    int i7 = i6 | ((i3 >> 3) & 112);
                    h(draft, callbacks, x1Var.a(oVar), g0Var, i7, 0);
                    f(draft, callbacks, x1Var.a(oVar), g0Var, i7, 0);
                    x5.z(g0Var, true, true, false);
                } else {
                    g0Var2.c0(1053893772);
                    v vVarA3 = u.a(h0.i.g(24), gVar3, g0Var2, 6);
                    int iHashCode5 = Long.hashCode(g0Var2.T);
                    m1 m1VarM5 = g0Var2.m();
                    b2.r rVarC5 = b2.a.c(rVar, g0Var2);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    b3.f fVar5 = b3.h.f;
                    l1.q.I(vVarA3, g0Var2, fVar5);
                    b3.f fVar6 = b3.h.e;
                    l1.q.I(m1VarM5, g0Var2, fVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode5);
                    b3.f fVar7 = b3.h.g;
                    l1.q.I(numValueOf2, g0Var2, fVar7);
                    b3.e eVar3 = b3.h.h;
                    l1.q.E(g0Var2, eVar3);
                    b3.f fVar8 = b3.h.d;
                    l1.q.I(rVarC5, g0Var2, fVar8);
                    if (cVar != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    j(0, g0Var2, z6);
                    v vVarA4 = u.a(h0.i.g(16), gVar3, g0Var2, 6);
                    int iHashCode6 = Long.hashCode(g0Var2.T);
                    m1 m1VarM6 = g0Var2.m();
                    b2.r rVarC6 = b2.a.c(oVar, g0Var2);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(vVarA4, g0Var2, fVar5);
                    l1.q.I(m1VarM6, g0Var2, fVar6);
                    a1.b.v(iHashCode6, g0Var2, fVar7, g0Var2, eVar3);
                    l1.q.I(rVarC6, g0Var2, fVar8);
                    d(eVar, jVar2, null, g0Var2, 0);
                    int i8 = i3 & 14;
                    a(draft, z, callbacks, null, g0Var2, i3 & 1022, 8);
                    g0Var = g0Var2;
                    g0Var.r(true);
                    v vVarA5 = u.a(h0.i.g(12), gVar3, g0Var, 6);
                    int iHashCode7 = Long.hashCode(g0Var.T);
                    m1 m1VarM7 = g0Var.m();
                    b2.r rVarC7 = b2.a.c(oVar, g0Var);
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA5, g0Var, fVar5);
                    l1.q.I(m1VarM7, g0Var, fVar6);
                    a1.b.v(iHashCode7, g0Var, fVar7, g0Var, eVar3);
                    l1.q.I(rVarC7, g0Var, fVar8);
                    int i9 = i8 | ((i3 >> 3) & 112);
                    f(draft, callbacks, null, g0Var, i9, 4);
                    h(draft, callbacks, null, g0Var, i9, 4);
                    x5.z(g0Var, true, true, false);
                }
                z5 = z3;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                z5 = z3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new g1.h0(draft, z, callbacks, rVar, z5, i, i2);
            }
        }
        i4 |= 24576;
        z3 = z2;
        i3 = i4;
        if ((i3 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (g0Var2.S(i3 & 1, z4)) {
            if (i5 != 0) {
                z3 = false;
            }
            oVar = b2.o.A;
            if (z3) {
                g0Var2.c0(1052567809);
                v vVarA6 = u.a(h0.i.g(16), gVar3, g0Var2, 6);
                int iHashCode8 = Long.hashCode(g0Var2.T);
                m1 m1VarM8 = g0Var2.m();
                b2.r rVarC8 = b2.a.c(rVar, g0Var2);
                b3.i.c.getClass();
                gVar2 = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar2);
                } else {
                    g0Var2.q0();
                }
                b3.f fVar9 = b3.h.f;
                l1.q.I(vVarA6, g0Var2, fVar9);
                b3.f fVar10 = b3.h.e;
                l1.q.I(m1VarM8, g0Var2, fVar10);
                Integer numValueOf3 = Integer.valueOf(iHashCode8);
                b3.f fVar11 = b3.h.g;
                l1.q.I(numValueOf3, g0Var2, fVar11);
                b3.e eVar4 = b3.h.h;
                l1.q.E(g0Var2, eVar4);
                b3.f fVar12 = b3.h.d;
                l1.q.I(rVarC8, g0Var2, fVar12);
                float f2 = 24;
                h0.f fVarG2 = h0.i.g(f2);
                b2.h hVar2 = b2.b.J;
                v1 v1VarA3 = t1.a(fVarG2, hVar2, g0Var2, 6);
                int iHashCode9 = Long.hashCode(g0Var2.T);
                m1 m1VarM9 = g0Var2.m();
                b2.r rVarC9 = b2.a.c(oVar, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar2);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(v1VarA3, g0Var2, fVar9);
                l1.q.I(m1VarM9, g0Var2, fVar10);
                a1.b.v(iHashCode9, g0Var2, fVar11, g0Var2, eVar4);
                l1.q.I(rVarC9, g0Var2, fVar12);
                x1 x1Var2 = x1.a;
                b2.r rVarA2 = x1Var2.a(oVar);
                v vVarA7 = u.a(h0.i.g(f2), gVar3, g0Var2, 6);
                int iHashCode10 = Long.hashCode(g0Var2.T);
                m1 m1VarM10 = g0Var2.m();
                b2.r rVarC10 = b2.a.c(rVarA2, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar2);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(vVarA7, g0Var2, fVar9);
                l1.q.I(m1VarM10, g0Var2, fVar10);
                a1.b.v(iHashCode10, g0Var2, fVar11, g0Var2, eVar4);
                l1.q.I(rVarC10, g0Var2, fVar12);
                if (cVar != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                j(0, g0Var2, z7);
                d(eVar, jVar2, null, g0Var2, 0);
                g0Var2.r(true);
                int i11 = i3 & 14;
                a(draft, z, callbacks, x1Var2.a(oVar), g0Var2, i3 & 1022, 0);
                g0Var = g0Var2;
                g0Var.r(true);
                v1 v1VarA4 = t1.a(h0.i.g(12), hVar2, g0Var, 6);
                int iHashCode11 = Long.hashCode(g0Var.T);
                m1 m1VarM11 = g0Var.m();
                b2.r rVarC11 = b2.a.c(oVar, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(v1VarA4, g0Var, fVar9);
                l1.q.I(m1VarM11, g0Var, fVar10);
                a1.b.v(iHashCode11, g0Var, fVar11, g0Var, eVar4);
                l1.q.I(rVarC11, g0Var, fVar12);
                int i12 = i11 | ((i3 >> 3) & 112);
                h(draft, callbacks, x1Var2.a(oVar), g0Var, i12, 0);
                f(draft, callbacks, x1Var2.a(oVar), g0Var, i12, 0);
                x5.z(g0Var, true, true, false);
            } else {
                g0Var2.c0(1053893772);
                v vVarA8 = u.a(h0.i.g(24), gVar3, g0Var2, 6);
                int iHashCode12 = Long.hashCode(g0Var2.T);
                m1 m1VarM12 = g0Var2.m();
                b2.r rVarC12 = b2.a.c(rVar, g0Var2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                b3.f fVar13 = b3.h.f;
                l1.q.I(vVarA8, g0Var2, fVar13);
                b3.f fVar14 = b3.h.e;
                l1.q.I(m1VarM12, g0Var2, fVar14);
                Integer numValueOf4 = Integer.valueOf(iHashCode12);
                b3.f fVar15 = b3.h.g;
                l1.q.I(numValueOf4, g0Var2, fVar15);
                b3.e eVar5 = b3.h.h;
                l1.q.E(g0Var2, eVar5);
                b3.f fVar16 = b3.h.d;
                l1.q.I(rVarC12, g0Var2, fVar16);
                if (cVar != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                j(0, g0Var2, z6);
                v vVarA9 = u.a(h0.i.g(16), gVar3, g0Var2, 6);
                int iHashCode13 = Long.hashCode(g0Var2.T);
                m1 m1VarM13 = g0Var2.m();
                b2.r rVarC13 = b2.a.c(oVar, g0Var2);
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(vVarA9, g0Var2, fVar13);
                l1.q.I(m1VarM13, g0Var2, fVar14);
                a1.b.v(iHashCode13, g0Var2, fVar15, g0Var2, eVar5);
                l1.q.I(rVarC13, g0Var2, fVar16);
                d(eVar, jVar2, null, g0Var2, 0);
                int i13 = i3 & 14;
                a(draft, z, callbacks, null, g0Var2, i3 & 1022, 8);
                g0Var = g0Var2;
                g0Var.r(true);
                v vVarA10 = u.a(h0.i.g(12), gVar3, g0Var, 6);
                int iHashCode14 = Long.hashCode(g0Var.T);
                m1 m1VarM14 = g0Var.m();
                b2.r rVarC14 = b2.a.c(oVar, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA10, g0Var, fVar13);
                l1.q.I(m1VarM14, g0Var, fVar14);
                a1.b.v(iHashCode14, g0Var, fVar15, g0Var, eVar5);
                l1.q.I(rVarC14, g0Var, fVar16);
                int i14 = i13 | ((i3 >> 3) & 112);
                f(draft, callbacks, null, g0Var, i14, 4);
                h(draft, callbacks, null, g0Var, i14, 4);
                x5.z(g0Var, true, true, false);
            }
            z5 = z3;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            z5 = z3;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.h0(draft, z, callbacks, rVar, z5, i, i2);
        }
    }

    public static final void f(yu.a aVar, m mVar, b2.r rVar, l1.j jVar, int i, int i2) {
        int i3;
        b2.r rVar2;
        boolean z;
        b2.r rVar3;
        r1 r1VarT;
        su.e eVar;
        int i4;
        int i5;
        su.c cVar;
        Object cVar2;
        float f;
        int i6;
        boolean z2;
        boolean zI;
        Object objN;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1613049512);
        if ((i & 6) == 0) {
            i3 = (g0Var.g(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.g(mVar) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                rVar2 = rVar;
                i3 |= g0Var.g(rVar2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                if (i7 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                eVar = aVar.d;
                i4 = aVar.c;
                i5 = aVar.b;
                cVar = aVar.e;
                if (cVar == null && new su.b(i5, i4).equals(cVar.a)) {
                    cVar2 = eVar != cVar.b ? new yu.d(eVar) : null;
                } else {
                    cVar2 = new yu.c(new su.c(new su.b(i5, i4), eVar));
                }
                if (cVar2 == null) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                b2.r rVarA = f2.h.a(rVar3, f);
                if (cVar != null) {
                    i6 = 2131887091;
                } else {
                    i6 = 2131887071;
                }
                String strU = z3.U(g0Var, i6);
                long j = dl.a.L;
                long j2 = dl.a.i;
                if (cVar2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zI = g0Var.i(cVar2) | ((i3 & 112) == 32);
                objN = g0Var.N();
                if (zI || objN == l1.i.a) {
                    objN = new a1.o1(cVar2, mVar, 21);
                    g0Var.n0(objN);
                }
                i(strU, j, j2, (u00.a) objN, rVarA, z2, g0Var, 0, 0);
            } else {
                g0Var.V();
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new o(aVar, mVar, rVar3, i, i2, 1);
            }
        }
        i3 |= 384;
        rVar2 = rVar;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i3 & 1, z)) {
            if (i7 != 0) {
                rVar3 = b2.o.A;
            } else {
                rVar3 = rVar2;
            }
            eVar = aVar.d;
            i4 = aVar.c;
            i5 = aVar.b;
            cVar = aVar.e;
            if (cVar == null) {
                cVar2 = new yu.c(new su.c(new su.b(i5, i4), eVar));
            } else {
                cVar2 = new yu.c(new su.c(new su.b(i5, i4), eVar));
            }
            if (cVar2 == null) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            b2.r rVarA2 = f2.h.a(rVar3, f);
            if (cVar != null) {
                i6 = 2131887091;
            } else {
                i6 = 2131887071;
            }
            String strU2 = z3.U(g0Var, i6);
            long j3 = dl.a.L;
            long j4 = dl.a.i;
            if (cVar2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            zI = g0Var.i(cVar2) | ((i3 & 112) == 32);
            objN = g0Var.N();
            if (zI) {
                objN = new a1.o1(cVar2, mVar, 21);
                g0Var.n0(objN);
            } else {
                objN = new a1.o1(cVar2, mVar, 21);
                g0Var.n0(objN);
            }
            i(strU2, j3, j4, (u00.a) objN, rVarA2, z2, g0Var, 0, 0);
        } else {
            g0Var.V();
            rVar3 = rVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new o(aVar, mVar, rVar3, i, i2, 1);
        }
    }

    public static final void g(su.e eVar, l1.j jVar, int i) {
        int i2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1602631763);
        if ((i & 6) == 0) {
            i2 = (g0Var.e(eVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            Integer num = eVar.A;
            if (num != null) {
                g0Var.c0(-1146278928);
                z6.b(num + "x", (b2.r) null, dl.a.i, kh.o.z(17), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(-1146097082);
                o3.a(y3.R(2131231178, g0Var, 0), z3.U(g0Var, 2131887090), z1.m(b2.o.A, 22), dl.a.i, g0Var, 392, 0);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new androidx.media3.cast.e(eVar, i, 1);
        }
    }

    public static final void h(yu.a aVar, m mVar, b2.r rVar, l1.j jVar, int i, int i2) {
        int i3;
        b2.r rVar2;
        boolean z;
        b2.r rVar3;
        r1 r1VarT;
        boolean z2;
        b2.r rVar4;
        int i4;
        boolean z3;
        boolean z4;
        Object objN;
        g0 g0Var = (g0) jVar;
        g0Var.e0(775954586);
        if ((i & 6) == 0) {
            i3 = (g0Var.g(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.g(mVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                rVar2 = rVar;
                i3 |= g0Var.g(rVar2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i3 & 1, z)) {
                if (i5 != 0) {
                    rVar4 = b2.o.A;
                    z2 = true;
                } else {
                    z2 = true;
                    rVar4 = rVar2;
                }
                if (aVar.e != null) {
                    i4 = 2131887076;
                } else {
                    i4 = 2131887074;
                }
                String strU = z3.U(g0Var, i4);
                long j = dl.a.i;
                long jB = t.b(0.15f, j);
                if ((i3 & 14) == 4) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                z4 = z3 | ((i3 & 112) == 32 ? z2 : false);
                objN = g0Var.N();
                if (z4 || objN == l1.i.a) {
                    objN = new a1.o1(aVar, mVar, 20);
                    g0Var.n0(objN);
                }
                i(strU, j, jB, (u00.a) objN, rVar4, false, g0Var, (i3 << 6) & 57344, 32);
                rVar3 = rVar4;
            } else {
                g0Var.V();
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new o(aVar, mVar, rVar3, i, i2, 0);
            }
        }
        i3 |= 384;
        rVar2 = rVar;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i3 & 1, z)) {
            if (i5 != 0) {
                rVar4 = b2.o.A;
                z2 = true;
            } else {
                z2 = true;
                rVar4 = rVar2;
            }
            if (aVar.e != null) {
                i4 = 2131887076;
            } else {
                i4 = 2131887074;
            }
            String strU2 = z3.U(g0Var, i4);
            long j2 = dl.a.i;
            long jB2 = t.b(0.15f, j2);
            if ((i3 & 14) == 4) {
                z3 = z2;
            } else {
                z3 = false;
            }
            z4 = z3 | ((i3 & 112) == 32 ? z2 : false);
            objN = g0Var.N();
            if (z4) {
                objN = new a1.o1(aVar, mVar, 20);
                g0Var.n0(objN);
            } else {
                objN = new a1.o1(aVar, mVar, 20);
                g0Var.n0(objN);
            }
            i(strU2, j2, jB2, (u00.a) objN, rVar4, false, g0Var, (i3 << 6) & 57344, 32);
            rVar3 = rVar4;
        } else {
            g0Var.V();
            rVar3 = rVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new o(aVar, mVar, rVar3, i, i2, 0);
        }
    }

    public static final void i(final String str, final long j, final long j2, final u00.a aVar, final b2.r rVar, boolean z, l1.j jVar, final int i, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        final boolean z4;
        r1 r1VarT;
        boolean z5;
        b3.g gVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1330980728);
        if ((i & 6) == 0) {
            i3 = (g0Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= g0Var.f(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= g0Var.i(aVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= g0Var.g(rVar) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                i3 |= g0Var.h(z2) ? 131072 : 65536;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                b2.r rVarO = w50.c.o(z.n.f(f2.h.c(z1.e(z1.d(rVar, 1.0f), 52), p0.f.a), j2, i2.b0.b), z5, null, aVar, 6);
                w0 w0VarD = h0.o.d(b2.b.E, false);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarO, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                int i5 = i3;
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD, g0Var, b3.h.f);
                l1.q.I(m1VarM, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC, g0Var, b3.h.d);
                z6.b(str, h0.c.E(b2.o.A, 16, 0.0f, 2), j, kh.o.z(16), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, (i5 & 14) | 1597488 | ((i5 << 3) & 896), 24960, 241576);
                g0Var.r(true);
                z4 = z5;
            } else {
                g0Var.V();
                z4 = z2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        a.i(str, j, j2, aVar, rVar, z4, (l1.j) obj, l1.q.K(i | 1), i2);
                        return b0.a;
                    }
                };
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var.S(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            b2.r rVarO2 = w50.c.o(z.n.f(f2.h.c(z1.e(z1.d(rVar, 1.0f), 52), p0.f.a), j2, i2.b0.b), z5, null, aVar, 6);
            w0 w0VarD2 = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarO2, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            int i6 = i3;
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, b3.h.f);
            l1.q.I(m1VarM2, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            z6.b(str, h0.c.E(b2.o.A, 16, 0.0f, 2), j, kh.o.z(16), q3.u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, (i6 & 14) | 1597488 | ((i6 << 3) & 896), 24960, 241576);
            g0Var.r(true);
            z4 = z5;
        } else {
            g0Var.V();
            z4 = z2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.i(str, j, j2, aVar, rVar, z4, (l1.j) obj, l1.q.K(i | 1), i2);
                    return b0.a;
                }
            };
        }
    }

    public static final void j(int i, l1.j jVar, boolean z) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1332814519);
        int i2 = i | (g0Var.h(z) ? 4 : 2);
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            b2.o oVar = b2.o.A;
            b2.r rVarD = z1.d(oVar, 1.0f);
            v vVarA = u.a(h0.i.g(8), b2.b.N, g0Var, 54);
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
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            String strU = z3.U(g0Var, 2131887079);
            long j = dl.a.i;
            z6.b(strU, (b2.r) null, j, kh.o.z(22), q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(28), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 258986);
            z6.b(z3.U(g0Var, z ? 2131887072 : 2131887077), h0.c.G(oVar, 0.0f, 0.0f, 0.0f, 2, 7), z ? dl.a.E : t.b(0.9f, j), kh.o.z(16), (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(22), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24624, 48, 259048);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new p(i, z);
        }
    }

    public static final void k(int i, su.e eVar, u00.k kVar, l1.j jVar, int i2) {
        int i3;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1866656670);
        if ((i2 & 6) == 0) {
            i3 = (g0Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g0Var.e(eVar == null ? -1 : eVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g0Var.i(kVar) ? 256 : 128;
        }
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            b2.o oVar = b2.o.A;
            b2.r rVarC = f2.h.c(f2.h.a(z1.n(oVar, 46, 32), eVar == null ? 0.35f : 1.0f), p0.f.a);
            long j = dl.a.i;
            b2.r rVarF = z.n.f(rVarC, t.b(0.15f, j), i2.b0.b);
            boolean z = eVar != null;
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objN = g0Var.N();
            if (z2 || objN == l1.i.a) {
                objN = new a1.o1(eVar, kVar, 19);
                g0Var.n0(objN);
            }
            b2.r rVarO = w50.c.o(rVarF, z, null, (u00.a) objN, 6);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarO, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            o3.a(y3.R(i, g0Var, i3 & 14), (String) null, z1.m(oVar, 13), j, g0Var, 440, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l(i, eVar, kVar, i2);
        }
    }

    public static final void l(final String str, final float f, final float f2, l1.j jVar, final int i) {
        l1.j jVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-84615659);
        int i2 = (jVar3.g(str) ? 4 : 2) | i | (jVar3.d(f) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= jVar3.d(f2) ? 256 : 128;
        }
        if (jVar3.S(i2 & 1, (i2 & 147) != 146)) {
            jVar2 = jVar3;
            z6.b(str, h0.c.A(z1.q(b2.o.A, f2), f - (f2 / 2), 0.0f, 2), dl.a.i, r.o, (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(6), 0L, 1, false, 1, 0, (u00.k) null, (r0) null, jVar2, (i2 & 14) | 24576, 28032, 232424);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            final int i3 = 1;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    switch (i3) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iK = l1.q.K(i | 1);
                            z3.f((ys.l) str, f, f2, (l1.j) obj, iK);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iK2 = l1.q.K(i | 1);
                            iv.a.l((String) str, f, f2, (l1.j) obj, iK2);
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }

    public static final int m(j0.v vVar, float f) {
        return vVar.e.b.h() + (((float) vVar.e.c.h()) > f / ((float) 2) ? 1 : 0);
    }
}
