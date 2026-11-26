package bt;

import android.content.Context;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.m6;
import g1.t4;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import l1.p2;

public abstract class a {
    public static final v1.c a = new v1.c(new al.c(11), -1381471085, false);
    public static final v1.c b = new v1.c(new al.c(12), 1099700634, false);

    public static final void a(ys.a aVar, boolean z, float f, b2.r rVar, l1.j jVar, int i, int i2) {
        b2.r rVar2;
        boolean z2;
        b2.r rVar3;
        l1.r1 r1VarT;
        b3.g gVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-224776603);
        int i3 = (g0Var.g(aVar) ? 4 : 2) | i | (g0Var.h(z) ? 32 : 16) | (g0Var.d(f) ? 256 : 128);
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                rVar2 = rVar;
                i3 |= g0Var.g(rVar2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (g0Var.S(i3 & 1, z2)) {
                if (i4 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                b2.r rVarE = h0.c.E(h0.z1.d(rVar3, 1.0f), f, 0.0f, 2);
                h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
                int iHashCode = Long.hashCode(g0Var.T);
                l1.m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarE, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
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
                a.a.b(z3.U(g0Var, 2131886579), 2131231102, (b2.r) null, (u00.a) null, g0Var, 0, 12);
                ct.i.c(aVar, null, z, g0Var, ((i3 << 3) & 896) | (i3 & 14));
                g0Var.r(true);
            } else {
                g0Var.V();
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new r0(aVar, z, f, rVar3, i, i2);
            }
        }
        i3 |= 3072;
        rVar2 = rVar;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (g0Var.S(i3 & 1, z2)) {
            if (i4 != 0) {
                rVar3 = b2.o.A;
            } else {
                rVar3 = rVar2;
            }
            b2.r rVarE2 = h0.c.E(h0.z1.d(rVar3, 1.0f), f, 0.0f, 2);
            h0.v vVarA2 = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            l1.m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE2, g0Var);
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
            a.a.b(z3.U(g0Var, 2131886579), 2131231102, (b2.r) null, (u00.a) null, g0Var, 0, 12);
            ct.i.c(aVar, null, z, g0Var, ((i3 << 3) & 896) | (i3 & 14));
            g0Var.r(true);
        } else {
            g0Var.V();
            rVar3 = rVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new r0(aVar, z, f, rVar3, i, i2);
        }
    }

    public static final void b(final a1 a1Var, final u00.k kVar, l1.j jVar, int i) {
        u00.k kVar2;
        l1.g0 g0Var;
        int i2;
        ?? r5;
        int i3;
        gm.a aVar;
        boolean z;
        l1.g0 g0Var2;
        l1.c cVar;
        Object obj;
        ?? r16;
        ?? r13;
        Object obj2;
        ?? r23;
        int i4;
        boolean z2;
        Object obj3;
        boolean z3;
        Object obj4;
        boolean z4;
        Object obj5;
        boolean z5;
        Object obj6;
        boolean z6;
        Object obj7;
        boolean z7;
        Object obj8;
        Object obj9;
        l1.g0 g0Var3 = (l1.g0) jVar;
        g0Var3.e0(-1267740569);
        int i5 = (g0Var3.g(a1Var) ? 4 : 2) | i | (g0Var3.i(kVar) ? 32 : 16);
        final int i6 = 0;
        if (g0Var3.S(i5 & 1, (i5 & 19) != 18)) {
            h0.n1 n1Var = (h0.n1) g0Var3.k(dq.l.a);
            WeakHashMap weakHashMap = h0.m2.w;
            h0.t0 t0VarL = h0.c.l(h0.b.e(g0Var3).g, g0Var3);
            final gm.a aVar2 = (gm.a) g0Var3.k(dl.e.a);
            final j0.v vVarA = j0.x.a(0, g0Var3, 3);
            final kk.c cVarD = kk.e.d(g0Var3);
            Context context = (Context) g0Var3.k(c3.o0.b);
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) g0Var3.k(r6.d.a);
            Object objN = g0Var3.N();
            l1.c cVar2 = l1.i.a;
            Object obj10 = objN;
            if (objN == cVar2) {
                i7.z zVarA = new i7.l(context).a();
                zVarA.setRepeatMode(1);
                zVarA.setMediaItem(androidx.media3.common.q0.b(Uri.parse("asset:///videos/background/playerBackground.mp4")));
                zVarA.prepare();
                ct.b bVar = new ct.b(zVarA);
                g0Var3.n0(bVar);
                obj10 = bVar;
            }
            final ct.b bVar2 = (ct.b) obj10;
            boolean zI = g0Var3.i(wVar);
            Object objN2 = g0Var3.N();
            int i7 = 5;
            Object obj11 = objN2;
            if (zI || objN2 == cVar2) {
                al.l lVar = new al.l(wVar, bVar2, i7);
                g0Var3.n0(lVar);
                obj11 = lVar;
            }
            l1.q.e(wVar, (u00.k) obj11, g0Var3);
            Object objN3 = g0Var3.N();
            Object obj12 = objN3;
            if (objN3 == cVar2) {
                u00.k kVar3 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj13) {
                        switch (i6) {
                            case 0:
                                l1.z DisposableEffect = (l1.z) obj13;
                                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                                return new e(bVar2, 0);
                            case 1:
                                l1.z DisposableEffect2 = (l1.z) obj13;
                                kotlin.jvm.internal.m.e(DisposableEffect2, "$this$DisposableEffect");
                                b bVar3 = bVar2;
                                bVar3.b = true;
                                i7.z zVar = bVar3.a;
                                if (bVar3.c) {
                                    zVar.play();
                                } else {
                                    zVar.pause();
                                }
                                return new e(bVar3, 1);
                            case 2:
                                Context context2 = (Context) obj13;
                                kotlin.jvm.internal.m.e(context2, "context");
                                PlayerView playerViewInflate = LayoutInflater.from(context2).inflate(2131558429, (ViewGroup) null);
                                kotlin.jvm.internal.m.c(playerViewInflate, "null cannot be cast to non-null type androidx.media3.ui.PlayerView");
                                PlayerView playerView = playerViewInflate;
                                playerView.setPlayer(bVar2.a);
                                playerView.setClipToOutline(true);
                                playerView.setRenderEffect(RenderEffect.createBlurEffect(32.0f, 32.0f, Shader.TileMode.CLAMP));
                                return playerView;
                            default:
                                PlayerView playerView2 = (PlayerView) obj13;
                                kotlin.jvm.internal.m.e(playerView2, "playerView");
                                i7.z player = playerView2.getPlayer();
                                i7.z zVar2 = bVar2.a;
                                if (player != zVar2) {
                                    playerView2.setPlayer(zVar2);
                                }
                                return g00.b0.a;
                        }
                    }
                };
                g0Var3.n0(kVar3);
                obj12 = kVar3;
            }
            l1.q.e(g00.b0.a, (u00.k) obj12, g0Var3);
            p2 p2VarB = sm.a.b(vVarA, g0Var3);
            Object objN4 = g0Var3.N();
            Object obj13 = objN4;
            if (objN4 == cVar2) {
                a40.z zVarO = l1.q.o(g0Var3);
                g0Var3.n0(zVarO);
                obj13 = zVarO;
            }
            a40.z zVar = (a40.z) obj13;
            m6 m6VarF = t4.f(true, (u00.k) null, g0Var3, 6, 2);
            j1.r rVarD = j1.k.d(g0Var3);
            boolean zE = g0Var3.e(aVar2.ordinal());
            Object objN5 = g0Var3.N();
            Object objT = objN5;
            if (zE || objN5 == cVar2) {
                int iOrdinal = aVar2.ordinal();
                if (iOrdinal == 0) {
                    i2 = 16;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 0;
                }
                objT = oi.k.t(i2, g0Var3);
            }
            final float f = ((y3.f) objT).A;
            Object objN6 = g0Var3.N();
            Object obj14 = objN6;
            if (objN6 == cVar2) {
                l1.i1 i1VarZ = l1.q.z(Boolean.FALSE);
                g0Var3.n0(i1VarZ);
                obj14 = i1VarZ;
            }
            boolean zG = g0Var3.g(n1Var);
            Object objN7 = g0Var3.N();
            Object obj15 = objN7;
            if (zG || objN7 == cVar2) {
                h0.p1 p1VarG = h0.c.g(0.0f, t0VarL.c() + n1Var.c() + (aVar2 == gm.a.A ? 44 : 32), 0.0f, t0VarL.a() + n1Var.a(), 5);
                g0Var3.n0(p1VarG);
                obj15 = p1VarG;
            }
            final h0.n1 n1Var2 = (h0.n1) obj15;
            h0.a0 a0Var = h0.z1.c;
            b2.r rVarF = z.n.f(a0Var, dl.a.L, i2.b0.b);
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var3.T);
            l1.m1 m1VarM = g0Var3.m();
            b2.r rVarC = b2.a.c(rVarF, g0Var3);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            l1.q.I(w0VarD, g0Var3, b3.h.f);
            l1.q.I(m1VarM, g0Var3, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var3, b3.h.g);
            l1.q.E(g0Var3, b3.h.h);
            l1.q.I(rVarC, g0Var3, b3.h.d);
            boolean z8 = a1Var.v;
            int i8 = i5 & 112;
            boolean z9 = i8 == 32;
            Object objN8 = g0Var3.N();
            Object obj16 = objN8;
            if (z9 || objN8 == cVar2) {
                as.e0 e0Var = new as.e0(26, kVar);
                g0Var3.n0(e0Var);
                obj16 = e0Var;
            }
            j1.k.b(z8, (u00.a) obj16, a0Var, rVarD, (b2.d) null, v1.d.d(621640424, new az.j(a1Var, n1Var2, rVarD, 1), g0Var3), v1.d.d(1803873159, new u00.o() {
                @Override
                public final Object invoke(Object obj17, Object obj18, Object obj19) {
                    h0.r PullToRefreshBox = (h0.r) obj17;
                    l1.g0 g0Var4 = (l1.j) obj18;
                    int iIntValue = ((Integer) obj19).intValue();
                    kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                    l1.g0 g0Var5 = g0Var4;
                    if (g0Var5.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b2.r rVarV = kk.e.a(b2.o.A, cVarD).V(h0.z1.c);
                        gm.a aVar3 = gm.a.B;
                        gm.a aVar4 = aVar2;
                        b2.r rVarE = h0.c.E(rVarV, aVar4 == aVar3 ? 24 : 0, 0.0f, 2);
                        gm.a aVar5 = gm.a.A;
                        h0.n1 n1Var3 = n1Var2;
                        h0.p1 p1VarG2 = h0.c.g(0.0f, aVar4 == aVar5 ? 0 : n1Var3.c(), 0.0f, n1Var3.a(), 5);
                        boolean zE2 = g0Var5.e(aVar4.ordinal()) | g0Var5.g(n1Var3);
                        a1 a1Var2 = a1Var;
                        boolean zG2 = zE2 | g0Var5.g(a1Var2);
                        u00.k kVar4 = kVar;
                        boolean zG3 = zG2 | g0Var5.g(kVar4);
                        ct.b bVar3 = bVar2;
                        boolean zG4 = zG3 | g0Var5.g(bVar3);
                        float f2 = f;
                        boolean zD = zG4 | g0Var5.d(f2);
                        Object objN9 = g0Var5.N();
                        if (zD || objN9 == l1.i.a) {
                            objN9 = new l0(a1Var2, aVar4, n1Var3, kVar4, bVar3, f2);
                            g0Var5.n0(objN9);
                        }
                        k00.f.d(rVarE, vVarA, p1VarG2, null, null, null, false, null, (u00.k) objN9, g0Var4, 0, 504);
                    } else {
                        g0Var5.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var3), g0Var3, 1769856);
            b2.i iVar = b2.b.B;
            h0.s sVar = h0.s.a;
            b2.o oVar = b2.o.A;
            sm.a.a(z3.U(g0Var3, 2131886606), ((Number) p2VarB.getValue()).floatValue(), sVar.a(oVar, iVar), 0.0f, g0Var3, 0);
            if (aVar2 == gm.a.A) {
                g0Var3.c0(-270070277);
                b2.r rVarM = h0.c.M(h0.c.E(oVar, 16, 0.0f, 2), h0.c.e);
                p0.e eVar = p0.f.a;
                float f2 = 0;
                float f3 = 44;
                long jB = i2.t.b(0.5f, dl.a.P);
                boolean z11 = i8 == 32;
                Object objN9 = g0Var3.N();
                if (z11 || objN9 == cVar2) {
                    z = true;
                    t0 t0Var = new t0(1, kVar);
                    g0Var3.n0(t0Var);
                    obj9 = t0Var;
                } else {
                    z = true;
                    obj9 = objN9;
                }
                r5 = 0;
                i3 = i8;
                aVar = aVar2;
                w50.c.f((u00.a) obj9, cVarD, rVarM, false, false, 0.0f, new y3.f(f3), 0L, jB, 10.0f, eVar, f2, b, g0Var3, 806879232, 432, 184);
                g0Var2 = g0Var3;
                g0Var2.r(false);
            } else {
                r5 = 0;
                i3 = i8;
                aVar = aVar2;
                z = true;
                g0Var2 = g0Var3;
                g0Var2.c0(-269378047);
                g0Var2.r(false);
            }
            g0Var2.c0(-268517983);
            g0Var2.r((boolean) r5);
            g0Var2.r(z);
            ?? r15 = aVar == gm.a.B ? z : r5;
            boolean z12 = a1Var.i;
            ?? r11 = (g0Var2.i((Object) r33) ? 1 : 0) | (g0Var2.g((Object) r16) ? 1 : 0) | (i3 == 32 ? z : r5);
            Object objN10 = g0Var2.N();
            if (r11 == 0) {
                cVar = cVar2;
                obj = objN10;
                if (objN10 == cVar) {
                }
                u00.k kVar4 = (u00.k) obj;
                int i9 = (g0Var2.i((Object) r33) ? 1 : 0) | (g0Var2.g((Object) r16) ? 1 : 0);
                if (i3 == 32) {
                    r16 = z;
                } else {
                    r16 = r5;
                }
                r13 = i9 | r16;
                Object objN11 = g0Var2.N();
                obj2 = objN11;
                if (r13 == 0 || objN11 == cVar) {
                    j0 j0Var = new j0(zVar, r16, kVar2, r5);
                    g0Var2.n0(j0Var);
                    obj2 = j0Var;
                }
                u00.a aVar3 = (u00.a) obj2;
                r23 = r5;
                i4 = i3;
                g0Var = g0Var2;
                ca.v.a(z12, kVar4, aVar3, m6VarF, g0Var, 0);
                if (a1Var.j == null) {
                    g0Var.c0(-1599765025);
                    g0Var.r((boolean) r23);
                } else {
                    g0Var.c0(-1599765024);
                    if (r15 != 0) {
                        g0Var.c0(2080070287);
                        if (i4 == 32) {
                            z5 = z;
                        } else {
                            z5 = r23 == true ? 1 : 0;
                        }
                        Object objN12 = g0Var.N();
                        obj6 = objN12;
                        if (z5 || objN12 == cVar) {
                            as.e0 e0Var2 = new as.e0(17, kVar2);
                            g0Var.n0(e0Var2);
                            obj6 = e0Var2;
                        }
                        u00.a aVar4 = (u00.a) obj6;
                        if (i4 == 32) {
                            z6 = z;
                        } else {
                            z6 = r23 == true ? 1 : 0;
                        }
                        Object objN13 = g0Var.N();
                        obj7 = objN13;
                        if (z6 || objN13 == cVar) {
                            as.e0 e0Var3 = new as.e0(18, kVar2);
                            g0Var.n0(e0Var3);
                            obj7 = e0Var3;
                        }
                        u00.a aVar5 = (u00.a) obj7;
                        if (i4 == 32) {
                            z7 = z;
                        } else {
                            z7 = r23 == true ? 1 : 0;
                        }
                        Object objN14 = g0Var.N();
                        obj8 = objN14;
                        if (z7 || objN14 == cVar) {
                            as.e0 e0Var4 = new as.e0(19, kVar2);
                            g0Var.n0(e0Var4);
                            obj8 = e0Var4;
                        }
                        tp.h.b(aVar4, aVar5, (u00.a) obj8, g0Var, r23 == true ? 1 : 0);
                        g0Var.r((boolean) r23);
                    } else {
                        g0Var.c0(2080495824);
                        if (i4 == 32) {
                            z2 = z;
                        } else {
                            z2 = r23 == true ? 1 : 0;
                        }
                        Object objN15 = g0Var.N();
                        obj3 = objN15;
                        if (z2 || objN15 == cVar) {
                            as.e0 e0Var5 = new as.e0(20, kVar2);
                            g0Var.n0(e0Var5);
                            obj3 = e0Var5;
                        }
                        u00.a aVar6 = (u00.a) obj3;
                        if (i4 == 32) {
                            z3 = z;
                        } else {
                            z3 = r23 == true ? 1 : 0;
                        }
                        Object objN16 = g0Var.N();
                        obj4 = objN16;
                        if (z3 || objN16 == cVar) {
                            as.e0 e0Var6 = new as.e0(29, kVar2);
                            g0Var.n0(e0Var6);
                            obj4 = e0Var6;
                        }
                        u00.a aVar7 = (u00.a) obj4;
                        if (i4 == 32) {
                            z4 = z;
                        } else {
                            z4 = r23 == true ? 1 : 0;
                        }
                        Object objN17 = g0Var.N();
                        obj5 = objN17;
                        if (z4 || objN17 == cVar) {
                            t0 t0Var2 = new t0(r23 == true ? 1 : 0, kVar2);
                            g0Var.n0(t0Var2);
                            obj5 = t0Var2;
                        }
                        tp.h.a(aVar6, aVar7, (u00.a) obj5, g0Var, r23 == true ? 1 : 0);
                        g0Var.r((boolean) r23);
                    }
                    g0Var.r((boolean) r23);
                }
            } else {
                cVar = cVar2;
            }
            i0 i0Var = new i0(r33, r16, kVar, r5);
            g0Var2.n0(i0Var);
            obj = i0Var;
            u00.k kVar5 = (u00.k) obj;
            int i11 = (g0Var2.i((Object) r33) ? 1 : 0) | (g0Var2.g((Object) r16) ? 1 : 0);
            if (i3 == 32) {
                r16 = z;
            } else {
                r16 = r5;
            }
            r13 = i11 | r16;
            Object objN18 = g0Var2.N();
            obj2 = objN18;
            if (r13 == 0) {
                j0 j0Var2 = new j0(zVar, r16, kVar2, r5);
                g0Var2.n0(j0Var2);
                obj2 = j0Var2;
            } else {
                j0 j0Var3 = new j0(zVar, r16, kVar2, r5);
                g0Var2.n0(j0Var3);
                obj2 = j0Var3;
            }
            u00.a aVar8 = (u00.a) obj2;
            r23 = r5;
            i4 = i3;
            g0Var = g0Var2;
            ca.v.a(z12, kVar5, aVar8, m6VarF, g0Var, 0);
            if (a1Var.j == null) {
                g0Var.c0(-1599765025);
                g0Var.r((boolean) r23);
            } else {
                g0Var.c0(-1599765024);
                if (r15 != 0) {
                    g0Var.c0(2080070287);
                    if (i4 == 32) {
                        z5 = z;
                    } else {
                        z5 = r23 == true ? 1 : 0;
                    }
                    Object objN19 = g0Var.N();
                    obj6 = objN19;
                    if (z5) {
                        as.e0 e0Var7 = new as.e0(17, kVar2);
                        g0Var.n0(e0Var7);
                        obj6 = e0Var7;
                    } else {
                        as.e0 e0Var8 = new as.e0(17, kVar2);
                        g0Var.n0(e0Var8);
                        obj6 = e0Var8;
                    }
                    u00.a aVar9 = (u00.a) obj6;
                    if (i4 == 32) {
                        z6 = z;
                    } else {
                        z6 = r23 == true ? 1 : 0;
                    }
                    Object objN110 = g0Var.N();
                    obj7 = objN110;
                    if (z6) {
                        as.e0 e0Var9 = new as.e0(18, kVar2);
                        g0Var.n0(e0Var9);
                        obj7 = e0Var9;
                    } else {
                        as.e0 e0Var10 = new as.e0(18, kVar2);
                        g0Var.n0(e0Var10);
                        obj7 = e0Var10;
                    }
                    u00.a aVar10 = (u00.a) obj7;
                    if (i4 == 32) {
                        z7 = z;
                    } else {
                        z7 = r23 == true ? 1 : 0;
                    }
                    Object objN111 = g0Var.N();
                    obj8 = objN111;
                    if (z7) {
                        as.e0 e0Var11 = new as.e0(19, kVar2);
                        g0Var.n0(e0Var11);
                        obj8 = e0Var11;
                    } else {
                        as.e0 e0Var12 = new as.e0(19, kVar2);
                        g0Var.n0(e0Var12);
                        obj8 = e0Var12;
                    }
                    tp.h.b(aVar9, aVar10, (u00.a) obj8, g0Var, r23 == true ? 1 : 0);
                    g0Var.r((boolean) r23);
                } else {
                    g0Var.c0(2080495824);
                    if (i4 == 32) {
                        z2 = z;
                    } else {
                        z2 = r23 == true ? 1 : 0;
                    }
                    Object objN112 = g0Var.N();
                    obj3 = objN112;
                    if (z2) {
                        as.e0 e0Var13 = new as.e0(20, kVar2);
                        g0Var.n0(e0Var13);
                        obj3 = e0Var13;
                    } else {
                        as.e0 e0Var14 = new as.e0(20, kVar2);
                        g0Var.n0(e0Var14);
                        obj3 = e0Var14;
                    }
                    u00.a aVar11 = (u00.a) obj3;
                    if (i4 == 32) {
                        z3 = z;
                    } else {
                        z3 = r23 == true ? 1 : 0;
                    }
                    Object objN113 = g0Var.N();
                    obj4 = objN113;
                    if (z3) {
                        as.e0 e0Var15 = new as.e0(29, kVar2);
                        g0Var.n0(e0Var15);
                        obj4 = e0Var15;
                    } else {
                        as.e0 e0Var16 = new as.e0(29, kVar2);
                        g0Var.n0(e0Var16);
                        obj4 = e0Var16;
                    }
                    u00.a aVar12 = (u00.a) obj4;
                    if (i4 == 32) {
                        z4 = z;
                    } else {
                        z4 = r23 == true ? 1 : 0;
                    }
                    Object objN114 = g0Var.N();
                    obj5 = objN114;
                    if (z4) {
                        t0 t0Var3 = new t0(r23 == true ? 1 : 0, kVar2);
                        g0Var.n0(t0Var3);
                        obj5 = t0Var3;
                    } else {
                        t0 t0Var4 = new t0(r23 == true ? 1 : 0, kVar2);
                        g0Var.n0(t0Var4);
                        obj5 = t0Var4;
                    }
                    tp.h.a(aVar11, aVar12, (u00.a) obj5, g0Var, r23 == true ? 1 : 0);
                    g0Var.r((boolean) r23);
                }
                g0Var.r((boolean) r23);
            }
        } else {
            kVar2 = kVar;
            g0Var = g0Var3;
            a1Var = a1Var;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new al.i(a1Var, kVar2, i, 3);
        }
    }

    public static final void c(a1 a1Var, gm.a aVar, final float f, final u00.k kVar, b2.r rVar, l1.j jVar, final int i, final int i2) {
        b2.r rVar2;
        boolean z;
        gm.a aVar2;
        final b2.r rVar3;
        l1.r1 r1VarT;
        b2.r rVar4;
        b2.r rVar5;
        y3.c cVar;
        h0.d dVar;
        b2.g gVar;
        b3.g gVar2;
        b3.f fVar;
        b3.f fVar2;
        b3.f fVar3;
        b3.e eVar;
        b3.f fVar4;
        h0.x1 x1Var;
        boolean z2;
        Object objN;
        Object obj;
        gm.a aVar3;
        a1 a1Var2;
        gm.a aVar4;
        Object objN2;
        l1.z0 z0Var;
        boolean zG;
        Object objN3;
        boolean z3;
        ys.m mVar;
        ys.a aVar5;
        final a1 a1Var3 = a1Var;
        l1.j jVar2 = (l1.g0) jVar;
        jVar2.e0(600230434);
        int i3 = (jVar2.g(a1Var3) ? 4 : 2) | i | (jVar2.e(aVar.ordinal()) ? 32 : 16) | (jVar2.d(f) ? 256 : 128) | (jVar2.i(kVar) ? 2048 : 1024);
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                rVar2 = rVar;
                i3 |= jVar2.g(rVar2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (jVar2.S(i3 & 1, z)) {
                rVar4 = b2.o.A;
                if (i4 != 0) {
                    rVar5 = rVar4;
                } else {
                    rVar5 = rVar2;
                }
                cVar = (y3.c) jVar2.k(c3.o1.h);
                b2.r rVarD = h0.z1.d(rVar5, 1.0f);
                dVar = h0.i.c;
                gVar = b2.b.M;
                h0.v vVarA = h0.u.a(dVar, gVar, jVar2, 0);
                int iHashCode = Long.hashCode(((l1.g0) jVar2).T);
                l1.m1 m1VarM = jVar2.m();
                b2.r rVarC = b2.a.c(rVarD, jVar2);
                b3.i.c.getClass();
                gVar2 = b3.h.b;
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar2);
                } else {
                    jVar2.q0();
                }
                fVar = b3.h.f;
                l1.q.I(vVarA, jVar2, fVar);
                fVar2 = b3.h.e;
                l1.q.I(m1VarM, jVar2, fVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                fVar3 = b3.h.g;
                l1.q.I(numValueOf, jVar2, fVar3);
                eVar = b3.h.h;
                l1.q.E(jVar2, eVar);
                b2.r rVar6 = rVar5;
                fVar4 = b3.h.d;
                l1.q.I(rVarC, jVar2, fVar4);
                b2.r rVarE = h0.c.E(h0.z1.d(rVar4, 1.0f), f, 0.0f, 2);
                float f2 = 24;
                h0.f fVarG = h0.i.g(f2);
                b2.h hVar = b2.b.J;
                h0.v1 v1VarA = h0.t1.a(fVarG, hVar, jVar2, 6);
                int iHashCode2 = Long.hashCode(((l1.g0) jVar2).T);
                l1.m1 m1VarM2 = jVar2.m();
                b2.r rVarC2 = b2.a.c(rVarE, jVar2);
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar2);
                } else {
                    jVar2.q0();
                }
                l1.q.I(v1VarA, jVar2, fVar);
                l1.q.I(m1VarM2, jVar2, fVar2);
                a1.b.v(iHashCode2, jVar2, fVar3, jVar2, eVar);
                l1.q.I(rVarC2, jVar2, fVar4);
                x1Var = h0.x1.a;
                b2.r rVarA = x1Var.a(rVar4);
                String strU = z3.U(jVar2, 2131886581);
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objN = jVar2.N();
                obj = l1.i.a;
                if (z2 || objN == obj) {
                    objN = new as.e0(24, kVar);
                    jVar2.n0(objN);
                }
                int i5 = i3;
                a.a.b(strU, 2131231102, rVarA, (u00.a) objN, jVar2, 0, 0);
                aVar3 = gm.a.B;
                if (aVar == aVar3) {
                    jVar2.c0(-1099392136);
                    if (a1Var.u && a1Var.n == null) {
                        jVar2.c0(-1099037000);
                        h0.c.h(x1Var.a(rVar4), jVar2);
                        jVar2.r(false);
                        aVar4 = aVar3;
                        a1Var2 = a1Var;
                    } else {
                        jVar2.c0(-1099300593);
                        a1Var2 = a1Var;
                        aVar4 = aVar3;
                        a.a.b(z3.U(jVar2, 2131886621), 2131231190, x1Var.a(rVar4), (u00.a) null, jVar2, 0, 8);
                        jVar2.r(false);
                    }
                    jVar2.r(false);
                } else {
                    a1Var2 = a1Var;
                    aVar4 = aVar3;
                    jVar2.c0(-1098948154);
                    jVar2.r(false);
                }
                jVar2.r(true);
                b2.r rVarE2 = h0.c.E(h0.z1.d(rVar4, 1.0f), f, 0.0f, 2);
                h0.v1 v1VarA2 = h0.t1.a(h0.i.g(f2), hVar, jVar2, 6);
                int iHashCode3 = Long.hashCode(((l1.g0) jVar2).T);
                l1.m1 m1VarM3 = jVar2.m();
                b2.r rVarC3 = b2.a.c(rVarE2, jVar2);
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar2);
                } else {
                    jVar2.q0();
                }
                l1.q.I(v1VarA2, jVar2, fVar);
                l1.q.I(m1VarM3, jVar2, fVar2);
                a1.b.v(iHashCode3, jVar2, fVar3, jVar2, eVar);
                l1.q.I(rVarC3, jVar2, fVar4);
                objN2 = jVar2.N();
                if (objN2 == obj) {
                    objN2 = x5.s(0, jVar2);
                }
                z0Var = (l1.z0) objN2;
                b2.r rVarA2 = x1Var.a(rVar4);
                zG = jVar2.g(cVar);
                objN3 = jVar2.N();
                if (zG || objN3 == obj) {
                    objN3 = new as.f0(cVar, z0Var, 3);
                    jVar2.n0(objN3);
                }
                a10.h0.d(a1Var2.p, a1Var2.q, a1Var2.r, a1Var2.s, a1Var2.e, a1Var2.f, kVar, z2.d0.o(rVarA2, (u00.k) objN3), jVar2, (i5 << 9) & 3670016);
                aVar2 = aVar;
                if (aVar2 == aVar4) {
                    jVar2.c0(-2021911850);
                    b2.r rVarE3 = h0.z1.e(x1Var.a(rVar4), ((y3.f) z0Var.getValue()).A);
                    h0.v vVarA2 = h0.u.a(dVar, gVar, jVar2, 0);
                    int iHashCode4 = Long.hashCode(((l1.g0) jVar2).T);
                    l1.m1 m1VarM4 = jVar2.m();
                    b2.r rVarC4 = b2.a.c(rVarE3, jVar2);
                    jVar2.g0();
                    if (((l1.g0) jVar2).S) {
                        jVar2.l(gVar2);
                    } else {
                        jVar2.q0();
                    }
                    l1.q.I(vVarA2, jVar2, fVar);
                    l1.q.I(m1VarM4, jVar2, fVar2);
                    a1.b.v(iHashCode4, jVar2, fVar3, jVar2, eVar);
                    l1.q.I(rVarC4, jVar2, fVar4);
                    a1Var3 = a1Var;
                    if (a1Var3.u) {
                        jVar2.c0(1125669277);
                        z3 = true;
                        y3.f(h0.w.a(rVar4, 1.0f), true, jVar2, 48, 0);
                        jVar2.r(false);
                        jVar2 = jVar2;
                    } else {
                        z3 = true;
                        jVar2.c0(1125948959);
                        mVar = a1Var3.n;
                        if (mVar == null) {
                            jVar2.c0(1125948958);
                            jVar2.r(false);
                            jVar2 = jVar2;
                        } else {
                            jVar2.c0(1125948959);
                            jVar2 = jVar2;
                            z3.i(mVar, h0.w.a(rVar4, 1.0f), true, jVar2, 384, 0);
                            jVar2.r(false);
                        }
                        jVar2.r(false);
                    }
                    a.a.b(z3.U(jVar2, 2131886579), 2131231102, (b2.r) null, (u00.a) null, jVar2, 0, 12);
                    aVar5 = a1Var3.o;
                    if (aVar5 == null) {
                        jVar2.c0(1126550358);
                        jVar2.r(false);
                    } else {
                        jVar2.c0(1126550359);
                        ct.i.c(aVar5, null, a1Var3.t, jVar2, 0);
                        jVar2.r(false);
                    }
                    jVar2.r(z3);
                    jVar2.r(false);
                } else {
                    z3 = true;
                    a1Var3 = a1Var;
                    jVar2 = jVar2;
                    jVar2.c0(-2020565489);
                    jVar2.r(false);
                }
                jVar2.r(z3);
                jVar2.r(z3);
                rVar3 = rVar6;
            } else {
                aVar2 = aVar;
                jVar2.V();
                rVar3 = rVar2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                final gm.a aVar6 = aVar2;
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        a.c(a1Var3, aVar6, f, kVar, rVar3, (l1.j) obj2, l1.q.K(i | 1), i2);
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
        if (jVar2.S(i3 & 1, z)) {
            rVar4 = b2.o.A;
            if (i4 != 0) {
                rVar5 = rVar4;
            } else {
                rVar5 = rVar2;
            }
            cVar = (y3.c) jVar2.k(c3.o1.h);
            b2.r rVarD2 = h0.z1.d(rVar5, 1.0f);
            dVar = h0.i.c;
            gVar = b2.b.M;
            h0.v vVarA3 = h0.u.a(dVar, gVar, jVar2, 0);
            int iHashCode5 = Long.hashCode(((l1.g0) jVar2).T);
            l1.m1 m1VarM5 = jVar2.m();
            b2.r rVarC5 = b2.a.c(rVarD2, jVar2);
            b3.i.c.getClass();
            gVar2 = b3.h.b;
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(gVar2);
            } else {
                jVar2.q0();
            }
            fVar = b3.h.f;
            l1.q.I(vVarA3, jVar2, fVar);
            fVar2 = b3.h.e;
            l1.q.I(m1VarM5, jVar2, fVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode5);
            fVar3 = b3.h.g;
            l1.q.I(numValueOf2, jVar2, fVar3);
            eVar = b3.h.h;
            l1.q.E(jVar2, eVar);
            b2.r rVar7 = rVar5;
            fVar4 = b3.h.d;
            l1.q.I(rVarC5, jVar2, fVar4);
            b2.r rVarE4 = h0.c.E(h0.z1.d(rVar4, 1.0f), f, 0.0f, 2);
            float f3 = 24;
            h0.f fVarG2 = h0.i.g(f3);
            b2.h hVar2 = b2.b.J;
            h0.v1 v1VarA3 = h0.t1.a(fVarG2, hVar2, jVar2, 6);
            int iHashCode6 = Long.hashCode(((l1.g0) jVar2).T);
            l1.m1 m1VarM6 = jVar2.m();
            b2.r rVarC6 = b2.a.c(rVarE4, jVar2);
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(gVar2);
            } else {
                jVar2.q0();
            }
            l1.q.I(v1VarA3, jVar2, fVar);
            l1.q.I(m1VarM6, jVar2, fVar2);
            a1.b.v(iHashCode6, jVar2, fVar3, jVar2, eVar);
            l1.q.I(rVarC6, jVar2, fVar4);
            x1Var = h0.x1.a;
            b2.r rVarA3 = x1Var.a(rVar4);
            String strU2 = z3.U(jVar2, 2131886581);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            objN = jVar2.N();
            obj = l1.i.a;
            if (z2) {
                objN = new as.e0(24, kVar);
                jVar2.n0(objN);
            } else {
                objN = new as.e0(24, kVar);
                jVar2.n0(objN);
            }
            int i6 = i3;
            a.a.b(strU2, 2131231102, rVarA3, (u00.a) objN, jVar2, 0, 0);
            aVar3 = gm.a.B;
            if (aVar == aVar3) {
                jVar2.c0(-1099392136);
                if (a1Var.u) {
                    jVar2.c0(-1099300593);
                    a1Var2 = a1Var;
                    aVar4 = aVar3;
                    a.a.b(z3.U(jVar2, 2131886621), 2131231190, x1Var.a(rVar4), (u00.a) null, jVar2, 0, 8);
                    jVar2.r(false);
                } else {
                    jVar2.c0(-1099300593);
                    a1Var2 = a1Var;
                    aVar4 = aVar3;
                    a.a.b(z3.U(jVar2, 2131886621), 2131231190, x1Var.a(rVar4), (u00.a) null, jVar2, 0, 8);
                    jVar2.r(false);
                }
                jVar2.r(false);
            } else {
                a1Var2 = a1Var;
                aVar4 = aVar3;
                jVar2.c0(-1098948154);
                jVar2.r(false);
            }
            jVar2.r(true);
            b2.r rVarE5 = h0.c.E(h0.z1.d(rVar4, 1.0f), f, 0.0f, 2);
            h0.v1 v1VarA4 = h0.t1.a(h0.i.g(f3), hVar2, jVar2, 6);
            int iHashCode7 = Long.hashCode(((l1.g0) jVar2).T);
            l1.m1 m1VarM7 = jVar2.m();
            b2.r rVarC7 = b2.a.c(rVarE5, jVar2);
            jVar2.g0();
            if (((l1.g0) jVar2).S) {
                jVar2.l(gVar2);
            } else {
                jVar2.q0();
            }
            l1.q.I(v1VarA4, jVar2, fVar);
            l1.q.I(m1VarM7, jVar2, fVar2);
            a1.b.v(iHashCode7, jVar2, fVar3, jVar2, eVar);
            l1.q.I(rVarC7, jVar2, fVar4);
            objN2 = jVar2.N();
            if (objN2 == obj) {
                objN2 = x5.s(0, jVar2);
            }
            z0Var = (l1.z0) objN2;
            b2.r rVarA4 = x1Var.a(rVar4);
            zG = jVar2.g(cVar);
            objN3 = jVar2.N();
            if (zG) {
                objN3 = new as.f0(cVar, z0Var, 3);
                jVar2.n0(objN3);
            } else {
                objN3 = new as.f0(cVar, z0Var, 3);
                jVar2.n0(objN3);
            }
            a10.h0.d(a1Var2.p, a1Var2.q, a1Var2.r, a1Var2.s, a1Var2.e, a1Var2.f, kVar, z2.d0.o(rVarA4, (u00.k) objN3), jVar2, (i6 << 9) & 3670016);
            aVar2 = aVar;
            if (aVar2 == aVar4) {
                jVar2.c0(-2021911850);
                b2.r rVarE6 = h0.z1.e(x1Var.a(rVar4), ((y3.f) z0Var.getValue()).A);
                h0.v vVarA4 = h0.u.a(dVar, gVar, jVar2, 0);
                int iHashCode8 = Long.hashCode(((l1.g0) jVar2).T);
                l1.m1 m1VarM8 = jVar2.m();
                b2.r rVarC8 = b2.a.c(rVarE6, jVar2);
                jVar2.g0();
                if (((l1.g0) jVar2).S) {
                    jVar2.l(gVar2);
                } else {
                    jVar2.q0();
                }
                l1.q.I(vVarA4, jVar2, fVar);
                l1.q.I(m1VarM8, jVar2, fVar2);
                a1.b.v(iHashCode8, jVar2, fVar3, jVar2, eVar);
                l1.q.I(rVarC8, jVar2, fVar4);
                a1Var3 = a1Var;
                if (a1Var3.u) {
                    jVar2.c0(1125669277);
                    z3 = true;
                    y3.f(h0.w.a(rVar4, 1.0f), true, jVar2, 48, 0);
                    jVar2.r(false);
                    jVar2 = jVar2;
                } else {
                    z3 = true;
                    jVar2.c0(1125948959);
                    mVar = a1Var3.n;
                    if (mVar == null) {
                        jVar2.c0(1125948958);
                        jVar2.r(false);
                        jVar2 = jVar2;
                    } else {
                        jVar2.c0(1125948959);
                        jVar2 = jVar2;
                        z3.i(mVar, h0.w.a(rVar4, 1.0f), true, jVar2, 384, 0);
                        jVar2.r(false);
                    }
                    jVar2.r(false);
                }
                a.a.b(z3.U(jVar2, 2131886579), 2131231102, (b2.r) null, (u00.a) null, jVar2, 0, 12);
                aVar5 = a1Var3.o;
                if (aVar5 == null) {
                    jVar2.c0(1126550358);
                    jVar2.r(false);
                } else {
                    jVar2.c0(1126550359);
                    ct.i.c(aVar5, null, a1Var3.t, jVar2, 0);
                    jVar2.r(false);
                }
                jVar2.r(z3);
                jVar2.r(false);
            } else {
                z3 = true;
                a1Var3 = a1Var;
                jVar2 = jVar2;
                jVar2.c0(-2020565489);
                jVar2.r(false);
            }
            jVar2.r(z3);
            jVar2.r(z3);
            rVar3 = rVar7;
        } else {
            aVar2 = aVar;
            jVar2.V();
            rVar3 = rVar2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            final gm.a aVar7 = aVar2;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    a.c(a1Var3, aVar7, f, kVar, rVar3, (l1.j) obj2, l1.q.K(i | 1), i2);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d(a2 a2Var, u00.k kVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(148260120);
        int i2 = (g0Var.i(a2Var) ? 4 : 2) | i | (g0Var.i(kVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, cq.a.class, aVarA, (b60.a) null, g0Var);
            }
            cq.a aVar = (cq.a) objN;
            u00.a aVarA2 = cq.l.a(g0Var);
            e60.a aVarA3 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g((Object) null) | g0Var.g(aVarA3);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = oi.k.f(kotlin.jvm.internal.a0.a, xo.e.class, aVarA3, (b60.a) null, g0Var);
            }
            xo.e eVar = (xo.e) objN2;
            e60.a aVarA4 = q50.c.a(g0Var);
            boolean zG3 = g0Var.g((Object) null) | g0Var.g(aVarA4);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                objN3 = oi.k.f(kotlin.jvm.internal.a0.a, xo.a.class, aVarA4, (b60.a) null, g0Var);
            }
            xo.a aVar2 = (xo.a) objN3;
            Context context = (Context) g0Var.k(c3.o0.b);
            ol.b bVar = (ol.b) g0Var.k(ol.a.a);
            g0Var.k(dl.e.a);
            gm.a aVar3 = gm.a.A;
            boolean zI = g0Var.i(a2Var) | g0Var.g(aVarA2) | g0Var.i(aVar) | g0Var.i(context) | g0Var.i(aVar2) | ((i2 & 112) == 32) | g0Var.g(bVar) | g0Var.i(eVar);
            Object objN4 = g0Var.N();
            if (zI || objN4 == cVar) {
                x0 x0Var = new x0(a2Var, aVarA2, aVar, context, aVar2, kVar, bVar, eVar, (k00.c) null);
                g0Var.n0(x0Var);
                objN4 = x0Var;
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN4);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new k0(a2Var, kVar, i, 0);
        }
    }

    public static final void e(l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1833307546);
        if (g0Var.S(i & 1, i != 0)) {
            androidx.lifecycle.f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            j2 j2Var = (j2) c7.i.S(kotlin.jvm.internal.a0.a.b(j2.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(g0Var), (u00.a) null);
            l1.z0 z0VarQ = k00.f.q(j2Var.c.d, g0Var, 0);
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) g0Var.k(r6.d.a);
            d40.i iVarH = j2Var.h();
            boolean zG = g0Var.g(j2Var);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                a40.g1 g1Var = new a40.g1(1, j2Var, j2.class, "action", "action(Lcom/mchutov/quranify/insights/presentation/screen/insights/InsightsAction;)V", 0, 14);
                g0Var.n0(g1Var);
                objN = g1Var;
            }
            d((a2) iVarH, (u00.k) ((a10.g) objN), g0Var, 0);
            boolean zG2 = g0Var.g(j2Var);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = new y0(j2Var, null, 0);
                g0Var.n0(objN2);
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN2);
            boolean zG3 = g0Var.g(j2Var) | g0Var.i(wVar);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                objN3 = new al.l(wVar, j2Var, 3);
                g0Var.n0(objN3);
            }
            l1.q.e(wVar, (u00.k) objN3, g0Var);
            a1 a1Var = (a1) z0VarQ.getValue();
            boolean zG4 = g0Var.g(j2Var);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar) {
                a40.g1 g1Var2 = new a40.g1(1, j2Var, j2.class, "action", "action(Lcom/mchutov/quranify/insights/presentation/screen/insights/InsightsAction;)V", 0, 15);
                g0Var.n0(g1Var2);
                objN4 = g1Var2;
            }
            b(a1Var, (u00.k) ((a10.g) objN4), g0Var, 0);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new ax.c(i, 18);
        }
    }

    public static final void f(a1 a1Var, gm.a aVar, float f, u00.k kVar, l1.j jVar, int i) {
        gm.a aVar2;
        u00.k kVar2;
        a1 a1Var2;
        gm.a aVar3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1530187594);
        int i2 = i | (g0Var.g(a1Var) ? 4 : 2) | (g0Var.e(aVar.ordinal()) ? 32 : 16) | (g0Var.d(f) ? 256 : 128) | (g0Var.i(kVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            y3.c cVar = (y3.c) g0Var.k(c3.o1.h);
            b2.o oVar = b2.o.A;
            b2.r rVarD = h0.z1.d(oVar, 1.0f);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
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
            b2.r rVarE = h0.c.E(h0.z1.d(oVar, 1.0f), f, 0.0f, 2);
            float f2 = 24;
            h0.f fVarG = h0.i.g(f2);
            b2.h hVar = b2.b.J;
            h0.v1 v1VarA = h0.t1.a(fVarG, hVar, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            l1.m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
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
            h0.x1 x1Var = h0.x1.a;
            a.a.b(z3.U(g0Var, 2131886612), 2131231194, x1Var.a(oVar), (u00.a) null, g0Var, 0, 8);
            gm.a aVar4 = gm.a.B;
            if (aVar == aVar4) {
                g0Var.c0(97144510);
                aVar3 = aVar4;
                a.a.b(z3.U(g0Var, 2131886593), 2131231190, x1Var.a(oVar), (u00.a) null, g0Var, 0, 8);
                g0Var.r(false);
            } else {
                aVar3 = aVar4;
                g0Var.c0(97373662);
                g0Var.r(false);
            }
            g0Var.r(true);
            b2.r rVarE2 = h0.c.E(h0.z1.d(oVar, 1.0f), f, 0.0f, 2);
            h0.v1 v1VarA2 = h0.t1.a(h0.i.g(f2), hVar, g0Var, 6);
            int iHashCode3 = Long.hashCode(g0Var.T);
            l1.m1 m1VarM3 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarE2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA2, g0Var, fVar);
            l1.q.I(m1VarM3, g0Var, fVar2);
            a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (objN == obj) {
                objN = x5.s(0, g0Var);
            }
            l1.z0 z0Var = (l1.z0) objN;
            b2.r rVarA = x1Var.a(oVar);
            a1Var2 = a1Var;
            boolean z = a1Var2.t;
            ys.f fVar5 = a1Var2.l;
            bx.c cVar2 = a1Var2.d;
            float f3 = ((y3.f) z0Var.getValue()).A;
            boolean z2 = (i2 & 7168) == 2048;
            Object objN2 = g0Var.N();
            if (z2 || objN2 == obj) {
                kVar2 = kVar;
                objN2 = new as.e0(23, kVar2);
                g0Var.n0(objN2);
            } else {
                kVar2 = kVar;
            }
            ca.v.c(f3, 64, rVarA, cVar2, g0Var, (u00.a) objN2, fVar5, z);
            aVar2 = aVar;
            if (aVar2 == aVar3) {
                g0Var.c0(53001196);
                b2.r rVarA2 = x1Var.a(oVar);
                boolean zG = g0Var.g(cVar);
                Object objN3 = g0Var.N();
                if (zG || objN3 == obj) {
                    objN3 = new as.f0(cVar, z0Var, 2);
                    g0Var.n0(objN3);
                }
                ct.c0.b(a1Var2.m, z2.d0.o(rVarA2, (u00.k) objN3), a1Var2.t, g0Var, 0, 0);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                g0Var.c0(53440807);
                g0Var.r(false);
            }
            g0Var.r(true);
            g0Var.r(true);
        } else {
            aVar2 = aVar;
            kVar2 = kVar;
            a1Var2 = a1Var;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.g(a1Var2, aVar2, f, kVar2, i);
        }
    }

    public static final void g(a1 a1Var, float f, b2.r rVar, l1.j jVar, int i, int i2) {
        l1.g0 g0Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1561981330);
        int i3 = (g0Var2.g(a1Var) ? 4 : 2) | i | (g0Var2.d(f) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= g0Var2.g(rVar) ? 256 : 128;
        }
        if (g0Var2.S(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                rVar = b2.o.A;
            }
            b2.r rVarE = h0.c.E(h0.z1.d(rVar, 1.0f), f, 0.0f, 2);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var2);
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
            l1.q.I(rVarC, g0Var2, b3.h.d);
            a.a.b(z3.U(g0Var2, 2131886593), 2131231190, (b2.r) null, (u00.a) null, g0Var2, 0, 12);
            ct.c0.b(a1Var.m, null, a1Var.t, g0Var2, 0, 2);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        b2.r rVar2 = rVar;
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new q0(a1Var, f, rVar2, i, i2, 0);
        }
    }

    public static final void h(a1 a1Var, float f, b2.r rVar, l1.j jVar, int i, int i2) {
        b2.r rVar2;
        boolean z;
        l1.g0 g0Var;
        l1.r1 r1VarT;
        b2.r rVar3;
        b3.g gVar;
        ys.m mVar;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-1045195597);
        int i3 = (g0Var2.g(a1Var) ? 4 : 2) | i | (g0Var2.d(f) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                rVar2 = rVar;
                i3 |= g0Var2.g(rVar2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var2.S(i3 & 1, z)) {
                if (i4 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar2;
                }
                b2.r rVarE = h0.c.E(h0.z1.d(rVar3, 1.0f), f, 0.0f, 2);
                h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
                int iHashCode = Long.hashCode(g0Var2.T);
                l1.m1 m1VarM = g0Var2.m();
                b2.r rVarC = b2.a.c(rVarE, g0Var2);
                b3.i.c.getClass();
                gVar = b3.h.b;
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
                l1.q.I(rVarC, g0Var2, b3.h.d);
                g0Var = g0Var2;
                a.a.b(z3.U(g0Var2, 2131886621), 2131231190, (b2.r) null, (u00.a) null, g0Var, 0, 12);
                if (a1Var.u) {
                    g0Var.c0(1745031114);
                    y3.f((b2.r) null, false, g0Var, 0, 3);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1745134003);
                    mVar = a1Var.n;
                    if (mVar == null) {
                        g0Var.c0(1745134002);
                        g0Var.r(false);
                    } else {
                        g0Var.c0(1745134003);
                        z3.i(mVar, (b2.r) null, false, g0Var, 0, 6);
                        g0Var = g0Var;
                        g0Var.r(false);
                    }
                    g0Var.r(false);
                }
                g0Var.r(true);
                rVar2 = rVar3;
            } else {
                g0Var = g0Var2;
                g0Var.V();
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new q0(a1Var, f, rVar2, i, i2, 1);
            }
        }
        i3 |= 384;
        rVar2 = rVar;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var2.S(i3 & 1, z)) {
            if (i4 != 0) {
                rVar3 = b2.o.A;
            } else {
                rVar3 = rVar2;
            }
            b2.r rVarE2 = h0.c.E(h0.z1.d(rVar3, 1.0f), f, 0.0f, 2);
            h0.v vVarA2 = h0.u.a(h0.i.c, b2.b.M, g0Var2, 0);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM2 = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarE2, g0Var2);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(vVarA2, g0Var2, b3.h.f);
            l1.q.I(m1VarM2, g0Var2, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var2, b3.h.g);
            l1.q.E(g0Var2, b3.h.h);
            l1.q.I(rVarC2, g0Var2, b3.h.d);
            g0Var = g0Var2;
            a.a.b(z3.U(g0Var2, 2131886621), 2131231190, (b2.r) null, (u00.a) null, g0Var, 0, 12);
            if (a1Var.u) {
                g0Var.c0(1745031114);
                y3.f((b2.r) null, false, g0Var, 0, 3);
                g0Var.r(false);
            } else {
                g0Var.c0(1745134003);
                mVar = a1Var.n;
                if (mVar == null) {
                    g0Var.c0(1745134002);
                    g0Var.r(false);
                } else {
                    g0Var.c0(1745134003);
                    z3.i(mVar, (b2.r) null, false, g0Var, 0, 6);
                    g0Var = g0Var;
                    g0Var.r(false);
                }
                g0Var.r(false);
            }
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new q0(a1Var, f, rVar2, i, i2, 1);
        }
    }
}
