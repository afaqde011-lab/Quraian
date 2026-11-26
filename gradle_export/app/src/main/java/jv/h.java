package jv;

import bv.e1;
import bv.r;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import g00.b0;

public final class h implements u00.a {
    public final int A;
    public final u00.k B;
    public final PlayerItem C;

    public h(u00.k kVar, PlayerItem playerItem, int i) {
        this.A = i;
        this.B = kVar;
        this.C = playerItem;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.invoke(new e1(this.C));
                break;
            default:
                this.B.invoke(new r(this.C));
                break;
        }
        return b0.a;
    }
}
