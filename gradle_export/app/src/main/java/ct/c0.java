package ct;

import c3.o1;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import g1.x5;
import g1.z6;
import h0.c1;
import h0.t1;
import h0.v1;
import h0.z1;
import i2.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l1.m1;
import l1.r1;
import m3.p0;
import m3.r0;
import z2.w0;

public abstract class c0 {
    public static final float a = 30;
    public static final float b = 2;
    public static final r0 c = new r0(0, kh.o.z(13), q3.u.J, (q3.i) null, 0, 0, 0, 0, kh.o.z(13), (m3.z) null, 16646137);
    public static final ArrayList d;

    static {
        List listS = va.a.S(new String[]{"Ya-Sin", "Al-Mulk", "Al-Kahf", "Ar-Rahman", "Al-Fatihah", null});
        ArrayList arrayList = new ArrayList(h00.r.q0(listS, 10));
        int i = 0;
        for (Object obj : listS) {
            int i2 = i + 1;
            if (i < 0) {
                va.a.k0();
                throw null;
            }
            String str = (String) obj;
            arrayList.add(new ys.e(g4.c.f(i, "placeholder-"), str != null ? new ys.d(str, i2, "يس") : null, 20, 18, str == null));
            i = i2;
        }
        d = arrayList;
    }

    public static final void a(ys.e eVar, boolean z, l1.j jVar, int i) {
        int i2;
        boolean z2;
        String str;
        boolean z3;
        ys.e eVar2 = eVar;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(238018941);
        if ((i & 6) == 0) {
            i2 = i | (g0Var.g(eVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.h(z) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.o oVar = b2.o.A;
            float f = 8;
            float f2 = 16;
            b2.r rVarC = f2.h.c(h0.c.C(z1.d(oVar, 1.0f), f), p0.f.a(f2));
            long j = dl.a.i;
            long jB = i2.t.b(0.06f, j);
            o0 o0Var = i2.b0.b;
            b2.r rVarC2 = h0.c.C(z.n.f(rVarC, jB, o0Var), f);
            b2.g gVar = b2.b.N;
            h0.v vVarA = h0.u.a(h0.i.g(f), gVar, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarC2, g0Var);
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
            b3.e eVar3 = b3.h.h;
            l1.q.E(g0Var, eVar3);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC3, g0Var, fVar4);
            b2.r rVarM = z1.m(oVar, 50);
            int i3 = i2;
            p0.e eVarA = p0.f.a(f2);
            int i4 = (i3 & 112) | 6;
            b2.r rVarF = z.n.f(f2.h.c(c7.i.H(rVarM, z, eVarA), p0.f.a(f2)), i2.t.b(0.1f, j), o0Var);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC4 = b2.a.c(rVarF, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar3);
            l1.q.I(rVarC4, g0Var, fVar4);
            b2.r rVarM2 = z1.m(oVar, 24);
            o2.f fVarH0 = g4.h0(2131231194, g0Var, 6);
            long j2 = dl.a.n;
            z3.k(fVarH0, (String) null, rVarM2, j2, g0Var, 432);
            g0Var.r(true);
            if (eVar != null) {
                g0Var.c0(-697294026);
                h0.v vVarA2 = h0.u.a(h0.i.g(3), gVar, g0Var, 54);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                b2.r rVarC5 = b2.a.c(oVar, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA2, g0Var, fVar);
                l1.q.I(m1VarM3, g0Var, fVar2);
                a1.b.v(iHashCode3, g0Var, fVar3, g0Var, eVar3);
                l1.q.I(rVarC5, g0Var, fVar4);
                b2.r rVarF2 = f(i4, oVar, g0Var, z);
                g0Var.c0(-620613619);
                ys.d dVar = eVar.b;
                if (dVar == null) {
                    g0Var.r(false);
                    str = "";
                    z3 = false;
                } else {
                    String str2 = dVar.b;
                    String str3 = dVar.c;
                    if (r30.k.L0(str3)) {
                        str = str2;
                    } else {
                        str = str2 + " (" + str3 + ")";
                    }
                    z3 = false;
                    g0Var.r(false);
                }
                z6.b(str, rVarF2, j2, kh.o.z(17), q3.u.L, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(17), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 258984);
                eVar2 = eVar;
                z6.b(z3.T(2131886614, new Object[]{z3.U(g0Var, 2131886616), e(2131886615, new Object[]{Integer.valueOf(eVar2.c)}, g0Var)}, g0Var), f(i4, oVar, g0Var, z), i2.t.b(0.5f, dl.a.k), kh.o.z(13), q3.u.J, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(13), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 258984);
                g0Var = g0Var;
                z2 = true;
                g0Var.r(true);
                g0Var.r(false);
            } else {
                g0Var.c0(-696293253);
                h0.v vVarA3 = h0.u.a(h0.i.g(3), gVar, g0Var, 54);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                b2.r rVarC6 = b2.a.c(oVar, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar2);
                } else {
                    g0Var.q0();
                }
                l1.q.I(vVarA3, g0Var, fVar);
                l1.q.I(m1VarM4, g0Var, fVar2);
                a1.b.v(iHashCode4, g0Var, fVar3, g0Var, eVar3);
                l1.q.I(rVarC6, g0Var, fVar4);
                eVar2 = eVar;
                z6.b("—", (b2.r) null, j2, kh.o.z(17), q3.u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(17), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597446, 48, 260010);
                z6.b(z3.U(g0Var, 2131886613), (b2.r) null, i2.t.b(0.5f, dl.a.k), kh.o.z(13), q3.u.J, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(13), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 258986);
                g0Var = g0Var;
                z2 = true;
                g0Var.r(true);
                g0Var.r(false);
            }
            g0Var.r(z2);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new z(eVar2, z, i, 0);
        }
    }

    public static final void b(u30.b surahRows, b2.r rVar, boolean z, l1.j jVar, int i, int i2) {
        b2.r rVar2;
        int i3;
        b2.r rVar3;
        Integer numValueOf;
        Object next;
        b2.r rVar4;
        boolean z2;
        boolean z3;
        kotlin.jvm.internal.m.e(surahRows, "surahRows");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-671891231);
        int i4 = i | (g0Var.g(surahRows) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = i4 | (g0Var.g(rVar2) ? 32 : 16);
        }
        int i6 = i3 | (g0Var.h(z) ? 256 : 128);
        if (g0Var.S(i6 & 1, (i6 & 147) != 146)) {
            b2.r rVar5 = b2.o.A;
            b2.r rVar6 = i5 != 0 ? rVar5 : rVar2;
            List list = z ? d : surahRows;
            String strU = z3.U(g0Var, 2131886615);
            r0 r0VarE = ((r0) g0Var.k(z6.a)).e(c);
            p0 p0VarI = m3.h0.i(g0Var);
            y3.c cVar = (y3.c) g0Var.k(o1.h);
            boolean zG = g0Var.g(list) | g0Var.g(strU) | g0Var.g(r0VarE) | g0Var.g(p0VarI) | g0Var.g(cVar);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.a) {
                Locale locale = Locale.ENGLISH;
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    numValueOf = Integer.valueOf(((ys.e) it.next()).c);
                    while (it.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((ys.e) it.next()).c);
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                } else {
                    numValueOf = null;
                }
                objN = oi.k.t(p30.f.i0(new y3.f(cVar.h0((int) (p0.a(p0VarI, String.format(locale, strU, Arrays.copyOf(new Object[]{Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0)}, 1)), r0VarE, 0, 0L, 1020).c >> 32)) + b), new y3.f(a)).A, g0Var);
            }
            float f = ((y3.f) objN).A;
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((ys.e) next).e);
            ys.e eVar = (ys.e) next;
            float f2 = 8;
            b2.r rVarG = h0.c.G(h0.c.E(z.n.f(f2.h.c(z1.d(rVar6, 1.0f), p0.f.a(24)), i2.t.b(0.08f, dl.a.i), i2.b0.b), f2, 0.0f, 2), 0.0f, f2, 0.0f, 0.0f, 13);
            h0.d dVar = h0.i.c;
            b2.g gVar = b2.b.M;
            h0.v vVarA = h0.u.a(dVar, gVar, g0Var, 0);
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
            Integer numValueOf3 = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf3, g0Var, fVar3);
            b3.e eVar2 = b3.h.h;
            l1.q.E(g0Var, eVar2);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            b2.r rVar7 = rVar6;
            int i7 = (i6 >> 3) & 112;
            a(eVar, z, g0Var, i7);
            if (list.isEmpty()) {
                g0Var.c0(1879356208);
                rVar4 = rVar7;
                z2 = true;
                z6.b(z3.U(g0Var, 2131886617), h0.c.E(z1.d(rVar5, 1.0f), 0.0f, 20, 1), i2.t.b(0.5f, dl.a.k), kh.o.z(15), q3.u.J, (q3.i) null, 0L, (x3.l) null, new x3.k(3), kh.o.z(15), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597488, 48, 258984);
                g0Var = g0Var;
                g0Var.r(false);
            } else {
                rVar4 = rVar7;
                g0Var.c0(1879815132);
                List list2 = list;
                b2.r rVarE = h0.c.E(rVar5, f2, 0.0f, 2);
                boolean z4 = false;
                h0.v vVarA2 = h0.u.a(dVar, gVar, g0Var, 0);
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
                a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar2);
                l1.q.I(rVarC2, g0Var, fVar4);
                g0Var.c0(1649453997);
                int i8 = 0;
                for (Object obj : list2) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        va.a.k0();
                        throw null;
                    }
                    d((ys.e) obj, z, f, g0Var, i7);
                    if (i8 < va.a.M(list2)) {
                        g0Var.c0(-1021993369);
                        z3 = z4;
                        x5.c((b2.r) null, 1, i2.t.b(0.04f, dl.a.i), g0Var, 48, 1);
                        g0Var.r(z3);
                    } else {
                        z3 = z4;
                        g0Var.c0(-1021815863);
                        g0Var.r(z3);
                    }
                    i7 = i7;
                    i8 = i9;
                    z4 = z3;
                }
                boolean z5 = z4;
                z2 = true;
                com.google.android.gms.internal.measurement.x5.z(g0Var, z5, true, z5);
            }
            g0Var.r(z2);
            rVar3 = rVar4;
        } else {
            g0Var.V();
            rVar3 = rVar2;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b0(surahRows, rVar3, z, i, i2);
        }
    }

    public static final void c(float f, int i, b2.r rVar, l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-732552027);
        int i2 = (g0Var.d(f) ? 4 : 2) | i | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            float fX = ab.a0.x(f, 0.0f, 1.0f);
            float f2 = 6;
            float f3 = 4;
            b2.r rVarC = f2.h.c(z1.e(rVar, f2), p0.f.a(f3));
            long j = dl.a.i;
            long jB = i2.t.b(0.1f, j);
            o0 o0Var = i2.b0.b;
            b2.r rVarF = z.n.f(rVarC, jB, o0Var);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarF, g0Var);
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
            h0.o.a(z.n.f(f2.h.c(z1.e(z1.d(b2.o.A, fX), f2), p0.f.a(f3)), j, o0Var), g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new a0(f, rVar, i, 0);
        }
    }

    public static final void d(ys.e eVar, boolean z, float f, l1.j jVar, int i) {
        int i2;
        ys.e eVar2;
        float f2;
        boolean z2;
        String strO;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-92303096);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.d(f) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            float f3 = ((gm.a) g0Var.k(dl.e.a)) == gm.a.A ? 68 : 120;
            b2.o oVar = b2.o.A;
            b2.r rVarE = h0.c.E(z1.d(oVar, 1.0f), 0.0f, 16, 1);
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
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
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 & 112;
            b2.r rVarF = f(i3, z1.x(new c1(1.0f, true), b2.b.M, 2), g0Var, z);
            boolean z3 = eVar.e;
            int i4 = eVar.d;
            if (z3) {
                z2 = false;
                strO = oi.k.o(g0Var, -856260979, 2131886618, g0Var, false);
            } else {
                z2 = false;
                g0Var.c0(-856175419);
                g0Var.r(false);
                ys.d dVar = eVar.b;
                strO = dVar != null ? dVar.b : null;
                if (strO == null) {
                    strO = "";
                }
            }
            z6.b(strO, rVarF, dl.a.n, kh.o.z(15), q3.u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(15), 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, 1597440, 25008, 239528);
            c(i4 / 100.0f, 0, f(i3, z1.q(oVar, f3), g0Var, z), g0Var);
            b2.r rVarF2 = f(i3 | 6, z1.q(oVar, 36), g0Var, z);
            String strE = e(2131886619, new Object[]{Integer.valueOf(i4)}, g0Var);
            long jZ = kh.o.z(13);
            long jZ2 = kh.o.z(13);
            q3.u uVar = q3.u.J;
            long j = dl.a.k;
            k00.f.a(strE, rVarF2, i2.t.b(0.5f, j), jZ, new y3.o(jZ2), uVar, new x3.k(6), 1, 0.0f, null, g0Var, 12807168, 768);
            eVar2 = eVar;
            f2 = f;
            z6.b(e(2131886615, new Object[]{Integer.valueOf(eVar2.c)}, g0Var), f(i3, z1.q(oVar, f), g0Var, z), i2.t.b(0.5f, j), 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(6), 0L, 0, false, 1, 0, (u00.k) null, c, g0Var, 0, 12607488, 113656);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            eVar2 = eVar;
            f2 = f;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y(eVar2, z, f2, i);
        }
    }

    public static final String e(int i, Object[] objArr, l1.j jVar) {
        Locale locale = Locale.ENGLISH;
        String strU = z3.U(jVar, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, strU, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final b2.r f(int i, b2.r rVar, l1.j jVar, boolean z) {
        return c7.i.H(rVar, z, p0.f.a(6));
    }
}
