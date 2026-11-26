package qo;

import a10.h0;
import android.content.Context;
import androidx.lifecycle.f1;
import bt.m0;
import c3.o0;
import c3.o1;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.j7;
import g1.z6;
import gz.e1;
import h0.c1;
import h0.m2;
import h0.n1;
import h0.p1;
import h0.t0;
import h0.t1;
import h0.v1;
import h0.z1;
import java.util.Iterator;
import java.util.WeakHashMap;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.r1;
import l1.z0;
import m3.r0;
import oo.y0;
import z2.d0;
import z2.w0;

public abstract class z {
    public static final v1.c a = new v1.c(new pz.m(4), -516025730, false);
    public static final v1.c b = new v1.c(new pz.m(5), -134041277, false);

    public static final void a(int i, Integer num, l1.j jVar, int i2) {
        g0 g0Var;
        y yVar;
        int i3;
        g0 g0Var2;
        String str;
        final y yVar2;
        Object obj;
        ?? r8;
        boolean z;
        u30.b bVar;
        g0 g0Var3 = (g0) jVar;
        g0Var3.e0(-227097136);
        int i4 = i2 | (g0Var3.e(i) ? 4 : 2) | (g0Var3.g(num) ? 32 : 16);
        if (g0Var3.S(i4 & 1, (i4 & 19) != 18)) {
            u00.a aVarA = cq.l.a(g0Var3);
            String strF = g4.c.f(i, "audioStory-");
            boolean z2 = ((i4 & 112) == 32) | ((i4 & 14) == 4);
            Object objN = g0Var3.N();
            Object obj2 = l1.i.a;
            if (z2 || objN == obj2) {
                objN = new e1.w(i, num, 3);
                g0Var3.n0(objN);
            }
            u00.a aVar = (u00.a) objN;
            f1 f1VarA = u6.a.a(g0Var3);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            y yVar3 = (y) c7.i.S(kotlin.jvm.internal.a0.a.b(y.class), f1VarA.getViewModelStore(), strF, bi.b.z(f1VarA), q50.c.a(g0Var3), aVar);
            z0 z0VarQ = k00.f.q(yVar3.c.d, g0Var3, 0);
            boolean z3 = g0Var3.k(dl.e.a) == gm.a.B;
            kk.c cVarD = kk.e.d(g0Var3);
            j0.v vVarA = j0.x.a(0, g0Var3, 3);
            p2 p2VarB = sm.a.b(vVarA, g0Var3);
            Context context = (Context) g0Var3.k(o0.b);
            boolean zG = g0Var3.g(yVar3) | g0Var3.g(aVarA) | g0Var3.i(context);
            Object objN2 = g0Var3.N();
            k00.c cVar = null;
            if (zG || objN2 == obj2) {
                objN2 = new pz.k(yVar3, aVarA, context, cVar, 1);
                yVar = yVar3;
                g0Var3.n0(objN2);
            } else {
                yVar = yVar3;
            }
            l1.q.i(b0.a, g0Var3, (u00.n) objN2);
            lo.k kVar = ((t) z0VarQ.getValue()).a;
            if (kVar != null && (bVar = kVar.g) != null) {
                Iterator it = bVar.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    int i6 = ((lo.l) it.next()).a;
                    Integer num2 = ((t) z0VarQ.getValue()).c;
                    if (num2 != null && i6 == num2.intValue()) {
                        i3 = i5;
                        break;
                    }
                    i5++;
                }
            } else {
                i3 = -1;
                break;
            }
            Integer numValueOf = Integer.valueOf(i3);
            boolean zE = g0Var3.e(i3) | g0Var3.g(vVarA) | g0Var3.g(yVar);
            Object objN3 = g0Var3.N();
            if (zE || objN3 == obj2) {
                objN3 = new ev.x(i3, vVarA, yVar, (k00.c) 0);
                g0Var3.n0(objN3);
            }
            l1.q.i(numValueOf, g0Var3, (u00.n) objN3);
            b2.r rVarF = z.n.f(z1.c, dl.a.L, i2.b0.b);
            b2.i iVar = b2.b.A;
            w0 w0VarD = h0.o.d(iVar, false);
            boolean z4 = z3;
            int iHashCode = Long.hashCode(g0Var3.T);
            m1 m1VarM = g0Var3.m();
            b2.r rVarC = b2.a.c(rVarF, g0Var3);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var3, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var3, fVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf2, g0Var3, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var3, eVar);
            final y yVar4 = yVar;
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var3, fVar4);
            b2.o oVar = b2.o.A;
            b2.r rVarA = kk.e.a(oVar, cVarD);
            w0 w0VarD2 = h0.o.d(iVar, false);
            int iHashCode2 = Long.hashCode(g0Var3.T);
            m1 m1VarM2 = g0Var3.m();
            b2.r rVarC2 = b2.a.c(rVarA, g0Var3);
            g0Var3.g0();
            if (g0Var3.S) {
                g0Var3.l(gVar);
            } else {
                g0Var3.q0();
            }
            l1.q.I(w0VarD2, g0Var3, fVar);
            l1.q.I(m1VarM2, g0Var3, fVar2);
            a1.b.v(iHashCode2, g0Var3, fVar3, g0Var3, eVar);
            l1.q.I(rVarC2, g0Var3, fVar4);
            if (z4) {
                g0Var3.c0(-2028209804);
                lo.k kVar2 = ((t) z0VarQ.getValue()).a;
                if (kVar2 == null) {
                    g0Var3.c0(1550005517);
                    z = false;
                } else {
                    z = false;
                    g0Var3.c0(1550005518);
                    f(kVar2.e, g0Var3, 0);
                }
                g0Var3.r(z);
                g0Var3.r(z);
            } else {
                g0Var3.c0(1550065534);
                g0Var3.r(false);
            }
            lo.k kVar3 = ((t) z0VarQ.getValue()).a;
            if (kVar3 == null || z4) {
                kVar3 = null;
            }
            if (kVar3 == null) {
                g0Var3.c0(1550133485);
                g0Var3.r(false);
                g0Var2 = g0Var3;
                str = null;
            } else {
                g0Var3.c0(1550133486);
                g0Var2 = g0Var3;
                str = null;
                h0.a(kVar3.e, f2.h.b(h0.c.m(z1.d(oVar, 1.0f), 1.0f), 100, (i2.o0) null), 0.0f, false, null, false, g0Var2, 3072, 52);
                g0Var2.r(false);
            }
            t tVar = (t) z0VarQ.getValue();
            boolean zG2 = g0Var2.g(yVar4);
            Object objN4 = g0Var2.N();
            if (zG2 || objN4 == obj2) {
                objN4 = new e1(1, yVar4, y.class, "action", "action(Lcom/mchutov/quranify/audiostories/presentation/screen/story/AudioStoryAction;)V", 0, 17);
                g0Var2.n0(objN4);
            }
            b(tVar, vVarA, (u00.k) ((a10.g) objN4), g0Var2, 0);
            g0Var2.r(true);
            b2.i iVar2 = b2.b.B;
            h0.s sVar = h0.s.a;
            b2.r rVarA2 = sVar.a(oVar, iVar2);
            lo.k kVar4 = ((t) z0VarQ.getValue()).a;
            String str2 = kVar4 != null ? kVar4.c : str;
            if (str2 == null) {
                str2 = "";
            }
            sm.a.a(str2, ((Number) p2VarB.getValue()).floatValue(), rVarA2, 0.0f, g0Var2, 0);
            float f = 16;
            b2.r rVarE = h0.c.E(oVar, f, 0.0f, 2);
            j7 j7Var = h0.c.e;
            b2.r rVarA3 = sVar.a(h0.c.M(rVarE, j7Var), iVar);
            p0.e eVar2 = p0.f.a;
            float f2 = 0;
            float f3 = 44;
            long j = dl.a.P;
            long jB = i2.t.b(0.5f, j);
            boolean zG3 = g0Var2.g(yVar4);
            Object objN5 = g0Var2.N();
            if (zG3 || objN5 == r16) {
                final int i7 = 0;
                objN5 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i8 = i7;
                        y yVar5 = yVar4;
                        switch (i8) {
                            case 0:
                                yVar5.j(c.a);
                                break;
                            case 1:
                                yVar5.j(i.a);
                                break;
                            default:
                                yVar5.j(b.a);
                                break;
                        }
                        return b0.a;
                    }
                };
                g0Var2.n0(objN5);
            }
            g0 g0Var4 = g0Var2;
            w50.c.f((u00.a) objN5, cVarD, rVarA3, false, false, 0.0f, new y3.f(f3), 0L, jB, 10.0f, eVar2, f2, a, g0Var4, 806879232, 432, 184);
            g0Var = g0Var4;
            if (((t) z0VarQ.getValue()).a != null) {
                g0Var.c0(-1352062229);
                b2.r rVarA4 = sVar.a(h0.c.M(h0.c.E(oVar, f, 0.0f, 2), j7Var), b2.b.C);
                long jB2 = i2.t.b(0.5f, j);
                yVar2 = yVar4;
                boolean zG4 = g0Var.g(yVar2);
                Object objN6 = g0Var.N();
                if (zG4) {
                    obj = r16;
                } else {
                    obj = r16;
                    if (objN6 == obj) {
                    }
                    w50.c.f((u00.a) objN6, cVarD, rVarA4, false, false, 0.0f, new y3.f(f3), 0L, jB2, 10.0f, eVar2, f2, b, g0Var, 806879232, 432, 184);
                    g0Var = g0Var;
                    r8 = 0;
                    g0Var.r(false);
                }
                final int i8 = 1;
                objN6 = new u00.a() {
                    @Override
                    public final Object invoke() {
                        int i9 = i8;
                        y yVar5 = yVar2;
                        switch (i9) {
                            case 0:
                                yVar5.j(c.a);
                                break;
                            case 1:
                                yVar5.j(i.a);
                                break;
                            default:
                                yVar5.j(b.a);
                                break;
                        }
                        return b0.a;
                    }
                };
                g0Var.n0(objN6);
                w50.c.f((u00.a) objN6, cVarD, rVarA4, false, false, 0.0f, new y3.f(f3), 0L, jB2, 10.0f, eVar2, f2, b, g0Var, 806879232, 432, 184);
                g0Var = g0Var;
                r8 = 0;
                g0Var.r(false);
            } else {
                yVar2 = yVar4;
                obj = r16;
                r8 = 0;
                g0Var.c0(-1351209512);
                g0Var.r(false);
            }
            g0Var.r(true);
            lo.k kVar5 = ((t) z0VarQ.getValue()).a;
            if (!((t) z0VarQ.getValue()).b || kVar5 == null) {
                g0Var.c0(-871842286);
                g0Var.r((boolean) r8);
            } else {
                g0Var.c0(-872073887);
                boolean z5 = g0Var.k(dl.e.a) == gm.a.B ? 1 : r8;
                boolean zG5 = g0Var.g(yVar2);
                Object objN7 = g0Var.N();
                if (zG5 || objN7 == obj) {
                    final int i9 = 2;
                    objN7 = new u00.a() {
                        @Override
                        public final Object invoke() {
                            int i11 = i9;
                            y yVar5 = yVar2;
                            switch (i11) {
                                case 0:
                                    yVar5.j(c.a);
                                    break;
                                case 1:
                                    yVar5.j(i.a);
                                    break;
                                default:
                                    yVar5.j(b.a);
                                    break;
                            }
                            return b0.a;
                        }
                    };
                    g0Var.n0(objN7);
                }
                ro.f.f(kVar5, z5, (u00.a) objN7, g0Var, r8);
                g0Var.r((boolean) r8);
            }
        } else {
            g0Var = g0Var3;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new androidx.media3.cast.e(i, num, i2);
        }
    }

    public static final void b(t tVar, j0.v vVar, u00.k kVar, l1.j jVar, int i) {
        float fC;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1286351726);
        int i2 = i | (g0Var.g(tVar) ? 4 : 2) | (g0Var.g(vVar) ? 32 : 16) | (g0Var.i(kVar) ? 256 : 128);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            n1 n1Var = (n1) g0Var.k(dq.l.a);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(g0Var).g, g0Var);
            boolean z = g0Var.k(dl.e.a) == gm.a.B;
            if (z) {
                fC = t0VarL.c() + p30.f.i0(new y3.f(44), new y3.f(n1Var.c())).A + 16;
            } else {
                fC = t0VarL.c() + 44 + 12;
            }
            h0.a0 a0Var = z1.c;
            p1 p1VarG = h0.c.g(0.0f, fC, 0.0f, t0VarL.a() + n1Var.a() + 24, 5);
            b2.g gVar = b2.b.N;
            boolean zH = ((i2 & 14) == 4) | g0Var.h(z) | ((i2 & 896) == 256);
            Object objN = g0Var.N();
            if (zH || objN == l1.i.a) {
                objN = new ev.n(tVar, z, kVar, 3);
                g0Var.n0(objN);
            }
            k00.f.d(a0Var, vVar, p1VarG, null, gVar, null, false, null, (u00.k) objN, g0Var, (i2 & 112) | 196614, 472);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new s(i, 0, tVar, vVar, kVar);
        }
    }

    public static final void c(String str, u00.a aVar, b2.r rVar, float f, l1.j jVar, int i, int i2) {
        b2.r rVar2;
        int i3;
        float f2;
        int i4;
        boolean z;
        b2.r rVar3;
        float f3;
        r1 r1VarT;
        b2.r rVar4;
        float f4;
        g0 g0Var = (g0) jVar;
        g0Var.e0(2020725915);
        int i5 = (g0Var.g(str) ? 4 : 2) | i | (g0Var.i(aVar) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                rVar2 = rVar;
                i5 |= g0Var.g(rVar2) ? 256 : 128;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                if ((i & 3072) == 0) {
                    f2 = f;
                    if (g0Var.d(f2)) {
                        i4 = 2048;
                    } else {
                        i4 = 1024;
                    }
                    i5 |= i4;
                }
                if ((i5 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (g0Var.S(i5 & 1, z)) {
                    if (i6 != 0) {
                        rVar4 = b2.o.A;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i3 != 0) {
                        f4 = 16;
                    } else {
                        f4 = f2;
                    }
                    h0.c.a(h0.c.E(z1.d(rVar4, 1.0f), f4, 0.0f, 2), (b2.d) null, false, v1.d.d(1531593969, new m0(str, z3.U(g0Var, 2131886140), new r0(dl.a.p, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(20), (m3.z) null, 16646140), aVar, m3.h0.i(g0Var), 5), g0Var), g0Var, 3072, 6);
                    rVar3 = rVar4;
                    f3 = f4;
                } else {
                    g0Var.V();
                    rVar3 = rVar2;
                    f3 = f2;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new q(str, aVar, rVar3, f3, i, i2);
                }
            }
            i5 |= 3072;
            f2 = f;
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i5 & 1, z)) {
                if (i6 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if (i3 != 0) {
                    f4 = 16;
                } else {
                    f4 = f2;
                }
                h0.c.a(h0.c.E(z1.d(rVar4, 1.0f), f4, 0.0f, 2), (b2.d) null, false, v1.d.d(1531593969, new m0(str, z3.U(g0Var, 2131886140), new r0(dl.a.p, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(20), (m3.z) null, 16646140), aVar, m3.h0.i(g0Var), 5), g0Var), g0Var, 3072, 6);
                rVar3 = rVar4;
                f3 = f4;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                f3 = f2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new q(str, aVar, rVar3, f3, i, i2);
            }
        }
        i5 |= 384;
        rVar2 = rVar;
        i3 = i2 & 8;
        if (i3 != 0) {
            if ((i & 3072) == 0) {
                f2 = f;
                if (g0Var.d(f2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i5 |= i4;
            }
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (g0Var.S(i5 & 1, z)) {
                if (i6 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                if (i3 != 0) {
                    f4 = 16;
                } else {
                    f4 = f2;
                }
                h0.c.a(h0.c.E(z1.d(rVar4, 1.0f), f4, 0.0f, 2), (b2.d) null, false, v1.d.d(1531593969, new m0(str, z3.U(g0Var, 2131886140), new r0(dl.a.p, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(20), (m3.z) null, 16646140), aVar, m3.h0.i(g0Var), 5), g0Var), g0Var, 3072, 6);
                rVar3 = rVar4;
                f3 = f4;
            } else {
                g0Var.V();
                rVar3 = rVar2;
                f3 = f2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new q(str, aVar, rVar3, f3, i, i2);
            }
        }
        i5 |= 3072;
        f2 = f;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (g0Var.S(i5 & 1, z)) {
            if (i6 != 0) {
                rVar4 = b2.o.A;
            } else {
                rVar4 = rVar2;
            }
            if (i3 != 0) {
                f4 = 16;
            } else {
                f4 = f2;
            }
            h0.c.a(h0.c.E(z1.d(rVar4, 1.0f), f4, 0.0f, 2), (b2.d) null, false, v1.d.d(1531593969, new m0(str, z3.U(g0Var, 2131886140), new r0(dl.a.p, kh.o.z(15), (q3.u) null, (q3.i) null, 0L, 0L, 0, 0, kh.o.z(20), (m3.z) null, 16646140), aVar, m3.h0.i(g0Var), 5), g0Var), g0Var, 3072, 6);
            rVar3 = rVar4;
            f3 = f4;
        } else {
            g0Var.V();
            rVar3 = rVar2;
            f3 = f2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new q(str, aVar, rVar3, f3, i, i2);
        }
    }

    public static final void d(lo.k kVar, u00.k kVar2, l1.j jVar, int i) {
        u00.k kVar3;
        boolean z;
        lo.k kVar4 = kVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1688774123);
        int i2 = i | (g0Var.g(kVar4) ? 4 : 2) | (g0Var.i(kVar2) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.o oVar = b2.o.A;
            float f = 24;
            b2.r rVarG = h0.c.G(z1.d(oVar, 1.0f), 0.0f, 0.0f, 0.0f, f, 7);
            b2.g gVar = b2.b.N;
            h0.v vVarA = h0.u.a(h0.i.g(f), gVar, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
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
            l1.q.I(rVarC, g0Var, fVar4);
            lo.e eVar2 = kVar4.e;
            String str = kVar4.d;
            float f2 = 12;
            h0.a(eVar2, f2.h.c(z1.m(oVar, 240), p0.f.a(f2)), f2, false, null, false, g0Var, 384, 56);
            b2.r rVarE = h0.c.E(oVar, 16, 0.0f, 2);
            h0.v vVarA2 = h0.u.a(h0.i.g(9), gVar, g0Var, 54);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarE, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC2, g0Var, fVar4);
            kVar4 = kVar;
            z6.b(kVar4.c, (b2.r) null, dl.a.n, kh.o.z(28), q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(34), 0, false, 2, 0, (u00.k) null, (r0) null, g0Var, 1597440, 24624, 242602);
            g0Var = g0Var;
            lo.a aVar = kVar4.f;
            if (aVar == null) {
                g0Var.c0(802541428);
                z = false;
            } else {
                z = false;
                g0Var.c0(802541429);
                ro.f.h(aVar, null, g0Var, 0, 2);
            }
            g0Var.r(z);
            g0Var.r(true);
            lo.s sVar = kVar4.h;
            lo.i iVar = kVar4.i;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32 ? true : z;
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (z2 || objN == obj) {
                kVar3 = kVar2;
                objN = new y0(25, kVar3);
                g0Var.n0(objN);
            } else {
                kVar3 = kVar2;
            }
            u00.a aVar2 = (u00.a) objN;
            boolean z3 = i3 == 32 ? true : z;
            Object objN2 = g0Var.N();
            if (z3 || objN2 == obj) {
                objN2 = new y0(26, kVar3);
                g0Var.n0(objN2);
            }
            u00.a aVar3 = (u00.a) objN2;
            boolean z4 = i3 == 32 ? true : z;
            Object objN3 = g0Var.N();
            if (z4 || objN3 == obj) {
                objN3 = new y0(27, kVar3);
                g0Var.n0(objN3);
            }
            ro.f.g(sVar, iVar, aVar2, aVar3, (u00.a) objN3, null, g0Var, 0, 32);
            if (r30.k.L0(str)) {
                g0Var.c0(-990580179);
                g0Var.r(z);
            } else {
                g0Var.c0(-990754120);
                boolean z5 = i3 == 32 ? true : z;
                Object objN4 = g0Var.N();
                if (z5 || objN4 == obj) {
                    objN4 = new y0(28, kVar3);
                    g0Var.n0(objN4);
                }
                c(str, (u00.a) objN4, null, 0.0f, g0Var, 0, 12);
                g0Var = g0Var;
                g0Var.r(z);
            }
            g0Var.r(true);
        } else {
            kVar3 = kVar2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new p(kVar4, kVar3, i, 1);
        }
    }

    public static final void e(lo.e eVar, b2.r rVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(211051779);
        int i2 = (g0Var.g(eVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            float f = 16;
            p0.e eVarA = p0.f.a(f);
            long j = dl.a.L;
            h0.a(eVar, f2.h.c(f2.h.j(rVar, 20, eVarA, i2.t.b(0.3f, j), i2.t.b(0.3f, j), 4), p0.f.a(f)), f, false, null, false, g0Var, (i2 & 14) | 384, 56);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l0.g0(eVar, rVar, i, 17);
        }
    }

    public static final void f(lo.e eVar, l1.j jVar, int i) {
        lo.e eVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-382701511);
        int i2 = (g0Var.g(eVar) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            int iR0 = ((y3.c) g0Var.k(o1.h)).R0(360);
            b2.r rVarA = f2.h.a(f2.h.b(z1.c, 200, (i2.o0) null), 0.7f);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarA, g0Var);
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
            Object objN = g0Var.N();
            if (objN == l1.i.a) {
                objN = new pz.m(3);
                g0Var.n0(objN);
            }
            eVar2 = eVar;
            h0.a(eVar2, d0.l(b2.o.A, (u00.o) objN), 0.0f, false, Integer.valueOf(iR0), false, g0Var, (i2 & 14) | 3072, 36);
            g0Var.r(true);
        } else {
            eVar2 = eVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new m3.a(eVar2, i, 13);
        }
    }

    public static final void g(lo.k kVar, u00.k kVar2, l1.j jVar, int i) {
        b2.r rVar;
        float f;
        g0 g0Var = (g0) jVar;
        g0Var.e0(927121649);
        int i2 = i | (g0Var.g(kVar) ? 4 : 2) | (g0Var.i(kVar2) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.r rVar2 = b2.o.A;
            float f2 = 16;
            float f3 = 24;
            b2.r rVarF = h0.c.F(z1.d(rVar2, 1.0f), f2, f3, f3, 12);
            v1 v1VarA = t1.a(h0.i.g(32), b2.b.J, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarF, g0Var);
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
            l1.q.I(rVarC, g0Var, fVar4);
            lo.e eVar2 = kVar.e;
            String str = kVar.d;
            e(eVar2, z1.m(rVar2, 192), g0Var, 48);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(c1Var, g0Var);
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
            boolean z = false;
            z6.b(kVar.c, (b2.r) null, dl.a.n, kh.o.z(32), q3.u.M, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(36), 2, false, 2, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 239530);
            lo.a aVar = kVar.f;
            if (aVar == null) {
                g0Var.c0(-300711689);
                g0Var.r(false);
                rVar = rVar2;
            } else {
                g0Var.c0(-300711688);
                rVar = rVar2;
                ro.f.h(aVar, h0.c.G(rVar, 0.0f, 9, 0.0f, 0.0f, 13), g0Var, 48, 0);
                g0Var.r(false);
            }
            boolean zL0 = r30.k.L0(str);
            Object obj = l1.i.a;
            if (zL0) {
                f = f2;
                g0Var.c0(-300196437);
                g0Var.r(false);
            } else {
                g0Var.c0(-300493386);
                boolean z2 = (i2 & 112) == 32;
                Object objN = g0Var.N();
                if (z2 || objN == obj) {
                    objN = new y0(21, kVar2);
                    g0Var.n0(objN);
                }
                f = f2;
                c(str, (u00.a) objN, h0.c.G(rVar, 0.0f, f, 0.0f, 0.0f, 13), 0, g0Var, 3456, 0);
                g0Var.r(false);
            }
            b2.r rVarG = h0.c.G(rVar, 0.0f, f, 0.0f, 0.0f, 13);
            lo.s sVar = kVar.h;
            lo.i iVar = kVar.i;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objN2 = g0Var.N();
            if (z3 || objN2 == obj) {
                objN2 = new y0(22, kVar2);
                g0Var.n0(objN2);
            }
            u00.a aVar2 = (u00.a) objN2;
            boolean z4 = i3 == 32;
            Object objN3 = g0Var.N();
            if (z4 || objN3 == obj) {
                objN3 = new y0(23, kVar2);
                g0Var.n0(objN3);
            }
            u00.a aVar3 = (u00.a) objN3;
            if (i3 == 32) {
                z = true;
            }
            Object objN4 = g0Var.N();
            if (z || objN4 == obj) {
                objN4 = new y0(24, kVar2);
                g0Var.n0(objN4);
            }
            ro.f.g(sVar, iVar, aVar2, aVar3, (u00.a) objN4, rVarG, g0Var, 196608, 0);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new p(kVar, kVar2, i, 0);
        }
    }

    public static final String h(int i, String str) {
        CharSequence charSequenceSubSequence;
        String strH1 = r30.k.h1(i, str);
        int length = strH1.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i2 = length - 1;
            char cCharAt = strH1.charAt(length);
            if (!z3.J(cCharAt) && cCharAt != '.' && cCharAt != ',') {
                charSequenceSubSequence = strH1.subSequence(0, length + 1);
                break;
            }
            if (i2 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i2;
        }
        return w.c.j(charSequenceSubSequence.toString(), "…");
    }
}
