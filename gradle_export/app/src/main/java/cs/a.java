package cs;

import android.content.Context;
import android.content.res.Configuration;
import b2.r;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g00.b0;
import g1.j7;
import g1.o3;
import g1.v5;
import g1.z6;
import h0.n1;
import h0.s;
import h0.v;
import h0.w;
import h0.z1;
import i2.o0;
import i2.t;
import java.util.Locale;
import kotlin.jvm.internal.a0;
import l1.f1;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import l1.y0;
import l1.z0;
import m3.r0;
import q3.u;
import qd.s0;
import x.e0;
import x.p0;
import x.q1;
import x.x;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new al.c(16), -740137899, false);

    public static final void a(int i, int i2, float f, long j, r rVar, l1.j jVar, int i3) {
        r rVar2;
        Object obj;
        b3.g gVar;
        boolean z;
        r rVarI;
        boolean zD;
        Object objN;
        long jB;
        long j2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-125349953);
        int i4 = i3 | (g0Var.e(i) ? 4 : 2) | (g0Var.e(i2) ? 32 : 16) | (g0Var.d(f) ? 256 : 128) | (g0Var.f(j) ? 2048 : 1024) | 24576;
        if (g0Var.S(i4 & 1, (i4 & 9363) != 9362)) {
            Object objN2 = g0Var.N();
            Object obj2 = l1.i.a;
            if (objN2 == obj2) {
                objN2 = q.z(Boolean.FALSE);
                g0Var.n0(objN2);
            }
            z0 z0Var = (z0) objN2;
            Object objN3 = g0Var.N();
            if (objN3 == obj2) {
                objN3 = q.z(Boolean.FALSE);
                g0Var.n0(objN3);
            }
            z0 z0Var2 = (z0) objN3;
            Object objN4 = g0Var.N();
            if (objN4 == obj2) {
                objN4 = new a1.d(z0Var, z0Var2, (k00.c) null, 25);
                g0Var.n0(objN4);
            }
            q.i(b0.a, g0Var, (u00.n) objN4);
            float f2 = ((Boolean) z0Var.getValue()).booleanValue() ? 0.0f : -180.0f;
            x.r rVar3 = x.a;
            p2 p2VarB = x.d.b(f2, x.c.w(900, 0, rVar3, 2), "streakAxisRotationY", g0Var, 3072, 20);
            g0Var = g0Var;
            float fAbs = Math.abs((float) Math.cos((((Number) p2VarB.getValue()).floatValue() * 3.1415927f) / 180.0f));
            if (fAbs < 0.05f) {
                fAbs = 0.05f;
            }
            x.g0 g0VarS = x.c.s("streakPulse", g0Var, 0);
            q1 q1VarW = x.c.w(1500, 0, rVar3, 2);
            p0 p0Var = p0.B;
            float f3 = fAbs;
            e0 e0VarH = x.c.h(g0VarS, 1.0f, 1.2f, x.c.r(q1VarW, p0Var, 4), "streakPulseScale", g0Var, 29112, 0);
            float fFloatValue = ((Boolean) z0Var2.getValue()).booleanValue() ? ((Number) x.c.h(g0VarS, 0.5f, 0.0f, x.c.r(x.c.w(1500, 0, rVar3, 2), p0Var, 4), "streakPulseAlpha", g0Var, 29112, 0).C.getValue()).floatValue() : 0.0f;
            boolean z2 = i > 0;
            long j3 = z2 ? dl.a.C : dl.a.i;
            r rVar4 = b2.o.A;
            r rVarM = z1.m(rVar4, f);
            boolean zD2 = g0Var.d(f3);
            Object objN5 = g0Var.N();
            if (zD2) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objN5 == obj) {
                }
                r rVarP = i2.b0.p(rVarM, (u00.k) objN5);
                b2.i iVar = b2.b.E;
                w0 w0VarD = h0.o.d(iVar, false);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                r rVarC = b2.a.c(rVarP, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
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
                z = z2;
                b3.f fVar4 = b3.h.d;
                q.I(rVarC, g0Var, fVar4);
                r rVarM2 = z1.m(rVar4, f);
                if (((Boolean) z0Var2.getValue()).booleanValue()) {
                    float fFloatValue2 = ((Number) e0VarH.C.getValue()).floatValue();
                    rVarI = f2.h.i(rVar4, fFloatValue2, fFloatValue2);
                } else {
                    rVarI = rVar4;
                }
                r rVarV = rVarM2.V(rVarI);
                zD = g0Var.d(fFloatValue);
                objN = g0Var.N();
                if (zD || objN == obj) {
                    objN = new i(fFloatValue, 1);
                    g0Var.n0(objN);
                }
                r rVarP2 = i2.b0.p(rVarV, (u00.k) objN);
                p0.e eVar2 = p0.f.a;
                r rVarC2 = f2.h.c(rVarP2, eVar2);
                if (z) {
                    jB = dl.a.C;
                } else {
                    jB = t.b(0.1f, dl.a.k);
                }
                long j4 = jB;
                o0 o0Var = i2.b0.b;
                h0.o.a(z.n.f(rVarC2, j4, o0Var), g0Var, 0);
                r rVarC3 = f2.h.c(f2.h.j(z1.m(rVar4, f), 20, eVar2, t.b(0.3f, j3), t.b(0.3f, j3), 4), eVar2);
                if (z) {
                    j2 = dl.a.C;
                } else {
                    j2 = dl.a.N;
                }
                r rVarF = z.n.f(rVarC3, j2, o0Var);
                w0 w0VarD2 = h0.o.d(iVar, false);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC4 = b2.a.c(rVarF, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD2, g0Var, fVar);
                q.I(m1VarM2, g0Var, fVar2);
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
                q.I(rVarC4, g0Var, fVar4);
                if (z) {
                    g0Var.c0(1845079872);
                    z6.b(String.valueOf(i2), (r) null, dl.a.i, j, u.M, q3.i.C, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i4 << 3) & 57344) | 1572864, 0, 261930);
                    g0Var = g0Var;
                    g0Var.r(false);
                } else {
                    g0Var.c0(1845377348);
                    o3.a(y3.R(2131231132, g0Var, 0), (String) null, z1.m(rVar4, 80), t.b(0.5f, dl.a.k), g0Var, 440, 0);
                    g0Var.r(false);
                }
                g0Var.r(true);
                g0Var.r(true);
                rVar2 = rVar4;
            }
            objN5 = new i(f3, 0);
            g0Var.n0(objN5);
            r rVarP3 = i2.b0.p(rVarM, (u00.k) objN5);
            b2.i iVar2 = b2.b.E;
            w0 w0VarD3 = h0.o.d(iVar2, false);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC5 = b2.a.c(rVarP3, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar5 = b3.h.f;
            q.I(w0VarD3, g0Var, fVar5);
            b3.f fVar6 = b3.h.e;
            q.I(m1VarM3, g0Var, fVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            b3.f fVar7 = b3.h.g;
            q.I(numValueOf2, g0Var, fVar7);
            b3.e eVar3 = b3.h.h;
            q.E(g0Var, eVar3);
            z = z2;
            b3.f fVar8 = b3.h.d;
            q.I(rVarC5, g0Var, fVar8);
            r rVarM3 = z1.m(rVar4, f);
            if (((Boolean) z0Var2.getValue()).booleanValue()) {
                float fFloatValue3 = ((Number) e0VarH.C.getValue()).floatValue();
                rVarI = f2.h.i(rVar4, fFloatValue3, fFloatValue3);
            } else {
                rVarI = rVar4;
            }
            r rVarV2 = rVarM3.V(rVarI);
            zD = g0Var.d(fFloatValue);
            objN = g0Var.N();
            if (zD) {
                objN = new i(fFloatValue, 1);
                g0Var.n0(objN);
            } else {
                objN = new i(fFloatValue, 1);
                g0Var.n0(objN);
            }
            r rVarP4 = i2.b0.p(rVarV2, (u00.k) objN);
            p0.e eVar4 = p0.f.a;
            r rVarC6 = f2.h.c(rVarP4, eVar4);
            if (z) {
                jB = dl.a.C;
            } else {
                jB = t.b(0.1f, dl.a.k);
            }
            long j5 = jB;
            o0 o0Var2 = i2.b0.b;
            h0.o.a(z.n.f(rVarC6, j5, o0Var2), g0Var, 0);
            r rVarC7 = f2.h.c(f2.h.j(z1.m(rVar4, f), 20, eVar4, t.b(0.3f, j3), t.b(0.3f, j3), 4), eVar4);
            if (z) {
                j2 = dl.a.C;
            } else {
                j2 = dl.a.N;
            }
            r rVarF2 = z.n.f(rVarC7, j2, o0Var2);
            w0 w0VarD4 = h0.o.d(iVar2, false);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            r rVarC8 = b2.a.c(rVarF2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD4, g0Var, fVar5);
            q.I(m1VarM4, g0Var, fVar6);
            a1.b.v(iHashCode4, g0Var, fVar7, g0Var, eVar3);
            q.I(rVarC8, g0Var, fVar8);
            if (z) {
                g0Var.c0(1845079872);
                z6.b(String.valueOf(i2), (r) null, dl.a.i, j, u.M, q3.i.C, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i4 << 3) & 57344) | 1572864, 0, 261930);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(1845377348);
                o3.a(y3.R(2131231132, g0Var, 0), (String) null, z1.m(rVar4, 80), t.b(0.5f, dl.a.k), g0Var, 440, 0);
                g0Var.r(false);
            }
            g0Var.r(true);
            g0Var.r(true);
            rVar2 = rVar4;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new j(i, i2, f, j, rVar2, i3);
        }
    }

    public static final void b(m mVar, u00.a aVar, r rVar, l1.j jVar, int i) {
        l1.j jVar2;
        float f;
        r rVarS;
        b2.c cVar;
        u00.n nVar;
        u00.n nVar2;
        u00.n nVar3;
        b3.e eVar;
        b3.f fVar;
        u00.a aVar2;
        boolean z;
        int i2;
        l1.j jVar3;
        int i3;
        int i4;
        boolean z2;
        String strL;
        float f2;
        r rVarS2;
        l1.j jVar4 = (g0) jVar;
        jVar4.e0(982375089);
        int i5 = i | (jVar4.g(mVar) ? 4 : 2) | (jVar4.i(aVar) ? 32 : 16) | (jVar4.g(rVar) ? 256 : 128);
        if (jVar4.S(i5 & 1, (i5 & 147) != 146)) {
            boolean z3 = ((Configuration) jVar4.k(c3.o0.a)).smallestScreenWidthDp >= 600;
            float f3 = z3 ? 282 : 200;
            long jZ = kh.o.z(z3 ? 120 : 96);
            y3.f fVar2 = z3 ? new y3.f(RCHTTPStatusCodes.BAD_REQUEST) : null;
            n1 n1Var = (n1) jVar4.k(dq.l.a);
            int i6 = mVar.c;
            boolean z4 = mVar.d;
            boolean zE = jVar4.e(i6);
            Object objN = jVar4.N();
            Object obj = l1.i.a;
            if (zE || objN == obj) {
                objN = oi.k.s(0, jVar4);
            }
            f1 f1Var = (y0) objN;
            Integer numValueOf = Integer.valueOf(i6);
            boolean zG = ((i5 & 14) == 4) | jVar4.g(f1Var);
            Object objN2 = jVar4.N();
            if (zG || objN2 == obj) {
                objN2 = new k(mVar, f1Var, null);
                jVar4.n0(objN2);
            }
            q.i(numValueOf, jVar4, (u00.n) objN2);
            r rVarG = h0.c.G(rVar, 0.0f, 0.0f, 0.0f, n1Var.a(), 7);
            b2.c cVar2 = b2.b.N;
            v vVarA = h0.u.a(h0.i.c, cVar2, jVar4, 48);
            int iHashCode = Long.hashCode(((g0) jVar4).T);
            m1 m1VarM = jVar4.m();
            r rVarC = b2.a.c(rVarG, jVar4);
            b3.i.c.getClass();
            u00.a aVar3 = b3.h.b;
            jVar4.g0();
            if (((g0) jVar4).S) {
                jVar4.l(aVar3);
            } else {
                jVar4.q0();
            }
            u00.n nVar4 = b3.h.f;
            q.I(vVarA, jVar4, nVar4);
            u00.n nVar5 = b3.h.e;
            q.I(m1VarM, jVar4, nVar5);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf2, jVar4, fVar3);
            b3.e eVar2 = b3.h.h;
            q.E(jVar4, eVar2);
            u00.n nVar6 = b3.h.d;
            q.I(rVarC, jVar4, nVar6);
            r rVar2 = b2.o.A;
            h0.c.h(w.a(rVar2, 1.0f), jVar4);
            if (fVar2 != null) {
                rVarS = z1.s(rVar2, 0.0f, fVar2.A, 1);
                f = 1.0f;
            } else {
                f = 1.0f;
                rVarS = rVar2;
            }
            r rVarD = z1.d(rVarS, f);
            y3.f fVar4 = fVar2;
            v vVarA2 = h0.u.a(h0.i.g(24), cVar2, jVar4, 54);
            int iHashCode2 = Long.hashCode(((g0) jVar4).T);
            m1 m1VarM2 = jVar4.m();
            r rVarC2 = b2.a.c(rVarD, jVar4);
            jVar4.g0();
            if (((g0) jVar4).S) {
                jVar4.l(aVar3);
            } else {
                jVar4.q0();
            }
            q.I(vVarA2, jVar4, nVar4);
            q.I(m1VarM2, jVar4, nVar5);
            a1.b.v(iHashCode2, jVar4, fVar3, jVar4, eVar2);
            q.I(rVarC2, jVar4, nVar6);
            if (mVar.e) {
                jVar4.c0(-2138277573);
                jVar3 = jVar4;
                fVar = fVar3;
                nVar = nVar4;
                nVar3 = nVar5;
                nVar2 = nVar6;
                eVar = eVar2;
                z = false;
                i2 = 16;
                cVar = cVar2;
                aVar2 = aVar3;
                v5.a(z1.m(rVar2, f3), dl.a.i, 0.0f, 0L, 0, 0.0f, jVar3, 0, 60);
                jVar3.r(false);
            } else {
                cVar = cVar2;
                nVar = nVar4;
                nVar2 = nVar6;
                nVar3 = nVar5;
                eVar = eVar2;
                fVar = fVar3;
                aVar2 = aVar3;
                z = false;
                i2 = 16;
                jVar3 = jVar4;
                jVar3.c0(-2138099602);
                a(mVar.c, f1Var.h(), f3, jZ, null, jVar4, 0);
                jVar3.r(false);
            }
            float f4 = 8;
            v vVarA3 = h0.u.a(h0.i.g(f4), cVar, jVar3, 54);
            int iHashCode3 = Long.hashCode(((g0) jVar3).T);
            m1 m1VarM3 = jVar3.m();
            r rVarC3 = b2.a.c(rVar2, jVar3);
            jVar3.g0();
            if (((g0) jVar3).S) {
                jVar3.l(aVar2);
            } else {
                jVar3.q0();
            }
            u00.n nVar7 = nVar;
            q.I(vVarA3, jVar3, nVar7);
            u00.n nVar8 = nVar3;
            q.I(m1VarM3, jVar3, nVar8);
            b3.f fVar5 = fVar;
            b3.e eVar3 = eVar;
            a1.b.v(iHashCode3, jVar3, fVar5, jVar3, eVar3);
            u00.n nVar9 = nVar2;
            q.I(rVarC3, jVar3, nVar9);
            if (r17 != 0) {
                i3 = 1263893291;
                i4 = 2131887305;
            } else {
                i3 = 1263998412;
                i4 = 2131887306;
            }
            l1.j jVar5 = jVar3;
            z6.b(oi.k.o(jVar3, i3, i4, jVar3, z), (r) null, dl.a.n, kh.o.z(22), u.D, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(22), 0, false, 0, 0, (u00.k) null, (r0) null, jVar5, 1597440, 48, 258986);
            l1.j jVar6 = jVar5;
            if (r0 > 0) {
                jVar6.c0(1264419268);
                z6.b(z3.L(2131755013, i6, new Object[]{Integer.valueOf((int) r0)}, jVar6), (r) null, dl.a.D, kh.o.z(18), u.C, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(18), 0, false, 0, 0, (u00.k) null, (r0) null, jVar6, 1597440, 48, 258986);
                jVar6 = jVar6;
                z2 = false;
                jVar6.r(false);
            } else {
                z2 = false;
                jVar6.c0(1264908975);
                jVar6.r(false);
            }
            r rVarG2 = h0.c.G(rVar2, 0.0f, f4, 0.0f, 0.0f, 13);
            if (z4) {
                strL = oi.k.o(jVar6, 1265048072, 2131887302, jVar6, z2);
            } else {
                jVar6.c0(1265161501);
                int i7 = mVar.a;
                strL = z3.L(2131755014, i7, new Object[]{Integer.valueOf(i7)}, jVar6);
                jVar6.r(z2);
            }
            l1.j jVar7 = jVar6;
            z6.b(strL, rVarG2, t.b(0.5f, dl.a.k), kh.o.z(i2), (u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(22), 0, false, 0, 0, (u00.k) null, (r0) null, jVar7, 24624, 48, 259048);
            jVar7.r(true);
            jVar7.r(true);
            h0.c.h(w.a(rVar2, 1.0f), jVar7);
            if (fVar4 != null) {
                f2 = 0.0f;
                rVarS2 = z1.s(rVar2, 0.0f, fVar4.A, 1);
            } else {
                f2 = 0.0f;
                rVarS2 = rVar2;
            }
            int i8 = i2;
            r rVarE = h0.c.E(w50.c.n(z.n.f(f2.h.c(z1.d(rVarS2, 1.0f), p0.f.a), dl.a.i, i2.b0.b), true, aVar), f2, i8, 1);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode4 = Long.hashCode(((g0) jVar7).T);
            m1 m1VarM4 = jVar7.m();
            r rVarC4 = b2.a.c(rVarE, jVar7);
            jVar7.g0();
            if (((g0) jVar7).S) {
                jVar7.l(aVar2);
            } else {
                jVar7.q0();
            }
            q.I(w0VarD, jVar7, nVar7);
            q.I(m1VarM4, jVar7, nVar8);
            a1.b.v(iHashCode4, jVar7, fVar5, jVar7, eVar3);
            q.I(rVarC4, jVar7, nVar9);
            String upperCase = z3.U(jVar7, 2131887262).toUpperCase(Locale.ROOT);
            kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
            z6.b(upperCase, (r) null, dl.a.l, kh.o.z(i8), u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(i8), 0, false, 0, 0, (u00.k) null, (r0) null, jVar7, 1597440, 48, 260010);
            jVar2 = jVar7;
            jVar2.r(true);
            h0.c.h(z1.e(rVar2, 48), jVar2);
            jVar2.r(true);
        } else {
            jVar2 = jVar4;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 1, mVar, aVar, rVar);
        }
    }

    public static final void c(l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1682852313);
        if (g0Var.S(i & 1, i != 0)) {
            androidx.lifecycle.f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t6.b bVarZ = bi.b.z(f1VarA);
            e60.a aVarA = q50.c.a(g0Var);
            kotlin.jvm.internal.b0 b0Var = a0.a;
            final p pVar = (p) c7.i.S(b0Var.b(p.class), f1VarA.getViewModelStore(), (String) null, bVarZ, aVarA, (u00.a) null);
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(b0Var, rr.b.class, aVarA2, (b60.a) null, g0Var);
            }
            rr.b bVar = (rr.b) objN;
            u00.a aVarA3 = cq.l.a(g0Var);
            z0 z0VarQ = k00.f.q(pVar.c.d, g0Var, 0);
            kk.c cVarD = kk.e.d(g0Var);
            Context context = (Context) g0Var.k(c3.o0.b);
            boolean zG2 = g0Var.g(pVar);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                final int i2 = 0;
                objN2 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i3 = i2;
                        p pVar2 = pVar;
                        switch (i3) {
                            case 0:
                                pVar2.j(b.a);
                                break;
                            case 1:
                                pVar2.j(c.a);
                                break;
                            default:
                                pVar2.j(b.a);
                                break;
                        }
                        return b0.a;
                    }
                };
                g0Var.n0(objN2);
            }
            s0.E(false, (u00.a) objN2, g0Var, 0, 1);
            boolean zG3 = g0Var.g(pVar) | g0Var.i(bVar) | g0Var.g(aVarA3) | g0Var.i(context);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                a1.g gVar = new a1.g(pVar, bVar, aVarA3, context, (k00.c) null, 14);
                g0Var.n0(gVar);
                objN3 = gVar;
            }
            q.i(b0.a, g0Var, (u00.n) objN3);
            h0.a0 a0Var = z1.c;
            r rVarF = z.n.f(a0Var, dl.a.L, i2.b0.b);
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarF, g0Var);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            j7 j7Var = h0.c.e;
            r rVarE = h0.c.E(h0.c.M(a0Var, j7Var), 32, 0.0f, 2);
            m mVar = (m) z0VarQ.getValue();
            boolean zG4 = g0Var.g(pVar);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar) {
                final int i3 = 1;
                objN4 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i4 = i3;
                        p pVar2 = pVar;
                        switch (i4) {
                            case 0:
                                pVar2.j(b.a);
                                break;
                            case 1:
                                pVar2.j(c.a);
                                break;
                            default:
                                pVar2.j(b.a);
                                break;
                        }
                        return b0.a;
                    }
                };
                g0Var.n0(objN4);
            }
            b(mVar, (u00.a) objN4, rVarE, g0Var, 0);
            r rVarA = s.a.a(h0.c.M(h0.c.E(b2.o.A, 16, 0.0f, 2), j7Var), iVar);
            p0.e eVar = p0.f.a;
            float f = 0;
            float f2 = 44;
            long jB = t.b(0.5f, dl.a.P);
            boolean zG5 = g0Var.g(pVar);
            Object objN5 = g0Var.N();
            if (zG5 || objN5 == cVar) {
                final int i4 = 2;
                objN5 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i5 = i4;
                        p pVar2 = pVar;
                        switch (i5) {
                            case 0:
                                pVar2.j(b.a);
                                break;
                            case 1:
                                pVar2.j(c.a);
                                break;
                            default:
                                pVar2.j(b.a);
                                break;
                        }
                        return b0.a;
                    }
                };
                g0Var.n0(objN5);
            }
            w50.c.f((u00.a) objN5, cVarD, rVarA, false, false, 0.0f, new y3.f(f2), 0L, jB, 10.0f, eVar, f, a, g0Var, 806879232, 432, 184);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new cp.a(i, 4);
        }
    }
}
