package as;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.List;

public final class s0 implements u00.p {
    public final List A;
    public final u0 B;
    public final float C;
    public final gm.a D;
    public final boolean E;
    public final PlayerItem F;
    public final u00.k G;

    public s0(List list, u0 u0Var, float f, gm.a aVar, boolean z, PlayerItem playerItem, u00.k kVar) {
        this.A = list;
        this.B = u0Var;
        this.C = f;
        this.D = aVar;
        this.E = z;
        this.F = playerItem;
        this.G = kVar;
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
            PlayerItem playerItem = (PlayerItem) this.A.get(iIntValue);
            g0Var2.c0(-236535723);
            boolean z = iIntValue == 0;
            boolean z2 = iIntValue == va.a.M(this.B.d);
            x.b1 b1VarV = x.c.v(0.0f, 400.0f, (Object) null, 5);
            bVar.getClass();
            a.c(z, z2, this.C, new l0.m((x.y) null, b1VarV, (x.y) null), v1.d.d(-386360700, new q0(playerItem, this.B, this.D, this.E, this.F, this.G), g0Var), g0Var, 24576);
            g0Var2.r(false);
        } else {
            g0Var2.V();
        }
        return g00.b0.a;
    }
}
