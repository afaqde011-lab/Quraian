package wr;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.List;

public final class a0 implements u00.p {
    public final List A;
    public final u30.b B;
    public final PlayerItem C;
    public final boolean D;
    public final u00.k E;
    public final u00.k F;
    public final u00.k G;
    public final boolean H;
    public final u30.b I;

    public a0(u30.b bVar, u30.b bVar2, PlayerItem playerItem, boolean z, u00.k kVar, u00.k kVar2, u00.k kVar3, boolean z2, u30.b bVar3) {
        this.A = bVar;
        this.B = bVar2;
        this.C = playerItem;
        this.D = z;
        this.E = kVar;
        this.F = kVar2;
        this.G = kVar3;
        this.H = z2;
        this.I = bVar3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        j0.b bVar = (j0.b) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.j) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (g0Var.g(bVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= g0Var.e(iIntValue) ? 32 : 16;
        }
        l1.g0 g0Var2 = g0Var;
        if (g0Var2.S(i & 1, (i & 147) != 146)) {
            u30.b bVar2 = (u30.b) this.A.get(iIntValue);
            g0Var2.c0(1193836880);
            k.c(0, null, this.C, g0Var, this.E, this.F, this.G, bVar2, this.B, this.I, this.D, this.H);
            g0Var2.r(false);
        } else {
            g0Var2.V();
        }
        return g00.b0.a;
    }
}
