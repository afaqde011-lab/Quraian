package gv;

import android.content.Context;
import android.content.res.Configuration;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import d0.o2;
import g1.o3;
import g1.z6;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l1.p2;

public abstract class c0 {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        i2.t.b(0.1f, dl.a.i);
        a = 20;
        b = 32;
        c = 16;
    }

    public static final void a(boolean z, u00.a aVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1162862400);
        int i2 = (g0Var.h(z) ? 4 : 2) | i | (g0Var.i(aVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            p0.e eVar = p0.f.a;
            b2.o oVar = b2.o.A;
            b2.r rVarC = h0.c.C(w50.c.n(z.n.f(f2.h.c(oVar, eVar), i2.t.b(0.06f, dl.a.i), i2.b0.b), true, aVar), 12);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
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
            z3.j(y3.R(z ? 2131231389 : 2131231388, g0Var, 0), (String) null, h0.z1.m(oVar, 20), dl.a.k, g0Var, 440, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.n(z, aVar, i, 2);
        }
    }

    public static final void b(final bv.o1 uiState, final u00.k onAction, boolean z, l1.j jVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        l1.r1 r1VarT;
        boolean z5;
        e60.a aVarA;
        boolean zG;
        Object objN;
        l1.c cVar;
        l1.z0 z0VarQ;
        l1.z0 z0VarQ2;
        Object objN2;
        final l1.e1 e1Var;
        Object objN3;
        final l1.z0 z0Var;
        su.t tVar;
        long j;
        boolean zD;
        long j2;
        long j3;
        long j4;
        String str;
        Object objZ;
        boolean zD2;
        Object objN4;
        long j5;
        long j6;
        long j7;
        String str2;
        boolean z6;
        float f;
        boolean zG2;
        Object objN5;
        su.t tVar2;
        l1.z0 z0Var2;
        boolean zD3;
        Object objN6;
        float f2;
        int i4;
        boolean z7;
        Object objN7;
        String reciterPhotoUrl;
        boolean z8;
        Configuration configuration;
        boolean z9;
        boolean z11;
        b3.g gVar;
        String surahTranscription;
        String reciterName;
        boolean z12;
        boolean z13;
        Object objN8;
        boolean z14;
        Object objN9;
        Integer collectionId;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        boolean z15 = uiState.u;
        float f3 = uiState.e;
        PlayerItem playerItem = uiState.f;
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.j jVar2 = (l1.g0) jVar;
        jVar2.e0(1428080963);
        if ((i & 6) == 0) {
            i3 = (jVar2.g(uiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= jVar2.i(onAction) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= jVar2.h(z2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar2.S(i3 & 1, z3)) {
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                aVarA = q50.c.a(jVar2);
                zG = jVar2.g((Object) null) | jVar2.g(aVarA);
                objN = jVar2.N();
                cVar = l1.i.a;
                if (zG || objN == cVar) {
                    objN = oi.k.f(kotlin.jvm.internal.a0.a, uu.a.class, aVarA, (b60.a) null, jVar2);
                }
                final uu.a aVar = (uu.a) objN;
                uu.w wVar = (uu.w) aVar;
                z0VarQ = k00.f.q(wVar.D, jVar2, 0);
                z0VarQ2 = k00.f.q(wVar.E, jVar2, 0);
                objN2 = jVar2.N();
                if (objN2 == cVar) {
                    objN2 = new l1.e1(0.0f);
                    jVar2.n0(objN2);
                }
                e1Var = (l1.e1) objN2;
                objN3 = jVar2.N();
                if (objN3 == cVar) {
                    objN3 = l1.q.z(Boolean.FALSE);
                    jVar2.n0(objN3);
                }
                z0Var = (l1.z0) objN3;
                tVar = uiState.X;
                if (tVar != null) {
                    j = tVar.b - tVar.a;
                } else {
                    j = uiState.b;
                }
                zD = jVar2.d(e1Var.h()) | jVar2.f(j);
                Object objN10 = jVar2.N();
                if (!zD || objN10 == cVar) {
                    long jH = ((long) (e1Var.h() * j)) / ((long) 1000);
                    long j8 = 3600;
                    j2 = jH / j8;
                    long j9 = jH % j8;
                    long j11 = 60;
                    j3 = j9 / j11;
                    j4 = jH % j11;
                    if (j2 > 0) {
                        str = String.format(Locale.ENGLISH, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3));
                    } else {
                        str = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
                    }
                    objZ = l1.q.z(str);
                    jVar2.n0(objZ);
                } else {
                    objZ = objN10;
                }
                final l1.z0 z0Var3 = (l1.z0) objZ;
                zD2 = jVar2.d(e1Var.h()) | jVar2.f(j);
                objN4 = jVar2.N();
                if (zD2 || objN4 == cVar) {
                    long jH2 = (j - ((long) (e1Var.h() * j))) / ((long) 1000);
                    long j12 = 3600;
                    j5 = jH2 / j12;
                    long j13 = jH2 % j12;
                    long j14 = 60;
                    j6 = j13 / j14;
                    j7 = jH2 % j14;
                    if (j5 > 0) {
                        str2 = String.format(Locale.ENGLISH, "-%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7)}, 3));
                    } else {
                        str2 = String.format(Locale.ENGLISH, "-%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j6), Long.valueOf(j7)}, 2));
                    }
                    objN4 = l1.q.z(str2);
                    jVar2.n0(objN4);
                }
                final l1.z0 z0Var4 = (l1.z0) objN4;
                if (uiState.B == ru.d.OFF || uiState.W != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    f = 1.0f;
                } else {
                    f = 0.7f;
                }
                final p2 p2VarB = x.d.b(f, (x.y) null, (String) null, jVar2, 0, 30);
                Boolean bool = (Boolean) z0Var.getValue();
                bool.getClass();
                Object[] objArr = {bool, Long.valueOf(((Number) z0VarQ.getValue()).longValue()), Long.valueOf(((Number) z0VarQ2.getValue()).longValue()), tVar};
                zG2 = jVar2.g(tVar) | jVar2.g(z0VarQ2) | jVar2.g(z0VarQ);
                objN5 = jVar2.N();
                if (!zG2 || objN5 == cVar) {
                    objN5 = new dq.i(tVar, z0Var, z0VarQ2, z0VarQ, e1Var, (k00.c) null);
                    tVar2 = tVar;
                    z0Var2 = z0VarQ;
                    jVar2.n0(objN5);
                } else {
                    z0Var2 = z0VarQ;
                    tVar2 = tVar;
                }
                l1.q.j(objArr, (u00.n) objN5, jVar2);
                zD3 = jVar2.d(f3);
                objN6 = jVar2.N();
                if (zD3 || objN6 == cVar) {
                    yu.f.B.getClass();
                    objN6 = tf.x.a(f3).a();
                    jVar2.n0(objN6);
                }
                final String str3 = (String) objN6;
                if (f3 == 1.0f) {
                    f2 = 0.7f;
                } else {
                    f2 = 1.0f;
                }
                final p2 p2VarB2 = x.d.b(f2, (x.y) null, (String) null, jVar2, 0, 30);
                i4 = i3 & 112;
                if (i4 == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objN7 = jVar2.N();
                if (z7 || objN7 == cVar) {
                    objN7 = new fy.r(24, onAction);
                    jVar2.n0(objN7);
                }
                final u00.a aVar2 = (u00.a) objN7;
                if (playerItem != 0) {
                    reciterPhotoUrl = playerItem.getReciterPhotoUrl();
                } else {
                    reciterPhotoUrl = null;
                }
                if (playerItem == 0 && playerItem.getCollectionId() == null && !z15) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                configuration = (Configuration) jVar2.k(c3.o0.a);
                cm.a.A.getClass();
                if (sg.f.J(configuration) == cm.a.C || Math.min(configuration.screenWidthDp, configuration.screenHeightDp) > 375) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z8 || !z9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                b2.o oVar = b2.o.A;
                b2.r rVarD = h0.z1.d(oVar, 1.0f);
                h0.d dVar = h0.i.c;
                b2.g gVar2 = b2.b.M;
                h0.v vVarA = h0.u.a(dVar, gVar2, jVar2, 0);
                int iHashCode = Long.hashCode(((l1.g0) jVar2).T);
                l1.m1 m1VarM = jVar2.m();
                b2.r rVarC = b2.a.c(rVarD, jVar2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
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
                final boolean z16 = z6;
                b3.f fVar4 = b3.h.d;
                l1.q.I(rVarC, jVar2, fVar4);
                b2.r rVarD2 = h0.z1.d(oVar, 1.0f);
                h0.v1 v1VarA = h0.t1.a(h0.i.g(12), b2.b.K, jVar2, 54);
                int iHashCode2 = Long.hashCode(((l1.g0) jVar2).T);
                l1.m1 m1VarM2 = jVar2.m();
                b2.r rVarC2 = b2.a.c(rVarD2, jVar2);
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar);
                } else {
                    jVar2.q0();
                }
                l1.q.I(v1VarA, jVar2, fVar);
                l1.q.I(m1VarM2, jVar2, fVar2);
                a1.b.v(iHashCode2, jVar2, fVar3, jVar2, eVar);
                l1.q.I(rVarC2, jVar2, fVar4);
                d(reciterPhotoUrl, jVar2, 0);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                h0.c1 c1Var = new h0.c1(1.0f, true);
                h0.v vVarA2 = h0.u.a(h0.i.g(4), gVar2, jVar2, 6);
                int iHashCode3 = Long.hashCode(((l1.g0) jVar2).T);
                l1.m1 m1VarM3 = jVar2.m();
                b2.r rVarC3 = b2.a.c(c1Var, jVar2);
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar);
                } else {
                    jVar2.q0();
                }
                l1.q.I(vVarA2, jVar2, fVar);
                l1.q.I(m1VarM3, jVar2, fVar2);
                a1.b.v(iHashCode3, jVar2, fVar3, jVar2, eVar);
                l1.q.I(rVarC3, jVar2, fVar4);
                if (playerItem != 0) {
                    surahTranscription = playerItem.getSurahTranscription();
                } else {
                    surahTranscription = null;
                }
                if (surahTranscription == null) {
                    surahTranscription = "";
                }
                long jZ = kh.o.z(18);
                long jZ2 = kh.o.z(18);
                q3.u uVar = q3.u.D;
                String str4 = surahTranscription;
                long j15 = dl.a.i;
                z6.b(str4, (b2.r) null, j15, jZ, uVar, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ2, 2, false, 1, 0, (u00.k) null, (m3.r0) null, jVar2, 1597440, 25008, 239530);
                if (playerItem != 0) {
                    reciterName = playerItem.getReciterName();
                } else {
                    reciterName = null;
                }
                String str5 = reciterName != null ? reciterName : "";
                long jZ3 = kh.o.z(16);
                long jZ4 = kh.o.z(16);
                q3.u uVar2 = q3.u.C;
                long jB = i2.t.b(0.7f, j15);
                if (z15) {
                    z12 = false;
                } else {
                    if (playerItem != 0) {
                        collectionId = playerItem.getCollectionId();
                    } else {
                        collectionId = null;
                    }
                    if (collectionId == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                if (i4 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objN8 = jVar2.N();
                if (z13 || objN8 == cVar) {
                    objN8 = new fy.r(29, onAction);
                    jVar2.n0(objN8);
                }
                k00.f.a(str5, w50.c.o(oVar, z12, null, (u00.a) objN8, 6), jB, jZ3, new y3.o(jZ4), uVar2, null, 1, 0.0f, null, jVar2, 12807168, 832);
                jVar2.r(true);
                boolean z17 = uiState.j;
                if (i4 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objN9 = jVar2.N();
                if (z14 || objN9 == cVar) {
                    objN9 = new a0(0, onAction);
                    jVar2.n0(objN9);
                }
                a(z17, (u00.a) objN9, jVar2, 0);
                if (z8 || z9) {
                    jVar2.c0(611468377);
                    jVar2.r(false);
                } else {
                    jVar2.c0(611366511);
                    boolean z18 = i4 == 32;
                    Object objN11 = jVar2.N();
                    if (z18 || objN11 == cVar) {
                        objN11 = new a0(1, onAction);
                        jVar2.n0(objN11);
                    }
                    c((u00.a) objN11, jVar2, 0);
                    jVar2.r(false);
                }
                jVar2.r(true);
                final l1.z0 z0Var5 = z0Var2;
                final su.t tVar3 = tVar2;
                final boolean z19 = z11;
                u00.n nVar = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        uu.a aVar3;
                        uu.a aVar4;
                        boolean z21;
                        u00.k kVar;
                        Object obj3;
                        u00.a aVar5;
                        l1.g0 g0Var = (l1.j) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        l1.g0 g0Var2 = g0Var;
                        if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                            float f4 = 28;
                            b2.o oVar2 = b2.o.A;
                            b2.r rVarG = h0.c.G(oVar2, 0.0f, f4, 0.0f, 0.0f, 13);
                            h0.f fVarG = h0.i.g(f4);
                            b2.g gVar3 = b2.b.M;
                            h0.v vVarA3 = h0.u.a(fVarG, gVar3, g0Var, 6);
                            int iHashCode4 = Long.hashCode(g0Var2.T);
                            l1.m1 m1VarM4 = g0Var2.m();
                            b2.r rVarC4 = b2.a.c(rVarG, g0Var);
                            b3.i.c.getClass();
                            b3.g gVar4 = b3.h.b;
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar4);
                            } else {
                                g0Var2.q0();
                            }
                            b3.f fVar5 = b3.h.f;
                            l1.q.I(vVarA3, g0Var, fVar5);
                            b3.f fVar6 = b3.h.e;
                            l1.q.I(m1VarM4, g0Var, fVar6);
                            Integer numValueOf2 = Integer.valueOf(iHashCode4);
                            b3.f fVar7 = b3.h.g;
                            l1.q.I(numValueOf2, g0Var, fVar7);
                            b3.e eVar2 = b3.h.h;
                            l1.q.E(g0Var, eVar2);
                            b3.f fVar8 = b3.h.d;
                            l1.q.I(rVarC4, g0Var, fVar8);
                            b2.r rVarD3 = h0.z1.d(oVar2, 1.0f);
                            b2.h hVar = b2.b.K;
                            h0.v1 v1VarA2 = h0.t1.a(h0.i.a, hVar, g0Var, 48);
                            l1.g0 g0Var3 = g0Var;
                            int iHashCode5 = Long.hashCode(g0Var3.T);
                            l1.m1 m1VarM5 = g0Var2.m();
                            b2.r rVarC5 = b2.a.c(rVarD3, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar4);
                            } else {
                                g0Var2.q0();
                            }
                            l1.q.I(v1VarA2, g0Var, fVar5);
                            l1.q.I(m1VarM5, g0Var, fVar6);
                            x5.u(iHashCode5, g0Var, fVar7, g0Var, eVar2);
                            l1.q.I(rVarC5, g0Var, fVar8);
                            bv.o1 o1Var = uiState;
                            boolean z22 = o1Var.y;
                            su.c cVar2 = o1Var.W;
                            boolean z23 = o1Var.A;
                            boolean z24 = o1Var.z;
                            u00.a aVar6 = aVar2;
                            boolean zG3 = g0Var2.g(aVar6);
                            Object objN12 = g0Var2.N();
                            Object obj4 = l1.i.a;
                            if (zG3 || objN12 == obj4) {
                                objN12 = new es.b(5, aVar6);
                                g0Var2.n0(objN12);
                            }
                            qd.s0.E(z22, (u00.a) objN12, g0Var, 0, 0);
                            float f5 = 42;
                            b2.r rVarS = h0.z1.s(oVar2, f5, 0.0f, 2);
                            z2.w0 w0VarD = h0.o.d(b2.b.D, false);
                            int iHashCode6 = Long.hashCode(g0Var3.T);
                            l1.m1 m1VarM6 = g0Var2.m();
                            b2.r rVarC6 = b2.a.c(rVarS, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar4);
                            } else {
                                g0Var2.q0();
                            }
                            l1.q.I(w0VarD, g0Var, fVar5);
                            l1.q.I(m1VarM6, g0Var, fVar6);
                            x5.u(iHashCode6, g0Var, fVar7, g0Var, eVar2);
                            l1.q.I(rVarC6, g0Var, fVar8);
                            p.j(str3, i2.t.b(((Number) p2VarB2.getValue()).floatValue(), dl.a.i), !(o1Var.e == 1.0f), aVar6, null, kh.o.z(14), g0Var, 196608);
                            boolean z25 = o1Var.y;
                            float f6 = o1Var.e;
                            u00.k kVar2 = onAction;
                            boolean zG4 = g0Var2.g(kVar2);
                            Object objN13 = g0Var2.N();
                            if (zG4 || objN13 == obj4) {
                                objN13 = new as.d0(25, kVar2);
                                g0Var2.n0(objN13);
                            }
                            p.m(z25, f6, aVar6, (u00.k) objN13, g0Var, 0);
                            g0Var2.r(true);
                            if (1.0f <= 0.0d) {
                                i0.a.a("invalid weight; must be greater than zero");
                            }
                            h0.c1 c1Var2 = new h0.c1(1.0f, true);
                            h0.v1 v1VarA3 = h0.t1.a(h0.i.e, hVar, g0Var, 54);
                            int iHashCode7 = Long.hashCode(g0Var3.T);
                            l1.m1 m1VarM7 = g0Var2.m();
                            b2.r rVarC7 = b2.a.c(c1Var2, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar4);
                            } else {
                                g0Var2.q0();
                            }
                            l1.q.I(v1VarA3, g0Var, fVar5);
                            l1.q.I(m1VarM7, g0Var, fVar6);
                            x5.u(iHashCode7, g0Var, fVar7, g0Var, eVar2);
                            l1.q.I(rVarC7, g0Var, fVar8);
                            float f7 = 38;
                            float f8 = 32;
                            b2.r rVarE = h0.z1.e(h0.z1.q(oVar2, f7), f8);
                            uu.a aVar7 = aVar;
                            boolean zI = g0Var2.i(aVar7);
                            Object objN14 = g0Var2.N();
                            if (zI || objN14 == obj4) {
                                objN14 = new av.k(0, aVar7, uu.a.class, "seekToPrevious", "seekToPrevious()V", 0, 12);
                                g0Var2.n0(objN14);
                            }
                            b2.r rVarO = w50.c.o(rVarE, false, null, (u00.a) ((a10.g) objN14), 7);
                            m2.b bVarR = y3.R(2131231079, g0Var, 0);
                            long j16 = dl.a.j;
                            z3.j(bVarR, (String) null, rVarO, j16, g0Var, 56, 0);
                            b2.r rVarM = h0.z1.m(h0.c.G(oVar2, 40, 0.0f, 36, 0.0f, 10), f7);
                            boolean zI2 = g0Var2.i(aVar7);
                            Object objN15 = g0Var2.N();
                            if (zI2 || objN15 == obj4) {
                                aVar3 = aVar7;
                                objN15 = new av.k(0, aVar3, uu.a.class, "playPauseToggle", "playPauseToggle()V", 0, 13);
                                g0Var2.n0(objN15);
                            } else {
                                aVar3 = aVar7;
                            }
                            uu.a aVar8 = aVar3;
                            o3.a(y3.R(o1Var.g ? 2131231354 : 2131231358, g0Var, 0), (String) null, w50.c.o(rVarM, false, null, (u00.a) ((a10.g) objN15), 7), j16, g0Var, 56, 0);
                            b2.r rVarE2 = h0.z1.e(h0.z1.q(oVar2, f7), f8);
                            boolean zI3 = g0Var2.i(aVar8);
                            Object objN16 = g0Var2.N();
                            if (zI3 || objN16 == obj4) {
                                objN16 = new av.k(0, aVar8, uu.a.class, "seekToNext", "seekToNext()V", 0, 14);
                                aVar4 = aVar8;
                                g0Var2.n0(objN16);
                            } else {
                                aVar4 = aVar8;
                            }
                            z3.j(y3.R(2131231135, g0Var, 0), (String) null, w50.c.o(rVarE2, false, null, (u00.a) ((a10.g) objN16), 7), j16, g0Var, 56, 0);
                            g0Var2.r(true);
                            boolean zG5 = g0Var2.g(kVar2);
                            Object objN17 = g0Var2.N();
                            if (zG5 || objN17 == obj4) {
                                objN17 = new fy.r(21, kVar2);
                                g0Var2.n0(objN17);
                            }
                            qd.s0.E(z24, (u00.a) objN17, g0Var, 0, 0);
                            boolean zG6 = g0Var2.g(kVar2);
                            Object objN18 = g0Var2.N();
                            if (zG6 || objN18 == obj4) {
                                objN18 = new fy.r(22, kVar2);
                                g0Var2.n0(objN18);
                            }
                            qd.s0.E(z23, (u00.a) objN18, g0Var, 0, 0);
                            b2.r rVarS2 = h0.z1.s(oVar2, f5, 0.0f, 2);
                            z2.w0 w0VarD2 = h0.o.d(b2.b.F, false);
                            int iHashCode8 = Long.hashCode(g0Var3.T);
                            l1.m1 m1VarM8 = g0Var2.m();
                            b2.r rVarC8 = b2.a.c(rVarS2, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar4);
                            } else {
                                g0Var2.q0();
                            }
                            l1.q.I(w0VarD2, g0Var, fVar5);
                            l1.q.I(m1VarM8, g0Var, fVar6);
                            x5.u(iHashCode8, g0Var, fVar7, g0Var, eVar2);
                            l1.q.I(rVarC8, g0Var, fVar8);
                            b2.r rVarA = h0.c.A(oVar2, (c0.b - c0.a) / 2, 0.0f, 2);
                            if (o1Var.b0 || !o1Var.Y) {
                                z21 = false;
                            } else {
                                List listS = va.a.S(new Boolean[]{Boolean.valueOf(cVar2 != null), Boolean.valueOf(o1Var.x), Boolean.valueOf(o1Var.y), Boolean.valueOf(z24), Boolean.valueOf(z23)});
                                if (!listS.isEmpty()) {
                                    Iterator it = listS.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((Boolean) it.next()).booleanValue()) {
                                                z21 = false;
                                            }
                                        }
                                    }
                                }
                                z21 = true;
                            }
                            m2.b bVarR2 = y3.R(2131231205, g0Var, 0);
                            String strU = z3.U(g0Var, 2131887088);
                            String strU2 = z3.U(g0Var, 2131887087);
                            String strU3 = z3.U(g0Var, 2131887075);
                            boolean zG7 = g0Var2.g(kVar2);
                            Object objN19 = g0Var2.N();
                            if (zG7 || objN19 == obj4) {
                                objN19 = new fy.r(23, kVar2);
                                g0Var2.n0(objN19);
                            }
                            u00.a aVar9 = (u00.a) objN19;
                            boolean zG8 = g0Var2.g(kVar2);
                            Object objN20 = g0Var2.N();
                            if (zG8 || objN20 == obj4) {
                                objN20 = new fy.r(25, kVar2);
                                g0Var2.n0(objN20);
                            }
                            uu.a aVar10 = aVar4;
                            rl.d.b(z21, bVarR2, strU, strU2, strU3, aVar9, (u00.a) objN20, rVarA, null, 0.0f, v1.d.d(-418291333, new dn.i(1, kVar2, p2VarB, z16), g0Var), g0Var, 12582976);
                            b2.r rVarG2 = h0.c.G(h0.s.a.b(), 0.0f, 0.0f, c0.c, 0.0f, 11);
                            z2.w0 w0VarD3 = h0.o.d(b2.b.A, false);
                            int iHashCode9 = Long.hashCode(g0Var3.T);
                            l1.m1 m1VarM9 = g0Var2.m();
                            b2.r rVarC9 = b2.a.c(rVarG2, g0Var);
                            b3.g gVar5 = b3.h.b;
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar5);
                            } else {
                                g0Var2.q0();
                            }
                            b3.f fVar9 = b3.h.f;
                            l1.q.I(w0VarD3, g0Var, fVar9);
                            b3.f fVar10 = b3.h.e;
                            l1.q.I(m1VarM9, g0Var, fVar10);
                            Integer numValueOf3 = Integer.valueOf(iHashCode9);
                            b3.f fVar11 = b3.h.g;
                            l1.q.I(numValueOf3, g0Var, fVar11);
                            b3.e eVar3 = b3.h.h;
                            l1.q.E(g0Var, eVar3);
                            b3.f fVar12 = b3.h.d;
                            l1.q.I(rVarC9, g0Var, fVar12);
                            boolean z26 = o1Var.A;
                            boolean z27 = cVar2 != null || o1Var.b();
                            if (z19) {
                                g0Var2.c0(187604998);
                                kVar = kVar2;
                                boolean zG9 = g0Var2.g(kVar);
                                Object objN21 = g0Var2.N();
                                if (zG9) {
                                    obj3 = obj4;
                                } else {
                                    obj3 = obj4;
                                    if (objN21 == obj3) {
                                    }
                                    aVar5 = (u00.a) objN21;
                                    g0Var2.r(false);
                                }
                                objN21 = new fy.r(26, kVar);
                                g0Var2.n0(objN21);
                                aVar5 = (u00.a) objN21;
                                g0Var2.r(false);
                            } else {
                                z26 = z26;
                                kVar = kVar2;
                                obj3 = obj4;
                                g0Var2.c0(187888152);
                                g0Var2.r(false);
                                aVar5 = null;
                            }
                            boolean zG10 = g0Var2.g(kVar);
                            u00.a aVar11 = aVar5;
                            Object objN22 = g0Var2.N();
                            if (zG10 || objN22 == obj3) {
                                objN22 = new fy.r(27, kVar);
                                g0Var2.n0(objN22);
                            }
                            u00.a aVar12 = (u00.a) objN22;
                            boolean zG11 = g0Var2.g(kVar);
                            Object objN23 = g0Var2.N();
                            if (zG11 || objN23 == obj3) {
                                objN23 = new fy.r(28, kVar);
                                g0Var2.n0(objN23);
                            }
                            u00.a aVar13 = (u00.a) objN23;
                            boolean zG12 = g0Var2.g(kVar);
                            Object objN24 = g0Var2.N();
                            if (zG12 || objN24 == obj3) {
                                objN24 = new fy.r(19, kVar);
                                g0Var2.n0(objN24);
                            }
                            Object obj5 = obj3;
                            u00.k kVar3 = kVar;
                            p.q(z26, aVar12, aVar13, (u00.a) objN24, z27, aVar11, g0Var, 0, 0);
                            boolean z28 = o1Var.z;
                            ru.d dVar2 = o1Var.B;
                            boolean zG13 = g0Var2.g(kVar3);
                            Object objN25 = g0Var2.N();
                            if (zG13 || objN25 == obj5) {
                                objN25 = new fy.r(20, kVar3);
                                g0Var2.n0(objN25);
                            }
                            u00.a aVar14 = (u00.a) objN25;
                            boolean zG14 = g0Var2.g(kVar3);
                            Object objN26 = g0Var2.N();
                            if (zG14 || objN26 == obj5) {
                                objN26 = new as.d0(24, kVar3);
                                g0Var2.n0(objN26);
                            }
                            p.x(z28, dVar2, aVar14, (u00.k) objN26, 0, null, g0Var, 0, 48);
                            x5.z(g0Var2, true, true, true);
                            h0.v vVarA4 = h0.u.a(h0.i.g(4), gVar3, g0Var, 6);
                            int iHashCode10 = Long.hashCode(g0Var3.T);
                            l1.m1 m1VarM10 = g0Var2.m();
                            b2.r rVarC10 = b2.a.c(oVar2, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar5);
                            } else {
                                g0Var2.q0();
                            }
                            l1.q.I(vVarA4, g0Var, fVar9);
                            l1.q.I(m1VarM10, g0Var, fVar10);
                            x5.u(iHashCode10, g0Var, fVar11, g0Var, eVar3);
                            l1.q.I(rVarC10, g0Var, fVar12);
                            b2.r rVarD4 = h0.z1.d(oVar2, 1.0f);
                            l1.e1 e1Var2 = e1Var;
                            float fH = e1Var2.h();
                            Object objN27 = g0Var2.N();
                            if (objN27 == obj5) {
                                objN27 = new z(e1Var2, 0);
                                g0Var2.n0(objN27);
                            }
                            u00.k kVar4 = (u00.k) objN27;
                            boolean zI4 = g0Var2.i(aVar10);
                            su.t tVar4 = tVar3;
                            boolean zG15 = zI4 | g0Var2.g(tVar4);
                            l1.z0 z0Var6 = z0Var5;
                            boolean zG16 = zG15 | g0Var2.g(z0Var6);
                            Object objN28 = g0Var2.N();
                            if (zG16 || objN28 == obj5) {
                                objN28 = new az.k(aVar10, tVar4, e1Var2, z0Var6, 4);
                                g0Var2.n0(objN28);
                            }
                            u00.k kVar5 = (u00.k) objN28;
                            Object objN29 = g0Var2.N();
                            if (objN29 == obj5) {
                                objN29 = new o2(z0Var, 7);
                                g0Var2.n0(objN29);
                            }
                            p.D(fH, kVar4, kVar5, (u00.k) objN29, rVarD4, null, 0L, 0L, 0.0f, 0.0f, g0Var, 27696, 992);
                            b2.r rVarD5 = h0.z1.d(oVar2, 1.0f);
                            h0.v1 v1VarA4 = h0.t1.a(h0.i.g, b2.b.J, g0Var, 6);
                            int iHashCode11 = Long.hashCode(g0Var3.T);
                            l1.m1 m1VarM11 = g0Var2.m();
                            b2.r rVarC11 = b2.a.c(rVarD5, g0Var);
                            g0Var2.g0();
                            if (g0Var2.S) {
                                g0Var2.l(gVar5);
                            } else {
                                g0Var2.q0();
                            }
                            l1.q.I(v1VarA4, g0Var, fVar9);
                            l1.q.I(m1VarM11, g0Var, fVar10);
                            x5.u(iHashCode11, g0Var, fVar11, g0Var, eVar3);
                            l1.q.I(rVarC11, g0Var, fVar12);
                            String str6 = (String) z0Var3.getValue();
                            long j17 = dl.a.k;
                            long jZ5 = kh.o.z(11);
                            long jZ6 = kh.o.z(11);
                            q3.u uVar3 = q3.u.M;
                            z6.b(str6, (b2.r) null, j17, jZ5, uVar3, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ6, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var, 1597440, 48, 260010);
                            z6.b((String) z0Var4.getValue(), (b2.r) null, dl.a.o, kh.o.z(11), uVar3, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(11), 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var, 1597440, 48, 260010);
                            x5.z(g0Var2, true, true, true);
                        } else {
                            g0Var2.V();
                        }
                        return g00.b0.a;
                    }
                };
                jVar2 = jVar2;
                p.n(!z5, null, v1.d.d(-185939589, nVar, jVar2), jVar2, 384, 2);
                jVar2.r(true);
                z4 = z5;
            } else {
                jVar2.V();
                z4 = z2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new az.l(uiState, onAction, z4, i, i2, 3);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (jVar2.S(i3 & 1, z3)) {
            if (i5 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            aVarA = q50.c.a(jVar2);
            zG = jVar2.g((Object) null) | jVar2.g(aVarA);
            objN = jVar2.N();
            cVar = l1.i.a;
            if (zG) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, uu.a.class, aVarA, (b60.a) null, jVar2);
            } else {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, uu.a.class, aVarA, (b60.a) null, jVar2);
            }
            final uu.a aVar3 = (uu.a) objN;
            uu.w wVar2 = (uu.w) aVar3;
            z0VarQ = k00.f.q(wVar2.D, jVar2, 0);
            z0VarQ2 = k00.f.q(wVar2.E, jVar2, 0);
            objN2 = jVar2.N();
            if (objN2 == cVar) {
                objN2 = new l1.e1(0.0f);
                jVar2.n0(objN2);
            }
            e1Var = (l1.e1) objN2;
            objN3 = jVar2.N();
            if (objN3 == cVar) {
                objN3 = l1.q.z(Boolean.FALSE);
                jVar2.n0(objN3);
            }
            z0Var = (l1.z0) objN3;
            tVar = uiState.X;
            if (tVar != null) {
                j = tVar.b - tVar.a;
            } else {
                j = uiState.b;
            }
            zD = jVar2.d(e1Var.h()) | jVar2.f(j);
            Object objN12 = jVar2.N();
            if (zD) {
                long jH3 = ((long) (e1Var.h() * j)) / ((long) 1000);
                long j16 = 3600;
                j2 = jH3 / j16;
                long j17 = jH3 % j16;
                long j18 = 60;
                j3 = j17 / j18;
                j4 = jH3 % j18;
                if (j2 > 0) {
                    str = String.format(Locale.ENGLISH, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3));
                } else {
                    str = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
                }
                objZ = l1.q.z(str);
                jVar2.n0(objZ);
            } else {
                long jH4 = ((long) (e1Var.h() * j)) / ((long) 1000);
                long j19 = 3600;
                j2 = jH4 / j19;
                long j110 = jH4 % j19;
                long j111 = 60;
                j3 = j110 / j111;
                j4 = jH4 % j111;
                if (j2 > 0) {
                    str = String.format(Locale.ENGLISH, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3));
                } else {
                    str = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
                }
                objZ = l1.q.z(str);
                jVar2.n0(objZ);
            }
            final l1.z0 z0Var6 = (l1.z0) objZ;
            zD2 = jVar2.d(e1Var.h()) | jVar2.f(j);
            objN4 = jVar2.N();
            if (zD2) {
                long jH5 = (j - ((long) (e1Var.h() * j))) / ((long) 1000);
                long j112 = 3600;
                j5 = jH5 / j112;
                long j113 = jH5 % j112;
                long j114 = 60;
                j6 = j113 / j114;
                j7 = jH5 % j114;
                if (j5 > 0) {
                    str2 = String.format(Locale.ENGLISH, "-%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7)}, 3));
                } else {
                    str2 = String.format(Locale.ENGLISH, "-%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j6), Long.valueOf(j7)}, 2));
                }
                objN4 = l1.q.z(str2);
                jVar2.n0(objN4);
            } else {
                long jH6 = (j - ((long) (e1Var.h() * j))) / ((long) 1000);
                long j115 = 3600;
                j5 = jH6 / j115;
                long j116 = jH6 % j115;
                long j117 = 60;
                j6 = j116 / j117;
                j7 = jH6 % j117;
                if (j5 > 0) {
                    str2 = String.format(Locale.ENGLISH, "-%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7)}, 3));
                } else {
                    str2 = String.format(Locale.ENGLISH, "-%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j6), Long.valueOf(j7)}, 2));
                }
                objN4 = l1.q.z(str2);
                jVar2.n0(objN4);
            }
            final l1.z0 z0Var7 = (l1.z0) objN4;
            if (uiState.B == ru.d.OFF) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (z6) {
                f = 1.0f;
            } else {
                f = 0.7f;
            }
            final p2 p2VarB3 = x.d.b(f, (x.y) null, (String) null, jVar2, 0, 30);
            Boolean bool2 = (Boolean) z0Var.getValue();
            bool2.getClass();
            Object[] objArr2 = {bool2, Long.valueOf(((Number) z0VarQ.getValue()).longValue()), Long.valueOf(((Number) z0VarQ2.getValue()).longValue()), tVar};
            zG2 = jVar2.g(tVar) | jVar2.g(z0VarQ2) | jVar2.g(z0VarQ);
            objN5 = jVar2.N();
            if (zG2) {
                objN5 = new dq.i(tVar, z0Var, z0VarQ2, z0VarQ, e1Var, (k00.c) null);
                tVar2 = tVar;
                z0Var2 = z0VarQ;
                jVar2.n0(objN5);
            } else {
                objN5 = new dq.i(tVar, z0Var, z0VarQ2, z0VarQ, e1Var, (k00.c) null);
                tVar2 = tVar;
                z0Var2 = z0VarQ;
                jVar2.n0(objN5);
            }
            l1.q.j(objArr2, (u00.n) objN5, jVar2);
            zD3 = jVar2.d(f3);
            objN6 = jVar2.N();
            if (zD3) {
                yu.f.B.getClass();
                objN6 = tf.x.a(f3).a();
                jVar2.n0(objN6);
            } else {
                yu.f.B.getClass();
                objN6 = tf.x.a(f3).a();
                jVar2.n0(objN6);
            }
            final String str6 = (String) objN6;
            if (f3 == 1.0f) {
                f2 = 0.7f;
            } else {
                f2 = 1.0f;
            }
            final p2 p2VarB4 = x.d.b(f2, (x.y) null, (String) null, jVar2, 0, 30);
            i4 = i3 & 112;
            if (i4 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            objN7 = jVar2.N();
            if (z7) {
                objN7 = new fy.r(24, onAction);
                jVar2.n0(objN7);
            } else {
                objN7 = new fy.r(24, onAction);
                jVar2.n0(objN7);
            }
            final u00.a aVar4 = (u00.a) objN7;
            if (playerItem != 0) {
                reciterPhotoUrl = playerItem.getReciterPhotoUrl();
            } else {
                reciterPhotoUrl = null;
            }
            if (playerItem == 0) {
                z8 = false;
            } else {
                z8 = false;
            }
            configuration = (Configuration) jVar2.k(c3.o0.a);
            cm.a.A.getClass();
            if (sg.f.J(configuration) == cm.a.C) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z8) {
                z11 = false;
            } else {
                z11 = false;
            }
            b2.o oVar2 = b2.o.A;
            b2.r rVarD3 = h0.z1.d(oVar2, 1.0f);
            h0.d dVar2 = h0.i.c;
            b2.g gVar3 = b2.b.M;
            h0.v vVarA3 = h0.u.a(dVar2, gVar3, jVar2, 0);
            int iHashCode4 = Long.hashCode(((l1.g0) jVar2).T);
            l1.m1 m1VarM4 = jVar2.m();
            b2.r rVarC4 = b2.a.c(rVarD3, jVar2);
            b3.i.c.getClass();
            gVar = b3.h.b;
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            b3.f fVar5 = b3.h.f;
            l1.q.I(vVarA3, jVar2, fVar5);
            b3.f fVar6 = b3.h.e;
            l1.q.I(m1VarM4, jVar2, fVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            b3.f fVar7 = b3.h.g;
            l1.q.I(numValueOf2, jVar2, fVar7);
            b3.e eVar2 = b3.h.h;
            l1.q.E(jVar2, eVar2);
            final boolean z110 = z6;
            b3.f fVar8 = b3.h.d;
            l1.q.I(rVarC4, jVar2, fVar8);
            b2.r rVarD4 = h0.z1.d(oVar2, 1.0f);
            h0.v1 v1VarA2 = h0.t1.a(h0.i.g(12), b2.b.K, jVar2, 54);
            int iHashCode5 = Long.hashCode(((l1.g0) jVar2).T);
            l1.m1 m1VarM5 = jVar2.m();
            b2.r rVarC5 = b2.a.c(rVarD4, jVar2);
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            l1.q.I(v1VarA2, jVar2, fVar5);
            l1.q.I(m1VarM5, jVar2, fVar6);
            a1.b.v(iHashCode5, jVar2, fVar7, jVar2, eVar2);
            l1.q.I(rVarC5, jVar2, fVar8);
            d(reciterPhotoUrl, jVar2, 0);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            h0.c1 c1Var2 = new h0.c1(1.0f, true);
            h0.v vVarA4 = h0.u.a(h0.i.g(4), gVar3, jVar2, 6);
            int iHashCode6 = Long.hashCode(((l1.g0) jVar2).T);
            l1.m1 m1VarM6 = jVar2.m();
            b2.r rVarC6 = b2.a.c(c1Var2, jVar2);
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(gVar);
            } else {
                jVar2.q0();
            }
            l1.q.I(vVarA4, jVar2, fVar5);
            l1.q.I(m1VarM6, jVar2, fVar6);
            a1.b.v(iHashCode6, jVar2, fVar7, jVar2, eVar2);
            l1.q.I(rVarC6, jVar2, fVar8);
            if (playerItem != 0) {
                surahTranscription = playerItem.getSurahTranscription();
            } else {
                surahTranscription = null;
            }
            if (surahTranscription == null) {
                surahTranscription = "";
            }
            long jZ5 = kh.o.z(18);
            long jZ6 = kh.o.z(18);
            q3.u uVar3 = q3.u.D;
            String str7 = surahTranscription;
            long j118 = dl.a.i;
            z6.b(str7, (b2.r) null, j118, jZ5, uVar3, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ6, 2, false, 1, 0, (u00.k) null, (m3.r0) null, jVar2, 1597440, 25008, 239530);
            if (playerItem != 0) {
                reciterName = playerItem.getReciterName();
            } else {
                reciterName = null;
            }
            if (reciterName != null) {
            }
            long jZ7 = kh.o.z(16);
            long jZ8 = kh.o.z(16);
            q3.u uVar4 = q3.u.C;
            long jB2 = i2.t.b(0.7f, j118);
            if (z15) {
                z12 = false;
            } else {
                if (playerItem != 0) {
                    collectionId = playerItem.getCollectionId();
                } else {
                    collectionId = null;
                }
                if (collectionId == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (i4 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objN8 = jVar2.N();
            if (z13) {
                objN8 = new fy.r(29, onAction);
                jVar2.n0(objN8);
            } else {
                objN8 = new fy.r(29, onAction);
                jVar2.n0(objN8);
            }
            k00.f.a(str5, w50.c.o(oVar2, z12, null, (u00.a) objN8, 6), jB2, jZ7, new y3.o(jZ8), uVar4, null, 1, 0.0f, null, jVar2, 12807168, 832);
            jVar2.r(true);
            boolean z111 = uiState.j;
            if (i4 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objN9 = jVar2.N();
            if (z14) {
                objN9 = new a0(0, onAction);
                jVar2.n0(objN9);
            } else {
                objN9 = new a0(0, onAction);
                jVar2.n0(objN9);
            }
            a(z111, (u00.a) objN9, jVar2, 0);
            if (z8) {
                jVar2.c0(611468377);
                jVar2.r(false);
            } else {
                jVar2.c0(611468377);
                jVar2.r(false);
            }
            jVar2.r(true);
            final l1.z0 z0Var8 = z0Var2;
            final su.t tVar4 = tVar2;
            final boolean z112 = z11;
            u00.n nVar2 = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    uu.a aVar5;
                    uu.a aVar6;
                    boolean z21;
                    u00.k kVar;
                    Object obj3;
                    u00.a aVar7;
                    l1.g0 g0Var = (l1.j) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.g0 g0Var2 = g0Var;
                    if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        float f4 = 28;
                        b2.o oVar3 = b2.o.A;
                        b2.r rVarG = h0.c.G(oVar3, 0.0f, f4, 0.0f, 0.0f, 13);
                        h0.f fVarG = h0.i.g(f4);
                        b2.g gVar4 = b2.b.M;
                        h0.v vVarA5 = h0.u.a(fVarG, gVar4, g0Var, 6);
                        int iHashCode7 = Long.hashCode(g0Var2.T);
                        l1.m1 m1VarM7 = g0Var2.m();
                        b2.r rVarC7 = b2.a.c(rVarG, g0Var);
                        b3.i.c.getClass();
                        b3.g gVar5 = b3.h.b;
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar5);
                        } else {
                            g0Var2.q0();
                        }
                        b3.f fVar9 = b3.h.f;
                        l1.q.I(vVarA5, g0Var, fVar9);
                        b3.f fVar10 = b3.h.e;
                        l1.q.I(m1VarM7, g0Var, fVar10);
                        Integer numValueOf3 = Integer.valueOf(iHashCode7);
                        b3.f fVar11 = b3.h.g;
                        l1.q.I(numValueOf3, g0Var, fVar11);
                        b3.e eVar3 = b3.h.h;
                        l1.q.E(g0Var, eVar3);
                        b3.f fVar12 = b3.h.d;
                        l1.q.I(rVarC7, g0Var, fVar12);
                        b2.r rVarD5 = h0.z1.d(oVar3, 1.0f);
                        b2.h hVar = b2.b.K;
                        h0.v1 v1VarA3 = h0.t1.a(h0.i.a, hVar, g0Var, 48);
                        l1.g0 g0Var3 = g0Var;
                        int iHashCode8 = Long.hashCode(g0Var3.T);
                        l1.m1 m1VarM8 = g0Var2.m();
                        b2.r rVarC8 = b2.a.c(rVarD5, g0Var);
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar5);
                        } else {
                            g0Var2.q0();
                        }
                        l1.q.I(v1VarA3, g0Var, fVar9);
                        l1.q.I(m1VarM8, g0Var, fVar10);
                        x5.u(iHashCode8, g0Var, fVar11, g0Var, eVar3);
                        l1.q.I(rVarC8, g0Var, fVar12);
                        bv.o1 o1Var = uiState;
                        boolean z22 = o1Var.y;
                        su.c cVar2 = o1Var.W;
                        boolean z23 = o1Var.A;
                        boolean z24 = o1Var.z;
                        u00.a aVar8 = aVar4;
                        boolean zG3 = g0Var2.g(aVar8);
                        Object objN13 = g0Var2.N();
                        Object obj4 = l1.i.a;
                        if (zG3 || objN13 == obj4) {
                            objN13 = new es.b(5, aVar8);
                            g0Var2.n0(objN13);
                        }
                        qd.s0.E(z22, (u00.a) objN13, g0Var, 0, 0);
                        float f5 = 42;
                        b2.r rVarS = h0.z1.s(oVar3, f5, 0.0f, 2);
                        z2.w0 w0VarD = h0.o.d(b2.b.D, false);
                        int iHashCode9 = Long.hashCode(g0Var3.T);
                        l1.m1 m1VarM9 = g0Var2.m();
                        b2.r rVarC9 = b2.a.c(rVarS, g0Var);
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar5);
                        } else {
                            g0Var2.q0();
                        }
                        l1.q.I(w0VarD, g0Var, fVar9);
                        l1.q.I(m1VarM9, g0Var, fVar10);
                        x5.u(iHashCode9, g0Var, fVar11, g0Var, eVar3);
                        l1.q.I(rVarC9, g0Var, fVar12);
                        p.j(str6, i2.t.b(((Number) p2VarB4.getValue()).floatValue(), dl.a.i), !(o1Var.e == 1.0f), aVar8, null, kh.o.z(14), g0Var, 196608);
                        boolean z25 = o1Var.y;
                        float f6 = o1Var.e;
                        u00.k kVar2 = onAction;
                        boolean zG4 = g0Var2.g(kVar2);
                        Object objN14 = g0Var2.N();
                        if (zG4 || objN14 == obj4) {
                            objN14 = new as.d0(25, kVar2);
                            g0Var2.n0(objN14);
                        }
                        p.m(z25, f6, aVar8, (u00.k) objN14, g0Var, 0);
                        g0Var2.r(true);
                        if (1.0f <= 0.0d) {
                            i0.a.a("invalid weight; must be greater than zero");
                        }
                        h0.c1 c1Var3 = new h0.c1(1.0f, true);
                        h0.v1 v1VarA4 = h0.t1.a(h0.i.e, hVar, g0Var, 54);
                        int iHashCode10 = Long.hashCode(g0Var3.T);
                        l1.m1 m1VarM10 = g0Var2.m();
                        b2.r rVarC10 = b2.a.c(c1Var3, g0Var);
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar5);
                        } else {
                            g0Var2.q0();
                        }
                        l1.q.I(v1VarA4, g0Var, fVar9);
                        l1.q.I(m1VarM10, g0Var, fVar10);
                        x5.u(iHashCode10, g0Var, fVar11, g0Var, eVar3);
                        l1.q.I(rVarC10, g0Var, fVar12);
                        float f7 = 38;
                        float f8 = 32;
                        b2.r rVarE = h0.z1.e(h0.z1.q(oVar3, f7), f8);
                        uu.a aVar9 = aVar3;
                        boolean zI = g0Var2.i(aVar9);
                        Object objN15 = g0Var2.N();
                        if (zI || objN15 == obj4) {
                            objN15 = new av.k(0, aVar9, uu.a.class, "seekToPrevious", "seekToPrevious()V", 0, 12);
                            g0Var2.n0(objN15);
                        }
                        b2.r rVarO = w50.c.o(rVarE, false, null, (u00.a) ((a10.g) objN15), 7);
                        m2.b bVarR = y3.R(2131231079, g0Var, 0);
                        long j119 = dl.a.j;
                        z3.j(bVarR, (String) null, rVarO, j119, g0Var, 56, 0);
                        b2.r rVarM = h0.z1.m(h0.c.G(oVar3, 40, 0.0f, 36, 0.0f, 10), f7);
                        boolean zI2 = g0Var2.i(aVar9);
                        Object objN16 = g0Var2.N();
                        if (zI2 || objN16 == obj4) {
                            aVar5 = aVar9;
                            objN16 = new av.k(0, aVar5, uu.a.class, "playPauseToggle", "playPauseToggle()V", 0, 13);
                            g0Var2.n0(objN16);
                        } else {
                            aVar5 = aVar9;
                        }
                        uu.a aVar10 = aVar5;
                        o3.a(y3.R(o1Var.g ? 2131231354 : 2131231358, g0Var, 0), (String) null, w50.c.o(rVarM, false, null, (u00.a) ((a10.g) objN16), 7), j119, g0Var, 56, 0);
                        b2.r rVarE2 = h0.z1.e(h0.z1.q(oVar3, f7), f8);
                        boolean zI3 = g0Var2.i(aVar10);
                        Object objN17 = g0Var2.N();
                        if (zI3 || objN17 == obj4) {
                            objN17 = new av.k(0, aVar10, uu.a.class, "seekToNext", "seekToNext()V", 0, 14);
                            aVar6 = aVar10;
                            g0Var2.n0(objN17);
                        } else {
                            aVar6 = aVar10;
                        }
                        z3.j(y3.R(2131231135, g0Var, 0), (String) null, w50.c.o(rVarE2, false, null, (u00.a) ((a10.g) objN17), 7), j119, g0Var, 56, 0);
                        g0Var2.r(true);
                        boolean zG5 = g0Var2.g(kVar2);
                        Object objN18 = g0Var2.N();
                        if (zG5 || objN18 == obj4) {
                            objN18 = new fy.r(21, kVar2);
                            g0Var2.n0(objN18);
                        }
                        qd.s0.E(z24, (u00.a) objN18, g0Var, 0, 0);
                        boolean zG6 = g0Var2.g(kVar2);
                        Object objN19 = g0Var2.N();
                        if (zG6 || objN19 == obj4) {
                            objN19 = new fy.r(22, kVar2);
                            g0Var2.n0(objN19);
                        }
                        qd.s0.E(z23, (u00.a) objN19, g0Var, 0, 0);
                        b2.r rVarS2 = h0.z1.s(oVar3, f5, 0.0f, 2);
                        z2.w0 w0VarD2 = h0.o.d(b2.b.F, false);
                        int iHashCode11 = Long.hashCode(g0Var3.T);
                        l1.m1 m1VarM11 = g0Var2.m();
                        b2.r rVarC11 = b2.a.c(rVarS2, g0Var);
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar5);
                        } else {
                            g0Var2.q0();
                        }
                        l1.q.I(w0VarD2, g0Var, fVar9);
                        l1.q.I(m1VarM11, g0Var, fVar10);
                        x5.u(iHashCode11, g0Var, fVar11, g0Var, eVar3);
                        l1.q.I(rVarC11, g0Var, fVar12);
                        b2.r rVarA = h0.c.A(oVar3, (c0.b - c0.a) / 2, 0.0f, 2);
                        if (o1Var.b0 || !o1Var.Y) {
                            z21 = false;
                        } else {
                            List listS = va.a.S(new Boolean[]{Boolean.valueOf(cVar2 != null), Boolean.valueOf(o1Var.x), Boolean.valueOf(o1Var.y), Boolean.valueOf(z24), Boolean.valueOf(z23)});
                            if (!listS.isEmpty()) {
                                Iterator it = listS.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((Boolean) it.next()).booleanValue()) {
                                            z21 = false;
                                        }
                                    }
                                }
                            }
                            z21 = true;
                        }
                        m2.b bVarR2 = y3.R(2131231205, g0Var, 0);
                        String strU = z3.U(g0Var, 2131887088);
                        String strU2 = z3.U(g0Var, 2131887087);
                        String strU3 = z3.U(g0Var, 2131887075);
                        boolean zG7 = g0Var2.g(kVar2);
                        Object objN110 = g0Var2.N();
                        if (zG7 || objN110 == obj4) {
                            objN110 = new fy.r(23, kVar2);
                            g0Var2.n0(objN110);
                        }
                        u00.a aVar11 = (u00.a) objN110;
                        boolean zG8 = g0Var2.g(kVar2);
                        Object objN20 = g0Var2.N();
                        if (zG8 || objN20 == obj4) {
                            objN20 = new fy.r(25, kVar2);
                            g0Var2.n0(objN20);
                        }
                        uu.a aVar12 = aVar6;
                        rl.d.b(z21, bVarR2, strU, strU2, strU3, aVar11, (u00.a) objN20, rVarA, null, 0.0f, v1.d.d(-418291333, new dn.i(1, kVar2, p2VarB3, z110), g0Var), g0Var, 12582976);
                        b2.r rVarG2 = h0.c.G(h0.s.a.b(), 0.0f, 0.0f, c0.c, 0.0f, 11);
                        z2.w0 w0VarD3 = h0.o.d(b2.b.A, false);
                        int iHashCode12 = Long.hashCode(g0Var3.T);
                        l1.m1 m1VarM12 = g0Var2.m();
                        b2.r rVarC12 = b2.a.c(rVarG2, g0Var);
                        b3.g gVar6 = b3.h.b;
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar6);
                        } else {
                            g0Var2.q0();
                        }
                        b3.f fVar13 = b3.h.f;
                        l1.q.I(w0VarD3, g0Var, fVar13);
                        b3.f fVar14 = b3.h.e;
                        l1.q.I(m1VarM12, g0Var, fVar14);
                        Integer numValueOf4 = Integer.valueOf(iHashCode12);
                        b3.f fVar15 = b3.h.g;
                        l1.q.I(numValueOf4, g0Var, fVar15);
                        b3.e eVar4 = b3.h.h;
                        l1.q.E(g0Var, eVar4);
                        b3.f fVar16 = b3.h.d;
                        l1.q.I(rVarC12, g0Var, fVar16);
                        boolean z26 = o1Var.A;
                        boolean z27 = cVar2 != null || o1Var.b();
                        if (z112) {
                            g0Var2.c0(187604998);
                            kVar = kVar2;
                            boolean zG9 = g0Var2.g(kVar);
                            Object objN21 = g0Var2.N();
                            if (zG9) {
                                obj3 = obj4;
                            } else {
                                obj3 = obj4;
                                if (objN21 == obj3) {
                                }
                                aVar7 = (u00.a) objN21;
                                g0Var2.r(false);
                            }
                            objN21 = new fy.r(26, kVar);
                            g0Var2.n0(objN21);
                            aVar7 = (u00.a) objN21;
                            g0Var2.r(false);
                        } else {
                            z26 = z26;
                            kVar = kVar2;
                            obj3 = obj4;
                            g0Var2.c0(187888152);
                            g0Var2.r(false);
                            aVar7 = null;
                        }
                        boolean zG10 = g0Var2.g(kVar);
                        u00.a aVar13 = aVar7;
                        Object objN22 = g0Var2.N();
                        if (zG10 || objN22 == obj3) {
                            objN22 = new fy.r(27, kVar);
                            g0Var2.n0(objN22);
                        }
                        u00.a aVar14 = (u00.a) objN22;
                        boolean zG11 = g0Var2.g(kVar);
                        Object objN23 = g0Var2.N();
                        if (zG11 || objN23 == obj3) {
                            objN23 = new fy.r(28, kVar);
                            g0Var2.n0(objN23);
                        }
                        u00.a aVar15 = (u00.a) objN23;
                        boolean zG12 = g0Var2.g(kVar);
                        Object objN24 = g0Var2.N();
                        if (zG12 || objN24 == obj3) {
                            objN24 = new fy.r(19, kVar);
                            g0Var2.n0(objN24);
                        }
                        Object obj5 = obj3;
                        u00.k kVar3 = kVar;
                        p.q(z26, aVar14, aVar15, (u00.a) objN24, z27, aVar13, g0Var, 0, 0);
                        boolean z28 = o1Var.z;
                        ru.d dVar3 = o1Var.B;
                        boolean zG13 = g0Var2.g(kVar3);
                        Object objN25 = g0Var2.N();
                        if (zG13 || objN25 == obj5) {
                            objN25 = new fy.r(20, kVar3);
                            g0Var2.n0(objN25);
                        }
                        u00.a aVar16 = (u00.a) objN25;
                        boolean zG14 = g0Var2.g(kVar3);
                        Object objN26 = g0Var2.N();
                        if (zG14 || objN26 == obj5) {
                            objN26 = new as.d0(24, kVar3);
                            g0Var2.n0(objN26);
                        }
                        p.x(z28, dVar3, aVar16, (u00.k) objN26, 0, null, g0Var, 0, 48);
                        x5.z(g0Var2, true, true, true);
                        h0.v vVarA6 = h0.u.a(h0.i.g(4), gVar4, g0Var, 6);
                        int iHashCode13 = Long.hashCode(g0Var3.T);
                        l1.m1 m1VarM13 = g0Var2.m();
                        b2.r rVarC13 = b2.a.c(oVar3, g0Var);
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar6);
                        } else {
                            g0Var2.q0();
                        }
                        l1.q.I(vVarA6, g0Var, fVar13);
                        l1.q.I(m1VarM13, g0Var, fVar14);
                        x5.u(iHashCode13, g0Var, fVar15, g0Var, eVar4);
                        l1.q.I(rVarC13, g0Var, fVar16);
                        b2.r rVarD6 = h0.z1.d(oVar3, 1.0f);
                        l1.e1 e1Var2 = e1Var;
                        float fH = e1Var2.h();
                        Object objN27 = g0Var2.N();
                        if (objN27 == obj5) {
                            objN27 = new z(e1Var2, 0);
                            g0Var2.n0(objN27);
                        }
                        u00.k kVar4 = (u00.k) objN27;
                        boolean zI4 = g0Var2.i(aVar12);
                        su.t tVar5 = tVar4;
                        boolean zG15 = zI4 | g0Var2.g(tVar5);
                        l1.z0 z0Var9 = z0Var8;
                        boolean zG16 = zG15 | g0Var2.g(z0Var9);
                        Object objN28 = g0Var2.N();
                        if (zG16 || objN28 == obj5) {
                            objN28 = new az.k(aVar12, tVar5, e1Var2, z0Var9, 4);
                            g0Var2.n0(objN28);
                        }
                        u00.k kVar5 = (u00.k) objN28;
                        Object objN29 = g0Var2.N();
                        if (objN29 == obj5) {
                            objN29 = new o2(z0Var, 7);
                            g0Var2.n0(objN29);
                        }
                        p.D(fH, kVar4, kVar5, (u00.k) objN29, rVarD6, null, 0L, 0L, 0.0f, 0.0f, g0Var, 27696, 992);
                        b2.r rVarD7 = h0.z1.d(oVar3, 1.0f);
                        h0.v1 v1VarA5 = h0.t1.a(h0.i.g, b2.b.J, g0Var, 6);
                        int iHashCode14 = Long.hashCode(g0Var3.T);
                        l1.m1 m1VarM14 = g0Var2.m();
                        b2.r rVarC14 = b2.a.c(rVarD7, g0Var);
                        g0Var2.g0();
                        if (g0Var2.S) {
                            g0Var2.l(gVar6);
                        } else {
                            g0Var2.q0();
                        }
                        l1.q.I(v1VarA5, g0Var, fVar13);
                        l1.q.I(m1VarM14, g0Var, fVar14);
                        x5.u(iHashCode14, g0Var, fVar15, g0Var, eVar4);
                        l1.q.I(rVarC14, g0Var, fVar16);
                        String str8 = (String) z0Var6.getValue();
                        long j120 = dl.a.k;
                        long jZ9 = kh.o.z(11);
                        long jZ10 = kh.o.z(11);
                        q3.u uVar5 = q3.u.M;
                        z6.b(str8, (b2.r) null, j120, jZ9, uVar5, (q3.i) null, 0L, (x3.l) null, (x3.k) null, jZ10, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var, 1597440, 48, 260010);
                        z6.b((String) z0Var7.getValue(), (b2.r) null, dl.a.o, kh.o.z(11), uVar5, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(11), 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var, 1597440, 48, 260010);
                        x5.z(g0Var2, true, true, true);
                    } else {
                        g0Var2.V();
                    }
                    return g00.b0.a;
                }
            };
            jVar2 = jVar2;
            p.n(!z5, null, v1.d.d(-185939589, nVar2, jVar2), jVar2, 384, 2);
            jVar2.r(true);
            z4 = z5;
        } else {
            jVar2.V();
            z4 = z2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new az.l(uiState, onAction, z4, i, i2, 3);
        }
    }

    public static final void c(u00.a aVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(556440632);
        int i2 = (g0Var.i(aVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            p0.e eVar = p0.f.a;
            b2.o oVar = b2.o.A;
            b2.r rVarC = h0.c.C(w50.c.n(z.n.f(f2.h.c(oVar, eVar), i2.t.b(0.06f, dl.a.i), i2.b0.b), true, aVar), 12);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
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
            o3.a(y3.R(2131231383, g0Var, 0), z3.U(g0Var, 2131887263), h0.z1.m(oVar, 20), dl.a.k, g0Var, 392, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.d(aVar, i, 10);
        }
    }

    public static final void d(String str, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1349756172);
        int i2 = (g0Var.g(str) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            wb.h hVar = new wb.h((Context) g0Var.k(c3.o0.b));
            hVar.c = str;
            hVar.c(200);
            mb.j jVarI = mb.l.i(hVar.a(), (z2.p) null, g0Var, 0, 62);
            float f = 48;
            z.n.c(jVarI, (String) null, rd.a.g0(f, 0, dl.a.s, f2.h.c(h0.z1.m(b2.o.A, f), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.n(str, i, 1);
        }
    }
}
