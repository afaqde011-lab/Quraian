package az;

import a1.z;
import a40.g1;
import androidx.lifecycle.f1;
import as.e0;
import as.f0;
import as.o0;
import c3.o1;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import g2.t;
import h0.a0;
import h0.m2;
import h0.p1;
import h0.s;
import h0.z1;
import i2.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import l1.g0;
import l1.m1;
import l1.r1;
import l1.z0;
import qd.s0;
import z2.d0;
import z2.w0;

public abstract class a {
    public static final v1.c a = new v1.c(new al.c(4), -290227772, false);
    public static final v1.c b = new v1.c(new al.c(5), 886993467, false);
    public static final v1.c c = new v1.c(new al.c(6), 1591393979, false);

    public static final void a(q qVar, u00.k kVar, boolean z, l1.j jVar, int i, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        u00.k kVar2;
        r1 r1VarT;
        boolean z4;
        g2.l lVar;
        Object objN;
        Object obj;
        t tVar;
        ArrayList arrayList;
        u30.b bVarD0;
        ArrayList arrayList2;
        Iterator<E> it;
        Boolean boolValueOf;
        int i4;
        boolean z5;
        boolean zI;
        Object gVar;
        Object obj2;
        Boolean bool;
        y3.c cVar;
        Object objN2;
        z0 z0Var;
        boolean z6;
        float fC;
        boolean z7;
        b3.g gVar2;
        int i5;
        boolean z8;
        float f;
        float f2;
        boolean z9;
        int i6;
        boolean z11;
        boolean zI2;
        Object objN3;
        b2.o oVar;
        s sVar;
        boolean z12;
        boolean z13;
        q qVar2;
        float f3;
        int i7;
        b2.r rVarM;
        boolean z14;
        Object objN4;
        boolean z15;
        boolean z16;
        Object objN5;
        boolean zG;
        Object objN6;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1624112937);
        int i8 = (g0Var.g(qVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i8 |= g0Var.i(kVar) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i8 |= g0Var.h(z2) ? 256 : 128;
            }
            i3 = i8;
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (g0Var.S(i3 & 1, z3)) {
                if (i9 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                kk.c cVarD = kk.e.d(g0Var);
                lVar = (g2.l) g0Var.k(o1.i);
                objN = g0Var.N();
                obj = l1.i.a;
                if (objN == obj) {
                    objN = new t();
                    g0Var.n0(objN);
                }
                tVar = (t) objN;
                u30.b bVar = qVar.a;
                boolean z17 = qVar.d;
                arrayList = new ArrayList();
                for (Object obj3 : bVar) {
                    ((ry.c) obj3).getClass();
                    arrayList.add(obj3);
                }
                bVarD0 = g4.d0(arrayList);
                u30.b bVar2 = qVar.a;
                arrayList2 = new ArrayList();
                it = bVar2.iterator();
                while (it.hasNext()) {
                    ((ry.c) it.next()).getClass();
                }
                boolValueOf = Boolean.valueOf(z17);
                i4 = i3 & 14;
                if (i4 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zI = z5 | g0Var.i(lVar);
                Object objN7 = g0Var.N();
                if (!zI || objN7 == obj) {
                    obj2 = obj;
                    bool = boolValueOf;
                    gVar = new a1.g(qVar, lVar, tVar, (k00.c) null, 5);
                    g0Var.n0(gVar);
                } else {
                    gVar = objN7;
                    bool = boolValueOf;
                    obj2 = obj;
                }
                l1.q.i(bool, g0Var, (u00.n) gVar);
                cVar = (y3.c) g0Var.k(o1.h);
                objN2 = g0Var.N();
                if (objN2 == obj2) {
                    objN2 = x5.s(0, g0Var);
                }
                z0Var = (z0) objN2;
                if (z4 || z17) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z4) {
                    g0Var.c0(1142893012);
                    g0Var.r(false);
                    float f4 = 16;
                    fC = 44 + f4 + f4;
                    z7 = false;
                } else {
                    g0Var.c0(1142937466);
                    WeakHashMap weakHashMap = m2.w;
                    fC = h0.c.l(h0.b.e(g0Var).f, g0Var).c() + 44 + 16;
                    z7 = false;
                    g0Var.r(false);
                }
                a0 a0Var = z1.c;
                b2.r rVarF = z.n.f(a0Var, dl.a.L, b0.b);
                b2.i iVar = b2.b.A;
                w0 w0VarD = h0.o.d(iVar, z7);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.r rVarC = b2.a.c(rVarF, g0Var);
                b3.i.c.getClass();
                gVar2 = b3.h.b;
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
                b2.r rVarA = kk.e.a(a0Var, cVarD);
                if (z6) {
                    z8 = false;
                    f = ab.a0.v(new y3.f(((y3.f) z0Var.getValue()).A - qz.f.a), new y3.f(0)).A;
                    i5 = 16;
                } else {
                    i5 = 16;
                    z8 = false;
                    f = 16;
                }
                f2 = i5;
                p1 p1Var = new p1(f2, fC, f2, f);
                h0.f fVarG = h0.i.g(f2);
                boolean zG2 = g0Var.g(bVarD0);
                if (i4 == 4) {
                    z9 = true;
                } else {
                    z9 = z8;
                }
                boolean z18 = zG2 | z9;
                i6 = i3 & 112;
                if (i6 == 32) {
                    z11 = true;
                } else {
                    z11 = z8;
                }
                zI2 = z18 | z11 | g0Var.i(arrayList2);
                objN3 = g0Var.N();
                if (zI2 || objN3 == obj2) {
                    k kVar3 = new k(bVarD0, arrayList2, qVar, kVar, 0);
                    g0Var.n0(kVar3);
                    objN3 = kVar3;
                }
                Object obj4 = obj2;
                k00.f.d(rVarA, null, p1Var, fVarG, null, null, false, null, (u00.k) objN3, g0Var, 24576, 490);
                oVar = b2.o.A;
                sVar = s.a;
                if (z6) {
                    g0Var.c0(1982039794);
                    b2.r rVarA2 = sVar.a(oVar, b2.b.H);
                    zG = g0Var.g(cVar);
                    objN6 = g0Var.N();
                    if (zG || objN6 == obj4) {
                        objN6 = new f0(cVar, z0Var, 1);
                        g0Var.n0(objN6);
                    }
                    z12 = z4;
                    qVar2 = qVar;
                    kVar2 = kVar;
                    qz.f.a(z12, d0.o(rVarA2, (u00.k) objN6), v1.d.d(-1511925899, new o0(qVar2, kVar2, tVar, z12, 1), g0Var), g0Var, ((i3 >> 6) & 14) | 384);
                    z13 = false;
                    g0Var.r(false);
                } else {
                    z12 = z4;
                    z13 = false;
                    qVar2 = qVar;
                    kVar2 = kVar;
                    g0Var.c0(1983240083);
                    g0Var.r(false);
                }
                if (z12) {
                    g0Var.c0(1983298580);
                    if (qVar2.e || qVar2.f) {
                        z15 = z13;
                    } else {
                        z15 = true;
                    }
                    boolean z19 = qVar2.f;
                    b2.r rVarD = h0.c.D(sVar.a(oVar, b2.b.C), f2, f2);
                    if (r2 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objN5 = g0Var.N();
                    if (z16 || objN5 == obj4) {
                        objN5 = new e0(8, kVar2);
                        g0Var.n0(objN5);
                    }
                    boolean z21 = z15;
                    i7 = i6;
                    f3 = f2;
                    s0.F(z21, z19, (u00.a) objN5, rVarD, true, 2131887212, g0Var, 24576, 0);
                    g0Var.r(false);
                } else {
                    f3 = f2;
                    i7 = r2;
                    g0Var.c0(1983799571);
                    g0Var.r(z13);
                }
                b2.r rVarE = h0.c.E(sVar.a(oVar, iVar), f3, 0.0f, 2);
                if (z12 != 0) {
                    rVarM = h0.c.G(oVar, 0.0f, f3, 0.0f, 0.0f, 13);
                } else {
                    rVarM = h0.c.M(oVar, h0.c.e);
                }
                b2.r rVarV = rVarE.V(rVarM);
                p0.e eVar = p0.f.a;
                float f5 = 0;
                float f6 = 44;
                long jB = i2.t.b(0.5f, dl.a.P);
                if (i7 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objN4 = g0Var.N();
                if (z14 || objN4 == r4) {
                    objN4 = new e0(9, kVar2);
                    g0Var.n0(objN4);
                }
                w50.c.f((u00.a) objN4, cVarD, rVarV, false, false, 0.0f, new y3.f(f6), 0L, jB, 10.0f, eVar, f5, c, g0Var, 806879232, 432, 184);
                g0Var = g0Var;
                g0Var.r(true);
                z2 = z12;
            } else {
                kVar2 = kVar;
                g0Var.V();
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new l(qVar, kVar2, z2, i, i2, 0);
            }
        }
        i8 |= 384;
        z2 = z;
        i3 = i8;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (g0Var.S(i3 & 1, z3)) {
            if (i9 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            kk.c cVarD2 = kk.e.d(g0Var);
            lVar = (g2.l) g0Var.k(o1.i);
            objN = g0Var.N();
            obj = l1.i.a;
            if (objN == obj) {
                objN = new t();
                g0Var.n0(objN);
            }
            tVar = (t) objN;
            u30.b bVar3 = qVar.a;
            boolean z110 = qVar.d;
            arrayList = new ArrayList();
            while (r5.hasNext()) {
                ((ry.c) obj3).getClass();
                arrayList.add(obj3);
            }
            bVarD0 = g4.d0(arrayList);
            u30.b bVar4 = qVar.a;
            arrayList2 = new ArrayList();
            it = bVar4.iterator();
            while (it.hasNext()) {
                ((ry.c) it.next()).getClass();
            }
            boolValueOf = Boolean.valueOf(z110);
            i4 = i3 & 14;
            if (i4 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            zI = z5 | g0Var.i(lVar);
            Object objN8 = g0Var.N();
            if (zI) {
                obj2 = obj;
                bool = boolValueOf;
                gVar = new a1.g(qVar, lVar, tVar, (k00.c) null, 5);
                g0Var.n0(gVar);
            } else {
                obj2 = obj;
                bool = boolValueOf;
                gVar = new a1.g(qVar, lVar, tVar, (k00.c) null, 5);
                g0Var.n0(gVar);
            }
            l1.q.i(bool, g0Var, (u00.n) gVar);
            cVar = (y3.c) g0Var.k(o1.h);
            objN2 = g0Var.N();
            if (objN2 == obj2) {
                objN2 = x5.s(0, g0Var);
            }
            z0Var = (z0) objN2;
            if (z4) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (z4) {
                g0Var.c0(1142893012);
                g0Var.r(false);
                float f7 = 16;
                fC = 44 + f7 + f7;
                z7 = false;
            } else {
                g0Var.c0(1142937466);
                WeakHashMap weakHashMap2 = m2.w;
                fC = h0.c.l(h0.b.e(g0Var).f, g0Var).c() + 44 + 16;
                z7 = false;
                g0Var.r(false);
            }
            a0 a0Var2 = z1.c;
            b2.r rVarF2 = z.n.f(a0Var2, dl.a.L, b0.b);
            b2.i iVar2 = b2.b.A;
            w0 w0VarD2 = h0.o.d(iVar2, z7);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarF2, g0Var);
            b3.i.c.getClass();
            gVar2 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, b3.h.f);
            l1.q.I(m1VarM2, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC2, g0Var, b3.h.d);
            b2.r rVarA3 = kk.e.a(a0Var2, cVarD2);
            if (z6) {
                z8 = false;
                f = ab.a0.v(new y3.f(((y3.f) z0Var.getValue()).A - qz.f.a), new y3.f(0)).A;
                i5 = 16;
            } else {
                i5 = 16;
                z8 = false;
                f = 16;
            }
            f2 = i5;
            p1 p1Var2 = new p1(f2, fC, f2, f);
            h0.f fVarG2 = h0.i.g(f2);
            boolean zG3 = g0Var.g(bVarD0);
            if (i4 == 4) {
                z9 = true;
            } else {
                z9 = z8;
            }
            boolean z111 = zG3 | z9;
            i6 = i3 & 112;
            if (i6 == 32) {
                z11 = true;
            } else {
                z11 = z8;
            }
            zI2 = z111 | z11 | g0Var.i(arrayList2);
            objN3 = g0Var.N();
            if (zI2) {
                k kVar4 = new k(bVarD0, arrayList2, qVar, kVar, 0);
                g0Var.n0(kVar4);
                objN3 = kVar4;
            } else {
                k kVar5 = new k(bVarD0, arrayList2, qVar, kVar, 0);
                g0Var.n0(kVar5);
                objN3 = kVar5;
            }
            Object obj5 = obj2;
            k00.f.d(rVarA3, null, p1Var2, fVarG2, null, null, false, null, (u00.k) objN3, g0Var, 24576, 490);
            oVar = b2.o.A;
            sVar = s.a;
            if (z6) {
                g0Var.c0(1982039794);
                b2.r rVarA4 = sVar.a(oVar, b2.b.H);
                zG = g0Var.g(cVar);
                objN6 = g0Var.N();
                if (zG) {
                    objN6 = new f0(cVar, z0Var, 1);
                    g0Var.n0(objN6);
                } else {
                    objN6 = new f0(cVar, z0Var, 1);
                    g0Var.n0(objN6);
                }
                z12 = z4;
                qVar2 = qVar;
                kVar2 = kVar;
                qz.f.a(z12, d0.o(rVarA4, (u00.k) objN6), v1.d.d(-1511925899, new o0(qVar2, kVar2, tVar, z12, 1), g0Var), g0Var, ((i3 >> 6) & 14) | 384);
                z13 = false;
                g0Var.r(false);
            } else {
                z12 = z4;
                z13 = false;
                qVar2 = qVar;
                kVar2 = kVar;
                g0Var.c0(1983240083);
                g0Var.r(false);
            }
            if (z12) {
                g0Var.c0(1983298580);
                if (qVar2.e) {
                    z15 = z13;
                } else {
                    z15 = z13;
                }
                boolean z112 = qVar2.f;
                b2.r rVarD2 = h0.c.D(sVar.a(oVar, b2.b.C), f2, f2);
                if (r2 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objN5 = g0Var.N();
                if (z16) {
                    objN5 = new e0(8, kVar2);
                    g0Var.n0(objN5);
                } else {
                    objN5 = new e0(8, kVar2);
                    g0Var.n0(objN5);
                }
                boolean z22 = z15;
                i7 = i6;
                f3 = f2;
                s0.F(z22, z112, (u00.a) objN5, rVarD2, true, 2131887212, g0Var, 24576, 0);
                g0Var.r(false);
            } else {
                f3 = f2;
                i7 = r2;
                g0Var.c0(1983799571);
                g0Var.r(z13);
            }
            b2.r rVarE2 = h0.c.E(sVar.a(oVar, iVar2), f3, 0.0f, 2);
            if (z12 != 0) {
                rVarM = h0.c.G(oVar, 0.0f, f3, 0.0f, 0.0f, 13);
            } else {
                rVarM = h0.c.M(oVar, h0.c.e);
            }
            b2.r rVarV2 = rVarE2.V(rVarM);
            p0.e eVar2 = p0.f.a;
            float f8 = 0;
            float f9 = 44;
            long jB2 = i2.t.b(0.5f, dl.a.P);
            if (i7 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objN4 = g0Var.N();
            if (z14) {
                objN4 = new e0(9, kVar2);
                g0Var.n0(objN4);
            } else {
                objN4 = new e0(9, kVar2);
                g0Var.n0(objN4);
            }
            w50.c.f((u00.a) objN4, cVarD2, rVarV2, false, false, 0.0f, new y3.f(f9), 0L, jB2, 10.0f, eVar2, f8, c, g0Var, 806879232, 432, 184);
            g0Var = g0Var;
            g0Var.r(true);
            z2 = z12;
        } else {
            kVar2 = kVar;
            g0Var.V();
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new l(qVar, kVar2, z2, i, i2, 0);
        }
    }

    public static final void b(l1.j jVar, int i) {
        l1.j jVar2;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1575967983);
        if (jVar3.S(i & 1, i != 0)) {
            e60.a aVarA = q50.c.a(jVar3);
            boolean zG = jVar3.g((Object) null) | jVar3.g(aVarA);
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (zG || objN == cVar) {
                objN = oi.k.f(kotlin.jvm.internal.a0.a, sy.c.class, aVarA, (b60.a) null, jVar3);
            }
            sy.c cVar2 = (sy.c) objN;
            u00.a aVarA2 = cq.l.a(jVar3);
            ol.b bVar = (ol.b) jVar3.k(ol.a.a);
            f1 f1VarA = u6.a.a(jVar3);
            if (f1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            r rVar = (r) c7.i.S(kotlin.jvm.internal.a0.a.b(r.class), f1VarA.getViewModelStore(), (String) null, bi.b.z(f1VarA), q50.c.a(jVar3), (u00.a) null);
            z0 z0VarQ = k00.f.q(rVar.c.d, jVar3, 0);
            boolean zG2 = jVar3.g(rVar) | jVar3.g(aVarA2) | jVar3.i(cVar2) | jVar3.g(bVar);
            Object objN2 = jVar3.N();
            if (zG2 || objN2 == cVar) {
                a1.g gVar = new a1.g(rVar, aVarA2, cVar2, bVar, (k00.c) null, 6);
                jVar3.n0(gVar);
                objN2 = gVar;
            }
            l1.q.i(g00.b0.a, jVar3, (u00.n) objN2);
            if (jVar3.k(dl.e.a) == gm.a.B) {
                jVar3.c0(1375652795);
                float f = qz.d.a;
                float f2 = qz.d.b;
                boolean zG3 = jVar3.g(rVar);
                Object objN3 = jVar3.N();
                if (zG3 || objN3 == cVar) {
                    objN3 = new z(rVar, 11);
                    jVar3.n0(objN3);
                }
                jVar2 = jVar3;
                qz.d.a(f, f2, (u00.a) objN3, true, 0L, false, v1.d.d(377770176, new al.i(rVar, z0VarQ, 1), jVar3), jVar2, 1575936, 48);
                jVar2.r(false);
            } else {
                jVar2 = jVar3;
                jVar2.c0(1376122414);
                q qVar = (q) z0VarQ.getValue();
                boolean zG4 = jVar2.g(rVar);
                Object objN4 = jVar2.N();
                if (zG4 || objN4 == cVar) {
                    objN4 = new g1(1, rVar, r.class, "action", "action(Lcom/mchutov/quranify/settings/presentation/screen/deletequestionnaire/DeleteAccountQuestionnaireAction;)V", 0, 10);
                    jVar2.n0(objN4);
                }
                a(qVar, (u00.k) ((a10.g) objN4), false, jVar2, 0, 4);
                jVar2.r(false);
            }
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new ax.c(i, 10);
        }
    }
}
