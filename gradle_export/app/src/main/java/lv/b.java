package lv;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import g00.b0;
import k00.f;
import l1.j;
import l1.q;
import u00.n;

public final class b implements n {
    public final int A;
    public final PlayerItem B;

    public b(PlayerItem playerItem, int i, int i2) {
        this.A = i2;
        this.B = playerItem;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                f.i(this.B, jVar, q.K(1));
                break;
            default:
                e.a(this.B, jVar, q.K(1));
                break;
        }
        return b0.a;
    }
}
