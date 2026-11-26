package jv;

import bv.o1;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import g00.b0;
import java.util.List;
import l1.g0;
import l1.p2;
import l1.q;
import u00.p;

public final class j implements p {
    public final int A;
    public final List B;
    public final o1 C;
    public final u00.k D;

    public j(List list, o1 o1Var, u00.k kVar, int i) {
        this.A = i;
        this.B = list;
        this.C = o1Var;
        this.D = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
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
                    PlayerItem playerItem = (PlayerItem) this.B.get(iIntValue);
                    g0Var2.c0(1572289046);
                    o1 o1Var = this.C;
                    boolean zG = g0Var2.g(o1Var.f);
                    Object objN = g0Var2.N();
                    Object obj5 = l1.i.a;
                    if (zG || objN == obj5) {
                        objN = q.r(new i(playerItem, o1Var, 4));
                        g0Var2.n0(objN);
                    }
                    p2 p2Var = (p2) objN;
                    boolean zH = g0Var2.h(o1Var.g) | g0Var2.g(o1Var.f);
                    Object objN2 = g0Var2.N();
                    if (zH || objN2 == obj5) {
                        objN2 = q.r(new i(o1Var, playerItem, 3));
                        g0Var2.n0(objN2);
                    }
                    p2 p2Var2 = (p2) objN2;
                    boolean zG2 = g0Var2.g(o1Var.p) | g0Var2.g(playerItem);
                    Object objN3 = g0Var2.N();
                    if (zG2 || objN3 == obj5) {
                        objN3 = q.r(new i(o1Var, playerItem, 2));
                        g0Var2.n0(objN3);
                    }
                    p2 p2Var3 = (p2) objN3;
                    boolean zG3 = g0Var2.g(o1Var.q) | g0Var2.g(playerItem);
                    Object objN4 = g0Var2.N();
                    if (zG3 || objN4 == obj5) {
                        objN4 = q.r(new i(o1Var, playerItem, 1));
                        g0Var2.n0(objN4);
                    }
                    p2 p2Var4 = (p2) objN4;
                    boolean zG4 = g0Var2.g(o1Var.r) | g0Var2.g(playerItem);
                    Object objN5 = g0Var2.N();
                    if (zG4 || objN5 == obj5) {
                        objN5 = q.r(new i(o1Var, playerItem, 0));
                        g0Var2.n0(objN5);
                    }
                    p2 p2Var5 = (p2) objN5;
                    boolean zG5 = g0Var2.g(p2Var2);
                    u00.k kVar = this.D;
                    boolean zG6 = zG5 | g0Var2.g(kVar) | g0Var2.g(playerItem);
                    Object objN6 = g0Var2.N();
                    if (zG6 || objN6 == obj5) {
                        objN6 = new g(kVar, playerItem, p2Var2, 0);
                        g0Var2.n0(objN6);
                    }
                    u00.a aVar = (u00.a) objN6;
                    boolean zG7 = g0Var2.g(kVar) | g0Var2.g(playerItem);
                    Object objN7 = g0Var2.N();
                    if (zG7 || objN7 == obj5) {
                        objN7 = new h(kVar, playerItem, 0);
                        g0Var2.n0(objN7);
                    }
                    u00.a aVar2 = (u00.a) objN7;
                    boolean zG8 = g0Var2.g(kVar) | g0Var2.g(playerItem);
                    Object objN8 = g0Var2.N();
                    if (zG8 || objN8 == obj5) {
                        objN8 = new h(kVar, playerItem, 1);
                        g0Var2.n0(objN8);
                    }
                    u00.a aVar3 = (u00.a) objN8;
                    boolean zG9 = g0Var2.g(p2Var5) | g0Var2.g(kVar);
                    Object objN9 = g0Var2.N();
                    if (zG9 || objN9 == obj5) {
                        objN9 = new a20.a(p2Var5, kVar, 24);
                        g0Var2.n0(objN9);
                    }
                    u00.a aVar4 = (u00.a) objN9;
                    boolean zBooleanValue = ((Boolean) p2Var.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) p2Var2.getValue()).booleanValue();
                    boolean zBooleanValue3 = ((Boolean) p2Var3.getValue()).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) p2Var4.getValue()).booleanValue();
                    boolean z = o1Var.s;
                    yt.a aVar5 = (yt.a) p2Var5.getValue();
                    a.a(playerItem, aVar, aVar2, aVar3, aVar4, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, z, aVar5 != null ? aVar5.g : null, g0Var, 0);
                    g0Var2.r(false);
                } else {
                    g0Var2.V();
                }
                break;
            default:
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
                    PlayerItem playerItem2 = (PlayerItem) this.B.get(iIntValue3);
                    g0Var4.c0(-1381064010);
                    o1 o1Var2 = this.C;
                    boolean zG10 = g0Var4.g(o1Var2.f);
                    Object objN10 = g0Var4.N();
                    Object obj6 = l1.i.a;
                    if (zG10 || objN10 == obj6) {
                        objN10 = q.r(new i(playerItem2, o1Var2, 6));
                        g0Var4.n0(objN10);
                    }
                    p2 p2Var6 = (p2) objN10;
                    boolean zH2 = g0Var4.h(o1Var2.g) | g0Var4.g(o1Var2.f);
                    Object objN11 = g0Var4.N();
                    if (zH2 || objN11 == obj6) {
                        objN11 = q.r(new i(o1Var2, playerItem2, 5));
                        g0Var4.n0(objN11);
                    }
                    p2 p2Var7 = (p2) objN11;
                    boolean zG11 = g0Var4.g(p2Var6);
                    u00.k kVar2 = this.D;
                    boolean zG12 = zG11 | g0Var4.g(kVar2) | g0Var4.g(playerItem2);
                    Object objN12 = g0Var4.N();
                    if (zG12 || objN12 == obj6) {
                        objN12 = new g(kVar2, playerItem2, p2Var6, 1);
                        g0Var4.n0(objN12);
                    }
                    u00.a aVar6 = (u00.a) objN12;
                    boolean zG13 = g0Var4.g(kVar2);
                    Object objN13 = g0Var4.N();
                    if (zG13 || objN13 == obj6) {
                        objN13 = new eo.p(kVar2, 7);
                        g0Var4.n0(objN13);
                    }
                    kv.a.b(playerItem2, aVar6, (u00.a) objN13, ((Boolean) p2Var6.getValue()).booleanValue(), ((Boolean) p2Var7.getValue()).booleanValue(), g0Var3, 0);
                    g0Var4.r(false);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return b0.a;
    }
}
