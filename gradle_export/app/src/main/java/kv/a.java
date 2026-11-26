package kv;

import as.f0;
import b1.n;
import b2.r;
import b3.g;
import b3.h;
import c00.p;
import c00.s;
import c3.o1;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import d0.o2;
import g1.n5;
import g1.o3;
import g1.t6;
import g1.v6;
import g1.w6;
import g1.z6;
import h0.a0;
import h0.c1;
import h0.i;
import h0.n1;
import h0.p1;
import h0.t1;
import h0.v;
import h0.v1;
import h0.w1;
import h0.x1;
import h0.z1;
import i2.b0;
import i2.o0;
import i2.t;
import i2.t0;
import j0.x;
import l1.g0;
import l1.j;
import l1.m1;
import l1.p2;
import l1.q;
import l1.r1;
import l1.z0;
import m3.r0;
import q0.i1;
import q3.u;
import u00.o;
import w.b2;
import x.y;
import x3.k;
import x3.l;
import y3.m;
import z2.d0;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new jk.c(12), -602493166, false);
    public static final v1.c b = new v1.c(new jk.c(13), -1639503567, false);

    public static final void a(String str, r rVar, o oVar, j jVar, int i) {
        o oVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-353408109);
        int i2 = i | (g0Var.g(str) ? 4 : 2);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            float f = 16;
            r rVarG = h0.c.G(z1.d(rVar, 1.0f), f, 4, f, 0.0f, 8);
            v1 v1VarA = t1.a(i.a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC = b2.a.c(rVarG, g0Var);
            b3.i.c.getClass();
            g gVar = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = h.f;
            q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = h.d;
            q.I(rVarC, g0Var, fVar4);
            b2.o oVar3 = b2.o.A;
            x1 x1Var = x1.a;
            r rVarA = x1Var.a(oVar3);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC2 = b2.a.c(rVarA, g0Var);
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
            z6.b(str, (r) null, dl.a.k, kh.o.z(18), u.D, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(20), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, (i2 & 14) | 1597440, 48, 260010);
            g0Var = g0Var;
            g0Var.r(true);
            oVar2 = oVar;
            oVar2.invoke(x1Var, g0Var, 54);
            g0Var.r(true);
        } else {
            oVar2 = oVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n(i, 15, str, rVar, oVar2);
        }
    }

    public static final void b(final PlayerItem playerItem, final u00.a aVar, u00.a aVar2, final boolean z, final boolean z2, j jVar, final int i) {
        u00.a aVar3;
        int i2;
        boolean z3;
        u00.n nVar;
        r rVar;
        b3.f fVar;
        b2.d dVar;
        b3.e eVar;
        u00.a aVar4;
        long j;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1124215060);
        int i3 = i | (g0Var.g(playerItem) ? 4 : 2) | (g0Var.i(aVar) ? 32 : 16) | (g0Var.i(aVar2) ? 256 : 128) | (g0Var.h(z) ? 2048 : 1024) | (g0Var.h(z2) ? 16384 : 8192);
        if (g0Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            m mVar = (m) g0Var.k(o1.n);
            gc.j jVarA = f50.k.A(new gc.k(), g0Var);
            p2 p2VarA = b2.a(z ? t.b(0.06f, dl.a.i) : t.f, (y) null, "trackListSurahSelection", g0Var, 384, 10);
            r rVar2 = b2.o.A;
            float f = 16;
            r rVarC = f2.h.c(h0.c.D(z1.d(rVar2, 1.0f), f, 2), p0.f.a(14));
            long j2 = ((t) p2VarA.getValue()).a;
            o0 o0Var = b0.b;
            r rVarN = w50.c.n(z.n.f(rVarC, j2, o0Var), true, aVar);
            float f2 = 8;
            r rVarD = h0.c.D(rVarN, f2, 6);
            b2.h hVar = b2.b.K;
            v1 v1VarA = t1.a(i.g(f2), hVar, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            u00.a aVar5 = h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar5);
            } else {
                g0Var.q0();
            }
            b3.f fVar2 = h.f;
            q.I(v1VarA, g0Var, fVar2);
            u00.n nVar2 = h.e;
            q.I(m1VarM, g0Var, nVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar2 = h.h;
            q.E(g0Var, eVar2);
            b3.f fVar4 = h.d;
            q.I(rVarC2, g0Var, fVar4);
            b2.d dVar2 = b2.b.E;
            w0 w0VarD = h0.o.d(dVar2, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC3 = b2.a.c(rVar2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar5);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, fVar2);
            q.I(m1VarM2, g0Var, nVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar2);
            q.I(rVarC3, g0Var, fVar4);
            h0.o.a(z.n.f(f2.h.c(z1.m(rVar2, 42), p0.f.a(12)), t.b(0.4f, dl.a.J), o0Var), g0Var, 0);
            if (z2) {
                g0Var.c0(-1637787742);
                f50.c.g((cc.a) jVarA.getValue(), z1.m(rVar2, f), g0Var, 1572912);
                g0Var.r(false);
                rVar = rVar2;
                nVar = nVar2;
                aVar4 = aVar5;
                eVar = eVar2;
                fVar = fVar3;
                i2 = 16;
                dVar = dVar2;
                z3 = true;
            } else {
                g0Var.c0(-1637568572);
                i2 = 16;
                z3 = true;
                nVar = nVar2;
                rVar = rVar2;
                fVar = fVar3;
                dVar = dVar2;
                eVar = eVar2;
                aVar4 = aVar5;
                z6.b(String.valueOf(playerItem.getSurahNumber()), (r) null, dl.a.k, kh.o.z(16), u.D, (q3.i) null, 0L, (l) null, (k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 0, 262058);
                g0Var = g0Var;
                g0Var.r(false);
            }
            g0Var.r(z3);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, z3);
            v vVarA = h0.u.a(i.c, b2.b.M, g0Var, 0);
            int iHashCode3 = Long.hashCode(g0Var.T);
            m1 m1VarM3 = g0Var.m();
            r rVarC4 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar4);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar2);
            q.I(m1VarM3, g0Var, nVar);
            a1.b.v(iHashCode3, g0Var, fVar, g0Var, eVar);
            q.I(rVarC4, g0Var, fVar4);
            v1 v1VarA2 = t1.a(i.g(f2), hVar, g0Var, 54);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            r rVar3 = rVar;
            r rVarC5 = b2.a.c(rVar3, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(aVar4);
            } else {
                g0Var.q0();
            }
            q.I(v1VarA2, g0Var, fVar2);
            q.I(m1VarM4, g0Var, nVar);
            a1.b.v(iHashCode4, g0Var, fVar, g0Var, eVar);
            q.I(rVarC5, g0Var, fVar4);
            String surahTranscription = playerItem.getSurahTranscription();
            long j3 = dl.a.k;
            g0 g0Var2 = g0Var;
            long jZ = kh.o.z(i2);
            long jZ2 = kh.o.z(i2);
            u uVar = u.D;
            z6.b(surahTranscription, (r) null, j3, jZ, uVar, (q3.i) null, 0L, (l) null, (k) null, jZ2, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var2, 1597440, 48, 260010);
            g0 g0Var3 = g0Var2;
            if (mVar != m.A || r30.k.L0(playerItem.getSurahOriginalName())) {
                j = j3;
                g0Var3.c0(-1792323860);
                g0Var3.r(false);
            } else {
                g0Var3.c0(-1792627133);
                j = j3;
                z6.b(a1.b.p("(", playerItem.getSurahOriginalName(), ")"), (r) null, t.b(0.8f, j3), kh.o.z(i2), uVar, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(i2), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var3, 1597440, 48, 260010);
                g0Var3 = g0Var3;
                g0Var3.r(false);
            }
            g0Var3.r(z3);
            g0 g0Var4 = g0Var3;
            z6.b(playerItem.getSurahTranslation(), (r) null, t.b(0.7f, j), kh.o.z(12), (u) null, (q3.i) null, 0L, (l) null, (k) null, kh.o.z(12), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 24576, 48, 260074);
            g0Var = g0Var4;
            g0Var.r(z3);
            if (z) {
                g0Var.c0(1749445468);
                aVar3 = aVar2;
                r rVarN2 = w50.c.n(f2.h.c(z1.m(rVar3, 34), p0.f.a), z3, aVar3);
                w0 w0VarD2 = h0.o.d(dVar, false);
                int iHashCode5 = Long.hashCode(g0Var.T);
                m1 m1VarM5 = g0Var.m();
                r rVarC6 = b2.a.c(rVarN2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(aVar4);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD2, g0Var, fVar2);
                q.I(m1VarM5, g0Var, nVar);
                a1.b.v(iHashCode5, g0Var, fVar, g0Var, eVar);
                q.I(rVarC6, g0Var, fVar4);
                o3.a(y3.R(z2 ? 2131231355 : 2131231359, g0Var, 0), (String) null, z1.m(rVar3, 24), dl.a.j, g0Var, 440, 0);
                g0Var = g0Var;
                g0Var.r(z3);
                g0Var.r(false);
            } else {
                aVar3 = aVar2;
                g0Var.c0(1750173906);
                g0Var.r(false);
            }
            g0Var.r(z3);
        } else {
            aVar3 = aVar2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final u00.a aVar6 = aVar3;
            r1VarT.d = new u00.n(aVar, aVar6, z, z2, i) {
                public final u00.a B;
                public final u00.a C;
                public final boolean D;
                public final boolean E;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(1);
                    a.b(this.A, this.B, this.C, this.D, this.E, (j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void c(int i, r rVar, String searchValue, j jVar, u00.k onSearchValueChange, boolean z) {
        g0 g0Var;
        boolean z2;
        v1.c cVarD;
        kotlin.jvm.internal.m.e(searchValue, "searchValue");
        kotlin.jvm.internal.m.e(onSearchValueChange, "onSearchValueChange");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-436817191);
        int i2 = i | (g0Var2.g(searchValue) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= g0Var2.i(onSearchValueChange) ? 32 : 16;
        }
        int i3 = i2 | 3072;
        if (g0Var2.S(i3 & 1, (i3 & 1171) != 1170)) {
            z0.g gVarH = z0.h.h(searchValue, g0Var2, i3 & 14);
            boolean zG = g0Var2.g(gVarH) | ((i3 & 112) == 32);
            Object objN = g0Var2.N();
            if (zG || objN == l1.i.a) {
                objN = new s(gVarH, onSearchValueChange, null, 3);
                g0Var2.n0(objN);
            }
            q.i(gVarH, g0Var2, (u00.n) objN);
            r rVarE = z1.e(z1.d(rVar, 1.0f), 40);
            z0.e eVar = z0.e.B;
            p1 p1VarE = h0.c.e(16, 0.0f, 2);
            p0.e eVarA = p0.f.a(32);
            long j = dl.a.i;
            long jB = t.b(0.085f, j);
            long jB2 = t.b(0.085f, j);
            long jB3 = t.b(0.085f, j);
            long j2 = t.f;
            long j3 = dl.a.k;
            t6 t6VarA = v6.a(j3, j3, j3, jB, jB2, jB3, j2, j2, j2, t.b(0.3f, j3), t.b(0.3f, j3), t.b(0.3f, j3), g0Var2, 1207945096);
            if (searchValue.length() > 0) {
                g0Var2.c0(532042430);
                cVarD = v1.d.d(900820590, new p(gVarH, 2), g0Var2);
                g0Var2.r(false);
            } else {
                g0Var2.c0(532459597);
                g0Var2.r(false);
                cVarD = null;
            }
            n5.c(gVarH, rVarE, true, (r0) null, (w6) null, a, b, cVarD, false, (i1) null, (qp.b) null, eVar, (z.p1) null, eVarA, t6VarA, p1VarE, g0Var2, 113246592, 100663296, 18611320);
            g0Var = g0Var2;
            z2 = true;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            z2 = z;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b(searchValue, onSearchValueChange, rVar, z2, i);
        }
    }

    public static final void d(final bv.o1 uiState, final u00.k onAction, final jk.a backdrop, final long j, r rVar, t0 t0Var, j jVar, final int i, final int i2) {
        int i3;
        int i4;
        boolean z;
        final r rVar2;
        final t0 t0Var2;
        r1 r1VarT;
        r rVar3;
        t0 t0VarA;
        int i5;
        r rVar4;
        Object objN;
        Object obj;
        final z0 z0Var;
        boolean zG;
        Object objN2;
        long jB;
        long jB2;
        long jB3;
        long jB4;
        boolean zE;
        Object objN3;
        Object obj2;
        int i6;
        Object objN4;
        final z0 z0Var2;
        boolean zD;
        Object objN5;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        boolean z2 = uiState.h;
        int i7 = uiState.i;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        j jVar2 = (g0) jVar;
        jVar2.e0(-811720934);
        if ((i & 6) == 0) {
            i3 = (jVar2.g(uiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= jVar2.i(onAction) ? 32 : 16;
        }
        int i8 = i3 | (jVar2.i(backdrop) ? 256 : 128);
        if ((i & 3072) == 0) {
            i8 |= jVar2.f(j) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                i8 |= jVar2.g(rVar) ? 16384 : 8192;
            }
            i4 = i8 | (((i2 & 32) == 0 || !jVar2.g(t0Var)) ? 65536 : 131072);
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (jVar2.S(i4 & 1, z)) {
                jVar2.X();
                if ((i & 1) != 0 || jVar2.A()) {
                    if (i9 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 32) != 0) {
                        i5 = i4 & (-458753);
                        rVar4 = rVar3;
                        t0VarA = p0.f.a(42);
                    } else {
                        t0VarA = t0Var;
                        i5 = i4;
                        rVar4 = rVar3;
                    }
                } else {
                    jVar2.V();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    rVar4 = rVar;
                    t0VarA = t0Var;
                    i5 = i4;
                }
                jVar2.s();
                final j0.v vVarA = x.a(0, jVar2, 3);
                Object[] objArr = new Object[0];
                objN = jVar2.N();
                obj = l1.i.a;
                if (objN == obj) {
                    objN = new h.e(9);
                    jVar2.n0(objN);
                }
                z0Var = (z0) y1.k.c(objArr, (u00.a) objN, jVar2, 48);
                zG = jVar2.g((String) z0Var.getValue()) | jVar2.g(uiState.o);
                objN2 = jVar2.N();
                if (zG || objN2 == obj) {
                    objN2 = q.r(new jv.d(uiState, z0Var, 1));
                    jVar2.n0(objN2);
                }
                final p2 p2Var = (p2) objN2;
                if (z2) {
                    jB = t.b(0.3f, dl.a.i);
                } else {
                    jB = t.b(0.06f, dl.a.i);
                }
                final p2 p2VarA = b2.a(jB, (y) null, (String) null, jVar2, 0, 14);
                if (z2) {
                    jB2 = dl.a.k;
                } else {
                    jB2 = t.b(0.7f, dl.a.k);
                }
                final p2 p2VarA2 = b2.a(jB2, (y) null, (String) null, jVar2, 0, 14);
                if (i7 != 0) {
                    jB3 = t.b(0.06f, dl.a.i);
                } else if (i7 != 1 || i7 == 2) {
                    jB3 = t.b(0.3f, dl.a.i);
                } else {
                    jB3 = t.b(0.06f, dl.a.i);
                }
                final p2 p2VarA3 = b2.a(jB3, (y) null, (String) null, jVar2, 0, 14);
                if (i7 != 0) {
                    jB4 = t.b(0.7f, dl.a.k);
                } else if (i7 != 1 || i7 == 2) {
                    jB4 = dl.a.k;
                } else {
                    jB4 = t.b(0.7f, dl.a.k);
                }
                final p2 p2VarA4 = b2.a(jB4, (y) null, (String) null, jVar2, 0, 14);
                zE = jVar2.e(i7);
                objN3 = jVar2.N();
                if (zE) {
                    obj2 = obj;
                } else {
                    obj2 = obj;
                    if (objN3 == obj2) {
                    }
                    final int iIntValue = ((Number) objN3).intValue();
                    final y3.c cVar = (y3.c) jVar2.k(o1.h);
                    objN4 = jVar2.N();
                    if (objN4 == obj2) {
                        objN4 = x5.s(0, jVar2);
                    }
                    z0Var2 = (z0) objN4;
                    zD = jVar2.d(((y3.f) z0Var2.getValue()).A);
                    objN5 = jVar2.N();
                    if (zD || objN5 == obj2) {
                        objN5 = h0.c.g(0.0f, ((y3.f) z0Var2.getValue()).A, 0.0f, 0.0f, 13);
                        jVar2.n0(objN5);
                    }
                    final n1 n1Var = (n1) objN5;
                    final float fA0 = cVar.A0(((y3.f) z0Var2.getValue()).A + 12);
                    final float fA1 = cVar.A0(28);
                    jVar2 = jVar2;
                    r rVar5 = rVar4;
                    t0 t0Var3 = t0VarA;
                    va.a.e(rVar5, backdrop, t0Var3, 0.0f, (b2.d) null, false, 0.0f, 0.0f, new t(j), v1.d.d(-1481727874, new o() {
                        @Override
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            h0.r LiquidBox = (h0.r) obj3;
                            g0 g0Var = (j) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            kotlin.jvm.internal.m.e(LiquidBox, "$this$LiquidBox");
                            boolean z3 = (iIntValue2 & 17) != 16;
                            g0 g0Var2 = g0Var;
                            a30.x xVar = g0Var2.a;
                            if (g0Var2.S(iIntValue2 & 1, z3)) {
                                a0 a0Var = z1.c;
                                w0 w0VarD = h0.o.d(b2.b.A, false);
                                int iHashCode = Long.hashCode(g0Var2.T);
                                m1 m1VarM = g0Var2.m();
                                r rVarC = b2.a.c(a0Var, g0Var);
                                b3.i.c.getClass();
                                g gVar = h.b;
                                g0Var2.g0();
                                if (g0Var2.S) {
                                    g0Var2.l(gVar);
                                } else {
                                    g0Var2.q0();
                                }
                                b3.f fVar = h.f;
                                q.I(w0VarD, g0Var, fVar);
                                b3.f fVar2 = h.e;
                                q.I(m1VarM, g0Var, fVar2);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                b3.f fVar3 = h.g;
                                q.I(numValueOf, g0Var, fVar3);
                                b3.e eVar = h.h;
                                q.E(g0Var, eVar);
                                b3.f fVar4 = h.d;
                                q.I(rVarC, g0Var, fVar4);
                                kotlin.jvm.internal.m.e(a0Var, "<this>");
                                r rVarW = ca.v.w(a0Var, fA0, fA1, 0.0f, 0.0f);
                                p2 p2Var2 = p2Var;
                                boolean zG2 = g0Var2.g(p2Var2);
                                bv.o1 o1Var = uiState;
                                boolean zG3 = zG2 | g0Var2.g(o1Var);
                                final u00.k kVar = onAction;
                                boolean zG4 = zG3 | g0Var2.g(kVar);
                                Object objN6 = g0Var2.N();
                                Object obj6 = l1.i.a;
                                if (zG4 || objN6 == obj6) {
                                    objN6 = new b1.l(p2Var2, o1Var, kVar, 19);
                                    g0Var2.n0(objN6);
                                }
                                k00.f.d(rVarW, vVarA, n1Var, null, null, null, false, null, (u00.k) objN6, g0Var, 0, 504);
                                b2.i iVar = b2.b.B;
                                h0.s sVar = h0.s.a;
                                b2.o oVar = b2.o.A;
                                r rVarD = z1.d(sVar.a(oVar, iVar), 1.0f);
                                y3.c cVar2 = cVar;
                                boolean zG5 = g0Var2.g(cVar2);
                                Object objN7 = g0Var2.N();
                                if (zG5 || objN7 == obj6) {
                                    objN7 = new f0(cVar2, z0Var2, 11);
                                    g0Var2.n0(objN7);
                                }
                                r rVarO = d0.o(rVarD, (u00.k) objN7);
                                float f = 12;
                                v vVarA2 = h0.u.a(i.g(f), b2.b.M, g0Var, 6);
                                int iHashCode2 = Long.hashCode(g0Var2.T);
                                m1 m1VarM2 = g0Var2.m();
                                r rVarC2 = b2.a.c(rVarO, g0Var);
                                g0Var2.g0();
                                if (g0Var2.S) {
                                    g0Var2.l(gVar);
                                } else {
                                    g0Var2.q0();
                                }
                                q.I(vVarA2, g0Var, fVar);
                                q.I(m1VarM2, g0Var, fVar2);
                                x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                                q.I(rVarC2, g0Var, fVar4);
                                float f2 = 16;
                                r rVarG = h0.c.G(oVar, 0.0f, f2, 0.0f, 0.0f, 13);
                                String strU = z3.U(g0Var, 2131886367);
                                final p2 p2Var3 = p2VarA;
                                final p2 p2Var4 = p2VarA2;
                                final p2 p2Var5 = p2VarA3;
                                final int i11 = iIntValue;
                                final p2 p2Var6 = p2VarA4;
                                a.a(strU, rVarG, v1.d.d(-249099321, new o() {
                                    @Override
                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                        w1 SurahListHeader = (w1) obj7;
                                        g0 g0Var3 = (j) obj8;
                                        int iIntValue3 = ((Integer) obj9).intValue();
                                        kotlin.jvm.internal.m.e(SurahListHeader, "$this$SurahListHeader");
                                        boolean z4 = (iIntValue3 & 17) != 16;
                                        g0 g0Var4 = g0Var3;
                                        a30.x xVar2 = g0Var4.a;
                                        if (g0Var4.S(iIntValue3 & 1, z4)) {
                                            float f3 = 34;
                                            b2.o oVar2 = b2.o.A;
                                            r rVarM = z1.m(oVar2, f3);
                                            p0.e eVar2 = p0.f.a;
                                            r rVarC3 = f2.h.c(rVarM, eVar2);
                                            long j2 = ((t) p2Var3.getValue()).a;
                                            o0 o0Var = b0.b;
                                            r rVarF = z.n.f(rVarC3, j2, o0Var);
                                            u00.k kVar2 = kVar;
                                            boolean zG6 = g0Var4.g(kVar2);
                                            Object objN8 = g0Var4.N();
                                            Object obj10 = l1.i.a;
                                            if (zG6 || objN8 == obj10) {
                                                objN8 = new jz.t(4, kVar2);
                                                g0Var4.n0(objN8);
                                            }
                                            r rVarN = w50.c.n(rVarF, true, (u00.a) objN8);
                                            b2.i iVar2 = b2.b.E;
                                            w0 w0VarD2 = h0.o.d(iVar2, false);
                                            int iHashCode3 = Long.hashCode(g0Var4.T);
                                            m1 m1VarM3 = g0Var4.m();
                                            r rVarC4 = b2.a.c(rVarN, g0Var3);
                                            b3.i.c.getClass();
                                            g gVar2 = h.b;
                                            g0Var4.g0();
                                            if (g0Var4.S) {
                                                g0Var4.l(gVar2);
                                            } else {
                                                g0Var4.q0();
                                            }
                                            b3.f fVar5 = h.f;
                                            q.I(w0VarD2, g0Var3, fVar5);
                                            b3.f fVar6 = h.e;
                                            q.I(m1VarM3, g0Var3, fVar6);
                                            Integer numValueOf2 = Integer.valueOf(iHashCode3);
                                            b3.f fVar7 = h.g;
                                            q.I(numValueOf2, g0Var3, fVar7);
                                            b3.e eVar3 = h.h;
                                            q.E(g0Var3, eVar3);
                                            b3.f fVar8 = h.d;
                                            q.I(rVarC4, g0Var3, fVar8);
                                            float f4 = 20;
                                            o3.a(y3.R(2131231384, g0Var3, 0), (String) null, z1.m(oVar2, f4), ((t) p2Var4.getValue()).a, g0Var3, 440, 0);
                                            g0Var4.r(true);
                                            h0.c.h(z1.m(oVar2, 8), g0Var3);
                                            r rVarF2 = z.n.f(f2.h.c(z1.m(oVar2, f3), eVar2), ((t) p2Var5.getValue()).a, o0Var);
                                            boolean zG7 = g0Var4.g(kVar2);
                                            Object objN9 = g0Var4.N();
                                            if (zG7 || objN9 == obj10) {
                                                objN9 = new jz.t(5, kVar2);
                                                g0Var4.n0(objN9);
                                            }
                                            r rVarN2 = w50.c.n(rVarF2, true, (u00.a) objN9);
                                            w0 w0VarD3 = h0.o.d(iVar2, false);
                                            int iHashCode4 = Long.hashCode(g0Var4.T);
                                            m1 m1VarM4 = g0Var4.m();
                                            r rVarC5 = b2.a.c(rVarN2, g0Var3);
                                            g0Var4.g0();
                                            if (g0Var4.S) {
                                                g0Var4.l(gVar2);
                                            } else {
                                                g0Var4.q0();
                                            }
                                            q.I(w0VarD3, g0Var3, fVar5);
                                            q.I(m1VarM4, g0Var3, fVar6);
                                            x5.u(iHashCode4, g0Var3, fVar7, g0Var3, eVar3);
                                            q.I(rVarC5, g0Var3, fVar8);
                                            o3.a(y3.R(i11, g0Var3, 0), (String) null, z1.m(oVar2, f4), ((t) p2Var6.getValue()).a, g0Var3, 440, 0);
                                            g0Var4.r(true);
                                        } else {
                                            g0Var4.V();
                                        }
                                        return g00.b0.a;
                                    }
                                }, g0Var), g0Var, 432);
                                r rVarG2 = h0.c.G(h0.c.E(z1.d(oVar, 1.0f), f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                                z0 z0Var3 = z0Var;
                                String str = (String) z0Var3.getValue();
                                boolean zG6 = g0Var2.g(z0Var3);
                                Object objN8 = g0Var2.N();
                                if (zG6 || objN8 == obj6) {
                                    objN8 = new o2(z0Var3, 11);
                                    g0Var2.n0(objN8);
                                }
                                a.c(384, rVarG2, str, g0Var, (u00.k) objN8, false);
                                g0Var2.r(true);
                                g0Var2.r(true);
                            } else {
                                g0Var2.V();
                            }
                            return g00.b0.a;
                        }
                    }, jVar2), jVar2, ((i5 >> 12) & 14) | 819465216 | ((i5 >> 3) & 112) | ((i5 >> 9) & 896) | ((i5 << 15) & 234881024), 48);
                    rVar2 = rVar5;
                    t0Var2 = t0Var3;
                }
                i6 = 2131231371;
                if (i7 != 0 && i7 == 1) {
                    i6 = 2131231372;
                }
                objN3 = Integer.valueOf(i6);
                jVar2.n0(objN3);
                final int iIntValue2 = ((Number) objN3).intValue();
                final y3.c cVar2 = (y3.c) jVar2.k(o1.h);
                objN4 = jVar2.N();
                if (objN4 == obj2) {
                    objN4 = x5.s(0, jVar2);
                }
                z0Var2 = (z0) objN4;
                zD = jVar2.d(((y3.f) z0Var2.getValue()).A);
                objN5 = jVar2.N();
                if (zD) {
                    objN5 = h0.c.g(0.0f, ((y3.f) z0Var2.getValue()).A, 0.0f, 0.0f, 13);
                    jVar2.n0(objN5);
                } else {
                    objN5 = h0.c.g(0.0f, ((y3.f) z0Var2.getValue()).A, 0.0f, 0.0f, 13);
                    jVar2.n0(objN5);
                }
                final n1 n1Var2 = (n1) objN5;
                final float fA2 = cVar2.A0(((y3.f) z0Var2.getValue()).A + 12);
                final float fA3 = cVar2.A0(28);
                jVar2 = jVar2;
                r rVar6 = rVar4;
                t0 t0Var4 = t0VarA;
                va.a.e(rVar6, backdrop, t0Var4, 0.0f, (b2.d) null, false, 0.0f, 0.0f, new t(j), v1.d.d(-1481727874, new o() {
                    @Override
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        h0.r LiquidBox = (h0.r) obj3;
                        g0 g0Var = (j) obj4;
                        int iIntValue3 = ((Integer) obj5).intValue();
                        kotlin.jvm.internal.m.e(LiquidBox, "$this$LiquidBox");
                        boolean z3 = (iIntValue3 & 17) != 16;
                        g0 g0Var2 = g0Var;
                        a30.x xVar = g0Var2.a;
                        if (g0Var2.S(iIntValue3 & 1, z3)) {
                            a0 a0Var = z1.c;
                            w0 w0VarD = h0.o.d(b2.b.A, false);
                            int iHashCode = Long.hashCode(g0Var2.T);
                            m1 m1VarM = g0Var2.m();
                            r rVarC = b2.a.c(a0Var, g0Var);
                            b3.i.c.getClass();
                            g gVar = h.b;
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar);
                            } else {
                                g0Var2.q0();
                            }
                            b3.f fVar = h.f;
                            q.I(w0VarD, g0Var, fVar);
                            b3.f fVar2 = h.e;
                            q.I(m1VarM, g0Var, fVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            b3.f fVar3 = h.g;
                            q.I(numValueOf, g0Var, fVar3);
                            b3.e eVar = h.h;
                            q.E(g0Var, eVar);
                            b3.f fVar4 = h.d;
                            q.I(rVarC, g0Var, fVar4);
                            kotlin.jvm.internal.m.e(a0Var, "<this>");
                            r rVarW = ca.v.w(a0Var, fA2, fA3, 0.0f, 0.0f);
                            p2 p2Var2 = p2Var;
                            boolean zG2 = g0Var2.g(p2Var2);
                            bv.o1 o1Var = uiState;
                            boolean zG3 = zG2 | g0Var2.g(o1Var);
                            final u00.k kVar = onAction;
                            boolean zG4 = zG3 | g0Var2.g(kVar);
                            Object objN6 = g0Var2.N();
                            Object obj6 = l1.i.a;
                            if (zG4 || objN6 == obj6) {
                                objN6 = new b1.l(p2Var2, o1Var, kVar, 19);
                                g0Var2.n0(objN6);
                            }
                            k00.f.d(rVarW, vVarA, n1Var2, null, null, null, false, null, (u00.k) objN6, g0Var, 0, 504);
                            b2.i iVar = b2.b.B;
                            h0.s sVar = h0.s.a;
                            b2.o oVar = b2.o.A;
                            r rVarD = z1.d(sVar.a(oVar, iVar), 1.0f);
                            y3.c cVar3 = cVar2;
                            boolean zG5 = g0Var2.g(cVar3);
                            Object objN7 = g0Var2.N();
                            if (zG5 || objN7 == obj6) {
                                objN7 = new f0(cVar3, z0Var2, 11);
                                g0Var2.n0(objN7);
                            }
                            r rVarO = d0.o(rVarD, (u00.k) objN7);
                            float f = 12;
                            v vVarA2 = h0.u.a(i.g(f), b2.b.M, g0Var, 6);
                            int iHashCode2 = Long.hashCode(g0Var2.T);
                            m1 m1VarM2 = g0Var2.m();
                            r rVarC2 = b2.a.c(rVarO, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar);
                            } else {
                                g0Var2.q0();
                            }
                            q.I(vVarA2, g0Var, fVar);
                            q.I(m1VarM2, g0Var, fVar2);
                            x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                            q.I(rVarC2, g0Var, fVar4);
                            float f2 = 16;
                            r rVarG = h0.c.G(oVar, 0.0f, f2, 0.0f, 0.0f, 13);
                            String strU = z3.U(g0Var, 2131886367);
                            final p2 p2Var3 = p2VarA;
                            final p2 p2Var4 = p2VarA2;
                            final p2 p2Var5 = p2VarA3;
                            final int i11 = iIntValue2;
                            final p2 p2Var6 = p2VarA4;
                            a.a(strU, rVarG, v1.d.d(-249099321, new o() {
                                @Override
                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                    w1 SurahListHeader = (w1) obj7;
                                    g0 g0Var3 = (j) obj8;
                                    int iIntValue4 = ((Integer) obj9).intValue();
                                    kotlin.jvm.internal.m.e(SurahListHeader, "$this$SurahListHeader");
                                    boolean z4 = (iIntValue4 & 17) != 16;
                                    g0 g0Var4 = g0Var3;
                                    a30.x xVar2 = g0Var4.a;
                                    if (g0Var4.S(iIntValue4 & 1, z4)) {
                                        float f3 = 34;
                                        b2.o oVar2 = b2.o.A;
                                        r rVarM = z1.m(oVar2, f3);
                                        p0.e eVar2 = p0.f.a;
                                        r rVarC3 = f2.h.c(rVarM, eVar2);
                                        long j2 = ((t) p2Var3.getValue()).a;
                                        o0 o0Var = b0.b;
                                        r rVarF = z.n.f(rVarC3, j2, o0Var);
                                        u00.k kVar2 = kVar;
                                        boolean zG6 = g0Var4.g(kVar2);
                                        Object objN8 = g0Var4.N();
                                        Object obj10 = l1.i.a;
                                        if (zG6 || objN8 == obj10) {
                                            objN8 = new jz.t(4, kVar2);
                                            g0Var4.n0(objN8);
                                        }
                                        r rVarN = w50.c.n(rVarF, true, (u00.a) objN8);
                                        b2.i iVar2 = b2.b.E;
                                        w0 w0VarD2 = h0.o.d(iVar2, false);
                                        int iHashCode3 = Long.hashCode(g0Var4.T);
                                        m1 m1VarM3 = g0Var4.m();
                                        r rVarC4 = b2.a.c(rVarN, g0Var3);
                                        b3.i.c.getClass();
                                        g gVar2 = h.b;
                                        g0Var4.g0();
                                        if (g0Var4.S) {
                                            g0Var4.l(gVar2);
                                        } else {
                                            g0Var4.q0();
                                        }
                                        b3.f fVar5 = h.f;
                                        q.I(w0VarD2, g0Var3, fVar5);
                                        b3.f fVar6 = h.e;
                                        q.I(m1VarM3, g0Var3, fVar6);
                                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                                        b3.f fVar7 = h.g;
                                        q.I(numValueOf2, g0Var3, fVar7);
                                        b3.e eVar3 = h.h;
                                        q.E(g0Var3, eVar3);
                                        b3.f fVar8 = h.d;
                                        q.I(rVarC4, g0Var3, fVar8);
                                        float f4 = 20;
                                        o3.a(y3.R(2131231384, g0Var3, 0), (String) null, z1.m(oVar2, f4), ((t) p2Var4.getValue()).a, g0Var3, 440, 0);
                                        g0Var4.r(true);
                                        h0.c.h(z1.m(oVar2, 8), g0Var3);
                                        r rVarF2 = z.n.f(f2.h.c(z1.m(oVar2, f3), eVar2), ((t) p2Var5.getValue()).a, o0Var);
                                        boolean zG7 = g0Var4.g(kVar2);
                                        Object objN9 = g0Var4.N();
                                        if (zG7 || objN9 == obj10) {
                                            objN9 = new jz.t(5, kVar2);
                                            g0Var4.n0(objN9);
                                        }
                                        r rVarN2 = w50.c.n(rVarF2, true, (u00.a) objN9);
                                        w0 w0VarD3 = h0.o.d(iVar2, false);
                                        int iHashCode4 = Long.hashCode(g0Var4.T);
                                        m1 m1VarM4 = g0Var4.m();
                                        r rVarC5 = b2.a.c(rVarN2, g0Var3);
                                        g0Var4.g0();
                                        if (g0Var4.S) {
                                            g0Var4.l(gVar2);
                                        } else {
                                            g0Var4.q0();
                                        }
                                        q.I(w0VarD3, g0Var3, fVar5);
                                        q.I(m1VarM4, g0Var3, fVar6);
                                        x5.u(iHashCode4, g0Var3, fVar7, g0Var3, eVar3);
                                        q.I(rVarC5, g0Var3, fVar8);
                                        o3.a(y3.R(i11, g0Var3, 0), (String) null, z1.m(oVar2, f4), ((t) p2Var6.getValue()).a, g0Var3, 440, 0);
                                        g0Var4.r(true);
                                    } else {
                                        g0Var4.V();
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 432);
                            r rVarG2 = h0.c.G(h0.c.E(z1.d(oVar, 1.0f), f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                            z0 z0Var3 = z0Var;
                            String str = (String) z0Var3.getValue();
                            boolean zG6 = g0Var2.g(z0Var3);
                            Object objN8 = g0Var2.N();
                            if (zG6 || objN8 == obj6) {
                                objN8 = new o2(z0Var3, 11);
                                g0Var2.n0(objN8);
                            }
                            a.c(384, rVarG2, str, g0Var, (u00.k) objN8, false);
                            g0Var2.r(true);
                            g0Var2.r(true);
                        } else {
                            g0Var2.V();
                        }
                        return g00.b0.a;
                    }
                }, jVar2), jVar2, ((i5 >> 12) & 14) | 819465216 | ((i5 >> 3) & 112) | ((i5 >> 9) & 896) | ((i5 << 15) & 234881024), 48);
                rVar2 = rVar6;
                t0Var2 = t0Var4;
            } else {
                jVar2.V();
                rVar2 = rVar;
                t0Var2 = t0Var;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        a.d(uiState, onAction, backdrop, j, rVar2, t0Var2, (j) obj3, q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i8 |= 24576;
        i4 = i8 | (((i2 & 32) == 0 || !jVar2.g(t0Var)) ? 65536 : 131072);
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (jVar2.S(i4 & 1, z)) {
            jVar2.X();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                if ((i2 & 32) != 0) {
                    i5 = i4 & (-458753);
                    rVar4 = rVar3;
                    t0VarA = p0.f.a(42);
                } else {
                    t0VarA = t0Var;
                    i5 = i4;
                    rVar4 = rVar3;
                }
            } else {
                if (i9 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                if ((i2 & 32) != 0) {
                    i5 = i4 & (-458753);
                    rVar4 = rVar3;
                    t0VarA = p0.f.a(42);
                } else {
                    t0VarA = t0Var;
                    i5 = i4;
                    rVar4 = rVar3;
                }
            }
            jVar2.s();
            final j0.v vVarA2 = x.a(0, jVar2, 3);
            Object[] objArr2 = new Object[0];
            objN = jVar2.N();
            obj = l1.i.a;
            if (objN == obj) {
                objN = new h.e(9);
                jVar2.n0(objN);
            }
            z0Var = (z0) y1.k.c(objArr2, (u00.a) objN, jVar2, 48);
            zG = jVar2.g((String) z0Var.getValue()) | jVar2.g(uiState.o);
            objN2 = jVar2.N();
            if (zG) {
                objN2 = q.r(new jv.d(uiState, z0Var, 1));
                jVar2.n0(objN2);
            } else {
                objN2 = q.r(new jv.d(uiState, z0Var, 1));
                jVar2.n0(objN2);
            }
            final p2 p2Var2 = (p2) objN2;
            if (z2) {
                jB = t.b(0.3f, dl.a.i);
            } else {
                jB = t.b(0.06f, dl.a.i);
            }
            final p2 p2VarA5 = b2.a(jB, (y) null, (String) null, jVar2, 0, 14);
            if (z2) {
                jB2 = dl.a.k;
            } else {
                jB2 = t.b(0.7f, dl.a.k);
            }
            final p2 p2VarA6 = b2.a(jB2, (y) null, (String) null, jVar2, 0, 14);
            if (i7 != 0) {
                jB3 = t.b(0.06f, dl.a.i);
            } else if (i7 != 1) {
                jB3 = t.b(0.3f, dl.a.i);
            } else {
                jB3 = t.b(0.3f, dl.a.i);
            }
            final p2 p2VarA7 = b2.a(jB3, (y) null, (String) null, jVar2, 0, 14);
            if (i7 != 0) {
                jB4 = t.b(0.7f, dl.a.k);
            } else if (i7 != 1) {
                jB4 = dl.a.k;
            } else {
                jB4 = dl.a.k;
            }
            final p2 p2VarA8 = b2.a(jB4, (y) null, (String) null, jVar2, 0, 14);
            zE = jVar2.e(i7);
            objN3 = jVar2.N();
            if (zE) {
                obj2 = obj;
                if (objN3 == obj2) {
                }
                final int iIntValue3 = ((Number) objN3).intValue();
                final y3.c cVar3 = (y3.c) jVar2.k(o1.h);
                objN4 = jVar2.N();
                if (objN4 == obj2) {
                    objN4 = x5.s(0, jVar2);
                }
                z0Var2 = (z0) objN4;
                zD = jVar2.d(((y3.f) z0Var2.getValue()).A);
                objN5 = jVar2.N();
                if (zD) {
                    objN5 = h0.c.g(0.0f, ((y3.f) z0Var2.getValue()).A, 0.0f, 0.0f, 13);
                    jVar2.n0(objN5);
                } else {
                    objN5 = h0.c.g(0.0f, ((y3.f) z0Var2.getValue()).A, 0.0f, 0.0f, 13);
                    jVar2.n0(objN5);
                }
                final n1 n1Var3 = (n1) objN5;
                final float fA4 = cVar3.A0(((y3.f) z0Var2.getValue()).A + 12);
                final float fA5 = cVar3.A0(28);
                jVar2 = jVar2;
                r rVar7 = rVar4;
                t0 t0Var5 = t0VarA;
                va.a.e(rVar7, backdrop, t0Var5, 0.0f, (b2.d) null, false, 0.0f, 0.0f, new t(j), v1.d.d(-1481727874, new o() {
                    @Override
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        h0.r LiquidBox = (h0.r) obj3;
                        g0 g0Var = (j) obj4;
                        int iIntValue4 = ((Integer) obj5).intValue();
                        kotlin.jvm.internal.m.e(LiquidBox, "$this$LiquidBox");
                        boolean z3 = (iIntValue4 & 17) != 16;
                        g0 g0Var2 = g0Var;
                        a30.x xVar = g0Var2.a;
                        if (g0Var2.S(iIntValue4 & 1, z3)) {
                            a0 a0Var = z1.c;
                            w0 w0VarD = h0.o.d(b2.b.A, false);
                            int iHashCode = Long.hashCode(g0Var2.T);
                            m1 m1VarM = g0Var2.m();
                            r rVarC = b2.a.c(a0Var, g0Var);
                            b3.i.c.getClass();
                            g gVar = h.b;
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar);
                            } else {
                                g0Var2.q0();
                            }
                            b3.f fVar = h.f;
                            q.I(w0VarD, g0Var, fVar);
                            b3.f fVar2 = h.e;
                            q.I(m1VarM, g0Var, fVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            b3.f fVar3 = h.g;
                            q.I(numValueOf, g0Var, fVar3);
                            b3.e eVar = h.h;
                            q.E(g0Var, eVar);
                            b3.f fVar4 = h.d;
                            q.I(rVarC, g0Var, fVar4);
                            kotlin.jvm.internal.m.e(a0Var, "<this>");
                            r rVarW = ca.v.w(a0Var, fA4, fA5, 0.0f, 0.0f);
                            p2 p2Var3 = p2Var2;
                            boolean zG2 = g0Var2.g(p2Var3);
                            bv.o1 o1Var = uiState;
                            boolean zG3 = zG2 | g0Var2.g(o1Var);
                            final u00.k kVar = onAction;
                            boolean zG4 = zG3 | g0Var2.g(kVar);
                            Object objN6 = g0Var2.N();
                            Object obj6 = l1.i.a;
                            if (zG4 || objN6 == obj6) {
                                objN6 = new b1.l(p2Var3, o1Var, kVar, 19);
                                g0Var2.n0(objN6);
                            }
                            k00.f.d(rVarW, vVarA2, n1Var3, null, null, null, false, null, (u00.k) objN6, g0Var, 0, 504);
                            b2.i iVar = b2.b.B;
                            h0.s sVar = h0.s.a;
                            b2.o oVar = b2.o.A;
                            r rVarD = z1.d(sVar.a(oVar, iVar), 1.0f);
                            y3.c cVar4 = cVar3;
                            boolean zG5 = g0Var2.g(cVar4);
                            Object objN7 = g0Var2.N();
                            if (zG5 || objN7 == obj6) {
                                objN7 = new f0(cVar4, z0Var2, 11);
                                g0Var2.n0(objN7);
                            }
                            r rVarO = d0.o(rVarD, (u00.k) objN7);
                            float f = 12;
                            v vVarA3 = h0.u.a(i.g(f), b2.b.M, g0Var, 6);
                            int iHashCode2 = Long.hashCode(g0Var2.T);
                            m1 m1VarM2 = g0Var2.m();
                            r rVarC2 = b2.a.c(rVarO, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar);
                            } else {
                                g0Var2.q0();
                            }
                            q.I(vVarA3, g0Var, fVar);
                            q.I(m1VarM2, g0Var, fVar2);
                            x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                            q.I(rVarC2, g0Var, fVar4);
                            float f2 = 16;
                            r rVarG = h0.c.G(oVar, 0.0f, f2, 0.0f, 0.0f, 13);
                            String strU = z3.U(g0Var, 2131886367);
                            final p2 p2Var4 = p2VarA5;
                            final p2 p2Var5 = p2VarA6;
                            final p2 p2Var6 = p2VarA7;
                            final int i11 = iIntValue3;
                            final p2 p2Var7 = p2VarA8;
                            a.a(strU, rVarG, v1.d.d(-249099321, new o() {
                                @Override
                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                    w1 SurahListHeader = (w1) obj7;
                                    g0 g0Var3 = (j) obj8;
                                    int iIntValue5 = ((Integer) obj9).intValue();
                                    kotlin.jvm.internal.m.e(SurahListHeader, "$this$SurahListHeader");
                                    boolean z4 = (iIntValue5 & 17) != 16;
                                    g0 g0Var4 = g0Var3;
                                    a30.x xVar2 = g0Var4.a;
                                    if (g0Var4.S(iIntValue5 & 1, z4)) {
                                        float f3 = 34;
                                        b2.o oVar2 = b2.o.A;
                                        r rVarM = z1.m(oVar2, f3);
                                        p0.e eVar2 = p0.f.a;
                                        r rVarC3 = f2.h.c(rVarM, eVar2);
                                        long j2 = ((t) p2Var4.getValue()).a;
                                        o0 o0Var = b0.b;
                                        r rVarF = z.n.f(rVarC3, j2, o0Var);
                                        u00.k kVar2 = kVar;
                                        boolean zG6 = g0Var4.g(kVar2);
                                        Object objN8 = g0Var4.N();
                                        Object obj10 = l1.i.a;
                                        if (zG6 || objN8 == obj10) {
                                            objN8 = new jz.t(4, kVar2);
                                            g0Var4.n0(objN8);
                                        }
                                        r rVarN = w50.c.n(rVarF, true, (u00.a) objN8);
                                        b2.i iVar2 = b2.b.E;
                                        w0 w0VarD2 = h0.o.d(iVar2, false);
                                        int iHashCode3 = Long.hashCode(g0Var4.T);
                                        m1 m1VarM3 = g0Var4.m();
                                        r rVarC4 = b2.a.c(rVarN, g0Var3);
                                        b3.i.c.getClass();
                                        g gVar2 = h.b;
                                        g0Var4.g0();
                                        if (g0Var4.S) {
                                            g0Var4.l(gVar2);
                                        } else {
                                            g0Var4.q0();
                                        }
                                        b3.f fVar5 = h.f;
                                        q.I(w0VarD2, g0Var3, fVar5);
                                        b3.f fVar6 = h.e;
                                        q.I(m1VarM3, g0Var3, fVar6);
                                        Integer numValueOf2 = Integer.valueOf(iHashCode3);
                                        b3.f fVar7 = h.g;
                                        q.I(numValueOf2, g0Var3, fVar7);
                                        b3.e eVar3 = h.h;
                                        q.E(g0Var3, eVar3);
                                        b3.f fVar8 = h.d;
                                        q.I(rVarC4, g0Var3, fVar8);
                                        float f4 = 20;
                                        o3.a(y3.R(2131231384, g0Var3, 0), (String) null, z1.m(oVar2, f4), ((t) p2Var5.getValue()).a, g0Var3, 440, 0);
                                        g0Var4.r(true);
                                        h0.c.h(z1.m(oVar2, 8), g0Var3);
                                        r rVarF2 = z.n.f(f2.h.c(z1.m(oVar2, f3), eVar2), ((t) p2Var6.getValue()).a, o0Var);
                                        boolean zG7 = g0Var4.g(kVar2);
                                        Object objN9 = g0Var4.N();
                                        if (zG7 || objN9 == obj10) {
                                            objN9 = new jz.t(5, kVar2);
                                            g0Var4.n0(objN9);
                                        }
                                        r rVarN2 = w50.c.n(rVarF2, true, (u00.a) objN9);
                                        w0 w0VarD3 = h0.o.d(iVar2, false);
                                        int iHashCode4 = Long.hashCode(g0Var4.T);
                                        m1 m1VarM4 = g0Var4.m();
                                        r rVarC5 = b2.a.c(rVarN2, g0Var3);
                                        g0Var4.g0();
                                        if (g0Var4.S) {
                                            g0Var4.l(gVar2);
                                        } else {
                                            g0Var4.q0();
                                        }
                                        q.I(w0VarD3, g0Var3, fVar5);
                                        q.I(m1VarM4, g0Var3, fVar6);
                                        x5.u(iHashCode4, g0Var3, fVar7, g0Var3, eVar3);
                                        q.I(rVarC5, g0Var3, fVar8);
                                        o3.a(y3.R(i11, g0Var3, 0), (String) null, z1.m(oVar2, f4), ((t) p2Var7.getValue()).a, g0Var3, 440, 0);
                                        g0Var4.r(true);
                                    } else {
                                        g0Var4.V();
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 432);
                            r rVarG2 = h0.c.G(h0.c.E(z1.d(oVar, 1.0f), f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                            z0 z0Var3 = z0Var;
                            String str = (String) z0Var3.getValue();
                            boolean zG6 = g0Var2.g(z0Var3);
                            Object objN8 = g0Var2.N();
                            if (zG6 || objN8 == obj6) {
                                objN8 = new o2(z0Var3, 11);
                                g0Var2.n0(objN8);
                            }
                            a.c(384, rVarG2, str, g0Var, (u00.k) objN8, false);
                            g0Var2.r(true);
                            g0Var2.r(true);
                        } else {
                            g0Var2.V();
                        }
                        return g00.b0.a;
                    }
                }, jVar2), jVar2, ((i5 >> 12) & 14) | 819465216 | ((i5 >> 3) & 112) | ((i5 >> 9) & 896) | ((i5 << 15) & 234881024), 48);
                rVar2 = rVar7;
                t0Var2 = t0Var5;
            } else {
                obj2 = obj;
            }
            i6 = 2131231371;
            if (i7 != 0) {
                i6 = 2131231372;
            }
            objN3 = Integer.valueOf(i6);
            jVar2.n0(objN3);
            final int iIntValue4 = ((Number) objN3).intValue();
            final y3.c cVar4 = (y3.c) jVar2.k(o1.h);
            objN4 = jVar2.N();
            if (objN4 == obj2) {
                objN4 = x5.s(0, jVar2);
            }
            z0Var2 = (z0) objN4;
            zD = jVar2.d(((y3.f) z0Var2.getValue()).A);
            objN5 = jVar2.N();
            if (zD) {
                objN5 = h0.c.g(0.0f, ((y3.f) z0Var2.getValue()).A, 0.0f, 0.0f, 13);
                jVar2.n0(objN5);
            } else {
                objN5 = h0.c.g(0.0f, ((y3.f) z0Var2.getValue()).A, 0.0f, 0.0f, 13);
                jVar2.n0(objN5);
            }
            final n1 n1Var4 = (n1) objN5;
            final float fA6 = cVar4.A0(((y3.f) z0Var2.getValue()).A + 12);
            final float fA7 = cVar4.A0(28);
            jVar2 = jVar2;
            r rVar8 = rVar4;
            t0 t0Var6 = t0VarA;
            va.a.e(rVar8, backdrop, t0Var6, 0.0f, (b2.d) null, false, 0.0f, 0.0f, new t(j), v1.d.d(-1481727874, new o() {
                @Override
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    h0.r LiquidBox = (h0.r) obj3;
                    g0 g0Var = (j) obj4;
                    int iIntValue5 = ((Integer) obj5).intValue();
                    kotlin.jvm.internal.m.e(LiquidBox, "$this$LiquidBox");
                    boolean z3 = (iIntValue5 & 17) != 16;
                    g0 g0Var2 = g0Var;
                    a30.x xVar = g0Var2.a;
                    if (g0Var2.S(iIntValue5 & 1, z3)) {
                        a0 a0Var = z1.c;
                        w0 w0VarD = h0.o.d(b2.b.A, false);
                        int iHashCode = Long.hashCode(g0Var2.T);
                        m1 m1VarM = g0Var2.m();
                        r rVarC = b2.a.c(a0Var, g0Var);
                        b3.i.c.getClass();
                        g gVar = h.b;
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar);
                        } else {
                            g0Var2.q0();
                        }
                        b3.f fVar = h.f;
                        q.I(w0VarD, g0Var, fVar);
                        b3.f fVar2 = h.e;
                        q.I(m1VarM, g0Var, fVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        b3.f fVar3 = h.g;
                        q.I(numValueOf, g0Var, fVar3);
                        b3.e eVar = h.h;
                        q.E(g0Var, eVar);
                        b3.f fVar4 = h.d;
                        q.I(rVarC, g0Var, fVar4);
                        kotlin.jvm.internal.m.e(a0Var, "<this>");
                        r rVarW = ca.v.w(a0Var, fA6, fA7, 0.0f, 0.0f);
                        p2 p2Var3 = p2Var2;
                        boolean zG2 = g0Var2.g(p2Var3);
                        bv.o1 o1Var = uiState;
                        boolean zG3 = zG2 | g0Var2.g(o1Var);
                        final u00.k kVar = onAction;
                        boolean zG4 = zG3 | g0Var2.g(kVar);
                        Object objN6 = g0Var2.N();
                        Object obj6 = l1.i.a;
                        if (zG4 || objN6 == obj6) {
                            objN6 = new b1.l(p2Var3, o1Var, kVar, 19);
                            g0Var2.n0(objN6);
                        }
                        k00.f.d(rVarW, vVarA2, n1Var4, null, null, null, false, null, (u00.k) objN6, g0Var, 0, 504);
                        b2.i iVar = b2.b.B;
                        h0.s sVar = h0.s.a;
                        b2.o oVar = b2.o.A;
                        r rVarD = z1.d(sVar.a(oVar, iVar), 1.0f);
                        y3.c cVar5 = cVar4;
                        boolean zG5 = g0Var2.g(cVar5);
                        Object objN7 = g0Var2.N();
                        if (zG5 || objN7 == obj6) {
                            objN7 = new f0(cVar5, z0Var2, 11);
                            g0Var2.n0(objN7);
                        }
                        r rVarO = d0.o(rVarD, (u00.k) objN7);
                        float f = 12;
                        v vVarA3 = h0.u.a(i.g(f), b2.b.M, g0Var, 6);
                        int iHashCode2 = Long.hashCode(g0Var2.T);
                        m1 m1VarM2 = g0Var2.m();
                        r rVarC2 = b2.a.c(rVarO, g0Var);
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar);
                        } else {
                            g0Var2.q0();
                        }
                        q.I(vVarA3, g0Var, fVar);
                        q.I(m1VarM2, g0Var, fVar2);
                        x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                        q.I(rVarC2, g0Var, fVar4);
                        float f2 = 16;
                        r rVarG = h0.c.G(oVar, 0.0f, f2, 0.0f, 0.0f, 13);
                        String strU = z3.U(g0Var, 2131886367);
                        final p2 p2Var4 = p2VarA5;
                        final p2 p2Var5 = p2VarA6;
                        final p2 p2Var6 = p2VarA7;
                        final int i11 = iIntValue4;
                        final p2 p2Var7 = p2VarA8;
                        a.a(strU, rVarG, v1.d.d(-249099321, new o() {
                            @Override
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                w1 SurahListHeader = (w1) obj7;
                                g0 g0Var3 = (j) obj8;
                                int iIntValue6 = ((Integer) obj9).intValue();
                                kotlin.jvm.internal.m.e(SurahListHeader, "$this$SurahListHeader");
                                boolean z4 = (iIntValue6 & 17) != 16;
                                g0 g0Var4 = g0Var3;
                                a30.x xVar2 = g0Var4.a;
                                if (g0Var4.S(iIntValue6 & 1, z4)) {
                                    float f3 = 34;
                                    b2.o oVar2 = b2.o.A;
                                    r rVarM = z1.m(oVar2, f3);
                                    p0.e eVar2 = p0.f.a;
                                    r rVarC3 = f2.h.c(rVarM, eVar2);
                                    long j2 = ((t) p2Var4.getValue()).a;
                                    o0 o0Var = b0.b;
                                    r rVarF = z.n.f(rVarC3, j2, o0Var);
                                    u00.k kVar2 = kVar;
                                    boolean zG6 = g0Var4.g(kVar2);
                                    Object objN8 = g0Var4.N();
                                    Object obj10 = l1.i.a;
                                    if (zG6 || objN8 == obj10) {
                                        objN8 = new jz.t(4, kVar2);
                                        g0Var4.n0(objN8);
                                    }
                                    r rVarN = w50.c.n(rVarF, true, (u00.a) objN8);
                                    b2.i iVar2 = b2.b.E;
                                    w0 w0VarD2 = h0.o.d(iVar2, false);
                                    int iHashCode3 = Long.hashCode(g0Var4.T);
                                    m1 m1VarM3 = g0Var4.m();
                                    r rVarC4 = b2.a.c(rVarN, g0Var3);
                                    b3.i.c.getClass();
                                    g gVar2 = h.b;
                                    g0Var4.g0();
                                    if (g0Var4.S) {
                                        g0Var4.l(gVar2);
                                    } else {
                                        g0Var4.q0();
                                    }
                                    b3.f fVar5 = h.f;
                                    q.I(w0VarD2, g0Var3, fVar5);
                                    b3.f fVar6 = h.e;
                                    q.I(m1VarM3, g0Var3, fVar6);
                                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                                    b3.f fVar7 = h.g;
                                    q.I(numValueOf2, g0Var3, fVar7);
                                    b3.e eVar3 = h.h;
                                    q.E(g0Var3, eVar3);
                                    b3.f fVar8 = h.d;
                                    q.I(rVarC4, g0Var3, fVar8);
                                    float f4 = 20;
                                    o3.a(y3.R(2131231384, g0Var3, 0), (String) null, z1.m(oVar2, f4), ((t) p2Var5.getValue()).a, g0Var3, 440, 0);
                                    g0Var4.r(true);
                                    h0.c.h(z1.m(oVar2, 8), g0Var3);
                                    r rVarF2 = z.n.f(f2.h.c(z1.m(oVar2, f3), eVar2), ((t) p2Var6.getValue()).a, o0Var);
                                    boolean zG7 = g0Var4.g(kVar2);
                                    Object objN9 = g0Var4.N();
                                    if (zG7 || objN9 == obj10) {
                                        objN9 = new jz.t(5, kVar2);
                                        g0Var4.n0(objN9);
                                    }
                                    r rVarN2 = w50.c.n(rVarF2, true, (u00.a) objN9);
                                    w0 w0VarD3 = h0.o.d(iVar2, false);
                                    int iHashCode4 = Long.hashCode(g0Var4.T);
                                    m1 m1VarM4 = g0Var4.m();
                                    r rVarC5 = b2.a.c(rVarN2, g0Var3);
                                    g0Var4.g0();
                                    if (g0Var4.S) {
                                        g0Var4.l(gVar2);
                                    } else {
                                        g0Var4.q0();
                                    }
                                    q.I(w0VarD3, g0Var3, fVar5);
                                    q.I(m1VarM4, g0Var3, fVar6);
                                    x5.u(iHashCode4, g0Var3, fVar7, g0Var3, eVar3);
                                    q.I(rVarC5, g0Var3, fVar8);
                                    o3.a(y3.R(i11, g0Var3, 0), (String) null, z1.m(oVar2, f4), ((t) p2Var7.getValue()).a, g0Var3, 440, 0);
                                    g0Var4.r(true);
                                } else {
                                    g0Var4.V();
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 432);
                        r rVarG2 = h0.c.G(h0.c.E(z1.d(oVar, 1.0f), f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f, 7);
                        z0 z0Var3 = z0Var;
                        String str = (String) z0Var3.getValue();
                        boolean zG6 = g0Var2.g(z0Var3);
                        Object objN8 = g0Var2.N();
                        if (zG6 || objN8 == obj6) {
                            objN8 = new o2(z0Var3, 11);
                            g0Var2.n0(objN8);
                        }
                        a.c(384, rVarG2, str, g0Var, (u00.k) objN8, false);
                        g0Var2.r(true);
                        g0Var2.r(true);
                    } else {
                        g0Var2.V();
                    }
                    return g00.b0.a;
                }
            }, jVar2), jVar2, ((i5 >> 12) & 14) | 819465216 | ((i5 >> 3) & 112) | ((i5 >> 9) & 896) | ((i5 << 15) & 234881024), 48);
            rVar2 = rVar8;
            t0Var2 = t0Var6;
        } else {
            jVar2.V();
            rVar2 = rVar;
            t0Var2 = t0Var;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    a.d(uiState, onAction, backdrop, j, rVar2, t0Var2, (j) obj3, q.K(i | 1), i2);
                    return g00.b0.a;
                }
            };
        }
    }
}
