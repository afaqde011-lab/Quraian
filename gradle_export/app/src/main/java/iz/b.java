package iz;

import a30.x;
import as.j0;
import b2.r;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import d0.o2;
import g1.z6;
import h0.u;
import h0.v;
import h0.w;
import h0.z1;
import i2.b0;
import i2.o0;
import i2.t;
import java.util.Collection;
import java.util.Iterator;
import l1.g0;
import l1.m1;
import l1.z0;
import m3.r0;
import nx.i0;
import z2.d0;
import z2.w0;

public final class b implements u00.o {
    public final int A = 1;
    public final boolean B;
    public final boolean C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final g00.e H;
    public final Object I;

    public b(u30.b bVar, i0 i0Var, boolean z, PlayerItem playerItem, boolean z2, gm.a aVar, u00.k kVar, z0 z0Var) {
        this.D = bVar;
        this.E = i0Var;
        this.B = z;
        this.F = playerItem;
        this.C = z2;
        this.G = aVar;
        this.H = kVar;
        this.I = z0Var;
    }

    public b(boolean z, String str, String str2, u00.a aVar, u00.a aVar2, boolean z2, u00.a aVar3, u00.a aVar4) {
        this.B = z;
        this.D = str;
        this.E = str2;
        this.F = aVar;
        this.G = aVar2;
        this.C = z2;
        this.H = aVar3;
        this.I = aVar4;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l1.j jVar;
        ?? r2;
        boolean z;
        Object next;
        r rVar;
        g0 g0Var;
        boolean z2;
        l1.j jVar2;
        boolean z3;
        boolean z4;
        g0 g0Var2;
        switch (this.A) {
            case 0:
                String str = (String) this.D;
                String str2 = (String) this.E;
                u00.a aVar = (u00.a) this.F;
                u00.a aVar2 = (u00.a) this.G;
                u00.a aVar3 = (u00.a) this.H;
                u00.a aVar4 = (u00.a) this.I;
                w ModalBottomSheet = (w) obj;
                l1.j jVar3 = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(ModalBottomSheet, "$this$ModalBottomSheet");
                boolean z5 = (iIntValue & 17) != 16;
                g0 g0Var3 = (g0) jVar3;
                x xVar = g0Var3.a;
                if (g0Var3.S(iIntValue & 1, z5)) {
                    long j = dl.a.q;
                    g4.d(0, j, jVar3, this.B);
                    b2.o oVar = b2.o.A;
                    r rVarD = z1.d(oVar, 1.0f);
                    o0 o0Var = b0.b;
                    float f = 16;
                    r rVarE = h0.c.E(h0.c.M(z.n.f(rVarD, j, o0Var), h0.c.g), f, 0.0f, 2);
                    float f2 = 24;
                    r rVarG = h0.c.G(rVarE, 0.0f, 0.0f, 0.0f, f2, 7);
                    h0.f fVarG = h0.i.g(f);
                    b2.g gVar = b2.b.M;
                    v vVarA = u.a(fVarG, gVar, jVar3, 6);
                    int iHashCode = Long.hashCode(g0Var3.T);
                    m1 m1VarM = g0Var3.m();
                    r rVarC = b2.a.c(rVarG, jVar3);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar2);
                    } else {
                        g0Var3.q0();
                    }
                    b3.f fVar = b3.h.f;
                    l1.q.I(vVarA, jVar3, fVar);
                    b3.f fVar2 = b3.h.e;
                    l1.q.I(m1VarM, jVar3, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.g;
                    l1.q.I(numValueOf, jVar3, fVar3);
                    b3.e eVar = b3.h.h;
                    l1.q.E(jVar3, eVar);
                    b3.f fVar4 = b3.h.d;
                    l1.q.I(rVarC, jVar3, fVar4);
                    r rVarD2 = z1.d(oVar, 1.0f);
                    w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode2 = Long.hashCode(g0Var3.T);
                    m1 m1VarM2 = g0Var3.m();
                    r rVarC2 = b2.a.c(rVarD2, jVar3);
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar2);
                    } else {
                        g0Var3.q0();
                    }
                    l1.q.I(w0VarD, jVar3, fVar);
                    l1.q.I(m1VarM2, jVar3, fVar2);
                    x5.u(iHashCode2, jVar3, fVar3, jVar3, eVar);
                    l1.q.I(rVarC2, jVar3, fVar4);
                    kl.a.a(null, false, jVar3, 48, 1);
                    g0Var3.r(true);
                    r rVarD3 = z1.d(oVar, 1.0f);
                    v vVarA2 = u.a(h0.i.g(4), b2.b.N, jVar3, 54);
                    int iHashCode3 = Long.hashCode(g0Var3.T);
                    m1 m1VarM3 = g0Var3.m();
                    r rVarC3 = b2.a.c(rVarD3, jVar3);
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar2);
                    } else {
                        g0Var3.q0();
                    }
                    l1.q.I(vVarA2, jVar3, fVar);
                    l1.q.I(m1VarM3, jVar3, fVar2);
                    x5.u(iHashCode3, jVar3, fVar3, jVar3, eVar);
                    l1.q.I(rVarC3, jVar3, fVar4);
                    long j2 = dl.a.k;
                    z6.b(str, (r) null, j2, kh.o.z(22), q3.u.M, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 2, false, 1, 0, (u00.k) null, (r0) null, jVar3, 1597440, 24960, 240554);
                    if (r30.k.L0(str2)) {
                        jVar = jVar3;
                        r2 = 0;
                        g0Var3.c0(1391828984);
                        g0Var3.r(false);
                    } else {
                        g0Var3.c0(1391497842);
                        jVar = jVar3;
                        k00.f.a(str2, null, t.b(0.5f, j2), kh.o.z(14), null, q3.u.B, new x3.k(3), 1, 0.0f, null, jVar, 12782592, 786);
                        r2 = 0;
                        g0Var3.r(false);
                    }
                    g0Var3.r(true);
                    r rVarF = z.n.f(f2.h.c(z1.d(oVar, 1.0f), p0.f.a(f2)), t.b(0.08f, dl.a.i), o0Var);
                    v vVarA3 = u.a(h0.i.c, gVar, jVar, (int) r2);
                    int iHashCode4 = Long.hashCode(g0Var3.T);
                    m1 m1VarM4 = g0Var3.m();
                    r rVarC4 = b2.a.c(rVarF, jVar);
                    g0Var3.g0();
                    if (g0Var3.S) {
                        g0Var3.l(gVar2);
                    } else {
                        g0Var3.q0();
                    }
                    l1.q.I(vVarA3, jVar, fVar);
                    l1.q.I(m1VarM4, jVar, fVar2);
                    x5.u(iHashCode4, jVar, fVar3, jVar, eVar);
                    l1.q.I(rVarC4, jVar, fVar4);
                    d.a(2131231124, 2131887246, aVar, jVar, r2);
                    d.a(2131231115, 2131887244, aVar2, jVar, r2);
                    if (this.C) {
                        g0Var3.c0(16272031);
                        d.a(2131231353, 2131887208, aVar3, jVar, r2);
                        g0Var3.r((boolean) r2);
                    } else {
                        g0Var3.c0(16533423);
                        g0Var3.r((boolean) r2);
                    }
                    d.a(2131231385, 2131887256, aVar4, jVar, r2);
                    g0Var3.r(true);
                    g0Var3.r(true);
                } else {
                    g0Var3.V();
                }
                return g00.b0.a;
            default:
                Collection collection = (u30.b) this.D;
                i0 i0Var = (i0) this.E;
                PlayerItem playerItem = (PlayerItem) this.F;
                gm.a aVar5 = (gm.a) this.G;
                u00.k kVar = (u00.k) this.H;
                z0 z0Var = (z0) this.I;
                w SurahListContainerWidget = (w) obj;
                l1.j jVar4 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(SurahListContainerWidget, "$this$SurahListContainerWidget");
                g0 g0Var4 = (g0) jVar4;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zIsEmpty = ((h00.b) collection).isEmpty();
                    r rVar2 = b2.o.A;
                    if (zIsEmpty) {
                        g0Var4.c0(-1155235748);
                        if (i0Var.a) {
                            g0Var4.c0(-1155206050);
                            ox.g.f(null, jVar4, 0);
                            g0Var4.r(false);
                            g0Var2 = g0Var4;
                            z4 = false;
                        } else {
                            g0Var4.c0(-1155092838);
                            z4 = false;
                            g0Var2 = g0Var4;
                            z6.b(z3.U(jVar4, 2131886917), h0.c.E(z1.d(rVar2, 1.0f), 0.0f, 40, 1), dl.a.p, 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, jVar4, 48, 0, 261112);
                            g0Var2.r(false);
                        }
                        g0Var2.r(z4);
                    } else {
                        l1.j jVar5 = jVar4;
                        g0 g0Var5 = g0Var4;
                        boolean z6 = false;
                        g0Var5.c0(-1154527770);
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            PlayerItem playerItem2 = (PlayerItem) it.next();
                            u30.b bVar = i0Var.g;
                            u30.b bVar2 = i0Var.f;
                            boolean zContains = bVar.contains(Long.valueOf(playerItem2.getSurahId()));
                            Iterator<E> it2 = i0Var.i.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    z = zContains;
                                    if (((yt.a) next).c != playerItem2.getSurahId()) {
                                        zContains = z;
                                    }
                                } else {
                                    z = zContains;
                                    next = null;
                                }
                            }
                            yt.a aVar6 = (yt.a) next;
                            boolean z7 = (this.B && playerItem != null && playerItem.getSurahId() == playerItem2.getSurahId()) ? true : z6;
                            boolean z8 = (z7 && this.C) ? true : z6;
                            int surahNumber = playerItem2.getSurahNumber();
                            Integer num = i0Var.p;
                            Object obj4 = l1.i.a;
                            if (num != null && surahNumber == num.intValue()) {
                                g0Var5.c0(-282683797);
                                Object objN = g0Var5.N();
                                if (objN == obj4) {
                                    objN = new o2(z0Var, 14);
                                    g0Var5.n0(objN);
                                }
                                r rVarN = d0.n(rVar2, (u00.k) objN);
                                g0Var5.r(false);
                                rVar = rVarN;
                            } else {
                                g0Var5.c0(-282565346);
                                g0Var5.r(false);
                                rVar = rVar2;
                            }
                            int iOrdinal = aVar5.ordinal();
                            if (iOrdinal == 0) {
                                playerItem = playerItem;
                                g0Var = g0Var5;
                                boolean z9 = z8;
                                l1.j jVar6 = jVar5;
                                z2 = true;
                                boolean z11 = z;
                                g0Var.c0(-280123662);
                                boolean z12 = i0Var.j;
                                boolean zContains2 = bVar2.contains(Long.valueOf(playerItem2.getSurahId()));
                                Float f3 = aVar6 != null ? aVar6.g : null;
                                boolean zG = g0Var.g(kVar) | g0Var.g(playerItem2);
                                Object objN2 = g0Var.N();
                                if (zG || objN2 == obj4) {
                                    objN2 = new as.g0(kVar, playerItem2, 15);
                                    g0Var.n0(objN2);
                                }
                                u00.a aVar7 = (u00.a) objN2;
                                boolean zG2 = g0Var.g(kVar) | g0Var.g(playerItem2);
                                Object objN3 = g0Var.N();
                                if (zG2 || objN3 == obj4) {
                                    objN3 = new as.g0(kVar, playerItem2, 16);
                                    g0Var.n0(objN3);
                                }
                                u00.a aVar8 = (u00.a) objN3;
                                boolean zG3 = g0Var.g(kVar) | g0Var.g(playerItem2);
                                Object objN4 = g0Var.N();
                                if (zG3 || objN4 == obj4) {
                                    objN4 = new as.g0(kVar, playerItem2, 17);
                                    g0Var.n0(objN4);
                                }
                                u00.a aVar9 = (u00.a) objN4;
                                boolean zG4 = g0Var.g(kVar) | g0Var.g(playerItem2);
                                Object objN5 = g0Var.N();
                                if (zG4 || objN5 == obj4) {
                                    objN5 = new as.g0(kVar, playerItem2, 8);
                                    g0Var.n0(objN5);
                                }
                                u00.a aVar10 = (u00.a) objN5;
                                boolean zI = g0Var.i(aVar6) | g0Var.g(kVar);
                                Object objN6 = g0Var.N();
                                if (zI || objN6 == obj4) {
                                    objN6 = new j0(aVar6, kVar, 2);
                                    g0Var.n0(objN6);
                                }
                                u00.a aVar11 = (u00.a) objN6;
                                boolean zG5 = g0Var.g(kVar) | g0Var.g(playerItem2);
                                Object objN7 = g0Var.N();
                                if (zG5 || objN7 == obj4) {
                                    objN7 = new as.g0(kVar, playerItem2, 9);
                                    g0Var.n0(objN7);
                                }
                                ox.a.g(playerItem2, z11, z9, true, aVar7, aVar8, aVar9, z12, zContains2, rVar, z7, false, f3, aVar10, aVar11, (u00.a) objN7, jVar6, 3072, 0, 2048);
                                jVar2 = jVar6;
                                z3 = false;
                                g0Var.r(false);
                            } else {
                                if (iOrdinal != 1) {
                                    throw oi.k.r(g0Var5, -840391638, false);
                                }
                                g0Var5.c0(-282331606);
                                boolean z13 = i0Var.j;
                                boolean zContains3 = bVar2.contains(Long.valueOf(playerItem2.getSurahId()));
                                Float f4 = aVar6 != null ? aVar6.g : null;
                                boolean zG6 = g0Var5.g(kVar) | g0Var5.g(playerItem2);
                                Object objN8 = g0Var5.N();
                                if (zG6 || objN8 == obj4) {
                                    objN8 = new as.g0(kVar, playerItem2, 10);
                                    g0Var5.n0(objN8);
                                }
                                u00.a aVar12 = (u00.a) objN8;
                                boolean zG7 = g0Var5.g(kVar) | g0Var5.g(playerItem2);
                                Object objN9 = g0Var5.N();
                                if (zG7 || objN9 == obj4) {
                                    objN9 = new as.g0(kVar, playerItem2, 11);
                                    g0Var5.n0(objN9);
                                }
                                u00.a aVar13 = (u00.a) objN9;
                                boolean zG8 = g0Var5.g(kVar) | g0Var5.g(playerItem2);
                                Object objN10 = g0Var5.N();
                                if (zG8 || objN10 == obj4) {
                                    objN10 = new as.g0(kVar, playerItem2, 12);
                                    g0Var5.n0(objN10);
                                }
                                u00.a aVar14 = (u00.a) objN10;
                                boolean zG9 = g0Var5.g(kVar) | g0Var5.g(playerItem2);
                                Object objN11 = g0Var5.N();
                                if (zG9 || objN11 == obj4) {
                                    objN11 = new as.g0(kVar, playerItem2, 13);
                                    g0Var5.n0(objN11);
                                }
                                u00.a aVar15 = (u00.a) objN11;
                                boolean zI2 = g0Var5.i(aVar6) | g0Var5.g(kVar);
                                Object objN12 = g0Var5.N();
                                if (zI2 || objN12 == obj4) {
                                    objN12 = new j0(aVar6, kVar, 3);
                                    g0Var5.n0(objN12);
                                }
                                u00.a aVar16 = (u00.a) objN12;
                                boolean zG10 = g0Var5.g(kVar) | g0Var5.g(playerItem2);
                                Object objN13 = g0Var5.N();
                                if (zG10 || objN13 == obj4) {
                                    objN13 = new as.g0(kVar, playerItem2, 14);
                                    g0Var5.n0(objN13);
                                }
                                u00.a aVar17 = (u00.a) objN13;
                                g0Var = g0Var5;
                                jVar2 = jVar5;
                                z2 = true;
                                ox.a.b(playerItem2, z, z8, true, aVar12, aVar13, aVar14, z13, zContains3, rVar, false, aVar15, aVar16, f4, aVar17, jVar2, 3072, 0, 17408);
                                z3 = false;
                                g0Var.r(false);
                                i0Var = i0Var;
                            }
                            g0Var5 = g0Var;
                            z6 = z3;
                            rVar2 = rVar2;
                            it = it;
                            playerItem = playerItem;
                            i0Var = i0Var;
                            jVar5 = jVar2;
                        }
                        g0Var5.r(z6);
                    }
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
        }
    }
}
