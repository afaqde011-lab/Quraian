package as;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class q0 implements u00.o {
    public final PlayerItem A;
    public final u0 B;
    public final gm.a C;
    public final boolean D;
    public final PlayerItem E;
    public final u00.k F;

    public q0(PlayerItem playerItem, u0 u0Var, gm.a aVar, boolean z, PlayerItem playerItem2, u00.k kVar) {
        this.A = playerItem;
        this.B = u0Var;
        this.C = aVar;
        this.D = z;
        this.E = playerItem2;
        this.F = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h0.r PlaylistSurahListItemGroupContainer = (h0.r) obj;
        l1.g0 g0Var = (l1.j) obj2;
        int iIntValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.m.e(PlaylistSurahListItemGroupContainer, "$this$PlaylistSurahListItemGroupContainer");
        l1.g0 g0Var2 = g0Var;
        if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
            a.d(this.A, this.B, this.C, this.D, this.E, this.F, g0Var, 0);
        } else {
            g0Var2.V();
        }
        return g00.b0.a;
    }
}
