package g1;

import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

public abstract class a3 {

    public static final float f5709a = 48;

    public static final float f5710b = 56;

    public static final float f5711c;

    public static final h0.p1 f5712d;

    public static final h0.p1 f5713e;

    public static final float f5714f;

    static {
        float f3 = 12;
        f5711c = f3;
        f5712d = h0.c.g(0.0f, 0.0f, f3, f3, 3);
        float f10 = 24;
        float f11 = 16;
        h0.c.g(f10, f11, f3, 0.0f, 8);
        f5713e = h0.c.g(f10, 0.0f, f3, f3, 2);
        f5714f = f11;
    }

    public static final void a(final b2.r rVar, final v1.c cVar, final u00.n nVar, final u00.n nVar2, final h1 h1Var, final m3.r0 r0Var, final float f3, final v1.c cVar2, l1.j jVar, final int i10) {
        int i11;
        u00.n nVar3;
        u00.n nVar4;
        l1.g0 g0Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1539132883);
        if ((i10 & 6) == 0) {
            i11 = (g0Var2.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var2.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            nVar3 = nVar;
            i11 |= g0Var2.i(nVar3) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        } else {
            nVar3 = nVar;
        }
        if ((i10 & 3072) == 0) {
            nVar4 = nVar2;
            i11 |= g0Var2.i(nVar4) ? 2048 : 1024;
        } else {
            nVar4 = nVar2;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var2.g(h1Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var2.g(r0Var) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i10) == 0) {
            i11 |= g0Var2.d(f3) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= g0Var2.i(cVar2) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if (g0Var2.S(i12 & 1, (i12 & 4793491) != 4793490)) {
            b2.r rVarP = h0.z1.p(rVar, k1.h.f8743d, 0.0f, 0.0f, 14);
            Object objN = g0Var2.N();
            if (objN == l1.i.f9868a) {
                objN = new e6.c(19);
                g0Var2.n0(objN);
            }
            b2.r rVarF = z.n.f(j3.q.c(rVarP, false, (u00.k) objN), h1Var.f5814a, i2.b0.f7111b);
            h0.v vVarA = h0.u.a(h0.i.f6408c, b2.b.M, g0Var2, 0);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarF, g0Var2);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA, g0Var2, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var2, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var2.S || !kotlin.jvm.internal.m.a(g0Var2.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var2, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var2, b3.h.f2037d);
            d(cVar, h1Var.f5815b, h1Var.f5816c, f3, v1.d.d(-1658370654, new d10.e(nVar3, nVar4, cVar, h1Var, r0Var), g0Var2), g0Var2, (i12 & 112) | 196614 | (57344 & (i12 >> 6)));
            g0Var = g0Var2;
            cVar2.invoke(g0Var, Integer.valueOf(14 & (i12 >> 21)));
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a3.a(rVar, cVar, nVar, nVar2, h1Var, r0Var, f3, cVar2, (l1.j) obj, l1.q.K(i10 | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(b3 b3Var, b2.r rVar, r1 r1Var, h1 h1Var, v1.c cVar, u00.n nVar, boolean z10, g2.t tVar, l1.j jVar, int i10) {
        b2.r rVar2;
        r1 r1Var2;
        u00.n nVar2;
        boolean z11;
        r1 r1Var3;
        int i11;
        u00.n nVarD;
        b2.r rVar3;
        boolean z12;
        v1.c cVarD;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1105472031);
        int i12 = 2;
        int i13 = i10 | (g0Var.g(b3Var) ? 4 : 2) | 176 | (g0Var.g(h1Var) ? 2048 : 1024) | 1769472;
        if (g0Var.S(i13 & 1, (4793491 & i13) != 4793490)) {
            g0Var.X();
            int i14 = i10 & 1;
            l1.c cVar2 = l1.i.f9868a;
            if (i14 == 0 || g0Var.A()) {
                Object objN = g0Var.N();
                if (objN == cVar2) {
                    l1 l1Var = l1.f5852a;
                    objN = new r1();
                    g0Var.n0(objN);
                }
                r1Var3 = (r1) objN;
                i11 = i13 & (-897);
                nVarD = v1.d.d(1439279037, new o1(b3Var, r1Var3, h1Var), g0Var);
                rVar3 = b2.o.A;
                z12 = true;
            } else {
                g0Var.V();
                i11 = i13 & (-897);
                rVar3 = rVar;
                r1Var3 = r1Var;
                nVarD = nVar;
                z12 = z10;
            }
            int i15 = i11;
            g0Var.s();
            boolean zG = g0Var.g(b3Var.f5729b);
            Object objN2 = g0Var.N();
            if (zG || objN2 == cVar2) {
                objN2 = b3Var.f5730c;
                g0Var.n0(objN2);
            }
            h1.t tVar2 = (h1.t) objN2;
            if (z12) {
                g0Var.c0(-690551113);
                cVarD = v1.d.d(-1483431603, new w(b3Var, h1Var, i12), g0Var);
                g0Var.r(false);
            } else {
                g0Var.c0(-690163489);
                g0Var.r(false);
                cVarD = null;
            }
            v1.c cVar3 = cVarD;
            u00.n nVar3 = nVarD;
            b2.r rVar4 = rVar3;
            a(rVar4, cVar, nVar3, cVar3, h1Var, m8.a(k1.h.f8754q, g0Var), k1.h.f8752o, v1.d.d(-1346903698, new k2(b3Var, tVar2, r1Var3, h1Var, tVar, 0), g0Var), g0Var, (57344 & (i15 << 3)) | 14156214);
            nVar2 = nVar3;
            z11 = z12;
            r1Var2 = r1Var3;
            rVar2 = rVar4;
        } else {
            g0Var.V();
            rVar2 = rVar;
            r1Var2 = r1Var;
            nVar2 = nVar;
            z11 = z10;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new v1(b3Var, rVar2, r1Var2, h1Var, cVar, nVar2, z11, tVar, i10);
        }
    }

    public static final void c(final Long l, final long j9, final u00.k kVar, final u00.k kVar2, final h1.t tVar, final z00.e eVar, final r1 r1Var, final d6 d6Var, final h1 h1Var, l1.j jVar, final int i10) throws NoWhenBranchMatchedException {
        b3.g gVar;
        String strI;
        boolean zI;
        Object objN;
        boolean zI2;
        Object objN2;
        boolean zG;
        Object objN3;
        b3.g gVar2;
        int iHashCode;
        int iHashCode2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-434467002);
        int i11 = i10 | (g0Var.g(l) ? 4 : 2) | (g0Var.f(j9) ? 32 : 16) | (g0Var.i(kVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.i(kVar2) ? 2048 : 1024) | (g0Var.i(tVar) ? 16384 : 8192) | (g0Var.i(eVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH) | (g0Var.g(r1Var) ? 1048576 : 524288) | (g0Var.g(d6Var) ? 8388608 : 4194304) | (g0Var.g(h1Var) ? 67108864 : 33554432);
        if (g0Var.S(i11 & 1, (38347923 & i11) != 38347922)) {
            h1.w wVarA = tVar.a(j9);
            int i12 = (((wVarA.f6534a - ((z00.c) eVar).A) * 12) + wVarA.f6535b) - 1;
            if (i12 < 0) {
                i12 = 0;
            }
            final j0.v vVarA = j0.x.a(i12, g0Var, 2);
            Integer numValueOf = Integer.valueOf(i12);
            boolean zG2 = g0Var.g(vVarA) | g0Var.e(i12);
            Object objN4 = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG2 || objN4 == cVar) {
                objN4 = new a1.p1(vVarA, i12, (k00.c) null, 4);
                g0Var.n0(objN4);
            }
            l1.q.i(numValueOf, g0Var, (u00.n) objN4);
            Object objN5 = g0Var.N();
            if (objN5 == cVar) {
                objN5 = l1.q.o(g0Var);
                g0Var.n0(objN5);
            }
            final a40.z zVar = (a40.z) objN5;
            Object[] objArr = new Object[0];
            Object objN6 = g0Var.N();
            if (objN6 == cVar) {
                objN6 = new e00.g(16);
                g0Var.n0(objN6);
            }
            l1.z0 z0Var = (l1.z0) y1.k.c(objArr, (u00.a) objN6, g0Var, 48);
            h0.d dVar = h0.i.f6408c;
            b2.g gVar3 = b2.b.M;
            h0.v vVarA2 = h0.u.a(dVar, gVar3, g0Var, 0);
            int iHashCode3 = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC = b2.a.c(oVar, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar4 = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar4);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f2039f;
            l1.q.I(vVarA2, g0Var, fVar);
            b3.f fVar2 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar2);
            b3.f fVar3 = b3.h.f2040g;
            if (g0Var.S) {
                gVar = gVar4;
            } else {
                gVar = gVar4;
                if (!kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode3))) {
                }
                b3.f fVar4 = b3.h.f2037d;
                l1.q.I(rVarC, g0Var, fVar4);
                float f3 = f5711c;
                b2.r rVarE = h0.c.E(oVar, f3, 0.0f, 2);
                boolean zD = vVarA.d();
                boolean zB = vVarA.b();
                boolean zBooleanValue = ((Boolean) z0Var.getValue()).booleanValue();
                Locale locale = tVar.f6528a;
                r1Var.getClass();
                strI = h1.f.i(j9, "yMMMM", locale, r1Var.f5950a);
                if (strI == null) {
                    strI = "-";
                }
                zI = g0Var.i(zVar) | g0Var.g(vVarA);
                objN = g0Var.N();
                if (zI || objN == cVar) {
                    final int i13 = 0;
                    objN = new u00.a() {
                        public final Object invoke() {
                            switch (i13) {
                                case 0:
                                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 0), 3);
                                    break;
                                default:
                                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 1), 3);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var.n0(objN);
                }
                u00.a aVar = (u00.a) objN;
                zI2 = g0Var.i(zVar) | g0Var.g(vVarA);
                objN2 = g0Var.N();
                if (zI2 || objN2 == cVar) {
                    final int i14 = 1;
                    objN2 = new u00.a() {
                        public final Object invoke() {
                            switch (i14) {
                                case 0:
                                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 0), 3);
                                    break;
                                default:
                                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 1), 3);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                    g0Var.n0(objN2);
                }
                u00.a aVar2 = (u00.a) objN2;
                zG = g0Var.g(z0Var);
                objN3 = g0Var.N();
                if (zG || objN3 == cVar) {
                    objN3 = new ct.k(z0Var, 4);
                    g0Var.n0(objN3);
                }
                int i15 = i11 & 234881024;
                gVar2 = gVar;
                j(rVarE, zD, zB, zBooleanValue, strI, aVar, aVar2, (u00.a) objN3, h1Var, g0Var, i15 | 6);
                g0Var = g0Var;
                z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                iHashCode = Long.hashCode(g0Var.T);
                l1.m1 m1VarM2 = g0Var.m();
                b2.r rVarC2 = b2.a.c(oVar, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD, g0Var, fVar);
                l1.q.I(m1VarM2, g0Var, fVar2);
                if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                    com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar3);
                }
                l1.q.I(rVarC2, g0Var, fVar4);
                b2.r rVarE2 = h0.c.E(oVar, f3, 0.0f, 2);
                h0.v vVarA3 = h0.u.a(dVar, gVar3, g0Var, 0);
                iHashCode2 = Long.hashCode(g0Var.T);
                l1.m1 m1VarM3 = g0Var.m();
                b2.r rVarC3 = b2.a.c(rVarE2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA3, g0Var, fVar);
                l1.q.I(m1VarM3, g0Var, fVar2);
                if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode2))) {
                    com.google.android.gms.internal.measurement.x5.v(iHashCode2, g0Var, iHashCode2, fVar3);
                }
                l1.q.I(rVarC3, g0Var, fVar4);
                l(h1Var, tVar, g0Var, ((i11 >> 24) & 14) | ((i11 >> 9) & 112));
                g(vVarA, l, kVar, kVar2, tVar, eVar, r1Var, d6Var, h1Var, g0Var, ((i11 << 3) & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128) | i15);
                g0Var.r(true);
                k1.q qVar = k1.q.C;
                x.b1 b1VarP = x5.p(qVar, g0Var);
                x.b1 b1VarP2 = x5.p(k1.q.D, g0Var);
                x.b1 b1VarP3 = x5.p(qVar, g0Var);
                w.c0.c(((Boolean) z0Var.getValue()).booleanValue(), f2.h.d(oVar), w.s0.b(b1VarP3, 14).a(new w.x0(new w.g2(new w.z0(0.6f, b1VarP), (w.d2) null, (w.i0) null, (w.d1) null, (LinkedHashMap) null, 126))), w.s0.h(b1VarP3, 14).a(w.s0.d(b1VarP2, 2)), null, v1.d.d(1193716082, new m2(j9, z0Var, zVar, vVarA, eVar, wVarA, d6Var, tVar, h1Var), g0Var), g0Var, 196656, 16);
                g0Var.r(true);
                g0Var.r(true);
            }
            com.google.android.gms.internal.measurement.x5.v(iHashCode3, g0Var, iHashCode3, fVar3);
            b3.f fVar5 = b3.h.f2037d;
            l1.q.I(rVarC, g0Var, fVar5);
            float f10 = f5711c;
            b2.r rVarE3 = h0.c.E(oVar, f10, 0.0f, 2);
            boolean zD2 = vVarA.d();
            boolean zB2 = vVarA.b();
            boolean zBooleanValue2 = ((Boolean) z0Var.getValue()).booleanValue();
            Locale locale2 = tVar.f6528a;
            r1Var.getClass();
            strI = h1.f.i(j9, "yMMMM", locale2, r1Var.f5950a);
            if (strI == null) {
                strI = "-";
            }
            zI = g0Var.i(zVar) | g0Var.g(vVarA);
            objN = g0Var.N();
            if (zI) {
                final int i16 = 0;
                objN = new u00.a() {
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 0), 3);
                                break;
                            default:
                                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 1), 3);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN);
            } else {
                final int i17 = 0;
                objN = new u00.a() {
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 0), 3);
                                break;
                            default:
                                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 1), 3);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN);
            }
            u00.a aVar3 = (u00.a) objN;
            zI2 = g0Var.i(zVar) | g0Var.g(vVarA);
            objN2 = g0Var.N();
            if (zI2) {
                final int i18 = 1;
                objN2 = new u00.a() {
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 0), 3);
                                break;
                            default:
                                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 1), 3);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN2);
            } else {
                final int i19 = 1;
                objN2 = new u00.a() {
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 0), 3);
                                break;
                            default:
                                a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new l2(vVarA, (k00.c) null, 1), 3);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN2);
            }
            u00.a aVar4 = (u00.a) objN2;
            zG = g0Var.g(z0Var);
            objN3 = g0Var.N();
            if (zG) {
                objN3 = new ct.k(z0Var, 4);
                g0Var.n0(objN3);
            } else {
                objN3 = new ct.k(z0Var, 4);
                g0Var.n0(objN3);
            }
            int i110 = i11 & 234881024;
            gVar2 = gVar;
            j(rVarE3, zD2, zB2, zBooleanValue2, strI, aVar3, aVar4, (u00.a) objN3, h1Var, g0Var, i110 | 6);
            g0Var = g0Var;
            z2.w0 w0VarD2 = h0.o.d(b2.b.A, false);
            iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM4 = g0Var.m();
            b2.r rVarC4 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, fVar);
            l1.q.I(m1VarM4, g0Var, fVar2);
            if (g0Var.S) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar3);
            } else {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar3);
            }
            l1.q.I(rVarC4, g0Var, fVar5);
            b2.r rVarE4 = h0.c.E(oVar, f10, 0.0f, 2);
            h0.v vVarA4 = h0.u.a(dVar, gVar3, g0Var, 0);
            iHashCode2 = Long.hashCode(g0Var.T);
            l1.m1 m1VarM5 = g0Var.m();
            b2.r rVarC5 = b2.a.c(rVarE4, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA4, g0Var, fVar);
            l1.q.I(m1VarM5, g0Var, fVar2);
            if (g0Var.S) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode2, g0Var, iHashCode2, fVar3);
            } else {
                com.google.android.gms.internal.measurement.x5.v(iHashCode2, g0Var, iHashCode2, fVar3);
            }
            l1.q.I(rVarC5, g0Var, fVar5);
            l(h1Var, tVar, g0Var, ((i11 >> 24) & 14) | ((i11 >> 9) & 112));
            g(vVarA, l, kVar, kVar2, tVar, eVar, r1Var, d6Var, h1Var, g0Var, ((i11 << 3) & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (i11 & 29360128) | i110);
            g0Var.r(true);
            k1.q qVar2 = k1.q.C;
            x.b1 b1VarP4 = x5.p(qVar2, g0Var);
            x.b1 b1VarP5 = x5.p(k1.q.D, g0Var);
            x.b1 b1VarP6 = x5.p(qVar2, g0Var);
            w.c0.c(((Boolean) z0Var.getValue()).booleanValue(), f2.h.d(oVar), w.s0.b(b1VarP6, 14).a(new w.x0(new w.g2(new w.z0(0.6f, b1VarP4), (w.d2) null, (w.i0) null, (w.d1) null, (LinkedHashMap) null, 126))), w.s0.h(b1VarP6, 14).a(w.s0.d(b1VarP5, 2)), null, v1.d.d(1193716082, new m2(j9, z0Var, zVar, vVarA, eVar, wVarA, d6Var, tVar, h1Var), g0Var), g0Var, 196656, 16);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n(l, j9, kVar, kVar2, tVar, eVar, r1Var, d6Var, h1Var, i10) {
                public final Long A;
                public final long B;
                public final u00.k C;
                public final u00.k D;
                public final h1.t E;
                public final z00.e F;
                public final r1 G;
                public final d6 H;
                public final h1 I;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    a3.c(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d(final v1.c cVar, final long j9, final long j10, final float f3, final v1.c cVar2, l1.j jVar, final int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(2020490761);
        int i12 = i10 & 6;
        b2.o oVar = b2.o.A;
        if (i12 == 0) {
            i11 = (g0Var.g(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.f(j9) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.f(j10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.i(cVar2) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (74899 & i11) != 74898)) {
            b2.r rVarV = h0.z1.d(oVar, 1.0f).V(h0.z1.b(0.0f, f3, 1));
            h0.v vVarA = h0.u.a(h0.i.f6412g, b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarV, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            g0Var.c0(396894187);
            h1.f.c(j9, m8.a(k1.h.f8756s, g0Var), v1.d.d(1344395458, new c0(cVar, 1), g0Var), g0Var, ((i11 >> 6) & 14) | 384);
            g0Var.r(false);
            l1.q.a(y0.f6028a.a(new i2.t(j10)), cVar2, g0Var, ((i11 >> 12) & 112) | 8);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a3.d(cVar, j9, j10, f3, cVar2, (l1.j) obj, l1.q.K(i10 | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void e(final String str, final boolean z10, final u00.a aVar, final boolean z11, final boolean z12, final boolean z13, final String str2, final h1 h1Var, l1.j jVar, final int i10) {
        int i11;
        long j9;
        l1.p2 p2VarG;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-945355136);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i10 & 48;
        b2.o oVar = b2.o.A;
        if (i12 == 0) {
            i11 |= g0Var.g(oVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.h(z10) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.i(aVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.h(z11) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.h(z12) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i10) == 0) {
            i11 |= g0Var.h(z13) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= g0Var.h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= g0Var.g(str2) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= g0Var.g(h1Var) ? 536870912 : 268435456;
        }
        if (g0Var.S(i11 & 1, (306783379 & i11) != 306783378)) {
            boolean z14 = (234881024 & i11) == 67108864;
            Object objN = g0Var.N();
            if (z14 || objN == l1.i.f9868a) {
                objN = new b6.o(str2, 4);
                g0Var.n0(objN);
            }
            b2.r rVarC = j3.q.c(oVar, true, (u00.k) objN);
            i2.t0 t0VarA = g6.a(k1.h.f8745f, g0Var);
            int i13 = i11 >> 6;
            if (z10) {
                j9 = z12 ? h1Var.f5829r : h1Var.f5830s;
            } else {
                j9 = i2.t.f7166f;
            }
            long j10 = j9;
            if (z11) {
                g0Var.c0(-1319856736);
                p2VarG = w.b2.a(j10, x5.p(k1.q.C, g0Var), null, g0Var, 0, 12);
                g0Var.r(false);
            } else {
                g0Var.c0(-1319630064);
                p2VarG = l1.q.G(new i2.t(j10), g0Var);
                g0Var.r(false);
            }
            s6.b(z10, aVar, rVarC, z12, t0VarA, ((i2.t) p2VarG.getValue()).f7169a, (!z13 || z10) ? null : z.n.a(k1.h.l, h1Var.f5832u), v1.d.d(1126347158, new n2(str, h1Var, z13, z10, z12, 0), g0Var), g0Var, i13 & 7294, 1472);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a3.e(str, z10, aVar, z11, z12, z13, str2, h1Var, (l1.j) obj, l1.q.K(i10 | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void f(b2.r rVar, int i10, u00.k kVar, h1 h1Var, l1.j jVar, int i11) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1461252485);
        int i12 = (g0Var.e(i10) ? 32 : 16) | i11 | (g0Var.i(kVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.g(h1Var) ? 2048 : 1024);
        if (g0Var.S(i12 & 1, (i12 & 1171) != 1170)) {
            l1.q.a(y0.f6028a.a(new i2.t(h1Var.f5816c)), v1.d.d(-1734512197, new o2(i10, rVar, kVar), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(rVar, i10, kVar, h1Var, i11);
        }
    }

    public static final void g(j0.v vVar, final Long l, final u00.k kVar, final u00.k kVar2, final h1.t tVar, final z00.e eVar, final r1 r1Var, final d6 d6Var, final h1 h1Var, l1.j jVar, final int i10) {
        Object gVar;
        final j0.v vVar2 = vVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1994757941);
        int i11 = i10 | (g0Var.g(vVar2) ? 4 : 2);
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(l) ? 32 : 16;
        }
        int i12 = i11 | (g0Var.i(kVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.i(kVar2) ? 2048 : 1024) | (g0Var.i(tVar) ? 16384 : 8192) | (g0Var.i(eVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH) | (g0Var.g(r1Var) ? 1048576 : 524288) | (g0Var.g(d6Var) ? 8388608 : 4194304) | (g0Var.g(h1Var) ? 67108864 : 33554432);
        if (g0Var.S(i12 & 1, (38347923 & i12) != 38347922)) {
            h1.s sVarB = tVar.b();
            boolean zG = g0Var.g(eVar);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = ((h1.v) tVar).e(LocalDate.of(((z00.c) eVar).A, 1, 1));
                g0Var.n0(objN);
            }
            z6.a(m8.a(k1.h.f8747h, g0Var), v1.d.d(1504086906, new r2(vVar2, eVar, tVar, (h1.w) objN, kVar, sVarB, l, r1Var, d6Var, h1Var), g0Var), g0Var, 48);
            boolean zI = ((i12 & 14) == 4) | ((i12 & 7168) == 2048) | g0Var.i(tVar) | g0Var.i(eVar);
            Object objN2 = g0Var.N();
            if (zI || objN2 == cVar) {
                vVar2 = vVar;
                gVar = new a1.g(vVar2, kVar2, tVar, eVar, null, 26);
                g0Var.n0(gVar);
            } else {
                gVar = objN2;
                vVar2 = vVar;
            }
            l1.q.i(vVar2, g0Var, (u00.n) gVar);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a3.g(vVar2, l, kVar, kVar2, tVar, eVar, r1Var, d6Var, h1Var, (l1.j) obj, l1.q.K(i10 | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void h(u00.a aVar, o2.f fVar, String str, b2.r rVar, boolean z10, l1.j jVar, int i10, int i11) {
        int i12;
        boolean z11;
        int i13;
        b2.r rVar2;
        boolean z12;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-368059805);
        int i14 = i10 | (g0Var.i(aVar) ? 4 : 2) | (g0Var.g(fVar) ? 32 : 16) | (g0Var.g(str) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        int i15 = i11 & 8;
        if (i15 != 0) {
            i12 = i14 | 3072;
        } else {
            i12 = i14 | (g0Var.g(rVar) ? 2048 : 1024);
        }
        int i16 = i11 & 16;
        if (i16 != 0) {
            i13 = i12 | 24576;
            z11 = z10;
        } else {
            z11 = z10;
            i13 = i12 | (g0Var.h(z11) ? 16384 : 8192);
        }
        if (g0Var.S(i13 & 1, (i13 & 9363) != 9362)) {
            b2.r rVar3 = i15 != 0 ? b2.o.A : rVar;
            if (i16 != 0) {
                z11 = true;
            }
            boolean z13 = z11;
            h8.b(e8.a(g0Var), v1.d.d(-456272562, new s2(str, 0), g0Var), h8.c(g0Var), null, false, v1.d.d(-1124908186, new t2(aVar, rVar3, z13, fVar, str), g0Var), g0Var, 100663344);
            rVar2 = rVar3;
            z12 = z13;
        } else {
            g0Var.V();
            rVar2 = rVar;
            z12 = z11;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.r(aVar, fVar, str, rVar2, z12, i10, i11);
        }
    }

    public static final void i(final h1.w wVar, final u00.k kVar, final long j9, final Long l, final r1 r1Var, final d6 d6Var, final h1 h1Var, final Locale locale, l1.j jVar, final int i10) {
        l1.g0 g0Var;
        l1.g0 g0Var2;
        b2.o oVar;
        u00.k kVar2 = kVar;
        Long l10 = l;
        r1 r1Var2 = r1Var;
        l1.g0 g0Var3 = (l1.g0) jVar;
        g0Var3.e0(-333300603);
        int i11 = i10 | (g0Var3.g(wVar) ? 4 : 2) | (g0Var3.i(kVar2) ? 32 : 16) | (g0Var3.f(j9) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var3.g(l10) ? 2048 : 1024) | (g0Var3.g(r1Var2) ? 1048576 : 524288) | (g0Var3.g(d6Var) ? 8388608 : 4194304) | (g0Var3.g(h1Var) ? 67108864 : 33554432) | (g0Var3.i(locale) ? 536870912 : 268435456);
        if (g0Var3.S(i11 & 1, (306783379 & i11) != 306783378)) {
            g0Var3.c0(606771165);
            g0Var3.r(false);
            float f3 = f5709a * 6;
            b2.o oVar2 = b2.o.A;
            b2.r rVarV = h0.z1.h(oVar2, f3).V(oVar2);
            h0.v vVarA = h0.u.a(h0.i.f6411f, b2.b.M, g0Var3, 6);
            int iHashCode = Long.hashCode(g0Var3.T);
            l1.m1 m1VarM = g0Var3.m();
            b2.r rVarC = b2.a.c(rVarV, g0Var3);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            l1.q.I(vVarA, g0Var3, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var3, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var3.S || !kotlin.jvm.internal.m.a(g0Var3.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var3, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var3, b3.h.f2037d);
            g0Var3.c0(-680088486);
            int i12 = 0;
            int i13 = 0;
            int i14 = 6;
            while (i13 < i14) {
                b2.r rVarD = h0.z1.d(oVar2, 1.0f);
                h0.v1 v1VarA = h0.t1.a(h0.i.f6411f, b2.b.K, g0Var3, 54);
                int iHashCode2 = Long.hashCode(g0Var3.T);
                l1.m1 m1VarM2 = g0Var3.m();
                b2.r rVarC2 = b2.a.c(rVarD, g0Var3);
                b3.i.f2042c.getClass();
                int i15 = i12;
                b3.g gVar2 = b3.h.f2035b;
                g0Var3.g0();
                int i16 = i13;
                if (g0Var3.S) {
                    g0Var3.l(gVar2);
                } else {
                    g0Var3.q0();
                }
                l1.q.I(v1VarA, g0Var3, b3.h.f2039f);
                l1.q.I(m1VarM2, g0Var3, b3.h.f2038e);
                b3.f fVar2 = b3.h.f2040g;
                if (g0Var3.S || !kotlin.jvm.internal.m.a(g0Var3.N(), Integer.valueOf(iHashCode2))) {
                    com.google.android.gms.internal.measurement.x5.v(iHashCode2, g0Var3, iHashCode2, fVar2);
                }
                l1.q.I(rVarC2, g0Var3, b3.h.f2037d);
                g0Var3.c0(1542622325);
                int i17 = i15;
                int i18 = 0;
                while (i18 < 7) {
                    int i19 = wVar.f6537d;
                    if (i17 < i19 || i17 >= i19 + wVar.f6536c) {
                        i11 = i11;
                        g0Var2 = g0Var3;
                        oVar = oVar2;
                        g0Var2.c0(576825328);
                        b2.r rVarP = h0.z1.p(oVar, k1.h.f8746g, k1.h.f8744e, 0.0f, 12);
                        l1.q2 q2Var = r3.f5953c;
                        h0.c.h(h0.z1.n(rVarP, ((y3.f) g0Var2.k(q2Var)).A, ((y3.f) g0Var2.k(q2Var)).A), g0Var2);
                        g0Var2.r(false);
                    } else {
                        g0Var3.c0(577914947);
                        int i20 = i17 - wVar.f6537d;
                        long j10 = (((long) i20) * 86400000) + wVar.f6538e;
                        boolean z10 = j10 == j9;
                        boolean z11 = l10 != null && j10 == l10.longValue();
                        g0Var3.c0(578890300);
                        g0Var3.r(false);
                        StringBuilder sb2 = new StringBuilder();
                        g0Var3.c0(974838827);
                        g0Var3.r(false);
                        if (z10) {
                            g0Var3.c0(1416920485);
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(h1.f.l(g0Var3, 2131886676));
                            g0Var3.r(false);
                        } else {
                            g0Var3.c0(975029291);
                            g0Var3.r(false);
                        }
                        String string = sb2.length() == 0 ? null : sb2.toString();
                        String strA = r1Var2.a(Long.valueOf(j10), locale, true);
                        if (strA == null) {
                            strA = RuntimeVersion.SUFFIX;
                        }
                        String strA2 = y.a(i20 + 1, locale, 7);
                        boolean zF = ((i11 & 112) == 32) | g0Var3.f(j10);
                        Object objN = g0Var3.N();
                        l1.c cVar = l1.i.f9868a;
                        if (zF || objN == cVar) {
                            objN = new a2(kVar2, j10, 0);
                            g0Var3.n0(objN);
                        }
                        u00.a aVar = (u00.a) objN;
                        boolean zF2 = ((i11 & 29360128) == 8388608) | g0Var3.f(j10);
                        Object objN2 = g0Var3.N();
                        if (zF2 || objN2 == cVar) {
                            objN2 = Boolean.valueOf(d6Var.b(wVar.f6534a) && d6Var.a(j10));
                            g0Var3.n0(objN2);
                        }
                        boolean zBooleanValue = ((Boolean) objN2).booleanValue();
                        if (string != null) {
                            strA = com.google.android.gms.internal.measurement.x5.m(string, ", ", strA);
                        }
                        l1.g0 g0Var4 = g0Var3;
                        oVar = oVar2;
                        e(strA2, z11, aVar, z11, zBooleanValue, z10, strA, h1Var, g0Var4, ((i11 << 3) & 1879048192) | 48);
                        g0Var2 = g0Var4;
                        g0Var2.r(false);
                    }
                    oVar2 = oVar;
                    g0Var3 = g0Var2;
                    i18++;
                    kVar2 = kVar;
                    l10 = l;
                    r1Var2 = r1Var;
                    i17++;
                    i11 = i11;
                }
                l1.g0 g0Var5 = g0Var3;
                g0Var5.r(false);
                g0Var5.r(true);
                kVar2 = kVar;
                l10 = l;
                r1Var2 = r1Var;
                i14 = 6;
                g0Var3 = g0Var5;
                i13 = i16 + 1;
                i12 = i17;
                i11 = i11;
            }
            g0Var = g0Var3;
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var = g0Var3;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n(kVar, j9, l, r1Var, d6Var, h1Var, locale, i10) {
                public final u00.k B;
                public final long C;
                public final Long D;
                public final r1 E;
                public final d6 F;
                public final h1 G;
                public final Locale H;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(221185);
                    a3.i(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void j(b2.r rVar, final boolean z10, final boolean z11, final boolean z12, final String str, final u00.a aVar, final u00.a aVar2, final u00.a aVar3, final h1 h1Var, l1.j jVar, final int i10) {
        b2.r rVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-773929258);
        int i11 = i10 | (g0Var.h(z10) ? 32 : 16) | (g0Var.h(z11) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.h(z12) ? 2048 : 1024) | (g0Var.g(str) ? 16384 : 8192) | (g0Var.i(aVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH) | (g0Var.i(aVar2) ? 1048576 : 524288) | (g0Var.i(aVar3) ? 8388608 : 4194304) | (g0Var.g(h1Var) ? 67108864 : 33554432);
        if (g0Var.S(i11 & 1, (38347923 & i11) != 38347922)) {
            rVar2 = rVar;
            b2.r rVarH = h0.z1.h(h0.z1.d(rVar2, 1.0f), f5710b);
            h0.v1 v1VarA = h0.t1.a(z12 ? h0.i.f6406a : h0.i.f6412g, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarH, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            o(((i11 >> 21) & 14) | 3072 | ((i11 >> 6) & 112), null, g0Var, aVar3, v1.d.d(619076006, new w(str, h1Var, 4), g0Var), z12);
            if (z12) {
                g0Var.c0(282432080);
                g0Var.r(false);
            } else {
                g0Var.c0(281624840);
                l1.q.a(y0.f6028a.a(new i2.t(h1Var.f5819f)), v1.d.d(-128317193, new u2(aVar2, z11, aVar, z10), g0Var), g0Var, 56);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            rVar2 = rVar;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final b2.r rVar3 = rVar2;
            r1VarT.f9921d = new u00.n(z10, z11, z12, str, aVar, aVar2, aVar3, h1Var, i10) {
                public final boolean B;
                public final boolean C;
                public final boolean D;
                public final String E;
                public final u00.a F;
                public final u00.a G;
                public final u00.a H;
                public final h1 I;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(7);
                    a3.j(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void k(final Long l, final long j9, final int i10, final u00.k kVar, final u00.k kVar2, final h1.t tVar, final z00.e eVar, final r1 r1Var, final d6 d6Var, final h1 h1Var, final g2.t tVar2, l1.j jVar, final int i11) throws NoWhenBranchMatchedException {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-2053685029);
        int i12 = i11 | (g0Var.g(l) ? 4 : 2) | (g0Var.f(j9) ? 32 : 16) | (g0Var.e(i10) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.i(kVar) ? 2048 : 1024) | (g0Var.i(kVar2) ? 16384 : 8192) | (g0Var.i(tVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH) | (g0Var.i(eVar) ? 1048576 : 524288) | (g0Var.g(r1Var) ? 8388608 : 4194304) | (g0Var.g(d6Var) ? 67108864 : 33554432) | (g0Var.g(h1Var) ? 536870912 : 268435456);
        if (g0Var.S(i12 & 1, ((i12 & 306783379) == 306783378 && ((g0Var.g(tVar2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            int i13 = -((y3.c) g0Var.k(c3.o1.f2734h)).R0(48);
            x.b1 b1VarP = x5.p(k1.q.C, g0Var);
            x.b1 b1VarP2 = x5.p(k1.q.D, g0Var);
            k1.q qVar = k1.q.A;
            x.b1 b1VarP3 = x5.p(qVar, g0Var);
            x.b1 b1VarP4 = x5.p(qVar, g0Var);
            i3 i3Var = new i3(i10);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = new e6.c(20);
                g0Var.n0(objN);
            }
            b2.r rVarC = j3.q.c(b2.o.A, false, (u00.k) objN);
            boolean zI = g0Var.i(b1VarP3) | g0Var.i(b1VarP) | g0Var.i(b1VarP2) | g0Var.e(i13) | g0Var.i(b1VarP4);
            Object objN2 = g0Var.N();
            if (zI || objN2 == cVar) {
                objN2 = new g2(b1VarP3, b1VarP, b1VarP2, i13, b1VarP4);
                g0Var.n0(objN2);
            }
            w.m.a(i3Var, rVarC, (u00.k) objN2, null, "DatePickerDisplayModeAnimation", null, v1.d.d(1838500091, new v2(l, j9, kVar, kVar2, tVar, eVar, r1Var, d6Var, h1Var, tVar2), g0Var), g0Var, ((i12 >> 6) & 14) | 1597440, 40);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n(l, j9, i10, kVar, kVar2, tVar, eVar, r1Var, d6Var, h1Var, tVar2, i11) {
                public final Long A;
                public final long B;
                public final int C;
                public final u00.k D;
                public final u00.k E;
                public final h1.t F;
                public final z00.e G;
                public final r1 H;
                public final d6 I;
                public final h1 J;
                public final g2.t K;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    a3.k(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void l(h1 h1Var, h1.t tVar, l1.j jVar, int i10) throws NoWhenBranchMatchedException {
        h1 h1Var2 = h1Var;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1849465391);
        int i11 = (i10 & 6) == 0 ? (g0Var.g(h1Var2) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(tVar) ? 32 : 16;
        }
        boolean z10 = false;
        boolean z11 = true;
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            h1.v vVar = (h1.v) tVar;
            int i12 = vVar.f6532c;
            ArrayList arrayList = vVar.f6533d;
            ArrayList arrayList2 = new ArrayList();
            int i13 = i12 - 1;
            int size = arrayList.size();
            for (int i14 = i13; i14 < size; i14++) {
                arrayList2.add(arrayList.get(i14));
            }
            for (int i15 = 0; i15 < i13; i15++) {
                arrayList2.add(arrayList.get(i15));
            }
            m3.r0 r0VarA = m8.a(k1.h.f8761x, g0Var);
            float f3 = 0.0f;
            b2.r rVarD = h0.z1.d(h0.z1.b(0.0f, f5709a, 1), 1.0f);
            h0.v1 v1VarA = h0.t1.a(h0.i.f6411f, b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            g0Var.c0(24563235);
            int size2 = arrayList2.size();
            int i16 = 0;
            while (i16 < size2) {
                g00.k kVar = (g00.k) arrayList2.get(i16);
                boolean zG = g0Var.g(kVar);
                Object objN = g0Var.N();
                if (zG || objN == l1.i.f9868a) {
                    objN = new a1.e1(kVar, 19);
                    g0Var.n0(objN);
                }
                b2.o oVar = b2.o.A;
                b2.r rVarP = h0.z1.p(j3.q.b(oVar, (u00.k) objN), k1.h.f8746g, k1.h.f8744e, f3, 12);
                l1.q2 q2Var = r3.f5953c;
                b2.r rVarN = h0.z1.n(rVarP, ((y3.f) g0Var.k(q2Var)).A, ((y3.f) g0Var.k(q2Var)).A);
                z2.w0 w0VarD = h0.o.d(b2.b.E, z10);
                int iHashCode2 = Long.hashCode(g0Var.T);
                l1.m1 m1VarM2 = g0Var.m();
                b2.r rVarC2 = b2.a.c(rVarN, g0Var);
                b3.i.f2042c.getClass();
                b3.g gVar2 = b3.h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD, g0Var, b3.h.f2039f);
                l1.q.I(m1VarM2, g0Var, b3.h.f2038e);
                b3.f fVar2 = b3.h.f2040g;
                if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode2))) {
                    com.google.android.gms.internal.measurement.x5.v(iHashCode2, g0Var, iHashCode2, fVar2);
                }
                l1.q.I(rVarC2, g0Var, b3.h.f2037d);
                l1.g0 g0Var2 = g0Var;
                boolean z12 = z11;
                z6.b((String) kVar.B, h0.z1.v(oVar, 3), h1Var2.f5817d, 0L, null, null, 0L, null, new x3.k(3), 0L, 0, false, 0, 0, null, r0VarA, g0Var2, 48, 0, 130040);
                g0Var = g0Var2;
                g0Var.r(z12);
                i16++;
                z10 = false;
                z11 = z12;
                f3 = 0.0f;
                size2 = size2;
                arrayList2 = arrayList2;
                h1Var2 = h1Var;
            }
            g0Var.r(z10);
            g0Var.r(z11);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(h1Var, tVar, i10, 2);
        }
    }

    public static final void m(final String str, final b2.r rVar, final boolean z10, final boolean z11, final u00.a aVar, final boolean z12, final String str2, final h1 h1Var, l1.j jVar, final int i10) {
        Object objA;
        long j9;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1153850597);
        int i11 = i10 | (g0Var.g(str) ? 4 : 2) | (g0Var.h(z10) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.h(z11) ? 2048 : 1024) | (g0Var.i(aVar) ? 16384 : 8192) | (g0Var.h(z12) ? 131072 : Cast.MAX_MESSAGE_LENGTH) | (g0Var.g(str2) ? 1048576 : 524288) | (g0Var.g(h1Var) ? 8388608 : 4194304);
        if (g0Var.S(i11 & 1, (4793491 & i11) != 4793490)) {
            boolean z13 = ((i11 & 7168) == 2048) | ((i11 & 896) == 256);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (z13 || objN == cVar) {
                objA = (!z11 || z10) ? null : z.n.a(k1.h.l, h1Var.f5832u);
                g0Var.n0(objA);
            } else {
                objA = objN;
            }
            z.u uVar = (z.u) objA;
            boolean z14 = (3670016 & i11) == 1048576;
            Object objN2 = g0Var.N();
            if (z14 || objN2 == cVar) {
                objN2 = new b6.o(str2, 5);
                g0Var.n0(objN2);
            }
            b2.r rVarC = j3.q.c(rVar, true, (u00.k) objN2);
            i2.t0 t0VarA = g6.a(k1.h.D, g0Var);
            int i12 = i11 >> 6;
            int i13 = i12 & 14;
            if (z10) {
                j9 = z12 ? h1Var.l : h1Var.m;
            } else {
                j9 = i2.t.f7166f;
            }
            s6.b(z10, aVar, rVarC, z12, t0VarA, ((i2.t) w.b2.a(j9, x5.p(k1.q.C, g0Var), null, g0Var, 0, 12).getValue()).f7169a, uVar, v1.d.d(-564400443, new n2(str, h1Var, z11, z10, z12, 1), g0Var), g0Var, i13 | ((i11 >> 9) & 112) | (i12 & 7168), 1472);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n(str, rVar, z10, z11, aVar, z12, str2, h1Var, i10) {
                public final String A;
                public final b2.r B;
                public final boolean C;
                public final boolean D;
                public final u00.a E;
                public final boolean F;
                public final String G;
                public final h1 H;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(49);
                    a3.m(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void n(b2.r rVar, long j9, u00.k kVar, d6 d6Var, h1.t tVar, z00.e eVar, h1 h1Var, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1286899812);
        int i11 = i10 | (g0Var.f(j9) ? 32 : 16) | (g0Var.i(kVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.g(d6Var) ? 2048 : 1024) | (g0Var.i(tVar) ? 16384 : 8192) | (g0Var.i(eVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH) | (g0Var.g(h1Var) ? 1048576 : 524288);
        if (g0Var.S(i11 & 1, (599187 & i11) != 599186)) {
            z6.a(m8.a(k1.h.A, g0Var), v1.d.d(1301915789, new y2(tVar, j9, eVar, rVar, h1Var, kVar, d6Var), g0Var), g0Var, 48);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new z1(rVar, j9, kVar, d6Var, tVar, eVar, h1Var, i10);
        }
    }

    public static final void o(int i10, b2.r rVar, l1.j jVar, u00.a aVar, v1.c cVar, boolean z10) {
        int i11;
        b2.r rVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-709923073);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.h(z10) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= g0Var.i(cVar) ? 2048 : 1024;
        }
        if (g0Var.S(i12 & 1, (i12 & 1171) != 1170)) {
            p0.e eVar = p0.f.f12243a;
            h0.p1 p1Var = s.f5954a;
            b2.o oVar = b2.o.A;
            x5.h(aVar, oVar, false, eVar, s.b(0L, ((i2.t) g0Var.k(y0.f6028a)).f7169a, 0L, g0Var, 13), null, v1.d.d(1899489890, new z2(cVar, z10), g0Var), g0Var, (i12 & 14) | 807075840 | ((i12 >> 3) & 112), 388);
            g0Var = g0Var;
            rVar2 = oVar;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new y1(aVar, z10, rVar2, cVar, i10);
        }
    }
}
