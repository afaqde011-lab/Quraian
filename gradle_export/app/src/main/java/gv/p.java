package gv;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.core.compose.widgets.lce.ResourceText;
import com.revenuecat.purchases.common.Constants;
import g1.j7;
import g1.o3;
import g1.x5;
import g1.z6;
import h0.i2;
import h0.m2;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import l1.p2;
import w.b2;

public abstract class p {
    public static final v1.c a = new v1.c(new eu.b(15), 1663375190, false);

    public static final void A(jk.a backdrop, final u00.k onAction, b2.r rVar, l1.j jVar, int i) {
        b2.r rVar2;
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1529611143);
        int i2 = i | (g0Var.i(backdrop) ? 4 : 2) | (g0Var.i(onAction) ? 32 : 16) | 384;
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, uu.a.class, aVarA, (b60.a) null, g0Var);
            }
            uu.a aVar = (uu.a) objN;
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = oi.k.f(kotlin.jvm.internal.a0.a, b00.c.class, aVarA2, (b60.a) null, g0Var);
            }
            l1.z0 z0VarQ = k00.f.q(((uu.w) aVar).F, g0Var, 0);
            l1.z0 z0VarQ2 = k00.f.q(((b00.c) objN2).i, g0Var, 0);
            Object objN3 = g0Var.N();
            if (objN3 == cVar) {
                objN3 = l1.q.o(g0Var);
                g0Var.n0(objN3);
            }
            final a40.z zVar = (a40.z) objN3;
            b2.r rVar3 = b2.o.A;
            b2.r rVarD = h0.z1.d(rVar3, 1.0f);
            h0.v vVarA = h0.u.a(h0.i.g(20), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
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
            String strU = z3.U(g0Var, 2131887092);
            boolean zG3 = g0Var.g(z0VarQ);
            Object objN4 = g0Var.N();
            if (zG3 || objN4 == cVar) {
                objN4 = new ds.l(z0VarQ, 4);
                g0Var.n0(objN4);
            }
            u00.a aVar2 = (u00.a) objN4;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objN5 = g0Var.N();
            if (z || objN5 == cVar) {
                objN5 = new as.d0(26, onAction);
                g0Var.n0(objN5);
            }
            u00.k kVar = (u00.k) objN5;
            boolean zI = g0Var.i(zVar) | (i3 == 32);
            Object objN6 = g0Var.N();
            if (zI || objN6 == cVar) {
                final int i4 = 0;
                objN6 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        int i5 = i4;
                        float fFloatValue = ((Float) obj).floatValue();
                        switch (i5) {
                            case 0:
                                ta.c0.M(zVar, (k00.i) null, (u00.n) null, (u00.k) null, new s0(onAction, fFloatValue, null, 0), 31);
                                break;
                            default:
                                ta.c0.M(zVar, (k00.i) null, (u00.n) null, (u00.k) null, new s0(onAction, fFloatValue, null, 1), 31);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN6);
            }
            int i5 = (i2 << 18) & 3670016;
            C(2131231417, 2131231418, aVar2, kVar, (u00.k) objN6, null, backdrop, strU, g0Var, i5);
            String strU2 = z3.U(g0Var, 2131887066);
            boolean zG4 = g0Var.g(z0VarQ2);
            Object objN7 = g0Var.N();
            if (zG4 || objN7 == cVar) {
                objN7 = new ds.l(z0VarQ2, 5);
                g0Var.n0(objN7);
            }
            u00.a aVar3 = (u00.a) objN7;
            boolean z2 = i3 == 32;
            Object objN8 = g0Var.N();
            if (z2 || objN8 == cVar) {
                objN8 = new as.d0(27, onAction);
                g0Var.n0(objN8);
            }
            u00.k kVar2 = (u00.k) objN8;
            boolean zI2 = g0Var.i(zVar) | (i3 == 32);
            Object objN9 = g0Var.N();
            if (zI2 || objN9 == cVar) {
                final int i6 = 1;
                objN9 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj) {
                        int i7 = i6;
                        float fFloatValue = ((Float) obj).floatValue();
                        switch (i7) {
                            case 0:
                                ta.c0.M(zVar, (k00.i) null, (u00.n) null, (u00.k) null, new s0(onAction, fFloatValue, null, 0), 31);
                                break;
                            default:
                                ta.c0.M(zVar, (k00.i) null, (u00.n) null, (u00.k) null, new s0(onAction, fFloatValue, null, 1), 31);
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN9);
            }
            C(2131231344, 2131231345, aVar3, kVar2, (u00.k) objN9, null, backdrop, strU2, g0Var, i5);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b1.n(i, 8, backdrop, onAction, rVar2);
        }
    }

    public static final void B(d00.x0 hazeState, jk.a backdrop, u00.k onAction, b2.r rVar, l1.j jVar, int i, int i2) {
        kotlin.jvm.internal.m.e(hazeState, "hazeState");
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1852052379);
        int i3 = (g0Var.g(hazeState) ? 4 : 2) | i | (g0Var.i(backdrop) ? 32 : 16) | (g0Var.i(onAction) ? 256 : 128);
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= g0Var.g(rVar) ? 2048 : 1024;
        }
        if (g0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                rVar = b2.o.A;
            }
            o(hazeState, rVar, v1.d.d(351588260, new c0.f(backdrop, onAction, 6), g0Var), g0Var, ((i3 >> 6) & 112) | (i3 & 14) | 384);
        } else {
            g0Var.V();
        }
        b2.r rVar2 = rVar;
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b6.p(hazeState, backdrop, onAction, rVar2, i, i2, 1);
        }
    }

    public static final void C(int i, int i2, final u00.a volumeValue, final u00.k onVolumeChanged, final u00.k onValueChangeFinished, b2.r rVar, final jk.a aVar, final String str, l1.j jVar, final int i3) {
        int i4;
        int i5;
        int i6;
        final b2.r rVar2;
        b2.r rVar3;
        u00.n nVar;
        b2.r rVar4;
        b3.e eVar;
        b3.f fVar;
        u00.n nVar2;
        b2.r rVar5;
        u00.a aVar2;
        kotlin.jvm.internal.m.e(volumeValue, "volumeValue");
        kotlin.jvm.internal.m.e(onVolumeChanged, "onVolumeChanged");
        kotlin.jvm.internal.m.e(onValueChangeFinished, "onValueChangeFinished");
        l1.j jVar2 = (l1.g0) jVar;
        jVar2.e0(2056451328);
        if ((i3 & 6) == 0) {
            i4 = (jVar2.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= jVar2.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= jVar2.i(volumeValue) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= jVar2.i(onVolumeChanged) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= jVar2.i(onValueChangeFinished) ? 16384 : 8192;
        }
        int i7 = i4 | 196608;
        if ((1572864 & i3) == 0) {
            i7 |= jVar2.i(aVar) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i7 |= jVar2.g(str) ? 8388608 : 4194304;
        }
        int i8 = i7;
        if (jVar2.S(i8 & 1, (i8 & 4793491) != 4793490)) {
            jVar2.X();
            int i9 = i3 & 1;
            b2.r rVar6 = b2.o.A;
            if (i9 == 0 || jVar2.A()) {
                rVar3 = rVar6;
            } else {
                jVar2.V();
                rVar3 = rVar;
            }
            jVar2.s();
            b2.r rVarD = h0.z1.d(rVar3, 1.0f);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, jVar2, 0);
            int iHashCode = Long.hashCode(((l1.g0) jVar2).T);
            l1.m1 m1VarM = jVar2.m();
            b2.r rVarC = b2.a.c(rVarD, jVar2);
            b3.i.c.getClass();
            b2.r rVar7 = rVar3;
            u00.a aVar3 = b3.h.b;
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(aVar3);
            } else {
                jVar2.q0();
            }
            u00.n nVar3 = b3.h.f;
            l1.q.I(vVarA, jVar2, nVar3);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, jVar2, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, jVar2, fVar3);
            b3.e eVar2 = b3.h.h;
            l1.q.E(jVar2, eVar2);
            u00.n nVar4 = b3.h.d;
            l1.q.I(rVarC, jVar2, nVar4);
            if (str != null) {
                jVar2.c0(-855367931);
                fVar = fVar3;
                nVar = nVar4;
                eVar = eVar2;
                rVar5 = rVar7;
                rVar4 = rVar6;
                nVar2 = nVar3;
                aVar2 = aVar3;
                z6.b(str, (b2.r) null, i2.t.b(0.7f, dl.a.k), kh.o.z(12), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(12), 0, false, 0, 0, (u00.k) null, (m3.r0) null, jVar2, ((i8 >> 21) & 14) | 24576, 48, 260074);
                jVar2 = jVar2;
                h0.c.h(h0.z1.e(rVar4, 16), jVar2);
                jVar2.r(false);
            } else {
                nVar = nVar4;
                rVar4 = rVar6;
                eVar = eVar2;
                fVar = fVar3;
                nVar2 = nVar3;
                rVar5 = rVar7;
                aVar2 = aVar3;
                jVar2.c0(-855115188);
                jVar2.r(false);
            }
            b2.r rVarD2 = h0.z1.d(rVar4, 1.0f);
            float f = 20;
            h0.v1 v1VarA = h0.t1.a(h0.i.g(f), b2.b.K, jVar2, 54);
            int iHashCode2 = Long.hashCode(((l1.g0) jVar2).T);
            l1.m1 m1VarM2 = jVar2.m();
            b2.r rVarC2 = b2.a.c(rVarD2, jVar2);
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(aVar2);
            } else {
                jVar2.q0();
            }
            l1.q.I(v1VarA, jVar2, nVar2);
            l1.q.I(m1VarM2, jVar2, fVar2);
            a1.b.v(iHashCode2, jVar2, fVar, jVar2, eVar);
            l1.q.I(rVarC2, jVar2, nVar);
            b2.r rVarM = h0.z1.m(rVar4, f);
            i5 = i;
            m2.b bVarR = y3.R(i5, jVar2, i8 & 14);
            long j = dl.a.k;
            o3.a(bVarR, (String) null, rVarM, i2.t.b(0.7f, j), jVar2, 440, 0);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            int i11 = i8 >> 6;
            int i12 = i8 >> 3;
            a.a.c(volumeValue, onVolumeChanged, onValueChangeFinished, new z00.a(0.0f, 1.0f), 0.005f, aVar, new h0.c1(1.0f, true), jVar2, (i11 & 896) | (i11 & 14) | 24576 | (i11 & 112) | (i12 & 458752), 0);
            b2.r rVarM2 = h0.z1.m(rVar4, f);
            i6 = i2;
            o3.a(y3.R(i6, jVar2, i12 & 14), (String) null, rVarM2, j, jVar2, 440, 0);
            jVar2.r(true);
            jVar2.r(true);
            rVar2 = rVar5;
        } else {
            i5 = i;
            i6 = i2;
            jVar2.V();
            rVar2 = rVar;
        }
        l1.r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            final int i13 = i5;
            final int i14 = i6;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p.C(i13, i14, volumeValue, onVolumeChanged, onValueChangeFinished, rVar2, aVar, str, (l1.j) obj, l1.q.K(i3 | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void D(final float f, final u00.k onValueChange, final u00.k onValueChangeFinished, final u00.k onDraggingChanged, final b2.r rVar, z00.a aVar, long j, long j2, float f2, float f3, l1.j jVar, final int i, final int i2) {
        final long j3;
        int i3;
        final long jB;
        int i4;
        float f4;
        int i5;
        int i6;
        boolean z;
        l1.j jVar2;
        final z00.a aVar2;
        final float f5;
        final float f6;
        l1.r1 r1VarT;
        z00.a aVar3;
        final boolean z2;
        Object objN;
        final l1.z0 z0Var;
        float f7;
        float f8;
        kotlin.jvm.internal.m.e(onValueChange, "onValueChange");
        kotlin.jvm.internal.m.e(onValueChangeFinished, "onValueChangeFinished");
        kotlin.jvm.internal.m.e(onDraggingChanged, "onDraggingChanged");
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-799763693);
        int i7 = i | (jVar3.d(f) ? 4 : 2);
        if ((i & 48) == 0) {
            i7 |= jVar3.i(onValueChange) ? 32 : 16;
        }
        int i8 = i7 | (jVar3.i(onValueChangeFinished) ? 256 : 128) | 65536;
        if ((i2 & 64) == 0) {
            j3 = j;
            int i9 = jVar3.f(j3) ? 1048576 : 524288;
            i3 = i8 | i9;
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    jB = j2;
                    int i11 = jVar3.f(jB) ? 8388608 : 4194304;
                    i3 |= i11;
                } else {
                    jB = j2;
                }
                i3 |= i11;
            } else {
                jB = j2;
            }
            i4 = i2 & 256;
            if (i4 != 0) {
                if ((i & 100663296) == 0) {
                    f4 = f2;
                    if (jVar3.d(f4)) {
                        i5 = 67108864;
                    } else {
                        i5 = 33554432;
                    }
                    i3 |= i5;
                }
                i6 = i3 | 805306368;
                if ((306783379 & i6) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (jVar3.S(i6 & 1, z)) {
                    jVar3.X();
                    if ((i & 1) != 0 || jVar3.A()) {
                        aVar3 = new z00.a(0.0f, 1.0f);
                        if ((i2 & 64) != 0) {
                            j3 = dl.a.k;
                        }
                        if ((i2 & 128) != 0) {
                            jB = i2.t.b(0.5f, dl.a.J);
                        }
                        if (i4 != 0) {
                            f5 = 8;
                        } else {
                            f5 = f4;
                        }
                        f6 = 14;
                    } else {
                        jVar3.V();
                        aVar3 = aVar;
                        f5 = f4;
                        f6 = f3;
                    }
                    final long j4 = j3;
                    final long j5 = jB;
                    jVar3.s();
                    if (jVar3.k(c3.o1.n) == y3.m.A) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    final View view = (View) jVar3.k(c3.o0.f);
                    final float f9 = aVar3.B - aVar3.A;
                    final l1.z0 z0VarG = l1.q.G(Float.valueOf(f), jVar3);
                    final l1.z0 z0VarG2 = l1.q.G(onValueChange, jVar3);
                    final l1.z0 z0VarG3 = l1.q.G(onValueChangeFinished, jVar3);
                    final l1.z0 z0VarG4 = l1.q.G(onDraggingChanged, jVar3);
                    objN = jVar3.N();
                    if (objN == l1.i.a) {
                        objN = l1.q.z(Boolean.FALSE);
                        jVar3.n0(objN);
                    }
                    z0Var = (l1.z0) objN;
                    if (((Boolean) z0Var.getValue()).booleanValue()) {
                        f7 = f6;
                    } else {
                        f7 = f5;
                    }
                    if (((Boolean) z0Var.getValue()).booleanValue()) {
                        f8 = 1500.0f;
                    } else {
                        f8 = 400.0f;
                    }
                    final p2 p2VarA = x.d.a(f7, x.c.v(1.0f, f8, (Object) null, 4), "SurahPlaybackTrackHeight", jVar3, 384, 8);
                    jVar2 = jVar3;
                    aVar2 = aVar3;
                    h0.c.a(h0.z1.e(h0.z1.d(rVar, 1.0f), 24), b2.b.E, false, v1.d.d(-1351756931, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            h0.t BoxWithConstraints = (h0.t) obj;
                            l1.g0 g0Var = (l1.j) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= g0Var.g(BoxWithConstraints) ? 4 : 2;
                            }
                            l1.g0 g0Var2 = g0Var;
                            if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                                float fH = y3.a.h(BoxWithConstraints.b);
                                float f11 = fH < 1.0f ? 1.0f : fH;
                                z00.a aVar4 = aVar2;
                                float f12 = f - aVar4.A;
                                float f13 = f9;
                                final float fX = ab.a0.x(f12 / f13, 0.0f, 1.0f);
                                b2.r rVarE = h0.z1.e(h0.z1.d(b2.o.A, 1.0f), ((y3.f) p2VarA.getValue()).A);
                                final long j6 = j5;
                                boolean zF = g0Var2.f(j6) | g0Var2.d(fX);
                                final long j7 = j4;
                                boolean zF2 = zF | g0Var2.f(j7);
                                final boolean z3 = z2;
                                boolean zH = zF2 | g0Var2.h(z3);
                                Object objN2 = g0Var2.N();
                                l1.c cVar = l1.i.a;
                                if (zH || objN2 == cVar) {
                                    objN2 = new u00.k() {
                                        @Override
                                        public final Object invoke(Object obj4) {
                                            k2.d Canvas = (k2.d) obj4;
                                            kotlin.jvm.internal.m.e(Canvas, "$this$Canvas");
                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.b() & 4294967295L)) / 2.0f;
                                            k2.d.a1(Canvas, j6, 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (k2.e) null, 246);
                                            float f14 = fX;
                                            if (f14 > 0.0f) {
                                                long j8 = j7;
                                                if (f14 >= 1.0f) {
                                                    k2.d.a1(Canvas, j8, 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (k2.e) null, 246);
                                                } else {
                                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.b() >> 32)) * f14;
                                                    i2.g gVarA = i2.j.a();
                                                    if (z3) {
                                                        i2.g.c(gVarA, c7.i.e(new h2.c(0.0f, 0.0f, fIntBitsToFloat2, Float.intBitsToFloat((int) (Canvas.b() & 4294967295L))), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 12));
                                                    } else {
                                                        i2.g.c(gVarA, c7.i.e(new h2.c(Float.intBitsToFloat((int) (Canvas.b() >> 32)) - fIntBitsToFloat2, 0.0f, Float.intBitsToFloat((int) (Canvas.b() >> 32)), Float.intBitsToFloat((int) (Canvas.b() & 4294967295L))), 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0L, 18));
                                                    }
                                                    k2.d.X0(Canvas, gVarA, j8, 0.0f, (k2.e) null, 60);
                                                }
                                            }
                                            return g00.b0.a;
                                        }
                                    };
                                    g0Var2.n0(objN2);
                                }
                                z.n.b(0, rVarE, g0Var, (u00.k) objN2);
                                b2.r rVarB = h0.s.a.b();
                                Object[] objArr = {aVar4, Boolean.valueOf(z3), Float.valueOf(f11)};
                                boolean zD = g0Var2.d(f11) | g0Var2.h(z3) | g0Var2.g(aVar4) | g0Var2.d(f13);
                                float f14 = f11;
                                l1.z0 z0Var2 = z0VarG2;
                                boolean zG = zD | g0Var2.g(z0Var2);
                                l1.z0 z0Var3 = z0VarG3;
                                boolean zG2 = zG | g0Var2.g(z0Var3);
                                Object objN3 = g0Var2.N();
                                if (zG2 || objN3 == cVar) {
                                    y0 y0Var = new y0(f14, z3, aVar4, f13, z0Var2, z0Var3);
                                    z0Var3 = z0Var3;
                                    z3 = z3;
                                    g0Var2.n0(y0Var);
                                    objN3 = y0Var;
                                }
                                v2.k kVar = v2.f0.a;
                                b2.r rVarV = rVarB.V(new v2.e0((Object) null, (Object) null, objArr, (PointerInputEventHandler) objN3, 3));
                                Object[] objArr2 = {aVar4, Boolean.valueOf(z3), Float.valueOf(f14)};
                                l1.z0 z0Var4 = z0VarG;
                                boolean zG3 = g0Var2.g(z0Var4);
                                l1.z0 z0Var5 = z0VarG4;
                                boolean zG4 = zG3 | g0Var2.g(z0Var5) | g0Var2.g(z0Var3) | g0Var2.d(f14) | g0Var2.h(z3) | g0Var2.g(aVar4) | g0Var2.d(f13);
                                View view2 = view;
                                boolean zI = zG4 | g0Var2.i(view2) | g0Var2.g(z0Var2);
                                Object objN4 = g0Var2.N();
                                if (zI || objN4 == cVar) {
                                    b1 b1Var = new b1(z0Var4, z0Var, z0Var5, z0Var3, f14, z3, aVar4, f13, view2, z0Var2);
                                    g0Var2.n0(b1Var);
                                    objN4 = b1Var;
                                }
                                h0.o.a(rVarV.V(new v2.e0((Object) null, (Object) null, objArr2, (PointerInputEventHandler) objN4, 3)), g0Var, 0);
                            } else {
                                g0Var2.V();
                            }
                            return g00.b0.a;
                        }
                    }, jVar2), jVar2, 3120, 4);
                    jB = j5;
                    j3 = j4;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    aVar2 = aVar;
                    f5 = f4;
                    f6 = f3;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    final z00.a aVar4 = aVar2;
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iK = l1.q.K(i | 1);
                            p.D(f, onValueChange, onValueChangeFinished, onDraggingChanged, rVar, aVar4, j3, jB, f5, f6, (l1.j) obj, iK, i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 100663296;
            f4 = f2;
            i6 = i3 | 805306368;
            if ((306783379 & i6) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (jVar3.S(i6 & 1, z)) {
                jVar3.X();
                if ((i & 1) != 0) {
                    aVar3 = new z00.a(0.0f, 1.0f);
                    if ((i2 & 64) != 0) {
                        j3 = dl.a.k;
                    }
                    if ((i2 & 128) != 0) {
                        jB = i2.t.b(0.5f, dl.a.J);
                    }
                    if (i4 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    f6 = 14;
                } else {
                    aVar3 = new z00.a(0.0f, 1.0f);
                    if ((i2 & 64) != 0) {
                        j3 = dl.a.k;
                    }
                    if ((i2 & 128) != 0) {
                        jB = i2.t.b(0.5f, dl.a.J);
                    }
                    if (i4 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    f6 = 14;
                }
                final long j6 = j3;
                final long j7 = jB;
                jVar3.s();
                if (jVar3.k(c3.o1.n) == y3.m.A) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                final View view2 = (View) jVar3.k(c3.o0.f);
                final float f11 = aVar3.B - aVar3.A;
                final l1.z0 z0VarG5 = l1.q.G(Float.valueOf(f), jVar3);
                final l1.z0 z0VarG6 = l1.q.G(onValueChange, jVar3);
                final l1.z0 z0VarG7 = l1.q.G(onValueChangeFinished, jVar3);
                final l1.z0 z0VarG8 = l1.q.G(onDraggingChanged, jVar3);
                objN = jVar3.N();
                if (objN == l1.i.a) {
                    objN = l1.q.z(Boolean.FALSE);
                    jVar3.n0(objN);
                }
                z0Var = (l1.z0) objN;
                if (((Boolean) z0Var.getValue()).booleanValue()) {
                    f7 = f6;
                } else {
                    f7 = f5;
                }
                if (((Boolean) z0Var.getValue()).booleanValue()) {
                    f8 = 1500.0f;
                } else {
                    f8 = 400.0f;
                }
                final p2 p2VarA2 = x.d.a(f7, x.c.v(1.0f, f8, (Object) null, 4), "SurahPlaybackTrackHeight", jVar3, 384, 8);
                jVar2 = jVar3;
                aVar2 = aVar3;
                h0.c.a(h0.z1.e(h0.z1.d(rVar, 1.0f), 24), b2.b.E, false, v1.d.d(-1351756931, new u00.o() {
                    @Override
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        h0.t BoxWithConstraints = (h0.t) obj;
                        l1.g0 g0Var = (l1.j) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= g0Var.g(BoxWithConstraints) ? 4 : 2;
                        }
                        l1.g0 g0Var2 = g0Var;
                        if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                            float fH = y3.a.h(BoxWithConstraints.b);
                            float f12 = fH < 1.0f ? 1.0f : fH;
                            z00.a aVar5 = aVar2;
                            float f13 = f - aVar5.A;
                            float f14 = f11;
                            final float fX = ab.a0.x(f13 / f14, 0.0f, 1.0f);
                            b2.r rVarE = h0.z1.e(h0.z1.d(b2.o.A, 1.0f), ((y3.f) p2VarA2.getValue()).A);
                            final long j8 = j7;
                            boolean zF = g0Var2.f(j8) | g0Var2.d(fX);
                            final long j9 = j6;
                            boolean zF2 = zF | g0Var2.f(j9);
                            final boolean z3 = z2;
                            boolean zH = zF2 | g0Var2.h(z3);
                            Object objN2 = g0Var2.N();
                            l1.c cVar = l1.i.a;
                            if (zH || objN2 == cVar) {
                                objN2 = new u00.k() {
                                    @Override
                                    public final Object invoke(Object obj4) {
                                        k2.d Canvas = (k2.d) obj4;
                                        kotlin.jvm.internal.m.e(Canvas, "$this$Canvas");
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.b() & 4294967295L)) / 2.0f;
                                        k2.d.a1(Canvas, j8, 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (k2.e) null, 246);
                                        float f15 = fX;
                                        if (f15 > 0.0f) {
                                            long j11 = j9;
                                            if (f15 >= 1.0f) {
                                                k2.d.a1(Canvas, j11, 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (k2.e) null, 246);
                                            } else {
                                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.b() >> 32)) * f15;
                                                i2.g gVarA = i2.j.a();
                                                if (z3) {
                                                    i2.g.c(gVarA, c7.i.e(new h2.c(0.0f, 0.0f, fIntBitsToFloat2, Float.intBitsToFloat((int) (Canvas.b() & 4294967295L))), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 12));
                                                } else {
                                                    i2.g.c(gVarA, c7.i.e(new h2.c(Float.intBitsToFloat((int) (Canvas.b() >> 32)) - fIntBitsToFloat2, 0.0f, Float.intBitsToFloat((int) (Canvas.b() >> 32)), Float.intBitsToFloat((int) (Canvas.b() & 4294967295L))), 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0L, 18));
                                                }
                                                k2.d.X0(Canvas, gVarA, j11, 0.0f, (k2.e) null, 60);
                                            }
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var2.n0(objN2);
                            }
                            z.n.b(0, rVarE, g0Var, (u00.k) objN2);
                            b2.r rVarB = h0.s.a.b();
                            Object[] objArr = {aVar5, Boolean.valueOf(z3), Float.valueOf(f12)};
                            boolean zD = g0Var2.d(f12) | g0Var2.h(z3) | g0Var2.g(aVar5) | g0Var2.d(f14);
                            float f15 = f12;
                            l1.z0 z0Var2 = z0VarG6;
                            boolean zG = zD | g0Var2.g(z0Var2);
                            l1.z0 z0Var3 = z0VarG7;
                            boolean zG2 = zG | g0Var2.g(z0Var3);
                            Object objN3 = g0Var2.N();
                            if (zG2 || objN3 == cVar) {
                                y0 y0Var = new y0(f15, z3, aVar5, f14, z0Var2, z0Var3);
                                z0Var3 = z0Var3;
                                z3 = z3;
                                g0Var2.n0(y0Var);
                                objN3 = y0Var;
                            }
                            v2.k kVar = v2.f0.a;
                            b2.r rVarV = rVarB.V(new v2.e0((Object) null, (Object) null, objArr, (PointerInputEventHandler) objN3, 3));
                            Object[] objArr2 = {aVar5, Boolean.valueOf(z3), Float.valueOf(f15)};
                            l1.z0 z0Var4 = z0VarG5;
                            boolean zG3 = g0Var2.g(z0Var4);
                            l1.z0 z0Var5 = z0VarG8;
                            boolean zG4 = zG3 | g0Var2.g(z0Var5) | g0Var2.g(z0Var3) | g0Var2.d(f15) | g0Var2.h(z3) | g0Var2.g(aVar5) | g0Var2.d(f14);
                            View view3 = view2;
                            boolean zI = zG4 | g0Var2.i(view3) | g0Var2.g(z0Var2);
                            Object objN4 = g0Var2.N();
                            if (zI || objN4 == cVar) {
                                b1 b1Var = new b1(z0Var4, z0Var, z0Var5, z0Var3, f15, z3, aVar5, f14, view3, z0Var2);
                                g0Var2.n0(b1Var);
                                objN4 = b1Var;
                            }
                            h0.o.a(rVarV.V(new v2.e0((Object) null, (Object) null, objArr2, (PointerInputEventHandler) objN4, 3)), g0Var, 0);
                        } else {
                            g0Var2.V();
                        }
                        return g00.b0.a;
                    }
                }, jVar2), jVar2, 3120, 4);
                jB = j7;
                j3 = j6;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                aVar2 = aVar;
                f5 = f4;
                f6 = f3;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                final z00.a aVar5 = aVar2;
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i | 1);
                        p.D(f, onValueChange, onValueChangeFinished, onDraggingChanged, rVar, aVar5, j3, jB, f5, f6, (l1.j) obj, iK, i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        j3 = j;
        i3 = i8 | i9;
        if ((i & 12582912) == 0) {
            if ((i2 & 128) == 0) {
                jB = j2;
                if (jVar3.f(jB)) {
                }
                i3 |= i11;
            } else {
                jB = j2;
            }
            i3 |= i11;
        } else {
            jB = j2;
        }
        i4 = i2 & 256;
        if (i4 != 0) {
            if ((i & 100663296) == 0) {
                f4 = f2;
                if (jVar3.d(f4)) {
                    i5 = 67108864;
                } else {
                    i5 = 33554432;
                }
                i3 |= i5;
            }
            i6 = i3 | 805306368;
            if ((306783379 & i6) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (jVar3.S(i6 & 1, z)) {
                jVar3.X();
                if ((i & 1) != 0) {
                    aVar3 = new z00.a(0.0f, 1.0f);
                    if ((i2 & 64) != 0) {
                        j3 = dl.a.k;
                    }
                    if ((i2 & 128) != 0) {
                        jB = i2.t.b(0.5f, dl.a.J);
                    }
                    if (i4 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    f6 = 14;
                } else {
                    aVar3 = new z00.a(0.0f, 1.0f);
                    if ((i2 & 64) != 0) {
                        j3 = dl.a.k;
                    }
                    if ((i2 & 128) != 0) {
                        jB = i2.t.b(0.5f, dl.a.J);
                    }
                    if (i4 != 0) {
                        f5 = 8;
                    } else {
                        f5 = f4;
                    }
                    f6 = 14;
                }
                final long j8 = j3;
                final long j9 = jB;
                jVar3.s();
                if (jVar3.k(c3.o1.n) == y3.m.A) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                final View view3 = (View) jVar3.k(c3.o0.f);
                final float f12 = aVar3.B - aVar3.A;
                final l1.z0 z0VarG9 = l1.q.G(Float.valueOf(f), jVar3);
                final l1.z0 z0VarG10 = l1.q.G(onValueChange, jVar3);
                final l1.z0 z0VarG11 = l1.q.G(onValueChangeFinished, jVar3);
                final l1.z0 z0VarG12 = l1.q.G(onDraggingChanged, jVar3);
                objN = jVar3.N();
                if (objN == l1.i.a) {
                    objN = l1.q.z(Boolean.FALSE);
                    jVar3.n0(objN);
                }
                z0Var = (l1.z0) objN;
                if (((Boolean) z0Var.getValue()).booleanValue()) {
                    f7 = f6;
                } else {
                    f7 = f5;
                }
                if (((Boolean) z0Var.getValue()).booleanValue()) {
                    f8 = 1500.0f;
                } else {
                    f8 = 400.0f;
                }
                final p2 p2VarA3 = x.d.a(f7, x.c.v(1.0f, f8, (Object) null, 4), "SurahPlaybackTrackHeight", jVar3, 384, 8);
                jVar2 = jVar3;
                aVar2 = aVar3;
                h0.c.a(h0.z1.e(h0.z1.d(rVar, 1.0f), 24), b2.b.E, false, v1.d.d(-1351756931, new u00.o() {
                    @Override
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        h0.t BoxWithConstraints = (h0.t) obj;
                        l1.g0 g0Var = (l1.j) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= g0Var.g(BoxWithConstraints) ? 4 : 2;
                        }
                        l1.g0 g0Var2 = g0Var;
                        if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                            float fH = y3.a.h(BoxWithConstraints.b);
                            float f13 = fH < 1.0f ? 1.0f : fH;
                            z00.a aVar6 = aVar2;
                            float f14 = f - aVar6.A;
                            float f15 = f12;
                            final float fX = ab.a0.x(f14 / f15, 0.0f, 1.0f);
                            b2.r rVarE = h0.z1.e(h0.z1.d(b2.o.A, 1.0f), ((y3.f) p2VarA3.getValue()).A);
                            final long j11 = j9;
                            boolean zF = g0Var2.f(j11) | g0Var2.d(fX);
                            final long j12 = j8;
                            boolean zF2 = zF | g0Var2.f(j12);
                            final boolean z3 = z2;
                            boolean zH = zF2 | g0Var2.h(z3);
                            Object objN2 = g0Var2.N();
                            l1.c cVar = l1.i.a;
                            if (zH || objN2 == cVar) {
                                objN2 = new u00.k() {
                                    @Override
                                    public final Object invoke(Object obj4) {
                                        k2.d Canvas = (k2.d) obj4;
                                        kotlin.jvm.internal.m.e(Canvas, "$this$Canvas");
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.b() & 4294967295L)) / 2.0f;
                                        k2.d.a1(Canvas, j11, 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (k2.e) null, 246);
                                        float f16 = fX;
                                        if (f16 > 0.0f) {
                                            long j13 = j12;
                                            if (f16 >= 1.0f) {
                                                k2.d.a1(Canvas, j13, 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (k2.e) null, 246);
                                            } else {
                                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.b() >> 32)) * f16;
                                                i2.g gVarA = i2.j.a();
                                                if (z3) {
                                                    i2.g.c(gVarA, c7.i.e(new h2.c(0.0f, 0.0f, fIntBitsToFloat2, Float.intBitsToFloat((int) (Canvas.b() & 4294967295L))), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 12));
                                                } else {
                                                    i2.g.c(gVarA, c7.i.e(new h2.c(Float.intBitsToFloat((int) (Canvas.b() >> 32)) - fIntBitsToFloat2, 0.0f, Float.intBitsToFloat((int) (Canvas.b() >> 32)), Float.intBitsToFloat((int) (Canvas.b() & 4294967295L))), 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0L, 18));
                                                }
                                                k2.d.X0(Canvas, gVarA, j13, 0.0f, (k2.e) null, 60);
                                            }
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var2.n0(objN2);
                            }
                            z.n.b(0, rVarE, g0Var, (u00.k) objN2);
                            b2.r rVarB = h0.s.a.b();
                            Object[] objArr = {aVar6, Boolean.valueOf(z3), Float.valueOf(f13)};
                            boolean zD = g0Var2.d(f13) | g0Var2.h(z3) | g0Var2.g(aVar6) | g0Var2.d(f15);
                            float f16 = f13;
                            l1.z0 z0Var2 = z0VarG10;
                            boolean zG = zD | g0Var2.g(z0Var2);
                            l1.z0 z0Var3 = z0VarG11;
                            boolean zG2 = zG | g0Var2.g(z0Var3);
                            Object objN3 = g0Var2.N();
                            if (zG2 || objN3 == cVar) {
                                y0 y0Var = new y0(f16, z3, aVar6, f15, z0Var2, z0Var3);
                                z0Var3 = z0Var3;
                                z3 = z3;
                                g0Var2.n0(y0Var);
                                objN3 = y0Var;
                            }
                            v2.k kVar = v2.f0.a;
                            b2.r rVarV = rVarB.V(new v2.e0((Object) null, (Object) null, objArr, (PointerInputEventHandler) objN3, 3));
                            Object[] objArr2 = {aVar6, Boolean.valueOf(z3), Float.valueOf(f16)};
                            l1.z0 z0Var4 = z0VarG9;
                            boolean zG3 = g0Var2.g(z0Var4);
                            l1.z0 z0Var5 = z0VarG12;
                            boolean zG4 = zG3 | g0Var2.g(z0Var5) | g0Var2.g(z0Var3) | g0Var2.d(f16) | g0Var2.h(z3) | g0Var2.g(aVar6) | g0Var2.d(f15);
                            View view4 = view3;
                            boolean zI = zG4 | g0Var2.i(view4) | g0Var2.g(z0Var2);
                            Object objN4 = g0Var2.N();
                            if (zI || objN4 == cVar) {
                                b1 b1Var = new b1(z0Var4, z0Var, z0Var5, z0Var3, f16, z3, aVar6, f15, view4, z0Var2);
                                g0Var2.n0(b1Var);
                                objN4 = b1Var;
                            }
                            h0.o.a(rVarV.V(new v2.e0((Object) null, (Object) null, objArr2, (PointerInputEventHandler) objN4, 3)), g0Var, 0);
                        } else {
                            g0Var2.V();
                        }
                        return g00.b0.a;
                    }
                }, jVar2), jVar2, 3120, 4);
                jB = j9;
                j3 = j8;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                aVar2 = aVar;
                f5 = f4;
                f6 = f3;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                final z00.a aVar6 = aVar2;
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i | 1);
                        p.D(f, onValueChange, onValueChangeFinished, onDraggingChanged, rVar, aVar6, j3, jB, f5, f6, (l1.j) obj, iK, i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 100663296;
        f4 = f2;
        i6 = i3 | 805306368;
        if ((306783379 & i6) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (jVar3.S(i6 & 1, z)) {
            jVar3.X();
            if ((i & 1) != 0) {
                aVar3 = new z00.a(0.0f, 1.0f);
                if ((i2 & 64) != 0) {
                    j3 = dl.a.k;
                }
                if ((i2 & 128) != 0) {
                    jB = i2.t.b(0.5f, dl.a.J);
                }
                if (i4 != 0) {
                    f5 = 8;
                } else {
                    f5 = f4;
                }
                f6 = 14;
            } else {
                aVar3 = new z00.a(0.0f, 1.0f);
                if ((i2 & 64) != 0) {
                    j3 = dl.a.k;
                }
                if ((i2 & 128) != 0) {
                    jB = i2.t.b(0.5f, dl.a.J);
                }
                if (i4 != 0) {
                    f5 = 8;
                } else {
                    f5 = f4;
                }
                f6 = 14;
            }
            final long j11 = j3;
            final long j12 = jB;
            jVar3.s();
            if (jVar3.k(c3.o1.n) == y3.m.A) {
                z2 = true;
            } else {
                z2 = false;
            }
            final View view4 = (View) jVar3.k(c3.o0.f);
            final float f13 = aVar3.B - aVar3.A;
            final l1.z0 z0VarG13 = l1.q.G(Float.valueOf(f), jVar3);
            final l1.z0 z0VarG14 = l1.q.G(onValueChange, jVar3);
            final l1.z0 z0VarG15 = l1.q.G(onValueChangeFinished, jVar3);
            final l1.z0 z0VarG16 = l1.q.G(onDraggingChanged, jVar3);
            objN = jVar3.N();
            if (objN == l1.i.a) {
                objN = l1.q.z(Boolean.FALSE);
                jVar3.n0(objN);
            }
            z0Var = (l1.z0) objN;
            if (((Boolean) z0Var.getValue()).booleanValue()) {
                f7 = f6;
            } else {
                f7 = f5;
            }
            if (((Boolean) z0Var.getValue()).booleanValue()) {
                f8 = 1500.0f;
            } else {
                f8 = 400.0f;
            }
            final p2 p2VarA4 = x.d.a(f7, x.c.v(1.0f, f8, (Object) null, 4), "SurahPlaybackTrackHeight", jVar3, 384, 8);
            jVar2 = jVar3;
            aVar2 = aVar3;
            h0.c.a(h0.z1.e(h0.z1.d(rVar, 1.0f), 24), b2.b.E, false, v1.d.d(-1351756931, new u00.o() {
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    h0.t BoxWithConstraints = (h0.t) obj;
                    l1.g0 g0Var = (l1.j) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= g0Var.g(BoxWithConstraints) ? 4 : 2;
                    }
                    l1.g0 g0Var2 = g0Var;
                    if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fH = y3.a.h(BoxWithConstraints.b);
                        float f14 = fH < 1.0f ? 1.0f : fH;
                        z00.a aVar7 = aVar2;
                        float f15 = f - aVar7.A;
                        float f16 = f13;
                        final float fX = ab.a0.x(f15 / f16, 0.0f, 1.0f);
                        b2.r rVarE = h0.z1.e(h0.z1.d(b2.o.A, 1.0f), ((y3.f) p2VarA4.getValue()).A);
                        final long j13 = j12;
                        boolean zF = g0Var2.f(j13) | g0Var2.d(fX);
                        final long j14 = j11;
                        boolean zF2 = zF | g0Var2.f(j14);
                        final boolean z3 = z2;
                        boolean zH = zF2 | g0Var2.h(z3);
                        Object objN2 = g0Var2.N();
                        l1.c cVar = l1.i.a;
                        if (zH || objN2 == cVar) {
                            objN2 = new u00.k() {
                                @Override
                                public final Object invoke(Object obj4) {
                                    k2.d Canvas = (k2.d) obj4;
                                    kotlin.jvm.internal.m.e(Canvas, "$this$Canvas");
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.b() & 4294967295L)) / 2.0f;
                                    k2.d.a1(Canvas, j13, 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (k2.e) null, 246);
                                    float f17 = fX;
                                    if (f17 > 0.0f) {
                                        long j15 = j14;
                                        if (f17 >= 1.0f) {
                                            k2.d.a1(Canvas, j15, 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (k2.e) null, 246);
                                        } else {
                                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.b() >> 32)) * f17;
                                            i2.g gVarA = i2.j.a();
                                            if (z3) {
                                                i2.g.c(gVarA, c7.i.e(new h2.c(0.0f, 0.0f, fIntBitsToFloat2, Float.intBitsToFloat((int) (Canvas.b() & 4294967295L))), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0L, 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 12));
                                            } else {
                                                i2.g.c(gVarA, c7.i.e(new h2.c(Float.intBitsToFloat((int) (Canvas.b() >> 32)) - fIntBitsToFloat2, 0.0f, Float.intBitsToFloat((int) (Canvas.b() >> 32)), Float.intBitsToFloat((int) (Canvas.b() & 4294967295L))), 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0L, 18));
                                            }
                                            k2.d.X0(Canvas, gVarA, j15, 0.0f, (k2.e) null, 60);
                                        }
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var2.n0(objN2);
                        }
                        z.n.b(0, rVarE, g0Var, (u00.k) objN2);
                        b2.r rVarB = h0.s.a.b();
                        Object[] objArr = {aVar7, Boolean.valueOf(z3), Float.valueOf(f14)};
                        boolean zD = g0Var2.d(f14) | g0Var2.h(z3) | g0Var2.g(aVar7) | g0Var2.d(f16);
                        float f17 = f14;
                        l1.z0 z0Var2 = z0VarG14;
                        boolean zG = zD | g0Var2.g(z0Var2);
                        l1.z0 z0Var3 = z0VarG15;
                        boolean zG2 = zG | g0Var2.g(z0Var3);
                        Object objN3 = g0Var2.N();
                        if (zG2 || objN3 == cVar) {
                            y0 y0Var = new y0(f17, z3, aVar7, f16, z0Var2, z0Var3);
                            z0Var3 = z0Var3;
                            z3 = z3;
                            g0Var2.n0(y0Var);
                            objN3 = y0Var;
                        }
                        v2.k kVar = v2.f0.a;
                        b2.r rVarV = rVarB.V(new v2.e0((Object) null, (Object) null, objArr, (PointerInputEventHandler) objN3, 3));
                        Object[] objArr2 = {aVar7, Boolean.valueOf(z3), Float.valueOf(f17)};
                        l1.z0 z0Var4 = z0VarG13;
                        boolean zG3 = g0Var2.g(z0Var4);
                        l1.z0 z0Var5 = z0VarG16;
                        boolean zG4 = zG3 | g0Var2.g(z0Var5) | g0Var2.g(z0Var3) | g0Var2.d(f17) | g0Var2.h(z3) | g0Var2.g(aVar7) | g0Var2.d(f16);
                        View view5 = view4;
                        boolean zI = zG4 | g0Var2.i(view5) | g0Var2.g(z0Var2);
                        Object objN4 = g0Var2.N();
                        if (zI || objN4 == cVar) {
                            b1 b1Var = new b1(z0Var4, z0Var, z0Var5, z0Var3, f17, z3, aVar7, f16, view5, z0Var2);
                            g0Var2.n0(b1Var);
                            objN4 = b1Var;
                        }
                        h0.o.a(rVarV.V(new v2.e0((Object) null, (Object) null, objArr2, (PointerInputEventHandler) objN4, 3)), g0Var, 0);
                    } else {
                        g0Var2.V();
                    }
                    return g00.b0.a;
                }
            }, jVar2), jVar2, 3120, 4);
            jB = j12;
            j3 = j11;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            aVar2 = aVar;
            f5 = f4;
            f6 = f3;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            final z00.a aVar7 = aVar2;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i | 1);
                    p.D(f, onValueChange, onValueChangeFinished, onDraggingChanged, rVar, aVar7, j3, jB, f5, f6, (l1.j) obj, iK, i2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void E(ot.e eVar, u00.a aVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-267666233);
        int i2 = (g0Var.e(eVar.ordinal()) ? 4 : 2) | i | (g0Var.i(aVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (z || objN == obj) {
                objN = new g1.l0(eVar, 4);
                g0Var.n0(objN);
            }
            u00.a aVar2 = (u00.a) objN;
            androidx.lifecycle.f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            k00.c cVar = null;
            qt.k kVar = (qt.k) c7.i.S(kotlin.jvm.internal.a0.a.b(qt.k.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(g0Var), aVar2);
            l1.z0 z0VarQ = k00.f.q(kVar.c.d, g0Var, 0);
            boolean zG = g0Var.g(kVar);
            Object objN2 = g0Var.N();
            if (zG || objN2 == obj) {
                objN2 = new e1(kVar, cVar, 0);
                g0Var.n0(objN2);
            }
            g00.b0 b0Var = g00.b0.a;
            l1.q.i(b0Var, g0Var, (u00.n) objN2);
            boolean zG2 = g0Var.g(kVar) | ((i2 & 112) == 32);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == obj) {
                objN3 = new g6.a(kVar, aVar, (k00.c) null, 2);
                g0Var.n0(objN3);
            }
            l1.q.i(b0Var, g0Var, (u00.n) objN3);
            boolean zG3 = g0Var.g(kVar);
            Object objN4 = g0Var.N();
            if (zG3 || objN4 == obj) {
                objN4 = new d1(kVar, 0);
                g0Var.n0(objN4);
            }
            qd.s0.G((u00.a) objN4, new c4.v(3, false), v1.d.d(1911165918, new al.i(kVar, z0VarQ, 21), g0Var), g0Var, 432, 0);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c1(eVar, aVar, i, 2);
        }
    }

    public static final void F(ot.e kind, u00.a onDismiss, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(174574784);
        int i2 = (g0Var.e(kind.ordinal()) ? 4 : 2) | i | (g0Var.i(onDismiss) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = new f1();
                g0Var.n0(objN);
            }
            f1 f1Var = (f1) objN;
            boolean zI = g0Var.i(f1Var);
            Object objN2 = g0Var.N();
            if (zI || objN2 == obj) {
                objN2 = new a1.e1(f1Var, 27);
                g0Var.n0(objN2);
            }
            l1.q.e(g00.b0.a, (u00.k) objN2, g0Var);
            l1.q.a(u6.a.a.a(f1Var), v1.d.d(1463877632, new c1(kind, onDismiss), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new c1(kind, onDismiss, i, 1);
        }
    }

    public static final void G(bv.o1 o1Var, u00.k kVar, kk.c cVar, d00.x0 x0Var, v1.c cVar2, l1.j jVar, int i) {
        int i2;
        v1.c cVar3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(51357903);
        if ((i & 6) == 0) {
            i2 = i | (g0Var.g(o1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(kVar) ? 32 : 16;
        }
        int i3 = i2 | (g0Var.g(cVar) ? 256 : 128) | (g0Var.g(x0Var) ? 2048 : 1024);
        if (g0Var.S(i3 & 1, (i3 & 9363) != 9362)) {
            WeakHashMap weakHashMap = m2.w;
            h0.t0 t0VarL = h0.c.l(h0.b.e(g0Var).b, g0Var);
            i2 i2Var = h0.b.e(g0Var).n;
            boolean z = o1Var.Q;
            boolean z2 = o1Var.x;
            wk.d dVarH = w00.a.h(i2Var, (z && z2) ? false : true, J(), g0Var);
            p2 p2VarA = b2.a(o1Var.m == null ? i2.t.b(0.5f, dl.a.P) : i2.t.b(0.1f, dl.a.i), (x.y) null, (String) null, g0Var, 0, 14);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = oi.k.s(0, g0Var);
            }
            l1.f1 f1Var = (l1.y0) objN;
            Object objN2 = g0Var.N();
            if (objN2 == obj) {
                objN2 = oi.k.s(0, g0Var);
            }
            l1.f1 f1Var2 = (l1.y0) objN2;
            y3.c cVar4 = (y3.c) g0Var.k(c3.o1.h);
            int iH = f1Var.h() - f1Var2.h();
            if (iH < 0) {
                iH = 0;
            }
            float fH0 = cVar4.h0(iH);
            h0.a0 a0Var = h0.z1.c;
            b2.r rVarB = h0.c.B(h0.c.B(a0Var, t0VarL), dVarH);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarB, g0Var);
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
            l1.q.I(rVarC, g0Var, b3.h.d);
            w.c0.c(o1Var.C, h0.c.G(a0Var, 0.0f, 0.0f, 0.0f, fH0, 7), (w.x0) null, (w.y0) null, (String) null, v1.d.d(-2119114575, new x1(o1Var, kVar, cVar, p2VarA, 1), g0Var), g0Var, 196608, 28);
            boolean z3 = !z2;
            b2.r rVarA = h0.s.a.a(b2.o.A, b2.b.H);
            Object objN3 = g0Var.N();
            if (objN3 == obj) {
                objN3 = new e(f1Var, 6);
                g0Var.n0(objN3);
            }
            n(z3, z2.d0.o(rVarA, (u00.k) objN3), v1.d.d(1874872311, new a2(o1Var, kVar, cVar, x0Var, p2VarA, f1Var2), g0Var), g0Var, 384, 0);
            g0Var = g0Var;
            cVar3 = cVar2;
            cVar3.invoke(g0Var, 6);
            g0Var.r(true);
        } else {
            cVar3 = cVar2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new s1(o1Var, kVar, cVar, x0Var, cVar3, i, 1);
        }
    }

    public static final void H(bv.o1 uiState, u00.k onAction, kk.c cVar, d00.x0 x0Var, l1.j jVar, int i) {
        int i2;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-627264445);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        int i3 = i2 | (g0Var.g(cVar) ? 256 : 128) | (g0Var.g(x0Var) ? 2048 : 1024);
        if (g0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            G(uiState, onAction, cVar, x0Var, v1.d.d(-390457374, new j0(uiState, onAction, 2, (byte) 0), g0Var), g0Var, (i3 & 7168) | (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896));
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new q1(uiState, onAction, cVar, x0Var, i, 1);
        }
    }

    public static final float I(float f, float f2, boolean z, z00.a aVar, float f3) {
        float fX = ab.a0.x(f / f2, 0.0f, 1.0f);
        if (!z) {
            fX = 1.0f - fX;
        }
        return ((Number) ab.a0.D(Float.valueOf((fX * f3) + aVar.A), aVar)).floatValue();
    }

    public static final x.b1 J() {
        return x.c.v(0.9f, 160.0f, (Object) null, 4);
    }

    public static final void a(final int i, final int i2, final u00.a onClick, final long j, final jk.a backdrop, b2.r rVar, l1.j jVar, final int i3, final int i4) {
        int i5;
        b2.r rVar2;
        boolean z;
        l1.j jVar2;
        final b2.r rVar3;
        l1.r1 r1VarT;
        b2.r rVar4;
        kotlin.jvm.internal.m.e(onClick, "onClick");
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(1184631918);
        if ((i3 & 6) == 0) {
            i5 = (jVar3.e(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= jVar3.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= jVar3.i(onClick) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= jVar3.f(j) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= jVar3.i(backdrop) ? 16384 : 8192;
        }
        int i6 = i4 & 32;
        if (i6 == 0) {
            if ((196608 & i3) == 0) {
                rVar2 = rVar;
                i5 |= jVar3.g(rVar2) ? 131072 : 65536;
            }
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (jVar3.S(i5 & 1, z)) {
                if (i6 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                int i7 = i5 >> 9;
                jVar2 = jVar3;
                w50.c.f(onClick, backdrop, rVar4, false, false, 38, null, 0L, j, 32, null, 0, v1.d.d(151262818, new a(i, i2, 0), jVar3), jVar2, ((i5 >> 6) & 14) | 805502976 | (i7 & 112) | (i7 & 896) | ((i5 << 15) & 234881024), 432, 1240);
                rVar3 = rVar4;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar3 = rVar2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p.a(i, i2, onClick, j, backdrop, rVar3, (l1.j) obj, l1.q.K(i3 | 1), i4);
                        return g00.b0.a;
                    }
                };
            }
        }
        i5 |= 196608;
        rVar2 = rVar;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (jVar3.S(i5 & 1, z)) {
            if (i6 != 0) {
                rVar4 = b2.o.A;
            } else {
                rVar4 = rVar2;
            }
            int i8 = i5 >> 9;
            jVar2 = jVar3;
            w50.c.f(onClick, backdrop, rVar4, false, false, 38, null, 0L, j, 32, null, 0, v1.d.d(151262818, new a(i, i2, 0), jVar3), jVar2, ((i5 >> 6) & 14) | 805502976 | (i8 & 112) | (i8 & 896) | ((i5 << 15) & 234881024), 432, 1240);
            rVar3 = rVar4;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar3 = rVar2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p.a(i, i2, onClick, j, backdrop, rVar3, (l1.j) obj, l1.q.K(i3 | 1), i4);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(final String title, final String buttonText, final int i, u30.b ayahNumbers, int i2, yu.g layoutMode, final u00.a onDismiss, final u00.k onConfirm, boolean z, l1.j jVar, int i3) {
        l1.j jVar2;
        boolean z2;
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(buttonText, "buttonText");
        kotlin.jvm.internal.m.e(ayahNumbers, "ayahNumbers");
        kotlin.jvm.internal.m.e(layoutMode, "layoutMode");
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        kotlin.jvm.internal.m.e(onConfirm, "onConfirm");
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-1224790121);
        int i4 = i3 | (jVar3.g(title) ? 32 : 16) | (jVar3.g(buttonText) ? 256 : 128) | (jVar3.e(i) ? 2048 : 1024) | (jVar3.g(ayahNumbers) ? 16384 : 8192) | (jVar3.e(i2) ? 131072 : 65536) | (jVar3.e(layoutMode.ordinal()) ? 1048576 : 524288) | (jVar3.i(onDismiss) ? 8388608 : 4194304) | (jVar3.i(onConfirm) ? 67108864 : 33554432) | 805306368;
        if (jVar3.S(i4 & 1, (i4 & 306783379) != 306783378)) {
            boolean z3 = (i4 & 3670016) == 1048576;
            Object objN = jVar3.N();
            Object obj = l1.i.a;
            if (z3 || objN == obj) {
                int iOrdinal = layoutMode.ordinal();
                int i5 = 3;
                if (iOrdinal != 0 && iOrdinal != 3) {
                    i5 = 5;
                }
                objN = Integer.valueOf(i5);
                jVar3.n0(objN);
            }
            final int iIntValue = ((Number) objN).intValue();
            boolean z4 = (i4 & 57344) == 16384;
            Object objN2 = jVar3.N();
            if (z4 || objN2 == obj) {
                objN2 = ayahNumbers.isEmpty() ? va.a.R(1) : ayahNumbers;
                jVar3.n0(objN2);
            }
            final List list = (List) objN2;
            boolean zG = jVar3.g(list) | ((i4 & 458752) == 131072);
            Object objN3 = jVar3.N();
            if (zG || objN3 == obj) {
                int iIndexOf = list.indexOf(Integer.valueOf(i2));
                objN3 = oi.k.s(iIndexOf >= 0 ? iIndexOf : 0, jVar3);
            }
            final l1.f1 f1Var = (l1.y0) objN3;
            final j0.v vVarA = j0.x.a(f1Var.h(), jVar3, 2);
            Object objN4 = jVar3.N();
            if (objN4 == obj) {
                objN4 = l1.q.r(new el.b(vVarA, 4));
                jVar3.n0(objN4);
            }
            final p2 p2Var = (p2) objN4;
            long j = dl.a.K;
            long j2 = i2.t.c;
            final long jU = i2.b0.u(j, j2, 0.05f);
            final long jB = i2.t.b(0.12f, j2);
            jVar2 = jVar3;
            qd.s0.G(onDismiss, (c4.v) null, v1.d.d(2106612910, new u00.n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    l1.g0 g0Var = (l1.j) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    l1.g0 g0Var2 = g0Var;
                    if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        b2.r rVarC = h0.c.C(h0.z1.d(b2.o.A, 1.0f), 16);
                        p0.e eVarA = p0.f.a(32);
                        g1.z zVarI = x5.i(dl.a.K, 0L, g0Var, 0, 14);
                        final String str = title;
                        final List list2 = list;
                        final l1.y0 y0Var = f1Var;
                        final int i6 = iIntValue;
                        final long j3 = jU;
                        final j0.v vVar = vVarA;
                        final long j4 = jB;
                        final u00.k kVar = onConfirm;
                        final u00.a aVar = onDismiss;
                        final int i7 = i;
                        final p2 p2Var2 = p2Var;
                        final String str2 = buttonText;
                        x5.b(rVarC, eVarA, zVarI, (g1.a0) null, (z.u) null, v1.d.d(367085600, new u00.o() {
                            @Override
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                int i8;
                                h0.w Card = (h0.w) obj4;
                                l1.g0 g0Var3 = (l1.j) obj5;
                                int iIntValue3 = ((Integer) obj6).intValue();
                                kotlin.jvm.internal.m.e(Card, "$this$Card");
                                l1.g0 g0Var4 = g0Var3;
                                if (g0Var4.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    b2.o oVar = b2.o.A;
                                    float f = 16;
                                    b2.r rVarE = h0.c.E(h0.z1.d(oVar, 1.0f), f, 0.0f, 2);
                                    float f2 = 24;
                                    h0.v vVarA2 = h0.u.a(h0.i.g(f2), b2.b.N, g0Var3, 54);
                                    int iHashCode = Long.hashCode(g0Var4.T);
                                    l1.m1 m1VarM = g0Var4.m();
                                    b2.r rVarC2 = b2.a.c(rVarE, g0Var3);
                                    b3.i.c.getClass();
                                    b3.g gVar = b3.h.b;
                                    g0Var4.g0();
                                    if (g0Var4.S) {
                                        g0Var4.l(gVar);
                                    } else {
                                        g0Var4.q0();
                                    }
                                    l1.q.I(vVarA2, g0Var3, b3.h.f);
                                    l1.q.I(m1VarM, g0Var3, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode), g0Var3, b3.h.g);
                                    l1.q.E(g0Var3, b3.h.h);
                                    l1.q.I(rVarC2, g0Var3, b3.h.d);
                                    z6.b(str, h0.c.G(oVar, 0.0f, f2, 0.0f, 0.0f, 13), dl.a.k, kh.o.z(22), q3.u.M, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(22), 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var3, 1597488, 48, 260008);
                                    l1.f1 f1Var2 = y0Var;
                                    int iH = f1Var2.h();
                                    boolean zG2 = g0Var4.g(f1Var2);
                                    Object objN5 = g0Var4.N();
                                    Object obj7 = l1.i.a;
                                    if (zG2 || objN5 == obj7) {
                                        i8 = 0;
                                        objN5 = new e(f1Var2, 0);
                                        g0Var4.n0(objN5);
                                    } else {
                                        i8 = 0;
                                    }
                                    b2.r rVarC3 = f2.h.c(h0.z1.d(oVar, 1.0f), p0.f.a(f2));
                                    final int i9 = i7;
                                    long j5 = i2.t.f;
                                    i2.t tVar = new i2.t(j4);
                                    List list3 = list2;
                                    f50.k.g(list3, iH, (u00.k) objN5, rVarC3, v1.d.d(-1799657275, new u00.p() {
                                        @Override
                                        public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                                            int iIntValue4 = ((Integer) obj8).intValue();
                                            ((Boolean) obj9).getClass();
                                            l1.g0 g0Var5 = (l1.j) obj10;
                                            int iIntValue5 = ((Integer) obj11).intValue();
                                            if ((iIntValue5 & 6) == 0) {
                                                iIntValue5 |= g0Var5.e(iIntValue4) ? 4 : 2;
                                            }
                                            l1.g0 g0Var6 = g0Var5;
                                            if (g0Var6.S(iIntValue5 & 1, (iIntValue5 & 131) != 130)) {
                                                z6.b(i9 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + iIntValue4, h0.z1.d(b2.o.A, 1.0f), dl.a.n, kh.o.z(28), q3.u.L, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var5, 1597488, 0, 261032);
                                            } else {
                                                g0Var6.V();
                                            }
                                            return g00.b0.a;
                                        }
                                    }, g0Var3), 48, i6, i8, j5, j3, true, true, vVar, false, tVar, false, false, g0Var3, 113467392, 224262, 65536);
                                    b2.r rVarG = h0.c.G(h0.z1.d(oVar, 1.0f), 0.0f, 0.0f, 0.0f, f2, 7);
                                    boolean z5 = !((Boolean) p2Var2.getValue()).booleanValue();
                                    p0.e eVarA2 = p0.f.a(32);
                                    h0.p1 p1VarE = h0.c.e(0.0f, f, 1);
                                    h0.p1 p1Var = g1.s.a;
                                    long j6 = dl.a.i;
                                    long j7 = dl.a.L;
                                    g1.r rVarA = g1.s.a(j6, j7, i2.t.b(0.5f, j6), i2.t.b(0.5f, j7), g0Var3, 0);
                                    u00.k kVar2 = kVar;
                                    boolean zG3 = g0Var4.g(kVar2) | g0Var4.i(list3) | g0Var4.g(f1Var2);
                                    u00.a aVar2 = aVar;
                                    boolean zG4 = zG3 | g0Var4.g(aVar2);
                                    Object objN6 = g0Var4.N();
                                    if (zG4 || objN6 == obj7) {
                                        objN6 = new ct.m(kVar2, list3, aVar2, (l1.y0) f1Var2);
                                        g0Var4.n0(objN6);
                                    }
                                    x5.a((u00.a) objN6, rVarG, z5, eVarA2, rVarA, (g1.u) null, p1VarE, (f0.i) null, v1.d.d(87843846, new fv.a(str2, 1), g0Var3), g0Var3, 817889328, 352);
                                    g0Var4.r(true);
                                } else {
                                    g0Var4.V();
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 196614, 24);
                    } else {
                        g0Var2.V();
                    }
                    return g00.b0.a;
                }
            }, jVar2), jVar2, ((i4 >> 21) & 14) | 384, 2);
            z2 = true;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            z2 = z;
        }
        l1.r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.k(title, buttonText, i, ayahNumbers, i2, layoutMode, onDismiss, onConfirm, z2, i3);
        }
    }

    public static final void c(final zz.a aVar, final u00.a onOpenBackgroundSoundPicker, final jk.a aVar2, final long j, b2.r rVar, l1.j jVar, final int i, final int i2) {
        b2.r rVar2;
        boolean z;
        l1.j jVar2;
        final b2.r rVar3;
        l1.r1 r1VarT;
        b2.r rVar4;
        String strA;
        Integer num;
        ResourceText resourceText;
        kotlin.jvm.internal.m.e(onOpenBackgroundSoundPicker, "onOpenBackgroundSoundPicker");
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-1598235378);
        int i3 = (i & 6) == 0 ? (jVar3.g(aVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= jVar3.i(onOpenBackgroundSoundPicker) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= jVar3.i(aVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= jVar3.f(j) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                rVar2 = rVar;
                i3 |= jVar3.g(rVar2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (jVar3.S(i3 & 1, z)) {
                if (i4 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                strA = null;
                if (aVar != null) {
                    switch (aVar.a) {
                        case "bird_singing":
                            num = 2131231080;
                            break;
                        case "calm_rain":
                            num = 2131231107;
                            break;
                        case "calm_wind":
                            num = 2131231430;
                            break;
                        case "calm_bonfire":
                            num = 2131231132;
                            break;
                        case "wave_effect":
                            num = 2131231421;
                            break;
                        default:
                            num = null;
                            break;
                    }
                } else {
                    num = null;
                }
                if (aVar != null) {
                    resourceText = aVar.d;
                } else {
                    resourceText = null;
                }
                if (resourceText == null) {
                    jVar3.c0(977638242);
                } else {
                    jVar3.c0(1694104703);
                    Resources resources = ((Context) jVar3.k(c3.o0.b)).getResources();
                    kotlin.jvm.internal.m.d(resources, "getResources(...)");
                    strA = com.mchutov.core.compose.widgets.lce.a.a(resourceText, resources);
                }
                jVar3.r(false);
                if (strA == null) {
                    strA = oi.k.o(jVar3, 1694105662, 2131887060, jVar3, false);
                } else {
                    jVar3.c0(1694103771);
                    jVar3.r(false);
                }
                v1.c cVarD = v1.d.d(1761766402, new az.j(aVar, num, strA, 6), jVar3);
                int i5 = i3 >> 3;
                jVar2 = jVar3;
                w50.c.f(onOpenBackgroundSoundPicker, aVar2, rVar4, false, false, 38, null, 0L, j, 32, null, 0, cVarD, jVar2, (i5 & 112) | (i5 & 14) | 805502976 | ((i3 >> 6) & 896) | ((i3 << 15) & 234881024), 432, 1240);
                rVar3 = rVar4;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar3 = rVar2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p.c(aVar, onOpenBackgroundSoundPicker, aVar2, j, rVar3, (l1.j) obj, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 24576;
        rVar2 = rVar;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (jVar3.S(i3 & 1, z)) {
            if (i4 != 0) {
                rVar4 = b2.o.A;
            } else {
                rVar4 = rVar2;
            }
            strA = null;
            if (aVar != null) {
                switch (aVar.a) {
                    case -1062863507:
                        if (r9.equals("bird_singing")) {
                            num = 2131231080;
                        }
                        break;
                    case -1017500300:
                        if (!r9.equals("calm_rain")) {
                            num = 2131231107;
                        }
                        break;
                    case -1017343512:
                        if (r9.equals("calm_wind")) {
                            num = 2131231430;
                        }
                        break;
                    case 617872791:
                        if (r9.equals("calm_bonfire")) {
                            num = 2131231132;
                        }
                        break;
                    case 1830521239:
                        if (r9.equals("wave_effect")) {
                            num = 2131231421;
                        }
                        break;
                    default:
                        num = null;
                        break;
                }
            } else {
                num = null;
            }
            if (aVar != null) {
                resourceText = aVar.d;
            } else {
                resourceText = null;
            }
            if (resourceText == null) {
                jVar3.c0(977638242);
            } else {
                jVar3.c0(1694104703);
                Resources resources2 = ((Context) jVar3.k(c3.o0.b)).getResources();
                kotlin.jvm.internal.m.d(resources2, "getResources(...)");
                strA = com.mchutov.core.compose.widgets.lce.a.a(resourceText, resources2);
            }
            jVar3.r(false);
            if (strA == null) {
                strA = oi.k.o(jVar3, 1694105662, 2131887060, jVar3, false);
            } else {
                jVar3.c0(1694103771);
                jVar3.r(false);
            }
            v1.c cVarD2 = v1.d.d(1761766402, new az.j(aVar, num, strA, 6), jVar3);
            int i6 = i3 >> 3;
            jVar2 = jVar3;
            w50.c.f(onOpenBackgroundSoundPicker, aVar2, rVar4, false, false, 38, null, 0L, j, 32, null, 0, cVarD2, jVar2, (i6 & 112) | (i6 & 14) | 805502976 | ((i3 >> 6) & 896) | ((i3 << 15) & 234881024), 432, 1240);
            rVar3 = rVar4;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar3 = rVar2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p.c(aVar, onOpenBackgroundSoundPicker, aVar2, j, rVar3, (l1.j) obj, l1.q.K(i | 1), i2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d(u00.a aVar, l1.j jVar, int i) {
        l1.j jVar2;
        Object pVar;
        ExoPlayer exoPlayer;
        u00.a aVar2 = aVar;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-1165918111);
        int i2 = (jVar3.i(aVar2) ? 4 : 2) | i;
        if (jVar3.S(i2 & 1, (i2 & 3) != 2)) {
            androidx.lifecycle.f1 f1VarA = u6.a.a(jVar3);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            c00.x xVar = (c00.x) c7.i.S(kotlin.jvm.internal.a0.a.b(c00.x.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(jVar3), (u00.a) null);
            l1.z0 z0VarQ = k00.f.q(xVar.c.d, jVar3, 0);
            Context context = (Context) jVar3.k(c3.o0.b);
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) jVar3.k(r6.d.a);
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            Object obj = objN;
            if (objN == cVar) {
                kotlin.jvm.internal.m.e(context, "context");
                i7.z zVarA = new i7.l(context).a();
                zVarA.setAudioAttributes(new androidx.media3.common.d(4, 0, 1, 1, 0, false, true), false);
                zVarA.setRepeatMode(1);
                jVar3.n0(zVarA);
                obj = zVarA;
            }
            ExoPlayer exoPlayer2 = (ExoPlayer) obj;
            boolean zI = jVar3.i(exoPlayer2) | jVar3.i(wVar);
            Object objN2 = jVar3.N();
            if (zI || objN2 == cVar) {
                objN2 = new h(wVar, exoPlayer2, 0);
                jVar3.n0(objN2);
            }
            l1.q.c(wVar, exoPlayer2, (u00.k) objN2, jVar3);
            boolean zG = jVar3.g(xVar);
            Object objN3 = jVar3.N();
            if (zG || objN3 == cVar) {
                objN3 = new a1.e1(xVar, 24);
                jVar3.n0(objN3);
            }
            l1.q.e(xVar, (u00.k) objN3, jVar3);
            boolean zG2 = jVar3.g(xVar) | jVar3.i(exoPlayer2) | ((i2 & 14) == 4);
            Object objN4 = jVar3.N();
            if (zG2 || objN4 == cVar) {
                exoPlayer = exoPlayer2;
                pVar = new ev.p(xVar, exoPlayer, aVar2, null, 3);
                jVar3.n0(pVar);
            } else {
                pVar = objN4;
                exoPlayer = exoPlayer2;
            }
            l1.q.h(xVar, exoPlayer, (u00.n) pVar, jVar3);
            boolean zG3 = jVar3.g(xVar);
            Object objN5 = jVar3.N();
            if (zG3 || objN5 == cVar) {
                objN5 = new i(xVar, 0);
                jVar3.n0(objN5);
            }
            jVar2 = jVar3;
            qd.s0.G((u00.a) objN5, new c4.v(3, false), v1.d.d(-392137736, new al.i(xVar, z0VarQ, 19), jVar3), jVar2, 432, 0);
        } else {
            aVar2 = aVar2;
            jVar2 = jVar3;
            jVar2.V();
        }
        l1.r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.d(aVar2, i, 9);
        }
    }

    public static final void e(u00.a onDismiss, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1196723972);
        int i2 = (g0Var.i(onDismiss) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = new l();
                g0Var.n0(objN);
            }
            l lVar = (l) objN;
            boolean zI = g0Var.i(lVar);
            Object objN2 = g0Var.N();
            if (zI || objN2 == obj) {
                objN2 = new a1.e1(lVar, 23);
                g0Var.n0(objN2);
            }
            l1.q.e(g00.b0.a, (u00.k) objN2, g0Var);
            l1.q.a(u6.a.a.a(lVar), v1.d.d(1373774404, new eu.d(7, onDismiss), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.d(onDismiss, i, 8);
        }
    }

    public static final void f(zz.a aVar, boolean z, b2.r rVar, boolean z2, l1.j jVar, int i) {
        l1.g0 g0Var;
        long jB;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(2074542659);
        int i2 = i | (g0Var2.g(aVar) ? 4 : 2) | (g0Var2.h(z) ? 32 : 16) | (g0Var2.g(rVar) ? 256 : 128) | (g0Var2.h(z2) ? 2048 : 1024);
        if (g0Var2.S(i2 & 1, (i2 & 1171) != 1170)) {
            e60.a aVarA = q50.c.a(g0Var2);
            boolean zG = g0Var2.g((Object) null) | g0Var2.g(aVarA);
            Object objN = g0Var2.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, b00.c.class, aVarA, (b60.a) null, g0Var2);
            }
            b00.c cVar2 = (b00.c) objN;
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) g0Var2.k(r6.d.a);
            p2 p2VarB = x.d.b((!z || z2) ? 0.0f : 32.0f, (x.y) null, "lyricsBackgroundBlur", g0Var2, 3072, 22);
            if (z2) {
                jB = i2.t.b(0.4f, dl.a.L);
            } else {
                jB = z ? i2.t.b(0.3f, dl.a.L) : i2.t.b(0.3f, dl.a.L);
            }
            p2 p2VarA = b2.a(jB, (x.y) null, "backgroundScrim", g0Var2, 384, 10);
            boolean zI = ((i2 & 14) == 4) | g0Var2.i(cVar2);
            Object objN2 = g0Var2.N();
            if (zI || objN2 == cVar) {
                objN2 = new a1.c0(cVar2, aVar, (k00.c) null, 19);
                g0Var2.n0(objN2);
            }
            l1.q.i(aVar, g0Var2, (u00.n) objN2);
            boolean zI2 = g0Var2.i(cVar2) | g0Var2.i(wVar);
            Object objN3 = g0Var2.N();
            if (zI2 || objN3 == cVar) {
                objN3 = new al.l(wVar, cVar2, 19);
                g0Var2.n0(objN3);
            }
            l1.q.e(wVar, (u00.k) objN3, g0Var2);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVar, g0Var2);
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
            h0.a0 a0Var = h0.z1.c;
            boolean zI3 = g0Var2.i(cVar2);
            Object objN4 = g0Var2.N();
            if (zI3 || objN4 == cVar) {
                objN4 = new a1.e1(cVar2, 25);
                g0Var2.n0(objN4);
            }
            u00.k kVar = (u00.k) objN4;
            Object objN5 = g0Var2.N();
            if (objN5 == cVar) {
                objN5 = new j7(5);
                g0Var2.n0(objN5);
            }
            u00.k kVar2 = (u00.k) objN5;
            boolean zI4 = g0Var2.i(cVar2) | g0Var2.g(p2VarB);
            Object objN6 = g0Var2.N();
            if (zI4 || objN6 == cVar) {
                objN6 = new al.l(cVar2, p2VarB, 20);
                g0Var2.n0(objN6);
            }
            b4.l.b(kVar, a0Var, kVar2, (u00.k) objN6, g0Var2, 3120);
            g0Var = g0Var2;
            if (aVar != null) {
                g0Var.c0(-1368320325);
                h0.o.a(z.n.f(a0Var, ((i2.t) p2VarA.getValue()).a, i2.b0.b), g0Var, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(-1368168487);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n(aVar, z, rVar, z2, i);
        }
    }

    public static final void g(bv.o1 o1Var, u00.k kVar, kk.c cVar, d00.x0 x0Var, long j, b2.r rVar, b2.r rVar2, l1.j jVar, int i) {
        l1.g0 g0Var;
        b2.r rVar3;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-588295351);
        int i2 = i | (g0Var2.g(o1Var) ? 4 : 2) | (g0Var2.i(kVar) ? 32 : 16) | (g0Var2.g(cVar) ? 256 : 128) | (g0Var2.g(x0Var) ? 2048 : 1024) | (g0Var2.f(j) ? 16384 : 8192) | 196608;
        if (g0Var2.S(i2 & 1, (599187 & i2) != 599186)) {
            b2.g gVar = b2.b.N;
            h0.v vVarA = h0.u.a(h0.i.g(16), gVar, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVar4 = b2.o.A;
            b2.r rVarC = b2.a.c(rVar4, g0Var2);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
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
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var2, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var2, fVar4);
            h0.v vVarA2 = h0.u.a(h0.i.c, gVar, g0Var2, 48);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVar4, g0Var2);
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar2);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA2, g0Var2, fVar);
            l1.q.I(m1VarM2, g0Var2, fVar2);
            a1.b.v(iHashCode2, g0Var2, fVar3, g0Var2, eVar);
            l1.q.I(rVarC2, g0Var2, fVar4);
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            int i5 = i2 & 896;
            iv.k.a(o1Var, kVar, cVar, j, null, iv.k.b, false, g0Var2, i3 | 196608 | i4 | i5 | ((i2 >> 3) & 7168), 80);
            int i6 = 100687872 | i3 | i4 | i5 | (i2 & 7168) | 1572864;
            rVar3 = rVar4;
            s(o1Var, kVar, cVar, x0Var, h0.z1.q(rVar4, av.j.b), null, rVar2, false, true, false, g0Var2, i6, 672);
            g0Var2.r(true);
            v.a(o1Var, kVar, cVar, h0.z1.d(rVar3, 1.0f), false, false, g0Var2, i3 | 3072 | i4 | i5, 48);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar3 = rVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.z1(o1Var, kVar, cVar, x0Var, j, rVar3, rVar2, i);
        }
    }

    public static final void h(bv.o1 o1Var, u00.k onAction, b2.r rVar, l1.j jVar, int i) {
        l1.g0 g0Var;
        b2.r rVar2;
        float f;
        Object obj;
        long jB;
        boolean z;
        Object objN;
        u00.k kVar;
        long j;
        float f2;
        long j2;
        boolean z2;
        long jB2;
        boolean z3;
        Object objN2;
        bv.o1 uiState = o1Var;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(2127150610);
        int i2 = i | (g0Var2.g(uiState) ? 4 : 2) | (g0Var2.i(onAction) ? 32 : 16) | 384;
        if (g0Var2.S(i2 & 1, (i2 & 147) != 146)) {
            if (uiState.D) {
                f = uiState.C ? 1.0f : 0.7f;
            } else {
                f = 0.2f;
            }
            p2 p2VarB = x.d.b(f, (x.y) null, (String) null, g0Var2, 0, 30);
            b2.r rVar3 = b2.o.A;
            b2.r rVarD = h0.z1.d(rVar3, 1.0f);
            h0.v1 v1VarA = h0.t1.a(h0.i.g, b2.b.K, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(v1VarA, g0Var2, b3.h.f);
            l1.q.I(m1VarM, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC, g0Var2, b3.h.d);
            float f3 = 28;
            b2.r rVarM = h0.z1.m(rVar3, f3);
            int i3 = i2 & 112;
            boolean z4 = i3 == 32;
            Object objN3 = g0Var2.N();
            Object obj2 = l1.i.a;
            if (z4 || objN3 == obj2) {
                objN3 = new fy.r(9, onAction);
                g0Var2.n0(objN3);
            }
            o3.a(y3.R(2131231418, g0Var2, 0), (String) null, w50.c.o(rVarM, false, null, (u00.a) objN3, 7), uiState.w ? dl.a.i : i2.t.b(0.7f, dl.a.i), g0Var2, 56, 0);
            m2.b bVarR = y3.R(2131231190, g0Var2, 0);
            boolean z5 = uiState.C;
            long j3 = dl.a.i;
            long jB3 = i2.t.b(((Number) p2VarB.getValue()).floatValue(), j3);
            boolean z6 = uiState.D;
            boolean z7 = ((i2 & 14) == 4) | (i3 == 32);
            Object objN4 = g0Var2.N();
            if (z7) {
                obj = obj2;
            } else {
                obj = obj2;
                if (objN4 == obj) {
                }
                Object obj3 = obj;
                jB = j3;
                i(bVarR, jB3, z5, (u00.a) objN4, null, z6, 0.0f, 0.0f, 0L, g0Var2, 8, 464);
                b2.r rVarM2 = h0.z1.m(rVar3, f3);
                if (i3 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objN = g0Var2.N();
                if (!z || objN == obj3) {
                    kVar = onAction;
                    objN = new fy.r(10, kVar);
                    g0Var2.n0(objN);
                } else {
                    kVar = onAction;
                }
                b2.r rVarO = w50.c.o(rVarM2, false, null, (u00.a) objN, 7);
                m2.b bVarR2 = y3.R(2131231091, g0Var2, 0);
                uiState = o1Var;
                if (uiState.k) {
                    jB = dl.a.k;
                    j = jB;
                } else {
                    if (uiState.l) {
                        j = jB;
                    } else {
                        j = jB;
                        f2 = 0.7f;
                        jB = i2.t.b(0.7f, j);
                    }
                    j2 = j;
                    o3.a(bVarR2, (String) null, rVarO, jB, g0Var2, 56, 0);
                    m2.b bVarR3 = y3.R(2131231206, g0Var2, 0);
                    z2 = uiState.v;
                    if (z2) {
                        jB2 = j2;
                    } else {
                        jB2 = i2.t.b(f2, j2);
                    }
                    z3 = i3 == 32;
                    objN2 = g0Var2.N();
                    if (z3 || objN2 == obj3) {
                        objN2 = new fy.r(11, kVar);
                        g0Var2.n0(objN2);
                    }
                    i(bVarR3, jB2, z2, (u00.a) objN2, null, false, 0.0f, 0.0f, 0L, g0Var2, 8, 496);
                    g0Var = g0Var2;
                    g0Var.r(true);
                    rVar2 = rVar3;
                }
                f2 = 0.7f;
                j2 = j;
                o3.a(bVarR2, (String) null, rVarO, jB, g0Var2, 56, 0);
                m2.b bVarR4 = y3.R(2131231206, g0Var2, 0);
                z2 = uiState.v;
                if (z2) {
                    jB2 = j2;
                } else {
                    jB2 = i2.t.b(f2, j2);
                }
                if (i3 == 32) {
                }
                objN2 = g0Var2.N();
                if (z3) {
                    objN2 = new fy.r(11, kVar);
                    g0Var2.n0(objN2);
                } else {
                    objN2 = new fy.r(11, kVar);
                    g0Var2.n0(objN2);
                }
                i(bVarR4, jB2, z2, (u00.a) objN2, null, false, 0.0f, 0.0f, 0L, g0Var2, 8, 496);
                g0Var = g0Var2;
                g0Var.r(true);
                rVar2 = rVar3;
            }
            objN4 = new q(uiState, onAction, 1);
            g0Var2.n0(objN4);
            Object obj4 = obj;
            jB = j3;
            i(bVarR, jB3, z5, (u00.a) objN4, null, z6, 0.0f, 0.0f, 0L, g0Var2, 8, 464);
            b2.r rVarM3 = h0.z1.m(rVar3, f3);
            if (i3 == 32) {
                z = true;
            } else {
                z = false;
            }
            objN = g0Var2.N();
            if (z) {
                kVar = onAction;
                objN = new fy.r(10, kVar);
                g0Var2.n0(objN);
            } else {
                kVar = onAction;
                objN = new fy.r(10, kVar);
                g0Var2.n0(objN);
            }
            b2.r rVarO2 = w50.c.o(rVarM3, false, null, (u00.a) objN, 7);
            m2.b bVarR5 = y3.R(2131231091, g0Var2, 0);
            uiState = o1Var;
            if (uiState.k) {
                jB = dl.a.k;
                j = jB;
            } else {
                if (uiState.l) {
                    j = jB;
                } else {
                    j = jB;
                    f2 = 0.7f;
                    jB = i2.t.b(0.7f, j);
                }
                j2 = j;
                o3.a(bVarR5, (String) null, rVarO2, jB, g0Var2, 56, 0);
                m2.b bVarR6 = y3.R(2131231206, g0Var2, 0);
                z2 = uiState.v;
                if (z2) {
                    jB2 = j2;
                } else {
                    jB2 = i2.t.b(f2, j2);
                }
                if (i3 == 32) {
                }
                objN2 = g0Var2.N();
                if (z3) {
                    objN2 = new fy.r(11, kVar);
                    g0Var2.n0(objN2);
                } else {
                    objN2 = new fy.r(11, kVar);
                    g0Var2.n0(objN2);
                }
                i(bVarR6, jB2, z2, (u00.a) objN2, null, false, 0.0f, 0.0f, 0L, g0Var2, 8, 496);
                g0Var = g0Var2;
                g0Var.r(true);
                rVar2 = rVar3;
            }
            f2 = 0.7f;
            j2 = j;
            o3.a(bVarR5, (String) null, rVarO2, jB, g0Var2, 56, 0);
            m2.b bVarR7 = y3.R(2131231206, g0Var2, 0);
            z2 = uiState.v;
            if (z2) {
                jB2 = j2;
            } else {
                jB2 = i2.t.b(f2, j2);
            }
            if (i3 == 32) {
            }
            objN2 = g0Var2.N();
            if (z3) {
                objN2 = new fy.r(11, kVar);
                g0Var2.n0(objN2);
            } else {
                objN2 = new fy.r(11, kVar);
                g0Var2.n0(objN2);
            }
            i(bVarR7, jB2, z2, (u00.a) objN2, null, false, 0.0f, 0.0f, 0L, g0Var2, 8, 496);
            g0Var = g0Var2;
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new t(uiState, onAction, rVar2, i, 0);
        }
    }

    public static final void i(final m2.b painter, final long j, final boolean z, final u00.a onClick, b2.r rVar, boolean z2, float f, float f2, long j2, l1.j jVar, final int i, final int i2) {
        int i3;
        b2.r rVar2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        int i11;
        boolean z4;
        final float f4;
        final long j3;
        final boolean z5;
        final float f5;
        final b2.r rVar3;
        l1.r1 r1VarT;
        int i12;
        b2.r rVar4;
        float f6;
        float f7;
        b2.r rVar5;
        long j4;
        int i13;
        Object objN;
        long j5;
        b3.g gVar;
        long j6;
        b2.r rVar6;
        boolean z6;
        kotlin.jvm.internal.m.e(painter, "painter");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(399200388);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? g0Var.g(painter) : g0Var.i(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= g0Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= g0Var.i(onClick) ? 2048 : 1024;
        }
        int i14 = i2 & 16;
        if (i14 == 0) {
            if ((i & 24576) == 0) {
                rVar2 = rVar;
                i3 |= g0Var.g(rVar2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z3 = z2;
                    if (g0Var.h(z3)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((1572864 & i) == 0) {
                        f3 = f;
                        if (g0Var.d(f3)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (g0Var.d(f2)) {
                            i9 = 8388608;
                        } else {
                            i9 = 4194304;
                        }
                        i3 |= i9;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= 33554432;
                    }
                    i11 = i3;
                    if ((i3 & 38347923) != 38347922) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (g0Var.S(i11 & 1, z4)) {
                        g0Var.X();
                        i12 = i & 1;
                        rVar4 = b2.o.A;
                        if (i12 != 0 || g0Var.A()) {
                            if (i14 != 0) {
                                rVar2 = rVar4;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i6 != 0) {
                                f3 = 28;
                            }
                            if (i8 != 0) {
                                f6 = 36;
                            } else {
                                f6 = f2;
                            }
                            f7 = f6;
                            f5 = f3;
                            rVar5 = rVar2;
                            j4 = dl.a.i;
                            i13 = i11 & (-234881025);
                        } else {
                            g0Var.V();
                            f7 = f2;
                            i13 = i11 & (-234881025);
                            f5 = f3;
                            rVar5 = rVar2;
                            j4 = j2;
                        }
                        boolean z7 = z3;
                        g0Var.s();
                        b2.r rVarM = h0.z1.m(rVar5, f7);
                        objN = g0Var.N();
                        float f8 = f7;
                        if (objN == l1.i.a) {
                            objN = new j7(6);
                            g0Var.n0(objN);
                        }
                        b2.r rVarO = w50.c.o(i2.b0.p(rVarM, (u00.k) objN), z7, null, onClick, 6);
                        z2.w0 w0VarD = h0.o.d(b2.b.E, false);
                        int iHashCode = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM = g0Var.m();
                        b2.r rVarC = b2.a.c(rVarO, g0Var);
                        b3.i.c.getClass();
                        j5 = j4;
                        gVar = b3.h.b;
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
                        l1.q.I(rVarC, g0Var, b3.h.d);
                        if (z) {
                            g0Var.c0(1455026851);
                            rVar6 = rVar4;
                            z6 = true;
                            o3.a(painter, (String) null, f2.h.b(h0.z1.m(rVar4, f5), 12, (i2.o0) null), j5, g0Var, 56 | (i13 & 14), 0);
                            j6 = j5;
                            g0Var.r(false);
                        } else {
                            j6 = j5;
                            rVar6 = rVar4;
                            z6 = true;
                            g0Var.c0(1455323800);
                            g0Var.r(false);
                        }
                        o3.a(painter, (String) null, h0.z1.m(rVar6, f5), j, g0Var, 56 | (i13 & 14) | ((i13 << 6) & 7168), 0);
                        g0Var.r(z6);
                        rVar3 = rVar5;
                        z5 = z7;
                        f4 = f8;
                        j3 = j6;
                    } else {
                        g0Var.V();
                        f4 = f2;
                        j3 = j2;
                        z5 = z3;
                        f5 = f3;
                        rVar3 = rVar2;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iK = l1.q.K(i | 1);
                                p.i(painter, j, z, onClick, rVar3, z5, f5, f4, j3, (l1.j) obj, iK, i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                f3 = f;
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (g0Var.d(f2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) == 0) {
                    i3 |= 33554432;
                }
                i11 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    g0Var.X();
                    i12 = i & 1;
                    rVar4 = b2.o.A;
                    if (i12 != 0) {
                        if (i14 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            f3 = 28;
                        }
                        if (i8 != 0) {
                            f6 = 36;
                        } else {
                            f6 = f2;
                        }
                        f7 = f6;
                        f5 = f3;
                        rVar5 = rVar2;
                        j4 = dl.a.i;
                        i13 = i11 & (-234881025);
                    } else {
                        if (i14 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            f3 = 28;
                        }
                        if (i8 != 0) {
                            f6 = 36;
                        } else {
                            f6 = f2;
                        }
                        f7 = f6;
                        f5 = f3;
                        rVar5 = rVar2;
                        j4 = dl.a.i;
                        i13 = i11 & (-234881025);
                    }
                    boolean z8 = z3;
                    g0Var.s();
                    b2.r rVarM2 = h0.z1.m(rVar5, f7);
                    objN = g0Var.N();
                    float f9 = f7;
                    if (objN == l1.i.a) {
                        objN = new j7(6);
                        g0Var.n0(objN);
                    }
                    b2.r rVarO2 = w50.c.o(i2.b0.p(rVarM2, (u00.k) objN), z8, null, onClick, 6);
                    z2.w0 w0VarD2 = h0.o.d(b2.b.E, false);
                    int iHashCode2 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM2 = g0Var.m();
                    b2.r rVarC2 = b2.a.c(rVarO2, g0Var);
                    b3.i.c.getClass();
                    j5 = j4;
                    gVar = b3.h.b;
                    g0Var.g0();
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
                    if (z) {
                        g0Var.c0(1455026851);
                        rVar6 = rVar4;
                        z6 = true;
                        o3.a(painter, (String) null, f2.h.b(h0.z1.m(rVar4, f5), 12, (i2.o0) null), j5, g0Var, 56 | (i13 & 14), 0);
                        j6 = j5;
                        g0Var.r(false);
                    } else {
                        j6 = j5;
                        rVar6 = rVar4;
                        z6 = true;
                        g0Var.c0(1455323800);
                        g0Var.r(false);
                    }
                    o3.a(painter, (String) null, h0.z1.m(rVar6, f5), j, g0Var, 56 | (i13 & 14) | ((i13 << 6) & 7168), 0);
                    g0Var.r(z6);
                    rVar3 = rVar5;
                    z5 = z8;
                    f4 = f9;
                    j3 = j6;
                } else {
                    g0Var.V();
                    f4 = f2;
                    j3 = j2;
                    z5 = z3;
                    f5 = f3;
                    rVar3 = rVar2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iK = l1.q.K(i | 1);
                            p.i(painter, j, z, onClick, rVar3, z5, f5, f4, j3, (l1.j) obj, iK, i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            z3 = z2;
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    f3 = f;
                    if (g0Var.d(f3)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (g0Var.d(f2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) == 0) {
                    i3 |= 33554432;
                }
                i11 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    g0Var.X();
                    i12 = i & 1;
                    rVar4 = b2.o.A;
                    if (i12 != 0) {
                        if (i14 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            f3 = 28;
                        }
                        if (i8 != 0) {
                            f6 = 36;
                        } else {
                            f6 = f2;
                        }
                        f7 = f6;
                        f5 = f3;
                        rVar5 = rVar2;
                        j4 = dl.a.i;
                        i13 = i11 & (-234881025);
                    } else {
                        if (i14 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            f3 = 28;
                        }
                        if (i8 != 0) {
                            f6 = 36;
                        } else {
                            f6 = f2;
                        }
                        f7 = f6;
                        f5 = f3;
                        rVar5 = rVar2;
                        j4 = dl.a.i;
                        i13 = i11 & (-234881025);
                    }
                    boolean z9 = z3;
                    g0Var.s();
                    b2.r rVarM3 = h0.z1.m(rVar5, f7);
                    objN = g0Var.N();
                    float f11 = f7;
                    if (objN == l1.i.a) {
                        objN = new j7(6);
                        g0Var.n0(objN);
                    }
                    b2.r rVarO3 = w50.c.o(i2.b0.p(rVarM3, (u00.k) objN), z9, null, onClick, 6);
                    z2.w0 w0VarD3 = h0.o.d(b2.b.E, false);
                    int iHashCode3 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM3 = g0Var.m();
                    b2.r rVarC3 = b2.a.c(rVarO3, g0Var);
                    b3.i.c.getClass();
                    j5 = j4;
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD3, g0Var, b3.h.f);
                    l1.q.I(m1VarM3, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC3, g0Var, b3.h.d);
                    if (z) {
                        g0Var.c0(1455026851);
                        rVar6 = rVar4;
                        z6 = true;
                        o3.a(painter, (String) null, f2.h.b(h0.z1.m(rVar4, f5), 12, (i2.o0) null), j5, g0Var, 56 | (i13 & 14), 0);
                        j6 = j5;
                        g0Var.r(false);
                    } else {
                        j6 = j5;
                        rVar6 = rVar4;
                        z6 = true;
                        g0Var.c0(1455323800);
                        g0Var.r(false);
                    }
                    o3.a(painter, (String) null, h0.z1.m(rVar6, f5), j, g0Var, 56 | (i13 & 14) | ((i13 << 6) & 7168), 0);
                    g0Var.r(z6);
                    rVar3 = rVar5;
                    z5 = z9;
                    f4 = f11;
                    j3 = j6;
                } else {
                    g0Var.V();
                    f4 = f2;
                    j3 = j2;
                    z5 = z3;
                    f5 = f3;
                    rVar3 = rVar2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iK = l1.q.K(i | 1);
                            p.i(painter, j, z, onClick, rVar3, z5, f5, f4, j3, (l1.j) obj, iK, i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            f3 = f;
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (g0Var.d(f2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i & 100663296) == 0) {
                i3 |= 33554432;
            }
            i11 = i3;
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (g0Var.S(i11 & 1, z4)) {
                g0Var.X();
                i12 = i & 1;
                rVar4 = b2.o.A;
                if (i12 != 0) {
                    if (i14 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        f3 = 28;
                    }
                    if (i8 != 0) {
                        f6 = 36;
                    } else {
                        f6 = f2;
                    }
                    f7 = f6;
                    f5 = f3;
                    rVar5 = rVar2;
                    j4 = dl.a.i;
                    i13 = i11 & (-234881025);
                } else {
                    if (i14 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        f3 = 28;
                    }
                    if (i8 != 0) {
                        f6 = 36;
                    } else {
                        f6 = f2;
                    }
                    f7 = f6;
                    f5 = f3;
                    rVar5 = rVar2;
                    j4 = dl.a.i;
                    i13 = i11 & (-234881025);
                }
                boolean z11 = z3;
                g0Var.s();
                b2.r rVarM4 = h0.z1.m(rVar5, f7);
                objN = g0Var.N();
                float f12 = f7;
                if (objN == l1.i.a) {
                    objN = new j7(6);
                    g0Var.n0(objN);
                }
                b2.r rVarO4 = w50.c.o(i2.b0.p(rVarM4, (u00.k) objN), z11, null, onClick, 6);
                z2.w0 w0VarD4 = h0.o.d(b2.b.E, false);
                int iHashCode4 = Long.hashCode(g0Var.T);
                l1.m1 m1VarM4 = g0Var.m();
                b2.r rVarC4 = b2.a.c(rVarO4, g0Var);
                b3.i.c.getClass();
                j5 = j4;
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD4, g0Var, b3.h.f);
                l1.q.I(m1VarM4, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode4), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC4, g0Var, b3.h.d);
                if (z) {
                    g0Var.c0(1455026851);
                    rVar6 = rVar4;
                    z6 = true;
                    o3.a(painter, (String) null, f2.h.b(h0.z1.m(rVar4, f5), 12, (i2.o0) null), j5, g0Var, 56 | (i13 & 14), 0);
                    j6 = j5;
                    g0Var.r(false);
                } else {
                    j6 = j5;
                    rVar6 = rVar4;
                    z6 = true;
                    g0Var.c0(1455323800);
                    g0Var.r(false);
                }
                o3.a(painter, (String) null, h0.z1.m(rVar6, f5), j, g0Var, 56 | (i13 & 14) | ((i13 << 6) & 7168), 0);
                g0Var.r(z6);
                rVar3 = rVar5;
                z5 = z11;
                f4 = f12;
                j3 = j6;
            } else {
                g0Var.V();
                f4 = f2;
                j3 = j2;
                z5 = z3;
                f5 = f3;
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i | 1);
                        p.i(painter, j, z, onClick, rVar3, z5, f5, f4, j3, (l1.j) obj, iK, i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 24576;
        rVar2 = rVar;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z3 = z2;
                if (g0Var.h(z3)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    f3 = f;
                    if (g0Var.d(f3)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (g0Var.d(f2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i & 100663296) == 0) {
                    i3 |= 33554432;
                }
                i11 = i3;
                if ((i3 & 38347923) != 38347922) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    g0Var.X();
                    i12 = i & 1;
                    rVar4 = b2.o.A;
                    if (i12 != 0) {
                        if (i14 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            f3 = 28;
                        }
                        if (i8 != 0) {
                            f6 = 36;
                        } else {
                            f6 = f2;
                        }
                        f7 = f6;
                        f5 = f3;
                        rVar5 = rVar2;
                        j4 = dl.a.i;
                        i13 = i11 & (-234881025);
                    } else {
                        if (i14 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i4 != 0) {
                            z3 = true;
                        }
                        if (i6 != 0) {
                            f3 = 28;
                        }
                        if (i8 != 0) {
                            f6 = 36;
                        } else {
                            f6 = f2;
                        }
                        f7 = f6;
                        f5 = f3;
                        rVar5 = rVar2;
                        j4 = dl.a.i;
                        i13 = i11 & (-234881025);
                    }
                    boolean z12 = z3;
                    g0Var.s();
                    b2.r rVarM5 = h0.z1.m(rVar5, f7);
                    objN = g0Var.N();
                    float f13 = f7;
                    if (objN == l1.i.a) {
                        objN = new j7(6);
                        g0Var.n0(objN);
                    }
                    b2.r rVarO5 = w50.c.o(i2.b0.p(rVarM5, (u00.k) objN), z12, null, onClick, 6);
                    z2.w0 w0VarD5 = h0.o.d(b2.b.E, false);
                    int iHashCode5 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM5 = g0Var.m();
                    b2.r rVarC5 = b2.a.c(rVarO5, g0Var);
                    b3.i.c.getClass();
                    j5 = j4;
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(w0VarD5, g0Var, b3.h.f);
                    l1.q.I(m1VarM5, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode5), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC5, g0Var, b3.h.d);
                    if (z) {
                        g0Var.c0(1455026851);
                        rVar6 = rVar4;
                        z6 = true;
                        o3.a(painter, (String) null, f2.h.b(h0.z1.m(rVar4, f5), 12, (i2.o0) null), j5, g0Var, 56 | (i13 & 14), 0);
                        j6 = j5;
                        g0Var.r(false);
                    } else {
                        j6 = j5;
                        rVar6 = rVar4;
                        z6 = true;
                        g0Var.c0(1455323800);
                        g0Var.r(false);
                    }
                    o3.a(painter, (String) null, h0.z1.m(rVar6, f5), j, g0Var, 56 | (i13 & 14) | ((i13 << 6) & 7168), 0);
                    g0Var.r(z6);
                    rVar3 = rVar5;
                    z5 = z12;
                    f4 = f13;
                    j3 = j6;
                } else {
                    g0Var.V();
                    f4 = f2;
                    j3 = j2;
                    z5 = z3;
                    f5 = f3;
                    rVar3 = rVar2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iK = l1.q.K(i | 1);
                            p.i(painter, j, z, onClick, rVar3, z5, f5, f4, j3, (l1.j) obj, iK, i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            f3 = f;
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (g0Var.d(f2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i & 100663296) == 0) {
                i3 |= 33554432;
            }
            i11 = i3;
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (g0Var.S(i11 & 1, z4)) {
                g0Var.X();
                i12 = i & 1;
                rVar4 = b2.o.A;
                if (i12 != 0) {
                    if (i14 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        f3 = 28;
                    }
                    if (i8 != 0) {
                        f6 = 36;
                    } else {
                        f6 = f2;
                    }
                    f7 = f6;
                    f5 = f3;
                    rVar5 = rVar2;
                    j4 = dl.a.i;
                    i13 = i11 & (-234881025);
                } else {
                    if (i14 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        f3 = 28;
                    }
                    if (i8 != 0) {
                        f6 = 36;
                    } else {
                        f6 = f2;
                    }
                    f7 = f6;
                    f5 = f3;
                    rVar5 = rVar2;
                    j4 = dl.a.i;
                    i13 = i11 & (-234881025);
                }
                boolean z13 = z3;
                g0Var.s();
                b2.r rVarM6 = h0.z1.m(rVar5, f7);
                objN = g0Var.N();
                float f14 = f7;
                if (objN == l1.i.a) {
                    objN = new j7(6);
                    g0Var.n0(objN);
                }
                b2.r rVarO6 = w50.c.o(i2.b0.p(rVarM6, (u00.k) objN), z13, null, onClick, 6);
                z2.w0 w0VarD6 = h0.o.d(b2.b.E, false);
                int iHashCode6 = Long.hashCode(g0Var.T);
                l1.m1 m1VarM6 = g0Var.m();
                b2.r rVarC6 = b2.a.c(rVarO6, g0Var);
                b3.i.c.getClass();
                j5 = j4;
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD6, g0Var, b3.h.f);
                l1.q.I(m1VarM6, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode6), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC6, g0Var, b3.h.d);
                if (z) {
                    g0Var.c0(1455026851);
                    rVar6 = rVar4;
                    z6 = true;
                    o3.a(painter, (String) null, f2.h.b(h0.z1.m(rVar4, f5), 12, (i2.o0) null), j5, g0Var, 56 | (i13 & 14), 0);
                    j6 = j5;
                    g0Var.r(false);
                } else {
                    j6 = j5;
                    rVar6 = rVar4;
                    z6 = true;
                    g0Var.c0(1455323800);
                    g0Var.r(false);
                }
                o3.a(painter, (String) null, h0.z1.m(rVar6, f5), j, g0Var, 56 | (i13 & 14) | ((i13 << 6) & 7168), 0);
                g0Var.r(z6);
                rVar3 = rVar5;
                z5 = z13;
                f4 = f14;
                j3 = j6;
            } else {
                g0Var.V();
                f4 = f2;
                j3 = j2;
                z5 = z3;
                f5 = f3;
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i | 1);
                        p.i(painter, j, z, onClick, rVar3, z5, f5, f4, j3, (l1.j) obj, iK, i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 196608;
        z3 = z2;
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                f3 = f;
                if (g0Var.d(f3)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (g0Var.d(f2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i & 100663296) == 0) {
                i3 |= 33554432;
            }
            i11 = i3;
            if ((i3 & 38347923) != 38347922) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (g0Var.S(i11 & 1, z4)) {
                g0Var.X();
                i12 = i & 1;
                rVar4 = b2.o.A;
                if (i12 != 0) {
                    if (i14 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        f3 = 28;
                    }
                    if (i8 != 0) {
                        f6 = 36;
                    } else {
                        f6 = f2;
                    }
                    f7 = f6;
                    f5 = f3;
                    rVar5 = rVar2;
                    j4 = dl.a.i;
                    i13 = i11 & (-234881025);
                } else {
                    if (i14 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i4 != 0) {
                        z3 = true;
                    }
                    if (i6 != 0) {
                        f3 = 28;
                    }
                    if (i8 != 0) {
                        f6 = 36;
                    } else {
                        f6 = f2;
                    }
                    f7 = f6;
                    f5 = f3;
                    rVar5 = rVar2;
                    j4 = dl.a.i;
                    i13 = i11 & (-234881025);
                }
                boolean z14 = z3;
                g0Var.s();
                b2.r rVarM7 = h0.z1.m(rVar5, f7);
                objN = g0Var.N();
                float f15 = f7;
                if (objN == l1.i.a) {
                    objN = new j7(6);
                    g0Var.n0(objN);
                }
                b2.r rVarO7 = w50.c.o(i2.b0.p(rVarM7, (u00.k) objN), z14, null, onClick, 6);
                z2.w0 w0VarD7 = h0.o.d(b2.b.E, false);
                int iHashCode7 = Long.hashCode(g0Var.T);
                l1.m1 m1VarM7 = g0Var.m();
                b2.r rVarC7 = b2.a.c(rVarO7, g0Var);
                b3.i.c.getClass();
                j5 = j4;
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD7, g0Var, b3.h.f);
                l1.q.I(m1VarM7, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode7), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC7, g0Var, b3.h.d);
                if (z) {
                    g0Var.c0(1455026851);
                    rVar6 = rVar4;
                    z6 = true;
                    o3.a(painter, (String) null, f2.h.b(h0.z1.m(rVar4, f5), 12, (i2.o0) null), j5, g0Var, 56 | (i13 & 14), 0);
                    j6 = j5;
                    g0Var.r(false);
                } else {
                    j6 = j5;
                    rVar6 = rVar4;
                    z6 = true;
                    g0Var.c0(1455323800);
                    g0Var.r(false);
                }
                o3.a(painter, (String) null, h0.z1.m(rVar6, f5), j, g0Var, 56 | (i13 & 14) | ((i13 << 6) & 7168), 0);
                g0Var.r(z6);
                rVar3 = rVar5;
                z5 = z14;
                f4 = f15;
                j3 = j6;
            } else {
                g0Var.V();
                f4 = f2;
                j3 = j2;
                z5 = z3;
                f5 = f3;
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iK = l1.q.K(i | 1);
                        p.i(painter, j, z, onClick, rVar3, z5, f5, f4, j3, (l1.j) obj, iK, i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 1572864;
        f3 = f;
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (g0Var.d(f2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        i11 = i3;
        if ((i3 & 38347923) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (g0Var.S(i11 & 1, z4)) {
            g0Var.X();
            i12 = i & 1;
            rVar4 = b2.o.A;
            if (i12 != 0) {
                if (i14 != 0) {
                    rVar2 = rVar4;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    f3 = 28;
                }
                if (i8 != 0) {
                    f6 = 36;
                } else {
                    f6 = f2;
                }
                f7 = f6;
                f5 = f3;
                rVar5 = rVar2;
                j4 = dl.a.i;
                i13 = i11 & (-234881025);
            } else {
                if (i14 != 0) {
                    rVar2 = rVar4;
                }
                if (i4 != 0) {
                    z3 = true;
                }
                if (i6 != 0) {
                    f3 = 28;
                }
                if (i8 != 0) {
                    f6 = 36;
                } else {
                    f6 = f2;
                }
                f7 = f6;
                f5 = f3;
                rVar5 = rVar2;
                j4 = dl.a.i;
                i13 = i11 & (-234881025);
            }
            boolean z15 = z3;
            g0Var.s();
            b2.r rVarM8 = h0.z1.m(rVar5, f7);
            objN = g0Var.N();
            float f16 = f7;
            if (objN == l1.i.a) {
                objN = new j7(6);
                g0Var.n0(objN);
            }
            b2.r rVarO8 = w50.c.o(i2.b0.p(rVarM8, (u00.k) objN), z15, null, onClick, 6);
            z2.w0 w0VarD8 = h0.o.d(b2.b.E, false);
            int iHashCode8 = Long.hashCode(g0Var.T);
            l1.m1 m1VarM8 = g0Var.m();
            b2.r rVarC8 = b2.a.c(rVarO8, g0Var);
            b3.i.c.getClass();
            j5 = j4;
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD8, g0Var, b3.h.f);
            l1.q.I(m1VarM8, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode8), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC8, g0Var, b3.h.d);
            if (z) {
                g0Var.c0(1455026851);
                rVar6 = rVar4;
                z6 = true;
                o3.a(painter, (String) null, f2.h.b(h0.z1.m(rVar4, f5), 12, (i2.o0) null), j5, g0Var, 56 | (i13 & 14), 0);
                j6 = j5;
                g0Var.r(false);
            } else {
                j6 = j5;
                rVar6 = rVar4;
                z6 = true;
                g0Var.c0(1455323800);
                g0Var.r(false);
            }
            o3.a(painter, (String) null, h0.z1.m(rVar6, f5), j, g0Var, 56 | (i13 & 14) | ((i13 << 6) & 7168), 0);
            g0Var.r(z6);
            rVar3 = rVar5;
            z5 = z15;
            f4 = f16;
            j3 = j6;
        } else {
            g0Var.V();
            f4 = f2;
            j3 = j2;
            z5 = z3;
            f5 = f3;
            rVar3 = rVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(i | 1);
                    p.i(painter, j, z, onClick, rVar3, z5, f5, f4, j3, (l1.j) obj, iK, i2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void j(final String text, final long j, final boolean z, final u00.a onClick, b2.r rVar, final long j2, l1.j jVar, final int i) {
        int i2;
        l1.j jVar2;
        final b2.r rVar2;
        kotlin.jvm.internal.m.e(text, "text");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(-2080259346);
        if ((i & 6) == 0) {
            i2 = (jVar3.g(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= jVar3.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= jVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= jVar3.i(onClick) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= jVar3.f(j2) ? 131072 : 65536;
        }
        if (jVar3.S(i3 & 1, (74899 & i3) != 74898)) {
            m3.r0 r0VarA = m3.r0.a(z ? dl.c.j : dl.c.i, 0L, j2, (q3.u) null, (q3.i) null, 0L, (i2.s0) null, 0, j2, (m3.z) null, (x3.i) null, 16646141);
            b2.r rVar3 = b2.o.A;
            jVar2 = jVar3;
            z6.b(text, w50.c.o(rVar3, false, null, onClick, 7), j, 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, r0VarA, jVar2, (i3 & 14) | ((i3 << 3) & 896), 0, 131064);
            rVar2 = rVar3;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
        }
        l1.r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p.j(text, j, z, onClick, rVar2, j2, (l1.j) obj, l1.q.K(i | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void k(bv.o1 uiState, u00.k onAction, l1.j jVar, int i) {
        int i2;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(2111127623);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onAction) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objN = g0Var.N();
            if (z || objN == l1.i.a) {
                objN = new fy.r(13, onAction);
                g0Var.n0(objN);
            }
            u00.a aVar = (u00.a) objN;
            qd.s0.G(aVar, new c4.v(3, false), v1.d.d(-1582165680, new b1.n(uiState, onAction, aVar, 7), g0Var), g0Var, 432, 0);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bv.l1(uiState, onAction, i, 1);
        }
    }

    public static final void l(int i, String str, l1.j jVar, u00.a aVar, boolean z) {
        l1.g0 g0Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(864548954);
        int i2 = i | (g0Var2.g(str) ? 4 : 2) | (g0Var2.h(z) ? 32 : 16) | (g0Var2.i(aVar) ? 256 : 128);
        if (g0Var2.S(i2 & 1, (i2 & 147) != 146)) {
            b2.r rVarO = w50.c.o(z.n.f(f2.h.c(h0.z1.m(b2.o.A, 36), p0.f.a), z ? i2.t.b(0.22f, dl.a.i) : i2.t.b(0.08f, dl.a.i), i2.b0.b), false, null, aVar, 7);
            z2.w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarO, g0Var2);
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
            z6.b(str, (b2.r) null, dl.a.k, kh.o.z(12), z ? q3.u.D : q3.u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var2, (i2 & 14) | 24576, 0, 262058);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d0(str, z, aVar, i, 0);
        }
    }

    public static final void m(final boolean z, final float f, final u00.a onDismissRequest, final u00.k onSpeedSelected, l1.j jVar, final int i) {
        boolean z2;
        int i2;
        float f2;
        kotlin.jvm.internal.m.e(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.e(onSpeedSelected, "onSpeedSelected");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1316328921);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (g0Var.h(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            f2 = f;
            i2 |= g0Var.d(f2) ? 32 : 16;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(onDismissRequest) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.i(onSpeedSelected) ? 2048 : 1024;
        }
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z3 = (i2 & 112) == 32;
            Object objN = g0Var.N();
            if (z3 || objN == l1.i.a) {
                yu.f.B.getClass();
                objN = tf.x.a(f2);
                g0Var.n0(objN);
            }
            jl.c.b(z2, onDismissRequest, dl.a.K, p0.f.a(16), null, (((long) Float.floatToRawIntBits(4)) & 4294967295L) | (((long) Float.floatToRawIntBits(0)) << 32), false, null, v1.d.d(1871079372, new c0.f((yu.f) objN, onSpeedSelected, 5), g0Var), g0Var, (i2 & 14) | 100859904 | ((i2 >> 3) & 112), 208);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    p.m(z, f, onDismissRequest, onSpeedSelected, (l1.j) obj, l1.q.K(i | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void n(boolean z, b2.r rVar, v1.c cVar, l1.j jVar, int i, int i2) {
        int i3;
        b2.r rVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1082132842);
        int i4 = i | (g0Var.h(z) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (g0Var.g(rVar) ? 32 : 16);
        }
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                rVar = b2.o.A;
            }
            b2.r rVar3 = rVar;
            w.c0.c(z, rVar3, w.s0.b(J(), 12).a(w.s0.c(J(), 2)), w.s0.h(J(), 12).a(w.s0.d(J(), 2)), (String) null, v1.d.d(-1279325330, new r(cVar, 1), g0Var), g0Var, (i3 & 14) | 196608 | (i3 & 112), 16);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new f0(z, rVar2, cVar, i, i2);
        }
    }

    public static final void o(d00.x0 hazeState, b2.r rVar, v1.c cVar, l1.j jVar, int i) {
        int i2;
        kotlin.jvm.internal.m.e(hazeState, "hazeState");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1221052354);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(hazeState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(cVar) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            b2.r rVarC = f2.h.c(h0.z1.d(rVar, 1.0f), p0.f.a(32));
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = new j7(7);
                g0Var.n0(objN);
            }
            b2.r rVarF = z.n.f(d00.h0.c(rVarC, hazeState, (u00.k) objN), i2.t.b(0.2f, dl.a.L), i2.b0.b);
            float f = 16;
            float f2 = 20;
            b2.r rVarF2 = h0.c.F(rVarF, f, f, f, f2);
            int i3 = ((i2 << 3) & 7168) | 48;
            h0.v vVarA = h0.u.a(h0.i.g(f2), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarF2, g0Var);
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
            l1.q.I(rVarC2, g0Var, b3.h.d);
            cVar.invoke(h0.w.a, g0Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.f(i, 7, hazeState, rVar, cVar);
        }
    }

    public static final void p(bv.o1 uiState, u00.k onAction, u00.a onClose, boolean z, l1.j jVar, int i, int i2) {
        boolean z2;
        boolean z3;
        l1.j jVar2;
        boolean z4;
        l1.r1 r1VarT;
        boolean z5;
        boolean z6;
        int i3;
        boolean z7;
        Object objN;
        boolean z8;
        Object objN2;
        boolean z9;
        Object objN3;
        boolean z11;
        Object objN4;
        boolean z12;
        Object objN5;
        boolean z13;
        Object objN6;
        boolean z14;
        Object objN7;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        kotlin.jvm.internal.m.e(onClose, "onClose");
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(1015684644);
        int i4 = (jVar3.g(uiState) ? 4 : 2) | i | (jVar3.i(onAction) ? 32 : 16) | (jVar3.i(onClose) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i4 |= jVar3.h(z2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i4 & 1, z3)) {
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                ot.b bVar = uiState.H;
                if (uiState.D || !uiState.C || !bVar.b || uiState.K) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                int i6 = i4;
                String str = uiState.M;
                boolean z15 = z6;
                String str2 = uiState.N;
                rt.g gVar = uiState.O;
                i3 = i6 & 112;
                if (i3 == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objN = jVar3.N();
                Object obj = l1.i.a;
                if (z7 || objN == obj) {
                    objN = new fy.r(14, onAction);
                    jVar3.n0(objN);
                }
                u00.a aVar = (u00.a) objN;
                if (i3 == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                objN2 = jVar3.N();
                if (z8 || objN2 == obj) {
                    objN2 = new fy.r(15, onAction);
                    jVar3.n0(objN2);
                }
                u00.a aVar2 = (u00.a) objN2;
                if (i3 == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objN3 = jVar3.N();
                if (z9 || objN3 == obj) {
                    objN3 = new fy.r(16, onAction);
                    jVar3.n0(objN3);
                }
                u00.a aVar3 = (u00.a) objN3;
                if (i3 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objN4 = jVar3.N();
                if (z11 || objN4 == obj) {
                    objN4 = new fy.r(17, onAction);
                    jVar3.n0(objN4);
                }
                u00.a aVar4 = (u00.a) objN4;
                if (i3 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objN5 = jVar3.N();
                if (z12 || objN5 == obj) {
                    objN5 = new as.d0(21, onAction);
                    jVar3.n0(objN5);
                }
                u00.k kVar = (u00.k) objN5;
                int i7 = uiState.P;
                if (i3 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objN6 = jVar3.N();
                if (z13 || objN6 == obj) {
                    objN6 = new as.d0(22, onAction);
                    jVar3.n0(objN6);
                }
                u00.k kVar2 = (u00.k) objN6;
                boolean z16 = uiState.Q;
                if (i3 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objN7 = jVar3.N();
                if (z14 || objN7 == obj) {
                    objN7 = new as.d0(23, onAction);
                    jVar3.n0(objN7);
                }
                jVar2 = jVar3;
                st.j.b(bVar, z15, str, str2, gVar, onClose, aVar, aVar2, aVar3, aVar4, kVar, i7, kVar2, z16, (u00.k) objN7, z5, jVar2, (i6 << 9) & 458752, (i6 << 6) & 458752);
                z4 = z5;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                z4 = z2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new y(uiState, onAction, onClose, z4, i, i2, 0);
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (jVar3.S(i4 & 1, z3)) {
            if (i5 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            ot.b bVar2 = uiState.H;
            if (uiState.D) {
                z6 = false;
            } else {
                z6 = false;
            }
            int i8 = i4;
            String str3 = uiState.M;
            boolean z17 = z6;
            String str4 = uiState.N;
            rt.g gVar2 = uiState.O;
            i3 = i8 & 112;
            if (i3 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            objN = jVar3.N();
            Object obj2 = l1.i.a;
            if (z7) {
                objN = new fy.r(14, onAction);
                jVar3.n0(objN);
            } else {
                objN = new fy.r(14, onAction);
                jVar3.n0(objN);
            }
            u00.a aVar5 = (u00.a) objN;
            if (i3 == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            objN2 = jVar3.N();
            if (z8) {
                objN2 = new fy.r(15, onAction);
                jVar3.n0(objN2);
            } else {
                objN2 = new fy.r(15, onAction);
                jVar3.n0(objN2);
            }
            u00.a aVar6 = (u00.a) objN2;
            if (i3 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            objN3 = jVar3.N();
            if (z9) {
                objN3 = new fy.r(16, onAction);
                jVar3.n0(objN3);
            } else {
                objN3 = new fy.r(16, onAction);
                jVar3.n0(objN3);
            }
            u00.a aVar7 = (u00.a) objN3;
            if (i3 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            objN4 = jVar3.N();
            if (z11) {
                objN4 = new fy.r(17, onAction);
                jVar3.n0(objN4);
            } else {
                objN4 = new fy.r(17, onAction);
                jVar3.n0(objN4);
            }
            u00.a aVar8 = (u00.a) objN4;
            if (i3 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            objN5 = jVar3.N();
            if (z12) {
                objN5 = new as.d0(21, onAction);
                jVar3.n0(objN5);
            } else {
                objN5 = new as.d0(21, onAction);
                jVar3.n0(objN5);
            }
            u00.k kVar3 = (u00.k) objN5;
            int i9 = uiState.P;
            if (i3 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objN6 = jVar3.N();
            if (z13) {
                objN6 = new as.d0(22, onAction);
                jVar3.n0(objN6);
            } else {
                objN6 = new as.d0(22, onAction);
                jVar3.n0(objN6);
            }
            u00.k kVar4 = (u00.k) objN6;
            boolean z18 = uiState.Q;
            if (i3 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objN7 = jVar3.N();
            if (z14) {
                objN7 = new as.d0(23, onAction);
                jVar3.n0(objN7);
            } else {
                objN7 = new as.d0(23, onAction);
                jVar3.n0(objN7);
            }
            jVar2 = jVar3;
            st.j.b(bVar2, z17, str3, str4, gVar2, onClose, aVar5, aVar6, aVar7, aVar8, kVar3, i9, kVar4, z18, (u00.k) objN7, z5, jVar2, (i8 << 9) & 458752, (i8 << 6) & 458752);
            z4 = z5;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            z4 = z2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new y(uiState, onAction, onClose, z4, i, i2, 0);
        }
    }

    public static final void q(boolean z, u00.a onDismissRequest, u00.a aVar, u00.a onSleepTimerClick, boolean z2, u00.a aVar2, l1.j jVar, int i, int i2) {
        boolean z3;
        int i3;
        u00.a aVar3;
        boolean z4;
        u00.a aVar4;
        int i4;
        boolean z5;
        boolean z6;
        l1.r1 r1VarT;
        boolean z7;
        int i5;
        kotlin.jvm.internal.m.e(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.e(onSleepTimerClick, "onSleepTimerClick");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(705257270);
        if ((i & 6) == 0) {
            z3 = z;
            i3 = (g0Var.h(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.i(onDismissRequest) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            aVar3 = aVar;
            i3 |= g0Var.i(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar;
        }
        if ((i & 3072) == 0) {
            i3 |= g0Var.i(onSleepTimerClick) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                z4 = z2;
                i3 |= g0Var.h(z4) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                aVar4 = aVar2;
                if (g0Var.i(aVar4)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            } else {
                aVar4 = aVar2;
            }
            i4 = i3;
            if ((74899 & i4) != 74898) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (g0Var.S(i4 & 1, z5)) {
                if (i6 != 0) {
                    z7 = true;
                } else {
                    z7 = z4;
                }
                jl.c.b(z3, onDismissRequest, dl.a.K, p0.f.a(16), null, (((long) Float.floatToRawIntBits(0)) << 32) | (((long) Float.floatToRawIntBits(4)) & 4294967295L), false, null, v1.d.d(172746985, new as.o0(aVar3, z7, onSleepTimerClick, aVar4, 3), g0Var), g0Var, (i4 & 14) | 100859904 | (i4 & 112), 208);
                z6 = z7;
            } else {
                g0Var.V();
                z6 = z4;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u(z, onDismissRequest, aVar, onSleepTimerClick, z6, aVar2, i, i2);
            }
        }
        i3 |= 24576;
        z4 = z2;
        if ((196608 & i) == 0) {
            aVar4 = aVar2;
            if (g0Var.i(aVar4)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        } else {
            aVar4 = aVar2;
        }
        i4 = i3;
        if ((74899 & i4) != 74898) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (g0Var.S(i4 & 1, z5)) {
            if (i6 != 0) {
                z7 = true;
            } else {
                z7 = z4;
            }
            jl.c.b(z3, onDismissRequest, dl.a.K, p0.f.a(16), null, (((long) Float.floatToRawIntBits(0)) << 32) | (((long) Float.floatToRawIntBits(4)) & 4294967295L), false, null, v1.d.d(172746985, new as.o0(aVar3, z7, onSleepTimerClick, aVar4, 3), g0Var), g0Var, (i4 & 14) | 100859904 | (i4 & 112), 208);
            z6 = z7;
        } else {
            g0Var.V();
            z6 = z4;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u(z, onDismissRequest, aVar, onSleepTimerClick, z6, aVar2, i, i2);
        }
    }

    public static final void r(final int i, final int i2, final u00.a aVar, boolean z, l1.j jVar, final int i3, final int i4) {
        boolean z2;
        int i5;
        final boolean z3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1213227133);
        int i6 = i3 | (g0Var.e(i) ? 4 : 2) | (g0Var.e(i2) ? 32 : 16) | (g0Var.i(aVar) ? 256 : 128);
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 = i6 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i5 = i6 | (g0Var.h(z2) ? 2048 : 1024);
        }
        if (g0Var.S(i5 & 1, (i5 & 1171) != 1170)) {
            boolean z4 = i7 != 0 ? true : z2;
            b2.o oVar = b2.o.A;
            b2.r rVarD = h0.c.D(w50.c.o(f2.h.a(h0.z1.d(oVar, 1.0f), z4 ? 1.0f : 0.35f), z4, null, aVar, 6), 4, 10);
            h0.v1 v1VarA = h0.t1.a(h0.i.g(12), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
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
            b2.r rVarM = h0.z1.m(oVar, 20);
            m2.b bVarR = y3.R(i, g0Var, i5 & 14);
            long j = dl.a.k;
            o3.a(bVarR, (String) null, rVarM, j, g0Var, 440, 0);
            z6.b(z3.U(g0Var, i2), (b2.r) null, j, kh.o.z(14), q3.u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var, 1597440, 0, 262058);
            g0Var = g0Var;
            g0Var.r(true);
            z3 = z4;
        } else {
            g0Var.V();
            z3 = z2;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(i, i2, aVar, z3, i3, i4) {
                public final int A;
                public final int B;
                public final u00.a C;
                public final boolean D;
                public final int E;

                {
                    this.E = i4;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(1);
                    p.r(this.A, this.B, this.C, this.D, (l1.j) obj, iK, this.E);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void s(final bv.o1 uiState, final u00.k onAction, final jk.a aVar, final d00.x0 x0Var, b2.r rVar, b2.r rVar2, b2.r rVar3, boolean z, boolean z2, boolean z3, l1.j jVar, final int i, final int i2) {
        int i3;
        int i4;
        b2.r rVar4;
        int i5;
        int i6;
        b2.r rVar5;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z4;
        b2.r rVar6;
        final boolean z5;
        final boolean z6;
        final b2.r rVar7;
        final boolean z7;
        l1.r1 r1VarT;
        b2.r rVar8;
        int i17;
        b2.r rVar9;
        boolean z8;
        boolean z9;
        boolean z11;
        h0.w wVar;
        boolean z12;
        b3.g gVar;
        boolean z13;
        boolean z14;
        b3.g gVar2;
        b2.g gVar3 = b2.b.M;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        kotlin.jvm.internal.m.e(onAction, "onAction");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-425084421);
        if ((i & 6) == 0) {
            i3 = (g0Var.g(uiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= g0Var.i(onAction) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= g0Var.i(aVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= g0Var.g(x0Var) ? 2048 : 1024;
        }
        int i18 = i2 & 16;
        if (i18 == 0) {
            if ((i & 24576) == 0) {
                i3 |= g0Var.g(rVar) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    rVar4 = rVar2;
                    if (g0Var.g(rVar4)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    if ((1572864 & i) == 0) {
                        rVar5 = rVar3;
                        if (g0Var.g(rVar5)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                        i11 = i3 | 12582912;
                    } else {
                        i9 = i3;
                        if ((i & 12582912) == 0) {
                            if (g0Var.h(z)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i11 = i9 | i12;
                        } else {
                            i11 = i9;
                        }
                    }
                    i13 = i2 & 256;
                    if (i13 != 0) {
                        if ((i & 100663296) == 0) {
                            if (g0Var.h(z2)) {
                                i14 = 67108864;
                            } else {
                                i14 = 33554432;
                            }
                            i11 |= i14;
                        }
                        i15 = i2 & 512;
                        if (i15 != 0) {
                            if ((i & 805306368) == 0) {
                                if (g0Var.h(z3)) {
                                    i16 = 536870912;
                                } else {
                                    i16 = 268435456;
                                }
                                i11 |= i16;
                            }
                            if ((i11 & 306783379) != 306783378) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (g0Var.S(i11 & 1, z4)) {
                                rVar8 = b2.o.A;
                                if (i18 != 0) {
                                    rVar6 = rVar8;
                                } else {
                                    rVar6 = rVar;
                                }
                                if (i4 != 0) {
                                    rVar4 = rVar8;
                                }
                                if (i6 != 0) {
                                    rVar9 = rVar8;
                                    i17 = i8;
                                } else {
                                    i17 = i8;
                                    rVar9 = rVar5;
                                }
                                if (i17 != 0) {
                                    z8 = true;
                                } else {
                                    z8 = z;
                                }
                                if (i13 != 0) {
                                    z9 = false;
                                } else {
                                    z9 = z2;
                                }
                                if (i15 != 0) {
                                    z11 = false;
                                } else {
                                    z11 = z3;
                                }
                                wVar = h0.w.a;
                                if (z9) {
                                    g0Var.c0(-2125908872);
                                    int i19 = i11 >> 12;
                                    h0.v vVarA = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                    int iHashCode = Long.hashCode(g0Var.T);
                                    l1.m1 m1VarM = g0Var.m();
                                    z12 = z8;
                                    b2.r rVarC = b2.a.c(rVar6, g0Var);
                                    b3.i.c.getClass();
                                    gVar2 = b3.h.b;
                                    g0Var.g0();
                                    if (g0Var.S) {
                                        g0Var.l(gVar2);
                                    } else {
                                        g0Var.q0();
                                    }
                                    l1.q.I(vVarA, g0Var, b3.h.f);
                                    l1.q.I(m1VarM, g0Var, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                                    l1.q.E(g0Var, b3.h.h);
                                    l1.q.I(rVarC, g0Var, b3.h.d);
                                    o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i19 & 112));
                                    final int i21 = 0;
                                    w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                        @Override
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            int i22 = i21;
                                            w.d0 AnimatedVisibility = (w.d0) obj;
                                            l1.g0 g0Var2 = (l1.j) obj2;
                                            ((Integer) obj3).getClass();
                                            switch (i22) {
                                                case 0:
                                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                    break;
                                                default:
                                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    h0.v vVarA2 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                    l1.g0 g0Var3 = g0Var2;
                                                    int iHashCode2 = Long.hashCode(g0Var3.T);
                                                    l1.m1 m1VarM2 = g0Var3.m();
                                                    b2.o oVar = b2.o.A;
                                                    b2.r rVarC2 = b2.a.c(oVar, g0Var2);
                                                    b3.i.c.getClass();
                                                    b3.g gVar4 = b3.h.b;
                                                    g0Var3.g0();
                                                    if (g0Var3.S) {
                                                        g0Var3.l(gVar4);
                                                    } else {
                                                        g0Var3.q0();
                                                    }
                                                    l1.q.I(vVarA2, g0Var2, b3.h.f);
                                                    l1.q.I(m1VarM2, g0Var2, b3.h.e);
                                                    l1.q.I(Integer.valueOf(iHashCode2), g0Var2, b3.h.g);
                                                    l1.q.E(g0Var2, b3.h.h);
                                                    l1.q.I(rVarC2, g0Var2, b3.h.d);
                                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                    g0Var3.r(true);
                                                    break;
                                            }
                                            return g00.b0.a;
                                        }
                                    }, g0Var), g0Var, 1600518 | (i19 & 896), 16);
                                    g0Var.r(true);
                                    g0Var.r(false);
                                    z13 = z11;
                                } else {
                                    z12 = z8;
                                    g0Var.c0(-2124897869);
                                    b2.r rVarD = h0.z1.d(rVar6, 1.0f);
                                    h0.v vVarA2 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                    int iHashCode2 = Long.hashCode(g0Var.T);
                                    l1.m1 m1VarM2 = g0Var.m();
                                    b2.r rVarC2 = b2.a.c(rVarD, g0Var);
                                    b3.i.c.getClass();
                                    gVar = b3.h.b;
                                    g0Var.g0();
                                    if (g0Var.S) {
                                        g0Var.l(gVar);
                                    } else {
                                        g0Var.q0();
                                    }
                                    l1.q.I(vVarA2, g0Var, b3.h.f);
                                    l1.q.I(m1VarM2, g0Var, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
                                    l1.q.E(g0Var, b3.h.h);
                                    l1.q.I(rVarC2, g0Var, b3.h.d);
                                    boolean z15 = z11;
                                    c0.b(uiState, onAction, z15, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                                    z13 = z15;
                                    n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                                    if (uiState.w || !z12) {
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    final int i22 = 1;
                                    w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                        @Override
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            int i23 = i22;
                                            w.d0 AnimatedVisibility = (w.d0) obj;
                                            l1.g0 g0Var2 = (l1.j) obj2;
                                            ((Integer) obj3).getClass();
                                            switch (i23) {
                                                case 0:
                                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                    break;
                                                default:
                                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    h0.v vVarA3 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                    l1.g0 g0Var3 = g0Var2;
                                                    int iHashCode3 = Long.hashCode(g0Var3.T);
                                                    l1.m1 m1VarM3 = g0Var3.m();
                                                    b2.o oVar = b2.o.A;
                                                    b2.r rVarC3 = b2.a.c(oVar, g0Var2);
                                                    b3.i.c.getClass();
                                                    b3.g gVar4 = b3.h.b;
                                                    g0Var3.g0();
                                                    if (g0Var3.S) {
                                                        g0Var3.l(gVar4);
                                                    } else {
                                                        g0Var3.q0();
                                                    }
                                                    l1.q.I(vVarA3, g0Var2, b3.h.f);
                                                    l1.q.I(m1VarM3, g0Var2, b3.h.e);
                                                    l1.q.I(Integer.valueOf(iHashCode3), g0Var2, b3.h.g);
                                                    l1.q.E(g0Var2, b3.h.h);
                                                    l1.q.I(rVarC3, g0Var2, b3.h.d);
                                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                    g0Var3.r(true);
                                                    break;
                                            }
                                            return g00.b0.a;
                                        }
                                    }, g0Var), g0Var, 1600518, 18);
                                    g0Var.r(true);
                                    g0Var.r(false);
                                }
                                rVar5 = rVar9;
                                rVar7 = rVar4;
                                z5 = z12;
                                z6 = z9;
                                z7 = z13;
                            } else {
                                g0Var.V();
                                rVar6 = rVar;
                                z5 = z;
                                z6 = z2;
                                rVar7 = rVar4;
                                z7 = z3;
                            }
                            r1VarT = g0Var.t();
                            if (r1VarT != null) {
                                final b2.r rVar10 = rVar6;
                                final b2.r rVar11 = rVar5;
                                r1VarT.d = new u00.n() {
                                    @Override
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        p.s(uiState, onAction, aVar, x0Var, rVar10, rVar7, rVar11, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                        return g00.b0.a;
                                    }
                                };
                            }
                        }
                        i11 |= 805306368;
                        if ((i11 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (g0Var.S(i11 & 1, z4)) {
                            rVar8 = b2.o.A;
                            if (i18 != 0) {
                                rVar6 = rVar8;
                            } else {
                                rVar6 = rVar;
                            }
                            if (i4 != 0) {
                                rVar4 = rVar8;
                            }
                            if (i6 != 0) {
                                rVar9 = rVar8;
                                i17 = i8;
                            } else {
                                i17 = i8;
                                rVar9 = rVar5;
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i13 != 0) {
                                z9 = false;
                            } else {
                                z9 = z2;
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z3;
                            }
                            wVar = h0.w.a;
                            if (z9) {
                                g0Var.c0(-2125908872);
                                int i110 = i11 >> 12;
                                h0.v vVarA3 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                int iHashCode3 = Long.hashCode(g0Var.T);
                                l1.m1 m1VarM3 = g0Var.m();
                                z12 = z8;
                                b2.r rVarC3 = b2.a.c(rVar6, g0Var);
                                b3.i.c.getClass();
                                gVar2 = b3.h.b;
                                g0Var.g0();
                                if (g0Var.S) {
                                    g0Var.l(gVar2);
                                } else {
                                    g0Var.q0();
                                }
                                l1.q.I(vVarA3, g0Var, b3.h.f);
                                l1.q.I(m1VarM3, g0Var, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.g);
                                l1.q.E(g0Var, b3.h.h);
                                l1.q.I(rVarC3, g0Var, b3.h.d);
                                o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i110 & 112));
                                final int i23 = 0;
                                w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i24 = i23;
                                        w.d0 AnimatedVisibility = (w.d0) obj;
                                        l1.g0 g0Var2 = (l1.j) obj2;
                                        ((Integer) obj3).getClass();
                                        switch (i24) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                h0.v vVarA4 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                l1.g0 g0Var3 = g0Var2;
                                                int iHashCode4 = Long.hashCode(g0Var3.T);
                                                l1.m1 m1VarM4 = g0Var3.m();
                                                b2.o oVar = b2.o.A;
                                                b2.r rVarC4 = b2.a.c(oVar, g0Var2);
                                                b3.i.c.getClass();
                                                b3.g gVar4 = b3.h.b;
                                                g0Var3.g0();
                                                if (g0Var3.S) {
                                                    g0Var3.l(gVar4);
                                                } else {
                                                    g0Var3.q0();
                                                }
                                                l1.q.I(vVarA4, g0Var2, b3.h.f);
                                                l1.q.I(m1VarM4, g0Var2, b3.h.e);
                                                l1.q.I(Integer.valueOf(iHashCode4), g0Var2, b3.h.g);
                                                l1.q.E(g0Var2, b3.h.h);
                                                l1.q.I(rVarC4, g0Var2, b3.h.d);
                                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                g0Var3.r(true);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, g0Var), g0Var, 1600518 | (i110 & 896), 16);
                                g0Var.r(true);
                                g0Var.r(false);
                                z13 = z11;
                            } else {
                                z12 = z8;
                                g0Var.c0(-2124897869);
                                b2.r rVarD2 = h0.z1.d(rVar6, 1.0f);
                                h0.v vVarA4 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                int iHashCode4 = Long.hashCode(g0Var.T);
                                l1.m1 m1VarM4 = g0Var.m();
                                b2.r rVarC4 = b2.a.c(rVarD2, g0Var);
                                b3.i.c.getClass();
                                gVar = b3.h.b;
                                g0Var.g0();
                                if (g0Var.S) {
                                    g0Var.l(gVar);
                                } else {
                                    g0Var.q0();
                                }
                                l1.q.I(vVarA4, g0Var, b3.h.f);
                                l1.q.I(m1VarM4, g0Var, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode4), g0Var, b3.h.g);
                                l1.q.E(g0Var, b3.h.h);
                                l1.q.I(rVarC4, g0Var, b3.h.d);
                                boolean z16 = z11;
                                c0.b(uiState, onAction, z16, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                                z13 = z16;
                                n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                                if (uiState.w) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                final int i24 = 1;
                                w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i25 = i24;
                                        w.d0 AnimatedVisibility = (w.d0) obj;
                                        l1.g0 g0Var2 = (l1.j) obj2;
                                        ((Integer) obj3).getClass();
                                        switch (i25) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                h0.v vVarA5 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                l1.g0 g0Var3 = g0Var2;
                                                int iHashCode5 = Long.hashCode(g0Var3.T);
                                                l1.m1 m1VarM5 = g0Var3.m();
                                                b2.o oVar = b2.o.A;
                                                b2.r rVarC5 = b2.a.c(oVar, g0Var2);
                                                b3.i.c.getClass();
                                                b3.g gVar4 = b3.h.b;
                                                g0Var3.g0();
                                                if (g0Var3.S) {
                                                    g0Var3.l(gVar4);
                                                } else {
                                                    g0Var3.q0();
                                                }
                                                l1.q.I(vVarA5, g0Var2, b3.h.f);
                                                l1.q.I(m1VarM5, g0Var2, b3.h.e);
                                                l1.q.I(Integer.valueOf(iHashCode5), g0Var2, b3.h.g);
                                                l1.q.E(g0Var2, b3.h.h);
                                                l1.q.I(rVarC5, g0Var2, b3.h.d);
                                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                g0Var3.r(true);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, g0Var), g0Var, 1600518, 18);
                                g0Var.r(true);
                                g0Var.r(false);
                            }
                            rVar5 = rVar9;
                            rVar7 = rVar4;
                            z5 = z12;
                            z6 = z9;
                            z7 = z13;
                        } else {
                            g0Var.V();
                            rVar6 = rVar;
                            z5 = z;
                            z6 = z2;
                            rVar7 = rVar4;
                            z7 = z3;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            final b2.r rVar12 = rVar6;
                            final b2.r rVar13 = rVar5;
                            r1VarT.d = new u00.n() {
                                @Override
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    p.s(uiState, onAction, aVar, x0Var, rVar12, rVar7, rVar13, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                    return g00.b0.a;
                                }
                            };
                        }
                    }
                    i11 |= 100663296;
                    i15 = i2 & 512;
                    if (i15 != 0) {
                        if ((i & 805306368) == 0) {
                            if (g0Var.h(z3)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i11 |= i16;
                        }
                        if ((i11 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (g0Var.S(i11 & 1, z4)) {
                            rVar8 = b2.o.A;
                            if (i18 != 0) {
                                rVar6 = rVar8;
                            } else {
                                rVar6 = rVar;
                            }
                            if (i4 != 0) {
                                rVar4 = rVar8;
                            }
                            if (i6 != 0) {
                                rVar9 = rVar8;
                                i17 = i8;
                            } else {
                                i17 = i8;
                                rVar9 = rVar5;
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i13 != 0) {
                                z9 = false;
                            } else {
                                z9 = z2;
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z3;
                            }
                            wVar = h0.w.a;
                            if (z9) {
                                g0Var.c0(-2125908872);
                                int i111 = i11 >> 12;
                                h0.v vVarA5 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                int iHashCode5 = Long.hashCode(g0Var.T);
                                l1.m1 m1VarM5 = g0Var.m();
                                z12 = z8;
                                b2.r rVarC5 = b2.a.c(rVar6, g0Var);
                                b3.i.c.getClass();
                                gVar2 = b3.h.b;
                                g0Var.g0();
                                if (g0Var.S) {
                                    g0Var.l(gVar2);
                                } else {
                                    g0Var.q0();
                                }
                                l1.q.I(vVarA5, g0Var, b3.h.f);
                                l1.q.I(m1VarM5, g0Var, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode5), g0Var, b3.h.g);
                                l1.q.E(g0Var, b3.h.h);
                                l1.q.I(rVarC5, g0Var, b3.h.d);
                                o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i111 & 112));
                                final int i25 = 0;
                                w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i26 = i25;
                                        w.d0 AnimatedVisibility = (w.d0) obj;
                                        l1.g0 g0Var2 = (l1.j) obj2;
                                        ((Integer) obj3).getClass();
                                        switch (i26) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                h0.v vVarA6 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                l1.g0 g0Var3 = g0Var2;
                                                int iHashCode6 = Long.hashCode(g0Var3.T);
                                                l1.m1 m1VarM6 = g0Var3.m();
                                                b2.o oVar = b2.o.A;
                                                b2.r rVarC6 = b2.a.c(oVar, g0Var2);
                                                b3.i.c.getClass();
                                                b3.g gVar4 = b3.h.b;
                                                g0Var3.g0();
                                                if (g0Var3.S) {
                                                    g0Var3.l(gVar4);
                                                } else {
                                                    g0Var3.q0();
                                                }
                                                l1.q.I(vVarA6, g0Var2, b3.h.f);
                                                l1.q.I(m1VarM6, g0Var2, b3.h.e);
                                                l1.q.I(Integer.valueOf(iHashCode6), g0Var2, b3.h.g);
                                                l1.q.E(g0Var2, b3.h.h);
                                                l1.q.I(rVarC6, g0Var2, b3.h.d);
                                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                g0Var3.r(true);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, g0Var), g0Var, 1600518 | (i111 & 896), 16);
                                g0Var.r(true);
                                g0Var.r(false);
                                z13 = z11;
                            } else {
                                z12 = z8;
                                g0Var.c0(-2124897869);
                                b2.r rVarD3 = h0.z1.d(rVar6, 1.0f);
                                h0.v vVarA6 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                int iHashCode6 = Long.hashCode(g0Var.T);
                                l1.m1 m1VarM6 = g0Var.m();
                                b2.r rVarC6 = b2.a.c(rVarD3, g0Var);
                                b3.i.c.getClass();
                                gVar = b3.h.b;
                                g0Var.g0();
                                if (g0Var.S) {
                                    g0Var.l(gVar);
                                } else {
                                    g0Var.q0();
                                }
                                l1.q.I(vVarA6, g0Var, b3.h.f);
                                l1.q.I(m1VarM6, g0Var, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode6), g0Var, b3.h.g);
                                l1.q.E(g0Var, b3.h.h);
                                l1.q.I(rVarC6, g0Var, b3.h.d);
                                boolean z17 = z11;
                                c0.b(uiState, onAction, z17, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                                z13 = z17;
                                n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                                if (uiState.w) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                final int i26 = 1;
                                w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i27 = i26;
                                        w.d0 AnimatedVisibility = (w.d0) obj;
                                        l1.g0 g0Var2 = (l1.j) obj2;
                                        ((Integer) obj3).getClass();
                                        switch (i27) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                h0.v vVarA7 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                l1.g0 g0Var3 = g0Var2;
                                                int iHashCode7 = Long.hashCode(g0Var3.T);
                                                l1.m1 m1VarM7 = g0Var3.m();
                                                b2.o oVar = b2.o.A;
                                                b2.r rVarC7 = b2.a.c(oVar, g0Var2);
                                                b3.i.c.getClass();
                                                b3.g gVar4 = b3.h.b;
                                                g0Var3.g0();
                                                if (g0Var3.S) {
                                                    g0Var3.l(gVar4);
                                                } else {
                                                    g0Var3.q0();
                                                }
                                                l1.q.I(vVarA7, g0Var2, b3.h.f);
                                                l1.q.I(m1VarM7, g0Var2, b3.h.e);
                                                l1.q.I(Integer.valueOf(iHashCode7), g0Var2, b3.h.g);
                                                l1.q.E(g0Var2, b3.h.h);
                                                l1.q.I(rVarC7, g0Var2, b3.h.d);
                                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                g0Var3.r(true);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, g0Var), g0Var, 1600518, 18);
                                g0Var.r(true);
                                g0Var.r(false);
                            }
                            rVar5 = rVar9;
                            rVar7 = rVar4;
                            z5 = z12;
                            z6 = z9;
                            z7 = z13;
                        } else {
                            g0Var.V();
                            rVar6 = rVar;
                            z5 = z;
                            z6 = z2;
                            rVar7 = rVar4;
                            z7 = z3;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            final b2.r rVar14 = rVar6;
                            final b2.r rVar15 = rVar5;
                            r1VarT.d = new u00.n() {
                                @Override
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    p.s(uiState, onAction, aVar, x0Var, rVar14, rVar7, rVar15, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                    return g00.b0.a;
                                }
                            };
                        }
                    }
                    i11 |= 805306368;
                    if ((i11 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (g0Var.S(i11 & 1, z4)) {
                        rVar8 = b2.o.A;
                        if (i18 != 0) {
                            rVar6 = rVar8;
                        } else {
                            rVar6 = rVar;
                        }
                        if (i4 != 0) {
                            rVar4 = rVar8;
                        }
                        if (i6 != 0) {
                            rVar9 = rVar8;
                            i17 = i8;
                        } else {
                            i17 = i8;
                            rVar9 = rVar5;
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i13 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        wVar = h0.w.a;
                        if (z9) {
                            g0Var.c0(-2125908872);
                            int i112 = i11 >> 12;
                            h0.v vVarA7 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode7 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM7 = g0Var.m();
                            z12 = z8;
                            b2.r rVarC7 = b2.a.c(rVar6, g0Var);
                            b3.i.c.getClass();
                            gVar2 = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar2);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA7, g0Var, b3.h.f);
                            l1.q.I(m1VarM7, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode7), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC7, g0Var, b3.h.d);
                            o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i112 & 112));
                            final int i27 = 0;
                            w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i28 = i27;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i28) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA8 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode8 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM8 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC8 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA8, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM8, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode8), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC8, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518 | (i112 & 896), 16);
                            g0Var.r(true);
                            g0Var.r(false);
                            z13 = z11;
                        } else {
                            z12 = z8;
                            g0Var.c0(-2124897869);
                            b2.r rVarD4 = h0.z1.d(rVar6, 1.0f);
                            h0.v vVarA8 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode8 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM8 = g0Var.m();
                            b2.r rVarC8 = b2.a.c(rVarD4, g0Var);
                            b3.i.c.getClass();
                            gVar = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA8, g0Var, b3.h.f);
                            l1.q.I(m1VarM8, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode8), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC8, g0Var, b3.h.d);
                            boolean z18 = z11;
                            c0.b(uiState, onAction, z18, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                            z13 = z18;
                            n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                            if (uiState.w) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            final int i28 = 1;
                            w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i29 = i28;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i29) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA9 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode9 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM9 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC9 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA9, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM9, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode9), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC9, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518, 18);
                            g0Var.r(true);
                            g0Var.r(false);
                        }
                        rVar5 = rVar9;
                        rVar7 = rVar4;
                        z5 = z12;
                        z6 = z9;
                        z7 = z13;
                    } else {
                        g0Var.V();
                        rVar6 = rVar;
                        z5 = z;
                        z6 = z2;
                        rVar7 = rVar4;
                        z7 = z3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        final b2.r rVar16 = rVar6;
                        final b2.r rVar17 = rVar5;
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                p.s(uiState, onAction, aVar, x0Var, rVar16, rVar7, rVar17, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                rVar5 = rVar3;
                i8 = i2 & 128;
                if (i8 != 0) {
                    i11 = i3 | 12582912;
                } else {
                    i9 = i3;
                    if ((i & 12582912) == 0) {
                        if (g0Var.h(z)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i11 = i9 | i12;
                    } else {
                        i11 = i9;
                    }
                }
                i13 = i2 & 256;
                if (i13 != 0) {
                    if ((i & 100663296) == 0) {
                        if (g0Var.h(z2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i11 |= i14;
                    }
                    i15 = i2 & 512;
                    if (i15 != 0) {
                        if ((i & 805306368) == 0) {
                            if (g0Var.h(z3)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i11 |= i16;
                        }
                        if ((i11 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (g0Var.S(i11 & 1, z4)) {
                            rVar8 = b2.o.A;
                            if (i18 != 0) {
                                rVar6 = rVar8;
                            } else {
                                rVar6 = rVar;
                            }
                            if (i4 != 0) {
                                rVar4 = rVar8;
                            }
                            if (i6 != 0) {
                                rVar9 = rVar8;
                                i17 = i8;
                            } else {
                                i17 = i8;
                                rVar9 = rVar5;
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i13 != 0) {
                                z9 = false;
                            } else {
                                z9 = z2;
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z3;
                            }
                            wVar = h0.w.a;
                            if (z9) {
                                g0Var.c0(-2125908872);
                                int i113 = i11 >> 12;
                                h0.v vVarA9 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                int iHashCode9 = Long.hashCode(g0Var.T);
                                l1.m1 m1VarM9 = g0Var.m();
                                z12 = z8;
                                b2.r rVarC9 = b2.a.c(rVar6, g0Var);
                                b3.i.c.getClass();
                                gVar2 = b3.h.b;
                                g0Var.g0();
                                if (g0Var.S) {
                                    g0Var.l(gVar2);
                                } else {
                                    g0Var.q0();
                                }
                                l1.q.I(vVarA9, g0Var, b3.h.f);
                                l1.q.I(m1VarM9, g0Var, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode9), g0Var, b3.h.g);
                                l1.q.E(g0Var, b3.h.h);
                                l1.q.I(rVarC9, g0Var, b3.h.d);
                                o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i113 & 112));
                                final int i29 = 0;
                                w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i210 = i29;
                                        w.d0 AnimatedVisibility = (w.d0) obj;
                                        l1.g0 g0Var2 = (l1.j) obj2;
                                        ((Integer) obj3).getClass();
                                        switch (i210) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                h0.v vVarA10 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                l1.g0 g0Var3 = g0Var2;
                                                int iHashCode10 = Long.hashCode(g0Var3.T);
                                                l1.m1 m1VarM10 = g0Var3.m();
                                                b2.o oVar = b2.o.A;
                                                b2.r rVarC10 = b2.a.c(oVar, g0Var2);
                                                b3.i.c.getClass();
                                                b3.g gVar4 = b3.h.b;
                                                g0Var3.g0();
                                                if (g0Var3.S) {
                                                    g0Var3.l(gVar4);
                                                } else {
                                                    g0Var3.q0();
                                                }
                                                l1.q.I(vVarA10, g0Var2, b3.h.f);
                                                l1.q.I(m1VarM10, g0Var2, b3.h.e);
                                                l1.q.I(Integer.valueOf(iHashCode10), g0Var2, b3.h.g);
                                                l1.q.E(g0Var2, b3.h.h);
                                                l1.q.I(rVarC10, g0Var2, b3.h.d);
                                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                g0Var3.r(true);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, g0Var), g0Var, 1600518 | (i113 & 896), 16);
                                g0Var.r(true);
                                g0Var.r(false);
                                z13 = z11;
                            } else {
                                z12 = z8;
                                g0Var.c0(-2124897869);
                                b2.r rVarD5 = h0.z1.d(rVar6, 1.0f);
                                h0.v vVarA10 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                int iHashCode10 = Long.hashCode(g0Var.T);
                                l1.m1 m1VarM10 = g0Var.m();
                                b2.r rVarC10 = b2.a.c(rVarD5, g0Var);
                                b3.i.c.getClass();
                                gVar = b3.h.b;
                                g0Var.g0();
                                if (g0Var.S) {
                                    g0Var.l(gVar);
                                } else {
                                    g0Var.q0();
                                }
                                l1.q.I(vVarA10, g0Var, b3.h.f);
                                l1.q.I(m1VarM10, g0Var, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode10), g0Var, b3.h.g);
                                l1.q.E(g0Var, b3.h.h);
                                l1.q.I(rVarC10, g0Var, b3.h.d);
                                boolean z19 = z11;
                                c0.b(uiState, onAction, z19, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                                z13 = z19;
                                n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                                if (uiState.w) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                final int i210 = 1;
                                w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i211 = i210;
                                        w.d0 AnimatedVisibility = (w.d0) obj;
                                        l1.g0 g0Var2 = (l1.j) obj2;
                                        ((Integer) obj3).getClass();
                                        switch (i211) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                h0.v vVarA11 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                l1.g0 g0Var3 = g0Var2;
                                                int iHashCode11 = Long.hashCode(g0Var3.T);
                                                l1.m1 m1VarM11 = g0Var3.m();
                                                b2.o oVar = b2.o.A;
                                                b2.r rVarC11 = b2.a.c(oVar, g0Var2);
                                                b3.i.c.getClass();
                                                b3.g gVar4 = b3.h.b;
                                                g0Var3.g0();
                                                if (g0Var3.S) {
                                                    g0Var3.l(gVar4);
                                                } else {
                                                    g0Var3.q0();
                                                }
                                                l1.q.I(vVarA11, g0Var2, b3.h.f);
                                                l1.q.I(m1VarM11, g0Var2, b3.h.e);
                                                l1.q.I(Integer.valueOf(iHashCode11), g0Var2, b3.h.g);
                                                l1.q.E(g0Var2, b3.h.h);
                                                l1.q.I(rVarC11, g0Var2, b3.h.d);
                                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                g0Var3.r(true);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, g0Var), g0Var, 1600518, 18);
                                g0Var.r(true);
                                g0Var.r(false);
                            }
                            rVar5 = rVar9;
                            rVar7 = rVar4;
                            z5 = z12;
                            z6 = z9;
                            z7 = z13;
                        } else {
                            g0Var.V();
                            rVar6 = rVar;
                            z5 = z;
                            z6 = z2;
                            rVar7 = rVar4;
                            z7 = z3;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            final b2.r rVar18 = rVar6;
                            final b2.r rVar19 = rVar5;
                            r1VarT.d = new u00.n() {
                                @Override
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    p.s(uiState, onAction, aVar, x0Var, rVar18, rVar7, rVar19, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                    return g00.b0.a;
                                }
                            };
                        }
                    }
                    i11 |= 805306368;
                    if ((i11 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (g0Var.S(i11 & 1, z4)) {
                        rVar8 = b2.o.A;
                        if (i18 != 0) {
                            rVar6 = rVar8;
                        } else {
                            rVar6 = rVar;
                        }
                        if (i4 != 0) {
                            rVar4 = rVar8;
                        }
                        if (i6 != 0) {
                            rVar9 = rVar8;
                            i17 = i8;
                        } else {
                            i17 = i8;
                            rVar9 = rVar5;
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i13 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        wVar = h0.w.a;
                        if (z9) {
                            g0Var.c0(-2125908872);
                            int i114 = i11 >> 12;
                            h0.v vVarA11 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode11 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM11 = g0Var.m();
                            z12 = z8;
                            b2.r rVarC11 = b2.a.c(rVar6, g0Var);
                            b3.i.c.getClass();
                            gVar2 = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar2);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA11, g0Var, b3.h.f);
                            l1.q.I(m1VarM11, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode11), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC11, g0Var, b3.h.d);
                            o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i114 & 112));
                            final int i211 = 0;
                            w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i212 = i211;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i212) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA12 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode12 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM12 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC12 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA12, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM12, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode12), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC12, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518 | (i114 & 896), 16);
                            g0Var.r(true);
                            g0Var.r(false);
                            z13 = z11;
                        } else {
                            z12 = z8;
                            g0Var.c0(-2124897869);
                            b2.r rVarD6 = h0.z1.d(rVar6, 1.0f);
                            h0.v vVarA12 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode12 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM12 = g0Var.m();
                            b2.r rVarC12 = b2.a.c(rVarD6, g0Var);
                            b3.i.c.getClass();
                            gVar = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA12, g0Var, b3.h.f);
                            l1.q.I(m1VarM12, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode12), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC12, g0Var, b3.h.d);
                            boolean z110 = z11;
                            c0.b(uiState, onAction, z110, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                            z13 = z110;
                            n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                            if (uiState.w) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            final int i212 = 1;
                            w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i213 = i212;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i213) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA13 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode13 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM13 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC13 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA13, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM13, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode13), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC13, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518, 18);
                            g0Var.r(true);
                            g0Var.r(false);
                        }
                        rVar5 = rVar9;
                        rVar7 = rVar4;
                        z5 = z12;
                        z6 = z9;
                        z7 = z13;
                    } else {
                        g0Var.V();
                        rVar6 = rVar;
                        z5 = z;
                        z6 = z2;
                        rVar7 = rVar4;
                        z7 = z3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        final b2.r rVar110 = rVar6;
                        final b2.r rVar111 = rVar5;
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                p.s(uiState, onAction, aVar, x0Var, rVar110, rVar7, rVar111, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i11 |= 100663296;
                i15 = i2 & 512;
                if (i15 != 0) {
                    if ((i & 805306368) == 0) {
                        if (g0Var.h(z3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i11 |= i16;
                    }
                    if ((i11 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (g0Var.S(i11 & 1, z4)) {
                        rVar8 = b2.o.A;
                        if (i18 != 0) {
                            rVar6 = rVar8;
                        } else {
                            rVar6 = rVar;
                        }
                        if (i4 != 0) {
                            rVar4 = rVar8;
                        }
                        if (i6 != 0) {
                            rVar9 = rVar8;
                            i17 = i8;
                        } else {
                            i17 = i8;
                            rVar9 = rVar5;
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i13 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        wVar = h0.w.a;
                        if (z9) {
                            g0Var.c0(-2125908872);
                            int i115 = i11 >> 12;
                            h0.v vVarA13 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode13 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM13 = g0Var.m();
                            z12 = z8;
                            b2.r rVarC13 = b2.a.c(rVar6, g0Var);
                            b3.i.c.getClass();
                            gVar2 = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar2);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA13, g0Var, b3.h.f);
                            l1.q.I(m1VarM13, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode13), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC13, g0Var, b3.h.d);
                            o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i115 & 112));
                            final int i213 = 0;
                            w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i214 = i213;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i214) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA14 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode14 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM14 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC14 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA14, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM14, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode14), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC14, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518 | (i115 & 896), 16);
                            g0Var.r(true);
                            g0Var.r(false);
                            z13 = z11;
                        } else {
                            z12 = z8;
                            g0Var.c0(-2124897869);
                            b2.r rVarD7 = h0.z1.d(rVar6, 1.0f);
                            h0.v vVarA14 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode14 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM14 = g0Var.m();
                            b2.r rVarC14 = b2.a.c(rVarD7, g0Var);
                            b3.i.c.getClass();
                            gVar = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA14, g0Var, b3.h.f);
                            l1.q.I(m1VarM14, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode14), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC14, g0Var, b3.h.d);
                            boolean z111 = z11;
                            c0.b(uiState, onAction, z111, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                            z13 = z111;
                            n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                            if (uiState.w) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            final int i214 = 1;
                            w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i215 = i214;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i215) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA15 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode15 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM15 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC15 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA15, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM15, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode15), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC15, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518, 18);
                            g0Var.r(true);
                            g0Var.r(false);
                        }
                        rVar5 = rVar9;
                        rVar7 = rVar4;
                        z5 = z12;
                        z6 = z9;
                        z7 = z13;
                    } else {
                        g0Var.V();
                        rVar6 = rVar;
                        z5 = z;
                        z6 = z2;
                        rVar7 = rVar4;
                        z7 = z3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        final b2.r rVar112 = rVar6;
                        final b2.r rVar113 = rVar5;
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                p.s(uiState, onAction, aVar, x0Var, rVar112, rVar7, rVar113, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i11 |= 805306368;
                if ((i11 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    rVar8 = b2.o.A;
                    if (i18 != 0) {
                        rVar6 = rVar8;
                    } else {
                        rVar6 = rVar;
                    }
                    if (i4 != 0) {
                        rVar4 = rVar8;
                    }
                    if (i6 != 0) {
                        rVar9 = rVar8;
                        i17 = i8;
                    } else {
                        i17 = i8;
                        rVar9 = rVar5;
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i13 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    wVar = h0.w.a;
                    if (z9) {
                        g0Var.c0(-2125908872);
                        int i116 = i11 >> 12;
                        h0.v vVarA15 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode15 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM15 = g0Var.m();
                        z12 = z8;
                        b2.r rVarC15 = b2.a.c(rVar6, g0Var);
                        b3.i.c.getClass();
                        gVar2 = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar2);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA15, g0Var, b3.h.f);
                        l1.q.I(m1VarM15, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode15), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC15, g0Var, b3.h.d);
                        o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i116 & 112));
                        final int i215 = 0;
                        w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i216 = i215;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i216) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA16 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode16 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM16 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC16 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA16, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM16, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode16), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC16, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518 | (i116 & 896), 16);
                        g0Var.r(true);
                        g0Var.r(false);
                        z13 = z11;
                    } else {
                        z12 = z8;
                        g0Var.c0(-2124897869);
                        b2.r rVarD8 = h0.z1.d(rVar6, 1.0f);
                        h0.v vVarA16 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode16 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM16 = g0Var.m();
                        b2.r rVarC16 = b2.a.c(rVarD8, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA16, g0Var, b3.h.f);
                        l1.q.I(m1VarM16, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode16), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC16, g0Var, b3.h.d);
                        boolean z112 = z11;
                        c0.b(uiState, onAction, z112, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                        z13 = z112;
                        n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                        if (uiState.w) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        final int i216 = 1;
                        w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i217 = i216;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i217) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA17 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode17 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM17 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC17 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA17, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM17, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode17), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC17, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518, 18);
                        g0Var.r(true);
                        g0Var.r(false);
                    }
                    rVar5 = rVar9;
                    rVar7 = rVar4;
                    z5 = z12;
                    z6 = z9;
                    z7 = z13;
                } else {
                    g0Var.V();
                    rVar6 = rVar;
                    z5 = z;
                    z6 = z2;
                    rVar7 = rVar4;
                    z7 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final b2.r rVar114 = rVar6;
                    final b2.r rVar115 = rVar5;
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p.s(uiState, onAction, aVar, x0Var, rVar114, rVar7, rVar115, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            rVar4 = rVar2;
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    rVar5 = rVar3;
                    if (g0Var.g(rVar5)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i11 = i3 | 12582912;
                } else {
                    i9 = i3;
                    if ((i & 12582912) == 0) {
                        if (g0Var.h(z)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i11 = i9 | i12;
                    } else {
                        i11 = i9;
                    }
                }
                i13 = i2 & 256;
                if (i13 != 0) {
                    if ((i & 100663296) == 0) {
                        if (g0Var.h(z2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i11 |= i14;
                    }
                    i15 = i2 & 512;
                    if (i15 != 0) {
                        if ((i & 805306368) == 0) {
                            if (g0Var.h(z3)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i11 |= i16;
                        }
                        if ((i11 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (g0Var.S(i11 & 1, z4)) {
                            rVar8 = b2.o.A;
                            if (i18 != 0) {
                                rVar6 = rVar8;
                            } else {
                                rVar6 = rVar;
                            }
                            if (i4 != 0) {
                                rVar4 = rVar8;
                            }
                            if (i6 != 0) {
                                rVar9 = rVar8;
                                i17 = i8;
                            } else {
                                i17 = i8;
                                rVar9 = rVar5;
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i13 != 0) {
                                z9 = false;
                            } else {
                                z9 = z2;
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z3;
                            }
                            wVar = h0.w.a;
                            if (z9) {
                                g0Var.c0(-2125908872);
                                int i117 = i11 >> 12;
                                h0.v vVarA17 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                int iHashCode17 = Long.hashCode(g0Var.T);
                                l1.m1 m1VarM17 = g0Var.m();
                                z12 = z8;
                                b2.r rVarC17 = b2.a.c(rVar6, g0Var);
                                b3.i.c.getClass();
                                gVar2 = b3.h.b;
                                g0Var.g0();
                                if (g0Var.S) {
                                    g0Var.l(gVar2);
                                } else {
                                    g0Var.q0();
                                }
                                l1.q.I(vVarA17, g0Var, b3.h.f);
                                l1.q.I(m1VarM17, g0Var, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode17), g0Var, b3.h.g);
                                l1.q.E(g0Var, b3.h.h);
                                l1.q.I(rVarC17, g0Var, b3.h.d);
                                o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i117 & 112));
                                final int i217 = 0;
                                w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i218 = i217;
                                        w.d0 AnimatedVisibility = (w.d0) obj;
                                        l1.g0 g0Var2 = (l1.j) obj2;
                                        ((Integer) obj3).getClass();
                                        switch (i218) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                h0.v vVarA18 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                l1.g0 g0Var3 = g0Var2;
                                                int iHashCode18 = Long.hashCode(g0Var3.T);
                                                l1.m1 m1VarM18 = g0Var3.m();
                                                b2.o oVar = b2.o.A;
                                                b2.r rVarC18 = b2.a.c(oVar, g0Var2);
                                                b3.i.c.getClass();
                                                b3.g gVar4 = b3.h.b;
                                                g0Var3.g0();
                                                if (g0Var3.S) {
                                                    g0Var3.l(gVar4);
                                                } else {
                                                    g0Var3.q0();
                                                }
                                                l1.q.I(vVarA18, g0Var2, b3.h.f);
                                                l1.q.I(m1VarM18, g0Var2, b3.h.e);
                                                l1.q.I(Integer.valueOf(iHashCode18), g0Var2, b3.h.g);
                                                l1.q.E(g0Var2, b3.h.h);
                                                l1.q.I(rVarC18, g0Var2, b3.h.d);
                                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                g0Var3.r(true);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, g0Var), g0Var, 1600518 | (i117 & 896), 16);
                                g0Var.r(true);
                                g0Var.r(false);
                                z13 = z11;
                            } else {
                                z12 = z8;
                                g0Var.c0(-2124897869);
                                b2.r rVarD9 = h0.z1.d(rVar6, 1.0f);
                                h0.v vVarA18 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                int iHashCode18 = Long.hashCode(g0Var.T);
                                l1.m1 m1VarM18 = g0Var.m();
                                b2.r rVarC18 = b2.a.c(rVarD9, g0Var);
                                b3.i.c.getClass();
                                gVar = b3.h.b;
                                g0Var.g0();
                                if (g0Var.S) {
                                    g0Var.l(gVar);
                                } else {
                                    g0Var.q0();
                                }
                                l1.q.I(vVarA18, g0Var, b3.h.f);
                                l1.q.I(m1VarM18, g0Var, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode18), g0Var, b3.h.g);
                                l1.q.E(g0Var, b3.h.h);
                                l1.q.I(rVarC18, g0Var, b3.h.d);
                                boolean z113 = z11;
                                c0.b(uiState, onAction, z113, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                                z13 = z113;
                                n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                                if (uiState.w) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                final int i218 = 1;
                                w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i219 = i218;
                                        w.d0 AnimatedVisibility = (w.d0) obj;
                                        l1.g0 g0Var2 = (l1.j) obj2;
                                        ((Integer) obj3).getClass();
                                        switch (i219) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                h0.v vVarA19 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                l1.g0 g0Var3 = g0Var2;
                                                int iHashCode19 = Long.hashCode(g0Var3.T);
                                                l1.m1 m1VarM19 = g0Var3.m();
                                                b2.o oVar = b2.o.A;
                                                b2.r rVarC19 = b2.a.c(oVar, g0Var2);
                                                b3.i.c.getClass();
                                                b3.g gVar4 = b3.h.b;
                                                g0Var3.g0();
                                                if (g0Var3.S) {
                                                    g0Var3.l(gVar4);
                                                } else {
                                                    g0Var3.q0();
                                                }
                                                l1.q.I(vVarA19, g0Var2, b3.h.f);
                                                l1.q.I(m1VarM19, g0Var2, b3.h.e);
                                                l1.q.I(Integer.valueOf(iHashCode19), g0Var2, b3.h.g);
                                                l1.q.E(g0Var2, b3.h.h);
                                                l1.q.I(rVarC19, g0Var2, b3.h.d);
                                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                g0Var3.r(true);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, g0Var), g0Var, 1600518, 18);
                                g0Var.r(true);
                                g0Var.r(false);
                            }
                            rVar5 = rVar9;
                            rVar7 = rVar4;
                            z5 = z12;
                            z6 = z9;
                            z7 = z13;
                        } else {
                            g0Var.V();
                            rVar6 = rVar;
                            z5 = z;
                            z6 = z2;
                            rVar7 = rVar4;
                            z7 = z3;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            final b2.r rVar116 = rVar6;
                            final b2.r rVar117 = rVar5;
                            r1VarT.d = new u00.n() {
                                @Override
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    p.s(uiState, onAction, aVar, x0Var, rVar116, rVar7, rVar117, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                    return g00.b0.a;
                                }
                            };
                        }
                    }
                    i11 |= 805306368;
                    if ((i11 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (g0Var.S(i11 & 1, z4)) {
                        rVar8 = b2.o.A;
                        if (i18 != 0) {
                            rVar6 = rVar8;
                        } else {
                            rVar6 = rVar;
                        }
                        if (i4 != 0) {
                            rVar4 = rVar8;
                        }
                        if (i6 != 0) {
                            rVar9 = rVar8;
                            i17 = i8;
                        } else {
                            i17 = i8;
                            rVar9 = rVar5;
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i13 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        wVar = h0.w.a;
                        if (z9) {
                            g0Var.c0(-2125908872);
                            int i118 = i11 >> 12;
                            h0.v vVarA19 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode19 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM19 = g0Var.m();
                            z12 = z8;
                            b2.r rVarC19 = b2.a.c(rVar6, g0Var);
                            b3.i.c.getClass();
                            gVar2 = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar2);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA19, g0Var, b3.h.f);
                            l1.q.I(m1VarM19, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode19), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC19, g0Var, b3.h.d);
                            o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i118 & 112));
                            final int i219 = 0;
                            w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i2110 = i219;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i2110) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA110 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode110 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM110 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC110 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA110, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM110, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode110), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC110, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518 | (i118 & 896), 16);
                            g0Var.r(true);
                            g0Var.r(false);
                            z13 = z11;
                        } else {
                            z12 = z8;
                            g0Var.c0(-2124897869);
                            b2.r rVarD10 = h0.z1.d(rVar6, 1.0f);
                            h0.v vVarA110 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode110 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM110 = g0Var.m();
                            b2.r rVarC110 = b2.a.c(rVarD10, g0Var);
                            b3.i.c.getClass();
                            gVar = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA110, g0Var, b3.h.f);
                            l1.q.I(m1VarM110, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode110), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC110, g0Var, b3.h.d);
                            boolean z114 = z11;
                            c0.b(uiState, onAction, z114, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                            z13 = z114;
                            n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                            if (uiState.w) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            final int i2110 = 1;
                            w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i2111 = i2110;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i2111) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA111 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode111 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM111 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC111 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA111, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM111, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode111), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC111, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518, 18);
                            g0Var.r(true);
                            g0Var.r(false);
                        }
                        rVar5 = rVar9;
                        rVar7 = rVar4;
                        z5 = z12;
                        z6 = z9;
                        z7 = z13;
                    } else {
                        g0Var.V();
                        rVar6 = rVar;
                        z5 = z;
                        z6 = z2;
                        rVar7 = rVar4;
                        z7 = z3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        final b2.r rVar118 = rVar6;
                        final b2.r rVar119 = rVar5;
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                p.s(uiState, onAction, aVar, x0Var, rVar118, rVar7, rVar119, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i11 |= 100663296;
                i15 = i2 & 512;
                if (i15 != 0) {
                    if ((i & 805306368) == 0) {
                        if (g0Var.h(z3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i11 |= i16;
                    }
                    if ((i11 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (g0Var.S(i11 & 1, z4)) {
                        rVar8 = b2.o.A;
                        if (i18 != 0) {
                            rVar6 = rVar8;
                        } else {
                            rVar6 = rVar;
                        }
                        if (i4 != 0) {
                            rVar4 = rVar8;
                        }
                        if (i6 != 0) {
                            rVar9 = rVar8;
                            i17 = i8;
                        } else {
                            i17 = i8;
                            rVar9 = rVar5;
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i13 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        wVar = h0.w.a;
                        if (z9) {
                            g0Var.c0(-2125908872);
                            int i119 = i11 >> 12;
                            h0.v vVarA111 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode111 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM111 = g0Var.m();
                            z12 = z8;
                            b2.r rVarC111 = b2.a.c(rVar6, g0Var);
                            b3.i.c.getClass();
                            gVar2 = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar2);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA111, g0Var, b3.h.f);
                            l1.q.I(m1VarM111, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode111), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC111, g0Var, b3.h.d);
                            o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i119 & 112));
                            final int i2111 = 0;
                            w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i2112 = i2111;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i2112) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA112 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode112 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM112 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC112 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA112, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM112, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode112), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC112, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518 | (i119 & 896), 16);
                            g0Var.r(true);
                            g0Var.r(false);
                            z13 = z11;
                        } else {
                            z12 = z8;
                            g0Var.c0(-2124897869);
                            b2.r rVarD11 = h0.z1.d(rVar6, 1.0f);
                            h0.v vVarA112 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode112 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM112 = g0Var.m();
                            b2.r rVarC112 = b2.a.c(rVarD11, g0Var);
                            b3.i.c.getClass();
                            gVar = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA112, g0Var, b3.h.f);
                            l1.q.I(m1VarM112, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode112), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC112, g0Var, b3.h.d);
                            boolean z115 = z11;
                            c0.b(uiState, onAction, z115, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                            z13 = z115;
                            n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                            if (uiState.w) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            final int i2112 = 1;
                            w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i2113 = i2112;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i2113) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA113 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode113 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM113 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC113 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA113, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM113, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode113), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC113, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518, 18);
                            g0Var.r(true);
                            g0Var.r(false);
                        }
                        rVar5 = rVar9;
                        rVar7 = rVar4;
                        z5 = z12;
                        z6 = z9;
                        z7 = z13;
                    } else {
                        g0Var.V();
                        rVar6 = rVar;
                        z5 = z;
                        z6 = z2;
                        rVar7 = rVar4;
                        z7 = z3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        final b2.r rVar1110 = rVar6;
                        final b2.r rVar1111 = rVar5;
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                p.s(uiState, onAction, aVar, x0Var, rVar1110, rVar7, rVar1111, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i11 |= 805306368;
                if ((i11 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    rVar8 = b2.o.A;
                    if (i18 != 0) {
                        rVar6 = rVar8;
                    } else {
                        rVar6 = rVar;
                    }
                    if (i4 != 0) {
                        rVar4 = rVar8;
                    }
                    if (i6 != 0) {
                        rVar9 = rVar8;
                        i17 = i8;
                    } else {
                        i17 = i8;
                        rVar9 = rVar5;
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i13 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    wVar = h0.w.a;
                    if (z9) {
                        g0Var.c0(-2125908872);
                        int i1110 = i11 >> 12;
                        h0.v vVarA113 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode113 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM113 = g0Var.m();
                        z12 = z8;
                        b2.r rVarC113 = b2.a.c(rVar6, g0Var);
                        b3.i.c.getClass();
                        gVar2 = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar2);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA113, g0Var, b3.h.f);
                        l1.q.I(m1VarM113, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode113), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC113, g0Var, b3.h.d);
                        o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i1110 & 112));
                        final int i2113 = 0;
                        w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i2114 = i2113;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i2114) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA114 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode114 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM114 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC114 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA114, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM114, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode114), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC114, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518 | (i1110 & 896), 16);
                        g0Var.r(true);
                        g0Var.r(false);
                        z13 = z11;
                    } else {
                        z12 = z8;
                        g0Var.c0(-2124897869);
                        b2.r rVarD12 = h0.z1.d(rVar6, 1.0f);
                        h0.v vVarA114 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode114 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM114 = g0Var.m();
                        b2.r rVarC114 = b2.a.c(rVarD12, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA114, g0Var, b3.h.f);
                        l1.q.I(m1VarM114, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode114), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC114, g0Var, b3.h.d);
                        boolean z116 = z11;
                        c0.b(uiState, onAction, z116, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                        z13 = z116;
                        n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                        if (uiState.w) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        final int i2114 = 1;
                        w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i2115 = i2114;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i2115) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA115 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode115 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM115 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC115 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA115, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM115, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode115), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC115, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518, 18);
                        g0Var.r(true);
                        g0Var.r(false);
                    }
                    rVar5 = rVar9;
                    rVar7 = rVar4;
                    z5 = z12;
                    z6 = z9;
                    z7 = z13;
                } else {
                    g0Var.V();
                    rVar6 = rVar;
                    z5 = z;
                    z6 = z2;
                    rVar7 = rVar4;
                    z7 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final b2.r rVar1112 = rVar6;
                    final b2.r rVar1113 = rVar5;
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p.s(uiState, onAction, aVar, x0Var, rVar1112, rVar7, rVar1113, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            rVar5 = rVar3;
            i8 = i2 & 128;
            if (i8 != 0) {
                i11 = i3 | 12582912;
            } else {
                i9 = i3;
                if ((i & 12582912) == 0) {
                    if (g0Var.h(z)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i11 = i9 | i12;
                } else {
                    i11 = i9;
                }
            }
            i13 = i2 & 256;
            if (i13 != 0) {
                if ((i & 100663296) == 0) {
                    if (g0Var.h(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i11 |= i14;
                }
                i15 = i2 & 512;
                if (i15 != 0) {
                    if ((i & 805306368) == 0) {
                        if (g0Var.h(z3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i11 |= i16;
                    }
                    if ((i11 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (g0Var.S(i11 & 1, z4)) {
                        rVar8 = b2.o.A;
                        if (i18 != 0) {
                            rVar6 = rVar8;
                        } else {
                            rVar6 = rVar;
                        }
                        if (i4 != 0) {
                            rVar4 = rVar8;
                        }
                        if (i6 != 0) {
                            rVar9 = rVar8;
                            i17 = i8;
                        } else {
                            i17 = i8;
                            rVar9 = rVar5;
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i13 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        wVar = h0.w.a;
                        if (z9) {
                            g0Var.c0(-2125908872);
                            int i1111 = i11 >> 12;
                            h0.v vVarA115 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode115 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM115 = g0Var.m();
                            z12 = z8;
                            b2.r rVarC115 = b2.a.c(rVar6, g0Var);
                            b3.i.c.getClass();
                            gVar2 = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar2);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA115, g0Var, b3.h.f);
                            l1.q.I(m1VarM115, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode115), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC115, g0Var, b3.h.d);
                            o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i1111 & 112));
                            final int i2115 = 0;
                            w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i2116 = i2115;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i2116) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA116 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode116 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM116 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC116 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA116, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM116, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode116), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC116, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518 | (i1111 & 896), 16);
                            g0Var.r(true);
                            g0Var.r(false);
                            z13 = z11;
                        } else {
                            z12 = z8;
                            g0Var.c0(-2124897869);
                            b2.r rVarD13 = h0.z1.d(rVar6, 1.0f);
                            h0.v vVarA116 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode116 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM116 = g0Var.m();
                            b2.r rVarC116 = b2.a.c(rVarD13, g0Var);
                            b3.i.c.getClass();
                            gVar = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA116, g0Var, b3.h.f);
                            l1.q.I(m1VarM116, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode116), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC116, g0Var, b3.h.d);
                            boolean z117 = z11;
                            c0.b(uiState, onAction, z117, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                            z13 = z117;
                            n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                            if (uiState.w) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            final int i2116 = 1;
                            w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i2117 = i2116;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i2117) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA117 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode117 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM117 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC117 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA117, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM117, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode117), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC117, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518, 18);
                            g0Var.r(true);
                            g0Var.r(false);
                        }
                        rVar5 = rVar9;
                        rVar7 = rVar4;
                        z5 = z12;
                        z6 = z9;
                        z7 = z13;
                    } else {
                        g0Var.V();
                        rVar6 = rVar;
                        z5 = z;
                        z6 = z2;
                        rVar7 = rVar4;
                        z7 = z3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        final b2.r rVar1114 = rVar6;
                        final b2.r rVar1115 = rVar5;
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                p.s(uiState, onAction, aVar, x0Var, rVar1114, rVar7, rVar1115, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i11 |= 805306368;
                if ((i11 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    rVar8 = b2.o.A;
                    if (i18 != 0) {
                        rVar6 = rVar8;
                    } else {
                        rVar6 = rVar;
                    }
                    if (i4 != 0) {
                        rVar4 = rVar8;
                    }
                    if (i6 != 0) {
                        rVar9 = rVar8;
                        i17 = i8;
                    } else {
                        i17 = i8;
                        rVar9 = rVar5;
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i13 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    wVar = h0.w.a;
                    if (z9) {
                        g0Var.c0(-2125908872);
                        int i1112 = i11 >> 12;
                        h0.v vVarA117 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode117 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM117 = g0Var.m();
                        z12 = z8;
                        b2.r rVarC117 = b2.a.c(rVar6, g0Var);
                        b3.i.c.getClass();
                        gVar2 = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar2);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA117, g0Var, b3.h.f);
                        l1.q.I(m1VarM117, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode117), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC117, g0Var, b3.h.d);
                        o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i1112 & 112));
                        final int i2117 = 0;
                        w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i2118 = i2117;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i2118) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA118 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode118 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM118 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC118 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA118, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM118, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode118), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC118, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518 | (i1112 & 896), 16);
                        g0Var.r(true);
                        g0Var.r(false);
                        z13 = z11;
                    } else {
                        z12 = z8;
                        g0Var.c0(-2124897869);
                        b2.r rVarD14 = h0.z1.d(rVar6, 1.0f);
                        h0.v vVarA118 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode118 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM118 = g0Var.m();
                        b2.r rVarC118 = b2.a.c(rVarD14, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA118, g0Var, b3.h.f);
                        l1.q.I(m1VarM118, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode118), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC118, g0Var, b3.h.d);
                        boolean z118 = z11;
                        c0.b(uiState, onAction, z118, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                        z13 = z118;
                        n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                        if (uiState.w) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        final int i2118 = 1;
                        w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i2119 = i2118;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i2119) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA119 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode119 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM119 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC119 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA119, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM119, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode119), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC119, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518, 18);
                        g0Var.r(true);
                        g0Var.r(false);
                    }
                    rVar5 = rVar9;
                    rVar7 = rVar4;
                    z5 = z12;
                    z6 = z9;
                    z7 = z13;
                } else {
                    g0Var.V();
                    rVar6 = rVar;
                    z5 = z;
                    z6 = z2;
                    rVar7 = rVar4;
                    z7 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final b2.r rVar1116 = rVar6;
                    final b2.r rVar1117 = rVar5;
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p.s(uiState, onAction, aVar, x0Var, rVar1116, rVar7, rVar1117, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i11 |= 100663296;
            i15 = i2 & 512;
            if (i15 != 0) {
                if ((i & 805306368) == 0) {
                    if (g0Var.h(z3)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i11 |= i16;
                }
                if ((i11 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    rVar8 = b2.o.A;
                    if (i18 != 0) {
                        rVar6 = rVar8;
                    } else {
                        rVar6 = rVar;
                    }
                    if (i4 != 0) {
                        rVar4 = rVar8;
                    }
                    if (i6 != 0) {
                        rVar9 = rVar8;
                        i17 = i8;
                    } else {
                        i17 = i8;
                        rVar9 = rVar5;
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i13 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    wVar = h0.w.a;
                    if (z9) {
                        g0Var.c0(-2125908872);
                        int i1113 = i11 >> 12;
                        h0.v vVarA119 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode119 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM119 = g0Var.m();
                        z12 = z8;
                        b2.r rVarC119 = b2.a.c(rVar6, g0Var);
                        b3.i.c.getClass();
                        gVar2 = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar2);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA119, g0Var, b3.h.f);
                        l1.q.I(m1VarM119, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode119), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC119, g0Var, b3.h.d);
                        o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i1113 & 112));
                        final int i2119 = 0;
                        w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i21110 = i2119;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i21110) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA1110 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode1110 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM1110 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC1110 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA1110, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM1110, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode1110), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC1110, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518 | (i1113 & 896), 16);
                        g0Var.r(true);
                        g0Var.r(false);
                        z13 = z11;
                    } else {
                        z12 = z8;
                        g0Var.c0(-2124897869);
                        b2.r rVarD15 = h0.z1.d(rVar6, 1.0f);
                        h0.v vVarA1110 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode1110 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM1110 = g0Var.m();
                        b2.r rVarC1110 = b2.a.c(rVarD15, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA1110, g0Var, b3.h.f);
                        l1.q.I(m1VarM1110, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode1110), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC1110, g0Var, b3.h.d);
                        boolean z119 = z11;
                        c0.b(uiState, onAction, z119, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                        z13 = z119;
                        n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                        if (uiState.w) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        final int i21110 = 1;
                        w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i21111 = i21110;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i21111) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA1111 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode1111 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM1111 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC1111 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA1111, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM1111, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode1111), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC1111, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518, 18);
                        g0Var.r(true);
                        g0Var.r(false);
                    }
                    rVar5 = rVar9;
                    rVar7 = rVar4;
                    z5 = z12;
                    z6 = z9;
                    z7 = z13;
                } else {
                    g0Var.V();
                    rVar6 = rVar;
                    z5 = z;
                    z6 = z2;
                    rVar7 = rVar4;
                    z7 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final b2.r rVar1118 = rVar6;
                    final b2.r rVar1119 = rVar5;
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p.s(uiState, onAction, aVar, x0Var, rVar1118, rVar7, rVar1119, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i11 |= 805306368;
            if ((i11 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (g0Var.S(i11 & 1, z4)) {
                rVar8 = b2.o.A;
                if (i18 != 0) {
                    rVar6 = rVar8;
                } else {
                    rVar6 = rVar;
                }
                if (i4 != 0) {
                    rVar4 = rVar8;
                }
                if (i6 != 0) {
                    rVar9 = rVar8;
                    i17 = i8;
                } else {
                    i17 = i8;
                    rVar9 = rVar5;
                }
                if (i17 != 0) {
                    z8 = true;
                } else {
                    z8 = z;
                }
                if (i13 != 0) {
                    z9 = false;
                } else {
                    z9 = z2;
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                wVar = h0.w.a;
                if (z9) {
                    g0Var.c0(-2125908872);
                    int i1114 = i11 >> 12;
                    h0.v vVarA1111 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                    int iHashCode1111 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM1111 = g0Var.m();
                    z12 = z8;
                    b2.r rVarC1111 = b2.a.c(rVar6, g0Var);
                    b3.i.c.getClass();
                    gVar2 = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar2);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA1111, g0Var, b3.h.f);
                    l1.q.I(m1VarM1111, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode1111), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC1111, g0Var, b3.h.d);
                    o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i1114 & 112));
                    final int i21111 = 0;
                    w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i21112 = i21111;
                            w.d0 AnimatedVisibility = (w.d0) obj;
                            l1.g0 g0Var2 = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            switch (i21112) {
                                case 0:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    h0.v vVarA1112 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                    l1.g0 g0Var3 = g0Var2;
                                    int iHashCode1112 = Long.hashCode(g0Var3.T);
                                    l1.m1 m1VarM1112 = g0Var3.m();
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarC1112 = b2.a.c(oVar, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA1112, g0Var2, b3.h.f);
                                    l1.q.I(m1VarM1112, g0Var2, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode1112), g0Var2, b3.h.g);
                                    l1.q.E(g0Var2, b3.h.h);
                                    l1.q.I(rVarC1112, g0Var2, b3.h.d);
                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                    g0Var3.r(true);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 1600518 | (i1114 & 896), 16);
                    g0Var.r(true);
                    g0Var.r(false);
                    z13 = z11;
                } else {
                    z12 = z8;
                    g0Var.c0(-2124897869);
                    b2.r rVarD16 = h0.z1.d(rVar6, 1.0f);
                    h0.v vVarA1112 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                    int iHashCode1112 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM1112 = g0Var.m();
                    b2.r rVarC1112 = b2.a.c(rVarD16, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA1112, g0Var, b3.h.f);
                    l1.q.I(m1VarM1112, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode1112), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC1112, g0Var, b3.h.d);
                    boolean z1110 = z11;
                    c0.b(uiState, onAction, z1110, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                    z13 = z1110;
                    n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                    if (uiState.w) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    final int i21112 = 1;
                    w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i21113 = i21112;
                            w.d0 AnimatedVisibility = (w.d0) obj;
                            l1.g0 g0Var2 = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            switch (i21113) {
                                case 0:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    h0.v vVarA1113 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                    l1.g0 g0Var3 = g0Var2;
                                    int iHashCode1113 = Long.hashCode(g0Var3.T);
                                    l1.m1 m1VarM1113 = g0Var3.m();
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarC1113 = b2.a.c(oVar, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA1113, g0Var2, b3.h.f);
                                    l1.q.I(m1VarM1113, g0Var2, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode1113), g0Var2, b3.h.g);
                                    l1.q.E(g0Var2, b3.h.h);
                                    l1.q.I(rVarC1113, g0Var2, b3.h.d);
                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                    g0Var3.r(true);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 1600518, 18);
                    g0Var.r(true);
                    g0Var.r(false);
                }
                rVar5 = rVar9;
                rVar7 = rVar4;
                z5 = z12;
                z6 = z9;
                z7 = z13;
            } else {
                g0Var.V();
                rVar6 = rVar;
                z5 = z;
                z6 = z2;
                rVar7 = rVar4;
                z7 = z3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                final b2.r rVar11110 = rVar6;
                final b2.r rVar11111 = rVar5;
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p.s(uiState, onAction, aVar, x0Var, rVar11110, rVar7, rVar11111, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 24576;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                rVar4 = rVar2;
                if (g0Var.g(rVar4)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                if ((1572864 & i) == 0) {
                    rVar5 = rVar3;
                    if (g0Var.g(rVar5)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i11 = i3 | 12582912;
                } else {
                    i9 = i3;
                    if ((i & 12582912) == 0) {
                        if (g0Var.h(z)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i11 = i9 | i12;
                    } else {
                        i11 = i9;
                    }
                }
                i13 = i2 & 256;
                if (i13 != 0) {
                    if ((i & 100663296) == 0) {
                        if (g0Var.h(z2)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i11 |= i14;
                    }
                    i15 = i2 & 512;
                    if (i15 != 0) {
                        if ((i & 805306368) == 0) {
                            if (g0Var.h(z3)) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i11 |= i16;
                        }
                        if ((i11 & 306783379) != 306783378) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (g0Var.S(i11 & 1, z4)) {
                            rVar8 = b2.o.A;
                            if (i18 != 0) {
                                rVar6 = rVar8;
                            } else {
                                rVar6 = rVar;
                            }
                            if (i4 != 0) {
                                rVar4 = rVar8;
                            }
                            if (i6 != 0) {
                                rVar9 = rVar8;
                                i17 = i8;
                            } else {
                                i17 = i8;
                                rVar9 = rVar5;
                            }
                            if (i17 != 0) {
                                z8 = true;
                            } else {
                                z8 = z;
                            }
                            if (i13 != 0) {
                                z9 = false;
                            } else {
                                z9 = z2;
                            }
                            if (i15 != 0) {
                                z11 = false;
                            } else {
                                z11 = z3;
                            }
                            wVar = h0.w.a;
                            if (z9) {
                                g0Var.c0(-2125908872);
                                int i1115 = i11 >> 12;
                                h0.v vVarA1113 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                int iHashCode1113 = Long.hashCode(g0Var.T);
                                l1.m1 m1VarM1113 = g0Var.m();
                                z12 = z8;
                                b2.r rVarC1113 = b2.a.c(rVar6, g0Var);
                                b3.i.c.getClass();
                                gVar2 = b3.h.b;
                                g0Var.g0();
                                if (g0Var.S) {
                                    g0Var.l(gVar2);
                                } else {
                                    g0Var.q0();
                                }
                                l1.q.I(vVarA1113, g0Var, b3.h.f);
                                l1.q.I(m1VarM1113, g0Var, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode1113), g0Var, b3.h.g);
                                l1.q.E(g0Var, b3.h.h);
                                l1.q.I(rVarC1113, g0Var, b3.h.d);
                                o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i1115 & 112));
                                final int i21113 = 0;
                                w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i21114 = i21113;
                                        w.d0 AnimatedVisibility = (w.d0) obj;
                                        l1.g0 g0Var2 = (l1.j) obj2;
                                        ((Integer) obj3).getClass();
                                        switch (i21114) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                h0.v vVarA1114 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                l1.g0 g0Var3 = g0Var2;
                                                int iHashCode1114 = Long.hashCode(g0Var3.T);
                                                l1.m1 m1VarM1114 = g0Var3.m();
                                                b2.o oVar = b2.o.A;
                                                b2.r rVarC1114 = b2.a.c(oVar, g0Var2);
                                                b3.i.c.getClass();
                                                b3.g gVar4 = b3.h.b;
                                                g0Var3.g0();
                                                if (g0Var3.S) {
                                                    g0Var3.l(gVar4);
                                                } else {
                                                    g0Var3.q0();
                                                }
                                                l1.q.I(vVarA1114, g0Var2, b3.h.f);
                                                l1.q.I(m1VarM1114, g0Var2, b3.h.e);
                                                l1.q.I(Integer.valueOf(iHashCode1114), g0Var2, b3.h.g);
                                                l1.q.E(g0Var2, b3.h.h);
                                                l1.q.I(rVarC1114, g0Var2, b3.h.d);
                                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                g0Var3.r(true);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, g0Var), g0Var, 1600518 | (i1115 & 896), 16);
                                g0Var.r(true);
                                g0Var.r(false);
                                z13 = z11;
                            } else {
                                z12 = z8;
                                g0Var.c0(-2124897869);
                                b2.r rVarD17 = h0.z1.d(rVar6, 1.0f);
                                h0.v vVarA1114 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                                int iHashCode1114 = Long.hashCode(g0Var.T);
                                l1.m1 m1VarM1114 = g0Var.m();
                                b2.r rVarC1114 = b2.a.c(rVarD17, g0Var);
                                b3.i.c.getClass();
                                gVar = b3.h.b;
                                g0Var.g0();
                                if (g0Var.S) {
                                    g0Var.l(gVar);
                                } else {
                                    g0Var.q0();
                                }
                                l1.q.I(vVarA1114, g0Var, b3.h.f);
                                l1.q.I(m1VarM1114, g0Var, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode1114), g0Var, b3.h.g);
                                l1.q.E(g0Var, b3.h.h);
                                l1.q.I(rVarC1114, g0Var, b3.h.d);
                                boolean z1111 = z11;
                                c0.b(uiState, onAction, z1111, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                                z13 = z1111;
                                n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                                if (uiState.w) {
                                    z14 = false;
                                } else {
                                    z14 = false;
                                }
                                final int i21114 = 1;
                                w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                    @Override
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        int i21115 = i21114;
                                        w.d0 AnimatedVisibility = (w.d0) obj;
                                        l1.g0 g0Var2 = (l1.j) obj2;
                                        ((Integer) obj3).getClass();
                                        switch (i21115) {
                                            case 0:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                                break;
                                            default:
                                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                                h0.v vVarA1115 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                                l1.g0 g0Var3 = g0Var2;
                                                int iHashCode1115 = Long.hashCode(g0Var3.T);
                                                l1.m1 m1VarM1115 = g0Var3.m();
                                                b2.o oVar = b2.o.A;
                                                b2.r rVarC1115 = b2.a.c(oVar, g0Var2);
                                                b3.i.c.getClass();
                                                b3.g gVar4 = b3.h.b;
                                                g0Var3.g0();
                                                if (g0Var3.S) {
                                                    g0Var3.l(gVar4);
                                                } else {
                                                    g0Var3.q0();
                                                }
                                                l1.q.I(vVarA1115, g0Var2, b3.h.f);
                                                l1.q.I(m1VarM1115, g0Var2, b3.h.e);
                                                l1.q.I(Integer.valueOf(iHashCode1115), g0Var2, b3.h.g);
                                                l1.q.E(g0Var2, b3.h.h);
                                                l1.q.I(rVarC1115, g0Var2, b3.h.d);
                                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                                g0Var3.r(true);
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                }, g0Var), g0Var, 1600518, 18);
                                g0Var.r(true);
                                g0Var.r(false);
                            }
                            rVar5 = rVar9;
                            rVar7 = rVar4;
                            z5 = z12;
                            z6 = z9;
                            z7 = z13;
                        } else {
                            g0Var.V();
                            rVar6 = rVar;
                            z5 = z;
                            z6 = z2;
                            rVar7 = rVar4;
                            z7 = z3;
                        }
                        r1VarT = g0Var.t();
                        if (r1VarT != null) {
                            final b2.r rVar11112 = rVar6;
                            final b2.r rVar11113 = rVar5;
                            r1VarT.d = new u00.n() {
                                @Override
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    p.s(uiState, onAction, aVar, x0Var, rVar11112, rVar7, rVar11113, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                    return g00.b0.a;
                                }
                            };
                        }
                    }
                    i11 |= 805306368;
                    if ((i11 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (g0Var.S(i11 & 1, z4)) {
                        rVar8 = b2.o.A;
                        if (i18 != 0) {
                            rVar6 = rVar8;
                        } else {
                            rVar6 = rVar;
                        }
                        if (i4 != 0) {
                            rVar4 = rVar8;
                        }
                        if (i6 != 0) {
                            rVar9 = rVar8;
                            i17 = i8;
                        } else {
                            i17 = i8;
                            rVar9 = rVar5;
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i13 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        wVar = h0.w.a;
                        if (z9) {
                            g0Var.c0(-2125908872);
                            int i1116 = i11 >> 12;
                            h0.v vVarA1115 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode1115 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM1115 = g0Var.m();
                            z12 = z8;
                            b2.r rVarC1115 = b2.a.c(rVar6, g0Var);
                            b3.i.c.getClass();
                            gVar2 = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar2);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA1115, g0Var, b3.h.f);
                            l1.q.I(m1VarM1115, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode1115), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC1115, g0Var, b3.h.d);
                            o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i1116 & 112));
                            final int i21115 = 0;
                            w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i21116 = i21115;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i21116) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA1116 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode1116 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM1116 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC1116 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA1116, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM1116, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode1116), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC1116, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518 | (i1116 & 896), 16);
                            g0Var.r(true);
                            g0Var.r(false);
                            z13 = z11;
                        } else {
                            z12 = z8;
                            g0Var.c0(-2124897869);
                            b2.r rVarD18 = h0.z1.d(rVar6, 1.0f);
                            h0.v vVarA1116 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode1116 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM1116 = g0Var.m();
                            b2.r rVarC1116 = b2.a.c(rVarD18, g0Var);
                            b3.i.c.getClass();
                            gVar = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA1116, g0Var, b3.h.f);
                            l1.q.I(m1VarM1116, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode1116), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC1116, g0Var, b3.h.d);
                            boolean z1112 = z11;
                            c0.b(uiState, onAction, z1112, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                            z13 = z1112;
                            n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                            if (uiState.w) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            final int i21116 = 1;
                            w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i21117 = i21116;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i21117) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA1117 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode1117 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM1117 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC1117 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA1117, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM1117, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode1117), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC1117, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518, 18);
                            g0Var.r(true);
                            g0Var.r(false);
                        }
                        rVar5 = rVar9;
                        rVar7 = rVar4;
                        z5 = z12;
                        z6 = z9;
                        z7 = z13;
                    } else {
                        g0Var.V();
                        rVar6 = rVar;
                        z5 = z;
                        z6 = z2;
                        rVar7 = rVar4;
                        z7 = z3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        final b2.r rVar11114 = rVar6;
                        final b2.r rVar11115 = rVar5;
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                p.s(uiState, onAction, aVar, x0Var, rVar11114, rVar7, rVar11115, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i11 |= 100663296;
                i15 = i2 & 512;
                if (i15 != 0) {
                    if ((i & 805306368) == 0) {
                        if (g0Var.h(z3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i11 |= i16;
                    }
                    if ((i11 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (g0Var.S(i11 & 1, z4)) {
                        rVar8 = b2.o.A;
                        if (i18 != 0) {
                            rVar6 = rVar8;
                        } else {
                            rVar6 = rVar;
                        }
                        if (i4 != 0) {
                            rVar4 = rVar8;
                        }
                        if (i6 != 0) {
                            rVar9 = rVar8;
                            i17 = i8;
                        } else {
                            i17 = i8;
                            rVar9 = rVar5;
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i13 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        wVar = h0.w.a;
                        if (z9) {
                            g0Var.c0(-2125908872);
                            int i1117 = i11 >> 12;
                            h0.v vVarA1117 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode1117 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM1117 = g0Var.m();
                            z12 = z8;
                            b2.r rVarC1117 = b2.a.c(rVar6, g0Var);
                            b3.i.c.getClass();
                            gVar2 = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar2);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA1117, g0Var, b3.h.f);
                            l1.q.I(m1VarM1117, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode1117), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC1117, g0Var, b3.h.d);
                            o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i1117 & 112));
                            final int i21117 = 0;
                            w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i21118 = i21117;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i21118) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA1118 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode1118 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM1118 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC1118 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA1118, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM1118, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode1118), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC1118, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518 | (i1117 & 896), 16);
                            g0Var.r(true);
                            g0Var.r(false);
                            z13 = z11;
                        } else {
                            z12 = z8;
                            g0Var.c0(-2124897869);
                            b2.r rVarD19 = h0.z1.d(rVar6, 1.0f);
                            h0.v vVarA1118 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode1118 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM1118 = g0Var.m();
                            b2.r rVarC1118 = b2.a.c(rVarD19, g0Var);
                            b3.i.c.getClass();
                            gVar = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA1118, g0Var, b3.h.f);
                            l1.q.I(m1VarM1118, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode1118), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC1118, g0Var, b3.h.d);
                            boolean z1113 = z11;
                            c0.b(uiState, onAction, z1113, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                            z13 = z1113;
                            n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                            if (uiState.w) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            final int i21118 = 1;
                            w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i21119 = i21118;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i21119) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA1119 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode1119 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM1119 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC1119 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA1119, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM1119, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode1119), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC1119, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518, 18);
                            g0Var.r(true);
                            g0Var.r(false);
                        }
                        rVar5 = rVar9;
                        rVar7 = rVar4;
                        z5 = z12;
                        z6 = z9;
                        z7 = z13;
                    } else {
                        g0Var.V();
                        rVar6 = rVar;
                        z5 = z;
                        z6 = z2;
                        rVar7 = rVar4;
                        z7 = z3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        final b2.r rVar11116 = rVar6;
                        final b2.r rVar11117 = rVar5;
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                p.s(uiState, onAction, aVar, x0Var, rVar11116, rVar7, rVar11117, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i11 |= 805306368;
                if ((i11 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    rVar8 = b2.o.A;
                    if (i18 != 0) {
                        rVar6 = rVar8;
                    } else {
                        rVar6 = rVar;
                    }
                    if (i4 != 0) {
                        rVar4 = rVar8;
                    }
                    if (i6 != 0) {
                        rVar9 = rVar8;
                        i17 = i8;
                    } else {
                        i17 = i8;
                        rVar9 = rVar5;
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i13 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    wVar = h0.w.a;
                    if (z9) {
                        g0Var.c0(-2125908872);
                        int i1118 = i11 >> 12;
                        h0.v vVarA1119 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode1119 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM1119 = g0Var.m();
                        z12 = z8;
                        b2.r rVarC1119 = b2.a.c(rVar6, g0Var);
                        b3.i.c.getClass();
                        gVar2 = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar2);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA1119, g0Var, b3.h.f);
                        l1.q.I(m1VarM1119, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode1119), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC1119, g0Var, b3.h.d);
                        o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i1118 & 112));
                        final int i21119 = 0;
                        w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i211110 = i21119;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i211110) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA11110 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode11110 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM11110 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC11110 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA11110, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM11110, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode11110), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC11110, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518 | (i1118 & 896), 16);
                        g0Var.r(true);
                        g0Var.r(false);
                        z13 = z11;
                    } else {
                        z12 = z8;
                        g0Var.c0(-2124897869);
                        b2.r rVarD110 = h0.z1.d(rVar6, 1.0f);
                        h0.v vVarA11110 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode11110 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM11110 = g0Var.m();
                        b2.r rVarC11110 = b2.a.c(rVarD110, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA11110, g0Var, b3.h.f);
                        l1.q.I(m1VarM11110, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode11110), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC11110, g0Var, b3.h.d);
                        boolean z1114 = z11;
                        c0.b(uiState, onAction, z1114, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                        z13 = z1114;
                        n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                        if (uiState.w) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        final int i211110 = 1;
                        w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i211111 = i211110;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i211111) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA11111 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode11111 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM11111 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC11111 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA11111, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM11111, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode11111), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC11111, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518, 18);
                        g0Var.r(true);
                        g0Var.r(false);
                    }
                    rVar5 = rVar9;
                    rVar7 = rVar4;
                    z5 = z12;
                    z6 = z9;
                    z7 = z13;
                } else {
                    g0Var.V();
                    rVar6 = rVar;
                    z5 = z;
                    z6 = z2;
                    rVar7 = rVar4;
                    z7 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final b2.r rVar11118 = rVar6;
                    final b2.r rVar11119 = rVar5;
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p.s(uiState, onAction, aVar, x0Var, rVar11118, rVar7, rVar11119, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            rVar5 = rVar3;
            i8 = i2 & 128;
            if (i8 != 0) {
                i11 = i3 | 12582912;
            } else {
                i9 = i3;
                if ((i & 12582912) == 0) {
                    if (g0Var.h(z)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i11 = i9 | i12;
                } else {
                    i11 = i9;
                }
            }
            i13 = i2 & 256;
            if (i13 != 0) {
                if ((i & 100663296) == 0) {
                    if (g0Var.h(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i11 |= i14;
                }
                i15 = i2 & 512;
                if (i15 != 0) {
                    if ((i & 805306368) == 0) {
                        if (g0Var.h(z3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i11 |= i16;
                    }
                    if ((i11 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (g0Var.S(i11 & 1, z4)) {
                        rVar8 = b2.o.A;
                        if (i18 != 0) {
                            rVar6 = rVar8;
                        } else {
                            rVar6 = rVar;
                        }
                        if (i4 != 0) {
                            rVar4 = rVar8;
                        }
                        if (i6 != 0) {
                            rVar9 = rVar8;
                            i17 = i8;
                        } else {
                            i17 = i8;
                            rVar9 = rVar5;
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i13 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        wVar = h0.w.a;
                        if (z9) {
                            g0Var.c0(-2125908872);
                            int i1119 = i11 >> 12;
                            h0.v vVarA11111 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode11111 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM11111 = g0Var.m();
                            z12 = z8;
                            b2.r rVarC11111 = b2.a.c(rVar6, g0Var);
                            b3.i.c.getClass();
                            gVar2 = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar2);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA11111, g0Var, b3.h.f);
                            l1.q.I(m1VarM11111, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode11111), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC11111, g0Var, b3.h.d);
                            o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i1119 & 112));
                            final int i211111 = 0;
                            w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i211112 = i211111;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i211112) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA11112 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode11112 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM11112 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC11112 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA11112, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM11112, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode11112), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC11112, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518 | (i1119 & 896), 16);
                            g0Var.r(true);
                            g0Var.r(false);
                            z13 = z11;
                        } else {
                            z12 = z8;
                            g0Var.c0(-2124897869);
                            b2.r rVarD111 = h0.z1.d(rVar6, 1.0f);
                            h0.v vVarA11112 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode11112 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM11112 = g0Var.m();
                            b2.r rVarC11112 = b2.a.c(rVarD111, g0Var);
                            b3.i.c.getClass();
                            gVar = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA11112, g0Var, b3.h.f);
                            l1.q.I(m1VarM11112, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode11112), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC11112, g0Var, b3.h.d);
                            boolean z1115 = z11;
                            c0.b(uiState, onAction, z1115, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                            z13 = z1115;
                            n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                            if (uiState.w) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            final int i211112 = 1;
                            w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i211113 = i211112;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i211113) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA11113 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode11113 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM11113 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC11113 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA11113, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM11113, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode11113), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC11113, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518, 18);
                            g0Var.r(true);
                            g0Var.r(false);
                        }
                        rVar5 = rVar9;
                        rVar7 = rVar4;
                        z5 = z12;
                        z6 = z9;
                        z7 = z13;
                    } else {
                        g0Var.V();
                        rVar6 = rVar;
                        z5 = z;
                        z6 = z2;
                        rVar7 = rVar4;
                        z7 = z3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        final b2.r rVar111110 = rVar6;
                        final b2.r rVar111111 = rVar5;
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                p.s(uiState, onAction, aVar, x0Var, rVar111110, rVar7, rVar111111, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i11 |= 805306368;
                if ((i11 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    rVar8 = b2.o.A;
                    if (i18 != 0) {
                        rVar6 = rVar8;
                    } else {
                        rVar6 = rVar;
                    }
                    if (i4 != 0) {
                        rVar4 = rVar8;
                    }
                    if (i6 != 0) {
                        rVar9 = rVar8;
                        i17 = i8;
                    } else {
                        i17 = i8;
                        rVar9 = rVar5;
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i13 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    wVar = h0.w.a;
                    if (z9) {
                        g0Var.c0(-2125908872);
                        int i11110 = i11 >> 12;
                        h0.v vVarA11113 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode11113 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM11113 = g0Var.m();
                        z12 = z8;
                        b2.r rVarC11113 = b2.a.c(rVar6, g0Var);
                        b3.i.c.getClass();
                        gVar2 = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar2);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA11113, g0Var, b3.h.f);
                        l1.q.I(m1VarM11113, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode11113), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC11113, g0Var, b3.h.d);
                        o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i11110 & 112));
                        final int i211113 = 0;
                        w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i211114 = i211113;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i211114) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA11114 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode11114 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM11114 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC11114 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA11114, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM11114, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode11114), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC11114, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518 | (i11110 & 896), 16);
                        g0Var.r(true);
                        g0Var.r(false);
                        z13 = z11;
                    } else {
                        z12 = z8;
                        g0Var.c0(-2124897869);
                        b2.r rVarD112 = h0.z1.d(rVar6, 1.0f);
                        h0.v vVarA11114 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode11114 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM11114 = g0Var.m();
                        b2.r rVarC11114 = b2.a.c(rVarD112, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA11114, g0Var, b3.h.f);
                        l1.q.I(m1VarM11114, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode11114), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC11114, g0Var, b3.h.d);
                        boolean z1116 = z11;
                        c0.b(uiState, onAction, z1116, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                        z13 = z1116;
                        n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                        if (uiState.w) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        final int i211114 = 1;
                        w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i211115 = i211114;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i211115) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA11115 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode11115 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM11115 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC11115 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA11115, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM11115, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode11115), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC11115, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518, 18);
                        g0Var.r(true);
                        g0Var.r(false);
                    }
                    rVar5 = rVar9;
                    rVar7 = rVar4;
                    z5 = z12;
                    z6 = z9;
                    z7 = z13;
                } else {
                    g0Var.V();
                    rVar6 = rVar;
                    z5 = z;
                    z6 = z2;
                    rVar7 = rVar4;
                    z7 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final b2.r rVar111112 = rVar6;
                    final b2.r rVar111113 = rVar5;
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p.s(uiState, onAction, aVar, x0Var, rVar111112, rVar7, rVar111113, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i11 |= 100663296;
            i15 = i2 & 512;
            if (i15 != 0) {
                if ((i & 805306368) == 0) {
                    if (g0Var.h(z3)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i11 |= i16;
                }
                if ((i11 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    rVar8 = b2.o.A;
                    if (i18 != 0) {
                        rVar6 = rVar8;
                    } else {
                        rVar6 = rVar;
                    }
                    if (i4 != 0) {
                        rVar4 = rVar8;
                    }
                    if (i6 != 0) {
                        rVar9 = rVar8;
                        i17 = i8;
                    } else {
                        i17 = i8;
                        rVar9 = rVar5;
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i13 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    wVar = h0.w.a;
                    if (z9) {
                        g0Var.c0(-2125908872);
                        int i11111 = i11 >> 12;
                        h0.v vVarA11115 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode11115 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM11115 = g0Var.m();
                        z12 = z8;
                        b2.r rVarC11115 = b2.a.c(rVar6, g0Var);
                        b3.i.c.getClass();
                        gVar2 = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar2);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA11115, g0Var, b3.h.f);
                        l1.q.I(m1VarM11115, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode11115), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC11115, g0Var, b3.h.d);
                        o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i11111 & 112));
                        final int i211115 = 0;
                        w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i211116 = i211115;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i211116) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA11116 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode11116 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM11116 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC11116 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA11116, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM11116, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode11116), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC11116, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518 | (i11111 & 896), 16);
                        g0Var.r(true);
                        g0Var.r(false);
                        z13 = z11;
                    } else {
                        z12 = z8;
                        g0Var.c0(-2124897869);
                        b2.r rVarD113 = h0.z1.d(rVar6, 1.0f);
                        h0.v vVarA11116 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode11116 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM11116 = g0Var.m();
                        b2.r rVarC11116 = b2.a.c(rVarD113, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA11116, g0Var, b3.h.f);
                        l1.q.I(m1VarM11116, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode11116), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC11116, g0Var, b3.h.d);
                        boolean z1117 = z11;
                        c0.b(uiState, onAction, z1117, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                        z13 = z1117;
                        n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                        if (uiState.w) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        final int i211116 = 1;
                        w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i211117 = i211116;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i211117) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA11117 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode11117 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM11117 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC11117 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA11117, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM11117, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode11117), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC11117, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518, 18);
                        g0Var.r(true);
                        g0Var.r(false);
                    }
                    rVar5 = rVar9;
                    rVar7 = rVar4;
                    z5 = z12;
                    z6 = z9;
                    z7 = z13;
                } else {
                    g0Var.V();
                    rVar6 = rVar;
                    z5 = z;
                    z6 = z2;
                    rVar7 = rVar4;
                    z7 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final b2.r rVar111114 = rVar6;
                    final b2.r rVar111115 = rVar5;
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p.s(uiState, onAction, aVar, x0Var, rVar111114, rVar7, rVar111115, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i11 |= 805306368;
            if ((i11 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (g0Var.S(i11 & 1, z4)) {
                rVar8 = b2.o.A;
                if (i18 != 0) {
                    rVar6 = rVar8;
                } else {
                    rVar6 = rVar;
                }
                if (i4 != 0) {
                    rVar4 = rVar8;
                }
                if (i6 != 0) {
                    rVar9 = rVar8;
                    i17 = i8;
                } else {
                    i17 = i8;
                    rVar9 = rVar5;
                }
                if (i17 != 0) {
                    z8 = true;
                } else {
                    z8 = z;
                }
                if (i13 != 0) {
                    z9 = false;
                } else {
                    z9 = z2;
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                wVar = h0.w.a;
                if (z9) {
                    g0Var.c0(-2125908872);
                    int i11112 = i11 >> 12;
                    h0.v vVarA11117 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                    int iHashCode11117 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM11117 = g0Var.m();
                    z12 = z8;
                    b2.r rVarC11117 = b2.a.c(rVar6, g0Var);
                    b3.i.c.getClass();
                    gVar2 = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar2);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA11117, g0Var, b3.h.f);
                    l1.q.I(m1VarM11117, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode11117), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC11117, g0Var, b3.h.d);
                    o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i11112 & 112));
                    final int i211117 = 0;
                    w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i211118 = i211117;
                            w.d0 AnimatedVisibility = (w.d0) obj;
                            l1.g0 g0Var2 = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            switch (i211118) {
                                case 0:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    h0.v vVarA11118 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                    l1.g0 g0Var3 = g0Var2;
                                    int iHashCode11118 = Long.hashCode(g0Var3.T);
                                    l1.m1 m1VarM11118 = g0Var3.m();
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarC11118 = b2.a.c(oVar, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA11118, g0Var2, b3.h.f);
                                    l1.q.I(m1VarM11118, g0Var2, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode11118), g0Var2, b3.h.g);
                                    l1.q.E(g0Var2, b3.h.h);
                                    l1.q.I(rVarC11118, g0Var2, b3.h.d);
                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                    g0Var3.r(true);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 1600518 | (i11112 & 896), 16);
                    g0Var.r(true);
                    g0Var.r(false);
                    z13 = z11;
                } else {
                    z12 = z8;
                    g0Var.c0(-2124897869);
                    b2.r rVarD114 = h0.z1.d(rVar6, 1.0f);
                    h0.v vVarA11118 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                    int iHashCode11118 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM11118 = g0Var.m();
                    b2.r rVarC11118 = b2.a.c(rVarD114, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA11118, g0Var, b3.h.f);
                    l1.q.I(m1VarM11118, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode11118), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC11118, g0Var, b3.h.d);
                    boolean z1118 = z11;
                    c0.b(uiState, onAction, z1118, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                    z13 = z1118;
                    n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                    if (uiState.w) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    final int i211118 = 1;
                    w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i211119 = i211118;
                            w.d0 AnimatedVisibility = (w.d0) obj;
                            l1.g0 g0Var2 = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            switch (i211119) {
                                case 0:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    h0.v vVarA11119 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                    l1.g0 g0Var3 = g0Var2;
                                    int iHashCode11119 = Long.hashCode(g0Var3.T);
                                    l1.m1 m1VarM11119 = g0Var3.m();
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarC11119 = b2.a.c(oVar, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA11119, g0Var2, b3.h.f);
                                    l1.q.I(m1VarM11119, g0Var2, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode11119), g0Var2, b3.h.g);
                                    l1.q.E(g0Var2, b3.h.h);
                                    l1.q.I(rVarC11119, g0Var2, b3.h.d);
                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                    g0Var3.r(true);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 1600518, 18);
                    g0Var.r(true);
                    g0Var.r(false);
                }
                rVar5 = rVar9;
                rVar7 = rVar4;
                z5 = z12;
                z6 = z9;
                z7 = z13;
            } else {
                g0Var.V();
                rVar6 = rVar;
                z5 = z;
                z6 = z2;
                rVar7 = rVar4;
                z7 = z3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                final b2.r rVar111116 = rVar6;
                final b2.r rVar111117 = rVar5;
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p.s(uiState, onAction, aVar, x0Var, rVar111116, rVar7, rVar111117, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 196608;
        rVar4 = rVar2;
        i6 = i2 & 64;
        if (i6 != 0) {
            if ((1572864 & i) == 0) {
                rVar5 = rVar3;
                if (g0Var.g(rVar5)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i11 = i3 | 12582912;
            } else {
                i9 = i3;
                if ((i & 12582912) == 0) {
                    if (g0Var.h(z)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i11 = i9 | i12;
                } else {
                    i11 = i9;
                }
            }
            i13 = i2 & 256;
            if (i13 != 0) {
                if ((i & 100663296) == 0) {
                    if (g0Var.h(z2)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i11 |= i14;
                }
                i15 = i2 & 512;
                if (i15 != 0) {
                    if ((i & 805306368) == 0) {
                        if (g0Var.h(z3)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i11 |= i16;
                    }
                    if ((i11 & 306783379) != 306783378) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (g0Var.S(i11 & 1, z4)) {
                        rVar8 = b2.o.A;
                        if (i18 != 0) {
                            rVar6 = rVar8;
                        } else {
                            rVar6 = rVar;
                        }
                        if (i4 != 0) {
                            rVar4 = rVar8;
                        }
                        if (i6 != 0) {
                            rVar9 = rVar8;
                            i17 = i8;
                        } else {
                            i17 = i8;
                            rVar9 = rVar5;
                        }
                        if (i17 != 0) {
                            z8 = true;
                        } else {
                            z8 = z;
                        }
                        if (i13 != 0) {
                            z9 = false;
                        } else {
                            z9 = z2;
                        }
                        if (i15 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        wVar = h0.w.a;
                        if (z9) {
                            g0Var.c0(-2125908872);
                            int i11113 = i11 >> 12;
                            h0.v vVarA11119 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode11119 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM11119 = g0Var.m();
                            z12 = z8;
                            b2.r rVarC11119 = b2.a.c(rVar6, g0Var);
                            b3.i.c.getClass();
                            gVar2 = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar2);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA11119, g0Var, b3.h.f);
                            l1.q.I(m1VarM11119, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode11119), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC11119, g0Var, b3.h.d);
                            o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i11113 & 112));
                            final int i211119 = 0;
                            w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i2111110 = i211119;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i2111110) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA111110 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode111110 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM111110 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC111110 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA111110, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM111110, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode111110), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC111110, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518 | (i11113 & 896), 16);
                            g0Var.r(true);
                            g0Var.r(false);
                            z13 = z11;
                        } else {
                            z12 = z8;
                            g0Var.c0(-2124897869);
                            b2.r rVarD115 = h0.z1.d(rVar6, 1.0f);
                            h0.v vVarA111110 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                            int iHashCode111110 = Long.hashCode(g0Var.T);
                            l1.m1 m1VarM111110 = g0Var.m();
                            b2.r rVarC111110 = b2.a.c(rVarD115, g0Var);
                            b3.i.c.getClass();
                            gVar = b3.h.b;
                            g0Var.g0();
                            if (g0Var.S) {
                                g0Var.l(gVar);
                            } else {
                                g0Var.q0();
                            }
                            l1.q.I(vVarA111110, g0Var, b3.h.f);
                            l1.q.I(m1VarM111110, g0Var, b3.h.e);
                            l1.q.I(Integer.valueOf(iHashCode111110), g0Var, b3.h.g);
                            l1.q.E(g0Var, b3.h.h);
                            l1.q.I(rVarC111110, g0Var, b3.h.d);
                            boolean z1119 = z11;
                            c0.b(uiState, onAction, z1119, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                            z13 = z1119;
                            n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                            if (uiState.w) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            final int i2111110 = 1;
                            w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                                @Override
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    int i2111111 = i2111110;
                                    w.d0 AnimatedVisibility = (w.d0) obj;
                                    l1.g0 g0Var2 = (l1.j) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i2111111) {
                                        case 0:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                            break;
                                        default:
                                            kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                            h0.v vVarA111111 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                            l1.g0 g0Var3 = g0Var2;
                                            int iHashCode111111 = Long.hashCode(g0Var3.T);
                                            l1.m1 m1VarM111111 = g0Var3.m();
                                            b2.o oVar = b2.o.A;
                                            b2.r rVarC111111 = b2.a.c(oVar, g0Var2);
                                            b3.i.c.getClass();
                                            b3.g gVar4 = b3.h.b;
                                            g0Var3.g0();
                                            if (g0Var3.S) {
                                                g0Var3.l(gVar4);
                                            } else {
                                                g0Var3.q0();
                                            }
                                            l1.q.I(vVarA111111, g0Var2, b3.h.f);
                                            l1.q.I(m1VarM111111, g0Var2, b3.h.e);
                                            l1.q.I(Integer.valueOf(iHashCode111111), g0Var2, b3.h.g);
                                            l1.q.E(g0Var2, b3.h.h);
                                            l1.q.I(rVarC111111, g0Var2, b3.h.d);
                                            h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                            p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                            g0Var3.r(true);
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            }, g0Var), g0Var, 1600518, 18);
                            g0Var.r(true);
                            g0Var.r(false);
                        }
                        rVar5 = rVar9;
                        rVar7 = rVar4;
                        z5 = z12;
                        z6 = z9;
                        z7 = z13;
                    } else {
                        g0Var.V();
                        rVar6 = rVar;
                        z5 = z;
                        z6 = z2;
                        rVar7 = rVar4;
                        z7 = z3;
                    }
                    r1VarT = g0Var.t();
                    if (r1VarT != null) {
                        final b2.r rVar111118 = rVar6;
                        final b2.r rVar111119 = rVar5;
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                p.s(uiState, onAction, aVar, x0Var, rVar111118, rVar7, rVar111119, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i11 |= 805306368;
                if ((i11 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    rVar8 = b2.o.A;
                    if (i18 != 0) {
                        rVar6 = rVar8;
                    } else {
                        rVar6 = rVar;
                    }
                    if (i4 != 0) {
                        rVar4 = rVar8;
                    }
                    if (i6 != 0) {
                        rVar9 = rVar8;
                        i17 = i8;
                    } else {
                        i17 = i8;
                        rVar9 = rVar5;
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i13 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    wVar = h0.w.a;
                    if (z9) {
                        g0Var.c0(-2125908872);
                        int i11114 = i11 >> 12;
                        h0.v vVarA111111 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode111111 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM111111 = g0Var.m();
                        z12 = z8;
                        b2.r rVarC111111 = b2.a.c(rVar6, g0Var);
                        b3.i.c.getClass();
                        gVar2 = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar2);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA111111, g0Var, b3.h.f);
                        l1.q.I(m1VarM111111, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode111111), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC111111, g0Var, b3.h.d);
                        o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i11114 & 112));
                        final int i2111111 = 0;
                        w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i2111112 = i2111111;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i2111112) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA111112 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode111112 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM111112 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC111112 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA111112, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM111112, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode111112), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC111112, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518 | (i11114 & 896), 16);
                        g0Var.r(true);
                        g0Var.r(false);
                        z13 = z11;
                    } else {
                        z12 = z8;
                        g0Var.c0(-2124897869);
                        b2.r rVarD116 = h0.z1.d(rVar6, 1.0f);
                        h0.v vVarA111112 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode111112 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM111112 = g0Var.m();
                        b2.r rVarC111112 = b2.a.c(rVarD116, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA111112, g0Var, b3.h.f);
                        l1.q.I(m1VarM111112, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode111112), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC111112, g0Var, b3.h.d);
                        boolean z11110 = z11;
                        c0.b(uiState, onAction, z11110, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                        z13 = z11110;
                        n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                        if (uiState.w) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        final int i2111112 = 1;
                        w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i2111113 = i2111112;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i2111113) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA111113 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode111113 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM111113 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC111113 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA111113, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM111113, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode111113), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC111113, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518, 18);
                        g0Var.r(true);
                        g0Var.r(false);
                    }
                    rVar5 = rVar9;
                    rVar7 = rVar4;
                    z5 = z12;
                    z6 = z9;
                    z7 = z13;
                } else {
                    g0Var.V();
                    rVar6 = rVar;
                    z5 = z;
                    z6 = z2;
                    rVar7 = rVar4;
                    z7 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final b2.r rVar1111110 = rVar6;
                    final b2.r rVar1111111 = rVar5;
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p.s(uiState, onAction, aVar, x0Var, rVar1111110, rVar7, rVar1111111, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i11 |= 100663296;
            i15 = i2 & 512;
            if (i15 != 0) {
                if ((i & 805306368) == 0) {
                    if (g0Var.h(z3)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i11 |= i16;
                }
                if ((i11 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    rVar8 = b2.o.A;
                    if (i18 != 0) {
                        rVar6 = rVar8;
                    } else {
                        rVar6 = rVar;
                    }
                    if (i4 != 0) {
                        rVar4 = rVar8;
                    }
                    if (i6 != 0) {
                        rVar9 = rVar8;
                        i17 = i8;
                    } else {
                        i17 = i8;
                        rVar9 = rVar5;
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i13 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    wVar = h0.w.a;
                    if (z9) {
                        g0Var.c0(-2125908872);
                        int i11115 = i11 >> 12;
                        h0.v vVarA111113 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode111113 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM111113 = g0Var.m();
                        z12 = z8;
                        b2.r rVarC111113 = b2.a.c(rVar6, g0Var);
                        b3.i.c.getClass();
                        gVar2 = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar2);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA111113, g0Var, b3.h.f);
                        l1.q.I(m1VarM111113, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode111113), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC111113, g0Var, b3.h.d);
                        o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i11115 & 112));
                        final int i2111113 = 0;
                        w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i2111114 = i2111113;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i2111114) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA111114 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode111114 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM111114 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC111114 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA111114, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM111114, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode111114), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC111114, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518 | (i11115 & 896), 16);
                        g0Var.r(true);
                        g0Var.r(false);
                        z13 = z11;
                    } else {
                        z12 = z8;
                        g0Var.c0(-2124897869);
                        b2.r rVarD117 = h0.z1.d(rVar6, 1.0f);
                        h0.v vVarA111114 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode111114 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM111114 = g0Var.m();
                        b2.r rVarC111114 = b2.a.c(rVarD117, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA111114, g0Var, b3.h.f);
                        l1.q.I(m1VarM111114, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode111114), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC111114, g0Var, b3.h.d);
                        boolean z11111 = z11;
                        c0.b(uiState, onAction, z11111, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                        z13 = z11111;
                        n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                        if (uiState.w) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        final int i2111114 = 1;
                        w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i2111115 = i2111114;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i2111115) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA111115 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode111115 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM111115 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC111115 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA111115, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM111115, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode111115), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC111115, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518, 18);
                        g0Var.r(true);
                        g0Var.r(false);
                    }
                    rVar5 = rVar9;
                    rVar7 = rVar4;
                    z5 = z12;
                    z6 = z9;
                    z7 = z13;
                } else {
                    g0Var.V();
                    rVar6 = rVar;
                    z5 = z;
                    z6 = z2;
                    rVar7 = rVar4;
                    z7 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final b2.r rVar1111112 = rVar6;
                    final b2.r rVar1111113 = rVar5;
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p.s(uiState, onAction, aVar, x0Var, rVar1111112, rVar7, rVar1111113, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i11 |= 805306368;
            if ((i11 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (g0Var.S(i11 & 1, z4)) {
                rVar8 = b2.o.A;
                if (i18 != 0) {
                    rVar6 = rVar8;
                } else {
                    rVar6 = rVar;
                }
                if (i4 != 0) {
                    rVar4 = rVar8;
                }
                if (i6 != 0) {
                    rVar9 = rVar8;
                    i17 = i8;
                } else {
                    i17 = i8;
                    rVar9 = rVar5;
                }
                if (i17 != 0) {
                    z8 = true;
                } else {
                    z8 = z;
                }
                if (i13 != 0) {
                    z9 = false;
                } else {
                    z9 = z2;
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                wVar = h0.w.a;
                if (z9) {
                    g0Var.c0(-2125908872);
                    int i11116 = i11 >> 12;
                    h0.v vVarA111115 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                    int iHashCode111115 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM111115 = g0Var.m();
                    z12 = z8;
                    b2.r rVarC111115 = b2.a.c(rVar6, g0Var);
                    b3.i.c.getClass();
                    gVar2 = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar2);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA111115, g0Var, b3.h.f);
                    l1.q.I(m1VarM111115, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode111115), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC111115, g0Var, b3.h.d);
                    o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i11116 & 112));
                    final int i2111115 = 0;
                    w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i2111116 = i2111115;
                            w.d0 AnimatedVisibility = (w.d0) obj;
                            l1.g0 g0Var2 = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            switch (i2111116) {
                                case 0:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    h0.v vVarA111116 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                    l1.g0 g0Var3 = g0Var2;
                                    int iHashCode111116 = Long.hashCode(g0Var3.T);
                                    l1.m1 m1VarM111116 = g0Var3.m();
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarC111116 = b2.a.c(oVar, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA111116, g0Var2, b3.h.f);
                                    l1.q.I(m1VarM111116, g0Var2, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode111116), g0Var2, b3.h.g);
                                    l1.q.E(g0Var2, b3.h.h);
                                    l1.q.I(rVarC111116, g0Var2, b3.h.d);
                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                    g0Var3.r(true);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 1600518 | (i11116 & 896), 16);
                    g0Var.r(true);
                    g0Var.r(false);
                    z13 = z11;
                } else {
                    z12 = z8;
                    g0Var.c0(-2124897869);
                    b2.r rVarD118 = h0.z1.d(rVar6, 1.0f);
                    h0.v vVarA111116 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                    int iHashCode111116 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM111116 = g0Var.m();
                    b2.r rVarC111116 = b2.a.c(rVarD118, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA111116, g0Var, b3.h.f);
                    l1.q.I(m1VarM111116, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode111116), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC111116, g0Var, b3.h.d);
                    boolean z11112 = z11;
                    c0.b(uiState, onAction, z11112, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                    z13 = z11112;
                    n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                    if (uiState.w) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    final int i2111116 = 1;
                    w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i2111117 = i2111116;
                            w.d0 AnimatedVisibility = (w.d0) obj;
                            l1.g0 g0Var2 = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            switch (i2111117) {
                                case 0:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    h0.v vVarA111117 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                    l1.g0 g0Var3 = g0Var2;
                                    int iHashCode111117 = Long.hashCode(g0Var3.T);
                                    l1.m1 m1VarM111117 = g0Var3.m();
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarC111117 = b2.a.c(oVar, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA111117, g0Var2, b3.h.f);
                                    l1.q.I(m1VarM111117, g0Var2, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode111117), g0Var2, b3.h.g);
                                    l1.q.E(g0Var2, b3.h.h);
                                    l1.q.I(rVarC111117, g0Var2, b3.h.d);
                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                    g0Var3.r(true);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 1600518, 18);
                    g0Var.r(true);
                    g0Var.r(false);
                }
                rVar5 = rVar9;
                rVar7 = rVar4;
                z5 = z12;
                z6 = z9;
                z7 = z13;
            } else {
                g0Var.V();
                rVar6 = rVar;
                z5 = z;
                z6 = z2;
                rVar7 = rVar4;
                z7 = z3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                final b2.r rVar1111114 = rVar6;
                final b2.r rVar1111115 = rVar5;
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p.s(uiState, onAction, aVar, x0Var, rVar1111114, rVar7, rVar1111115, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i3 |= 1572864;
        rVar5 = rVar3;
        i8 = i2 & 128;
        if (i8 != 0) {
            i11 = i3 | 12582912;
        } else {
            i9 = i3;
            if ((i & 12582912) == 0) {
                if (g0Var.h(z)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i11 = i9 | i12;
            } else {
                i11 = i9;
            }
        }
        i13 = i2 & 256;
        if (i13 != 0) {
            if ((i & 100663296) == 0) {
                if (g0Var.h(z2)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i11 |= i14;
            }
            i15 = i2 & 512;
            if (i15 != 0) {
                if ((i & 805306368) == 0) {
                    if (g0Var.h(z3)) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i11 |= i16;
                }
                if ((i11 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (g0Var.S(i11 & 1, z4)) {
                    rVar8 = b2.o.A;
                    if (i18 != 0) {
                        rVar6 = rVar8;
                    } else {
                        rVar6 = rVar;
                    }
                    if (i4 != 0) {
                        rVar4 = rVar8;
                    }
                    if (i6 != 0) {
                        rVar9 = rVar8;
                        i17 = i8;
                    } else {
                        i17 = i8;
                        rVar9 = rVar5;
                    }
                    if (i17 != 0) {
                        z8 = true;
                    } else {
                        z8 = z;
                    }
                    if (i13 != 0) {
                        z9 = false;
                    } else {
                        z9 = z2;
                    }
                    if (i15 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    wVar = h0.w.a;
                    if (z9) {
                        g0Var.c0(-2125908872);
                        int i11117 = i11 >> 12;
                        h0.v vVarA111117 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode111117 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM111117 = g0Var.m();
                        z12 = z8;
                        b2.r rVarC111117 = b2.a.c(rVar6, g0Var);
                        b3.i.c.getClass();
                        gVar2 = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar2);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA111117, g0Var, b3.h.f);
                        l1.q.I(m1VarM111117, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode111117), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC111117, g0Var, b3.h.d);
                        o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i11117 & 112));
                        final int i2111117 = 0;
                        w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i2111118 = i2111117;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i2111118) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA111118 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode111118 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM111118 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC111118 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA111118, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM111118, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode111118), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC111118, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518 | (i11117 & 896), 16);
                        g0Var.r(true);
                        g0Var.r(false);
                        z13 = z11;
                    } else {
                        z12 = z8;
                        g0Var.c0(-2124897869);
                        b2.r rVarD119 = h0.z1.d(rVar6, 1.0f);
                        h0.v vVarA111118 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                        int iHashCode111118 = Long.hashCode(g0Var.T);
                        l1.m1 m1VarM111118 = g0Var.m();
                        b2.r rVarC111118 = b2.a.c(rVarD119, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(vVarA111118, g0Var, b3.h.f);
                        l1.q.I(m1VarM111118, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode111118), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC111118, g0Var, b3.h.d);
                        boolean z11113 = z11;
                        c0.b(uiState, onAction, z11113, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                        z13 = z11113;
                        n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                        if (uiState.w) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        final int i2111118 = 1;
                        w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                            @Override
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i2111119 = i2111118;
                                w.d0 AnimatedVisibility = (w.d0) obj;
                                l1.g0 g0Var2 = (l1.j) obj2;
                                ((Integer) obj3).getClass();
                                switch (i2111119) {
                                    case 0:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                        break;
                                    default:
                                        kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                        h0.v vVarA111119 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                        l1.g0 g0Var3 = g0Var2;
                                        int iHashCode111119 = Long.hashCode(g0Var3.T);
                                        l1.m1 m1VarM111119 = g0Var3.m();
                                        b2.o oVar = b2.o.A;
                                        b2.r rVarC111119 = b2.a.c(oVar, g0Var2);
                                        b3.i.c.getClass();
                                        b3.g gVar4 = b3.h.b;
                                        g0Var3.g0();
                                        if (g0Var3.S) {
                                            g0Var3.l(gVar4);
                                        } else {
                                            g0Var3.q0();
                                        }
                                        l1.q.I(vVarA111119, g0Var2, b3.h.f);
                                        l1.q.I(m1VarM111119, g0Var2, b3.h.e);
                                        l1.q.I(Integer.valueOf(iHashCode111119), g0Var2, b3.h.g);
                                        l1.q.E(g0Var2, b3.h.h);
                                        l1.q.I(rVarC111119, g0Var2, b3.h.d);
                                        h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                        p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                        g0Var3.r(true);
                                        break;
                                }
                                return g00.b0.a;
                            }
                        }, g0Var), g0Var, 1600518, 18);
                        g0Var.r(true);
                        g0Var.r(false);
                    }
                    rVar5 = rVar9;
                    rVar7 = rVar4;
                    z5 = z12;
                    z6 = z9;
                    z7 = z13;
                } else {
                    g0Var.V();
                    rVar6 = rVar;
                    z5 = z;
                    z6 = z2;
                    rVar7 = rVar4;
                    z7 = z3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    final b2.r rVar1111116 = rVar6;
                    final b2.r rVar1111117 = rVar5;
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            p.s(uiState, onAction, aVar, x0Var, rVar1111116, rVar7, rVar1111117, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i11 |= 805306368;
            if ((i11 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (g0Var.S(i11 & 1, z4)) {
                rVar8 = b2.o.A;
                if (i18 != 0) {
                    rVar6 = rVar8;
                } else {
                    rVar6 = rVar;
                }
                if (i4 != 0) {
                    rVar4 = rVar8;
                }
                if (i6 != 0) {
                    rVar9 = rVar8;
                    i17 = i8;
                } else {
                    i17 = i8;
                    rVar9 = rVar5;
                }
                if (i17 != 0) {
                    z8 = true;
                } else {
                    z8 = z;
                }
                if (i13 != 0) {
                    z9 = false;
                } else {
                    z9 = z2;
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                wVar = h0.w.a;
                if (z9) {
                    g0Var.c0(-2125908872);
                    int i11118 = i11 >> 12;
                    h0.v vVarA111119 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                    int iHashCode111119 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM111119 = g0Var.m();
                    z12 = z8;
                    b2.r rVarC111119 = b2.a.c(rVar6, g0Var);
                    b3.i.c.getClass();
                    gVar2 = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar2);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA111119, g0Var, b3.h.f);
                    l1.q.I(m1VarM111119, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode111119), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC111119, g0Var, b3.h.d);
                    o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i11118 & 112));
                    final int i2111119 = 0;
                    w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i21111110 = i2111119;
                            w.d0 AnimatedVisibility = (w.d0) obj;
                            l1.g0 g0Var2 = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            switch (i21111110) {
                                case 0:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    h0.v vVarA1111110 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                    l1.g0 g0Var3 = g0Var2;
                                    int iHashCode1111110 = Long.hashCode(g0Var3.T);
                                    l1.m1 m1VarM1111110 = g0Var3.m();
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarC1111110 = b2.a.c(oVar, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA1111110, g0Var2, b3.h.f);
                                    l1.q.I(m1VarM1111110, g0Var2, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode1111110), g0Var2, b3.h.g);
                                    l1.q.E(g0Var2, b3.h.h);
                                    l1.q.I(rVarC1111110, g0Var2, b3.h.d);
                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                    g0Var3.r(true);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 1600518 | (i11118 & 896), 16);
                    g0Var.r(true);
                    g0Var.r(false);
                    z13 = z11;
                } else {
                    z12 = z8;
                    g0Var.c0(-2124897869);
                    b2.r rVarD1110 = h0.z1.d(rVar6, 1.0f);
                    h0.v vVarA1111110 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                    int iHashCode1111110 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM1111110 = g0Var.m();
                    b2.r rVarC1111110 = b2.a.c(rVarD1110, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA1111110, g0Var, b3.h.f);
                    l1.q.I(m1VarM1111110, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode1111110), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC1111110, g0Var, b3.h.d);
                    boolean z11114 = z11;
                    c0.b(uiState, onAction, z11114, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                    z13 = z11114;
                    n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                    if (uiState.w) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    final int i21111110 = 1;
                    w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i21111111 = i21111110;
                            w.d0 AnimatedVisibility = (w.d0) obj;
                            l1.g0 g0Var2 = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            switch (i21111111) {
                                case 0:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    h0.v vVarA1111111 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                    l1.g0 g0Var3 = g0Var2;
                                    int iHashCode1111111 = Long.hashCode(g0Var3.T);
                                    l1.m1 m1VarM1111111 = g0Var3.m();
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarC1111111 = b2.a.c(oVar, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA1111111, g0Var2, b3.h.f);
                                    l1.q.I(m1VarM1111111, g0Var2, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode1111111), g0Var2, b3.h.g);
                                    l1.q.E(g0Var2, b3.h.h);
                                    l1.q.I(rVarC1111111, g0Var2, b3.h.d);
                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                    g0Var3.r(true);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 1600518, 18);
                    g0Var.r(true);
                    g0Var.r(false);
                }
                rVar5 = rVar9;
                rVar7 = rVar4;
                z5 = z12;
                z6 = z9;
                z7 = z13;
            } else {
                g0Var.V();
                rVar6 = rVar;
                z5 = z;
                z6 = z2;
                rVar7 = rVar4;
                z7 = z3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                final b2.r rVar1111118 = rVar6;
                final b2.r rVar1111119 = rVar5;
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p.s(uiState, onAction, aVar, x0Var, rVar1111118, rVar7, rVar1111119, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i11 |= 100663296;
        i15 = i2 & 512;
        if (i15 != 0) {
            if ((i & 805306368) == 0) {
                if (g0Var.h(z3)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i11 |= i16;
            }
            if ((i11 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (g0Var.S(i11 & 1, z4)) {
                rVar8 = b2.o.A;
                if (i18 != 0) {
                    rVar6 = rVar8;
                } else {
                    rVar6 = rVar;
                }
                if (i4 != 0) {
                    rVar4 = rVar8;
                }
                if (i6 != 0) {
                    rVar9 = rVar8;
                    i17 = i8;
                } else {
                    i17 = i8;
                    rVar9 = rVar5;
                }
                if (i17 != 0) {
                    z8 = true;
                } else {
                    z8 = z;
                }
                if (i13 != 0) {
                    z9 = false;
                } else {
                    z9 = z2;
                }
                if (i15 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                wVar = h0.w.a;
                if (z9) {
                    g0Var.c0(-2125908872);
                    int i11119 = i11 >> 12;
                    h0.v vVarA1111111 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                    int iHashCode1111111 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM1111111 = g0Var.m();
                    z12 = z8;
                    b2.r rVarC1111111 = b2.a.c(rVar6, g0Var);
                    b3.i.c.getClass();
                    gVar2 = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar2);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA1111111, g0Var, b3.h.f);
                    l1.q.I(m1VarM1111111, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode1111111), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC1111111, g0Var, b3.h.d);
                    o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i11119 & 112));
                    final int i21111111 = 0;
                    w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i21111112 = i21111111;
                            w.d0 AnimatedVisibility = (w.d0) obj;
                            l1.g0 g0Var2 = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            switch (i21111112) {
                                case 0:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    h0.v vVarA1111112 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                    l1.g0 g0Var3 = g0Var2;
                                    int iHashCode1111112 = Long.hashCode(g0Var3.T);
                                    l1.m1 m1VarM1111112 = g0Var3.m();
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarC1111112 = b2.a.c(oVar, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA1111112, g0Var2, b3.h.f);
                                    l1.q.I(m1VarM1111112, g0Var2, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode1111112), g0Var2, b3.h.g);
                                    l1.q.E(g0Var2, b3.h.h);
                                    l1.q.I(rVarC1111112, g0Var2, b3.h.d);
                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                    g0Var3.r(true);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 1600518 | (i11119 & 896), 16);
                    g0Var.r(true);
                    g0Var.r(false);
                    z13 = z11;
                } else {
                    z12 = z8;
                    g0Var.c0(-2124897869);
                    b2.r rVarD1111 = h0.z1.d(rVar6, 1.0f);
                    h0.v vVarA1111112 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                    int iHashCode1111112 = Long.hashCode(g0Var.T);
                    l1.m1 m1VarM1111112 = g0Var.m();
                    b2.r rVarC1111112 = b2.a.c(rVarD1111, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(vVarA1111112, g0Var, b3.h.f);
                    l1.q.I(m1VarM1111112, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode1111112), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC1111112, g0Var, b3.h.d);
                    boolean z11115 = z11;
                    c0.b(uiState, onAction, z11115, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                    z13 = z11115;
                    n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                    if (uiState.w) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    final int i21111112 = 1;
                    w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                        @Override
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i21111113 = i21111112;
                            w.d0 AnimatedVisibility = (w.d0) obj;
                            l1.g0 g0Var2 = (l1.j) obj2;
                            ((Integer) obj3).getClass();
                            switch (i21111113) {
                                case 0:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                    h0.v vVarA1111113 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                    l1.g0 g0Var3 = g0Var2;
                                    int iHashCode1111113 = Long.hashCode(g0Var3.T);
                                    l1.m1 m1VarM1111113 = g0Var3.m();
                                    b2.o oVar = b2.o.A;
                                    b2.r rVarC1111113 = b2.a.c(oVar, g0Var2);
                                    b3.i.c.getClass();
                                    b3.g gVar4 = b3.h.b;
                                    g0Var3.g0();
                                    if (g0Var3.S) {
                                        g0Var3.l(gVar4);
                                    } else {
                                        g0Var3.q0();
                                    }
                                    l1.q.I(vVarA1111113, g0Var2, b3.h.f);
                                    l1.q.I(m1VarM1111113, g0Var2, b3.h.e);
                                    l1.q.I(Integer.valueOf(iHashCode1111113), g0Var2, b3.h.g);
                                    l1.q.E(g0Var2, b3.h.h);
                                    l1.q.I(rVarC1111113, g0Var2, b3.h.d);
                                    h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                    p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                    g0Var3.r(true);
                                    break;
                            }
                            return g00.b0.a;
                        }
                    }, g0Var), g0Var, 1600518, 18);
                    g0Var.r(true);
                    g0Var.r(false);
                }
                rVar5 = rVar9;
                rVar7 = rVar4;
                z5 = z12;
                z6 = z9;
                z7 = z13;
            } else {
                g0Var.V();
                rVar6 = rVar;
                z5 = z;
                z6 = z2;
                rVar7 = rVar4;
                z7 = z3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                final b2.r rVar11111110 = rVar6;
                final b2.r rVar11111111 = rVar5;
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        p.s(uiState, onAction, aVar, x0Var, rVar11111110, rVar7, rVar11111111, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                        return g00.b0.a;
                    }
                };
            }
        }
        i11 |= 805306368;
        if ((i11 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (g0Var.S(i11 & 1, z4)) {
            rVar8 = b2.o.A;
            if (i18 != 0) {
                rVar6 = rVar8;
            } else {
                rVar6 = rVar;
            }
            if (i4 != 0) {
                rVar4 = rVar8;
            }
            if (i6 != 0) {
                rVar9 = rVar8;
                i17 = i8;
            } else {
                i17 = i8;
                rVar9 = rVar5;
            }
            if (i17 != 0) {
                z8 = true;
            } else {
                z8 = z;
            }
            if (i13 != 0) {
                z9 = false;
            } else {
                z9 = z2;
            }
            if (i15 != 0) {
                z11 = false;
            } else {
                z11 = z3;
            }
            wVar = h0.w.a;
            if (z9) {
                g0Var.c0(-2125908872);
                int i111110 = i11 >> 12;
                h0.v vVarA1111113 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                int iHashCode1111113 = Long.hashCode(g0Var.T);
                l1.m1 m1VarM1111113 = g0Var.m();
                z12 = z8;
                b2.r rVarC1111113 = b2.a.c(rVar6, g0Var);
                b3.i.c.getClass();
                gVar2 = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA1111113, g0Var, b3.h.f);
                l1.q.I(m1VarM1111113, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode1111113), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC1111113, g0Var, b3.h.d);
                o(x0Var, rVar4, v1.d.d(-686535415, new h0(uiState, onAction, 0), g0Var), g0Var, ((i11 >> 9) & 14) | 384 | (i111110 & 112));
                final int i21111113 = 0;
                w.c0.b(wVar, uiState.w, rVar9, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(1543711090, new u00.o() {
                    @Override
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i21111114 = i21111113;
                        w.d0 AnimatedVisibility = (w.d0) obj;
                        l1.g0 g0Var2 = (l1.j) obj2;
                        ((Integer) obj3).getClass();
                        switch (i21111114) {
                            case 0:
                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                break;
                            default:
                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                h0.v vVarA1111114 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                l1.g0 g0Var3 = g0Var2;
                                int iHashCode1111114 = Long.hashCode(g0Var3.T);
                                l1.m1 m1VarM1111114 = g0Var3.m();
                                b2.o oVar = b2.o.A;
                                b2.r rVarC1111114 = b2.a.c(oVar, g0Var2);
                                b3.i.c.getClass();
                                b3.g gVar4 = b3.h.b;
                                g0Var3.g0();
                                if (g0Var3.S) {
                                    g0Var3.l(gVar4);
                                } else {
                                    g0Var3.q0();
                                }
                                l1.q.I(vVarA1111114, g0Var2, b3.h.f);
                                l1.q.I(m1VarM1111114, g0Var2, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode1111114), g0Var2, b3.h.g);
                                l1.q.E(g0Var2, b3.h.h);
                                l1.q.I(rVarC1111114, g0Var2, b3.h.d);
                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                g0Var3.r(true);
                                break;
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, 1600518 | (i111110 & 896), 16);
                g0Var.r(true);
                g0Var.r(false);
                z13 = z11;
            } else {
                z12 = z8;
                g0Var.c0(-2124897869);
                b2.r rVarD1112 = h0.z1.d(rVar6, 1.0f);
                h0.v vVarA1111114 = h0.u.a(h0.i.c, gVar3, g0Var, 0);
                int iHashCode1111114 = Long.hashCode(g0Var.T);
                l1.m1 m1VarM1111114 = g0Var.m();
                b2.r rVarC1111114 = b2.a.c(rVarD1112, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA1111114, g0Var, b3.h.f);
                l1.q.I(m1VarM1111114, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode1111114), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC1111114, g0Var, b3.h.d);
                boolean z11116 = z11;
                c0.b(uiState, onAction, z11116, g0Var, (i11 & 126) | ((i11 >> 21) & 896), 0);
                z13 = z11116;
                n(!z13, null, v1.d.d(1492910607, new j0(uiState, onAction, 0, (byte) 0), g0Var), g0Var, 384, 2);
                if (uiState.w) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                final int i21111114 = 1;
                w.c0.b(wVar, z14, (b2.r) null, w.s0.b((x.y) null, 13), w.s0.h((x.y) null, 13), (String) null, v1.d.d(-680669879, new u00.o() {
                    @Override
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i21111115 = i21111114;
                        w.d0 AnimatedVisibility = (w.d0) obj;
                        l1.g0 g0Var2 = (l1.j) obj2;
                        ((Integer) obj3).getClass();
                        switch (i21111115) {
                            case 0:
                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                p.B(x0Var, aVar, onAction, h0.c.G(b2.o.A, 0.0f, 12, 0.0f, 0.0f, 13), g0Var2, 3072, 0);
                                break;
                            default:
                                kotlin.jvm.internal.m.e(AnimatedVisibility, "$this$AnimatedVisibility");
                                h0.v vVarA1111115 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                                l1.g0 g0Var3 = g0Var2;
                                int iHashCode1111115 = Long.hashCode(g0Var3.T);
                                l1.m1 m1VarM1111115 = g0Var3.m();
                                b2.o oVar = b2.o.A;
                                b2.r rVarC1111115 = b2.a.c(oVar, g0Var2);
                                b3.i.c.getClass();
                                b3.g gVar4 = b3.h.b;
                                g0Var3.g0();
                                if (g0Var3.S) {
                                    g0Var3.l(gVar4);
                                } else {
                                    g0Var3.q0();
                                }
                                l1.q.I(vVarA1111115, g0Var2, b3.h.f);
                                l1.q.I(m1VarM1111115, g0Var2, b3.h.e);
                                l1.q.I(Integer.valueOf(iHashCode1111115), g0Var2, b3.h.g);
                                l1.q.E(g0Var2, b3.h.h);
                                l1.q.I(rVarC1111115, g0Var2, b3.h.d);
                                h0.c.h(h0.z1.e(oVar, 20), g0Var2);
                                p.B(x0Var, aVar, onAction, null, g0Var2, 0, 8);
                                g0Var3.r(true);
                                break;
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, 1600518, 18);
                g0Var.r(true);
                g0Var.r(false);
            }
            rVar5 = rVar9;
            rVar7 = rVar4;
            z5 = z12;
            z6 = z9;
            z7 = z13;
        } else {
            g0Var.V();
            rVar6 = rVar;
            z5 = z;
            z6 = z2;
            rVar7 = rVar4;
            z7 = z3;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final b2.r rVar11111112 = rVar6;
            final b2.r rVar11111113 = rVar5;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p.s(uiState, onAction, aVar, x0Var, rVar11111112, rVar7, rVar11111113, z5, z6, z7, (l1.j) obj, l1.q.K(i | 1), i2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void t(boolean z, b2.r rVar, w.x0 x0Var, w.y0 y0Var, v1.c cVar, l1.j jVar, int i, int i2) {
        b2.r rVar2;
        int i3;
        w.x0 x0Var2;
        int i4;
        int i5;
        int i6;
        w.y0 y0Var2;
        int i7;
        int i8;
        boolean z2;
        b2.r rVar3;
        w.x0 x0Var3;
        w.y0 y0Var3;
        l1.r1 r1VarT;
        b2.r rVar4;
        w.x0 x0VarC;
        w.x0 x0Var4;
        w.y0 y0VarD;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1444215803);
        int i9 = i | (g0Var.h(z) ? 4 : 2);
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                rVar2 = rVar;
                i9 |= g0Var.g(rVar2) ? 32 : 16;
            }
            i3 = i2 & 4;
            if (i3 != 0) {
                i5 = i9 | 384;
                x0Var2 = x0Var;
            } else {
                x0Var2 = x0Var;
                if (g0Var.g(x0Var2)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i5 = i9 | i4;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                i8 = i5 | 3072;
                y0Var2 = y0Var;
            } else {
                y0Var2 = y0Var;
                if (g0Var.g(y0Var2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i8 = i5 | i7;
            }
            if ((i8 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (g0Var.S(i8 & 1, z2)) {
                if (i11 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if (i3 != 0) {
                    x0VarC = w.s0.c((x.y) null, 3);
                } else {
                    x0VarC = x0Var2;
                }
                if (i6 != 0) {
                    w.x0 x0Var5 = x0VarC;
                    y0VarD = w.s0.d((x.y) null, 3);
                    x0Var4 = x0Var5;
                } else {
                    x0Var4 = x0VarC;
                    y0VarD = y0Var2;
                }
                w.c0.c(z, rVar4, x0Var4, y0VarD, (String) null, cVar, g0Var, (i8 & 8190) | 196608, 16);
                rVar3 = rVar4;
                x0Var3 = x0Var4;
                y0Var3 = y0VarD;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                x0Var3 = x0Var2;
                y0Var3 = y0Var2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new ct.w(z, rVar3, x0Var3, y0Var3, cVar, i, i2);
            }
        }
        i9 |= 48;
        rVar2 = rVar;
        i3 = i2 & 4;
        if (i3 != 0) {
            i5 = i9 | 384;
            x0Var2 = x0Var;
        } else {
            x0Var2 = x0Var;
            if (g0Var.g(x0Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i5 = i9 | i4;
        }
        i6 = i2 & 8;
        if (i6 != 0) {
            i8 = i5 | 3072;
            y0Var2 = y0Var;
        } else {
            y0Var2 = y0Var;
            if (g0Var.g(y0Var2)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i8 = i5 | i7;
        }
        if ((i8 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (g0Var.S(i8 & 1, z2)) {
            if (i11 != 0) {
                rVar4 = b2.o.A;
            } else {
                rVar4 = rVar2;
            }
            if (i3 != 0) {
                x0VarC = w.s0.c((x.y) null, 3);
            } else {
                x0VarC = x0Var2;
            }
            if (i6 != 0) {
                w.x0 x0Var6 = x0VarC;
                y0VarD = w.s0.d((x.y) null, 3);
                x0Var4 = x0Var6;
            } else {
                x0Var4 = x0VarC;
                y0VarD = y0Var2;
            }
            w.c0.c(z, rVar4, x0Var4, y0VarD, (String) null, cVar, g0Var, (i8 & 8190) | 196608, 16);
            rVar3 = rVar4;
            x0Var3 = x0Var4;
            y0Var3 = y0VarD;
        } else {
            g0Var.V();
            rVar3 = rVar2;
            x0Var3 = x0Var2;
            y0Var3 = y0Var2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.w(z, rVar3, x0Var3, y0Var3, cVar, i, i2);
        }
    }

    public static final void u(jk.a backdrop, long j, u00.a onClick, b2.r rVar, l1.j jVar, int i) {
        int i2;
        b2.r rVar2;
        kotlin.jvm.internal.m.e(backdrop, "backdrop");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1598223006);
        if ((i & 6) == 0) {
            i2 = (g0Var.i(backdrop) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.i(onClick) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (g0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            p0.e eVar = p0.f.a;
            y3.f fVar = new y3.f(38);
            b2.r rVar3 = b2.o.A;
            w50.c.f(onClick, backdrop, rVar3, false, false, 0.0f, fVar, 0L, j, 32, eVar, 0, a, g0Var, ((i3 >> 6) & 14) | 806879232 | ((i3 << 3) & 112) | ((i3 >> 3) & 896) | ((i3 << 21) & 234881024), 432, 184);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l0(backdrop, j, onClick, rVar2, i);
        }
    }

    public static final void v(u00.a aVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1692679935);
        int i2 = (g0Var.i(aVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            androidx.lifecycle.f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ev.c0 c0Var = (ev.c0) c7.i.S(kotlin.jvm.internal.a0.a.b(ev.c0.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(g0Var), (u00.a) null);
            l1.z0 z0VarQ = k00.f.q(c0Var.c.d, g0Var, 0);
            boolean zG = g0Var.g(c0Var) | ((i2 & 14) == 4);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zG || objN == obj) {
                objN = new g6.a(c0Var, aVar, (k00.c) null, 1);
                g0Var.n0(objN);
            }
            l1.q.i(c0Var, g0Var, (u00.n) objN);
            boolean zG2 = g0Var.g(c0Var);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == obj) {
                objN2 = new m0(c0Var, 0);
                g0Var.n0(objN2);
            }
            qd.s0.G((u00.a) objN2, new c4.v(3, false), v1.d.d(-1993686376, new al.i(c0Var, z0VarQ, 20), g0Var), g0Var, 432, 0);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.d(aVar, i, 13);
        }
    }

    public static final void w(u00.a onDismiss, l1.j jVar, int i) {
        kotlin.jvm.internal.m.e(onDismiss, "onDismiss");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1907411190);
        int i2 = (g0Var.i(onDismiss) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = new n0();
                g0Var.n0(objN);
            }
            n0 n0Var = (n0) objN;
            boolean zI = g0Var.i(n0Var);
            Object objN2 = g0Var.N();
            if (zI || objN2 == obj) {
                objN2 = new a1.e1(n0Var, 26);
                g0Var.n0(objN2);
            }
            l1.q.e(g00.b0.a, (u00.k) objN2, g0Var);
            l1.q.a(u6.a.a.a(n0Var), v1.d.d(1850530870, new eu.d(11, onDismiss), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.d(onDismiss, i, 12);
        }
    }

    public static final void x(final boolean z, final ru.d selectedOption, final u00.a onDismissRequest, final u00.k onOptionSelected, int i, u30.b bVar, l1.j jVar, final int i2, final int i3) {
        int i4;
        int i5;
        u30.b bVar2;
        final int i6;
        final u30.b bVar3;
        kotlin.jvm.internal.m.e(selectedOption, "selectedOption");
        kotlin.jvm.internal.m.e(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.e(onOptionSelected, "onOptionSelected");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1794053459);
        if ((i2 & 6) == 0) {
            i4 = (g0Var.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= g0Var.e(selectedOption.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= g0Var.i(onDismissRequest) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= g0Var.i(onOptionSelected) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                i5 = i;
                int i7 = g0Var.e(i5) ? 16384 : 8192;
                i4 |= i7;
            } else {
                i5 = i;
            }
            i4 |= i7;
        } else {
            i5 = i;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                bVar2 = bVar;
                int i8 = g0Var.g(bVar2) ? 131072 : 65536;
                i4 |= i8;
            } else {
                bVar2 = bVar;
            }
            i4 |= i8;
        } else {
            bVar2 = bVar;
        }
        if (g0Var.S(i4 & 1, (74899 & i4) != 74898)) {
            g0Var.X();
            if ((i2 & 1) == 0 || g0Var.A()) {
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                    i5 = 2131887281;
                }
                if ((i3 & 32) != 0) {
                    ru.d.B.getClass();
                    bVar2 = ru.d.C;
                    i4 &= -458753;
                }
            } else {
                g0Var.V();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
            }
            u30.b bVar4 = bVar2;
            int i9 = i4;
            int i11 = i5;
            g0Var.s();
            jl.c.b(z, onDismissRequest, dl.a.K, p0.f.a(16), null, (((long) Float.floatToRawIntBits(0)) << 32) | (((long) Float.floatToRawIntBits(4)) & 4294967295L), false, null, v1.d.d(-1828863488, new p0(bVar4, i11, selectedOption, onOptionSelected), g0Var), g0Var, (i9 & 14) | 100859904 | ((i9 >> 3) & 112), 208);
            i6 = i11;
            bVar3 = bVar4;
        } else {
            g0Var.V();
            i6 = i5;
            bVar3 = bVar2;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p.x(z, selectedOption, onDismissRequest, onOptionSelected, i6, bVar3, (l1.j) obj, l1.q.K(i2 | 1), i3);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void y(ru.d dVar, int i, boolean z, u00.a aVar, l1.j jVar, int i2) {
        int i3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1065860317);
        int i4 = i2 | (g0Var.e(dVar.ordinal()) ? 4 : 2) | (g0Var.e(i) ? 32 : 16) | (g0Var.h(z) ? 256 : 128) | (g0Var.i(aVar) ? 2048 : 1024);
        if (g0Var.S(i4 & 1, (i4 & 1171) != 1170)) {
            b2.o oVar = b2.o.A;
            b2.r rVarD = h0.c.D(w50.c.o(h0.z1.d(oVar, 1.0f), false, null, aVar, 7), 4, 10);
            h0.v1 v1VarA = h0.t1.a(h0.i.g, b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
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
            switch (dVar.ordinal()) {
                case 0:
                    i3 = 2131887280;
                    break;
                case 1:
                    i3 = 2131887276;
                    break;
                case 2:
                    i3 = 2131887278;
                    break;
                case 3:
                    i3 = 2131887272;
                    break;
                case 4:
                    i3 = 2131887273;
                    break;
                case 5:
                    i3 = 2131887275;
                    break;
                case 6:
                    i3 = 2131887277;
                    break;
                case 7:
                    i3 = 2131887274;
                    break;
                case 8:
                    i3 = i;
                    break;
                case 9:
                    i3 = 2131886150;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            z6.b(z3.U(g0Var, i3), (b2.r) null, dl.a.k, kh.o.z(14), z ? q3.u.D : q3.u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var, 24576, 0, 262058);
            g0Var = g0Var;
            if (z) {
                g0Var.c0(1470717983);
                o3.a(y3.R(2131231094, g0Var, 0), (String) null, h0.z1.m(oVar, 18), dl.a.i, g0Var, 440, 0);
                g0Var.r(false);
            } else {
                g0Var.c0(1470942857);
                g0Var.r(false);
            }
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ct.h(dVar, i, z, aVar, i2);
        }
    }

    public static final void z(b2.r rVar, l1.j jVar, int i) {
        l1.g0 g0Var;
        b2.r rVar2;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-2089747993);
        int i2 = i | 6;
        if (g0Var2.S(i2 & 1, (i2 & 3) != 2)) {
            String strU = z3.U(g0Var2, 2131887107);
            boolean zG = g0Var2.g(strU);
            Object objN = g0Var2.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                m3.e eVar = new m3.e();
                long j = dl.a.i;
                int iE = eVar.e(new m3.i0(i2.t.b(0.6f, j), 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (i2.s0) null, 65534));
                try {
                    eVar.b(strU);
                    eVar.d(iE);
                    eVar.b(" ");
                    int iE2 = eVar.e(new m3.i0(j, 0L, (q3.u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (x3.l) null, (i2.s0) null, 65534));
                    try {
                        eVar.b("@quranifycom");
                        eVar.d(iE2);
                        objN = eVar.f();
                        g0Var2.n0(objN);
                    } catch (Throwable th) {
                        eVar.d(iE2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    eVar.d(iE);
                    throw th2;
                }
            }
            m3.h hVar = (m3.h) objN;
            float f = 20;
            p0.e eVarA = p0.f.a(f);
            b2.r rVar3 = b2.o.A;
            b2.r rVarD = h0.c.D(z.n.f(f2.h.c(rVar3, eVarA), i2.t.b(0.9f, dl.a.K), i2.b0.b), f, 12);
            Object objN2 = g0Var2.N();
            if (objN2 == cVar) {
                objN2 = new j7(8);
                g0Var2.n0(objN2);
            }
            b2.r rVarC = j3.q.c(rVarD, true, (u00.k) objN2);
            h0.v vVarA = h0.u.a(h0.i.g(4), b2.b.N, g0Var2, 54);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var2);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA, g0Var2, b3.h.f);
            l1.q.I(m1VarM, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC2, g0Var2, b3.h.d);
            z6.b(z3.U(g0Var2, 2131887108), (b2.r) null, dl.a.i, kh.o.z(15), q3.u.L, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var2, 1597440, 0, 261034);
            z6.c(hVar, (b2.r) null, 0L, kh.o.z(13), (q3.u) null, 0L, new x3.k(3), 0L, 0, false, 0, 0, (Map) null, (u00.k) null, (m3.r0) null, g0Var2, 24576, 0, 523246);
            g0Var = g0Var2;
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.b(rVar2, i, 10);
        }
    }
}
