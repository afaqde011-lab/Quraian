package jv;

import bv.l0;
import bv.t0;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import g00.b0;
import l1.p2;

public final class g implements u00.a {
    public final int A;
    public final u00.k B;
    public final PlayerItem C;
    public final p2 D;

    public g(u00.k kVar, PlayerItem playerItem, p2 p2Var, int i) {
        this.A = i;
        this.B = kVar;
        this.C = playerItem;
        this.D = p2Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) this.D.getValue()).booleanValue();
                u00.k kVar = this.B;
                if (zBooleanValue) {
                    kVar.invoke(t0.a);
                } else {
                    kVar.invoke(new l0(this.C));
                }
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) this.D.getValue()).booleanValue();
                u00.k kVar2 = this.B;
                if (zBooleanValue2) {
                    kVar2.invoke(t0.a);
                } else {
                    kVar2.invoke(new l0(this.C));
                }
                break;
        }
        return b0.a;
    }
}
