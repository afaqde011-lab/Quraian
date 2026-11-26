package as;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class n0 implements u00.n {
    public final int A = 0;
    public final boolean B;
    public final float C;
    public final b2.r D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final g00.e H;

    public n0(j0.v vVar, u0 u0Var, boolean z, PlayerItem playerItem, float f, u00.k kVar, b2.r rVar, int i) {
        this.E = vVar;
        this.F = u0Var;
        this.B = z;
        this.G = playerItem;
        this.C = f;
        this.H = kVar;
        this.D = rVar;
    }

    public n0(boolean z, float f, b2.g gVar, b2.r rVar, x.b1 b1Var, b2.d dVar, v1.c cVar, int i) {
        this.B = z;
        this.C = f;
        this.E = gVar;
        this.D = rVar;
        this.F = b1Var;
        this.G = dVar;
        this.H = cVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                a.a((j0.v) this.E, (u0) this.F, this.B, (PlayerItem) this.G, this.C, (u00.k) this.H, this.D, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1573249);
                w50.c.a(this.B, this.C, (b2.g) this.E, this.D, (x.b1) this.F, (b2.d) this.G, this.H, (l1.j) obj, iK2);
                break;
        }
        return g00.b0.a;
    }
}
