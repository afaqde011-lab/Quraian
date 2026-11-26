package as;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;

public final class g0 implements u00.a {
    public final int A;
    public final u00.k B;
    public final PlayerItem C;

    public g0(u00.k kVar, PlayerItem playerItem, int i) {
        this.A = i;
        this.B = kVar;
        this.C = playerItem;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.invoke(new m(this.C));
                break;
            case 1:
                this.B.invoke(new t(this.C));
                break;
            case 2:
                this.B.invoke(new k(this.C));
                break;
            case 3:
                this.B.invoke(new n(this.C));
                break;
            case 4:
                this.B.invoke(new m(this.C));
                break;
            case 5:
                this.B.invoke(new t(this.C));
                break;
            case 6:
                this.B.invoke(new k(this.C));
                break;
            case 7:
                this.B.invoke(new n(this.C));
                break;
            case 8:
                this.B.invoke(new nx.q(this.C));
                break;
            case 9:
                this.B.invoke(new nx.t(this.C));
                break;
            case 10:
                this.B.invoke(new nx.p(this.C));
                break;
            case 11:
                this.B.invoke(new nx.w(this.C));
                break;
            case 12:
                this.B.invoke(new nx.e(this.C));
                break;
            case 13:
                this.B.invoke(new nx.q(this.C));
                break;
            case 14:
                this.B.invoke(new nx.t(this.C));
                break;
            case 15:
                this.B.invoke(new nx.p(this.C));
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                this.B.invoke(new nx.w(this.C));
                break;
            case 17:
                this.B.invoke(new nx.e(this.C));
                break;
            case 18:
                this.B.invoke(this.C);
                break;
            case 19:
                this.B.invoke(this.C);
                break;
            default:
                this.B.invoke(this.C);
                break;
        }
        return g00.b0.a;
    }
}
