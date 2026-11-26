package az;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.z6;
import i2.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.m1;
import m3.r0;
import q3.u;
import z2.w0;

public final class o implements u00.p {
    public final int A;
    public final u00.k B;
    public final List C;
    public final Object D;

    public o(List list, Object obj, u00.k kVar, int i) {
        this.A = i;
        this.C = list;
        this.D = obj;
        this.B = kVar;
    }

    public o(List list, u00.k kVar, Object obj, int i) {
        this.A = i;
        this.C = list;
        this.B = kVar;
        this.D = obj;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        switch (this.A) {
            case 0:
                j0.b bVar = (j0.b) obj;
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var = (l1.j) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (g0Var.g(bVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= g0Var.e(iIntValue) ? 32 : 16;
                }
                g0 g0Var2 = g0Var;
                if (g0Var2.S(i & 1, (i & 147) != 146)) {
                    ry.c cVar = (ry.c) ((ArrayList) this.C).get(iIntValue);
                    g0Var2.c0(2060153883);
                    u30.b bVarD0 = g4.d0(h00.n.V0(new ry.c[]{cVar}));
                    u30.c cVar2 = ((q) this.D).b;
                    u00.k kVar = this.B;
                    boolean zG = g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.a) {
                        objN = new m(0, kVar);
                        g0Var2.n0(objN);
                    }
                    w00.a.a(bVarD0, cVar2, (u00.k) objN, null, g0Var, 0);
                    g0Var2.r(false);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 1:
                j0.b bVar2 = (j0.b) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                g0 g0Var3 = (l1.j) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (g0Var3.g(bVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= g0Var3.e(iIntValue3) ? 32 : 16;
                }
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(i2 & 1, (i2 & 147) != 146)) {
                    qr.r rVar = (qr.r) this.C.get(iIntValue3);
                    g0Var4.c0(1715070884);
                    boolean z = rVar == ((qr.r) this.D);
                    b2.r rVarF = z.n.f(f2.h.c(b2.o.A, p0.f.a(32)), z ? dl.a.i : t.b(0.15f, dl.a.i), i2.b0.b);
                    u00.k kVar2 = this.B;
                    boolean zG2 = g0Var4.g(kVar2) | g0Var4.e(rVar.ordinal());
                    Object objN2 = g0Var4.N();
                    if (zG2 || objN2 == l1.i.a) {
                        objN2 = new a20.a(kVar2, rVar, 10);
                        g0Var4.n0(objN2);
                    }
                    b2.r rVarD = h0.c.D(w50.c.o(rVarF, false, null, (u00.a) objN2, 7), 16, 8);
                    w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode = Long.hashCode(g0Var4.T);
                    m1 m1VarM = g0Var4.m();
                    b2.r rVarC = b2.a.c(rVarD, g0Var3);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var4.g0();
                    if (g0Var4.S) {
                        g0Var4.l(gVar);
                    } else {
                        g0Var4.q0();
                    }
                    l1.q.I(w0VarD, g0Var3, b3.h.f);
                    l1.q.I(m1VarM, g0Var3, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var3, b3.h.g);
                    l1.q.E(g0Var3, b3.h.h);
                    l1.q.I(rVarC, g0Var3, b3.h.d);
                    int iOrdinal = rVar.ordinal();
                    if (iOrdinal == 0) {
                        i3 = 2131887111;
                    } else if (iOrdinal == 1) {
                        i3 = 2131887113;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = 2131887112;
                    }
                    z6.b(z3.U(g0Var3, i3), (b2.r) null, z ? dl.a.L : dl.a.k, kh.o.z(13), u.L, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(18), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var3, 1597440, 48, 260010);
                    g0Var4.r(true);
                    g0Var4.r(false);
                } else {
                    g0Var4.V();
                }
                return b0.a;
            case 2:
                k0.k kVar3 = (k0.k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                g0 g0Var5 = (l1.j) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                c00.t tVar = (c00.t) this.D;
                if ((iIntValue6 & 6) == 0) {
                    i4 = (g0Var5.g(kVar3) ? 4 : 2) | iIntValue6;
                } else {
                    i4 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i4 |= g0Var5.e(iIntValue5) ? 32 : 16;
                }
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(i4 & 1, (i4 & 147) != 146)) {
                    zz.a aVar = (zz.a) this.C.get(iIntValue5);
                    g0Var6.c0(-1913400466);
                    zz.c cVar3 = (zz.c) tVar.d.get(aVar.a);
                    if (cVar3 == null) {
                        cVar3 = zz.c.A;
                    }
                    String str = aVar.a;
                    zz.a aVar2 = tVar.f;
                    boolean zA = kotlin.jvm.internal.m.a(str, aVar2 != null ? aVar2.a : null);
                    u00.k kVar4 = this.B;
                    boolean zG3 = g0Var6.g(kVar4) | g0Var6.g(aVar);
                    Object objN3 = g0Var6.N();
                    if (zG3 || objN3 == l1.i.a) {
                        objN3 = new a20.a(kVar4, aVar, 11);
                        g0Var6.n0(objN3);
                    }
                    c00.a.i(aVar, cVar3, zA, (u00.a) objN3, g0Var5, 0);
                    g0Var6.r(false);
                } else {
                    g0Var6.V();
                }
                return b0.a;
            case 3:
                j0.b bVar3 = (j0.b) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                g0 g0Var7 = (l1.j) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i5 = (g0Var7.g(bVar3) ? 4 : 2) | iIntValue8;
                } else {
                    i5 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i5 |= g0Var7.e(iIntValue7) ? 32 : 16;
                }
                g0 g0Var8 = g0Var7;
                if (g0Var8.S(i5 & 1, (i5 & 147) != 146)) {
                    bx.c cVar4 = (bx.c) this.C.get(iIntValue7);
                    g0Var8.c0(1732148994);
                    int iM = va.a.M((u30.b) this.D);
                    float f = ix.o.a;
                    float f2 = iIntValue7 == 0 ? f : 0;
                    if (iIntValue7 != iM) {
                        f = 0;
                    }
                    p0.e eVarB = p0.f.b(f2, f2, f, f);
                    u00.k kVar5 = this.B;
                    boolean zG4 = g0Var8.g(kVar5) | g0Var8.i(cVar4);
                    Object objN4 = g0Var8.N();
                    if (zG4 || objN4 == l1.i.a) {
                        objN4 = new ev.q(kVar5, cVar4, 1);
                        g0Var8.n0(objN4);
                    }
                    ix.o.c(cVar4, eVarB, (u00.a) objN4, g0Var7, 8);
                    g0Var8.r(false);
                } else {
                    g0Var8.V();
                }
                return b0.a;
            case 4:
                j0.b bVar4 = (j0.b) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                g0 g0Var9 = (l1.j) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i6 = (g0Var9.g(bVar4) ? 4 : 2) | iIntValue10;
                } else {
                    i6 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i6 |= g0Var9.e(iIntValue9) ? 32 : 16;
                }
                g0 g0Var10 = g0Var9;
                if (g0Var10.S(i6 & 1, (i6 & 147) != 146)) {
                    ju.h hVar = (ju.h) this.C.get(iIntValue9);
                    g0Var10.c0(-1414688083);
                    mu.d.l(hVar, this.B, null, ((ju.k) this.D).p, g0Var9, 0);
                    g0Var10.r(false);
                } else {
                    g0Var10.V();
                }
                return b0.a;
            case 5:
                j0.b bVar5 = (j0.b) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                g0 g0Var11 = (l1.j) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                u00.k kVar6 = (u00.k) this.D;
                if ((iIntValue12 & 6) == 0) {
                    i7 = (g0Var11.g(bVar5) ? 4 : 2) | iIntValue12;
                } else {
                    i7 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i7 |= g0Var11.e(iIntValue11) ? 32 : 16;
                }
                g0 g0Var12 = g0Var11;
                if (g0Var12.S(i7 & 1, (i7 & 147) != 146)) {
                    lo.l lVar = (lo.l) this.C.get(iIntValue11);
                    g0Var12.c0(1857173480);
                    u00.k kVar7 = this.B;
                    boolean zG5 = g0Var12.g(kVar7) | g0Var12.g(lVar);
                    Object objN5 = g0Var12.N();
                    Object obj5 = l1.i.a;
                    if (zG5 || objN5 == obj5) {
                        objN5 = new po.c(kVar7, lVar, 0);
                        g0Var12.n0(objN5);
                    }
                    u00.a aVar3 = (u00.a) objN5;
                    boolean zG6 = g0Var12.g(kVar6) | g0Var12.g(lVar);
                    Object objN6 = g0Var12.N();
                    if (zG6 || objN6 == obj5) {
                        objN6 = new po.c(kVar6, lVar, 1);
                        g0Var12.n0(objN6);
                    }
                    ro.f.i(lVar, aVar3, null, (u00.a) objN6, null, false, ro.d.B, false, null, g0Var11, 1572864, 436);
                    g0Var12.r(false);
                } else {
                    g0Var12.V();
                }
                return b0.a;
            case 6:
                j0.b bVar6 = (j0.b) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                g0 g0Var13 = (l1.j) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i8 = (g0Var13.g(bVar6) ? 4 : 2) | iIntValue14;
                } else {
                    i8 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i8 |= g0Var13.e(iIntValue13) ? 32 : 16;
                }
                g0 g0Var14 = g0Var13;
                if (g0Var14.S(i8 & 1, (i8 & 147) != 146)) {
                    ry.c cVar5 = (ry.c) ((ArrayList) this.C).get(iIntValue13);
                    g0Var14.c0(1433644292);
                    u30.b bVarD1 = g4.d0(h00.n.V0(new ry.c[]{cVar5}));
                    u30.c cVar6 = ((pz.j) this.D).c;
                    u00.k kVar8 = this.B;
                    boolean zG7 = g0Var14.g(kVar8);
                    Object objN7 = g0Var14.N();
                    if (zG7 || objN7 == l1.i.a) {
                        objN7 = new m(3, kVar8);
                        g0Var14.n0(objN7);
                    }
                    w00.a.a(bVarD1, cVar6, (u00.k) objN7, null, g0Var13, 0);
                    g0Var14.r(false);
                } else {
                    g0Var14.V();
                }
                return b0.a;
            default:
                j0.b bVar7 = (j0.b) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                g0 g0Var15 = (l1.j) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                qt.j jVar = (qt.j) this.D;
                if ((iIntValue16 & 6) == 0) {
                    i9 = (g0Var15.g(bVar7) ? 4 : 2) | iIntValue16;
                } else {
                    i9 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i9 |= g0Var15.e(iIntValue15) ? 32 : 16;
                }
                g0 g0Var16 = g0Var15;
                if (g0Var16.S(i9 & 1, (i9 & 147) != 146)) {
                    ot.o oVar = (ot.o) this.C.get(iIntValue15);
                    g0Var16.c0(760307335);
                    boolean zEquals = jVar.c.equals(oVar.a);
                    ot.n nVar = (ot.n) jVar.e.get(oVar.a);
                    if (nVar == null) {
                        nVar = ot.k.a;
                    }
                    ot.n nVar2 = nVar;
                    u00.k kVar9 = this.B;
                    boolean zG8 = g0Var16.g(kVar9) | g0Var16.g(oVar);
                    Object objN8 = g0Var16.N();
                    if (zG8 || objN8 == l1.i.a) {
                        objN8 = new p30.h(kVar9, oVar, 1);
                        g0Var16.n0(objN8);
                    }
                    qt.a.d(oVar, zEquals, nVar2, (u00.a) objN8, g0Var15, 0);
                    g0Var16.r(false);
                } else {
                    g0Var16.V();
                }
                return b0.a;
        }
    }
}
