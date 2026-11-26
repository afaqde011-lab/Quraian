package ur;

import android.content.Context;
import android.content.res.Configuration;
import bt.a2;
import c3.o3;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.home.domain.exception.IntegrityTokenException;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$HomeScreen;
import g1.m6;
import g1.t4;
import g1.z6;
import gv.t1;
import h0.m2;
import h0.v1;
import h0.z1;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import l1.p2;
import q0.f2;

public abstract class g1 {
    public static final float b;
    public static final float c;
    public static final float a = 44;
    public static final float d = 24;
    public static final m3.r0 e = new m3.r0(0, kh.o.z(16), (q3.u) null, (q3.i) null, 0, 0, 0, 0, 0, (m3.z) null, 16777213);

    static {
        float f = 16;
        b = f;
        c = f;
    }

    public static final void a(h1 h1Var, final u00.k kVar, l1.j jVar, int i) {
        final h1 h1Var2;
        boolean z;
        float f;
        float fMax;
        float f2;
        l1.c cVar;
        l1.c cVar2;
        l1.c cVar3;
        int i2;
        ?? r8;
        ?? r12;
        ?? r2;
        ?? r1;
        Object objN;
        ?? r5;
        ?? r3;
        Object objN2;
        ?? r13;
        Object objN3;
        ?? r14;
        Object objN4;
        ?? r15;
        Object objN5;
        ?? r16;
        Object objN6;
        ?? r17;
        Object objN7;
        ?? r18;
        Object objN8;
        ?? r4;
        ?? r0;
        Object objN9;
        boolean zI;
        Object objN10;
        ?? r6;
        Object objN11;
        ?? r7;
        Object objN12;
        Iterator it;
        Object next;
        qr.l lVar;
        qr.g gVar;
        u30.b bVarE;
        boolean z2;
        Object objN13;
        boolean z3;
        Object objN14;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1696809241);
        int i3 = i | (g0Var.g(h1Var) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16);
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) g0Var.k(c3.o0.b);
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA);
            Object objN15 = g0Var.N();
            l1.c cVar4 = l1.i.a;
            if (zG || objN15 == cVar4) {
                objN15 = oi.k.f(kotlin.jvm.internal.a0.a, rr.b.class, aVarA, (b60.a) null, g0Var);
            }
            rr.b bVar = (rr.b) objN15;
            final gm.a aVar = (gm.a) g0Var.k(dl.e.a);
            final h0.n1 n1Var = (h0.n1) g0Var.k(dq.l.a);
            final j0.v vVarA = j0.x.a(0, g0Var, 3);
            Object objN16 = g0Var.N();
            if (objN16 == cVar4) {
                objN16 = l1.q.o(g0Var);
                g0Var.n0(objN16);
            }
            a40.z zVar = (a40.z) objN16;
            m6 m6VarF = t4.f(true, (u00.k) null, g0Var, 6, 2);
            WeakHashMap weakHashMap = m2.w;
            final h0.t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            j1.r rVarD = j1.k.d(g0Var);
            final kk.c cVarD = kk.e.d(g0Var);
            final p2 p2VarB = sm.a.b(vVarA, g0Var);
            Object[] objArr = new Object[0];
            Object objN17 = g0Var.N();
            if (objN17 == cVar4) {
                objN17 = new sy.e(15);
                g0Var.n0(objN17);
            }
            final l1.z0 z0Var = (l1.z0) y1.k.c(objArr, (u00.a) objN17, g0Var, 48);
            y3.c cVar5 = (y3.c) g0Var.k(c3.o1.h);
            m3.p0 p0VarI = m3.h0.i(g0Var);
            String strU = z3.U(g0Var, 2131887125);
            float f3 = ((Configuration) g0Var.k(c3.o0.a)).screenWidthDp;
            float f4 = 2;
            float fH0 = (c * f4) + cVar5.h0((int) (m3.p0.a(p0VarI, strU, e, 0, 0L, 1020).c >> 32));
            boolean zH = g0Var.h(h1Var.r) | g0Var.e(aVar.ordinal()) | g0Var.d(f3) | g0Var.d(fH0);
            Object objN18 = g0Var.N();
            if (zH || objN18 == cVar4) {
                if (aVar != gm.a.B || h1Var.r) {
                    z = false;
                } else {
                    float f5 = f3 - eq.m.c;
                    float f6 = d;
                    if (y3.f.a(f5 / f4, f6 + f6 + fH0) < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                objN18 = Boolean.valueOf(z);
                g0Var.n0(objN18);
            }
            final boolean zBooleanValue = ((Boolean) objN18).booleanValue();
            float f7 = zBooleanValue ? b + a : 0;
            boolean zG2 = g0Var.g(cVar5);
            Object objN19 = g0Var.N();
            if (zG2 || objN19 == cVar4) {
                objN19 = Float.valueOf(cVar5.A0(24));
                g0Var.n0(objN19);
            }
            float fFloatValue = ((Number) objN19).floatValue();
            boolean zD = g0Var.d(fFloatValue);
            Object objN20 = g0Var.N();
            if (zD || objN20 == cVar4) {
                objN20 = l1.q.r(new iv.b(vVarA, fFloatValue, 1));
                g0Var.n0(objN20);
            }
            final p2 p2Var = (p2) objN20;
            Object objN21 = g0Var.N();
            if (objN21 == cVar4) {
                objN21 = l1.q.r(new el.b(vVarA, 12));
                g0Var.n0(objN21);
            }
            p2 p2Var2 = (p2) objN21;
            if (aVar == gm.a.A) {
                fMax = 48 + 12;
                f = f7;
            } else {
                f = f7;
                fMax = Math.max(48, n1Var.c()) + 32 + f;
            }
            boolean zE = g0Var.e(aVar.ordinal());
            Object objN22 = g0Var.N();
            if (zE || objN22 == cVar4) {
                int iOrdinal = aVar.ordinal();
                if (iOrdinal == 0) {
                    f2 = 16;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 24;
                }
                objN22 = oi.k.t(f2, g0Var);
            }
            final float f8 = ((y3.f) objN22).A;
            final float f9 = fMax;
            h0.a0 a0Var = z1.c;
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(a0Var, g0Var);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            wr.k.N(((Number) p2Var2.getValue()).floatValue(), h0.s.a.a(b2.o.A, b2.b.B), 0.0f, 0L, 0L, g0Var, 0);
            boolean z4 = h1Var.c;
            int i4 = i3 & 112;
            boolean z5 = i4 == 32;
            Object objN23 = g0Var.N();
            if (z5) {
                cVar = cVar4;
            } else {
                cVar = cVar4;
                if (objN23 == cVar) {
                }
                cVar2 = cVar;
                h1Var2 = h1Var;
                j1.k.b(z4, (u00.a) objN23, a0Var, rVarD, (b2.d) null, v1.d.d(-1057387672, new t1(h1Var, aVar, t0VarL, n1Var, f, rVarD), g0Var), v1.d.d(-1731454457, new u00.o() {
                    @Override
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        float f11;
                        h1 h1Var3;
                        u00.k kVar2;
                        h0.r PullToRefreshBox = (h0.r) obj;
                        l1.g0 g0Var2 = (l1.j) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= g0Var2.g(PullToRefreshBox) ? 4 : 2;
                        }
                        l1.g0 g0Var3 = g0Var2;
                        if (g0Var3.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                            h0.a0 a0Var2 = z1.c;
                            kk.c cVar6 = cVarD;
                            b2.r rVarA = kk.e.a(a0Var2, cVar6);
                            h0.t0 t0Var = t0VarL;
                            h0.p1 p1VarG = h0.c.g(0.0f, t0Var.c() + f9, 0.0f, t0Var.a() + n1Var.a() + 32, 5);
                            h0.f fVarG = h0.i.g(24);
                            gm.a aVar2 = aVar;
                            boolean zE2 = g0Var3.e(aVar2.ordinal());
                            float f12 = f8;
                            boolean zD2 = zE2 | g0Var3.d(f12);
                            p2 p2Var3 = p2Var;
                            boolean zG3 = zD2 | g0Var3.g(p2Var3);
                            h1 h1Var4 = h1Var2;
                            boolean zG4 = zG3 | g0Var3.g(h1Var4);
                            u00.k kVar3 = kVar;
                            boolean zG5 = zG4 | g0Var3.g(kVar3);
                            l1.z0 z0Var2 = z0Var;
                            boolean zG6 = zG5 | g0Var3.g(z0Var2);
                            Object objN24 = g0Var3.N();
                            l1.c cVar7 = l1.i.a;
                            if (zG6 || objN24 == cVar7) {
                                f11 = f12;
                                h1Var3 = h1Var4;
                                kVar2 = kVar3;
                                objN24 = new bt.l0(aVar2, h1Var3, f11, p2Var3, kVar2, z0Var2);
                                g0Var3.n0(objN24);
                            } else {
                                f11 = f12;
                                h1Var3 = h1Var4;
                                kVar2 = kVar3;
                            }
                            u00.k kVar4 = kVar2;
                            k00.f.d(rVarA, vVarA, p1VarG, fVarG, null, null, false, null, (u00.k) objN24, g0Var2, 24576, 488);
                            b2.i iVar = b2.b.B;
                            b2.o oVar = b2.o.A;
                            sm.a.a(z3.U(g0Var2, 2131887184), ((Number) p2VarB.getValue()).floatValue(), PullToRefreshBox.a(oVar, iVar), 0.0f, g0Var2, 0);
                            b2.r rVarE = h0.c.E(PullToRefreshBox.a(oVar, iVar), f11, 0.0f, 2);
                            boolean z6 = h1Var3.r;
                            boolean zG7 = g0Var3.g(kVar4);
                            Object objN25 = g0Var3.N();
                            if (zG7 || objN25 == cVar7) {
                                objN25 = new qt.h(28, kVar4);
                                g0Var3.n0(objN25);
                            }
                            u00.a aVar3 = (u00.a) objN25;
                            boolean zG8 = g0Var3.g(kVar4);
                            Object objN26 = g0Var3.N();
                            if (zG8 || objN26 == cVar7) {
                                objN26 = new qt.h(29, kVar4);
                                g0Var3.n0(objN26);
                            }
                            wr.t.a(z6, aVar3, (u00.a) objN26, cVar6, rVarE, zBooleanValue, g0Var2, 0, 0);
                        } else {
                            g0Var3.V();
                        }
                        return g00.b0.a;
                    }
                }, g0Var), g0Var, 1769856);
                g0Var = g0Var;
                if (h1Var2.g) {
                    g0Var.c0(-458434006);
                    it = h1Var2.f.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((qr.l) next) instanceof qr.g));
                    lVar = (qr.l) next;
                    if (lVar instanceof qr.g) {
                        gVar = (qr.g) lVar;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null || (bVarE = gVar.b) == null) {
                        bVarE = ze.d.E(h00.x.A);
                    }
                    i2 = 32;
                    if (i4 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objN13 = g0Var.N();
                    cVar3 = cVar2;
                    if (z2 || objN13 == cVar3) {
                        objN13 = new qt.h(22, kVar);
                        g0Var.n0(objN13);
                    }
                    u00.a aVar2 = (u00.a) objN13;
                    if (i4 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objN14 = g0Var.N();
                    if (z3 || objN14 == cVar3) {
                        objN14 = new qt.h(23, kVar);
                        g0Var.n0(objN14);
                    }
                    r8 = 0;
                    wr.g.a(bVarE, aVar2, (u00.a) objN14, g0Var, 0);
                    g0Var.r(false);
                } else {
                    cVar3 = cVar2;
                    i2 = 32;
                    r8 = 0;
                    g0Var.c0(-458012127);
                    g0Var.r(false);
                }
                if (h1Var2.I) {
                    g0Var.c0(-457953847);
                    String str = h1Var2.K;
                    String str2 = h1Var2.L;
                    u30.b bVar2 = h1Var2.M;
                    if (i4 == i2) {
                        r7 = 1;
                    } else {
                        r7 = r8;
                    }
                    objN12 = g0Var.N();
                    if (r7 == 0 || objN12 == cVar3) {
                        objN12 = new qt.h(24, kVar);
                        g0Var.n0(objN12);
                    }
                    yr.a.g(str, str2, bVar2, (u00.a) objN12, g0Var, 0);
                    g0Var.r((boolean) r8);
                } else {
                    g0Var.c0(-457623263);
                    g0Var.r((boolean) r8);
                }
                if (h1Var2.J) {
                    g0Var.c0(-457547933);
                    if (i4 == i2) {
                        r6 = 1;
                    } else {
                        r6 = r8;
                    }
                    objN11 = g0Var.N();
                    if (r6 == 0 || objN11 == cVar3) {
                        objN11 = new qt.h(25, kVar);
                        g0Var.n0(objN11);
                    }
                    qd.s0.G((u00.a) objN11, new c4.v(false, false, false, false, 231), v1.d.d(-1800514505, new z0(h1Var2, kVar), g0Var), g0Var, 432, 0);
                    g0Var = g0Var;
                    g0Var.r((boolean) r8);
                } else {
                    g0Var.c0(-456781055);
                    g0Var.r((boolean) r8);
                }
                if (((Boolean) z0Var.getValue()).booleanValue()) {
                    g0Var.c0(-456735020);
                    boolean zG3 = g0Var.g(z0Var);
                    if (i4 == i2) {
                        r4 = 1;
                    } else {
                        r4 = r8;
                    }
                    r0 = (zG3 ? 1 : 0) | r4;
                    objN9 = g0Var.N();
                    if (r0 == 0 || objN9 == cVar3) {
                        objN9 = new iz.i(kVar, z0Var, 2);
                        g0Var.n0(objN9);
                    }
                    u00.a aVar3 = (u00.a) objN9;
                    zI = g0Var.i(bVar) | g0Var.i(context);
                    objN10 = g0Var.N();
                    if (zI || objN10 == cVar3) {
                        objN10 = new l6.c(bVar, context, 21);
                        g0Var.n0(objN10);
                    }
                    z3.a(aVar3, (u00.a) objN10, g0Var, (int) r8);
                    g0Var.r((boolean) r8);
                } else {
                    g0Var.c0(-456199743);
                    g0Var.r((boolean) r8);
                }
                g0Var.r(true);
                if (aVar == gm.a.B) {
                    r12 = 1;
                } else {
                    r12 = r8;
                }
                boolean z6 = h1Var2.B;
                ?? r9 = (g0Var.i(zVar) ? 1 : 0) | (g0Var.g(m6VarF) ? 1 : 0);
                if (i4 == i2) {
                    r2 = 1;
                } else {
                    r2 = r8;
                }
                r1 = r9 | r2;
                objN = g0Var.N();
                if (r1 == 0 || objN == cVar3) {
                    objN = new bt.i0(zVar, m6VarF, kVar, 1);
                    g0Var.n0(objN);
                }
                u00.k kVar2 = (u00.k) objN;
                ?? r11 = (g0Var.i(zVar) ? 1 : 0) | (g0Var.g(m6VarF) ? 1 : 0);
                if (i4 == i2) {
                    r5 = 1;
                } else {
                    r5 = r8;
                }
                r3 = r11 | r5;
                objN2 = g0Var.N();
                if (r3 == 0 || objN2 == cVar3) {
                    objN2 = new bt.j0(zVar, m6VarF, kVar, 1);
                    g0Var.n0(objN2);
                }
                ca.v.a(z6, kVar2, (u00.a) objN2, m6VarF, g0Var, 0);
                if (h1Var2.C == null) {
                    g0Var.c0(2132111575);
                    g0Var.r((boolean) r8);
                } else {
                    g0Var.c0(2132111576);
                    if (r12 != 0) {
                        g0Var.c0(125104283);
                        if (i4 == i2) {
                            r16 = 1;
                        } else {
                            r16 = r8;
                        }
                        objN6 = g0Var.N();
                        if (r16 == 0 || objN6 == cVar3) {
                            objN6 = new qt.h(15, kVar);
                            g0Var.n0(objN6);
                        }
                        u00.a aVar4 = (u00.a) objN6;
                        if (i4 == i2) {
                            r17 = 1;
                        } else {
                            r17 = r8;
                        }
                        objN7 = g0Var.N();
                        if (r17 == 0 || objN7 == cVar3) {
                            objN7 = new qt.h(16, kVar);
                            g0Var.n0(objN7);
                        }
                        u00.a aVar5 = (u00.a) objN7;
                        if (i4 == i2) {
                            r18 = 1;
                        } else {
                            r18 = r8;
                        }
                        objN8 = g0Var.N();
                        if (r18 == 0 || objN8 == cVar3) {
                            objN8 = new qt.h(17, kVar);
                            g0Var.n0(objN8);
                        }
                        tp.h.b(aVar4, aVar5, (u00.a) objN8, g0Var, r8);
                        g0Var.r((boolean) r8);
                    } else {
                        g0Var.c0(125517916);
                        if (i4 == i2) {
                            r13 = 1;
                        } else {
                            r13 = r8;
                        }
                        objN3 = g0Var.N();
                        if (r13 == 0 || objN3 == cVar3) {
                            objN3 = new qt.h(18, kVar);
                            g0Var.n0(objN3);
                        }
                        u00.a aVar6 = (u00.a) objN3;
                        if (i4 == i2) {
                            r14 = 1;
                        } else {
                            r14 = r8;
                        }
                        objN4 = g0Var.N();
                        if (r14 == 0 || objN4 == cVar3) {
                            objN4 = new qt.h(19, kVar);
                            g0Var.n0(objN4);
                        }
                        u00.a aVar7 = (u00.a) objN4;
                        if (i4 == i2) {
                            r15 = 1;
                        } else {
                            r15 = r8;
                        }
                        objN5 = g0Var.N();
                        if (r15 == 0 || objN5 == cVar3) {
                            objN5 = new qt.h(20, kVar);
                            g0Var.n0(objN5);
                        }
                        tp.h.a(aVar6, aVar7, (u00.a) objN5, g0Var, r8);
                        g0Var.r((boolean) r8);
                    }
                    g0Var.r((boolean) r8);
                }
            }
            objN23 = new qt.h(21, kVar);
            g0Var.n0(objN23);
            cVar2 = cVar;
            h1Var2 = h1Var;
            j1.k.b(z4, (u00.a) objN23, a0Var, rVarD, (b2.d) null, v1.d.d(-1057387672, new t1(h1Var, aVar, t0VarL, n1Var, f, rVarD), g0Var), v1.d.d(-1731454457, new u00.o() {
                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f11;
                    h1 h1Var3;
                    u00.k kVar3;
                    h0.r PullToRefreshBox = (h0.r) obj;
                    l1.g0 g0Var2 = (l1.j) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.m.e(PullToRefreshBox, "$this$PullToRefreshBox");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= g0Var2.g(PullToRefreshBox) ? 4 : 2;
                    }
                    l1.g0 g0Var3 = g0Var2;
                    if (g0Var3.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                        h0.a0 a0Var2 = z1.c;
                        kk.c cVar6 = cVarD;
                        b2.r rVarA = kk.e.a(a0Var2, cVar6);
                        h0.t0 t0Var = t0VarL;
                        h0.p1 p1VarG = h0.c.g(0.0f, t0Var.c() + f9, 0.0f, t0Var.a() + n1Var.a() + 32, 5);
                        h0.f fVarG = h0.i.g(24);
                        gm.a aVar8 = aVar;
                        boolean zE2 = g0Var3.e(aVar8.ordinal());
                        float f12 = f8;
                        boolean zD2 = zE2 | g0Var3.d(f12);
                        p2 p2Var3 = p2Var;
                        boolean zG4 = zD2 | g0Var3.g(p2Var3);
                        h1 h1Var4 = h1Var2;
                        boolean zG5 = zG4 | g0Var3.g(h1Var4);
                        u00.k kVar4 = kVar;
                        boolean zG6 = zG5 | g0Var3.g(kVar4);
                        l1.z0 z0Var2 = z0Var;
                        boolean zG7 = zG6 | g0Var3.g(z0Var2);
                        Object objN24 = g0Var3.N();
                        l1.c cVar7 = l1.i.a;
                        if (zG7 || objN24 == cVar7) {
                            f11 = f12;
                            h1Var3 = h1Var4;
                            kVar3 = kVar4;
                            objN24 = new bt.l0(aVar8, h1Var3, f11, p2Var3, kVar3, z0Var2);
                            g0Var3.n0(objN24);
                        } else {
                            f11 = f12;
                            h1Var3 = h1Var4;
                            kVar3 = kVar4;
                        }
                        u00.k kVar5 = kVar3;
                        k00.f.d(rVarA, vVarA, p1VarG, fVarG, null, null, false, null, (u00.k) objN24, g0Var2, 24576, 488);
                        b2.i iVar = b2.b.B;
                        b2.o oVar = b2.o.A;
                        sm.a.a(z3.U(g0Var2, 2131887184), ((Number) p2VarB.getValue()).floatValue(), PullToRefreshBox.a(oVar, iVar), 0.0f, g0Var2, 0);
                        b2.r rVarE = h0.c.E(PullToRefreshBox.a(oVar, iVar), f11, 0.0f, 2);
                        boolean z7 = h1Var3.r;
                        boolean zG8 = g0Var3.g(kVar5);
                        Object objN25 = g0Var3.N();
                        if (zG8 || objN25 == cVar7) {
                            objN25 = new qt.h(28, kVar5);
                            g0Var3.n0(objN25);
                        }
                        u00.a aVar9 = (u00.a) objN25;
                        boolean zG9 = g0Var3.g(kVar5);
                        Object objN26 = g0Var3.N();
                        if (zG9 || objN26 == cVar7) {
                            objN26 = new qt.h(29, kVar5);
                            g0Var3.n0(objN26);
                        }
                        wr.t.a(z7, aVar9, (u00.a) objN26, cVar6, rVarE, zBooleanValue, g0Var2, 0, 0);
                    } else {
                        g0Var3.V();
                    }
                    return g00.b0.a;
                }
            }, g0Var), g0Var, 1769856);
            g0Var = g0Var;
            if (h1Var2.g) {
                g0Var.c0(-458434006);
                it = h1Var2.f.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((qr.l) next) instanceof qr.g));
                lVar = (qr.l) next;
                if (lVar instanceof qr.g) {
                    gVar = (qr.g) lVar;
                } else {
                    gVar = null;
                }
                if (gVar != null) {
                    bVarE = ze.d.E(h00.x.A);
                } else {
                    bVarE = ze.d.E(h00.x.A);
                }
                i2 = 32;
                if (i4 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objN13 = g0Var.N();
                cVar3 = cVar2;
                if (z2) {
                    objN13 = new qt.h(22, kVar);
                    g0Var.n0(objN13);
                } else {
                    objN13 = new qt.h(22, kVar);
                    g0Var.n0(objN13);
                }
                u00.a aVar8 = (u00.a) objN13;
                if (i4 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objN14 = g0Var.N();
                if (z3) {
                    objN14 = new qt.h(23, kVar);
                    g0Var.n0(objN14);
                } else {
                    objN14 = new qt.h(23, kVar);
                    g0Var.n0(objN14);
                }
                r8 = 0;
                wr.g.a(bVarE, aVar8, (u00.a) objN14, g0Var, 0);
                g0Var.r(false);
            } else {
                cVar3 = cVar2;
                i2 = 32;
                r8 = 0;
                g0Var.c0(-458012127);
                g0Var.r(false);
            }
            if (h1Var2.I) {
                g0Var.c0(-457953847);
                String str3 = h1Var2.K;
                String str4 = h1Var2.L;
                u30.b bVar3 = h1Var2.M;
                if (i4 == i2) {
                    r7 = 1;
                } else {
                    r7 = r8;
                }
                objN12 = g0Var.N();
                if (r7 == 0) {
                    objN12 = new qt.h(24, kVar);
                    g0Var.n0(objN12);
                } else {
                    objN12 = new qt.h(24, kVar);
                    g0Var.n0(objN12);
                }
                yr.a.g(str3, str4, bVar3, (u00.a) objN12, g0Var, 0);
                g0Var.r((boolean) r8);
            } else {
                g0Var.c0(-457623263);
                g0Var.r((boolean) r8);
            }
            if (h1Var2.J) {
                g0Var.c0(-457547933);
                if (i4 == i2) {
                    r6 = 1;
                } else {
                    r6 = r8;
                }
                objN11 = g0Var.N();
                if (r6 == 0) {
                    objN11 = new qt.h(25, kVar);
                    g0Var.n0(objN11);
                } else {
                    objN11 = new qt.h(25, kVar);
                    g0Var.n0(objN11);
                }
                qd.s0.G((u00.a) objN11, new c4.v(false, false, false, false, 231), v1.d.d(-1800514505, new z0(h1Var2, kVar), g0Var), g0Var, 432, 0);
                g0Var = g0Var;
                g0Var.r((boolean) r8);
            } else {
                g0Var.c0(-456781055);
                g0Var.r((boolean) r8);
            }
            if (((Boolean) z0Var.getValue()).booleanValue()) {
                g0Var.c0(-456735020);
                boolean zG4 = g0Var.g(z0Var);
                if (i4 == i2) {
                    r4 = 1;
                } else {
                    r4 = r8;
                }
                r0 = (zG4 ? 1 : 0) | r4;
                objN9 = g0Var.N();
                if (r0 == 0) {
                    objN9 = new iz.i(kVar, z0Var, 2);
                    g0Var.n0(objN9);
                } else {
                    objN9 = new iz.i(kVar, z0Var, 2);
                    g0Var.n0(objN9);
                }
                u00.a aVar9 = (u00.a) objN9;
                zI = g0Var.i(bVar) | g0Var.i(context);
                objN10 = g0Var.N();
                if (zI) {
                    objN10 = new l6.c(bVar, context, 21);
                    g0Var.n0(objN10);
                } else {
                    objN10 = new l6.c(bVar, context, 21);
                    g0Var.n0(objN10);
                }
                z3.a(aVar9, (u00.a) objN10, g0Var, (int) r8);
                g0Var.r((boolean) r8);
            } else {
                g0Var.c0(-456199743);
                g0Var.r((boolean) r8);
            }
            g0Var.r(true);
            if (aVar == gm.a.B) {
                r12 = 1;
            } else {
                r12 = r8;
            }
            boolean z7 = h1Var2.B;
            ?? r19 = (g0Var.i(zVar) ? 1 : 0) | (g0Var.g(m6VarF) ? 1 : 0);
            if (i4 == i2) {
                r2 = 1;
            } else {
                r2 = r8;
            }
            r1 = r19 | r2;
            objN = g0Var.N();
            if (r1 == 0) {
                objN = new bt.i0(zVar, m6VarF, kVar, 1);
                g0Var.n0(objN);
            } else {
                objN = new bt.i0(zVar, m6VarF, kVar, 1);
                g0Var.n0(objN);
            }
            u00.k kVar3 = (u00.k) objN;
            ?? r110 = (g0Var.i(zVar) ? 1 : 0) | (g0Var.g(m6VarF) ? 1 : 0);
            if (i4 == i2) {
                r5 = 1;
            } else {
                r5 = r8;
            }
            r3 = r110 | r5;
            objN2 = g0Var.N();
            if (r3 == 0) {
                objN2 = new bt.j0(zVar, m6VarF, kVar, 1);
                g0Var.n0(objN2);
            } else {
                objN2 = new bt.j0(zVar, m6VarF, kVar, 1);
                g0Var.n0(objN2);
            }
            ca.v.a(z7, kVar3, (u00.a) objN2, m6VarF, g0Var, 0);
            if (h1Var2.C == null) {
                g0Var.c0(2132111575);
                g0Var.r((boolean) r8);
            } else {
                g0Var.c0(2132111576);
                if (r12 != 0) {
                    g0Var.c0(125104283);
                    if (i4 == i2) {
                        r16 = 1;
                    } else {
                        r16 = r8;
                    }
                    objN6 = g0Var.N();
                    if (r16 == 0) {
                        objN6 = new qt.h(15, kVar);
                        g0Var.n0(objN6);
                    } else {
                        objN6 = new qt.h(15, kVar);
                        g0Var.n0(objN6);
                    }
                    u00.a aVar10 = (u00.a) objN6;
                    if (i4 == i2) {
                        r17 = 1;
                    } else {
                        r17 = r8;
                    }
                    objN7 = g0Var.N();
                    if (r17 == 0) {
                        objN7 = new qt.h(16, kVar);
                        g0Var.n0(objN7);
                    } else {
                        objN7 = new qt.h(16, kVar);
                        g0Var.n0(objN7);
                    }
                    u00.a aVar11 = (u00.a) objN7;
                    if (i4 == i2) {
                        r18 = 1;
                    } else {
                        r18 = r8;
                    }
                    objN8 = g0Var.N();
                    if (r18 == 0) {
                        objN8 = new qt.h(17, kVar);
                        g0Var.n0(objN8);
                    } else {
                        objN8 = new qt.h(17, kVar);
                        g0Var.n0(objN8);
                    }
                    tp.h.b(aVar10, aVar11, (u00.a) objN8, g0Var, r8);
                    g0Var.r((boolean) r8);
                } else {
                    g0Var.c0(125517916);
                    if (i4 == i2) {
                        r13 = 1;
                    } else {
                        r13 = r8;
                    }
                    objN3 = g0Var.N();
                    if (r13 == 0) {
                        objN3 = new qt.h(18, kVar);
                        g0Var.n0(objN3);
                    } else {
                        objN3 = new qt.h(18, kVar);
                        g0Var.n0(objN3);
                    }
                    u00.a aVar12 = (u00.a) objN3;
                    if (i4 == i2) {
                        r14 = 1;
                    } else {
                        r14 = r8;
                    }
                    objN4 = g0Var.N();
                    if (r14 == 0) {
                        objN4 = new qt.h(19, kVar);
                        g0Var.n0(objN4);
                    } else {
                        objN4 = new qt.h(19, kVar);
                        g0Var.n0(objN4);
                    }
                    u00.a aVar13 = (u00.a) objN4;
                    if (i4 == i2) {
                        r15 = 1;
                    } else {
                        r15 = r8;
                    }
                    objN5 = g0Var.N();
                    if (r15 == 0) {
                        objN5 = new qt.h(20, kVar);
                        g0Var.n0(objN5);
                    } else {
                        objN5 = new qt.h(20, kVar);
                        g0Var.n0(objN5);
                    }
                    tp.h.a(aVar12, aVar13, (u00.a) objN5, g0Var, r8);
                    g0Var.r((boolean) r8);
                }
                g0Var.r((boolean) r8);
            }
        } else {
            h1Var2 = h1Var;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new z0(h1Var2, kVar, i);
        }
    }

    public static final void b(a2 a2Var, u00.k kVar, l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1779882088);
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
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = oi.k.f(kotlin.jvm.internal.a0.a, xo.e.class, aVarA2, (b60.a) null, g0Var);
            }
            xo.e eVar = (xo.e) objN2;
            e60.a aVarA3 = q50.c.a(g0Var);
            boolean zG3 = g0Var.g((Object) null) | g0Var.g(aVarA3);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                objN3 = oi.k.f(kotlin.jvm.internal.a0.a, xo.a.class, aVarA3, (b60.a) null, g0Var);
            }
            xo.a aVar2 = (xo.a) objN3;
            Context context = (Context) g0Var.k(c3.o0.b);
            ol.b bVar = (ol.b) g0Var.k(ol.a.a);
            g0Var.k(dl.e.a);
            gm.a aVar3 = gm.a.A;
            boolean zI = g0Var.i(a2Var) | g0Var.i(aVar) | g0Var.i(context) | g0Var.i(aVar2) | ((i2 & 112) == 32) | g0Var.g(bVar) | g0Var.i(eVar);
            Object objN4 = g0Var.N();
            if (zI || objN4 == cVar) {
                o3 o3Var = new o3(a2Var, aVar, context, aVar2, kVar, bVar, eVar, (k00.c) null);
                g0Var.n0(o3Var);
                objN4 = o3Var;
            }
            l1.q.i(g00.b0.a, g0Var, (u00.n) objN4);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bt.k0(a2Var, kVar, i, 2);
        }
    }

    public static final void c(final qr.j jVar, final u00.k kVar, final gm.a aVar, final float f, l1.j jVar2, final int i) {
        b2.r rVar;
        boolean z;
        l1.g0 g0Var = (l1.g0) jVar2;
        g0Var.e0(-1203611860);
        int i2 = (g0Var.g(jVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= g0Var.i(kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.e(aVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= g0Var.d(f) ? 2048 : 1024;
        }
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            b2.r rVar2 = b2.o.A;
            b2.r rVarD = z1.d(rVar2, 1.0f);
            h0.v vVarA = h0.u.a(h0.i.g(16), b2.b.M, g0Var, 6);
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
            b2.r rVarE = h0.c.E(z1.d(rVar2, 1.0f), f, 0.0f, 2);
            int i3 = i2;
            v1 v1VarA = h0.t1.a(h0.i.a, b2.b.K, g0Var, 48);
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
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                rVar = rVar2;
                z = true;
                g0Var.c0(-1267588843);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                wr.k.D(jVar.b, new h0.c1(1.0f, true), null, false, false, g0Var, 27648, 4);
                g0Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw oi.k.r(g0Var, -317986421, false);
                }
                g0Var.c0(-1267322956);
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                rVar = rVar2;
                z = true;
                wr.k.o(jVar.b, new h0.c1(1.0f, true), null, false, false, g0Var, 27648, 4);
                g0Var.r(false);
            }
            int i4 = i3 & 112;
            boolean z2 = i4 == 32 ? z : false;
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (z2 || objN == obj) {
                objN = new d1(5, kVar);
                g0Var.n0(objN);
            }
            z6.b(z3.U(g0Var, 2131887202), w50.c.o(rVar, false, null, (u00.a) objN, 7), dl.a.m, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (m3.r0) null, g0Var, 24576, 0, 262120);
            g0Var.r(z);
            boolean z3 = i4 == 32 ? z : false;
            Object objN2 = g0Var.N();
            if (z3 || objN2 == obj) {
                objN2 = new rx.c(11, kVar);
                g0Var.n0(objN2);
            }
            u30.b bVar = jVar.c;
            wr.k.B((u00.k) objN2, bVar, ((h00.b) bVar).isEmpty(), null, g0Var, 64);
            g0Var = g0Var;
            g0Var.r(z);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    g1.c(jVar, kVar, aVar, f, (l1.j) obj2, l1.q.K(i | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d(l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(406113510);
        if (g0Var.S(i & 1, i != 0)) {
            androidx.lifecycle.f1 f1VarA = u6.a.a(g0Var);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            t6.b bVarZ = bi.b.z(f1VarA);
            e60.a aVarA = q50.c.a(g0Var);
            kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
            r1 r1Var = (r1) c7.i.S(b0Var.b(r1.class), f1VarA.getViewModelStore(), (String) null, bVarZ, aVarA, (u00.a) null);
            l1.z0 z0VarQ = k00.f.q(r1Var.c.d, g0Var, 0);
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA2);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(b0Var, rr.b.class, aVarA2, (b60.a) null, g0Var);
            }
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) g0Var.k(r6.d.a);
            boolean zA = kotlin.jvm.internal.m.a(h00.q.U0(((rr.b) objN).b), HomeRoute$HomeScreen.INSTANCE);
            d40.i iVarH = r1Var.h();
            boolean zG2 = g0Var.g(r1Var);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                gz.e1 e1Var = new gz.e1(1, r1Var, r1.class, "action", "action(Lcom/mchutov/quranify/home/presentation/screen/home/HomeAction;)V", 0, 19);
                g0Var.n0(e1Var);
                objN2 = e1Var;
            }
            b((a2) iVarH, (u00.k) ((a10.g) objN2), g0Var, 0);
            Boolean boolValueOf = Boolean.valueOf(zA);
            boolean zH = g0Var.h(zA) | g0Var.g(r1Var);
            Object objN3 = g0Var.N();
            if (zH || objN3 == cVar) {
                objN3 = new f1(zA, r1Var, null);
                g0Var.n0(objN3);
            }
            l1.q.i(boolValueOf, g0Var, (u00.n) objN3);
            boolean zG3 = g0Var.g(r1Var) | g0Var.i(wVar);
            Object objN4 = g0Var.N();
            if (zG3 || objN4 == cVar) {
                objN4 = new mu.q(wVar, r1Var, 15);
                g0Var.n0(objN4);
            }
            l1.q.e(wVar, (u00.k) objN4, g0Var);
            qr.q qVar = ((h1) z0VarQ.getValue()).b;
            if (kotlin.jvm.internal.m.a(qVar, qr.p.a)) {
                g0Var.c0(-394277202);
                wr.k.e(g0Var, 0);
                g0Var.r(false);
            } else if (qVar instanceof qr.o) {
                g0Var.c0(-394190216);
                boolean z = ((qr.o) qVar).a instanceof IntegrityTokenException;
                boolean zG4 = g0Var.g(r1Var);
                Object objN5 = g0Var.N();
                if (zG4 || objN5 == cVar) {
                    objN5 = new f2(r1Var, 6);
                    g0Var.n0(objN5);
                }
                wr.k.d(z, (u00.a) objN5, g0Var, 0);
                g0Var.r(false);
            } else {
                if (!kotlin.jvm.internal.m.a(qVar, qr.n.a)) {
                    throw oi.k.r(g0Var, -566910029, false);
                }
                g0Var.c0(-393933474);
                h1 h1Var = (h1) z0VarQ.getValue();
                boolean zG5 = g0Var.g(r1Var);
                Object objN6 = g0Var.N();
                if (zG5 || objN6 == cVar) {
                    gz.e1 e1Var2 = new gz.e1(1, r1Var, r1.class, "action", "action(Lcom/mchutov/quranify/home/presentation/screen/home/HomeAction;)V", 0, 20);
                    g0Var.n0(e1Var2);
                    objN6 = e1Var2;
                }
                a(h1Var, (u00.k) ((a10.g) objN6), g0Var, 0);
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 10);
        }
    }

    public static final void e(final qr.l lVar, final h1 h1Var, u00.k kVar, final gm.a aVar, final float f, l1.j jVar, final int i) {
        u00.k kVar2;
        String str;
        o2.f fVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1923839438);
        int i2 = i | (g0Var.g(lVar) ? 4 : 2) | (g0Var.g(h1Var) ? 32 : 16) | (g0Var.i(kVar) ? 256 : 128) | (g0Var.e(aVar.ordinal()) ? 2048 : 1024) | (g0Var.d(f) ? 16384 : 8192);
        if (g0Var.S(i2 & 1, (i2 & 9363) != 9362)) {
            if (lVar instanceof qr.h) {
                g0Var.c0(-1056858142);
                int i3 = i2 >> 3;
                wr.k.I(h1Var, kVar, z1.d(b2.o.A, 1.0f), g0Var, (i3 & 112) | (i3 & 14) | 384);
                g0Var.r(false);
            } else {
                boolean z = lVar instanceof qr.k;
                Object obj = l1.i.a;
                if (z) {
                    g0Var.c0(-1973748640);
                    qr.k kVar3 = (qr.k) lVar;
                    String str2 = kVar3.c;
                    u30.b bVar = kVar3.f;
                    int i4 = i2 & 896;
                    boolean z2 = i4 == 256;
                    Object objN = g0Var.N();
                    if (z2 || objN == obj) {
                        objN = new rx.c(6, kVar);
                        g0Var.n0(objN);
                    }
                    u00.k kVar4 = (u00.k) objN;
                    boolean z3 = h1Var.A;
                    u30.b bVar2 = h1Var.t;
                    if (kVar3.e) {
                        g0Var.c0(-1973737191);
                        o2.f fVarH0 = g4.h0(2131231389, g0Var, 6);
                        g0Var.r(false);
                        fVar = fVarH0;
                        str = str2;
                    } else {
                        g0Var.c0(-1056267221);
                        g0Var.r(false);
                        str = str2;
                        fVar = null;
                    }
                    boolean z4 = ((i2 & 14) == 4) | (i4 == 256);
                    Object objN2 = g0Var.N();
                    if (z4 || objN2 == obj) {
                        objN2 = new l6.c(kVar, lVar, 20);
                        g0Var.n0(objN2);
                    }
                    wr.k.K(str, bVar, kVar4, z3, bVar2, null, fVar, (u00.a) objN2, g0Var, 64);
                    g0Var = g0Var;
                    g0Var.r(false);
                } else if (lVar instanceof qr.j) {
                    g0Var.c0(-1973730837);
                    int i5 = i2 & 14;
                    int i6 = i2 >> 3;
                    c((qr.j) lVar, kVar, aVar, f, g0Var, i5 | (i6 & 112) | (i6 & 896) | (i6 & 7168));
                    kVar2 = kVar;
                    g0Var.r(false);
                } else {
                    kVar2 = kVar;
                    if (lVar instanceof qr.i) {
                        g0Var.c0(-1973723731);
                        wr.k.W(h1Var, kVar2, null, g0Var, (i2 >> 3) & 126);
                        g0Var.r(false);
                    } else {
                        if (!(lVar instanceof qr.g)) {
                            throw oi.k.r(g0Var, -1973755002, false);
                        }
                        g0Var.c0(-1973718986);
                        qr.g gVar = (qr.g) lVar;
                        boolean z5 = h1Var.A;
                        int i7 = i2 & 896;
                        boolean z6 = i7 == 256;
                        Object objN3 = g0Var.N();
                        if (z6 || objN3 == obj) {
                            objN3 = new rx.c(7, kVar2);
                            g0Var.n0(objN3);
                        }
                        u00.k kVar5 = (u00.k) objN3;
                        boolean z7 = i7 == 256;
                        Object objN4 = g0Var.N();
                        if (z7 || objN4 == obj) {
                            objN4 = new rx.c(8, kVar2);
                            g0Var.n0(objN4);
                        }
                        u00.k kVar6 = (u00.k) objN4;
                        boolean z8 = i7 == 256;
                        Object objN5 = g0Var.N();
                        if (z8 || objN5 == obj) {
                            objN5 = new rx.c(9, kVar2);
                            g0Var.n0(objN5);
                        }
                        u00.k kVar7 = (u00.k) objN5;
                        boolean z9 = i7 == 256;
                        Object objN6 = g0Var.N();
                        if (z9 || objN6 == obj) {
                            objN6 = new rx.c(10, kVar2);
                            g0Var.n0(objN6);
                        }
                        wr.k.a(gVar, f, z5, kVar5, kVar6, kVar7, (u00.k) objN6, null, g0Var, ((i2 >> 9) & 112) | (i2 & 14));
                        g0Var.r(false);
                    }
                }
            }
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final u00.k kVar8 = kVar2;
            r1VarT.d = new u00.n(h1Var, kVar8, aVar, f, i) {
                public final h1 B;
                public final u00.k C;
                public final gm.a D;
                public final float E;

                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iK = l1.q.K(1);
                    g1.e(this.A, this.B, this.C, this.D, this.E, (l1.j) obj2, iK);
                    return g00.b0.a;
                }
            };
        }
    }
}
