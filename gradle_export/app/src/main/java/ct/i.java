package ct;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import g1.z6;
import h0.c1;
import h0.t1;
import h0.v1;
import h0.z1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import l1.m1;
import l1.r1;
import m3.r0;

public abstract class i {
    public static final u30.b a = g4.d0(va.a.S(new Integer[]{0, 0, 0, 0, 1, 2, 1, 0, 0, 1, 1, 0, 1, 2, 1, 0, 0, 1, 2, 3, 2, 1, 1, 0}));

    public static final void a(b2.r rVar, l1.j jVar, int i, int i2) {
        float f;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-728878098);
        int i3 = (g0Var.e(i) ? 4 : 2) | i2 | (g0Var.g(rVar) ? 32 : 16);
        if (g0Var.S(i3 & 1, (i3 & 19) != 18)) {
            if (i == 1) {
                f = 0.28f;
            } else if (i != 2) {
                f = i != 3 ? 0.05f : 1.0f;
            } else {
                f = 0.55f;
            }
            h0.o.a(z.n.f(f2.h.c(z1.e(rVar, 20), p0.f.a(4)), i2.t.b(f, dl.a.i), i2.b0.b), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.h(i, rVar, i2, 1);
        }
    }

    public static final void b(u30.b bVar, boolean z, l1.j jVar, int i) {
        int i2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1324662966);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.h(z) ? 32 : 16;
        }
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            b2.r rVarD = z1.d(b2.o.A, 1.0f);
            v1 v1VarA = t1.a(h0.i.g(3), b2.b.J, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
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
            g0Var.c0(1856788286);
            Iterator<E> it = bVar.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (1.0f <= 0.0d) {
                    i0.a.a("invalid weight; must be greater than zero");
                }
                a(c7.i.H(new c1(1.0f, true), z, p0.f.a(4)), g0Var, iIntValue, 0);
            }
            g0Var.r(false);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new g(bVar, z, i, 0);
        }
    }

    public static final void c(ys.a bestListeningTime, b2.r rVar, boolean z, l1.j jVar, int i) {
        int i2;
        b2.r rVar2;
        boolean z2;
        kotlin.jvm.internal.m.e(bestListeningTime, "bestListeningTime");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-156621817);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(bestListeningTime) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= g0Var.h(z) ? 256 : 128;
        }
        if (g0Var.S(i3 & 1, (i3 & 147) != 146)) {
            u30.b bVar = z ? a : bestListeningTime.a;
            int i4 = z ? 19 : bestListeningTime.b;
            if (bVar != null && bVar.isEmpty()) {
                z2 = false;
                break;
            }
            Iterator<E> it = bVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                } else if (((Number) it.next()).intValue() > 0) {
                    z2 = true;
                    break;
                }
            }
            b2.r rVar3 = b2.o.A;
            float f = 16;
            b2.r rVarC = h0.c.C(z.n.f(f2.h.c(z1.d(rVar3, 1.0f), p0.f.a(24)), i2.t.b(0.08f, dl.a.i), i2.b0.b), f);
            h0.f fVarG = h0.i.g(f);
            b2.g gVar = b2.b.M;
            h0.v vVarA = h0.u.a(fVarG, gVar, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
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
            l1.q.I(rVarC2, g0Var, fVar4);
            d(i4, z2, z, g0Var, i3 & 896);
            h0.v vVarA2 = h0.u.a(h0.i.g(8), gVar, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVar3, g0Var);
            g0Var.g0();
            int i5 = i3;
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            b(bVar, z, g0Var, (i5 >> 3) & 112);
            f(g0Var, 0);
            g0Var.r(true);
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new h(bestListeningTime, rVar2, z, i, 0);
        }
    }

    public static final void d(Integer num, boolean z, boolean z2, l1.j jVar, int i) {
        int i2;
        String str;
        int i3;
        String strO;
        int i4;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-884908670);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(num) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= g0Var.h(z2) ? 256 : 128;
        }
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            h0.v vVarA = h0.u.a(h0.i.g(4), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC = b2.a.c(oVar, g0Var);
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
            float f = 6;
            b2.r rVarH = c7.i.H(oVar, z2, p0.f.a(f));
            if (num == null || !z) {
                g0Var.c0(225747603);
                g0Var.r(false);
                str = "—";
            } else {
                g0Var.c0(225686750);
                int iIntValue = num.intValue();
                if (r30.r.q0(Locale.getDefault().getLanguage(), "ru")) {
                    g0Var.c0(-361352360);
                    String strU = z3.U(g0Var, 2131886578);
                    Locale locale = Locale.ENGLISH;
                    Object[] objArrCopyOf = Arrays.copyOf(new Object[]{num}, 1);
                    str = String.format(locale, strU, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                    g0Var.r(false);
                } else {
                    g0Var.c0(-361198228);
                    int i5 = iIntValue % 12;
                    if (i5 == 0) {
                        i5 = 12;
                    }
                    Object[] objArr = {Integer.valueOf(i5), iIntValue < 12 ? oi.k.o(g0Var, -361070973, 2131886599, g0Var, false) : oi.k.o(g0Var, -361000541, 2131886600, g0Var, false)};
                    String strU2 = z3.U(g0Var, 2131886577);
                    Locale locale2 = Locale.ENGLISH;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 2);
                    str = String.format(locale2, strU2, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
                    g0Var.r(false);
                }
                g0Var.r(false);
            }
            z6.b(str, rVarH, dl.a.n, kh.o.z(22), q3.u.M, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(22), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260008);
            b2.r rVarH2 = c7.i.H(oVar, z2, p0.f.a(f));
            if (num == null || !z) {
                i3 = 12;
                strO = oi.k.o(g0Var, 226129275, 2131886573, g0Var, false);
            } else {
                g0Var.c0(226058998);
                int iIntValue2 = num.intValue();
                if (4 > iIntValue2 || iIntValue2 >= 7) {
                    i3 = 12;
                    if (7 <= iIntValue2 && iIntValue2 < 12) {
                        i4 = 2131886576;
                    } else if (12 <= iIntValue2 && iIntValue2 < 15) {
                        i4 = 2131886572;
                    } else if (15 <= iIntValue2 && iIntValue2 < 18) {
                        i4 = 2131886571;
                    } else if (18 > iIntValue2 || iIntValue2 >= 21) {
                        i4 = (21 > iIntValue2 || iIntValue2 >= 24) ? 2131886575 : 2131886574;
                    } else {
                        i4 = 2131886570;
                    }
                } else {
                    i4 = 2131886569;
                    i3 = 12;
                }
                strO = z3.U(g0Var, i4);
                g0Var.r(false);
            }
            z6.b(strO, rVarH2, i2.t.b(0.5f, dl.a.k), kh.o.z(i3), q3.u.J, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(i3), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260008);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new f(num, z, z2, i);
        }
    }

    public static final void e(int i, l1.j jVar, int i2) {
        l1.j jVar2;
        l1.j jVar3 = (l1.g0) jVar;
        jVar3.e0(56687945);
        int i3 = (jVar3.e(i) ? 4 : 2) | i2;
        if (jVar3.S(i3 & 1, (i3 & 3) != 2)) {
            jVar2 = jVar3;
            z6.b(z3.U(jVar3, i), (b2.r) null, i2.t.b(0.5f, dl.a.k), kh.o.z(12), q3.u.J, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(12), 0, false, 0, 0, (u00.k) null, (r0) null, jVar2, 1597440, 48, 260010);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new c00.j(i, i2, 1);
        }
    }

    public static final void f(l1.j jVar, int i) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1204101339);
        if (g0Var.S(i & 1, i != 0)) {
            b2.r rVarD = z1.d(b2.o.A, 1.0f);
            v1 v1VarA = t1.a(h0.i.g, b2.b.J, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
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
            e(2131886595, g0Var, 0);
            e(2131886597, g0Var, 0);
            e(2131886596, g0Var, 0);
            e(2131886598, g0Var, 0);
            e(2131886595, g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new cp.a(i, 5);
        }
    }
}
