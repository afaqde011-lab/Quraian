package hx;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g1.o3;
import g1.z6;
import h0.t1;
import h0.v1;
import h0.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.m1;
import l1.p2;
import m3.r0;
import z2.w0;

public final class r implements u00.o {
    public final int A = 1;
    public final float B;
    public final gm.a C;
    public final boolean D;
    public final int E;
    public final Object F;
    public final g00.e G;
    public final Object H;

    public r(float f, gm.a aVar, p2 p2Var, boolean z, u00.a aVar2, String str, int i) {
        this.B = f;
        this.C = aVar;
        this.F = p2Var;
        this.D = z;
        this.G = aVar2;
        this.H = str;
        this.E = i;
    }

    public r(int i, gm.a aVar, float f, fx.a aVar2, u00.k kVar, x xVar, boolean z) {
        this.E = i;
        this.C = aVar;
        this.B = f;
        this.F = aVar2;
        this.G = kVar;
        this.H = xVar;
        this.D = z;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jZ;
        g0 g0Var;
        boolean z;
        switch (this.A) {
            case 0:
                final fx.a aVar = (fx.a) this.F;
                String str = aVar.d;
                final u00.k kVar = (u00.k) this.G;
                x xVar = (x) this.H;
                j0.b item = (j0.b) obj;
                g0 g0Var2 = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                g0 g0Var3 = g0Var2;
                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    int i = this.E;
                    Object obj4 = l1.i.a;
                    if (i == 0) {
                        g0Var3.c0(-2010605675);
                        int iOrdinal = this.C.ordinal();
                        b2.o oVar = b2.o.A;
                        float f = this.B;
                        if (iOrdinal == 0) {
                            g0Var3.c0(-2009398628);
                            b2.r rVarF = h0.c.F(oVar, f, 8, f, 16);
                            String strU = z3.U(g0Var2, 2131887152);
                            u30.b bVar = aVar.b;
                            boolean zG = g0Var3.g(kVar) | g0Var3.g(aVar);
                            Object objN = g0Var3.N();
                            if (zG || objN == obj4) {
                                final int i2 = 1;
                                objN = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        switch (i2) {
                                            case 0:
                                                kVar.invoke(new e(aVar.a));
                                                break;
                                            case 1:
                                                kVar.invoke(new e(aVar.a));
                                                break;
                                            default:
                                                kVar.invoke(new c(aVar.a));
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN);
                            }
                            ix.a.c(str, strU, bVar, (u00.a) objN, rVarF, g0Var2, 0);
                            g0Var3.r(false);
                        } else {
                            if (iOrdinal != 1) {
                                throw oi.k.r(g0Var3, 627878413, false);
                            }
                            g0Var3.c0(-2010528361);
                            b2.r rVarG = h0.c.G(oVar, f, 8, f, 0.0f, 8);
                            String strU2 = z3.U(g0Var2, 2131887152);
                            u30.b bVar2 = aVar.b;
                            boolean zG2 = g0Var3.g(kVar) | g0Var3.g(aVar);
                            Object objN2 = g0Var3.N();
                            if (zG2 || objN2 == obj4) {
                                final int i3 = 0;
                                objN2 = new u00.a() {
                                    @Override
                                    public final Object invoke() {
                                        switch (i3) {
                                            case 0:
                                                kVar.invoke(new e(aVar.a));
                                                break;
                                            case 1:
                                                kVar.invoke(new e(aVar.a));
                                                break;
                                            default:
                                                kVar.invoke(new c(aVar.a));
                                                break;
                                        }
                                        return g00.b0.a;
                                    }
                                };
                                g0Var3.n0(objN2);
                            }
                            ix.a.b(str, strU2, bVar2, (u00.a) objN2, rVarG, g0Var2, 0);
                            g0Var3.r(false);
                        }
                        g0Var3.r(false);
                    } else {
                        g0Var3.c0(627954639);
                        List listJ1 = h00.q.j1(aVar.b, 9);
                        ArrayList arrayList = new ArrayList(h00.r.q0(listJ1, 10));
                        Iterator it = listJ1.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((fx.b) it.next()).c);
                        }
                        u30.b bVarD0 = g4.d0(arrayList);
                        boolean z2 = xVar.l;
                        u30.b bVar3 = xVar.m;
                        boolean zG3 = g0Var3.g(kVar);
                        Object objN3 = g0Var3.N();
                        if (zG3 || objN3 == obj4) {
                            objN3 = new hv.j(5, kVar);
                            g0Var3.n0(objN3);
                        }
                        u00.k kVar2 = (u00.k) objN3;
                        boolean zG4 = g0Var3.g(kVar) | g0Var3.g(aVar);
                        Object objN4 = g0Var3.N();
                        if (zG4 || objN4 == obj4) {
                            final int i4 = 2;
                            objN4 = new u00.a() {
                                @Override
                                public final Object invoke() {
                                    switch (i4) {
                                        case 0:
                                            kVar.invoke(new e(aVar.a));
                                            break;
                                        case 1:
                                            kVar.invoke(new e(aVar.a));
                                            break;
                                        default:
                                            kVar.invoke(new c(aVar.a));
                                            break;
                                    }
                                    return g00.b0.a;
                                }
                            };
                            g0Var3.n0(objN4);
                        }
                        ix.a.h(str, bVarD0, z2, bVar3, kVar2, (u00.a) objN4, null, this.D, g0Var2, 64, 64);
                        g0Var3.r(false);
                    }
                } else {
                    g0Var3.V();
                }
                return g00.b0.a;
            default:
                p2 p2Var = (p2) this.F;
                u00.a aVar2 = (u00.a) this.G;
                String str2 = (String) this.H;
                h0.t BoxWithConstraints = (h0.t) obj;
                g0 g0Var4 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                b2.h hVar = b2.b.K;
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= g0Var4.g(BoxWithConstraints) ? 4 : 2;
                }
                boolean z3 = (iIntValue2 & 19) != 18;
                g0 g0Var5 = g0Var4;
                a30.x xVar2 = g0Var5.a;
                if (g0Var5.S(iIntValue2 & 1, z3)) {
                    float f2 = 16;
                    float f3 = 10;
                    float f4 = 2;
                    y3.f fVar = new y3.f(((BoxWithConstraints.c() - (f2 * f4)) / f4) - f3);
                    float f5 = 0;
                    float f6 = ab.a0.v(fVar, new y3.f(f5)).A;
                    b2.o oVar2 = b2.o.A;
                    b2.r rVarD = z1.d(oVar2, 1.0f);
                    float f7 = this.B;
                    b2.r rVarG2 = h0.c.G(rVarD, f7, 0.0f, f7, f3, 2);
                    gm.a aVar3 = this.C;
                    int iOrdinal2 = aVar3.ordinal();
                    if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    float f8 = 18;
                    boolean zG5 = g0Var5.g(p2Var);
                    Object objN5 = g0Var5.N();
                    if (zG5 || objN5 == l1.i.a) {
                        objN5 = new ds.l(p2Var, 13);
                        g0Var5.n0(objN5);
                    }
                    String str3 = str2;
                    c7.i.g((u00.a) objN5, rVarG2, (i2.q) null, 0L, f8, 0, g0Var4, 0);
                    b2.r rVarG3 = h0.c.G(z1.g(z1.d(oVar2, 0.55f), 0.0f, f6, 1), 0.0f, 0.0f, 0.0f, f3, 7);
                    h0.v vVarA = h0.u.a(h0.i.c, b2.b.N, g0Var4, 48);
                    int iHashCode = Long.hashCode(g0Var5.T);
                    m1 m1VarM = g0Var5.m();
                    b2.r rVarC = b2.a.c(rVarG3, g0Var4);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar);
                    } else {
                        g0Var5.q0();
                    }
                    b3.f fVar2 = b3.h.f;
                    l1.q.I(vVarA, g0Var4, fVar2);
                    b3.f fVar3 = b3.h.e;
                    l1.q.I(m1VarM, g0Var4, fVar3);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar4 = b3.h.g;
                    l1.q.I(numValueOf, g0Var4, fVar4);
                    b3.e eVar = b3.h.h;
                    l1.q.E(g0Var4, eVar);
                    b3.f fVar5 = b3.h.d;
                    l1.q.I(rVarC, g0Var4, fVar5);
                    b2.r rVarH0 = wr.k.h0(oVar2, g0Var4, 6);
                    String strU3 = z3.U(g0Var4, 2131887349);
                    long jZ2 = kh.o.z(14);
                    q3.u uVar = q3.u.C;
                    long j = dl.a.n;
                    z6.b(strU3, rVarH0, j, jZ2, uVar, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 1597440, 0, 261032);
                    if (this.D) {
                        g0Var5.c0(178199988);
                        float f9 = 12;
                        h0.c.h(z1.e(oVar2, f9), g0Var4);
                        b2.r rVarF2 = z.n.f(f2.h.c(z1.m(oVar2, 32), p0.f.a), j, i2.b0.b);
                        w0 w0VarD = h0.o.d(b2.b.E, false);
                        int iHashCode2 = Long.hashCode(g0Var5.T);
                        m1 m1VarM2 = g0Var5.m();
                        b2.r rVarC2 = b2.a.c(rVarF2, g0Var4);
                        g0Var5.g0();
                        if (g0Var5.S) {
                            g0Var5.l(gVar);
                        } else {
                            g0Var5.q0();
                        }
                        l1.q.I(w0VarD, g0Var4, fVar2);
                        l1.q.I(m1VarM2, g0Var4, fVar3);
                        x5.u(iHashCode2, g0Var4, fVar4, g0Var4, eVar);
                        l1.q.I(rVarC2, g0Var4, fVar5);
                        o3.a(y3.R(2131231094, g0Var4, 0), (String) null, z1.m(oVar2, f2), i2.t.b, g0Var4, 3512, 0);
                        g0Var5.r(true);
                        h0.c.h(z1.e(oVar2, f9), g0Var4);
                        b2.r rVarO = w50.c.o(oVar2, false, null, aVar2, 7);
                        v1 v1VarA = t1.a(h0.i.g(4), hVar, g0Var4, 54);
                        int iHashCode3 = Long.hashCode(g0Var5.T);
                        m1 m1VarM3 = g0Var5.m();
                        b2.r rVarC3 = b2.a.c(rVarO, g0Var4);
                        g0Var5.g0();
                        if (g0Var5.S) {
                            g0Var5.l(gVar);
                        } else {
                            g0Var5.q0();
                        }
                        l1.q.I(v1VarA, g0Var4, fVar2);
                        l1.q.I(m1VarM3, g0Var4, fVar3);
                        x5.u(iHashCode3, g0Var4, fVar4, g0Var4, eVar);
                        l1.q.I(rVarC3, g0Var4, fVar5);
                        String strU4 = z3.U(g0Var4, 2131886113);
                        long jZ3 = kh.o.z(12);
                        long j2 = dl.a.k;
                        z6.b(strU4, (b2.r) null, i2.t.b(0.5f, j2), jZ3, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var4, 24576, 0, 262122);
                        z3.k(g4.h0(2131231098, g0Var4, 6), (String) null, z1.m(oVar2, f9), i2.t.b(0.5f, j2), g0Var4, 432);
                        g0Var5.r(true);
                        g0Var5.r(false);
                        z = true;
                        g0Var = g0Var5;
                    } else {
                        g0Var5.c0(179738270);
                        b2.r rVarH1 = wr.k.h0(h0.c.E(oVar2, 0.0f, f5, 1), g0Var4, 0);
                        if (str3.length() == 0) {
                            str3 = "0:00";
                        }
                        int iOrdinal3 = aVar3.ordinal();
                        if (iOrdinal3 == 0) {
                            jZ = kh.o.z(64);
                        } else {
                            if (iOrdinal3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jZ = kh.o.z(54);
                        }
                        k00.f.a(str3, rVarH1, j, jZ, new y3.o(kh.o.z(64)), uVar, null, 1, 0.0f, null, g0Var4, 12804096, 832);
                        b2.r rVarH2 = wr.k.h0(w50.c.o(oVar2, false, null, aVar2, 7), g0Var4, 0);
                        v1 v1VarA2 = t1.a(h0.i.g(4), hVar, g0Var4, 54);
                        g0Var = g0Var5;
                        int iHashCode4 = Long.hashCode(g0Var.T);
                        m1 m1VarM4 = g0Var.m();
                        b2.r rVarC4 = b2.a.c(rVarH2, g0Var4);
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(v1VarA2, g0Var4, fVar2);
                        l1.q.I(m1VarM4, g0Var4, fVar3);
                        x5.u(iHashCode4, g0Var4, fVar4, g0Var4, eVar);
                        l1.q.I(rVarC4, g0Var4, fVar5);
                        String str4 = String.format(Locale.ENGLISH, z3.U(g0Var4, 2131887347), Arrays.copyOf(new Object[]{Integer.valueOf(this.E)}, 1));
                        long jZ4 = kh.o.z(12);
                        long j3 = dl.a.k;
                        k00.f.a(str4, null, i2.t.b(0.5f, j3), jZ4, null, null, null, 0, 0.0f, null, g0Var4, 3072, 1010);
                        z3.k(g4.h0(2131231098, g0Var4, 6), (String) null, z1.m(oVar2, 12), i2.t.b(0.5f, j3), g0Var4, 432);
                        z = true;
                        g0Var.r(true);
                        g0Var.r(false);
                    }
                    g0Var.r(z);
                } else {
                    g0Var5.V();
                }
                return g00.b0.a;
        }
    }
}
