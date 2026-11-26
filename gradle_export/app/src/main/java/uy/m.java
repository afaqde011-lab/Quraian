package uy;

import androidx.lifecycle.f1;
import as.f0;
import b2.o;
import b2.r;
import c3.o1;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.x5;
import gz.e1;
import h0.a0;
import h0.m2;
import h0.p1;
import h0.s;
import h0.z1;
import i2.b0;
import i2.t;
import java.util.WeakHashMap;
import l1.g0;
import l1.m1;
import l1.q;
import l1.r1;
import l1.z0;
import q0.f2;
import ur.d1;
import z.n;
import z2.d0;
import z2.w0;

public abstract class m {
    public static final v1.c a = new v1.c(new pz.m(14), 2111231359, false);

    public static final void a(k kVar, u00.k kVar2, boolean z, l1.j jVar, int i, int i2) {
        boolean z2;
        boolean z3;
        k kVar3;
        g0 g0Var;
        boolean z4;
        r1 r1VarT;
        boolean z5;
        y3.c cVar;
        Object objN;
        Object obj;
        z0 z0Var;
        float fC;
        b3.g gVar;
        float f;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objN2;
        boolean z9;
        o oVar;
        boolean zG;
        Object objN3;
        r rVarM;
        int i3;
        boolean z11;
        Object objN4;
        boolean z12;
        boolean z13;
        Object objN5;
        boolean z14;
        Object objN6;
        Object objN7;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-1854579119);
        int i4 = (g0Var2.g(kVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= g0Var2.i(kVar2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i4 |= g0Var2.h(z2) ? 256 : 128;
            }
            if ((i4 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var2.S(i4 & 1, z3)) {
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                kk.c cVarD = kk.e.d(g0Var2);
                cVar = (y3.c) g0Var2.k(o1.h);
                objN = g0Var2.N();
                obj = l1.i.a;
                if (objN == obj) {
                    objN = x5.s(0, g0Var2);
                }
                z0Var = (z0) objN;
                if (z5) {
                    g0Var2.c0(693115916);
                    g0Var2.r(false);
                    float f2 = 16;
                    fC = 44 + f2 + f2;
                } else {
                    g0Var2.c0(693160370);
                    WeakHashMap weakHashMap = m2.w;
                    fC = 16 + h0.c.l(h0.b.e(g0Var2).f, g0Var2).c() + 44;
                    g0Var2.r(false);
                }
                a0 a0Var = z1.c;
                r rVarF = n.f(a0Var, dl.a.L, b0.b);
                b2.i iVar = b2.b.A;
                w0 w0VarD = h0.o.d(iVar, false);
                int iHashCode = Long.hashCode(g0Var2.T);
                m1 m1VarM = g0Var2.m();
                r rVarC = b2.a.c(rVarF, g0Var2);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                q.I(w0VarD, g0Var2, b3.h.f);
                q.I(m1VarM, g0Var2, b3.h.e);
                q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
                q.E(g0Var2, b3.h.h);
                q.I(rVarC, g0Var2, b3.h.d);
                r rVarA = kk.e.a(a0Var, cVarD);
                float f3 = 0;
                float f4 = ab.a0.v(new y3.f(((y3.f) z0Var.getValue()).A - qz.f.a), new y3.f(f3)).A;
                f = 16;
                p1 p1Var = new p1(f, fC, f, f4);
                h0.f fVarG = h0.i.g(12);
                if ((i4 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                int i6 = i4;
                if ((i4 & 14) == 4) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z7 | z6;
                objN2 = g0Var2.N();
                if (z8 || objN2 == obj) {
                    objN2 = new e.c(kVar, z5, 1);
                    g0Var2.n0(objN2);
                }
                z9 = z5;
                k00.f.d(rVarA, null, p1Var, fVarG, null, null, false, null, (u00.k) objN2, g0Var2, 24576, 490);
                b2.i iVar2 = b2.b.H;
                s sVar = s.a;
                oVar = o.A;
                r rVarA2 = sVar.a(oVar, iVar2);
                zG = g0Var2.g(cVar);
                objN3 = g0Var2.N();
                if (zG || objN3 == obj) {
                    objN3 = new f0(cVar, z0Var, 17);
                    g0Var2.n0(objN3);
                }
                qz.f.a(z9, d0.o(rVarA2, (u00.k) objN3), v1.d.d(458502464, new sp.b(3, kVar2, z9), g0Var2), g0Var2, ((i6 >> 6) & 14) | 384);
                r rVarE = h0.c.E(sVar.a(oVar, iVar), f, 0.0f, 2);
                if (z9) {
                    rVarM = h0.c.G(oVar, 0.0f, f, 0.0f, 0.0f, 13);
                } else {
                    rVarM = h0.c.M(oVar, h0.c.e);
                }
                r rVarV = rVarE.V(rVarM);
                p0.e eVar = p0.f.a;
                float f5 = 44;
                long jB = t.b(0.5f, dl.a.P);
                i3 = i6 & 112;
                if (i3 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objN4 = g0Var2.N();
                if (z11 || objN4 == obj) {
                    objN4 = new d1(10, kVar2);
                    g0Var2.n0(objN4);
                }
                w50.c.f((u00.a) objN4, cVarD, rVarV, false, false, 0.0f, new y3.f(f5), 0L, jB, 10.0f, eVar, f3, a, g0Var2, 806879232, 432, 184);
                g0Var = g0Var2;
                g0Var.r(true);
                kVar3 = kVar;
                z12 = true;
                boolean z15 = kVar3.b;
                if (i3 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objN5 = g0Var.N();
                if (z13 || objN5 == obj) {
                    objN5 = new d1(11, kVar2);
                    g0Var.n0(objN5);
                }
                u00.a aVar = (u00.a) objN5;
                if (i3 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objN6 = g0Var.N();
                if (z14 || objN6 == obj) {
                    objN6 = new d1(12, kVar2);
                    g0Var.n0(objN6);
                }
                u00.a aVar2 = (u00.a) objN6;
                if (i3 != 32) {
                    z12 = false;
                }
                objN7 = g0Var.N();
                if (z12 || objN7 == obj) {
                    objN7 = new d1(13, kVar2);
                    g0Var.n0(objN7);
                }
                b5.b(z15, aVar, aVar2, (u00.a) objN7, z9, g0Var, (i6 << 6) & 57344);
                z4 = z9;
            } else {
                kVar3 = kVar;
                g0Var = g0Var2;
                g0Var.V();
                z4 = z2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new az.l(kVar3, kVar2, z4, i, i2, 6);
            }
        }
        i4 |= 384;
        z2 = z;
        if ((i4 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var2.S(i4 & 1, z3)) {
            if (i5 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            kk.c cVarD2 = kk.e.d(g0Var2);
            cVar = (y3.c) g0Var2.k(o1.h);
            objN = g0Var2.N();
            obj = l1.i.a;
            if (objN == obj) {
                objN = x5.s(0, g0Var2);
            }
            z0Var = (z0) objN;
            if (z5) {
                g0Var2.c0(693115916);
                g0Var2.r(false);
                float f6 = 16;
                fC = 44 + f6 + f6;
            } else {
                g0Var2.c0(693160370);
                WeakHashMap weakHashMap2 = m2.w;
                fC = 16 + h0.c.l(h0.b.e(g0Var2).f, g0Var2).c() + 44;
                g0Var2.r(false);
            }
            a0 a0Var2 = z1.c;
            r rVarF2 = n.f(a0Var2, dl.a.L, b0.b);
            b2.i iVar3 = b2.b.A;
            w0 w0VarD2 = h0.o.d(iVar3, false);
            int iHashCode2 = Long.hashCode(g0Var2.T);
            m1 m1VarM2 = g0Var2.m();
            r rVarC2 = b2.a.c(rVarF2, g0Var2);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            q.I(w0VarD2, g0Var2, b3.h.f);
            q.I(m1VarM2, g0Var2, b3.h.e);
            q.I(Integer.valueOf(iHashCode2), g0Var2, b3.h.g);
            q.E(g0Var2, b3.h.h);
            q.I(rVarC2, g0Var2, b3.h.d);
            r rVarA3 = kk.e.a(a0Var2, cVarD2);
            float f7 = 0;
            float f8 = ab.a0.v(new y3.f(((y3.f) z0Var.getValue()).A - qz.f.a), new y3.f(f7)).A;
            f = 16;
            p1 p1Var2 = new p1(f, fC, f, f8);
            h0.f fVarG2 = h0.i.g(12);
            if ((i4 & 896) == 256) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i7 = i4;
            if ((i4 & 14) == 4) {
                z7 = true;
            } else {
                z7 = false;
            }
            z8 = z7 | z6;
            objN2 = g0Var2.N();
            if (z8) {
                objN2 = new e.c(kVar, z5, 1);
                g0Var2.n0(objN2);
            } else {
                objN2 = new e.c(kVar, z5, 1);
                g0Var2.n0(objN2);
            }
            z9 = z5;
            k00.f.d(rVarA3, null, p1Var2, fVarG2, null, null, false, null, (u00.k) objN2, g0Var2, 24576, 490);
            b2.i iVar4 = b2.b.H;
            s sVar2 = s.a;
            oVar = o.A;
            r rVarA4 = sVar2.a(oVar, iVar4);
            zG = g0Var2.g(cVar);
            objN3 = g0Var2.N();
            if (zG) {
                objN3 = new f0(cVar, z0Var, 17);
                g0Var2.n0(objN3);
            } else {
                objN3 = new f0(cVar, z0Var, 17);
                g0Var2.n0(objN3);
            }
            qz.f.a(z9, d0.o(rVarA4, (u00.k) objN3), v1.d.d(458502464, new sp.b(3, kVar2, z9), g0Var2), g0Var2, ((i7 >> 6) & 14) | 384);
            r rVarE2 = h0.c.E(sVar2.a(oVar, iVar3), f, 0.0f, 2);
            if (z9) {
                rVarM = h0.c.G(oVar, 0.0f, f, 0.0f, 0.0f, 13);
            } else {
                rVarM = h0.c.M(oVar, h0.c.e);
            }
            r rVarV2 = rVarE2.V(rVarM);
            p0.e eVar2 = p0.f.a;
            float f9 = 44;
            long jB2 = t.b(0.5f, dl.a.P);
            i3 = i7 & 112;
            if (i3 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            objN4 = g0Var2.N();
            if (z11) {
                objN4 = new d1(10, kVar2);
                g0Var2.n0(objN4);
            } else {
                objN4 = new d1(10, kVar2);
                g0Var2.n0(objN4);
            }
            w50.c.f((u00.a) objN4, cVarD2, rVarV2, false, false, 0.0f, new y3.f(f9), 0L, jB2, 10.0f, eVar2, f7, a, g0Var2, 806879232, 432, 184);
            g0Var = g0Var2;
            g0Var.r(true);
            kVar3 = kVar;
            z12 = true;
            boolean z16 = kVar3.b;
            if (i3 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objN5 = g0Var.N();
            if (z13) {
                objN5 = new d1(11, kVar2);
                g0Var.n0(objN5);
            } else {
                objN5 = new d1(11, kVar2);
                g0Var.n0(objN5);
            }
            u00.a aVar3 = (u00.a) objN5;
            if (i3 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objN6 = g0Var.N();
            if (z14) {
                objN6 = new d1(12, kVar2);
                g0Var.n0(objN6);
            } else {
                objN6 = new d1(12, kVar2);
                g0Var.n0(objN6);
            }
            u00.a aVar4 = (u00.a) objN6;
            if (i3 != 32) {
                z12 = false;
            }
            objN7 = g0Var.N();
            if (z12) {
                objN7 = new d1(13, kVar2);
                g0Var.n0(objN7);
            } else {
                objN7 = new d1(13, kVar2);
                g0Var.n0(objN7);
            }
            b5.b(z16, aVar3, aVar4, (u00.a) objN7, z9, g0Var, (i7 << 6) & 57344);
            z4 = z9;
        } else {
            kVar3 = kVar;
            g0Var = g0Var2;
            g0Var.V();
            z4 = z2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new az.l(kVar3, kVar2, z4, i, i2, 6);
        }
    }

    public static final void b(l1.j jVar, int i) {
        l1.j jVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(920982445);
        if (jVar3.S(i & 1, i != 0)) {
            e60.a aVarA = q50.c.a(jVar3);
            k00.c cVar = null;
            boolean zG = jVar3.g((Object) null) | jVar3.g(aVarA);
            Object objN = jVar3.N();
            l1.c cVar2 = l1.i.a;
            if (zG || objN == cVar2) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, sy.c.class, aVarA, (b60.a) null, jVar3);
            }
            sy.c cVar3 = (sy.c) objN;
            u00.a aVarA2 = cq.l.a(jVar3);
            f1 f1VarA = u6.a.a(jVar3);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            l lVar = (l) c7.i.S(kotlin.jvm.internal.a0.a.b(l.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(jVar3), (u00.a) null);
            z0 z0VarQ = k00.f.q(lVar.c.d, jVar3, 0);
            boolean zG2 = jVar3.g(lVar) | jVar3.g(aVarA2) | jVar3.i(cVar3);
            Object objN2 = jVar3.N();
            if (zG2 || objN2 == cVar2) {
                pz.k kVar = new pz.k(lVar, aVarA2, cVar3, cVar, 15);
                jVar3.n0(kVar);
                objN2 = kVar;
            }
            q.i(g00.b0.a, jVar3, (u00.n) objN2);
            if (jVar3.k(dl.e.a) == gm.a.B) {
                jVar3.c0(737677513);
                float f = qz.d.a;
                float f2 = qz.d.b;
                boolean zG3 = jVar3.g(lVar);
                Object objN3 = jVar3.N();
                if (zG3 || objN3 == cVar2) {
                    objN3 = new f2(lVar, 7);
                    jVar3.n0(objN3);
                }
                jVar2 = jVar3;
                qz.d.a(f, f2, (u00.a) objN3, true, 0L, false, v1.d.d(1231017724, new l0.g0(lVar, z0VarQ, 25), jVar3), jVar2, 1575936, 48);
                jVar2.r(false);
            } else {
                jVar2 = jVar3;
                jVar2.c0(738135414);
                k kVar2 = (k) z0VarQ.getValue();
                boolean zG4 = jVar2.g(lVar);
                Object objN4 = jVar2.N();
                if (zG4 || objN4 == cVar2) {
                    e1 e1Var = new e1(1, lVar, l.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/benefits/CancellationBenefitsAction;)V", 0, 22);
                    jVar2.n0(e1Var);
                    objN4 = e1Var;
                }
                a(kVar2, (u00.k) ((a10.g) objN4), false, jVar2, 0, 4);
                jVar2.r(false);
            }
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new sw.a(i, 11);
        }
    }
}
