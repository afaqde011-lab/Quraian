package sp;

import a30.x;
import b2.r;
import b3.e;
import b3.f;
import b3.g;
import b3.h;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import h0.c;
import h0.c1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.w;
import h0.x0;
import h0.z1;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.i;
import l1.j;
import l1.m1;
import l1.q;
import u00.k;
import u00.o;
import ur.d1;
import v1.d;
import z.n;
import z2.w0;

public final class b implements o {
    public final int A;
    public final boolean B;
    public final k C;

    public b(int i, k kVar, boolean z) {
        this.A = i;
        this.B = z;
        this.C = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        Object obj4 = i.a;
        b2.o oVar = b2.o.A;
        boolean z = this.B;
        b0 b0Var = b0.a;
        k kVar = this.C;
        switch (i) {
            case 0:
                w ModalBottomSheet = (w) obj;
                g0 g0Var = (j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                m.e(ModalBottomSheet, "$this$ModalBottomSheet");
                boolean z2 = (iIntValue & 17) != 16;
                g0 g0Var2 = g0Var;
                x xVar = g0Var2.a;
                if (!g0Var2.S(iIntValue & 1, z2)) {
                    g0Var2.V();
                } else {
                    long j = dl.a.q;
                    g4.d(0, j, g0Var, z);
                    float f = 16;
                    r rVarG = c.G(c.E(c.M(n.f(z1.d(oVar, 1.0f), j, i2.b0.b), c.g), f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 24, 7);
                    v vVarA = u.a(h0.i.g(f), b2.b.M, g0Var, 6);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    r rVarC = b2.a.c(rVarG, g0Var);
                    b3.i.c.getClass();
                    g gVar = h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    f fVar = h.f;
                    q.I(vVarA, g0Var, fVar);
                    f fVar2 = h.e;
                    q.I(m1VarM, g0Var, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    f fVar3 = h.g;
                    q.I(numValueOf, g0Var, fVar3);
                    e eVar = h.h;
                    q.E(g0Var, eVar);
                    f fVar4 = h.d;
                    q.I(rVarC, g0Var, fVar4);
                    r rVarD = z1.d(oVar, 1.0f);
                    w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    m1 m1VarM2 = g0Var2.m();
                    r rVarC2 = b2.a.c(rVarD, g0Var);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    q.I(w0VarD, g0Var, fVar);
                    q.I(m1VarM2, g0Var, fVar2);
                    x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                    q.I(rVarC2, g0Var, fVar4);
                    kl.a.a(null, false, g0Var, 48, 1);
                    g0Var2.r(true);
                    y3.c(0, (r) null, g0Var, kVar);
                    g0Var2.r(true);
                }
                break;
            case 1:
                w SettingsCardWidget = (w) obj;
                g0 g0Var3 = (j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                m.e(SettingsCardWidget, "$this$SettingsCardWidget");
                boolean z3 = (iIntValue2 & 17) != 16;
                int i2 = iIntValue2 & 1;
                g0 g0Var4 = g0Var3;
                if (!g0Var4.S(i2, z3)) {
                    g0Var4.V();
                } else {
                    r rVarG2 = c.G(b2.o.A, 0.0f, 8, 0.0f, 0.0f, 13);
                    x0 x0Var = x0.A;
                    r rVarU = c.u(rVarG2);
                    v1 v1VarA = t1.a(h0.i.g(12), b2.b.J, g0Var3, 6);
                    int iHashCode3 = Long.hashCode(g0Var4.T);
                    m1 m1VarM3 = g0Var4.m();
                    r rVarC3 = b2.a.c(rVarU, g0Var3);
                    b3.i.c.getClass();
                    g gVar2 = h.b;
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar2);
                    } else {
                        g0Var4.q0();
                    }
                    q.I(v1VarA, g0Var3, h.f);
                    q.I(m1VarM3, g0Var3, h.e);
                    q.I(Integer.valueOf(iHashCode3), g0Var3, h.g);
                    q.E(g0Var3, h.h);
                    q.I(rVarC3, g0Var3, h.d);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarC4 = z1.c(new c1(1.0f, true), 1.0f);
                    String strU = z3.U(g0Var3, 2131887097);
                    String strU2 = z3.U(g0Var3, 2131887098);
                    boolean z4 = this.B;
                    boolean z5 = !z4;
                    boolean zG = g0Var4.g(kVar);
                    Object objN = g0Var4.N();
                    if (zG || objN == obj4) {
                        objN = new qt.h(10, kVar);
                        g0Var4.n0(objN);
                    }
                    st.g.a(2131230949, 2131230948, strU, strU2, z5, false, (u00.a) objN, rVarC4, g0Var3, 196608);
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarC5 = z1.c(new c1(1.0f, true), 1.0f);
                    String strU3 = z3.U(g0Var3, 2131887095);
                    String strU4 = z3.U(g0Var3, 2131887096);
                    boolean zG2 = g0Var4.g(kVar);
                    Object objN2 = g0Var4.N();
                    if (zG2 || objN2 == obj4) {
                        objN2 = new qt.h(11, kVar);
                        g0Var4.n0(objN2);
                    }
                    st.g.a(2131230911, 2131230910, strU3, strU4, z4, true, (u00.a) objN2, rVarC5, g0Var3, 196608);
                    g0Var4.r(true);
                }
                break;
            case 2:
                j0.b item = (j0.b) obj;
                g0 g0Var5 = (j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                m.e(item, "$this$item");
                g0 g0Var6 = g0Var5;
                if (!g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    g0Var6.V();
                } else {
                    st.j.f(z3.U(g0Var5, 2131887106), d.d(450270322, new pp.g(z, kVar, 2, (byte) 0), g0Var5), g0Var5, 48);
                }
                break;
            default:
                w CancellationQuestionnaireBottomBarWidget = (w) obj;
                g0 g0Var7 = (j) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                m.e(CancellationQuestionnaireBottomBarWidget, "$this$CancellationQuestionnaireBottomBarWidget");
                boolean z6 = (iIntValue4 & 17) != 16;
                g0 g0Var8 = g0Var7;
                x xVar2 = g0Var8.a;
                if (!g0Var8.S(iIntValue4 & 1, z6)) {
                    g0Var8.V();
                } else if (!z) {
                    g0Var8.c0(1251615289);
                    v vVarA2 = u.a(h0.i.g(12), b2.b.M, g0Var7, 6);
                    int iHashCode4 = Long.hashCode(g0Var8.T);
                    m1 m1VarM4 = g0Var8.m();
                    r rVarC6 = b2.a.c(oVar, g0Var7);
                    b3.i.c.getClass();
                    g gVar3 = h.b;
                    g0Var8.g0();
                    if (g0Var8.S) {
                        g0Var8.l(gVar3);
                    } else {
                        g0Var8.q0();
                    }
                    q.I(vVarA2, g0Var7, h.f);
                    q.I(m1VarM4, g0Var7, h.e);
                    q.I(Integer.valueOf(iHashCode4), g0Var7, h.g);
                    q.E(g0Var7, h.h);
                    q.I(rVarC6, g0Var7, h.d);
                    boolean zG3 = g0Var8.g(kVar);
                    Object objN3 = g0Var8.N();
                    if (zG3 || objN3 == obj4) {
                        objN3 = new d1(8, kVar);
                        g0Var8.n0(objN3);
                    }
                    g4.f(0, 2, (r) null, g0Var7, (u00.a) objN3);
                    boolean zG4 = g0Var8.g(kVar);
                    Object objN4 = g0Var8.N();
                    if (zG4 || objN4 == obj4) {
                        objN4 = new d1(9, kVar);
                        g0Var8.n0(objN4);
                    }
                    f50.c.a(0, 2, null, g0Var7, (u00.a) objN4);
                    g0Var8.r(true);
                    g0Var8.r(false);
                } else {
                    g0Var8.c0(1250958027);
                    r rVarD2 = z1.d(oVar, 1.0f);
                    v1 v1VarA2 = t1.a(h0.i.g(12), b2.b.J, g0Var7, 6);
                    int iHashCode5 = Long.hashCode(g0Var8.T);
                    m1 m1VarM5 = g0Var8.m();
                    r rVarC7 = b2.a.c(rVarD2, g0Var7);
                    b3.i.c.getClass();
                    g gVar4 = h.b;
                    g0Var8.g0();
                    if (g0Var8.S) {
                        g0Var8.l(gVar4);
                    } else {
                        g0Var8.q0();
                    }
                    q.I(v1VarA2, g0Var7, h.f);
                    q.I(m1VarM5, g0Var7, h.e);
                    q.I(Integer.valueOf(iHashCode5), g0Var7, h.g);
                    q.E(g0Var7, h.h);
                    q.I(rVarC7, g0Var7, h.d);
                    boolean zG5 = g0Var8.g(kVar);
                    Object objN5 = g0Var8.N();
                    if (zG5 || objN5 == obj4) {
                        objN5 = new d1(6, kVar);
                        g0Var8.n0(objN5);
                    }
                    u00.a aVar = (u00.a) objN5;
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    f50.c.a(0, 0, new c1(1.0f, true), g0Var7, aVar);
                    boolean zG6 = g0Var8.g(kVar);
                    Object objN6 = g0Var8.N();
                    if (zG6 || objN6 == obj4) {
                        objN6 = new d1(7, kVar);
                        g0Var8.n0(objN6);
                    }
                    u00.a aVar2 = (u00.a) objN6;
                    if (1.0f <= 0.0d) {
                        i0.a.a("invalid weight; must be greater than zero");
                    }
                    g4.f(0, 0, new c1(1.0f, true), g0Var7, aVar2);
                    g0Var8.r(true);
                    g0Var8.r(false);
                }
                break;
        }
        return b0Var;
    }
}
