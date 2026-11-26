package wr;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class v implements u00.n {
    public final int A;
    public final u30.b B;
    public final u30.b C;
    public final PlayerItem D;
    public final boolean E;
    public final u00.k F;
    public final u00.k G;
    public final u00.k H;
    public final boolean I;
    public final u30.b J;
    public final b2.r K;

    public v(u30.b bVar, u30.b bVar2, PlayerItem playerItem, boolean z, u00.k kVar, u00.k kVar2, u00.k kVar3, boolean z2, u30.b bVar3, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.B = bVar;
        this.C = bVar2;
        this.D = playerItem;
        this.E = z;
        this.F = kVar;
        this.G = kVar2;
        this.H = kVar3;
        this.I = z2;
        this.J = bVar3;
        this.K = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                k.c(l1.q.K(1), this.K, this.D, (l1.j) obj, this.F, this.G, this.H, this.B, this.C, this.J, this.E, this.I);
                break;
            default:
                ((Integer) obj2).getClass();
                k.v(l1.q.K(1), this.K, this.D, (l1.j) obj, this.F, this.G, this.H, this.B, this.C, this.J, this.E, this.I);
                break;
        }
        return g00.b0.a;
    }
}
